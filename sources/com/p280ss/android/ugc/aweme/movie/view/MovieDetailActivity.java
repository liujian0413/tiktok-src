package com.p280ss.android.ugc.aweme.movie.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.movie.view.MovieDetailFragment.C33656a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailActivity */
public final class MovieDetailActivity extends AmeSlideSSActivity {

    /* renamed from: e */
    public static final C33655a f87834e = new C33655a(null);

    /* renamed from: b */
    public String f87835b = "";

    /* renamed from: c */
    public String f87836c = "";

    /* renamed from: d */
    public String f87837d = "";

    /* renamed from: com.ss.android.ugc.aweme.movie.view.MovieDetailActivity$a */
    public static final class C33655a {
        private C33655a() {
        }

        public /* synthetic */ C33655a(C7571f fVar) {
            this();
        }
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = Long.parseLong(this.f87835b);
            try {
                j2 = Long.parseLong(this.f87837d);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        Analysis value = new Analysis().setLabelName("mv_page").setExt_value(j).setValue(j2);
        C7573i.m23582a((Object) value, "Analysis().setLabelName(…t_value(id).setValue(aid)");
        return value;
    }

    /* renamed from: a */
    private final void m108594a() {
        String stringExtra = getIntent().getStringExtra("mv_id");
        C7573i.m23582a((Object) stringExtra, "intent.getStringExtra(Mob.Key.MV_ID)");
        this.f87835b = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("enter_from");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f87836c = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("group_id");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.f87837d = stringExtra3;
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        C7573i.m23582a((Object) a, "fm.beginTransaction()");
        Fragment a2 = supportFragmentManager.mo2644a("movie_detail_fragment_tag");
        if (a2 == null) {
            a2 = C33656a.m108617a(this.f87835b, this.f87836c, this.f87837d);
        }
        a2.setUserVisibleHint(true);
        a.mo2600b(R.id.a19, a2, "movie_detail_fragment_tag");
        a.mo2604c();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dc);
        m108594a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.movie.view.MovieDetailActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
