package com.example.matie.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.matie.myapplication.adapters.MyAdapter;
import com.example.matie.myapplication.pojo.MyApiContent;

import org.json.JSONObject;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;
import retrofit.http.EncodedPath;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;


public class MainActivity extends ActionBarActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset;

    private static String MY_API_KEY = "a04019a07b2ef5b5dd3a91aea7a99f54";
    private static String api_url = "http://muslimsalat.com";
    private RestAdapter restAdapter;
    private RetrofitInterface retrofitInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView)findViewById(R.id.my_recycler_view);

        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        //RETROFIT magic
        restAdapter = new RestAdapter.Builder().setEndpoint(api_url).build();
        retrofitInterface = restAdapter.create(RetrofitInterface.class);
        retrofitInterface.getTimings(MY_API_KEY, new Callback<MyApiContent>(){
            @Override
            public void success(MyApiContent json, Response response) {
                Toast.makeText(getApplicationContext(),"Success", Toast.LENGTH_SHORT).show();
                String dateFor = "Date: "+json.getItems().get(0).getDateFor();
                String fajr = "Fajr: "+json.getItems().get(0).getFajr();
                String shurooq = "Shurooq: "+json.getItems().get(0).getShurooq();
                String dhuhr = "Dhuhr: "+json.getItems().get(0).getDhuhr();
                String asr = "Asr: "+json.getItems().get(0).getAsr();
                String maghrib = "Maghrib: "+json.getItems().get(0).getMaghrib();
                String isha = "Isha: "+json.getItems().get(0).getIsha();

                myDataset = new String[]{dateFor,fajr,shurooq,dhuhr,asr,maghrib,isha};
                mAdapter = new MyAdapter(myDataset);
                mRecyclerView.setAdapter(mAdapter);
             }

            @Override
            public void failure(RetrofitError error) {
                System.out.println(error.toString());
            }
        });
    }

    private interface RetrofitInterface{
        @GET("/daily.json")
        void getTimings(@Query("key") String api_key, Callback<MyApiContent> callback);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
