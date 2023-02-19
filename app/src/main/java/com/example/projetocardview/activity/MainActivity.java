package com.example.projetocardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projetocardview.R;
import com.example.projetocardview.adapter.Adapter;
import com.example.projetocardview.models.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;

    private List<Post> placeList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycler = findViewById(R.id.recyclerView);

        this.criarPost();

        //layout
        LinearLayoutManager layout = new LinearLayoutManager(this);
        //new GridLayoutManager(this);

        //muda a orientação dos cards
        //layout.setOrientation( RecyclerView.HORIZONTAL );

        recycler.setLayoutManager( layout );
        //adapter
        Adapter adapter = new Adapter( placeList );
        recycler.setAdapter( adapter );
    }

    public void criarPost() {
        Post p = new Post("Joao", "Um lugar legal!", R.drawable.amsterd_o_43284324);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);
        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

        p = new Post("Marcos Pedro", "Que lugar FOD#!", R.drawable.floren_a_palazzo_pitti_2329820);
        this.placeList.add(p);

        p = new Post("Marcela Gutias", "Muito massa esse local!!!!!", R.drawable.lago_sangrado_36311040);
        this.placeList.add(p);

        p = new Post("Maricota Linda001", "Eu amei essa viagem!", R.drawable.lugares_bonitos_de_it_lia_lerici_em_liguria_75216869);
        this.placeList.add(p);

        p = new Post("Felipe Nunes", "Recomendo demais esse local!!", R.drawable.sala_de_concertos_em_berlim_26958950);
        this.placeList.add(p);

    }
}