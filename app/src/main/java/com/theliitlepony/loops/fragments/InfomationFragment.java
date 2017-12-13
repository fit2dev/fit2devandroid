package com.theliitlepony.loops.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.theliitlepony.loops.R;
import com.theliitlepony.loops.classes.CircleTransformation;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;


public class InfomationFragment extends CoreFragments {

    Unbinder unbinder;
    @BindView(R.id.circleImage)
    ImageView circleImage;

    public InfomationFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_infomation, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }
}
