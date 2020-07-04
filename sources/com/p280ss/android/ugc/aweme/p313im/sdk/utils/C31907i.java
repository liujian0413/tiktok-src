package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.i */
public final class C31907i {
    /* renamed from: a */
    public static void m103654a(Context context, int i, int i2, int i3, final Runnable runnable) {
        C319081 r3 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2 || i != -1 || runnable == null) {
                    dialogInterface.dismiss();
                    return;
                }
                dialogInterface.dismiss();
                runnable.run();
            }
        };
        new C1081a(context, R.style.rk).mo4237b(i).mo4238b((int) R.string.bhe, (OnClickListener) r3).mo4226a(i3, (OnClickListener) r3).mo4242b().show();
    }

    /* renamed from: a */
    public static void m103655a(Context context, int i, int i2, int i3, final Runnable runnable, final Runnable runnable2) {
        C319092 r1 = new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (i == -2) {
                    dialogInterface.dismiss();
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                } else if (i == -1) {
                    dialogInterface.dismiss();
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    dialogInterface.dismiss();
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            }
        };
        new C1081a(context, R.style.rk).mo4237b((int) R.string.bij).mo4238b((int) R.string.bhe, (OnClickListener) r1).mo4226a((int) R.string.bi8, (OnClickListener) r1).mo4242b().show();
    }

    /* renamed from: a */
    public static AlertDialog m103653a(Context context, String str, String str2, int i, OnClickListener onClickListener, int i2, OnClickListener onClickListener2) {
        C1081a aVar = new C1081a(context, R.style.rk);
        aVar.mo4233a((CharSequence) str).mo4240b((CharSequence) str2).mo4238b(i, onClickListener).mo4226a(i2, onClickListener2);
        AlertDialog b = aVar.mo4242b();
        try {
            b.show();
            b.mo4220a(-1).setTextColor(context.getResources().getColor(R.color.a79));
        } catch (Exception unused) {
        }
        return b;
    }
}
