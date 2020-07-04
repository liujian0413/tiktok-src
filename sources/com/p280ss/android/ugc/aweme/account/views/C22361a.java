package com.p280ss.android.ugc.aweme.account.views;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.views.a */
public final class C22361a extends Dialog {

    /* renamed from: a */
    public C22363a f59644a;

    /* renamed from: b */
    private TextView f59645b;

    /* renamed from: c */
    private TextView f59646c;

    /* renamed from: d */
    private TextView f59647d;

    /* renamed from: e */
    private TextView f59648e;

    /* renamed from: f */
    private ImageView f59649f;

    /* renamed from: g */
    private TextView f59650g;

    /* renamed from: h */
    private TextView f59651h;

    /* renamed from: i */
    private LinearLayout f59652i;

    /* renamed from: j */
    private OnClickListener f59653j = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22361a.this.dismiss();
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.account.views.a$a */
    public static class C22363a {

        /* renamed from: a */
        public String f59655a;

        /* renamed from: b */
        public String f59656b;

        /* renamed from: c */
        public String f59657c;

        /* renamed from: d */
        public int f59658d = -1;

        /* renamed from: e */
        public String f59659e;

        /* renamed from: f */
        public int f59660f = -1;

        /* renamed from: g */
        public int f59661g;

        /* renamed from: h */
        public String f59662h;

        /* renamed from: i */
        public String f59663i;

        /* renamed from: j */
        public OnClickListener f59664j;

        /* renamed from: k */
        public OnClickListener f59665k;

        /* renamed from: l */
        public OnClickListener f59666l;

        /* renamed from: a */
        public final C22363a mo58786a(OnClickListener onClickListener) {
            this.f59665k = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C22363a mo58789b(OnClickListener onClickListener) {
            this.f59666l = onClickListener;
            return this;
        }

        /* renamed from: c */
        public final C22363a mo58791c(String str) {
            this.f59662h = str;
            return this;
        }

        /* renamed from: d */
        public final C22363a mo58792d(String str) {
            this.f59663i = str;
            return this;
        }

        /* renamed from: a */
        public final C22363a mo58785a(int i) {
            this.f59661g = R.drawable.b7m;
            return this;
        }

        /* renamed from: b */
        public final C22363a mo58790b(String str) {
            this.f59657c = str;
            return this;
        }

        /* renamed from: a */
        public final C22363a mo58787a(String str) {
            this.f59655a = str;
            return this;
        }

        /* renamed from: a */
        public final C22361a mo58788a(Context context) {
            C22361a aVar = new C22361a(context);
            aVar.f59644a = this;
            return aVar;
        }
    }

    public C22361a(Context context) {
        super(context, R.style.uu);
    }

    /* renamed from: a */
    public final void mo58781a(OnClickListener onClickListener) {
        if (this.f59644a != null) {
            this.f59644a.mo58789b(onClickListener);
            return;
        }
        throw new IllegalStateException("You must init Builder first !");
    }

    /* renamed from: b */
    public final void mo58782b(OnClickListener onClickListener) {
        if (this.f59644a != null) {
            this.f59644a.mo58786a(onClickListener);
            return;
        }
        throw new IllegalStateException("You must init Builder first !");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b4d);
        this.f59647d = (TextView) findViewById(R.id.e6j);
        this.f59648e = (TextView) findViewById(R.id.tj);
        this.f59645b = (TextView) findViewById(R.id.e7d);
        this.f59646c = (TextView) findViewById(R.id.e7_);
        this.f59650g = (TextView) findViewById(R.id.e72);
        this.f59651h = (TextView) findViewById(R.id.e7g);
        this.f59649f = (ImageView) findViewById(R.id.ayz);
        this.f59652i = (LinearLayout) findViewById(R.id.a1q);
        this.f59650g.setOnClickListener(this.f59653j);
        this.f59651h.setOnClickListener(this.f59653j);
        if (!TextUtils.isEmpty(this.f59644a.f59655a)) {
            this.f59645b.setText(this.f59644a.f59655a);
        }
        if (!TextUtils.isEmpty(this.f59644a.f59656b)) {
            this.f59646c.setText(this.f59644a.f59656b);
            this.f59646c.setVisibility(0);
        } else {
            this.f59646c.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f59644a.f59657c)) {
            this.f59647d.setText(this.f59644a.f59657c);
            this.f59647d.setMovementMethod(new ScrollingMovementMethod());
            if (this.f59644a.f59658d != -1) {
                this.f59647d.setTextColor(this.f59644a.f59658d);
            }
        } else {
            this.f59647d.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f59644a.f59659e)) {
            this.f59648e.setVisibility(0);
            this.f59648e.setText(this.f59644a.f59659e);
            if (this.f59644a.f59660f != -1) {
                this.f59648e.setTextColor(this.f59644a.f59660f);
            }
            if (this.f59644a.f59664j != null) {
                this.f59648e.setOnClickListener(this.f59644a.f59664j);
            }
        } else {
            this.f59648e.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f59644a.f59662h)) {
            this.f59650g.setText(this.f59644a.f59662h);
        } else {
            this.f59650g.setVisibility(8);
            this.f59651h.setBackgroundResource(R.drawable.ss);
        }
        if (!TextUtils.isEmpty(this.f59644a.f59663i)) {
            this.f59651h.setText(this.f59644a.f59663i);
        } else {
            this.f59651h.setVisibility(8);
        }
        this.f59649f.setImageResource(this.f59644a.f59661g);
        if (this.f59644a.f59661g == 0) {
            findViewById(R.id.az0).setVisibility(8);
            this.f59649f.setVisibility(8);
            LayoutParams layoutParams = (LayoutParams) this.f59652i.getLayoutParams();
            layoutParams.topMargin = 0;
            this.f59652i.setLayoutParams(layoutParams);
        }
        if (this.f59644a.f59665k != null) {
            this.f59650g.setOnClickListener(this.f59644a.f59665k);
        }
        if (this.f59644a.f59666l != null) {
            this.f59651h.setOnClickListener(this.f59644a.f59666l);
        }
    }
}
