package com.p280ss.android.ugc.aweme.live;

import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9345a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity */
public class LiveBgBroadcastActivity extends BaseLiveSdkActivity {

    /* renamed from: a */
    private C9345a f84546a;

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        if (this.f84546a != null) {
            this.f84546a.mo8976a();
        }
        super.finish();
    }

    public void onBackPressed() {
        if (!this.f84546a.mo8981b()) {
            super.onBackPressed();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C32430a.m105068e().mo22020f().mo21101b(hashCode());
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ai);
        if (getWindow() != null) {
            getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = getIntent().getExtras();
        }
        C0633q a = getSupportFragmentManager().mo2645a();
        C32430a.m105068e().mo22020f().mo21100a(hashCode(), this);
        this.f84546a = C32430a.m105068e().mo22005a(bundle2);
        a.mo2585a((int) R.id.aoy, (Fragment) this.f84546a);
        a.mo2604c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", false);
    }
}
