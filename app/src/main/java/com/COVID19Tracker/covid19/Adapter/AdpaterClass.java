package com.COVID19Tracker.covid19.Adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.COVID19Tracker.covid19.DisplayOnclick;
import com.COVID19Tracker.covid19.ListStats.ListModel;
import com.COVID19Tracker.covid19.R;

import java.util.ArrayList;

public class AdpaterClass extends RecyclerView.Adapter<AdpaterClass.ViewHolder> {
    private Context mCtxt;
    private ArrayList<ListModel> ListData;

    public AdpaterClass(Context mCtxt, ArrayList<ListModel> listData) {
        this.mCtxt = mCtxt;
        ListData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.displaybycountry, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        holder.Country.setText(ListData.get(position).getCName());
        holder.Confirmed.setText(ListData.get(position).getConfiremed());
        holder.Recovired.setText(ListData.get(position).getRecovery());
        holder.Death.setText(ListData.get(position).getDeath());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListModel listModel = new ListModel(
                        ListData.get(position).getCName(),
                        ListData.get(position).getConfiremed(),
                        ListData.get(position).getRecovery(),
                        ListData.get(position).getDeath(),
                        ListData.get(position).getNewCases(),
                        ListData.get(position).getNewDeathCases(),
                        ListData.get(position).getNewCritical(),
                        ListData.get(position).getNewActive(),
                        ListData.get(position).getTotal());
                Intent intent = new Intent(mCtxt, DisplayOnclick.class);
                intent.putExtra("MyClass", listModel);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                mCtxt.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return ListData.size();
    }

    public void filterList(ArrayList<ListModel> filterList){
        ListData = filterList;
        notifyDataSetChanged();

    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView Country,Confirmed;
        private TextView Recovired,Death;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Country = itemView.findViewById(R.id.Country);
            Confirmed = itemView.findViewById(R.id.TotalConfirmed);
            Recovired = itemView.findViewById(R.id.TotalRecovired);
            Death = itemView.findViewById(R.id.TotalDeathsLIst);

        }
    }

}
