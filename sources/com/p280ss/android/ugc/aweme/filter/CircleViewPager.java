package com.p280ss.android.ugc.aweme.filter;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.p280ss.android.ugc.aweme.p1416n.C34033b;

/* renamed from: com.ss.android.ugc.aweme.filter.CircleViewPager */
public class CircleViewPager extends SSViewPager {

    /* renamed from: a */
    private int f76899a;

    /* renamed from: b */
    private C29141a f76900b;

    /* renamed from: c */
    private int f76901c;

    /* renamed from: d */
    private C29142b f76902d;

    /* renamed from: com.ss.android.ugc.aweme.filter.CircleViewPager$a */
    public interface C29141a {
        /* renamed from: a */
        void mo74651a();

        /* renamed from: a */
        void mo74652a(float f);
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.CircleViewPager$b */
    public interface C29142b {
    }

    /* renamed from: a */
    private void m95596a() {
        setOnTouchListener(new C34033b(1.2f, 200, null));
    }

    public void setOnScrolledListener(C29141a aVar) {
        this.f76900b = aVar;
    }

    public void setOnViewPagerTouchEventListener(C29142b bVar) {
        this.f76902d = bVar;
    }

    public CircleViewPager(Context context) {
        super(context);
        m95596a();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setStartItem(int i) {
        this.f76901c = i;
        setCurrentItem(i);
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        this.f76899a = getWidth();
        super.dispatchDraw(canvas);
    }

    /* renamed from: a */
    public final void mo74645a(float f) {
        float currentItem = ((((float) getCurrentItem()) + f) - ((float) this.f76901c)) * ((float) this.f76899a);
        if (currentItem >= ((float) ((-this.f76901c) * this.f76899a))) {
            if (currentItem > ((float) (((getAdapter().getCount() - this.f76901c) - 1) * this.f76899a))) {
                if (this.f76900b != null) {
                    this.f76900b.mo74651a();
                }
                return;
            }
            if (this.f76900b != null) {
                this.f76900b.mo74652a(f);
            }
            scrollTo((int) currentItem, 0);
        }
    }

    public CircleViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m95596a();
    }
}
