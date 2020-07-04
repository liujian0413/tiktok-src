package com.bytedance.android.live.broadcast.effect.sticker;

import com.bytedance.android.live.broadcast.p132c.C2515f;
import com.bytedance.android.live.core.p148d.C3171d;
import com.bytedance.android.live.core.p148d.C3172e;
import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.live.room.C3495l;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.utils.p426b.C9057b;
import com.bytedance.android.livesdk.utils.p426b.C9058c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p346io.reactivex.C7494t;
import p346io.reactivex.C7497x;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.n */
public final class C2673n {
    /* renamed from: a */
    public static void m10880a(long j) {
        Room currentRoom = ((C3495l) C3596c.m13172a(C3495l.class)).getCurrentRoom();
        List<C8149d> stickerGifts = ((IGiftService) C3596c.m13172a(IGiftService.class)).getStickerGifts();
        if (stickerGifts.size() != 0) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            boolean z = true;
            HashMap hashMap = new HashMap();
            for (C8149d dVar : stickerGifts) {
                sb2.append(dVar.f22233d);
                sb2.append(",");
                if (((IGiftService) C3596c.m13172a(IGiftService.class)).getAssets("effects", dVar.f22247r) != null) {
                    sb3.append(dVar.f22233d);
                    sb3.append(",");
                }
                if (((IGiftService) C3596c.m13172a(IGiftService.class)).isAssetsDownloaded("effects", dVar.f22247r)) {
                    if (z) {
                        sb.append(dVar.f22233d);
                        z = false;
                    } else {
                        sb.append(",");
                        sb.append(dVar.f22233d);
                    }
                }
            }
            hashMap.put("download_sticker_id", sb.toString());
            hashMap.put("all_sticker_id", sb2.toString());
            hashMap.put("asset_sticker_id", sb3.toString());
            hashMap.put("room_id", Long.valueOf(j));
            if (currentRoom != null) {
                hashMap.put("anchor_id", Long.valueOf(currentRoom.getOwnerUserId()));
                hashMap.put("live_type", Integer.valueOf(currentRoom.getOrientation()));
            }
            C3172e.m12001a(C3171d.m11992a("service_sticker_gift_status"), 0, (Map<String, Object>) hashMap);
            ((C9057b) C2515f.m10417f().mo9076c().mo9176k().reportFaceGift(j, sb.toString()).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a()).mo19297a((C7494t<T, ? extends R>) C9058c.m27059a())).mo22249a(3).mo19280a((C7326g<? super T>) new C2674o<Object>(j, currentRoom), (C7326g<? super Throwable>) new C2675p<Object>(j, currentRoom));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m10882a(long j, Room room, Throwable th) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", Long.valueOf(j));
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
        }
        C3172e.m12001a(C3171d.m11992a("service_sticker_report_status"), 1, (Map<String, Object>) hashMap);
    }

    /* renamed from: a */
    static final /* synthetic */ void m10881a(long j, Room room, C3479d dVar) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        String str2 = "response";
        if (dVar != null) {
            str = dVar.toString();
        } else {
            str = "no response";
        }
        hashMap.put(str2, str);
        hashMap.put("room_id", Long.valueOf(j));
        if (room != null) {
            hashMap.put("anchor_id", Long.valueOf(room.getOwnerUserId()));
            hashMap.put("live_type", Integer.valueOf(room.getOrientation()));
        }
        C3172e.m12001a(C3171d.m11992a("service_sticker_report_status"), 0, (Map<String, Object>) hashMap);
    }
}
