package com.theliitlepony.loops.activities;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.theliitlepony.loops.R;
import com.theliitlepony.loops.adapters.ContentsListAdapter;
import com.theliitlepony.loops.models.Contents;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SelectInfoParentActivity extends CoreActivity {


    @BindView(R.id.parentRecyclerview)
    RecyclerView parentRecyclerview;

    ContentsListAdapter contentsListAdapter;
    List<Contents> contentList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_info_parent);
        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        parentRecyclerview.setLayoutManager(layoutManager);
        parentRecyclerview.setHasFixedSize(true);

        contentsListAdapter = new ContentsListAdapter(contentList,this);
        contentList.clear();

        makeData();
        contentsListAdapter.notifyDataSetChanged();
        parentRecyclerview.setAdapter(contentsListAdapter);

    }

    private void makeData() {
        Contents contents1 = new Contents();
        contents1.setImage(R.drawable.logo_loop);
        contents1.setName("Mr.Jirathip Siripakchai");
        contents1.setTelNumber("0865121065");
        contents1.setStatusParent("พี่");
        contentList.add(contents1);

        Contents contents2 = new Contents();
        contents2.setImage(R.drawable.logo_loop);
        contents2.setName("Mr.Ittikorn Attapong");
        contents2.setTelNumber("0847379333");
        contents2.setStatusParent("พี่");
        contentList.add(contents2);

        Contents contents3 = new Contents();
        contents3.setImage(R.drawable.logo_loop);
        contents3.setName("Mr.Hakanaku");
        contents3.setTelNumber("0902656574");
        contents3.setStatusParent("พี่");
        contentList.add(contents3);
    }


}
