package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import com.bytedance.android.livesdk.widget.C9245h.C9249a;

/* renamed from: com.bytedance.android.livesdk.widget.i */
public class C9252i {

    /* renamed from: a */
    private static volatile C9252i f25393a;

    /* renamed from: com.bytedance.android.livesdk.widget.i$a */
    public interface C9253a {
        /* renamed from: b */
        C9253a mo22722b(int i, int i2, OnClickListener onClickListener);

        /* renamed from: b */
        C9253a mo22723b(int i, CharSequence charSequence, OnClickListener onClickListener);

        /* renamed from: b */
        C9253a mo22724b(View view);

        /* renamed from: c */
        C9253a mo22726c(int i);

        /* renamed from: c */
        C9253a mo22727c(CharSequence charSequence);

        /* renamed from: c */
        C9253a mo22728c(boolean z);

        /* renamed from: d */
        Dialog mo22729d();

        /* renamed from: d */
        C9253a mo22730d(int i);

        /* renamed from: d */
        C9253a mo22731d(CharSequence charSequence);
    }

    /* renamed from: a */
    public static C9252i m27529a() {
        if (f25393a == null) {
            synchronized (C9252i.class) {
                if (f25393a == null) {
                    f25393a = new C9252i();
                }
            }
        }
        return f25393a;
    }

    /* renamed from: a */
    public static C9253a m27528a(Context context) {
        return new C9249a(context);
    }
}
