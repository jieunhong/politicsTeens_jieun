package kr.hs.e_mirim.politicsteens;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by User on 2017-06-21.
 */

public class FindYourTypeActivity extends AppCompatActivity implements View.OnClickListener{
    Button goHome;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findyourtype);
        goHome = (Button)findViewById(R.id.goHome);
        goHome.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.goHome){
            startActivity(new Intent(FindYourTypeActivity.this, MainActivity.class));
        }
    }
}
