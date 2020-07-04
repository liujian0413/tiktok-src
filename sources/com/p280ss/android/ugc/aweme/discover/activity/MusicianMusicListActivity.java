package com.p280ss.android.ugc.aweme.discover.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.discover.p1185ui.MusicianMusicListFragment.C26909a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity */
public final class MusicianMusicListActivity extends AmeSSActivity {

    /* renamed from: a */
    public static final C26366a f69397a = new C26366a(null);

    /* renamed from: b */
    private ImmersionBar f69398b;

    /* renamed from: com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity$a */
    public static final class C26366a {
        private C26366a() {
        }

        public /* synthetic */ C26366a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m86702a(Context context, String str, int i) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "author");
            Intent intent = new Intent(context, MusicianMusicListActivity.class);
            intent.putExtra("param_music_author", str);
            intent.putExtra("param_holder_postion", i);
            context.startActivity(intent);
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar immersionBar = this.f69398b;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f69398b = ImmersionBar.with((Activity) this).fitsSystemWindows(true).statusBarDarkFont(C6399b.m19946v());
        ImmersionBar immersionBar = this.f69398b;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    /* renamed from: a */
    private final void m86701a() {
        Intent intent = getIntent();
        if (intent != null) {
            String stringExtra = intent.getStringExtra("param_music_author");
            if (stringExtra != null) {
                getSupportFragmentManager().mo2645a().mo2600b(R.id.aoy, C26909a.m88438a(stringExtra, getIntent().getIntExtra("param_holder_postion", 0)), "container").mo2606d();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.di);
        m86701a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.discover.activity.MusicianMusicListActivity", "onCreate", false);
    }
}
