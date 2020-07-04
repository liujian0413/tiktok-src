package com.p280ss.android.ugc.aweme.shortvideo.sticker.impl;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerAdapter */
public abstract class StickerAdapter<T> extends BaseAdapter<T> {

    /* renamed from: a */
    private final int f105583a = -3;

    /* renamed from: b */
    private final int f105584b = -2;

    /* renamed from: c */
    public boolean f105585c;

    /* renamed from: d */
    private final int f105586d = -4;

    /* renamed from: e */
    private final int f105587e = Integer.MAX_VALUE;

    /* renamed from: f */
    private boolean f105588f;

    /* renamed from: g */
    private StickerListLoadingViewHolder f105589g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.impl.StickerAdapter$a */
    class C40617a extends C1293v {
        C40617a(View view) {
            super(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract int mo100644b(int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C1293v mo100645b(ViewGroup viewGroup, int i);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo100646b(C1293v vVar, int i);

    /* renamed from: c */
    public final int mo60557c() {
        if (this.f105588f || this.f105585c) {
            return 1;
        }
        return super.mo60557c() + 2;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4721g = new C1241a() {
                /* renamed from: a */
                public final int mo5386a(int i) {
                    if (StickerAdapter.this.getItemViewType(i) == -2 || StickerAdapter.this.getItemViewType(i) == Integer.MAX_VALUE || StickerAdapter.this.getItemViewType(i) == -4) {
                        return gridLayoutManager.f4716b;
                    }
                    return 1;
                }
            };
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (this.f105588f && i == 0) {
            return -3;
        }
        if (this.f105585c && i == 0) {
            return -4;
        }
        if (i == 0) {
            return -2;
        }
        if (i == mo60557c() - 1) {
            return Integer.MAX_VALUE;
        }
        return mo100644b(i);
    }

    /* renamed from: c */
    public final T mo100733c(int i) {
        if (i >= mo60557c() || C6311g.m19573a(this.f67539l)) {
            return null;
        }
        int min = Math.min(i - 1, this.f67539l.size() - 1);
        List list = this.f67539l;
        if (min < 0) {
            min = 0;
        }
        return list.get(min);
    }

    /* renamed from: c */
    private static View m129895c(ViewGroup viewGroup, int i) {
        LayoutParams layoutParams = new LayoutParams(-1, (int) C9738o.m28708b(viewGroup.getContext(), (float) i));
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(0);
        return view;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == Integer.MAX_VALUE) {
            return new C40617a(m129895c(viewGroup, 10));
        }
        switch (i) {
            case -4:
                return new StickerEmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3f, viewGroup, false));
            case ImageFrame.NV21 /*-3*/:
                this.f105589g = new StickerListLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3g, viewGroup, false));
                return this.f105589g;
            case -2:
                return new C40617a(m129895c(viewGroup, 5));
            default:
                return mo100645b(viewGroup, i);
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        int a = mo58029a(i);
        if (a != Integer.MAX_VALUE) {
            switch (a) {
                case -4:
                    return;
                case ImageFrame.NV21 /*-3*/:
                    ((StickerListLoadingViewHolder) vVar).mo100737a();
                    return;
                case -2:
                    return;
                default:
                    mo100646b(vVar, i);
                    return;
            }
        }
    }
}
