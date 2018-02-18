package reginayf.regina_1202150283_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.widget.Toast;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent a = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(a);
                Toast.makeText(SplashActivity.this, "REGINA_1202150283", Toast.LENGTH_SHORT).show();
                finish();
            }
        }, 2500);
//        )
////        Thread thread = new Thread(){
////            @Override
////            public void run() {
////                try {
////                    sleep(4000);
////                } catch (InterruptedException e) {
////                    e.printStackTrace();
////                } finally {
////                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
////                    finish();
//                }
//            }
//        };
    }
}
