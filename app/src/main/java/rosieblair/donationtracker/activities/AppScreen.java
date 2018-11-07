package rosieblair.donationtracker.activities;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import rosieblair.donationtracker.R;

public class AppScreen extends AppCompatActivity {

    private Button locationListButton;
//    private Button viewDatabaseButton;
    private Button searchButton;
    private Button viewMapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_screen);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        pressSearch();
//        pressDB();
        pressViewLocations();
//        viewDB();
        pressViewMap();

    }

    private void pressViewMap() {
        viewMapButton = findViewById(R.id.map);
        viewMapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                readCSVFile();
                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
//                Toast toast = Toast.makeText(getBaseContext(), "Clicked location list!", Toast.LENGTH_SHORT);
//                View toastView = toast.getView();
//                toastView.getBackground().setColorFilter(Color.parseColor("#daeff1"),
//                        PorterDuff.Mode.SRC);
//                toast.show();
            }
        });
    }

    private void pressViewLocations() {
        locationListButton = findViewById(R.id.locListButton);
        locationListButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                readCSVFile();
//                Intent intent = new Intent("edu.gatech.micheyang.pbjdonationtracker.activities.LocationList");
//                startActivity(intent);
                Toast toast = Toast.makeText(getBaseContext(), "Clicked location list!", Toast.LENGTH_SHORT);
                View toastView = toast.getView();
                toastView.getBackground().setColorFilter(Color.parseColor("#daeff1"),
                        PorterDuff.Mode.SRC);
                toast.show();
            }
        });
    }

    private void pressSearch() {
        searchButton = findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SearchScreen.class);
                startActivity(intent);
                Toast toast = Toast.makeText(getBaseContext(), "Clicked Search!", Toast.LENGTH_SHORT);
                View toastView = toast.getView();
                toastView.getBackground().setColorFilter(Color.parseColor("#daeff1"),
                PorterDuff.Mode.SRC);
                toast.show();
            }
        });

    }

    /***
     * The method called when user attempts to log out of application w/ "Logout".
     * After logging out, the user is taken back to the welcome screen. The user
     * is shown a brief pop-up notification that confirms the user has logged out.
     *
     * @param view the selected view
     */
    public void onLogOutPressed(View view) {
        Log.d("Edit", "logged out");
        Intent intent = new Intent("MainActivity");
        startActivity(intent);
        //finish();
        //pop-up message notifying user that logout was successful
        Toast toast = Toast.makeText(getBaseContext(), "Logout successful!",
                Toast.LENGTH_SHORT);
        View toastView = toast.getView();
        //setting the color of notification's background bubble
        toastView.getBackground().setColorFilter(Color.parseColor("#daeff1"),
                PorterDuff.Mode.SRC);
        toast.show();
    }

}
