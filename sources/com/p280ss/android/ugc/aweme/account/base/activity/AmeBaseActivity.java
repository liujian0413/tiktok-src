package com.p280ss.android.ugc.aweme.account.base.activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11043a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.base.activity.AmeBaseActivity */
public abstract class AmeBaseActivity extends AmeSSActivity {

    /* renamed from: a */
    protected int f56699a;

    /* renamed from: b */
    protected int f56700b;

    /* renamed from: c */
    protected View f56701c;

    /* renamed from: d */
    protected View f56702d;

    /* renamed from: e */
    public TextView f56703e;

    /* renamed from: f */
    public TextView f56704f;

    /* renamed from: g */
    public TextView f56705g;

    /* renamed from: h */
    protected ProgressBar f56706h;

    /* renamed from: i */
    protected View f56707i;

    /* renamed from: j */
    protected SwipeOverlayFrameLayout f56708j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo56948a() {
        return R.layout.n1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo56986d() {
        onBackPressed();
    }

    /* renamed from: e */
    private void mo58141e() {
        supportRequestWindowFeature(10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo56985c() {
        this.f56699a = 0;
        if (!(this.f56699a == 1 || this.f56699a == 2)) {
            this.f56699a = 0;
        }
        this.f56701c = findViewById(R.id.cws);
        this.f56702d = findViewById(R.id.djz);
        this.f56707i = findViewById(R.id.c4f);
        if (this.f56702d != null) {
            this.f56703e = (TextView) this.f56702d.findViewById(R.id.jn);
            this.f56704f = (TextView) this.f56702d.findViewById(R.id.ctl);
            this.f56705g = (TextView) this.f56702d.findViewById(R.id.title);
            this.f56706h = (ProgressBar) this.f56702d.findViewById(R.id.cth);
        }
        if (this.f56703e != null) {
            this.f56703e.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    AmeBaseActivity.this.mo56986d();
                }
            });
        }
        View findViewById = findViewById(R.id.dee);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f56708j = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f56708j != null) {
            this.f56708j.setOnSwipeListener(new C11043a() {
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

    public void setTitle(CharSequence charSequence) {
        if (this.f56705g != null) {
            this.f56705g.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f56700b = 0;
        super.onCreate(bundle);
        mo58141e();
        setContentView(mo56948a());
        mo56985c();
    }
}
