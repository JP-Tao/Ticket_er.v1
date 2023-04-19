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

public class TimeAdapter extends RecyclerView.Adapter<TimeAdapter.ViewHolder> {

    private ArrayList<BusCompany> time = new ArrayList<>();
    private Context context;

    public TimeAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.time_list_item, parent, false);
        TimeAdapter.ViewHolder holder = new TimeAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.timeTxt.setText(time.get(position).getTime());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, SeatActivity.class);
//                intent.putExtra()
                intent.putExtra("time", time.get(position));
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return time.size();
    }

    public void setTime(ArrayList<BusCompany> time) {
        this.time = time;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView timeTxt;
        private CardView parent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            timeTxt = itemView.findViewById(R.id.time);
            parent = itemView.findViewById(R.id.parent_time);
        }
    }
}
