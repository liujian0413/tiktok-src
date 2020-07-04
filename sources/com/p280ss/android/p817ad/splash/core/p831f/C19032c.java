package com.p280ss.android.p817ad.splash.core.p831f;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p836g.C19126e;
import com.p280ss.android.p817ad.splash.p836g.C19128g;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.f.c */
public final class C19032c implements C19031b {

    /* renamed from: a */
    public Context f51438a;

    /* renamed from: b */
    public C19037e f51439b;

    /* renamed from: com.ss.android.ad.splash.core.f.c$a */
    class C19035a extends AsyncTask<Void, Void, Void> {

        /* renamed from: b */
        private C19036d f51444b;

        /* renamed from: c */
        private long f51445c;

        /* renamed from: b */
        private static boolean m62212b(String str) {
            if (TextUtils.isEmpty(str) || (!str.startsWith("http://") && !str.startsWith("https://"))) {
                return false;
            }
            return true;
        }

        /* renamed from: a */
        private String m62209a(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f51445c = currentTimeMillis;
            if (str.contains("{TS}") || str.contains("__TS__")) {
                return str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            return str;
        }

        /* renamed from: c */
        private static String m62213c(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                String replace = str.replace("[ss_random]", String.valueOf(new Random().nextLong()));
                try {
                    return replace.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
                } catch (Exception unused) {
                    return replace;
                }
            } catch (Exception unused2) {
                return str;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            if (!m62212b(this.f51444b.f51447b)) {
                return null;
            }
            if (this.f51444b.f51449d == 0) {
                C19032c.this.f51439b.mo50535c(this.f51444b);
                return null;
            }
            boolean z = false;
            while (true) {
                if (this.f51444b.f51449d <= 0 || isCancelled()) {
                    break;
                }
                if (this.f51444b.f51449d == 5) {
                    C19032c.this.f51439b.mo50533a(this.f51444b);
                }
                if (!C19128g.m62687a(C19032c.this.f51438a)) {
                    break;
                }
                String a = m62209a(this.f51444b.f51447b);
                int i = this.f51444b.f51450e;
                if (this.f51444b.f51448c) {
                    a = m62213c(a);
                }
                if (C19025f.m62192w() == null) {
                    return null;
                }
                C19039g a2 = C19025f.m62192w().mo50858a(a);
                if (a2 != null) {
                    m62211a(a2, a, i);
                    if (a2.f51455b >= 200 && a2.f51455b < 300) {
                        z = true;
                    }
                }
                if (z) {
                    C19032c.this.f51439b.mo50535c(this.f51444b);
                    new StringBuilder("track success : ").append(this.f51444b.f51447b);
                    break;
                }
                new StringBuilder("track fail : ").append(this.f51444b.f51447b);
                this.f51444b.f51449d--;
                if (this.f51444b.f51449d == 0) {
                    C19032c.this.f51439b.mo50535c(this.f51444b);
                    new StringBuilder("track fail and delete : ").append(this.f51444b.f51447b);
                    break;
                }
                C19032c.this.f51439b.mo50534b(this.f51444b);
            }
            if (!z) {
                C19032c.m62202a(this.f51444b.f51447b);
            }
            return null;
        }

        private C19035a(C19036d dVar) {
            this.f51444b = dVar;
        }

        /* renamed from: a */
        private void m62211a(C19039g gVar, String str, int i) {
            JSONObject jSONObject = new JSONObject();
            if (this.f51444b != null && this.f51444b.f51451f > 0) {
                try {
                    jSONObject.put("track_url_list", str);
                    jSONObject.put("track_status", gVar.f51455b);
                    jSONObject.put("ts", this.f51445c);
                    jSONObject.put("local_time_ms", System.currentTimeMillis());
                    if (!C19132j.m62736a(gVar.f51454a)) {
                        jSONObject.put("user_agent", gVar.f51454a);
                    } else {
                        jSONObject.put("user_agent", -1);
                    }
                    jSONObject.put("is_ad_event", 1);
                    jSONObject.put("category", "umeng");
                    jSONObject.put("ad_event_type", "monitor");
                    long j = -1;
                    if (C19025f.m62159f() != null && C19025f.m62159f().mo50359d() > 0) {
                        j = C19025f.m62159f().mo50359d();
                    }
                    jSONObject.put("user_id", j);
                    if (!C19132j.m62736a(this.f51444b.f51452g)) {
                        jSONObject.put("log_extra", this.f51444b.f51452g);
                    } else {
                        jSONObject.put("log_extra", -1);
                    }
                    String str2 = "";
                    switch (i) {
                        case 1:
                            str2 = "show";
                            break;
                        case 2:
                            str2 = "play";
                            break;
                        case 3:
                            str2 = "click";
                            break;
                        case 4:
                            str2 = "play_over";
                            break;
                    }
                    jSONObject.put("track_label", str2);
                    C19025f.m62115a(this.f51444b.f51451f, "track_ad", "track_url", jSONObject);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo50527a() {
        if (C19128g.m62687a(this.f51438a)) {
            C19025f.m62090D().submit(new Runnable() {
                public final void run() {
                    final List a = C19032c.this.f51439b.mo50532a();
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C19032c.this.mo50528a(a);
                        }
                    });
                }
            });
        }
    }

    /* renamed from: a */
    public static void m62202a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key_send_track_url", str);
            C18949a.m61865a().mo50364a("service_ad_send_track_fail", (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo50528a(List<C19036d> list) {
        if (C19126e.m62681b(list)) {
            for (C19036d aVar : list) {
                new C19035a(aVar).executeOnExecutor(C19025f.m62090D(), new Void[0]);
            }
        }
    }

    public C19032c(Context context, C19037e eVar) {
        this.f51438a = context;
        this.f51439b = eVar;
    }

    /* renamed from: a */
    private void m62201a(long j, String str, List<String> list, boolean z, int i) {
        if (C19126e.m62681b(list)) {
            for (String dVar : list) {
                long j2 = j;
                String str2 = str;
                C19036d dVar2 = new C19036d(j2, str2, UUID.randomUUID().toString(), dVar, true, 5, i);
                new C19035a(dVar2).executeOnExecutor(C19025f.m62090D(), new Void[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo50523a(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m62201a(j, str, list, true, 1);
    }

    /* renamed from: b */
    public final void mo50524b(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m62201a(j, str, list, true, 3);
    }

    /* renamed from: c */
    public final void mo50525c(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m62201a(j, str, list, true, 2);
    }

    /* renamed from: d */
    public final void mo50526d(View view, long j, List<String> list, String str, boolean z, long j2, JSONObject jSONObject) {
        m62201a(j, str, list, true, 4);
    }
}
