package id.sch.smktelkom_mlg.privateassignment.xirpl327.tugaspribadi.app;

import android.app.Application;

import io.realm.Realm;


/**
 * Created by root on 14/05/17.
 */

public class MyApp extends Application {
    @Override
    public void onCreate()
    {
        super.onCreate();
        Realm.init(this);
    }
}
