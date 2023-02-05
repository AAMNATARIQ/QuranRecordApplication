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

        ModalClass learningModel;
        System.out.println("Model = ?");

        DbHelper dbHelper = new DbHelper(d4.this);
        dbHelper.addStudent(new ModalClass("userone",R.drawable.pic1,"this is user one information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("usertwo",R.drawable.pic2,"this is user two information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("userthree",R.drawable.pic3,"this is user three information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("userfour",R.drawable.pic4,"this is user four information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("userfive",R.drawable.pic5,"this is user five information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("usersix",R.drawable.pic1,"this is user six information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("userseven",R.drawable.pic2,"this is user seven information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("usereight",R.drawable.pic3,"this is user eight information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        dbHelper.addStudent(new ModalClass("usernine",R.drawable.pic4,"this is user nine information",0,false,0,false,0,false,"0","0","0","_______________________________________"));


        userList = new ArrayList<>();
        userList.add(new ModalClass("userone",R.drawable.pic1,"this is user one information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("usertwo",R.drawable.pic2,"this is user two information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("userthree",R.drawable.pic3,"this is user three information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("userfour",R.drawable.pic4,"this is user four information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("userfive",R.drawable.pic5,"this is user five information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("usersix",R.drawable.pic1,"this is user six information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("userseven",R.drawable.pic2,"this is user seven information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("usereight",R.drawable.pic3,"this is user eight information",0,false,0,false,0,false,"0","0","0","_______________________________________"));
        userList.add(new ModalClass("usernine",R.drawable.pic4,"this is user nine information",0,false,0,false,0,false,"0","0","0","_______________________________________"));

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