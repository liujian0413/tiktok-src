package net.openid.appauth.p1887a;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Base64;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.Set;

/* renamed from: net.openid.appauth.a.b */
public final class C48243b {

    /* renamed from: a */
    public final String f123221a;

    /* renamed from: b */
    public final Set<String> f123222b;

    /* renamed from: c */
    public final String f123223c;

    /* renamed from: d */
    public final Boolean f123224d;

    public final int hashCode() {
        int hashCode = (((this.f123221a.hashCode() * 92821) + this.f123223c.hashCode()) * 92821) + (this.f123224d.booleanValue() ? 1 : 0);
        for (String hashCode2 : this.f123222b) {
            hashCode = (hashCode * 92821) + hashCode2.hashCode();
        }
        return hashCode;
    }

    /* renamed from: a */
    private static String m149667a(Signature signature) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-512").digest(signature.toByteArray()), 10);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("Platform does not supportSHA-512 hashing");
        }
    }

    /* renamed from: a */
    private static Set<String> m149668a(Signature[] signatureArr) {
        HashSet hashSet = new HashSet();
        for (Signature a : signatureArr) {
            hashSet.add(m149667a(a));
        }
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C48243b)) {
            return false;
        }
        C48243b bVar = (C48243b) obj;
        if (!this.f123221a.equals(bVar.f123221a) || !this.f123223c.equals(bVar.f123223c) || this.f123224d != bVar.f123224d || !this.f123222b.equals(bVar.f123222b)) {
            return false;
        }
        return true;
    }

    public C48243b(PackageInfo packageInfo, boolean z) {
        this(packageInfo.packageName, m149668a(packageInfo.signatures), packageInfo.versionName, z);
    }

    private C48243b(String str, Set<String> set, String str2, boolean z) {
        this.f123221a = str;
        this.f123222b = set;
        this.f123223c = str2;
        this.f123224d = Boolean.valueOf(z);
    }
}
