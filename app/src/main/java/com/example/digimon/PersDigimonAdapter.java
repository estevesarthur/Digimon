package com.example.digimon;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersDigimonAdapter extends RecyclerView.Adapter<PersDigimonAdapter.ViewHolder> {
    private List<PDigimon> listPDigimonView;
    private Context context;

    public PersDigimonAdapter(Context context, List<PDigimon> listPDigimonView)
    {
        this.context = context;
        this.listPDigimonView = listPDigimonView;
    }

    @NonNull
    @Override
    public PersDigimonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.pdigimon_row_list, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        PDigimon data = listPDigimonView.get(position);
        viewHolder.image.setImageResource(data.imgDigiEscolhido);
        viewHolder.digiEscolhido.setText(data.digiEscolhido);
        viewHolder.digimon.setText(data.digimon);

        viewHolder.itemView.setOnClickListener(v -> {
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setIcon(R.mipmap.ic_launcher);
            builder.setIcon(listPDigimonView.get(position).imgDigiEscolhido)
                    .setTitle("Eu sou " + listPDigimonView.get(position).digiEscolhido + "!")
                    .setMessage("Eu sou " + listPDigimonView.get(position).digimon + "!")
                    .setCancelable(false)
                    .setPositiveButton("Close", null);
            builder.create().show();
        });
    }

    @Override
    public int getItemCount() {return listPDigimonView.size();}

    class ViewHolder extends RecyclerView.ViewHolder {
        TextView digiEscolhido, digimon;
        ImageView image;
        LinearLayout parent;
        private CardView recycler_view;

        public ViewHolder(View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            digiEscolhido = itemView.findViewById(R.id.digiEscolhido);
            digimon = itemView.findViewById(R.id.digimon);
            recycler_view = itemView.findViewById(R.id.recycler_view);
        }
    }
}
