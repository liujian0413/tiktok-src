package com.p280ss.android.ugc.aweme.common.widget.scrollablelayout;

import android.os.Build.VERSION;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ScrollView;

/* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.b */
public final class C25765b {

    /* renamed from: a */
    public View f68074a;

    /* renamed from: b */
    public C25766a f68075b;

    /* renamed from: c */
    private int f68076c = VERSION.SDK_INT;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.b$a */
    public interface C25766a {
        /* renamed from: j */
        View mo61750j();
    }

    /* renamed from: com.ss.android.ugc.aweme.common.widget.scrollablelayout.b$b */
    public interface C25767b {
        /* renamed from: n */
        boolean mo61102n();
    }

    /* renamed from: b */
    private View m84668b() {
        if (this.f68075b == null) {
            return this.f68074a;
        }
        return this.f68075b.mo61750j();
    }

    /* renamed from: a */
    public final boolean mo66886a() {
        View b = m84668b();
        if (b == null) {
            return false;
        }
        if (b instanceof AdapterView) {
            return m84666a((AdapterView) b);
        }
        if (b instanceof ScrollView) {
            return m84667a((ScrollView) b);
        }
        if (b instanceof C25767b) {
            return ((C25767b) b).mo61102n();
        }
        if (b instanceof RecyclerView) {
            return m84664a((RecyclerView) b);
        }
        if (b instanceof WebView) {
            return m84665a((WebView) b);
        }
        throw new IllegalStateException("scrollableView must be a instance of AdapterView|ScrollView|RecyclerView");
    }

    /* renamed from: a */
    private static boolean m84665a(WebView webView) {
        if (webView == null || webView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m84666a(AdapterView adapterView) {
        if (adapterView != null) {
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            View childAt = adapterView.getChildAt(0);
            if (childAt == null || (firstVisiblePosition == 0 && childAt != null && childAt.getTop() == 0)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m84664a(RecyclerView recyclerView) {
        if (recyclerView != null) {
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                int j = ((LinearLayoutManager) layoutManager).mo5445j();
                View childAt = recyclerView.getChildAt(0);
                if (childAt == null) {
                    return true;
                }
                if (j != 0 || childAt.getTop() < ((MarginLayoutParams) childAt.getLayoutParams()).topMargin) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m84667a(ScrollView scrollView) {
        if (scrollView == null || scrollView.getScrollY() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo66885a(int i, int i2, int i3) {
        View b = m84668b();
        if (b instanceof AbsListView) {
            AbsListView absListView = (AbsListView) b;
            if (this.f68076c >= 21) {
                absListView.fling(i);
            } else {
                absListView.smoothScrollBy(i2, i3);
            }
        } else if (b instanceof ScrollView) {
            ((ScrollView) b).fling(i);
        } else if (b instanceof RecyclerView) {
            ((RecyclerView) b).mo5548b(0, i);
        } else if (b instanceof WebView) {
            ((WebView) b).flingScroll(0, i);
        }
    }
}
