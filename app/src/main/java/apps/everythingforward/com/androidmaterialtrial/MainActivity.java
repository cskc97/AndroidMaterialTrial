package apps.everythingforward.com.androidmaterialtrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.gc.materialdesign.views.Button;
import com.skyfishjy.library.RippleBackground;
import com.vstechlab.easyfonts.EasyFonts;

import org.w3c.dom.Text;

import tyrantgit.explosionfield.ExplosionField;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RippleBackground rippleBackground=(RippleBackground)findViewById(R.id.content);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rippleBackground.startRippleAnimation();
            }
        });
        button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(rippleBackground.isRippleAnimationRunning()) {
                   rippleBackground.stopRippleAnimation();
               }
                ExplosionField explosionField=new ExplosionField(getApplicationContext());
                explosionField.explode(button);
                startActivity(new Intent(MainActivity.this,Main2Activity.class));

            }
        });

        textView = (TextView)findViewById(R.id.textView);
        textView.setTypeface(EasyFonts.captureIt(this));




    }
}
