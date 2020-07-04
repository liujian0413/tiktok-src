package com.p280ss.android.ugc.aweme.commerce.p1104a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.p268a.p269a.p270a.p271a.p272a.C6497a;
import com.iab.omid.library.bytedance.C18391a;
import com.iab.omid.library.bytedance.adsession.C18397a;
import com.iab.omid.library.bytedance.adsession.C18398b;
import com.iab.omid.library.bytedance.adsession.C18399c;
import com.iab.omid.library.bytedance.adsession.C18400d;
import com.iab.omid.library.bytedance.adsession.C18401e;
import com.iab.omid.library.bytedance.adsession.C18402f;
import com.iab.omid.library.bytedance.adsession.Owner;
import com.iab.omid.library.bytedance.adsession.video.C18404a;
import com.iab.omid.library.bytedance.adsession.video.C18405b;
import com.iab.omid.library.bytedance.adsession.video.Position;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.commerce.C24428c;
import com.p280ss.android.ugc.aweme.commerce.p1104a.C24422h.C24424b;
import com.p280ss.android.ugc.aweme.commercialize.log.C24939aj;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25301by;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.video.C43316v;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commerce.a.a */
public class C24411a implements C24428c {

    /* renamed from: a */
    public static final String f64447a = "a";

    /* renamed from: h */
    private static volatile C24411a f64448h;

    /* renamed from: b */
    public boolean f64449b;

    /* renamed from: c */
    public boolean f64450c;

    /* renamed from: d */
    public boolean f64451d;

    /* renamed from: e */
    public int f64452e = 0;

    /* renamed from: f */
    public C24415a f64453f;

    /* renamed from: g */
    public Handler f64454g = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private Map<String, C18405b> f64455i = Collections.synchronizedMap(new HashMap());

    /* renamed from: j */
    private Map<String, C18398b> f64456j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    private C24422h f64457k = new C24422h(AwemeApplication.m21341a().getApplicationContext());

    /* renamed from: l */
    private Handler f64458l = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    private long f64459m = -1;

    /* renamed from: n */
    private Runnable f64460n = new Runnable() {
        public final void run() {
            long n = C43316v.m137450K().mo104915n();
            long i = C43316v.m137450K().mo104910i();
            if (i != 0 && C24411a.this.f64453f != null) {
                C24411a.this.mo63377a(n, i);
                C24411a.this.f64454g.postDelayed(this, 200);
            }
        }
    };

    /* renamed from: o */
    private long f64461o = 0;

    /* renamed from: p */
    private long f64462p = -1;

    /* renamed from: com.ss.android.ugc.aweme.commerce.a.a$a */
    interface C24415a {
        /* renamed from: a */
        void mo63395a();

        /* renamed from: a */
        void mo63396a(long j, long j2, long j3);

        /* renamed from: b */
        void mo63397b();

        /* renamed from: c */
        void mo63398c();
    }

    /* renamed from: a */
    private void m80266a(String str, C18398b bVar) {
        this.f64456j.remove(str);
        this.f64455i.remove(str);
        this.f64458l.postDelayed(new C24416b(new C18398b[]{bVar}), 2000);
    }

    /* renamed from: a */
    static final /* synthetic */ void m80268a(C18398b[] bVarArr) {
        bVarArr[0] = null;
    }

    /* renamed from: a */
    private static void m80267a(Throwable th) {
        StringBuilder sb = new StringBuilder("create ad session failed");
        sb.append(th);
        C6921a.m21555a(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_message", th.getMessage());
            StringWriter stringWriter = new StringWriter();
            C6497a.m20180a(th, new PrintWriter(stringWriter));
            jSONObject.put("exception_stack", stringWriter.toString());
        } catch (JSONException unused) {
        }
        C6877n.m21444a("OmAdSessionMonitor", 0, jSONObject);
    }

    /* renamed from: a */
    public final void mo63380a(Aweme aweme, Context context) {
        m80257a(aweme, context, true);
    }

    /* renamed from: a */
    public final void mo63382a(Aweme aweme, Context context, View view, int i) {
        C6921a.m21555a("AdOM onPlayComplete ");
        if (i == 1) {
            String d = C24421g.m80314d(aweme);
            C18405b bVar = (C18405b) this.f64455i.get(d);
            if (bVar != null) {
                bVar.mo47826d();
            }
            C18398b bVar2 = (C18398b) this.f64456j.get(d);
            if (bVar2 != null) {
                bVar2.mo47804b();
            }
            m80266a(d, bVar2);
            long i2 = C43316v.m137450K().mo104910i();
            mo63377a(i2, i2);
            C24976t.m82050a(context, aweme, this.f64461o, this.f64462p, i2);
        }
        C25301by.m83145a("complete", aweme, "play_over");
        this.f64452e++;
        this.f64449b = false;
        this.f64450c = false;
        this.f64451d = false;
    }

    /* renamed from: a */
    public final void mo63379a(Aweme aweme) {
        m80274d(aweme);
        if (this.f64457k != null) {
            this.f64457k.mo63407d();
        }
    }

    /* renamed from: a */
    public final void mo63378a(Context context, Aweme aweme, View view, boolean z) {
        if (z) {
            m80276i(aweme, context, view);
        } else {
            m80274d(aweme);
        }
    }

    /* renamed from: a */
    public final void mo63377a(long j, long j2) {
        if (j != this.f64459m && j2 != 0) {
            if (this.f64453f != null) {
                float f = (float) j2;
                float f2 = ((float) j) / f;
                float f3 = ((float) this.f64459m) / f;
                if (f2 >= 0.25f && f3 < 0.25f) {
                    this.f64453f.mo63395a();
                }
                if (f2 >= 0.5f && f3 < 0.5f) {
                    this.f64453f.mo63397b();
                }
                if (f2 >= 0.75f && f3 < 0.75f) {
                    this.f64453f.mo63398c();
                }
                this.f64453f.mo63396a(this.f64459m, j, j2);
            }
            this.f64459m = j;
        }
    }

    /* renamed from: b */
    private void m80269b() {
        this.f64454g.postDelayed(this.f64460n, 200);
    }

    /* renamed from: a */
    public static C24411a m80259a() {
        if (f64448h == null) {
            synchronized (C24411a.class) {
                if (f64448h == null) {
                    f64448h = new C24411a();
                }
            }
        }
        return f64448h;
    }

    private C24411a() {
        this.f64457k.mo63406c();
    }

    /* renamed from: a */
    private static void m80262a(C18398b bVar) {
        C6877n.m21444a("OmAdSessionMonitor", 1, (JSONObject) null);
    }

    /* renamed from: d */
    private void m80274d(Aweme aweme) {
        this.f64452e = 0;
        this.f64453f = null;
        this.f64457k.f64477a = null;
        C18398b bVar = (C18398b) this.f64456j.get(C24421g.m80314d(aweme));
        if (bVar != null) {
            bVar.mo47804b();
        }
        m80266a(C24421g.m80314d(aweme), bVar);
        this.f64454g.removeCallbacks(this.f64460n);
        this.f64449b = false;
        this.f64450c = false;
        this.f64451d = false;
    }

    /* renamed from: c */
    private static List<C18402f> m80272c(Aweme aweme) {
        if (TextUtils.isEmpty(C24421g.m80309a(aweme)) || TextUtils.isEmpty(C24421g.m80311b(aweme))) {
            return Collections.emptyList();
        }
        try {
            URL url = new URL(C24421g.m80309a(aweme));
            String b = C24421g.m80311b(aweme);
            String c = C24421g.m80313c(aweme);
            if (TextUtils.isEmpty(c)) {
                c = "placementId=1&placementName=test";
            }
            return Collections.singletonList(C18402f.m60558a(b, url, c));
        } catch (MalformedURLException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: b */
    public final void mo63383b(Aweme aweme) {
        if (C25352e.m83221d(aweme) && C6399b.m19944t()) {
            m80274d(aweme);
        }
    }

    /* renamed from: a */
    private static void m80260a(Context context) {
        C6921a.m21555a("ensureOmidActivition");
        String str = "1.1.1";
        if (!C18391a.m60533a()) {
            C18391a.m60534a(str, context);
            C6877n.m21444a("OmSdkMonitor", 1, (JSONObject) null);
        }
    }

    /* renamed from: a */
    private static void m80265a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_message", str);
        } catch (JSONException unused) {
        }
        C6877n.m21444a("OmAdSessionMonitor", 0, jSONObject);
    }

    /* renamed from: a */
    private void m80263a(Aweme aweme, long j) {
        this.f64459m = -1;
        mo63377a(0, j);
        m80270b(aweme, j);
    }

    /* renamed from: b */
    private void m80270b(Aweme aweme, long j) {
        if (aweme != null && aweme.getAwemeRawAd() != null) {
            this.f64461o = aweme.getAwemeRawAd().getCreativeId().longValue();
            this.f64462p = j;
        }
    }

    /* renamed from: a */
    public static void m80261a(Context context, Aweme aweme) {
        if (C25301by.m83156e(aweme) && C25300bx.m83125a(aweme, 3)) {
            C25301by.m83145a("start", aweme, "play");
        }
    }

    /* renamed from: a */
    public final void mo63381a(Aweme aweme, Context context, View view) {
        m80258a(context, aweme, view);
    }

    /* renamed from: g */
    public final void mo63394g(Aweme aweme, Context context, View view) {
        C25301by.m83144a("unmute", aweme);
        C24976t.m82246k(context, aweme, this.f64452e + 1);
    }

    /* renamed from: a */
    private C18405b m80258a(Context context, Aweme aweme, View view) {
        String d = C24421g.m80314d(aweme);
        C18405b bVar = (C18405b) this.f64455i.get(d);
        if (bVar == null) {
            bVar = m80275h(aweme, context, view);
            if (bVar != null) {
                this.f64455i.put(d, bVar);
            }
        }
        return bVar;
    }

    /* renamed from: i */
    private void m80276i(final Aweme aweme, final Context context, final View view) {
        this.f64453f = new C24415a() {
            /* renamed from: a */
            public final void mo63395a() {
                if (!C24411a.this.f64449b) {
                    C24411a.this.mo63386c(aweme, context, view);
                }
                C24411a.this.f64449b = true;
            }

            /* renamed from: b */
            public final void mo63397b() {
                if (!C24411a.this.f64450c) {
                    C24411a.this.mo63388d(aweme, context, view);
                }
                C24411a.this.f64450c = true;
            }

            /* renamed from: c */
            public final void mo63398c() {
                if (!C24411a.this.f64451d) {
                    C24411a.this.mo63390e(aweme, context, view);
                }
                C24411a.this.f64451d = true;
            }

            /* renamed from: a */
            public final void mo63396a(long j, long j2, long j3) {
                C25301by.m83135a(j, j2, j3, aweme);
                if (C24411a.this.f64452e == 0 && j < 2000 && j2 >= 2000) {
                    C24411a.this.mo63384b(aweme, context, view);
                }
            }
        };
        this.f64457k.f64477a = new C24424b() {
            /* renamed from: a */
            public final void mo63399a(int i) {
                C24411a.this.mo63394g(aweme, context, view);
            }

            /* renamed from: b */
            public final void mo63400b(int i) {
                C24411a.this.mo63392f(aweme, context, view);
            }
        };
    }

    /* renamed from: f */
    public final void mo63392f(Aweme aweme, Context context, View view) {
        C6921a.m21555a("AdOM playerMute ");
        C25301by.m83144a("mute", aweme);
        C24976t.m82241j(context, aweme, this.f64452e + 1);
    }

    /* renamed from: c */
    public final void mo63386c(Aweme aweme, Context context, View view) {
        C24976t.m82177c(context, aweme, this.f64452e + 1);
        if (this.f64452e == 0) {
            C18405b a = m80258a(context, aweme, view);
            if (a != null) {
                a.mo47821a();
            }
        }
        C25301by.m83145a("firstQuartile", aweme, "play_25");
        C24976t.m82077a(aweme, 25, (C24939aj) new C24417c(aweme));
        C24976t.m82213f(context, aweme, this.f64452e + 1);
    }

    /* renamed from: e */
    public final void mo63390e(Aweme aweme, Context context, View view) {
        C24976t.m82203e(context, aweme, this.f64452e + 1);
        if (this.f64452e == 0) {
            C18405b a = m80258a(context, aweme, view);
            if (a != null) {
                a.mo47825c();
            }
        }
        C25301by.m83145a("thirdQuartile", aweme, "play_75");
        C24976t.m82077a(aweme, 75, (C24939aj) new C24419e(aweme));
        C24976t.m82230h(context, aweme, this.f64452e + 1);
    }

    /* renamed from: a */
    private C18398b m80257a(Aweme aweme, Context context, boolean z) {
        if (!C25301by.m83157f(aweme)) {
            if (C25301by.m83153b()) {
                m80265a("disable");
            }
            return null;
        }
        String d = C24421g.m80314d(aweme);
        if (this.f64456j.get(d) != null) {
            return (C18398b) this.f64456j.get(d);
        }
        m80260a(context);
        if (!C18391a.m60533a()) {
            return null;
        }
        try {
            C18400d a = C18400d.m60555a(C18401e.m60557a("Bytedance", "14.7.4"), C24420f.m80308a(AwemeApplication.m21341a()), m80272c(aweme), null);
            Owner owner = Owner.NATIVE;
            C18398b a2 = C18398b.m60546a(C18399c.m60551a(owner, owner, false), a);
            m80262a(a2);
            this.f64456j.put(d, a2);
            return a2;
        } catch (Throwable th) {
            m80267a(th);
            return null;
        }
    }

    /* renamed from: h */
    private C18405b m80275h(Aweme aweme, Context context, View view) {
        C18398b a = m80257a(aweme, context, true);
        if (a == null) {
            return null;
        }
        C18405b a2 = C18405b.m60578a(a);
        a.mo47803a(view);
        if (context instanceof Activity) {
            List<View> a3 = C24421g.m80310a(((Activity) context).getWindow().getDecorView().findViewById(16908290), C9738o.m28709b(context), C9738o.m28691a(context));
            a3.remove(view);
            for (View b : a3) {
                a.mo47805b(b);
            }
        }
        a.mo47802a();
        a2.mo47823a(C18404a.m60576a(true, Position.STANDALONE));
        C18397a.m60544a(a).mo47801a();
        return a2;
    }

    /* renamed from: d */
    public final void mo63388d(Aweme aweme, Context context, View view) {
        C24976t.m82192d(context, aweme, this.f64452e + 1);
        C6921a.m21555a("trackSecondQuartile");
        if (this.f64452e == 0) {
            C18405b a = m80258a(context, aweme, view);
            if (a != null) {
                a.mo47824b();
            }
        }
        C25301by.m83145a("midpoint", aweme, "play_50");
        C24976t.m82077a(aweme, 50, (C24939aj) new C24418d(aweme));
        C24976t.m82221g(context, aweme, this.f64452e + 1);
    }

    /* renamed from: b */
    public final void mo63384b(Aweme aweme, Context context, View view) {
        if (this.f64452e == 0 && C25301by.m83156e(aweme)) {
            C25301by.m83155d(aweme);
            C24976t.m82235i(context, aweme, this.f64452e + 1);
        }
    }

    /* renamed from: e */
    public final void mo63391e(Aweme aweme, Context context, View view, int i) {
        C6921a.m21555a("AdOM onPlayResume ");
        if (i == 0) {
            C18405b a = m80258a(context, aweme, view);
            if (a != null) {
                a.mo47828f();
            }
        }
        C25301by.m83144a("resume", aweme);
        C24976t.m82250l(context, aweme, this.f64452e + 1);
    }

    /* renamed from: f */
    public final void mo63393f(Aweme aweme, Context context, View view, int i) {
        C6921a.m21555a("AdOM onPlayPause ");
        if (i == 0) {
            C18405b a = m80258a(context, aweme, view);
            if (a != null) {
                a.mo47827e();
            }
        }
        C25301by.m83145a("pause", aweme, "play_pause");
        C24976t.m82254m(context, aweme, this.f64452e + 1);
    }

    /* renamed from: c */
    public final void mo63387c(Aweme aweme, Context context, View view, int i) {
        if (i == 0) {
            C18405b a = m80258a(context, aweme, view);
            if (a != null) {
                a.mo47830h();
            }
        }
        C25301by.m83144a("bufferEnd", aweme);
        C24976t.m82262o(context, aweme, this.f64452e + 1);
    }

    /* renamed from: d */
    public final void mo63389d(Aweme aweme, Context context, View view, int i) {
        if (i == 0) {
            C18405b a = m80258a(context, aweme, view);
            float duration = (float) aweme.getVideo().getDuration();
            if (duration <= 0.0f) {
                duration = (float) C43316v.m137450K().mo104910i();
            }
            float a2 = ((float) this.f64457k.mo63404a()) / ((float) this.f64457k.mo63405b());
            if (a != null) {
                a.mo47822a(duration, 1.0f);
            }
            m80269b();
            if (C25301by.m83156e(aweme)) {
                if (C25300bx.m83125a(aweme, 3)) {
                    if (a2 > 0.0f) {
                        C25301by.m83144a("unmute", aweme);
                    } else {
                        C25301by.m83144a("mute", aweme);
                    }
                }
                C24976t.m82176c(context, aweme);
                C25301by.m83144a("playerExpand", aweme);
                C25301by.m83144a("fullscreen", aweme);
            }
            if (a2 > 0.0f) {
                C24976t.m82246k(context, aweme, this.f64452e + 1);
            } else {
                C24976t.m82241j(context, aweme, this.f64452e + 1);
            }
            m80263a(aweme, C43316v.m137450K().mo104910i());
        }
    }

    /* renamed from: b */
    public final void mo63385b(Aweme aweme, Context context, View view, int i) {
        if (i == 0) {
            C18405b a = m80258a(context, aweme, view);
            if (a != null) {
                a.mo47829g();
            }
        }
        C25301by.m83144a("bufferStart", aweme);
        C24976t.m82258n(context, aweme, this.f64452e + 1);
    }
}
