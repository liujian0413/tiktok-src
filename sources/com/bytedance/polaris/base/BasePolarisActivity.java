package com.bytedance.polaris.base;

import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.polaris.p634b.C12352g;
import com.bytedance.polaris.p634b.C12352g.C12353a;
import com.bytedance.polaris.widget.SwipeOverlayFrameLayout;
import com.bytedance.polaris.widget.SwipeOverlayFrameLayout.C12439a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public abstract class BasePolarisActivity extends AbsPolarisActivity {

    /* renamed from: d */
    protected boolean f32826d;

    /* renamed from: e */
    protected View f32827e;

    /* renamed from: f */
    protected ViewGroup f32828f;

    /* renamed from: g */
    protected TextView f32829g;

    /* renamed from: h */
    public TextView f32830h;

    /* renamed from: i */
    protected TextView f32831i;

    /* renamed from: j */
    protected ProgressBar f32832j;

    /* renamed from: k */
    protected View f32833k;

    /* renamed from: l */
    protected SwipeOverlayFrameLayout f32834l;

    /* renamed from: m */
    public C12352g f32835m;

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo30206d() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public boolean mo30207e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo30208f() {
        onBackPressed();
    }

    /* renamed from: i */
    private void mo30219i() {
        requestWindowFeature(10);
    }

    /* renamed from: j */
    private void mo30220j() {
        if (this.f32826d) {
            this.f32826d = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12353a mo30204b() {
        return new C12353a();
    }

    public void onResume() {
        super.onResume();
        mo30220j();
    }

    /* renamed from: h */
    public final void mo30209h() {
        if (this.f32828f != null) {
            this.f32828f.setVisibility(8);
        }
    }

    /* renamed from: o_ */
    public final void mo30210o_() {
        if (this.f32828f != null) {
            this.f32828f.setVisibility(0);
        }
    }

    public void onContentChanged() {
        super.onContentChanged();
        if (this.f32835m != null) {
            this.f32835m.mo30193b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo30205c() {
        this.f32827e = findViewById(R.id.cws);
        this.f32828f = (ViewGroup) findViewById(R.id.djz);
        this.f32833k = findViewById(R.id.c4f);
        if (this.f32828f != null) {
            this.f32829g = (TextView) this.f32828f.findViewById(R.id.jn);
            this.f32830h = (TextView) this.f32828f.findViewById(R.id.ctl);
            this.f32831i = (TextView) this.f32828f.findViewById(R.id.title);
            this.f32832j = (ProgressBar) this.f32828f.findViewById(R.id.cth);
        }
        if (this.f32829g != null) {
            this.f32829g.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    BasePolarisActivity.this.mo30208f();
                }
            });
        }
        View findViewById = findViewById(R.id.dee);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f32834l = (SwipeOverlayFrameLayout) findViewById;
        }
        if (mo30206d() && this.f32834l != null) {
            this.f32834l.setOnSwipeListener(new C12439a() {
                /* renamed from: a */
                public final boolean mo30213a() {
                    if (!BasePolarisActivity.this.mo30206d() || !BasePolarisActivity.this.mo30207e()) {
                        return false;
                    }
                    BasePolarisActivity.this.onBackPressed();
                    return true;
                }

                /* renamed from: b */
                public final boolean mo30214b() {
                    if (!BasePolarisActivity.this.mo30206d() || BasePolarisActivity.this.mo30207e()) {
                        return false;
                    }
                    BasePolarisActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f32831i != null) {
            this.f32831i.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        mo30219i();
        try {
            this.f32835m = new C12352g(this, mo30204b());
            this.f32835m.mo30192a();
        } catch (Throwable unused) {
        }
        super.onCreate(bundle);
        try {
            setContentView((int) R.layout.age);
            mo30205c();
        } catch (NotFoundException unused2) {
            finish();
        }
    }
}
