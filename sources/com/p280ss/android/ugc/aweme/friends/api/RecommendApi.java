package com.p280ss.android.ugc.aweme.friends.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.friends.model.RecommendList;
import com.p280ss.android.ugc.aweme.friends.model.SuperAccountList;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.friends.api.RecommendApi */
public interface RecommendApi {
    @C7729e
    @C7739o(mo20429a = "/aweme/v2/recommend/dislike/")
    C1592h<BaseResponse> dislikeRecommend(@C7727c(mo20417a = "dislike_type") int i, @C7727c(mo20417a = "object_id") String str);

    @C7730f(mo20420a = "/aweme/v1/recommend/user/dislike/")
    C1592h<BaseResponse> dislikeRecommend(@C7744t(mo20436a = "user_id") String str);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/multi/commit/follow/user/")
    C1592h followUsers(@C7727c(mo20417a = "user_ids") String str, @C7727c(mo20417a = "sec_user_ids") String str2, @C7727c(mo20417a = "type") int i);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/commit/user/extra/")
    C1592h modifyUser(@C7727c(mo20417a = "need_recommend") int i);

    @C7730f(mo20420a = "/aweme/v2/user/recommend/")
    C1592h<RecommendList> recommendList(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "cursor") Integer num2, @C7744t(mo20436a = "target_user_id") String str, @C7744t(mo20436a = "recommend_type") Integer num3, @C7744t(mo20436a = "yellow_point_count") Integer num4, @C7744t(mo20436a = "address_book_access") Integer num5, @C7744t(mo20436a = "rec_impr_users") String str2, @C7744t(mo20436a = "gps_access") Integer num6, @C7744t(mo20436a = "sec_target_user_id") String str3);

    @C7730f(mo20420a = "/aweme/v2/user/recommend/")
    C1592h<RecommendList> recommendList(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "cursor") Integer num2, @C7744t(mo20436a = "target_user_id") String str, @C7744t(mo20436a = "recommend_type") Integer num3, @C7744t(mo20436a = "yellow_point_count") Integer num4, @C7744t(mo20436a = "address_book_access") Integer num5, @C7744t(mo20436a = "rec_impr_users") String str2, @C7744t(mo20436a = "gps_access") Integer num6, @C7744t(mo20436a = "sec_target_user_id") String str3, @C7744t(mo20436a = "show_super_account_when_follow_empty") int i);

    @C7730f(mo20420a = "/aweme/v2/user/recommend/")
    C1592h<RecommendList> recommendList(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "cursor") Integer num2, @C7744t(mo20436a = "target_user_id") String str, @C7744t(mo20436a = "recommend_type") Integer num3, @C7744t(mo20436a = "yellow_point_count") Integer num4, @C7744t(mo20436a = "address_book_access") Integer num5, @C7744t(mo20436a = "rec_impr_users") String str2, @C7744t(mo20436a = "push_user_id") String str3, @C7744t(mo20436a = "gps_access") Integer num6, @C7744t(mo20436a = "sec_target_user_id") String str4, @C7744t(mo20436a = "sec_push_user_id") String str5);

    @C7730f(mo20420a = "/aweme/v1/profile/user/recommend/")
    C1592h<RecommendList> recommendListMT(@C7744t(mo20436a = "count") Integer num, @C7744t(mo20436a = "cursor") Integer num2, @C7744t(mo20436a = "rec_impr_users") String str, @C7744t(mo20436a = "sec_target_user_id") String str2);

    @C7730f(mo20420a = "/aweme/v1/following/page/user/recommend/")
    C1592h<SuperAccountList> recommendSuperAccount();
}
