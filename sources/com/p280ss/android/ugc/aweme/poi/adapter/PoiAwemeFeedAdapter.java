package com.p280ss.android.ugc.aweme.poi.adapter;

import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.adapter.FlowFeedAdapter;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29374h;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p1257vh.BaseFollowViewHolder;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateMoreViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiCateTitleViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiCommonBannerViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDcdProductInfoViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiImageViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiMultipleTourProductViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiOptimizedDetailViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiQAndAViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiRateViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendPoiViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiRecommendViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiSingleTourProductViewHolder;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiVideoViewHolder;
import com.p280ss.android.ugc.aweme.poi.bean.C35069a;
import com.p280ss.android.ugc.aweme.poi.bean.C35070b;
import com.p280ss.android.ugc.aweme.poi.bean.C35071c;
import com.p280ss.android.ugc.aweme.poi.bean.C35073e;
import com.p280ss.android.ugc.aweme.poi.bean.PoiBannerItem;
import com.p280ss.android.ugc.aweme.poi.bean.PoiCategoryMore;
import com.p280ss.android.ugc.aweme.poi.bean.PoiCategoryTitle;
import com.p280ss.android.ugc.aweme.poi.bean.PoiDcdProductItem;
import com.p280ss.android.ugc.aweme.poi.bean.PoiRecommendPoiFeed;
import com.p280ss.android.ugc.aweme.poi.p335ui.detail.C35316a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter */
public class PoiAwemeFeedAdapter extends FlowFeedAdapter<C34145b> {

    /* renamed from: E */
    public PoiSimpleBundle f91410E;

    /* renamed from: F */
    public AbsFragment f91411F;

    /* renamed from: G */
    public C35012a f91412G;

    /* renamed from: H */
    public int f91413H = 3;

    /* renamed from: I */
    public C35025a f91414I;

    /* renamed from: J */
    public C35008a f91415J;

    /* renamed from: K */
    public int f91416K;

    /* renamed from: L */
    public int f91417L;

    /* renamed from: M */
    private PoiOptimizedDetailViewHolder f91418M;

    /* renamed from: com.ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter$a */
    public interface C35008a {
    }

    /* renamed from: m */
    public final boolean mo58067m() {
        return true;
    }

    public final void aW_() {
        super.aW_();
        if (this.f91418M != null) {
            this.f91418M.mo88815b();
        }
    }

    /* renamed from: j */
    public final void mo58064j() {
        super.mo58064j();
        if (this.f91418M != null) {
            this.f91418M.mo88817c();
        }
    }

    /* renamed from: n */
    public final boolean mo58068n() {
        if (this.f91415J != null) {
            return true;
        }
        return super.mo58068n();
    }

    /* renamed from: o */
    public final void mo88768o() {
        if (this.f91418M != null) {
            this.f91418M.mo88810a();
        }
    }

    /* renamed from: p */
    private int m113012p() {
        if (getItemCount() == 0) {
            return 0;
        }
        int i = 0;
        int i2 = 0;
        while (i < getItemCount()) {
            int itemViewType = getItemViewType(i);
            if (itemViewType != 16) {
                if (itemViewType != -1) {
                    i2++;
                }
                i++;
            } else if (i2 >= getItemCount()) {
                return 0;
            } else {
                return i2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    public final void mo88765a(CouponInfo couponInfo) {
        if (this.f91418M != null) {
            this.f91418M.mo88813a(couponInfo);
        }
    }

    /* renamed from: c */
    public final void mo88766c(View view) {
        if (this.f91418M != null) {
            this.f91418M.mo88812a(view);
        }
    }

    /* renamed from: g */
    public final void mo88767g(int i) {
        if (this.f91418M != null) {
            this.f91418M.mo88811a(i);
        }
    }

    /* renamed from: a */
    public final void mo58045a(List<C34145b> list) {
        super.mo58045a(mo58060e(list));
        this.f91417L = m113012p();
    }

    /* renamed from: b */
    public final BaseFollowViewHolder mo58049b(ViewGroup viewGroup) {
        PoiImageViewHolder poiImageViewHolder = new PoiImageViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f91410E, this.f58247k, this.f58241e, this.f58245i, this.f91416K, this.f58249x);
        return poiImageViewHolder;
    }

    /* renamed from: c */
    public final BaseFollowViewHolder mo58054c(ViewGroup viewGroup) {
        PoiVideoViewHolder poiVideoViewHolder = new PoiVideoViewHolder((FollowFeedLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vj, viewGroup, false), this.f91410E, this.f58247k, this.f58241e, this.f58245i, this.f91416K, this.f58249x);
        poiVideoViewHolder.f77594aT = this;
        return poiVideoViewHolder;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003b A[RETURN] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo58061e(int r6) {
        /*
            r5 = this;
            int r0 = r5.getItemCount()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
            r3 = 17
            r4 = 16
            if (r6 >= r0) goto L_0x0027
            int r0 = r5.getItemViewType(r6)
            if (r0 == r4) goto L_0x0019
            int r0 = r5.getItemViewType(r6)
            if (r0 != r3) goto L_0x003b
        L_0x0019:
            int r6 = r6 + r1
            int r0 = r5.getItemViewType(r6)
            if (r0 == r4) goto L_0x003b
            int r6 = r5.getItemViewType(r6)
            if (r6 == r3) goto L_0x003b
            return r2
        L_0x0027:
            int r0 = r5.getItemCount()
            int r0 = r0 - r1
            if (r6 != r0) goto L_0x003b
            int r0 = r5.getItemViewType(r6)
            if (r0 == r4) goto L_0x003a
            int r6 = r5.getItemViewType(r6)
            if (r6 != r3) goto L_0x003b
        L_0x003a:
            return r2
        L_0x003b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter.mo58061e(int):boolean");
    }

    public void onViewAttachedToWindow(C1293v vVar) {
        super.onViewAttachedToWindow(vVar);
        if (vVar instanceof PoiRecommendPoiViewHolder) {
            ((PoiRecommendPoiViewHolder) vVar).mo88832a();
        } else if (vVar instanceof PoiMultipleTourProductViewHolder) {
            ((PoiMultipleTourProductViewHolder) vVar).mo88808a();
        } else {
            if (vVar instanceof PoiQAndAViewHolder) {
                ((PoiQAndAViewHolder) vVar).mo88828b();
            }
        }
    }

    /* renamed from: a */
    public final int mo58029a(int i) {
        int a = super.mo58029a(i);
        if (a != -1) {
            return a;
        }
        C34145b bVar = (C34145b) this.f67539l.get(i);
        if (bVar.getFeedType() == 65441) {
            return 112;
        }
        if (bVar.getFeedType() != 65443 || !(bVar instanceof PoiCategoryTitle)) {
            if (bVar.getFeedType() != 65444 || !(bVar instanceof PoiCategoryMore)) {
                if (bVar.getFeedType() == 65446 && (bVar instanceof C35071c)) {
                    return 163;
                }
                if (bVar.getFeedType() == 65448) {
                    return 165;
                }
                if (bVar.getFeedType() == 65449) {
                    return 166;
                }
                if (bVar.getFeedType() == 65451) {
                    return 168;
                }
                if (bVar.getFeedType() == 65452) {
                    if (((C35073e) mo58050b(i)).mo88904a().intValue() == 1) {
                        return 169;
                    }
                    return 170;
                } else if (bVar.getFeedType() == 65453) {
                    return 171;
                } else {
                    if (bVar.getFeedType() == 65454) {
                        return 172;
                    }
                    return -1;
                }
            } else if (((PoiCategoryMore) bVar).isAweme) {
                return 145;
            } else {
                return 161;
            }
        } else if (((PoiCategoryTitle) bVar).isAweme) {
            return 144;
        } else {
            return 160;
        }
    }

    public PoiAwemeFeedAdapter(RecyclerView recyclerView, C29374h hVar) {
        super(recyclerView, hVar);
    }

    /* renamed from: a */
    public final void mo58036a(Aweme aweme, String str) {
        if (aweme != null && TextUtils.equals(str, this.f58251z) && ((LinearLayoutManager) this.f58248w.getLayoutManager()) != null) {
            Iterator it = this.f67539l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C34145b bVar = (C34145b) it.next();
                Aweme aweme2 = bVar.getAweme();
                if (bVar.getFeedType() == 65280 && aweme2 != null && TextUtils.equals(aweme2.getAid(), aweme.getAid())) {
                    if (this.f91411F != null && (this.f91411F instanceof C35316a)) {
                        ((C35316a) this.f91411F).mo89866e_(this.f67539l.indexOf(bVar));
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final C1293v mo58032a(ViewGroup viewGroup, int i) {
        if (i == 112) {
            if (this.f91418M == null) {
                this.f91418M = new PoiOptimizedDetailViewHolder(this.f91411F, this.f91414I, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vp, viewGroup, false));
            }
            return this.f91418M;
        } else if (i == 144 || i == 160) {
            return new PoiCateTitleViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vy, viewGroup, false));
        } else {
            if (i == 145 || i == 161) {
                return new PoiCateMoreViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vx, viewGroup, false));
            }
            if (i == 163) {
                return new PoiRecommendViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vq, viewGroup, false));
            }
            if (i == 165) {
                return new PoiDcdProductInfoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.w0, viewGroup, false));
            }
            if (i == 166) {
                return new PoiCommonBannerViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vz, viewGroup, false));
            }
            if (i == 168) {
                return new PoiRecommendPoiViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vr, viewGroup, false));
            }
            if (i == 169) {
                return new PoiSingleTourProductViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vs, viewGroup, false));
            }
            if (i == 170) {
                return new PoiMultipleTourProductViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vo, viewGroup, false));
            }
            if (i == 171) {
                return new PoiQAndAViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.a18, viewGroup, false));
            }
            if (i == 172) {
                return new PoiRateViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.vk, viewGroup, false));
            }
            return super.mo58032a(viewGroup, i);
        }
    }

    /* renamed from: a */
    public final void mo58033a(C1293v vVar, int i) {
        if (mo58029a(i) == 112) {
            if (this.f91418M != null) {
                this.f91418M.mo88814a((C34145b) this.f67539l.get(i), this.f91410E);
            }
        } else if (mo58029a(i) == 144) {
            ((PoiCateTitleViewHolder) vVar).mo88792a((PoiCategoryTitle) this.f67539l.get(i), this.f91410E, this.f91412G);
        } else if (mo58029a(i) == 145) {
            PoiCategoryMore poiCategoryMore = (PoiCategoryMore) this.f67539l.get(i);
            poiCategoryMore.aid = this.f91410E.getAwemeId();
            ((PoiCateMoreViewHolder) vVar).mo88790a(poiCategoryMore, true, i, this.f91412G);
        } else if (mo58029a(i) == 160) {
            ((PoiCateTitleViewHolder) vVar).mo88792a((PoiCategoryTitle) this.f67539l.get(i), this.f91410E, this.f91412G);
        } else if (mo58029a(i) == 161) {
            ((PoiCateMoreViewHolder) vVar).mo88790a((PoiCategoryMore) this.f67539l.get(i), false, i, this.f91412G);
        } else if (mo58029a(i) == 163) {
            ((PoiRecommendViewHolder) vVar).mo88835a((C35071c) this.f67539l.get(i), this.f91410E);
        } else if (mo58029a(i) == 165) {
            ((PoiDcdProductInfoViewHolder) vVar).mo88796a((PoiDcdProductItem) this.f67539l.get(i), this.f91410E);
        } else if (mo58029a(i) == 166) {
            ((PoiCommonBannerViewHolder) vVar).mo88794a((PoiBannerItem) this.f67539l.get(i), this.f91410E);
        } else if (mo58029a(i) == 168) {
            ((PoiRecommendPoiViewHolder) vVar).mo88833a((PoiRecommendPoiFeed) this.f67539l.get(i), this.f91410E);
        } else if (mo58029a(i) == 169) {
            ((PoiSingleTourProductViewHolder) vVar).mo88836a((C35073e) this.f67539l.get(i), this.f91410E);
        } else if (mo58029a(i) == 170) {
            ((PoiMultipleTourProductViewHolder) vVar).mo88809a((C35073e) this.f67539l.get(i), this.f91410E);
        } else if (mo58029a(i) == 171) {
            ((PoiQAndAViewHolder) vVar).mo88827a((C35069a) this.f67539l.get(i), this.f91410E);
        } else if (mo58029a(i) == 172) {
            ((PoiRateViewHolder) vVar).mo88831a((C35070b) this.f67539l.get(i), this.f91410E);
        } else {
            super.mo58033a(vVar, i);
        }
    }

    public void onBindViewHolder(C1293v vVar, int i, List list) {
        if (list == null || list.size() == 0) {
            onBindViewHolder(vVar, i);
            return;
        }
        if (mo58029a(i) == 112) {
            ((PoiOptimizedDetailViewHolder) vVar).mo88819d();
        }
    }
}
