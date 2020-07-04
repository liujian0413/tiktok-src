package com.bytedance.android.livesdk.chatroom.detail;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.live.p402a.C8384a;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.C8444d;
import com.bytedance.android.livesdk.log.C8448g;
import com.bytedance.android.livesdk.log.C8449h;
import com.bytedance.android.livesdk.log.p405b.C8431c;
import com.bytedance.android.livesdk.log.p405b.C8436h;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.p428w.C9178j;
import com.bytedance.android.livesdk.utils.C9074l;
import com.bytedance.android.livesdk.utils.C9078p;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.h */
public final class C4329h {

    /* renamed from: t */
    private static boolean f12577t;

    /* renamed from: A */
    private final Bundle f12578A;

    /* renamed from: B */
    private final String f12579B;

    /* renamed from: C */
    private long f12580C = 0;

    /* renamed from: D */
    private boolean f12581D = false;

    /* renamed from: E */
    private boolean f12582E = false;

    /* renamed from: F */
    private boolean f12583F = false;

    /* renamed from: G */
    private boolean f12584G = false;

    /* renamed from: H */
    private boolean f12585H = false;

    /* renamed from: I */
    private boolean f12586I;

    /* renamed from: J */
    private long f12587J = -1;

    /* renamed from: K */
    private long f12588K = -1;

    /* renamed from: L */
    private long f12589L;

    /* renamed from: M */
    private String f12590M = "other";

    /* renamed from: N */
    private String f12591N = "";

    /* renamed from: O */
    private String f12592O;

    /* renamed from: P */
    private long f12593P;

    /* renamed from: Q */
    private C9380q f12594Q;

    /* renamed from: R */
    private long f12595R;

    /* renamed from: S */
    private long f12596S;

    /* renamed from: T */
    private String f12597T;

    /* renamed from: U */
    private int f12598U;

    /* renamed from: V */
    private long f12599V;

    /* renamed from: W */
    private C7321c f12600W;

    /* renamed from: X */
    private boolean f12601X = false;

    /* renamed from: Y */
    private boolean f12602Y = false;

    /* renamed from: Z */
    private long f12603Z;

    /* renamed from: a */
    public boolean f12604a;

    /* renamed from: b */
    public boolean f12605b = true;

    /* renamed from: c */
    public final Handler f12606c;

    /* renamed from: d */
    public final String f12607d;

    /* renamed from: e */
    public long f12608e = -1;

    /* renamed from: f */
    public C8384a f12609f = null;

    /* renamed from: g */
    public long f12610g = 0;

    /* renamed from: h */
    public String f12611h = "click";

    /* renamed from: i */
    public String f12612i;

    /* renamed from: j */
    public String f12613j;

    /* renamed from: k */
    public String f12614k;

    /* renamed from: l */
    public boolean f12615l;

    /* renamed from: m */
    public String f12616m;

    /* renamed from: n */
    public DataCenter f12617n;

    /* renamed from: o */
    public long f12618o = -1;

    /* renamed from: p */
    public String f12619p;

    /* renamed from: q */
    public String f12620q = "";

    /* renamed from: r */
    public String f12621r;

    /* renamed from: s */
    public String f12622s;

    /* renamed from: u */
    private final Runnable f12623u = new Runnable() {
        public final void run() {
            long j;
            String str;
            if (C4329h.this.f12604a) {
                j = 60000 - (((SystemClock.elapsedRealtime() - C4329h.this.f12608e) - C4329h.this.f12610g) % 60000);
                C4329h.this.f12604a = false;
            } else {
                j = 60000;
            }
            C4329h.this.f12606c.postDelayed(this, j);
            if (C4329h.this.f12605b || j != 60000) {
                C4329h.this.f12605b = false;
                return;
            }
            HashMap hashMap = new HashMap();
            String str2 = "streaming_type";
            if (C4329h.this.f12615l) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put(str2, str);
            hashMap.put("growth_deepevent", "1");
            C8443c.m25663a().mo21606a("watch_onemin", hashMap, new C8438j().mo21599b("live_view").mo21598a("live_detail").mo21604g(C4329h.this.f12611h), Room.class);
        }
    };

    /* renamed from: v */
    private final WeakReference<Context> f12624v;

    /* renamed from: w */
    private final String f12625w;

    /* renamed from: x */
    private final String f12626x;

    /* renamed from: y */
    private final long f12627y;

    /* renamed from: z */
    private final Bundle f12628z;

    /* renamed from: a */
    public final void mo12025a(boolean z, int i, String str) {
        if (!this.f12583F) {
            this.f12583F = true;
            String str2 = this.f12609f == null ? "other" : this.f12609f.f22984a;
            long j = 0;
            if (z && this.f12587J > 0) {
                j = this.f12587J;
            }
            new C8449h().mo21613a("error_code", (Object) Integer.valueOf(i)).mo21613a("error_desc", (Object) str).mo21613a("duration", (Object) Long.valueOf(j)).mo21613a("enter_room_type", (Object) str2).mo21613a("room_id", (Object) Long.valueOf(this.f12580C)).mo21616a("hotsoon_live_audience_enter_room", z ^ true ? 1 : 0);
        }
    }

    /* renamed from: r */
    private void m14556r() {
        this.f12599V = SystemClock.elapsedRealtime();
    }

    /* renamed from: o */
    public final void mo12041o() {
        this.f12603Z = SystemClock.elapsedRealtime();
    }

    /* renamed from: e */
    public final long mo12031e() {
        return (SystemClock.elapsedRealtime() - this.f12608e) - this.f12610g;
    }

    /* renamed from: c */
    public final void mo12029c() {
        this.f12582E = true;
        if (this.f12608e != -1) {
            this.f12588K = SystemClock.elapsedRealtime();
            this.f12606c.removeCallbacksAndMessages(null);
            this.f12604a = true;
        }
    }

    /* renamed from: g */
    public final void mo12033g() {
        if (!this.f12581D) {
            this.f12581D = true;
            if (this.f12609f != null) {
                this.f12587J = this.f12609f.mo21546a();
            } else {
                this.f12587J = SystemClock.elapsedRealtime() - this.f12608e;
            }
        }
    }

    /* renamed from: j */
    public final void mo12036j() {
        Context context;
        if (this.f12624v == null || this.f12624v.get() == null) {
            context = null;
        } else {
            context = (Context) this.f12624v.get();
        }
        C8448g.m25682a(context);
    }

    /* renamed from: a */
    public final void mo12020a() {
        this.f12581D = false;
        this.f12582E = false;
        this.f12583F = false;
        this.f12585H = false;
        this.f12586I = false;
        this.f12608e = -1;
        this.f12586I = false;
        this.f12609f = null;
        this.f12587J = -1;
        this.f12588K = -1;
        this.f12610g = 0;
        this.f12611h = null;
        this.f12590M = null;
        this.f12612i = null;
        this.f12592O = null;
        this.f12594Q = null;
        this.f12595R = 0;
        this.f12596S = 0;
        this.f12597T = null;
        this.f12598U = 0;
        this.f12602Y = false;
        this.f12601X = false;
        this.f12584G = false;
        this.f12617n = null;
        this.f12606c.removeCallbacksAndMessages(null);
    }

    /* renamed from: b */
    public final void mo12027b() {
        this.f12608e = SystemClock.elapsedRealtime();
        this.f12618o = SystemClock.elapsedRealtime();
        if (this.f12582E) {
            this.f12588K = this.f12608e;
        }
        this.f12605b = true;
        this.f12606c.post(this.f12623u);
        m14556r();
    }

    /* renamed from: d */
    public final void mo12030d() {
        this.f12582E = false;
        if (this.f12588K != -1) {
            this.f12610g += SystemClock.elapsedRealtime() - this.f12588K;
            this.f12588K = -1;
            this.f12606c.post(this.f12623u);
            m14556r();
        }
    }

    /* renamed from: i */
    public final void mo12035i() {
        Context context;
        this.f12609f = C9178j.m27302j().mo22376e().mo21566a(true);
        if (this.f12624v == null || this.f12624v.get() == null) {
            context = null;
        } else {
            context = (Context) this.f12624v.get();
        }
        C8448g.m25682a(context);
    }

    /* renamed from: k */
    public final void mo12037k() {
        Context context;
        if (this.f12624v == null || this.f12624v.get() == null) {
            context = null;
        } else {
            context = (Context) this.f12624v.get();
        }
        C8448g.m25682a(context);
        m14554a("request_id", this.f12625w, "log_pb", this.f12626x, "log_pb", this.f12626x);
    }

    /* renamed from: l */
    public final void mo12038l() {
        HashMap hashMap = new HashMap();
        hashMap.put("growth_deepevent", "1");
        C8443c.m25663a().mo21606a("follow", hashMap, new C8431c("live_exit_popup", this.f12593P), new C8438j().mo21599b("live_interact").mo21598a("live_detail"), Room.class);
    }

    /* renamed from: h */
    public final void mo12034h() {
        String str;
        long j;
        if (!this.f12585H) {
            this.f12585H = true;
            if (this.f12609f == null) {
                str = "other";
            } else {
                str = this.f12609f.f22984a;
            }
            if (this.f12581D) {
                j = this.f12587J;
            } else if (this.f12609f != null) {
                j = this.f12609f.mo21546a();
            } else {
                j = SystemClock.elapsedRealtime() - this.f12608e;
            }
            C8449h hVar = new C8449h();
            String str2 = "wait_duration";
            if (j <= 0) {
                j = 0;
            }
            hVar.mo21613a(str2, (Object) Long.valueOf(j)).mo21613a("enter_room_type", (Object) str).mo21616a("hotsoon_live_enter_wait_patience", true ^ this.f12581D ? 1 : 0);
        }
    }

    /* renamed from: m */
    public final void mo12039m() {
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "show");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "popup");
        hashMap.put("live_type", this.f12592O);
        hashMap.put("request_id", this.f12625w);
        hashMap.put("log_pb", this.f12626x);
        C8443c.m25663a().mo21606a("crash_popup_show", hashMap, new Object[0]);
    }

    /* renamed from: n */
    public final void mo12040n() {
        HashMap hashMap = new HashMap();
        hashMap.put("event_belong", "live");
        hashMap.put("event_type", "click");
        hashMap.put("event_page", "live_detail");
        hashMap.put("event_module", "popup");
        hashMap.put("live_type", this.f12592O);
        hashMap.put("request_id", this.f12625w);
        hashMap.put("log_pb", this.f12626x);
        C8443c.m25663a().mo21606a("crash_popup_click_over", hashMap, new Object[0]);
    }

    /* renamed from: p */
    public final void mo12042p() {
        HashMap hashMap = new HashMap();
        if (this.f12628z != null) {
            long j = this.f12628z.getLong("live.intent.extra.LOAD_DURATION", 0);
            if (j > 0) {
                this.f12628z.remove("live.intent.extra.LOAD_DURATION");
                hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - j));
                C8443c.m25663a().mo21606a("livesdk_live_stream_load_duration", hashMap, new C8438j(), Room.class);
                if (this.f12603Z > 0) {
                    hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f12603Z));
                    C8443c.m25663a().mo21606a("livesdk_new_style_pull_stream_duration", hashMap, new C8438j(), Room.class);
                }
            }
        }
    }

    /* renamed from: f */
    public final void mo12032f() {
        String str;
        if (this.f12608e != -1 && !this.f12586I) {
            long elapsedRealtime = (SystemClock.elapsedRealtime() - this.f12608e) - this.f12610g;
            String str2 = "";
            if (this.f12628z != null) {
                this.f12628z.getString("source");
            }
            HashMap hashMap = new HashMap();
            String str3 = "streaming_type";
            if (this.f12615l) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put(str3, str);
            C8443c.m25663a().mo21606a("live_duration", hashMap, new C8438j().mo21599b("live_view").mo21598a("live_detail").mo21601d(str2), new C8436h(elapsedRealtime), Room.class);
            this.f12586I = true;
            if (this.f12618o != -1) {
                Map a = m14553a(this.f12617n);
                if (this.f12600W != null && !this.f12600W.isDisposed()) {
                    try {
                        this.f12600W.dispose();
                    } catch (Exception e) {
                        C8444d.m25673b();
                        C8444d.m11969a(6, e.getStackTrace());
                    }
                }
                a.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f12618o));
                a.put("trigger", "close");
                C8443c.m25663a().mo21606a("livesdk_video_over", a, new C8438j().mo21604g(this.f12611h), Room.class);
                this.f12618o = -1;
            }
        }
    }

    /* renamed from: q */
    private void m14555q() {
        String str;
        long j;
        String str2;
        if (!this.f12584G) {
            this.f12584G = true;
            HashMap hashMap = new HashMap();
            String str3 = "streaming_type";
            if (this.f12615l) {
                str = "thirdparty";
            } else {
                str = "general";
            }
            hashMap.put(str3, str);
            if (this.f12628z != null) {
                Bundle bundle = (Bundle) this.f12628z.get("live.intent.extra.ENTER_LIVE_EXTRA_V1");
                if (bundle != null && bundle.containsKey("subtab")) {
                    hashMap.put("subtab", (String) bundle.get("subtab"));
                }
            }
            if (!C6319n.m19593a(this.f12619p) && "draw".equals(this.f12611h)) {
                hashMap.put("scene_id", this.f12619p);
            }
            hashMap.put("growth_deepevent", "1");
            hashMap.put("live_cover_mode", this.f12591N);
            if (this.f12628z != null) {
                j = this.f12628z.getLong("live.intent.extra.FROM_PORTAL_ID");
            } else {
                j = 0;
            }
            if (j > 0) {
                hashMap.put("portal_id", String.valueOf(j));
                hashMap.put("originating_room_id", String.valueOf(this.f12628z.getLong("live.intent.extra.ORIGINATING_ROOM_ID")));
            }
            if (this.f12628z != null) {
                hashMap.put("request_page", this.f12628z.getString("request_page"));
            }
            if (this.f12628z != null) {
                hashMap.put("anchor_type", this.f12628z.getString("anchor_type"));
            }
            if (C9074l.m27089d(this.f12617n) || C9074l.m27086b(this.f12617n)) {
                String str4 = "is_other_channel";
                if (C9074l.m27086b(this.f12617n)) {
                    str2 = "dou_plus";
                } else {
                    str2 = "effective_ad";
                }
                hashMap.put(str4, str2);
            }
            if (!TextUtils.isEmpty(this.f12622s)) {
                hashMap.put("previous_page", this.f12622s);
            }
            if (!(this.f12578A == null || this.f12578A.getBundle("log_extra") == null)) {
                String string = this.f12578A.getBundle("log_extra").getString("enter_from_merge");
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put("previous_page", string);
                }
            }
            C8443c.m25663a().mo21606a("live_play", hashMap, new C8438j().mo21599b("live_view").mo21603f("core").mo21598a("live_detail").mo21600c("live"), Room.class, LinkCrossRoomDataHolder.m13782a().mo11449b());
        }
    }

    /* renamed from: a */
    private static JSONObject m14554a(Object... objArr) {
        JSONObject jSONObject = new JSONObject();
        int i = 0;
        while (i < 6) {
            try {
                if (objArr[i] instanceof String) {
                    int i2 = i + 1;
                    if (i2 < 6) {
                        jSONObject.put(objArr[i], objArr[i2]);
                    } else if (f12577t) {
                        throw new IllegalArgumentException(C9078p.m27101a(Locale.ENGLISH, "no value found for key at %d", Integer.valueOf(i)));
                    }
                } else if (f12577t) {
                    throw new IllegalArgumentException(C9078p.m27101a(Locale.ENGLISH, "key at %d is not a string", Integer.valueOf(i)));
                }
                i += 2;
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final void mo12028b(String str) {
        if (this.f12608e != -1) {
            String str2 = "button";
            if (C6319n.m19593a(str)) {
                str = str2;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.f12589L));
            C8443c.m25663a().mo21606a("livesdk_more_anchor_duration", hashMap, new C8438j().mo21603f(str), Room.class);
        }
    }

    /* renamed from: a */
    private Map<String, String> m14553a(DataCenter dataCenter) {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (this.f12628z != null) {
            hashMap.put("starlight_rank", this.f12628z.getString("starlight_rank", ""));
        }
        String str3 = "";
        if (C8443c.m25663a().mo21605a(C8438j.class).mo21568a().containsKey("video_id")) {
            str3 = (String) C8443c.m25663a().mo21605a(C8438j.class).mo21568a().get("video_id");
        }
        hashMap.put("video_id", str3);
        if (dataCenter != null) {
            String str4 = "is_live_recall";
            if (C6319n.m19593a((String) dataCenter.get("data_xt_media_replay", ""))) {
                str = "0";
            } else {
                str = "1";
            }
            hashMap.put(str4, str);
            Room room = (Room) dataCenter.get("data_room");
            if (room != null) {
                String str5 = "is_sale";
                if (room.hasCommerceGoods) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                hashMap.put(str5, str2);
                hashMap.put("orientation", String.valueOf(room.getOrientation()));
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo12022a(Room room) {
        room.setUserFrom(this.f12627y);
        room.setRequestId(this.f12625w);
        room.setLog_pb(this.f12626x);
        room.setLabels(this.f12607d);
        room.setSourceType(this.f12616m);
        if (!TextUtils.isEmpty(this.f12579B)) {
            room.setPrivateInfo(this.f12579B);
        }
    }

    /* renamed from: a */
    public final void mo12023a(String str) {
        if (this.f12608e != -1) {
            String str2 = "button";
            if (C6319n.m19593a(str)) {
                str = str2;
            }
            HashMap hashMap = new HashMap();
            this.f12589L = SystemClock.elapsedRealtime();
            C8443c.m25663a().mo21606a("livesdk_more_anchor_show", hashMap, new C8438j().mo21603f(str), Room.class);
        }
    }

    /* renamed from: a */
    public final void mo12026a(boolean z, boolean z2) {
        if (z) {
            this.f12601X = z;
        }
        if (z2) {
            this.f12602Y = z2;
        }
        if (this.f12602Y && this.f12601X) {
            m14555q();
        }
    }

    /* renamed from: a */
    public final void mo12024a(String str, String str2, String str3) {
        this.f12611h = str;
        this.f12590M = str2;
        this.f12591N = str3;
    }

    /* renamed from: a */
    public final void mo12021a(long j, boolean z, boolean z2, long j2, C9380q qVar) {
        String str;
        this.f12580C = j;
        if (z) {
            str = "voice_live";
        } else {
            str = "video_live";
        }
        this.f12592O = str;
        this.f12615l = z2;
        this.f12593P = j2;
        this.f12594Q = qVar;
        if (qVar != null) {
            this.f12595R = qVar.f25761a;
            if (qVar.f25763c != null && qVar.f25763c.f25650b != 0) {
                this.f12596S = qVar.f25763c.f25653e;
                this.f12597T = qVar.f25763c.f25651c;
                this.f12598U = qVar.f25763c.f25650b;
            }
        }
    }

    public C4329h(Context context, String str, String str2, long j, String str3, String str4, Bundle bundle, Bundle bundle2, String str5, String str6, String str7) {
        f12577t = TextUtils.equals(TTLiveSDKContext.getHostService().mo22360a().getChannel(), "local_test");
        this.f12606c = new Handler(Looper.getMainLooper());
        Context context2 = context;
        this.f12624v = new WeakReference<>(context);
        this.f12625w = str;
        this.f12626x = str2;
        this.f12627y = j;
        this.f12607d = str3;
        this.f12612i = str4;
        this.f12628z = bundle;
        this.f12578A = bundle2;
        this.f12579B = str5;
        this.f12613j = str6;
        this.f12614k = str7;
    }
}
