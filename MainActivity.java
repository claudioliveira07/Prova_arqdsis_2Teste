package br.usjt.simulado;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

    public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public final static String EXTRA_MESSAGE_SPINNER = "br.usjt.meuprimeiroapp.MESSAGE_SPINNER";
        public final static String EXTRA_MESSAGE_NAME = "br.usjt.meuprimeiroapp.MESSAGE_NAME";

    //será chamado quando o usuário clicar em Enviarabflheabifea
    public void exibirLivros(View view) {
        Spinner spinner = (Spinner) findViewById(R.id.spinnerTipoDeLivro);
        String spin = spinner.getSelectedItem().toString();

        EditText name = (EditText) findViewById(R.id.editTextName);
        String name_string = name.getText().toString();
        Intent intent;

        if(spin.equals("Técnico")) {
            intent = new Intent(this, ExibirLivrosTecnicos.class);
        }else{
            intent = new Intent(this, ExibirLivros.class);
        }
        //testsfuagygufeayuf
        intent.putExtra(EXTRA_MESSAGE_NAME, name_string);
        startActivity(intent);
    }
}
