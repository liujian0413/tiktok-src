package com.bytedance.android.livesdk.log.p404a;

import com.bytedance.android.livesdk.gift.model.C8149d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.log.p405b.C8437i;
import com.bytedance.android.livesdk.log.p405b.C8442n;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.log.a.p */
public final class C8425p extends C8410a<C8442n> {
    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo21572a(Map<String, String> map, C8442n nVar) {
        String str;
        String str2;
        String str3;
        String str4;
        long j;
        super.mo21572a(map, nVar);
        if (nVar != null) {
            C8149d dVar = nVar.f23095c;
            Prop prop = nVar.f23096d;
            if (C8437i.f23078b == nVar.f23097e) {
                str = "guest_";
            } else {
                str = "";
            }
            if (dVar != null && dVar.mo21278a()) {
                str2 = "animation_gift";
            } else if (nVar.f23099g == 1) {
                str2 = "single_gift";
            } else if (nVar.f23100h > 1) {
                str2 = "bunching_gift";
            } else {
                str2 = "running_gift";
            }
            if (!map.containsKey("request_page")) {
                map.put("request_page", "normal");
            }
            if (nVar.f23094b > 0) {
                str3 = "prop_type";
            } else {
                str3 = "gift_type";
            }
            if (nVar.f23094b > 0) {
                str4 = "prop_id";
            } else {
                str4 = "gift_id";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            map.put(str3, sb.toString());
            if (nVar.f23094b > 0) {
                j = nVar.f23094b;
            } else {
                j = nVar.f23093a;
            }
            map.put(str4, String.valueOf(j));
            if (nVar.f23094b <= 0) {
                map.put("gift_cnt", String.valueOf(nVar.f23099g));
            } else {
                map.put("prop_cnt", String.valueOf(nVar.f23099g));
            }
            map.put("group_cnt", String.valueOf(nVar.f23100h));
            map.put("combo_cnt", String.valueOf(nVar.f23098f));
            if (C8437i.f23078b == nVar.f23097e) {
                map.put("guest_id", String.valueOf(nVar.f23102j));
            }
            if (nVar.f23094b <= 0 && dVar != null) {
                map.put("money", String.valueOf(nVar.f23099g * dVar.f22235f));
            } else if (!(nVar.f23094b <= 0 || prop == null || dVar == null)) {
                map.put("income", String.valueOf(nVar.f23099g * dVar.f22235f));
                map.put("money", String.valueOf(nVar.f23099g * dVar.f22235f));
            }
            try {
                JSONObject jSONObject = new JSONObject();
                if (nVar.f23094b <= 0) {
                    jSONObject.put(String.valueOf(nVar.f23093a), String.valueOf(nVar.f23099g));
                    map.put("gift_info", jSONObject.toString());
                    return;
                }
                jSONObject.put(String.valueOf(nVar.f23094b), String.valueOf(nVar.f23099g));
                map.put("prop_info", jSONObject.toString());
            } catch (Exception unused) {
            }
        }
    }
}
