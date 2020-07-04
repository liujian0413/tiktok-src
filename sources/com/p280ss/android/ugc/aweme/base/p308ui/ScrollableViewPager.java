package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.support.p022v4.view.DmtRtlViewPager;
import android.support.p022v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.ILegacyService;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.utils.C43127fh;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.base.ui.ScrollableViewPager */
public class ScrollableViewPager extends DmtRtlViewPager {

    /* renamed from: f */
    public int f61814f;

    /* renamed from: g */
    public boolean f61815g = true;

    /* renamed from: h */
    float f61816h;

    /* renamed from: i */
    float f61817i;

    /* renamed from: j */
    C23434a f61818j = new C23434a() {
        /* renamed from: a */
        public final boolean mo61031a(int i) {
            return true;
        }
    };

    /* renamed from: k */
    private boolean f61819k;

    /* renamed from: l */
    private C23466f f61820l;

    /* renamed from: m */
    private boolean f61821m;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.ScrollableViewPager$a */
    public interface C23434a {
        /* renamed from: a */
        boolean mo61031a(int i);
    }

    public int getItemCount() {
        PagerAdapter adapter = getAdapter();
        if (adapter == null) {
            return 0;
        }
        return adapter.getCount();
    }

    /* renamed from: a */
    public final ScrollableViewPager mo61025a(C23434a aVar) {
        this.f61818j = aVar;
        return this;
    }

    public void setBlockCanScroll(boolean z) {
        this.f61821m = z;
    }

    public void setEnableDispatchTouchEventCheck(boolean z) {
        this.f61819k = z;
    }

    public void setOnFlingEndListener(C23466f fVar) {
        this.f61820l = fVar;
    }

    /* renamed from: a */
    private void m76881a(Context context) {
        this.f61814f = C23486n.m77122a(8.0d);
        setDefaultGutterSize(0);
    }

    public ScrollableViewPager(Context context) {
        super(context);
        m76881a(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f61815g && this.f61819k && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            m76882a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (((ILegacyService) ServiceManager.get().getService(ILegacyService.class)).getMainPageExperimentService().mo84631a(motionEvent, getContext())) {
            return false;
        }
        boolean z = true;
        if (!((this.f61815g && m76882a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            z = false;
        }
        if (z) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = true;
        if (!((this.f61815g && m76882a(motionEvent)) || motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            z = false;
        }
        if (z) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* renamed from: a */
    private boolean m76882a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        boolean z = true;
        if (action == 0) {
            this.f61816h = motionEvent.getX();
            this.f61817i = motionEvent.getY();
            return true;
        }
        float x = motionEvent.getX() - this.f61816h;
        float y = motionEvent.getY() - this.f61817i;
        if (Math.abs(x) < 1.0E-6f) {
            return true;
        }
        if (C43127fh.m136806a(getContext())) {
            x = -x;
        }
        boolean z2 = false;
        if (x <= 0.0f) {
            if (getCurrentItem() < getItemCount() - 1 && this.f61818j.mo61031a(-1)) {
                z2 = true;
            }
            if ((action == 1 || action == 3) && !z2 && this.f61820l != null && Math.abs(x) > ((float) this.f61814f) && Math.abs(x) > Math.abs(y)) {
                this.f61820l.mo61074a();
            }
            z = z2;
        } else if (getCurrentItem() <= 0 || !this.f61818j.mo61031a(1)) {
            z = false;
        }
        if (!z && x > 0.0f) {
            this.f61816h = motionEvent.getX();
        }
        return z;
    }

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m76881a(context);
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        try {
            super.addFocusables(arrayList, i, i2);
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
            C2077a.m9160a((Throwable) e);
        }
    }

    /* renamed from: a */
    public final boolean mo3479a(View view, boolean z, int i, int i2, int i3) {
        if (this.f61821m || !C23487o.m77147a(view) || !super.mo3479a(view, z, i, i2, i3)) {
            return false;
        }
        return true;
    }
}
