package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TextViewExActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_ex);
        setTitle(getIntent().getStringExtra("title"));

        /*button = findViewById(R.id.button);
        button.setOnClickListener();*/
    }


    public void button(View view) {

        /*Toast.makeText(TextView.this, );*/
    }
}
