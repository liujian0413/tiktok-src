package com.p280ss.android.ugc.aweme.feed.adapter;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.contentroaming.view.ContentRoamingViewHolder;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21745c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.CellFeedAdapter */
public class CellFeedAdapter extends AnimatedAdapter implements C21745c {

    /* renamed from: e */
    private String f73933e;

    /* renamed from: f */
    private C23685d f73934f;

    /* renamed from: g */
    private CellFeedFragmentPanel f73935g;

    /* renamed from: h */
    private C25663d f73936h;

    /* renamed from: i */
    private int f73937i;

    /* renamed from: j */
    private int f73938j;

    public final void aW_() {
    }

    /* renamed from: j */
    public final void mo58064j() {
    }

    /* renamed from: k */
    public final void mo58065k() {
    }

    /* renamed from: a */
    public final int mo58030a(View view) {
        if (view == null) {
            return 0;
        }
        return (int) C9738o.m28708b(view.getContext(), 95.0f);
    }

    /* renamed from: b */
    public final void mo58051b(View view) {
        view.setPadding(0, 0, 0, (int) C9738o.m28708b(view.getContext(), 40.5f));
    }

    /* renamed from: d */
    public final void mo66501d(List<Aweme> list) {
        super.mo66501d(list);
        if (this.f73935g != null) {
            this.f73935g.f75270i = false;
        }
    }

    /* renamed from: a */
    public final void mo66504a(C6905a aVar) {
        super.mo66504a(aVar);
        if (this.f73935g != null) {
            this.f73935g.f75270i = false;
        }
    }

    /* renamed from: a */
    public final void mo58045a(List<Aweme> list) {
        super.mo58045a(list);
        if (this.f73935g != null) {
            this.f73935g.f75270i = false;
        }
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar.mItemViewType == 0 && this.f73935g != null && this.f73935g.mo73488bw() && this.f73936h != null) {
            this.f73936h.mo61737a(vVar);
        }
        if (vVar instanceof RecommendCellBViewHolder) {
            ((RecommendCellBViewHolder) vVar).mo71605o();
        }
    }

    /* renamed from: b */
    public final C1293v mo61146b(ViewGroup viewGroup, int i) {
        if (this.f73938j == 7) {
            if (this.f73937i == 1) {
                return new TimeLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3r, viewGroup, false), this.f73933e, this.f73934f);
            }
            return new LocationCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xa, viewGroup, false), this.f73933e, this.f73934f);
        } else if (this.f73938j == 9) {
            return new RecommendCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_search_video, viewGroup, false), this.f73933e, this.f73934f, true);
        } else {
            if (this.f73938j == 12) {
                return new ContentRoamingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.u9, viewGroup, false), this.f73933e, this.f73934f);
            }
            if (this.f73937i == 1) {
                return new RecommendCellBViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1a, viewGroup, false), this.f73933e, this.f73934f);
            }
            if (this.f73937i == 2) {
                return new RecommendCellCViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1b, viewGroup, false), this.f73933e, this.f73934f);
            }
            if (this.f73937i == 3) {
                return new PoiDetailViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a1a, viewGroup, false), this.f73933e, this.f73934f);
            }
            return new TimeLineViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a3r, viewGroup, false), this.f73933e, this.f73934f);
        }
    }

    /* renamed from: b */
    public final void mo61148b(C1293v vVar, int i) {
        boolean z = false;
        if (this.f73938j == 7) {
            if (this.f73937i == 1) {
                TimeLineViewHolder timeLineViewHolder = (TimeLineViewHolder) vVar;
                Aweme aweme = (Aweme) this.f67539l.get(i);
                if (this.f73935g == null || this.f73935g.mo73488bw()) {
                    z = true;
                }
                timeLineViewHolder.mo71635a(aweme, i, z);
            } else if (this.f73937i == 2) {
                LocationCellBViewHolder locationCellBViewHolder = (LocationCellBViewHolder) vVar;
                Aweme aweme2 = (Aweme) this.f67539l.get(i);
                if (this.f73935g == null || this.f73935g.mo73488bw()) {
                    z = true;
                }
                locationCellBViewHolder.mo71601a(aweme2, i, z);
            }
        } else if (this.f73938j == 9) {
            RecommendCellBViewHolder recommendCellBViewHolder = (RecommendCellBViewHolder) vVar;
            Aweme aweme3 = (Aweme) this.f67539l.get(i);
            if (this.f73935g == null || this.f73935g.mo73488bw()) {
                z = true;
            }
            recommendCellBViewHolder.mo71604a(aweme3, i, z);
        } else if (this.f73938j == 12) {
            ContentRoamingViewHolder contentRoamingViewHolder = (ContentRoamingViewHolder) vVar;
            Aweme aweme4 = (Aweme) this.f67539l.get(i);
            if (this.f73935g == null || this.f73935g.mo73488bw()) {
                z = true;
            }
            contentRoamingViewHolder.mo67067a(aweme4, i, z);
        } else if (this.f73937i == 1) {
            RecommendCellBViewHolder recommendCellBViewHolder2 = (RecommendCellBViewHolder) vVar;
            Aweme aweme5 = (Aweme) this.f67539l.get(i);
            if (this.f73935g == null || this.f73935g.mo73488bw()) {
                z = true;
            }
            recommendCellBViewHolder2.mo71604a(aweme5, i, z);
        } else if (this.f73937i == 2) {
            RecommendCellCViewHolder recommendCellCViewHolder = (RecommendCellCViewHolder) vVar;
            Aweme aweme6 = (Aweme) this.f67539l.get(i);
            if (this.f73935g == null || this.f73935g.mo73488bw()) {
                z = true;
            }
            recommendCellCViewHolder.mo71609a(aweme6, i, z);
        } else if (this.f73937i == 0) {
            TimeLineViewHolder timeLineViewHolder2 = (TimeLineViewHolder) vVar;
            Aweme aweme7 = (Aweme) this.f67539l.get(i);
            if (this.f73935g == null || this.f73935g.mo73488bw()) {
                z = true;
            }
            timeLineViewHolder2.mo71635a(aweme7, i, z);
        } else if (this.f73937i == 3) {
            PoiDetailViewHolder poiDetailViewHolder = (PoiDetailViewHolder) vVar;
            Aweme aweme8 = (Aweme) this.f67539l.get(i);
            if (this.f73935g == null || this.f73935g.mo73488bw()) {
                z = true;
            }
            poiDetailViewHolder.mo71603a(aweme8, i, z);
        }
        C6903bc.m21497p().mo86704a();
    }

    public CellFeedAdapter(CellFeedFragmentPanel cellFeedFragmentPanel, String str, C23685d dVar, C25663d<AbsCellViewHolder> dVar2, int i, int i2) {
        this.f73933e = str;
        this.f73934f = dVar;
        this.f73935g = cellFeedFragmentPanel;
        this.f73936h = dVar2;
        this.f73937i = i;
        this.f73938j = i2;
    }
}
