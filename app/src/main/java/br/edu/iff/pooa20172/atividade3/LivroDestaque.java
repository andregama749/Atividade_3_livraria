package br.edu.iff.pooa20172.atividade3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class LivroDestaque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.livro_destaque);
        Intent intent = getIntent();
        Livro livro = (Livro) intent.getSerializableExtra("livro");
        EditText nome = (EditText) findViewById(R.id.et_nome_livro_destaque);
        EditText autor = (EditText) findViewById(R.id.et_autor_livro_destaque);
        EditText descricao = (EditText) findViewById(R.id.et_descricao_livro_destaque);

        nome.setText(livro.getNome());
        autor.setText(livro.getAutor());
        descricao.setText(livro.getDescricao());

    }
}
