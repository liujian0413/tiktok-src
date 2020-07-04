package com.p280ss.ttvideoengine.p1812e;

import android.text.TextUtils;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.i */
public final class C46084i {

    /* renamed from: a */
    public static int f117863a = 0;

    /* renamed from: b */
    public static int f117864b = 1;

    /* renamed from: A */
    private String f117865A = "";

    /* renamed from: B */
    private boolean f117866B = false;

    /* renamed from: C */
    private boolean f117867C = false;

    /* renamed from: D */
    private boolean f117868D = false;

    /* renamed from: E */
    private boolean f117869E = false;

    /* renamed from: F */
    private boolean f117870F = false;

    /* renamed from: G */
    private HashMap<String, Resolution> f117871G = C46122g.m144528a();

    /* renamed from: H */
    private HashMap<String, Resolution> f117872H = C46122g.m144532b();

    /* renamed from: I */
    private long f117873I;

    /* renamed from: J */
    private String f117874J;

    /* renamed from: K */
    private List<C46082g> f117875K = null;

    /* renamed from: L */
    private int f117876L;

    /* renamed from: M */
    private int f117877M;

    /* renamed from: N */
    private String f117878N;

    /* renamed from: O */
    private String f117879O;

    /* renamed from: P */
    private int f117880P = f117863a;

    /* renamed from: Q */
    private C46085j f117881Q;

    /* renamed from: R */
    private C46080e f117882R;

    /* renamed from: S */
    private List<C46086k> f117883S;

    /* renamed from: T */
    private int f117884T;

    /* renamed from: c */
    public int f117885c = 1;

    /* renamed from: d */
    public Resolution[] f117886d;

    /* renamed from: e */
    public String f117887e;

    /* renamed from: f */
    public String f117888f;

    /* renamed from: g */
    public String f117889g;

    /* renamed from: h */
    public String f117890h;

    /* renamed from: i */
    public boolean f117891i;

    /* renamed from: j */
    public String f117892j;

    /* renamed from: k */
    public List<C46082g> f117893k;

    /* renamed from: l */
    public List<C46082g> f117894l;

    /* renamed from: m */
    public String f117895m;

    /* renamed from: n */
    public String f117896n;

    /* renamed from: o */
    public String[] f117897o;

    /* renamed from: p */
    public int f117898p;

    /* renamed from: q */
    public int f117899q;

    /* renamed from: r */
    public C46085j f117900r;

    /* renamed from: s */
    public List<C46086k> f117901s;

    /* renamed from: t */
    public String f117902t;

    /* renamed from: u */
    public int f117903u = f117863a;

    /* renamed from: v */
    public JSONObject f117904v;

    /* renamed from: w */
    private ArrayList<Resolution> f117905w = new ArrayList<>();

    /* renamed from: x */
    private String[] f117906x = null;

    /* renamed from: y */
    private String f117907y = "";

    /* renamed from: z */
    private String f117908z = "mp4";

    /* renamed from: a */
    public final void mo112251a(JSONObject jSONObject) throws Throwable {
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("PlayInfoList");
            if ((optJSONArray != null && optJSONArray.length() > 0) || !TextUtils.isEmpty(jSONObject.optString("VideoID"))) {
                this.f117885c = 2;
            } else if (!TextUtils.isEmpty(jSONObject.optString("video_id"))) {
                this.f117885c = 1;
            }
            int i = 0;
            if (this.f117885c == 1) {
                JSONObject optJSONObject = jSONObject.optJSONObject("video_list");
                this.f117899q = jSONObject.optInt("video_duration");
                this.f117898p = jSONObject.optInt("status");
                this.f117889g = jSONObject.optString("validate");
                this.f117890h = jSONObject.optString("auto_definition");
                this.f117891i = jSONObject.optBoolean("enable_ssl");
                this.f117887e = jSONObject.optString("user_id");
                this.f117888f = jSONObject.optString("video_id");
                this.f117892j = jSONObject.optString("video_name");
                this.f117902t = jSONObject.optString("media_type");
                if (this.f117902t.equals("video")) {
                    this.f117903u = f117863a;
                } else if (this.f117902t.equals("audio")) {
                    this.f117903u = f117864b;
                }
                if (optJSONObject != null) {
                    try {
                        this.f117893k = new ArrayList();
                        if (optJSONObject.has("video_1")) {
                            C46082g a = m144423a(optJSONObject.getJSONObject("video_1"), this.f117903u);
                            a.f117851w = this.f117899q;
                            this.f117893k.add(a);
                        }
                        if (optJSONObject.has("video_2")) {
                            C46082g a2 = m144423a(optJSONObject.getJSONObject("video_2"), this.f117903u);
                            a2.f117851w = this.f117899q;
                            this.f117893k.add(a2);
                        }
                        if (optJSONObject.has("video_3")) {
                            C46082g a3 = m144423a(optJSONObject.getJSONObject("video_3"), this.f117903u);
                            a3.f117851w = this.f117899q;
                            this.f117893k.add(a3);
                        }
                        if (optJSONObject.has("video_4")) {
                            C46082g a4 = m144423a(optJSONObject.getJSONObject("video_4"), this.f117903u);
                            a4.f117851w = this.f117899q;
                            this.f117893k.add(a4);
                        }
                        if (optJSONObject.has("video_5")) {
                            C46082g a5 = m144423a(optJSONObject.getJSONObject("video_5"), this.f117903u);
                            a5.f117851w = this.f117899q;
                            this.f117893k.add(a5);
                        }
                        if (optJSONObject.has("video_6")) {
                            C46082g a6 = m144423a(optJSONObject.getJSONObject("video_6"), this.f117903u);
                            a6.f117851w = this.f117899q;
                            this.f117893k.add(a6);
                        }
                        if (optJSONObject.has("video_7")) {
                            C46082g a7 = m144423a(optJSONObject.getJSONObject("video_7"), this.f117903u);
                            a7.f117851w = this.f117899q;
                            this.f117893k.add(a7);
                        }
                        if (optJSONObject.has("video_8")) {
                            C46082g a8 = m144423a(optJSONObject.getJSONObject("video_8"), this.f117903u);
                            a8.f117851w = this.f117899q;
                            this.f117893k.add(a8);
                        }
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e3) {
                        throw e3;
                    } catch (JSONException e4) {
                        throw e4;
                    }
                }
                this.f117904v = jSONObject.optJSONObject("dns_info");
                this.f117873I = jSONObject.optLong("dns_time");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("dynamic_video");
                if (optJSONObject2 != null) {
                    String optString = optJSONObject2.optString("main_url");
                    if (!TextUtils.isEmpty(optString)) {
                        this.f117895m = C46122g.m144525a(optString);
                    }
                    String optString2 = optJSONObject2.optString("backup_url_1");
                    if (!TextUtils.isEmpty(optString2)) {
                        this.f117896n = C46122g.m144525a(optString2);
                    }
                    this.f117907y = optJSONObject2.optString("dynamic_type");
                    this.f117894l = new ArrayList();
                    JSONArray optJSONArray2 = optJSONObject2.optJSONArray("dynamic_video_list");
                    if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            this.f117894l.add(m144423a(optJSONArray2.getJSONObject(i2), f117863a));
                        }
                    }
                    JSONArray optJSONArray3 = optJSONObject2.optJSONArray("dynamic_audio_list");
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                            this.f117894l.add(m144423a(optJSONArray3.getJSONObject(i3), f117864b));
                        }
                    }
                    if (this.f117894l.size() > 0) {
                        ArrayList arrayList = new ArrayList();
                        if (!TextUtils.isEmpty(this.f117895m)) {
                            arrayList.add(this.f117895m);
                        }
                        if (!TextUtils.isEmpty(this.f117896n)) {
                            arrayList.add(this.f117896n);
                        }
                        this.f117897o = new String[arrayList.size()];
                        arrayList.toArray(this.f117897o);
                    }
                }
                if (jSONObject.has("seek_ts")) {
                    this.f117900r = new C46085j();
                    this.f117900r.mo112257a(jSONObject.getJSONObject("seek_ts"));
                }
                if (jSONObject.has("big_thumbs")) {
                    JSONArray optJSONArray4 = jSONObject.optJSONArray("big_thumbs");
                    if (optJSONArray4 != null && optJSONArray4.length() > 0) {
                        this.f117901s = new ArrayList();
                        while (i < optJSONArray4.length()) {
                            C46086k kVar = new C46086k();
                            kVar.f117924k = this.f117885c;
                            kVar.mo112258a(optJSONArray4.getJSONObject(i));
                            this.f117901s.add(kVar);
                            i++;
                        }
                    }
                }
            } else if (this.f117885c == 2) {
                try {
                    this.f117876L = jSONObject.optInt("Status");
                    this.f117874J = jSONObject.optString("VideoID");
                    this.f117878N = jSONObject.optString("CoverUrl");
                    this.f117877M = jSONObject.optInt("Duration");
                    this.f117879O = jSONObject.optString("MediaType");
                    this.f117884T = jSONObject.optInt("TotalCount");
                    if (this.f117879O.equals("video")) {
                        this.f117880P = f117863a;
                    } else if (this.f117879O.equals("audio")) {
                        this.f117880P = f117864b;
                    }
                    if (jSONObject.has("Seekts")) {
                        this.f117881Q = new C46085j();
                        this.f117881Q.mo112257a(jSONObject.getJSONObject("Seekts"));
                    }
                    if (jSONObject.has("BigThumbs")) {
                        JSONArray optJSONArray5 = jSONObject.optJSONArray("BigThumbs");
                        if (optJSONArray5 != null && optJSONArray5.length() > 0) {
                            this.f117883S = new ArrayList();
                            for (int i4 = 0; i4 < optJSONArray5.length(); i4++) {
                                try {
                                    C46086k kVar2 = new C46086k();
                                    kVar2.f117924k = this.f117885c;
                                    kVar2.mo112258a(optJSONArray5.getJSONObject(i4));
                                    this.f117883S.add(kVar2);
                                } catch (Exception unused) {
                                }
                            }
                        }
                    }
                    if (optJSONArray != null) {
                        if (optJSONArray.length() > 0) {
                            this.f117875K = new ArrayList();
                            while (i < optJSONArray.length()) {
                                this.f117875K.add(m144423a(optJSONArray.getJSONObject(i), this.f117880P));
                                i++;
                            }
                        }
                    }
                    if (jSONObject.has("AdaptiveInfo")) {
                        JSONObject optJSONObject3 = jSONObject.optJSONObject("AdaptiveInfo");
                        if (optJSONObject3 != null) {
                            this.f117882R = new C46080e();
                            this.f117882R.mo112215a(optJSONObject3);
                            this.f117907y = this.f117882R.mo112214a(215);
                            this.f117895m = this.f117882R.mo112214a(108);
                            this.f117896n = this.f117882R.mo112214a(109);
                            ArrayList arrayList2 = new ArrayList();
                            if (!TextUtils.isEmpty(this.f117895m)) {
                                arrayList2.add(this.f117895m);
                            }
                            if (!TextUtils.isEmpty(this.f117896n)) {
                                arrayList2.add(this.f117896n);
                            }
                            this.f117897o = new String[arrayList2.size()];
                            arrayList2.toArray(this.f117897o);
                        }
                    }
                } catch (Exception e5) {
                    throw e5;
                }
            }
            List a9 = mo112249a();
            if (a9 != null && a9.size() > 0) {
                Iterator it = a9.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C46082g gVar = (C46082g) it.next();
                    if (gVar.f117802B == f117863a) {
                        int i5 = f117863a;
                        this.f117880P = i5;
                        this.f117903u = i5;
                        break;
                    } else if (gVar.f117802B == f117864b) {
                        int i6 = f117864b;
                        this.f117880P = i6;
                        this.f117903u = i6;
                    }
                }
            }
            this.f117865A = jSONObject.toString();
            this.f117886d = new Resolution[this.f117905w.size()];
            this.f117905w.toArray(this.f117886d);
        }
    }

    /* renamed from: b */
    public final String[] mo112253b() {
        if (this.f117906x == null) {
            List<C46082g> a = mo112249a();
            ArrayList arrayList = new ArrayList();
            if (a != null && a.size() > 0) {
                for (C46082g gVar : a) {
                    if (gVar != null) {
                        String b = gVar.mo112220b(8);
                        if (!TextUtils.isEmpty(b) && !arrayList.contains(b)) {
                            arrayList.add(b);
                        }
                    }
                }
            }
            this.f117906x = new String[arrayList.size()];
            arrayList.toArray(this.f117906x);
        }
        return this.f117906x;
    }

    /* renamed from: a */
    public final List<C46082g> mo112249a() {
        if (this.f117885c == 2) {
            return this.f117875K;
        }
        List<C46082g> list = null;
        if (this.f117893k != null && this.f117893k.size() > 0) {
            list = this.f117893k;
        }
        if (this.f117894l != null && this.f117894l.size() > 0) {
            list = this.f117894l;
        }
        return list;
    }

    /* renamed from: b */
    public final long mo112252b(int i) {
        if (i != 216) {
            return 0;
        }
        return this.f117873I;
    }

    /* renamed from: a */
    public final String mo112248a(Resolution resolution) {
        return m144424a(resolution, mo112245a(7));
    }

    /* renamed from: a */
    public final int mo112245a(int i) {
        if (this.f117885c == 2) {
            if (i == 7) {
                return this.f117880P;
            }
            if (i == 209) {
                return this.f117884T;
            }
            switch (i) {
                case 3:
                    return this.f117877M;
                case 4:
                    return this.f117876L;
                default:
                    return 0;
            }
        } else if (i == 7) {
            return this.f117903u;
        } else {
            switch (i) {
                case 3:
                    return this.f117899q;
                case 4:
                    return this.f117898p;
                default:
                    return 0;
            }
        }
    }

    /* renamed from: c */
    public final String mo112255c(int i) {
        if (i == 211) {
            return this.f117908z;
        }
        if (i == 215) {
            return this.f117907y;
        }
        if (i == 8) {
            return this.f117865A;
        }
        if (this.f117885c != 2) {
            switch (i) {
                case 1:
                    return this.f117887e;
                case 2:
                    return this.f117888f;
                case 7:
                    return this.f117902t;
                case 104:
                    return this.f117892j;
                case 105:
                    return this.f117889g;
                case 107:
                    return this.f117890h;
                case 108:
                    return this.f117895m;
                case 109:
                    return this.f117896n;
                default:
                    return "";
            }
        } else if (i == 2) {
            return this.f117874J;
        } else {
            if (i == 7) {
                return this.f117879O;
            }
            if (i != 201) {
                return "";
            }
            return this.f117878N;
        }
    }

    /* renamed from: d */
    public final Boolean mo112256d(int i) {
        if (this.f117885c == 1 && i == 106) {
            return Boolean.valueOf(this.f117891i);
        }
        switch (i) {
            case 203:
                return Boolean.valueOf(this.f117867C);
            case 204:
                return Boolean.valueOf(this.f117866B);
            case 205:
                return Boolean.valueOf(this.f117868D);
            case 206:
                return Boolean.valueOf(this.f117870F);
            case 207:
                return Boolean.valueOf(this.f117869E);
            default:
                return Boolean.valueOf(false);
        }
    }

    /* renamed from: a */
    public final void mo112250a(HashMap<String, Resolution> hashMap) {
        int a = mo112245a(7);
        if (hashMap == null || hashMap.size() <= 0) {
            if (a == f117864b) {
                hashMap = this.f117872H;
            } else {
                hashMap = this.f117871G;
            }
        } else if (a == f117864b) {
            this.f117872H = hashMap;
        } else {
            this.f117871G = hashMap;
        }
        List a2 = mo112249a();
        if (a2 != null) {
            for (int i = 0; i < a2.size(); i++) {
                C46082g gVar = (C46082g) a2.get(i);
                if (gVar != null && gVar.f117802B == a) {
                    gVar.mo112218a(hashMap);
                    Resolution resolution = gVar.f117830b;
                    if (!this.f117905w.contains(resolution)) {
                        this.f117905w.add(resolution);
                    }
                }
            }
        }
        this.f117886d = new Resolution[this.f117905w.size()];
        this.f117905w.toArray(this.f117886d);
    }

    /* renamed from: a */
    public final C46082g mo112247a(Resolution resolution, Map<Integer, String> map) {
        return mo112246a(resolution, mo112245a(7), map);
    }

    /* renamed from: b */
    public final String[] mo112254b(Resolution resolution, Map<Integer, String> map) {
        if (this.f117897o != null && this.f117897o.length > 0) {
            return this.f117897o;
        }
        C46082g a = mo112247a(resolution, map);
        if (a == null) {
            return new String[0];
        }
        return a.mo112221c(16);
    }

    /* renamed from: a */
    private String m144424a(Resolution resolution, int i) {
        HashMap<String, Resolution> hashMap;
        if (i == f117864b) {
            hashMap = this.f117872H;
        } else {
            hashMap = this.f117871G;
        }
        String str = null;
        Iterator it = hashMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            if (((Resolution) hashMap.get(str2)).getIndex() == resolution.getIndex()) {
                str = str2;
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return resolution.toString(i);
        }
        return str;
    }

    /* renamed from: a */
    private C46082g m144423a(JSONObject jSONObject, int i) {
        String str;
        C46082g gVar = new C46082g();
        gVar.f117827a = this.f117885c;
        gVar.f117802B = i;
        gVar.mo112219a(jSONObject);
        Resolution resolution = Resolution.Standard;
        int i2 = gVar.f117802B;
        if (i2 == f117864b) {
            str = gVar.mo112220b(18);
        } else if (i2 == f117863a) {
            str = gVar.mo112220b(7);
        } else {
            str = null;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str.equals(Resolution.L_Standard.toString(i2))) {
                resolution = Resolution.L_Standard;
            } else if (str.equals(Resolution.Standard.toString(i2))) {
                resolution = Resolution.Standard;
            } else if (str.equals(Resolution.High.toString(i2))) {
                resolution = Resolution.High;
            } else if (str.equals(Resolution.H_High.toString(i2))) {
                resolution = Resolution.H_High;
            } else if (str.equals(Resolution.SuperHigh.toString(i2))) {
                resolution = Resolution.SuperHigh;
            } else if (str.equals(Resolution.ExtremelyHigh.toString(i2))) {
                resolution = Resolution.ExtremelyHigh;
            } else if (str.equals(Resolution.TwoK.toString(i2))) {
                resolution = Resolution.TwoK;
            } else if (str.equals(Resolution.FourK.toString(i2))) {
                resolution = Resolution.FourK;
            } else if (str.equals(Resolution.HDR.toString(i2))) {
                resolution = Resolution.HDR;
            }
        }
        gVar.f117830b = resolution;
        gVar.mo112217a(26, str);
        String b = gVar.mo112220b(6);
        if (!TextUtils.isEmpty(b)) {
            this.f117908z = b;
        }
        if (!this.f117869E && this.f117908z.equals("mpd")) {
            this.f117869E = true;
        } else if (!this.f117868D && this.f117908z.equals("dash")) {
            this.f117868D = true;
        } else if (!this.f117870F && this.f117908z.equals("mp4")) {
            this.f117870F = true;
        }
        String b2 = gVar.mo112220b(8);
        if (!this.f117867C && b2.equals("h264")) {
            this.f117867C = true;
        } else if (!this.f117866B && b2.equals("h265")) {
            this.f117866B = true;
        }
        return gVar;
    }

    /* renamed from: a */
    public final C46082g mo112246a(Resolution resolution, int i, Map<Integer, String> map) {
        List<C46082g> a = mo112249a();
        if (a == null || a.size() == 0) {
            return null;
        }
        for (C46082g gVar : a) {
            if (gVar != null && resolution == gVar.f117830b && i == gVar.f117802B) {
                if (map == null || map.size() == 0) {
                    return gVar;
                }
                boolean z = true;
                Iterator it = map.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Entry entry = (Entry) it.next();
                    int intValue = ((Integer) entry.getKey()).intValue();
                    if (!gVar.mo112220b(intValue).equals((String) entry.getValue())) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    return gVar;
                }
            }
        }
        return null;
    }
}
