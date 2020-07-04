package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0720f;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import java.util.Locale;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.SpecificHorizontalSpaceItemDecoration */
public final class SpecificHorizontalSpaceItemDecoration extends C1272h {

    /* renamed from: a */
    private final int f83649a;

    /* renamed from: b */
    private final int f83650b;

    /* renamed from: c */
    private final int f83651c;

    public SpecificHorizontalSpaceItemDecoration(int i, int i2, int i3) {
        this.f83649a = i;
        this.f83650b = i2;
        this.f83651c = i3;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int f = RecyclerView.m5892f(view);
        C1262a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (VERSION.SDK_INT < 17 || C0720f.m3043a(Locale.getDefault()) != 1) {
                if (f == 0) {
                    rect.left = this.f83649a;
                } else {
                    rect.left = this.f83650b;
                }
                if (f == itemCount - 1) {
                    rect.right = this.f83651c;
                }
            } else {
                if (f == 0) {
                    rect.right = this.f83649a;
                } else {
                    rect.right = this.f83650b;
                }
                if (f == itemCount - 1) {
                    rect.left = this.f83651c;
                }
            }
        }
    }
}
