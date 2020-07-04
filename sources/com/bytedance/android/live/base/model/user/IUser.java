package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User.C2366a;
import com.bytedance.android.live.base.model.user.p122a.C2368a;
import com.bytedance.android.live.base.model.user.p122a.C2369b;
import java.util.List;

public interface IUser {

    public enum DataSource {
        Cache,
        Net
    }

    public enum Status {
        Login,
        Logout,
        Update
    }

    boolean childrenManagerForbidCreateLiveRoom();

    boolean childrenManagerForbidWalletFunctions();

    C2370b getAnchorInfo();

    C2368a getAnchorLevel();

    C2372d getAuthenticationInfo();

    ImageModel getAvatarLarge();

    ImageModel getAvatarMedium();

    ImageModel getAvatarThumb();

    String getAvatarUrl();

    String getBackgroundImgUrl();

    List<ImageModel> getBadgeImageList();

    long getBirthday();

    String getCity();

    long getCreateTime();

    int getExperience();

    long getFanTicketCount();

    FollowInfo getFollowInfo();

    int getGender();

    long getId();

    int getIncomeSharePercent();

    int getLevel();

    int getLinkMicStats();

    long getModifyTime();

    List<ImageModel> getNewUserBadges();

    String getNickName();

    C2366a getOwnRoom();

    long getPayScores();

    String getSecUid();

    int getSecret();

    String getShareQrcodeUri();

    long getShortId();

    String getSignature();

    int getStatus();

    String getTelephone();

    List<User> getTopFans();

    int getTopVipNo();

    C2378j getUserAttr();

    List<ImageModel> getUserBadges();

    C2369b getUserHonor();

    String getVerifiedReason();

    boolean isEnableShowCommerceSale();

    boolean isFollowing();

    boolean isVerified();

    void setFollowStatus(int i);
}
