package com.facebook.imagepipeline.p722i;

import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.support.p022v4.util.Pools.SynchronizedPool;
import com.facebook.imagepipeline.memory.C13806c;
import com.facebook.imageutils.C13844a;

/* renamed from: com.facebook.imagepipeline.i.e */
public final class C13658e extends C13655b {
    /* renamed from: a */
    private static boolean m40276a(Options options) {
        if (options.outColorSpace == null || !options.outColorSpace.isWideGamut() || options.inPreferredConfig == Config.RGBA_F16) {
            return false;
        }
        return true;
    }

    public C13658e(C13806c cVar, int i, SynchronizedPool synchronizedPool) {
        super(cVar, i, synchronizedPool);
    }

    /* renamed from: a */
    public final int mo33289a(int i, int i2, Options options) {
        if (m40276a(options)) {
            return i * i2 * 8;
        }
        return C13844a.m40884a(i, i2, options.inPreferredConfig);
    }
}
