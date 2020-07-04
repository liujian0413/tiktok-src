package com.p280ss.android.ugc.awemepushlib.manager;

import android.content.Context;
import android.graphics.Bitmap;
import com.p280ss.android.ugc.awemepushlib.model.PushMsg;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.awemepushlib.manager.e */
final /* synthetic */ class C43637e implements Callable {

    /* renamed from: a */
    private final Bitmap[] f112925a;

    /* renamed from: b */
    private final PushMsg f112926b;

    /* renamed from: c */
    private final Context f112927c;

    /* renamed from: d */
    private final Bitmap[] f112928d;

    /* renamed from: e */
    private final int f112929e;

    C43637e(Bitmap[] bitmapArr, PushMsg pushMsg, Context context, Bitmap[] bitmapArr2, int i) {
        this.f112925a = bitmapArr;
        this.f112926b = pushMsg;
        this.f112927c = context;
        this.f112928d = bitmapArr2;
        this.f112929e = i;
    }

    public final Object call() {
        return MessageShowHandler.m138233a(this.f112925a, this.f112926b, this.f112927c, this.f112928d, this.f112929e);
    }
}
