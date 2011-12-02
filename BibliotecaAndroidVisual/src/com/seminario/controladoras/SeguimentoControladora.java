package com.seminario.controladoras;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.util.Log;

import com.seminario.daos.SeguimientoDao;

public class SeguimentoControladora {

	private SeguimientoDao seguimientoDao;
	
	public SeguimentoControladora(Context context, String name, CursorFactory factory, int version) {
		seguimientoDao = new SeguimientoDao(context, name, factory, version);
	}
	
	public void insertarSeguimientoUsuario(boolean estado)
	{
		//Log.v("seminario", "vacioSeguimiento: "+String.valueOf(seguimientoDao.existeElementoSeguimientoUsuario()));
		if(!seguimientoDao.existeElementoSeguimientoUsuario())
		{
			seguimientoDao.insertarSeguimientoUsuario(estado);
			actualizarSeguimientoUsuario(estado);//no hace falta pero sería la forma correcta de darle un valor a estado del seguimiento
		}
		//else tendría que tirar una exepcion
	}
	
	public void actualizarSeguimientoUsuario(boolean estado)
	{
		seguimientoDao.actualizarSeguimientoUsuario(estado);
	}
	
	public boolean devolverSeguimientoUsuario()
	{
		return seguimientoDao.devolverSeguimientoUsuario();
	}
	
	public void insertarSeguimientoServidor(boolean estado)
	{
		//Log.v("seminario", "vacioSeguimiento: "+String.valueOf(seguimientoDao.existeElementoSeguimientoUsuario()));
		if(!seguimientoDao.existeElementoSeguimientoServidor())
		{
			seguimientoDao.insertarSeguimientoServidor(estado);
		}
	}
	
	public boolean devolverSeguimientoServidor()
	{
		return seguimientoDao.devolverSeguimientoServidor();
	}
}
