package eladgu.cyclebud2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findViewById(R.id.open_map_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mapI = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(mapI);
            }
        });
    }
}
