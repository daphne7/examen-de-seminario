package daphne.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter implements View.OnClickListener {
    private ArrayList<StructList> list;
    private Context context;
    public CustomAdapter (Context context, ArrayList<StructList> list) {
        this.list = list;
        this.context = context;
    }
    @Override
    public int getCount() {
        return this.list.size();
    }

    @Override
    public Object getItem(int i) {
        return this.list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(this.context).inflate(R.layout.resource, null);
        }
        ImageView imageView  = view.findViewById(R.id.gallery);
        TextView price = view.findViewById(R.id.price);
        TextView title = view.findViewById(R.id.title);
        TextView description = view.findViewById(R.id.description);
        Button enterbtn = view.findViewById(R.id.button);
        Glide.with(this.context).load(this.list.get(i).getPrimary_photo()).centerCrop().into(imageView);
        price.setText(this.list.get(i).getListPrice().toString());
        title.setText(this.list.get(i).getDisclaimer());
        description.setText(this.list.get(i).getDescription());
        enterbtn.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {

    }
}
