package com.p280ss.android.ugc.aweme.feed.api;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.p264b.C6453d;
import com.bytedance.retrofit2.p264b.C6473x;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.api.C22838j;
import com.p280ss.android.ugc.aweme.app.api.p1024c.C22823d;
import com.p280ss.android.ugc.aweme.feed.cache.C28289e;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.p280ss.ugc.aweme.proto.aweme_v2_feed_response;
import java.util.Collections;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedApi */
public final class FeedApi {

    /* renamed from: a */
    static final C28221i f74320a = new C28221i((RetrofitApi) C22838j.m75276a(C19223b.f51890e, C28218f.m92758a()).create(RetrofitApi.class));

    /* renamed from: b */
    static final C28221i f74321b = new C28221i((RetrofitApi) C22838j.m75276a(C19223b.f51890e, Collections.singletonList(new FeedCompoundInterceptor())).create(RetrofitApi.class));

    /* renamed from: c */
    private static final String f74322c;

    /* renamed from: d */
    private static volatile int f74323d = 0;

    /* renamed from: com.ss.android.ugc.aweme.feed.api.FeedApi$RetrofitApi */
    interface RetrofitApi {
        @C6473x(mo15756a = 2)
        @C7730f(mo20420a = "/aweme/v1/follow/feed/")
        C18253l<FeedItemList> fetchFollowFeed(@C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "feed_style") Integer num, @C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "volume") double d, @C7744t(mo20436a = "pull_type") int i2, @C7744t(mo20436a = "req_from") String str2, @C7744t(mo20436a = "gaid") String str3, @C7744t(mo20436a = "aweme_ids") String str4, @C7744t(mo20436a = "push_params") String str5, @C7744t(mo20436a = "ad_user_agent") String str6, @C7744t(mo20436a = "filter_warn") int i3, @C7744t(mo20436a = "bid_ad_params") String str7, @C7744t(mo20436a = "android_id") String str8, @C7744t(mo20436a = "ad_personality_mode") Integer num2, @C7744t(mo20436a = "address_book_access") Integer num3, @C7744t(mo20436a = "gps_access") Integer num4, @C7744t(mo20436a = "top_view_cid") String str9, @C7744t(mo20436a = "top_view_aid") Long l, @C7744t(mo20436a = "local_cache") String str10, @C7744t(mo20436a = "interest_list") String str11, @C6453d Object obj);

        @C6473x(mo15756a = 3)
        @C7730f(mo20420a = "/aweme/v1/follow/feed/")
        C18253l<FeedItemList> fetchFollowFeedImmediate(@C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "feed_style") Integer num, @C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "volume") double d, @C7744t(mo20436a = "pull_type") int i2, @C7744t(mo20436a = "req_from") String str2, @C7744t(mo20436a = "gaid") String str3, @C7744t(mo20436a = "aweme_ids") String str4, @C7744t(mo20436a = "push_params") String str5, @C7744t(mo20436a = "ad_user_agent") String str6, @C7744t(mo20436a = "filter_warn") int i3, @C7744t(mo20436a = "bid_ad_params") String str7, @C7744t(mo20436a = "android_id") String str8, @C7744t(mo20436a = "ad_personality_mode") Integer num2, @C7744t(mo20436a = "address_book_access") Integer num3, @C7744t(mo20436a = "gps_access") Integer num4, @C7744t(mo20436a = "top_view_cid") String str9, @C7744t(mo20436a = "top_view_aid") Long l, @C7744t(mo20436a = "local_cache") String str10, @C7744t(mo20436a = "interest_list") String str11, @C6453d Object obj);

        @C7730f(mo20420a = "/aweme/v1/nearby/feed/")
        C18253l<FeedItemList> fetchNearbyFeed(@C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "feed_style") Integer num, @C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "poi_class_code") int i2, @C7744t(mo20436a = "filter_warn") int i3);

        @C6473x(mo15756a = 2)
        @C7730f(mo20420a = "/aweme/v1/feed/")
        C18253l<FeedItemList> fetchRecommendFeed(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "feed_style") Integer num, @C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "volume") double d, @C7744t(mo20436a = "pull_type") int i3, @C7744t(mo20436a = "req_from") String str2, @C7744t(mo20436a = "gaid") String str3, @C7744t(mo20436a = "aweme_ids") String str4, @C7744t(mo20436a = "push_params") String str5, @C7744t(mo20436a = "ad_user_agent") String str6, @C7744t(mo20436a = "filter_warn") int i4, @C7744t(mo20436a = "bid_ad_params") String str7, @C7744t(mo20436a = "android_id") String str8, @C7744t(mo20436a = "ad_personality_mode") Integer num2, @C7744t(mo20436a = "address_book_access") Integer num3, @C7744t(mo20436a = "gps_access") Integer num4, @C7744t(mo20436a = "top_view_cid") String str9, @C7744t(mo20436a = "top_view_aid") Long l, @C7744t(mo20436a = "local_cache") String str10, @C7744t(mo20436a = "interest_list") String str11, @C6453d Object obj, @C7744t(mo20436a = "cached_item_num") Integer num5, @C7744t(mo20436a = "last_ad_show_interval") Long l2, @C7744t(mo20436a = "real_time_actions") String str12, @C7744t(mo20436a = "vpa_content_choice") Integer num6);

        @C6473x(mo15756a = 3)
        @C7730f(mo20420a = "/aweme/v1/feed/")
        C18253l<FeedItemList> fetchRecommendFeedImmediate(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "feed_style") Integer num, @C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "volume") double d, @C7744t(mo20436a = "pull_type") int i3, @C7744t(mo20436a = "req_from") String str2, @C7744t(mo20436a = "gaid") String str3, @C7744t(mo20436a = "aweme_ids") String str4, @C7744t(mo20436a = "push_params") String str5, @C7744t(mo20436a = "ad_user_agent") String str6, @C7744t(mo20436a = "filter_warn") int i4, @C7744t(mo20436a = "bid_ad_params") String str7, @C7744t(mo20436a = "android_id") String str8, @C7744t(mo20436a = "ad_personality_mode") Integer num2, @C7744t(mo20436a = "address_book_access") Integer num3, @C7744t(mo20436a = "gps_access") Integer num4, @C7744t(mo20436a = "top_view_cid") String str9, @C7744t(mo20436a = "top_view_aid") Long l, @C7744t(mo20436a = "local_cache") String str10, @C7744t(mo20436a = "interest_list") String str11, @C6453d Object obj, @C7744t(mo20436a = "cached_item_num") Integer num5, @C7744t(mo20436a = "last_ad_show_interval") Long l2, @C7744t(mo20436a = "real_time_actions") String str12, @C7744t(mo20436a = "vpa_content_choice") Integer num6);

        @C6473x(mo15756a = 2)
        @C7730f(mo20420a = "/aweme/v2/feed/")
        C18253l<C22823d<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "feed_style") Integer num, @C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "volume") double d, @C7744t(mo20436a = "pull_type") int i3, @C7744t(mo20436a = "req_from") String str2, @C7744t(mo20436a = "gaid") String str3, @C7744t(mo20436a = "aweme_ids") String str4, @C7744t(mo20436a = "push_params") String str5, @C7744t(mo20436a = "ad_user_agent") String str6, @C7744t(mo20436a = "filter_warn") int i4, @C7744t(mo20436a = "bid_ad_params") String str7, @C7744t(mo20436a = "android_id") String str8, @C7744t(mo20436a = "ad_personality_mode") Integer num2, @C7744t(mo20436a = "address_book_access") Integer num3, @C7744t(mo20436a = "gps_access") Integer num4, @C7744t(mo20436a = "top_view_cid") String str9, @C7744t(mo20436a = "top_view_aid") Long l, @C7744t(mo20436a = "local_cache") String str10, @C7744t(mo20436a = "interest_list") String str11, @C6453d Object obj, @C7744t(mo20436a = "cached_item_num") Integer num5, @C7744t(mo20436a = "last_ad_show_interval") Long l2, @C7744t(mo20436a = "real_time_actions") String str12, @C7744t(mo20436a = "vpa_content_choice") Integer num6);

        @C7730f(mo20420a = "/aweme/v1/roaming/feed/")
        C18253l<FeedItemList> fetchRoamingFeed(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "roaming_code") String str);

        @C7730f(mo20420a = "/aweme/v1/fresh/feed/")
        C18253l<FeedTimeLineItemList> fetchTimelineFeed(@C7744t(mo20436a = "type") int i, @C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "aweme_ids") String str2, @C7744t(mo20436a = "push_params") String str3, @C7744t(mo20436a = "filter_warn") int i3);
    }

    static {
        StringBuilder sb = new StringBuilder("pb_convert_flag");
        sb.append(C6399b.m19939o());
        f74322c = sb.toString();
    }

    /* renamed from: a */
    private static String m92741a(C28289e eVar) {
        if (eVar == null) {
            return null;
        }
        return eVar.mo71970a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x007f, code lost:
        if (android.text.TextUtils.isEmpty(r10) == false) goto L_0x0083;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0233  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.p280ss.android.ugc.aweme.feed.model.FeedItemList m92740a(com.p280ss.android.ugc.aweme.feed.api.C28226n r45) throws java.lang.Exception {
        /*
            r15 = r45
            java.lang.Integer r0 = r15.f74341a
            int r2 = r0.intValue()
            java.lang.Long r0 = r15.f74342b
            long r4 = r0.longValue()
            java.lang.Long r0 = r15.f74343c
            long r6 = r0.longValue()
            java.lang.Integer r0 = r15.f74344d
            int r8 = r0.intValue()
            java.lang.Integer r9 = r15.f74345e
            java.lang.String r0 = r15.f74346f
            java.lang.Integer r1 = r15.f74347g
            int r13 = r1.intValue()
            java.lang.String r14 = r15.f74348h
            java.lang.String r12 = r15.f74349i
            com.ss.android.ugc.aweme.feed.cache.e r1 = r15.f74350j
            java.lang.Boolean r3 = r15.f74351k
            boolean r3 = r3.booleanValue()
            java.lang.String r11 = r15.f74352l
            com.ss.android.ugc.aweme.ab.a r10 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            boolean r10 = r10.f19501a
            r33 = r11
            r11 = 0
            if (r10 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.ab.a r10 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r15 = "feed_request_to_feed_api"
            r10.mo16827b(r15, r11)
            com.ss.android.ugc.aweme.ab.a r10 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            java.lang.String r15 = "feed_compose_params"
            r10.mo16822a(r15, r11)
        L_0x004f:
            com.ss.android.ugc.aweme.antiaddic.c r10 = com.p280ss.android.ugc.aweme.antiaddic.C22562c.m74570a()
            int r10 = r10.mo59208f()
            r15 = 1
            if (r10 != r15) goto L_0x005c
            r10 = 1
            goto L_0x005d
        L_0x005c:
            r10 = 0
        L_0x005d:
            boolean r16 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r11 = "0"
            boolean r11 = android.text.TextUtils.equals(r11, r0)
            r11 = r16 | r11
            if (r11 == 0) goto L_0x0082
            boolean r11 = com.p280ss.android.ugc.aweme.antiaddic.C22572i.m74610a()
            if (r11 == 0) goto L_0x0082
            if (r10 == 0) goto L_0x0082
            com.ss.android.ugc.aweme.antiaddic.c r10 = com.p280ss.android.ugc.aweme.antiaddic.C22562c.m74570a()
            java.lang.String r10 = r10.mo59207e()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 != 0) goto L_0x0082
            goto L_0x0083
        L_0x0082:
            r10 = r0
        L_0x0083:
            java.lang.String r11 = com.p280ss.android.ugc.trill.p1762d.C44987a.m141953d()
            java.lang.String r0 = com.p280ss.android.ugc.trill.p1762d.C44987a.m141954e()
            com.ss.android.ugc.aweme.commercialize.splash.i r16 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80857g()
            java.lang.String r15 = r16.mo65558d()
            r35 = r12
            com.ss.android.ugc.aweme.commercialize.splash.i r12 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80857g()
            java.lang.Long r28 = r12.mo65553b(r15)
            r12 = 4
            if (r13 == r12) goto L_0x00a2
            if (r13 != 0) goto L_0x00a5
        L_0x00a2:
            com.p280ss.android.ugc.aweme.net.C34096o.m109763a()
        L_0x00a5:
            java.lang.String r29 = com.p280ss.android.ugc.aweme.journey.C32250l.m104753b(r13)
            boolean r16 = com.p280ss.android.ugc.aweme.feed.api.C28214b.m92752a()
            java.lang.String r17 = "feed"
            java.lang.String r20 = com.p280ss.android.ugc.aweme.commercialize.log.RawURLGetter.m81766a(r17)
            if (r0 != 0) goto L_0x00b7
            java.lang.String r0 = ""
        L_0x00b7:
            r21 = r0
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()
            r17 = 0
            if (r0 == 0) goto L_0x00d2
            com.ss.android.ugc.aweme.app.SharePrefCache r0 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bl r0 = r0.getPersonalizationMode()
            java.lang.Object r0 = r0.mo59877d()
            java.lang.Integer r0 = (java.lang.Integer) r0
            r25 = r0
            goto L_0x00d4
        L_0x00d2:
            r25 = r17
        L_0x00d4:
            com.bytedance.ttnet.c.e r0 = new com.bytedance.ttnet.c.e
            r0.<init>()
            com.bytedance.ies.abmock.b r36 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FirstFeedConnectTimeoutExperiment> r37 = com.p280ss.android.ugc.aweme.feed.experiment.FirstFeedConnectTimeoutExperiment.class
            r38 = 1
            java.lang.String r39 = "first_feed_connect_timeout"
            com.bytedance.ies.abmock.b r18 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r18.mo15295d()
            int r12 = r12.first_feed_connect_timeout
            r41 = 0
            r40 = r12
            int r12 = r36.mo15287a(r37, r38, r39, r40, r41)
            r43 = r14
            r44 = r15
            long r14 = (long) r12
            r0.f27554c = r14
            com.bytedance.ies.abmock.b r36 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FirstFeedReadTimeoutExperiment> r37 = com.p280ss.android.ugc.aweme.feed.experiment.FirstFeedReadTimeoutExperiment.class
            java.lang.String r39 = "first_feed_read_timeout"
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r12.mo15295d()
            int r12 = r12.first_feed_read_timeout
            r40 = r12
            int r12 = r36.mo15287a(r37, r38, r39, r40, r41)
            long r14 = (long) r12
            r0.f27555d = r14
            com.bytedance.ies.abmock.b r36 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FirstFeedWriteTimeoutExperiment> r37 = com.p280ss.android.ugc.aweme.feed.experiment.FirstFeedWriteTimeoutExperiment.class
            java.lang.String r39 = "first_feed_write_timeout"
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r12.mo15295d()
            int r12 = r12.first_feed_write_timeout
            r40 = r12
            int r12 = r36.mo15287a(r37, r38, r39, r40, r41)
            long r14 = (long) r12
            r0.f27556e = r14
            r12 = 2
            r14 = 4
            if (r13 == r14) goto L_0x014a
            if (r13 == 0) goto L_0x014a
            r14 = 1
            if (r13 != r14) goto L_0x013c
            goto L_0x014a
        L_0x013c:
            if (r13 != r12) goto L_0x0147
            int r14 = com.p280ss.android.ugc.aweme.commercialize.utils.C25344d.m83276a()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x014f
        L_0x0147:
            r30 = r17
            goto L_0x0151
        L_0x014a:
            r14 = 0
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
        L_0x014f:
            r30 = r14
        L_0x0151:
            r14 = 4
            if (r13 == r14) goto L_0x015f
            if (r13 == 0) goto L_0x015f
            r14 = 1
            if (r13 == r14) goto L_0x015f
            if (r13 != r12) goto L_0x015c
            goto L_0x015f
        L_0x015c:
            r31 = r17
            goto L_0x0169
        L_0x015f:
            long r14 = com.p280ss.android.ugc.aweme.commercialize.utils.C25344d.m83280b()
            java.lang.Long r12 = java.lang.Long.valueOf(r14)
            r31 = r12
        L_0x0169:
            com.p280ss.android.ugc.aweme.commercialize.utils.C25344d.m83277a(r13)
            com.ss.android.ugc.aweme.ai r12 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()
            int r12 = r12.mo57884b()
            java.lang.Integer r32 = java.lang.Integer.valueOf(r12)
            java.lang.String r34 = com.p280ss.android.ugc.aweme.feed.api.C28214b.m92753b()
            if (r16 == 0) goto L_0x0233
            if (r3 == 0) goto L_0x01be
            boolean r12 = com.p280ss.android.ugc.aweme.feed.experiment.C28344a.m93119j()
            if (r12 == 0) goto L_0x0187
            goto L_0x01be
        L_0x0187:
            com.ss.android.ugc.aweme.feed.api.i r3 = f74321b
            r36 = r0
            r0 = r3
            java.lang.String r19 = m92741a(r1)
            r1 = r2
            r2 = r4
            r4 = r6
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r13
            r10 = r11
            r11 = r43
            r12 = r35
            r13 = r20
            r14 = r33
            r37 = r44
            r15 = r21
            r16 = r25
            r17 = r37
            r18 = r28
            r20 = r29
            r21 = r36
            r22 = r30
            r23 = r31
            r24 = r34
            r25 = r32
            r26 = r45
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = com.p280ss.android.ugc.aweme.feed.helper.C28413b.m93405b(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x0415
        L_0x01be:
            r36 = r0
            r37 = r44
            com.ss.android.ugc.aweme.feed.api.i r0 = f74320a
            double r14 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75891a()
            if (r3 == 0) goto L_0x01cf
            java.lang.String r3 = "enter_auto"
        L_0x01cc:
            r16 = r3
            goto L_0x01d2
        L_0x01cf:
            java.lang.String r3 = ""
            goto L_0x01cc
        L_0x01d2:
            if (r11 != 0) goto L_0x01d9
            java.lang.String r3 = ""
            r17 = r3
            goto L_0x01db
        L_0x01d9:
            r17 = r11
        L_0x01db:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
            int r18 = r3.mo59244d()
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136882a()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136884b()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            java.lang.String r26 = m92741a(r1)
            r1 = r0
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r0 = r35
            r12 = r13
            r13 = r16
            r16 = r43
            r14 = r17
            r15 = r16
            r16 = r0
            r17 = r20
            r19 = r33
            r20 = r21
            r21 = r25
            r24 = r37
            r25 = r28
            r27 = r29
            r28 = r36
            r29 = r30
            r30 = r31
            r31 = r34
            com.google.common.util.concurrent.l r0 = r1.fetchRecommendFeedV2(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.app.api.c.d r0 = (com.p280ss.android.ugc.aweme.app.api.p1024c.C22823d) r0
            r1 = r45
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = com.p280ss.android.ugc.aweme.feed.api.C28214b.m92750a(r0, r1)
            goto L_0x0415
        L_0x0233:
            r36 = r0
            r0 = r35
            r16 = r43
            r37 = r44
            com.bytedance.ies.abmock.b r38 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment> r39 = com.p280ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment.class
            r40 = 1
            java.lang.String r41 = "is_feed_immediate"
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r12.mo15295d()
            boolean r12 = r12.is_feed_immediate
            r43 = 0
            r42 = r12
            boolean r12 = r38.mo15292a(r39, r40, r41, r42, r43)
            if (r12 == 0) goto L_0x0338
            r12 = 1
            if (r2 != r12) goto L_0x02d1
            com.bytedance.ies.abmock.b r38 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FollowFeedPathExperiment> r39 = com.p280ss.android.ugc.aweme.experiment.FollowFeedPathExperiment.class
            r40 = 1
            java.lang.String r41 = "new_follow_feed_path"
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r12.mo15295d()
            boolean r12 = r12.new_follow_feed_path
            r43 = 0
            r42 = r12
            boolean r12 = r38.mo15292a(r39, r40, r41, r42, r43)
            if (r12 == 0) goto L_0x02d1
            com.ss.android.ugc.aweme.feed.api.i r2 = f74320a
            double r14 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75891a()
            if (r3 == 0) goto L_0x0287
            java.lang.String r3 = "enter_auto"
        L_0x0284:
            r17 = r3
            goto L_0x028a
        L_0x0287:
            java.lang.String r3 = ""
            goto L_0x0284
        L_0x028a:
            if (r11 != 0) goto L_0x0291
            java.lang.String r3 = ""
            r18 = r3
            goto L_0x0293
        L_0x0291:
            r18 = r11
        L_0x0293:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
            int r19 = r3.mo59244d()
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136882a()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136884b()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r3)
            java.lang.String r27 = m92741a(r1)
            r3 = r2
            r11 = r14
            r14 = r17
            r15 = r18
            r17 = r0
            r18 = r20
            r20 = r33
            r22 = r25
            r25 = r37
            r26 = r28
            r28 = r29
            r29 = r36
            com.google.common.util.concurrent.l r0 = r3.fetchFollowFeedImmediate(r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0
            goto L_0x0415
        L_0x02d1:
            com.ss.android.ugc.aweme.feed.api.i r12 = f74320a
            double r14 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75891a()
            if (r3 == 0) goto L_0x02de
            java.lang.String r3 = "enter_auto"
        L_0x02db:
            r17 = r3
            goto L_0x02e1
        L_0x02de:
            java.lang.String r3 = ""
            goto L_0x02db
        L_0x02e1:
            if (r11 != 0) goto L_0x02e8
            java.lang.String r3 = ""
            r19 = r3
            goto L_0x02ea
        L_0x02e8:
            r19 = r11
        L_0x02ea:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
            int r18 = r3.mo59244d()
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136882a()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136884b()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            java.lang.String r26 = m92741a(r1)
            r1 = r12
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r12 = r13
            r13 = r17
            r14 = r19
            r15 = r16
            r16 = r0
            r17 = r20
            r19 = r33
            r20 = r21
            r21 = r25
            r24 = r37
            r25 = r28
            r27 = r29
            r28 = r36
            r29 = r30
            r30 = r31
            r31 = r34
            com.google.common.util.concurrent.l r0 = r1.fetchRecommendFeedImmediate(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0
            goto L_0x0415
        L_0x0338:
            r12 = 1
            if (r2 != r12) goto L_0x03b0
            com.bytedance.ies.abmock.b r38 = com.bytedance.ies.abmock.C6384b.m19835a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FollowFeedPathExperiment> r39 = com.p280ss.android.ugc.aweme.experiment.FollowFeedPathExperiment.class
            r40 = 1
            java.lang.String r41 = "new_follow_feed_path"
            com.bytedance.ies.abmock.b r12 = com.bytedance.ies.abmock.C6384b.m19835a()
            com.bytedance.ies.abmock.ABModel r12 = r12.mo15295d()
            boolean r12 = r12.new_follow_feed_path
            r43 = 0
            r42 = r12
            boolean r12 = r38.mo15292a(r39, r40, r41, r42, r43)
            if (r12 == 0) goto L_0x03b0
            com.ss.android.ugc.aweme.feed.api.i r2 = f74320a
            double r14 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75891a()
            if (r3 == 0) goto L_0x0366
            java.lang.String r3 = "enter_auto"
        L_0x0363:
            r17 = r3
            goto L_0x0369
        L_0x0366:
            java.lang.String r3 = ""
            goto L_0x0363
        L_0x0369:
            if (r11 != 0) goto L_0x0370
            java.lang.String r3 = ""
            r18 = r3
            goto L_0x0372
        L_0x0370:
            r18 = r11
        L_0x0372:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
            int r19 = r3.mo59244d()
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136882a()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136884b()
            java.lang.Integer r24 = java.lang.Integer.valueOf(r3)
            java.lang.String r27 = m92741a(r1)
            r3 = r2
            r11 = r14
            r14 = r17
            r15 = r18
            r17 = r0
            r18 = r20
            r20 = r33
            r22 = r25
            r25 = r37
            r26 = r28
            r28 = r29
            r29 = r36
            com.google.common.util.concurrent.l r0 = r3.fetchFollowFeed(r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0
            goto L_0x0415
        L_0x03b0:
            com.ss.android.ugc.aweme.feed.api.i r12 = f74320a
            double r14 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75891a()
            if (r3 == 0) goto L_0x03bd
            java.lang.String r3 = "enter_auto"
        L_0x03ba:
            r17 = r3
            goto L_0x03c0
        L_0x03bd:
            java.lang.String r3 = ""
            goto L_0x03ba
        L_0x03c0:
            if (r11 != 0) goto L_0x03c7
            java.lang.String r3 = ""
            r19 = r3
            goto L_0x03c9
        L_0x03c7:
            r19 = r11
        L_0x03c9:
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()
            int r18 = r3.mo59244d()
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136882a()
            java.lang.Integer r22 = java.lang.Integer.valueOf(r3)
            int r3 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136884b()
            java.lang.Integer r23 = java.lang.Integer.valueOf(r3)
            java.lang.String r26 = m92741a(r1)
            r1 = r12
            r3 = r4
            r5 = r6
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r14
            r12 = r13
            r13 = r17
            r14 = r19
            r15 = r16
            r16 = r0
            r17 = r20
            r19 = r33
            r20 = r21
            r21 = r25
            r24 = r37
            r25 = r28
            r27 = r29
            r28 = r36
            r29 = r30
            r30 = r31
            r31 = r34
            com.google.common.util.concurrent.l r0 = r1.fetchRecommendFeed(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0
        L_0x0415:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.api.FeedApi.m92740a(com.ss.android.ugc.aweme.feed.api.n):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:53|54|(3:57|(1:59)(1:60)|61)|62|63|64|65|66|67) */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0226 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0231 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.feed.model.FeedItemList m92739a(int r33, long r34, long r36, int r38, java.lang.Integer r39, java.lang.String r40, int r41, int r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, long r46, com.p280ss.android.ugc.aweme.feed.cache.C28289e r48) throws java.lang.Exception {
        /*
            r0 = r33
            r12 = r41
            java.lang.String r1 = com.p280ss.android.common.applog.TeaAgent.getServerDeviceId()
            com.p280ss.android.ugc.aweme.feed.api.C28216d.f74332b = r1
            r13 = 1
            r1 = 2
            if (r0 != r1) goto L_0x0038
            com.ss.android.ugc.aweme.feed.api.i r1 = f74320a     // Catch:{ ExecutionException -> 0x0032 }
            com.ss.android.ugc.aweme.antiaddic.lock.b r2 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()     // Catch:{ ExecutionException -> 0x0032 }
            int r11 = r2.mo59244d()     // Catch:{ ExecutionException -> 0x0032 }
            r2 = r33
            r3 = r34
            r5 = r36
            r7 = r38
            r8 = r40
            r9 = r44
            r10 = r45
            com.google.common.util.concurrent.l r0 = r1.fetchTimelineFeed(r2, r3, r5, r7, r8, r9, r10, r11)     // Catch:{ ExecutionException -> 0x0032 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0032 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x0032 }
            goto L_0x0248
        L_0x0032:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p280ss.android.ugc.aweme.app.api.C22838j.m75277a(r0)
            throw r0
        L_0x0038:
            r1 = 7
            if (r0 != r1) goto L_0x0063
            com.ss.android.ugc.aweme.feed.api.i r2 = f74320a     // Catch:{ ExecutionException -> 0x005d }
            com.ss.android.ugc.aweme.antiaddic.lock.b r0 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()     // Catch:{ ExecutionException -> 0x005d }
            int r11 = r0.mo59244d()     // Catch:{ ExecutionException -> 0x005d }
            r3 = r34
            r5 = r36
            r7 = r38
            r8 = r39
            r9 = r40
            r10 = r42
            com.google.common.util.concurrent.l r0 = r2.fetchNearbyFeed(r3, r5, r7, r8, r9, r10, r11)     // Catch:{ ExecutionException -> 0x005d }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x005d }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x005d }
            goto L_0x0248
        L_0x005d:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p280ss.android.ugc.aweme.app.api.C22838j.m75277a(r0)
            throw r0
        L_0x0063:
            r1 = 12
            if (r0 != r1) goto L_0x007f
            com.ss.android.ugc.aweme.feed.api.i r0 = f74320a     // Catch:{ ExecutionException -> 0x0079 }
            r7 = r38
            r1 = r43
            com.google.common.util.concurrent.l r0 = r0.fetchRoamingFeed(r7, r1)     // Catch:{ ExecutionException -> 0x0079 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0079 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x0079 }
            goto L_0x0248
        L_0x0079:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p280ss.android.ugc.aweme.app.api.C22838j.m75277a(r0)
            throw r0
        L_0x007f:
            r7 = r38
            if (r0 == 0) goto L_0x0199
            com.bytedance.ttnet.c.e r28 = new com.bytedance.ttnet.c.e
            r28.<init>()
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FollowFeedPathExperiment> r2 = com.p280ss.android.ugc.aweme.experiment.FollowFeedPathExperiment.class
            r3 = 1
            java.lang.String r4 = "new_follow_feed_path"
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ ExecutionException -> 0x0193 }
            com.bytedance.ies.abmock.ABModel r5 = r5.mo15295d()     // Catch:{ ExecutionException -> 0x0193 }
            boolean r5 = r5.new_follow_feed_path     // Catch:{ ExecutionException -> 0x0193 }
            r6 = 0
            boolean r1 = r1.mo15292a(r2, r3, r4, r5, r6)     // Catch:{ ExecutionException -> 0x0193 }
            r2 = 0
            if (r1 == 0) goto L_0x010d
            com.ss.android.ugc.aweme.feed.api.i r0 = f74320a     // Catch:{ ExecutionException -> 0x0193 }
            double r8 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75891a()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.String r11 = ""
            java.lang.String r13 = ""
            java.lang.String r15 = ""
            com.ss.android.ugc.aweme.antiaddic.lock.b r1 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()     // Catch:{ ExecutionException -> 0x0193 }
            int r16 = r1.mo59244d()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.String r17 = ""
            java.lang.String r18 = com.p280ss.android.ugc.trill.p1762d.C44987a.m141952c()     // Catch:{ ExecutionException -> 0x0193 }
            boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()     // Catch:{ ExecutionException -> 0x0193 }
            if (r1 == 0) goto L_0x00d4
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ ExecutionException -> 0x0193 }
            com.ss.android.ugc.aweme.app.bl r1 = r1.getPersonalizationMode()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Object r1 = r1.mo59877d()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ ExecutionException -> 0x0193 }
            r19 = r1
            goto L_0x00d6
        L_0x00d4:
            r19 = r2
        L_0x00d6:
            int r1 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136882a()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x0193 }
            int r1 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136884b()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x0193 }
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r1 = r34
            r3 = r36
            r5 = r38
            r6 = r39
            r7 = r40
            r10 = r41
            r12 = r13
            r13 = r44
            r14 = r45
            r26 = r28
            com.google.common.util.concurrent.l r0 = r0.fetchFollowFeed(r1, r3, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0193 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x0193 }
            goto L_0x0183
        L_0x010d:
            com.ss.android.ugc.aweme.ai r1 = com.p280ss.android.ugc.aweme.C6903bc.m21478S()     // Catch:{ ExecutionException -> 0x0193 }
            int r1 = r1.mo57884b()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Integer r32 = java.lang.Integer.valueOf(r1)     // Catch:{ ExecutionException -> 0x0193 }
            com.ss.android.ugc.aweme.feed.api.i r1 = f74320a     // Catch:{ ExecutionException -> 0x0193 }
            double r10 = com.p280ss.android.ugc.aweme.audio.AudioUtils.m75891a()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.String r13 = ""
            java.lang.String r14 = ""
            java.lang.String r17 = ""
            com.ss.android.ugc.aweme.antiaddic.lock.b r3 = com.p280ss.android.ugc.aweme.C6903bc.m21484c()     // Catch:{ ExecutionException -> 0x0193 }
            int r18 = r3.mo59244d()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.String r19 = ""
            java.lang.String r20 = com.p280ss.android.ugc.trill.p1762d.C44987a.m141952c()     // Catch:{ ExecutionException -> 0x0193 }
            boolean r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19946v()     // Catch:{ ExecutionException -> 0x0193 }
            if (r3 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()     // Catch:{ ExecutionException -> 0x0193 }
            com.ss.android.ugc.aweme.app.bl r2 = r2.getPersonalizationMode()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Object r2 = r2.mo59877d()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ ExecutionException -> 0x0193 }
        L_0x0147:
            r21 = r2
            int r2 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136882a()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Integer r22 = java.lang.Integer.valueOf(r2)     // Catch:{ ExecutionException -> 0x0193 }
            int r2 = com.p280ss.android.ugc.aweme.utils.permission.C43161e.m136884b()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Integer r23 = java.lang.Integer.valueOf(r2)     // Catch:{ ExecutionException -> 0x0193 }
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r2 = r33
            r3 = r34
            r5 = r36
            r7 = r38
            r8 = r39
            r9 = r40
            r12 = r41
            r15 = r44
            r16 = r45
            com.google.common.util.concurrent.l r0 = r1.fetchRecommendFeed(r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.Object r0 = r0.get()     // Catch:{ ExecutionException -> 0x0193 }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = (com.p280ss.android.ugc.aweme.feed.model.FeedItemList) r0     // Catch:{ ExecutionException -> 0x0193 }
        L_0x0183:
            if (r0 == 0) goto L_0x0192
            com.ss.android.ugc.aweme.feed.ae r1 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()     // Catch:{ ExecutionException -> 0x0193 }
            java.lang.String r2 = r0.getRequestId()     // Catch:{ ExecutionException -> 0x0193 }
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r0.logPb     // Catch:{ ExecutionException -> 0x0193 }
            r1.mo71792a(r2, r3)     // Catch:{ ExecutionException -> 0x0193 }
        L_0x0192:
            return r0
        L_0x0193:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p280ss.android.ugc.aweme.app.api.C22838j.m75277a(r0)
            throw r0
        L_0x0199:
            int r1 = f74323d     // Catch:{ ExecutionException -> 0x028b }
            int r1 = r1 + r13
            f74323d = r1     // Catch:{ ExecutionException -> 0x028b }
            if (r1 != r13) goto L_0x01a2
            r1 = 1
            goto L_0x01a3
        L_0x01a2:
            r1 = 0
        L_0x01a3:
            java.lang.String r2 = ""
            com.ss.android.ugc.aweme.commercialize.symphony.a r3 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80859i()     // Catch:{ Exception -> 0x01b4 }
            android.content.Context r4 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r3 = r3.mo65646a(r4)     // Catch:{ Exception -> 0x01b4 }
            r26 = r3
            goto L_0x01b6
        L_0x01b4:
            r26 = r2
        L_0x01b6:
            com.ss.android.ugc.aweme.feed.api.n r2 = new com.ss.android.ugc.aweme.feed.api.n     // Catch:{ ExecutionException -> 0x028b }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r33)     // Catch:{ ExecutionException -> 0x028b }
            java.lang.Long r16 = java.lang.Long.valueOf(r34)     // Catch:{ ExecutionException -> 0x028b }
            java.lang.Long r17 = java.lang.Long.valueOf(r36)     // Catch:{ ExecutionException -> 0x028b }
            java.lang.Integer r18 = java.lang.Integer.valueOf(r38)     // Catch:{ ExecutionException -> 0x028b }
            java.lang.Integer r21 = java.lang.Integer.valueOf(r41)     // Catch:{ ExecutionException -> 0x028b }
            java.lang.Boolean r25 = java.lang.Boolean.valueOf(r1)     // Catch:{ ExecutionException -> 0x028b }
            r14 = r2
            r19 = r39
            r20 = r40
            r22 = r44
            r23 = r45
            r24 = r48
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ ExecutionException -> 0x028b }
            com.ss.android.ugc.aweme.feed.model.FeedItemList r0 = m92740a(r2)     // Catch:{ ExecutionException -> 0x028b }
            r1 = 4
            if (r12 == r1) goto L_0x01e7
            if (r12 != 0) goto L_0x0217
        L_0x01e7:
            com.ss.android.ugc.aweme.net.o r2 = com.p280ss.android.ugc.aweme.net.C34096o.f88858a     // Catch:{ ExecutionException -> 0x028b }
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ ExecutionException -> 0x028b }
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment> r4 = com.p280ss.android.ugc.aweme.feed.experiment.FeedImmediateExperiment.class
            r5 = 1
            java.lang.String r6 = "is_feed_immediate"
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C6384b.m19835a()     // Catch:{ ExecutionException -> 0x028b }
            com.bytedance.ies.abmock.ABModel r7 = r7.mo15295d()     // Catch:{ ExecutionException -> 0x028b }
            boolean r7 = r7.is_feed_immediate     // Catch:{ ExecutionException -> 0x028b }
            r8 = 0
            r33 = r3
            r34 = r4
            r35 = r5
            r36 = r6
            r37 = r7
            r38 = r8
            boolean r3 = r33.mo15292a(r34, r35, r36, r37, r38)     // Catch:{ ExecutionException -> 0x028b }
            if (r3 == 0) goto L_0x0212
            java.lang.String r3 = "immediate"
            goto L_0x0214
        L_0x0212:
            java.lang.String r3 = "high"
        L_0x0214:
            r2.mo86750a(r3)     // Catch:{ ExecutionException -> 0x028b }
        L_0x0217:
            com.ss.android.ugc.aweme.commercialize.symphony.a r2 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80859i()     // Catch:{ Exception -> 0x0226 }
            android.content.Context r3 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Exception -> 0x0226 }
            java.util.List r4 = r0.getItems()     // Catch:{ Exception -> 0x0226 }
            r2.mo65647a(r3, r4)     // Catch:{ Exception -> 0x0226 }
        L_0x0226:
            java.util.List r2 = r0.getItems()     // Catch:{ Exception -> 0x0231 }
            java.lang.String r3 = r0.getRequestId()     // Catch:{ Exception -> 0x0231 }
            com.p280ss.android.ugc.aweme.feed.C28434i.m93463a(r2, r3)     // Catch:{ Exception -> 0x0231 }
        L_0x0231:
            com.ss.android.ugc.aweme.app.ae r2 = com.p280ss.android.ugc.aweme.app.C22769ae.m75151a()     // Catch:{ ExecutionException -> 0x028b }
            r2.mo59821a(r0)     // Catch:{ ExecutionException -> 0x028b }
            com.ss.android.ugc.aweme.feed.preload.h r2 = com.p280ss.android.ugc.aweme.feed.preload.C28662h.m94303a()     // Catch:{ ExecutionException -> 0x028b }
            com.ss.android.ugc.aweme.feed.preload.e r1 = r2.mo73724a(r1)     // Catch:{ ExecutionException -> 0x028b }
            com.ss.android.ugc.aweme.feed.preload.j r1 = (com.p280ss.android.ugc.aweme.feed.preload.C28666j) r1     // Catch:{ ExecutionException -> 0x028b }
            r1.mo73729a(r0, r12)     // Catch:{ ExecutionException -> 0x028b }
            r1.mo73730b(r0, r12)     // Catch:{ ExecutionException -> 0x028b }
        L_0x0248:
            if (r0 == 0) goto L_0x0260
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r0.preloadAds
            if (r1 == 0) goto L_0x0260
            com.ss.android.ugc.aweme.lego.a$f r1 = com.p280ss.android.ugc.aweme.lego.C7121a.m22248b()
            com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadTask r2 = new com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadTask
            java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> r3 = r0.preloadAds
            r2.<init>(r3)
            com.ss.android.ugc.aweme.lego.a$f r1 = r1.mo18559a(r2)
            r1.mo18560a()
        L_0x0260:
            if (r0 == 0) goto L_0x0272
            com.p280ss.android.ugc.aweme.net.C34093n.m109756a(r13)
            com.ss.android.ugc.aweme.feed.ae r1 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
            java.lang.String r2 = r0.getRequestId()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r3 = r0.logPb
            r1.mo71792a(r2, r3)
        L_0x0272:
            com.ss.android.ugc.aweme.commercialize.api.b r1 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80863m()
            java.lang.String r2 = "feed"
            java.util.List r3 = r0.getItems()
            r1.mo64354a(r2, r3)
            com.ss.android.ugc.aweme.commercialize.feed.af r1 = com.p280ss.android.ugc.aweme.commercialize.C24671f.m80868r()
            java.util.List r2 = r0.getItems()
            r1.mo64682a(r2)
            return r0
        L_0x028b:
            r0 = move-exception
            java.lang.RuntimeException r0 = com.p280ss.android.ugc.aweme.app.api.C22838j.m75277a(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.api.FeedApi.m92739a(int, long, long, int, java.lang.Integer, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, long, com.ss.android.ugc.aweme.feed.cache.e):com.ss.android.ugc.aweme.feed.model.FeedItemList");
    }
}
