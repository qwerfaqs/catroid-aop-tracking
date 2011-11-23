package com.seminario;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

import com.seminario.controladoras.LibroControladora;

public class ListadoLibroMasConfiguracion extends Activity{

	private ListView listLibros;
	private ImageButton imgBtnConfiguracion;
	
	private boolean filtroSeguimiento = true;
	
	private LibroControladora libroControladora;
	
	
	public ListadoLibroMasConfiguracion() {
		libroControladora = new LibroControladora();
	}
	
	private void levantarXml()
	{
		listLibros  = (ListView)findViewById(R.id.list_libros);
		imgBtnConfiguracion = (ImageButton)findViewById(R.id.img_btn_configuracion);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.lista_libro_mas_configuracion);
		levantarXml();
		
		ArrayAdapter<String> nombres = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,libroControladora.devolverLibrosNombre());
		listLibros.setAdapter(nombres);
		
		listLibros.setOnItemClickListener(new OnItemClickListener()
		{

			public void onItemClick(AdapterView<?> arg0, View view, int pos,
					long id) {
				// Ir a la otra actividad pasando el libro seleccionado{
				Intent intento = new Intent(ListadoLibroMasConfiguracion.this, DescripcionLibro.class);
				
				//Libro aux = libroControladora.devolverLibro(((TextView)view).getText().toString());//recuperar el id con el titulo del libro, no hace falta ya que no existen libros con el mismo nombre
				
				intento.putExtra("nombreLibro", ((TextView)view).getText().toString());//pasar como extra el id... Corrección pasar el nombre del libro
				startActivity(intento);
				//}otra actividad
				
			}
			
		});
		
		imgBtnConfiguracion.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(ListadoLibroMasConfiguracion.this);
				builder.setTitle("Configuración");
				//en un futuro se pueden agregar más opciones
				final CharSequence[] items = { "Seguimiento" }; 
				final boolean[] states = { filtroSeguimiento };
				builder.setMultiChoiceItems(items, states, new DialogInterface.OnMultiChoiceClickListener() {
					
					public void onClick(DialogInterface dialog, int item, boolean estado) {
						if(item == 0)
						{
							filtroSeguimiento = estado;
							//aca se podría desactivar el seguimiento
						}
					}
				});
				AlertDialog d = builder.create();
				d.show();
			}
		});
		
	}
}
