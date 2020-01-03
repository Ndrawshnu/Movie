package com.example.MyMovie;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button btnMulai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnMulai = (Button) findViewById(R.id.btnMulai);
        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                Main2Activity.this.startActivity(intent);
                Main2Activity.this.finish();
            }

        });
    }
}
