package com.p280ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.f */
final /* synthetic */ class C43638f implements C1591g {

    /* renamed from: a */
    private final Context f112930a;

    /* renamed from: b */
    private final Bitmap[] f112931b;

    /* renamed from: c */
    private final Bitmap[] f112932c;

    /* renamed from: d */
    private final int f112933d;

    /* renamed from: e */
    private final PushMsg f112934e;

    C43638f(Context context, Bitmap[] bitmapArr, Bitmap[] bitmapArr2, int i, PushMsg pushMsg) {
        this.f112930a = context;
        this.f112931b = bitmapArr;
        this.f112932c = bitmapArr2;
        this.f112933d = i;
        this.f112934e = pushMsg;
    }

    public final Object then(C1592h hVar) {
        return MessageShowHandler.m138240a(this.f112930a, this.f112931b[0], this.f112932c[0], this.f112933d, (Intent) null, this.f112934e);
    }
}
