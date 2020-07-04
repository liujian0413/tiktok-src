package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.support.design.behavior.HideBottomViewOnScrollBehavior;
import android.support.design.p015a.C0234a;
import android.support.design.shape.MaterialShapeDrawable;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0352a;
import android.support.design.widget.CoordinatorLayout.C0355d;
import android.support.design.widget.FloatingActionButton;
import android.support.p022v4.graphics.drawable.C0727a;
import android.support.p022v4.view.AbsSavedState;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.ActionMenuView;
import android.support.p029v7.widget.Toolbar;
import android.support.p029v7.widget.Toolbar.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class BottomAppBar extends Toolbar implements C0352a {

    /* renamed from: a */
    public final MaterialShapeDrawable f898a;

    /* renamed from: b */
    public final C0251a f899b;

    /* renamed from: c */
    public Animator f900c;

    /* renamed from: d */
    public Animator f901d;

    /* renamed from: e */
    public Animator f902e;

    /* renamed from: f */
    public int f903f;

    /* renamed from: g */
    public boolean f904g;

    /* renamed from: h */
    AnimatorListenerAdapter f905h;

    /* renamed from: i */
    private final int f906i;

    /* renamed from: j */
    private boolean f907j;

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* renamed from: b */
        private final Rect f916b = new Rect();

        public Behavior() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo683a(BottomAppBar bottomAppBar) {
            super.mo683a(bottomAppBar);
            FloatingActionButton a = bottomAppBar.mo688a();
            if (a != null) {
                a.clearAnimation();
                a.animate().translationY(bottomAppBar.getFabTranslationY()).setInterpolator(C0234a.f875d).setDuration(225);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void mo686b(BottomAppBar bottomAppBar) {
            super.mo686b(bottomAppBar);
            FloatingActionButton a = bottomAppBar.mo688a();
            if (a != null) {
                a.mo1467a(this.f916b);
                float measuredHeight = (float) (a.getMeasuredHeight() - this.f916b.height());
                a.clearAnimation();
                a.animate().translationY(((float) (-a.getPaddingBottom())) + measuredHeight).setInterpolator(C0234a.f874c).setDuration(175);
            }
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: a */
        private static boolean m878a(FloatingActionButton floatingActionButton, BottomAppBar bottomAppBar) {
            ((C0355d) floatingActionButton.getLayoutParams()).f1410d = 17;
            bottomAppBar.mo689a(floatingActionButton);
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo684a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            FloatingActionButton a = bottomAppBar.mo688a();
            if (a != null) {
                m878a(a, bottomAppBar);
                a.mo1469b(this.f916b);
                bottomAppBar.setFabDiameter(this.f916b.height());
            }
            if (!bottomAppBar.mo691b()) {
                bottomAppBar.mo692c();
            }
            coordinatorLayout.mo1394a((View) bottomAppBar, i);
            return super.mo684a(coordinatorLayout, bottomAppBar, i);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo718a(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            if (!bottomAppBar.getHideOnScroll() || !super.mo718a(coordinatorLayout, bottomAppBar, view, view2, i, i2)) {
                return false;
            }
            return true;
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ClassLoaderCreator<SavedState>() {
            /* renamed from: a */
            private static SavedState[] m886a(int i) {
                return new SavedState[i];
            }

            /* renamed from: a */
            private static SavedState m884a(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m884a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m886a(i);
            }

            /* renamed from: a */
            private static SavedState m885a(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return m885a(parcel, classLoader);
            }
        };

        /* renamed from: a */
        int f917a;

        /* renamed from: b */
        boolean f918b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f917a);
            parcel.writeInt(this.f918b ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            super(parcel, classLoader);
            this.f917a = parcel.readInt();
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f918b = z;
        }
    }

    public int getFabAlignmentMode() {
        return this.f903f;
    }

    public boolean getHideOnScroll() {
        return this.f907j;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* renamed from: a */
    public final void mo690a(ActionMenuView actionMenuView, int i, boolean z) {
        boolean z2 = C0991u.m4220h(this) == 1;
        int i2 = 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof LayoutParams) && (((LayoutParams) childAt.getLayoutParams()).f3703a & 8388615) == 8388611) {
                i2 = Math.max(i2, z2 ? childAt.getLeft() : childAt.getRight());
            }
        }
        actionMenuView.setTranslationX((i != 1 || !z) ? 0.0f : (float) (i2 - (z2 ? actionMenuView.getRight() : actionMenuView.getLeft())));
    }

    private float getFabTranslationX() {
        return (float) m865b(this.f903f);
    }

    public ColorStateList getBackgroundTint() {
        return this.f898a.f1194i;
    }

    public android.support.design.widget.CoordinatorLayout.Behavior<BottomAppBar> getBehavior() {
        return new Behavior();
    }

    public float getCradleVerticalOffset() {
        return this.f899b.f922d;
    }

    public float getFabCradleMargin() {
        return this.f899b.f920b;
    }

    public float getFabCradleRoundedCornerRadius() {
        return this.f899b.f919a;
    }

    public float getFabTranslationY() {
        return m860a(this.f904g);
    }

    /* renamed from: d */
    private boolean m868d() {
        FloatingActionButton a = mo688a();
        if (a == null || !a.mo1471b()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private void m869e() {
        if (this.f900c != null) {
            this.f900c.cancel();
        }
        if (this.f902e != null) {
            this.f902e.cancel();
        }
        if (this.f901d != null) {
            this.f901d.cancel();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f917a = this.f903f;
        savedState.f918b = this.f904g;
        return savedState;
    }

    /* renamed from: b */
    public final boolean mo691b() {
        if ((this.f900c == null || !this.f900c.isRunning()) && ((this.f902e == null || !this.f902e.isRunning()) && (this.f901d == null || !this.f901d.isRunning()))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo692c() {
        float f;
        this.f899b.f923e = getFabTranslationX();
        FloatingActionButton a = mo688a();
        MaterialShapeDrawable materialShapeDrawable = this.f898a;
        if (!this.f904g || !m868d()) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        materialShapeDrawable.mo1188a(f);
        if (a != null) {
            a.setTranslationY(getFabTranslationY());
            a.setTranslationX(getFabTranslationX());
        }
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            actionMenuView.setAlpha(1.0f);
            if (!m868d()) {
                mo690a(actionMenuView, 0, false);
                return;
            }
            mo690a(actionMenuView, this.f903f, this.f904g);
        }
    }

    /* renamed from: a */
    public final FloatingActionButton mo688a() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).mo1403c((View) this)) {
            if (view instanceof FloatingActionButton) {
                return (FloatingActionButton) view;
            }
        }
        return null;
    }

    public void setHideOnScroll(boolean z) {
        this.f907j = z;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0727a.m3105a((Drawable) this.f898a, colorStateList);
    }

    /* renamed from: b */
    private void m867b(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo1473d(this.f905h);
        floatingActionButton.mo1468b((AnimatorListener) this.f905h);
    }

    /* renamed from: a */
    public final void mo689a(FloatingActionButton floatingActionButton) {
        m867b(floatingActionButton);
        floatingActionButton.mo1472c((AnimatorListener) this.f905h);
        floatingActionButton.mo1465a((AnimatorListener) this.f905h);
    }

    public void setFabAlignmentMode(int i) {
        m861a(i);
        m863a(i, this.f904g);
        this.f903f = i;
    }

    /* renamed from: b */
    private int m865b(int i) {
        boolean z;
        int i2 = 1;
        if (C0991u.m4220h(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (i != 1) {
            return 0;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - this.f906i;
        if (z) {
            i2 = -1;
        }
        return measuredWidth * i2;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f3171e);
        this.f903f = savedState.f917a;
        this.f904g = savedState.f918b;
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            this.f899b.f922d = f;
            this.f898a.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            this.f899b.f920b = f;
            this.f898a.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            this.f899b.f919a = f;
            this.f898a.invalidateSelf();
        }
    }

    /* access modifiers changed from: 0000 */
    public void setFabDiameter(int i) {
        float f = (float) i;
        if (f != this.f899b.f921c) {
            this.f899b.f921c = f;
            this.f898a.invalidateSelf();
        }
    }

    /* renamed from: a */
    private void m861a(int i) {
        if (this.f903f != i && C0991u.m4167D(this)) {
            if (this.f901d != null) {
                this.f901d.cancel();
            }
            ArrayList arrayList = new ArrayList();
            m862a(i, (List<Animator>) arrayList);
            m866b(i, arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f901d = animatorSet;
            this.f901d.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f901d = null;
                }
            });
            this.f901d.start();
        }
    }

    /* renamed from: a */
    private float m860a(boolean z) {
        FloatingActionButton a = mo688a();
        if (a == null) {
            return 0.0f;
        }
        Rect rect = new Rect();
        a.mo1467a(rect);
        float height = (float) rect.height();
        if (height == 0.0f) {
            height = (float) a.getMeasuredHeight();
        }
        float height2 = (float) (a.getHeight() - rect.bottom);
        float f = (-getCradleVerticalOffset()) + (height / 2.0f) + height2;
        float height3 = ((float) (a.getHeight() - rect.height())) - ((float) a.getPaddingBottom());
        float f2 = (float) (-getMeasuredHeight());
        if (z) {
            height3 = f;
        }
        return f2 + height3;
    }

    /* renamed from: b */
    private void m866b(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo688a(), "translationX", new float[]{(float) m865b(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: a */
    private void m862a(int i, List<Animator> list) {
        if (this.f904g) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f899b.f923e, (float) m865b(i)});
            ofFloat.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BottomAppBar.this.f899b.f923e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    BottomAppBar.this.f898a.invalidateSelf();
                }
            });
            ofFloat.setDuration(300);
            list.add(ofFloat);
        }
    }

    /* renamed from: a */
    private void m863a(int i, boolean z) {
        if (C0991u.m4167D(this)) {
            if (this.f902e != null) {
                this.f902e.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (!m868d()) {
                i = 0;
                z = false;
            }
            m864a(i, z, (List<Animator>) arrayList);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f902e = animatorSet;
            this.f902e.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    BottomAppBar.this.f902e = null;
                }
            });
            this.f902e.start();
        }
    }

    /* renamed from: a */
    private void m864a(final int i, final boolean z, List<Animator> list) {
        final ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if ((this.f904g || (z && m868d())) && (this.f903f == 1 || i == 1)) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new AnimatorListenerAdapter() {

                    /* renamed from: a */
                    public boolean f911a;

                    public final void onAnimationCancel(Animator animator) {
                        this.f911a = true;
                    }

                    public final void onAnimationEnd(Animator animator) {
                        if (!this.f911a) {
                            BottomAppBar.this.mo690a(actionMenuView, i, z);
                        }
                    }
                });
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
                return;
            }
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m869e();
        mo692c();
    }
}
