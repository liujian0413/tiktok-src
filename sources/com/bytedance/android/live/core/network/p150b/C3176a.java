package com.bytedance.android.live.core.network.p150b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.live.core.network.b.a */
public final class C3176a {
    /* renamed from: a */
    private static boolean m12018a(ApiServerException apiServerException) {
        if (apiServerException.getErrorCode() == 20047) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12019a(Exception exc) {
        if (!(exc instanceof ApiServerException) || !m12018a((ApiServerException) exc)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m12015a(Context context, Throwable th) {
        m12016a(context, th, (String) null, (Runnable) null);
    }

    /* renamed from: a */
    static final /* synthetic */ void m12017a(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    private static void m12014a(Context context, String str, String str2, Runnable runnable) {
        if (context != null) {
            C3534a aVar = new C3534a(context);
            aVar.mo10654a((CharSequence) context.getResources().getString(R.string.egy));
            aVar.mo10660b((CharSequence) str);
            aVar.mo10655a((CharSequence) str2, (OnClickListener) null);
            aVar.mo10651a((OnDismissListener) new C3177b(runnable));
            aVar.mo10657a().show();
        }
    }

    /* renamed from: a */
    private static void m12016a(Context context, Throwable th, String str, Runnable runnable) {
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            if (apiServerException.getErrorCode() != 20006) {
                String prompt = apiServerException.getPrompt();
                String alert = apiServerException.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    m12014a(context, alert, context.getResources().getString(R.string.eet), (Runnable) null);
                } else if (!TextUtils.isEmpty(prompt)) {
                    C3517a.m12962a(context, prompt);
                } else {
                    C3517a.m12962a(context, (String) null);
                    return;
                }
            }
        }
        C3517a.m12962a(context, (String) null);
    }
}
