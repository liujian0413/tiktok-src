package com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1626ui;

import android.content.Context;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.draft.model.VideoCategoryParam;
import com.p280ss.android.ugc.aweme.shortvideo.videocategory.p1622a.C41591b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryAdapter */
public final class VideoCategoryAdapter extends BaseAdapter<C41591b> {

    /* renamed from: a */
    private final SpaceItemDecoration f108194a;

    /* renamed from: b */
    private final C7563m<Integer, VideoCategoryParam, C7581n> f108195b;

    /* renamed from: e */
    private final boolean m132531e(int i) {
        if (((C41591b) this.f67539l.get(i)).f108088a == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        return ((C41591b) this.f67539l.get(i)).f108088a;
    }

    /* renamed from: c */
    private final boolean m132530c(int i) {
        if (((C41591b) this.f67539l.get(i)).f108088a == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo58045a(List<C41591b> list) {
        this.f108194a.mo102249a(list);
        super.mo58045a(list);
    }

    /* renamed from: b */
    public final boolean mo102253b(int i) {
        if (m132530c(i) || m132531e(i)) {
            return true;
        }
        return false;
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C7573i.m23587b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.f4721g = new VideoCategoryAdapter$onAttachedToRecyclerView$1(this, gridLayoutManager);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.GridLayoutManager");
    }

    public VideoCategoryAdapter(SpaceItemDecoration spaceItemDecoration, C7563m<? super Integer, ? super VideoCategoryParam, C7581n> mVar) {
        C7573i.m23587b(spaceItemDecoration, "itemDecoration");
        C7573i.m23587b(mVar, "onSelected");
        this.f108194a = spaceItemDecoration;
        this.f108195b = mVar;
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        Context context = null;
        switch (i) {
            case 0:
            case 2:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate = LayoutInflater.from(context).inflate(R.layout.a3w, viewGroup, false);
                C7573i.m23582a((Object) inflate, "LayoutInflater.from(pare…_category, parent, false)");
                return new VideoCategoryViewHolder(inflate);
            case 1:
            case 3:
                if (viewGroup != null) {
                    context = viewGroup.getContext();
                }
                View inflate2 = LayoutInflater.from(context).inflate(R.layout.a3x, viewGroup, false);
                C7573i.m23582a((Object) inflate2, "LayoutInflater.from(pare…ory_title, parent, false)");
                return new VideoCategoryTitleViewHolder(inflate2);
            default:
                StringBuilder sb = new StringBuilder("Unsupported viewType, viewType = ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        switch (getItemViewType(i)) {
            case 0:
            case 2:
                if (vVar != null) {
                    VideoCategoryViewHolder videoCategoryViewHolder = (VideoCategoryViewHolder) vVar;
                    Object obj = this.f67539l.get(i);
                    C7573i.m23582a(obj, "mItems[position]");
                    videoCategoryViewHolder.mo102255a((C41591b) obj, this.f108195b);
                    break;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryViewHolder");
                }
            case 1:
            case 3:
                if (vVar != null) {
                    VideoCategoryTitleViewHolder videoCategoryTitleViewHolder = (VideoCategoryTitleViewHolder) vVar;
                    Object obj2 = this.f67539l.get(i);
                    C7573i.m23582a(obj2, "mItems[position]");
                    videoCategoryTitleViewHolder.mo102254a((C41591b) obj2);
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.videocategory.ui.VideoCategoryTitleViewHolder");
        }
    }
}
