package com.p280ss.android.ugc.aweme.homepage.p1291ui.view;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p280ss.android.ugc.aweme.main.TabAlphaController;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p931a.C21085a;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.share.viewmodel.C38267a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.MainBottomTabView */
public class MainBottomTabView extends LinearLayout {

    /* renamed from: a */
    public C30335l f79658a;

    /* renamed from: b */
    private C30335l f79659b;

    /* renamed from: c */
    private C30335l f79660c;

    /* renamed from: d */
    private C30335l f79661d;

    /* renamed from: e */
    private C30335l f79662e;

    /* renamed from: f */
    private ValueAnimator f79663f;

    /* renamed from: g */
    private TabMode f79664g;

    /* renamed from: h */
    private LinearLayout f79665h;

    /* renamed from: i */
    private boolean f79666i;

    /* renamed from: j */
    private HashMap<String, C30335l> f79667j;

    public TabMode getMode() {
        return this.f79664g;
    }

    /* renamed from: b */
    private void m99057b() {
        int d = (int) (((float) C23482j.m77102d(getContext())) / 5.0f);
        this.f79659b.setLayoutParams(new LayoutParams(d, -1));
        this.f79660c.setLayoutParams(new LayoutParams(d, -1));
        this.f79658a.setLayoutParams(new LayoutParams(d, -1));
        this.f79661d.setLayoutParams(new LayoutParams(d, -1));
        this.f79662e.setLayoutParams(new LayoutParams(d, -1));
    }

    /* renamed from: a */
    public final void mo79795a() {
        if (C21085a.m71129c() && this.f79664g == TabMode.MODE_MATERIAL) {
            m99055a((int) C9738o.m28708b(getContext(), 4.0f), (int) C9738o.m28708b(getContext(), 6.0f), this.f79659b, this.f79660c, this.f79661d, this.f79662e);
        }
    }

    /* renamed from: b */
    public final void mo79801b(String str) {
        mo79803c(str);
    }

    public MainBottomTabView(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public final void mo79799a(boolean z) {
        this.f79658a.setEnabled(z);
    }

    /* renamed from: f */
    public final C30335l mo79806f(String str) {
        return (C30335l) this.f79667j.get(str);
    }

    public void setAlpha(float f) {
        if (!TabAlphaController.m106429a().f85770a) {
            super.setAlpha(f);
        }
    }

    /* renamed from: d */
    public final void mo79804d(String str) {
        if (this.f79667j.containsKey(str)) {
            ((C30335l) this.f79667j.get(str)).mo79896r();
        }
    }

    /* renamed from: e */
    public final void mo79805e(String str) {
        if (this.f79667j.containsKey(str)) {
            ((C30335l) this.f79667j.get(str)).mo79897s();
        }
    }

    private void setTabActivated(String str) {
        if (!str.equalsIgnoreCase("PUBLISH")) {
            if (str.equalsIgnoreCase("HOME")) {
                this.f79660c.setActivated(false);
                this.f79661d.setActivated(false);
                this.f79662e.setActivated(false);
                this.f79658a.setActivated(false);
                return;
            }
            this.f79660c.setActivated(true);
            this.f79661d.setActivated(true);
            this.f79662e.setActivated(true);
            this.f79658a.setActivated(true);
        }
    }

    /* renamed from: c */
    public final void mo79803c(String str) {
        if (!C38267a.m122239a(getContext()).mo95909h()) {
            setTabActivated(str);
        }
        C6857a.m21312e().mo16818a();
        C6857a.m21312e().mo16824b();
        ScrollSwitchStateManager.m98918a((FragmentActivity) C23487o.m77130a(getContext())).mo79742i(str);
    }

    /* renamed from: g */
    private void m99058g(String str) {
        int i;
        long j;
        boolean z = !TextUtils.equals(str, "HOME");
        Context context = getContext();
        int i2 = R.color.ayd;
        if (z) {
            i = R.color.ayd;
        } else {
            i = R.color.a0h;
        }
        int c = C0683b.m2912c(context, i);
        Context context2 = getContext();
        if (z) {
            i2 = R.color.a0h;
        }
        int c2 = C0683b.m2912c(context2, i2);
        if (c != c2) {
            if (!this.f79666i || ((!C6399b.m19946v() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) || !TextUtils.equals(str, "HOME"))) {
                this.f79666i = false;
                if (!z || !C6399b.m19947w() || !C21085a.m71117a().f56622i) {
                    if (this.f79663f != null) {
                        this.f79663f.cancel();
                    }
                    this.f79663f = ValueAnimator.ofObject(new ArgbEvaluator(), new Object[]{Integer.valueOf(c), Integer.valueOf(c2)});
                    this.f79663f.addUpdateListener(new AnimatorUpdateListener() {
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            MainBottomTabView.this.setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                        }
                    });
                    ValueAnimator valueAnimator = this.f79663f;
                    if (z) {
                        j = 0;
                    } else {
                        j = 100;
                    }
                    valueAnimator.setDuration(j);
                    this.f79663f.start();
                    this.f79659b.mo79890a(str);
                    return;
                }
                setBackgroundColor(C0683b.m2912c(getContext(), R.color.a0h));
                return;
            }
            this.f79666i = false;
        }
    }

    /* renamed from: a */
    public final void mo79796a(String str) {
        for (String str2 : this.f79667j.keySet()) {
            C30335l lVar = (C30335l) this.f79667j.get(str2);
            if (!(str2 == null || lVar == null)) {
                if (str2.equals(str)) {
                    lVar.mo79891b(false);
                } else {
                    lVar.mo79895q();
                }
            }
        }
        if (TextUtils.equals(str, "HOME")) {
            this.f79660c.setActivated(false);
            this.f79661d.setActivated(false);
            this.f79662e.setActivated(false);
        } else {
            this.f79660c.setActivated(true);
            this.f79661d.setActivated(true);
            this.f79662e.setActivated(true);
        }
        m99058g(str);
    }

    public void setMode(TabMode tabMode) {
        this.f79664g = tabMode;
        switch (tabMode) {
            case MODE_ICON:
                C30318b bVar = new C30318b(getContext(), "HOME", this, true, false);
                this.f79659b = bVar;
                this.f79659b.setSelected(true);
                C30318b bVar2 = new C30318b(getContext(), "DISCOVER", this, false, false);
                this.f79660c = bVar2;
                C30318b bVar3 = new C30318b(getContext(), "PUBLISH", this, false, false);
                this.f79658a = bVar3;
                C30318b bVar4 = new C30318b(getContext(), "NOTIFICATION", this, false, false);
                this.f79661d = bVar4;
                C30318b bVar5 = new C30318b(getContext(), "USER", this, false, false);
                this.f79662e = bVar5;
                break;
            case MODE_MATERIAL:
                C30337n nVar = new C30337n(getContext(), "HOME", this, true, false);
                this.f79659b = nVar;
                this.f79659b.setSelected(true);
                C30337n nVar2 = new C30337n(getContext(), "DISCOVER", this, false, false);
                this.f79660c = nVar2;
                C30318b bVar6 = new C30318b(getContext(), "PUBLISH", this, false, false);
                this.f79658a = bVar6;
                C30337n nVar3 = new C30337n(getContext(), "NOTIFICATION", this, false, false);
                this.f79661d = nVar3;
                C30337n nVar4 = new C30337n(getContext(), "USER", this, false, false);
                this.f79662e = nVar4;
                break;
        }
        this.f79659b.setBackground(getContext().getResources().getDrawable(R.drawable.ug));
        this.f79660c.setBackground(getContext().getResources().getDrawable(R.drawable.ug));
        this.f79661d.setBackground(getContext().getResources().getDrawable(R.drawable.ug));
        this.f79662e.setBackground(getContext().getResources().getDrawable(R.drawable.ug));
        if (this.f79665h.getChildCount() > 0) {
            this.f79665h.removeAllViews();
        }
        this.f79659b.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo79803c("HOME");
            }
        });
        this.f79660c.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo79803c("DISCOVER");
            }
        });
        this.f79658a.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.f79658a.mo79863h();
                MainBottomTabView.this.mo79803c("PUBLISH");
            }
        });
        this.f79661d.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo79803c("NOTIFICATION");
            }
        });
        this.f79662e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                MainBottomTabView.this.mo79803c("USER");
            }
        });
        C30312a.m99099a(getContext(), this.f79659b, this.f79660c, this.f79658a, this.f79661d, this.f79662e);
        this.f79665h.addView(this.f79659b);
        this.f79665h.addView(this.f79660c);
        this.f79665h.addView(this.f79658a);
        this.f79665h.addView(this.f79661d);
        this.f79665h.addView(this.f79662e);
        m99057b();
        this.f79667j.put("HOME", this.f79659b);
        this.f79667j.put("DISCOVER", this.f79660c);
        this.f79667j.put("NOTIFICATION", this.f79661d);
        this.f79667j.put("USER", this.f79662e);
        this.f79667j.put("PUBLISH", this.f79658a);
    }

    public MainBottomTabView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo79797a(String str, int i) {
        ((C30335l) this.f79667j.get(str)).mo79854a(i);
    }

    /* renamed from: a */
    private void m99056a(String str, String str2) {
        if (TextUtils.equals(str, "HOME")) {
            this.f79660c.setActivated(false);
            this.f79661d.setActivated(false);
            this.f79662e.setActivated(false);
            this.f79658a.setActivated(false);
            return;
        }
        if (TextUtils.equals(str2, "HOME") || str2 == null) {
            this.f79660c.setActivated(true);
            this.f79661d.setActivated(true);
            this.f79662e.setActivated(true);
            this.f79658a.setActivated(true);
        }
    }

    /* renamed from: a */
    public final void mo79800a(boolean z, String str) {
        C30335l lVar = (C30335l) this.f79667j.get(str);
        if (z) {
            lVar.mo79860f();
        } else {
            lVar.mo79861g();
        }
    }

    /* renamed from: a */
    private static void m99055a(int i, int i2, View... viewArr) {
        for (int i3 = 0; i3 < 4; i3++) {
            viewArr[i3].setPadding(0, i, 0, i2);
        }
    }

    public MainBottomTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f79666i = true;
        this.f79667j = new HashMap<>();
        this.f79665h = this;
        setOrientation(0);
    }

    /* renamed from: b */
    public final void mo79802b(String str, String str2, boolean z) {
        if (str2 == null) {
            str2 = "HOME";
        }
        if (!TextUtils.equals(str, str2) && !TextUtils.equals(str, "PUBLISH")) {
            if (((C30335l) this.f79667j.get(str)) != null) {
                ((C30335l) this.f79667j.get(str)).mo79891b(z);
            }
            C30335l lVar = (C30335l) this.f79667j.get(str2);
            m99056a(str, str2);
            if (lVar != null) {
                ((C30335l) this.f79667j.get(str2)).mo79895q();
            }
            m99058g(str);
        }
    }

    /* renamed from: a */
    public final void mo79798a(final String str, final String str2, final boolean z) {
        C6726a.m20844b(new Runnable() {
            public final void run() {
                MainBottomTabView.this.mo79802b(str, str2, z);
            }
        });
    }
}
