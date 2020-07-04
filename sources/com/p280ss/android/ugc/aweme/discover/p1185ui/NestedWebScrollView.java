package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.content.Context;
import android.support.p022v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.NestedWebScrollView */
public final class NestedWebScrollView extends NestedScrollView {

    /* renamed from: c */
    public boolean f71060c;

    /* renamed from: d */
    public boolean f71061d;

    /* renamed from: e */
    private float f71062e;

    /* renamed from: f */
    private WebView f71063f;

    /* renamed from: g */
    private final int f71064g;

    /* renamed from: b */
    private final boolean m88457b() {
        if (!this.f71060c) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private final void m88456a() {
        if (this.f71063f == null) {
            int i = 0;
            int childCount = getChildCount();
            if (childCount >= 0) {
                while (true) {
                    View childAt = getChildAt(i);
                    if (!(childAt instanceof WebView)) {
                        if (childAt instanceof ViewGroup) {
                            WebView a = m88455a((ViewGroup) childAt);
                            if (a instanceof WebView) {
                                this.f71063f = a;
                                return;
                            }
                        }
                        if (i == childCount) {
                            break;
                        }
                        i++;
                    } else {
                        this.f71063f = (WebView) childAt;
                        return;
                    }
                }
            }
        }
    }

    private final int getReactRootViewOrWebViewMeasureHeight() {
        Queue linkedList = new LinkedList();
        linkedList.offer(this);
        while (true) {
            int i = 0;
            if (linkedList.isEmpty()) {
                return 0;
            }
            Object poll = linkedList.poll();
            C7573i.m23582a(poll, "q.poll()");
            ViewGroup viewGroup = (ViewGroup) poll;
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i < childCount) {
                    View childAt = viewGroup.getChildAt(i);
                    C7573i.m23582a((Object) childAt, "child");
                    if (childAt.getVisibility() == 0) {
                        if (childAt instanceof WebView) {
                            WebView webView = (WebView) childAt;
                            if (webView.getId() == R.id.fn) {
                                return webView.getMeasuredHeight();
                            }
                        }
                        if (childAt instanceof ViewGroup) {
                            ViewGroup viewGroup2 = (ViewGroup) childAt;
                            if (viewGroup2.getId() == R.id.cob) {
                                return viewGroup2.getMeasuredHeight();
                            }
                            linkedList.offer(childAt);
                        }
                    }
                    i++;
                }
            }
        }
    }

    public final void setTop(boolean z) {
        this.f71060c = z;
    }

    public final void setWebViewDisplaying(boolean z) {
        this.f71061d = z;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f71061d) {
            m88456a();
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (Exception unused) {
            return false;
        }
    }

    public NestedWebScrollView(Context context) {
        C7573i.m23587b(context, "context");
        super(context, null, 0);
        this.f71060c = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f71064g = viewConfiguration.getScaledTouchSlop();
    }

    /* renamed from: a */
    private final WebView m88455a(ViewGroup viewGroup) {
        if (this.f71063f != null) {
            return this.f71063f;
        }
        int i = 0;
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            while (true) {
                View childAt = viewGroup.getChildAt(i);
                if (!(childAt instanceof WebView)) {
                    if (childAt instanceof ViewGroup) {
                        WebView a = m88455a((ViewGroup) childAt);
                        if (a instanceof WebView) {
                            return a;
                        }
                    }
                    if (i == childCount) {
                        break;
                    }
                    i++;
                } else {
                    return (WebView) childAt;
                }
            }
        }
        return null;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        try {
            z = super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            z = false;
        }
        if (!this.f71061d) {
            return z;
        }
        if (motionEvent == null) {
            C7573i.m23580a();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.f71062e = motionEvent.getRawY();
                break;
            case 1:
            case 3:
                this.f71062e = 0.0f;
                break;
            case 2:
                if (Math.abs(this.f71062e - motionEvent.getRawY()) < ((float) this.f71064g)) {
                    return z;
                }
                if (this.f71062e - motionEvent.getRawY() > 0.0f) {
                    this.f71060c = false;
                    break;
                } else if (!m88457b()) {
                    return true;
                }
                break;
        }
        return false;
    }

    public NestedWebScrollView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, 0);
        this.f71060c = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f71064g = viewConfiguration.getScaledTouchSlop();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            int measuredHeight = getMeasuredHeight();
            int reactRootViewOrWebViewMeasureHeight = getReactRootViewOrWebViewMeasureHeight();
            C7573i.m23582a((Object) childAt, "child");
            if (childAt.getMeasuredHeight() < measuredHeight && (reactRootViewOrWebViewMeasureHeight == 0 || childAt.getMeasuredHeight() < reactRootViewOrWebViewMeasureHeight)) {
                LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams != null) {
                    childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), ((FrameLayout.LayoutParams) layoutParams).width), MeasureSpec.makeMeasureSpec((measuredHeight - getPaddingTop()) - getPaddingBottom(), 1073741824));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                }
            }
        }
    }

    public NestedWebScrollView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f71060c = true;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        C7573i.m23582a((Object) viewConfiguration, "ViewConfiguration.get(context)");
        this.f71064g = viewConfiguration.getScaledTouchSlop();
    }

    public /* synthetic */ NestedWebScrollView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }

    public /* synthetic */ NestedWebScrollView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
