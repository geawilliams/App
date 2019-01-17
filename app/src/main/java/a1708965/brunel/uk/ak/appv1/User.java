package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class User extends AppCompatActivity {
    ListView listView;
    String[] nameArray = {"Octopus","Pig","Sheep","Rabbit","Snake","Spider" };

    String[] infoArray = {
            "8 tentacled monster",
            "Delicious in rolls",
            "Great for jumpers",
            "Nice in a stew",
            "Great for shoes",
            "Scary."
    };

    Integer[] imageArray = {R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_foreground};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final ImageButton filter = findViewById(R.id.filterID);
        filter.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(User.this, FilterRes.class);
                startActivity(intent);
            }
        });
        final Button toacc = findViewById(R.id.account);

        toacc.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(User.this, UserAccount.class);
                startActivity(intent);
            }
        });

        CustListAdapt adapter = new CustListAdapt(this, nameArray, infoArray, imageArray);
        listView = (ListView)findViewById(R.id.listViewID);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(User.this, ListingPage.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }
        });
    }
}
