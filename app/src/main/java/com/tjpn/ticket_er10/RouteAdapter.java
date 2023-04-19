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

public class RouteAdapter extends RecyclerView.Adapter<RouteAdapter.ViewHolder> {

    private ArrayList<BusCompany> route = new ArrayList<>();
    private Context context;

    public RouteAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.route_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.routes.setText(route.get(position).getRoute());
        holder.fees.setText(route.get(position).getFee());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TimeActivity.class);
                intent.putExtra("route", route.get(position));
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return route.size();
    }

    public void setRoute(ArrayList<BusCompany> route) {
        this.route = route;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView routes, fees;
        private CardView parent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            fees = itemView.findViewById(R.id.fee);
            routes = itemView.findViewById(R.id.route_name);
            parent = itemView.findViewById(R.id.parent_route);
        }
    }
}
