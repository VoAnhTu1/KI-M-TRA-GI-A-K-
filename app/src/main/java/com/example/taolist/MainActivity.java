package com.example.taolist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView;
        ArrayList<MonAN> arrayList;
        AdapterMonAn adapter;

        listView=findViewById(R.id.listviewmonan);
        arrayList = new ArrayList<>();
        arrayList.add(new MonAN("Cơm chiên","Cơm chiên",R.drawable.comchien,"30.000"));
        arrayList.add(new MonAN("Mì tôm","Mì tôm",R.drawable.tomi,"20.000"));
        arrayList.add(new MonAN("Bánh mì","Hamburger ",R.drawable.banhmi,"15.000"));
        arrayList.add(new MonAN("Gà rán","Gà rán",R.drawable.garan,"25.000"));
        arrayList.add(new MonAN("Chiên trứng","Chiên trứng",R.drawable.chientrung,"10.000"));

        adapter = new AdapterMonAn(MainActivity.this,R.layout.layout_monan,arrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0){
                    Intent intent = new Intent();
                    intent.setClass(MainActivity.this,comchien.class);
                    startActivity(intent);
                   
                }

            }
        });


    }
}