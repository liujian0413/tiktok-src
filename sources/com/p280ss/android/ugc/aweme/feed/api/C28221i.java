package com.p280ss.android.ugc.aweme.feed.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22823d;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.ugc.aweme.proto.aweme_v2_feed_response;

/* renamed from: com.ss.android.ugc.aweme.feed.api.i */
public final class C28221i implements RetrofitApi {

    /* renamed from: a */
    private RetrofitApi f74335a;

    /* renamed from: a */
    private static void m92765a() {
        if (C6857a.m21312e().f19501a) {
            C6857a.m21312e().mo16827b("feed_compose_params", false);
            C6857a.m21312e().mo16821a("feed_api_to_net_api", System.currentTimeMillis(), false);
        }
    }

    /* renamed from: b */
    private static void m92766b() {
        if (C6857a.m21312e().f19501a) {
            C6857a.m21312e().mo16827b("feed_net_api_to_feed_api", false);
            C6857a.m21312e().mo16822a("feed_api_to_ui_response", false);
        }
    }

    C28221i(RetrofitApi retrofitApi) {
        if (retrofitApi != null) {
            this.f74335a = retrofitApi;
            return;
        }
        throw new IllegalArgumentException("retrofitApi should not be null");
    }

    public final C18253l<FeedItemList> fetchRoamingFeed(int i, String str) {
        return this.f74335a.fetchRoamingFeed(i, str);
    }

    public final C18253l<FeedItemList> fetchNearbyFeed(long j, long j2, int i, Integer num, String str, int i2, int i3) {
        return this.f74335a.fetchNearbyFeed(j, j2, i, num, str, i2, i3);
    }

    public final C18253l<FeedTimeLineItemList> fetchTimelineFeed(int i, long j, long j2, int i2, String str, String str2, String str3, int i3) {
        return this.f74335a.fetchTimelineFeed(i, j, j2, i2, str, str2, str3, i3);
    }

    public final C18253l<FeedItemList> fetchFollowFeed(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, Object obj) {
        long j3 = j;
        long j4 = j2;
        int i4 = i;
        Integer num5 = num;
        String str12 = str;
        double d2 = d;
        int i5 = i2;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        int i6 = i3;
        String str18 = str7;
        String str19 = str8;
        Integer num6 = num2;
        Integer num7 = num3;
        Integer num8 = num4;
        String str20 = str9;
        Long l2 = l;
        String str21 = str10;
        String str22 = str11;
        Object obj2 = obj;
        m92765a();
        C18253l<FeedItemList> fetchFollowFeed = this.f74335a.fetchFollowFeed(j3, j4, i4, num5, str12, d2, i5, str13, str14, str15, str16, str17, i6, str18, str19, num6, num7, num8, str20, l2, str21, str22, obj2);
        m92766b();
        return fetchFollowFeed;
    }

    public final C18253l<FeedItemList> fetchFollowFeedImmediate(long j, long j2, int i, Integer num, String str, double d, int i2, String str2, String str3, String str4, String str5, String str6, int i3, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, Object obj) {
        long j3 = j;
        long j4 = j2;
        int i4 = i;
        Integer num5 = num;
        String str12 = str;
        double d2 = d;
        int i5 = i2;
        String str13 = str2;
        String str14 = str3;
        String str15 = str4;
        String str16 = str5;
        String str17 = str6;
        int i6 = i3;
        String str18 = str7;
        String str19 = str8;
        Integer num6 = num2;
        Integer num7 = num3;
        Integer num8 = num4;
        String str20 = str9;
        Long l2 = l;
        String str21 = str10;
        String str22 = str11;
        Object obj2 = obj;
        m92765a();
        C18253l<FeedItemList> fetchFollowFeedImmediate = this.f74335a.fetchFollowFeedImmediate(j3, j4, i4, num5, str12, d2, i5, str13, str14, str15, str16, str17, i6, str18, str19, num6, num7, num8, str20, l2, str21, str22, obj2);
        m92766b();
        return fetchFollowFeedImmediate;
    }

    public final C18253l<FeedItemList> fetchRecommendFeed(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, Object obj, Integer num5, Long l2, String str12, Integer num6) {
        int i5 = i;
        long j3 = j;
        long j4 = j2;
        int i6 = i2;
        Integer num7 = num;
        String str13 = str;
        double d2 = d;
        int i7 = i3;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        int i8 = i4;
        String str19 = str7;
        String str20 = str8;
        Integer num8 = num2;
        Integer num9 = num3;
        Integer num10 = num4;
        String str21 = str9;
        Long l3 = l;
        String str22 = str10;
        String str23 = str11;
        Object obj2 = obj;
        Integer num11 = num5;
        Long l4 = l2;
        String str24 = str12;
        Integer num12 = num6;
        m92765a();
        C18253l<FeedItemList> fetchRecommendFeed = this.f74335a.fetchRecommendFeed(i5, j3, j4, i6, num7, str13, d2, i7, str14, str15, str16, str17, str18, i8, str19, str20, num8, num9, num10, str21, l3, str22, str23, obj2, num11, l4, str24, num12);
        m92766b();
        return fetchRecommendFeed;
    }

    public final C18253l<FeedItemList> fetchRecommendFeedImmediate(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, Object obj, Integer num5, Long l2, String str12, Integer num6) {
        int i5 = i;
        long j3 = j;
        long j4 = j2;
        int i6 = i2;
        Integer num7 = num;
        String str13 = str;
        double d2 = d;
        int i7 = i3;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        int i8 = i4;
        String str19 = str7;
        String str20 = str8;
        Integer num8 = num2;
        Integer num9 = num3;
        Integer num10 = num4;
        String str21 = str9;
        Long l3 = l;
        String str22 = str10;
        String str23 = str11;
        Object obj2 = obj;
        Integer num11 = num5;
        Long l4 = l2;
        String str24 = str12;
        Integer num12 = num6;
        m92765a();
        C18253l<FeedItemList> fetchRecommendFeedImmediate = this.f74335a.fetchRecommendFeedImmediate(i5, j3, j4, i6, num7, str13, d2, i7, str14, str15, str16, str17, str18, i8, str19, str20, num8, num9, num10, str21, l3, str22, str23, obj2, num11, l4, str24, num12);
        m92766b();
        return fetchRecommendFeedImmediate;
    }

    public final C18253l<C22823d<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(int i, long j, long j2, int i2, Integer num, String str, double d, int i3, String str2, String str3, String str4, String str5, String str6, int i4, String str7, String str8, Integer num2, Integer num3, Integer num4, String str9, Long l, String str10, String str11, Object obj, Integer num5, Long l2, String str12, Integer num6) {
        int i5 = i;
        long j3 = j;
        long j4 = j2;
        int i6 = i2;
        Integer num7 = num;
        String str13 = str;
        double d2 = d;
        int i7 = i3;
        String str14 = str2;
        String str15 = str3;
        String str16 = str4;
        String str17 = str5;
        String str18 = str6;
        int i8 = i4;
        String str19 = str7;
        String str20 = str8;
        Integer num8 = num2;
        Integer num9 = num3;
        Integer num10 = num4;
        String str21 = str9;
        Long l3 = l;
        String str22 = str10;
        String str23 = str11;
        Object obj2 = obj;
        Integer num11 = num5;
        Long l4 = l2;
        String str24 = str12;
        Integer num12 = num6;
        m92765a();
        C18253l<C22823d<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2 = this.f74335a.fetchRecommendFeedV2(i5, j3, j4, i6, num7, str13, d2, i7, str14, str15, str16, str17, str18, i8, str19, str20, num8, num9, num10, str21, l3, str22, str23, obj2, num11, l4, str24, num12);
        m92766b();
        return fetchRecommendFeedV2;
    }
}
