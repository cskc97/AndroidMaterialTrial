package apps.everythingforward.com.androidmaterialtrial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gc.materialdesign.views.Button;

public class MainActivity extends AppCompatActivity {

    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button)findViewById(R.id.button);


    }
}
