package hackatupc.ducky.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import hackatupc.ducky.R;
import hackatupc.ducky.utils.Utils;

public class MainActivity extends Activity {

    public String[] textArray = {
            "EAT PIZZA"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initializeView();
    }

    private void initializeView() {
        final ImageView duck = (ImageView) findViewById(R.id.duckPhoto);
        final TextView text = (TextView) findViewById(R.id.text_duck);

        Button adviceButton = (Button) findViewById(R.id.advice_button);
        adviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean change = false;
                for (int i = 0; i < 1000000000; i++) {
                    if (i % 10000 == 0) {
                        if (!change) {duck.setImageResource(R.drawable.duck_little_speak); change = true;}
                        else {duck.setImageResource(R.drawable.duck_little); change = false;}
                    }
                }
                duck.setImageResource(R.drawable.duck_little);
                text.setText(textArray[Utils.randomInt() % textArray.length]);
            }
        });
    }

}
