package com.tjpn.ticket_er10;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SeatAdapter extends RecyclerView.Adapter<SeatAdapter.ViewHolder> {

    private ArrayList<BusCompany> seat = new ArrayList<>();
    AlertDialog.Builder alertBuilder;
    private Context context;

    public SeatAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.seat_list_item, parent, false);
        SeatAdapter.ViewHolder holder = new SeatAdapter.ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.seatNum.setText(seat.get(position).toString());
        holder.parent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertBuilder = new AlertDialog.Builder(context);
                alertBuilder.setTitle("Confirm Selection");
                alertBuilder.setMessage("SeatNumber " + seat.get(position));
                alertBuilder.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(context, VisaActivity.class);
                        intent.putExtra("seat", seat.get(position));
                        context.startActivity(intent);
                    }
                });
                alertBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(context, "Please complete Selection", Toast.LENGTH_SHORT).show();
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialog = alertBuilder.create();
                alertDialog.show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return seat.size();
    }

    public void setSeat(ArrayList<BusCompany> seat) {
        this.seat = seat;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView seatNum;
        private CardView parent;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            seatNum = itemView.findViewById(R.id.seat_num);
            parent = itemView.findViewById(R.id.parent_seat);

        }
    }
}
