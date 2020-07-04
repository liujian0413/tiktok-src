package com.facebook.imagepipeline.p722i;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Rect;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13647e;

/* renamed from: com.facebook.imagepipeline.i.f */
public interface C13659f {
    C13326a<Bitmap> decodeFromEncodedImageWithColorSpace(C13647e eVar, Config config, Rect rect, boolean z);

    C13326a<Bitmap> decodeJPEGFromEncodedImage(C13647e eVar, Config config, Rect rect, int i);

    C13326a<Bitmap> decodeJPEGFromEncodedImageWithColorSpace(C13647e eVar, Config config, Rect rect, int i, boolean z);
}
