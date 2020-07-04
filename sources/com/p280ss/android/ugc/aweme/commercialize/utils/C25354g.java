package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.collection.C6307b;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13400c;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p716c.C13577j;
import com.facebook.imagepipeline.p717d.C13622l;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RemoteImageView;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g */
public final class C25354g {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g$a */
    public interface C25356a {
        void onFailureImpl();

        void onNewResultImpl();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.g$b */
    public static class C25357b extends C13400c<C13648f> {

        /* renamed from: a */
        private final View f66755a;

        public C25357b(View view) {
            this.f66755a = view;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
            if (fVar != null) {
                int width = fVar.getWidth();
                int height = fVar.getHeight();
                if (height > 0) {
                    LayoutParams layoutParams = this.f66755a.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f66755a.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m83380a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C13622l.m40095a().mo33207c().mo32467d(C13577j.m39966a().mo33116c(ImageRequest.fromUri(uri), null));
    }

    /* renamed from: a */
    public static void m83373a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m83375a(remoteImageView, urlModel, false);
    }

    /* renamed from: a */
    public static void m83379a(String str, final C25356a aVar) {
        if (str != null && !str.isEmpty() && !m83380a(Uri.parse(str))) {
            C13622l.m40095a().mo33208d().mo33182c(ImageRequest.fromUri(str), null).mo32633a(new C13345b<Void>() {
                public final void onFailureImpl(C13346c<Void> cVar) {
                    if (aVar != null) {
                        aVar.onFailureImpl();
                    }
                }

                public final void onNewResultImpl(C13346c<Void> cVar) {
                    if (aVar != null) {
                        aVar.onNewResultImpl();
                    }
                }
            }, C7258h.m22731d());
        }
    }

    /* renamed from: a */
    private static void m83375a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z) {
        m83376a(remoteImageView, urlModel, false, new C25174a(false, remoteImageView));
    }

    /* renamed from: a */
    public static void m83374a(RemoteImageView remoteImageView, UrlModel urlModel, C13401d<C13648f> dVar) {
        m83381b(remoteImageView, urlModel, new C25246as(dVar, new C25357b(remoteImageView)));
    }

    /* renamed from: b */
    private static void m83381b(RemoteImageView remoteImageView, UrlModel urlModel, C13401d<C13648f> dVar) {
        if (remoteImageView != null && urlModel != null && remoteImageView.getContext() != null) {
            ImageRequest[] a = C23323e.m76522a(urlModel, (C13596d) null, (C13842b) null);
            if (a != null && a.length > 0) {
                C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32746a((REQUEST[]) a);
                eVar.mo32743a((C13401d<? super INFO>) new C25246as<Object>(C23323e.m76497a(null, a[0].mSourceUri, remoteImageView.getContext(), urlModel), dVar));
                remoteImageView.setController(eVar.mo32730f());
            }
        }
    }

    /* renamed from: a */
    public static void m83378a(RemoteImageView remoteImageView, String str, C13401d<C13648f> dVar) {
        m83377a(remoteImageView, str, -1, -1, dVar);
    }

    /* renamed from: a */
    public static void m83376a(RemoteImageView remoteImageView, UrlModel urlModel, boolean z, C13401d dVar) {
        if (remoteImageView != null) {
            Context context = remoteImageView.getContext();
            if (context != null && urlModel != null && !C6307b.m19566a((Collection<T>) urlModel.getUrlList())) {
                ImageRequest[] a = C23323e.m76523a(urlModel, (C13596d) null, (C13842b) null, Config.ARGB_8888);
                if (a != null && a.length != 0) {
                    C13382e eVar = (C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32751c(false)).mo32746a((REQUEST[]) a);
                    eVar.mo32743a(C23323e.m76497a(dVar, a[0].mSourceUri, context, urlModel));
                    remoteImageView.setController(eVar.mo32730f());
                }
            }
        }
    }

    /* renamed from: a */
    private static void m83377a(RemoteImageView remoteImageView, String str, int i, int i2, C13401d<C13648f> dVar) {
        if (remoteImageView != null && !TextUtils.isEmpty(str)) {
            remoteImageView.setController(((C13382e) ((C13382e) ((C13382e) C13380c.m39166a().mo32729b(remoteImageView.getController())).mo32748b(ImageRequestBuilder.m40865a(Uri.parse(str)).mo33476b())).mo32743a(dVar)).mo32730f());
        }
    }
}
