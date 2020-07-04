package com.p280ss.ttvideoengine.p1812e;

import android.text.TextUtils;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.g */
public final class C46082g {

    /* renamed from: A */
    public String f117801A;

    /* renamed from: B */
    public int f117802B = 0;

    /* renamed from: C */
    private String f117803C = Resolution.Standard.toString(C46084i.f117863a);

    /* renamed from: D */
    private String f117804D = null;

    /* renamed from: E */
    private String f117805E = null;

    /* renamed from: F */
    private long f117806F = 0;

    /* renamed from: G */
    private int f117807G = 0;

    /* renamed from: H */
    private String f117808H;

    /* renamed from: I */
    private String f117809I;

    /* renamed from: J */
    private String[] f117810J = null;

    /* renamed from: K */
    private String f117811K;

    /* renamed from: L */
    private String f117812L;

    /* renamed from: M */
    private int f117813M;

    /* renamed from: N */
    private int f117814N;

    /* renamed from: O */
    private int f117815O;

    /* renamed from: P */
    private String f117816P = null;

    /* renamed from: Q */
    private String f117817Q;

    /* renamed from: R */
    private String f117818R = null;

    /* renamed from: S */
    private String f117819S;

    /* renamed from: T */
    private int f117820T;

    /* renamed from: U */
    private int f117821U;

    /* renamed from: V */
    private int f117822V;

    /* renamed from: W */
    private int f117823W = 0;

    /* renamed from: X */
    private long f117824X = 0;

    /* renamed from: Y */
    private String f117825Y = null;

    /* renamed from: Z */
    private String f117826Z = null;

    /* renamed from: a */
    public int f117827a = 1;

    /* renamed from: aa */
    private String f117828aa = null;

    /* renamed from: ab */
    private String f117829ab = null;

    /* renamed from: b */
    public Resolution f117830b = Resolution.Standard;

    /* renamed from: c */
    public String[] f117831c;

    /* renamed from: d */
    public String f117832d;

    /* renamed from: e */
    public String f117833e;

    /* renamed from: f */
    public String f117834f;

    /* renamed from: g */
    public String f117835g;

    /* renamed from: h */
    public int f117836h;

    /* renamed from: i */
    public int f117837i;

    /* renamed from: j */
    public int f117838j;

    /* renamed from: k */
    public int f117839k;

    /* renamed from: l */
    public boolean f117840l = false;

    /* renamed from: m */
    public String f117841m = null;

    /* renamed from: n */
    public String f117842n;

    /* renamed from: o */
    public String f117843o;

    /* renamed from: p */
    public String f117844p;

    /* renamed from: q */
    public String f117845q;

    /* renamed from: r */
    public String f117846r;

    /* renamed from: s */
    public int f117847s;

    /* renamed from: t */
    public int f117848t;

    /* renamed from: u */
    public int f117849u;

    /* renamed from: v */
    public long f117850v = 0;

    /* renamed from: w */
    public int f117851w = 0;

    /* renamed from: x */
    public int f117852x = 0;

    /* renamed from: y */
    public int f117853y = 1;

    /* renamed from: z */
    public boolean f117854z = false;

    /* renamed from: c */
    public final String[] mo112221c(int i) {
        if (this.f117827a == 2) {
            return this.f117810J;
        }
        return this.f117831c;
    }

    /* renamed from: d */
    public final long mo112222d(int i) {
        if (this.f117827a == 2) {
            if (i != 12) {
                return -1;
            }
            return this.f117824X;
        } else if (i == 12) {
            return this.f117850v;
        } else {
            if (i != 30) {
                return -1;
            }
            return this.f117806F;
        }
    }

    /* renamed from: a */
    public final void mo112218a(HashMap<String, Resolution> hashMap) {
        if (hashMap != null && hashMap.size() > 0) {
            String str = null;
            if (this.f117802B == C46084i.f117864b) {
                str = mo112220b(18);
                if (TextUtils.isEmpty(str)) {
                    str = Resolution.Standard.toString(this.f117802B);
                }
            } else if (this.f117802B == C46084i.f117863a) {
                str = mo112220b(7);
                if (TextUtils.isEmpty(str)) {
                    str = Resolution.Standard.toString(this.f117802B);
                }
            }
            this.f117830b = (Resolution) hashMap.get(str);
            if (this.f117830b == null) {
                this.f117830b = Resolution.Standard;
            }
        }
    }

    /* renamed from: a */
    public final int mo112216a(int i) {
        if (this.f117827a == 2) {
            if (i == 13) {
                return this.f117823W;
            }
            switch (i) {
                case 1:
                    return this.f117813M;
                case 2:
                    return this.f117814N;
                case 3:
                    return this.f117815O;
                default:
                    switch (i) {
                        case 9:
                            return this.f117820T;
                        case 10:
                            return this.f117821U;
                        case 11:
                            return this.f117822V;
                        default:
                            return -1;
                    }
            }
        } else if (i == 13) {
            return this.f117852x;
        } else {
            if (i == 27) {
                return this.f117851w;
            }
            switch (i) {
                case 1:
                    return this.f117836h;
                case 2:
                    return this.f117837i;
                case 3:
                    return this.f117838j;
                default:
                    switch (i) {
                        case 9:
                            return this.f117847s;
                        case 10:
                            return this.f117848t;
                        case 11:
                            return this.f117849u;
                        default:
                            switch (i) {
                                case 20:
                                    return this.f117839k;
                                case 21:
                                    return this.f117853y;
                                case 22:
                                    return this.f117807G;
                                default:
                                    return -1;
                            }
                    }
            }
        }
    }

    /* renamed from: b */
    public final String mo112220b(int i) {
        if (i == 26) {
            return this.f117803C;
        }
        if (i == 28) {
            return this.f117804D;
        }
        if (i == 29) {
            return this.f117805E;
        }
        if (this.f117827a == 2) {
            if (i == 0) {
                return this.f117811K;
            }
            if (i == 15) {
                return this.f117812L;
            }
            if (i == 31) {
                return this.f117829ab;
            }
            switch (i) {
                case 5:
                    return this.f117816P;
                case 6:
                    return this.f117817Q;
                case 7:
                    return this.f117819S;
                case 8:
                    return this.f117818R;
                default:
                    switch (i) {
                        case 17:
                            return this.f117828aa;
                        case 18:
                            return this.f117826Z;
                        case 19:
                            return this.f117825Y;
                        default:
                            return "";
                    }
            }
        } else if (i == 0) {
            return this.f117832d;
        } else {
            if (i == 15) {
                return this.f117845q;
            }
            if (i == 31) {
                return this.f117809I;
            }
            switch (i) {
                case 5:
                    return this.f117841m;
                case 6:
                    return this.f117843o;
                case 7:
                    return this.f117846r;
                case 8:
                    return this.f117844p;
                default:
                    switch (i) {
                        case 17:
                            return this.f117833e;
                        case 18:
                            return this.f117801A;
                        case 19:
                            return this.f117808H;
                        default:
                            switch (i) {
                                case 23:
                                    return this.f117834f;
                                case 24:
                                    return this.f117835g;
                                case 25:
                                    return this.f117842n;
                                default:
                                    return "";
                            }
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo112219a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (!TextUtils.isEmpty(jSONObject.optString("main_url"))) {
                this.f117827a = 1;
            } else if (!TextUtils.isEmpty(jSONObject.optString("MainPlayUrl"))) {
                this.f117827a = 2;
            }
            if (this.f117827a == 1) {
                ArrayList arrayList = new ArrayList();
                this.f117832d = jSONObject.optString("main_url");
                this.f117833e = jSONObject.optString("backup_url_1");
                this.f117834f = jSONObject.optString("backup_url_2");
                this.f117835g = jSONObject.optString("backup_url_3");
                if (!TextUtils.isEmpty(this.f117832d)) {
                    String a = C46122g.m144525a(this.f117832d);
                    arrayList.add(a);
                    try {
                        jSONObject.put("main_url", a);
                    } catch (Exception unused) {
                    }
                }
                if (!TextUtils.isEmpty(this.f117833e)) {
                    String a2 = C46122g.m144525a(this.f117833e);
                    arrayList.add(a2);
                    try {
                        jSONObject.put("backup_url_1", a2);
                    } catch (Exception unused2) {
                    }
                }
                if (!TextUtils.isEmpty(this.f117834f)) {
                    arrayList.add(C46122g.m144525a(this.f117834f));
                }
                if (!TextUtils.isEmpty(this.f117835g)) {
                    arrayList.add(C46122g.m144525a(this.f117835g));
                }
                this.f117831c = new String[arrayList.size()];
                arrayList.toArray(this.f117831c);
                try {
                    this.f117836h = Integer.valueOf(jSONObject.optString("vwidth")).intValue();
                } catch (NumberFormatException unused3) {
                    this.f117836h = 0;
                }
                try {
                    this.f117837i = Integer.valueOf(jSONObject.optString("vheight")).intValue();
                } catch (NumberFormatException unused4) {
                    this.f117837i = 0;
                }
                try {
                    this.f117838j = jSONObject.optInt("bitrate");
                } catch (Exception unused5) {
                    this.f117838j = 0;
                }
                this.f117840l = jSONObject.optBoolean("encrypt");
                this.f117841m = jSONObject.optString("spade_a");
                this.f117839k = jSONObject.optInt("gbr");
                this.f117842n = jSONObject.optString("storePath");
                this.f117843o = jSONObject.optString("vtype");
                this.f117846r = jSONObject.optString("definition");
                this.f117844p = jSONObject.optString("codec_type");
                try {
                    this.f117850v = jSONObject.optLong("size", 0);
                } catch (Exception unused6) {
                    this.f117850v = 0;
                }
                this.f117847s = jSONObject.optInt("preload_size");
                this.f117848t = jSONObject.optInt("play_load_min_step");
                this.f117849u = jSONObject.optInt("play_load_max_step");
                this.f117852x = jSONObject.optInt("preload_interval", -1);
                this.f117853y = jSONObject.optInt("use_video_proxy", 1);
                this.f117807G = jSONObject.optInt("socket_buffer", 0);
                this.f117845q = jSONObject.optString("file_hash");
                this.f117801A = jSONObject.optString("quality");
                this.f117808H = jSONObject.optString("logo_type");
                this.f117804D = jSONObject.optString("file_id");
                this.f117805E = C46122g.m144525a(jSONObject.optString("p2p_verify_url"));
                this.f117806F = jSONObject.optLong("url_expire");
                this.f117809I = jSONObject.optString("check_info");
                return;
            }
            if (this.f117827a == 2) {
                this.f117815O = jSONObject.optInt("Bitrate");
                this.f117812L = jSONObject.optString("FileHash");
                this.f117824X = jSONObject.optLong("Size");
                this.f117814N = jSONObject.optInt("Height");
                this.f117813M = jSONObject.optInt("Width");
                this.f117817Q = jSONObject.optString("Format");
                this.f117818R = jSONObject.optString("Codec");
                this.f117825Y = jSONObject.optString("Logo");
                this.f117819S = jSONObject.optString("Definition");
                this.f117826Z = jSONObject.optString("Quality");
                this.f117816P = jSONObject.optString("PlayAuth");
                this.f117811K = jSONObject.optString("MainPlayUrl");
                this.f117828aa = jSONObject.optString("BackupPlayUrl");
                String optString = jSONObject.optString("MediaType");
                if (!TextUtils.isEmpty(optString)) {
                    if (optString.equals("video")) {
                        this.f117802B = C46084i.f117863a;
                    } else if (optString.equals("audio")) {
                        this.f117802B = C46084i.f117864b;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                if (!TextUtils.isEmpty(this.f117811K)) {
                    arrayList2.add(this.f117811K);
                }
                if (!TextUtils.isEmpty(this.f117828aa)) {
                    arrayList2.add(this.f117828aa);
                }
                this.f117810J = new String[arrayList2.size()];
                arrayList2.toArray(this.f117810J);
                this.f117823W = jSONObject.optInt("PreloadInterval", -1);
                this.f117821U = jSONObject.optInt("PreloadMinStep");
                this.f117822V = jSONObject.optInt("PreloadMaxStep");
                this.f117820T = jSONObject.optInt("PreloadSize");
                this.f117804D = jSONObject.optString("FileID");
                this.f117805E = jSONObject.optString("P2pVerifyURL");
                this.f117829ab = jSONObject.optString("CheckInfo");
            }
        }
    }

    /* renamed from: a */
    public final void mo112217a(int i, String str) {
        this.f117803C = str;
    }
}
