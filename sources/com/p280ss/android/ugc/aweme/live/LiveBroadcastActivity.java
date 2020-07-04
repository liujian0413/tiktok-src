package com.p280ss.android.ugc.aweme.live;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.p022v4.app.C0633q;
import com.bytedance.android.livesdkapi.depend.model.p445a.C9348c;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.sdk.p899a.C20097a;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.greenrobot.eventbus.C7709l;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBroadcastActivity */
public class LiveBroadcastActivity extends BaseLiveSdkActivity {

    /* renamed from: a */
    C9348c f84549a = new C9348c() {
        /* renamed from: a */
        public final void mo22811a(BroadcastReceiver broadcastReceiver) {
            LiveBroadcastActivity.this.unregisterReceiver(broadcastReceiver);
        }

        /* renamed from: a */
        public final void mo22812a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            LiveBroadcastActivity.this.registerReceiver(broadcastReceiver, intentFilter);
        }
    };

    public boolean isRegisterEventBus() {
        return true;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        this.f84549a = null;
        super.onDestroy();
        C32430a.m105068e().mo22020f().mo21101b(hashCode());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    @C7709l
    public void onEvent(C20097a aVar) {
        if (C6399b.m19944t() && C32430a.m105068e() != null) {
            C32430a.m105068e().mo22022h().mo22000b();
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", true);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        super.onCreate(bundle);
        setContentView((int) R.layout.ai);
        if (getWindow() != null) {
            getWindow().addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = getIntent().getExtras();
        }
        C32430a.m105068e().mo22020f().mo21100a(hashCode(), this);
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2585a((int) R.id.aoy, C32430a.m105068e().mo22002a(this.f84549a, bundle2));
        a.mo2604c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
    }
}
