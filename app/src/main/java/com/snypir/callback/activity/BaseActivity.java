package com.snypir.callback.activity;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;
import com.snypir.callback.App_;

/**
 * Created by stepangoncarov on 09/06/14.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        actionBarInit();
    }

    protected void actionBarInit(){
        ActionBar ab = getActionBar();
        if (ab != null){
            ab.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Tracker t = ((App_) getApplication()).getTracker();
        t.setScreenName(getClass().getSimpleName());

        // Send a screen view.
        t.send(new HitBuilders.AppViewBuilder().build());
    }
}
