package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.support.p029v7.widget.RecyclerView.C1281m;
import kotlin.jvm.internal.Ref.BooleanRef;

/* renamed from: com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment$initView$3 */
public final class SimilarMusicFragment$initView$3 extends C1281m {

    /* renamed from: a */
    final /* synthetic */ SimilarMusicFragment f88500a;

    /* renamed from: b */
    final /* synthetic */ BooleanRef f88501b;

    SimilarMusicFragment$initView$3(SimilarMusicFragment similarMusicFragment, BooleanRef booleanRef) {
        this.f88500a = similarMusicFragment;
        this.f88501b = booleanRef;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(android.support.p029v7.widget.RecyclerView r10, int r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = "recyclerView"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            super.onScrolled(r10, r11, r12)
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r10 = r9.f88500a
            r11 = 2131301257(0x7f091389, float:1.8220567E38)
            android.view.View r10 = r10.mo86459a(r11)
            android.support.v7.widget.RecyclerView r10 = (android.support.p029v7.widget.RecyclerView) r10
            r0 = 0
            if (r10 == 0) goto L_0x0021
            android.view.View r10 = r10.getChildAt(r0)
            if (r10 == 0) goto L_0x0021
            int r10 = r10.getHeight()
            goto L_0x0022
        L_0x0021:
            r10 = 0
        L_0x0022:
            kotlin.jvm.internal.Ref$BooleanRef r1 = r9.f88501b
            boolean r1 = r1.element
            r2 = 1
            if (r1 == 0) goto L_0x009a
            int r1 = java.lang.Math.abs(r12)
            if (r1 <= 0) goto L_0x009a
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r1 = r9.f88500a
            int r1 = r1.mo86569c(r10)
            double r3 = (double) r1
            double r5 = (double) r10
            r7 = 4606732058837280358(0x3fee666666666666, double:0.95)
            java.lang.Double.isNaN(r5)
            double r5 = r5 * r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x009a
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r10 = r9.f88500a
            android.view.View r10 = r10.mo86459a(r11)
            android.support.v7.widget.RecyclerView r10 = (android.support.p029v7.widget.RecyclerView) r10
            java.lang.String r12 = "rv_list"
            kotlin.jvm.internal.C7573i.m23582a(r10, r12)
            android.support.v7.widget.RecyclerView$i r10 = r10.getLayoutManager()
            if (r10 == 0) goto L_0x0092
            android.support.v7.widget.LinearLayoutManager r10 = (android.support.p029v7.widget.LinearLayoutManager) r10
            int r10 = r10.mo5447l()
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r12 = r9.f88500a
            android.view.View r12 = r12.mo86459a(r11)
            android.support.v7.widget.RecyclerView r12 = (android.support.p029v7.widget.RecyclerView) r12
            android.support.v7.widget.RecyclerView$v r12 = r12.mo5572e(r10)
            boolean r1 = r12 instanceof com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder
            if (r1 == 0) goto L_0x0073
            com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r12 = (com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder) r12
            r12.mo62390p()
        L_0x0073:
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r12 = r9.f88500a
            android.view.View r11 = r12.mo86459a(r11)
            android.support.v7.widget.RecyclerView r11 = (android.support.p029v7.widget.RecyclerView) r11
            int r10 = r10 - r2
            android.support.v7.widget.RecyclerView$v r10 = r11.mo5572e(r10)
            boolean r11 = r10 instanceof com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder
            if (r11 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r10 = (com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder) r10
            r10.bs_()
        L_0x0089:
            kotlin.jvm.internal.Ref$BooleanRef r10 = r9.f88501b
            r10.element = r0
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r10 = r9.f88500a
            r10.f88462l = r2
            return
        L_0x0092:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r11 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager"
            r10.<init>(r11)
            throw r10
        L_0x009a:
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r1 = r9.f88500a
            android.view.View r1 = r1.mo86459a(r11)
            android.support.v7.widget.RecyclerView r1 = (android.support.p029v7.widget.RecyclerView) r1
            boolean r1 = r1.canScrollVertically(r2)
            if (r1 != 0) goto L_0x0109
            kotlin.jvm.internal.Ref$BooleanRef r1 = r9.f88501b
            boolean r1 = r1.element
            if (r1 != 0) goto L_0x0109
            int r12 = java.lang.Math.abs(r12)
            if (r12 <= 0) goto L_0x0109
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r10 = r9.f88500a
            android.view.View r10 = r10.mo86459a(r11)
            android.support.v7.widget.RecyclerView r10 = (android.support.p029v7.widget.RecyclerView) r10
            java.lang.String r12 = "rv_list"
            kotlin.jvm.internal.C7573i.m23582a(r10, r12)
            android.support.v7.widget.RecyclerView$i r10 = r10.getLayoutManager()
            if (r10 == 0) goto L_0x0101
            android.support.v7.widget.LinearLayoutManager r10 = (android.support.p029v7.widget.LinearLayoutManager) r10
            int r10 = r10.mo5447l()
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r12 = r9.f88500a
            android.view.View r12 = r12.mo86459a(r11)
            android.support.v7.widget.RecyclerView r12 = (android.support.p029v7.widget.RecyclerView) r12
            android.support.v7.widget.RecyclerView$v r12 = r12.mo5572e(r10)
            boolean r1 = r12 instanceof com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder
            if (r1 == 0) goto L_0x00e2
            com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r12 = (com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder) r12
            r12.bs_()
        L_0x00e2:
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r12 = r9.f88500a
            android.view.View r11 = r12.mo86459a(r11)
            android.support.v7.widget.RecyclerView r11 = (android.support.p029v7.widget.RecyclerView) r11
            int r10 = r10 - r2
            android.support.v7.widget.RecyclerView$v r10 = r11.mo5572e(r10)
            boolean r11 = r10 instanceof com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder
            if (r11 == 0) goto L_0x00f8
            com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicListViewHolder r10 = (com.p280ss.android.ugc.aweme.music.p1410ui.viewholder.SimilarMusicListViewHolder) r10
            r10.mo62390p()
        L_0x00f8:
            kotlin.jvm.internal.Ref$BooleanRef r10 = r9.f88501b
            r10.element = r2
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r10 = r9.f88500a
            r10.f88462l = r0
            return
        L_0x0101:
            kotlin.TypeCastException r10 = new kotlin.TypeCastException
            java.lang.String r11 = "null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager"
            r10.<init>(r11)
            throw r10
        L_0x0109:
            kotlin.jvm.internal.Ref$BooleanRef r11 = r9.f88501b
            boolean r11 = r11.element
            if (r11 != 0) goto L_0x0114
            com.ss.android.ugc.aweme.music.ui.SimilarMusicFragment r11 = r9.f88500a
            r11.mo86567b(r10)
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.music.p1410ui.SimilarMusicFragment$initView$3.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
    }
}
