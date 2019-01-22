package a1708965.brunel.uk.ak.appv1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class FilterRes extends AppCompatActivity {
    private Boolean[] filters = {false,false,false,false,false};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter_res);

        defButtons();
    }

    private void defButtons(){
        Button filter = findViewById(R.id.bFilter);
        filter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FilterRes.this, User.class);
                intent.putExtra("filter", filters);
                startActivity(intent);
            }
        });
        ToggleButton leasure = findViewById(R.id.cLeasure);
        leasure.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filters[0] = !filters[0];
            }
        });
        ToggleButton lifestyle = findViewById(R.id.cLifestyle);
        lifestyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filters[1] = !filters[1];
            }
        });
        ToggleButton active = findViewById(R.id.cActive);
        active.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filters[2] = !filters[2];
            }
        });
        ToggleButton foodandd = findViewById(R.id.cFood);
        foodandd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filters[3] = !filters[3];
            }
        });
        ToggleButton group = findViewById(R.id.cGroup);
        group.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filters[4] = !filters[4];
            }
        });
    }
}
