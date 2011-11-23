package com.seminario;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.seminario.clases.Libro;
import com.seminario.controladoras.LibroControladora;

public class DescripcionLibro extends Activity {

	TextView txtTituloLibro;
	TextView txtAutorLibro;
	TextView txtDescripcionLibro;
	
	LibroControladora libroControladora;
	
	public DescripcionLibro() {
		libroControladora = new LibroControladora();
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.descripcion_libro);
		
		//recuperar componentes{
		txtTituloLibro = (TextView)findViewById(R.id.txtTituloLibro);
		txtAutorLibro = (TextView)findViewById(R.id.txtAutorLibro);
		txtDescripcionLibro = (TextView)findViewById(R.id.txtDescripcionLibro);
		//}recuperar componentes
		

		
		String nombreLibroSelec = getIntent().getStringExtra("nombreLibro");//recuperar el nombre seleccionado del extra
		Libro libroSelec = libroControladora.devolverLibro(nombreLibroSelec);//con el nombre recuperar el Libro
		libroControladora.seleccionarLibro(libroSelec);
		//actualizar los componentes visuales con los datos{
		txtTituloLibro.setText(libroSelec.getTitulo());
		txtAutorLibro.setText(libroSelec.getAutor());
		txtDescripcionLibro.setText(libroSelec.getDescripcion());
		//}actualiza datos
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.descripcion_menu, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle item selection
	    switch (item.getItemId()) {
	    case R.id.opcionMegusta:
	    	libroControladora.megustaLibro();
	        return true;
	    case R.id.opcionNoMeGusta:
	    	libroControladora.nomegustaLibro();
	        return true;
	    default:
	        return super.onOptionsItemSelected(item);
	    }
	}
}
