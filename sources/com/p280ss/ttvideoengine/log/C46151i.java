package com.p280ss.ttvideoengine.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.C1642a;
import com.p280ss.ttm.player.PlaybackParams;
import com.p280ss.ttvideoengine.Resolution;
import com.p280ss.ttvideoengine.p1808a.C46030a;
import com.p280ss.ttvideoengine.p1811d.C46073b;
import com.p280ss.ttvideoengine.p1811d.C46074c;
import com.p280ss.ttvideoengine.p1812e.C46083h;
import com.p280ss.ttvideoengine.p1813f.C46092d;
import com.p280ss.ttvideoengine.p1816i.C46115b;
import com.p280ss.ttvideoengine.p1816i.C46117c;
import com.p280ss.ttvideoengine.p1816i.C46122g;
import com.p280ss.ttvideoengine.p1816i.C46123h;
import com.p280ss.ttvideoengine.p1816i.C46125j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.log.i */
public final class C46151i implements C46143c {

    /* renamed from: A */
    private String f118393A;

    /* renamed from: B */
    private String f118394B = "";

    /* renamed from: C */
    private String f118395C = "";

    /* renamed from: D */
    private String f118396D = "";

    /* renamed from: E */
    private String f118397E = "";

    /* renamed from: F */
    private int f118398F;

    /* renamed from: G */
    private String f118399G = "";

    /* renamed from: H */
    private String f118400H = "";

    /* renamed from: I */
    private String f118401I = "";

    /* renamed from: J */
    private int f118402J;

    /* renamed from: K */
    private int f118403K;

    /* renamed from: L */
    private int f118404L;

    /* renamed from: M */
    private int f118405M;

    /* renamed from: N */
    private int f118406N;

    /* renamed from: O */
    private Map f118407O;

    /* renamed from: P */
    private int f118408P = -1;

    /* renamed from: Q */
    private String f118409Q = "";

    /* renamed from: R */
    private String f118410R = "";

    /* renamed from: S */
    private int f118411S;

    /* renamed from: T */
    private int f118412T;

    /* renamed from: U */
    private int f118413U;

    /* renamed from: V */
    private int f118414V;

    /* renamed from: W */
    private int f118415W;

    /* renamed from: X */
    private long f118416X;

    /* renamed from: Y */
    private int f118417Y = -1;

    /* renamed from: Z */
    private long f118418Z;

    /* renamed from: a */
    public int f118419a;

    /* renamed from: aa */
    private int f118420aa = -1;

    /* renamed from: ab */
    private int f118421ab;

    /* renamed from: ac */
    private int f118422ac = -1;

    /* renamed from: ad */
    private int f118423ad;

    /* renamed from: ae */
    private int f118424ae = -1;

    /* renamed from: af */
    private String f118425af;

    /* renamed from: ag */
    private int f118426ag;

    /* renamed from: ah */
    private int f118427ah;

    /* renamed from: ai */
    private C46083h f118428ai;

    /* renamed from: aj */
    private long f118429aj;

    /* renamed from: ak */
    private int f118430ak;

    /* renamed from: al */
    private long f118431al;

    /* renamed from: am */
    private int f118432am;

    /* renamed from: an */
    private int f118433an;

    /* renamed from: ao */
    private int f118434ao;

    /* renamed from: ap */
    private int f118435ap;

    /* renamed from: aq */
    private Context f118436aq;

    /* renamed from: b */
    public long f118437b;

    /* renamed from: c */
    public int f118438c;

    /* renamed from: d */
    public int f118439d;

    /* renamed from: e */
    public long f118440e;

    /* renamed from: f */
    public long f118441f;

    /* renamed from: g */
    private C46141a f118442g;

    /* renamed from: h */
    private C46157m f118443h;

    /* renamed from: i */
    private C46154j f118444i;

    /* renamed from: j */
    private C46155k f118445j;

    /* renamed from: k */
    private C46156l f118446k;

    /* renamed from: l */
    private C46146f f118447l;

    /* renamed from: m */
    private boolean f118448m;

    /* renamed from: n */
    private boolean f118449n;

    /* renamed from: o */
    private boolean f118450o;

    /* renamed from: p */
    private int f118451p;

    /* renamed from: q */
    private ArrayList f118452q;

    /* renamed from: r */
    private ArrayList f118453r;

    /* renamed from: s */
    private ArrayList f118454s;

    /* renamed from: t */
    private ArrayList f118455t;

    /* renamed from: u */
    private Map f118456u;

    /* renamed from: v */
    private Map f118457v;

    /* renamed from: w */
    private Map f118458w;

    /* renamed from: x */
    private String f118459x;

    /* renamed from: y */
    private String f118460y;

    /* renamed from: z */
    private String f118461z;

    /* renamed from: com.ss.ttvideoengine.log.i$a */
    static class C46152a implements Runnable {

        /* renamed from: a */
        C46151i f118462a;

        /* renamed from: b */
        private C46157m f118463b;

        /* renamed from: c */
        private Context f118464c;

        /* renamed from: d */
        private Handler f118465d = new Handler(Looper.getMainLooper());

        public final void run() {
            if (this.f118463b != null) {
                this.f118463b.f118619bf = (int) C46122g.m144531b(this.f118464c);
                if (TextUtils.isEmpty(this.f118463b.f118552aR)) {
                    this.f118463b.f118552aR = C46030a.m144223a().mo112111a(this.f118463b.f118551aQ);
                }
                final JSONObject a = this.f118463b.mo112465a();
                if (this.f118465d == null || this.f118465d.getLooper() == null) {
                    VideoEventManager.instance.addEvent(a);
                    return;
                }
                this.f118465d.post(new Runnable() {
                    public final void run() {
                        VideoEventManager.instance.addEvent(a);
                    }
                });
                this.f118462a.mo112450o();
            }
        }

        public C46152a(Context context, C46157m mVar, C46151i iVar) {
            this.f118463b = mVar;
            this.f118464c = context;
            this.f118462a = iVar;
        }
    }

    /* renamed from: M */
    public final void mo112319M(int i) {
    }

    /* renamed from: N */
    public final void mo112320N(int i) {
    }

    /* renamed from: O */
    public final void mo112321O(int i) {
    }

    /* renamed from: P */
    public final void mo112322P(int i) {
    }

    /* renamed from: l */
    public final int mo112401l() {
        return this.f118419a;
    }

    /* renamed from: m */
    public final long mo112405m() {
        return this.f118437b;
    }

    /* renamed from: r */
    public final void mo112423r(long j) {
    }

    /* renamed from: x */
    public final void mo112436x(String str) {
    }

    /* renamed from: a */
    public final void mo112346a(boolean z) {
        if (z) {
            this.f118402J = 1;
        } else {
            this.f118402J = 0;
        }
    }

    /* renamed from: a */
    public final void mo112335a(C46083h hVar) {
        if (hVar != null) {
            m144863b(hVar);
        }
    }

    /* renamed from: a */
    public final void mo112345a(Map map) {
        this.f118457v = map;
    }

    /* renamed from: b */
    public final void mo112357b(String str) {
        this.f118460y = str;
        if (this.f118447l != null) {
            this.f118447l.f118283h = str;
        }
    }

    /* renamed from: a */
    public final void mo112333a(long j, int i) {
        if (this.f118443h != null && this.f118443h.f118530W <= 0) {
            this.f118443h.f118530W = j;
            this.f118443h.f118610bW = i;
        }
    }

    /* renamed from: a */
    public final void mo112332a(long j) {
        if (this.f118443h != null && this.f118443h.f118531X <= 0) {
            this.f118443h.f118531X = j;
        }
    }

    /* renamed from: a */
    public final void mo112344a(ArrayList arrayList) {
        this.f118455t = arrayList;
    }

    /* renamed from: a */
    public final void mo112342a(String str, long j, String str2) {
        mo112450o();
        this.f118435ap = 1;
        this.f118443h = new C46157m(this.f118447l);
        this.f118447l.mo112444a(str, str2);
        this.f118443h.f118534a = j;
        this.f118443h.f118640c = 0;
        this.f118443h.f118644d = 0;
        this.f118443h.f118530W = 0;
        this.f118443h.f118531X = 0;
        this.f118443h.f118532Y = 0;
        this.f118443h.f118533Z = 0;
        this.f118443h.f118561aa = 0;
        this.f118443h.f118562ab = 0;
        this.f118443h.f118563ac = 0;
        this.f118443h.f118571ak = 0;
        this.f118443h.f118573am = 0;
        this.f118443h.f118572al = 0;
        this.f118443h.f118574an = 0;
        this.f118423ad++;
        this.f118443h.f118595bH = -2147483648L;
        this.f118443h.f118596bI = -2147483648L;
        this.f118443h.f118597bJ = -2147483648L;
        this.f118443h.f118598bK = -2147483648L;
        this.f118443h.f118599bL = -2147483648L;
        this.f118443h.f118600bM = -2147483648L;
        this.f118443h.f118601bN = Integer.MIN_VALUE;
        if (this.f118447l.f118293r.equals("vid")) {
            m144862a(-1002, true);
        } else if (this.f118447l.f118293r.equals("local_url")) {
            m144862a(-1005, true);
        } else if (this.f118443h.f118610bW == 0) {
            m144862a(-1003, true);
        } else {
            if (this.f118443h.f118610bW == 1) {
                m144862a(-1005, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo112338a(C46117c cVar, int i) {
        HashMap a = cVar.mo112287a();
        a.put("apiver", Integer.valueOf(i));
        this.f118452q.add(a);
    }

    /* renamed from: a */
    public final void mo112340a(C46117c cVar, String str) {
        if (cVar != null) {
            HashMap a = cVar.mo112287a();
            if (str == null) {
                str = "";
            }
            a.put("url", str);
            this.f118456u.put("player", a);
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
            this.f118456u.put("cdn", a);
        }
    }

    /* renamed from: a */
    public final void mo112337a(C46117c cVar) {
        if (cVar != null) {
            this.f118456u.put("localdns", cVar.mo112287a());
        }
    }

    /* renamed from: a */
    public final void mo112336a(C46083h hVar, C46117c cVar) {
        if (cVar != null) {
            this.f118456u.put("api", cVar.mo112287a());
            return;
        }
        if (hVar != null) {
            m144863b(hVar);
            this.f118443h.f118587b = System.currentTimeMillis();
            this.f118450o = true;
            if (this.f118443h.f118610bW == 1) {
                m144862a(-1005, true);
            } else if (this.f118443h.f118610bW == 0) {
                m144862a(-1004, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo112343a(String str, String str2) {
        this.f118447l.mo112446b(str, str2);
    }

    /* renamed from: b */
    public final void mo112358b(String str, String str2) {
        if (this.f118435ap == 4) {
            this.f118446k.mo112463a("switch", 0);
        }
        if (this.f118435ap == 3) {
            this.f118445j.mo112459a("switch");
        }
        this.f118443h.f118646f = System.currentTimeMillis();
        if (str != str2) {
            this.f118426ag++;
        }
        this.f118447l.mo112446b(str, str2);
    }

    /* renamed from: a */
    public final void mo112339a(C46117c cVar, int i, int i2) {
        if ((cVar.f118006c.equals("kTTVideoErrorDomainVideoOwnPlayer") || cVar.f118006c.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.f118455t.size() <= 1) {
            this.f118439d++;
        }
        HashMap a = cVar.mo112287a();
        a.put("strategy", Integer.valueOf(i));
        a.put("apiver", Integer.valueOf(i2));
        this.f118454s.add(a);
        m144864e(cVar);
        m144866q();
        if (this.f118444i != null) {
            this.f118444i.mo112456a(cVar, i, i2);
        }
        if (this.f118435ap == 3) {
            this.f118445j.mo112457a();
        }
        if (this.f118435ap == 4) {
            this.f118446k.mo112461a();
        }
        if (this.f118449n) {
            switch (i) {
                case 1:
                    this.f118443h.f118587b = 0;
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    return;
            }
            this.f118443h.f118639bz = 0;
            this.f118443h.f118588bA = 0;
            this.f118443h.f118530W = 0;
            if (this.f118443h.f118610bW == 1) {
                this.f118443h.f118639bz = 0;
                this.f118443h.f118588bA = 0;
                this.f118443h.f118530W = 0;
            }
            this.f118443h.f118640c = 0;
            this.f118443h.f118644d = 0;
            this.f118443h.f118531X = 0;
            this.f118443h.f118532Y = 0;
            this.f118443h.f118561aa = 0;
            this.f118443h.f118533Z = 0;
            this.f118443h.f118563ac = 0;
            this.f118443h.f118562ab = 0;
            this.f118443h.f118571ak = 0;
            this.f118443h.f118572al = 0;
            this.f118443h.f118573am = 0;
            this.f118443h.f118574an = 0;
        }
    }

    /* renamed from: b */
    public final void mo112355b(C46117c cVar, int i) {
        if (this.f118435ap == 4) {
            this.f118446k.mo112463a("error", 0);
        }
        if (this.f118435ap == 3) {
            this.f118445j.mo112459a("error");
        }
        this.f118435ap = 5;
        HashMap a = cVar.mo112287a();
        a.put("strategy", Integer.valueOf(0));
        a.put("apiver", Integer.valueOf(i));
        this.f118454s.add(a);
        if (this.f118449n) {
            this.f118443h.f118647g = System.currentTimeMillis();
        } else {
            if ((cVar.f118006c.equals("kTTVideoErrorDomainVideoOwnPlayer") || cVar.f118006c.equals("kTTVideoErrorDomainVideoOSPlayer")) && this.f118455t.size() <= 1) {
                this.f118439d++;
            }
            this.f118443h.f118646f = System.currentTimeMillis();
        }
        m144864e(cVar);
        this.f118447l.mo112441a();
        if (this.f118444i != null) {
            this.f118444i.mo112455a(cVar);
        }
        this.f118443h.f118661u = cVar.mo112288b();
        this.f118443h.f118662v = cVar.f118004a;
        m144861S(4);
    }

    /* renamed from: a */
    public final void mo112334a(PlaybackParams playbackParams) {
        if (this.f118443h != null) {
            this.f118407O = new HashMap();
            this.f118407O.put("AFMode", Integer.valueOf(playbackParams.getAudioFallbackMode()));
            this.f118407O.put("pitch", Float.valueOf(playbackParams.getPitch()));
            this.f118407O.put("speed", Float.valueOf(playbackParams.getSpeed()));
            this.f118447l.f118251I = playbackParams.getSpeed();
        }
    }

    /* renamed from: h */
    public final void mo112385h() {
        this.f118416X = System.currentTimeMillis();
    }

    /* renamed from: i */
    public final void mo112389i() {
        this.f118406N++;
    }

    /* renamed from: g */
    public final void mo112381g() {
        if (this.f118443h != null) {
            this.f118443h.f118585ay = 1;
        }
    }

    /* renamed from: j */
    public final String mo112393j() {
        if (this.f118443h != null) {
            return this.f118443h.f118603bP;
        }
        return null;
    }

    /* renamed from: a */
    public final void mo112324a() {
        if (this.f118443h.f118640c <= 0) {
            this.f118443h.f118640c = System.currentTimeMillis();
        }
    }

    /* renamed from: b */
    public final void mo112347b() {
        if (this.f118443h.f118644d <= 0) {
            this.f118443h.f118644d = System.currentTimeMillis();
        }
    }

    /* renamed from: d */
    public final void mo112368d() {
        if (this.f118443h != null) {
            this.f118443h.f118599bL = System.currentTimeMillis();
        }
        m144862a(-2005, true);
    }

    /* renamed from: n */
    public final void mo112409n() {
        if (this.f118443h.f118642cb <= 0) {
            this.f118443h.f118642cb = System.currentTimeMillis();
        }
    }

    /* renamed from: q */
    private void m144866q() {
        if (this.f118442g != null) {
            Map b = this.f118442g.mo112104b();
            if (b != null) {
                int intValue = ((Long) b.get("vps")).intValue();
                if (this.f118434ao == 0) {
                    this.f118434ao += intValue - this.f118432am;
                    return;
                }
                this.f118434ao += intValue;
            }
        }
    }

    /* renamed from: c */
    public final void mo112360c() {
        if (this.f118435ap != 4) {
            this.f118435ap = 2;
            this.f118449n = false;
            if (this.f118443h.f118645e <= 0) {
                this.f118443h.f118645e = System.currentTimeMillis();
                if (this.f118444i != null) {
                    this.f118444i.mo112453a();
                }
                if (this.f118445j != null) {
                    this.f118445j.mo112460b();
                }
            }
            m144862a(-2001, true);
        }
    }

    /* renamed from: f */
    public final void mo112377f() {
        if (this.f118431al > 0) {
            this.f118430ak = (int) (((long) this.f118430ak) + (SystemClock.elapsedRealtime() - this.f118431al));
            this.f118431al = 0;
            if (this.f118443h != null) {
                this.f118443h.f118596bI = System.currentTimeMillis();
            }
        }
    }

    /* renamed from: o */
    public final void mo112450o() {
        this.f118449n = true;
        this.f118450o = false;
        this.f118452q.clear();
        this.f118453r.clear();
        this.f118454s.clear();
        this.f118456u.clear();
        this.f118435ap = 0;
        this.f118429aj = 0;
        this.f118434ao = 0;
    }

    /* renamed from: p */
    private void m144865p() {
        if (!(this.f118428ai == null || this.f118444i.f118471d == Integer.MIN_VALUE)) {
            Resolution[] g = this.f118428ai.mo112243g();
            if (g != null) {
                int a = this.f118428ai.mo112223a(7);
                HashMap hashMap = new HashMap();
                for (Resolution resolution : g) {
                    hashMap.put(resolution.toString(a), this.f118428ai.mo112232a(resolution));
                }
                HashMap hashMap2 = new HashMap();
                hashMap2.put("url", hashMap);
                this.f118443h.f118590bC = hashMap2;
            }
        }
    }

    /* renamed from: e */
    public final void mo112373e() {
        if (this.f118435ap == 4) {
            this.f118446k.mo112463a("wait", 0);
        }
        if (this.f118435ap == 3) {
            this.f118435ap = 2;
        }
        if (this.f118443h != null) {
            this.f118443h.f118600bM = System.currentTimeMillis();
        }
        m144862a(-2005, false);
    }

    /* renamed from: k */
    public final void mo112397k() {
        this.f118448m = false;
        this.f118449n = true;
        this.f118452q.clear();
        this.f118453r.clear();
        this.f118454s.clear();
        this.f118455t.clear();
        this.f118456u.clear();
        this.f118457v = null;
        this.f118458w = null;
        this.f118459x = null;
        this.f118460y = null;
        this.f118461z = null;
        this.f118393A = null;
        this.f118394B = null;
        this.f118395C = null;
        this.f118397E = "";
        this.f118398F = 0;
        this.f118399G = "";
        this.f118400H = "";
        this.f118401I = "";
        this.f118403K = 0;
        this.f118404L = 0;
        this.f118405M = 0;
        this.f118407O = null;
        this.f118411S = 0;
        this.f118412T = 0;
        this.f118438c = 0;
        this.f118419a = 0;
        this.f118439d = 0;
        this.f118440e = 0;
        this.f118441f = 0;
        this.f118437b = 0;
        this.f118427ah = 0;
        this.f118426ag = 0;
        this.f118433an = 0;
        this.f118432am = 0;
        this.f118434ao = 0;
    }

    /* renamed from: r */
    private void m144867r() {
        if (this.f118443h != null && this.f118443h.f118534a > 0) {
            if (this.f118442g != null) {
                Map b = this.f118442g.mo112104b();
                if (b != null) {
                    int intValue = ((Long) b.get("vps")).intValue();
                    int intValue2 = ((Long) b.get("vds")).intValue();
                    if (this.f118434ao == 0) {
                        this.f118443h.f118653m = intValue - this.f118432am;
                        this.f118432am = intValue;
                    } else {
                        this.f118443h.f118653m = this.f118434ao + intValue;
                        this.f118432am = this.f118443h.f118653m;
                    }
                    this.f118443h.f118654n = intValue2 - this.f118433an;
                    this.f118433an = intValue2;
                    this.f118443h.f118657q = ((Long) b.get("download_speed")).longValue();
                }
                this.f118443h.f118614ba = this.f118442g.mo112101a(1);
                mo112430u(this.f118442g.mo112101a(2));
                this.f118443h.f118616bc = this.f118442g.mo112101a(3);
                this.f118443h.f118617bd = this.f118442g.mo112101a(4);
                if (TextUtils.isEmpty(this.f118443h.f118552aR)) {
                    this.f118443h.f118552aR = this.f118442g.mo112101a(20);
                }
                this.f118443h.f118582av = this.f118442g.mo112105c(22);
                this.f118443h.f118580at = this.f118442g.mo112105c(21);
                this.f118443h.f118581au = this.f118442g.mo112105c(23);
                this.f118443h.f118637bx = this.f118442g.mo112105c(34);
                this.f118443h.f118636bw = this.f118442g.mo112105c(35);
                this.f118443h.f118638by = this.f118442g.mo112105c(36);
                if (this.f118443h.f118586az == null) {
                    String a = this.f118442g.mo112101a(5);
                    if (a == null) {
                        a = "";
                    }
                    this.f118443h.f118586az = a;
                }
                String a2 = this.f118442g.mo112101a(33);
                if (!TextUtils.isEmpty(a2)) {
                    this.f118443h.f118535aA = a2;
                }
                String a3 = this.f118442g.mo112101a(37);
                if (!TextUtils.isEmpty(a3)) {
                    this.f118443h.f118536aB = a3;
                }
                if (this.f118443h.f118530W <= 0) {
                    this.f118443h.f118610bW = 1;
                    this.f118443h.f118530W = this.f118442g.mo112103b(7);
                }
                if (this.f118443h.f118531X <= 0) {
                    this.f118443h.f118531X = this.f118442g.mo112103b(10);
                }
                if (this.f118443h.f118532Y <= 0) {
                    this.f118443h.f118532Y = this.f118442g.mo112103b(11);
                }
                if (this.f118443h.f118533Z <= 0) {
                    this.f118443h.f118533Z = this.f118442g.mo112103b(12);
                }
                if (this.f118443h.f118561aa <= 0) {
                    this.f118443h.f118561aa = this.f118442g.mo112103b(13);
                }
                if (this.f118443h.f118562ab <= 0) {
                    this.f118443h.f118562ab = this.f118442g.mo112103b(14);
                }
                if (this.f118443h.f118563ac <= 0) {
                    this.f118443h.f118563ac = this.f118442g.mo112103b(15);
                }
                if (this.f118443h.f118571ak <= 0) {
                    this.f118443h.f118571ak = this.f118442g.mo112103b(17);
                }
                if (this.f118443h.f118573am <= 0) {
                    this.f118443h.f118573am = this.f118442g.mo112103b(16);
                }
                if (this.f118443h.f118572al <= 0) {
                    this.f118443h.f118572al = this.f118442g.mo112103b(19);
                }
                if (this.f118443h.f118574an <= 0) {
                    this.f118443h.f118574an = this.f118442g.mo112103b(18);
                }
                this.f118443h.f118619bf = this.f118442g.mo112105c(26);
                this.f118443h.f118620bg = this.f118442g.mo112105c(27);
                this.f118443h.f118539aE = this.f118442g.mo112105c(30);
                this.f118443h.f118633bt = this.f118442g.mo112101a(31);
                this.f118443h.f118634bu = this.f118442g.mo112101a(32);
            }
            if (this.f118411S > 0) {
                this.f118447l.f118295t = this.f118411S;
            }
            this.f118443h.f118538aD = this.f118424ae;
            this.f118443h.f118540aF = this.f118425af;
            this.f118443h.f118546aL = this.f118412T;
            this.f118443h.f118547aM = this.f118447l.f118248F;
            this.f118443h.f118548aN = this.f118415W;
            this.f118443h.f118652l = this.f118455t;
            this.f118443h.f118660t = this.f118447l.f118243A;
            this.f118443h.f118659s = this.f118447l.f118244B;
            this.f118443h.f118517J = this.f118456u;
            this.f118443h.f118521N = this.f118398F;
            this.f118443h.f118522O = this.f118399G;
            this.f118443h.f118523P = this.f118400H;
            this.f118443h.f118524Q = this.f118401I;
            this.f118443h.f118525R = this.f118402J;
            this.f118443h.f118526S = this.f118403K;
            this.f118443h.f118527T = this.f118404L;
            this.f118443h.f118528U = this.f118405M;
            this.f118443h.f118542aH = this.f118406N;
            this.f118443h.f118655o = this.f118413U;
            this.f118443h.f118656p = this.f118414V;
            this.f118443h.f118551aQ = this.f118409Q;
            this.f118443h.f118553aS = this.f118410R;
            this.f118443h.f118549aO = this.f118408P;
            this.f118443h.f118550aP = this.f118451p;
            this.f118443h.f118623bj = this.f118420aa;
            this.f118443h.f118628bo = this.f118423ad;
            this.f118443h.f118625bl = C46092d.m144462b();
            this.f118443h.f118649i = this.f118438c;
            this.f118443h.f118650j = this.f118419a;
            this.f118443h.f118651k = this.f118439d;
            this.f118443h.f118556aV = this.f118440e;
            this.f118443h.f118554aT = this.f118441f;
            this.f118443h.f118555aU = this.f118437b;
            this.f118443h.f118560aZ = this.f118427ah;
            this.f118443h.f118543aI = this.f118426ag;
            HashMap hashMap = new HashMap();
            int i = 0;
            while (i < this.f118452q.size() && i < 3) {
                hashMap.put(C1642a.m8034a("fetchretry%d", new Object[]{Integer.valueOf(i)}), this.f118452q.get(i));
                i++;
            }
            int i2 = 0;
            while (i2 < this.f118453r.size() && i2 < 3) {
                hashMap.put(C1642a.m8034a("ldns%d", new Object[]{Integer.valueOf(i2)}), ((C46117c) this.f118453r.get(i2)).mo112287a());
                i2++;
            }
            for (int i3 = 0; i3 < this.f118454s.size(); i3++) {
                if (i3 < 2 || i3 == this.f118454s.size() - 1) {
                    hashMap.put(C1642a.m8034a("error%d", new Object[]{Integer.valueOf(i3)}), this.f118454s.get(i3));
                }
            }
            if (!TextUtils.isEmpty(this.f118397E)) {
                hashMap.put("log", this.f118397E);
            }
            this.f118397E = "";
            this.f118443h.f118529V = hashMap;
            if (this.f118457v != null) {
                this.f118443h.f118509B = this.f118457v;
            }
            if (this.f118458w != null) {
                this.f118443h.f118510C = this.f118458w;
            }
            if (this.f118459x != null) {
                this.f118443h.f118511D = this.f118459x;
            }
            if (this.f118460y != null) {
                this.f118443h.f118512E = this.f118460y;
            }
            if (this.f118461z != null) {
                this.f118443h.f118513F = this.f118461z;
            }
            if (this.f118393A != null) {
                this.f118443h.f118514G = this.f118393A;
            }
            if (this.f118394B != null) {
                this.f118443h.f118515H = this.f118394B;
            }
            if (this.f118395C != null) {
                this.f118443h.f118516I = this.f118395C;
            }
            if (this.f118396D != null) {
                this.f118443h.f118615bb = this.f118396D;
            }
            if (this.f118407O != null) {
                this.f118443h.f118541aG = this.f118407O;
            }
            this.f118443h.f118621bh = this.f118421ab;
            this.f118443h.f118622bi = this.f118422ac;
            this.f118443h.f118632bs = this.f118417Y;
            if (this.f118443h.f118596bI < this.f118443h.f118595bH) {
                this.f118443h.f118596bI = -2147483648L;
            }
            if (this.f118443h.f118598bK < this.f118443h.f118597bJ) {
                this.f118443h.f118598bK = -2147483648L;
                long currentTimeMillis = System.currentTimeMillis() - this.f118443h.f118597bJ;
                this.f118443h.f118554aT += currentTimeMillis;
            }
            if (this.f118443h.f118600bM < this.f118443h.f118599bL) {
                this.f118443h.f118600bM = -2147483648L;
            }
            m144865p();
            if (this.f118429aj > 0) {
                this.f118443h.f118592bE = (int) (SystemClock.elapsedRealtime() - this.f118429aj);
            }
            if (this.f118430ak > 0) {
                this.f118443h.f118594bG = this.f118430ak;
            }
            if (C46125j.m144552b()) {
                this.f118443h.f118602bO = C46125j.m144549a() - System.currentTimeMillis();
            }
            C46115b.m144501a((Runnable) new C46152a(this.f118436aq, this.f118443h, this));
            this.f118438c = 0;
            this.f118419a = 0;
            this.f118439d = 0;
            this.f118440e = 0;
            this.f118441f = 0;
            this.f118437b = 0;
            this.f118406N = 0;
            this.f118426ag = 0;
            this.f118427ah = 0;
            this.f118431al = 0;
            this.f118430ak = 0;
        }
    }

    /* renamed from: F */
    public final void mo112312F(int i) {
        this.f118408P = i;
    }

    /* renamed from: H */
    public final void mo112314H(int i) {
        this.f118421ab = i;
    }

    /* renamed from: I */
    public final void mo112315I(int i) {
        this.f118422ac = i;
    }

    /* renamed from: a */
    public final void mo112341a(String str) {
        this.f118459x = str;
    }

    /* renamed from: b */
    public final void mo112359b(Map map) {
        this.f118458w = map;
    }

    /* renamed from: d */
    public final void mo112369d(int i) {
        this.f118398F = i;
    }

    /* renamed from: e */
    public final void mo112374e(int i) {
        this.f118404L = i;
    }

    /* renamed from: f */
    public final void mo112378f(int i) {
        this.f118405M = 1;
    }

    /* renamed from: g */
    public final void mo112382g(int i) {
        this.f118413U = i;
    }

    /* renamed from: h */
    public final void mo112386h(int i) {
        this.f118414V = i;
    }

    /* renamed from: i */
    public final void mo112390i(int i) {
        this.f118417Y = i;
    }

    /* renamed from: j */
    public final void mo112396j(String str) {
        this.f118395C = str;
    }

    /* renamed from: o */
    public final void mo112413o(int i) {
        this.f118412T = i;
    }

    /* renamed from: q */
    public final void mo112419q(int i) {
        this.f118415W = i;
    }

    /* renamed from: t */
    public final void mo112428t(String str) {
        this.f118396D = str;
    }

    /* renamed from: G */
    public final void mo112313G(int i) {
        this.f118447l.f118245C = i;
    }

    /* renamed from: J */
    public final void mo112316J(int i) {
        this.f118443h.f118544aJ = i;
    }

    /* renamed from: K */
    public final void mo112317K(int i) {
        this.f118443h.f118618be = i;
    }

    /* renamed from: Q */
    public final C46073b mo112323Q(int i) {
        return C46074c.m144379a(i, this.f118443h);
    }

    /* renamed from: b */
    public final void mo112349b(int i) {
        this.f118447l.f118291p = 1;
    }

    /* renamed from: c */
    public final void mo112361c(int i) {
        this.f118447l.f118294s = i;
    }

    /* renamed from: k */
    public final void mo112398k(int i) {
        this.f118447l.f118249G = i;
    }

    /* renamed from: n */
    public final void mo112410n(int i) {
        this.f118411S = i;
        this.f118447l.f118295t = i;
    }

    /* renamed from: p */
    public final void mo112416p(int i) {
        this.f118447l.f118248F = i;
    }

    /* renamed from: r */
    public final void mo112424r(String str) {
        if (str != null) {
            this.f118409Q = str;
        }
    }

    /* renamed from: s */
    public final void mo112426s(String str) {
        if (str != null) {
            this.f118410R = str;
        }
    }

    /* renamed from: b */
    private void m144863b(C46083h hVar) {
        if (hVar != null) {
            this.f118447l.mo112443a(hVar);
            this.f118428ai = hVar;
        }
    }

    /* renamed from: A */
    public final void mo112307A(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118570aj = i;
        }
    }

    /* renamed from: B */
    public final void mo112308B(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118579as = i;
        }
    }

    /* renamed from: C */
    public final void mo112309C(int i) {
        if (this.f118443h != null && i > 0) {
            this.f118443h.f118607bT = i;
        }
    }

    /* renamed from: D */
    public final void mo112310D(int i) {
        if (this.f118443h != null && i > 0) {
            this.f118443h.f118608bU = i;
        }
    }

    /* renamed from: E */
    public final void mo112311E(int i) {
        if (this.f118443h != null && i >= 0) {
            this.f118443h.f118609bV = i;
        }
    }

    /* renamed from: L */
    public final void mo112318L(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118545aK = i;
        }
    }

    /* renamed from: a */
    public final void mo112325a(float f) {
        if (this.f118443h != null) {
            this.f118443h.f118567ag = f;
        }
    }

    /* renamed from: d */
    public final void mo112371d(C46117c cVar) {
        this.f118443h.f118518K = 1;
        this.f118454s.add(cVar);
    }

    /* renamed from: f */
    public final void mo112380f(String str) {
        this.f118393A = str;
        if (this.f118447l != null) {
            this.f118447l.f118285j = str;
        }
    }

    /* renamed from: h */
    public final void mo112388h(String str) {
        this.f118394B = str;
    }

    /* renamed from: i */
    public final void mo112392i(String str) {
        if (this.f118447l != null) {
            this.f118447l.f118289n = str;
        }
    }

    /* renamed from: k */
    public final void mo112400k(String str) {
        if (this.f118447l != null) {
            this.f118447l.f118290o = str;
        }
    }

    /* renamed from: l */
    public final void mo112402l(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118604bQ = i;
        }
    }

    /* renamed from: m */
    public final void mo112407m(long j) {
        if (this.f118443h != null) {
            this.f118443h.f118557aW = (int) j;
        }
    }

    /* renamed from: n */
    public final void mo112411n(long j) {
        if (this.f118443h != null) {
            this.f118443h.f118558aX = (int) j;
        }
    }

    /* renamed from: q */
    public final void mo112421q(String str) {
        if (this.f118443h != null) {
            this.f118443h.f118630bq = str;
        }
    }

    /* renamed from: t */
    public final void mo112427t(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118583aw = i;
        }
    }

    /* renamed from: u */
    public final void mo112429u(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118584ax = i;
        }
    }

    /* renamed from: v */
    public final void mo112432v(String str) {
        if (this.f118443h != null) {
            this.f118443h.f118603bP = str;
        }
        this.f118447l.f118252J = str;
    }

    /* renamed from: w */
    public final void mo112433w(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118566af = (long) i;
        }
    }

    /* renamed from: x */
    public final void mo112435x(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118629bp = i;
        }
    }

    /* renamed from: y */
    public final void mo112437y(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118631br = i;
        }
    }

    /* renamed from: z */
    public final void mo112439z(int i) {
        if (this.f118443h != null) {
            this.f118443h.f118624bk = i;
        }
    }

    /* renamed from: c */
    public final void mo112364c(long j) {
        if (this.f118443h != null && this.f118443h.f118533Z <= 0) {
            this.f118443h.f118533Z = j;
        }
    }

    /* renamed from: e */
    public final void mo112375e(long j) {
        if (this.f118443h != null && this.f118443h.f118561aa <= 0) {
            this.f118443h.f118561aa = j;
        }
    }

    /* renamed from: f */
    public final void mo112379f(long j) {
        if (this.f118443h != null && this.f118443h.f118563ac <= 0) {
            this.f118443h.f118563ac = j;
        }
    }

    /* renamed from: g */
    public final void mo112383g(long j) {
        if (this.f118443h != null && this.f118443h.f118576ap <= 0) {
            this.f118443h.f118576ap = j;
        }
    }

    /* renamed from: h */
    public final void mo112387h(long j) {
        if (this.f118443h != null && this.f118443h.f118577aq <= 0) {
            this.f118443h.f118577aq = j;
        }
    }

    /* renamed from: i */
    public final void mo112391i(long j) {
        if (this.f118443h != null && this.f118443h.f118578ar <= 0) {
            this.f118443h.f118578ar = j;
        }
    }

    /* renamed from: j */
    public final void mo112395j(long j) {
        if (this.f118443h != null && j > 0) {
            this.f118440e += j;
        }
    }

    /* renamed from: k */
    public final void mo112399k(long j) {
        if (this.f118443h != null && j > 0) {
            this.f118441f += j;
        }
    }

    /* renamed from: l */
    public final void mo112403l(long j) {
        if (this.f118443h != null) {
            this.f118443h.f118569ai = j;
        }
    }

    /* renamed from: m */
    public final void mo112406m(int i) {
        if (!(this.f118443h == null || i == -1)) {
            if (this.f118443h.f118605bR == -1) {
                this.f118443h.f118605bR = i;
                return;
            }
            this.f118443h.f118606bS = i;
        }
    }

    /* renamed from: o */
    public final void mo112415o(String str) {
        if (this.f118447l != null && str != null && !str.isEmpty()) {
            this.f118447l.f118247E = str;
        }
    }

    /* renamed from: p */
    public final void mo112417p(long j) {
        if (this.f118443h != null && this.f118443h.f118588bA <= 0) {
            this.f118443h.f118588bA = j;
            m144862a(-1005, true);
        }
    }

    /* renamed from: q */
    public final void mo112420q(long j) {
        if (this.f118443h != null && this.f118443h.f118589bB <= 0) {
            this.f118443h.f118589bB = j;
        }
    }

    /* renamed from: r */
    public final void mo112422r(int i) {
        m144862a(-2002, false);
        this.f118435ap = 2;
        this.f118446k.mo112463a("wait", i);
    }

    /* renamed from: u */
    public final void mo112430u(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f118397E);
            sb.append(str);
            this.f118397E = sb.toString();
        }
    }

    /* renamed from: w */
    public final void mo112434w(String str) {
        if (this.f118443h != null) {
            this.f118443h.f118627bn = str;
        }
    }

    /* renamed from: y */
    public final void mo112438y(String str) {
        if (this.f118443h != null && !TextUtils.isEmpty(str)) {
            this.f118443h.f118537aC = str;
        }
    }

    /* renamed from: R */
    private void m144860R(int i) {
        if (i == 6 || i == 0) {
            this.f118443h.f118591bD = -1005;
        } else if (i == 1 || i == 4 || i == 2 || i == 3 || i == 7) {
            this.f118443h.f118591bD = -1004;
        } else {
            if (i == 5) {
                this.f118443h.f118591bD = -1002;
            }
        }
    }

    /* renamed from: S */
    private void m144861S(int i) {
        this.f118443h.f118593bF = i;
        m144867r();
        this.f118447l = new C46146f(this.f118442g);
        this.f118447l.f118254L = this.f118436aq;
        this.f118443h = new C46157m(this.f118447l);
        this.f118446k = new C46156l(this.f118447l);
        this.f118445j = new C46155k(this.f118447l, this.f118446k);
        this.f118444i = new C46154j(this.f118447l);
    }

    /* renamed from: e */
    private void m144864e(C46117c cVar) {
        if (this.f118443h != null && this.f118443h.f118664x == Integer.MIN_VALUE && this.f118443h.f118663w == Integer.MIN_VALUE && this.f118443h.f118665y == Integer.MIN_VALUE) {
            this.f118443h.f118663w = cVar.mo112288b();
            this.f118443h.f118664x = cVar.f118004a;
            this.f118443h.f118665y = cVar.f118005b;
        }
    }

    /* renamed from: b */
    public final void mo112348b(float f) {
        if (this.f118443h != null) {
            this.f118443h.f118568ah = f;
        }
    }

    /* renamed from: d */
    public final void mo112370d(long j) {
        if (this.f118443h != null && this.f118443h.f118562ab <= 0) {
            this.f118443h.f118562ab = j;
        }
    }

    /* renamed from: g */
    public final void mo112384g(String str) {
        if (this.f118447l != null && str != null && !str.isEmpty()) {
            this.f118447l.f118288m = str;
        }
    }

    /* renamed from: j */
    public final void mo112394j(int i) {
        if (i == 1 || ((i != 0 && this.f118447l.f118293r.equals("dir_url")) || this.f118422ac == 1)) {
            this.f118443h.f118610bW = 1;
        } else {
            this.f118443h.f118610bW = 0;
        }
    }

    /* renamed from: l */
    public final void mo112404l(String str) {
        if (this.f118443h != null && !TextUtils.isEmpty(str)) {
            this.f118443h.f118586az = str;
        }
    }

    /* renamed from: m */
    public final void mo112408m(String str) {
        if (this.f118447l != null && str != null && !str.isEmpty()) {
            this.f118447l.f118246D = str;
        }
    }

    /* renamed from: n */
    public final void mo112412n(String str) {
        this.f118447l.f118250H = str;
    }

    /* renamed from: p */
    public final void mo112418p(String str) {
        if (this.f118443h != null) {
            this.f118443h.f118519L = 1;
            if (!TextUtils.isEmpty(str)) {
                this.f118443h.f118520M = str;
            }
        }
    }

    /* renamed from: v */
    public final void mo112431v(int i) {
        if (i != 5) {
            if (this.f118435ap == 4) {
                this.f118446k.mo112463a("wait", 0);
            }
            if (this.f118435ap == 3) {
                this.f118445j.mo112459a("wait");
            }
            this.f118447l.mo112441a();
        }
        if (this.f118449n) {
            this.f118443h.f118647g = System.currentTimeMillis();
        } else {
            this.f118443h.f118646f = System.currentTimeMillis();
        }
        m144861S(i);
    }

    /* renamed from: d */
    public final void mo112372d(String str) {
        this.f118461z = str;
        if (this.f118447l != null) {
            this.f118447l.f118284i = str;
        }
    }

    /* renamed from: o */
    public final void mo112414o(long j) {
        if (this.f118443h != null && this.f118443h.f118639bz <= 0) {
            this.f118443h.f118639bz = j;
            if (this.f118443h.f118610bW == 1) {
                this.f118443h.f118610bW = 0;
                m144862a(-1004, true);
            }
        }
    }

    /* renamed from: s */
    public final void mo112425s(int i) {
        if (i == 0 && this.f118435ap == 3) {
            this.f118435ap = 2;
            this.f118445j.mo112459a("wait");
        }
        if (this.f118443h != null) {
            if (i == 0) {
                if (this.f118435ap != 4) {
                    m144862a(-2003, false);
                }
            } else if (i == 1) {
                m144862a(-2004, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f118443h.f118565ae <= 0) {
                this.f118443h.f118565ae = currentTimeMillis;
            }
            if (i == 1 && this.f118418Z > 0 && currentTimeMillis >= this.f118418Z) {
                this.f118437b += currentTimeMillis - this.f118418Z;
                this.f118418Z = 0;
            }
            this.f118443h.f118598bK = currentTimeMillis;
        }
    }

    /* renamed from: a */
    public final void mo112326a(int i) {
        if (this.f118435ap == 4) {
            this.f118446k.mo112463a("exit", 0);
        }
        if (this.f118435ap == 3) {
            this.f118445j.mo112459a("exit");
        }
        this.f118435ap = 0;
        if (!this.f118449n || this.f118443h.f118534a <= 0) {
            this.f118443h.f118646f = System.currentTimeMillis();
        } else if (this.f118443h.f118647g <= 0) {
            this.f118443h.f118647g = System.currentTimeMillis();
        }
        this.f118447l.mo112441a();
        m144861S(i);
    }

    /* renamed from: c */
    public final void mo112365c(C46117c cVar) {
        this.f118453r.add(cVar);
    }

    /* renamed from: e */
    public final void mo112376e(String str) {
        if (this.f118447l != null && str != null && !str.isEmpty()) {
            this.f118447l.f118287l = str;
        }
    }

    /* renamed from: c */
    public final void mo112366c(String str) {
        if (this.f118447l != null && str != null && !str.isEmpty()) {
            this.f118447l.f118286k = str;
        }
    }

    /* renamed from: b */
    public final void mo112353b(long j) {
        if (this.f118443h != null && this.f118443h.f118532Y <= 0) {
            this.f118443h.f118532Y = j;
        }
    }

    /* renamed from: c */
    public final void mo112367c(Map map) {
        if (this.f118443h != null) {
            this.f118443h.f118626bm = map;
        }
    }

    /* renamed from: b */
    public final void mo112354b(C46117c cVar) {
        if (cVar != null) {
            this.f118456u.put("httpdns", cVar.mo112287a());
        }
    }

    /* renamed from: a */
    public final void mo112327a(int i, int i2) {
        this.f118451p = i;
        this.f118420aa = i2;
    }

    /* renamed from: c */
    public final void mo112362c(int i, int i2) {
        if (this.f118443h != null) {
            this.f118443h.f118635bv = i2;
        }
    }

    /* renamed from: a */
    public final void mo112329a(int i, long j) {
        if (this.f118443h != null) {
            switch (i) {
                case 0:
                    if (this.f118443h.f118571ak <= 0) {
                        this.f118443h.f118571ak = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.f118443h.f118573am <= 0) {
                        this.f118443h.f118573am = j;
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    private void m144862a(int i, boolean z) {
        if (this.f118443h != null) {
            if (z) {
                this.f118443h.f118591bD = i;
                if (i == -1002 || i == -1003 || i == -1004 || i == -1005) {
                    if (this.f118429aj == 0) {
                        this.f118429aj = SystemClock.elapsedRealtime();
                    }
                } else if (i == -2003 || i == -2002) {
                    this.f118429aj = SystemClock.elapsedRealtime();
                } else {
                    this.f118429aj = 0;
                }
            } else {
                this.f118443h.f118591bD = -2001;
                this.f118429aj = 0;
            }
        }
    }

    /* renamed from: b */
    public final void mo112350b(int i, int i2) {
        StringBuilder sb = new StringBuilder("movieStalled, type: ");
        sb.append(i);
        C46123h.m144545a("VideoEventLoggerV2", sb.toString());
        if (!(i != 0 || this.f118435ap == 3 || this.f118435ap == 4)) {
            this.f118435ap = 3;
            this.f118445j.mo112458a(i2, this.f118438c + 1);
        }
        if (this.f118455t.size() <= 1) {
            switch (i) {
                case 0:
                    this.f118438c++;
                    break;
                case 1:
                    this.f118419a++;
                    break;
            }
        }
        if (this.f118443h != null) {
            if (i == 0) {
                if (this.f118435ap != 4) {
                    m144862a(-2003, true);
                }
            } else if (i == 1) {
                m144862a(-2004, true);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f118443h.f118564ad <= 0) {
                this.f118443h.f118564ad = currentTimeMillis;
            }
            if (i == 1) {
                this.f118418Z = currentTimeMillis;
            }
            this.f118443h.f118597bJ = currentTimeMillis;
        }
    }

    /* renamed from: c */
    public final void mo112363c(int i, String str) {
        if (this.f118435ap == 4) {
            this.f118446k.mo112463a("error", 0);
        }
        if (this.f118435ap == 3) {
            this.f118445j.mo112459a("error");
        }
        this.f118435ap = 5;
        this.f118447l.mo112441a();
        this.f118444i.mo112454a(i, str);
        this.f118443h.f118666z = i;
        this.f118443h.f118508A = str;
        mo112431v(5);
    }

    public C46151i(Context context, C46141a aVar) {
        this.f118442g = aVar;
        this.f118447l = new C46146f(this.f118442g);
        this.f118443h = new C46157m(this.f118447l);
        this.f118444i = new C46154j(this.f118447l);
        this.f118446k = new C46156l(this.f118447l);
        this.f118445j = new C46155k(this.f118447l, this.f118446k);
        this.f118452q = new ArrayList();
        this.f118453r = new ArrayList();
        this.f118454s = new ArrayList();
        this.f118455t = new ArrayList();
        this.f118456u = new HashMap();
        this.f118449n = true;
        this.f118450o = false;
        this.f118436aq = context;
        this.f118447l.f118254L = context;
    }

    /* renamed from: b */
    public final void mo112351b(int i, long j) {
        if (this.f118443h != null) {
            switch (i) {
                case 0:
                    if (this.f118443h.f118572al <= 0) {
                        this.f118443h.f118572al = j;
                        return;
                    }
                    break;
                case 1:
                    if (this.f118443h.f118574an <= 0) {
                        this.f118443h.f118574an = j;
                        break;
                    }
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo112352b(int i, String str) {
        if (i == 0) {
            this.f118448m = true;
        }
        this.f118447l.mo112442a(i, str);
        this.f118423ad = 0;
        m144860R(i);
    }

    /* renamed from: a */
    public final void mo112330a(int i, String str) {
        this.f118424ae = i;
        this.f118425af = str;
    }

    /* renamed from: a */
    public final void mo112328a(int i, int i2, boolean z) {
        if (!z) {
            if (this.f118435ap == 3) {
                this.f118445j.mo112459a("seek");
            }
            if (this.f118435ap == 4) {
                this.f118446k.mo112463a("seek", 0);
            }
            this.f118427ah++;
            this.f118435ap = 4;
            this.f118446k.mo112462a(i, i2, this.f118427ah);
            this.f118431al = System.currentTimeMillis();
            if (this.f118443h != null) {
                this.f118443h.f118595bH = this.f118431al;
                this.f118443h.f118601bN = i2;
            }
            this.f118431al = SystemClock.elapsedRealtime();
        }
        m144862a(-2002, true);
    }

    /* renamed from: a */
    public final void mo112331a(int i, String str, String str2, String str3) {
        this.f118398F = i;
        if (str != null) {
            this.f118399G = str;
        }
        if (str2 != null) {
            this.f118400H = str2;
        }
        if (str3 != null) {
            this.f118401I = str3;
        }
    }
}
