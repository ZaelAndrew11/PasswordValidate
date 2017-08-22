package cl.aguzman.passwordvalidate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements ValidateCallback{

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.inputEt);
        Button button = (Button) findViewById(R.id.resultBtn);
        textView = (TextView) findViewById(R.id.validationTv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = editText.getText().toString().trim();
                new ValidationPassword(MainActivity.this).passwordValidate(value);
            }
        });
    }

    @Override
    public void success(String val) {
        textView.setText("Contraseña Valida :)");
    }

    @Override
    public void inputEmpty() {
        textView.setText("Contraseña Invalida :(");
    }
}
