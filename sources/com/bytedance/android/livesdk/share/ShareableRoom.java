package com.bytedance.android.livesdk.share;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.share.IShareAble.SharePlatform;
import com.bytedance.android.livesdkapi.depend.share.ShareScene;
import com.p280ss.android.common.util.C19290j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

public class ShareableRoom implements IShareAbleRoom {
    private final Room mRoom;

    public int getDefaultTumb() {
        return R.drawable.ccg;
    }

    public ShareScene getShareScene() {
        return ShareScene.LIVE;
    }

    public boolean isWeiBoTopic() {
        return false;
    }

    public boolean needVideoPlayIcon() {
        return true;
    }

    public String getLogPb() {
        return this.mRoom.getLog_pb();
    }

    public String getRequestId() {
        return this.mRoom.getRequestId();
    }

    public long getRoomId() {
        return this.mRoom.getId();
    }

    public String getSourceType() {
        return this.mRoom.getSourceType();
    }

    public long getUserFrom() {
        return this.mRoom.getUserFrom();
    }

    public String getLiveType() {
        if (this.mRoom.isLiveTypeAudio()) {
            return "video_live";
        }
        return "voice_live";
    }

    public String getSSLocalUrl() {
        StringBuilder sb = new StringBuilder("sslocal://room?id=");
        sb.append(this.mRoom.getId());
        return sb.toString();
    }

    public long getUserId() {
        if (this.mRoom.getOwner() != null) {
            return this.mRoom.getOwner().getId();
        }
        return 0;
    }

    public String getShareTargetUrl() {
        C19290j jVar = new C19290j(this.mRoom.getShareUrl());
        jVar.mo51186a("share_way", ((Integer) LiveSettingKeys.VIGO_SHARE_ROOM_DES_TYPE.mo10240a()).intValue());
        return jVar.mo51184a();
    }

    public ShareableRoom(Room room) {
        this.mRoom = room;
    }

    public long getShareGroupId(SharePlatform sharePlatform) {
        return this.mRoom.getId();
    }

    public String getShareThumbUrl(SharePlatform sharePlatform) {
        if (this.mRoom.getOwner() != null) {
            ImageModel avatarMedium = this.mRoom.getOwner().getAvatarMedium();
            if (avatarMedium == null) {
                return "";
            }
            List urls = avatarMedium.getUrls();
            if (urls == null || urls.isEmpty()) {
                return "";
            }
            int size = urls.size();
            for (int i = 0; i < size; i++) {
                if (!TextUtils.isEmpty((CharSequence) urls.get(i))) {
                    return (String) urls.get(i);
                }
            }
        }
        return "";
    }

    public String getShareTitle(SharePlatform sharePlatform) {
        String str;
        if (this.mRoom.getOwner() != null && this.mRoom.getOwner().getId() == TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
            return C3358ac.m12515a((int) R.string.fcq);
        }
        Object[] objArr = new Object[1];
        if (this.mRoom.getOwner() != null) {
            str = this.mRoom.getOwner().getNickName();
        } else {
            str = "";
        }
        objArr[0] = str;
        return C3358ac.m12517a((int) R.string.fcp, objArr);
    }

    public String getShareDesc(SharePlatform sharePlatform) {
        String a = C3358ac.m12515a((int) R.string.fcm);
        if (this.mRoom.getOwner() == null || this.mRoom.getOwner().getId() != TTLiveSDKContext.getHostService().mo22367h().mo22179b()) {
            if (!TextUtils.isEmpty(this.mRoom.getUserShareText())) {
                return this.mRoom.getUserShareText();
            }
            if (((Integer) LiveSettingKeys.VIGO_SHARE_ROOM_DES_TYPE.mo10240a()).intValue() == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(C3358ac.m12517a((int) R.string.fcn, Integer.valueOf(this.mRoom.getUserCount())));
                sb.append(a);
                return sb.toString();
            }
            return C3358ac.m12517a((int) R.string.fcn, Integer.valueOf(this.mRoom.getUserCount()));
        } else if (!TextUtils.isEmpty(this.mRoom.getAnchorShareText())) {
            return this.mRoom.getAnchorShareText();
        } else {
            if (((Integer) LiveSettingKeys.VIGO_SHARE_ROOM_DES_TYPE.mo10240a()).intValue() == 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C3358ac.m12517a((int) R.string.fco, this.mRoom.getOwner().getNickName(), Integer.valueOf(this.mRoom.getUserCount())));
                sb2.append(a);
                return sb2.toString();
            }
            return C3358ac.m12517a((int) R.string.fco, this.mRoom.getOwner().getNickName(), Integer.valueOf(this.mRoom.getUserCount()));
        }
    }
}
