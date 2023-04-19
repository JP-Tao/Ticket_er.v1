package com.tjpn.ticket_er10;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BusAdapter extends RecyclerView.Adapter<BusAdapter.ViewHolder> {

    private ArrayList<BusCompany> busCompany = new ArrayList<>();
    private Context context;

    public BusAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bus_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.busName.setText(busCompany.get(position).getName());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(context, RouteActivity.class);
                intent.putExtra("name", busCompany.get(position).getName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return busCompany.size();
    }

    public void setBusCompany(ArrayList<BusCompany> busCompany) {
        this.busCompany = busCompany;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView busName;
        private CardView parent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            busName = itemView.findViewById(R.id.bus);
            parent = itemView.findViewById(R.id.parent_bus);
        }
    }
}
