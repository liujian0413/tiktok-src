package com.facebook;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import com.facebook.internal.C13953v;
import com.facebook.internal.FacebookDialogFragment;
import com.facebook.login.LoginFragment;
import com.facebook.share.internal.DeviceShareDialogFragment;
import com.facebook.share.model.ShareContent;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class FacebookActivity extends FragmentActivity {

    /* renamed from: a */
    public static String f34644a = "PassThrough";

    /* renamed from: c */
    private static String f34645c = "SingleFragment";

    /* renamed from: d */
    private static final String f34646d = "com.facebook.FacebookActivity";

    /* renamed from: b */
    public Fragment f34647b;

    /* renamed from: b */
    private void m38242b() {
        setResult(0, C13953v.m41159a(getIntent(), (Bundle) null, C13953v.m41162a(C13953v.m41173b(getIntent()))));
        finish();
    }

    /* renamed from: a */
    private Fragment m38241a() {
        Intent intent = getIntent();
        C0608j supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo2644a(f34645c);
        if (a != null) {
            return a;
        }
        if ("FacebookDialogFragment".equals(intent.getAction())) {
            FacebookDialogFragment facebookDialogFragment = new FacebookDialogFragment();
            facebookDialogFragment.mRetainInstance = true;
            facebookDialogFragment.show(supportFragmentManager, f34645c);
            return facebookDialogFragment;
        } else if ("DeviceShareDialogFragment".equals(intent.getAction())) {
            DeviceShareDialogFragment deviceShareDialogFragment = new DeviceShareDialogFragment();
            deviceShareDialogFragment.mRetainInstance = true;
            deviceShareDialogFragment.f37435b = (ShareContent) intent.getParcelableExtra(C38347c.f99553h);
            deviceShareDialogFragment.show(supportFragmentManager, f34645c);
            return deviceShareDialogFragment;
        } else {
            LoginFragment loginFragment = new LoginFragment();
            loginFragment.mRetainInstance = true;
            supportFragmentManager.mo2645a().mo2586a(R.id.yd, loginFragment, f34645c).mo2604c();
            return loginFragment;
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f34647b != null) {
            this.f34647b.onConfigurationChanged(configuration);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!C13499h.m39710a()) {
            C13499h.m39703a(getApplicationContext());
        }
        setContentView(R.layout.f124299if);
        if (f34644a.equals(intent.getAction())) {
            m38242b();
        } else {
            this.f34647b = m38241a();
        }
    }
}
