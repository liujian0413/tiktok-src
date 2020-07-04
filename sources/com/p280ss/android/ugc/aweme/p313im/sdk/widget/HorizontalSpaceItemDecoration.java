package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0720f;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.HorizontalSpaceItemDecoration */
public class HorizontalSpaceItemDecoration extends C1272h {

    /* renamed from: a */
    private int f83548a;

    public HorizontalSpaceItemDecoration(int i) {
        this.f83548a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (VERSION.SDK_INT < 17 || C0720f.m3043a(Locale.getDefault()) != 1) {
            if (RecyclerView.m5892f(view) == 0 || recyclerView.getAdapter().getItemCount() <= 1) {
                rect.left = 0;
            } else {
                rect.left = this.f83548a;
            }
        } else if (RecyclerView.m5892f(view) == 0 || recyclerView.getAdapter().getItemCount() <= 1) {
            rect.right = 0;
        } else {
            rect.right = this.f83548a;
        }
    }
}
