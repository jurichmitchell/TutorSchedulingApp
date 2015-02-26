package appdevelopment.bshs.tutorschedulingapp;

//**********************************************************************
//  LoginIntentService.java
//
//  Intent Service ran when the login button is clicked
//  Checks the database to see if username + password are correct
//
//  Altered: 2/20/2015
//**********************************************************************

import android.app.IntentService;
import android.content.Intent;

public class LoginIntentService extends IntentService {

    public LoginIntentService()
    {
        super("LoginIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent)
    {

    }

}


