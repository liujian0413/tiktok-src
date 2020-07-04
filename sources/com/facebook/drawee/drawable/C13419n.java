package com.facebook.drawee.drawable;

import android.graphics.Canvas;
import android.graphics.drawable.NinePatchDrawable;
import com.facebook.imagepipeline.p725l.C13783b;

/* renamed from: com.facebook.drawee.drawable.n */
public final class C13419n extends C13418m {
    public C13419n(NinePatchDrawable ninePatchDrawable) {
        super(ninePatchDrawable);
    }

    public final void draw(Canvas canvas) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("RoundedNinePatchDrawable#draw");
        }
        if (!mo32842a()) {
            super.draw(canvas);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            return;
        }
        mo32852b();
        mo32853c();
        canvas.clipPath(this.f35565f);
        super.draw(canvas);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }
}
