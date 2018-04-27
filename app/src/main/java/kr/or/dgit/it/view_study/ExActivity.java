package kr.or.dgit.it.view_study;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ExActivity extends AppCompatActivity {
    TextView sname;
    TextView semail;
    EditText edit1;
    EditText edit2;
    Button exbutton;
    View dialogView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex);
        setTitle(getIntent().getStringExtra("title"));
        setTitle(R.string.main_titleEx);

        sname = findViewById(R.id.main_name);
        semail = findViewById(R.id.main_email);
       /* exbutton = findViewById(R.id.exbutton);*/
    }

    public void onclick(View view) {
        if(view.getId() == R.id.exbutton){
            dialogView = View.inflate(ExActivity.this,R.layout.dialog_ex, null);
            AlertDialog.Builder dlg = new AlertDialog.Builder(ExActivity.this);
            dlg.setTitle("사용자 정보 입력");
            dlg.setIcon(R.drawable.tab_icon3);
            dlg.setView(dialogView);
            dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    edit1 = dialogView.findViewById(R.id.edit1);
                    edit2 = dialogView.findViewById(R.id.edit2);

                    sname.setText(edit1.getText().toString());
                    semail.setText(edit2.getText().toString());
                }
            });
            dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Toast.makeText(ExActivity.this, "취소됐습니다.", Toast.LENGTH_SHORT).show();
                }
            });
            dlg.show();
        }
    }
}
