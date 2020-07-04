package com.bytedance.android.livesdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.p404a.C8416g;
import com.bytedance.android.livesdk.log.p404a.C8420k;
import com.bytedance.android.livesdk.log.p404a.C8423n;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.utils.ab */
public final class C9032ab {

    /* renamed from: a */
    private Context f24696a;

    /* renamed from: b */
    private Room f24697b;

    /* renamed from: c */
    private long f24698c;

    /* renamed from: d */
    private boolean f24699d;

    /* renamed from: a */
    public final void mo22230a() {
        C8448g.m25682a(this.f24696a);
    }

    /* renamed from: a */
    public static void m26984a(String str) {
        C8416g a = C8443c.m25663a().mo21605a(C8438j.class);
        HashMap hashMap = new HashMap();
        hashMap.put("to_user_id", str);
        if (a instanceof C8420k) {
            C8420k kVar = (C8420k) a;
            if (kVar.mo21568a().containsKey("enter_from_merge")) {
                hashMap.put("enter_from_merge", (String) kVar.mo21568a().get("enter_from_merge"));
            }
            if (kVar.mo21568a().containsKey("enter_method")) {
                hashMap.put("enter_method", (String) kVar.mo21568a().get("enter_method"));
            }
            if (kVar.mo21568a().containsKey("action_type")) {
                hashMap.put("action_type", kVar.mo21568a().get("action_type"));
            }
            if (kVar.mo21568a().containsKey("video_id")) {
                hashMap.put("video_id", kVar.mo21568a().get("video_id"));
            }
        }
        C8416g a2 = C8443c.m25663a().mo21605a(Room.class);
        if (a2 instanceof C8423n) {
            C8423n nVar = (C8423n) a2;
            if (nVar.mo21568a().containsKey("anchor_id")) {
                hashMap.put("anchor_id", (String) nVar.mo21568a().get("anchor_id"));
            }
            if (nVar.mo21568a().containsKey("room_id")) {
                hashMap.put("room_id", (String) nVar.mo21568a().get("room_id"));
            }
            if (nVar.mo21568a().containsKey("log_pb")) {
                hashMap.put("log_pb", (String) nVar.mo21568a().get("log_pb"));
            }
            if (nVar.mo21568a().containsKey("request_id")) {
                hashMap.put("request_id", (String) nVar.mo21568a().get("request_id"));
            }
        }
        C8443c.m25663a().mo21606a("livesdk_enter_personal_detail", hashMap, new Object[0]);
    }

    /* renamed from: a */
    public final void mo22232a(String str, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rid", this.f24697b.getId());
            jSONObject.put("request_id", this.f24697b.getRequestId());
            jSONObject.put("log_pb", this.f24697b.getLog_pb());
        } catch (Exception unused) {
        }
    }

    public C9032ab(Context context, Room room, long j) {
        this.f24696a = context;
        this.f24697b = room;
        this.f24698c = j;
    }

    /* renamed from: a */
    public final void mo22231a(long j, boolean z, boolean z2, boolean z3) {
        if (!this.f24699d) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("rid", this.f24697b.getId());
                jSONObject.put("source", this.f24697b.getUserFrom());
                if (z) {
                    if (z3) {
                        C8448g.m25682a(this.f24696a);
                    } else {
                        C8448g.m25682a(this.f24696a);
                    }
                } else if (z3) {
                    C8448g.m25682a(this.f24696a);
                } else if (z2) {
                    C8448g.m25682a(this.f24696a);
                } else {
                    C8448g.m25682a(this.f24696a);
                }
                this.f24699d = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo22233a(boolean z, long j, String str, boolean z2, int i, String str2, boolean z3) {
        String str3;
        C8431c cVar = new C8431c("", this.f24698c);
        if (z3) {
            cVar.f23052d = "right_anchor";
        }
        if (TextUtils.isEmpty(str)) {
            str = null;
        } else if (str.equals("guest_connection") || str.equals("guest_contribution_list") || str.equals("guest_waiting_list")) {
            cVar.f23052d = str;
        }
        if (z2) {
            if (z3) {
                cVar.f23049a = "anchor_c_anchor";
            } else {
                cVar.f23049a = "live_anchor_c_audience";
                if (cVar.f23052d == null) {
                    str = "live_anchor_c_audience";
                }
            }
            if (TextUtils.isEmpty(str)) {
                cVar.f23049a = "live_anchor_c_audience";
            }
        } else if (i != 1) {
            cVar.f23049a = "live_audience_c_anchor";
        } else {
            if (z3) {
                cVar.f23049a = "audience_c_anchor";
                if (cVar.f23052d == null) {
                    str = "audience_c_anchor";
                }
            } else {
                cVar.f23049a = "live_audience_c_audience";
                if (cVar.f23052d == null) {
                    str = "live_audience_c_audience";
                }
            }
            if (TextUtils.isEmpty(str)) {
                cVar.f23049a = "live_audience_c_audience";
            }
        }
        cVar.f23053e = z;
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("growth_deepevent", "1");
        }
        C8443c a = C8443c.m25663a();
        if (z) {
            str3 = "follow";
        } else {
            str3 = "unfollow";
        }
        a.mo21606a(str3, hashMap, cVar, new C8438j().mo21599b("live_interact").mo21598a("live_detail"), Room.class);
    }
}
