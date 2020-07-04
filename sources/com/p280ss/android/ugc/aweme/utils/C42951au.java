package com.p280ss.android.ugc.aweme.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.support.p029v7.app.AlertDialog;
import android.support.p029v7.app.AlertDialog.C1081a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.utils.au */
public final class C42951au {
    /* renamed from: c */
    private static void m136344c(Dialog dialog) {
        try {
            C42952av.m136345a(dialog);
        } catch (IllegalArgumentException unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static void m136342a(Dialog dialog) {
        if (dialog != null) {
            Context context = dialog.getContext();
            if ((!(context instanceof Activity) || !((Activity) context).isFinishing()) && !dialog.isShowing()) {
                try {
                    dialog.show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public static void m136343b(Dialog dialog) {
        if (dialog != null && dialog.isShowing()) {
            Context baseContext = ((ContextWrapper) dialog.getContext()).getBaseContext();
            if (baseContext instanceof Activity) {
                if (VERSION.SDK_INT >= 17) {
                    Activity activity = (Activity) baseContext;
                    if (activity.isFinishing() || activity.isDestroyed()) {
                        return;
                    }
                } else if (((Activity) baseContext).isFinishing()) {
                    return;
                }
            }
            m136344c(dialog);
        }
    }

    /* renamed from: a */
    public static AlertDialog m136341a(Context context, int i, int i2, OnClickListener onClickListener, int i3, OnClickListener onClickListener2) {
        C1081a aVar = new C1081a(context, R.style.rk);
        aVar.mo4237b(i).mo4238b((int) R.string.w_, onClickListener).mo4226a(i3, onClickListener2);
        AlertDialog b = aVar.mo4242b();
        try {
            b.show();
        } catch (Exception unused) {
        }
        return b;
    }
}
