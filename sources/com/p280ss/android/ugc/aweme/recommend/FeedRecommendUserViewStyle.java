package com.p280ss.android.ugc.aweme.recommend;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;

@C6381a(mo15284a = "feed_recommend_user_view_style")
/* renamed from: com.ss.android.ugc.aweme.recommend.FeedRecommendUserViewStyle */
public final class FeedRecommendUserViewStyle {
    public static final FeedRecommendUserViewStyle INSTANCE = new FeedRecommendUserViewStyle();
    private static final double ITEM_HEIGHT_STYLE_A = 162.0d;
    private static final double ITEM_HEIGHT_STYLE_B = 138.0d;
    private static final double ITEM_HEIGHT_STYLE_C = 133.0d;
    @C6382b
    private static final int TYPE_A = 1;
    @C6382b
    private static final int TYPE_B = 2;
    @C6382b
    private static final int TYPE_C = 3;
    @C6382b(mo15285a = true)
    private static final int TYPE_NONE = 0;

    private FeedRecommendUserViewStyle() {
    }

    public static final boolean isEnabled() {
        if (C6384b.m19835a().mo15287a(FeedRecommendUserViewStyle.class, true, "feed_recommend_user_view_style", C6384b.m19835a().mo15295d().feed_recommend_user_view_style, 0) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean isLargerStyle() {
        if (C6384b.m19835a().mo15287a(FeedRecommendUserViewStyle.class, true, "feed_recommend_user_view_style", C6384b.m19835a().mo15295d().feed_recommend_user_view_style, 0) == 3) {
            return true;
        }
        return false;
    }

    public static final boolean needTag() {
        if (C6384b.m19835a().mo15287a(FeedRecommendUserViewStyle.class, true, "feed_recommend_user_view_style", C6384b.m19835a().mo15295d().feed_recommend_user_view_style, 0) == 1) {
            return true;
        }
        return false;
    }

    public static final int getRecyclerViewItemHeight() {
        if (needTag()) {
            return C23486n.m77122a((double) ITEM_HEIGHT_STYLE_A);
        }
        if (needDetailRecommendReason()) {
            return C23486n.m77122a((double) ITEM_HEIGHT_STYLE_B);
        }
        return C23486n.m77122a((double) ITEM_HEIGHT_STYLE_C);
    }

    public static final boolean needDetailRecommendReason() {
        if (C6384b.m19835a().mo15287a(FeedRecommendUserViewStyle.class, true, "feed_recommend_user_view_style", C6384b.m19835a().mo15295d().feed_recommend_user_view_style, 0) == 1 || C6384b.m19835a().mo15287a(FeedRecommendUserViewStyle.class, true, "feed_recommend_user_view_style", C6384b.m19835a().mo15295d().feed_recommend_user_view_style, 0) == 2) {
            return true;
        }
        return false;
    }
}
