package amnatariq.org.myquranapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserInformation extends AppCompatActivity{

    Button btnv1,btnv2,btnv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        btnv1 = (Button)findViewById(R.id.btnviewone);
        btnv2 = (Button)findViewById(R.id.btnviewtwo);
        btnv3 = (Button)findViewById(R.id.btnviewthree);

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
}