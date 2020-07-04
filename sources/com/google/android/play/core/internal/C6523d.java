package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.Signature;
import com.google.android.play.core.splitcompat.C6548c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.play.core.internal.d */
public final class C6523d {

    /* renamed from: a */
    private final C6548c f18836a;

    /* renamed from: b */
    private final C6512ad f18837b;

    /* renamed from: c */
    private final Context f18838c;

    public C6523d(Context context, C6548c cVar, C6512ad adVar) {
        this.f18836a = cVar;
        this.f18837b = adVar;
        this.f18838c = context;
    }

    /* renamed from: a */
    private static X509Certificate m20278a(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m20279a(String str, List<X509Certificate> list) {
        boolean z;
        try {
            X509Certificate[][] a = C6512ad.m20227a(str);
            if (a == null || a.length == 0 || a[0].length == 0 || list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            do {
                z = true;
                if (it.hasNext()) {
                    X509Certificate x509Certificate = (X509Certificate) it.next();
                    int length = a.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            z = false;
                            continue;
                            break;
                        } else if (a[i][0].equals(x509Certificate)) {
                            continue;
                            break;
                        } else {
                            i++;
                        }
                    }
                } else {
                    return true;
                }
            } while (z);
            return false;
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: b */
    private final Signature[] m20280b() {
        try {
            return this.f18838c.getPackageManager().getPackageInfo(this.f18838c.getPackageName(), 64).signatures;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo15886a() {
        /*
            r7 = this;
            r0 = 0
            com.google.android.play.core.splitcompat.c r1 = r7.f18836a     // Catch:{ IOException -> 0x0057 }
            java.io.File r1 = r1.mo15909c()     // Catch:{ IOException -> 0x0057 }
            android.content.pm.Signature[] r2 = r7.m20280b()
            if (r2 != 0) goto L_0x000f
            r2 = 0
            goto L_0x0027
        L_0x000f:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
        L_0x0016:
            if (r5 >= r4) goto L_0x0026
            r6 = r2[r5]
            java.security.cert.X509Certificate r6 = m20278a(r6)
            if (r6 == 0) goto L_0x0023
            r3.add(r6)
        L_0x0023:
            int r5 = r5 + 1
            goto L_0x0016
        L_0x0026:
            r2 = r3
        L_0x0027:
            if (r2 == 0) goto L_0x0057
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0030
            goto L_0x0057
        L_0x0030:
            java.io.File[] r1 = r1.listFiles()
            java.util.Arrays.sort(r1)
            int r3 = r1.length
            r4 = 1
            int r3 = r3 - r4
        L_0x003a:
            if (r3 < 0) goto L_0x0056
            r5 = r1[r3]
            java.lang.String r6 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x0055 }
            boolean r6 = m20279a(r6, r2)     // Catch:{ Exception -> 0x0055 }
            if (r6 != 0) goto L_0x0049
            return r0
        L_0x0049:
            com.google.android.play.core.splitcompat.c r6 = r7.f18836a     // Catch:{  }
            java.io.File r6 = r6.mo15902a(r5)     // Catch:{  }
            r5.renameTo(r6)     // Catch:{  }
            int r3 = r3 + -1
            goto L_0x003a
        L_0x0055:
            return r0
        L_0x0056:
            return r4
        L_0x0057:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C6523d.mo15886a():boolean");
    }

    /* renamed from: a */
    public final boolean mo15887a(List<Intent> list) throws IOException {
        for (Intent stringExtra : list) {
            if (!this.f18836a.mo15907b(stringExtra.getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }
}
