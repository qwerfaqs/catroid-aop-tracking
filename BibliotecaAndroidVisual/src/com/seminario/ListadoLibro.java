package com.seminario;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.seminario.clases.Libro;
import com.seminario.controladoras.LibroControladora;

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
				Intent intento = new Intent(ListadoLibro.this, DescripcionLibro.class);
				
				//Libro aux = libroControladora.devolverLibro(((TextView)view).getText().toString());//recuperar el id con el titulo del libro, no hace falta ya que no existen libros con el mismo nombre
				
				intento.putExtra("nombreLibro"/*"idLibro"*/, ((TextView)view).getText().toString()/*aux.getId()*/);//pasar como extra el id... Corrección pasar el nombre del libro
				startActivity(intento);
				//}otra actividad
				
			}
		});
    }
}