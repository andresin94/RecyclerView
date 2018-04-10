package com.example.andresim.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class PersonaAdaptador extends RecyclerView.Adapter<PersonaAdaptador.PersonaViewHolder>{

    private ArrayList<Persona> personas;

    public PersonaAdaptador(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public static class PersonaViewHolder extends RecyclerView.ViewHolder {

        private TextView txtNombre;
        private TextView txtApellido;

        public PersonaViewHolder(View itemView) {
            super(itemView);
            txtNombre = (TextView)itemView.findViewById(R.id.LblNombre);
            txtApellido = (TextView)itemView.findViewById(R.id.LblApellido);
        }

        public void bindPersona(Persona p) {
            txtNombre.setText(p.getNombre());
            txtApellido.setText(p.getApellido());
        }
    }

    @Override
    public PersonaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        PersonaViewHolder pvh = new PersonaViewHolder(view);
        return pvh;
    }

    @Override
    public void onBindViewHolder(PersonaViewHolder holder, int position) {
        Persona persona = personas.get(position);
        holder.bindPersona(persona);
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

}
