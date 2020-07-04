package com.twitter.sdk.android.tweetcomposer;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.twitter.sdk.android.core.C46972t;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class ComposerActivity extends Activity {

    /* renamed from: a */
    private C46980a f120528a;

    /* renamed from: com.twitter.sdk.android.tweetcomposer.ComposerActivity$a */
    interface C46974a {
        /* renamed from: a */
        void mo118130a();
    }

    /* renamed from: com.twitter.sdk.android.tweetcomposer.ComposerActivity$b */
    class C46975b implements C46974a {
        /* renamed from: a */
        public final void mo118130a() {
            ComposerActivity.this.finish();
        }

        C46975b() {
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.f120528a.mo118152a();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        C46972t tVar = new C46972t((TwitterAuthToken) intent.getParcelableExtra("EXTRA_USER_TOKEN"), -1, "");
        Uri uri = (Uri) intent.getParcelableExtra("EXTRA_IMAGE_URI");
        String stringExtra = intent.getStringExtra("EXTRA_TEXT");
        String stringExtra2 = intent.getStringExtra("EXTRA_HASHTAGS");
        setTheme(intent.getIntExtra("EXTRA_THEME", R.style.fp));
        setContentView(R.layout.b0i);
        C46980a aVar = new C46980a((ComposerView) findViewById(R.id.e5j), tVar, uri, stringExtra, stringExtra2, new C46975b());
        this.f120528a = aVar;
    }
}
