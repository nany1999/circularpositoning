package com.example.circularpositoning;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView hello=findViewById(R.id.A);
        Drawable[] dr=hello.getCompoundDrawables();
        dr[0].setBounds(100,0,100,100);
        dr[1].setBounds(100,100,100,0);
        dr[2].setBounds(0,100,100,100);
        dr[3].setBounds(100,100,100,0);
        hello.setCompoundDrawables(dr[0],dr[1],dr[2],dr[3]);
    }
}
