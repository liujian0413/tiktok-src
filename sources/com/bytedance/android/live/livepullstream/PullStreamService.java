package com.bytedance.android.live.livepullstream;

import android.content.Context;
import android.os.Bundle;
import android.view.TextureView;
import com.bytedance.android.live.livepullstream.api.C3449a;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.livepullstream.p165a.C3448d;
import com.bytedance.android.live.room.C3481a;
import com.bytedance.android.live.room.C3483b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.chatroom.detail.C4317a;
import com.bytedance.android.livesdk.chatroom.detail.C4337l;
import com.bytedance.android.livesdk.chatroom.detail.RoomPlayer;
import com.bytedance.android.livesdkapi.depend.live.ILivePlayController;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.p108b.C2260a;
import com.bytedance.android.p108b.C2260a.C2261a;
import com.bytedance.android.p108b.C2262b;

public class PullStreamService implements C3450b {
    public PullStreamService() {
        C3596c.m13174a(C3450b.class, this);
    }

    public C3483b getDnsOptimizer() {
        return C3448d.m12769d().mo10424c();
    }

    public C3491h getLivePlayController() {
        return C3448d.m12769d().mo10422a();
    }

    public C3449a getLivePlayerLog() {
        return C3448d.m12769d().mo10423b();
    }

    public C3481a getAudioFocusController(ILivePlayController iLivePlayController) {
        return new C4317a(iLivePlayController);
    }

    public C2262b warmUp(Room room, Context context) {
        return C4337l.m14589a().mo12057a(room, context);
    }

    public C2262b warmUp(long j, Bundle bundle, Context context) {
        return C4337l.m14589a().mo12056a(j, bundle, context);
    }

    public C2260a createRoomPlayer(String str, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context, String str2) {
        RoomPlayer roomPlayer = new RoomPlayer(str, liveMode, aVar, textureView, aVar2, context, str2);
        return roomPlayer;
    }

    public C2260a createRoomPlayer(String str, String str2, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context) {
        RoomPlayer roomPlayer = new RoomPlayer(str, str2, liveMode, aVar, textureView, aVar2, context);
        return roomPlayer;
    }

    public C2260a ensureRoomPlayer(long j, String str, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context, String str2) {
        return C4337l.m14589a().mo12054a(j, str, liveMode, aVar, textureView, aVar2, context, str2);
    }

    public C2260a ensureRoomPlayer(long j, String str, String str2, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context) {
        return C4337l.m14589a().mo12055a(j, str, str2, liveMode, aVar, textureView, aVar2, context);
    }
}
