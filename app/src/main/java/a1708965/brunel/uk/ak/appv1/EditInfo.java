package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EditInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_info);
        defButton();
        dispInfo();
    }

    private void dispInfo(){

        SharedPreferences sp = getSharedPreferences("login", MODE_PRIVATE);

        TextView name = (TextView)findViewById(R.id.editName);
        TextView email = (TextView)findViewById(R.id.editEmail);
        TextView phone = (TextView)findViewById(R.id.editPhone);
        TextView dob = (TextView)findViewById(R.id.editDOB);
        name.setText(sp.getString("Name", ""));
        email.setText(sp.getString("Email",""));
        phone.setText(sp.getString("Number",""));
        dob.setText(sp.getString("DOB",""));
    }
    private void defButton(){
        Button submit = (Button)findViewById(R.id.Submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateInfo();
                Intent i = new Intent(EditInfo.this, UserAccount.class);
                startActivity(i);
            }
        });
    }
    public void updateInfo(){
        TextView name = (TextView)findViewById(R.id.editName);
        TextView email = (TextView)findViewById(R.id.editEmail);
        TextView phone = (TextView)findViewById(R.id.editPhone);
        TextView dob = (TextView)findViewById(R.id.editDOB);
        SharedPreferences sp = getSharedPreferences("login", MODE_PRIVATE);
        SharedPreferences.Editor e = sp.edit();
        e.putString("Name", name.getText().toString()).apply();
        e.putString("Email", email.getText().toString()).apply();
        e.putString("DOB", dob.getText().toString()).apply();
        e.putString("Number", phone.getText().toString()).apply();
        e.commit();
    }
}
