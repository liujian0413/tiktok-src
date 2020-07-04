package com.bytedance.android.livesdk.feed;

import android.content.Context;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.view.C0995v;
import android.support.p022v4.view.ViewPager;
import android.support.p029v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.android.live.uikit.refresh.I18nSwipeRefreshLayout;
import java.util.ArrayList;
import java.util.List;

public class BannerSwipeRefreshLayout extends I18nSwipeRefreshLayout {

    /* renamed from: m */
    ViewPager f17487m;

    /* renamed from: n */
    View f17488n;

    /* renamed from: o */
    public RecyclerView f17489o;

    /* renamed from: p */
    private List<RecyclerView> f17490p = new ArrayList();

    /* renamed from: q */
    private int f17491q;

    /* renamed from: r */
    private boolean f17492r;

    /* renamed from: s */
    private float f17493s;

    /* renamed from: t */
    private float f17494t;

    /* renamed from: u */
    private float f17495u;

    /* renamed from: v */
    private float f17496v;

    /* renamed from: w */
    private int f17497w;

    /* renamed from: com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout$a */
    public interface C5912a {
        /* renamed from: a */
        void mo14446a(ViewPager viewPager, View view);

        /* renamed from: a */
        void mo14447a(RecyclerView recyclerView);
    }

    public BannerSwipeRefreshLayout(Context context) {
        super(context);
        m18437a(context);
    }

    /* renamed from: a */
    private void m18437a(Context context) {
        this.f17491q = C0995v.m4257a(ViewConfiguration.get(context));
        this.f17492r = false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        try {
            if (!((this.f17487m == null || this.f17488n == null) && this.f17489o == null)) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    this.f17493s = motionEvent.getX();
                    this.f17495u = this.f17493s;
                    this.f17494t = motionEvent.getY();
                    this.f17496v = this.f17494t;
                    this.f17492r = false;
                    this.f17497w = C0978j.m4132b(motionEvent, 0);
                } else if (action == 2) {
                    if (this.f17492r) {
                        return false;
                    }
                    int a = C0978j.m4130a(motionEvent, this.f17497w);
                    float c = C0978j.m4133c(motionEvent, a);
                    float abs = Math.abs(c - this.f17495u);
                    float d = C0978j.m4134d(motionEvent, a);
                    float abs2 = Math.abs(d - this.f17496v);
                    if (this.f17487m == null || this.f17488n == null) {
                        if (this.f17489o != null) {
                            if ((c - this.f17495u <= 0.0f || this.f17489o.getScrollX() != 0) && abs > ((float) this.f17491q) && abs * 0.5f > abs2 && ((float) this.f17489o.getBottom()) > d) {
                                this.f17492r = true;
                                return false;
                            } else if (abs2 < ((float) (this.f17491q + 100))) {
                                return false;
                            } else {
                                if (c - this.f17493s > 0.0f) {
                                    f = this.f17493s + ((float) this.f17491q);
                                } else {
                                    f = this.f17493s - ((float) this.f17491q);
                                }
                                this.f17495u = f;
                                this.f17496v = d;
                            }
                        }
                    } else if ((c - this.f17495u <= 0.0f || this.f17487m.getCurrentItem() != 0) && abs > ((float) this.f17491q) && abs * 0.5f > abs2 && ((float) this.f17488n.getBottom()) > d) {
                        this.f17492r = true;
                        return false;
                    } else if (abs2 < ((float) (this.f17491q + 100))) {
                        return false;
                    } else {
                        if (c - this.f17493s > 0.0f) {
                            f2 = this.f17493s + ((float) this.f17491q);
                        } else {
                            f2 = this.f17493s - ((float) this.f17491q);
                        }
                        this.f17495u = f2;
                        this.f17496v = d;
                    }
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo14445a(ViewPager viewPager, View view) {
        this.f17487m = viewPager;
        this.f17488n = view;
    }

    public BannerSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m18437a(context);
    }
}
