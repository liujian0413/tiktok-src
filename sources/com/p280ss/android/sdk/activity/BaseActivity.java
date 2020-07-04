package com.p280ss.android.sdk.activity;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout;
import com.bytedance.ies.uikit.layout.SwipeOverlayFrameLayout.C11043a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.sdk.activity.BaseActivity */
public class BaseActivity extends SSActivity {

    /* renamed from: a */
    protected int f54386a;

    /* renamed from: b */
    protected int f54387b;

    /* renamed from: c */
    protected View f54388c;

    /* renamed from: d */
    protected View f54389d;

    /* renamed from: e */
    protected TextView f54390e;

    /* renamed from: f */
    protected TextView f54391f;

    /* renamed from: g */
    protected TextView f54392g;

    /* renamed from: h */
    protected ProgressBar f54393h;

    /* renamed from: i */
    protected View f54394i;

    /* renamed from: j */
    protected SwipeOverlayFrameLayout f54395j;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo53821a() {
        onBackPressed();
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: b */
    private void m66279b() {
        supportRequestWindowFeature(10);
    }

    /* renamed from: c */
    private void m66280c() {
        this.f54386a = 0;
        if (!(this.f54386a == 1 || this.f54386a == 2)) {
            this.f54386a = 0;
        }
        this.f54388c = findViewById(R.id.cws);
        this.f54389d = findViewById(R.id.djz);
        this.f54394i = findViewById(R.id.c4f);
        if (this.f54389d != null) {
            this.f54390e = (TextView) this.f54389d.findViewById(R.id.jn);
            this.f54391f = (TextView) this.f54389d.findViewById(R.id.ctl);
            this.f54392g = (TextView) this.f54389d.findViewById(R.id.title);
            this.f54393h = (ProgressBar) this.f54389d.findViewById(R.id.cth);
        }
        if (this.f54390e != null) {
            m66278a(this.f54390e);
            this.f54390e.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    BaseActivity.this.mo53821a();
                }
            });
        }
        View findViewById = findViewById(R.id.dee);
        if (findViewById != null && (findViewById instanceof SwipeOverlayFrameLayout)) {
            this.f54395j = (SwipeOverlayFrameLayout) findViewById;
        }
        if (this.f54395j != null) {
            this.f54395j.setOnSwipeListener(new C11043a() {
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
        if (this.f54392g != null) {
            this.f54392g.setText(charSequence);
        }
    }

    public void onCreate(Bundle bundle) {
        this.f54387b = 0;
        super.onCreate(bundle);
        m66279b();
        setContentView((int) R.layout.n1);
        m66280c();
    }

    /* renamed from: a */
    private static void m66278a(TextView textView) {
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
