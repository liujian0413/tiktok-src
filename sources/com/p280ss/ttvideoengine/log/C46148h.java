package com.p280ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.ttm.player.PlaybackParams;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.p1808a.C46030a;
import com.p280ss.ttvideoengine.p1811d.C46073b;
import com.p280ss.ttvideoengine.p1811d.C46074c;
import com.p280ss.ttvideoengine.p1812e.C46082g;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1813f.C46092d;
import com.p280ss.ttvideoengine.p1816i.C46115b;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import com.p280ss.ttvideoengine.p1816i.C46125j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.h */
public final class C46148h implements C46143c {

    /* renamed from: h */
    private static String f118302h = "VideoEventLogger";

    /* renamed from: A */
    private String f118303A;

    /* renamed from: B */
    private String f118304B;

    /* renamed from: C */
    private String f118305C;

    /* renamed from: D */
    private String f118306D;

    /* renamed from: E */
    private String f118307E;

    /* renamed from: F */
    private String f118308F;

    /* renamed from: G */
    private String f118309G = "";

    /* renamed from: H */
    private String f118310H = "";

    /* renamed from: I */
    private String f118311I = "";

    /* renamed from: J */
    private String f118312J = "";

    /* renamed from: K */
    private String f118313K = "";

    /* renamed from: L */
    private String f118314L = "";

    /* renamed from: M */
    private int f118315M;

    /* renamed from: N */
    private int f118316N;

    /* renamed from: O */
    private String f118317O = "";

    /* renamed from: P */
    private String f118318P = "";

    /* renamed from: Q */
    private String f118319Q = "";

    /* renamed from: R */
    private int f118320R;

    /* renamed from: S */
    private int f118321S;

    /* renamed from: T */
    private int f118322T;

    /* renamed from: U */
    private int f118323U;

    /* renamed from: V */
    private int f118324V;

    /* renamed from: W */
    private String f118325W = "";

    /* renamed from: X */
    private String f118326X = "";

    /* renamed from: Y */
    private Map f118327Y;

    /* renamed from: Z */
    private int f118328Z = -1;

    /* renamed from: a */
    public int f118329a;

    /* renamed from: aA */
    private int f118330aA;

    /* renamed from: aB */
    private int f118331aB;

    /* renamed from: aC */
    private String f118332aC = "";

    /* renamed from: aD */
    private Context f118333aD;

    /* renamed from: aE */
    private int f118334aE;

    /* renamed from: aF */
    private int f118335aF = -1;

    /* renamed from: aG */
    private int f118336aG;

    /* renamed from: aa */
    private int f118337aa = -1;

    /* renamed from: ab */
    private String f118338ab = "";

    /* renamed from: ac */
    private String f118339ac = "";

    /* renamed from: ad */
    private int f118340ad;

    /* renamed from: ae */
    private int f118341ae;

    /* renamed from: af */
    private int f118342af;

    /* renamed from: ag */
    private int f118343ag;

    /* renamed from: ah */
    private int f118344ah;

    /* renamed from: ai */
    private int f118345ai;

    /* renamed from: aj */
    private long f118346aj;

    /* renamed from: ak */
    private int f118347ak = -1;

    /* renamed from: al */
    private long f118348al;

    /* renamed from: am */
    private int f118349am = -1;

    /* renamed from: an */
    private int f118350an;

    /* renamed from: ao */
    private int f118351ao = -1;

    /* renamed from: ap */
    private String f118352ap;

    /* renamed from: aq */
    private int f118353aq;

    /* renamed from: ar */
    private int f118354ar = -1;

    /* renamed from: as */
    private String f118355as;

    /* renamed from: at */
    private int f118356at;

    /* renamed from: au */
    private int f118357au;

    /* renamed from: av */
    private C46083h f118358av;

    /* renamed from: aw */
    private long f118359aw;

    /* renamed from: ax */
    private int f118360ax;

    /* renamed from: ay */
    private long f118361ay;

    /* renamed from: az */
    private int f118362az;

    /* renamed from: b */
    public long f118363b;

    /* renamed from: c */
    public int f118364c;

    /* renamed from: d */
    public int f118365d;

    /* renamed from: e */
    public long f118366e;

    /* renamed from: f */
    public long f118367f;

    /* renamed from: g */
    public int f118368g = 1;

    /* renamed from: i */
    private C46141a f118369i;

    /* renamed from: j */
    private String f118370j = "";

    /* renamed from: k */
    private int f118371k;

    /* renamed from: l */
    private C46145e f118372l;

    /* renamed from: m */
    private boolean f118373m;

    /* renamed from: n */
    private boolean f118374n;

    /* renamed from: o */
    private int f118375o;

    /* renamed from: p */
    private ArrayList f118376p;

    /* renamed from: q */
    private ArrayList f118377q;

    /* renamed from: r */
    private ArrayList f118378r;

    /* renamed from: s */
    private ArrayList f118379s;

    /* renamed from: t */
    private String f118380t = "";

    /* renamed from: u */
    private String f118381u = "";

    /* renamed from: v */
    private Map f118382v;

    /* renamed from: w */
    private Map f118383w;

    /* renamed from: x */
    private Map f118384x;

    /* renamed from: y */
    private Map f118385y;

    /* renamed from: z */
    private String f118386z;

    /* renamed from: com.ss.ttvideoengine.log.h$a */
    static class C46149a implements Runnable {

        /* renamed from: a */
        C46148h f118387a;

        /* renamed from: b */
        private C46145e f118388b;

        /* renamed from: c */
        private Context f118389c;

        /* renamed from: d */
        private Handler f118390d = new Handler(Looper.getMainLooper());

        public final void run() {
            if (this.f118388b != null) {
                this.f118388b.f118190bw = (int) C46122g.m144531b(this.f118389c);
                if (TextUtils.isEmpty(this.f118388b.f118176bi)) {
                    this.f118388b.f118176bi = C46030a.m144223a().mo112111a(this.f118388b.f118175bh);
                }
                final JSONObject a = this.f118388b.mo112440a();
                if (this.f118390d == null || this.f118390d.getLooper() == null) {
                    VideoEventManager.instance.addEvent(a);
                    return;
                }
                this.f118390d.post(new Runnable() {
                    public final void run() {
                        VideoEventManager.instance.addEvent(a);
                    }
                });
                this.f118387a.mo112447o();
            }
        }

        public C46149a(Context context, C46145e eVar, C46148h hVar) {
            this.f118388b = eVar;
            this.f118389c = context;
            this.f118387a = hVar;
        }
    }

    /* renamed from: j */
    public final void mo112394j(int i) {
    }

    /* renamed from: l */
    public final int mo112401l() {
        return this.f118329a;
    }

    /* renamed from: m */
    public final long mo112405m() {
        return this.f118363b;
    }

    /* renamed from: r */
    public final void mo112422r(int i) {
    }

    /* renamed from: a */
    public final void mo112346a(boolean z) {
        if (z) {
            this.f118320R = 1;
        } else {
            this.f118320R = 0;
        }
    }

    /* renamed from: a */
    public final void mo112335a(C46083h hVar) {
        if (hVar != null) {
            m144722b(hVar);
        }
    }

    /* renamed from: a */
    public final void mo112345a(Map map) {
        this.f118384x = map;
    }

    /* renamed from: b */
    public final void mo112359b(Map map) {
        this.f118385y = map;
    }

    /* renamed from: a */
    public final void mo112333a(long j, int i) {
        if (this.f118372l != null && this.f118372l.f118125ak <= 0) {
            this.f118372l.f118125ak = j;
            this.f118372l.f118216cv = i;
        }
    }

    /* renamed from: a */
    public final void mo112332a(long j) {
        if (this.f118372l != null && this.f118372l.f118126al <= 0) {
            this.f118372l.f118126al = j;
        }
    }

    /* renamed from: a */
    public final void mo112344a(ArrayList arrayList) {
        this.f118379s = arrayList;
    }

    /* renamed from: a */
    public final void mo112342a(String str, long j, String str2) {
        mo112447o();
        this.f118372l = new C46145e();
        this.f118372l.f118221e = str;
        this.f118372l.f118223g = j;
        this.f118372l.f118225i = 0;
        this.f118372l.f118226j = 0;
        this.f118372l.f118125ak = 0;
        this.f118372l.f118126al = 0;
        this.f118372l.f118127am = 0;
        this.f118372l.f118128an = 0;
        this.f118372l.f118129ao = 0;
        this.f118372l.f118130ap = 0;
        this.f118372l.f118131aq = 0;
        this.f118372l.f118139ay = 0;
        this.f118372l.f118089aA = 0;
        this.f118372l.f118140az = 0;
        this.f118372l.f118090aB = 0;
        this.f118353aq++;
        this.f118372l.f118196cb = -2147483648L;
        this.f118372l.f118197cc = -2147483648L;
        this.f118372l.f118198cd = -2147483648L;
        this.f118372l.f118199ce = -2147483648L;
        this.f118372l.f118200cf = -2147483648L;
        this.f118372l.f118201cg = -2147483648L;
        this.f118372l.f118202ch = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public final void mo112338a(C46117c cVar, int i) {
        HashMap a = cVar.mo112287a();
        a.put("apiver", Integer.valueOf(i));
        this.f118376p.add(a);
    }

    /* renamed from: a */
    public final void mo112340a(C46117c cVar, String str) {
        if (cVar != null) {
            HashMap a = cVar.mo112287a();
            if (str == null) {
                str = "";
            }
            a.put("url", str);
            this.f118383w.put("player", a);
        }
    }

    /* renamed from: b */
    public final void mo112356b(C46117c cVar, String str) {
        if (cVar != null) {
            HashMap a = cVar.mo112287a();
            if (str == null) {
                str = "";
            }
            a.put("url", str);
            this.f118383w.put("cdn", a);
        }
    }

    /* renamed from: a */
    public final void mo112337a(C46117c cVar) {
        if (cVar != null) {
            this.f118383w.put("localdns", cVar.mo112287a());
        }
    }

    /* renamed from: a */
    public final void mo112336a(C46083h hVar, C46117c cVar) {
        if (cVar != null) {
            this.f118383w.put("api", cVar.mo112287a());
            return;
        }
        if (hVar != null) {
            m144722b(hVar);
            this.f118372l.f118224h = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final void mo112343a(String str, String str2) {
        this.f118380t = str2;
        this.f118381u = str;
    }

    /* renamed from: b */
    public final void mo112358b(String str, String str2) {
        this.f118372l.f118228l = System.currentTimeMillis();
        if (str != str2) {
            this.f118356at++;
        }
        this.f118380t = str2;
        this.f118381u = str;
    }

    /* renamed from: a */
    public final void mo112339a(C46117c cVar, int i, int i2) {
        if ((cVar.f118006c.equals("kTTVideoErrorDomainVideoOwnPlayer") || cVar.f118006c.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.f118379s.size() <= 1) {
            this.f118365d++;
        }
        HashMap a = cVar.mo112287a();
        a.put("strategy", Integer.valueOf(i));
        a.put("apiver", Integer.valueOf(i2));
        this.f118378r.add(a);
        m144723e(cVar);
    }

    /* renamed from: b */
    public final void mo112355b(C46117c cVar, int i) {
        HashMap a = cVar.mo112287a();
        a.put("strategy", Integer.valueOf(0));
        a.put("apiver", Integer.valueOf(i));
        this.f118378r.add(a);
        if (this.f118374n) {
            this.f118372l.f118229m = System.currentTimeMillis();
        } else {
            if ((cVar.f118006c.equals("kTTVideoErrorDomainVideoOwnPlayer") || cVar.f118006c.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.f118379s.size() <= 1) {
                this.f118365d++;
            }
            this.f118372l.f118228l = System.currentTimeMillis();
        }
        this.f118372l.f118067F = cVar.mo112288b();
        this.f118372l.f118068G = cVar.f118004a;
        m144723e(cVar);
        m144720R(4);
    }

    /* renamed from: a */
    public final void mo112334a(PlaybackParams playbackParams) {
        if (this.f118372l != null) {
            this.f118327Y = new HashMap();
            this.f118327Y.put("AFMode", Integer.valueOf(playbackParams.getAudioFallbackMode()));
            this.f118327Y.put("pitch", Float.valueOf(playbackParams.getPitch()));
            this.f118327Y.put("speed", Float.valueOf(playbackParams.getSpeed()));
        }
    }

    /* renamed from: h */
    public final void mo112385h() {
        this.f118346aj = System.currentTimeMillis();
    }

    /* renamed from: i */
    public final void mo112389i() {
        this.f118324V++;
    }

    /* renamed from: g */
    public final void mo112381g() {
        if (this.f118372l != null) {
            this.f118372l.f118101aM = 1;
        }
    }

    /* renamed from: j */
    public final String mo112393j() {
        if (this.f118372l != null) {
            return this.f118372l.f118204cj;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo112347b() {
        if (this.f118372l.f118226j <= 0) {
            this.f118372l.f118226j = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo112360c() {
        this.f118374n = false;
        if (this.f118372l.f118227k <= 0) {
            this.f118372l.f118227k = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public final void mo112368d() {
        if (this.f118372l != null) {
            this.f118372l.f118200cf = System.currentTimeMillis();
        }
        m144721a(1, true);
    }

    /* renamed from: e */
    public final void mo112373e() {
        if (this.f118372l != null) {
            this.f118372l.f118201cg = System.currentTimeMillis();
        }
        m144721a(1, false);
    }

    /* renamed from: n */
    public final void mo112409n() {
        if (this.f118372l.f118219cy <= 0) {
            this.f118372l.f118219cy = System.currentTimeMillis();
        }
    }

    /* renamed from: o */
    public final void mo112447o() {
        this.f118374n = true;
        this.f118376p.clear();
        this.f118377q.clear();
        this.f118378r.clear();
        this.f118383w.clear();
    }

    /* renamed from: a */
    public final void mo112324a() {
        if (this.f118372l.f118225i <= 0) {
            this.f118372l.f118225i = System.currentTimeMillis();
        }
    }

    /* renamed from: f */
    public final void mo112377f() {
        m144721a(2, false);
        if (this.f118361ay > 0) {
            this.f118357au++;
            this.f118360ax = (int) (((long) this.f118360ax) + (SystemClock.elapsedRealtime() - this.f118361ay));
            this.f118361ay = 0;
            if (this.f118372l != null) {
                this.f118372l.f118197cc = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: p */
    private void m144724p() {
        if (!(this.f118358av == null || this.f118372l.f118067F == Integer.MIN_VALUE)) {
            Resolution[] g = this.f118358av.mo112243g();
            if (g != null) {
                int a = this.f118358av.mo112223a(7);
                HashMap hashMap = new HashMap();
                for (Resolution resolution : g) {
                    hashMap.put(resolution.toString(a), this.f118358av.mo112232a(resolution));
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", hashMap);
                this.f118372l.f118164bW = hashMap2;
            }
        }
    }

    /* renamed from: k */
    public final void mo112397k() {
        this.f118370j = "";
        this.f118371k = 0;
        this.f118373m = false;
        this.f118374n = true;
        this.f118376p.clear();
        this.f118377q.clear();
        this.f118378r.clear();
        this.f118379s.clear();
        this.f118380t = "";
        this.f118382v = null;
        this.f118383w.clear();
        this.f118384x = null;
        this.f118385y = null;
        this.f118303A = null;
        this.f118304B = null;
        this.f118305C = null;
        this.f118306D = null;
        this.f118386z = null;
        this.f118307E = null;
        this.f118308F = null;
        this.f118309G = null;
        this.f118310H = null;
        this.f118311I = null;
        this.f118312J = null;
        this.f118314L = "";
        this.f118315M = 0;
        this.f118316N = 0;
        this.f118317O = "";
        this.f118318P = "";
        this.f118319Q = "";
        this.f118321S = 0;
        this.f118322T = 0;
        this.f118323U = 0;
        this.f118325W = "";
        this.f118326X = "";
        this.f118327Y = null;
        this.f118340ad = 0;
        this.f118341ae = 0;
        this.f118352ap = null;
        this.f118364c = 0;
        this.f118329a = 0;
        this.f118365d = 0;
        this.f118366e = 0;
        this.f118367f = 0;
        this.f118363b = 0;
        this.f118357au = 0;
        this.f118356at = 0;
        this.f118330aA = 0;
        this.f118362az = 0;
    }

    /* renamed from: q */
    private void m144725q() {
        Object obj;
        if (this.f118372l != null && this.f118368g != 0 && this.f118372l.f118223g > 0) {
            if (this.f118382v != null) {
                this.f118372l.f118235s = ((Integer) this.f118382v.get("duration")).intValue() * 1000;
                Object obj2 = ((Map) this.f118382v.get("size")).get(this.f118381u);
                int i = -1;
                if (obj2 != null) {
                    i = ((Long) obj2).intValue();
                }
                this.f118372l.f118236t = i;
                Map map = (Map) this.f118382v.get("codec");
                C46145e eVar = this.f118372l;
                if (map.get(this.f118381u) != null) {
                    obj = map.get(this.f118381u);
                } else {
                    obj = "";
                }
                eVar.f118062A = (String) obj;
                this.f118372l.f118063B = (String) this.f118382v.get("vtype");
                this.f118372l.f118064C = (String) this.f118382v.get("dynamic_type");
            }
            if (this.f118369i != null) {
                Map a = this.f118369i.mo112102a();
                if (a != null) {
                    this.f118372l.f118088a = (String) a.get("sv");
                    this.f118372l.f118141b = (String) a.get("pv");
                    this.f118372l.f118194c = (String) a.get("pc");
                    this.f118372l.f118220d = (String) a.get("sdk_version");
                }
                Map b = this.f118369i.mo112104b();
                if (b != null) {
                    int intValue = ((Long) b.get("vps")).intValue();
                    int intValue2 = ((Long) b.get("vds")).intValue();
                    this.f118372l.f118237u = intValue - this.f118362az;
                    this.f118372l.f118238v = intValue2 - this.f118330aA;
                    this.f118362az = intValue;
                    this.f118330aA = intValue2;
                    this.f118372l.f118241y = ((Long) b.get("download_speed")).longValue();
                }
                String a2 = this.f118369i.mo112101a(0);
                if (!TextUtils.isEmpty(a2)) {
                    this.f118372l.f118062A = a2;
                }
                this.f118372l.f118185br = this.f118369i.mo112101a(1);
                mo112430u(this.f118369i.mo112101a(2));
                this.f118372l.f118187bt = this.f118369i.mo112101a(3);
                this.f118372l.f118188bu = this.f118369i.mo112101a(4);
                this.f118372l.f118098aJ = this.f118369i.mo112105c(22);
                this.f118372l.f118096aH = this.f118369i.mo112105c(21);
                this.f118372l.f118097aI = this.f118369i.mo112105c(23);
                this.f118372l.f118103aO = this.f118369i.mo112105c(24);
                this.f118372l.f118102aN = this.f118369i.mo112105c(25);
                this.f118372l.f118159bR = this.f118369i.mo112105c(34);
                this.f118372l.f118158bQ = this.f118369i.mo112105c(35);
                this.f118372l.f118160bS = this.f118369i.mo112105c(36);
                if (this.f118372l.f118104aP == null) {
                    String a3 = this.f118369i.mo112101a(5);
                    if (a3 == null) {
                        a3 = "";
                    }
                    this.f118372l.f118104aP = a3;
                }
                String a4 = this.f118369i.mo112101a(33);
                if (!TextUtils.isEmpty(a4)) {
                    this.f118372l.f118105aQ = a4;
                }
                String a5 = this.f118369i.mo112101a(37);
                if (!TextUtils.isEmpty(a5)) {
                    this.f118372l.f118106aR = a5;
                }
                if (this.f118372l.f118125ak <= 0) {
                    this.f118372l.f118216cv = 1;
                    this.f118372l.f118125ak = this.f118369i.mo112103b(7);
                }
                if (this.f118372l.f118126al <= 0) {
                    this.f118372l.f118126al = this.f118369i.mo112103b(10);
                }
                if (this.f118372l.f118127am <= 0) {
                    this.f118372l.f118127am = this.f118369i.mo112103b(11);
                }
                if (this.f118372l.f118128an <= 0) {
                    this.f118372l.f118128an = this.f118369i.mo112103b(12);
                }
                if (this.f118372l.f118129ao <= 0) {
                    this.f118372l.f118129ao = this.f118369i.mo112103b(13);
                }
                if (this.f118372l.f118130ap <= 0) {
                    this.f118372l.f118130ap = this.f118369i.mo112103b(14);
                }
                if (this.f118372l.f118131aq <= 0) {
                    this.f118372l.f118131aq = this.f118369i.mo112103b(15);
                }
                if (this.f118372l.f118139ay <= 0) {
                    this.f118372l.f118139ay = this.f118369i.mo112103b(17);
                }
                if (this.f118372l.f118089aA <= 0) {
                    this.f118372l.f118089aA = this.f118369i.mo112103b(16);
                }
                if (this.f118372l.f118140az <= 0) {
                    this.f118372l.f118140az = this.f118369i.mo112103b(19);
                }
                if (this.f118372l.f118090aB <= 0) {
                    this.f118372l.f118090aB = this.f118369i.mo112103b(18);
                }
                if (this.f118372l.f118211cq <= 0) {
                    this.f118372l.f118211cq = this.f118369i.mo112103b(38);
                }
                if (this.f118372l.f118212cr <= 0) {
                    this.f118372l.f118212cr = this.f118369i.mo112103b(39);
                }
                this.f118372l.f118191bx = this.f118369i.mo112105c(27);
                this.f118372l.f118109aU = this.f118369i.mo112105c(30);
                this.f118372l.f118155bN = this.f118369i.mo112101a(31);
                this.f118372l.f118156bO = this.f118369i.mo112101a(32);
            }
            if (this.f118340ad > 0) {
                this.f118372l.f118235s = this.f118340ad;
            }
            this.f118372l.f118108aT = this.f118354ar;
            this.f118372l.f118110aV = this.f118355as;
            this.f118372l.f118169bb = this.f118341ae;
            this.f118372l.f118170bc = this.f118344ah;
            this.f118372l.f118171bd = this.f118345ai;
            this.f118372l.f118091aC = this.f118346aj;
            this.f118372l.f118221e = this.f118370j;
            this.f118372l.f118234r = this.f118379s;
            this.f118372l.f118066E = this.f118380t;
            this.f118372l.f118065D = this.f118381u;
            this.f118372l.f118222f = this.f118371k;
            this.f118372l.f118082U = this.f118383w;
            this.f118372l.f118087Z = this.f118316N;
            this.f118372l.f118115aa = this.f118317O;
            this.f118372l.f118116ab = this.f118318P;
            this.f118372l.f118117ac = this.f118319Q;
            this.f118372l.f118118ad = this.f118320R;
            this.f118372l.f118119ae = this.f118321S;
            this.f118372l.f118120af = this.f118322T;
            this.f118372l.f118086Y = this.f118315M;
            this.f118372l.f118121ag = this.f118323U;
            this.f118372l.f118149bH = this.f118334aE;
            this.f118372l.f118150bI = this.f118335aF;
            this.f118372l.f118112aX = this.f118324V;
            if (TextUtils.isEmpty(this.f118325W)) {
                this.f118372l.f118122ah = "default";
            } else {
                this.f118372l.f118122ah = this.f118325W;
            }
            if (TextUtils.isEmpty(this.f118326X)) {
                this.f118372l.f118123ai = "default";
            } else {
                this.f118372l.f118123ai = this.f118326X;
            }
            this.f118372l.f118239w = this.f118342af;
            this.f118372l.f118240x = this.f118343ag;
            this.f118372l.f118175bh = this.f118338ab;
            this.f118372l.f118177bj = this.f118339ac;
            this.f118372l.f118172be = this.f118328Z;
            this.f118372l.f118173bf = this.f118337aa;
            this.f118372l.f118174bg = this.f118375o;
            this.f118372l.f118143bB = this.f118349am;
            this.f118372l.f118192by = this.f118352ap;
            this.f118372l.f118148bG = this.f118353aq;
            this.f118372l.f118145bD = C46092d.m144462b();
            this.f118372l.f118231o = this.f118364c;
            this.f118372l.f118232p = this.f118329a;
            this.f118372l.f118233q = this.f118365d;
            this.f118372l.f118180bm = this.f118366e;
            this.f118372l.f118178bk = this.f118367f;
            this.f118372l.f118179bl = this.f118363b;
            this.f118372l.f118184bq = this.f118357au;
            this.f118372l.f118113aY = this.f118356at;
            this.f118372l.f118209co = this.f118331aB;
            this.f118372l.f118210cp = this.f118332aC;
            this.f118372l.f118217cw = this.f118336aG;
            HashMap hashMap = new HashMap();
            int i2 = 0;
            while (i2 < this.f118376p.size() && i2 < 3) {
                hashMap.put(C1642a.m8034a("fetchretry%d", new Object[]{Integer.valueOf(i2)}), this.f118376p.get(i2));
                i2++;
            }
            int i3 = 0;
            while (i3 < this.f118377q.size() && i3 < 3) {
                hashMap.put(C1642a.m8034a("ldns%d", new Object[]{Integer.valueOf(i3)}), ((C46117c) this.f118377q.get(i3)).mo112287a());
                i3++;
            }
            for (int i4 = 0; i4 < this.f118378r.size(); i4++) {
                if (i4 < 2 || i4 == this.f118378r.size() - 1) {
                    hashMap.put(C1642a.m8034a("error%d", new Object[]{Integer.valueOf(i4)}), this.f118378r.get(i4));
                }
            }
            if (!TextUtils.isEmpty(this.f118314L)) {
                hashMap.put("log", this.f118314L);
            }
            this.f118314L = "";
            this.f118372l.f118124aj = hashMap;
            if (this.f118384x != null) {
                this.f118372l.f118074M = this.f118384x;
            }
            if (this.f118385y != null) {
                this.f118372l.f118075N = this.f118385y;
            }
            if (this.f118386z != null) {
                this.f118372l.f118076O = this.f118386z;
            }
            if (this.f118303A != null) {
                this.f118372l.f118077P = this.f118303A;
            }
            if (this.f118305C != null) {
                this.f118372l.f118078Q = this.f118305C;
            }
            if (this.f118307E != null) {
                this.f118372l.f118079R = this.f118307E;
            }
            if (this.f118309G != null) {
                this.f118372l.f118080S = this.f118309G;
            }
            if (this.f118311I != null) {
                this.f118372l.f118081T = this.f118311I;
            }
            if (this.f118313K != null) {
                this.f118372l.f118186bs = this.f118313K;
            }
            if (this.f118327Y != null) {
                this.f118372l.f118111aW = this.f118327Y;
            }
            this.f118372l.f118193bz = this.f118350an;
            this.f118372l.f118142bA = this.f118351ao;
            this.f118372l.f118154bM = this.f118347ak;
            if (this.f118372l.f118197cc < this.f118372l.f118196cb) {
                this.f118372l.f118197cc = -2147483648L;
            }
            if (this.f118372l.f118199ce < this.f118372l.f118198cd) {
                this.f118372l.f118199ce = -2147483648L;
                long currentTimeMillis = System.currentTimeMillis() - this.f118372l.f118198cd;
                this.f118372l.f118178bk += currentTimeMillis;
            }
            if (this.f118372l.f118201cg < this.f118372l.f118200cf) {
                this.f118372l.f118201cg = -2147483648L;
            }
            m144724p();
            if (this.f118359aw > 0) {
                this.f118372l.f118166bY = (int) (SystemClock.elapsedRealtime() - this.f118359aw);
            }
            if (this.f118360ax > 0) {
                this.f118372l.f118195ca = this.f118360ax;
            }
            if (C46125j.m144552b()) {
                this.f118372l.f118203ci = C46125j.m144549a() - System.currentTimeMillis();
            }
            C46115b.m144501a((Runnable) new C46149a(this.f118333aD, this.f118372l, this));
            this.f118364c = 0;
            this.f118329a = 0;
            this.f118365d = 0;
            this.f118366e = 0;
            this.f118367f = 0;
            this.f118363b = 0;
            this.f118324V = 0;
            this.f118356at = 0;
            this.f118357au = 0;
            this.f118361ay = 0;
            this.f118360ax = 0;
        }
    }

    /* renamed from: F */
    public final void mo112312F(int i) {
        this.f118337aa = i;
    }

    /* renamed from: G */
    public final void mo112313G(int i) {
        this.f118328Z = i;
    }

    /* renamed from: H */
    public final void mo112314H(int i) {
        this.f118350an = i;
    }

    /* renamed from: I */
    public final void mo112315I(int i) {
        this.f118351ao = i;
    }

    /* renamed from: M */
    public final void mo112319M(int i) {
        this.f118336aG = i;
    }

    /* renamed from: N */
    public final void mo112320N(int i) {
        this.f118334aE = i;
    }

    /* renamed from: O */
    public final void mo112321O(int i) {
        this.f118335aF = i;
    }

    /* renamed from: P */
    public final void mo112322P(int i) {
        this.f118368g = i;
    }

    /* renamed from: a */
    public final void mo112341a(String str) {
        this.f118386z = str;
    }

    /* renamed from: b */
    public final void mo112349b(int i) {
        this.f118371k = 1;
    }

    /* renamed from: c */
    public final void mo112361c(int i) {
        this.f118315M = i;
    }

    /* renamed from: d */
    public final void mo112369d(int i) {
        this.f118316N = i;
    }

    /* renamed from: e */
    public final void mo112374e(int i) {
        this.f118322T = i;
    }

    /* renamed from: f */
    public final void mo112378f(int i) {
        this.f118323U = 1;
    }

    /* renamed from: g */
    public final void mo112382g(int i) {
        this.f118342af = i;
    }

    /* renamed from: h */
    public final void mo112386h(int i) {
        this.f118343ag = i;
    }

    /* renamed from: i */
    public final void mo112390i(int i) {
        this.f118347ak = i;
    }

    /* renamed from: k */
    public final void mo112398k(int i) {
        this.f118331aB = i;
    }

    /* renamed from: n */
    public final void mo112410n(int i) {
        this.f118340ad = i;
    }

    /* renamed from: o */
    public final void mo112413o(int i) {
        this.f118341ae = i;
    }

    /* renamed from: p */
    public final void mo112416p(int i) {
        this.f118344ah = i;
    }

    /* renamed from: q */
    public final void mo112419q(int i) {
        this.f118345ai = i;
    }

    /* renamed from: t */
    public final void mo112428t(String str) {
        this.f118313K = str;
    }

    /* renamed from: J */
    public final void mo112316J(int i) {
        this.f118372l.f118114aZ = i;
    }

    /* renamed from: K */
    public final void mo112317K(int i) {
        this.f118372l.f118189bv = i;
    }

    /* renamed from: Q */
    public final C46073b mo112323Q(int i) {
        return C46074c.m144378a(i, this.f118372l);
    }

    /* renamed from: b */
    public final void mo112357b(String str) {
        this.f118303A = str;
    }

    /* renamed from: c */
    public final void mo112365c(C46117c cVar) {
        this.f118377q.add(cVar);
    }

    /* renamed from: d */
    public final void mo112372d(String str) {
        this.f118305C = str;
    }

    /* renamed from: e */
    public final void mo112376e(String str) {
        this.f118306D = str;
    }

    /* renamed from: f */
    public final void mo112380f(String str) {
        this.f118307E = str;
    }

    /* renamed from: g */
    public final void mo112384g(String str) {
        this.f118308F = str;
    }

    /* renamed from: j */
    public final void mo112396j(String str) {
        this.f118311I = str;
    }

    /* renamed from: k */
    public final void mo112400k(String str) {
        this.f118312J = str;
    }

    /* renamed from: m */
    public final void mo112408m(String str) {
        this.f118325W = str;
    }

    /* renamed from: n */
    public final void mo112412n(String str) {
        this.f118332aC = str;
    }

    /* renamed from: o */
    public final void mo112415o(String str) {
        this.f118326X = str;
    }

    /* renamed from: r */
    public final void mo112424r(String str) {
        if (str != null) {
            this.f118338ab = str;
        }
    }

    /* renamed from: s */
    public final void mo112426s(String str) {
        if (str != null) {
            this.f118339ac = str;
        }
    }

    /* renamed from: R */
    private void m144720R(int i) {
        this.f118372l.f118167bZ = i;
        m144725q();
        this.f118372l = new C46145e();
    }

    /* renamed from: A */
    public final void mo112307A(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118138ax = i;
        }
    }

    /* renamed from: B */
    public final void mo112308B(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118095aG = i;
        }
    }

    /* renamed from: C */
    public final void mo112309C(int i) {
        if (this.f118372l != null && i > 0) {
            this.f118372l.f118213cs = i;
        }
    }

    /* renamed from: D */
    public final void mo112310D(int i) {
        if (this.f118372l != null && i > 0) {
            this.f118372l.f118214ct = i;
        }
    }

    /* renamed from: E */
    public final void mo112311E(int i) {
        if (this.f118372l != null && i >= 0) {
            this.f118372l.f118215cu = i;
        }
    }

    /* renamed from: L */
    public final void mo112318L(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118168ba = i;
        }
    }

    /* renamed from: a */
    public final void mo112325a(float f) {
        if (this.f118372l != null) {
            this.f118372l.f118135au = f;
        }
    }

    /* renamed from: b */
    public final void mo112348b(float f) {
        if (this.f118372l != null) {
            this.f118372l.f118136av = f;
        }
    }

    /* renamed from: d */
    public final void mo112371d(C46117c cVar) {
        this.f118372l.f118083V = 1;
        this.f118378r.add(cVar);
    }

    /* renamed from: h */
    public final void mo112388h(String str) {
        this.f118309G = str;
    }

    /* renamed from: i */
    public final void mo112392i(String str) {
        this.f118310H = str;
    }

    /* renamed from: l */
    public final void mo112402l(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118206cl = i;
        }
    }

    /* renamed from: m */
    public final void mo112407m(long j) {
        if (this.f118372l != null) {
            this.f118372l.f118181bn = (int) j;
        }
    }

    /* renamed from: n */
    public final void mo112411n(long j) {
        if (this.f118372l != null) {
            this.f118372l.f118182bo = (int) j;
        }
    }

    /* renamed from: q */
    public final void mo112421q(String str) {
        if (this.f118372l != null) {
            this.f118372l.f118152bK = str;
        }
    }

    /* renamed from: r */
    public final void mo112423r(long j) {
        if (this.f118372l != null) {
            this.f118372l.f118205ck = j;
        }
    }

    /* renamed from: t */
    public final void mo112427t(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118099aK = i;
        }
    }

    /* renamed from: u */
    public final void mo112429u(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118100aL = i;
        }
    }

    /* renamed from: v */
    public final void mo112432v(String str) {
        if (this.f118372l != null) {
            this.f118372l.f118204cj = str;
        }
    }

    /* renamed from: w */
    public final void mo112433w(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118134at = (long) i;
        }
    }

    /* renamed from: x */
    public final void mo112435x(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118151bJ = i;
        }
    }

    /* renamed from: y */
    public final void mo112437y(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118153bL = i;
        }
    }

    /* renamed from: z */
    public final void mo112439z(int i) {
        if (this.f118372l != null) {
            this.f118372l.f118144bC = i;
        }
    }

    /* renamed from: f */
    public final void mo112379f(long j) {
        if (this.f118372l != null && this.f118372l.f118131aq <= 0) {
            this.f118372l.f118131aq = j;
        }
    }

    /* renamed from: g */
    public final void mo112383g(long j) {
        if (this.f118372l != null && this.f118372l.f118092aD <= 0) {
            this.f118372l.f118092aD = j;
        }
    }

    /* renamed from: h */
    public final void mo112387h(long j) {
        if (this.f118372l != null && this.f118372l.f118093aE <= 0) {
            this.f118372l.f118093aE = j;
        }
    }

    /* renamed from: i */
    public final void mo112391i(long j) {
        if (this.f118372l != null && this.f118372l.f118094aF <= 0) {
            this.f118372l.f118094aF = j;
        }
    }

    /* renamed from: j */
    public final void mo112395j(long j) {
        if (this.f118372l != null && j > 0) {
            this.f118366e += j;
        }
    }

    /* renamed from: k */
    public final void mo112399k(long j) {
        if (this.f118372l != null && j > 0) {
            this.f118367f += j;
        }
    }

    /* renamed from: l */
    public final void mo112403l(long j) {
        if (this.f118372l != null) {
            this.f118372l.f118137aw = j;
        }
    }

    /* renamed from: m */
    public final void mo112406m(int i) {
        if (!(this.f118372l == null || i == -1)) {
            if (this.f118372l.f118207cm == -1) {
                this.f118372l.f118207cm = i;
                return;
            }
            this.f118372l.f118208cn = i;
        }
    }

    /* renamed from: p */
    public final void mo112417p(long j) {
        if (this.f118372l != null && this.f118372l.f118162bU <= 0) {
            this.f118372l.f118162bU = j;
        }
    }

    /* renamed from: q */
    public final void mo112420q(long j) {
        if (this.f118372l != null && this.f118372l.f118163bV <= 0) {
            this.f118372l.f118163bV = j;
        }
    }

    /* renamed from: u */
    public final void mo112430u(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f118314L);
            sb.append(str);
            this.f118314L = sb.toString();
        }
    }

    /* renamed from: v */
    public final void mo112431v(int i) {
        if (this.f118374n) {
            this.f118372l.f118229m = System.currentTimeMillis();
        } else {
            this.f118372l.f118228l = System.currentTimeMillis();
        }
        m144720R(i);
    }

    /* renamed from: w */
    public final void mo112434w(String str) {
        if (this.f118372l != null) {
            this.f118372l.f118147bF = str;
        }
    }

    /* renamed from: x */
    public final void mo112436x(String str) {
        if (this.f118372l != null && !TextUtils.isEmpty(str)) {
            this.f118372l.f118218cx = str;
        }
    }

    /* renamed from: y */
    public final void mo112438y(String str) {
        if (this.f118372l != null && !TextUtils.isEmpty(str)) {
            this.f118372l.f118107aS = str;
        }
    }

    /* renamed from: e */
    private void m144723e(C46117c cVar) {
        if (this.f118372l != null && this.f118372l.f118070I == Integer.MIN_VALUE && this.f118372l.f118069H == Integer.MIN_VALUE && this.f118372l.f118071J == Integer.MIN_VALUE) {
            this.f118372l.f118069H = cVar.mo112288b();
            this.f118372l.f118070I = cVar.f118004a;
            this.f118372l.f118071J = cVar.f118005b;
        }
    }

    /* renamed from: d */
    public final void mo112370d(long j) {
        if (this.f118372l != null && this.f118372l.f118130ap <= 0) {
            this.f118372l.f118130ap = j;
        }
    }

    /* renamed from: l */
    public final void mo112404l(String str) {
        if (this.f118372l != null && !TextUtils.isEmpty(str)) {
            this.f118372l.f118104aP = str;
        }
    }

    /* renamed from: o */
    public final void mo112414o(long j) {
        if (this.f118372l != null && this.f118372l.f118161bT <= 0) {
            this.f118372l.f118161bT = j;
            this.f118372l.f118216cv = 0;
        }
    }

    /* renamed from: p */
    public final void mo112418p(String str) {
        if (this.f118372l != null) {
            this.f118372l.f118084W = 1;
            if (!TextUtils.isEmpty(str)) {
                this.f118372l.f118085X = str;
            }
        }
    }

    /* renamed from: s */
    public final void mo112425s(int i) {
        if (this.f118372l != null) {
            m144721a(0, false);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f118372l.f118133as <= 0) {
                this.f118372l.f118133as = currentTimeMillis;
            }
            if (i == 1 && this.f118348al > 0 && currentTimeMillis >= this.f118348al) {
                this.f118363b += currentTimeMillis - this.f118348al;
                this.f118348al = 0;
            }
            this.f118372l.f118199ce = currentTimeMillis;
        }
    }

    /* renamed from: a */
    public final void mo112326a(int i) {
        if (!this.f118374n || this.f118372l.f118223g <= 0) {
            this.f118372l.f118228l = System.currentTimeMillis();
        } else if (this.f118372l.f118229m <= 0) {
            this.f118372l.f118229m = System.currentTimeMillis();
        }
        m144720R(i);
    }

    /* renamed from: c */
    public final void mo112364c(long j) {
        if (this.f118372l != null && this.f118372l.f118128an <= 0) {
            this.f118372l.f118128an = j;
        }
    }

    /* renamed from: e */
    public final void mo112375e(long j) {
        if (this.f118372l != null && this.f118372l.f118129ao <= 0) {
            this.f118372l.f118129ao = j;
        }
    }

    /* renamed from: b */
    private void m144722b(C46083h hVar) {
        if (hVar != null) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            if (hVar.f117858d != null) {
                List<C46082g> a = hVar.f117858d.mo112249a();
                if (a != null && a.size() > 0) {
                    for (C46082g gVar : a) {
                        String resolution = gVar.f117830b.toString(gVar.f117802B);
                        hashMap.put(resolution, Long.valueOf(gVar.mo112222d(12)));
                        hashMap2.put(resolution, gVar.mo112220b(8));
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("duration", Integer.valueOf(hVar.mo112223a(3)));
            hashMap3.put("size", hashMap);
            hashMap3.put("codec", hashMap2);
            hashMap3.put("vtype", hVar.mo112241e());
            hashMap3.put("dynamic_type", hVar.mo112242f());
            this.f118382v = hashMap3;
            this.f118358av = hVar;
        }
    }

    /* renamed from: c */
    public final void mo112366c(String str) {
        this.f118304B = str;
    }

    /* renamed from: c */
    public final void mo112367c(Map map) {
        if (this.f118372l != null) {
            this.f118372l.f118146bE = map;
        }
    }

    /* renamed from: b */
    public final void mo112353b(long j) {
        if (this.f118372l != null && this.f118372l.f118127am <= 0) {
            this.f118372l.f118127am = j;
        }
    }

    /* renamed from: b */
    public final void mo112354b(C46117c cVar) {
        if (cVar != null) {
            this.f118383w.put("httpdns", cVar.mo112287a());
        }
    }

    /* renamed from: a */
    public final void mo112327a(int i, int i2) {
        this.f118375o = i;
        this.f118349am = i2;
    }

    /* renamed from: c */
    public final void mo112362c(int i, int i2) {
        if (this.f118372l != null) {
            this.f118372l.f118157bP = i2;
        }
    }

    /* renamed from: a */
    private void m144721a(int i, boolean z) {
        if (this.f118372l != null) {
            if (z) {
                this.f118372l.f118165bX = i;
                this.f118359aw = SystemClock.elapsedRealtime();
                return;
            }
            this.f118372l.f118165bX = Integer.MIN_VALUE;
            this.f118359aw = 0;
        }
    }

    /* renamed from: b */
    public final void mo112351b(int i, long j) {
        if (this.f118372l != null) {
            switch (i) {
                case 0:
                    if (this.f118372l.f118140az <= 0) {
                        this.f118372l.f118140az = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.f118372l.f118090aB <= 0) {
                        this.f118372l.f118090aB = j;
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: c */
    public final void mo112363c(int i, String str) {
        if (this.f118372l != null) {
            this.f118372l.f118072K = i;
            this.f118372l.f118073L = str;
            mo112431v(5);
        }
    }

    /* renamed from: b */
    public final void mo112350b(int i, int i2) {
        if (this.f118379s.size() <= 1) {
            switch (i) {
                case 0:
                    this.f118364c++;
                    break;
                case 1:
                    this.f118329a++;
                    break;
            }
        }
        if (this.f118372l != null) {
            m144721a(0, true);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f118372l.f118132ar <= 0) {
                this.f118372l.f118132ar = currentTimeMillis;
            }
            if (i == 1) {
                this.f118348al = currentTimeMillis;
            }
            this.f118372l.f118198cd = currentTimeMillis;
        }
    }

    public C46148h(Context context, C46141a aVar) {
        this.f118369i = aVar;
        this.f118372l = new C46145e();
        this.f118376p = new ArrayList();
        this.f118377q = new ArrayList();
        this.f118378r = new ArrayList();
        this.f118379s = new ArrayList();
        this.f118383w = new HashMap();
        this.f118374n = true;
        this.f118333aD = context;
    }

    /* renamed from: a */
    public final void mo112329a(int i, long j) {
        if (this.f118372l != null) {
            switch (i) {
                case 0:
                    if (this.f118372l.f118139ay <= 0) {
                        this.f118372l.f118139ay = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.f118372l.f118089aA <= 0) {
                        this.f118372l.f118089aA = j;
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo112352b(int i, String str) {
        if (i == 0) {
            this.f118373m = true;
        }
        switch (i) {
            case 0:
                this.f118352ap = "local_url";
                break;
            case 1:
                this.f118352ap = "dir_url";
                break;
            case 2:
                this.f118352ap = "playitem";
                break;
            case 3:
                this.f118352ap = "preload";
                break;
            case 4:
                this.f118352ap = C22704b.f60414c;
                break;
            case 5:
                this.f118352ap = "vid";
                break;
            case 6:
                this.f118352ap = "fd";
                break;
            case 7:
                this.f118352ap = "mds";
                break;
        }
        this.f118370j = str;
        this.f118353aq = 0;
    }

    /* renamed from: a */
    public final void mo112330a(int i, String str) {
        this.f118354ar = i;
        this.f118355as = str;
    }

    /* renamed from: a */
    public final void mo112328a(int i, int i2, boolean z) {
        if (!z) {
            this.f118361ay = System.currentTimeMillis();
            if (this.f118372l != null) {
                this.f118372l.f118196cb = this.f118361ay;
                this.f118372l.f118202ch = i2;
            }
            this.f118361ay = SystemClock.elapsedRealtime();
        }
        m144721a(2, true);
    }

    /* renamed from: a */
    public final void mo112331a(int i, String str, String str2, String str3) {
        this.f118316N = i;
        if (str != null) {
            this.f118317O = str;
        }
        if (str2 != null) {
            this.f118318P = str2;
        }
        if (str3 != null) {
            this.f118319Q = str3;
        }
    }
}
