# GloboFly-Retrofit-Demo
Get your app online and interact with web services

First clone the repo

Then download the Node App Zip from [here](https://github.com/Atr07/GloboFly-Retrofit/blob/master/MyNodeApp/MyNodeApp.zip)

Extract it to MyNodeApp folder

In cmd prompt
```
    $ npm install
    $ node server.js
    //Server running at http://127.0.0.1:9000/ (This msg will be shown)
```

In new cmd prompt
```
    $ ngrok http 9000

    //sample
       Session Status                online
       Session Expires               7 hours, 58 minutes
       Version                       2.3.34
       Region                        United States (us)
       Web Interface                 http://127.0.0.1:4040
       Forwarding                    http://sample.ngrok.io -> http://localhost:9000
       Forwarding                    https://sample.ngrok.io -> http://localhost:9000
```

Copy the ngrok url and paste it in
[ServiceBuilder](https://github.com/Atr07/GloboFly-Retrofit/blob/master/app/src/main/java/com/example/globofly/services/ServiceBuilder.kt)
and
[WelcomeActivity](https://github.com/Atr07/GloboFly-Retrofit/blob/master/app/src/main/java/com/example/globofly/activities/WelcomeActivity.kt)

Run the App ::): :+1:

