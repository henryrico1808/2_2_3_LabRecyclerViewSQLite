package com.ejemplo.mydb03;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Henry on 06/03/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListaViewHolder> {

    Context context;
    ArrayList<Item> listadatos;

    public Adapter(Context context, ArrayList<Item> listadatos) {
        this.context = context;
        this.listadatos = listadatos;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.list_layout,null);
        return new ListaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        Item item=listadatos.get(position);

        holder.clave.setText(item.getId());
        holder.nombre.setText(item.getNombre());
        holder.sueldo.setText(item.getSueldo());
    }

    @Override
    public int getItemCount() {
        return listadatos.size();
    }


    public class ListaViewHolder extends RecyclerView.ViewHolder {
        TextView clave,nombre,sueldo;

        public ListaViewHolder(View itemView) {
            super(itemView);

            clave=itemView.findViewById(R.id.id_Clave);
            nombre=itemView.findViewById(R.id.id_Nombre);
            sueldo=itemView.findViewById(R.id.id_Salario);
        }
    }
}
