package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Bookings extends AppCompatActivity {
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
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookings);
        List();

    }
    public void List(){
        BookingsListAdapter adapter = new BookingsListAdapter(this, nameArray, infoArray, imageArray);
        listView = (ListView)findViewById(R.id.listViewID);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }
}
