package com.p280ss.android.ugc.aweme.feedback;

import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feedback.g */
public final class C29075g {

    /* renamed from: a */
    public long f76751a;

    /* renamed from: b */
    public long f76752b;

    /* renamed from: c */
    public int f76753c;

    /* renamed from: d */
    public long f76754d;

    /* renamed from: e */
    public String f76755e;

    /* renamed from: f */
    public String f76756f;

    /* renamed from: g */
    public String f76757g;

    /* renamed from: h */
    public int f76758h;

    /* renamed from: i */
    public int f76759i;

    /* renamed from: j */
    public int f76760j;

    /* renamed from: k */
    public String f76761k;

    /* renamed from: l */
    public List<C29077b> f76762l;

    /* renamed from: m */
    public List<C29076a> f76763m;

    /* renamed from: n */
    public boolean f76764n;

    /* renamed from: com.ss.android.ugc.aweme.feedback.g$a */
    class C29076a {

        /* renamed from: a */
        public int f76765a;

        /* renamed from: b */
        public int f76766b;

        /* renamed from: c */
        public String f76767c;

        C29076a(String str, int i, int i2) {
            this.f76765a = i;
            this.f76766b = i2;
            this.f76767c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feedback.g$b */
    public class C29077b {

        /* renamed from: a */
        public int f76769a;

        /* renamed from: b */
        public int f76770b;

        /* renamed from: c */
        public String f76771c;

        /* renamed from: a */
        public final boolean mo74514a() {
            if (this.f76769a >= 0 && this.f76770b >= 0 && !C6319n.m19593a(C29075g.this.f76755e) && this.f76769a + this.f76770b <= C29075g.this.f76755e.length()) {
                return true;
            }
            return false;
        }

        public C29077b() {
        }
    }

    /* renamed from: a */
    public final void mo74512a() {
        if (!C6319n.m19593a(this.f76761k)) {
            try {
                JSONArray jSONArray = new JSONArray(this.f76761k);
                int length = jSONArray.length();
                if (length != 0) {
                    this.f76762l = new ArrayList();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        C29077b bVar = new C29077b();
                        bVar.f76769a = jSONObject.optInt("start", -1);
                        bVar.f76770b = jSONObject.optInt("length", -1);
                        bVar.f76771c = jSONObject.optString("url");
                        if (bVar.mo74514a()) {
                            this.f76762l.add(bVar);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public C29075g(long j) {
        this(j, j, 0);
    }

    /* renamed from: a */
    private List<C29076a> m95412a(String str) {
        if (C6319n.m19593a(str)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = jSONArray.getJSONObject(0);
            this.f76756f = jSONObject.optString("image_url");
            this.f76758h = jSONObject.optInt("image_width", 0);
            this.f76759i = jSONObject.optInt("image_height", 0);
            for (int i = 1; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new C29076a(jSONObject2.optString("image_url"), jSONObject2.optInt("image_width", 0), jSONObject2.optInt("image_height", 0)));
            }
            return arrayList;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final void mo74513a(JSONObject jSONObject) {
        this.f76754d = jSONObject.optLong("pub_date");
        this.f76755e = jSONObject.optString(C38347c.f99553h);
        this.f76756f = jSONObject.optString("image_url");
        this.f76757g = jSONObject.optString("avatar_url");
        this.f76758h = jSONObject.optInt("image_width", 0);
        this.f76759i = jSONObject.optInt("image_height", 0);
        this.f76760j = jSONObject.optInt("type", 0);
        this.f76761k = jSONObject.optString("links");
        if (jSONObject.optInt("multi_image", 0) == 1) {
            this.f76763m = m95412a(jSONObject.optString("image_list"));
        }
    }

    public C29075g(long j, long j2, int i) {
        this.f76751a = j;
        this.f76752b = j2;
        this.f76753c = i;
    }
}
