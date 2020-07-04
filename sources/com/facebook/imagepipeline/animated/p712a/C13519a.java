package com.facebook.imagepipeline.animated.p712a;

import android.content.Context;
import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.decoder.C13629b;
import com.facebook.imagepipeline.p719f.C13642a;

/* renamed from: com.facebook.imagepipeline.animated.a.a */
public interface C13519a {
    C13642a getAnimatedDrawableFactory(Context context);

    C13629b getGifDecoder(Config config);

    C13629b getWebPDecoder(Config config);
}
