package br.usjt.simulado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class ExibirLivrosTecnicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_livros_tecnicos);
        Intent intent = getIntent();

        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_NAME);
        TextView textView = new TextView(this);
        textView.setText("Olá "+ message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_exibir_livros_tecnicos);
        layout.addView(textView);
    }
}
