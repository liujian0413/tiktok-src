package com.p280ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import kotlin.jvm.internal.C7573i;
import kotlin.p1878b.C47891a;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.MediaMixListViewHolder$manyMixesInit$2 */
public final class MediaMixListViewHolder$manyMixesInit$2 extends C1272h {

    /* renamed from: a */
    public final float f93632a;

    /* renamed from: b */
    public final float f93633b;

    /* renamed from: c */
    final /* synthetic */ MediaMixListViewHolder f93634c;

    MediaMixListViewHolder$manyMixesInit$2(MediaMixListViewHolder mediaMixListViewHolder) {
        this.f93634c = mediaMixListViewHolder;
        this.f93632a = C9738o.m28708b(mediaMixListViewHolder.f93608k.getContext(), 16.0f);
        this.f93633b = C9738o.m28708b(mediaMixListViewHolder.f93608k.getContext(), 2.0f);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        int f = RecyclerView.m5892f(view);
        if (f == 0) {
            rect.left = C47891a.m148821a(this.f93632a);
            rect.right = C47891a.m148821a(this.f93633b);
        } else if (f == MediaMixListViewHolder.m115373a(this.f93634c).getItemCount() - 1) {
            rect.left = C47891a.m148821a(this.f93633b);
            rect.right = C47891a.m148821a(this.f93632a);
        } else {
            rect.left = C47891a.m148821a(this.f93633b);
            rect.right = C47891a.m148821a(this.f93633b);
        }
    }
}
