package danieljfears.devproject;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainScreen extends ActionBarActivity {

    private ImageButton componentbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        componentbutton = (ImageButton) findViewById(R.id.componentbutton);

        componentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View view) {
                Toast.makeText(MainScreen.this, "Toast!", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
