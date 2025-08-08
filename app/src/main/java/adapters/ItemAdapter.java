package adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.makeupproject.R;

import java.util.ArrayList;

import modules.Item;

public class ItemAdapter extends BaseAdapter {
    Context context ;
    ArrayList<Item> itemArrayList = new ArrayList<>();
    LayoutInflater inflater;

    public ItemAdapter(Context context, ArrayList<Item> itemArrayList) {
        this.context = context;
        this.itemArrayList = itemArrayList;
        inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return itemArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return itemArrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return itemArrayList.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View root = inflater.inflate(R.layout.cart_design,null);
        ImageView imageItem= root.findViewById(R.id.imageItem);
        TextView textItem = root.findViewById(R.id.titleItem);
        RatingBar rating= root.findViewById(R.id.rating);
        TextView price = root.findViewById(R.id.price);
        TextView pricerr = root.findViewById(R.id.pricerr);
        imageItem.setImageResource(itemArrayList.get(position).getImage());
        textItem.setText(itemArrayList.get(position).getName());
        rating.setRating(itemArrayList.get(position).getRating());
        price.setText(itemArrayList.get(position).getPrice()+"");
        pricerr.setText(itemArrayList.get(position).getPricerr()+"");
        return root;
    }
}
