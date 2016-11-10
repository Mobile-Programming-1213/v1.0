package ssjk.cafein;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 장소영 on 2016-11-08.
 */
public class CoffeeActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee);

        Button btn_toCafe = (Button) findViewById(R.id. btn_toCafe);


        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                switch (v.getId()){
                    case R.id. btn_toCafe:
                        finish();
                        break;
                }
            }
        };

        btn_toCafe.setOnClickListener(listener);





    }
}
