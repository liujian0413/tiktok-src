package com.p280ss.android.ugc.awemepushlib.interaction;

import android.os.Handler.Callback;
import android.os.Message;

/* renamed from: com.ss.android.ugc.awemepushlib.interaction.s */
final /* synthetic */ class C43623s implements Callback {

    /* renamed from: a */
    private final int f112872a;

    /* renamed from: b */
    private final int f112873b;

    /* renamed from: c */
    private final int f112874c;

    /* renamed from: d */
    private final int f112875d;

    /* renamed from: e */
    private final int f112876e;

    /* renamed from: f */
    private final Callback f112877f;

    C43623s(int i, int i2, int i3, int i4, int i5, Callback callback) {
        this.f112872a = i;
        this.f112873b = i2;
        this.f112874c = i3;
        this.f112875d = i4;
        this.f112876e = i5;
        this.f112877f = callback;
    }

    public final boolean handleMessage(Message message) {
        return C43604e.m138196a(this.f112872a, this.f112873b, this.f112874c, this.f112875d, this.f112876e, this.f112877f, message);
    }
}
