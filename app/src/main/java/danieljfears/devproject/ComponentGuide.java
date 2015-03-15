package danieljfears.devproject;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.text.ParsePosition;
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

        components = new ArrayList<>();

        components.add("drawable/pccase");
        components.add("drawable/motherboard");
        components.add("drawable/cpu");
        components.add("drawable/cooler");
        components.add("drawable/memory");
        components.add("drawable/powersupply");
        components.add("drawable/harddrive");
        components.add("drawable/gpu");
        components.add("drawable/cddrive");
        components.add("drawable/operatingsystem");
        components.add("drawable/satacable");
        components.add("drawable/fans");

        ComponentAdapter adapter = new ComponentAdapter(ComponentGuide.this);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(components.get(position) == "drawable/pccase"){
                    showCasePopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/motherboard"){
                    showMotherboardPopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/cpu"){
                    showCpuPopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/cooler"){
                    showCoolerPopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/memory"){
                    showMemoryPopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/powersupply"){
                    showPowersupplyPopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/harddrive"){
                    showHarddrivePopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/gpu"){
                    showGpuPopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/cddrive"){
                    showCddrivePopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/operatingsystem"){
                    showOperatingsystemPopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/satacable"){
                    showSatacablePopup(ComponentGuide.this,null);
                }
                else if(components.get(position) == "drawable/fans"){
                    showFansPopup(ComponentGuide.this,null);
                }

                Toast.makeText(ComponentGuide.this, components.get(position), Toast.LENGTH_SHORT).show();

            }
        });

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

    // The method that displays the popup.
    private void showCasePopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_case, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showMotherboardPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_motherboard, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showCpuPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_cpu, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showCoolerPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_cooler, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showMemoryPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_memory, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showPowersupplyPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_psu, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showHarddrivePopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_harddrive, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showGpuPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_gpu, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showCddrivePopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_cddrive, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showOperatingsystemPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_os, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showSatacablePopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_sata, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }

    // The method that displays the popup.
    private void showFansPopup(final Activity context, Point p) {
        int popupWidth = 600;
        int popupHeight = 850;

        // Inflate the popup_layout.xml
        RelativeLayout viewGroup = (RelativeLayout) context.findViewById(R.id.popup);
        LayoutInflater layoutInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = layoutInflater.inflate(R.layout.popup_fans, viewGroup);


        // Creating the PopupWindow
        final PopupWindow popup = new PopupWindow(context);
        popup.setContentView(layout);
        popup.setWidth(popupWidth);
        popup.setHeight(popupHeight);
        popup.setFocusable(true);

        // Displaying the popup at the specified location, + offsets.
        popup.showAtLocation(layout, Gravity.CENTER, 0, 100);
    }
}


