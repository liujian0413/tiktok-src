package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.google.android.gms.common.p749d.C15176d;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.up */
public final class C16092up implements C16096ut {

    /* renamed from: a */
    private static final Object f45122a = new Object();

    /* renamed from: b */
    private static C16096ut f45123b = null;

    /* renamed from: c */
    private static C16096ut f45124c = null;

    /* renamed from: d */
    private final Object f45125d;

    /* renamed from: e */
    private final Context f45126e;

    /* renamed from: f */
    private final WeakHashMap<Thread, Boolean> f45127f;

    /* renamed from: g */
    private final ExecutorService f45128g;

    /* renamed from: h */
    private final zzbgz f45129h;

    /* renamed from: a */
    public static C16096ut m52250a(Context context) {
        synchronized (f45122a) {
            if (f45123b == null) {
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43965e)).booleanValue()) {
                    f45123b = new C16092up(context);
                } else {
                    f45123b = new C16097uu();
                }
            }
        }
        return f45123b;
    }

    /* renamed from: a */
    public static C16096ut m52251a(Context context, zzbgz zzbgz) {
        synchronized (f45122a) {
            if (f45124c == null) {
                if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43965e)).booleanValue()) {
                    C16092up upVar = new C16092up(context, zzbgz);
                    Thread thread = Looper.getMainLooper().getThread();
                    if (thread != null) {
                        synchronized (upVar.f45125d) {
                            upVar.f45127f.put(thread, Boolean.valueOf(true));
                        }
                        thread.setUncaughtExceptionHandler(new C16094ur(upVar, thread.getUncaughtExceptionHandler()));
                    }
                    Thread.setDefaultUncaughtExceptionHandler(new C16093uq(upVar, Thread.getDefaultUncaughtExceptionHandler()));
                    f45124c = upVar;
                } else {
                    f45124c = new C16097uu();
                }
            }
        }
        return f45124c;
    }

    private C16092up(Context context) {
        this(context, zzbgz.m52673a());
    }

    private C16092up(Context context, zzbgz zzbgz) {
        this.f45125d = new Object();
        this.f45127f = new WeakHashMap<>();
        this.f45128g = Executors.newCachedThreadPool();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.f45126e = context;
        this.f45129h = zzbgz;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003f, code lost:
        if (r3 == false) goto L_0x0043;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo42015a(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L_0x0042
            r1 = r11
            r2 = 0
            r3 = 0
        L_0x0007:
            if (r1 == 0) goto L_0x003d
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = r3
            r3 = r2
            r2 = 0
        L_0x0011:
            if (r2 >= r5) goto L_0x0036
            r7 = r4[r2]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.afb.m45735b(r8)
            if (r8 == 0) goto L_0x0020
            r3 = 1
        L_0x0020:
            java.lang.Class r8 = r9.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0033
            r6 = 1
        L_0x0033:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0036:
            java.lang.Throwable r1 = r1.getCause()
            r2 = r3
            r3 = r6
            goto L_0x0007
        L_0x003d:
            if (r2 == 0) goto L_0x0042
            if (r3 != 0) goto L_0x0042
            goto L_0x0043
        L_0x0042:
            r10 = 0
        L_0x0043:
            if (r10 == 0) goto L_0x004c
            java.lang.String r10 = ""
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.mo42017a(r11, r10, r0)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C16092up.mo42015a(java.lang.Thread, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public final void mo42016a(Throwable th, String str) {
        mo42017a(th, str, 1.0f);
    }

    /* renamed from: a */
    public final void mo42017a(Throwable th, String str, float f) {
        if (afb.m45726a(th) != null) {
            String name = th.getClass().getName();
            StringWriter stringWriter = new StringWriter();
            avv.m47393a(th, new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            int i = 0;
            int i2 = 1;
            boolean z = Math.random() < ((double) f);
            if (f > 0.0f) {
                i2 = (int) (1.0f / f);
            }
            if (z) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(m52249a(name, stringWriter2, str, i2).toString());
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    this.f45128g.submit(new C16095us(this, new afp(), (String) obj));
                }
            }
        }
    }

    /* renamed from: a */
    private final Builder m52249a(String str, String str2, String str3, int i) {
        boolean z;
        try {
            z = C15176d.m44159a(this.f45126e).mo38464a();
        } catch (Throwable th) {
            afm.m45778b("Error fetching instant app info", th);
            z = false;
        }
        String str4 = "unknown";
        try {
            str4 = this.f45126e.getPackageName();
        } catch (Throwable unused) {
            afm.m45783e("Cannot obtain package name, proceeding.");
        }
        Builder appendQueryParameter = new Builder().scheme(WebKitApi.SCHEME_HTTPS).path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", VERSION.RELEASE).appendQueryParameter("api", String.valueOf(VERSION.SDK_INT));
        String str5 = "device";
        String str6 = Build.MANUFACTURER;
        String str7 = Build.MODEL;
        if (!str7.startsWith(str6)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str6).length() + 1 + String.valueOf(str7).length());
            sb.append(str6);
            sb.append(" ");
            sb.append(str7);
            str7 = sb.toString();
        }
        return appendQueryParameter.appendQueryParameter(str5, str7).appendQueryParameter("js", this.f45129h.f45677a).appendQueryParameter("appid", str4).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", C15585bw.m50187a())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "235029740").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", bym.m50300e()).appendQueryParameter("sampling_rate", Integer.toString(i)).appendQueryParameter("pb_tm", String.valueOf(bym.m50299d().mo41272a(C15585bw.f43881cV)));
    }
}
