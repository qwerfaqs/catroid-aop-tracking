package com.seminario.clases;

import com.seminario.controladoras.LibroControladora;

import android.view.View;
import android.view.View.OnClickListener;

public class ClickMeGustaLibro implements OnClickListener{


	public void onClick(View arg0) {
		LibroControladora controladora = new LibroControladora();
		controladora.megustaLibro();
	}
	

}
