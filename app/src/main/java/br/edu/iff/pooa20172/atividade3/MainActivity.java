package br.edu.iff.pooa20172.atividade3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import br.edu.iff.pooa20172.atividade3.ClickRecyclerViewListener;
import br.edu.iff.pooa20172.atividade3.Livro;
import br.edu.iff.pooa20172.atividade3.LivroAdapter;
import br.edu.iff.pooa20172.atividade3.LivroDestaque;
import br.edu.iff.pooa20172.atividade3.R;


public class MainActivity extends AppCompatActivity implements ClickRecyclerViewListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.item_livro);

        recyclerView.setAdapter(new LivroAdapter(getLivros(),this,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

    }

    private List<Livro> getLivros(){
        List<Livro> livros = new ArrayList<Livro>();
        int i =0;
        for(i=0;i<=20;i++){
            String iv = String.valueOf(i);
            Livro livro = new Livro("livro".concat(iv),"Autor".concat(iv),"Descricao".concat(iv));
            livros.add(livro);
        }
        return livros;

    }

    @Override
    public void onClick(Object object) {
        Livro livro = (Livro) object;
        Intent intent = new Intent(this, LivroDestaque.class);
        intent.putExtra("livro", livro);
        startActivity(intent);

    }
}