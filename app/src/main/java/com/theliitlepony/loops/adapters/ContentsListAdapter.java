package com.theliitlepony.loops.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.theliitlepony.loops.R;
import com.theliitlepony.loops.activities.ConfirmOTPActivity;
import com.theliitlepony.loops.activities.HomeActivity;
import com.theliitlepony.loops.classes.CircleTransformation;
import com.theliitlepony.loops.classes.Singleton;
import com.theliitlepony.loops.models.Contents;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class ContentsListAdapter extends RecyclerView.Adapter<ContentsListAdapter.ContentsListViewHolder> {



    private List<Contents> _contents;
    private Activity _context;

    public ContentsListAdapter(List<Contents> contents, Activity context) {
        this._contents = contents;
        this._context = context;
    }

    @Override
    public ContentsListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.itemrenderer_contents_list, parent, false);
        return new ContentsListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContentsListViewHolder holder, int position) {
        Picasso.with(_context).load(_contents.get(position).getImage()).transform(new CircleTransformation()).into(holder.pictureProfile);
        holder.name.setText(_contents.get(position).getName());
        holder.tel.setText(_contents.get(position).getTelNumber());
        holder.statusParent.setText(_contents.get(position).getStatusParent());
        holder.mainItemLayout.setTag(position);
    }

    @Override
    public int getItemCount() {
        return _contents != null ? _contents.size() : 0;
    }

    class ContentsListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.tel)
        TextView tel;
        @BindView(R.id.statusParent)
        TextView statusParent;
        @BindView(R.id.main_item_layout)
        CardView mainItemLayout;
        @BindView(R.id.picture_profile)
        ImageView pictureProfile;

        public ContentsListViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            ButterKnife.bind(this, itemView);

        }

        @Override
        public void onClick(View view) {
            Integer position = this.getLayoutPosition();
            String phone = _contents.get(position).getTelNumber();
            if (phone == "0902656574") {
                Singleton.instance().Phonenumber = phone;
                Intent intentConfirmOTPActivity = new Intent(_context, HomeActivity.class);
                _context.startActivity(intentConfirmOTPActivity);
                _context.finish();
            } else
                Toast.makeText(_context, "Your Phonenumber : " + phone, Toast.LENGTH_LONG).show();
        }
    }

}
