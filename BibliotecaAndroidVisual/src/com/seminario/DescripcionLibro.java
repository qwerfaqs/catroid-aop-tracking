package com.seminario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.seminario.clases.ClickMeGustaLibro;
import com.seminario.clases.ClickNoMeGustaLibro;
import com.seminario.clases.Libro;
import com.seminario.controladoras.LibroControladora;

public class DescripcionLibro extends Activity {

	TextView txtTituloLibro;
	TextView txtAutorLibro;
	TextView txtDescripcionLibro;
	Button btnMeGustaLibro;
	Button btnNoMeGustaLibro;
	Button btnIrListaLibro;
	
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
		btnMeGustaLibro = (Button)findViewById(R.id.btnMeGustaLibro);
		btnNoMeGustaLibro = (Button)findViewById(R.id.btnNoMeGustaLibro);
		btnIrListaLibro = (Button)findViewById(R.id.btnIrListaLibro);
		//}recuperar componentes
		
		//accion boton volver{
		btnIrListaLibro.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				//crear una nueva actividad e iniciarla{
				//Intent intento = new Intent(DescripcionLibro.this, ListadoLibro.class);//crear el intento
				//startActivity(intento);//ir a la otra actividad, un alternativa podria ser ir para atras(en vez de lanzar una nueva actividad)
				//}creear una nueva actividad e iniciarla. De este modo al precional la tecla retroceso (Esc = escape) en la maquina virtual navegamos por todo el historial de actividades de la aplicacion
				finish();//finalizar la actividad. De esta forma esta actividad existe de a una vez
				
			}
		});
		//}volver
		
		String nombreLibroSelec = getIntent().getStringExtra("nombreLibro");//recuperar el nombre seleccionado del extra
		Libro libroSelec = libroControladora.devolverLibro(nombreLibroSelec);//con el nombre recuperar el Libro
		
		//actualizar los componentes visuales con los datos{
		txtTituloLibro.setText(libroSelec.getTitulo());
		txtAutorLibro.setText(libroSelec.getAutor());
		txtDescripcionLibro.setText(libroSelec.getDescripcion());
		//}actualiza datos
		
		
		btnMeGustaLibro.setOnClickListener(new ClickMeGustaLibro());//acción al click en MeGusta
		btnNoMeGustaLibro.setOnClickListener(new ClickNoMeGustaLibro());//acción "No Me Gusta libro"
	}
}
