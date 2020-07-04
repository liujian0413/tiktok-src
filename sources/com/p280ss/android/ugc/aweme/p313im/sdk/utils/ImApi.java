package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import bolts.C1592h;
import com.bytedance.p263im.core.proto.Request;
import com.bytedance.p263im.core.proto.Response;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.input.gifsearch.p1319c.p1320a.C30857a;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.UploadAuthKeyConfig;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupShareInfo;
import com.p280ss.android.ugc.aweme.p313im.sdk.detail.model.GroupVerifyResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.group.model.C31268a;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.BlockResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31474d;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31476g;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.C31479j;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.GreetEmojiList;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.ShareStateResponse;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerMessageList;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.StrangerSessionList;
import com.p280ss.android.ugc.aweme.p313im.sdk.model.UserStruct;
import com.p280ss.android.ugc.aweme.p313im.sdk.p316h.p1326a.C31329a;
import com.p280ss.android.ugc.aweme.p313im.sdk.relations.model.RelationResponse;
import p346io.reactivex.C7492s;
import retrofit2.p363b.C7725a;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7733i;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7748x;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.ImApi */
public interface ImApi {
    @C7730f(mo20420a = "user/block/")
    C18253l<BlockResponse> block(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "block_type") int i);

    @C7730f(mo20420a = "im/stranger/cell/delete/")
    C18253l<BaseResponse> deleteStrangerCell();

    @C7730f(mo20420a = "im/stranger/msg/delete/")
    C18253l<BaseResponse> deleteStrangerSingleMsg(@C7744t(mo20436a = "to_uid") long j, @C7744t(mo20436a = "client_msg_id") long j2);

    @C7730f(mo20420a = "im/stranger/session/delete/")
    C18253l<BaseResponse> deleteStrangerSingleSession(@C7744t(mo20436a = "to_uid") long j);

    @C7730f(mo20420a = "im/resources/hellosticker/")
    C1592h<GreetEmojiList> fetchGreetEmoji();

    @C7730f(mo20420a = "im/reboot/misc/")
    C7492s<C31474d> fetchMixInit(@C7744t(mo20436a = "r_cell_status") int i, @C7744t(mo20436a = "is_active_x") int i2, @C7744t(mo20436a = "im_token") int i3);

    @C7730f(mo20420a = "im/clist/banner/")
    C1592h<C31476g> fetchSessionListBannerConfig();

    @C7730f(mo20420a = "im/stranger/msg/list/")
    C18253l<StrangerMessageList> fetchStrangerMsgList(@C7744t(mo20436a = "to_uid") long j, @C7744t(mo20436a = "sec_to_uid") String str);

    @C7730f(mo20420a = "im/stranger/session/list/")
    C18253l<StrangerSessionList> fetchStrangerSessionList(@C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") long j2, @C7744t(mo20436a = "is_reset_total_unread_count") boolean z);

    @C7730f(mo20420a = "user/")
    C1592h<UserStruct> fetchUser(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2);

    @C7729e
    @C7739o(mo20429a = "im/user/info/")
    C1592h<C31479j> fetchUserInfo(@C7727c(mo20417a = "sec_user_ids") String str);

    @C7730f(mo20420a = "im/group/share/")
    C1592h<GroupShareInfo> getGroupShareInfo(@C7744t(mo20436a = "share_scene") int i, @C7744t(mo20436a = "share_type") int i2, @C7744t(mo20436a = "group_id") String str);

    @C7730f(mo20420a = "im/spotlight/multi_relation/")
    C1592h<ShareStateResponse> getShareUserCanSendMsg(@C7744t(mo20436a = "to_user_id") String str);

    @C7730f(mo20420a = "spotlight/relation/")
    C18253l<RelationResponse> getSpotlightRelation(@C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "with_fstatus") int i2, @C7744t(mo20436a = "max_time") long j, @C7744t(mo20436a = "min_time") long j2);

    @C7730f(mo20420a = "life/detail/")
    C1592h<C31329a> getStoryDetail(@C7744t(mo20436a = "story_id") String str);

    @C7730f(mo20420a = "im/upload/config/")
    C18253l<UploadAuthKeyConfig> getUploadAuthKeyConfig();

    @C7729e
    @C7739o(mo20429a = "im/group/share/verification/")
    C1592h<GroupVerifyResponse> groupShareVerification(@C7727c(mo20417a = "secret") String str, @C7727c(mo20417a = "secret_type") int i, @C7727c(mo20417a = "group_id") String str2);

    @C7739o
    C7492s<Response> postIMSDK(@C7748x String str, @C7725a Request request, @C7733i(mo20425a = "Content-Type") String str2);

    @C7730f(mo20420a = "aweme/detail/")
    C1592h<C6711m> queryAweme(@C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "origin_type") String str2);

    @C7730f(mo20420a = "user/")
    C18253l<UserStruct> queryUser(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2);

    @C7730f(mo20420a = "im/resources/emoticon/search/")
    C1592h<C30857a> searchEmojis(@C7744t(mo20436a = "keyword") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "source") String str2, @C7744t(mo20436a = "target_uid") String str3);

    @C7730f(mo20420a = "im/follower/search/")
    C7492s<C31268a> searchFollowers(@C7744t(mo20436a = "keyword") String str, @C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "search_source") String str2);

    @C7739o(mo20429a = "im/dr/cell/")
    C1592h<BaseResponse> updateRCellState(@C7744t(mo20436a = "action") int i);
}
