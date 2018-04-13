package com.doctor.jagmeet.recyclerviewdemo;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by sjagm on 12-04-2018.
 */

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder>{

    List<Person> persons;

    RVAdapter(List<Person> persons){
        this.persons = persons;
    }
    @Override
    public PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
        PersonViewHolder pvh = new PersonViewHolder(v);
        return pvh;

    }

    @Override
    public void onBindViewHolder(PersonViewHolder personViewHolder, int i) {
        System.out.println("onbind");
        personViewHolder.personName.setText(persons.get(i).name);
        personViewHolder.personAge.setText(persons.get(i).age);
    }

    @Override
    public int getItemCount()
    {
        System.out.println("cunt");
        return persons.size();
    }



    public static class PersonViewHolder extends RecyclerView.ViewHolder {
        CardView cv;
        TextView personName;
        TextView personAge;

        PersonViewHolder(View itemView) {
            super(itemView);
            cv = itemView.findViewById(R.id.cv);
            personName = itemView.findViewById(R.id.person_name);
            personAge = itemView.findViewById(R.id.person_age);
        }
    }



}