package com.example.volleyexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class GithubAdapter  extends RecyclerView.Adapter<GithubAdapter.GithubViewHolder> {
    private Context context;
    private User[] data;
    public GithubAdapter(Context context, User[] data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public GithubViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.item_user_layout, viewGroup,false);
        return new GithubViewHolder(view);
    }

    @Override
    public void onBindViewHolder(GithubViewHolder githubViewHolder, int i) {
        User user = data[i];
        githubViewHolder.txtUser.setText(user.getLogin());
        Glide.with(githubViewHolder.imgUser.getContext()).load(user.getAvatarUrl()).into(githubViewHolder.imgUser);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class GithubViewHolder extends RecyclerView.ViewHolder {
        ImageView imgUser;
        TextView txtUser;
        public GithubViewHolder(View itemView) {
            super(itemView);
            imgUser = (ImageView) itemView.findViewById(R.id.imgUser);
            txtUser = (TextView) itemView.findViewById(R.id.txtUser);
        }
    }
}
