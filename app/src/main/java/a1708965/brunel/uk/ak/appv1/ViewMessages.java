package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class ViewMessages extends AppCompatActivity {
    ListView listView;
    MessageConstructor mes = new MessageConstructor(1,1,"ffdfdfs", "32-4-05");
    String[] nameArray = {"Message","Message","Message","Message","Message","Message" };

    String[] infoArray = {
            "Message details",
            "Message details",
            "Message details",
            "Message details",
            "Message details",
            "Message details"
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
        setContentView(R.layout.activity_view_messages);
        MessagesListAdapter adapter = new MessagesListAdapter(this, nameArray, infoArray);
        listView = (ListView) findViewById(R.id.MessagesList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ViewMessages.this, ListingPage.class);
                String message = nameArray[position];
                intent.putExtra("animal", message);
                startActivity(intent);
            }
        });
    }
}
