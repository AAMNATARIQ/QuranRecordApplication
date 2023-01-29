package amnatariq.org.myquranapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class d4 extends AppCompatActivity {

    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;
    List<ModalClass> userList;
    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_d4);

        initData();
        initRecyclerView();
        
    }

    private void initData() {
        userList = new ArrayList<>();
        userList.add(new ModalClass(R.drawable.pic1,"userone","done","this is user one information","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","done","this is user one information","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","done","this is user one information","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","done","this is user one information","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","done","this is user one information","_______________________________________"));
        userList.add(new ModalClass(R.drawable.pic1,"userone","done","this is user one information","_______________________________________"));

    }


    private void initRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new Adapter(userList);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
}