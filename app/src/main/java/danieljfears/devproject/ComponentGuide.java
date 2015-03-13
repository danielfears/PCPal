package danieljfears.devproject;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class ComponentGuide extends ActionBarActivity {

    private GridView gridView;
    private List<String> components;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_component_guide);

        gridView = (GridView)findViewById(R.id.componentGridView);

        components = new ArrayList<String>();

        components.add("drawable/cddrive");
        components.add("drawable/cooler");
        components.add("drawable/cpu");
        components.add("drawable/fans");
        components.add("drawable/gpu");
        components.add("drawable/harddrive");
        components.add("drawable/memory");
        components.add("drawable/motherboard");
        components.add("drawable/operatingsystem");
        components.add("drawable/pccase");
        components.add("drawable/powersupply");
        components.add("drawable/satacable");

        ComponentAdapter adapter = new ComponentAdapter(ComponentGuide.this);
        gridView.setAdapter(adapter);
    }

    private class ComponentAdapter extends BaseAdapter {
        private Context mContext;

        public ComponentAdapter(Context c) {
            mContext = c;
        }

        public int getCount() {
            return components.size();
        }

        public Object getItem(int position) {
            return null;
        }

        public long getItemId(int position) {
            return 0;
        }

        // create a new ImageView for each item referenced by the Adapter
        public View getView(int position, View convertView, ViewGroup parent) {


            if (convertView == null) {
                convertView = getLayoutInflater().inflate(
                        R.layout.cell_component, null);
            }

            ImageView imgComponent = (ImageView)convertView.findViewById(R.id.imgComponent);

            String id = components.get(position);

            int imageResource = getResources().getIdentifier(id, null, getPackageName());

            imgComponent.setImageResource(imageResource);

            return convertView;
        }//end get view


    }//end top image adapter
}


