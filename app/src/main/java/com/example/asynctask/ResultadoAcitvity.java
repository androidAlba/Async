package com.example.asynctask;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ResultadoAcitvity extends Activity {
    private TextView tvResultado,tvResultado2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.resultado_activity);

        tvResultado = findViewById(R.id.textView);
        tvResultado2 = findViewById(R.id.textView2);
        Bundle bundle = new Bundle();
        bundle = getIntent().getExtras();
        String nombre = bundle.getString("user");
        String passsword = bundle.getString("password");
        tvResultado.setText("Bienvenido :" + nombre);
        tvResultado2.setText("Tu password es :" + passsword);
    }
}
