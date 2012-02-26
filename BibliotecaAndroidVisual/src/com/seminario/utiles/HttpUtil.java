package com.seminario.utiles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class HttpUtil extends AsyncTask<String, Void, Void>{

	@Override
	public Void doInBackground(String... params) {
		BufferedReader in = null;
		try
		{
			HttpClient client = new DefaultHttpClient();
			HttpGet method = new HttpGet(params[0]);
			HttpResponse response = client.execute(method);
			in = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
			 StringBuffer sb = new StringBuffer("");
			 String line = "";
			 String NL = System.getProperty("line.separator");
			 while ((line = in.readLine()) != null) {
	                sb.append(line + NL);
			 }
			 in.close();
		 }
		catch (Exception ex)//borrar no  lo borro porque de otra forma lo tendría que resolver el aspecto
		{//borrar
		}//borrar
		finally
		 {
			 if (in != null) {
				 try 
			 	{
				 	in.close();
			 	} 
			 	catch (IOException e) 
			 	{
			 	}
			 }
		 }
		return null;
	}
}
