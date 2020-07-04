package com.p280ss.android.ugc.aweme.shortvideo.cut.gif.p1553a;

import com.p280ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p280ss.android.vesdk.VEEditor;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.f */
final /* synthetic */ class C38762f implements Callable {

    /* renamed from: a */
    private final int f100733a;

    /* renamed from: b */
    private final ConvertListener f100734b;

    /* renamed from: c */
    private final float f100735c;

    /* renamed from: d */
    private final VEEditor f100736d;

    C38762f(int i, ConvertListener convertListener, float f, VEEditor vEEditor) {
        this.f100733a = i;
        this.f100734b = convertListener;
        this.f100735c = f;
        this.f100736d = vEEditor;
    }

    public final Object call() {
        return C38758b.m123780a(this.f100733a, this.f100734b, this.f100735c, this.f100736d);
    }
}
