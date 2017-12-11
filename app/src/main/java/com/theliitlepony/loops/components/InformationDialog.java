package com.theliitlepony.loops.components;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import com.theliitlepony.loops.R;
import com.theliitlepony.loops.classes.App;
import com.theliitlepony.loops.events.CoreDialog;
import com.theliitlepony.loops.events.InformationDialogEvent;

public class InformationDialog extends CoreDialog {

    public static void show(Context context,String title, String message,final InformationDialogEvent listener){

        dismiss();

        currentDialog = new AlertDialog.Builder(context, R.style.AppCompatAlertDialogStyle)
                .setTitle(title)
                .setMessage(message)
                .setCancelable(false)
                .setNegativeButton(App.instance().getString(R.string.btn_info_dialog_close),new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        if(listener!=null)
                            listener.onCloseDialog();

                        dismiss();
                    }
                }).create();

        currentDialog.show();
    }
}
