package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import com.google.android.gms.common.internal.C15223ao;
import com.google.android.gms.common.internal.C15224ap;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.common.j */
final class C15278j {

    /* renamed from: a */
    private static volatile C15223ao f39479a;

    /* renamed from: b */
    private static final Object f39480b = new Object();

    /* renamed from: c */
    private static Context f39481c;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static synchronized void m44480a(android.content.Context r2) {
        /*
            java.lang.Class<com.google.android.gms.common.j> r0 = com.google.android.gms.common.C15278j.class
            monitor-enter(r0)
            android.content.Context r1 = f39481c     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x0011
            if (r2 == 0) goto L_0x0011
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0013 }
            f39481c = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)
            return
        L_0x0011:
            monitor-exit(r0)
            return
        L_0x0013:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.C15278j.m44480a(android.content.Context):void");
    }

    /* renamed from: a */
    static C15287s m44478a(String str, C15280l lVar, boolean z) {
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return m44481b(str, lVar, z);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* renamed from: b */
    private static C15287s m44481b(String str, C15280l lVar, boolean z) {
        try {
            if (f39479a == null) {
                C15267r.m44384a(f39481c);
                synchronized (f39480b) {
                    if (f39479a == null) {
                        f39479a = C15224ap.m44245a(DynamiteModule.m44685a(f39481c, DynamiteModule.f39649c, "com.google.android.gms.googlecertificates").mo38718a("com.google.android.gms.common.GoogleCertificatesImpl"));
                    }
                }
            }
            C15267r.m44384a(f39481c);
            try {
                if (f39479a.mo38548a(new zzk(str, lVar, z), C15349d.m44668a(f39481c.getPackageManager()))) {
                    return C15287s.m44491a();
                }
                return C15287s.m44494a((Callable<String>) new C15279k<String>(z, str, lVar));
            } catch (RemoteException e) {
                return C15287s.m44493a("module call", e);
            }
        } catch (LoadingException e2) {
            String str2 = "module init: ";
            String valueOf = String.valueOf(e2.getMessage());
            return C15287s.m44493a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ String m44479a(boolean z, String str, C15280l lVar) throws Exception {
        boolean z2 = true;
        if (z || !m44481b(str, lVar, true).f39491a) {
            z2 = false;
        }
        return C15287s.m44495a(str, lVar, z, z2);
    }
}
