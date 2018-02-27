package exercicio.softblue.com.learningandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends Activity {

    private EditText edtName;
    private RadioButton rdMale, rdFamale;
    private TextView txtName, txtGender, txtNameValue, txtGenderValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edt_name);
        rdMale = (RadioButton) findViewById(R.id.rd_male);
        rdFamale = (RadioButton) findViewById(R.id.rd_famale);
        txtName = (TextView) findViewById(R.id.txt_name);
        txtGender = (TextView) findViewById(R.id.txt_gender);
        txtNameValue = (TextView) findViewById(R.id.txt_name_value);
        txtGenderValue = (TextView) findViewById(R.id.txt_gender_value);
    }

    public void show(View view) {
        String name = edtName.getText().toString();
        name = name.length() == 0 ? "Sem nome" : name;
        String gender = rdMale.isChecked() ? "Masculino" : rdFamale.isChecked() ? "Feminino" : "Inexistente";

        txtNameValue.setText(name);
        txtGenderValue.setText(gender);
        txtName.setVisibility(View.VISIBLE);
        txtGender.setVisibility(View.VISIBLE);
    }

    public void clear(View view) {
        txtNameValue.setText("");
        txtGenderValue.setText("");

        edtName.setText("");
        rdMale.setChecked(false);
        rdFamale.setChecked(false);
        txtName.setVisibility(View.INVISIBLE);
        txtGender.setVisibility(View.INVISIBLE);
    }
}
