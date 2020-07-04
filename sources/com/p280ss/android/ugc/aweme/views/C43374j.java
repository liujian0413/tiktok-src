package com.p280ss.android.ugc.aweme.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.views.j */
public class C43374j extends Dialog {

    /* renamed from: a */
    private static final int f112343a = ((int) C9738o.m28708b(C6399b.m19921a(), 20.0f));

    /* renamed from: h */
    protected int f112344h;

    /* renamed from: i */
    protected int f112345i;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo73992c() {
    }

    /* renamed from: a */
    private int mo71375a() {
        return C9738o.m28691a(getContext()) - (f112343a * 2);
    }

    /* renamed from: b */
    private int mo71376b() {
        return C9738o.m28709b(getContext()) - (f112343a * 4);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f112344h, this.f112345i);
        }
    }

    public C43374j(Context context, int i, boolean z, boolean z2) {
        this(context, R.style.uu, false, z2, false);
    }

    public C43374j(Context context, int i, int i2, int i3) {
        super(context, R.style.w2);
        this.f112344h = C9738o.m28691a(getContext()) + 0;
        this.f112345i = C9738o.m28709b(getContext()) + 0;
        requestWindowFeature(1);
        mo73992c();
    }

    public C43374j(Context context, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        super(context, i);
        requestWindowFeature(1);
        int i3 = -1;
        if (z3) {
            i2 = -2;
        } else if (z) {
            i2 = -1;
        } else {
            i2 = mo71375a();
        }
        this.f112344h = i2;
        if (!z) {
            if (z2) {
                i3 = -2;
            } else {
                i3 = mo71376b();
            }
        }
        this.f112345i = i3;
        mo73992c();
    }
}
