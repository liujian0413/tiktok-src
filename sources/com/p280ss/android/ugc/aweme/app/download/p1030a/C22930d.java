package com.p280ss.android.ugc.aweme.app.download.p1030a;

import android.text.TextUtils;
import com.p280ss.android.p848c.p849a.p850a.C19226a;
import com.p280ss.android.p848c.p849a.p850a.C19226a.C19228a;
import com.p280ss.android.p848c.p849a.p850a.C19229b;
import com.p280ss.android.p848c.p849a.p850a.C19229b.C19231a;
import com.p280ss.android.p848c.p849a.p850a.C19232c;
import com.p280ss.android.p848c.p849a.p850a.C19232c.C19234a;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22946e;
import com.p280ss.android.ugc.aweme.app.download.p1032c.C22947f;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.download.a.d */
public final class C22930d {

    /* renamed from: a */
    public String f60681a;

    /* renamed from: b */
    public String f60682b;

    /* renamed from: c */
    public String f60683c;

    /* renamed from: d */
    public String f60684d;

    /* renamed from: e */
    public String f60685e;

    /* renamed from: f */
    public String f60686f;

    /* renamed from: g */
    public JSONObject f60687g;

    /* renamed from: h */
    public boolean f60688h;

    /* renamed from: i */
    public String f60689i;

    /* renamed from: j */
    public boolean f60690j;

    /* renamed from: k */
    public String f60691k;

    /* renamed from: l */
    public int f60692l;

    /* renamed from: m */
    public List<String> f60693m = new LinkedList();

    /* renamed from: n */
    private String f60694n;

    /* renamed from: o */
    private String f60695o;

    /* renamed from: a */
    private String m75473a() {
        if (TextUtils.isEmpty(this.f60694n)) {
            return "";
        }
        return this.f60694n;
    }

    /* renamed from: a */
    public static C19229b m75470a(String str) {
        return new C19231a().mo50978b(str).mo50975a(str).mo50973a(0).mo50976a(true).mo50981c(false).mo50977a();
    }

    /* renamed from: b */
    private static String m75474b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        int lastIndexOf2 = str.lastIndexOf(45);
        int lastIndexOf3 = str.lastIndexOf(".apk");
        int length = str.length();
        if (lastIndexOf2 <= 0 || lastIndexOf >= lastIndexOf2 || lastIndexOf2 >= lastIndexOf3 || lastIndexOf3 >= length) {
            return null;
        }
        return str.substring(lastIndexOf2 + 1, lastIndexOf3);
    }

    /* renamed from: a */
    public static C19232c m75472a(C22930d dVar) {
        long j;
        int i;
        String str;
        long j2 = -1;
        try {
            j = Long.valueOf(dVar.f60681a).longValue();
            try {
                j2 = Long.valueOf(dVar.f60691k).longValue();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = -1;
        }
        boolean equals = "game_room".equals(dVar.f60682b);
        C22946e a = C22947f.m75522a();
        C19234a a2 = new C19234a().mo51025a(dVar.f60688h).mo51019a(j).mo51022a(dVar.f60693m);
        if (equals) {
            i = 2;
        } else {
            i = 0;
        }
        C19234a b = a2.mo51018a(i).mo51021a(dVar.m75473a()).mo51030d(dVar.f60686f).mo51028b(dVar.f60684d).mo51031e(dVar.f60685e).mo51024a(dVar.f60687g).mo51027b(j2);
        if (equals) {
            str = m75474b(dVar.f60686f);
        } else {
            str = null;
        }
        return a.mo59940a(b.mo51033g(str), dVar.f60695o);
    }

    /* renamed from: a */
    public final void mo59921a(JSONObject jSONObject) {
        boolean z;
        Object obj;
        if (jSONObject != null) {
            this.f60681a = jSONObject.optString("id", null);
            this.f60682b = jSONObject.optString("source", null);
            this.f60683c = jSONObject.optString("card_type", null);
            this.f60684d = jSONObject.optString("pkg_name", null);
            this.f60685e = jSONObject.optString("name", null);
            this.f60686f = jSONObject.optString("download_url", null);
            boolean z2 = true;
            if (jSONObject.optInt("is_ad", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.f60688h = z;
            this.f60694n = jSONObject.optString("log_extra", null);
            this.f60689i = jSONObject.optString("event_tag", "game_room_app_ad");
            this.f60687g = jSONObject.optJSONObject("extra");
            if (jSONObject.optInt("support_multiple", 0) != 1) {
                z2 = false;
            }
            this.f60690j = z2;
            this.f60691k = jSONObject.optString("group_id", null);
            this.f60695o = jSONObject.optString("quick_app_url", "");
            this.f60692l = jSONObject.optInt("download_mode", 0);
            JSONArray optJSONArray = jSONObject.optJSONArray("click_track_url_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        obj = optJSONArray.get(i);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    if (obj instanceof String) {
                        this.f60693m.add((String) obj);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C19226a m75469a(boolean z, int i) {
        return new C19228a().mo50938a(0).mo50942b(i).mo50940a(true).mo50944c(z).mo50941a();
    }

    /* renamed from: a */
    public static C19229b m75471a(String str, boolean z) {
        return C22947f.m75522a().mo59939a(new C19231a().mo50975a(str).mo50978b(str).mo50986h("click_start").mo50987i("click_pause").mo50988j("click_continue").mo50989k("click_install").mo50990l("click_open").mo50991m("storage_deny").mo50973a(1).mo50979b(true).mo50981c(false), str);
    }
}
