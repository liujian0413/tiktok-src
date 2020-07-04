package com.p280ss.android.ugc.aweme.poi.bean;

import com.p280ss.android.ugc.aweme.feed.model.poi.SimplePoiInfoStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.model.PoiRecommendPoiList;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.bean.PoiRecommendPoiFeed */
public final class PoiRecommendPoiFeed extends C34145b implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final int TYPE_EXPLORE = 2;
    public static final int TYPE_FOOD = 3;
    public static final int TYPE_HOTEL = 5;
    public static final int TYPE_NEARBY = 1;
    public static final int TYPE_SCENE = 4;
    private boolean hideDivider;
    private boolean hideTopDivider = true;
    private final PoiRecommendPoiList recommendPoi;
    private final Integer recommendType;

    /* renamed from: com.ss.android.ugc.aweme.poi.bean.PoiRecommendPoiFeed$Companion */
    public static final class Companion implements Serializable {
        private Companion() {
        }

        public final int getTYPE_EXPLORE() {
            return PoiRecommendPoiFeed.TYPE_EXPLORE;
        }

        public final int getTYPE_FOOD() {
            return PoiRecommendPoiFeed.TYPE_FOOD;
        }

        public final int getTYPE_HOTEL() {
            return PoiRecommendPoiFeed.TYPE_HOTEL;
        }

        public final int getTYPE_NEARBY() {
            return PoiRecommendPoiFeed.TYPE_NEARBY;
        }

        public final int getTYPE_SCENE() {
            return PoiRecommendPoiFeed.TYPE_SCENE;
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final int getFeedType() {
        return 65451;
    }

    public final boolean getHideDivider() {
        return this.hideDivider;
    }

    public final boolean getHideTopDivider() {
        return this.hideTopDivider;
    }

    public final Integer getRecommendType() {
        return this.recommendType;
    }

    public final void setFeedType(int i) {
    }

    public final void addNullItem() {
        this.recommendPoi.addNullItem();
    }

    public final boolean hasMore() {
        return this.recommendPoi.hasMore();
    }

    public final List<SimplePoiInfoStruct> list() {
        List<SimplePoiInfoStruct> list = this.recommendPoi.list;
        C7573i.m23582a((Object) list, "recommendPoi.list");
        return list;
    }

    public final String title() {
        String str = this.recommendPoi.title;
        C7573i.m23582a((Object) str, "recommendPoi.title");
        return str;
    }

    public final void setHideDivider(boolean z) {
        this.hideDivider = z;
    }

    public final void setHideTopDivider(boolean z) {
        this.hideTopDivider = z;
    }

    public PoiRecommendPoiFeed(Integer num, PoiRecommendPoiList poiRecommendPoiList) {
        C7573i.m23587b(num, "recommendType");
        C7573i.m23587b(poiRecommendPoiList, "recommendPoi");
        this.recommendType = num;
        this.recommendPoi = poiRecommendPoiList;
    }
}
