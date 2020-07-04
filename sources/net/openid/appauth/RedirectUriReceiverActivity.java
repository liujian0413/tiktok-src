package net.openid.appauth;

import android.app.Activity;
import android.os.Bundle;

public class RedirectUriReceiverActivity extends Activity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(AuthorizationManagementActivity.m149645a(this, getIntent().getData()));
        finish();
    }
}
