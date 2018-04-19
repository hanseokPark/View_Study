package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FrameLayoutActivity extends AppCompatActivity {
    TextView text01;
    TextView text02;
    TextView text03;
    /*TextView[] views;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout);

        text01 = findViewById(R.id.viewcolor1);
        text02 = findViewById(R.id.viewcolor2);
        text03 = findViewById(R.id.viewcolor3);

        /*views = new TextView[] {findViewById(R.id.viewcolor1), findViewById(R.id.viewcolor2), findViewById(R.id.viewcolor3);}*/
    }

    public void framebtn01(View view) {
        if(text01.isShown()){
            text01.setVisibility(View.INVISIBLE);
        }else{
            text01.setVisibility(View.VISIBLE);
        }
        /* visibleTextView(isVisible:View.INVISIBLE.View.INVISIBLE.View.VISIBLE);*/
    }

    public void framebtn02(View view) {
        if(text02.isShown()){
            text02.setVisibility(View.INVISIBLE);
        }else{
            text02.setVisibility(View.VISIBLE);
        }
        /* visibleTextView(isVisible:View.INVISIBLE.View.VISIBLE.View.INVISIBLE);*/
    }

    public void framebtn03(View view) {
        if(text03.isShown()){
            text03.setVisibility(View.INVISIBLE);
        }else{
            text03.setVisibility(View.VISIBLE);
        }
        /* visibleTextView(isVisible:View.VISIBLE.View.INVISIBLE.View.INVISIBLE);*/
       /* if(view.getId() == R.id.viewcolor3){
            text03.setVisibility(View.INVISIBLE);
        }else{
            text03.setVisibility(View.VISIBLE);
        }*/
        /*if(view.getId()==R.id.text03)*/
    }

    public void framebtn04(View view) {
        if(text03.isShown()&&text01.isShown()&&text02.isShown()){
            text01.setVisibility(View.INVISIBLE);
            text02.setVisibility(View.INVISIBLE);
            text03.setVisibility(View.INVISIBLE);
        }else{
            text01.setVisibility(View.VISIBLE);
            text02.setVisibility(View.VISIBLE);
            text02.setVisibility(View.VISIBLE);
        }

        /*if(view.getid()==R.id.allVisible){
         visibleTextView(isVisible:View.VISIBLE.View.VISLBLE.View.VISIBLE);
         }
         if(view.getid()==R.id.allInVisible){
         visibleTextView(isVisible:View.INVISIBLE.View.INVISIBLE.View.INVISIBLE);
         }*/
    }

    /*private void visibleTextView(int isVisible){
            for(int i = 0; views.length; i++){
                views[i].setsetVisibility(isVisible[i]);
            }


      mTextView01.setVisibility(isVisible[0]);
      mTextView01.setVisibility(isVisible[1]);
      mTextView01.setVisibility(isVisible[2]);
     */

}
