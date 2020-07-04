package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.photo;

import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.photo.c */
final /* synthetic */ class C30892c implements Callable {

    /* renamed from: a */
    private final PhotoDetailActivity f80938a;

    /* renamed from: b */
    private final UrlModel f80939b;

    C30892c(PhotoDetailActivity photoDetailActivity, UrlModel urlModel) {
        this.f80938a = photoDetailActivity;
        this.f80939b = urlModel;
    }

    public final Object call() {
        return this.f80938a.mo80747a(this.f80939b);
    }
}
