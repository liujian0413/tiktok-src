package com.p280ss.android.ugc.aweme.shortvideo.beauty;

import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.beauty.BeautyCategoryGender;
import com.p280ss.android.ugc.aweme.beauty.C23532c;
import com.p280ss.android.ugc.aweme.beauty.C23536f;
import com.p280ss.android.ugc.aweme.beauty.C23539i;
import com.p280ss.android.ugc.aweme.beauty.C23544m;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38555b;
import com.p280ss.android.ugc.aweme.shortvideo.p1558e.C39374g;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;
import com.p280ss.android.ugc.aweme.shortvideo.record.CameraModule;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.beauty.a */
public final class C38517a {

    /* renamed from: a */
    public C38519c f100115a;

    /* renamed from: b */
    boolean f100116b;

    /* renamed from: c */
    private boolean f100117c = C23544m.m77321a("2", "3");

    /* renamed from: d */
    private AppCompatActivity f100118d;

    /* renamed from: e */
    private BeautyCategoryGender f100119e;

    /* renamed from: a */
    public final void mo96488a() {
        ((ShortVideoContextViewModel) C0069x.m159a((FragmentActivity) this.f100118d).mo147a(ShortVideoContextViewModel.class)).mo96181j().observe(this.f100118d, new C38518b(this));
    }

    /* renamed from: b */
    private void m123113b() {
        if (C23536f.m77298a()) {
            C23539i n = C35574k.m114859a().mo70099n();
            C23532c cVar = new C23532c(C35574k.m114859a().mo70099n().mo61330e(), true, true, false, this.f100116b);
            n.mo61325a(cVar);
            if (!this.f100116b) {
                this.f100115a.mo96492a((FragmentActivity) this.f100118d);
                this.f100116b = true;
            }
        } else if (C6399b.m19945u() || C6399b.m19947w()) {
            this.f100115a.mo96491a(this.f100115a.mo96490a());
            this.f100115a.mo96500b(this.f100115a.mo96499b());
            this.f100115a.mo96505c(this.f100115a.mo96504c());
            if (this.f100117c) {
                this.f100115a.mo96511e(this.f100115a.mo96510e());
                this.f100115a.mo96509d(this.f100115a.mo96508d());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo96489a(Boolean bool) {
        if (bool != null && bool.booleanValue()) {
            m123113b();
        }
    }

    public C38517a(AppCompatActivity appCompatActivity, C40189d dVar, boolean z, C39374g gVar, C38555b bVar, CameraModule cameraModule, BeautyCategoryGender beautyCategoryGender) {
        this.f100118d = appCompatActivity;
        this.f100119e = beautyCategoryGender;
        C38521e eVar = new C38521e(dVar, this.f100117c, gVar, bVar, cameraModule);
        this.f100115a = eVar;
        this.f100115a.mo96496a(z);
        C35574k.m114859a().mo70099n().mo61324a(appCompatActivity);
    }
}
