package com.example.tugas4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieViewHolder>{
    private ArrayList<Movie> dataList;
    public MovieAdapter(ArrayList<Movie> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public MovieAdapter.MovieViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_movie, parent, false);
        return new MovieViewHolder(view);
    }
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.txtNama.setText(dataList.get(position).getNama_movie());
        holder.txtAsal.setText(dataList.get(position).getAsal_negara());
        holder.txtCirikhas.setText(dataList.get(position).getGenre());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class MovieViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNama, txtAsal, txtCirikhas;
        private ImageView Foto;
        public MovieViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            txtNama = (TextView)itemView.findViewById(R.id.txt_nama_movie);
            txtAsal = (TextView) itemView.findViewById(R.id.txt_asal_negara);
            txtCirikhas = (TextView) itemView.findViewById(R.id.txt_genre);
        }
    }

    }

