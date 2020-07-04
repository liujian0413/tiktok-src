package com.twitter.sdk.android.core.identity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.twitter.sdk.android.core.C46969q;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.internal.C46892r;
import com.twitter.sdk.android.core.internal.oauth.OAuth1aService;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class OAuthActivity extends Activity implements C46840a {

    /* renamed from: a */
    C46837c f120125a;

    /* renamed from: b */
    private ProgressBar f120126b;

    /* renamed from: c */
    private WebView f120127c;

    public void onBackPressed() {
        this.f120125a.mo117939a(0, new TwitterAuthException("Authorization failed, request was canceled."));
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (this.f120126b.getVisibility() == 0) {
            bundle.putBoolean("progress", true);
        }
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        setContentView(R.layout.b0j);
        this.f120126b = (ProgressBar) findViewById(R.id.e5s);
        this.f120127c = (WebView) findViewById(R.id.e67);
        int i = 0;
        if (bundle != null) {
            z = bundle.getBoolean("progress", false);
        } else {
            z = true;
        }
        ProgressBar progressBar = this.f120126b;
        if (!z) {
            i = 8;
        }
        progressBar.setVisibility(i);
        C46837c cVar = new C46837c(this.f120126b, this.f120127c, (TwitterAuthConfig) getIntent().getParcelableExtra("auth_config"), new OAuth1aService(C46969q.m146847a(), new C46892r()), this);
        this.f120125a = cVar;
        this.f120125a.mo117938a();
    }

    /* renamed from: a */
    public final void mo117918a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }
}
