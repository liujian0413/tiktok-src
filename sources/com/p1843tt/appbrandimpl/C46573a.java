package com.p1843tt.appbrandimpl;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteRoundImageView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.tt.appbrandimpl.a */
public final class C46573a extends Dialog {

    /* renamed from: a */
    public C46575a f120023a;

    /* renamed from: b */
    private TextView f120024b;

    /* renamed from: c */
    private TextView f120025c;

    /* renamed from: d */
    private TextView f120026d;

    /* renamed from: e */
    private TextView f120027e;

    /* renamed from: f */
    private RemoteRoundImageView f120028f;

    /* renamed from: g */
    private TextView f120029g;

    /* renamed from: h */
    private TextView f120030h;

    /* renamed from: i */
    private RemoteImageView f120031i;

    /* renamed from: j */
    private OnClickListener f120032j = new OnClickListener() {
        public final void onClick(View view) {
            C46573a.this.dismiss();
        }
    };

    /* renamed from: com.tt.appbrandimpl.a$a */
    public static class C46575a {

        /* renamed from: a */
        public String f120034a;

        /* renamed from: b */
        public String f120035b;

        /* renamed from: c */
        public String f120036c;

        /* renamed from: d */
        public String f120037d;

        /* renamed from: e */
        public String f120038e;

        /* renamed from: f */
        public String f120039f;

        /* renamed from: g */
        public String f120040g;

        /* renamed from: h */
        public String f120041h;

        /* renamed from: i */
        public C46576b f120042i;

        /* renamed from: j */
        public C46576b f120043j;

        /* renamed from: k */
        public C46576b f120044k;

        /* renamed from: l */
        public C46576b f120045l;

        /* renamed from: m */
        public C46576b f120046m;

        /* renamed from: n */
        public boolean f120047n = true;

        /* renamed from: o */
        public OnClickListener f120048o;

        /* renamed from: p */
        public OnClickListener f120049p;

        /* renamed from: q */
        public OnClickListener f120050q;

        /* renamed from: a */
        public final C46575a mo115767a(OnClickListener onClickListener) {
            this.f120049p = onClickListener;
            return this;
        }

        /* renamed from: b */
        public final C46575a mo115772b(OnClickListener onClickListener) {
            this.f120050q = onClickListener;
            return this;
        }

        /* renamed from: a */
        public final C46575a mo115768a(String str) {
            this.f120038e = str;
            return this;
        }

        /* renamed from: a */
        public final C46575a mo115770a(boolean z) {
            this.f120047n = false;
            return this;
        }

        /* renamed from: a */
        public final C46573a mo115771a(Context context) {
            C46573a aVar = new C46573a(context);
            aVar.f120023a = this;
            return aVar;
        }

        /* renamed from: b */
        public final C46575a mo115773b(String str, C46576b bVar) {
            this.f120035b = str;
            this.f120043j = bVar;
            return this;
        }

        /* renamed from: c */
        public final C46575a mo115774c(String str, C46576b bVar) {
            this.f120036c = str;
            this.f120044k = bVar;
            return this;
        }

        /* renamed from: d */
        public final C46575a mo115775d(String str, C46576b bVar) {
            this.f120039f = str;
            this.f120045l = bVar;
            return this;
        }

        /* renamed from: e */
        public final C46575a mo115776e(String str, C46576b bVar) {
            this.f120040g = str;
            this.f120046m = bVar;
            return this;
        }

        /* renamed from: a */
        public final C46575a mo115769a(String str, C46576b bVar) {
            this.f120034a = str;
            this.f120042i = bVar;
            return this;
        }
    }

    /* renamed from: com.tt.appbrandimpl.a$b */
    public static class C46576b {

        /* renamed from: d */
        public static final C46576b f120051d = null;

        /* renamed from: a */
        public boolean f120052a;

        /* renamed from: b */
        public int f120053b = -1;

        /* renamed from: c */
        public int f120054c;

        public C46576b(boolean z, int i, int i2) {
            this.f120052a = z;
            this.f120054c = i2;
        }
    }

    /* renamed from: a */
    private void m146354a() {
        m146359f();
        m146360g();
        m146361h();
        m146362i();
        m146363j();
        m146356c();
        m146358e();
        m146357d();
    }

    /* renamed from: b */
    private void m146355b() {
        if (this.f120023a.f120049p != null) {
            this.f120029g.setOnClickListener(this.f120023a.f120049p);
        }
        if (this.f120023a.f120050q != null) {
            this.f120030h.setOnClickListener(this.f120023a.f120050q);
        }
    }

    /* renamed from: c */
    private void m146356c() {
        if (this.f120023a.f120047n) {
            C23323e.m76514a((RemoteImageView) this.f120028f, this.f120023a.f120038e);
        } else {
            this.f120028f.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m146357d() {
        if (!TextUtils.isEmpty(this.f120023a.f120037d)) {
            this.f120027e.setVisibility(0);
            this.f120027e.setText(this.f120023a.f120037d);
            if (this.f120023a.f120048o != null) {
                this.f120027e.setOnClickListener(this.f120023a.f120048o);
            }
        } else {
            this.f120027e.setVisibility(8);
        }
    }

    /* renamed from: e */
    private void m146358e() {
        if (!TextUtils.isEmpty(this.f120023a.f120041h)) {
            C23323e.m76514a(this.f120031i, this.f120023a.f120041h);
            LayoutParams layoutParams = (LayoutParams) this.f120028f.getLayoutParams();
            layoutParams.topMargin = (int) C9738o.m28708b(getContext(), 80.0f);
            this.f120028f.setLayoutParams(layoutParams);
            this.f120031i.setVisibility(0);
            return;
        }
        this.f120031i.setVisibility(8);
        LayoutParams layoutParams2 = (LayoutParams) this.f120028f.getLayoutParams();
        layoutParams2.topMargin = (int) C9738o.m28708b(getContext(), 20.0f);
        this.f120028f.setLayoutParams(layoutParams2);
    }

    /* renamed from: f */
    private void m146359f() {
        if (!TextUtils.isEmpty(this.f120023a.f120034a)) {
            this.f120024b.setText(this.f120023a.f120034a);
            C46576b bVar = this.f120023a.f120042i;
            if (bVar != C46576b.f120051d) {
                if (bVar.f120052a) {
                    this.f120024b.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar.f120054c != -1) {
                    this.f120024b.setTextColor(bVar.f120054c);
                }
                if (bVar.f120053b != -1) {
                    this.f120024b.setTextSize((float) bVar.f120053b);
                }
            }
            return;
        }
        this.f120024b.setVisibility(8);
    }

    /* renamed from: g */
    private void m146360g() {
        if (!TextUtils.isEmpty(this.f120023a.f120035b)) {
            this.f120025c.setText(this.f120023a.f120035b);
            this.f120025c.setVisibility(0);
            C46576b bVar = this.f120023a.f120043j;
            if (bVar != C46576b.f120051d) {
                if (bVar.f120052a) {
                    this.f120025c.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar.f120054c != -1) {
                    this.f120025c.setTextColor(bVar.f120054c);
                }
                if (bVar.f120053b != -1) {
                    this.f120025c.setTextSize((float) bVar.f120053b);
                }
            }
            return;
        }
        this.f120025c.setVisibility(8);
    }

    /* renamed from: h */
    private void m146361h() {
        if (!TextUtils.isEmpty(this.f120023a.f120036c)) {
            this.f120026d.setText(this.f120023a.f120036c);
            this.f120026d.setMovementMethod(new ScrollingMovementMethod());
            C46576b bVar = this.f120023a.f120044k;
            if (bVar != C46576b.f120051d) {
                if (bVar.f120052a) {
                    this.f120026d.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar.f120054c != -1) {
                    this.f120026d.setTextColor(bVar.f120054c);
                }
                if (bVar.f120053b != -1) {
                    this.f120026d.setTextSize((float) bVar.f120053b);
                }
            }
            return;
        }
        this.f120026d.setVisibility(8);
    }

    /* renamed from: i */
    private void m146362i() {
        if (!TextUtils.isEmpty(this.f120023a.f120039f)) {
            this.f120029g.setText(this.f120023a.f120039f);
            C46576b bVar = this.f120023a.f120045l;
            if (bVar != C46576b.f120051d) {
                if (bVar.f120052a) {
                    this.f120029g.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar.f120054c != -1) {
                    this.f120029g.setTextColor(bVar.f120054c);
                }
                if (bVar.f120053b != -1) {
                    this.f120029g.setTextSize((float) bVar.f120053b);
                }
            }
            return;
        }
        this.f120029g.setVisibility(8);
        this.f120030h.setBackgroundResource(R.drawable.ss);
    }

    /* renamed from: j */
    private void m146363j() {
        if (!TextUtils.isEmpty(this.f120023a.f120040g)) {
            this.f120030h.setText(this.f120023a.f120040g);
            C46576b bVar = this.f120023a.f120046m;
            if (bVar != C46576b.f120051d) {
                if (bVar.f120052a) {
                    this.f120030h.setTypeface(Typeface.DEFAULT_BOLD);
                }
                if (bVar.f120054c != -1) {
                    this.f120030h.setTextColor(bVar.f120054c);
                }
                if (bVar.f120053b != -1) {
                    this.f120030h.setTextSize((float) bVar.f120053b);
                }
            }
            return;
        }
        this.f120030h.setVisibility(8);
    }

    public C46573a(Context context) {
        super(context, R.style.uu);
    }

    /* renamed from: a */
    public final void mo115763a(OnClickListener onClickListener) {
        if (this.f120023a != null) {
            this.f120023a.mo115772b(onClickListener);
            return;
        }
        throw new IllegalStateException("You must init Builder first !");
    }

    /* renamed from: b */
    public final void mo115764b(OnClickListener onClickListener) {
        if (this.f120023a != null) {
            this.f120023a.mo115767a(onClickListener);
            return;
        }
        throw new IllegalStateException("You must init Builder first !");
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b4c);
        this.f120026d = (TextView) findViewById(R.id.e6j);
        this.f120027e = (TextView) findViewById(R.id.tj);
        this.f120024b = (TextView) findViewById(R.id.e7d);
        this.f120025c = (TextView) findViewById(R.id.e7_);
        this.f120029g = (TextView) findViewById(R.id.e72);
        this.f120030h = (TextView) findViewById(R.id.e7g);
        this.f120028f = (RemoteRoundImageView) findViewById(R.id.ayz);
        this.f120031i = (RemoteImageView) findViewById(R.id.dlx);
        this.f120029g.setOnClickListener(this.f120032j);
        this.f120030h.setOnClickListener(this.f120032j);
        m146354a();
        m146355b();
    }
}
