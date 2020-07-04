package com.p280ss.android.ugc.aweme.poi.adapter;

import android.support.p022v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.poi.preview.transfer.C35159c;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.InfiniteLoopPagerAdapter;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.InfiniteLoopPoiBannerAdapter */
public class InfiniteLoopPoiBannerAdapter extends InfiniteLoopPagerAdapter implements C35159c {

    /* renamed from: d */
    private View f91408d;

    /* renamed from: e */
    private int f91409e;

    /* renamed from: b */
    public final int mo88764b() {
        return this.f91409e;
    }

    /* renamed from: a */
    public final View mo88763a() {
        return this.f91408d;
    }

    /* renamed from: a */
    private void m113009a(View view) {
        this.f91408d = view;
    }

    public void setPrimaryItem(View view, int i, Object obj) {
        super.setPrimaryItem(view, i, obj);
        m113009a(view);
    }

    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        super.setPrimaryItem(viewGroup, i, obj);
        m113009a(viewGroup);
    }

    public InfiniteLoopPoiBannerAdapter(PagerAdapter pagerAdapter, int i, boolean z) {
        super(pagerAdapter);
        this.f91409e = i;
        if (this.f91409e > 0) {
            this.f107074c = true;
            return;
        }
        throw new IllegalArgumentException("loopSize should be a positive value");
    }
}
