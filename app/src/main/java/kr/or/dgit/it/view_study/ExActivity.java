package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex);
        setTitle(getIntent().getStringExtra("title"));
        setTitle(R.string.main_titleEx);

    }

    public void Exclick(View view) {
    }
}
