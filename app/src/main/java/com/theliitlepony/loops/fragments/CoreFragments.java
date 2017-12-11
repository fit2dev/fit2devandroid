package com.theliitlepony.loops.fragments;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.theliitlepony.loops.R;
import com.theliitlepony.loops.classes.Singleton;
import com.theliitlepony.loops.components.ConfirmationDialog;
import com.theliitlepony.loops.components.InformationDialog;
import com.theliitlepony.loops.events.MainNavigation;


public class CoreFragments extends Fragment {

    public Dialog loading;
    protected MainNavigation.MainNavigationListener listener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        loading = new Dialog(this.getContext());
        loading.requestWindowFeature(Window.FEATURE_NO_TITLE);
        loading.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        loading.setContentView(R.layout.component_loading);
        loading.setCancelable(false);


        return super.onCreateView(inflater, container, savedInstanceState);
    }


    @Override
    public void onDestroyView() {
        if(loading!=null){
            loading.dismiss();
        }

        destroyAllDialog();

        super.onDestroyView();
    }

    @Override
    public void onDestroy() {
        if(loading!=null){
            loading.dismiss();
        }

        destroyAllDialog();

        super.onDestroy();
    }

    @Override
    public void onDetach() {
        if(loading!=null){
            loading.dismiss();
        }

        destroyAllDialog();

        super.onDetach();
    }

    private void destroyAllDialog(){
        InformationDialog.dismiss();
        ConfirmationDialog.dismiss();
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        outState = Singleton.instance().saveInstanceState(outState);

        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {

        Singleton.instance().restoreInstanceState(savedInstanceState);


        super.onViewStateRestored(savedInstanceState);
    }
}
