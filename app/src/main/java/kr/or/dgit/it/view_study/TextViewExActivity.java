package kr.or.dgit.it.view_study;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TextViewExActivity extends AppCompatActivity {
    EditText edittext;
    CheckBox checkBox;
    CharSequence result1;
    CharSequence result2;
    CharSequence result3;
    RadioGroup radiogroup;
    RadioButton radioButton01;
    RadioButton radioButton02;
    RadioButton radioButton03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view_ex);
        setTitle(getIntent().getStringExtra("title"));

        edittext = findViewById(R.id.editText);
        checkBox = findViewById(R.id.checkText);
        radiogroup = findViewById(R.id.radiogroup);
        radioButton01 = findViewById(R.id.radioButton01);
        radioButton02 = findViewById(R.id.radioButton02);
        radioButton03 = findViewById(R.id.radioButton03);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    checkBox.setText("is Checked");
                    result2 = checkBox.getText();
                }else{
                    checkBox.setText("is unChecked");
                    result2 = checkBox.getText();
                }
            }
        });

        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.radioButton01){
                    result1 = radioButton01.getText();
                }else if(checkedId == R.id.radioButton02){
                    result1 = radioButton02.getText();
                }else{
                    result1 = radioButton03.getText();
                }

            }
        });

        result3 = edittext.getText();

    }


    public void button(View view) {


        Toast.makeText(this, result3 + ", " + result2 +","+ result1, Toast.LENGTH_SHORT).show();
    }
}
