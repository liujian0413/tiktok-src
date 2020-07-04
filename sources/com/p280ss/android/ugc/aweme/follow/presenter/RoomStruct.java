package com.p280ss.android.ugc.aweme.follow.presenter;

import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p280ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.RoomStruct */
public class RoomStruct extends LiveRoomStruct {
    public static LiveMode getStreamType(LiveRoomStruct liveRoomStruct) {
        if (liveRoomStruct.isScreenshot) {
            return LiveMode.SCREEN_RECORD;
        }
        if (liveRoomStruct.isThirdParty) {
            return LiveMode.THIRD_PARTY;
        }
        if (liveRoomStruct.liveTypeAudio) {
            return LiveMode.AUDIO;
        }
        return LiveMode.VIDEO;
    }

    public static RoomStruct fromAweme(Aweme aweme) {
        UrlModel urlModel;
        RoomStruct roomStruct = new RoomStruct();
        roomStruct.owner = aweme.getAuthor();
        if (roomStruct.owner != null) {
            roomStruct.f75166id = roomStruct.owner.roomId;
        }
        if (aweme.getRoom() != null) {
            roomStruct.f75166id = aweme.getRoom().roomId;
        }
        if (aweme.getAuthor() != null) {
            if (aweme.getAuthor().roomCover != null) {
                urlModel = aweme.getAuthor().roomCover;
            } else {
                urlModel = aweme.getAuthor().getAvatarThumb();
            }
            roomStruct.roomCover = urlModel;
        }
        roomStruct.stream_url = new StreamUrlStruct();
        roomStruct.stream_url.rtmp_pull_url = aweme.getStreamUrlModel().rtmpPullUrl;
        roomStruct.isOfficialType = false;
        roomStruct.isScreenshot = false;
        roomStruct.isThirdParty = false;
        roomStruct.liveTypeAudio = false;
        return roomStruct;
    }
}
