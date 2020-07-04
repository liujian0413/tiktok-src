package com.bytedance.android.live.core.feed;

import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.C3474a;
import com.bytedance.android.live.network.response.C3478c;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import p346io.reactivex.C7492s;

public interface FeedApi {
    @C6457h
    C7492s<C3474a<FeedItem, C2344a>> feed(@C6450ac String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "req_from") String str2);

    @C6457h
    C7492s<C3474a<FeedItem, C2344a>> feed(@C6450ac String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "is_draw") long j2, @C6474y(mo15757a = "draw_room_id") long j3);

    @C6457h
    C7492s<C3474a<FeedItem, C2344a>> feed(@C6450ac String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "is_draw") long j2, @C6474y(mo15757a = "draw_room_id") long j3, @C6474y(mo15757a = "draw_room_owner_id") long j4);

    @C6457h
    C7492s<C3478c<FeedItem>> feedAfter(@C6450ac String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "min_time") long j2, @C6474y(mo15757a = "offset") long j3, @C6474y(mo15757a = "count") long j4, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "hb_info") String str3, @C6474y(mo15757a = "gaid") String str4, @C6474y(mo15757a = "ad_user_agent") String str5);

    @C6457h
    C7492s<C3478c<FeedItem>> feedAfter(@C6450ac String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "offset") long j2, @C6474y(mo15757a = "count") long j3, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "diff_stream") Integer num, @C6474y(mo15757a = "hb_info") String str3, @C6474y(mo15757a = "gaid") String str4, @C6474y(mo15757a = "ad_user_agent") String str5);

    @C6457h
    C7492s<C3478c<FeedItem>> feedAfter(@C6450ac String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "offset") long j2, @C6474y(mo15757a = "count") long j3, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "hb_info") String str3, @C6474y(mo15757a = "gaid") String str4, @C6474y(mo15757a = "ad_user_agent") String str5);

    @C6457h
    C7492s<C3478c<FeedItem>> feedInitial(@C6450ac String str, @C6474y(mo15757a = "min_time") long j, @C6474y(mo15757a = "offset") long j2, @C6474y(mo15757a = "count") long j3, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "push_item_id") long j4, @C6474y(mo15757a = "hb_info") String str3, @C6474y(mo15757a = "gaid") String str4, @C6474y(mo15757a = "ad_user_agent") String str5);

    @C6457h
    C7492s<C3478c<FeedItem>> feedInitial(@C6450ac String str, @C6474y(mo15757a = "min_time") long j, @C6474y(mo15757a = "offset") long j2, @C6474y(mo15757a = "count") long j3, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "diff_stream") Integer num, @C6474y(mo15757a = "hb_info") String str3, @C6474y(mo15757a = "gaid") String str4, @C6474y(mo15757a = "ad_user_agent") String str5);

    @C6457h
    C7492s<C3474a<FeedItem, C2344a>> newFeed(@C6450ac String str, @C6474y(mo15757a = "max_time") long j, @C6474y(mo15757a = "req_from") String str2, @C6474y(mo15757a = "offset") long j2);
}
