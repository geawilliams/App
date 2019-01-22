package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class UserAccount extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);
        defButton();
        dispInfo();
    }
    private void dispInfo(){

        SharedPreferences sp = getSharedPreferences("login", MODE_PRIVATE);

        TextView name = (TextView)findViewById(R.id.nameTV);
        TextView email = (TextView)findViewById(R.id.emailTV);
        TextView phone = (TextView)findViewById(R.id.phoneTV);
        TextView dob = (TextView)findViewById(R.id.dobTV);
        name.setText(sp.getString("Name", ""));
        email.setText(sp.getString("Email",""));
        phone.setText(sp.getString("Number",""));
        dob.setText(sp.getString("DOB",""));
    }
    private void defButton(){
        Button gtbookings = (Button)findViewById(R.id.gtBooking);
        gtbookings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserAccount.this, Bookings.class);
                startActivity(i);
            }
        });


        ImageButton back = (ImageButton)findViewById(R.id.backBtn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(UserAccount.this, User.class);
                startActivity(i);
            }
        });

        Button messages = (Button) findViewById(R.id.gotoMessages);
        messages.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(UserAccount.this, ViewMessages.class);
                startActivity(intent);
            }
        });
        ImageButton editInfo = (ImageButton) findViewById(R.id.editInfo);
        editInfo.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(UserAccount.this, EditInfo.class);
                startActivity(intent);
            }
        });
    }
}
