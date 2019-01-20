package a1708965.brunel.uk.ak.appv1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MessagesListAdapter extends ArrayAdapter {
    private final Activity context;
    private final String[] nameArray;
    private final String[] infoArray;

    public MessagesListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam){
        super(context, R.layout.product_list_row, nameArrayParam);
        this.context= context;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.message_list_row, null,true);


        TextView nameTextField = (TextView) rowView.findViewById(R.id.titleText);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.descText);

        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);

        return rowView;

    };
}
