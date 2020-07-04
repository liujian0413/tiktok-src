package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class bfu {

    /* renamed from: a */
    private static final String f41849a = "bfu";

    /* renamed from: b */
    private final beh f41850b;

    /* renamed from: c */
    private final String f41851c;

    /* renamed from: d */
    private final String f41852d;

    /* renamed from: e */
    private final int f41853e = 2;

    /* renamed from: f */
    private volatile Method f41854f;

    /* renamed from: g */
    private final Class<?>[] f41855g;

    /* renamed from: h */
    private CountDownLatch f41856h = new CountDownLatch(1);

    public bfu(beh beh, String str, String str2, Class<?>... clsArr) {
        this.f41850b = beh;
        this.f41851c = str;
        this.f41852d = str2;
        this.f41855g = clsArr;
        this.f41850b.f41761b.submit(new bfv(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m48605b() {
        try {
            Class loadClass = this.f41850b.f41762c.loadClass(m48603a(this.f41850b.f41764e, this.f41851c));
            if (loadClass != null) {
                this.f41854f = loadClass.getMethod(m48603a(this.f41850b.f41764e, this.f41852d), this.f41855g);
                if (this.f41854f == null) {
                    this.f41856h.countDown();
                } else {
                    this.f41856h.countDown();
                }
            }
        } catch (zzdj unused) {
        } catch (UnsupportedEncodingException unused2) {
        } catch (ClassNotFoundException unused3) {
        } catch (NoSuchMethodException unused4) {
        } catch (NullPointerException unused5) {
        } finally {
            this.f41856h.countDown();
        }
    }

    /* renamed from: a */
    private final String m48603a(byte[] bArr, String str) throws zzdj, UnsupportedEncodingException {
        return new String(this.f41850b.f41763d.mo40540a(bArr, str), "UTF-8");
    }

    /* renamed from: a */
    public final Method mo40584a() {
        if (this.f41854f != null) {
            return this.f41854f;
        }
        try {
            if (!this.f41856h.await(2, TimeUnit.SECONDS)) {
                return null;
            }
            return this.f41854f;
        } catch (InterruptedException unused) {
            return null;
        }
    }
}
