package com.google.android.gms.common.p749d;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.util.C15333p;

/* renamed from: com.google.android.gms.common.d.b */
public final class C15174b {

    /* renamed from: a */
    private final Context f39250a;

    public C15174b(Context context) {
        this.f39250a = context;
    }

    /* renamed from: a */
    public final ApplicationInfo mo38462a(String str, int i) throws NameNotFoundException {
        return C15175c.m44158a(this.f39250a.getPackageManager(), str, i);
    }

    /* renamed from: b */
    public final PackageInfo mo38467b(String str, int i) throws NameNotFoundException {
        return this.f39250a.getPackageManager().getPackageInfo(str, i);
    }

    /* renamed from: a */
    public final PackageInfo mo38463a(String str, int i, int i2) throws NameNotFoundException {
        return this.f39250a.getPackageManager().getPackageInfo(str, 64);
    }

    /* renamed from: a */
    public final String[] mo38466a(int i) {
        return this.f39250a.getPackageManager().getPackagesForUid(i);
    }

    /* renamed from: a */
    public final boolean mo38465a(int i, String str) {
        if (C15333p.m44598e()) {
            try {
                ((AppOpsManager) this.f39250a.getSystemService("appops")).checkPackage(i, str);
                return true;
            } catch (SecurityException unused) {
                return false;
            }
        } else {
            String[] packagesForUid = this.f39250a.getPackageManager().getPackagesForUid(i);
            if (!(str == null || packagesForUid == null)) {
                for (String equals : packagesForUid) {
                    if (str.equals(equals)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final int mo38460a(String str) {
        return this.f39250a.checkCallingOrSelfPermission(str);
    }

    /* renamed from: a */
    public final int mo38461a(String str, String str2) {
        return this.f39250a.getPackageManager().checkPermission(str, str2);
    }

    /* renamed from: b */
    public final CharSequence mo38468b(String str) throws NameNotFoundException {
        return this.f39250a.getPackageManager().getApplicationLabel(C15175c.m44158a(this.f39250a.getPackageManager(), str, 0));
    }

    /* renamed from: a */
    public final boolean mo38464a() {
        if (Binder.getCallingUid() == Process.myUid()) {
            return C15173a.m44148a(this.f39250a);
        }
        if (C15333p.m44603j()) {
            String nameForUid = this.f39250a.getPackageManager().getNameForUid(Binder.getCallingUid());
            if (nameForUid != null) {
                return this.f39250a.getPackageManager().isInstantApp(nameForUid);
            }
        }
        return false;
    }
}
