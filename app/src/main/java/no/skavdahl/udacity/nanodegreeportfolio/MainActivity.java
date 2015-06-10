package no.skavdahl.udacity.nanodegreeportfolio;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

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

    /**
     * Launches the Spotify Streamer app. This method is called when the user clicks the
     * corresponding button on the screen.
     *
     * @param view The button view that is clicked.
     */
    public void launchSpotifyStreamer(View view) {
        showPendingAppToast("This button will launch the Spotify Streamer app.");
    }

    /**
     * Launches the Scores app. This method is called when the user clicks the corresponding
     * button on the screen.
     *
     * @param view The button view that is clicked.
     */
    public void launchScoresApp(View view) {
        showPendingAppToast("This button will launch the Scores app.");
    }

    /**
     * Launches the Library app. This method is called when the user clicks the corresponding
     * button on the screen.
     *
     * @param view The button view that is clicked.
     */
    public void launchLibraryApp(View view) {
        showPendingAppToast("This button will launch the Library app.");
    }

    /**
     * Launches the Build it Bigger app. This method is called when the user clicks the
     * corresponding button on the screen.
     *
     * @param view The button view that is clicked.
     */
    public void launchBuildItBigger(View view) {
        showPendingAppToast("This button will launch the Build it Bigger app.");
    }

    /**
     * Launches the XYZ Reader app. This method is called when the user clicks the corresponding
     * button on the screen.
     *
     * @param view The button view that is clicked.
     */
    public void launchXYZReader(View view) {
        showPendingAppToast("This button will launch the XYZ Reader app.");
    }

    /**
     * Launches the Capstone project app. This method is called when the user clicks the
     * corresponding button on the screen.
     *
     * @param view The button view that is clicked.
     */
    public void launchCapstoneProject(View view) {
        showPendingAppToast("This button will launch the Capstone Project app.");
    }

    /**
     * Displays a toast with the given text message.
     *
     * @param text The text to display in the toast.
     */
    private void showPendingAppToast(CharSequence text) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        // other customization, i.e. positioning
        toast.show();
    }
}
