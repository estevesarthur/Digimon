package com.example.digimon;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private PersDigimonAdapter PersDigimonAdapter;
    private List<PDigimon> listPDigimonView = new ArrayList<>();

    @TargetApi(Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        PersDigimonAdapter = new PersDigimonAdapter(this, listPDigimonView);
        RecyclerView.LayoutManager manager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(PersDigimonAdapter);
        PDigimonPrepare();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void PDigimonPrepare(){
        PDigimon data = new PDigimon(R.mipmap.taichi,"Taichi Yagami", "Agumon");
        listPDigimonView.add(data);
        data = new PDigimon(R.mipmap.yamato, "Yamato Ishida", "Gabumon");
        listPDigimonView.add(data);
        data = new PDigimon(R.mipmap.sora, "Sora Takenouchi", "Piyomon");
        listPDigimonView.add(data);
        data = new PDigimon(R.mipmap.koushiro, "Koushiro Izumi", "Tentomon");
        listPDigimonView.add(data);
        data = new PDigimon(R.mipmap.jou, "Jou Kido", "Gomamon");
        listPDigimonView.add(data);
        data = new PDigimon(R.mipmap.mimi, "Mimi Tachikawa", "Palmon");
        listPDigimonView.add(data);
        data = new PDigimon(R.mipmap.takeru, "Takeru Takaishi", "Patamon");
        listPDigimonView.add(data);
        data = new PDigimon(R.mipmap.hikari, "Hikari Yagami", "Tailmon");
        listPDigimonView.add(data);

        Collections.sort(listPDigimonView, new Comparator<PDigimon>() {
            @Override
            public int compare(PDigimon o1, PDigimon o2) { return o1.digiEscolhido.compareTo(o2.digiEscolhido);
            }
        });
    }
}