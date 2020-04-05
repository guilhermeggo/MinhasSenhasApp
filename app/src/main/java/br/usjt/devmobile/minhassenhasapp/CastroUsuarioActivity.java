package br.usjt.devmobile.minhassenhasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.orhanobut.hawk.Hawk;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class CastroUsuarioActivity extends AppCompatActivity {
    private static final String TAG = "CastroUsuarioActivity" ;

    private TextInputEditText usuario;
    private TextInputEditText senha;
    private TextInputEditText pergunta;
    private TextInputEditText resposta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);
        //campo usuarioEditTextInput na activity_cadastro usuario tara no campo usuario
         usuario = (TextInputEditText) findViewById(R.id.usuarioEditTextInput);
         senha = (TextInputEditText) findViewById(R.id.senhaEditTextInput);
         pergunta = (TextInputEditText) findViewById(R.id.perguntaEditTextInput);
         resposta = (TextInputEditText) findViewById(R.id.respostaEditTextInput);

        Hawk.init(this).build();




    }



    public void cadastrarUsuario(View view) {
        //todo fazer o cadastre
        Log.d(TAG,"Clicou no fazer cadastro");

        Hawk.put("usuario", usuario.getText().toString());
        Hawk.put("senha", senha.getText().toString());
        Hawk.put("pergunta", pergunta.getText().toString());
        Hawk.put("resposta", resposta.getText().toString());

        Toast.makeText(this, "Cadastro realizado com sucesso", Toast.LENGTH_LONG).show();


    finish();

    }
}
