package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchAggregateCommodity */
public final class SearchAggregateCommodity implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "aweme_info")
    private Aweme aweme;
    @C6593c(mo15949a = "product_info")
    private Commodity commodity;
    private boolean isReportShow;
    @C6593c(mo15949a = "result_type")
    private Integer resultType;
    @C6593c(mo15949a = "seed_info")
    private SeedInfo seedInfo;
    @C6593c(mo15949a = "tag_info")
    private HashTag tagInfo;

    /* renamed from: com.ss.android.ugc.aweme.discover.model.SearchAggregateCommodity$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final Commodity getCommodity() {
        return this.commodity;
    }

    public final Integer getResultType() {
        return this.resultType;
    }

    public final SeedInfo getSeedInfo() {
        return this.seedInfo;
    }

    public final HashTag getTagInfo() {
        return this.tagInfo;
    }

    public final boolean isReportShow() {
        return this.isReportShow;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setCommodity(Commodity commodity2) {
        this.commodity = commodity2;
    }

    public final void setReportShow(boolean z) {
        this.isReportShow = z;
    }

    public final void setResultType(Integer num) {
        this.resultType = num;
    }

    public final void setSeedInfo(SeedInfo seedInfo2) {
        this.seedInfo = seedInfo2;
    }

    public final void setTagInfo(HashTag hashTag) {
        this.tagInfo = hashTag;
    }
}
