/**
 *
 */
package com.imherolddev.dailylogkeeper.settings;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.imherolddev.dailylogkeeper.R;

/**
 * @author imherolddev
 */
public class SettingsActivity extends ActionBarActivity {

    /**
     * No arg constructor
     */
    public SettingsActivity() {
        // Empty
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Toolbar toolbar = (Toolbar) findViewById(R.id.prefToolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SettingsActivity.this.finish();
            }
        });

        getFragmentManager().beginTransaction()
                .replace(R.id.prefs, new SettingsFragment()).commit();

    }

}
