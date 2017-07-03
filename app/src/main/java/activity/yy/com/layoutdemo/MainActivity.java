package activity.yy.com.layoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button frame= (Button) findViewById(R.id.frame);
        Button relative= (Button) findViewById(R.id.relative);
        Button grid= (Button) findViewById(R.id.grid);
        frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,FrameLayout.class);
                startActivity(intent);
            }
        });


        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,RelativeLayout.class);
                startActivity(intent);
            }
        });


        grid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,GridLayout.class);
                startActivity(intent);
            }
        });


    }
}
