package com.airbnb.lottie.model.content;

import com.airbnb.lottie.model.p058a.C1791d;
import com.airbnb.lottie.model.p058a.C1795h;

public final class Mask {

    /* renamed from: a */
    public final MaskMode f6469a;

    /* renamed from: b */
    public final C1795h f6470b;

    /* renamed from: c */
    public final C1791d f6471c;

    public enum MaskMode {
        MaskModeAdd,
        MaskModeSubtract,
        MaskModeIntersect
    }

    public Mask(MaskMode maskMode, C1795h hVar, C1791d dVar) {
        this.f6469a = maskMode;
        this.f6470b = hVar;
        this.f6471c = dVar;
    }
}
