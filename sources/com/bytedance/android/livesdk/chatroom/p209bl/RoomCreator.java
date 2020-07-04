package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Message;
import com.bytedance.android.live.api.exceptions.server.ApiServerException;
import com.bytedance.android.livesdkapi.C9392e;
import com.bytedance.android.livesdkapi.C9392e.C9393a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.RoomCreator */
public class RoomCreator implements C9392e, C6310a {
    private static final int MSG_CREATE_ROOM = 1;
    private static final int ROOM_CREATE_ANCHOR_AVATAR_TOO_SMALL = 30011;
    private static final int ROOM_CREATE_ANCHOR_BLOCKED = 30012;
    private static final int ROOM_CREATE_USER_NOT_VERIFIED = 30010;
    private final C9393a mCallback;
    private final C6309f mWeakHandler = new C6309f(this);

    public RoomCreator(C9393a aVar) {
        this.mCallback = aVar;
    }

    public void handleMsg(Message message) {
        if (message.what == 1 && this.mCallback != null) {
            if (message.obj instanceof Exception) {
                Exception exc = (Exception) message.obj;
                if (exc instanceof ApiServerException) {
                    ((ApiServerException) exc).getErrorCode();
                }
                return;
            }
            if (message.obj instanceof Room) {
                Object obj = message.obj;
            }
        }
    }

    public void createRoom(String str, String str2, boolean z) {
        LiveMode liveMode;
        C4275g a = C4275g.m14434a();
        C6309f fVar = this.mWeakHandler;
        if (z) {
            liveMode = LiveMode.AUDIO;
        } else {
            liveMode = LiveMode.VIDEO;
        }
        a.mo10516a(fVar, str, str2, liveMode, -1, 0, false, 1);
    }
}
