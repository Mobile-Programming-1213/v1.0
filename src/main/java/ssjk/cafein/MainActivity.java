package ssjk.cafein;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_toCoffee = (Button) findViewById(R.id. btn_toCoffee);


        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id. btn_toCoffee:
                        Intent intent1 = new Intent(MainActivity.this, CoffeeActivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        };

        btn_toCoffee.setOnClickListener(listener);



    }


}
