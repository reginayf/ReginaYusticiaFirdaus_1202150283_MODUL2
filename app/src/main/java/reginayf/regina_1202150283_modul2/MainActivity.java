package reginayf.regina_1202150283_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radio);
        textView = findViewById(R.id.text_view_selected);

        Button btn_pesan = findViewById(R.id.btn_pesan);
        btn_pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);


                Intent a = new Intent(MainActivity.this, TakeawayActivity.class);
                startActivity(a);
                Intent b = new Intent(MainActivity.this, DineinActivity.class);
                startActivity(b);
                Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
                finish();
                textView.setText("Your choice: " + radioButton.getText());
            }
        });

//        btn_pesan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int radioId = radioGroup.getCheckedRadioButtonId();
//
//                radioButton = findViewById(radioId);
//
////                Intent a = new Intent(MainActivity.this, TakeawayActivity.class);
////                startActivity(a);
//                Intent b = new Intent(MainActivity.this, DineinActivity.class);
//                startActivity(b);
//                Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//                finish();
//                textView.setText("Your choice: " + radioButton.getText());
//            }
//        });
//
//    }


//    public void checkButton(View v) {
//        int radioId = radioGroup.getCheckedRadioButtonId();
//
//        radioButton = findViewById(radioId);
//
////        Toast.makeText(this, "Selected : " + radioButton.getText(),
////                Toast.LENGTH_SHORT).show();
//
//
//
//        Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_SHORT).show();
//        finish();
//    }
    }
}
