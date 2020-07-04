package com.p280ss.android.ugc.aweme.story.shootvideo.publish.p1659a;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35544ak.C35545a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35594a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35595b;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35596c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35597d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35593v.C35598e;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.publish.a.d */
public class C42023d {

    /* renamed from: c */
    private static C42023d f109146c;

    /* renamed from: a */
    protected C35594a f109147a;

    /* renamed from: b */
    public int f109148b;

    /* renamed from: d */
    private C35596c f109149d;

    private C42023d() {
        m133576e();
    }

    /* renamed from: a */
    public static C42023d m133574a() {
        if (f109146c == null) {
            synchronized (C42023d.class) {
                if (f109146c == null) {
                    f109146c = new C42023d();
                }
            }
        }
        return f109146c;
    }

    /* renamed from: e */
    private void m133576e() {
        this.f109149d = C35563c.f93263z.mo83176a();
        this.f109149d.mo83179a((C35597d) new C35597d() {
            /* renamed from: a */
            public final void mo90407a(C35598e eVar) {
                boolean z;
                C35563c.f93252o.mo83230f().mo83239a(Integer.valueOf(eVar.mo83183a()));
                C35563c.f93252o.mo83231g().mo83239a(Integer.valueOf(eVar.mo83184b()));
                C35545a h = C35563c.f93252o.mo83232h();
                boolean z2 = false;
                if (eVar.mo83185c() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                h.mo83239a(Boolean.valueOf(z));
                C35545a i = C35563c.f93252o.mo83233i();
                if (eVar.mo83186d() == 0) {
                    z2 = true;
                }
                i.mo83239a(Boolean.valueOf(z2));
                C35563c.f93252o.mo83234j().mo83239a(Integer.valueOf(eVar.mo83187e()));
            }
        });
    }

    /* renamed from: d */
    public static boolean m133575d() {
        if (!((Boolean) C35563c.f93252o.mo83233i().mo83238a()).booleanValue()) {
            return false;
        }
        if (!((Boolean) C35563c.f93252o.mo83235k().mo83238a()).booleanValue()) {
            return C35563c.f93263z.mo83178c();
        }
        return true;
    }

    /* renamed from: b */
    public final void mo103189b() {
        if (!C6399b.m19944t() && C35563c.f93260w.mo57090c() && !TextUtils.isEmpty(C35563c.f93260w.mo57091d())) {
            if (this.f109149d == null) {
                m133576e();
            }
            this.f109149d.mo83180a(new Object[0]);
        }
    }

    /* renamed from: c */
    public final void mo103190c() {
        if (C35563c.f93247j.mo83120e()) {
            this.f109148b = ((Integer) C35563c.f93252o.mo83234j().mo83238a()).intValue();
            if (this.f109148b <= 1) {
                this.f109148b++;
                if (this.f109147a == null) {
                    this.f109147a = C35563c.f93263z.mo83177b();
                }
                this.f109147a.mo83188a((C35595b) new C35595b() {
                    /* renamed from: a */
                    public final void mo90406a() {
                        C35563c.f93252o.mo83234j().mo83239a(Integer.valueOf(C42023d.this.f109148b));
                    }
                });
                this.f109147a.mo83189a("sync_toast", Integer.valueOf(this.f109148b));
            }
        }
    }
}
