package com.p280ss.android.ugc.aweme.p984ad.common.legacy.image;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.facebook.drawee.backends.pipeline.C13382e;
import com.facebook.drawee.controller.C13401d;
import com.facebook.imagepipeline.common.C13594b;
import com.facebook.imagepipeline.common.C13595c;
import com.facebook.imagepipeline.common.C13596d;
import com.facebook.imagepipeline.p720g.C13648f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.ad.common.legacy.image.f */
public final class C22445f {
    /* renamed from: a */
    public static void m74297a(C22447g gVar, UrlModel urlModel) {
        m74298a(gVar, urlModel, -1, -1, null);
    }

    /* renamed from: a */
    private static ImageRequest[] m74299a(UrlModel urlModel, C13596d dVar, C13842b bVar) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new ImageRequest[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlModel.getUrlList()) {
            if (!C6319n.m19593a(str)) {
                C13595c cVar = new C13595c();
                cVar.mo33154a(false);
                ImageRequestBuilder a = ImageRequestBuilder.m40865a(Uri.parse(str)).mo33467a(new C13594b(cVar));
                if (bVar != null) {
                    a.mo33473a(bVar);
                    if (dVar != null) {
                        a.mo33468a(dVar);
                    }
                }
                arrayList.add(a.mo33476b());
            }
        }
        if (arrayList.size() == 0) {
            return new ImageRequest[0];
        }
        return (ImageRequest[]) arrayList.toArray(new ImageRequest[arrayList.size()]);
    }

    /* renamed from: a */
    private static C13401d<C13648f> m74296a(C13401d<C13648f> dVar, Uri uri, Context context, final UrlModel urlModel) {
        return new C13401d<C13648f>(null) {

            /* renamed from: a */
            UrlModel f59859a;

            /* renamed from: b */
            long f59860b = System.currentTimeMillis();

            public final void onRelease(String str) {
                if (null != null) {
                    null.onRelease(str);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onIntermediateImageSet(String str, C13648f fVar) {
                if (null != null) {
                    null.onIntermediateImageSet(str, fVar);
                }
            }

            public final void onFailure(String str, Throwable th) {
                if (null != null) {
                    null.onFailure(str, th);
                }
            }

            public final void onIntermediateImageFailed(String str, Throwable th) {
                if (null != null) {
                    null.onIntermediateImageFailed(str, th);
                }
            }

            public final void onSubmit(String str, Object obj) {
                this.f59860b = System.currentTimeMillis();
                this.f59859a = urlModel;
                if (null != null) {
                    null.onSubmit(str, obj);
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onFinalImageSet(String str, C13648f fVar, Animatable animatable) {
                if (null != null) {
                    null.onFinalImageSet(str, fVar, animatable);
                }
            }
        };
    }

    /* renamed from: a */
    private static void m74298a(C22447g gVar, UrlModel urlModel, int i, int i2, C13842b bVar) {
        Context context;
        if (gVar != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            ImageRequest[] a = m74299a(urlModel, null, null);
            if (a != null && a.length != 0) {
                C13382e eVar = (C13382e) ((C13382e) C13380c.m39166a().mo32729b(gVar.getController())).mo32746a((REQUEST[]) a);
                if (gVar.getContext() != null) {
                    context = gVar.getContext().getApplicationContext();
                } else {
                    context = null;
                }
                eVar.mo32743a(m74296a(null, a[0].mSourceUri, context, urlModel));
                gVar.setController(eVar.mo32730f());
            }
        }
    }
}
