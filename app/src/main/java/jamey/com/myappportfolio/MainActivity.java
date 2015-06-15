package jamey.com.myappportfolio;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void spotifyStreamer(View view){
        Toast.makeText(getApplication(), "This button will launch my spotify streamer app!", Toast.LENGTH_SHORT).show();
    }

    public void scoresApp(View view){
        Toast.makeText(getApplication(),"This button will launch my scores app!",Toast.LENGTH_SHORT).show();
    }

    public void libraryApp(View view){
        Toast.makeText(getApplication(),"This button will launch my library app!",Toast.LENGTH_SHORT).show();
    }

    public void buildItBigger(View view){
        Toast.makeText(getApplication(),"This button will launch my build it bigger app!",Toast.LENGTH_SHORT).show();
    }

    public void baconReader(View view){
        Toast.makeText(getApplication(),"This button will launch my bacon reader app!",Toast.LENGTH_SHORT).show();
    }

    public void capstoneApp(View view){
        Toast.makeText(getApplication(),"This button will launch my capstone app!",Toast.LENGTH_SHORT).show();
    }





    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
