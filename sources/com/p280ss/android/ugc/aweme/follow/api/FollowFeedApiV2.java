package com.p280ss.android.ugc.aweme.follow.api;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.follow.api.FollowFeedApiV2 */
public interface FollowFeedApiV2 {
    @C7729e
    @C7739o(mo20429a = "/aweme/v2/follow/feed/")
    C18253l<FollowFeedList> getFollowFeedList(@C7727c(mo20417a = "follow_req_index") int i, @C7727c(mo20417a = "cursor") long j, @C7727c(mo20417a = "level") int i2, @C7727c(mo20417a = "count") int i3, @C7727c(mo20417a = "pull_type") int i4, @C7727c(mo20417a = "feed_style") int i5, @C7727c(mo20417a = "enter_time") long j2, @C7727c(mo20417a = "rec_impr_users") String str, @C7727c(mo20417a = "aweme_id") String str2, @C7727c(mo20417a = "aweme_ids") String str3, @C7727c(mo20417a = "push_params") String str4, @C7727c(mo20417a = "impression_ids") String str5, @C7727c(mo20417a = "last_feed_ids") String str6, @C7727c(mo20417a = "gps_access") int i6, @C7727c(mo20417a = "last_follow_uid") String str7, @C7727c(mo20417a = "address_book_access") int i7, @C7727c(mo20417a = "filter_strategy") int i8, @C7727c(mo20417a = "notice_count_log_id") String str8, @C7727c(mo20417a = "notice_item_count") Integer num, @C7727c(mo20417a = "notice_live_count") Integer num2, @C7727c(mo20417a = "notice_count_type") Integer num3, @C7727c(mo20417a = "notice_link_author_id") Long l, @C7727c(mo20417a = "notice_link_item_id") Long l2, @C7727c(mo20417a = "notice_is_display_live") Integer num4);
}
