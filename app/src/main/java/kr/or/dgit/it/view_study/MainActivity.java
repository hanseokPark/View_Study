package kr.or.dgit.it.view_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void mOnClick(View view) {
        Intent intent = new Intent();
        if(view.getId()==R.id.btnMain01){
            intent.setClass(this, ViewBasicActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain02){
            intent.setClass(this, TextViewExActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        startActivity(intent);
    }
}
