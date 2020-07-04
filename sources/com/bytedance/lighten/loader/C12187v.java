package com.bytedance.lighten.loader;

import com.bytedance.lighten.core.ScaleType;
import com.facebook.drawee.drawable.C13421p.C13423b;

/* renamed from: com.bytedance.lighten.loader.v */
final class C12187v {

    /* renamed from: a */
    private static final C13423b f32432a = C13423b.f35599g;

    /* renamed from: a */
    public static C13423b m35444a(ScaleType scaleType) {
        C13423b bVar = f32432a;
        switch (scaleType) {
            case FIT_XY:
                return C13423b.f35593a;
            case FIT_START:
                return C13423b.f35594b;
            case FIT_END:
                return C13423b.f35596d;
            case FIT_CENTER:
                return C13423b.f35595c;
            case CENTER:
                return C13423b.f35597e;
            case CENTER_CROP:
                return C13423b.f35599g;
            case CENTER_INSIDE:
                return C13423b.f35598f;
            case FOCUS_CROP:
                return C13423b.f35600h;
            default:
                return bVar;
        }
    }
}
