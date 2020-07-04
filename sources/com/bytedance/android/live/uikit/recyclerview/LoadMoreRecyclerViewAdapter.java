package com.bytedance.android.live.uikit.recyclerview;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView.C3555a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public abstract class LoadMoreRecyclerViewAdapter extends RecyclerViewWithFooterAdapter {

    /* renamed from: a */
    public C3553a f10589a;

    /* renamed from: c */
    private C3554b f10590c;

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.LoadMoreRecyclerViewAdapter$a */
    public interface C3553a {
        /* renamed from: a */
        void mo10824a(boolean z);
    }

    /* renamed from: com.bytedance.android.live.uikit.recyclerview.LoadMoreRecyclerViewAdapter$b */
    class C3554b extends C1293v {
        /* renamed from: b */
        public final void mo10826b() {
            ((LoadingStatusView) this.itemView).mo10830c();
        }

        /* renamed from: c */
        public final void mo10827c() {
            ((LoadingStatusView) this.itemView).mo10828a();
        }

        /* renamed from: a */
        public final void mo10825a() {
            if (((LoadingStatusView) this.itemView).mo10829b() && LoadMoreRecyclerViewAdapter.this.f10589a != null) {
                LoadMoreRecyclerViewAdapter.this.f10589a.mo10824a(false);
            }
        }

        public C3554b(View view) {
            super(view);
        }
    }

    /* renamed from: b */
    public final void mo10822b() {
        if (this.f10590c != null) {
            this.f10590c.mo10827c();
        }
    }

    public final int getItemCount() {
        if (mo10843c() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    /* renamed from: a */
    public final void mo10820a() {
        if (this.f10590c != null) {
            this.f10590c.mo10826b();
        }
    }

    /* renamed from: a */
    private static int m13060a(View view) {
        return view.getResources().getDimensionPixelSize(R.dimen.en);
    }

    /* renamed from: a */
    public final void mo10821a(C1293v vVar) {
        if (vVar instanceof C3554b) {
            ((C3554b) vVar).mo10825a();
            LayoutParams layoutParams = (LayoutParams) this.f10590c.itemView.getLayoutParams();
            if (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f5145b = true;
            }
            this.f10590c.itemView.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final C1293v mo10819a(ViewGroup viewGroup) {
        LoadingStatusView loadingStatusView = new LoadingStatusView(viewGroup.getContext());
        int a = m13060a((View) viewGroup);
        int dimensionPixelSize = viewGroup.getResources().getDimensionPixelSize(R.dimen.eo);
        loadingStatusView.setLayoutParams(m13061a(-1, a));
        C3555a aVar = new C3555a(viewGroup.getContext());
        aVar.mo10834a(dimensionPixelSize).mo10835a(R.string.c46, new OnClickListener() {
            public final void onClick(View view) {
                if (LoadMoreRecyclerViewAdapter.this.f10589a != null) {
                    LoadMoreRecyclerViewAdapter.this.f10589a.mo10824a(true);
                }
            }
        });
        aVar.mo10836a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.acn, viewGroup, false));
        loadingStatusView.setBuilder(aVar);
        this.f10590c = new C3554b(loadingStatusView);
        return this.f10590c;
    }

    /* renamed from: a */
    private static LayoutParams m13061a(int i, int i2) {
        return new LayoutParams(-1, i2);
    }
}
