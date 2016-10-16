package com.example.tiburcio.ejemploproveedorcontenido.proveedor;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;

import com.example.tiburcio.ejemploproveedorcontenido.pojos.Ciclo;

/**
 * Created by Tiburcio on 15/10/2016.
 */

public class CicloProveedor {
    static public void insert(ContentResolver resolvedor, Ciclo ciclo){
        Uri uri = Contrato.Ciclo.CONTENT_URI;

        ContentValues values = new ContentValues();
        values.put(Contrato.Ciclo.NOMBRE, ciclo.getNombre());
        values.put(Contrato.Ciclo.ABREVIATURA, ciclo.getAbreviatura());

        resolvedor.insert(uri, values);
    }
}
