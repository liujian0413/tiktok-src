package com.p280ss.android.ugc.aweme.commercialize.loft;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.ugc.aweme.app.C22912d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b.C24880b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.Loft;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewType;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.LoftActivity */
public class LoftActivity extends AmeSSActivity implements C24880b {

    /* renamed from: a */
    private static final Long f65384a = Long.valueOf(1500);

    /* renamed from: b */
    private DmtLoadingLayout f65385b;

    /* renamed from: c */
    private View f65386c;

    /* renamed from: d */
    private ViewGroup f65387d;

    /* renamed from: e */
    private View f65388e;

    /* renamed from: f */
    private Handler f65389f = new Handler(Looper.getMainLooper());

    /* renamed from: g */
    private boolean f65390g;

    /* renamed from: h */
    private boolean f65391h;

    /* renamed from: i */
    private boolean f65392i;

    /* renamed from: j */
    private long f65393j;

    /* renamed from: k */
    private IntermediateStateViewController f65394k;

    /* renamed from: l */
    private String f65395l = "";

    /* renamed from: m */
    private String f65396m = "#ccaaff";

    /* renamed from: n */
    private String f65397n = "#2c016d";

    /* renamed from: o */
    private String f65398o = "";

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onPause() {
        super.onPause();
        this.f65390g = false;
    }

    /* renamed from: a */
    private boolean m81466a() {
        if (VERSION.SDK_INT >= 17) {
            return isDestroyed();
        }
        return isFinishing();
    }

    public void onDestroy() {
        ((C24877b) C24877b.f65602l.mo65136a(this)).mo65115a();
        this.f65389f.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public void finish() {
        super.finish();
        if (this.f65388e != null) {
            this.f65388e.setBackgroundColor(getResources().getColor(R.color.ac4));
        }
        this.f65389f.removeCallbacksAndMessages(null);
        C23256c.m76348b(this, 0);
    }

    public void onBackPressed() {
        super.onBackPressed();
        if (this.f65392i) {
            C6907h.m21524a("enter_second_floor", (Map) C22984d.m75611a().mo59973a("enter_method", "push").mo59973a("is_success", "come_back").f60753a);
        }
        this.f65389f.removeCallbacksAndMessages(null);
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onResume", true);
        super.onResume();
        this.f65390g = true;
        this.f65388e.setBackgroundColor(getResources().getColor(R.color.fs));
        if (this.f65391h) {
            m81467c(((C24877b) C24877b.f65602l.mo65136a(this)).mo65114a(this.f65395l));
            this.f65391h = false;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onResume", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo64888a(View view) {
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo64890b(View view) {
        onBackPressed();
    }

    /* renamed from: a */
    private static int m81464a(String str) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return -1;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo64891b(Loft loft) {
        if (this.f65390g) {
            m81467c(loft);
        } else {
            this.f65391h = true;
        }
    }

    /* renamed from: a */
    private void m81465a(int i) {
        C10761a.m31383a((Context) this, i).mo25750a();
        this.f65389f.postDelayed(new C24862d(this), f65384a.longValue());
    }

    /* renamed from: c */
    private void m81467c(Loft loft) {
        if (loft != null) {
            Intent intent = getIntent();
            getSupportFragmentManager().mo2645a().mo2585a((int) R.id.a24, (Fragment) LoftPlayFragment.m81485a(intent.getStringExtra("loft_event_type"), intent.getIntExtra("loft_page_type", -1), this.f65395l)).mo2606d();
        }
    }

    /* renamed from: a */
    public final void mo64889a(Loft loft) {
        this.f65392i = false;
        if (!m81466a()) {
            this.f65386c.setVisibility(8);
            this.f65385b.setVisibility(8);
            C6907h.m21524a("enter_second_floor", (Map) C22984d.m75611a().mo59973a("enter_method", "push").mo59973a("is_success", "success").mo59973a("enter_status", String.valueOf(loft.getStatus())).f60753a);
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59971a("duration", SystemClock.elapsedRealtime() - this.f65393j).mo59973a(C22912d.f60642b, this.f65398o).mo59973a("activity_id", this.f65395l).mo59970a("status", 0).f60753a);
            if (loft.getStatus() == 4) {
                m81465a((int) R.string.c5d);
            } else if (loft.getStatus() == 2) {
                m81465a((int) R.string.c5e);
            } else if (loft.getStatus() == 3) {
                this.f65394k.mo65140a(loft, ViewType.DIRECT_OPEN, (OnClickListener) new C24856b(this));
                this.f65394k.f65673c = new C24861c(this, loft);
            } else {
                m81465a((int) R.string.c5c);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.d0);
        Intent intent = getIntent();
        this.f65395l = intent.getStringExtra("activity_id");
        if (TextUtils.isEmpty(this.f65395l)) {
            finish();
        }
        this.f65396m = intent.getStringExtra("start_color");
        if (TextUtils.isEmpty(this.f65396m)) {
            this.f65396m = "#ccaaff";
        }
        StringBuilder sb = new StringBuilder("#");
        sb.append(this.f65396m);
        this.f65396m = sb.toString();
        if (m81464a(this.f65396m) == -1) {
            this.f65396m = "#ccaaff";
        }
        this.f65397n = intent.getStringExtra("end_color");
        if (TextUtils.isEmpty(this.f65397n)) {
            this.f65397n = "#2c016d";
        }
        StringBuilder sb2 = new StringBuilder("#");
        sb2.append(this.f65397n);
        this.f65397n = sb2.toString();
        if (m81464a(this.f65397n) == -1) {
            this.f65397n = "#2c016d";
        }
        this.f65398o = intent.getStringExtra(C22912d.f60642b);
        this.f65388e = findViewById(R.id.cws);
        this.f65387d = (ViewGroup) findViewById(R.id.a24);
        this.f65385b = (DmtLoadingLayout) findViewById(R.id.bv_);
        this.f65386c = findViewById(R.id.b7g);
        this.f65386c.setOnClickListener(new C24843a(this));
        this.f65394k = new IntermediateStateViewController(this, this.f65387d, false);
        this.f65394k.mo65141a(this.f65396m, this.f65397n);
        this.f65394k.mo65148m();
        this.f65387d.addView(this.f65394k.mo65150o());
        this.f65385b.setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.ml));
        ((C24877b) C24877b.f65602l.mo65136a(this)).mo65117a((C24880b) this, this.f65395l);
        this.f65393j = SystemClock.elapsedRealtime();
        this.f65392i = true;
        this.f65385b.setVisibility(0);
        this.f65391h = false;
        C23487o.m77149b((Activity) this);
        C23256c.m76347a(this, 0);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.loft.LoftActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo64887a(int i, Throwable th) {
        this.f65392i = false;
        if (!m81466a()) {
            this.f65385b.setVisibility(8);
            C6907h.m21524a("enter_second_floor", (Map) C22984d.m75611a().mo59973a("enter_method", "push").mo59973a("is_success", "false").f60753a);
            if (th == null) {
                C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59973a(C22912d.f60642b, this.f65398o).mo59973a("activity_id", this.f65395l).mo59970a("status", i).f60753a);
            } else if (th instanceof BaseException) {
                BaseException baseException = (BaseException) th;
                C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59973a(C22912d.f60642b, this.f65398o).mo59973a("activity_id", this.f65395l).mo59970a("status", i).mo59970a("error_code", baseException.getErrorCode()).mo59973a("error_msg", baseException.getErrorMessage()).f60753a);
            } else {
                C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59973a(C22912d.f60642b, this.f65398o).mo59973a("activity_id", this.f65395l).mo59970a("status", i).mo59973a("error_msg", th.getMessage()).f60753a);
            }
            m81465a((int) R.string.c5c);
        }
    }
}
