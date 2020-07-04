package com.p280ss.android.ugc.aweme;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.sdk.account.p645a.p646a.C12709d;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.FollowerDetail;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.VideoCover;
import com.p280ss.android.ugc.aweme.user.C42800a;
import java.util.List;
import java.util.Map;
import p346io.reactivex.C7319aa;

/* renamed from: com.ss.android.ugc.aweme.IAccountUserService */
public interface IAccountUserService {
    public static final int USER_INFO_ACCOUNT_LOGIN_IN = 12;
    public static final int USER_INFO_AVATAR_CHANGE = 7;
    public static final int USER_INFO_CHANGE_BANNED = 8;
    public static final int USER_INFO_CHANGE_BY_LOGIN = 1;
    public static final int USER_INFO_CHANGE_BY_LOG_OUT = 3;
    public static final int USER_INFO_CHANGE_BY_SWITCH_ACCOUNT = 2;
    public static final int USER_INFO_CHECK_IN = 11;
    public static final int USER_INFO_NICKNAME_CHANGE = 6;
    public static final int USER_INFO_QUERY_USER_SYNC = 10;
    public static final int USER_INFO_SAVE_USER = 5;
    public static final int USER_INFO_UPDATE_CUR_USER = 4;
    public static final int USER_INFO_USER_LOGIC_DELETE = 9;
    public static final int USER_MODE_CHILDREN = 2;
    public static final int USER_MODE_NORMAL = 1;
    public static final int USER_MODE_UNKNOWN = 0;

    /* renamed from: com.ss.android.ugc.aweme.IAccountUserService$a */
    public interface C6856a {
        void onChanged(int i, User user, User user2, Bundle bundle);
    }

    void accountUserClear();

    void addUserChangeListener(C6856a aVar);

    List<String> allUidList();

    void checkIn();

    void clear(String str);

    void delete(String str, String str2);

    C42800a findSignificanUserInfo(String str);

    boolean getAuthGoods();

    String getAvatarUrl();

    User getCurUser();

    FollowerDetail getCurUserFollowDetail(String str);

    String getCurUserId();

    String getLastUid();

    String getNickName();

    String getPhoneCountryCode();

    String getSessionKey();

    int getVerifyStatus();

    boolean hasCommerceVideoRights();

    boolean hasUpdated();

    void init();

    boolean isChildrenMode();

    boolean isLogin();

    boolean isMe(String str);

    boolean isNewUser();

    boolean isNullUid(String str);

    boolean isOldUser();

    boolean isOnCommerceWhiteList();

    boolean isUserEmpty(User user);

    C7319aa<C12709d> logoutAllBackgroundUser();

    User queryUser(String str, boolean z) throws Exception;

    void queryUser();

    void queryUser(Handler handler);

    void queryUserSync(User user);

    void refreshPassportUserInfo();

    void registerNotice(String str, int i);

    void removeUserChangeListener(C6856a aVar);

    void setCurUser(User user);

    void setUserBanned();

    void setUserLogicDelete(String str);

    void setWithCommerceNewbieTask(boolean z);

    boolean shouldRefresh();

    void syncWeiboBindStatus(Handler handler, boolean z, int i);

    void updateAllowStatus(Handler handler, int i, int i2);

    void updateAvatarUri(Handler handler, String str, int i);

    void updateBirthday(Handler handler, String str, int i, int i2);

    void updateCoverUri(Handler handler, String str, int i, int i2);

    void updateCurAllowStatus(int i);

    void updateCurAvatar(UrlModel urlModel, UrlModel urlModel2, UrlModel urlModel3);

    void updateCurAwemeCount(int i);

    void updateCurBirthday(String str, int i);

    void updateCurCanChangeSchoolInfo(boolean z);

    void updateCurCover(List<UrlModel> list);

    void updateCurDongtaiCount(int i);

    void updateCurFavoritingCount(int i);

    void updateCurFollowerCount(int i);

    void updateCurFollowingCount(int i);

    void updateCurGender(int i, int i2);

    void updateCurHideFollowingFollowerList(int i);

    void updateCurHideSearch(boolean z);

    void updateCurLocation(String str, String str2, String str3, String str4, String str5, boolean z);

    void updateCurNickname(String str);

    void updateCurSchoolInfo(String str, String str2, String str3, int i, int i2);

    void updateCurSecret(boolean z);

    void updateCurSignature(String str);

    void updateCurUser(User user);

    void updateCurUserId(String str);

    void updateCurVideoCover(VideoCover videoCover);

    void updateFbExpireTime();

    void updateGender(Handler handler, Map<String, String> map);

    void updateHasFacebookToken(boolean z);

    void updateHasTwitterToken(boolean z);

    void updateHasYoutubeToken(boolean z);

    void updateId(Handler handler, String str, int i);

    void updateInsId(Handler handler, String str, int i);

    void updateInsId(String str);

    void updateLanguage(Handler handler, String str, int i);

    void updateLeaveTime(long j);

    void updateLocation(Handler handler, Map<String, String> map);

    void updateMinor(boolean z);

    void updateNickName(Handler handler, String str, int i);

    void updateNotifyPrivateAccount(int i);

    void updateSchool(Handler handler, Map<String, String> map);

    void updateSecret(Handler handler, boolean z, int i);

    void updateShieldCommentNotice(int i);

    void updateShieldDiggNotice(int i);

    void updateShieldFollowNotice(int i);

    void updateSignature(Handler handler, String str, int i);

    void updateTwExpireTime();

    void updateUserInfo(Handler handler, Map<String, String> map);

    void updateUserInfo(C12898b bVar);

    void updateVideoCoverUri(Handler handler, String str, String str2, int i, int i2);

    void updateWeiboBindStatus(boolean z);

    void updateWeiboName(String str);

    void updateYoutubeExpireTime();

    void uploadAvatar(Handler handler, String str, int i, String str2, List<C19565e> list);

    void uploadCommerceHeadImage(Handler handler, String str, int i, String str2, String str3);

    void uploadCover(Handler handler, String str, int i, String str2);

    void uploadVideoAvatar(Handler handler, String str, int i, String str2);
}
