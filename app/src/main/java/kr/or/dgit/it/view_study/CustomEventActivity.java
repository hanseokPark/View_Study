package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class CustomEventActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener{
    TextView bellTextView;
    TextView labelTextView;
    Switch switchbtn;
    CheckBox checkbox01;
    CheckBox checkbox02;

    float initX;
    private long initTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_event);
        setTitle(getIntent().getStringExtra("title"));
        setTitle(R.string.main_title10);

        bellTextView =findViewById(R.id.bellText);
        labelTextView=findViewById(R.id.labelText);
        switchbtn = findViewById(R.id.switchbtn);
        checkbox01= findViewById(R.id.checkbox01);
        checkbox02= findViewById(R.id.checkbox02);

        bellTextView.setOnClickListener(this);
        labelTextView.setOnClickListener(this);

        switchbtn.setOnCheckedChangeListener(this);
        checkbox01.setOnCheckedChangeListener(this);
        checkbox02.setOnCheckedChangeListener(this);
    }
    private void showTeoast(String message){
        Toast.makeText(this,message, Toast.LENGTH_SHORT ).show();
    }
    @Override
    public void onClick(View v){
        if(v==bellTextView){
            showTeoast("bell text click event...");
        }else if(v==labelTextView){
            showTeoast("label text click event...");
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
        if(buttonView==checkbox01){
            showTeoast("repeat checkbox is"+isChecked);
        }else  if(buttonView==checkbox02){
            showTeoast("vibrate checkbox is"+isChecked);
        } if(buttonView==switchbtn){
            showTeoast("switch is"+isChecked);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if(event.getAction()==MotionEvent.ACTION_DOWN){
            initX=event.getRawX();
        }else if(event.getAction()==MotionEvent.ACTION_UP){
            float diffX = initX-event.getRawX();
            if(diffX>30){
                showTeoast("왼쪽으로 화면을 밀었습니다.");
            }else if(diffX<-30){
                showTeoast("오른쪽으로 화면을 밀었습니다.");
            }
        }
        return true;
    }

    @Override
    public void onBackPressed() {
        if(System.currentTimeMillis()- initTime > 3000){
            showTeoast("종료할려면 한번 더 누르세요");
            initTime = System.currentTimeMillis();
        }else{
            finish();
        }
    }
}


