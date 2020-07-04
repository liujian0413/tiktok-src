package com.p280ss.android.sdk;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.sdk.a */
public final class C20095a {

    /* renamed from: a */
    Dialog f54347a;

    /* renamed from: b */
    ImageView f54348b;

    /* renamed from: c */
    TextView f54349c;

    /* renamed from: d */
    View f54350d;

    /* renamed from: e */
    public boolean f54351e;

    /* renamed from: f */
    boolean f54352f;

    /* renamed from: g */
    public boolean f54353g;

    /* renamed from: h */
    final Handler f54354h = new Handler();

    /* renamed from: i */
    final Runnable f54355i = new Runnable() {
        public final void run() {
            C20095a.this.mo53812d();
        }
    };

    /* renamed from: c */
    public final void mo53811c() {
        this.f54352f = false;
    }

    /* renamed from: a */
    public final void mo53805a() {
        if (!this.f54351e && !this.f54352f) {
            this.f54354h.removeCallbacks(this.f54355i);
            mo53812d();
            this.f54351e = true;
        }
    }

    /* renamed from: b */
    public final void mo53810b() {
        if (!this.f54351e && !this.f54352f) {
            this.f54354h.removeCallbacks(this.f54355i);
            mo53812d();
            this.f54352f = true;
        }
    }

    /* renamed from: d */
    public final void mo53812d() {
        if (!this.f54351e) {
            try {
                if (this.f54347a.isShowing()) {
                    C20115b.m66311a(this.f54347a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private void m66256e() {
        if (VERSION.SDK_INT >= 16) {
            this.f54347a.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.f54347a.getWindow().addFlags(PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: f */
    private void m66257f() {
        if (VERSION.SDK_INT >= 16) {
            int systemUiVisibility = this.f54347a.getWindow().getDecorView().getSystemUiVisibility();
            if ((systemUiVisibility & 5380) != 0) {
                this.f54347a.getWindow().getDecorView().setSystemUiVisibility(systemUiVisibility ^ 5380);
            }
            return;
        }
        this.f54347a.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
    }

    public C20095a(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f54347a = new Dialog(context, R.style.vw);
        try {
            View inflate = from.inflate(R.layout.agr, null);
            this.f54350d = inflate;
            this.f54348b = (ImageView) inflate.findViewById(R.id.ax9);
            this.f54349c = (TextView) inflate.findViewById(R.id.text);
            this.f54347a.setContentView(this.f54350d);
            this.f54347a.getWindow().addFlags(8);
            this.f54347a.getWindow().addFlags(32);
            this.f54347a.getWindow().addFlags(16);
            this.f54347a.getWindow().setLayout(-2, -2);
            this.f54347a.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo53808a(String str) {
        m66255a(null, 0, 0, str, AdError.SERVER_ERROR_CODE, 48);
    }

    /* renamed from: a */
    public final void mo53809a(boolean z) {
        this.f54353g = z;
        if (this.f54353g) {
            m66256e();
        } else {
            m66257f();
        }
    }

    /* renamed from: a */
    public final void mo53806a(int i, String str) {
        m66255a(null, i, 0, str, 3500, 17);
    }

    /* renamed from: a */
    public final void mo53807a(int i, String str, int i2, int i3) {
        m66255a(null, i, 0, str, i2, i3);
    }

    /* renamed from: a */
    private void m66255a(View view, int i, int i2, String str, int i3, int i4) {
        if (!this.f54351e && i3 > 0) {
            boolean z = true;
            boolean z2 = false;
            if (i > 0) {
                this.f54348b.setImageResource(i);
                this.f54348b.setVisibility(0);
                z2 = true;
            } else {
                this.f54348b.setVisibility(8);
            }
            if (!C6319n.m19593a(str)) {
                this.f54349c.setText(str);
            } else {
                z = z2;
            }
            if (z) {
                this.f54354h.removeCallbacks(this.f54355i);
                mo53812d();
                try {
                    this.f54347a.getWindow().setGravity(i4);
                    if (this.f54353g) {
                        m66256e();
                    }
                    this.f54347a.show();
                    this.f54354h.postDelayed(this.f54355i, (long) i3);
                } catch (Exception unused) {
                }
            }
        }
    }
}
