package com.facebook.react.devsupport;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class DevSettingsActivity extends PreferenceActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(getApplication().getResources().getString(R.string.xt));
        addPreferencesFromResource(R.xml.e);
    }
}
