package amnatariq.org.myquranapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class d4 extends AppCompatActivity implements RecyclerViewInterface{

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModalClass> userList;
    Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4);


//        textView2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(d4.this,UserInformation.class);
//                startActivity(intent);
//
//            }
//        });

        initData();
        initRecyclerView();
        
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic2,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic3,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic4,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic5,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","this is user one information","done","_______________________________________"));

    }


    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList,this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();




    }

    @Override
    public void onItemClick(int position) {
        Intent intent=new Intent(this,UserInformation.class);
        startActivity(intent);
    }
}