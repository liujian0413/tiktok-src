package com.bytedance.android.livesdk.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C2370b;
import com.bytedance.android.live.base.model.user.C2371c;
import com.bytedance.android.live.base.model.user.C2374f;
import com.bytedance.android.live.base.model.user.C2378j;
import com.bytedance.android.live.base.model.user.C2380l;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.User.C2366a;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.user.i */
public final class C8990i extends User implements IUser {
    public final boolean childrenManagerForbidCreateLiveRoom() {
        return false;
    }

    public final boolean childrenManagerForbidWalletFunctions() {
        return false;
    }

    public final C2370b getAnchorInfo() {
        return null;
    }

    public final C2371c getAnchorLevel() {
        return null;
    }

    public final ImageModel getAvatarLarge() {
        return null;
    }

    public final ImageModel getAvatarMedium() {
        return null;
    }

    public final ImageModel getAvatarThumb() {
        return null;
    }

    public final String getAvatarUrl() {
        return null;
    }

    public final String getBackgroundImgUrl() {
        return null;
    }

    public final List<ImageModel> getBadgeImageList() {
        return null;
    }

    public final long getBirthday() {
        return 0;
    }

    public final C2374f getBorder() {
        return null;
    }

    public final String getCity() {
        return null;
    }

    public final long getCreateTime() {
        return 0;
    }

    public final int getExperience() {
        return 0;
    }

    public final long getFanTicketCount() {
        return 0;
    }

    public final FollowInfo getFollowInfo() {
        return null;
    }

    public final int getGender() {
        return 0;
    }

    public final long getId() {
        return 0;
    }

    public final int getIncomeSharePercent() {
        return 0;
    }

    public final int getLevel() {
        return 0;
    }

    public final int getLinkMicStats() {
        return 0;
    }

    public final long getLiveRoomId() {
        return 0;
    }

    public final String getLogPb() {
        return null;
    }

    public final ImageModel getMedal() {
        return null;
    }

    public final long getModifyTime() {
        return 0;
    }

    public final List<ImageModel> getNewUserBadges() {
        return null;
    }

    public final String getNickName() {
        return null;
    }

    public final long getPayScores() {
        return 0;
    }

    public final String getRequestId() {
        return null;
    }

    public final String getSecUid() {
        return null;
    }

    public final int getSecret() {
        return 0;
    }

    public final String getShareQrcodeUri() {
        return null;
    }

    public final long getShortId() {
        return 0;
    }

    public final String getSignature() {
        return null;
    }

    public final String getSpecialId() {
        return null;
    }

    public final int getStatus() {
        return 0;
    }

    public final String getTelephone() {
        return null;
    }

    public final List<User> getTopFans() {
        return null;
    }

    public final int getTopVipNo() {
        return 0;
    }

    public final C2378j getUserAttr() {
        return null;
    }

    public final List<ImageModel> getUserBadges() {
        return null;
    }

    public final C2380l getUserHonor() {
        return null;
    }

    public final String getVerifiedReason() {
        return null;
    }

    public final boolean isEnableShowCommerceSale() {
        return false;
    }

    public final boolean isFollowing() {
        return false;
    }

    public final boolean isVerified() {
        return false;
    }

    public final void setAnchorInfo(C2370b bVar) {
    }

    public final void setBadgeImageList(List<ImageModel> list) {
    }

    public final void setExperience(int i) {
    }

    public final void setFollowInfo(FollowInfo followInfo) {
    }

    public final void setFollowStatus(int i) {
    }

    public final void setIncomeSharePercent(int i) {
    }

    public final void setLogPb(String str) {
    }

    public final void setModifyTime(long j) {
    }

    public final void setRequestId(String str) {
    }

    public final void setSecret(int i) {
    }

    public final void setShareQrcodeUri(String str) {
    }

    public final void setStatus(int i) {
    }

    public final void setTelephone(String str) {
    }

    public final void setUserAttr(C2378j jVar) {
    }

    public final C2366a getOwnRoom() {
        return new C2366a();
    }

    public final boolean isWithCommercePermission() {
        return isEnableShowCommerceSale();
    }
}
