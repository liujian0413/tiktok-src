package com.p280ss.android.ugc.aweme.notification.view.copy;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.notification.view.copy.a */
public final class C34647a {
    /* renamed from: a */
    public static void m111928a(Context context, Throwable th) {
        m111929a(context, th, R.string.dxt);
    }

    /* renamed from: a */
    private static void m111929a(Context context, Throwable th, int i) {
        if (th != null) {
            if (th instanceof ApiServerException) {
                ApiServerException apiServerException = (ApiServerException) th;
                if (apiServerException.getErrorCode() != 2155) {
                    int errorCode = apiServerException.getErrorCode();
                    if (errorCode != 3070 && errorCode != 3071 && errorCode != 3072) {
                        if (errorCode == 8 && context != null) {
                            return;
                        }
                        if (errorCode == 1001) {
                            try {
                                new C11030a(context).mo26647b((CharSequence) apiServerException.getErrorMsg()).mo26635a((int) R.string.cql, (OnClickListener) new OnClickListener() {
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
                }
            } else if (context != null) {
                C10761a.m31399c(context, (int) R.string.dxt).mo25750a();
            }
        }
    }
}
