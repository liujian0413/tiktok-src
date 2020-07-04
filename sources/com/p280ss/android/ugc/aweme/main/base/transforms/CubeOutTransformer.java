package com.p280ss.android.ugc.aweme.main.base.transforms;

import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.main.base.transforms.CubeOutTransformer */
public class CubeOutTransformer extends ABaseTransformer {

    /* renamed from: a */
    private final int f85834a;

    /* renamed from: a */
    public final boolean mo84620a() {
        return true;
    }

    public CubeOutTransformer() {
        this(20);
    }

    private CubeOutTransformer(int i) {
        this.f85834a = 20;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo84621b(View view, float f) {
        view.setCameraDistance((float) (view.getWidth() * this.f85834a));
        float f2 = 0.0f;
        if (f < 0.0f) {
            f2 = (float) view.getWidth();
        }
        view.setPivotX(f2);
        view.setPivotY(((float) view.getHeight()) * 0.5f);
        view.setRotationY(f * 90.0f);
    }
}
