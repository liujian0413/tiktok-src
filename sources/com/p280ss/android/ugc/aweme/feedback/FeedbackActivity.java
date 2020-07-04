package com.p280ss.android.ugc.aweme.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11043a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.common.util.C6775g;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.image.C19602k;
import com.p280ss.android.image.C6813b;
import com.p280ss.android.newmedia.p891a.C19914a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.experiment.FAQExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.feedback.FeedbackActivity */
public class FeedbackActivity extends AmeBaseActivity {

    /* renamed from: A */
    private C0608j f76660A;

    /* renamed from: B */
    private MyFeedbackFragment f76661B;

    /* renamed from: C */
    private View f76662C;

    /* renamed from: a */
    boolean f76663a;

    /* renamed from: b */
    private boolean f76664b;

    /* renamed from: c */
    private TextView f76665c;

    /* renamed from: d */
    private boolean f76666d;

    /* renamed from: e */
    private boolean f76667e = true;

    /* renamed from: q */
    private boolean f76668q;

    /* renamed from: r */
    private View f76669r;

    /* renamed from: s */
    private SwipeOverlayFrameLayout f76670s;

    /* renamed from: t */
    private View f76671t;

    /* renamed from: u */
    private View f76672u;

    /* renamed from: v */
    private ViewGroup f76673v;

    /* renamed from: w */
    private C19914a f76674w;

    /* renamed from: x */
    private C19602k f76675x;

    /* renamed from: y */
    private C6813b f76676y;

    /* renamed from: z */
    private C6775g f76677z;

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.mj;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void setStatusBarColor() {
        C10994a.m32205a((Activity) this);
    }

    public void onStop() {
        super.onStop();
        if (this.f76675x != null) {
            this.f76675x.mo51792b();
        }
    }

    /* renamed from: c */
    private void m95357c() {
        if (VERSION.SDK_INT >= 19) {
            this.f76662C.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    public void onBackPressed() {
        if (!isFinishing()) {
            Intent intent = null;
            if (isTaskRoot()) {
                intent = C6776h.m20941a((Context) this, getPackageName());
            }
            finish();
            if (intent != null) {
                startActivity(intent);
            }
        }
    }

    public void onDestroy() {
        if (this.f76674w != null) {
            this.f76674w.dismiss();
            this.f76674w = null;
        }
        super.onDestroy();
        if (this.f76675x != null) {
            this.f76675x.mo51793c();
        }
        if (this.f76677z != null) {
            this.f76677z.mo16567a();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onResume", true);
        super.onResume();
        if (this.f76675x != null) {
            this.f76675x.mo51789a();
        }
        if (this.f76667e) {
            mo60493h();
        }
        this.f76669r.setVisibility(8);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onResume", false);
    }

    /* renamed from: h */
    public final void mo60493h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f76664b) {
            this.f76664b = false;
            Resources resources = getResources();
            if (this.f76664b) {
                i = R.drawable.u7;
            } else {
                i = R.drawable.u5;
            }
            boolean z = this.f76664b;
            int i6 = R.drawable.vr;
            if (z) {
                i2 = R.drawable.vs;
            } else {
                i2 = R.drawable.vr;
            }
            if (this.f76664b) {
                i3 = R.drawable.vm;
            } else {
                i3 = R.drawable.vl;
            }
            if (this.f76664b) {
                i4 = R.color.abv;
            } else {
                i4 = R.color.abu;
            }
            if (this.f76664b) {
                i6 = R.color.gm;
            }
            ColorStateList colorStateList = resources.getColorStateList(i6);
            this.f61253j.setBackgroundResource(i);
            this.f61256m.setTextColor(resources.getColor(i4));
            C9738o.m28700a((View) this.f76665c, i2);
            this.f76665c.setTextColor(colorStateList);
            this.f76665c.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            this.f76665c.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
            if (this.f76664b) {
                i5 = R.color.q4;
            } else {
                i5 = R.color.q3;
            }
            this.f76670s.setBackgroundColor(resources.getColor(i5));
        }
    }

    /* renamed from: d */
    private void m95358d() {
        this.f76662C = findViewById(R.id.dal);
        this.f76665c = (TextView) findViewById(R.id.jn);
        this.f76671t = findViewById(R.id.ehh);
        this.f76672u = findViewById(R.id.c16);
        this.f76673v = (ViewGroup) findViewById(R.id.nk);
        if (C6399b.m19944t()) {
            m95357c();
            this.f76665c.setVisibility(8);
            this.f76672u.setVisibility(0);
            this.f61255l.setVisibility(0);
            this.f76671t.setVisibility(8);
            this.f76673v.setBackgroundColor(getResources().getColor(R.color.a6c));
        } else {
            this.f76672u.setVisibility(8);
            this.f61255l.setVisibility(8);
            this.f76671t.setVisibility(0);
            this.f76673v.setBackgroundColor(getResources().getColor(R.color.a7o));
        }
        this.f76665c.setOnClickListener(new C29068a(this));
        this.f76671t.setOnClickListener(new C29069b(this));
        this.f76672u.setOnClickListener(new C29070c(this));
        this.f61255l.setOnClickListener(new C29071d(this));
        this.f76669r = findViewById(R.id.c4f);
        View findViewById = findViewById(R.id.dee);
        if (findViewById instanceof SwipeOverlayFrameLayout) {
            this.f76670s = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f76668q && this.f76670s != null) {
            this.f76670s.setOnSwipeListener(new C11043a() {
                /* renamed from: a */
                public final boolean mo26721a() {
                    if (!FeedbackActivity.this.f76663a) {
                        return false;
                    }
                    FeedbackActivity.this.onBackPressed();
                    return true;
                }

                /* renamed from: b */
                public final boolean mo26722b() {
                    if (FeedbackActivity.this.f76663a) {
                        return false;
                    }
                    FeedbackActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo74482d(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo74478a(View view) {
        finish();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo74480b(View view) {
        C6907h.m21524a("faq_result", (Map) new C22984d().mo59973a("page_type", "app").f60753a);
        try {
            if (C6384b.m19835a().mo15287a(FAQExperiment.class, true, "feedback_post_page_style", C6384b.m19835a().mo15295d().feedback_post_page_style, 0) == 1) {
                C7195s.m22438a().mo18682a(C30199h.m98861a().getFeedbackConf().getFeHelp());
                finish();
                return;
            }
            throw new NullValueException();
        } catch (NullValueException unused) {
            Intent intent = new Intent(this, ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSubmitFeedbackActivity());
            intent.putExtra("use_anim", this.f76666d);
            startActivityForResult(intent, 1001);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo74481c(View view) {
        C6907h.m21524a("faq_result", (Map) new C22984d().mo59973a("page_type", "app").f60753a);
        try {
            if (C6384b.m19835a().mo15287a(FAQExperiment.class, true, "feedback_post_page_style", C6384b.m19835a().mo15295d().feedback_post_page_style, 0) == 1) {
                C7195s.m22438a().mo18682a(C30199h.m98861a().getFeedbackConf().getFeHelp());
                finish();
                return;
            }
            throw new NullValueException();
        } catch (NullValueException unused) {
            Intent intent = new Intent(this, ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSubmitFeedbackActivity());
            intent.putExtra("use_anim", this.f76666d);
            startActivityForResult(intent, 1001);
        }
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onCreate", true);
        super.onCreate(bundle);
        m95358d();
        Intent intent = getIntent();
        if (intent != null) {
            this.f76666d = intent.getBooleanExtra("use_anim", false);
            this.f76668q = intent.getBooleanExtra("use_swipe", false);
            this.f76663a = intent.getBooleanExtra("slide_out_left", false);
            if (!TextUtils.isEmpty(intent.getStringExtra("feedback_id"))) {
                C10761a.m31383a((Context) this, (int) R.string.b6c).mo25750a();
            }
        }
        this.f76667e = getResources().getBoolean(R.bool.j);
        this.f76676y = new C6813b(this);
        this.f76677z = new C6775g();
        Bundle bundle2 = new Bundle();
        this.f76661B = new MyFeedbackFragment();
        this.f76661B.setArguments(bundle2);
        this.f76660A = getSupportFragmentManager();
        C0633q a = this.f76660A.mo2645a();
        a.mo2586a(R.id.aoy, this.f76661B, "_my_");
        a.mo2604c();
        new C29084l();
        C29084l.m95427a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.feedback.FeedbackActivity", "onCreate", false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            Fragment a = getSupportFragmentManager().mo2644a("_my_");
            if (a instanceof MyFeedbackFragment) {
                ((MyFeedbackFragment) a).mo74491a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo74479a(String str, String str2, Bitmap bitmap) {
        if (isViewValid() && !C6319n.m19593a(str)) {
            if (this.f76674w == null) {
                this.f76674w = new C19914a(this, this.f76676y, true);
                C19602k kVar = new C19602k(this, this.f76677z, this.f76676y, this.f76674w, this.f76674w);
                this.f76675x = kVar;
                this.f76674w.f53970d = this.f76675x;
            }
            if (!this.f76674w.isShowing()) {
                this.f76674w.mo53417a(str, str2, bitmap);
                this.f76674w.show();
            }
        }
    }
}
