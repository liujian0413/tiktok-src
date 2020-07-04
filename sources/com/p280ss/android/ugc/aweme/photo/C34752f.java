package com.p280ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.util.concurrent.Callable;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.photo.f */
final /* synthetic */ class C34752f implements Callable {

    /* renamed from: a */
    private final ImageView f90587a;

    /* renamed from: b */
    private final Bitmap f90588b;

    /* renamed from: c */
    private final C7561a f90589c;

    C34752f(ImageView imageView, Bitmap bitmap, C7561a aVar) {
        this.f90587a = imageView;
        this.f90588b = bitmap;
        this.f90589c = aVar;
    }

    public final Object call() {
        return C347374.m112076a(this.f90587a, this.f90588b, this.f90589c);
    }
}
