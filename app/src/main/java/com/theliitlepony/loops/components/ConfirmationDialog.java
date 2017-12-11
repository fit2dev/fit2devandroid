package com.theliitlepony.loops.components;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.theliitlepony.loops.R;
import com.theliitlepony.loops.classes.App;
import com.theliitlepony.loops.events.ConfirmationDialogEvent;
import com.theliitlepony.loops.events.CoreDialog;


public class ConfirmationDialog extends CoreDialog {

    public static void show(Context context,String title, String message, final ConfirmationDialogEvent.ConfirmationDialogEventListener listener){


        dismiss();

        currentDialog = new AlertDialog.Builder(context, R.style.AppCompatAlertDialogStyle)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton(App.instance().getString(R.string.btn_yes), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        if(listener!=null)
                            listener.confirm();

                        dismiss();

                    }
                })
                .setNegativeButton(App.instance().getString(R.string.btn_no), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        if(listener!=null)
                            listener.cancel();

                        dismiss();
                    }
                })
                .create();

        currentDialog.show();
    }

}
