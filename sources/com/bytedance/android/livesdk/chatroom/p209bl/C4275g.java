package com.bytedance.android.livesdk.chatroom.p209bl;

import android.os.Handler;
import android.os.Message;
import com.bytedance.android.live.api.exceptions.local.ResponseNoDataException;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3477b;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.network.response.C3480e;
import com.bytedance.android.live.room.C3494k;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.C4904f;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.rank.C8850l;
import com.bytedance.android.livesdk.utils.C9079q;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p452h.C9426l;
import com.bytedance.ies.util.thread.C11081a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.g */
public final class C4275g implements C3494k {

    /* renamed from: a */
    private static C4275g f12441a = new C4275g();

    /* renamed from: b */
    private boolean f12442b = TTLiveSDKContext.getHostService().mo22367h().mo22182c();

    /* renamed from: a */
    public static C4275g m14434a() {
        return f12441a;
    }

    /* renamed from: a */
    public final void mo10516a(Handler handler, String str, String str2, LiveMode liveMode, int i, long j, boolean z, int i2) {
        m14453a(handler, str, str2, liveMode, i, j, z, 1, 0);
    }

    /* renamed from: a */
    private static void m14453a(Handler handler, String str, String str2, LiveMode liveMode, int i, long j, boolean z, int i2, int i3) {
        HashMap<String, String> hashMap = new C9079q().mo22259a("title", str).mo22259a("cover_uri", str2).mo22259a("game", j != 0 ? String.valueOf(j) : "").mo22259a(C38347c.f99557l, i != -1 ? String.valueOf(i) : "").f24734a;
        hashMap.put("live_agreement", "0");
        if (liveMode == LiveMode.AUDIO) {
            hashMap.put("live_audio", "1");
        } else if (liveMode == LiveMode.THIRD_PARTY) {
            hashMap.put("third_party", "1");
        } else if (liveMode == LiveMode.SCREEN_RECORD) {
            hashMap.put("screen_shot", "1");
        }
        if (z) {
            hashMap.put("has_commerce_goods", "true");
        }
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).createRoom(hashMap).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4286o<Object>(handler, i2), (C7326g<? super Throwable>) new C4295x<Object>(handler, i2));
    }

    /* renamed from: a */
    public final void mo11964a(Handler handler, long j, String str, String str2, String str3, String str4) {
        if ("draw".equals(str2) && "live_detail-hourly_rank".equals(str4)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str2);
            str4 = sb.toString();
        }
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).enterRoom(j, 1, TTLiveSDKContext.getHostService().mo22367h().mo22182c() ? 1 : 0, new C9079q().mo22259a("common_label_list", str3).mo22259a("enter_source", str4).mo22259a("request_id", str).mo22259a("enter_type", str2).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4296y<Object>(this, handler, j), (C7326g<? super Throwable>) new C4297z<Object>(this, handler, j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11963a(Handler handler, long j, C3477b bVar) throws Exception {
        if (handler != null) {
            C4904f fVar = new C4904f();
            fVar.f14022a = (Room) bVar.data;
            if (fVar.f14022a == null || fVar.f14022a.getId() == 0) {
                fVar.f14022a = C9426l.m27948a().mo23121a(j);
            }
            fVar.f14023b = (EnterRoomExtra) bVar.extra;
            if (fVar.f14022a != null) {
                fVar.f14022a.nowTime = ((EnterRoomExtra) bVar.extra).now / 1000;
            }
            this.f12442b = TTLiveSDKContext.getHostService().mo22367h().mo22182c();
            Message obtainMessage = handler.obtainMessage(4);
            obtainMessage.obj = fVar;
            handler.sendMessage(obtainMessage);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11965a(Handler handler, long j, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(4);
            Room a = C9426l.m27948a().mo23121a(j);
            if (!(th instanceof ResponseNoDataException) || a == null) {
                obtainMessage.obj = th;
            } else {
                ResponseNoDataException responseNoDataException = (ResponseNoDataException) th;
                if (responseNoDataException.getResponse() == null || responseNoDataException.getResponse().extra == null || responseNoDataException.getResponse().statusCode != 0) {
                    obtainMessage.obj = th;
                } else {
                    C4904f fVar = new C4904f();
                    C3477b response = responseNoDataException.getResponse();
                    fVar.f14022a = a;
                    fVar.f14023b = (EnterRoomExtra) response.extra;
                    if (fVar.f14022a != null) {
                        fVar.f14022a.nowTime = ((EnterRoomExtra) response.extra).now / 1000;
                    }
                    this.f12442b = TTLiveSDKContext.getHostService().mo22367h().mo22182c();
                    obtainMessage.obj = fVar;
                }
            }
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: a */
    public static void m14450a(Handler handler, long j, long j2, boolean z, int i) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).sendPlayingPing(j, z ? 1 : 0).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4268aa<Object>(handler, 7), (C7326g<? super Throwable>) new C4269ab<Object>(handler, 7));
    }

    /* renamed from: a */
    public static void m14444a(Handler handler, long j, int i, int i2, String str, String str2) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).digg(new C9079q().mo22259a("room_id", String.valueOf(j)).mo22259a("count", String.valueOf(i)).mo22259a("duration", "2000").mo22259a("common_label_list", String.valueOf(str)).mo22259a("icon", str2).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a(C3303k.m12378c(), C3303k.m12377b());
    }

    /* renamed from: a */
    public final void mo11966a(Handler handler, boolean z, long j, int i) {
        mo11967a(handler, z, j, 3, 2);
    }

    /* renamed from: a */
    public final void mo11967a(Handler handler, boolean z, long j, int i, int i2) {
        C11081a a = C11081a.m32463a();
        final boolean z2 = z;
        final long j2 = j;
        final int i3 = i;
        C42761 r1 = new Callable() {
            public final Object call() throws Exception {
                return C4274f.m14431a(z2, j2, i3);
            }
        };
        a.mo27011a(handler, r1, i2);
    }

    /* renamed from: a */
    public final void mo11968a(Handler handler, boolean z, long j, int i, boolean z2, int i2, int i3) {
        C11081a a = C11081a.m32463a();
        final long j2 = j;
        C42772 r1 = new Callable(true, 4, true, 1) {

            /* renamed from: a */
            final /* synthetic */ boolean f12447a;

            public final Object call() throws Exception {
                return C4274f.m14432a(this.f12447a, j2, 4, true, 1);
            }

            {
                this.f12447a = r2;
            }
        };
        Handler handler2 = handler;
        a.mo27011a(handler, r1, 12);
    }

    /* renamed from: a */
    public final void mo10515a(Handler handler, final String str) {
        C11081a.m32463a().mo27011a(handler, new Callable() {
            public final Object call() throws Exception {
                return C4274f.m14433a(str);
            }
        }, 13);
    }

    /* renamed from: a */
    public static void m14448a(Handler handler, long j, long j2, int i, int i2) {
        int i3 = i == 22 ? 1 : i == 23 ? 2 : i;
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getDailyRankContent(new C9079q().mo22259a("anchor_id", String.valueOf(j)).mo22259a("sec_anchor_id", TTLiveSDKContext.getHostService().mo22367h().mo22172a(j)).mo22259a("rank_type", String.valueOf(i3)).mo22259a("room_id", String.valueOf(j2)).mo22259a("hour_info", String.valueOf(i2)).mo22259a("sec_user_id", TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid()).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4279h<Object>(handler, i, i2), (C7326g<? super Throwable>) new C4280i<Object>(handler, i, i2));
    }

    /* renamed from: a */
    public static void m14447a(Handler handler, long j, long j2, int i) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getUserRankContent(j, new C9079q().mo22259a("anchor_id", String.valueOf(j2)).mo22259a("sec_anchor_id", TTLiveSDKContext.getHostService().mo22367h().mo22172a(j2)).mo22259a("room_id", String.valueOf(j)).mo22259a("rank_type", String.valueOf(i)).mo22259a("sec_user_id", TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid()).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4281j<Object>(handler, i), (C7326g<? super Throwable>) new C4282k<Object>(handler, i));
    }

    /* renamed from: a */
    public static void m14445a(Handler handler, long j, int i, long j2) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getPeriodUserRank(new C9079q().mo22259a("anchor_id", String.valueOf(j)).mo22259a("sec_anchor_id", TTLiveSDKContext.getHostService().mo22367h().mo22172a(j)).mo22259a("rank_type", String.valueOf(i)).mo22259a("room_id", String.valueOf(j2)).mo22259a("sec_user_id", TTLiveSDKContext.getHostService().mo22367h().mo22165a().getSecUid()).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4283l<Object>(handler, i), (C7326g<? super Throwable>) new C4284m<Object>(handler, i));
    }

    /* renamed from: a */
    static final /* synthetic */ void m14443a(Handler handler, int i, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(31);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
            C8850l.m26472a(i, th);
        }
    }

    /* renamed from: a */
    public static void m14446a(Handler handler, long j, long j2) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getNobleUserRank(new C9079q().mo22259a("room_id", String.valueOf(j)).mo22259a("rank_type", "21").mo22259a("anchor_id", String.valueOf(j2)).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4285n<Object>(handler), (C7326g<? super Throwable>) new C4287p<Object>(handler));
    }

    /* renamed from: a */
    public final void mo10514a(Handler handler, long j) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).unblockRoom(j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a(C3303k.m12378c(), (C7326g<? super Throwable>) new C4288q<Object>(handler));
    }

    /* renamed from: a */
    public static void m14449a(Handler handler, long j, long j2, String str) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).sendDecorationText(new C9079q().mo22259a("room_id", String.valueOf(j)).mo22259a("user_id", String.valueOf(j2)).mo22259a("deco_text", String.valueOf(str)).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4289r<Object>(handler), (C7326g<? super Throwable>) new C4290s<Object>(handler));
    }

    /* renamed from: a */
    public static void m14452a(Handler handler, Room room) {
        String str = room.isThirdParty ? "1" : room.isScreenshot ? "2" : null;
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getRoomChatGuidance(new C9079q().mo22259a("room_id", String.valueOf(room.getId())).mo22259a("common_label_list", String.valueOf(room.getLabels())).mo22259a("live_type", str).f24734a).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4291t<Object>(handler), (C7326g<? super Throwable>) new C4292u<Object>(handler));
    }

    /* renamed from: a */
    static final /* synthetic */ void m14451a(Handler handler, C3479d dVar) throws Exception {
        if (handler != null) {
            handler.sendMessage(handler.obtainMessage(32));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14454a(Handler handler, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(32);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }

    private C4275g() {
    }

    /* renamed from: a */
    public static C7492s<C3479d<Map<String, Room>>> m14436a(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        if (jArr != null) {
            for (int i = 0; i < jArr.length; i++) {
                sb.append(jArr[i]);
                if (jArr.length - 1 != i) {
                    sb.append(",");
                }
            }
        }
        return ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).getMultipleRoomInfo(sb.toString()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
    }

    /* renamed from: a */
    public static void m14437a(Handler handler) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).finishRoomAbnormal().mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a((C7326g<? super T>) new C4293v<Object>(handler), (C7326g<? super Throwable>) new C4294w<Object>(handler));
    }

    /* renamed from: b */
    static final /* synthetic */ void m14458b(Handler handler, C3479d dVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(30);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: e */
    static final /* synthetic */ void m14466e(Handler handler, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(36);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m14461c(Handler handler, C3479d dVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: d */
    static final /* synthetic */ void m14464d(Handler handler, C3479d dVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(36);
            obtainMessage.obj = dVar;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m14462c(Handler handler, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(26);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: d */
    static final /* synthetic */ void m14465d(Handler handler, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(25);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: b */
    public static void m14457b(Handler handler, long j) {
        ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).leaveRoom(j).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19280a(C3303k.m12378c(), C3303k.m12377b());
    }

    /* renamed from: b */
    static final /* synthetic */ void m14459b(Handler handler, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(30);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: c */
    static final /* synthetic */ void m14460c(Handler handler, int i, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: d */
    static final /* synthetic */ void m14463d(Handler handler, int i, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m14455b(Handler handler, int i, C3477b bVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(24);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
            C8850l.m26470a(i, bVar);
        }
    }

    /* renamed from: b */
    static final /* synthetic */ void m14456b(Handler handler, int i, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(24);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
            C8850l.m26472a(i, th);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14440a(Handler handler, int i, C3477b bVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(31);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
            C8850l.m26470a(i, bVar);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14441a(Handler handler, int i, C3479d dVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = dVar.data;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14442a(Handler handler, int i, C3480e eVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = (Room) eVar.f10307b;
            handler.sendMessage(obtainMessage);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14438a(Handler handler, int i, int i2, C3477b bVar) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = bVar;
            handler.sendMessage(obtainMessage);
            C8850l.m26471a(i, bVar, i2);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m14439a(Handler handler, int i, int i2, Throwable th) throws Exception {
        if (handler != null) {
            Message obtainMessage = handler.obtainMessage(i);
            obtainMessage.obj = th;
            handler.sendMessage(obtainMessage);
            C8850l.m26473a(i, th, i2);
        }
    }

    /* renamed from: a */
    public static C7492s<C3477b<Room, EnterRoomExtra>> m14435a(long j, String str, String str2, String str3, String str4) {
        long j2;
        if ("draw".equals(str2) && "live_detail-hourly_rank".equals(str4)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str4);
            sb.append(str2);
            str4 = sb.toString();
        }
        HashMap<String, String> hashMap = new C9079q().mo22259a("common_label_list", str3).mo22259a("enter_source", str4).mo22259a("request_id", str).mo22259a("enter_type", str2).f24734a;
        if (TTLiveSDKContext.getHostService().mo22367h().mo22182c()) {
            j2 = 1;
        } else {
            j2 = 0;
        }
        return ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).enterRoom(j, 1, j2, hashMap);
    }
}
