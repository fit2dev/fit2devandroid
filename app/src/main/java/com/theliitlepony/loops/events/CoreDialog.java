package com.theliitlepony.loops.events;

import android.support.v7.app.AlertDialog;


public class CoreDialog {

    protected static AlertDialog currentDialog = null;

    public static void dismiss(){
        if(currentDialog!=null){
            currentDialog.dismiss();
            currentDialog = null;
        }
    }
}
