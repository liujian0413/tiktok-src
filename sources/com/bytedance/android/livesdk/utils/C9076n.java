package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.utils.n */
public final class C9076n {
    /* renamed from: a */
    public static void m27095a(Context context, Throwable th) {
        if (th != null && context != null) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                String alert = apiServerException.getAlert();
                String prompt = apiServerException.getPrompt();
                if (!TextUtils.isEmpty(alert)) {
                    m27094a(context, alert, context.getResources().getString(R.string.eet));
                } else {
                    if (!TextUtils.isEmpty(prompt)) {
                        C3517a.m12962a(context, prompt);
                    }
                }
            } else {
                C3517a.m12960a(context, (int) R.string.egm);
            }
        }
    }

    /* renamed from: a */
    private static void m27094a(Context context, String str, String str2) {
        if (context != null) {
            C3534a aVar = new C3534a(context);
            aVar.mo10654a((CharSequence) context.getResources().getString(R.string.egy));
            aVar.mo10660b((CharSequence) str);
            aVar.mo10655a((CharSequence) str2, (OnClickListener) null);
            aVar.mo10657a().show();
        }
    }

    /* renamed from: a */
    public static void m27096a(Context context, Throwable th, int i) {
        if (th != null && context != null) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                String prompt = apiServerException.getPrompt();
                String alert = apiServerException.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    m27094a(context, alert, context.getResources().getString(R.string.eet));
                } else if (!TextUtils.isEmpty(prompt)) {
                    C3517a.m12962a(context, prompt);
                } else {
                    C3517a.m12960a(context, i);
                }
            } else {
                C3517a.m12960a(context, i);
            }
        }
    }

    /* renamed from: a */
    public static void m27097a(Context context, Throwable th, String str) {
        if (th != null && context != null) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                String prompt = apiServerException.getPrompt();
                String alert = apiServerException.getAlert();
                if (!TextUtils.isEmpty(alert)) {
                    m27094a(context, alert, context.getResources().getString(R.string.eet));
                } else if (!TextUtils.isEmpty(prompt)) {
                    C3517a.m12962a(context, prompt);
                } else {
                    C3517a.m12962a(context, str);
                }
            } else {
                C3517a.m12962a(context, str);
            }
        }
    }
}
