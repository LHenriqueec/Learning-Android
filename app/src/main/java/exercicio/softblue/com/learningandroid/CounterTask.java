package exercicio.softblue.com.learningandroid;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by luiz on 25/02/18.
 */

public class CounterTask extends AsyncTask<Integer, Integer, Void> {

    private Button button;
    private TextView text;

    public CounterTask(Button button, TextView text) {
        this.button = button;
        this.text = text;
    }

    @Override
    protected Void doInBackground(Integer... integers) {
        int count = integers[0];
        for(int i = 1; i <= count; i++) {
            publishProgress(i);
            SystemClock.sleep(1000);
        }
        return null;
    }

    @Override
    protected void onPreExecute() {
        button.setEnabled(false);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        text.setText("Finalizado");
        button.setEnabled(true);
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        text.setText(String.valueOf(values[0]));
    }
}
