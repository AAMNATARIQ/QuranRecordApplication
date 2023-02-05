package amnatariq.org.myquranapplication;

import static java.lang.Integer.parseInt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class UserInformation extends AppCompatActivity{

    TextView tvname, tvbio, tvsabaknum,tvsabkinum,tvmanzilnum;

    Button btnv1,btnv2,btnv3;

    Button btnc1,btninc1,btnc2,btninc2,btnc3,btninc3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        tvname = findViewById(R.id.usernametext);
        tvbio= findViewById(R.id.userbio);

        tvsabaknum = findViewById(R.id.textsabakvalue);
        tvsabkinum = findViewById(R.id.textsabakivalue);
        tvmanzilnum = findViewById((R.id.textmanzilvalue));

        btnv1 = (Button)findViewById(R.id.btnviewone);
        btnv2 = (Button)findViewById(R.id.btnviewtwo);
        btnv3 = (Button)findViewById(R.id.btnviewthree);

        btnc1 = (Button)findViewById(R.id.btncorrectsabak);
        btninc1 = (Button)findViewById(R.id.btnincorrectsabak);

        btnc2 = (Button)findViewById(R.id.btncorrectsabki);
        btninc2 = (Button)findViewById(R.id.btnincorrectsabki);

        btnc3 = (Button)findViewById(R.id.btncorrectmanzil);
        btninc3 = (Button)findViewById(R.id.btnincorrectmanzil);


        String username = getIntent().getStringExtra("studentName");
        tvname.setText(username);
        String userbio = getIntent().getStringExtra("studentBio");
        tvbio.setText(userbio);


        btnv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSabakView(username);
            }
        });
        btnv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateSabakiView(username);
            }
        });
        btnv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateManzilView(username);
            }
        });


        btnc1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabakCorrectCount(username);}
        });
        btninc1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabakIncorrectCount(username);}
        });
        btnc2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabkiCorrectCount(username);}
        });
        btninc2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateSabkiIncorrectCount(username);}
        });
        btnc3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateManzilCorrectCount(username);}
        });
        btninc3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view){updateManzilIncorrectCount(username);}
        });

    }
    public void updateSabakView(String username)
    {
        Intent intent = new Intent(this,Sabak.class);
        intent.putExtra("StudentName",username);
        startActivity(intent);
    }
    public void updateSabakiView(String username)
    {
        Intent intent = new Intent(this,Sabaki.class);
        intent.putExtra("StudentName",username);
        startActivity(intent);
    }
    public void updateManzilView(String username)
    {
        Intent intent = new Intent(this,Manzil.class);
        intent.putExtra("StudentName",username);
        startActivity(intent);
    }

    public void updateSabakCorrectCount(String username)
    {
        DbHelper db=new DbHelper(this);
        ModalClass lm = db.getStudent(username);
        int c=lm.getSabak();
        lm.setSabak(c+1);
        db.updateStudent(lm);
    }
    public void updateSabakIncorrectCount(String username)
    {
        DbHelper db=new DbHelper(this);
        ModalClass lm = db.getStudent(username);
        //int c=Integer.parseInt(lm.getIncorrectSabak());
        String str = String.valueOf(lm.getSabak());
        lm.setIncorrectSabak(lm.getIncorrectSabak()+str);
        db.updateStudent(lm);
    }
    public void updateSabkiCorrectCount(String username)
    {
        DbHelper db=new DbHelper(this);
        ModalClass lm = db.getStudent(username);
        int c=lm.getSabki();
        lm.setSabki(c+1);
        db.updateStudent(lm);
    }
    public void updateSabkiIncorrectCount(String username)
    {
        DbHelper db=new DbHelper(this);
        ModalClass lm = db.getStudent(username);
//        int c=Integer.parseInt(lm.getIncorrectSabki());
//        lm.setIncorrectSabki(String.valueOf(c+1));
        String str = String.valueOf(lm.getSabak());
        lm.setIncorrectSabak(lm.getIncorrectSabak()+str);
        db.updateStudent(lm);
    }
    public void updateManzilCorrectCount(String username)
    {
        DbHelper db=new DbHelper(this);
        ModalClass lm = db.getStudent(username);
        int c=lm.getManzil();
        lm.setManzil(c+1);
        db.updateStudent(lm);
    }
    public void updateManzilIncorrectCount(String username)
    {
        DbHelper db=new DbHelper(this);
        ModalClass lm = db.getStudent(username);
//        int c=Integer.parseInt(lm.getIncorrectMazil());
//        lm.setIncorrectMazil(String.valueOf(c+1));
        String str = String.valueOf(lm.getSabak());
        lm.setIncorrectSabak(lm.getIncorrectSabak()+str);
        db.updateStudent(lm);
    }
}