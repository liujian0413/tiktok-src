package com.bytedance.android.livesdk.feed.utils;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.live.uikit.dialog.C3533b.C3534a;
import com.bytedance.android.live.uikit.p176d.C3517a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.android.livesdk.feed.utils.b */
public final class C7785b {
    /* renamed from: a */
    public static void m23913a(Context context, Throwable th) {
        if (th instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) th;
            String alert = apiServerException.getAlert();
            String prompt = apiServerException.getPrompt();
            if (!TextUtils.isEmpty(alert)) {
                m23912a(context, alert, context.getResources().getString(R.string.eet));
            } else {
                if (!TextUtils.isEmpty(prompt)) {
                    C3517a.m12962a(context, prompt);
                }
            }
        } else {
            C3517a.m12960a(context, (int) R.string.egm);
        }
    }

    /* renamed from: a */
    private static void m23912a(Context context, String str, String str2) {
        if (context != null) {
            C3534a aVar = new C3534a(context);
            aVar.mo10654a((CharSequence) context.getResources().getString(R.string.egy));
            aVar.mo10660b((CharSequence) str);
            aVar.mo10655a((CharSequence) str2, (OnClickListener) null);
            aVar.mo10657a().show();
        }
    }
}
