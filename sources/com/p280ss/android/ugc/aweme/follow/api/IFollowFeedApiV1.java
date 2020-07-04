package com.p280ss.android.ugc.aweme.follow.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1 */
public interface IFollowFeedApiV1 {
    @C7729e
    @C7739o(mo20429a = "/aweme/v1/follow/feed/")
    C18253l<FollowFeedList> getFollowFeedList(@C7727c(mo20417a = "max_cursor") long j, @C7727c(mo20417a = "min_cursor") long j2, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "pull_type") int i2, @C7727c(mo20417a = "feed_style") int i3, @C7727c(mo20417a = "enter_time") long j3, @C7727c(mo20417a = "fetch_recommend") int i4, @C7727c(mo20417a = "impression_ids") String str, @C7727c(mo20417a = "last_feed_ids") String str2, @C7727c(mo20417a = "rec_impr_users") String str3, @C7727c(mo20417a = "is_up_phone") int i5, @C7727c(mo20417a = "is_recommend") int i6, @C7727c(mo20417a = "aweme_id") String str4, @C7727c(mo20417a = "aweme_ids") String str5, @C7727c(mo20417a = "push_params") String str6, @C7727c(mo20417a = "address_book_access") int i7, @C7727c(mo20417a = "gps_access") int i8, @C7727c(mo20417a = "last_follow_uid") String str7, @C7727c(mo20417a = "filter_strategy") int i9, @C7727c(mo20417a = "notice_is_display_live") Integer num, @C7727c(mo20417a = "notice_count_log_id") String str8, @C7727c(mo20417a = "notice_item_count") Integer num2, @C7727c(mo20417a = "notice_live_count") Integer num3, @C7727c(mo20417a = "notice_count_type") Integer num4, @C7727c(mo20417a = "notice_link_author_id") Long l, @C7727c(mo20417a = "notice_link_item_id") Long l2);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/friend/feed/")
    C18253l<FollowFeedList> getFriendList(@C7727c(mo20417a = "max_cursor") long j, @C7727c(mo20417a = "min_cursor") long j2, @C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "pull_type") int i2, @C7727c(mo20417a = "feed_style") int i3, @C7727c(mo20417a = "enter_time") long j3, @C7727c(mo20417a = "fetch_recommend") int i4, @C7727c(mo20417a = "impression_ids") String str, @C7727c(mo20417a = "is_up_phone") int i5, @C7727c(mo20417a = "is_recommend") int i6, @C7727c(mo20417a = "push_params") String str2, @C7727c(mo20417a = "address_book_access") int i7, @C7727c(mo20417a = "gps_access") int i8, @C7727c(mo20417a = "notice_count_log_id") String str3, @C7727c(mo20417a = "notice_item_count") Integer num, @C7727c(mo20417a = "notice_count_type") Integer num2, @C7727c(mo20417a = "notice_link_author_id") Long l, @C7727c(mo20417a = "notice_link_item_id") Long l2);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/follow/feed/recommend/")
    C18253l<FollowFeedList> getRecommendList(@C7727c(mo20417a = "count") int i, @C7727c(mo20417a = "pull_type") int i2, @C7727c(mo20417a = "feed_style") int i3, @C7727c(mo20417a = "enter_time") long j, @C7727c(mo20417a = "impression_ids") String str, @C7727c(mo20417a = "last_feed_ids") String str2);
}
