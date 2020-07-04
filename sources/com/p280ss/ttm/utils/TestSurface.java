package com.p280ss.ttm.utils;

import android.view.Surface;

/* renamed from: com.ss.ttm.utils.TestSurface */
public class TestSurface {
    private static final native int _testSurfaceLocker(Surface surface);

    public static int testSurfaceLoked(Surface surface) {
        return _testSurfaceLocker(surface);
    }
}
