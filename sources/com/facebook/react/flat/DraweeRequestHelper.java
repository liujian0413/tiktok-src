package com.facebook.react.flat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.C13396a;
import com.facebook.drawee.controller.C13401d;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.p698c.C13387b;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.infer.p728a.C13854a;

final class DraweeRequestHelper {
    private static AbstractDraweeControllerBuilder sControllerBuilder;
    private static C13439b sHierarchyBuilder;
    private int mAttachCounter;
    private final C13386a mDraweeController;

    /* access modifiers changed from: 0000 */
    public final void detach() {
        this.mAttachCounter--;
        if (this.mAttachCounter == 0) {
            this.mDraweeController.mo32720h();
        }
    }

    /* access modifiers changed from: 0000 */
    public final Drawable getDrawable() {
        return getHierarchy().mo32722a();
    }

    /* access modifiers changed from: 0000 */
    public final C13438a getHierarchy() {
        return (C13438a) C13854a.m40912a(this.mDraweeController.mo32718f());
    }

    static void setDraweeControllerBuilder(AbstractDraweeControllerBuilder abstractDraweeControllerBuilder) {
        sControllerBuilder = abstractDraweeControllerBuilder;
    }

    static void setResources(Resources resources) {
        sHierarchyBuilder = new C13439b(resources);
    }

    /* access modifiers changed from: 0000 */
    public final void attach(InvalidateCallback invalidateCallback) {
        this.mAttachCounter++;
        if (this.mAttachCounter == 1) {
            getDrawable().setCallback((Callback) invalidateCallback.get());
            this.mDraweeController.mo32719g();
        }
    }

    DraweeRequestHelper(ImageRequest imageRequest, ImageRequest imageRequest2, C13401d dVar) {
        AbstractDraweeControllerBuilder a = sControllerBuilder.mo32748b(imageRequest).mo32744a(RCTImageView.getCallerContext()).mo32743a(dVar);
        if (imageRequest2 != null) {
            a.mo32750c(imageRequest2);
        }
        C13396a c = a.mo32730f();
        c.mo32697a((C13387b) sHierarchyBuilder.mo32908a());
        this.mDraweeController = c;
    }
}
