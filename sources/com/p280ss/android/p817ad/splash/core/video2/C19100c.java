package com.p280ss.android.p817ad.splash.core.video2;

import android.content.Context;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.video2.C19106g.C19108b;
import java.text.DecimalFormat;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video2.c */
public class C19100c {

    /* renamed from: d */
    private static volatile C19100c f51664d = null;

    /* renamed from: e */
    private static long f51665e = 500;

    /* renamed from: f */
    private static long f51666f = 3000;

    /* renamed from: a */
    public Timer f51667a;

    /* renamed from: b */
    public boolean f51668b;

    /* renamed from: c */
    public int f51669c;

    /* renamed from: g */
    private C19106g f51670g;

    /* renamed from: c */
    public final void mo50809c() {
        this.f51668b = false;
        if (this.f51667a != null) {
            this.f51667a.cancel();
            this.f51667a = null;
        }
    }

    /* renamed from: a */
    public static C19100c m62610a() {
        if (f51664d == null) {
            synchronized (C19100c.class) {
                if (f51664d == null) {
                    f51664d = new C19100c();
                }
            }
        }
        return f51664d;
    }

    /* renamed from: b */
    public final void mo50808b() {
        if (this.f51670g != null) {
            this.f51670g.mo50815d();
            this.f51670g = null;
        }
        if (this.f51667a != null) {
            this.f51667a.cancel();
            this.f51667a = null;
        }
    }

    /* renamed from: a */
    public static void m62611a(C19001b bVar) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", 0);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", bVar.mo50376p());
            jSONObject.put("ad_fetch_time", bVar.mo50374f());
            C19025f.m62115a(bVar.mo50375n(), "splash_ad", "mute", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m62612a(C19001b bVar, float f) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("playervol", new DecimalFormat("0.0000").format((double) f));
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", 1);
            jSONObject.put("log_extra", bVar.mo50376p());
            jSONObject.put("ad_fetch_time", bVar.mo50374f());
            C19025f.m62115a(bVar.mo50375n(), "splash_ad", "unmute", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo50806a(final C19001b bVar, Context context) {
        if (bVar.mo50471C() != 0) {
            if (this.f51670g == null) {
                this.f51670g = new C19106g(context);
            }
            final int b = this.f51670g.mo50813b();
            this.f51669c = this.f51670g.mo50812a();
            final float f = (((float) this.f51669c) * 1.0f) / ((float) b);
            if (f == 0.0f) {
                m62611a(bVar);
            } else {
                m62612a(bVar, f);
            }
            this.f51668b = false;
            this.f51670g.f51679a = new C19108b() {

                /* renamed from: a */
                float f51671a = f;

                /* renamed from: a */
                public final void mo50810a(int i) {
                    if (!C19100c.this.f51668b) {
                        if (this.f51671a == 0.0f && i > 0) {
                            this.f51671a = (((float) i) * 1.0f) / ((float) b);
                            C19100c.m62612a(bVar, this.f51671a);
                        } else if (this.f51671a > 0.0f && i == 0) {
                            this.f51671a = (float) i;
                            C19100c.m62611a(bVar);
                        }
                    }
                }
            };
            new StringBuilder("Init volume:").append(this.f51669c);
            this.f51670g.mo50814c();
        }
    }

    /* renamed from: a */
    public final void mo50807a(final C19103d dVar, int i, long j) {
        if (dVar == null || this.f51670g == null || j <= f51666f) {
            if (dVar != null) {
                dVar.mo50788a(true);
            }
            return;
        }
        switch (i) {
            case 0:
                dVar.mo50788a(true);
                return;
            case 1:
                dVar.mo50788a(false);
                dVar.mo50785a(0.0f, 0.0f);
                return;
            case 2:
                dVar.mo50788a(false);
                this.f51667a = new Timer();
                this.f51668b = true;
                final float a = (((float) this.f51670g.mo50812a()) * 1.0f) / ((float) f51666f);
                if (a > 0.0f) {
                    this.f51667a.schedule(new TimerTask() {
                        public final void run() {
                            try {
                                float c = a * ((float) dVar.mo50791c());
                                if (c >= ((float) C19100c.this.f51669c)) {
                                    dVar.mo50785a((float) C19100c.this.f51669c, (float) C19100c.this.f51669c);
                                    C19100c.this.f51667a.cancel();
                                    return;
                                }
                                dVar.mo50785a(c, c);
                            } catch (Exception unused) {
                            }
                        }
                    }, 0, f51665e);
                    return;
                }
                break;
            case 3:
                int a2 = this.f51670g.mo50812a();
                dVar.mo50788a(false);
                float f = ((float) a2) * 1.0f;
                dVar.mo50785a(f, f);
                return;
            default:
                dVar.mo50788a(true);
                break;
        }
    }
}
