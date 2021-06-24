package br.com.local.myapptablayout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class PassaroFragment extends Fragment {

    ListView listaPassaros;

    //Criando dados para lista de pássaros fake
    String nomePassaros[] = {"Joseph", "Bird", "Michael", "Antony", "Peker", "Lincoln"};
    int imagemPassaros[] = {R.drawable.joseph, R.drawable.bird, R.drawable.michael,
            R.drawable.antony, R.drawable.peker, R.drawable.lincoln};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_passaro, container, false);

        listaPassaros = view.findViewById(R.id.listaPassaros);

        AdapterPassaro adapterPassaro = new AdapterPassaro();

        listaPassaros.setDivider(null);
        listaPassaros.setDividerHeight(0);

        listaPassaros.setAdapter(adapterPassaro);


        return view;
    }

    //Inner class AdapterPassaro
    public class AdapterPassaro extends BaseAdapter {

        @Override
        public int getCount() {
            return imagemPassaros.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            ImageView imgPassaros;
            TextView txtPassaros;

            View view  = getLayoutInflater().inflate(R.layout.modelo_passaro,null);

            txtPassaros = view.findViewById(R.id.txtModeloPassaro);
            imgPassaros = view.findViewById(R.id.imgModeloPassaro);

            txtPassaros.setText(nomePassaros[position]);
            imgPassaros.setImageResource(imagemPassaros[position]);

            return view;
        }
    }
}