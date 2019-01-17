package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static EditText email, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button login = findViewById(R.id.button);
        final Button creAcc = findViewById(R.id.button2);




        login.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                email = (EditText)findViewById(R.id.editText);
                password = (EditText)findViewById(R.id.editText2);


                if (email.getText().toString().equals("user") &&
                        password.getText().toString().equals("pass")){
                    Toast.makeText(MainActivity.this,"Username and password is correct",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, User.class);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(MainActivity.this,"Username and password is NOT correct",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        creAcc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, CreateAccount.class);
                startActivity(intent);
            }
        });

    }

}