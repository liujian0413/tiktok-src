package com.p280ss.android.ugc.aweme.shortvideo.cut.gif.p1553a;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p280ss.android.vesdk.C45329l;
import com.p280ss.android.vesdk.VEEditor;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.c */
final /* synthetic */ class C38759c implements C45329l {

    /* renamed from: a */
    private final ConvertListener f100727a;

    /* renamed from: b */
    private final VEEditor f100728b;

    C38759c(ConvertListener convertListener, VEEditor vEEditor) {
        this.f100727a = convertListener;
        this.f100728b = vEEditor;
    }

    public final void onCallback(int i, int i2, float f, String str) {
        C1592h.m7855a((Callable<TResult>) new C38762f<TResult>(i, this.f100727a, f, this.f100728b), C1592h.f5958b);
    }
}
