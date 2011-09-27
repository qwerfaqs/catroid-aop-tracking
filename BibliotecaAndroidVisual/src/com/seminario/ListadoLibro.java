package com.seminario;

import com.seminario.controladoras.LibroControladora;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListadoLibro extends ListActivity {
    /** Called when the activity is first created. */
	
	LibroControladora libroControladora;
	
	public ListadoLibro() {
		libroControladora = new LibroControladora();
	}
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setListAdapter(new ArrayAdapter<String>(this, R.layout.lista_libro,libroControladora.devolverLibrosNombre()));
        
        ListView lv = getListView();
        lv.setTextFilterEnabled(true);
        
        lv.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int posicion,
					long id) {
				// Ir a la otra actividad pasando el libro seleccionado{
				//Intent intento = new Intent(ListadoLibro.this, )
				//}otra actividad
				
			}
		});
    }
}