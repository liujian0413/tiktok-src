package com.p280ss.android.ugc.aweme.discover.model;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverItemData */
public final class DiscoverItemData implements Serializable {
    public static final Companion Companion = new Companion(null);
    private static final long serialVersionUID = 42;
    private List<? extends Banner> bannerList;
    private CategoryOrAd categoryOrAd;
    private HotSearchListResponse hotSearchResponse;
    private List<? extends HotVideoItem> hotSearchVideos;
    private RankingListCover rankingListCover;
    private int type;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.DiscoverItemData$Companion */
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final List<Banner> getBannerList() {
        return this.bannerList;
    }

    public final CategoryOrAd getCategoryOrAd() {
        return this.categoryOrAd;
    }

    public final HotSearchListResponse getHotSearchResponse() {
        return this.hotSearchResponse;
    }

    public final List<HotVideoItem> getHotSearchVideos() {
        return this.hotSearchVideos;
    }

    public final RankingListCover getRankingListCover() {
        return this.rankingListCover;
    }

    public final int getType() {
        return this.type;
    }

    public final void setBannerList(List<? extends Banner> list) {
        this.bannerList = list;
    }

    public final void setCategoryOrAd(CategoryOrAd categoryOrAd2) {
        this.categoryOrAd = categoryOrAd2;
    }

    public final void setHotSearchResponse(HotSearchListResponse hotSearchListResponse) {
        this.hotSearchResponse = hotSearchListResponse;
    }

    public final void setHotSearchVideos(List<? extends HotVideoItem> list) {
        this.hotSearchVideos = list;
    }

    public final void setRankingListCover(RankingListCover rankingListCover2) {
        this.rankingListCover = rankingListCover2;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public DiscoverItemData(int i) {
        this.type = i;
    }
}
