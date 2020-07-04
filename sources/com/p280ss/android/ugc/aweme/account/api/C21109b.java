package com.p280ss.android.ugc.aweme.account.api;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.api.b */
public final class C21109b {
    /* renamed from: a */
    public static void m71181a(Context context, Exception exc) {
        m71182a(context, exc, R.string.dxt);
    }

    /* renamed from: a */
    private static void m71182a(Context context, Exception exc, int i) {
        if (exc instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) exc;
            if (apiServerException.getErrorCode() != 2155) {
                int errorCode = apiServerException.getErrorCode();
                if (errorCode == 1001) {
                    try {
                        C22347v.m73994a(context).mo26647b((CharSequence) apiServerException.getErrorMsg()).mo26635a((int) R.string.cql, (OnClickListener) new OnClickListener() {
                            public final void onClick(DialogInterface dialogInterface, int i) {
                            }
                        }).mo26649b();
                    } catch (Exception unused) {
                    }
                } else {
                    if (!(errorCode == 2003 || errorCode == 2004 || context == null)) {
                        if (!TextUtils.isEmpty(apiServerException.getPrompt())) {
                            C10761a.m31403c(context, apiServerException.getPrompt()).mo25750a();
                        } else if (!TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                            C10761a.m31403c(context, apiServerException.getErrorMsg()).mo25750a();
                        } else if (apiServerException.getErrorCode() == 100) {
                            C10761a.m31399c(context, (int) R.string.a7y).mo25750a();
                        } else {
                            C10761a.m31399c(context, (int) R.string.dxt).mo25750a();
                        }
                    }
                }
            }
        } else if (context != null) {
            if (exc == null || TextUtils.isEmpty(exc.getMessage())) {
                C10761a.m31399c(context, (int) R.string.dxt).mo25750a();
            } else {
                C10761a.m31403c(context, exc.getMessage()).mo25750a();
            }
        }
    }
}
