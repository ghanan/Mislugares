package org.example.mislugares;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Spinner;

/**
 * Created by atc on 17/05/15.
 */
public class EdicionLugar extends AppCompatActivity {
    private long id;
    private Lugar lugar;
    private EditText nombre;
    private Spinner tipo;
    private EditText direccion;
    private EditText telefono;
    private EditText url;
    private EditText comentario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edicion_lugar);

        Bundle extras = getIntent().getExtras();
        id = extras.getLong("id", -1);
        lugar = Lugares.elemento((int) id);

        nombre = (EditText) findViewById(R.id.nombre);
        nombre.setText(lugar.getNombre());

        direccion = (EditText) findViewById(R.id.direccion);
        direccion.setText(lugar.getDireccion());

        telefono = (EditText) findViewById(R.id.telefono);
        telefono.setText(Integer.toString(lugar.getTelefono()));

        url = (EditText) findViewById(R.id.url);
        url.setText(lugar.getUrl());

        comentario = (EditText) findViewById(R.id.comentario);
        comentario.setText(lugar.getComentario());

//        TextView fecha = (TextView) findViewById(R.id.fecha);
//        fecha.setText(DateFormat.getDateInstance().format(new Date(lugar.getFecha())));
//
//        TextView hora = (TextView) findViewById(R.id.hora);
//        hora.setText(DateFormat.getTimeInstance().format(new Date(lugar.getFecha())));
//
//        RatingBar valoracion = (RatingBar) findViewById(R.id.valoracion);
//        valoracion.setRating(lugar.getValoracion());
//        valoracion.setOnRatingBarChangeListener(
//                new RatingBar.OnRatingBarChangeListener() {
//                    @Override
//                    public void onRatingChanged(RatingBar ratingBar, float valor, boolean fromUser) {
//                        lugar.setValoracion(valor);
//                    }
//                });
    }

}
