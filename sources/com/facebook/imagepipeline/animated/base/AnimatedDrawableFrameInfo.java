package com.facebook.imagepipeline.animated.base;

public final class AnimatedDrawableFrameInfo {

    /* renamed from: a */
    public final int f35895a;

    /* renamed from: b */
    public final int f35896b;

    /* renamed from: c */
    public final int f35897c;

    /* renamed from: d */
    public final int f35898d;

    /* renamed from: e */
    public final int f35899e;

    /* renamed from: f */
    public final BlendOperation f35900f;

    /* renamed from: g */
    public final DisposalMethod f35901g;

    public enum BlendOperation {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    public enum DisposalMethod {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public AnimatedDrawableFrameInfo(int i, int i2, int i3, int i4, int i5, BlendOperation blendOperation, DisposalMethod disposalMethod) {
        this.f35895a = i;
        this.f35896b = i2;
        this.f35897c = i3;
        this.f35898d = i4;
        this.f35899e = i5;
        this.f35900f = blendOperation;
        this.f35901g = disposalMethod;
    }
}
