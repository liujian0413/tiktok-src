package com.bytedance.android.live.livepullstream.api;

import android.content.Context;
import android.os.Bundle;
import android.view.TextureView;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.room.C3483b;
import com.bytedance.android.live.room.C3491h;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.p108b.C2260a;
import com.bytedance.android.p108b.C2260a.C2261a;
import com.bytedance.android.p108b.C2262b;

/* renamed from: com.bytedance.android.live.livepullstream.api.b */
public interface C3450b extends C2324b {
    C2260a createRoomPlayer(String str, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context, String str2);

    C2260a createRoomPlayer(String str, String str2, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context);

    C2260a ensureRoomPlayer(long j, String str, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context, String str2);

    C2260a ensureRoomPlayer(long j, String str, String str2, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context);

    C3483b getDnsOptimizer();

    C3491h getLivePlayController();

    C3449a getLivePlayerLog();

    C2262b warmUp(long j, Bundle bundle, Context context);

    C2262b warmUp(Room room, Context context);
}
