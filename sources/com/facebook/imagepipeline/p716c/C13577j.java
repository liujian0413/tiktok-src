package com.facebook.imagepipeline.p716c;

import android.net.Uri;
import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.C13270f;
import com.facebook.imagepipeline.request.C13842b;
import com.facebook.imagepipeline.request.ImageRequest;

/* renamed from: com.facebook.imagepipeline.c.j */
public final class C13577j implements C13568f {

    /* renamed from: a */
    private static C13577j f35985a;

    protected C13577j() {
    }

    /* renamed from: a */
    private static Uri m39965a(Uri uri) {
        return uri;
    }

    /* renamed from: a */
    public static synchronized C13577j m39966a() {
        C13577j jVar;
        synchronized (C13577j.class) {
            if (f35985a == null) {
                f35985a = new C13577j();
            }
            jVar = f35985a;
        }
        return jVar;
    }

    /* renamed from: c */
    public final C13265a mo33116c(ImageRequest imageRequest, Object obj) {
        return mo33113a(imageRequest, imageRequest.mSourceUri, obj);
    }

    /* renamed from: a */
    public final C13265a mo33114a(ImageRequest imageRequest, Object obj) {
        C13558c cVar = new C13558c(m39965a(imageRequest.mSourceUri).toString(), imageRequest.mResizeOptions, imageRequest.mRotationOptions, imageRequest.mImageDecodeOptions, null, null, obj);
        return cVar;
    }

    /* renamed from: b */
    public final C13265a mo33115b(ImageRequest imageRequest, Object obj) {
        String str;
        C13265a aVar;
        C13842b bVar = imageRequest.mPostprocessor;
        if (bVar != null) {
            C13265a postprocessorCacheKey = bVar.getPostprocessorCacheKey();
            str = bVar.getClass().getName();
            aVar = postprocessorCacheKey;
        } else {
            aVar = null;
            str = null;
        }
        C13558c cVar = new C13558c(m39965a(imageRequest.mSourceUri).toString(), imageRequest.mResizeOptions, imageRequest.mRotationOptions, imageRequest.mImageDecodeOptions, aVar, str, obj);
        return cVar;
    }

    /* renamed from: a */
    public final C13265a mo33113a(ImageRequest imageRequest, Uri uri, Object obj) {
        return new C13270f(m39965a(uri).toString());
    }
}
