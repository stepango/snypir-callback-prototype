package com.snypir.callback.activity;

import android.app.Fragment;

import com.snypir.callback.R;

import org.androidannotations.annotations.EActivity;

/**
 * Created by stepangoncarov on 27/05/14.
 */
@EActivity(R.layout.ac_search)
public class SearchActivity extends BaseActivity {
    @Override
    public Fragment getBaseFragment() {
        return null;
    }
}
