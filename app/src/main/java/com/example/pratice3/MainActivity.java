package com.example.pratice3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.pratice3.adapter.mycustomadapter;
import com.example.pratice3.model.iplmodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements onclicklistner {
    RecyclerView recyclerView;
    mycustomadapter mycustomadapter;
    List<iplmodel> iplmodelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleview);
        iplmodelList=new ArrayList<>();
        iplmodel a1=new iplmodel("dc",1,R.drawable.dc);
        iplmodel a2=new iplmodel("dfsd",1,R.drawable.mi);
        iplmodel a3=new iplmodel("sdf",1,R.drawable.srh);
        iplmodel a4=new iplmodel("ewge",1,R.drawable.wwe);

        iplmodelList.add(a1);
        iplmodelList.add(a2);
        iplmodelList.add(a3);
        iplmodelList.add(a4);
        mycustomadapter=new mycustomadapter(iplmodelList);
        mycustomadapter.setOnclicklistner(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mycustomadapter);

    }

    @Override
    public void onclick(View v, int position) {
        Toast.makeText(this, "u clicked on"+iplmodelList.get(position).getTeamname()+"team", Toast.LENGTH_SHORT).show();
    }
}