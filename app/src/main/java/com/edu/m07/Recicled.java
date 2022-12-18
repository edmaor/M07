package com.edu.m07;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Recicled extends RecyclerView.Adapter<Recicled.ViewHolder> {
    private final String[] title;
    private final String[] subtitle;

    public Recicled (String ... localData){
        this.title = new String[localData.length];
        this.subtitle = new String[localData.length];
        int i = 0;
        for (String str: localData ) {
            String[] tVal = str.split(":");
            this.title[i] = tVal[0];
            this.subtitle[i] = tVal[1];
            i++;
        }
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final TextView subtitle;

        public ViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.lblTitulo);
            subtitle = view.findViewById(R.id.lblSubtitulo);
        }

        public TextView getTitle() {
            return title;
        }
        public TextView getSubtitle() {
            return subtitle;
        }
    }

    @NonNull @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_recicled, viewGroup, false);

        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTitle().setText(title[position]);
        viewHolder.getSubtitle().setText(subtitle[position]);
    }
    @Override
    public int getItemCount() {
        return title.length;
    }
}