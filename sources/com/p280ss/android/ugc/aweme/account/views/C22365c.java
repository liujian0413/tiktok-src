package com.p280ss.android.ugc.aweme.account.views;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.views.c */
public class C22365c extends Dialog {

    /* renamed from: a */
    private static final int f59669a = ((int) C9738o.m28708b((Context) C21671bd.m72532b(), 20.0f));

    /* renamed from: b */
    private int f59670b;

    /* renamed from: c */
    private int f59671c;

    /* renamed from: a */
    private int mo57229a() {
        return C9738o.m28691a(getContext()) - (f59669a * 2);
    }

    /* renamed from: b */
    private int mo57234b() {
        return C9738o.m28709b(getContext()) - (f59669a * 4);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(this.f59670b, this.f59671c);
        }
    }

    public C22365c(Context context, int i, boolean z, boolean z2) {
        int i2;
        super(context, R.style.uu);
        requestWindowFeature(1);
        int i3 = -1;
        if (z) {
            i2 = -1;
        } else {
            i2 = mo57229a();
        }
        this.f59670b = i2;
        if (!z) {
            if (z2) {
                i3 = -2;
            } else {
                i3 = mo57234b();
            }
        }
        this.f59671c = i3;
    }
}
