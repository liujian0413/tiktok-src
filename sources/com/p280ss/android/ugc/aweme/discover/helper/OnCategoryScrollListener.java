package com.p280ss.android.ugc.aweme.discover.helper;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.C26375a;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryNewViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryViewHolder;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.OnCategoryScrollListener */
public class OnCategoryScrollListener extends C1281m {

    /* renamed from: a */
    public C26647a f70263a;

    /* renamed from: b */
    private int f70264b;

    /* renamed from: c */
    private int f70265c = ViewConfiguration.get(AwemeApplication.m21341a()).getScaledTouchSlop();

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.OnCategoryScrollListener$a */
    public interface C26647a {
        /* renamed from: b */
        void mo68340b();
    }

    /* renamed from: a */
    public final boolean mo68339a() {
        if (this.f70264b == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m87556a(RecyclerView recyclerView, boolean z) {
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v b = recyclerView.mo5539b(recyclerView.getChildAt(i));
                if (b != null && b.mItemViewType == C26375a.m86755a()) {
                    if (z) {
                        ((CategoryViewHolder) b).mo67933b();
                    } else {
                        ((CategoryViewHolder) b).mo67935c();
                    }
                }
                if (b != null && b.mItemViewType == C26375a.m86756b()) {
                    ((CategoryNewViewHolder) b).mo67929a(z);
                }
            }
        }
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (i == 0) {
            m87556a(recyclerView, true);
            int j = linearLayoutManager.mo5445j();
            if (!(this.f70264b == 0 || j != 0 || this.f70263a == null)) {
                this.f70263a.mo68340b();
            }
            this.f70264b = j;
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        if (Math.abs(i2) <= this.f70265c) {
            m87556a(recyclerView, true);
        }
    }
}
