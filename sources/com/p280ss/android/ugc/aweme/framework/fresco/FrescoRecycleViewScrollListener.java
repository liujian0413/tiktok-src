package com.p280ss.android.ugc.aweme.framework.fresco;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.view.ViewConfiguration;
import com.facebook.drawee.backends.pipeline.C13380c;

/* renamed from: com.ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener */
public class FrescoRecycleViewScrollListener extends C1281m {

    /* renamed from: a */
    private int f78766a;

    public FrescoRecycleViewScrollListener(Context context) {
        this.f78766a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0) {
            C13380c.m39172c().mo33186d();
        }
    }

    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int abs = Math.abs(i2);
        if (recyclerView.getScrollState() == 1 && abs < this.f78766a) {
            C13380c.m39172c().mo33186d();
        } else if (recyclerView.getScrollState() != 1 || abs < this.f78766a) {
            if (recyclerView.getScrollState() == 2) {
                C13380c.m39172c().mo33183c();
            }
        } else {
            C13380c.m39172c().mo33183c();
        }
    }
}
