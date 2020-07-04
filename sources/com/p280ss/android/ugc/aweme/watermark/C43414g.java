package com.p280ss.android.ugc.aweme.watermark;

import com.p280ss.android.ugc.aweme.services.photo.IPhotoProcessService.IPhotoServiceListener;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.watermark.g */
final /* synthetic */ class C43414g implements Callable {

    /* renamed from: a */
    private final String f112433a;

    /* renamed from: b */
    private final IPhotoServiceListener f112434b;

    /* renamed from: c */
    private final String f112435c;

    C43414g(String str, IPhotoServiceListener iPhotoServiceListener, String str2) {
        this.f112433a = str;
        this.f112434b = iPhotoServiceListener;
        this.f112435c = str2;
    }

    public final Object call() {
        return C43407f.m137747a(this.f112433a, this.f112434b, this.f112435c);
    }
}
