package com.p280ss.android.ugc.aweme.friends.api;

import bolts.C1592h;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.friends.invite.ShortenUrlModel;
import com.p280ss.android.ugc.aweme.friends.invite.SmgSettingsModel;
import com.p280ss.android.ugc.aweme.friends.model.Friend;
import com.p280ss.android.ugc.aweme.friends.model.FriendList;
import com.p280ss.android.ugc.aweme.profile.model.User;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.friends.api.FriendApi */
public interface FriendApi {
    @C7730f(mo20420a = "/ug/social/invite/msg/settings/")
    C18253l<SmgSettingsModel> getInviteContactFriendsSettings();

    @C7729e
    @C7739o(mo20429a = "/ug/social/invite/msg/send_msg/")
    C18253l<C30031c> inviteBySms(@C7727c(mo20417a = "user_name") String str, @C7727c(mo20417a = "enter_from") String str2, @C7727c(mo20417a = "mobile_list") String str3);

    @C7729e
    @C7739o(mo20429a = "/aweme/v1/user/contact/invite/")
    C18253l<C30031c> inviteBySmsDouyin(@C7744t(mo20436a = "user_name") String str, @C7727c(mo20417a = "mobile_ids") String str2);

    @C7730f(mo20420a = "/aweme/v1/user/contact/")
    C1592h<FriendList<User>> queryContactsFriends(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "type") int i3);

    @C7730f(mo20420a = "/aweme/v1/user/contact/")
    C1592h<FriendList<User>> queryContactsFriendsCountOnly(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2, @C7744t(mo20436a = "type") int i3, @C7744t(mo20436a = "count_only") int i4);

    @C7730f(mo20420a = "/aweme/v1/user/contact/invite_list/")
    C1592h<FriendList<User>> queryMoreUnregisteredFriends(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

    @C7729e
    @C7739o(mo20429a = "/ug/social/invite/msg/short_url/")
    C18253l<ShortenUrlModel> shortenUrl(@C7727c(mo20417a = "url") String str);

    @C7730f(mo20420a = "/aweme/v1/social/friend/")
    C1592h<FriendList<Friend>> thirdPartFriends(@C7744t(mo20436a = "social") String str, @C7744t(mo20436a = "access_token") String str2, @C7744t(mo20436a = "secret_access_token") String str3);

    @C7730f(mo20420a = "/aweme/v1/social/token_upload/")
    C1592h<Void> uploadAccessToken(@C7744t(mo20436a = "social") String str, @C7744t(mo20436a = "access_token") String str2, @C7744t(mo20436a = "secret_access_token") String str3);
}
