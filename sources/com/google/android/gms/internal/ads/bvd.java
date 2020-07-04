package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@C6505uv
public abstract class bvd {

    /* renamed from: b */
    private static MessageDigest f43695b;

    /* renamed from: a */
    protected Object f43696a = new Object();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract byte[] mo41385a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final MessageDigest mo41384a() {
        synchronized (this.f43696a) {
            if (f43695b != null) {
                MessageDigest messageDigest = f43695b;
                return messageDigest;
            }
            for (int i = 0; i < 2; i++) {
                try {
                    f43695b = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = f43695b;
            return messageDigest2;
        }
    }
}
