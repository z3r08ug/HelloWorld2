package com.example.chris.helloworld2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    private TextView tvText;
    private Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvText = findViewById(R.id.tvText);

        tvText.setText("Changed it man");

        btnClick = findViewById(R.id.btnClickMe);

        btnClick.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                tvText.setText("clicked");
            }
        });
    }
}
