package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.p749d.C15176d;

/* renamed from: com.google.android.gms.common.g */
public class C15183g {

    /* renamed from: a */
    private static C15183g f39280a;

    /* renamed from: b */
    private final Context f39281b;

    private C15183g(Context context) {
        this.f39281b = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C15183g m44180a(Context context) {
        C15267r.m44384a(context);
        synchronized (C15183g.class) {
            if (f39280a == null) {
                C15278j.m44480a(context);
                f39280a = new C15183g(context);
            }
        }
        return f39280a;
    }

    /* renamed from: a */
    public final boolean mo38478a(int i) {
        C15287s sVar;
        String[] a = C15176d.m44159a(this.f39281b).mo38466a(i);
        if (a != null && a.length != 0) {
            sVar = null;
            for (String a2 : a) {
                sVar = m44182a(a2, i);
                if (sVar.f39491a) {
                    break;
                }
            }
        } else {
            sVar = C15287s.m44492a("no pkgs");
        }
        sVar.mo38628b();
        return sVar.f39491a;
    }

    /* renamed from: a */
    public static boolean m44183a(PackageInfo packageInfo, boolean z) {
        C15280l lVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                lVar = m44181a(packageInfo, C15283o.f39489a);
            } else {
                lVar = m44181a(packageInfo, C15283o.f39489a[0]);
            }
            if (lVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo38479a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m44183a(packageInfo, false)) {
            return true;
        }
        return m44183a(packageInfo, true) && C15181e.m44172c(this.f39281b);
    }

    /* renamed from: a */
    private final C15287s m44182a(String str, int i) {
        try {
            return m44184b(C15176d.m44159a(this.f39281b).mo38463a(str, 64, i));
        } catch (NameNotFoundException unused) {
            String str2 = "no pkg ";
            String valueOf = String.valueOf(str);
            return C15287s.m44492a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
    }

    /* renamed from: b */
    private final C15287s m44184b(PackageInfo packageInfo) {
        boolean c = C15181e.m44172c(this.f39281b);
        if (packageInfo == null) {
            return C15287s.m44492a("null pkg");
        }
        if (packageInfo.signatures.length != 1) {
            return C15287s.m44492a("single cert required");
        }
        C15281m mVar = new C15281m(packageInfo.signatures[0].toByteArray());
        String str = packageInfo.packageName;
        C15287s a = C15278j.m44478a(str, (C15280l) mVar, c);
        return (!a.f39491a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || (c && !C15278j.m44478a(str, (C15280l) mVar, false).f39491a)) ? a : C15287s.m44492a("debuggable release cert app rejected");
    }

    /* renamed from: a */
    private static C15280l m44181a(PackageInfo packageInfo, C15280l... lVarArr) {
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1) {
            return null;
        }
        C15281m mVar = new C15281m(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < lVarArr.length; i++) {
            if (lVarArr[i].equals(mVar)) {
                return lVarArr[i];
            }
        }
        return null;
    }
}
