package p1896pl.droidsonroids.relinker;

import android.os.Build;
import android.os.Build.VERSION;
import p1896pl.droidsonroids.relinker.C48453b.C48455b;

/* renamed from: pl.droidsonroids.relinker.d */
final class C48460d implements C48455b {
    C48460d() {
    }

    /* renamed from: a */
    public final String[] mo123267a() {
        if (VERSION.SDK_INT >= 21 && Build.SUPPORTED_ABIS.length > 0) {
            return Build.SUPPORTED_ABIS;
        }
        if (!C48462f.m150153a(Build.CPU_ABI2)) {
            return new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        }
        return new String[]{Build.CPU_ABI};
    }

    /* renamed from: a */
    public final void mo123266a(String str) {
        C48461e.m150151a(str);
    }

    /* renamed from: b */
    public final void mo123268b(String str) {
        C48461e.m150152b(str);
    }

    /* renamed from: d */
    public final String mo123270d(String str) {
        return str.substring(3, str.length() - 3);
    }

    /* renamed from: c */
    public final String mo123269c(String str) {
        if (!str.startsWith("lib") || !str.endsWith(".so")) {
            return System.mapLibraryName(str);
        }
        return str;
    }
}
