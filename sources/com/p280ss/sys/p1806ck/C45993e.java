package com.p280ss.sys.p1806ck;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager.LayoutParams;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.sys.p1806ck.C45987b.C45990a;
import com.p280ss.sys.p1806ck.p1807a.C45978e.C45979a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.sys.ck.e */
public final class C45993e extends Dialog {

    /* renamed from: a */
    protected SCWebView f117537a;

    /* renamed from: b */
    private Activity f117538b;

    /* renamed from: c */
    private int f117539c;

    /* renamed from: d */
    private int f117540d;

    /* renamed from: e */
    private String f117541e;

    /* renamed from: f */
    private C45990a f117542f;

    /* renamed from: g */
    private boolean f117543g;

    /* renamed from: h */
    private String f117544h;

    public C45993e(Activity activity, int i, int i2, View view, int i3, String str, String str2) {
        super(activity, R.style.gb);
        setContentView(view);
        this.f117538b = activity;
        this.f117541e = str;
        this.f117544h = str2;
        setCancelable(true);
    }

    /* renamed from: a */
    private void m144190a() {
        DisplayMetrics displayMetrics = this.f117538b.getResources().getDisplayMetrics();
        this.f117539c = displayMetrics.heightPixels;
        this.f117540d = displayMetrics.widthPixels;
        float f = displayMetrics.density;
        if (this.f117539c < this.f117540d) {
            this.f117540d = (this.f117539c * 3) / 4;
        }
        this.f117540d = (this.f117540d * 4) / 5;
        this.f117539c = (int) (((float) this.f117540d) * this.f117542f.f117531b);
        if (((int) ((((float) this.f117540d) / f) + 0.5f)) < this.f117542f.f117532c) {
            this.f117540d = (int) (((float) this.f117542f.f117532c) * f);
            this.f117539c = (int) (displayMetrics.density * ((float) this.f117542f.f117532c) * this.f117542f.f117531b);
        }
        LayoutParams attributes = getWindow().getAttributes();
        attributes.width = this.f117540d;
        attributes.height = this.f117539c;
        if (C45987b.f117524c >= 0.0f) {
            attributes.dimAmount = C45987b.f117524c;
        }
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
    }

    /* renamed from: a */
    public final void mo111337a(int i) {
        this.f117542f = C45987b.f117525d.containsKey(Integer.valueOf(i)) ? (C45990a) C45987b.f117525d.get(Integer.valueOf(i)) : new C45990a(Integer.valueOf(1005), 1.1533333f, C34943c.f91127w);
    }

    public final void dismiss() {
        this.f117543g = false;
        if (this.f117537a != null) {
            ViewParent parent = this.f117537a.getParent();
            if (parent != null) {
                new C45979a(this.f117537a.getActionList().toString()).start();
                SCWebView sCWebView = this.f117537a;
                StringBuilder sb = new StringBuilder("javascript:prompt('");
                sb.append(C45987b.f117522a);
                sb.append("',points.getLogToString())");
                sCWebView.loadUrl(sb.toString());
                ((ViewGroup) parent).removeView(this.f117537a);
            }
            this.f117537a.removeAllViews();
        }
        if (this.f117538b != null && !this.f117538b.isFinishing()) {
            C45994f.m144193a(this);
        }
        this.f117538b = null;
    }

    public final void hide() {
        this.f117543g = false;
        super.hide();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m144190a();
        this.f117537a = (SCWebView) findViewById(R.id.d1m);
        this.f117537a.mo111300a();
        this.f117537a.mo111301a(this.f117541e, this.f117544h);
        this.f117537a.loadUrl(this.f117541e);
        this.f117537a.buildLayer();
    }

    public final void show() {
        super.show();
        this.f117543g = true;
    }
}
