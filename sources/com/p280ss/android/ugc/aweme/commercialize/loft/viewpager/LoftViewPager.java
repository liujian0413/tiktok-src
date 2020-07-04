package com.p280ss.android.ugc.aweme.commercialize.loft.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.p280ss.android.ugc.aweme.main.base.transforms.CubeOutTransformer;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.viewpager.LoftViewPager */
public final class LoftViewPager extends SSViewPager {

    /* renamed from: a */
    private boolean f65744a;

    public final void setForbidScroll(boolean z) {
        this.f65744a = z;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f65744a) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f65744a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LoftViewPager(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
        setOverScrollMode(2);
        setPageTransformer(true, new CubeOutTransformer());
    }

    public LoftViewPager(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        setOverScrollMode(2);
        setPageTransformer(true, new CubeOutTransformer());
    }
}
