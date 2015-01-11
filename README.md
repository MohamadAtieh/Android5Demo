# Android5RetrofitDemo
####Demo using Retrofit to fetch Islamic prayer times from an API.

The API Key is included, but if you insist to create your own, head over [here](http://muslimsalat.com/api/).

The application uses the `RecycleView.class` from API 5. 

It also shows usage of Retrofit with **JSON to POJO** conversion demo class (`MyApiContent.java`) for GSON.

Learn more about:
- [Retrofit](http://square.github.io/retrofit/)
- [GSON](https://code.google.com/p/google-gson/)
- [POJO](http://en.wikipedia.org/wiki/Plain_Old_Java_Object)

Retrofit handles all the JSON to GSON conversion given that you pass to the Callback a POJO class. 

This [website](http://www.jsonschema2pojo.org/) auto generates the POJO class for you if you provide your JSON sample data/structure.

