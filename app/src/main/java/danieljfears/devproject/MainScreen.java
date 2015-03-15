package danieljfears.devproject;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

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

            }
        });

        TextView btn=(TextView) findViewById(R.id.copyright);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainScreen.this, "Three Rings for the Elven-kings under the sky,\n" +
                                "Seven for the Dwarf-lords in halls of stone,\n" +
                                "Nine for Mortal Men, doomed to die,\n" +
                                "One for the Dark Lord on his dark throne\n" +
                                "In the Land of Mordor where the Shadows lie.\n" +
                                "One Ring to rule them all, One Ring to find them,\n" +
                                "One Ring to bring them all and in the darkness bind them.\n" +
                                "In the Land of Mordor where the Shadows lie",
                        Toast.LENGTH_LONG).show();
            }
        });

    }
}