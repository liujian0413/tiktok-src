package com.bytedance.android.livesdk.chatroom.interact;

import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.log.C8449h;
import com.bytedance.android.livesdk.p428w.C9178j;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.af */
public final class C4480af {
    /* renamed from: a */
    private static void m14984a(JSONObject jSONObject) throws JSONException {
        jSONObject.put("interact_id", LinkCrossRoomDataHolder.m13782a().f11677o);
        jSONObject.put("channel_id", LinkCrossRoomDataHolder.m13782a().f11665c);
        jSONObject.put("to_uid", LinkCrossRoomDataHolder.m13782a().f11667e);
    }

    /* renamed from: a */
    public static void m14979a(long j, int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", (double) (((float) j) / 1000.0f));
            m14984a(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("type", i);
                jSONObject2.put("vendor", str.toLowerCase());
                m14984a(jSONObject2);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            new C8449h().mo21614a(jSONObject2).mo21617b(jSONObject).mo21615a("hotsoon_live_interact_first_frame_delay");
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: a */
    public static void m14980a(long j, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("lineType", str);
                jSONObject2.put("vendor", str2.toLowerCase());
                m14984a(jSONObject2);
            } catch (JSONException unused) {
                jSONObject2 = null;
            }
            new C8449h().mo21614a(jSONObject2).mo21617b(jSONObject).mo21615a("hotsoon_live_interact_connection_delay");
        } catch (JSONException unused2) {
        }
    }

    /* renamed from: a */
    public static void m14982a(String str, int i, int i2) {
        ((LinkApi) C9178j.m27302j().mo22373b().mo10440a(LinkApi.class)).reportStartLinkStatus(str.toLowerCase(), i, i2).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19280a(C4481ag.f13069a, C4482ah.f13070a);
    }

    /* renamed from: a */
    public static void m14981a(long j, String str, String str2, int i, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("room_id", j);
            jSONObject.put("channel_id", str);
            jSONObject.put("vendor", str2);
            jSONObject.put("type", i);
            jSONObject.put("desc", str3);
            m14984a(jSONObject);
        } catch (JSONException unused) {
        }
        new C8449h().mo21614a(jSONObject).mo21614a(jSONObject).mo21615a("hotsoon_live_interact_exception_track");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x007c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14977a(int r12, int r13, java.lang.Object r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
        /*
            r0 = r12
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "errorCode"
            r3 = r13
            r1.put(r2, r13)     // Catch:{ JSONException -> 0x002d }
            java.lang.String r2 = "errorExtra"
            r4 = r14
            r1.put(r2, r14)     // Catch:{ JSONException -> 0x002e }
            java.lang.String r2 = "roleType"
            r5 = r15
            r1.put(r2, r15)     // Catch:{ JSONException -> 0x002f }
            java.lang.String r2 = "lineType"
            r6 = r16
            r1.put(r2, r6)     // Catch:{ JSONException -> 0x0031 }
            java.lang.String r2 = "vendor"
            java.lang.String r7 = r17.toLowerCase()     // Catch:{ JSONException -> 0x0031 }
            r1.put(r2, r7)     // Catch:{ JSONException -> 0x0031 }
            m14984a(r1)     // Catch:{ JSONException -> 0x0031 }
            goto L_0x0032
        L_0x002c:
            r3 = r13
        L_0x002d:
            r4 = r14
        L_0x002e:
            r5 = r15
        L_0x002f:
            r6 = r16
        L_0x0031:
            r1 = 0
        L_0x0032:
            com.bytedance.android.livesdk.log.h r2 = new com.bytedance.android.livesdk.log.h
            r2.<init>()
            com.bytedance.android.livesdk.log.h r1 = r2.mo21614a(r1)
            java.lang.String r2 = "hotsoon_live_interact_connect_failure_rate"
            r1.mo21616a(r2, r12)
            com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder r1 = com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder.m13782a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r7 = r1.f11677o
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r8 = r1.f11665c
            r7.append(r8)
            java.lang.String r9 = r7.toString()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            long r10 = r1.f11667e
            r7.append(r10)
            java.lang.String r1 = r7.toString()
            if (r0 != 0) goto L_0x007c
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r2
            r7 = r9
            r8 = r1
            com.bytedance.android.livesdk.chatroom.interact.C4484aj.m14991a(r3, r4, r5, r6, r7, r8)
            return
        L_0x007c:
            java.lang.String r4 = r14.toString()
            r3 = r13
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r2
            r10 = r1
            com.bytedance.android.livesdk.chatroom.interact.C4484aj.m14985a(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.interact.C4480af.m14977a(int, int, java.lang.Object, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* renamed from: a */
    public static void m14978a(int i, int i2, Object obj, String str, String str2, String str3, String str4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", i2);
            jSONObject.put("errorExtra", obj);
            jSONObject.put("roleType", str);
            jSONObject.put("lineType", str2);
            jSONObject.put("vendor", str3.toLowerCase());
            jSONObject.put("channelId", str4);
            m14984a(jSONObject);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        new C8449h().mo21614a(jSONObject).mo21616a("hotsoon_live_interact_leave_channel_failure_rate", i);
    }
}
