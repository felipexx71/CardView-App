package com.example.projetocardview.adapter;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.projetocardview.R;
import com.example.projetocardview.models.Post;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Post> listPost;

    public Adapter(List<Post> post) {
        this.listPost = post;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.postagem, parent, false );

        return new MyViewHolder( itemLista );
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Post post = listPost.get(position);

        holder.nome.setText( post.getNome() );
        holder.postagem.setText( post.getDescricao() );
        holder.imagem.setImageResource(post.getImagem());
    }

    @Override
    public int getItemCount() {
        return listPost.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView nome;
        private TextView postagem;
        private ImageView imagem;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.textNome);
            postagem = itemView.findViewById(R.id.textDescricao);
            imagem = itemView.findViewById(R.id.imagemPost);
        }
    }

}
