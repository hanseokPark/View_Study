package kr.or.dgit.it.view_study;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TabHost;
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

        }
        if(view.getId()==R.id.btnMain03){
            intent.setClass(this, LinearLayoutExActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain04){
            intent.setClass(this, RelativeLayoutActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain05){
            intent.setClass(this, FrameLayoutActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain06){
            intent.setClass(this, TabHostActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain07){
            intent.setClass(this, TableLayoutGridLayoutActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain08){
            intent.setClass(this, VibratorAndAlarmActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        if(view.getId()==R.id.btnMain09){
            intent.setClass(this, ExActivity.class);
            intent.putExtra("title", ((Button)view).getText());
        }
        startActivity(intent);
    }
}
