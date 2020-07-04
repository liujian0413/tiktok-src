package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.apm.core.C6177b;
import com.bytedance.apm.p240d.C6186b.C6187a;
import com.bytedance.common.utility.C6319n;
import com.bytedance.framwork.core.monitor.C6379c;
import com.bytedance.ies.ugc.statisticlogger.C10985c;
import com.facebook.network.connectionclass.C14143b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.common.util.DownloadFileTooLargeException;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.common.util.NetworkUtils.C6768e;
import com.p280ss.android.common.util.NetworkUtils.C6769f;
import com.p280ss.android.deviceregister.C6789d;
import com.p280ss.android.deviceregister.C6789d.C6790a;
import com.p280ss.android.http.legacy.client.ClientProtocolException;
import com.p280ss.android.http.legacy.client.HttpResponseException;
import com.p280ss.android.ugc.aweme.IAccountService;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.n */
public class C6877n extends C6893q {

    /* renamed from: b */
    private static final C6769f f19525b = new C6769f() {

        /* renamed from: a */
        public boolean f19528a;

        /* renamed from: a */
        public final void mo16558a(long j, long j2, String str, String str2, C6768e eVar) {
            try {
                ExecutorService executorService = C6877n.f19558a;
                final C6768e eVar2 = eVar;
                final String str3 = str;
                final long j3 = j;
                final long j4 = j2;
                final String str4 = str2;
                C68811 r1 = new Runnable() {
                    public final void run() {
                        String[] strArr = new String[1];
                        if (C6319n.m19593a(strArr[0]) && eVar2 != null) {
                            strArr[0] = eVar2.f19266a;
                        }
                        String str = null;
                        if (!TextUtils.isEmpty(str3)) {
                            str = Uri.parse(str3).getQueryParameter("retry_type");
                        }
                        if (!C68803.this.f19528a && !TextUtils.isEmpty(str3) && str3.contains("aweme/v1/feed/?type=0")) {
                            C68803.this.f19528a = true;
                        }
                        C6877n.m21442a(j3, j4, str3, strArr[0], str4, C34943c.f91127w, C6869c.m21381a().mo16887a("retry_type", str).mo16887a("First_Request", String.valueOf(C68803.this.f19528a)).mo16888b());
                    }
                };
                executorService.submit(r1);
            } catch (Exception unused) {
            }
        }

        /* renamed from: a */
        public final void mo16559a(long j, long j2, String str, String str2, C6768e eVar, Throwable th) {
            try {
                ExecutorService executorService = C6877n.f19558a;
                final String str3 = str;
                final Throwable th2 = th;
                final C6768e eVar2 = eVar;
                final String str4 = str2;
                final long j3 = j;
                final long j4 = j2;
                C68822 r1 = new Runnable() {
                    public final void run() {
                        String str;
                        if (!TextUtils.isEmpty(str3)) {
                            str = Uri.parse(str3).getQueryParameter("retry_type");
                            if (TextUtils.equals("no_retry", str)) {
                                return;
                            }
                        } else {
                            str = null;
                        }
                        String[] strArr = new String[1];
                        int a = C6877n.m21404a(th2, strArr);
                        if (C6319n.m19593a(strArr[0]) && eVar2 != null) {
                            strArr[0] = eVar2.f19266a;
                        }
                        if (!C68803.this.f19528a && !TextUtils.isEmpty(str3) && str3.contains("aweme/v1/feed/?type=0")) {
                            C68803.this.f19528a = true;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(str4);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append((int) C14143b.m41756a().mo33902c());
                        int i = a;
                        JSONObject b = C6869c.m21381a().mo16887a("First_Request", String.valueOf(C68803.this.f19528a)).mo16887a("traceCode", sb.toString()).mo16887a("errorDesc", C6877n.m21405a(th2)).mo16887a("netWorkQuality", C14143b.m41756a().mo33901b().toString()).mo16887a("netWorkSpeeds", sb2.toString()).mo16887a("responseCode", String.valueOf(str4)).mo16887a("retryType", str).mo16888b();
                        C6877n.m21449b(j3, j4, str3, strArr[0], str4, i, b);
                        C6877n.m21442a(j3, j4, str3, strArr[0], str4, i, b);
                    }
                };
                executorService.submit(r1);
            } catch (Exception unused) {
            }
        }
    };

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0038  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m21405a(java.lang.Throwable r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            r1.<init>()     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x0035, all -> 0x002d }
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r3, r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r3, r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            com.google.p268a.p269a.p270a.p271a.p272a.C6497a.m20180a(r3, r2)     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
        L_0x0023:
            java.lang.String r3 = r1.toString()     // Catch:{ Throwable -> 0x0036, all -> 0x002b }
            r2.close()
            goto L_0x003c
        L_0x002b:
            r3 = move-exception
            goto L_0x002f
        L_0x002d:
            r3 = move-exception
            r2 = r0
        L_0x002f:
            if (r2 == 0) goto L_0x0034
            r2.close()
        L_0x0034:
            throw r3
        L_0x0035:
            r2 = r0
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.close()
        L_0x003b:
            r3 = r0
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C6877n.m21405a(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: a */
    public static void m21406a(final Context context, final C6187a aVar) {
        aVar.mo14908a(true);
        aVar.mo14902a((C6177b) new C6177b() {
            /* renamed from: b */
            public final String mo14886b() {
                return C10985c.m32187c();
            }

            /* renamed from: a */
            public final Map<String, String> mo14885a() {
                HashMap hashMap = new HashMap();
                NetUtil.putCommonParams(hashMap, true);
                return hashMap;
            }

            /* renamed from: c */
            public final long mo14887c() {
                String curUserId = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().getCurUserId();
                if (TextUtils.isEmpty(curUserId)) {
                    return 0;
                }
                return Long.valueOf(curUserId).longValue();
            }
        });
        C6893q.m21450b(context, aVar);
        C6789d.m21064a((C6790a) new C6790a() {
            public final void onDidLoadLocally(boolean z) {
            }

            public final void onRemoteConfigUpdate(boolean z, boolean z2) {
            }

            public final void onDeviceRegistrationInfoChanged(String str, String str2) {
                if (AppLog.getHeaderCopy() != null) {
                    C6893q.m21450b(context, aVar);
                }
            }
        });
        NetworkUtils.setMonitorProcessHook(f19525b);
    }

    /* renamed from: a */
    public static int m21404a(Throwable th, String[] strArr) {
        int i = 1;
        if (th == null) {
            return 1;
        }
        if (th instanceof HttpResponseException) {
            i = ((HttpResponseException) th).getStatusCode();
        } else if (th instanceof DownloadFileTooLargeException) {
            i = 20;
        } else {
            if (!(th instanceof ConnectTimeoutException)) {
                if (th instanceof SocketTimeoutException) {
                    if (C6319n.m19593a(th.getMessage()) || !th.getMessage().contains("connect timed out")) {
                        i = 3;
                    }
                } else if (th instanceof BindException) {
                    i = 7;
                } else if (th instanceof ConnectException) {
                    i = 8;
                } else if (th instanceof NoRouteToHostException) {
                    i = 9;
                } else if (th instanceof PortUnreachableException) {
                    i = 10;
                } else if (th instanceof SocketException) {
                    i = 5;
                    String message = th.getMessage();
                    if (message != null && message.indexOf("reset by peer") >= 0) {
                        i = 6;
                    }
                } else if (th instanceof UnknownHostException) {
                    i = 11;
                } else if (th instanceof ClientProtocolException) {
                    i = 19;
                } else if (th instanceof IOException) {
                    i = 4;
                }
            }
            i = 2;
        }
        if (i == 2) {
            try {
                Matcher matcher = Pattern.compile("Connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})):(\\d+) +timed out").matcher(th.getMessage());
                if (matcher.matches()) {
                    if (matcher.group(3) != null) {
                        strArr[0] = matcher.group(3);
                    } else if (matcher.group(4) != null) {
                        strArr[0] = matcher.group(4);
                    }
                }
            } catch (Exception unused) {
            }
        } else if (i == 8) {
            Throwable cause = th.getCause();
            if (cause != null && (cause instanceof ConnectException)) {
                Matcher matcher2 = Pattern.compile("failed to connect to +([\\w\\.\\-]+)?/(\\[([a-zA-Z0-9:]+)\\]|(\\d{1,3}(\\.\\d{1,3}){3,3})) \\(port \\d+\\)( +after \\d+ms)?: +\\w+ failed: (E[A-Z]+) .*").matcher(cause.getMessage());
                if (matcher2.matches()) {
                    if (matcher2.group(3) != null) {
                        strArr[0] = matcher2.group(3);
                    } else if (matcher2.group(4) != null) {
                        strArr[0] = matcher2.group(4);
                    }
                    String group = matcher2.group(7);
                    if (group != null) {
                        if ("ECONNRESET".equals(group)) {
                            i = 12;
                        } else if ("ECONNREFUSED".equals(group)) {
                            i = 13;
                        } else if ("EHOSTUNREACH".equals(group)) {
                            i = 14;
                        } else if ("ENETUNREACH".equals(group)) {
                            i = 15;
                        } else if ("EADDRNOTAVAIL".equals(group)) {
                            i = 16;
                        } else if ("EADDRINUSE".equals(group)) {
                            i = 17;
                        }
                    }
                }
            }
        } else if (i == 4) {
            String message2 = th.getMessage();
            if (message2.indexOf(" EIO (I/O error)") > 0) {
                i = 37;
            } else {
                if (!(th instanceof FileNotFoundException) && message2.indexOf(" ENOENT ") <= 0) {
                    if (message2.indexOf("No such file or directory") <= 0) {
                        if (message2.indexOf(" ENOSPC ") <= 0) {
                            if (message2.indexOf("No space left on device") <= 0) {
                                if (message2.indexOf(" EDQUOT ") > 0) {
                                    i = 34;
                                } else if (message2.indexOf(" EROFS ") > 0) {
                                    i = 35;
                                } else if (message2.indexOf(" EACCES ") > 0) {
                                    i = 36;
                                }
                            }
                        }
                        i = 32;
                    }
                }
                i = 33;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static void m21407a(String str, String str2, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
        } catch (JSONException unused) {
        }
        C6379c.m19826a(str, jSONObject);
    }
}
