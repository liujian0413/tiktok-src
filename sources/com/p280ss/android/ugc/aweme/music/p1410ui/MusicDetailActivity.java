package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.music.ui.MusicDetailActivity */
public class MusicDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    private String f88263b;

    /* renamed from: c */
    private String f88264c;

    /* renamed from: d */
    private ImmersionBar f88265d;

    /* renamed from: e */
    private String f88266e;

    /* renamed from: f */
    private String f88267f;

    /* renamed from: g */
    private String f88268g;

    /* renamed from: f */
    public final int mo60513f() {
        return 0;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void finish() {
        super.finish();
        C22491a.m74384a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f88265d != null) {
            this.f88265d.destroy();
        }
    }

    public Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            j = Long.parseLong(this.f88266e);
            try {
                j2 = Long.parseLong(this.f88263b);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        return new Analysis().setLabelName("single_song").setExt_value(j).setValue(j2);
    }

    public Resources getResources() {
        if (!this.mFirstResumed) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", true);
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
            return;
        }
        super.onResume();
        C43073dv.m136651a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        if (!C7212bb.m22494a((Activity) this)) {
            C10994a.m32208b(this);
            this.f88265d = ImmersionBar.with((Activity) this);
            if (C6399b.m19944t() && this.f88265d != null) {
                if (C6399b.m19946v() || C7212bb.m22493a()) {
                    this.f88265d.statusBarDarkFont(true).statusBarColor((int) R.color.a3z).init();
                    return;
                }
                this.f88265d.statusBarColor((int) R.color.a3z).init();
            }
        }
    }

    /* renamed from: a */
    private void m109059a() {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74858a();
        View findViewById = findViewById(R.id.dal);
        if (C6399b.m19946v() && findViewById != null) {
            C25713b.m84475a(findViewById);
            C23487o.m77155c((Activity) this);
        }
        this.f88267f = getIntent().getStringExtra("partnerName");
        this.f88268g = getIntent().getStringExtra("partnerMusicId");
        this.f88266e = getIntent().getStringExtra("id");
        this.f88263b = getIntent().getStringExtra("aweme_id");
        this.f88264c = getIntent().getStringExtra("extra_music_from");
        String stringExtra = getIntent().getStringExtra("sticker_id");
        String stringExtra2 = getIntent().getStringExtra("from_token");
        int intExtra = getIntent().getIntExtra("click_reason", 0);
        if (!TextUtils.isEmpty(this.f88266e) || !TextUtils.isEmpty(this.f88268g)) {
            C0608j supportFragmentManager = getSupportFragmentManager();
            C0633q a = supportFragmentManager.mo2645a();
            Fragment a2 = supportFragmentManager.mo2644a("music_detail_fragment_tag");
            if (a2 == null) {
                a2 = MusicDetailFragment.m109080a(this.f88266e, this.f88263b, this.f88264c, stringExtra, intExtra, stringExtra2, this.f88268g, this.f88267f);
            }
            a2.setUserVisibleHint(true);
            a.mo2600b(R.id.a19, a2, "music_detail_fragment_tag");
            a.mo2604c();
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a7f));
        C6903bc.m21484c().mo59239a((Activity) this);
        m109059a();
        C6903bc.m21477R().mo7641a(4);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.music.ui.MusicDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m109060a(Context context, String str, String str2) {
        C1592h.m7855a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                ((IAVService) ServiceManager.get().getService(IAVService.class)).getFilterService().mo74858a();
                return null;
            }
        }, (Executor) C1592h.f5957a);
        Intent intent = new Intent(context, MusicDetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("extra_music_from", str2);
        context.startActivity(intent);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
