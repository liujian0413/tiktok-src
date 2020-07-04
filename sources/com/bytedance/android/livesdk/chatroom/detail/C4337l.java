package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.util.C0893e;
import android.text.TextUtils;
import android.view.TextureView;
import com.bytedance.android.live.livepullstream.api.C3450b;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.p108b.C2260a;
import com.bytedance.android.p108b.C2260a.C2261a;
import com.bytedance.android.p108b.C2262b;
import com.bytedance.android.p108b.C2262b.C2263a;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.l */
public class C4337l {

    /* renamed from: c */
    private static volatile C4337l f12638c;

    /* renamed from: a */
    private C0893e<C2262b> f12639a = new C0893e<>();

    /* renamed from: b */
    private Queue<C2262b> f12640b = new LinkedList();

    /* renamed from: b */
    private static boolean m14592b() {
        Boolean bool = (Boolean) LiveSettingKeys.ENABLE_ENTER_ROOM_OPT_REUSE_ROOM_PLAYER.mo10240a();
        if (bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C4337l m14589a() {
        if (f12638c == null) {
            synchronized (C4337l.class) {
                if (f12638c == null) {
                    f12638c = new C4337l();
                }
            }
        }
        return f12638c;
    }

    /* renamed from: a */
    private C2262b m14587a(long j) {
        return (C2262b) this.f12639a.mo3327a(j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo12058a(C2262b bVar) {
        long roomId = bVar.getRoomId();
        bVar.release();
        this.f12639a.mo3336c(roomId);
        this.f12640b.offer(bVar);
    }

    /* renamed from: a */
    public final C2262b mo12057a(Room room, Context context) {
        if (room == null || m14592b()) {
            return null;
        }
        C2262b a = m14587a(room.getId());
        if (a != null) {
            return a;
        }
        return m14588a(room.getId(), context, room.buildPullUrl(), room.getSdkParams(), room.getMultiStreamData(), room.getMultiStreamDefaultQualitySdkKey(), room.getStreamUrlExtraSafely().f25790n, room.getStreamType());
    }

    /* renamed from: a */
    public final C2262b mo12056a(long j, Bundle bundle, Context context) {
        Bundle bundle2 = bundle;
        if (m14592b()) {
            return null;
        }
        C2262b a = m14587a(j);
        if (a != null) {
            return a;
        }
        String string = bundle2.getString("live.intent.extra.PULL_STREAM_URL");
        String string2 = bundle2.getString("live.intent.extra.PULL_STREAM_DATA");
        if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2)) {
            return null;
        }
        String string3 = bundle2.getString("live.intent.extra.PULL_DEFAULT_RESOLUTION");
        LiveMode valueOf = LiveMode.valueOf(bundle2.getInt("live.intent.extra.STREAM_TYPE", 0));
        return m14588a(j, context, string, bundle2.getString("live.intent.extra.PULL_SDK_PARAMS"), string2, string3, new C9384a(bundle2.getBoolean("live.intent.extra.EXTRA_STREAM_SR_ENABLED", false), bundle2.getBoolean("live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS", false), bundle2.getInt("live.intent.extra.EXTRA_STREAM_SR_STRENGTH", 0)), valueOf);
    }

    /* renamed from: a */
    private static void m14590a(C2262b bVar, Context context, TextureView textureView, C2261a aVar) {
        if (bVar != null) {
            bVar.attach(context, textureView, aVar);
        }
    }

    /* renamed from: a */
    private C2262b m14588a(long j, Context context, String str, String str2, String str3, String str4, C9384a aVar, LiveMode liveMode) {
        C2262b a = m14587a(j);
        if (a != null) {
            return a;
        }
        C2262b b = m14591b(j, context, str, str2, str3, str4, aVar, liveMode);
        b.warmUp();
        return b;
    }

    /* renamed from: b */
    private C2262b m14591b(long j, Context context, String str, String str2, String str3, String str4, C9384a aVar, LiveMode liveMode) {
        C2262b bVar;
        C2263a a = C2263a.m9735a(context.getApplicationContext()).mo8041a(str3).mo8043b(str4).mo8045c(str).mo8047d(str2).mo8039a(liveMode).mo8040a(aVar);
        if (this.f12640b.isEmpty()) {
            bVar = null;
        } else {
            bVar = (C2262b) this.f12640b.remove();
        }
        if (bVar == null) {
            bVar = new RoomPlayer2(j, a);
        } else {
            bVar.initialize(j, a);
        }
        this.f12639a.mo3333b(j, bVar);
        return bVar;
    }

    /* renamed from: a */
    public final C2260a mo12054a(long j, String str, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context, String str2) {
        TextureView textureView2 = textureView;
        C2261a aVar3 = aVar2;
        Context context2 = context;
        if (m14592b()) {
            return ((C3450b) C3596c.m13172a(C3450b.class)).createRoomPlayer(str, liveMode, aVar, textureView, aVar2, context, str2);
        }
        C2262b a = m14587a(j);
        if (a != null) {
            a.attach(context2, textureView2, aVar3);
            return a;
        }
        Context context3 = context2;
        C2262b b = m14591b(j, context, str, str2, null, null, aVar, liveMode);
        m14590a(b, context3, textureView2, aVar3);
        return b;
    }

    /* renamed from: a */
    public final C2260a mo12055a(long j, String str, String str2, LiveMode liveMode, C9384a aVar, TextureView textureView, C2261a aVar2, Context context) {
        TextureView textureView2 = textureView;
        C2261a aVar3 = aVar2;
        Context context2 = context;
        if (m14592b()) {
            return ((C3450b) C3596c.m13172a(C3450b.class)).createRoomPlayer(str, str2, liveMode, aVar, textureView, aVar2, context);
        }
        C2262b a = m14587a(j);
        if (a != null) {
            a.attach(context2, textureView2, aVar3);
            return a;
        }
        Context context3 = context2;
        C2262b b = m14591b(j, context, null, null, str, str2, aVar, liveMode);
        m14590a(b, context3, textureView2, aVar3);
        return b;
    }
}
