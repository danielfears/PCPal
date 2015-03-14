package danieljfears.devproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainScreen extends ActionBarActivity {

    private ImageButton componentbutton;
    private ImageButton builderchecklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        componentbutton = (ImageButton) findViewById(R.id.componentbutton);

        componentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, component_guide.class);
                startActivity(i);

            };
        });

        builderchecklist = (ImageButton) findViewById(R.id.builderchecklist);

        builderchecklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, builder_checklist.class);
                startActivity(i);

            };
        });
    }
}