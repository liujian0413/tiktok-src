package com.bytedance.android.livesdkapi.p452h;

import android.os.Bundle;
import com.bytedance.android.livesdkapi.C9469i;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.livesdkapi.h.a */
public final class C9412a {
    /* renamed from: a */
    public static Bundle m27916a(Room room) {
        Bundle bundle = new Bundle();
        if (room != null) {
            bundle.putLong("live.intent.extra.ROOM_ID", room.getId());
            if (!(room.getOwner() == null || room.getOwner().getAvatarThumb() == null)) {
                bundle.putStringArrayList("live.intent.extra.BG_URLS", new ArrayList(room.getOwner().getAvatarThumb().getUrls()));
            }
            bundle.putString("live.intent.extra.REQUEST_ID", room.getRequestId());
            bundle.putString("live.intent.extra.LOG_PB", room.getLog_pb());
            bundle.putString("live.intent.extra.SOURCE_EXTRA", room.getSourceType());
            if (!(C9469i.m27992d() == null || C9469i.m27992d().mo22018d() == null || C9469i.m27992d().mo22018d().getCurrentRoom() == null)) {
                Room currentRoom = C9469i.m27992d().mo22018d().getCurrentRoom();
                bundle.putLong("live.intent.extra.USER_FROM", currentRoom.getUserFrom());
                bundle.putBoolean("live.intent.extra.IS_THIRD_PARTY", currentRoom.isThirdParty);
            }
            bundle.putString("live.intent.extra.ROOM_LABELS", room.getLabels());
            bundle.putString("live.intent.extra.PULL_STREAM_URL", room.buildPullUrl());
            bundle.putString("live.intent.extra.PULL_SDK_PARAMS", room.getSdkParams());
            bundle.putString("live.intent.extra.PULL_STREAM_DATA", room.getMultiStreamData());
            bundle.putString("live.intent.extra.PULL_DEFAULT_RESOLUTION", room.getMultiStreamDefaultQualitySdkKey());
            C9384a aVar = room.getStreamUrlExtraSafely().f25790n;
            if (aVar != null) {
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", aVar.f25798a);
                bundle.putBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", aVar.f25799b);
                bundle.putInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", aVar.f25800c);
            }
            bundle.putInt("live.intent.extra.STREAM_TYPE", room.getStreamType().ordinal());
            bundle.putString("live.intent.extra.PRIVATE_INFO", room.getPrivateInfo());
            bundle.putLong("anchor_id", room.getOwnerUserId());
        }
        return bundle;
    }
}
