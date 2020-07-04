package com.p280ss.android.ugc.aweme.imported;

import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.StaggeredGridLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.imported.d */
public final class C32068d {
    /* renamed from: a */
    private static int m104095a(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: b */
    private static int m104097b(int[] iArr) {
        int i = iArr[0];
        for (int i2 : iArr) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C0902i<Integer, Integer> m104096a(RecyclerView recyclerView) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new C0902i<>(Integer.valueOf(linearLayoutManager.mo5445j()), Integer.valueOf(linearLayoutManager.mo5447l()));
        } else if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            return new C0902i<>(Integer.valueOf(gridLayoutManager.mo5445j()), Integer.valueOf(gridLayoutManager.mo5447l()));
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int[] iArr = new int[staggeredGridLayoutManager.f5123a];
            staggeredGridLayoutManager.mo6011c(iArr);
            int a = m104095a(iArr);
            staggeredGridLayoutManager.mo6009a(iArr);
            return new C0902i<>(Integer.valueOf(m104097b(iArr)), Integer.valueOf(a));
        } else {
            throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
        }
    }
}
