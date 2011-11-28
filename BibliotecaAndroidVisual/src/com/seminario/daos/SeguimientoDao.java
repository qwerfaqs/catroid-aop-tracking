package com.seminario.daos;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class SeguimientoDao extends SQLiteOpenHelper {

	SQLiteDatabase baseDatos;
	String sql;
	
	public SeguimientoDao(Context context, String name, CursorFactory factory, int version) {
		super(context, name, factory, version);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		sql="CREATE TABLE seguimiento (seguimiento_usuario integer, seguimiento_servidor integer)";
		db.execSQL(sql);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	public void insertarSeguimientoUsuario(boolean estado)
	{
		int valor= 0;
		if(estado)
		{
			valor = 1;
		}
		baseDatos = getWritableDatabase();
		sql = "INSERT INTO seguimiento (seguimiento_usuario) VALUES ("+String.valueOf(valor)+")";
		baseDatos.execSQL(sql);
		baseDatos.close();
	}
	/**
	 * 
	 * @param estado. nueva configuración del seguimientoUsuario
	 */
	public void actualizarSeguimientoUsuario(boolean estado)
	{
		int valor = 0;//convertir de boolean a int
		if(estado)
		{
			valor = 1;
		}
		baseDatos= getWritableDatabase();
	
		sql="UPDATE seguimiento SET seguimiento_usuario="+String.valueOf(valor);
		baseDatos.execSQL(sql);
		baseDatos.close();
	}
	
	public boolean devolverSeguimientoUsuario()
	{
		boolean rta = false;
		baseDatos = getWritableDatabase();
		sql="SELECT seguimiento_usuario FROM seguimiento";
		Cursor cursor = baseDatos.rawQuery(sql, null);

		if(cursor.getCount()>0)
		{
			cursor.moveToNext();
			if(cursor.getInt(0)==1)
			{
				rta = true;
			}
		}
		//se podría disparar una excepcion si no hay valor cargado
		baseDatos.close();
		return rta;
	}
	/**
	 * 
	 * @return true si no existen elementos cargados
	 */
	
	public boolean existeElementoSeguimientoUsuario()
	{
		boolean rta = false;
		baseDatos = getWritableDatabase();
		sql="SELECT seguimiento_usuario FROM seguimiento";
		Cursor cursor = baseDatos.rawQuery(sql, null);
		if(cursor.getCount()>0)
		{
				rta = true;
		}
		baseDatos.close();
		return rta;
	}
	
	public void insertarSeguimientoServidor(boolean estado)
	{
		int valor= 0;
		if(estado)
		{
			valor = 1;
		}
		baseDatos = getWritableDatabase();
		sql = "INSERT INTO seguimiento (seguimiento_servidor) VALUES ("+String.valueOf(valor)+")";
		baseDatos.execSQL(sql);
		baseDatos.close();
	}
	
	/**
	 * 
	 * @param estado. nueva configuración del seguimientoServidor
	 */
	public void actualizarSeguimientoServidor(boolean estado)
	{
		int valor = 0;//convertir de boolean a int
		if(estado)
		{
			valor = 1;
		}
		baseDatos= getWritableDatabase();
	
		sql="UPDATE seguimiento SET seguimiento_servidor="+String.valueOf(valor);
		baseDatos.execSQL(sql);
		baseDatos.close();
	}
	
	public boolean devolverSeguimientoServidor()
	{
		boolean rta = false;
		baseDatos = getWritableDatabase();
		sql="SELECT seguimiento_servidor FROM seguimiento";
		Cursor cursor = baseDatos.rawQuery(sql, null);

		if(cursor.getCount()>0)
		{
			cursor.moveToNext();
			if(cursor.getInt(0)==1)
			{
				rta = true;
			}
		}
		//se podría disparar una excepcion si no hay valor cargado
		baseDatos.close();
		return rta;
	}
	/**
	 * 
	 * @return true si no existen elementos cargados
	 */
	
	public boolean existeElementoSeguimientoServidor()
	{
		boolean rta = false;
		baseDatos = getWritableDatabase();
		sql="SELECT seguimiento_servidor FROM seguimiento";
		Cursor cursor = baseDatos.rawQuery(sql, null);
		if(cursor.getCount()>0)
		{
				rta = true;
		}
		baseDatos.close();
		return rta;
	}

}
