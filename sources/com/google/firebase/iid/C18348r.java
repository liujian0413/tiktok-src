package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Base64;
import com.google.android.gms.common.util.C15333p;
import com.google.firebase.C18272b;
import java.security.KeyPair;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

/* renamed from: com.google.firebase.iid.r */
public final class C18348r {

    /* renamed from: a */
    private final Context f49839a;

    /* renamed from: b */
    private String f49840b;

    /* renamed from: c */
    private String f49841c;

    /* renamed from: d */
    private int f49842d;

    /* renamed from: e */
    private int f49843e;

    public C18348r(Context context) {
        this.f49839a = context;
    }

    /* renamed from: a */
    public final synchronized int mo47267a() {
        if (this.f49843e != 0) {
            return this.f49843e;
        }
        PackageManager packageManager = this.f49839a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        if (!C15333p.m44603j()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f49843e = 1;
                return this.f49843e;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            if (C15333p.m44603j()) {
                this.f49843e = 2;
            } else {
                this.f49843e = 1;
            }
            return this.f49843e;
        }
        this.f49843e = 2;
        return this.f49843e;
    }

    /* renamed from: a */
    public static String m60467a(C18272b bVar) {
        String str = bVar.mo47142b().f49728e;
        if (str != null) {
            return str;
        }
        String str2 = bVar.mo47142b().f49725b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: a */
    public static String m60468a(KeyPair keyPair) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(keyPair.getPublic().getEncoded());
            digest[0] = (byte) ((digest[0] & 15) + 112);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final synchronized String mo47268b() {
        if (this.f49840b == null) {
            m60469e();
        }
        return this.f49840b;
    }

    /* renamed from: c */
    public final synchronized String mo47269c() {
        if (this.f49841c == null) {
            m60469e();
        }
        return this.f49841c;
    }

    /* renamed from: d */
    public final synchronized int mo47270d() {
        if (this.f49842d == 0) {
            PackageInfo a = m60466a("com.google.android.gms");
            if (a != null) {
                this.f49842d = a.versionCode;
            }
        }
        return this.f49842d;
    }

    /* renamed from: e */
    private final synchronized void m60469e() {
        PackageInfo a = m60466a(this.f49839a.getPackageName());
        if (a != null) {
            this.f49840b = Integer.toString(a.versionCode);
            this.f49841c = a.versionName;
        }
    }

    /* renamed from: a */
    private final PackageInfo m60466a(String str) {
        try {
            return this.f49839a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException unused) {
            return null;
        }
    }
}
