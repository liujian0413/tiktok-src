package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.arch.JediBaseActivity;
import com.p280ss.android.ugc.aweme.music.p1410ui.SimilarMusicFragment.C33896a;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity */
public final class SimilarMusicActivity extends JediBaseActivity {

    /* renamed from: b */
    public static final C33894a f88455b = new C33894a(null);

    /* renamed from: c */
    private ImmersionBar f88456c;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity$a */
    public static final class C33894a {
        private C33894a() {
        }

        public /* synthetic */ C33894a(C7571f fVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f88456c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f88456c = ImmersionBar.with((Activity) this);
        if (C6399b.m19946v() || C7212bb.m22493a()) {
            ImmersionBar immersionBar = this.f88456c;
            if (immersionBar != null) {
                ImmersionBar statusBarDarkFont = immersionBar.statusBarDarkFont(true);
                if (statusBarDarkFont != null) {
                    ImmersionBar statusBarColor = statusBarDarkFont.statusBarColor((int) R.color.a3z);
                    if (statusBarColor != null) {
                        statusBarColor.init();
                    }
                }
            }
            return;
        }
        ImmersionBar immersionBar2 = this.f88456c;
        if (immersionBar2 != null) {
            ImmersionBar statusBarColor2 = immersionBar2.statusBarColor((int) R.color.a3z);
            if (statusBarColor2 != null) {
                statusBarColor2.init();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.eu);
        String stringExtra = getIntent().getStringExtra("music_id");
        String stringExtra2 = getIntent().getStringExtra("music_title");
        String stringExtra3 = getIntent().getStringExtra("anthor_id");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String stringExtra4 = getIntent().getStringExtra("enter_type");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        C7573i.m23582a((Object) stringExtra, "musicId");
        C7573i.m23582a((Object) stringExtra2, "musicTitle");
        getSupportFragmentManager().mo2645a().mo2585a((int) R.id.aoy, (Fragment) C33896a.m109301a(stringExtra, stringExtra2, stringExtra3, stringExtra4)).mo2604c();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity", "onCreate", false);
    }
}
