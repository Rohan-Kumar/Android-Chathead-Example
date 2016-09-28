package dark.sail.com.chatheadtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
          final Intent mainIntent = new Intent(Intent.ACTION_MAIN, null);
          mainIntent.addCategory(Intent.CATEGORY_LAUNCHER);
          final List pkgAppsList = context.getPackageManager().queryIntentActivities( mainIntent, 0);
*/
    }

    public void stop(View view) {
        stopService(new Intent(MainActivity.this,ChatHeadService.class));
    }

    public void start(View view) {
        startService(new Intent(MainActivity.this,ChatHeadService.class));
    }
}
