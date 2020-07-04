package com.p280ss.ttvideoengine.p1812e;

import android.text.TextUtils;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.h */
public final class C46083h {

    /* renamed from: a */
    public C46084i f117855a;

    /* renamed from: b */
    public List<C46079d> f117856b;

    /* renamed from: c */
    public C46077b f117857c;

    /* renamed from: d */
    public C46084i f117858d;

    /* renamed from: e */
    public int f117859e = 1;

    /* renamed from: f */
    public JSONObject f117860f;

    /* renamed from: g */
    private int f117861g = 1;

    /* renamed from: h */
    private HashMap<String, Resolution> f117862h;

    /* renamed from: a */
    public final String[] mo112232a(Resolution resolution) {
        if (this.f117858d != null) {
            return this.f117858d.mo112254b(resolution, null);
        }
        if (this.f117857c != null) {
            C46076a a = this.f117857c.mo112211a();
            if (a != null) {
                return a.f117771c;
            }
        }
        return new String[0];
    }

    /* renamed from: a */
    public final String[] mo112233a(Resolution resolution, Map<Integer, String> map) {
        if (this.f117858d != null) {
            return this.f117858d.mo112254b(resolution, map);
        }
        if (this.f117857c != null) {
            C46076a a = this.f117857c.mo112211a();
            if (a != null) {
                return a.f117771c;
            }
        }
        return new String[0];
    }

    /* renamed from: e */
    public final String mo112241e() {
        if (this.f117858d != null) {
            return this.f117858d.mo112255c(211);
        }
        return "mp4";
    }

    /* renamed from: f */
    public final String mo112242f() {
        if (this.f117858d != null) {
            return this.f117858d.mo112255c(215);
        }
        return "";
    }

    /* renamed from: g */
    public final Resolution[] mo112243g() {
        if (this.f117858d != null) {
            return this.f117858d.f117886d;
        }
        return new Resolution[0];
    }

    /* renamed from: h */
    public final JSONObject mo112244h() {
        if (this.f117858d != null) {
            return this.f117858d.f117904v;
        }
        return null;
    }

    /* renamed from: d */
    public final String[] mo112240d() {
        if (this.f117858d != null) {
            return this.f117858d.mo112253b();
        }
        return new String[0];
    }

    /* renamed from: b */
    public final boolean mo112236b() {
        if (this.f117858d != null || this.f117857c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final String mo112237c() {
        if (this.f117858d != null) {
            List<C46082g> a = this.f117858d.mo112249a();
            if (!(a == null || a.size() == 0)) {
                for (C46082g b : a) {
                    String b2 = b.mo112220b(5);
                    if (!TextUtils.isEmpty(b2)) {
                        return b2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo112231a() {
        if (this.f117858d == null) {
            return false;
        }
        if (this.f117858d.mo112256d(205).booleanValue() || this.f117858d.mo112256d(207).booleanValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo112228a(C46084i iVar) {
        this.f117858d = iVar;
        mo112229a(this.f117862h);
    }

    /* renamed from: a */
    public final int mo112223a(int i) {
        if (this.f117858d != null) {
            return this.f117858d.mo112245a(i);
        }
        return -1;
    }

    /* renamed from: d */
    public final long mo112239d(int i) {
        if (this.f117858d != null) {
            return this.f117858d.mo112252b(216);
        }
        return 0;
    }

    /* renamed from: b */
    public final String mo112235b(int i) {
        if (this.f117858d != null) {
            return this.f117858d.mo112255c(i);
        }
        return "";
    }

    /* renamed from: c */
    public final boolean mo112238c(int i) {
        if (this.f117858d != null) {
            return this.f117858d.mo112256d(i).booleanValue();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo112229a(HashMap<String, Resolution> hashMap) {
        this.f117862h = hashMap;
        if (this.f117858d != null) {
            this.f117858d.mo112250a(hashMap);
        }
    }

    /* renamed from: a */
    public final void mo112230a(JSONObject jSONObject) throws Throwable {
        if (jSONObject != null) {
            try {
                this.f117860f = new JSONObject(jSONObject.toString());
            } catch (Throwable unused) {
                C46123h.m144545a("VideoModel", "generate mJsonInfo error");
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("video_info");
            if (optJSONObject != null && optJSONObject.length() > 0) {
                this.f117861g = 1;
                this.f117855a = new C46084i();
                this.f117855a.f117885c = this.f117861g;
                this.f117855a.mo112251a(optJSONObject.optJSONObject("data"));
                this.f117858d = this.f117855a;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("video_ad_list");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                this.f117856b = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    try {
                        C46079d dVar = new C46079d();
                        dVar.mo112213a(optJSONArray.getJSONObject(i));
                        this.f117856b.add(dVar);
                    } catch (Exception unused2) {
                    }
                }
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("live_info");
            if (optJSONObject2 != null) {
                this.f117859e = 0;
                this.f117857c = new C46077b();
                this.f117857c.mo112212a(optJSONObject2.optJSONObject("data"));
            }
            JSONArray optJSONArray2 = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray2 != null && optJSONArray2.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID"))) {
                this.f117861g = 2;
                this.f117858d = new C46084i();
                this.f117858d.f117885c = this.f117861g;
                this.f117858d.mo112251a(jSONObject);
            }
            mo112229a(this.f117862h);
        }
    }

    /* renamed from: b */
    public final C46082g mo112234b(Resolution resolution, Map<Integer, String> map) {
        if (this.f117858d != null) {
            return this.f117858d.mo112247a(resolution, map);
        }
        return null;
    }

    /* renamed from: a */
    public final C46082g mo112227a(Resolution resolution, boolean z) {
        if (this.f117858d != null) {
            return mo112225a(resolution, this.f117858d.mo112245a(7), null, true);
        }
        return null;
    }

    /* renamed from: a */
    public final C46082g mo112224a(Resolution resolution, int i, Map<Integer, String> map) {
        if (this.f117858d != null) {
            return this.f117858d.mo112246a(resolution, i, map);
        }
        return null;
    }

    /* renamed from: a */
    public final C46082g mo112226a(Resolution resolution, Map<Integer, String> map, boolean z) {
        if (this.f117858d != null) {
            return mo112225a(resolution, this.f117858d.mo112245a(7), map, true);
        }
        return null;
    }

    /* renamed from: a */
    public final C46082g mo112225a(Resolution resolution, int i, Map<Integer, String> map, boolean z) {
        C46082g a = mo112224a(resolution, i, map);
        if (!z) {
            return a;
        }
        Resolution[] allResolutions = Resolution.getAllResolutions();
        if (allResolutions.length <= 0) {
            return a;
        }
        int length = allResolutions.length - 1;
        if (resolution != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= allResolutions.length) {
                    break;
                } else if (allResolutions[i2].getIndex() == resolution.getIndex()) {
                    length = i2;
                    break;
                } else {
                    i2++;
                }
            }
        }
        int i3 = length;
        while (a == null) {
            a = mo112224a(allResolutions[i3], i, null);
            if (a != null) {
                break;
            }
            i3 = ((i3 + allResolutions.length) - 1) % allResolutions.length;
            if (i3 == length) {
                break;
            }
        }
        return a;
    }
}
