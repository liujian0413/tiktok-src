package com.p280ss.android.ugc.aweme.shortvideo.guide;

import android.content.Context;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.guide.b */
public final class C39980b extends C23323e {
    /* renamed from: b */
    public static void m127865b(RemoteImageView remoteImageView, UrlModel urlModel, C13401d<C13648f> dVar) {
        Context context;
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (remoteImageView.getContext() != null) {
                context = remoteImageView.getContext().getApplicationContext();
            } else {
                context = null;
            }
            ImageRequest[] a = m76522a(urlModel, (C13596d) null, (C13842b) null);
            if (a != null && a.length != 0) {
                C13382e eVar = (C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32746a((REQUEST[]) a)).mo32751c(false);
                eVar.mo32743a(m76497a(dVar, a[0].mSourceUri, context, urlModel));
                remoteImageView.setController(eVar.mo32730f());
            }
        }
    }
}
