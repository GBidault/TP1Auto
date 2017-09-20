package com.diiage.guillaumebidault.tp1auto.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.diiage.guillaumebidault.tp1auto.R;
import com.diiage.guillaumebidault.tp1auto.beans.Books;

import java.util.List;

/**
 * Created by GuillaumeBidault on 20/09/2017.
 */

public class LivreAdapter extends ArrayAdapter<Books> {

    public LivreAdapter(Context context, List<Books> books) {
        super(context, 0, books);
    }

    public View getView(int position, View convertView, ViewGroup parent){

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_lst_livre,parent, false);
        }

        PoiViewHolder viewHolder = (PoiViewHolder) convertView.getTag();
        if(viewHolder == null){
            viewHolder = new PoiViewHolder();
            viewHolder.titre = (TextView) convertView.findViewById(R.id.txt_adapter_lst_livre_Titre);
            viewHolder.auteur = (TextView) convertView.findViewById(R.id.txt_adapter_lst_livre_auteur);
            viewHolder.genre = (TextView)convertView.findViewById(R.id.txt_adapter_lst_livre_genre);
            viewHolder.nbCom = (TextView)convertView.findViewById(R.id.txt_adapter_lst_livre_nbCom);
            convertView.setTag(viewHolder);
        }

        //getItem(position) va récupérer l'item [position] de la List<Tweet> tweets
        Books book = getItem(position);
        viewHolder.titre.setText(book.getTitle());
        viewHolder.auteur.setText(book.getAuthor());
        viewHolder.genre.setText(book.getGenre());

        return convertView;
    }

    private class PoiViewHolder{
        public TextView titre;
        public TextView auteur;
        public TextView genre;
        public TextView nbCom;
    }


}
