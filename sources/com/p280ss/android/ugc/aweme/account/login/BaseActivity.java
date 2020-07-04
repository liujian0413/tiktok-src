package com.p280ss.android.ugc.aweme.account.login;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.base.SSActivity;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11043a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.BaseActivity */
public class BaseActivity extends SSActivity {

    /* renamed from: b */
    protected int f57082b;

    /* renamed from: c */
    protected int f57083c;

    /* renamed from: d */
    protected View f57084d;

    /* renamed from: e */
    protected View f57085e;

    /* renamed from: f */
    public TextView f57086f;

    /* renamed from: g */
    public TextView f57087g;

    /* renamed from: h */
    public TextView f57088h;

    /* renamed from: i */
    protected ProgressBar f57089i;

    /* renamed from: j */
    protected View f57090j;

    /* renamed from: k */
    protected SwipeOverlayFrameLayout f57091k;

    /* access modifiers changed from: protected */
    /* renamed from: V_ */
    public final void mo57174V_() {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo57175a() {
        return R.layout.n1;
    }

    /* renamed from: d */
    private void mo57312d() {
        supportRequestWindowFeature(10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo57176b() {
        this.f57082b = 0;
        if (!(this.f57082b == 1 || this.f57082b == 2)) {
            this.f57082b = 0;
        }
        this.f57084d = findViewById(R.id.cws);
        this.f57085e = findViewById(R.id.djz);
        this.f57090j = findViewById(R.id.c4f);
        if (this.f57085e != null) {
            this.f57086f = (TextView) this.f57085e.findViewById(R.id.jn);
            this.f57087g = (TextView) this.f57085e.findViewById(R.id.ctl);
            this.f57088h = (TextView) this.f57085e.findViewById(R.id.title);
            this.f57089i = (ProgressBar) this.f57085e.findViewById(R.id.cth);
        }
        if (this.f57086f != null) {
            m71541a(this.f57086f);
            this.f57086f.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    BaseActivity.this.mo57174V_();
                }
            });
        }
        View findViewById = findViewById(R.id.dee);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f57091k = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f57091k != null) {
            this.f57091k.setOnSwipeListener(new C11043a() {
                /* renamed from: a */
                public final boolean mo26721a() {
                    return false;
                }

                /* renamed from: b */
                public final boolean mo26722b() {
                    BaseActivity.this.onBackPressed();
                    return true;
                }
            });
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (this.f57088h != null) {
            this.f57088h.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f57083c = 0;
        super.onCreate(bundle);
        mo57312d();
        setContentView(mo57175a());
        mo57176b();
    }

    /* renamed from: a */
    private static void m71541a(TextView textView) {
        if (VERSION.SDK_INT >= 19) {
            Drawable background = textView.getBackground();
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (background != null) {
                background.setAutoMirrored(true);
            }
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setAutoMirrored(true);
                }
            }
            for (Drawable drawable2 : compoundDrawablesRelative) {
                if (drawable2 != null) {
                    drawable2.setAutoMirrored(true);
                }
            }
        }
    }
}
