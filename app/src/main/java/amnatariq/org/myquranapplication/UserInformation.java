package amnatariq.org.myquranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserInformation extends AppCompatActivity{

    TextView tvname, tvbio;

    Button btnv1,btnv2,btnv3;

    Button btnc1,btninc1,btnc2,btninc2,btnc3,btninc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        tvname = findViewById(R.id.usernametext);
        tvbio= findViewById(R.id.userbio);

        btnv1 = (Button)findViewById(R.id.btnviewone);
        btnv2 = (Button)findViewById(R.id.btnviewtwo);
        btnv3 = (Button)findViewById(R.id.btnviewthree);

        btnc1 = (Button)findViewById(R.id.btncorrectsabak);
        btninc1 = (Button)findViewById(R.id.btnincorrectsabak);

        btnc2 = (Button)findViewById(R.id.btncorrectsabki);
        btninc2 = (Button)findViewById(R.id.btnincorrectsabki);

        btnc3 = (Button)findViewById(R.id.btncorrectmanzil);
        btninc3 = (Button)findViewById(R.id.btnincorrectmanzil);


        String username = getIntent().getStringExtra("studentName")
        tvname.setText(username);
        String userbio = getIntent().getStringExtra("studentBio");
        tvbio.setText(userbio);


        btnv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSabakView();
            }
        });
        btnv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSabakiView();
            }
        });
        btnv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateManzilView();
            }
        });


        btnc1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabakCorrectCount();}
        });
        btninc1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabakIncorrectCount();}
        });
        btnc2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabkiCorrectCount();}
        });
        btninc2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabkiIncorrectCount();}
        });
        btnc3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateManzilCorrectCount();}
        });
        btninc3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateManzilIncorrectCount();}
        });

    }
    public void updateSabakView()
    {
        Intent intent = new Intent(this,Sabak.class);
        startActivity(intent);
    }
    public void updateSabakiView()
    {
        Intent intent = new Intent(this,Sabaki.class);
        startActivity(intent);
    }
    public void updateManzilView()
    {
        Intent intent = new Intent(this,Manzil.class);
        startActivity(intent);
    }

    public void updateSabakCorrectCount()
    {

    }
    public void updateSabakIncorrectCount()
    {

    }
    public void updateSabkiCorrectCount()
    {

    }
    public void updateSabkiIncorrectCount()
    {

    }
    public void updateManzilCorrectCount()
    {

    }
    public void updateManzilIncorrectCount()
    {

    }
}