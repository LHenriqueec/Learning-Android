package exercicio.softblue.com.learningandroid;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button button;
    private TextView text;
    private Handler handler = new Handler();

    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.text);
    }

   public void start(View view) {
        button.setEnabled(false);

        handler.post(new Runnable() {
            @Override
            public void run() {
                if(count <= 5) {
                    text.setText(String.valueOf(count));
                    count++;
                    handler.postDelayed(this, 1000);
                } else {
                    text.setText("Finalizado");
                    button.setEnabled(true);
                    count = 0;
                }
            }
        });
   }
}
