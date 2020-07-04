package com.p280ss.android.ugc.aweme.base.activity;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11043a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.activity.AmeBaseActivity */
public abstract class AmeBaseActivity extends AmeSSActivity {

    /* renamed from: f */
    protected int f61249f;

    /* renamed from: g */
    protected int f61250g;

    /* renamed from: h */
    protected boolean f61251h;

    /* renamed from: i */
    protected View f61252i;

    /* renamed from: j */
    protected View f61253j;

    /* renamed from: k */
    protected TextView f61254k;

    /* renamed from: l */
    protected TextView f61255l;

    /* renamed from: m */
    protected TextView f61256m;

    /* renamed from: n */
    protected ProgressBar f61257n;

    /* renamed from: o */
    protected View f61258o;

    /* renamed from: p */
    protected SwipeOverlayFrameLayout f61259p;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo58708a() {
        return R.layout.n1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo60490e() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public int mo60491f() {
        return R.color.n6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo60492g() {
        onBackPressed();
    }

    /* renamed from: c */
    private void mo58711c() {
        supportRequestWindowFeature(10);
    }

    public void onResume() {
        super.onResume();
        mo59893d();
    }

    /* renamed from: d */
    private void mo59893d() {
        if (this.f61251h) {
            this.f61251h = false;
            mo60493h();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo58710b() {
        this.f61249f = mo60490e();
        if (!(this.f61249f == 1 || this.f61249f == 2)) {
            this.f61249f = 0;
        }
        this.f61252i = findViewById(R.id.cws);
        this.f61253j = findViewById(R.id.djz);
        this.f61258o = findViewById(R.id.c4f);
        if (this.f61253j != null) {
            this.f61254k = (TextView) this.f61253j.findViewById(R.id.jn);
            this.f61255l = (TextView) this.f61253j.findViewById(R.id.ctl);
            this.f61256m = (TextView) this.f61253j.findViewById(R.id.title);
            this.f61257n = (ProgressBar) this.f61253j.findViewById(R.id.cth);
        }
        if (this.f61254k != null) {
            this.f61254k.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    AmeBaseActivity.this.mo60492g();
                }
            });
        }
        View findViewById = findViewById(R.id.dee);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f61259p = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f61259p != null) {
            this.f61259p.setOnSwipeListener(new C11043a() {
                /* renamed from: a */
                public final boolean mo26721a() {
                    return false;
                }

                /* renamed from: b */
                public final boolean mo26722b() {
                    AmeBaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo60493h() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f61249f != 1) {
            if (this.f61249f == 2) {
                if (this.f61258o != null) {
                    if (this.f61251h) {
                        this.f61258o.setVisibility(0);
                        return;
                    }
                    this.f61258o.setVisibility(8);
                }
                return;
            }
            Resources resources = getResources();
            boolean z = this.f61251h;
            if (z) {
                i = R.color.n7;
            } else {
                i = mo60491f();
            }
            if (z) {
                i2 = R.drawable.u7;
            } else {
                i2 = R.drawable.u5;
            }
            if (z) {
                i3 = R.color.abv;
            } else {
                i3 = R.color.abu;
            }
            if (z) {
                i4 = R.drawable.vs;
            } else {
                i4 = R.drawable.vr;
            }
            if (z) {
                i5 = R.drawable.vm;
            } else {
                i5 = R.drawable.vl;
            }
            if (z) {
                i6 = R.color.gm;
            } else {
                i6 = R.color.gl;
            }
            ColorStateList colorStateList = resources.getColorStateList(i6);
            if (this.f61252i != null) {
                this.f61252i.setBackgroundResource(i);
            }
            if (this.f61256m != null) {
                this.f61256m.setTextColor(resources.getColor(i3));
            }
            if (this.f61253j != null) {
                this.f61253j.setBackgroundResource(i2);
            }
            if (this.f61254k != null) {
                C9738o.m28700a((View) this.f61254k, i4);
                this.f61254k.setTextColor(colorStateList);
                this.f61254k.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                this.f61254k.setCompoundDrawablesWithIntrinsicBounds(i5, 0, 0, 0);
            }
            if (this.f61255l != null) {
                C9738o.m28700a((View) this.f61255l, i4);
                this.f61255l.setTextColor(colorStateList);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f61256m != null) {
            this.f61256m.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f61250g = 0;
        super.onCreate(bundle);
        mo58711c();
        setContentView(mo58708a());
        mo58710b();
    }
}
