package com.twitter.sdk.android.tweetui;

import android.app.Activity;
import android.os.Bundle;
import com.twitter.sdk.android.core.internal.scribe.ScribeItem;
import com.twitter.sdk.android.tweetui.internal.C47077j.C47078a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;

public class PlayerActivity extends Activity {

    /* renamed from: a */
    static final C47032at f120578a = new C47033au(C47029aq.m147040a());

    /* renamed from: b */
    C47093s f120579b;

    public static class PlayerItem implements Serializable {
        public final String callToActionText;
        public final String callToActionUrl;
        public final boolean looping;
        public final boolean showVideoControls;
        public final String url;

        public PlayerItem(String str, boolean z, boolean z2, String str2, String str3) {
            this.url = str;
            this.looping = z;
            this.showVideoControls = z2;
            this.callToActionText = str2;
            this.callToActionUrl = str3;
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, R.anim.dl);
    }

    public void onDestroy() {
        this.f120579b.mo118368c();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        this.f120579b.mo118366b();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f120579b.mo118360a();
    }

    /* renamed from: a */
    private static void m146936a(ScribeItem scribeItem) {
        f120578a.mo118237b(scribeItem);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b0n);
        PlayerItem playerItem = (PlayerItem) getIntent().getSerializableExtra("PLAYER_ITEM");
        this.f120579b = new C47093s(findViewById(16908290), new C47078a() {
            /* renamed from: a */
            public final void mo118173a() {
                PlayerActivity.this.finish();
                PlayerActivity.this.overridePendingTransition(0, R.anim.dl);
            }
        });
        this.f120579b.mo118363a(playerItem);
        m146936a((ScribeItem) getIntent().getSerializableExtra("SCRIBE_ITEM"));
    }
}
