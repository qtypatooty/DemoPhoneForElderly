package sg.edu.rp.c346.id20006949.demophoneforelderly;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button buttonCallSon;
Button buttonCallDaughter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonCallSon = findViewById(R.id.buttonCallSon);
        buttonCallDaughter = findViewById(R.id.buttonCallDaughter);
        buttonCallSon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+92240336));
                startActivity(intent);
            }
        });
        buttonCallDaughter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.parse("tel:"+89675543));
                startActivity(intent);
            }

        });
    }

}