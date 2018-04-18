package kr.or.dgit.it.view_study;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ViewBasicActivity extends AppCompatActivity {
    private TextView mTextView;
    TextView targetTextView;
    /*Button trueBtn;

    Button falseBtn;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*Intent intent = getIntent();
        int titleId = intent.getIntExtra("title" , 0);
        setTitle(titleId);*/
        setTitle(getIntent().getStringExtra("title"));
        /*뷰 기초 속성 필요 제목을 불러오는듯 */

        setTitle(R.string.main_title01);
        setContentView(R.layout.activity_view_basic);

        mTextView = findViewById(R.id.tv);
        targetTextView =(TextView)findViewById(R.id.tv02);
        /*trueBtn = (Button)findViewById(R.id.btn_visible_true);

        falseBtn = (Button)findViewById(R.id.btn_visible_false);

        trueBtn.setOnClickListener(this);
        falseBtn.setOnClickListener(this);*/
    }

    public void trueBtn01Click(View view) {
        if(!mTextView.isShown()){
            mTextView.setVisibility(View.VISIBLE);
        }
    }

    public void falseBtn01Click(View view) {
        if(!targetTextView.isShown()){
            targetTextView.setVisibility(View.VISIBLE);
        }
    }

    public void trueBtn02Click(View view) {
        if(!targetTextView.isShown()){
            targetTextView.setVisibility(View.VISIBLE);
        }
    }

    public void falseBtn02Click(View view) {
        if(targetTextView.isShown()){
            targetTextView.setVisibility(View.GONE);
        }
    }
}
