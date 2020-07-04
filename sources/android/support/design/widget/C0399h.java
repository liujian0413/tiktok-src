package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.design.p020f.C0276a;
import android.view.View;
import java.util.ArrayList;

/* renamed from: android.support.design.widget.h */
final class C0399h extends C0389g {

    /* renamed from: x */
    private InsetDrawable f1725x;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo1820c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo1823d() {
        mo1825e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final boolean mo1828h() {
        return false;
    }

    /* renamed from: a */
    public final float mo1805a() {
        return this.f1704v.getElevation();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1817b(ColorStateList colorStateList) {
        if (this.f1696h instanceof RippleDrawable) {
            ((RippleDrawable) this.f1696h).setColor(C0276a.m1088a(colorStateList));
        } else {
            super.mo1817b(colorStateList);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo1818b(Rect rect) {
        if (this.f1705w.mo1530b()) {
            InsetDrawable insetDrawable = new InsetDrawable(this.f1696h, rect.left, rect.top, rect.right, rect.bottom);
            this.f1725x = insetDrawable;
            this.f1705w.mo1529a(this.f1725x);
            return;
        }
        this.f1705w.mo1529a(this.f1696h);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1811a(Rect rect) {
        if (this.f1705w.mo1530b()) {
            float a = this.f1705w.mo1527a();
            float a2 = mo1805a() + this.f1701m;
            int ceil = (int) Math.ceil((double) ShadowDrawableWrapper.m1572b(a2, a, false));
            int ceil2 = (int) Math.ceil((double) ShadowDrawableWrapper.m1568a(a2, a, false));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1813a(int[] iArr) {
        if (VERSION.SDK_INT == 21) {
            if (this.f1704v.isEnabled()) {
                this.f1704v.setElevation(this.f1699k);
                if (this.f1704v.isPressed()) {
                    this.f1704v.setTranslationZ(this.f1701m);
                } else if (this.f1704v.isFocused() || this.f1704v.isHovered()) {
                    this.f1704v.setTranslationZ(this.f1700l);
                } else {
                    this.f1704v.setTranslationZ(0.0f);
                }
            } else {
                this.f1704v.setElevation(0.0f);
                this.f1704v.setTranslationZ(0.0f);
            }
        }
    }

    C0399h(C0415r rVar, C0403k kVar) {
        super(rVar, kVar);
    }

    /* renamed from: a */
    private Animator m1767a(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f1704v, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f1704v, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(f1675a);
        return animatorSet;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo1807a(float f, float f2, float f3) {
        if (VERSION.SDK_INT == 21) {
            this.f1704v.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(f1676p, m1767a(f, f3));
            stateListAnimator.addState(f1677q, m1767a(f, f2));
            stateListAnimator.addState(f1678r, m1767a(f, f2));
            stateListAnimator.addState(f1679s, m1767a(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f1704v, "elevation", new float[]{f}).setDuration(0));
            if (VERSION.SDK_INT >= 22 && VERSION.SDK_INT <= 24) {
                arrayList.add(ObjectAnimator.ofFloat(this.f1704v, View.TRANSLATION_Z, new float[]{this.f1704v.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f1704v, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(f1675a);
            stateListAnimator.addState(f1680t, animatorSet);
            stateListAnimator.addState(f1681u, m1767a(0.0f, 0.0f));
            this.f1704v.setStateListAnimator(stateListAnimator);
        }
        if (this.f1705w.mo1530b()) {
            mo1825e();
        }
    }
}
