package a1708965.brunel.uk.ak.appv1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ListingsListAdapter extends ArrayAdapter {

    private final Activity context;
    private final Integer[] imageIDarray;
    private final String[] nameArray;
    private final String[] infoArray;

    public ListingsListAdapter(Activity context, String[] nameArrayParam, String[] infoArrayParam, Integer[] imageArrayParam){
        super(context, R.layout.product_list_row, nameArrayParam);
        this.context= context;
        this.imageIDarray = imageArrayParam;
        this.nameArray = nameArrayParam;
        this.infoArray = infoArrayParam;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.product_list_row, null,true);


        TextView nameTextField = (TextView) rowView.findViewById(R.id.titleText);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.descText);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageicon);

        nameTextField.setText(nameArray[position]);
        infoTextField.setText(infoArray[position]);
        imageView.setImageResource(imageIDarray[position]);

        return rowView;

    };

}
