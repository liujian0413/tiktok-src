package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a */
public final class C41511a {

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.util.a$a */
    public static class C41512a extends C13400c<C13648f> {

        /* renamed from: a */
        private final View f107960a;

        public C41512a(View view) {
            this.f107960a = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (fVar != null) {
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                if (height > 0) {
                    LayoutParams layoutParams = this.f107960a.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f107960a.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m132233a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m132234a(remoteImageView, urlModel, null);
    }

    /* renamed from: a */
    private static void m132234a(RemoteImageView remoteImageView, UrlModel urlModel, C13401d<C13648f> dVar) {
        m132235b(remoteImageView, urlModel, new C41561m(null, new C41512a(remoteImageView)));
    }

    /* renamed from: b */
    private static void m132235b(RemoteImageView remoteImageView, UrlModel urlModel, C13401d<C13648f> dVar) {
        if (remoteImageView != null && urlModel != null && remoteImageView.getContext() != null) {
            ImageRequest[] a = C23323e.m76522a(urlModel, (C13596d) null, (C13842b) null);
            if (a != null && a.length > 0) {
                C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32746a((REQUEST[]) a);
                eVar.mo32743a((C13401d<? super INFO>) new C41561m<Object>(C23323e.m76497a(null, a[0].mSourceUri, remoteImageView.getContext(), urlModel), dVar));
                remoteImageView.setController(eVar.mo32730f());
            }
        }
    }
}
