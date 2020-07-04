package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerListLoadingViewHolder;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.impl.StickerEmptyViewHolder;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.AbstractInfoStickerAdapter */
public abstract class AbstractInfoStickerAdapter<T> extends BaseAdapter<T> {

    /* renamed from: a */
    public boolean f105634a;

    /* renamed from: b */
    public boolean f105635b;

    /* renamed from: c */
    private StickerListLoadingViewHolder f105636c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.AbstractInfoStickerAdapter$a */
    static class C40642a extends C1293v {
        C40642a(View view) {
            super(view);
        }
    }

    /* renamed from: b */
    public abstract int mo100755b(int i);

    /* renamed from: b */
    public abstract C1293v mo100756b(ViewGroup viewGroup, int i);

    /* renamed from: b */
    public abstract void mo100757b(C1293v vVar, int i);

    /* renamed from: c */
    public int mo60557c() {
        if (this.f105634a) {
            return 1;
        }
        return super.mo60557c() + 2;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        if (this.f105634a && i == 0) {
            return -3;
        }
        if (i == 0) {
            return -2;
        }
        if (i == mo60557c() - 1) {
            return -5;
        }
        return mo100755b(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4721g = new C1241a() {
                /* renamed from: a */
                public final int mo5386a(int i) {
                    if (AbstractInfoStickerAdapter.this.mo58029a(i) == -2 || AbstractInfoStickerAdapter.this.mo58029a(i) == -5 || AbstractInfoStickerAdapter.this.mo58029a(i) == -4 || AbstractInfoStickerAdapter.this.getItemViewType(i) == Integer.MIN_VALUE) {
                        return gridLayoutManager.f4716b;
                    }
                    return 1;
                }
            };
        }
    }

    /* renamed from: c */
    public final T mo100758c(int i) {
        if (i >= mo60557c()) {
            return null;
        }
        int min = Math.min(i - 1, this.f67539l.size() - 1);
        if (this.f67539l.size() == 0) {
            return null;
        }
        List list = this.f67539l;
        if (min < 0) {
            min = 0;
        }
        return list.get(min);
    }

    /* renamed from: c */
    private static View m129926c(ViewGroup viewGroup, int i) {
        LayoutParams layoutParams = new LayoutParams(-1, (int) C9738o.m28708b(viewGroup.getContext(), (float) i));
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(0);
        return view;
    }

    /* renamed from: a */
    public void mo58033a(C1293v vVar, int i) {
        switch (mo58029a(i)) {
            case -5:
                return;
            case -4:
                return;
            case ImageFrame.NV21 /*-3*/:
                ((StickerListLoadingViewHolder) vVar).mo100265a();
                return;
            case -2:
                return;
            default:
                mo100757b(vVar, i);
                return;
        }
    }

    /* renamed from: a */
    public C1293v mo58032a(ViewGroup viewGroup, int i) {
        switch (i) {
            case -5:
                return new C40642a(m129926c(viewGroup, 8));
            case -4:
                return new StickerEmptyViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3f, viewGroup, false));
            case ImageFrame.NV21 /*-3*/:
                this.f105636c = new StickerListLoadingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3g, viewGroup, false));
                return this.f105636c;
            case -2:
                return new C40642a(m129926c(viewGroup, 5));
            default:
                return mo100756b(viewGroup, i);
        }
    }
}
