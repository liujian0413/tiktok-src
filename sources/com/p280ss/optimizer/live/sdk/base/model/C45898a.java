package com.p280ss.optimizer.live.sdk.base.model;

import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.optimizer.live.sdk.base.model.a */
public final class C45898a {

    /* renamed from: a */
    public String f117325a;

    /* renamed from: b */
    public int f117326b = C34943c.f91128x;

    /* renamed from: c */
    public boolean f117327c;

    /* renamed from: d */
    public boolean f117328d;

    /* renamed from: e */
    private int f117329e;

    /* renamed from: f */
    private String f117330f;

    /* renamed from: g */
    private JSONObject f117331g;

    /* renamed from: a */
    public final Set<String> mo111179a() {
        HashSet hashSet = new HashSet();
        if (this.f117329e == 0 && this.f117331g != null && this.f117331g.length() > 0) {
            Iterator keys = this.f117331g.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                if (str != null && !str.equals("")) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public final List<String> mo111178a(String str) {
        if (this.f117329e == 0 && this.f117331g != null && this.f117331g.length() > 0) {
            try {
                ArrayList arrayList = new ArrayList();
                if (this.f117331g.has(str)) {
                    JSONArray jSONArray = this.f117331g.getJSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    return arrayList;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public C45898a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f117329e = jSONObject.getInt("StatusCode");
                this.f117330f = jSONObject.getString("StatusMessage");
                if (this.f117329e == 0) {
                    this.f117331g = jSONObject.getJSONObject("IpMap");
                    this.f117325a = jSONObject.getString("Symbol");
                }
                this.f117326b = jSONObject.getInt("DnsTTL");
                this.f117327c = jSONObject.getBoolean("EnableIpSettings");
                this.f117328d = jSONObject.getBoolean("EnablePing");
            } catch (JSONException unused) {
            }
        }
    }
}
