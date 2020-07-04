package com.p280ss.android.ugc.aweme.player.p1456a;

import bolts.C1592h;
import com.p280ss.android.common.util.NetworkUtils.NetworkType;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.p332ml.C7174p;
import com.p280ss.android.ugc.aweme.player.sdk.api.IPlayer.C34969e;
import com.p280ss.android.ugc.aweme.video.C43187ae;
import com.p280ss.android.ugc.aweme.video.preload.C43281f;
import com.p280ss.android.ugc.aweme.video.preload.C43281f.C43282a;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.DoubleRef;
import kotlin.jvm.internal.Ref.ObjectRef;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.a.c */
public final class C34943c {

    /* renamed from: o */
    public static final int f91119o = 1;

    /* renamed from: p */
    public static final int f91120p = 2;

    /* renamed from: q */
    public static final int f91121q = 3;

    /* renamed from: r */
    public static final String f91122r = f91122r;

    /* renamed from: s */
    public static final String f91123s = f91123s;

    /* renamed from: t */
    public static final String f91124t = f91124t;

    /* renamed from: u */
    public static final String f91125u = f91125u;

    /* renamed from: v */
    public static final int f91126v = 50;

    /* renamed from: w */
    public static final int f91127w = f91127w;

    /* renamed from: x */
    public static final int f91128x = f91128x;

    /* renamed from: y */
    public static final int f91129y = 5;

    /* renamed from: z */
    public static final C34946c f91130z = new C34946c(null);

    /* renamed from: a */
    public Aweme f91131a;

    /* renamed from: b */
    public Integer f91132b;

    /* renamed from: c */
    public boolean f91133c;

    /* renamed from: d */
    public boolean f91134d;

    /* renamed from: e */
    public String f91135e;

    /* renamed from: f */
    public List<C43281f> f91136f;

    /* renamed from: g */
    public List<C43187ae> f91137g;

    /* renamed from: h */
    public int f91138h;

    /* renamed from: i */
    public float f91139i;

    /* renamed from: j */
    public long f91140j;

    /* renamed from: k */
    public long f91141k;

    /* renamed from: l */
    public long f91142l;

    /* renamed from: m */
    public ArrayList<Aweme> f91143m;

    /* renamed from: n */
    public C34969e f91144n;

    /* renamed from: com.ss.android.ugc.aweme.player.a.c$a */
    public static final class C34944a {

        /* renamed from: a */
        public C34943c f91145a = new C34943c();

        /* renamed from: a */
        public final C34944a mo88504a(float f) {
            this.f91145a.f91139i = f;
            return this;
        }

        /* renamed from: b */
        public final C34944a mo88513b(int i) {
            this.f91145a.f91138h = i;
            return this;
        }

        /* renamed from: c */
        public final C34944a mo88517c(long j) {
            this.f91145a.f91142l = j;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88505a(int i) {
            this.f91145a.f91132b = Integer.valueOf(i);
            return this;
        }

        /* renamed from: b */
        public final C34944a mo88514b(long j) {
            this.f91145a.f91141k = j;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88506a(long j) {
            this.f91145a.f91140j = j;
            return this;
        }

        /* renamed from: b */
        public final C34944a mo88515b(List<C43187ae> list) {
            this.f91145a.f91137g = list;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88507a(Aweme aweme) {
            this.f91145a.f91131a = aweme;
            return this;
        }

        /* renamed from: b */
        public final C34944a mo88516b(boolean z) {
            this.f91145a.f91134d = z;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88508a(C34969e eVar) {
            this.f91145a.f91144n = eVar;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88509a(String str) {
            this.f91145a.f91135e = str;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88510a(ArrayList<Aweme> arrayList) {
            this.f91145a.f91143m = arrayList;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88511a(List<C43281f> list) {
            this.f91145a.f91136f = list;
            return this;
        }

        /* renamed from: a */
        public final C34944a mo88512a(boolean z) {
            this.f91145a.f91133c = z;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.c$b */
    public static final class C34945b {

        /* renamed from: a */
        public String f91146a;

        /* renamed from: b */
        public String f91147b;

        /* renamed from: c */
        public int f91148c;

        /* renamed from: d */
        public int f91149d;

        /* renamed from: e */
        public String f91150e;

        /* renamed from: f */
        public long f91151f;

        /* renamed from: g */
        public long f91152g;

        /* renamed from: h */
        public int f91153h;

        /* renamed from: i */
        public int f91154i = -1;

        /* renamed from: j */
        public int f91155j;

        /* renamed from: k */
        public String f91156k;

        /* renamed from: l */
        public long f91157l;

        /* renamed from: m */
        public long f91158m;

        /* renamed from: n */
        public Integer f91159n = Integer.valueOf(0);

        /* renamed from: a */
        public final JSONObject mo88518a() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cdn_ip", this.f91146a);
            jSONObject.put("cdn_name", this.f91147b);
            jSONObject.put("cdn_hit_code", this.f91148c);
            jSONObject.put("cdn_hit_code_l2", this.f91149d);
            if (this.f91148c == 0) {
                jSONObject.put("cdn_hit_str", this.f91150e);
            }
            jSONObject.put("cdn_response_duration", this.f91151f);
            jSONObject.put("cdn_cache_size", this.f91152g);
            jSONObject.put("server_timing", this.f91156k);
            jSONObject.put("url_idx", this.f91154i);
            jSONObject.put("status_code", this.f91153h);
            jSONObject.put("dl_duration", this.f91158m);
            jSONObject.put("dl_size", this.f91157l);
            return jSONObject;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.c$c */
    public static final class C34946c {
        private C34946c() {
        }

        /* renamed from: a */
        public static int m112614a() {
            return C34943c.f91119o;
        }

        /* renamed from: b */
        public static int m112615b() {
            return C34943c.f91120p;
        }

        /* renamed from: c */
        public static int m112616c() {
            return C34943c.f91121q;
        }

        /* renamed from: d */
        public static int m112617d() {
            return C34943c.f91127w;
        }

        /* renamed from: e */
        public static int m112618e() {
            return C34943c.f91128x;
        }

        /* renamed from: f */
        public static int m112619f() {
            return C34943c.f91129y;
        }

        public /* synthetic */ C34946c(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.c$d */
    public static final class C34947d {

        /* renamed from: a */
        public String f91160a;

        /* renamed from: b */
        public ArrayList<C34945b> f91161b;

        /* renamed from: c */
        public String f91162c;

        /* renamed from: d */
        public boolean f91163d;

        /* renamed from: e */
        public NetworkType f91164e = NetworkType.NONE;

        /* renamed from: f */
        public int f91165f;

        /* renamed from: g */
        public int f91166g;

        /* renamed from: h */
        public int f91167h;

        /* renamed from: i */
        public float f91168i;

        /* renamed from: j */
        public long f91169j;

        /* renamed from: k */
        public long f91170k;

        /* renamed from: l */
        public long f91171l;

        /* renamed from: m */
        public boolean f91172m;

        /* renamed from: n */
        public ArrayList<Integer> f91173n;

        /* renamed from: o */
        public ArrayList<Aweme> f91174o;

        /* renamed from: p */
        public C34969e f91175p;

        /* renamed from: a */
        public final void mo88519a(NetworkType networkType) {
            C7573i.m23587b(networkType, "<set-?>");
            this.f91164e = networkType;
        }

        /* renamed from: a */
        public final void mo88520a(JSONObject jSONObject) {
            C7573i.m23587b(jSONObject, "jsonObject");
            jSONObject.put("network_lib_type", this.f91160a);
            int i = 0;
            if (this.f91161b != null) {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                ArrayList<C34945b> arrayList = this.f91161b;
                if (arrayList == null) {
                    C7573i.m23580a();
                }
                Iterator it = arrayList.iterator();
                C7573i.m23582a((Object) it, "cdnRequestRecords!!.iterator()");
                while (it.hasNext()) {
                    C34945b bVar = (C34945b) it.next();
                    int d = C34946c.m112617d();
                    int e = C34946c.m112618e();
                    int i2 = bVar.f91153h;
                    if (d <= i2 && e > i2) {
                        i = bVar.f91155j;
                        jSONArray.put(bVar.mo88518a());
                    } else {
                        jSONArray2.put(bVar.mo88518a());
                    }
                }
                jSONObject.put("cdn_request_records", jSONArray);
                jSONObject.put("cdn_error_records", jSONArray2);
            }
            jSONObject.put("group_id", this.f91162c);
            jSONObject.put("is_h265", this.f91163d ? 1 : 0);
            jSONObject.put("access", this.f91164e);
            jSONObject.put("internet_speed", this.f91165f);
            jSONObject.put("video_bitrate", this.f91166g);
            jSONObject.put("video_quality", this.f91167h);
            jSONObject.put("video_duration", Float.valueOf(this.f91168i));
            jSONObject.put("play_duration", this.f91169j);
            jSONObject.put("url_cnt", i);
            jSONObject.put("cur_cache_duration", this.f91170k);
            jSONObject.put("cache_size", this.f91170k / 1024);
            jSONObject.put("play_bitrate", this.f91171l / 1024);
            jSONObject.put("buffering", this.f91172m ? 1 : 0);
            if (this.f91175p != null) {
                C34969e eVar = this.f91175p;
                if (eVar == null) {
                    C7573i.m23580a();
                }
                if (eVar.f91263f != null) {
                    String str = "ffr_free_duration";
                    C34969e eVar2 = this.f91175p;
                    if (eVar2 == null) {
                        C7573i.m23580a();
                    }
                    jSONObject.put(str, eVar2.f91263f.f91252a);
                    String str2 = "ffr_read_head_duration";
                    C34969e eVar3 = this.f91175p;
                    if (eVar3 == null) {
                        C7573i.m23580a();
                    }
                    jSONObject.put(str2, eVar3.f91263f.f91253b);
                    String str3 = "ffr_read_first_data_duration";
                    C34969e eVar4 = this.f91175p;
                    if (eVar4 == null) {
                        C7573i.m23580a();
                    }
                    jSONObject.put(str3, eVar4.f91263f.f91254c);
                    String str4 = "ffr_decode_duration";
                    C34969e eVar5 = this.f91175p;
                    if (eVar5 == null) {
                        C7573i.m23580a();
                    }
                    jSONObject.put(str4, eVar5.f91263f.f91255d);
                    String str5 = "ffr_render_duration";
                    C34969e eVar6 = this.f91175p;
                    if (eVar6 == null) {
                        C7573i.m23580a();
                    }
                    jSONObject.put(str5, eVar6.f91263f.f91256e);
                    String str6 = "ffr_playback_buffering_duration";
                    C34969e eVar7 = this.f91175p;
                    if (eVar7 == null) {
                        C7573i.m23580a();
                    }
                    jSONObject.put(str6, eVar7.f91263f.f91257f);
                }
            }
            if (this.f91174o != null) {
                ArrayList<Aweme> arrayList2 = this.f91174o;
                if (arrayList2 == null) {
                    C7573i.m23580a();
                }
                if (arrayList2.size() > 0) {
                    this.f91173n = new ArrayList<>();
                    ArrayList<Aweme> arrayList3 = this.f91174o;
                    if (arrayList3 == null) {
                        C7573i.m23580a();
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        Aweme aweme = (Aweme) it2.next();
                        C7573i.m23582a((Object) aweme, "item");
                        if (aweme.getVideo() != null) {
                            Video video = aweme.getVideo();
                            if (video == null) {
                                C7573i.m23580a();
                            }
                            if (video.getPlayAddr() != null) {
                                ArrayList<Integer> arrayList4 = this.f91173n;
                                if (arrayList4 == null) {
                                    C7573i.m23580a();
                                }
                                C43305j g = C43305j.m137386g();
                                Video video2 = aweme.getVideo();
                                C7573i.m23582a((Object) video2, "item.video");
                                arrayList4.add(Integer.valueOf(g.mo105026b(video2.getPlayAddr())));
                            }
                        }
                    }
                }
            }
            if (this.f91173n != null) {
                ArrayList<Integer> arrayList5 = this.f91173n;
                if (arrayList5 == null) {
                    C7573i.m23580a();
                }
                if (arrayList5.size() > 0) {
                    JSONArray jSONArray3 = new JSONArray();
                    ArrayList<Integer> arrayList6 = this.f91173n;
                    if (arrayList6 == null) {
                        C7573i.m23580a();
                    }
                    Iterator it3 = arrayList6.iterator();
                    C7573i.m23582a((Object) it3, "followCacheSizes!!.iterator()");
                    while (it3.hasNext()) {
                        Integer num = (Integer) it3.next();
                        C7573i.m23582a((Object) num, "e");
                        jSONArray3.put(num.intValue());
                    }
                    jSONObject.put("cache_duration", jSONArray3);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.player.a.c$e */
    static final class C34948e<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C34943c f91176a;

        /* renamed from: b */
        final /* synthetic */ DoubleRef f91177b;

        /* renamed from: c */
        final /* synthetic */ ObjectRef f91178c;

        C34948e(C34943c cVar, DoubleRef doubleRef, ObjectRef objectRef) {
            this.f91176a = cVar;
            this.f91177b = doubleRef;
            this.f91178c = objectRef;
        }

        public final /* synthetic */ Object call() {
            m112622a();
            return C7581n.f20898a;
        }

        /* JADX WARNING: Removed duplicated region for block: B:59:0x018e A[Catch:{ Throwable -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0193 A[Catch:{ Throwable -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x019a A[Catch:{ Throwable -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x019f A[Catch:{ Throwable -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01a2 A[Catch:{ Throwable -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0222 A[Catch:{ Throwable -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0236 A[Catch:{ Throwable -> 0x0247 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m112622a() {
            /*
                r15 = this;
                com.ss.android.ugc.aweme.player.a.c$d r0 = new com.ss.android.ugc.aweme.player.a.c$d     // Catch:{ Throwable -> 0x0247 }
                r0.<init>()     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.p280ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch:{ Throwable -> 0x0247 }
                java.lang.Class<com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService> r2 = com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService.class
                java.lang.Object r1 = r1.getService(r2)     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r1 = (com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r1     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f91131a     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r3 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.lang.Integer r3 = r3.f91132b     // Catch:{ Throwable -> 0x0247 }
                r4 = 0
                if (r3 == 0) goto L_0x0021
                int r3 = r3.intValue()     // Catch:{ Throwable -> 0x0247 }
                goto L_0x0022
            L_0x0021:
                r3 = 0
            L_0x0022:
                org.json.JSONObject r1 = r1.getRequestIdAndOrderJsonObject(r2, r3)     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r2 = "ServiceManager.get().get…ect(aweme, pageType ?: 0)"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r2 = r2.f91135e     // Catch:{ Throwable -> 0x0247 }
                r0.f91160a = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                float r2 = r2.f91139i     // Catch:{ Throwable -> 0x0247 }
                r0.f91168i = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                long r2 = r2.f91140j     // Catch:{ Throwable -> 0x0247 }
                r0.f91169j = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                long r2 = r2.f91141k     // Catch:{ Throwable -> 0x0247 }
                r0.f91170k = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                long r2 = r2.f91142l     // Catch:{ Throwable -> 0x0247 }
                r0.f91171l = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.util.ArrayList<com.ss.android.ugc.aweme.feed.model.Aweme> r2 = r2.f91143m     // Catch:{ Throwable -> 0x0247 }
                r0.f91174o = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f91131a     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107238m(r2)     // Catch:{ Throwable -> 0x0247 }
                r0.f91162c = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                boolean r2 = r2.f91133c     // Catch:{ Throwable -> 0x0247 }
                r0.f91163d = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                boolean r2 = r2.f91134d     // Catch:{ Throwable -> 0x0247 }
                r0.f91172m = r2     // Catch:{ Throwable -> 0x0247 }
                android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.common.util.NetworkUtils$NetworkType r2 = com.p280ss.android.common.util.NetworkUtils.getNetworkType(r2)     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r3 = "NetworkUtils.getNetworkT….getApplicationContext())"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Throwable -> 0x0247 }
                r0.mo88519a(r2)     // Catch:{ Throwable -> 0x0247 }
                int r2 = com.p280ss.android.ugc.networkspeed.C44903d.m141656f()     // Catch:{ Throwable -> 0x0247 }
                r0.f91165f = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.sdk.api.IPlayer$e r2 = r2.f91144n     // Catch:{ Throwable -> 0x0247 }
                r0.f91175p = r2     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.util.List<com.ss.android.ugc.aweme.video.preload.f> r2 = r2.f91136f     // Catch:{ Throwable -> 0x0247 }
                r3 = 0
                if (r2 == 0) goto L_0x0176
                java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0247 }
                r2.<init>()     // Catch:{ Throwable -> 0x0247 }
                r0.f91161b = r2     // Catch:{ Throwable -> 0x0247 }
                r2 = -1
                com.ss.android.ugc.aweme.player.a.c r5 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.util.List<com.ss.android.ugc.aweme.video.ae> r5 = r5.f91137g     // Catch:{ Throwable -> 0x0247 }
                if (r5 == 0) goto L_0x00af
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.util.List<com.ss.android.ugc.aweme.video.ae> r2 = r2.f91137g     // Catch:{ Throwable -> 0x0247 }
                if (r2 == 0) goto L_0x00a5
                int r2 = r2.size()     // Catch:{ Throwable -> 0x0247 }
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Throwable -> 0x0247 }
                goto L_0x00a6
            L_0x00a5:
                r2 = r3
            L_0x00a6:
                if (r2 != 0) goto L_0x00ab
                kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Throwable -> 0x0247 }
            L_0x00ab:
                int r2 = r2.intValue()     // Catch:{ Throwable -> 0x0247 }
            L_0x00af:
                com.ss.android.ugc.aweme.player.a.c r5 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.util.List<com.ss.android.ugc.aweme.video.preload.f> r5 = r5.f91136f     // Catch:{ Throwable -> 0x0247 }
                if (r5 != 0) goto L_0x00b8
                kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Throwable -> 0x0247 }
            L_0x00b8:
                java.util.Iterator r5 = r5.iterator()     // Catch:{ Throwable -> 0x0247 }
                r6 = 0
            L_0x00bd:
                boolean r7 = r5.hasNext()     // Catch:{ Throwable -> 0x0247 }
                if (r7 == 0) goto L_0x0176
                java.lang.Object r7 = r5.next()     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.video.preload.f r7 = (com.p280ss.android.ugc.aweme.video.preload.C43281f) r7     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c$b r8 = new com.ss.android.ugc.aweme.player.a.c$b     // Catch:{ Throwable -> 0x0247 }
                r8.<init>()     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r9 = r7.f112041g     // Catch:{ Throwable -> 0x0247 }
                r8.f91146a = r9     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r9 = r7.f112039e     // Catch:{ Throwable -> 0x0247 }
                java.lang.CharSequence r9 = (java.lang.CharSequence) r9     // Catch:{ Throwable -> 0x0247 }
                boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0247 }
                if (r9 != 0) goto L_0x00e3
                java.lang.String r9 = r7.f112039e     // Catch:{ Throwable -> 0x0247 }
                android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch:{ Throwable -> 0x0247 }
                goto L_0x00e4
            L_0x00e3:
                r9 = r3
            L_0x00e4:
                if (r9 == 0) goto L_0x00eb
                java.lang.String r9 = r9.getHost()     // Catch:{ Throwable -> 0x0247 }
                goto L_0x00ec
            L_0x00eb:
                r9 = r3
            L_0x00ec:
                r8.f91147b = r9     // Catch:{ Throwable -> 0x0247 }
                long r9 = r7.f112043i     // Catch:{ Throwable -> 0x0247 }
                r8.f91151f = r9     // Catch:{ Throwable -> 0x0247 }
                long r9 = r7.f112044j     // Catch:{ Throwable -> 0x0247 }
                r8.f91152g = r9     // Catch:{ Throwable -> 0x0247 }
                java.util.Map<java.lang.String, java.lang.String> r9 = r7.f112045k     // Catch:{ Throwable -> 0x0247 }
                int r9 = com.p280ss.android.ugc.aweme.player.p1456a.C34943c.m112593a(r9)     // Catch:{ Throwable -> 0x0247 }
                r8.f91148c = r9     // Catch:{ Throwable -> 0x0247 }
                int r9 = r7.f112046l     // Catch:{ Throwable -> 0x0247 }
                r8.f91153h = r9     // Catch:{ Throwable -> 0x0247 }
                int r9 = r7.f112047m     // Catch:{ Throwable -> 0x0247 }
                r8.f91154i = r9     // Catch:{ Throwable -> 0x0247 }
                int r9 = r7.f112048n     // Catch:{ Throwable -> 0x0247 }
                r8.f91155j = r9     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r9 = r7.f112039e     // Catch:{ Throwable -> 0x0247 }
                if (r9 == 0) goto L_0x011d
                java.lang.String r10 = "https"
                r11 = 2
                boolean r9 = kotlin.text.C7634n.m23721b(r9, r10, false)     // Catch:{ Throwable -> 0x0247 }
                r10 = 1
                if (r9 != r10) goto L_0x011d
                java.lang.Integer r9 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x0247 }
                goto L_0x0121
            L_0x011d:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0247 }
            L_0x0121:
                r8.f91159n = r9     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.player.a.c r9 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                boolean r9 = r9.mo88502a()     // Catch:{ Throwable -> 0x0247 }
                if (r9 == 0) goto L_0x014c
                if (r6 >= r2) goto L_0x014c
                com.ss.android.ugc.aweme.player.a.c r9 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                java.util.List<com.ss.android.ugc.aweme.video.ae> r9 = r9.f91137g     // Catch:{ Throwable -> 0x0247 }
                if (r9 == 0) goto L_0x013a
                java.lang.Object r9 = r9.get(r6)     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.video.ae r9 = (com.p280ss.android.ugc.aweme.video.C43187ae) r9     // Catch:{ Throwable -> 0x0247 }
                goto L_0x013b
            L_0x013a:
                r9 = r3
            L_0x013b:
                if (r9 == 0) goto L_0x014c
                r9.mo104821a()     // Catch:{ Throwable -> 0x0247 }
                long r10 = r9.f111826e     // Catch:{ Throwable -> 0x0247 }
                long r12 = r7.f112043i     // Catch:{ Throwable -> 0x0247 }
                r14 = 0
                long r10 = r10 + r12
                r8.f91158m = r10     // Catch:{ Throwable -> 0x0247 }
                long r9 = r9.f111825d     // Catch:{ Throwable -> 0x0247 }
                r8.f91157l = r9     // Catch:{ Throwable -> 0x0247 }
            L_0x014c:
                java.util.Map<java.lang.String, java.lang.String> r9 = r7.f112045k     // Catch:{ Throwable -> 0x0247 }
                int r9 = com.p280ss.android.ugc.aweme.player.p1456a.C34943c.m112594b(r9)     // Catch:{ Throwable -> 0x0247 }
                r8.f91149d = r9     // Catch:{ Throwable -> 0x0247 }
                int r9 = r8.f91148c     // Catch:{ Throwable -> 0x0247 }
                if (r9 != 0) goto L_0x0160
                java.util.Map<java.lang.String, java.lang.String> r9 = r7.f112045k     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r9 = com.p280ss.android.ugc.aweme.player.p1456a.C34943c.m112595c(r9)     // Catch:{ Throwable -> 0x0247 }
                r8.f91150e = r9     // Catch:{ Throwable -> 0x0247 }
            L_0x0160:
                java.util.Map<java.lang.String, java.lang.String> r7 = r7.f112045k     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r7 = com.p280ss.android.ugc.aweme.player.p1456a.C34943c.m112596d(r7)     // Catch:{ Throwable -> 0x0247 }
                r8.f91156k = r7     // Catch:{ Throwable -> 0x0247 }
                java.util.ArrayList<com.ss.android.ugc.aweme.player.a.c$b> r7 = r0.f91161b     // Catch:{ Throwable -> 0x0247 }
                if (r7 != 0) goto L_0x016f
                kotlin.jvm.internal.C7573i.m23580a()     // Catch:{ Throwable -> 0x0247 }
            L_0x016f:
                r7.add(r8)     // Catch:{ Throwable -> 0x0247 }
                int r6 = r6 + 1
                goto L_0x00bd
            L_0x0176:
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f91131a     // Catch:{ Throwable -> 0x0247 }
                if (r2 == 0) goto L_0x0187
                com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()     // Catch:{ Throwable -> 0x0247 }
                if (r2 == 0) goto L_0x0187
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()     // Catch:{ Throwable -> 0x0247 }
                goto L_0x0188
            L_0x0187:
                r2 = r3
            L_0x0188:
                com.ss.android.ugc.playerkit.session.a r5 = com.p280ss.android.ugc.playerkit.session.C44925a.m141730a()     // Catch:{ Throwable -> 0x0247 }
                if (r2 == 0) goto L_0x0193
                java.lang.String r6 = r2.getUri()     // Catch:{ Throwable -> 0x0247 }
                goto L_0x0194
            L_0x0193:
                r6 = r3
            L_0x0194:
                com.ss.android.ugc.playerkit.session.Session r5 = r5.mo107408b(r6)     // Catch:{ Throwable -> 0x0247 }
                if (r2 == 0) goto L_0x019f
                java.util.List r6 = r2.getBitRate()     // Catch:{ Throwable -> 0x0247 }
                goto L_0x01a0
            L_0x019f:
                r6 = r3
            L_0x01a0:
                if (r5 == 0) goto L_0x01e1
                java.lang.String r7 = r5.sourceId     // Catch:{ Throwable -> 0x0247 }
                java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Throwable -> 0x0247 }
                if (r2 == 0) goto L_0x01ac
                java.lang.String r3 = r2.getSourceId()     // Catch:{ Throwable -> 0x0247 }
            L_0x01ac:
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Throwable -> 0x0247 }
                boolean r2 = android.text.TextUtils.equals(r7, r3)     // Catch:{ Throwable -> 0x0247 }
                if (r2 == 0) goto L_0x01e1
                int r2 = r5.bitrate     // Catch:{ Throwable -> 0x0247 }
                r0.f91166g = r2     // Catch:{ Throwable -> 0x0247 }
                if (r6 == 0) goto L_0x01e1
                r2 = r6
                java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ Throwable -> 0x0247 }
                int r2 = r2.size()     // Catch:{ Throwable -> 0x0247 }
            L_0x01c1:
                if (r4 >= r2) goto L_0x01e1
                java.lang.Object r3 = r6.get(r4)     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.feed.model.BitRate r3 = (com.p280ss.android.ugc.aweme.feed.model.BitRate) r3     // Catch:{ Throwable -> 0x0247 }
                int r3 = r3.getBitRate()     // Catch:{ Throwable -> 0x0247 }
                int r7 = r5.bitrate     // Catch:{ Throwable -> 0x0247 }
                if (r3 != r7) goto L_0x01de
                java.lang.Object r2 = r6.get(r4)     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.feed.model.BitRate r2 = (com.p280ss.android.ugc.aweme.feed.model.BitRate) r2     // Catch:{ Throwable -> 0x0247 }
                int r2 = r2.getQualityType()     // Catch:{ Throwable -> 0x0247 }
                r0.f91167h = r2     // Catch:{ Throwable -> 0x0247 }
                goto L_0x01e1
            L_0x01de:
                int r4 = r4 + 1
                goto L_0x01c1
            L_0x01e1:
                java.lang.String r2 = "pt_predict"
                kotlin.jvm.internal.Ref$DoubleRef r3 = r15.f91177b     // Catch:{ Throwable -> 0x0247 }
                double r3 = r3.element     // Catch:{ Throwable -> 0x0247 }
                r1.put(r2, r3)     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r2 = "pt_predictL"
                kotlin.jvm.internal.Ref$ObjectRef r3 = r15.f91178c     // Catch:{ Throwable -> 0x0247 }
                T r3 = r3.element     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x0247 }
                r1.put(r2, r3)     // Catch:{ Throwable -> 0x0247 }
                r0.mo88520a(r1)     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r0 = "event_error_code"
                com.ss.android.ugc.aweme.player.a.c r2 = r15.f91176a     // Catch:{ Throwable -> 0x0247 }
                int r2 = r2.f91138h     // Catch:{ Throwable -> 0x0247 }
                r1.put(r0, r2)     // Catch:{ Throwable -> 0x0247 }
                com.ss.android.ugc.aweme.video.f r0 = com.p280ss.android.ugc.aweme.video.C43316v.m137451L()     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r2 = "codec_name"
                java.lang.String r3 = "playerInfoProvider"
                kotlin.jvm.internal.C7573i.m23582a(r0, r3)     // Catch:{ Throwable -> 0x0247 }
                int r3 = r0.mo104904c()     // Catch:{ Throwable -> 0x0247 }
                r1.put(r2, r3)     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r2 = "codec_id"
                int r0 = r0.mo104905d()     // Catch:{ Throwable -> 0x0247 }
                r1.put(r2, r0)     // Catch:{ Throwable -> 0x0247 }
                boolean r0 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()     // Catch:{ Throwable -> 0x0247 }
                if (r0 == 0) goto L_0x0230
                java.lang.String r0 = "play_end_event"
                java.lang.String r2 = r1.toString()     // Catch:{ Throwable -> 0x0247 }
                java.lang.String r3 = "jsonObject.toString()"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)     // Catch:{ Throwable -> 0x0247 }
                com.p280ss.android.ugc.aweme.player.C34938a.m112587a(r0, r2)     // Catch:{ Throwable -> 0x0247 }
            L_0x0230:
                boolean r0 = com.p280ss.android.ugc.aweme.setting.C37653j.m120481c()     // Catch:{ Throwable -> 0x0247 }
                if (r0 == 0) goto L_0x0241
                java.lang.String r0 = "traffic_economy_mode"
                com.ss.android.ugc.aweme.setting.j r2 = com.p280ss.android.ugc.aweme.setting.C37653j.f98123a     // Catch:{ Throwable -> 0x0247 }
                int r2 = r2.mo94946d()     // Catch:{ Throwable -> 0x0247 }
                r1.put(r0, r2)     // Catch:{ Throwable -> 0x0247 }
            L_0x0241:
                java.lang.String r0 = "video_play_end"
                com.p280ss.android.ugc.aweme.common.C6907h.m21525a(r0, r1)     // Catch:{ Throwable -> 0x0247 }
                return
            L_0x0247:
                r0 = move-exception
                java.lang.String r1 = "VideoStopPlayEvent report fail."
                com.bytedance.p066a.p067a.p070b.p072b.C2077a.m9161a(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.player.p1456a.C34943c.C34948e.m112622a():void");
        }
    }

    /* renamed from: b */
    public final void mo88503b() {
        DoubleRef doubleRef = new DoubleRef();
        C7174p a = C7174p.m22398a();
        C7573i.m23582a((Object) a, "SmartPreloadV2Judge.instance()");
        doubleRef.element = (double) a.mo18652e();
        ObjectRef objectRef = new ObjectRef();
        C7174p a2 = C7174p.m22398a();
        C7573i.m23582a((Object) a2, "SmartPreloadV2Judge.instance()");
        objectRef.element = a2.mo18651d();
        C1592h.m7855a((Callable<TResult>) new C34948e<TResult>(this, doubleRef, objectRef), (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public final boolean mo88502a() {
        if (!(this.f91136f == null || this.f91137g == null)) {
            List<C43187ae> list = this.f91137g;
            if (list == null) {
                C7573i.m23580a();
            }
            int size = list.size();
            List<C43281f> list2 = this.f91136f;
            if (list2 == null) {
                C7573i.m23580a();
            }
            if (size == list2.size()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int m112594b(Map<String, String> map) {
        if (map == null || !map.containsKey(f91122r)) {
            return 0;
        }
        return C34949d.m112623a((String) map.get(f91122r));
    }

    /* renamed from: d */
    public static String m112596d(Map<String, String> map) {
        if (map == null || !map.containsKey(f91123s)) {
            return null;
        }
        return (String) map.get(f91123s);
    }

    /* renamed from: a */
    public static int m112593a(Map<String, String> map) {
        if (map != null) {
            if (map.containsKey(C43282a.m137313a())) {
                return C34949d.m112623a((String) map.get(C43282a.m137313a()));
            }
            if (map.containsKey(C43282a.m137314b())) {
                return C34949d.m112623a((String) map.get(C43282a.m137314b()));
            }
        }
        return 0;
    }

    /* renamed from: c */
    public static String m112595c(Map<String, String> map) {
        String str = "";
        if (map == null) {
            return str;
        }
        String str2 = null;
        if (map.containsKey(C43282a.m137313a())) {
            String str3 = (String) map.get(C43282a.m137313a());
            if (str3 != null) {
                int i = f91126v;
                if (str3 != null) {
                    str2 = str3.substring(i);
                    C7573i.m23582a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return String.valueOf(str2);
        } else if (!map.containsKey(C43282a.m137314b())) {
            return str;
        } else {
            String str4 = (String) map.get(C43282a.m137314b());
            if (str4 != null) {
                int i2 = f91126v;
                if (str4 != null) {
                    str2 = str4.substring(i2);
                    C7573i.m23582a((Object) str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                }
            }
            return String.valueOf(str2);
        }
    }
}
