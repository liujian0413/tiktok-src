package com.facebook.imagepipeline.request;

import android.graphics.Bitmap;
import com.facebook.cache.common.C13265a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p715b.C13551f;

/* renamed from: com.facebook.imagepipeline.request.b */
public interface C13842b {
    String getName();

    C13265a getPostprocessorCacheKey();

    C13326a<Bitmap> process(Bitmap bitmap, C13551f fVar);
}
