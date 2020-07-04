package com.p280ss.android.ugc.aweme.shortvideo.cut.gif.p1553a;

import com.p280ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener;
import com.p280ss.android.vesdk.VEEditor;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.gif.a.e */
final /* synthetic */ class C38761e implements Callable {

    /* renamed from: a */
    private final ConvertListener f100731a;

    /* renamed from: b */
    private final VEEditor f100732b;

    C38761e(ConvertListener convertListener, VEEditor vEEditor) {
        this.f100731a = convertListener;
        this.f100732b = vEEditor;
    }

    public final Object call() {
        return C38758b.m123781a(this.f100731a, this.f100732b);
    }
}
