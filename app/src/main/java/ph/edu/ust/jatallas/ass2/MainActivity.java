package ph.edu.ust.jatallas.ass2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button result = (Button) findViewById(R.id.result);
        final EditText num1 = (EditText) findViewById(R.id.num1);
        final EditText num2 = (EditText) findViewById(R.id.num2);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final TextView textViewResult = (TextView) findViewById(R.id.textViewResult);
                int n = Integer.parseInt(num1.getText().toString());
                int m = Integer.parseInt(num2.getText().toString());

                if (n > m){
                        textViewResult.setText(n + " is greater than " + m);
                    }
                    else if (n == m) {
                    textViewResult.setText(n + " is equal to " + m);
                }
                else if (n < m){
                    textViewResult.setText(n + " is less than " + m);
                }
            }
        });

    }
}
