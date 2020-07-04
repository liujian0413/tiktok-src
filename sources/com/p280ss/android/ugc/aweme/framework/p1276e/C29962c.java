package com.p280ss.android.ugc.aweme.framework.p1276e;

import android.app.Dialog;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.framework.e.c */
public final class C29962c {

    /* renamed from: a */
    Dialog f78754a;

    /* renamed from: b */
    ImageView f78755b;

    /* renamed from: c */
    TextView f78756c;

    /* renamed from: d */
    View f78757d;

    /* renamed from: e */
    public boolean f78758e;

    /* renamed from: f */
    boolean f78759f;

    /* renamed from: g */
    public boolean f78760g;

    /* renamed from: h */
    final Handler f78761h = new Handler();

    /* renamed from: i */
    final Runnable f78762i = new Runnable() {
        public final void run() {
            C29962c.this.mo76126d();
        }
    };

    /* renamed from: c */
    public final void mo76125c() {
        this.f78759f = false;
    }

    /* renamed from: a */
    public final void mo76117a() {
        if (!this.f78758e && !this.f78759f) {
            this.f78761h.removeCallbacks(this.f78762i);
            mo76126d();
            this.f78758e = true;
        }
    }

    /* renamed from: b */
    public final void mo76122b() {
        if (!this.f78758e && !this.f78759f) {
            this.f78761h.removeCallbacks(this.f78762i);
            mo76126d();
            this.f78759f = true;
        }
    }

    /* renamed from: d */
    public final void mo76126d() {
        if (!this.f78758e) {
            try {
                if (this.f78754a.isShowing()) {
                    C29964d.m98245a(this.f78754a);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: e */
    private void m98234e() {
        if (VERSION.SDK_INT >= 16) {
            this.f78754a.getWindow().getDecorView().setSystemUiVisibility(5380);
        } else {
            this.f78754a.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: b */
    public final void mo76124b(String str) {
        m98233a(null, 0, 0, str, 3500, 17);
    }

    public C29962c(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        this.f78754a = new Dialog(context, R.style.vw);
        try {
            View inflate = from.inflate(R.layout.agr, null);
            this.f78757d = inflate;
            this.f78755b = (ImageView) inflate.findViewById(R.id.ax9);
            this.f78756c = (TextView) inflate.findViewById(R.id.text);
            double width = (double) ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getWidth();
            Double.isNaN(width);
            this.f78756c.setMaxWidth((int) ((width * 0.68d) - 80.0d));
            this.f78754a.setContentView(this.f78757d);
            this.f78754a.getWindow().addFlags(8);
            this.f78754a.getWindow().addFlags(32);
            this.f78754a.getWindow().addFlags(16);
            this.f78754a.getWindow().setLayout(-2, -2);
            this.f78754a.getWindow().setGravity(17);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo76120a(String str) {
        m98233a(null, 0, 0, str, AdError.SERVER_ERROR_CODE, 17);
    }

    /* renamed from: a */
    public final void mo76118a(int i, String str) {
        m98233a(null, i, 0, str, 3500, 17);
    }

    /* renamed from: b */
    public final void mo76123b(int i, String str) {
        m98233a(null, i, 0, str, AdError.SERVER_ERROR_CODE, 17);
    }

    /* renamed from: a */
    public final void mo76121a(String str, int i, int i2) {
        m98233a(null, 0, 0, str, i, i2);
    }

    /* renamed from: a */
    public final void mo76119a(int i, String str, int i2, int i3) {
        m98233a(null, i, 0, str, i2, i3);
    }

    /* renamed from: a */
    private void m98233a(View view, int i, int i2, String str, int i3, int i4) {
        if (!this.f78758e && i3 > 0) {
            boolean z = true;
            boolean z2 = false;
            if (i > 0) {
                this.f78755b.setImageResource(i);
                this.f78755b.setVisibility(0);
                z2 = true;
            } else {
                this.f78755b.setVisibility(8);
            }
            if (!C6319n.m19593a(str)) {
                this.f78756c.setText(str);
            } else {
                z = z2;
            }
            if (z) {
                this.f78761h.removeCallbacks(this.f78762i);
                mo76126d();
                try {
                    this.f78754a.getWindow().setGravity(17);
                    if (this.f78760g) {
                        m98234e();
                    }
                    this.f78754a.show();
                    this.f78761h.postDelayed(this.f78762i, (long) i3);
                } catch (Exception unused) {
                }
            }
        }
    }
}
