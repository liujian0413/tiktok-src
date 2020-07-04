package com.p280ss.videoarch.liveplayer.log;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.videoarch.liveplayer.C46280a;
import com.p280ss.videoarch.liveplayer.C46311e;
import com.p280ss.videoarch.liveplayer.p1835b.C46297d;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.log.a */
public final class C46334a implements Callback {

    /* renamed from: A */
    public boolean f119138A;

    /* renamed from: B */
    public int f119139B;

    /* renamed from: C */
    public int f119140C = -1;

    /* renamed from: D */
    public String f119141D = "none";

    /* renamed from: E */
    public boolean f119142E;

    /* renamed from: F */
    public int f119143F = -1;

    /* renamed from: G */
    public int f119144G;

    /* renamed from: H */
    public boolean f119145H;

    /* renamed from: I */
    public int f119146I;

    /* renamed from: J */
    public int f119147J = 1;

    /* renamed from: K */
    public long f119148K;

    /* renamed from: L */
    private Context f119149L;

    /* renamed from: M */
    private Handler f119150M;

    /* renamed from: N */
    private C46280a f119151N;

    /* renamed from: O */
    private C46337b f119152O;

    /* renamed from: P */
    private C46311e f119153P;

    /* renamed from: Q */
    private final long f119154Q;

    /* renamed from: R */
    private boolean f119155R;

    /* renamed from: S */
    private String f119156S = "none";

    /* renamed from: T */
    private String f119157T = "none";

    /* renamed from: U */
    private boolean f119158U;

    /* renamed from: V */
    private long f119159V;

    /* renamed from: W */
    private String f119160W = "none";

    /* renamed from: X */
    private String f119161X = "none";

    /* renamed from: Y */
    private String f119162Y = "none";

    /* renamed from: Z */
    private String f119163Z = "none";

    /* renamed from: a */
    public String f119164a = "none";

    /* renamed from: aA */
    private boolean f119165aA;

    /* renamed from: aB */
    private NTPUDPClient f119166aB;

    /* renamed from: aC */
    private C46335a f119167aC;

    /* renamed from: aD */
    private final long f119168aD = 300000;

    /* renamed from: aE */
    private long f119169aE;

    /* renamed from: aF */
    private boolean f119170aF;

    /* renamed from: aG */
    private String f119171aG;

    /* renamed from: aH */
    private int f119172aH;

    /* renamed from: aI */
    private int f119173aI;

    /* renamed from: aJ */
    private ArrayList<Long> f119174aJ;

    /* renamed from: aK */
    private ArrayList<Long> f119175aK;

    /* renamed from: aL */
    private ArrayList<Long> f119176aL;

    /* renamed from: aM */
    private ArrayList<Long> f119177aM;

    /* renamed from: aN */
    private JSONObject f119178aN;

    /* renamed from: aO */
    private ArrayList<Integer> f119179aO;

    /* renamed from: aP */
    private ArrayList<Integer> f119180aP;

    /* renamed from: aQ */
    private boolean f119181aQ;

    /* renamed from: aa */
    private String f119182aa = "none";

    /* renamed from: ab */
    private int f119183ab = -1;

    /* renamed from: ac */
    private int f119184ac = -1;

    /* renamed from: ad */
    private int f119185ad = -1;

    /* renamed from: ae */
    private int f119186ae = -1;

    /* renamed from: af */
    private int f119187af = -1;

    /* renamed from: ag */
    private String f119188ag = "none";

    /* renamed from: ah */
    private String f119189ah = "none";

    /* renamed from: ai */
    private boolean f119190ai;

    /* renamed from: aj */
    private String f119191aj = "none";

    /* renamed from: ak */
    private boolean f119192ak;

    /* renamed from: al */
    private boolean f119193al;

    /* renamed from: am */
    private boolean f119194am;

    /* renamed from: an */
    private long f119195an;

    /* renamed from: ao */
    private int f119196ao;

    /* renamed from: ap */
    private long f119197ap;

    /* renamed from: aq */
    private long f119198aq;

    /* renamed from: ar */
    private long f119199ar = -1;

    /* renamed from: as */
    private long f119200as;

    /* renamed from: at */
    private long f119201at;

    /* renamed from: au */
    private int f119202au;

    /* renamed from: av */
    private int f119203av;

    /* renamed from: aw */
    private long f119204aw;

    /* renamed from: ax */
    private long f119205ax;

    /* renamed from: ay */
    private int f119206ay;

    /* renamed from: az */
    private int f119207az;

    /* renamed from: b */
    public String f119208b = "none";

    /* renamed from: c */
    public String f119209c = "none";

    /* renamed from: d */
    public boolean f119210d;

    /* renamed from: e */
    public boolean f119211e;

    /* renamed from: f */
    public String f119212f = "none";

    /* renamed from: g */
    public boolean f119213g;

    /* renamed from: h */
    public String f119214h = "none";

    /* renamed from: i */
    public boolean f119215i;

    /* renamed from: j */
    public int f119216j = -1;

    /* renamed from: k */
    public float f119217k = -1.0f;

    /* renamed from: l */
    public int f119218l = -1;

    /* renamed from: m */
    public float f119219m = -1.0f;

    /* renamed from: n */
    public int f119220n;

    /* renamed from: o */
    public String f119221o = "none";

    /* renamed from: p */
    public long f119222p;

    /* renamed from: q */
    public int f119223q;

    /* renamed from: r */
    public int f119224r;

    /* renamed from: s */
    public int f119225s;

    /* renamed from: t */
    public String f119226t = "none";

    /* renamed from: u */
    public boolean f119227u;

    /* renamed from: v */
    public InetAddress f119228v;

    /* renamed from: w */
    public InetAddress f119229w;

    /* renamed from: x */
    public int f119230x = -1;

    /* renamed from: y */
    public boolean f119231y;

    /* renamed from: z */
    public int f119232z;

    /* renamed from: com.ss.videoarch.liveplayer.log.a$a */
    static class C46335a {

        /* renamed from: a */
        public Handler f119233a;

        /* renamed from: b */
        private HandlerThread f119234b = new HandlerThread("DnsHandlerThread");

        public C46335a(final C46334a aVar) {
            this.f119234b.start();
            this.f119233a = new Handler(this.f119234b.getLooper()) {
                public final void handleMessage(Message message) {
                    if (message != null) {
                        if ((message.what == 104 && aVar.f119230x == -1) || aVar.mo115157j() || (aVar.f119228v == null && aVar.f119229w == null)) {
                            try {
                                aVar.f119228v = InetAddress.getByName("time1.bytedance.com");
                            } catch (UnknownHostException unused) {
                                aVar.f119228v = null;
                            }
                            try {
                                aVar.f119229w = InetAddress.getByName("time2.bytedance.com");
                            } catch (UnknownHostException unused2) {
                                aVar.f119229w = null;
                            }
                        }
                        if (message.what == 103) {
                            aVar.mo115151f();
                            if (aVar.f119231y) {
                                C46335a.this.f119233a.sendEmptyMessageDelayed(103, 300000);
                            }
                        }
                    }
                }
            };
        }

        /* renamed from: a */
        public final void mo115158a(int i, long j) {
            if (this.f119234b != null && this.f119233a != null) {
                this.f119233a.sendEmptyMessage(i);
            }
        }
    }

    /* renamed from: g */
    public final void mo115153g() {
        this.f119190ai = true;
    }

    /* renamed from: h */
    public final void mo115154h() {
        this.f119165aA = true;
    }

    /* renamed from: a */
    public final void mo115135a(String str) {
        if (this.f119155R) {
            this.f119155R = false;
            this.f119150M.removeCallbacksAndMessages(null);
            if (this.f119167aC != null) {
                this.f119167aC.f119233a.removeCallbacksAndMessages(null);
            }
            this.f119231y = false;
        }
        m145446g(str);
        mo115147d();
    }

    /* renamed from: a */
    public final void mo115136a(String str, String str2) {
        mo115147d();
        this.f119152O.f119245a = System.currentTimeMillis();
        this.f119152O.f119244H = str2;
        this.f119208b = str;
        JSONObject k = m145447k();
        if (k != null) {
            try {
                k.put("event_key", "start_play").put("set_surface_cost", this.f119148K).put("start_play_time", this.f119152O.f119245a);
                this.f119151N.mo21836a(k);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo115137a(String str, String str2, String str3, int i) {
        if (this.f119153P != null && this.f119151N != null) {
            try {
                JSONObject k = m145447k();
                JSONObject put = k.put("event_key", "switch_url");
                String str4 = "last_cdn_play_url";
                if (str == null) {
                    str = TEVideoRecorder.FACE_BEAUTY_NULL;
                }
                JSONObject put2 = put.put(str4, str);
                String str5 = "next_cdn_play_url";
                if (str2 == null) {
                    str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
                }
                put2.put(str5, str2).put("code", i).put("reason", str3);
                this.f119151N.mo21836a(k);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo115134a(long j, long j2) {
        this.f119194am = true;
        this.f119195an = System.currentTimeMillis();
        if (this.f119153P != null && this.f119151N != null && this.f119152O != null) {
            try {
                this.f119152O.f119264t = System.currentTimeMillis();
                this.f119153P.mo115079a(this.f119152O, 0);
                this.f119151N.mo21836a(m145444a(this.f119152O, 0, this.f119193al, j2));
                StringBuilder sb = new StringBuilder("1.0:");
                sb.append(this.f119195an);
                this.f119221o = sb.toString();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo115139a(boolean z) {
        if (this.f119227u) {
            this.f119227u = false;
            JSONObject k = m145447k();
            if (this.f119196ao == -115) {
                this.f119196ao = 0;
            }
            if (this.f119177aM == null) {
                this.f119177aM = new ArrayList<>();
            }
            this.f119177aM.add(Long.valueOf(-(System.currentTimeMillis() - this.f119152O.f119245a)));
            if (this.f119205ax == 0) {
                this.f119205ax = System.currentTimeMillis();
            }
            if (!(k == null || this.f119197ap == 0)) {
                try {
                    if (this.f119198aq != 0) {
                        this.f119202au++;
                        this.f119203av = (int) (((long) this.f119203av) + (System.currentTimeMillis() - this.f119198aq));
                    }
                    this.f119200as++;
                    this.f119201at += System.currentTimeMillis() - this.f119197ap;
                    k.put("event_key", "stall").put("stall_start", this.f119197ap).put("stall_end", System.currentTimeMillis()).put("reason", this.f119199ar);
                    this.f119151N.mo21836a(k);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo115141b() {
        if (!this.f119194am) {
            this.f119152O.f119247c = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo115144c() {
        if (!this.f119194am) {
            this.f119152O.f119257m = System.currentTimeMillis();
        }
    }

    /* renamed from: n */
    private void m145450n() {
        m145449m();
        if (this.f119155R) {
            this.f119150M.sendEmptyMessageDelayed(102, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
        }
    }

    /* renamed from: e */
    public final void mo115149e() {
        this.f119232z = 1;
        if (this.f119167aC == null) {
            this.f119167aC = new C46335a(this);
            this.f119167aC.mo115158a(104, 0);
        }
    }

    /* renamed from: a */
    public final void mo115129a() {
        if (!this.f119155R) {
            this.f119150M.sendEmptyMessageDelayed(BaseNotice.HASHTAG, this.f119154Q);
            if (this.f119142E) {
                this.f119150M.sendEmptyMessageDelayed(102, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
            }
            if (this.f119232z == 1 && !this.f119231y && this.f119167aC != null) {
                this.f119167aC.mo115158a(103, 0);
                this.f119231y = true;
            }
            this.f119155R = true;
        }
    }

    /* renamed from: j */
    public final boolean mo115157j() {
        int i;
        String str;
        NetworkInfo a = C46297d.m145338a(this.f119149L);
        if (a == null || !a.isAvailable()) {
            str = null;
            i = -1;
        } else {
            i = a.getType();
            str = a.getExtraInfo();
        }
        if (i == -1) {
            this.f119230x = i;
            this.f119171aG = str;
            return true;
        } else if (i != this.f119230x) {
            this.f119230x = i;
            this.f119171aG = str;
            return true;
        } else if (str == null || (this.f119171aG != null && str.equals(this.f119171aG))) {
            return false;
        } else {
            this.f119230x = i;
            this.f119171aG = str;
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[SYNTHETIC, Splitter:B:11:0x001b] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002b  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo115151f() {
        /*
            r9 = this;
            org.apache.commons.net.ntp.NTPUDPClient r0 = r9.f119166aB
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 0
            org.apache.commons.net.ntp.NTPUDPClient r1 = r9.f119166aB     // Catch:{ SocketException -> 0x005c, IOException -> 0x0018 }
            r1.open()     // Catch:{ SocketException -> 0x005c, IOException -> 0x0018 }
            java.net.InetAddress r1 = r9.f119228v     // Catch:{ SocketException -> 0x005c, IOException -> 0x0018 }
            if (r1 == 0) goto L_0x0018
            org.apache.commons.net.ntp.NTPUDPClient r1 = r9.f119166aB     // Catch:{ SocketException -> 0x005c, IOException -> 0x0018 }
            java.net.InetAddress r2 = r9.f119228v     // Catch:{ SocketException -> 0x005c, IOException -> 0x0018 }
            org.apache.commons.net.ntp.TimeInfo r1 = r1.getTime(r2)     // Catch:{ SocketException -> 0x005c, IOException -> 0x0018 }
            goto L_0x0019
        L_0x0018:
            r1 = r0
        L_0x0019:
            if (r1 != 0) goto L_0x0027
            java.net.InetAddress r2 = r9.f119229w     // Catch:{ IOException -> 0x0028 }
            if (r2 == 0) goto L_0x0027
            org.apache.commons.net.ntp.NTPUDPClient r1 = r9.f119166aB     // Catch:{ IOException -> 0x0028 }
            java.net.InetAddress r2 = r9.f119229w     // Catch:{ IOException -> 0x0028 }
            org.apache.commons.net.ntp.TimeInfo r1 = r1.getTime(r2)     // Catch:{ IOException -> 0x0028 }
        L_0x0027:
            r0 = r1
        L_0x0028:
            if (r0 != 0) goto L_0x002b
            return
        L_0x002b:
            org.apache.commons.net.ntp.NtpV3Packet r1 = r0.getMessage()
            org.apache.commons.net.ntp.TimeStamp r1 = r1.getOriginateTimeStamp()
            long r1 = r1.getTime()
            org.apache.commons.net.ntp.NtpV3Packet r3 = r0.getMessage()
            org.apache.commons.net.ntp.TimeStamp r3 = r3.getReceiveTimeStamp()
            long r3 = r3.getTime()
            org.apache.commons.net.ntp.NtpV3Packet r0 = r0.getMessage()
            org.apache.commons.net.ntp.TimeStamp r0 = r0.getTransmitTimeStamp()
            long r5 = r0.getTime()
            long r7 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            long r5 = r5 - r7
            long r3 = r3 + r5
            r0 = 2
            long r3 = r3 / r0
            r9.f119169aE = r3
            return
        L_0x005c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.videoarch.liveplayer.log.C46334a.mo115151f():void");
    }

    /* renamed from: l */
    private JSONObject m145448l() {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        JSONObject jSONObject;
        m145449m();
        try {
            JSONObject put = new JSONObject().put("start_time", this.f119152O.f119245a).put("render_fps_series", new JSONArray(this.f119174aJ)).put("download_bitrate_series", new JSONArray(this.f119175aK)).put("play_buffer_series", new JSONArray(this.f119176aL));
            String str = "push_bitrate_series";
            if (this.f119179aO == null) {
                jSONArray = new JSONArray();
            } else {
                jSONArray = new JSONArray(this.f119179aO);
            }
            JSONObject put2 = put.put(str, jSONArray);
            String str2 = "push_fps_series";
            if (this.f119180aP == null) {
                jSONArray2 = new JSONArray();
            } else {
                jSONArray2 = new JSONArray(this.f119180aP);
            }
            JSONObject put3 = put2.put(str2, jSONArray2);
            String str3 = "stall_series";
            if (this.f119177aM == null) {
                jSONArray3 = new JSONArray();
            } else {
                jSONArray3 = new JSONArray(this.f119177aM);
            }
            JSONObject put4 = put3.put(str3, jSONArray3);
            String str4 = "error_series";
            if (this.f119178aN == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = this.f119178aN;
            }
            return put4.put(str4, jSONObject);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: m */
    private void m145449m() {
        if (this.f119153P != null && this.f119151N != null && this.f119152O != null) {
            this.f119153P.mo115079a(this.f119152O, 3);
            if (this.f119174aJ == null) {
                this.f119174aJ = new ArrayList<>();
                this.f119176aL = new ArrayList<>();
                this.f119175aK = new ArrayList<>();
            }
            this.f119174aJ.add(Long.valueOf((long) this.f119152O.f119266v));
            this.f119176aL.add(Long.valueOf(this.f119152O.f119269y));
            this.f119175aK.add(Long.valueOf(this.f119152O.f119267w));
            if (this.f119181aQ) {
                if (this.f119180aP == null) {
                    this.f119180aP = new ArrayList<>();
                    this.f119179aO = new ArrayList<>();
                }
                this.f119180aP.add(Integer.valueOf(this.f119152O.f119243G));
                this.f119179aO.add(Integer.valueOf(this.f119152O.f119242F));
            }
        }
    }

    /* renamed from: d */
    public final void mo115147d() {
        this.f119208b = "none";
        this.f119157T = "none";
        this.f119158U = false;
        this.f119159V = 0;
        this.f119160W = "none";
        this.f119161X = "none";
        this.f119162Y = "none";
        this.f119163Z = "none";
        this.f119182aa = "none";
        this.f119183ab = -1;
        this.f119184ac = -1;
        this.f119185ad = -1;
        this.f119186ae = -1;
        this.f119187af = -1;
        this.f119188ag = "none";
        this.f119189ah = "none";
        this.f119191aj = "none";
        this.f119192ak = false;
        this.f119211e = false;
        this.f119193al = false;
        this.f119215i = false;
        this.f119216j = -1;
        this.f119217k = -1.0f;
        this.f119218l = -1;
        this.f119219m = -1.0f;
        this.f119220n = 0;
        this.f119221o = "none";
        this.f119222p = 0;
        this.f119223q = 0;
        this.f119224r = 0;
        this.f119225s = 0;
        this.f119140C = -1;
        this.f119139B = 0;
        this.f119194am = false;
        this.f119195an = 0;
        this.f119196ao = 0;
        this.f119197ap = 0;
        this.f119199ar = -1;
        this.f119200as = 0;
        this.f119201at = 0;
        this.f119227u = false;
        this.f119202au = 0;
        this.f119203av = 0;
        this.f119198aq = 0;
        this.f119204aw = 0;
        this.f119205ax = 0;
        this.f119206ay = 0;
        this.f119207az = 0;
        this.f119170aF = false;
        this.f119169aE = 0;
        this.f119232z = 0;
        this.f119172aH = 0;
        this.f119173aI = 0;
        this.f119143F = -1;
        this.f119174aJ = null;
        this.f119175aK = null;
        this.f119176aL = null;
        this.f119179aO = null;
        this.f119180aP = null;
        this.f119178aN = null;
        this.f119177aM = null;
        if (this.f119152O != null) {
            this.f119152O.mo115160a();
        }
        this.f119214h = "none";
        this.f119147J = 1;
        this.f119226t = "none";
    }

    /* renamed from: k */
    private JSONObject m145447k() {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            JSONObject put = new JSONObject().put("report_version", "5").put("live_sdk_version", "1.3.7.6").put("product_line", "live").put("client_timestamp", System.currentTimeMillis());
            String str5 = "player_sdk_version";
            if (this.f119209c == null) {
                str = "-1";
            } else {
                str = this.f119209c;
            }
            JSONObject put2 = put.put(str5, str);
            String str6 = "project_key";
            if (this.f119164a == null) {
                str2 = "-1";
            } else {
                str2 = this.f119164a;
            }
            JSONObject put3 = put2.put(str6, str2);
            String str7 = "cdn_play_url";
            if (this.f119208b == null) {
                str3 = "-1";
            } else {
                str3 = this.f119208b;
            }
            JSONObject put4 = put3.put(str7, str3);
            String str8 = "cdn_ip";
            if (this.f119157T == null) {
                str4 = "-1";
            } else {
                str4 = this.f119157T;
            }
            return put4.put(str8, str4).put("ip_from_player_core", this.f119158U ? 1 : 0).put("is_preview", this.f119210d ? 1 : 0).put("push_client_sdk_version", this.f119160W).put("push_client_platform", this.f119161X).put("push_client_os_version", this.f119162Y).put("push_client_model", this.f119163Z).put("push_client_start_time", this.f119182aa).put("push_client_is_hardware_encode", this.f119183ab).put("push_client_min_bitrate", this.f119184ac).put("push_client_max_bitrate", this.f119185ad).put("push_client_default_bitrate", this.f119186ae).put("push_client_push_protocol", this.f119188ag).put("push_client_qid", this.f119189ah).put("push_client_hit_node_optimize", this.f119187af).put("open_dns_optimizer", this.f119190ai ? 1 : 0).put("hit_node_optimize", this.f119192ak ? 1 : 0).put("evaluator_symbol", this.f119191aj).put("remote_sorted", this.f119211e ? 1 : 0).put("common_tag", this.f119156S).put("codec_type", this.f119212f).put("codec_name", this.f119214h).put("hardware_decode", this.f119213g ? 1 : 0).put("sharp", this.f119165aA ? 1 : 0).put("enable_hurry", this.f119215i ? 1 : 0).put("hurry_time", this.f119216j).put("catch_speed", new DecimalFormat("0.00").format((double) this.f119217k)).put("slow_play_time", this.f119218l).put("slow_speed", new DecimalFormat("0.00").format((double) this.f119219m)).put("first_screen", this.f119194am ? 1 : 0).put("enable_httpDns", this.f119138A ? 1 : 0).put("enable_ntp", this.f119232z).put("enable_media_codec_async", this.f119139B).put("default_codec_id", this.f119140C).put("url_ability", this.f119141D).put("max_cache_seconds", this.f119143F).put("enable_fast_open", this.f119146I).put("dns_ip", this.f119152O.f119244H).put("in_main_looper", this.f119147J).put("start_play_buffer_threshold", this.f119222p).put("buffering_end_ignore_video", this.f119223q).put("start_direct_after_prepared", this.f119224r).put("check_buffering_end_advance", this.f119225s).put("live_stream_session_id", this.f119226t).put("width", this.f119172aH).put("height", this.f119173aI);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: i */
    public final JSONObject mo115156i() {
        String str;
        String str2;
        String str3;
        C46337b bVar = new C46337b();
        this.f119153P.mo115079a(bVar, 1);
        try {
            JSONObject put = new JSONObject().put("拉流sdk版本:", "1.3.7.6");
            String str4 = "播放器版本:";
            if (this.f119209c == null) {
                str = "-1";
            } else {
                str = this.f119209c;
            }
            JSONObject put2 = put.put(str4, str);
            String str5 = "cdn节点:";
            if (this.f119157T == null) {
                str2 = "-1";
            } else {
                str2 = this.f119157T;
            }
            JSONObject put3 = put2.put(str5, str2).put("推流SDK版本:", this.f119160W).put("推流平台:", this.f119161X).put("推流设备机型:", this.f119163Z).put("推流系统版本号:", this.f119162Y).put("推流端硬编:", this.f119183ab).put("推流协议:", this.f119188ag).put("qId:", this.f119189ah).put("推流码率:", this.f119152O.f119242F).put("推流帧频:", this.f119152O.f119243G).put("命中节点优选:", this.f119192ak ? 1 : 0).put("优选策略:", this.f119191aj).put("服务端优选:", this.f119211e ? 1 : 0).put("卡顿次数:", this.f119200as).put("卡顿时长:", this.f119201at);
            String str6 = "卡顿原因:";
            if (this.f119199ar == -1) {
                str3 = "无卡顿";
            } else if (this.f119199ar == 0) {
                str3 = "网络卡顿";
            } else {
                str3 = "解码卡顿";
            }
            return put3.put(str6, str3).put("首帧:", this.f119152O.f119255k - this.f119152O.f119245a).put("视频播放缓存:", bVar.f119268x).put("音频播放缓存:", bVar.f119269y).put("延迟:", this.f119152O.f119240D).put("渲染帧频:", (double) bVar.f119266v).put("sei_source:", this.f119152O.f119241E).put("下载码率:", bVar.f119267w).put("错误码:", this.f119196ao).put("硬解:", this.f119213g).put("编码类型:", this.f119212f).put("解码器:", this.f119214h).put("首帧缓存:", this.f119152O.f119238B).put("等待时间:", this.f119152O.f119239C).put("dns_ip:", this.f119152O.f119244H).put("url:", this.f119208b).put("width:", this.f119172aH).put("height:", this.f119173aI);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final void mo115152f(String str) {
        if (str != null) {
            this.f119191aj = str;
        }
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (101 == i) {
            m145445b(false);
        }
        if (102 == i) {
            m145450n();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo115142b(int i) {
        this.f119206ay++;
        this.f119207az++;
        JSONObject k = m145447k();
        if (k != null) {
            try {
                k.put("event_key", "retry").put("reason", this.f119196ao).put("code", i);
                this.f119151N.mo21836a(k);
                this.f119152O.mo115161b();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo115145c(int i) {
        String str;
        JSONObject k = m145447k();
        if (k != null) {
            try {
                JSONObject put = k.put("event_key", "prepare_result");
                String str2 = "error_msg";
                if (i != 0) {
                    str = this.f119153P.mo115109o();
                } else {
                    str = "none";
                }
                put.put(str2, str).put("result", i);
                this.f119151N.mo21836a(k);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: d */
    public final void mo115148d(String str) {
        if (this.f119153P != null && this.f119151N != null) {
            JSONObject k = m145447k();
            if (k != null) {
                try {
                    k.put("event_key", "illegal_call").put("api_name", str);
                    this.f119151N.mo21836a(k);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo115150e(String str) {
        if (this.f119153P != null && this.f119151N != null) {
            JSONObject k = m145447k();
            if (k != null) {
                try {
                    k.put("event_key", "call_not_in_main_thread").put("api_name", str);
                    this.f119151N.mo21836a(k);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    private void m145445b(boolean z) {
        if (this.f119153P != null && this.f119151N != null && this.f119152O != null) {
            try {
                long j = this.f119152O.f119262r;
                long j2 = this.f119152O.f119263s;
                long j3 = this.f119152O.f119264t;
                long j4 = this.f119152O.f119265u;
                this.f119153P.mo115079a(this.f119152O, 1);
                this.f119151N.mo21836a(m145443a(this.f119152O, j, j2, j3, j4, z));
            } catch (JSONException unused) {
            }
            if (this.f119155R) {
                this.f119150M.sendEmptyMessageDelayed(BaseNotice.HASHTAG, this.f119154Q);
            }
        }
    }

    /* renamed from: a */
    public final void mo115130a(int i) {
        if (!this.f119194am && this.f119153P != null && this.f119151N != null) {
            JSONObject k = m145447k();
            if (k != null) {
                try {
                    k.put("event_key", "first_frame_failed").put("start_time", System.currentTimeMillis()).put("reason", i);
                    this.f119151N.mo21836a(k);
                } catch (JSONException unused) {
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo115143b(String str) {
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("sdk_version")) {
                    this.f119160W = jSONObject.getString("sdk_version");
                }
                if (jSONObject.has("platform")) {
                    this.f119161X = jSONObject.getString("platform");
                }
                if (jSONObject.has("os_version")) {
                    this.f119162Y = jSONObject.getString("os_version");
                }
                if (jSONObject.has("model")) {
                    this.f119163Z = jSONObject.getString("model");
                }
                if (jSONObject.has("start_time")) {
                    this.f119182aa = jSONObject.getString("start_time");
                }
                if (jSONObject.has("is_hardware_encode")) {
                    this.f119183ab = jSONObject.getInt("is_hardware_encode");
                }
                if (jSONObject.has("min_bitrate")) {
                    this.f119184ac = jSONObject.getInt("min_bitrate");
                }
                if (jSONObject.has("max_bitrate")) {
                    this.f119185ad = jSONObject.getInt("max_bitrate");
                }
                if (jSONObject.has("default_bitrate")) {
                    this.f119186ae = jSONObject.getInt("default_bitrate");
                }
                if (jSONObject.has("hit_node_optimize")) {
                    this.f119187af = jSONObject.getInt("hit_node_optimize");
                }
                if (jSONObject.has("push_protocol")) {
                    this.f119188ag = jSONObject.getString("push_protocol");
                }
                if (jSONObject.has("qId")) {
                    this.f119189ah = jSONObject.getString("qId");
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: c */
    public final void mo115146c(String str) {
        if (!TextUtils.isEmpty(str) && this.f119152O != null && this.f119153P != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ts")) {
                    long j = jSONObject.getLong("ts");
                    long j2 = 0;
                    if (this.f119232z == 1 && jSONObject.has("tt_ntp") && jSONObject.getInt("tt_ntp") == 1) {
                        if (!this.f119231y && this.f119167aC != null) {
                            this.f119167aC.mo115158a(103, 0);
                            this.f119231y = true;
                        }
                        j2 = this.f119169aE;
                        this.f119170aF = true;
                    } else {
                        if (this.f119231y && !jSONObject.has("tt_ntp")) {
                            if (this.f119167aC != null) {
                                this.f119167aC.f119233a.removeCallbacksAndMessages(null);
                            }
                            this.f119231y = false;
                        }
                        this.f119170aF = false;
                    }
                    this.f119152O.f119240D = (System.currentTimeMillis() - j) + j2;
                    if (jSONObject.has("source")) {
                        this.f119152O.f119241E = jSONObject.getString("source");
                    } else {
                        this.f119152O.f119241E = "agora";
                    }
                    if (jSONObject.has("real_bitrate")) {
                        this.f119152O.f119242F = jSONObject.getInt("real_bitrate");
                        this.f119181aQ = true;
                    }
                    if (jSONObject.has("real_video_framerate")) {
                        this.f119152O.f119243G = jSONObject.getInt("real_video_framerate");
                        this.f119181aQ = true;
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: g */
    private void m145446g(String str) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = 1;
        if (this.f119194am) {
            m145445b(true);
        }
        JSONObject k = m145447k();
        if (k != null) {
            try {
                if (this.f119194am) {
                    j2 = System.currentTimeMillis() - this.f119195an;
                    j = 0;
                } else if (this.f119196ao != 0 || this.f119152O.f119245a == 0) {
                    j2 = 0;
                    j = 0;
                } else {
                    j = System.currentTimeMillis() - this.f119152O.f119245a;
                    j2 = 0;
                }
                if (this.f119204aw > 0) {
                    j4 = this.f119204aw - this.f119152O.f119255k;
                    j3 = this.f119205ax - this.f119204aw;
                } else {
                    j4 = 0;
                    j3 = 0;
                }
                this.f119153P.mo115079a(this.f119152O, 2);
                JSONObject put = k.put("event_key", "play_stop").put("stop_time", System.currentTimeMillis()).put("play_time", j2).put("is_stream_received", this.f119194am ? 1 : 0).put("code", this.f119196ao).put("stall_count", this.f119200as).put("stall_time", this.f119201at).put("start", this.f119152O.f119245a).put("sdk_dns_analysis_end", this.f119152O.f119246b).put("player_dns_analysis_end", this.f119152O.f119248d).put("tcp_connect_end", this.f119152O.f119249e).put("tcp_first_package_end", this.f119152O.f119250f).put("first_video_package_end", this.f119152O.f119251g).put("first_audio_package_end", this.f119152O.f119252h).put("first_video_frame_decode_end", this.f119152O.f119253i).put("first_audio_frame_decode_end", this.f119152O.f119254j).put("first_frame_render_end", this.f119152O.f119255k).put("video_device_open_start", this.f119152O.f119258n).put("video_device_open_end", this.f119152O.f119259o).put("audio_device_open_start", this.f119152O.f119260p).put("audio_device_open_end", this.f119152O.f119261q).put("prepare_block_end", this.f119152O.f119247c).put("prepare_end", this.f119152O.f119257m).put("retry_count", this.f119207az).put("download_speed", this.f119152O.f119270z).put("video_buffer_time", this.f119152O.f119237A).put("audio_buffer_time", this.f119152O.f119238B);
                String str2 = "wait_time";
                if (this.f119152O.f119239C > 0) {
                    j5 = this.f119152O.f119239C;
                } else {
                    j5 = -this.f119152O.f119239C;
                }
                JSONObject put2 = put.put(str2, j5);
                String str3 = "is_waiting";
                if (this.f119152O.f119239C >= 0) {
                    i = 0;
                }
                put2.put(str3, i).put("first_stall_time", j4).put("first_stall_duration", j3).put("call_api_name", str).put("play_time_on_no_frame", j);
                if (this.f119142E) {
                    k.put("session_time_series", m145448l());
                }
                this.f119151N.mo21836a(k);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo115131a(int i, int i2) {
        this.f119172aH = i;
        this.f119173aI = i2;
    }

    /* renamed from: a */
    public final void mo115138a(String str, boolean z) {
        this.f119157T = str;
        this.f119158U = z;
    }

    /* renamed from: a */
    public final void mo115140a(boolean z, boolean z2) {
        this.f119152O.f119246b = System.currentTimeMillis();
        this.f119192ak = z2;
        this.f119193al = z;
    }

    /* renamed from: a */
    public final void mo115132a(int i, String str) {
        if (this.f119178aN == null) {
            this.f119178aN = new JSONObject();
        }
        try {
            this.f119178aN.put(Long.toString(System.currentTimeMillis() - this.f119152O.f119245a), i);
        } catch (JSONException unused) {
            this.f119178aN = null;
        }
        JSONObject k = m145447k();
        if (k != null) {
            try {
                k.put("event_key", "play_error").put("code", i).put("info", str);
                this.f119151N.mo21836a(k);
                this.f119196ao = i;
            } catch (JSONException unused2) {
            }
        }
    }

    /* renamed from: a */
    public final void mo115133a(int i, boolean z) {
        this.f119196ao = -115;
        if (z) {
            this.f119197ap = System.currentTimeMillis();
            if (this.f119204aw == 0) {
                this.f119204aw = this.f119197ap;
            }
            this.f119198aq = this.f119197ap;
            this.f119199ar = (long) i;
            this.f119227u = true;
            if (this.f119177aM == null) {
                this.f119177aM = new ArrayList<>();
            }
            this.f119177aM.add(Long.valueOf(this.f119197ap - this.f119152O.f119245a));
        }
    }

    public C46334a(C46311e eVar, C46280a aVar, long j, Context context) {
        this.f119149L = context;
        this.f119150M = new Handler(this);
        if (j <= 0) {
            j = 60000;
        }
        this.f119154Q = j;
        this.f119151N = aVar;
        this.f119153P = eVar;
        this.f119152O = new C46337b();
        this.f119166aB = new NTPUDPClient();
        this.f119166aB.setDefaultTimeout(VideoCacheTTnetProxyTimeoutExperiment.DEFAULT);
    }

    /* renamed from: a */
    private JSONObject m145444a(C46337b bVar, long j, boolean z, long j2) throws JSONException {
        JSONObject k = m145447k();
        if (k != null) {
            return k.put("event_key", "first_frame").put("last_retry_end", j).put("hit_cache", z ? 1 : 0).put("start", bVar.f119245a).put("sdk_dns_analysis_end", bVar.f119246b).put("prepare_block_end", bVar.f119247c).put("player_dns_analysis_end", bVar.f119248d).put("tcp_connect_end", bVar.f119249e).put("tcp_first_package_end", bVar.f119250f).put("first_video_package_end", bVar.f119251g).put("first_audio_package_end", bVar.f119252h).put("first_video_frame_decode_end", bVar.f119253i).put("first_audio_frame_decode_end", bVar.f119254j).put("first_frame_from_player_core", bVar.f119256l).put("first_frame_render_end", bVar.f119255k).put("video_device_open_start", bVar.f119258n).put("video_device_open_end", bVar.f119259o).put("audio_device_open_start", bVar.f119260p).put("audio_device_open_end", bVar.f119261q).put("video_buffer_time", this.f119152O.f119268x).put("audio_buffer_time", this.f119152O.f119269y).put("download_speed", this.f119152O.f119267w).put("stall_time", j2).put("first_sei_delay", this.f119152O.f119240D).put("prepare_end", bVar.f119257m);
        }
        return null;
    }

    /* renamed from: a */
    private JSONObject m145443a(C46337b bVar, long j, long j2, long j3, long j4, boolean z) throws JSONException {
        long j5;
        JSONObject k = m145447k();
        if (k == null) {
            return null;
        }
        long j6 = bVar.f119264t - j3;
        long j7 = bVar.f119265u - j4;
        long j8 = bVar.f119263s - j2;
        if (j7 <= 0 || j8 <= 0) {
            j5 = 0;
        } else {
            j5 = (j8 * 8) / j7;
        }
        this.f119159V++;
        int i = this.f119202au;
        int i2 = this.f119203av;
        if (this.f119227u && this.f119198aq != 0) {
            i++;
            i2 = (int) (((long) i2) + (System.currentTimeMillis() - this.f119198aq));
            this.f119198aq = System.currentTimeMillis();
        }
        k.put("event_key", "playing").put("video_download_size", bVar.f119262r).put("video_play_size", bVar.f119263s).put("render_fps", (double) bVar.f119266v).put("video_rate", j5).put("download_speed", this.f119152O.f119267w).put("play_time", j6).put("retry_count", this.f119206ay).put("stall_count", i).put("stall_time", i2).put("is_last", z ? 1 : 0).put("index", this.f119159V).put("sei_delay", this.f119152O.f119240D).put("sei_source", this.f119152O.f119241E).put("speed_switch_count", this.f119220n).put("speed_switch_info", this.f119221o).put("video_buffer_time", this.f119152O.f119268x).put("audio_buffer_time", this.f119152O.f119269y).put("enable_sei_check", this.f119145H ? 1 : 0).put("ntp_sync", this.f119170aF ? 1 : 0);
        this.f119206ay = 0;
        this.f119202au = 0;
        this.f119203av = 0;
        this.f119220n = 0;
        this.f119221o = "none";
        return k;
    }
}
