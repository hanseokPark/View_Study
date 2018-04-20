package kr.or.dgit.it.view_study;

import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VibratorAndAlarmActivity extends AppCompatActivity implements View.OnClickListener{
    Button vibrationBtn;
    Button systemBeepBtn;
    Button customBepBtn;
    Button btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibrator_and_alarm);
        setTitle(getIntent().getStringExtra("title"));
        setTitle(R.string.main_title08);

        vibrationBtn = findViewById(R.id.btn_vibration);
        systemBeepBtn = findViewById(R.id.btn_system_beep);
        customBepBtn = findViewById(R.id.btn_custom_sound);
        btn4 = findViewById(R.id.btn4_sound);

        vibrationBtn.setOnClickListener(this);
        systemBeepBtn.setOnClickListener(this);
        customBepBtn.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v==vibrationBtn){
            Vibrator vib= (Vibrator)getSystemService(VIBRATOR_SERVICE);
            vib.vibrate(1000);
        }else if(v==systemBeepBtn){
            Uri notification  = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
            Ringtone ringtone = RingtoneManager.getRingtone(getApplicationContext(), notification);
            ringtone.play();
        }else if(v==customBepBtn){
            MediaPlayer player = MediaPlayer.create(this, R.raw.fallbackring);
            player.start();
        }else if(v==btn4){
            Vibrator vib=(Vibrator)getSystemService(VIBRATOR_SERVICE);
            vib.vibrate(new  long[]{500,1000,500,1000},-1);
        }
    }





}
