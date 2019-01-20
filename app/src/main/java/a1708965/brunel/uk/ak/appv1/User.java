package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class User extends AppCompatActivity {
    ListView listView;
    String[] nameArray = {"Listing","Listing","Listing","Listing","Listing","Listing" };

    String[] infoArray = {
            "Listing info",
            "Listing info",
            "Listing info",
            "Listing info",
            "Listing info",
            "Listing info"
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
        defButtons();
    }


    private void defButtons(){
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

        ListingsListAdapter adapter = new ListingsListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView)findViewById(R.id.listViewID);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(User.this, ListingPage.class);
                String message = nameArray[position];
                intent.putExtra("message", message);
                startActivity(intent);
            }
        });
    }
}
