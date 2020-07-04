package com.bytedance.ies.uikit.p577b;

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

/* renamed from: com.bytedance.ies.uikit.b.c */
public final class C11002c {

    /* renamed from: a */
    Dialog f29778a;

    /* renamed from: b */
    ImageView f29779b;

    /* renamed from: c */
    TextView f29780c;

    /* renamed from: d */
    View f29781d;

    /* renamed from: e */
    public boolean f29782e;

    /* renamed from: f */
    boolean f29783f;

    /* renamed from: g */
    public boolean f29784g;

    /* renamed from: h */
    final Handler f29785h;

    /* renamed from: i */
    final Runnable f29786i;

    /* renamed from: a */
    public final void mo26582a() {
        if (!this.f29782e && !this.f29783f) {
            this.f29785h.removeCallbacks(this.f29786i);
            mo26585b();
            this.f29782e = true;
        }
    }

    /* renamed from: b */
    public final void mo26585b() {
        if (!this.f29782e) {
            try {
                if (this.f29778a.isShowing()) {
                    C11004d.m32259a(this.f29778a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: c */
    private void m32254c() {
        if (VERSION.SDK_INT >= 16) {
            this.f29778a.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.f29778a.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    public C11002c(Context context) {
        this(context, -1, -2, 17);
    }

    /* renamed from: a */
    public final void mo26583a(String str, int i) {
        m32253a(null, 0, 0, str, AdError.SERVER_ERROR_CODE, 17);
    }

    /* renamed from: a */
    public final void mo26584a(String str, int i, int i2) {
        m32253a(null, 0, 0, str, i, 17);
    }

    public C11002c(Context context, int i, int i2, int i3) {
        this.f29785h = new Handler();
        this.f29786i = new Runnable() {
            public final void run() {
                C11002c.this.mo26585b();
            }
        };
        LayoutInflater from = LayoutInflater.from(context);
        this.f29778a = new Dialog(context, R.style.vw);
        try {
            View inflate = from.inflate(R.layout.agr, null);
            this.f29781d = inflate;
            this.f29779b = (ImageView) inflate.findViewById(R.id.ax9);
            this.f29780c = (TextView) inflate.findViewById(R.id.text);
            this.f29778a.setContentView(this.f29781d);
            this.f29778a.getWindow().addFlags(8);
            this.f29778a.getWindow().addFlags(32);
            this.f29778a.getWindow().addFlags(16);
            this.f29778a.getWindow().setLayout(i, -2);
            this.f29778a.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private void m32253a(View view, int i, int i2, String str, int i3, int i4) {
        if (!this.f29782e && i3 > 0) {
            boolean z = false;
            this.f29779b.setVisibility(8);
            if (!C6319n.m19593a(str)) {
                this.f29780c.setText(str);
                z = true;
            }
            if (z) {
                this.f29785h.removeCallbacks(this.f29786i);
                mo26585b();
                try {
                    this.f29778a.getWindow().setGravity(i4);
                    if (this.f29784g) {
                        m32254c();
                    }
                    this.f29778a.show();
                    this.f29785h.postDelayed(this.f29786i, (long) i3);
                } catch (Exception unused) {
                }
            }
        }
    }
}
