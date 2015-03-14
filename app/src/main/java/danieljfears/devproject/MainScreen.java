package danieljfears.devproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainScreen extends ActionBarActivity {

    private ImageButton componentbutton;
    private ImageButton builderchecklist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        componentbutton = (ImageButton) findViewById(R.id.componentbutton);

        componentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, ComponentGuide.class);
                startActivity(i);

            };
        });

        builderchecklist = (ImageButton) findViewById(R.id.builderchecklist);

        builderchecklist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainScreen.this, BuildChecklist.class);
                startActivity(i);

            };
        });
    }
}