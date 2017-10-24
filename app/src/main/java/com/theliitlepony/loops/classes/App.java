package com.theliitlepony.loops.classes;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by user on 22 ต.ค. 2560.
 */

public class App extends Application {
    private static App instance;
    public static App instance() { return instance; }
    private final String DEBUG_TAG = "LOOPS";
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;



        String versionName = "1.0.0"; //default

        try {
            PackageInfo pInfo = getPackageManager().getPackageInfo(getPackageName(), 0);
            versionName = pInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.i(DEBUG_TAG,e.getMessage());
        }

        /*Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR1) {
            conf.setLocale(new Locale("th"));
        }else {
            conf.locale = new Locale("th");
        }

        res.updateConfiguration(conf, dm);*/

    }
}
