package com.p280ss.android.ugc.aweme.feed.model.live;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.base.api.C23268a;
import com.p280ss.android.ugc.aweme.base.api.C6891b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct */
public class LiveRoomStruct extends C23268a implements C6866d, Serializable {
    public static final int ROOM_FINISH = 4;
    public static final int ROOM_FINISH_REASON_HUANGFAN = 4;
    public static final int ROOM_FINISH_REASON_KICTOUT = 2;
    public static final int ROOM_FINISH_REASON_KICTOUT_BY_ADMIN = 3;
    public static final int ROOM_FINISH_REASON_MULTI_LOGIN_KICOUT = 8;
    public static final int ROOM_FINISH_REASON_NORMAL = 1;
    public static final int ROOM_FINISH_REASON_PAUSE_PING_TIMEOUT = 7;
    public static final int ROOM_FINISH_REASON_PING_TIMEOUT = 5;
    public static final int ROOM_FINISH_REASON_STREAM_PUSH_FAILED = 6;
    public static final int ROOM_FINISH_REASON_UNKNOWN = 999;
    public static final int ROOM_LONGTIME_NO_NET = 1004;
    public static final int ROOM_PAUSE = 3;
    public static final int ROOM_PLAYING = 2;
    public static final int ROOM_PREPARE = 1;
    @C6593c(mo15949a = "additional_stream_url")
    public StreamUrlStruct additional_stream_url;
    @C6593c(mo15949a = "coins")
    public int coins;
    @C6593c(mo15949a = "create_time")
    public long create_time;
    @C6593c(mo15949a = "digg_count")
    public int digg_count;
    public String errorMsg;
    @C6593c(mo15949a = "finish_time")
    public long finish_time;
    @C6593c(mo15949a = "room_id")

    /* renamed from: id */
    public long f75166id;
    @C6593c(mo15949a = "in_sandbox")
    public boolean inSandbox;
    @C6593c(mo15949a = "live_type_official")
    public boolean isOfficialType;
    @C6593c(mo15949a = "live_type_screenshot")
    public boolean isScreenshot;
    @C6593c(mo15949a = "live_type_third_party")
    public boolean isThirdParty;
    @C6593c(mo15949a = "live_total_time")
    public long liveTotalTime;
    @C6593c(mo15949a = "live_type_audio")
    public boolean liveTypeAudio;
    public String mRequestId;
    public long mUserFrom;
    public String message;
    @C6593c(mo15949a = "new_fans_count")
    public int newFansCount;
    @C6891b
    @C6593c(mo15949a = "owner")
    public User owner;
    public String prompts;
    @C6593c(mo15949a = "activity")
    public RoomBuilding roomActivity;
    @C6593c(mo15949a = "room_cover", mo15950b = {"cover"})
    public UrlModel roomCover;
    public int roomType = 3;
    @C6593c(mo15949a = "room_type_tag")
    public String roomTypeTag;
    @C6593c(mo15949a = "share_info")
    public ShareStruct share_info;
    @C6593c(mo15949a = "status")
    public int status;
    public int status_code;
    public String status_msg;
    @C6593c(mo15949a = "stream_id")
    public long stream_id;
    @C6593c(mo15949a = "stream_url")
    public StreamUrlStruct stream_url;
    @C6593c(mo15949a = "title")
    public String title;
    @C6593c(mo15949a = "total_user_count")
    public int total_user_count;
    public long userId;
    @C6593c(mo15949a = "user_count")
    public int user_count;

    public String getRequestId() {
        return this.mRequestId;
    }

    public String getRoomTypeTag() {
        return this.roomTypeTag;
    }

    public long getUserFrom() {
        return this.mUserFrom;
    }

    public boolean isFinish() {
        if (this.status == 4) {
            return true;
        }
        return false;
    }

    public long getAnchorId() {
        if (this.owner == null || TextUtils.isEmpty(this.owner.getUid())) {
            return 0;
        }
        return Long.parseLong(this.owner.getUid());
    }

    public boolean isPullUrlValid() {
        if (this.stream_url == null || TextUtils.isEmpty(this.stream_url.rtmp_pull_url)) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RoomStruct{mUserFrom=");
        sb.append(this.mUserFrom);
        sb.append(", mRequestId='");
        sb.append(this.mRequestId);
        sb.append('\'');
        sb.append(", id=");
        sb.append(this.f75166id);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", owner=");
        sb.append(this.owner);
        sb.append(", title='");
        sb.append(this.title);
        sb.append('\'');
        sb.append(", user_count=");
        sb.append(this.user_count);
        sb.append(", create_time=");
        sb.append(this.create_time);
        sb.append(", finish_time=");
        sb.append(this.finish_time);
        sb.append(", stream_id=");
        sb.append(this.stream_id);
        sb.append(", stream_url=");
        sb.append(this.stream_url);
        sb.append(", share_info=");
        sb.append(this.share_info);
        sb.append(", digg_count=");
        sb.append(this.digg_count);
        sb.append(", coins=");
        sb.append(this.coins);
        sb.append(", inSandbox=");
        sb.append(this.inSandbox);
        sb.append(", total_user_count=");
        sb.append(this.total_user_count);
        sb.append(", roomActivity=");
        sb.append(this.roomActivity);
        sb.append(", roomCover=");
        sb.append(this.roomCover);
        sb.append(", roomTypeTag=");
        sb.append(this.roomTypeTag);
        sb.append(", errorMsg='");
        sb.append(this.errorMsg);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void setUserFrom(long j) {
        this.mUserFrom = j;
    }

    public static boolean isValid(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct == null || liveRoomStruct.f75166id <= 0 || liveRoomStruct.owner == null) {
            return false;
        }
        return true;
    }
}
