package bsu.mmf.kaminski.student_info;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView orientationView;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        this.changeOrientation(newConfig.orientation);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.orientationView = (TextView) this.findViewById(R.id.orientation);

        int orientation = this.getResources().getConfiguration().orientation;

        this.changeOrientation(orientation);
    }

    private void changeOrientation(int orientation) {
        if(orientation == Configuration.ORIENTATION_PORTRAIT) {
            this.orientationView.setText(this.getResources().getString(R.string.portrait));
        }
        else if(orientation == Configuration.ORIENTATION_LANDSCAPE) {
            this.orientationView.setText(this.getResources().getString(R.string.landscape));
        }
    }
}