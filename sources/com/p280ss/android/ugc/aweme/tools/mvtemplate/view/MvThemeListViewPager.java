package com.p280ss.android.ugc.aweme.tools.mvtemplate.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p280ss.android.ugc.aweme.effect.NoScrollViewPager;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent.Producer;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.MvTemplateSelectEvent.SelectState;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager */
public class MvThemeListViewPager extends NoScrollViewPager {

    /* renamed from: a */
    public boolean f110643a;

    /* renamed from: b */
    public C42558a f110644b;

    /* renamed from: c */
    private float f110645c;

    /* renamed from: d */
    private float f110646d;

    /* renamed from: e */
    private int f110647e;

    /* renamed from: f */
    private boolean f110648f;

    /* renamed from: g */
    private float f110649g;

    /* renamed from: h */
    private float f110650h;

    /* renamed from: i */
    private boolean f110651i = true;

    /* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.view.MvThemeListViewPager$a */
    public interface C42558a {
        /* renamed from: a */
        void mo104041a();

        /* renamed from: a */
        void mo104042a(float f);
    }

    /* renamed from: a */
    private void m135232a() {
        if (getTranslationX() != this.f110650h && this.f110648f) {
            ValueAnimator duration = ValueAnimator.ofFloat(new float[]{getTranslationX(), this.f110650h}).setDuration(200);
            duration.addUpdateListener(new C42559a(this));
            duration.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    MvThemeListViewPager.this.f110643a = false;
                    if (MvThemeListViewPager.this.f110644b != null) {
                        MvThemeListViewPager.this.f110644b.mo104041a();
                    }
                }
            });
            duration.start();
            this.f110643a = true;
        }
    }

    public void setBounceScrollListener(C42558a aVar) {
        this.f110644b = aVar;
    }

    public void setHandleClickChange(boolean z) {
        this.f110651i = z;
    }

    public MvThemeListViewPager(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo104141a(ValueAnimator valueAnimator) {
        setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* renamed from: a */
    private void m135233a(float f) {
        this.f110648f = true;
        float translationX = getTranslationX() + (f * 0.45f);
        if (this.f110644b != null) {
            this.f110644b.mo104042a(translationX);
        }
        setTranslationX(translationX);
    }

    /* renamed from: d */
    private void m135237d(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float f = x - this.f110649g;
        if (Math.abs(f) > 4.0f) {
            m135233a(f);
            this.f110649g = x;
        }
    }

    /* renamed from: c */
    private boolean m135236c(MotionEvent motionEvent) {
        if (this.f110647e == 0 && motionEvent.getX() > this.f110649g) {
            return true;
        }
        if (getAdapter() == null || this.f110647e != getAdapter().getCount() - 1 || motionEvent.getX() >= this.f110649g) {
            return false;
        }
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f110645c = motionEvent.getX();
            this.f110646d = motionEvent.getY();
            C42961az.m136380a(new MvTemplateSelectEvent(SelectState.START, Producer.MAIN_TEMPLATE));
        } else if (motionEvent.getAction() == 1 && this.f110651i) {
            m135234a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f110649g = motionEvent.getX();
            this.f110647e = getCurrentItem();
            this.f110650h = getTranslationX();
        } else if (action == 2 && m135236c(motionEvent)) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f110643a || getAdapter() == null) {
            return super.onTouchEvent(motionEvent);
        }
        switch (motionEvent.getAction()) {
            case 1:
                m135232a();
                this.f110648f = false;
                break;
            case 2:
                if (m135236c(motionEvent)) {
                    m135237d(motionEvent);
                    break;
                }
                break;
        }
        if (this.f110648f || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m135234a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (Math.abs(x - this.f110645c) > 60.0f || Math.abs(y - this.f110646d) > 60.0f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        View b = m135235b(motionEvent);
        if (b != null) {
            int intValue = ((Integer) b.getTag()).intValue();
            if (getCurrentItem() != intValue) {
                setCurrentItem(intValue, true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    private View m135235b(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int childCount = getChildCount();
        int currentItem = getCurrentItem();
        int[] iArr = new int[2];
        char c = 0;
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            int intValue = ((Integer) childAt.getTag()).intValue();
            childAt.getLocationOnScreen(iArr);
            int i5 = iArr[c];
            int i6 = iArr[1];
            int width = iArr[c] + childAt.getWidth();
            int height = iArr[1] + childAt.getHeight();
            if (intValue < currentItem) {
                i3 = i4;
                double d = (double) width;
                double width2 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                Double.isNaN(width2);
                double d2 = width2 * 0.5d;
                i = height;
                i2 = i6;
                double width3 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                Double.isNaN(width3);
                double d3 = d2 + (width3 * 0.5d);
                Double.isNaN(d);
                width = (int) (d - d3);
                double d4 = (double) i5;
                double width4 = (double) (((float) childAt.getWidth()) * 0.100000024f);
                Double.isNaN(width4);
                double d5 = width4 * 0.5d;
                double width5 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                Double.isNaN(width5);
                double d6 = d5 + (width5 * 0.5d);
                Double.isNaN(d4);
                i5 = (int) (d4 - d6);
            } else {
                i3 = i4;
                i = height;
                i2 = i6;
                if (intValue == currentItem) {
                    i5 = (int) (((float) i5) + (((float) childAt.getWidth()) * Math.abs(0.0f)));
                } else if (intValue > currentItem) {
                    double d7 = (double) width;
                    double width6 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                    Double.isNaN(width6);
                    double d8 = width6 * 0.5d;
                    Double.isNaN(d7);
                    width = (int) (d7 - d8);
                    double d9 = (double) i5;
                    double width7 = (double) (((float) childAt.getWidth()) * Math.abs(0.0f));
                    Double.isNaN(width7);
                    double d10 = width7 * 0.5d;
                    Double.isNaN(d9);
                    i5 = (int) (d9 - d10);
                }
            }
            float rawX = motionEvent.getRawX();
            float rawY = motionEvent.getRawY();
            if (rawX > ((float) i5) && rawX < ((float) width) && rawY > ((float) i2) && rawY < ((float) i)) {
                return childAt;
            }
            i4 = i3 + 1;
            c = 0;
        }
        return null;
    }

    public MvThemeListViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
