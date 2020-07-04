package com.bytedance.scene.utlity;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.bytedance.scene.utlity.a */
public final class C12689a {

    /* renamed from: com.bytedance.scene.utlity.a$a */
    public static class C12690a {

        /* renamed from: a */
        public final float f33680a;

        /* renamed from: b */
        public final float f33681b;

        /* renamed from: c */
        public final float f33682c;

        /* renamed from: d */
        public final float f33683d;

        /* renamed from: e */
        public final float f33684e;

        /* renamed from: f */
        public final float f33685f;

        /* renamed from: g */
        public final float f33686g;

        /* renamed from: h */
        public final float f33687h;

        public C12690a(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
            this.f33680a = f;
            this.f33681b = f2;
            this.f33682c = f3;
            this.f33683d = f4;
            this.f33684e = f5;
            this.f33685f = f6;
            this.f33686g = f7;
            this.f33687h = f8;
        }
    }

    /* renamed from: a */
    public static void m36889a(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setAlpha(1.0f);
        view.clearAnimation();
    }

    /* renamed from: c */
    public static void m36892c(View view) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        int childCount = viewGroup.getChildCount();
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild >= 0 && indexOfChild != childCount - 1) {
            view.bringToFront();
        }
    }

    /* renamed from: b */
    public static C12690a m36891b(View view) {
        C12690a aVar = new C12690a(view.getTranslationX(), view.getTranslationY(), view.getScaleX(), view.getScaleY(), view.getRotation(), view.getRotationX(), view.getRotationY(), view.getAlpha());
        return aVar;
    }

    /* renamed from: a */
    public static void m36890a(View view, C12690a aVar) {
        view.setTranslationX(aVar.f33680a);
        view.setTranslationY(aVar.f33681b);
        view.setScaleX(aVar.f33682c);
        view.setScaleY(aVar.f33683d);
        view.setRotation(aVar.f33684e);
        view.setRotationX(aVar.f33685f);
        view.setRotationY(aVar.f33686g);
        view.setAlpha(aVar.f33687h);
    }
}
