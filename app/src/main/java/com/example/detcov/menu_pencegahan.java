package com.example.detcov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.detcov.R;

import java.util.ArrayList;

import Adapter.Adapter_Pencegahan;
import Adapter.card_pencegahan_item;

public class menu_pencegahan extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_pencegahan);

        ArrayList<card_pencegahan_item> pencegahanlist = new ArrayList<>();
        pencegahanlist.add(new card_pencegahan_item(R.drawable.pencegahan1, "Pakai Masker", "Gunanakan masker sesuai anjuran Pemerintah"));
        pencegahanlist.add(new card_pencegahan_item(R.drawable.pencegahan2, "Physical Distancing", "Jaga jarak minimal 1 meter"));
        pencegahanlist.add(new card_pencegahan_item(R.drawable.pencegahan3, "Hidup Bersih", "Selalu cuci tangan dan sedia handsantizer"));
        pencegahanlist.add(new card_pencegahan_item(R.drawable.pencegahan4, "Tetap #dirumahaja", "Hanya keluar rumah bila perluu"));

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new Adapter_Pencegahan(pencegahanlist);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }
}
