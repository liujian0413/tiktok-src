package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerFragment */
public class SearchInfoStickerFragment extends Fragment {

    /* renamed from: a */
    public boolean f105754a;

    /* renamed from: b */
    public C40670a f105755b;

    /* renamed from: c */
    public boolean f105756c;

    /* renamed from: d */
    public C6905a f105757d;

    /* renamed from: e */
    private AbstractInfoStickerAdapter<C40816v> f105758e;

    /* renamed from: f */
    private List<C40816v> f105759f;

    /* renamed from: g */
    private RecyclerView f105760g;

    /* renamed from: h */
    private GridLayoutManager f105761h;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.SearchInfoStickerFragment$a */
    interface C40670a {
        /* renamed from: a */
        void mo100828a(int i);
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: a */
    public static SearchInfoStickerFragment m130072a() {
        return new SearchInfoStickerFragment();
    }

    /* renamed from: a */
    private AbstractInfoStickerAdapter<C40816v> m130071a(String str) {
        return new SearchInfoStickerAdapter(getActivity());
    }

    /* renamed from: a */
    public final void mo100825a(List<C40816v> list) {
        if (!C6311g.m19573a(list)) {
            this.f105759f = list;
            if (this.f105758e != null) {
                this.f105758e.mo58045a(this.f105759f);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo100824a(int i) {
        if (this.f105758e != null) {
            switch (i) {
                case -1:
                    this.f105758e.ai_();
                    return;
                case 0:
                    this.f105758e.ag_();
                    break;
                case 1:
                    this.f105758e.ah_();
                    return;
                case 2:
                    this.f105758e.mo66507h();
                    return;
            }
        }
    }

    /* renamed from: b */
    public final void mo100827b(List<C40816v> list) {
        if (!(C6311g.m19573a(list) || this.f105759f == null || this.f105758e == null)) {
            int itemCount = this.f105758e.getItemCount();
            this.f105759f.addAll(list);
            this.f105758e.f67539l = this.f105759f;
            this.f105758e.notifyItemRangeInserted(itemCount, list.size());
        }
    }

    /* renamed from: a */
    public final void mo100826a(boolean z) {
        int l = this.f105761h.mo5447l();
        for (int j = this.f105761h.mo5445j(); j <= l; j++) {
            C1293v f = this.f105760g.mo5575f(j);
            if (f instanceof SearchInfoStickerHolder) {
                ((SearchInfoStickerHolder) f).mo100831a(z);
            }
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f105761h = new WrapGridLayoutManager(getContext(), 3, 1, false);
        this.f105760g.setItemViewCacheSize(3);
        this.f105760g.setLayoutManager(this.f105761h);
        if (this.f105760g.getAdapter() == null) {
            this.f105758e = m130071a("Search");
            this.f105760g.setAdapter(this.f105758e);
        } else {
            this.f105758e = (SearchInfoStickerAdapter) this.f105760g.getAdapter();
        }
        this.f105758e.mo66516d(true);
        this.f105758e.f105635b = this.f105754a;
        if (!C6311g.m19573a(this.f105759f)) {
            this.f105758e.mo58045a(this.f105759f);
        }
        this.f105758e.mo66504a(this.f105757d);
        this.f105760g.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                boolean z;
                super.onScrollStateChanged(recyclerView, i);
                if (SearchInfoStickerFragment.this.f105755b != null) {
                    SearchInfoStickerFragment.this.f105755b.mo100828a(i);
                }
                SearchInfoStickerFragment searchInfoStickerFragment = SearchInfoStickerFragment.this;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                searchInfoStickerFragment.f105756c = z;
                SearchInfoStickerFragment.this.mo100826a(SearchInfoStickerFragment.this.f105756c);
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                SearchInfoStickerFragment.this.mo100826a(SearchInfoStickerFragment.this.f105756c);
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.x1, viewGroup, false);
        this.f105760g = (RecyclerView) inflate.findViewById(R.id.db3);
        return inflate;
    }
}
