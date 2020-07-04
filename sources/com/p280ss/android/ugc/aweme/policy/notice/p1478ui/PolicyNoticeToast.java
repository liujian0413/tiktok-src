package com.p280ss.android.ugc.aweme.policy.notice.p1478ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.policy.notice.api.C35504a;
import com.p280ss.android.ugc.aweme.policy.notice.api.C35505b;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35500a;
import com.p280ss.android.ugc.aweme.policy.notice.p1476a.C35501b;
import com.p280ss.android.ugc.aweme.policy.notice.p1477b.C35507a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.PolicyNoticeToast */
public final class PolicyNoticeToast extends LinearLayout {

    /* renamed from: a */
    public C35504a f93174a;

    /* renamed from: b */
    public C35504a f93175b;

    /* renamed from: c */
    private DmtTextView f93176c;

    /* renamed from: d */
    private DmtTextView f93177d;

    /* renamed from: e */
    private DmtTextView f93178e;

    /* renamed from: f */
    private DmtTextView f93179f;

    /* renamed from: g */
    private boolean f93180g;

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.PolicyNoticeToast$a */
    static final class C35511a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f93181a;

        /* renamed from: b */
        final /* synthetic */ C35505b f93182b;

        C35511a(PolicyNoticeToast policyNoticeToast, C35505b bVar) {
            this.f93181a = policyNoticeToast;
            this.f93182b = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            String str = this.f93182b.f93164c;
            int hashCode = str.hashCode();
            if (hashCode != -1052618729) {
                if (hashCode != -172220347) {
                    if (hashCode == 3277 && str.equals("h5")) {
                        Intent intent = new Intent(this.f93181a.getContext(), CrossPlatformActivity.class);
                        intent.setData(Uri.parse(this.f93182b.f93165d));
                        this.f93181a.getContext().startActivity(intent);
                    }
                } else if (str.equals("callback")) {
                    new C35507a().mo90315a(PolicyNoticeToast.m114670a(this.f93181a).f93155a, PolicyNoticeToast.m114670a(this.f93181a).f93156b, PolicyNoticeToast.m114670a(this.f93181a).f93157c, this.f93182b.f93166e);
                    if (this.f93181a.f93175b != null) {
                        C35504a aVar = this.f93181a.f93175b;
                        if (aVar == null) {
                            C7573i.m23580a();
                        }
                        C42961az.m136380a(new C35501b(aVar));
                    } else {
                        C42961az.m136380a(new C35500a());
                    }
                    this.f93181a.mo90316a();
                }
            } else if (str.equals("native")) {
                C7195s.m22438a().mo18682a(C7203u.m22460a(this.f93182b.f93165d).mo18695a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.policy.notice.ui.PolicyNoticeToast$b */
    static final class C35512b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeToast f93183a;

        C35512b(PolicyNoticeToast policyNoticeToast) {
            this.f93183a = policyNoticeToast;
        }

        public final void run() {
            PolicyNoticeToast policyNoticeToast = this.f93183a;
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(new AlphaAnimation(0.0f, 1.0f));
            animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, (float) this.f93183a.getHeight(), 0.0f));
            animationSet.setDuration(300);
            policyNoticeToast.startAnimation(animationSet);
            this.f93183a.setVisibility(0);
        }
    }

    public PolicyNoticeToast(Context context) {
        this(context, null, 0, 6, null);
    }

    public PolicyNoticeToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: c */
    private final void m114673c() {
        setVisibility(4);
        post(new C35512b(this));
    }

    /* renamed from: a */
    public final void mo90316a() {
        setVisibility(8);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(new AlphaAnimation(1.0f, 0.0f));
        animationSet.addAnimation(new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) getHeight()));
        animationSet.setDuration(300);
        startAnimation(animationSet);
    }

    /* renamed from: b */
    private final void m114672b() {
        if (!this.f93180g) {
            this.f93180g = true;
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.akp, null);
            View findViewById = inflate.findViewById(R.id.dsf);
            C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.tv_content)");
            this.f93176c = (DmtTextView) findViewById;
            View findViewById2 = inflate.findViewById(R.id.s8);
            C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.button1)");
            this.f93177d = (DmtTextView) findViewById2;
            View findViewById3 = inflate.findViewById(R.id.s9);
            C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.button2)");
            this.f93178e = (DmtTextView) findViewById3;
            View findViewById4 = inflate.findViewById(R.id.dwv);
            C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.tv_line)");
            this.f93179f = (DmtTextView) findViewById4;
            addView(inflate);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C35504a m114670a(PolicyNoticeToast policyNoticeToast) {
        C35504a aVar = policyNoticeToast.f93174a;
        if (aVar == null) {
            C7573i.m23583a("mPolicyNotice");
        }
        return aVar;
    }

    public final void setNext(C35504a aVar) {
        C7573i.m23587b(aVar, "privacyNotice");
        m114672b();
        this.f93175b = aVar;
    }

    private final void setContent(String str) {
        DmtTextView dmtTextView = this.f93176c;
        if (dmtTextView == null) {
            C7573i.m23583a("mContent");
        }
        dmtTextView.setFontType(C10834d.f29332b);
        DmtTextView dmtTextView2 = this.f93176c;
        if (dmtTextView2 == null) {
            C7573i.m23583a("mContent");
        }
        dmtTextView2.setText(str);
    }

    public final void setValues(C35504a aVar) {
        C7573i.m23587b(aVar, "policyNotice");
        m114672b();
        this.f93174a = aVar;
        C35504a aVar2 = this.f93174a;
        if (aVar2 == null) {
            C7573i.m23583a("mPolicyNotice");
        }
        setContent(aVar2.f93159e);
        DmtTextView dmtTextView = this.f93177d;
        if (dmtTextView == null) {
            C7573i.m23583a("mButton1");
        }
        C35504a aVar3 = this.f93174a;
        if (aVar3 == null) {
            C7573i.m23583a("mPolicyNotice");
        }
        m114671a(dmtTextView, (C35505b) aVar3.f93160f.get(0));
        C35504a aVar4 = this.f93174a;
        if (aVar4 == null) {
            C7573i.m23583a("mPolicyNotice");
        }
        if (aVar4.f93160f.size() > 1) {
            DmtTextView dmtTextView2 = this.f93179f;
            if (dmtTextView2 == null) {
                C7573i.m23583a("mLine");
            }
            dmtTextView2.setVisibility(0);
            DmtTextView dmtTextView3 = this.f93178e;
            if (dmtTextView3 == null) {
                C7573i.m23583a("mButton2");
            }
            dmtTextView3.setVisibility(0);
            DmtTextView dmtTextView4 = this.f93178e;
            if (dmtTextView4 == null) {
                C7573i.m23583a("mButton2");
            }
            C35504a aVar5 = this.f93174a;
            if (aVar5 == null) {
                C7573i.m23583a("mPolicyNotice");
            }
            m114671a(dmtTextView4, (C35505b) aVar5.f93160f.get(1));
        } else {
            DmtTextView dmtTextView5 = this.f93179f;
            if (dmtTextView5 == null) {
                C7573i.m23583a("mLine");
            }
            dmtTextView5.setVisibility(8);
            DmtTextView dmtTextView6 = this.f93178e;
            if (dmtTextView6 == null) {
                C7573i.m23583a("mButton2");
            }
            dmtTextView6.setVisibility(8);
        }
        m114673c();
    }

    /* renamed from: a */
    private final void m114671a(DmtTextView dmtTextView, C35505b bVar) {
        if (dmtTextView != null) {
            dmtTextView.setText(bVar.f93162a);
        }
        if (bVar.f93163b) {
            if (dmtTextView != null) {
                dmtTextView.setFontType(C10834d.f29332b);
            }
            if (dmtTextView != null) {
                Context context = getContext();
                C7573i.m23582a((Object) context, "context");
                dmtTextView.setTextColor(context.getResources().getColor(R.color.ab1));
            }
        } else if (dmtTextView != null) {
            dmtTextView.setFontType(C10834d.f29331a);
        }
        if (dmtTextView != null) {
            dmtTextView.setOnClickListener(new C35511a(this, bVar));
        }
    }

    public PolicyNoticeToast(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ PolicyNoticeToast(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
