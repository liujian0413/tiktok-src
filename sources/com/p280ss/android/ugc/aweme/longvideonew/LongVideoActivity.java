package com.p280ss.android.ugc.aweme.longvideonew;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.app.p1028c.C22911a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23254a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.longvideo.C32734e;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32718a.C32719a;
import com.p280ss.android.ugc.aweme.longvideonew.LongVideoPlayFragment.C32764a;
import com.p280ss.android.ugc.aweme.metrics.C33227aa;
import com.p280ss.android.ugc.aweme.metrics.C33248at;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoActivity */
public final class LongVideoActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C32763a f85428a = new C32763a(null);

    /* renamed from: b */
    private LongVideoPlayFragment f85429b;

    /* renamed from: c */
    private final ArrayList<C23254a> f85430c = new ArrayList<>();

    /* renamed from: d */
    private long f85431d;

    /* renamed from: e */
    private String f85432e = "";

    /* renamed from: f */
    private int f85433f;

    /* renamed from: g */
    private String f85434g = "";

    /* renamed from: h */
    private int f85435h = -1;

    /* renamed from: i */
    private String f85436i = "";

    /* renamed from: j */
    private Aweme f85437j;

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.LongVideoActivity$a */
    public static final class C32763a {
        private C32763a() {
        }

        public /* synthetic */ C32763a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static boolean m106045a(Context context) {
            if (C32781d.m106110a(context)) {
                return true;
            }
            C10761a.m31409e(context, (int) R.string.cjs).mo25750a();
            return false;
        }

        /* renamed from: a */
        private static void m106043a(Aweme aweme, String str, int i) {
            new C33227aa().mo85056c(aweme, i).mo85055a(str).mo85252e();
        }

        /* renamed from: a */
        public final void mo84272a(Context context, Aweme aweme, String str, int i, int i2, String str2) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(aweme, "aweme");
            C7573i.m23587b(str, "eventType");
            C7573i.m23587b(str2, "reactSessionId");
            if (m106045a(context)) {
                m106043a(aweme, str, i);
                C32734e.m105953a(aweme);
                Intent intent = new Intent(context, LongVideoActivity.class);
                intent.putExtra("extra_aweme_id", aweme.getAid());
                intent.putExtra("extra_event_type", str);
                intent.putExtra("extra_page_type", i);
                intent.putExtra("extra_initial_time", i2);
                intent.putExtra("extra_react_session_id", str2);
                context.startActivity(intent);
            }
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, R.anim.ax);
    }

    public final int getStatusBarColor() {
        return getResources().getColor(R.color.ac4);
    }

    public final void onBackPressed() {
        LongVideoPlayFragment longVideoPlayFragment = this.f85429b;
        if (longVideoPlayFragment != null) {
            longVideoPlayFragment.mo84273a();
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f85430c.clear();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onResume", true);
        super.onResume();
        this.f85431d = SystemClock.elapsedRealtime();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onResume", false);
    }

    public final void setStatusBarColor() {
        if (C22911a.m75401a(this)) {
            m106042c();
        } else {
            m106041b();
        }
    }

    /* renamed from: b */
    private final void m106041b() {
        if (VERSION.SDK_INT >= 21) {
            getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            return;
        }
        Window window = getWindow();
        C7573i.m23582a((Object) window, "window");
        View decorView = window.getDecorView();
        C7573i.m23582a((Object) decorView, "decorView");
        decorView.setSystemUiVisibility(1284);
    }

    /* renamed from: c */
    private final void m106042c() {
        if (VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            C7573i.m23582a((Object) window, "window");
            window.setStatusBarColor(getStatusBarColor());
        } else if (VERSION.SDK_INT >= 19) {
            C10994a.m32206a(this, getStatusBarColor());
        }
        C23487o.m77149b((Activity) this);
    }

    public final void onPause() {
        super.onPause();
        new C33248at("long_video_stay_time").mo85138a(String.valueOf(SystemClock.elapsedRealtime() - this.f85431d)).mo85139b(this.f85432e).mo85071g(this.f85437j).mo85252e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006d, code lost:
        if (r3.f85437j == null) goto L_0x006f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m106039a() {
        /*
            r3 = this;
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "extra_aweme_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x000e
            java.lang.String r0 = ""
        L_0x000e:
            r3.f85434g = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "extra_event_type"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x001e
            java.lang.String r0 = ""
        L_0x001e:
            r3.f85432e = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "extra_page_type"
            r2 = 0
            int r0 = r0.getIntExtra(r1, r2)
            r3.f85433f = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "extra_initial_time"
            int r0 = r0.getIntExtra(r1, r2)
            r3.f85435h = r0
            android.content.Intent r0 = r3.getIntent()
            java.lang.String r1 = "extra_react_session_id"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = ""
        L_0x0047:
            r3.f85436i = r0
            java.lang.String r0 = r3.f85432e
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.String r1 = "homepage_hot"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x006f
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r1 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            java.lang.String r1 = r3.f85434g
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getRawAdAwemeById(r1)
            r3.f85437j = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f85437j
            if (r0 != 0) goto L_0x0083
        L_0x006f:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IAwemeService> r1 = com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService.class
            java.lang.Object r0 = r0.getService(r1)
            com.ss.android.ugc.aweme.awemeservice.api.IAwemeService r0 = (com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService) r0
            java.lang.String r1 = r3.f85434g
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAwemeById(r1)
            r3.f85437j = r0
        L_0x0083:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f85437j
            if (r0 != 0) goto L_0x008d
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = com.p280ss.android.ugc.aweme.longvideo.C32734e.m105951a()
            r3.f85437j = r0
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.longvideonew.LongVideoActivity.m106039a():void");
    }

    /* renamed from: a */
    private final void m106040a(C23254a aVar) {
        if (aVar != null) {
            this.f85430c.add(aVar);
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onCreate", true);
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            if (window != null) {
                window.setNavigationBarColor(-16777216);
            }
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
        }
        superOverridePendingTransition(R.anim.aw, 0);
        setContentView((int) R.layout.d4);
        m106039a();
        C32719a.m105914a(this, this.f85437j, this.f85432e, this.f85433f, 1);
        this.f85429b = C32764a.m106062a(this.f85437j, this.f85432e, this.f85433f, "long_video_player_activity", this.f85435h, this.f85436i);
        m106040a(this.f85429b);
        LongVideoPlayFragment longVideoPlayFragment = this.f85429b;
        if (longVideoPlayFragment != null) {
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, (Fragment) longVideoPlayFragment).mo2604c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.longvideonew.LongVideoActivity", "onCreate", false);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isViewValid()) {
            return false;
        }
        Iterator it = this.f85430c.iterator();
        while (it.hasNext()) {
            if (((C23254a) it.next()).mo60522a(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }
}
