package com.p280ss.android.ugc.aweme.app.api.p1023b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.IOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.concurrent.ExecutionException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.api.b.a */
public final class C22814a {
    /* renamed from: a */
    public static Throwable m75241a(Throwable th) {
        if (th instanceof ExecutionException) {
            return th.getCause();
        }
        return th;
    }

    /* renamed from: a */
    public static ApiServerException m75240a(Exception exc) {
        if (exc instanceof ApiServerException) {
            return (ApiServerException) exc;
        }
        Throwable cause = exc.getCause();
        if (cause instanceof ApiServerException) {
            return (ApiServerException) cause;
        }
        return null;
    }

    /* renamed from: a */
    public static void m75244a(Context context, Throwable th) {
        m75245a(context, th, R.string.dxt);
    }

    /* renamed from: a */
    public static void m75242a(Context context, ApiServerException apiServerException) {
        if (!TextUtils.isEmpty(apiServerException.getResponse())) {
            try {
                JSONObject jSONObject = new JSONObject(apiServerException.getResponse());
                if (!TextUtils.isEmpty(jSONObject.optString("status_msg"))) {
                    apiServerException.setErrorMsg(jSONObject.optString("status_msg"));
                }
            } catch (JSONException unused) {
            }
        }
        m75245a(context, apiServerException, R.string.dxt);
    }

    /* renamed from: b */
    public static int m75246b(Context context, Throwable th) {
        int i;
        if (th instanceof ConnectTimeoutException) {
            i = 13;
        } else if (th instanceof SocketTimeoutException) {
            i = 14;
        } else {
            if (!(th instanceof SocketException)) {
                if (th instanceof SSLPeerUnverifiedException) {
                    i = 21;
                } else if (th instanceof HttpResponseException) {
                    if (((HttpResponseException) th).getStatusCode() == 503) {
                        i = 19;
                    } else {
                        i = 16;
                    }
                } else if (!(th instanceof IOException)) {
                    i = 18;
                }
            }
            i = 15;
        }
        if (context == null) {
            return i;
        }
        if ((i == 15 || i == 14) && !C22816b.m75247a(context)) {
            return 12;
        }
        return i;
    }

    /* renamed from: a */
    public static void m75245a(Context context, Throwable th, int i) {
        if (th != null) {
            ApiServerException apiServerException = null;
            if (th instanceof ApiServerException) {
                apiServerException = (ApiServerException) th;
            } else {
                Throwable cause = th.getCause();
                if (cause instanceof ApiServerException) {
                    apiServerException = (ApiServerException) cause;
                }
            }
            if (apiServerException != null) {
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
                                    C6861a.m21332a().interceptorService().promptIfNeededOrToast(context, apiServerException.getPrompt(), errorCode);
                                } else if (!TextUtils.isEmpty(apiServerException.getErrorMsg())) {
                                    C6861a.m21332a().interceptorService().promptIfNeededOrToast(context, apiServerException.getErrorMsg(), errorCode);
                                } else if (apiServerException.getErrorCode() == 100) {
                                    C10761a.m31399c(context, (int) R.string.a7y).mo25750a();
                                } else {
                                    C10761a.m31399c(context, i).mo25750a();
                                }
                            }
                        }
                    }
                }
            } else if (context != null) {
                C10761a.m31399c(context, i).mo25750a();
            }
        }
    }

    /* renamed from: a */
    public static void m75243a(Context context, Exception exc, int i, int i2) {
        Throwable a = m75241a((Throwable) exc);
        if (a instanceof ApiServerException) {
            ApiServerException apiServerException = (ApiServerException) a;
            if (apiServerException.getErrorCode() == 2752) {
                String errorMsg = apiServerException.getErrorMsg();
                String string = context.getResources().getString(i2);
                C10741a a2 = new C10741a(context).mo25649a((int) R.string.c7z);
                if (TextUtils.isEmpty(errorMsg)) {
                    errorMsg = string;
                }
                a2.mo25660b(errorMsg).mo25650a((int) R.string.afn, (OnClickListener) null).mo25656a().mo25637a();
            }
        }
    }
}
