package com.bytedance.android.livesdk.chatroom.p209bl;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.Barrage;
import com.bytedance.android.livesdk.chatroom.model.ChatResult;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7579l;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;

/* renamed from: com.bytedance.android.livesdk.chatroom.bl.e */
public final class C4273e {
    /* renamed from: a */
    public static final C7492s<C3479d<ChatResult>> m14428a(String str, long j, String str2, String str3, String str4) {
        C7573i.m23587b(str, C38347c.f99553h);
        C7492s<C3479d<ChatResult>> a = ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).sendTextMessage(m14430c(str, j, str2, str3, str4)).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
        C7573i.m23582a((Object) a, "LiveInternalService.inst…Util.rxSchedulerHelper())");
        return a;
    }

    /* renamed from: b */
    public static final C7492s<C3479d<Barrage>> m14429b(String str, long j, String str2, String str3, String str4) {
        C7573i.m23587b(str, C38347c.f99553h);
        C7492s<C3479d<Barrage>> a = ((RoomRetrofitApi) C9178j.m27302j().mo22373b().mo10440a(RoomRetrofitApi.class)).sendBarrage(m14430c(str, j, str2, str3, str4)).mo19293a((C7497x<? super T, ? extends R>) C3303k.m12366a());
        C7573i.m23582a((Object) a, "LiveInternalService.inst…Util.rxSchedulerHelper())");
        return a;
    }

    /* renamed from: c */
    private static final HashMap<String, String> m14430c(String str, long j, String str2, String str3, String str4) {
        boolean z;
        Map a = C7507ae.m23393a(C7579l.m23633a(C38347c.f99553h, str), C7579l.m23633a("room_id", String.valueOf(j)), C7579l.m23633a("request_id", str2), C7579l.m23633a("common_label_list", str3), C7579l.m23633a("enter_source", str4));
        Map linkedHashMap = new LinkedHashMap();
        for (Entry entry : a.entrySet()) {
            if (entry.getValue() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return new HashMap<>(linkedHashMap);
    }
}
