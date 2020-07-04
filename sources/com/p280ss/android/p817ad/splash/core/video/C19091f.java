package com.p280ss.android.p817ad.splash.core.video;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.p280ss.android.p817ad.splash.core.C19025f;
import com.p280ss.android.p817ad.splash.core.C19062u;
import com.p280ss.android.p817ad.splash.core.video.C19076b.C19077a;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import com.p280ss.android.p817ad.splash.p836g.C19133k;
import com.p280ss.android.p817ad.splash.p836g.C19139p;
import com.p280ss.android.p817ad.splash.p836g.C19139p.C19140a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.video.f */
public final class C19091f implements C19076b, C19087a, C19140a {

    /* renamed from: a */
    public C19083d f51613a;

    /* renamed from: b */
    public C19139p f51614b = new C19139p(this);

    /* renamed from: c */
    public long f51615c = 0;

    /* renamed from: d */
    public C19078c f51616d;

    /* renamed from: e */
    public C19077a f51617e;

    /* renamed from: f */
    public boolean f51618f;

    /* renamed from: g */
    public Runnable f51619g;

    /* renamed from: h */
    private long f51620h;

    /* renamed from: i */
    private int f51621i;

    /* renamed from: j */
    private ViewGroup f51622j;

    /* renamed from: k */
    private long f51623k = 0;

    /* renamed from: l */
    private String f51624l;

    /* renamed from: m */
    private long f51625m = 0;

    /* renamed from: n */
    private long f51626n;

    /* renamed from: o */
    private List<String> f51627o;

    /* renamed from: p */
    private int[] f51628p = new int[2];

    /* renamed from: q */
    private ArrayList<Runnable> f51629q;

    /* renamed from: r */
    private boolean f51630r;

    /* renamed from: s */
    private WeakReference<Context> f51631s;

    /* renamed from: t */
    private boolean f51632t;

    /* renamed from: u */
    private boolean f51633u;

    /* renamed from: v */
    private long f51634v;

    /* renamed from: w */
    private Runnable f51635w;

    /* renamed from: a */
    public final boolean mo50753a(C19088e eVar) {
        if (C19132j.m62736a(eVar.f51584b) || C19132j.m62736a(eVar.f51583a)) {
            return false;
        }
        this.f51624l = eVar.f51589g;
        this.f51620h = eVar.f51585c;
        this.f51621i = eVar.f51594l;
        this.f51634v = eVar.f51590h;
        this.f51613a.f51563d = eVar.f51597o;
        if (eVar.f51592j) {
            this.f51613a.mo50724c(eVar.f51595m, eVar.f51596n);
        }
        this.f51613a.mo50719a(eVar.f51592j, eVar.f51593k);
        this.f51613a.mo50715a(eVar.f51586d, eVar.f51587e);
        this.f51613a.mo50717a(this.f51622j);
        m62565a(eVar.f51591i, 0);
        this.f51614b = new C19139p(this);
        this.f51616d = new C19078c(this.f51614b);
        this.f51613a.mo50722b(eVar.f51586d, eVar.f51587e);
        this.f51623k = 0;
        this.f51613a.mo50720b();
        try {
            m62568a(eVar.f51583a);
            this.f51624l = eVar.f51589g;
            this.f51627o = eVar.f51588f;
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo50733a(C19083d dVar, View view, MotionEvent motionEvent) {
        if (this.f51617e != null) {
            this.f51617e.mo50423a(this.f51623k, C19133k.m62737a(this.f51625m, this.f51626n), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
    }

    /* renamed from: a */
    public final void mo50731a(C19083d dVar, SurfaceHolder surfaceHolder) {
        this.f51630r = true;
        if (this.f51616d != null) {
            this.f51616d.mo50702a(surfaceHolder);
            m62571e();
        }
    }

    /* renamed from: a */
    public final void mo50732a(C19083d dVar, SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        StringBuilder sb = new StringBuilder("surfaceChanged, format = ");
        sb.append(i);
        sb.append(", width = ");
        sb.append(i2);
        sb.append(", height = ");
        sb.append(i3);
    }

    /* renamed from: d */
    private boolean m62570d() {
        if (this.f51631s == null || this.f51631s.get() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo50754b() {
        if (this.f51616d != null) {
            this.f51616d.mo50706b();
        }
    }

    /* renamed from: c */
    public final void mo50755c() {
        if (this.f51616d != null) {
            this.f51616d.mo50707c();
        }
        if (this.f51613a != null) {
            this.f51613a.mo50726e();
        }
        this.f51614b.removeCallbacks(this.f51635w);
    }

    /* renamed from: e */
    private void m62571e() {
        if (this.f51629q != null && !this.f51629q.isEmpty()) {
            Iterator it = new ArrayList(this.f51629q).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f51629q.clear();
        }
    }

    /* renamed from: f */
    private void m62572f() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject.put("show_expected", this.f51621i);
            String str = "not_real_time";
            if (this.f51618f) {
                str = "real_time";
            }
            jSONObject.put("show_type", str);
            jSONObject.put("ad_sequence", C19062u.m62368a().mo50637r());
            if (C19025f.m62109W() != -1) {
                int i = 1;
                if (C19025f.m62109W() != 1) {
                    i = 2;
                }
                jSONObject.put("awemelaunch", i);
            }
            jSONObject2.putOpt("ad_extra_data", jSONObject);
            jSONObject2.putOpt("is_ad_event", "1");
            if (!C19132j.m62736a(this.f51624l)) {
                jSONObject2.put("log_extra", this.f51624l);
            }
            jSONObject2.put("ad_fetch_time", this.f51634v);
        } catch (JSONException unused) {
            jSONObject2 = null;
        }
        C19025f.m62115a(this.f51620h, "splash_ad", "play", jSONObject2);
        C19025f.m62093G().mo50525c(null, this.f51620h, this.f51627o, this.f51624l, true, -1, null);
    }

    /* renamed from: a */
    public final void mo50730a() {
        if (this.f51617e != null) {
            this.f51623k = System.currentTimeMillis() - this.f51615c;
            this.f51617e.mo50425c(this.f51623k, C19133k.m62737a(this.f51625m, this.f51626n));
        }
    }

    /* renamed from: a */
    public final void mo50751a(C19077a aVar) {
        this.f51617e = aVar;
    }

    /* renamed from: a */
    public final void mo50752a(boolean z) {
        if (this.f51616d != null) {
            this.f51616d.mo50704a(true);
        }
    }

    /* renamed from: a */
    private void m62564a(int i) {
        if (m62570d() && this.f51613a != null) {
            this.f51613a.mo50723c();
            if (this.f51617e != null) {
                this.f51617e.mo50422a(this.f51623k, 100);
            }
        }
    }

    /* renamed from: b */
    private void m62569b(Runnable runnable) {
        if (this.f51629q == null) {
            this.f51629q = new ArrayList<>();
        }
        this.f51629q.add(runnable);
    }

    /* renamed from: a */
    private void m62566a(Context context) {
        this.f51613a = new C19083d(context, LayoutInflater.from(context.getApplicationContext()).inflate(R.layout.aji, null, false));
        this.f51613a.f51562c = this;
    }

    /* renamed from: a */
    private void m62567a(Runnable runnable) {
        if (!this.f51613a.f51561b || !this.f51630r) {
            m62569b(runnable);
        } else {
            runnable.run();
        }
    }

    /* renamed from: a */
    private void m62568a(String str) {
        if (this.f51616d != null) {
            this.f51616d.mo50703a(str);
        }
        this.f51615c = System.currentTimeMillis();
        if (!C19132j.m62736a(str)) {
            this.f51613a.mo50714a(8);
            this.f51613a.mo50714a(0);
            m62567a((Runnable) new Runnable() {
                public final void run() {
                    C19091f.this.f51615c = System.currentTimeMillis();
                    C19091f.this.f51613a.mo50721b(0);
                    if (C19091f.this.f51616d != null) {
                        C19091f.this.f51616d.mo50705a(true, 0, false);
                    }
                    if (C19091f.this.f51614b != null) {
                        C19091f.this.f51614b.postDelayed(C19091f.this.f51619g, 100);
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo50406a(Message message) {
        if (this.f51613a != null && message != null && this.f51631s != null && this.f51631s.get() != null) {
            int i = message.what;
            switch (i) {
                case 108:
                    if (message.obj instanceof Long) {
                        this.f51626n = ((Long) message.obj).longValue();
                        return;
                    }
                    break;
                case 109:
                    if (message.obj instanceof Long) {
                        this.f51625m = ((Long) message.obj).longValue();
                        return;
                    }
                    break;
                default:
                    switch (i) {
                        case 302:
                            m62564a(message.what);
                            return;
                        case 303:
                            if (this.f51613a != null) {
                                this.f51613a.mo50723c();
                            }
                            if (this.f51617e != null) {
                                this.f51617e.mo50424b(this.f51623k, C19133k.m62737a(this.f51625m, this.f51626n));
                                return;
                            }
                            break;
                        case 304:
                            int i2 = message.arg1;
                            if (this.f51613a != null) {
                                this.f51613a.mo50723c();
                            }
                            if (this.f51632t && i2 == 3 && !this.f51633u) {
                                m62572f();
                                this.f51633u = true;
                                return;
                            }
                        case 305:
                            if (this.f51614b != null) {
                                this.f51614b.removeCallbacks(this.f51635w);
                            }
                            if (!this.f51632t && !this.f51633u) {
                                m62572f();
                                this.f51633u = true;
                            }
                            if (this.f51613a != null) {
                                this.f51613a.mo50723c();
                                return;
                            }
                            break;
                        case 306:
                            if (this.f51613a != null) {
                                this.f51613a.mo50723c();
                                break;
                            }
                            break;
                    }
                    break;
            }
        }
    }

    /* renamed from: b */
    public final void mo50734b(C19083d dVar, SurfaceHolder surfaceHolder) {
        this.f51630r = false;
    }

    /* renamed from: a */
    private void m62565a(int i, int i2) {
        if (this.f51613a.mo50713a() instanceof LayoutParams) {
            this.f51622j.getLocationInWindow(this.f51628p);
            LayoutParams a = this.f51613a.mo50713a();
            if (a != null) {
                a.topMargin = i;
                a.leftMargin = 0;
                a.gravity = 51;
                this.f51613a.mo50718a(a);
            }
        }
    }

    public C19091f(Context context, ViewGroup viewGroup) {
        boolean z = false;
        this.f51633u = false;
        this.f51618f = false;
        this.f51634v = 0;
        this.f51619g = new Runnable() {
            public final void run() {
                if (C19091f.this.f51616d != null) {
                    C19091f.this.f51616d.mo50708d();
                }
            }
        };
        this.f51635w = new Runnable() {
            public final void run() {
                if (C19091f.this.f51617e != null) {
                    C19091f.this.f51617e.mo50421a();
                }
            }
        };
        this.f51622j = viewGroup;
        this.f51631s = new WeakReference<>(context);
        m62566a(context);
        if (VERSION.SDK_INT >= 17) {
            z = true;
        }
        this.f51632t = z;
    }
}
