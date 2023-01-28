package amnatariq.org.myquranapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;

public class Activity1 extends AppCompatActivity {

    private CardView D1,D2,D3,D4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        //initializing
        D1 = (CardView) findViewById(R.id.d1);
        D2 = (CardView) findViewById(R.id.d2);
        D2 = (CardView) findViewById(R.id.d3);
        D3 = (CardView) findViewById(R.id.d4);

        //setting up onclick listener
    }
}