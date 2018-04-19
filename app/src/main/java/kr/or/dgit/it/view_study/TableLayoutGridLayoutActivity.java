package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TableLayoutGridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_layout_grid_layout);
        setTitle(getIntent().getStringExtra("title"));
        setTitle(R.string.main_title07);


    }
}
