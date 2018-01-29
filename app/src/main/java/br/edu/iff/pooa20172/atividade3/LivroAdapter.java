package br.edu.iff.pooa20172.atividade3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class LivroAdapter extends RecyclerView.Adapter {

    private List<Livro> livros;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    public LivroAdapter(List<Livro> livros, Context context,ClickRecyclerViewListener clickRecyclerViewListener) {

        this.livros = livros;
        this.context = context;
        this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.recycleview, parent, false);
        LivroViewHolder livroViewHolder = new LivroViewHolder(view);
        return livroViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        LivroViewHolder holder = (LivroViewHolder) viewHolder;

        Livro livro  = livros.get(position) ;

        holder.nomeLivro.setText(livro.getNome());
        holder.nomeAutor.setText(livro.getAutor());
        holder.descricao.setText(livro.getDescricao());
        Log.i("------XXXXXXXXX--", livro.getDescricao());


    }

    @Override
    public int getItemCount() {

        return livros.size();
    }

    private void updateItem(int position) {

    }

    // Método responsável por remover um usuário da lista.
    private void removerItem(int position) {

    }

    public class LivroViewHolder extends RecyclerView.ViewHolder {

        private final TextView nomeLivro;
        private final TextView nomeAutor;
        private final TextView descricao;


        public LivroViewHolder(View itemView) {
            super(itemView);
            nomeLivro = (TextView) itemView.findViewById(R.id.nomeLivro);
            nomeAutor = (TextView) itemView.findViewById(R.id.nomeAutor);
            descricao = (TextView) itemView.findViewById(R.id.descricao);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(livros.get(getLayoutPosition()));

                }
            });


        }
    }
}