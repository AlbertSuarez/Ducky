package hackatupc.ducky;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        initializeView();
    }

    private void initializeView() {
        Button adviceButton = (Button) findViewById(R.id.advice_button);
    }

}
