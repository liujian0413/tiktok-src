package com.p280ss.android.ugc.aweme.live;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.GenericLifecycleObserver;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.C0633q;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.p452h.C9413b;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.story.live.C41989d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.live.LiveFeedActivity */
public class LiveFeedActivity extends BaseLiveSdkActivity implements C9413b {

    /* renamed from: a */
    TextTitleBar f84567a;

    /* renamed from: b */
    DmtLoadingLayout f84568b;

    /* renamed from: c */
    private LifecycleLog f84569c;

    /* renamed from: com.ss.android.ugc.aweme.live.LiveFeedActivity$LifecycleLog */
    static final class LifecycleLog implements GenericLifecycleObserver {

        /* renamed from: a */
        long f84572a;

        /* renamed from: b */
        long f84573b;

        LifecycleLog(C0043i iVar) {
            iVar.getLifecycle().mo55a(this);
        }

        /* renamed from: a */
        public final void mo44a(C0043i iVar, Event event) {
            switch (event) {
                case ON_RESUME:
                    this.f84572a = SystemClock.elapsedRealtime();
                    return;
                case ON_PAUSE:
                    this.f84573b = SystemClock.elapsedRealtime();
                    C6907h.m21524a("livesdk_live_feed_stay_time", (Map) C22984d.m75611a().mo59973a("enter_from_merge", "live_merge").mo59971a("duration", this.f84573b - this.f84572a).f60753a);
                    return;
                case ON_DESTROY:
                    iVar.getLifecycle().mo56b(this);
                    break;
            }
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo83650a() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("gd_label");
            if (!TextUtils.isEmpty(stringExtra)) {
                C41989d.m133492b("inner_ad", stringExtra);
            }
        }
    }

    public void finish() {
        super.finish();
        if (isTaskRoot()) {
            C7195s.m22438a().mo18679a((Activity) this, "aweme://main");
        }
    }

    public void setStatusBarColor() {
        if (C6399b.m19944t()) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).setCustomStatusBarInLayout(this);
        } else {
            C10994a.m32205a((Activity) this);
        }
    }

    /* renamed from: c */
    public final void mo23113c() {
        this.f84568b.setVisibility(8);
        if (C32430a.m105068e() != null && ((Boolean) C32430a.m105068e().mo22006a("live_is_load_gift_after_feed_end", Boolean.valueOf(false))).booleanValue()) {
            C32430a.m105053a();
        }
    }

    /* renamed from: a */
    public final void mo23112a(String str) {
        if (this.f84567a != null) {
            this.f84567a.setTitle((CharSequence) str);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cr);
        this.f84568b = (DmtLoadingLayout) findViewById(R.id.a_3);
        this.f84568b.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.ml));
        this.f84568b.setVisibility(0);
        this.f84567a = (TextTitleBar) findViewById(R.id.bpc);
        this.f84567a.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                LiveFeedActivity.this.finish();
            }
        });
        if (!C6399b.m19944t()) {
            getWindow().setSoftInputMode(48);
        }
        C0633q a = getSupportFragmentManager().mo2645a();
        a.mo2585a((int) R.id.aoy, C32507e.m105297a());
        a.mo2604c();
        runOnUiThread(new C32503d(this));
        this.f84569c = new LifecycleLog(this);
        if (C32430a.m105068e() != null && !((Boolean) C32430a.m105068e().mo22006a("live_is_load_gift_after_feed_end", Boolean.valueOf(false))).booleanValue()) {
            C32430a.m105053a();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.live.LiveFeedActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m105014a(Context context, Map<String, String> map) {
        Intent intent = new Intent(context, LiveFeedActivity.class);
        if (map != null) {
            for (String str : map.keySet()) {
                intent.putExtra(str, (String) map.get(str));
            }
        }
        context.startActivity(intent);
    }
}
