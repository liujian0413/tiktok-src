package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public abstract class bfw implements Callable {

    /* renamed from: a */
    protected final beh f41858a;

    /* renamed from: b */
    protected final C16247a f41859b;

    /* renamed from: c */
    protected Method f41860c;

    /* renamed from: d */
    private final String f41861d = getClass().getSimpleName();

    /* renamed from: e */
    private final String f41862e;

    /* renamed from: f */
    private final String f41863f;

    /* renamed from: g */
    private final int f41864g;

    /* renamed from: h */
    private final int f41865h;

    public bfw(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        this.f41858a = beh;
        this.f41862e = str;
        this.f41863f = str2;
        this.f41859b = aVar;
        this.f41864g = i;
        this.f41865h = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo40578a() throws IllegalAccessException, InvocationTargetException;

    /* renamed from: b */
    public Void call() throws Exception {
        try {
            long nanoTime = System.nanoTime();
            this.f41860c = this.f41858a.mo40552a(this.f41862e, this.f41863f);
            if (this.f41860c == null) {
                return null;
            }
            mo40578a();
            bdm bdm = this.f41858a.f41767h;
            if (!(bdm == null || this.f41864g == Integer.MIN_VALUE)) {
                bdm.mo40522a(this.f41865h, this.f41864g, (System.nanoTime() - nanoTime) / 1000);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }
}
