package exercicio.softblue.com.learningandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Button button;
    private TextView text;

    private CounterTask task;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);

        button = (Button) findViewById(R.id.button);
        text = (TextView) findViewById(R.id.text);

        task = new CounterTask(button, text);
    }

    public void start(View view) {
        task.execute(10);
    }
}
