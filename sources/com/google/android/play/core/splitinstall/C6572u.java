package com.google.android.play.core.splitinstall;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources.NotFoundException;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.google.android.play.core.internal.C6525f;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: com.google.android.play.core.splitinstall.u */
public final class C6572u {

    /* renamed from: a */
    private static final C6525f f18892a = new C6525f("SplitInstallInfoProvider");

    /* renamed from: b */
    private final Context f18893b;

    /* renamed from: c */
    private final String f18894c;

    C6572u(Context context, String str) {
        this.f18893b = context;
        this.f18894c = str;
    }

    /* renamed from: a */
    public static boolean m20404a(String str) {
        return str.startsWith("config.");
    }

    /* renamed from: b */
    public static boolean m20405b(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    /* renamed from: c */
    private final C6565m m20406c() {
        C6525f fVar;
        String str;
        Bundle f = m20410f();
        if (f == null) {
            return null;
        }
        int i = f.getInt("com.android.vending.splits");
        if (i == 0) {
            fVar = f18892a;
            str = "No metadata found in AndroidManifest.";
        } else {
            try {
                C6565m a = new C6564l(this.f18893b.getResources().getXml(i)).mo15929a();
                if (a == null) {
                    f18892a.mo15892c("Can't parse languages metadata.", new Object[0]);
                }
                return a;
            } catch (NotFoundException unused) {
                fVar = f18892a;
                str = "Resource with languages metadata doesn't exist.";
            }
        }
        fVar.mo15892c(str, new Object[0]);
        return null;
    }

    /* renamed from: c */
    public static String m20407c(String str) {
        return str.split("\\.config\\.", 2)[0];
    }

    /* renamed from: d */
    private final Set<String> m20408d() {
        HashSet hashSet = new HashSet();
        Bundle f = m20410f();
        if (f != null) {
            String string = f.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                f18892a.mo15891b("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
            }
        }
        if (VERSION.SDK_INT < 21) {
            return hashSet;
        }
        String[] e = m20409e();
        if (e != null) {
            C6525f fVar = f18892a;
            String str = "Adding splits from package manager: ";
            String valueOf = String.valueOf(Arrays.toString(e));
            fVar.mo15891b(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
            Collections.addAll(hashSet, e);
        } else {
            f18892a.mo15891b("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        C6571t a = C6569r.m20399a();
        if (a != null) {
            hashSet.addAll(a.mo15921a());
        }
        return hashSet;
    }

    /* renamed from: e */
    private final String[] m20409e() {
        try {
            PackageInfo packageInfo = this.f18893b.getPackageManager().getPackageInfo(this.f18894c, 0);
            if (packageInfo != null) {
                return packageInfo.splitNames;
            }
            return null;
        } catch (NameNotFoundException unused) {
            f18892a.mo15892c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* renamed from: f */
    private final Bundle m20410f() {
        try {
            ApplicationInfo a = C6573v.m20413a(this.f18893b.getPackageManager(), this.f18894c, PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            if (a != null && a.metaData != null) {
                return a.metaData;
            }
            f18892a.mo15891b("App has no applicationInfo or metaData", new Object[0]);
            return null;
        } catch (NameNotFoundException unused) {
            f18892a.mo15892c("App is not found in PackageManager", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Set<String> mo15934a() {
        HashSet hashSet = new HashSet();
        for (String str : m20408d()) {
            if (!m20405b(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Set<String> mo15935b() {
        C6565m c = m20406c();
        if (c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Set d = m20408d();
        d.add("");
        Set a = mo15934a();
        a.add("");
        for (Entry entry : c.mo15930a(a).entrySet()) {
            if (d.containsAll((Collection) entry.getValue())) {
                hashSet.add((String) entry.getKey());
            }
        }
        return hashSet;
    }
}
