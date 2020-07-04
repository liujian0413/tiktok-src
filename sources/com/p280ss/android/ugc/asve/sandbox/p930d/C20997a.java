package com.p280ss.android.ugc.asve.sandbox.p930d;

import android.os.IBinder;
import com.p280ss.android.medialib.camera.C19662d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.presenter.C19761a;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.camera.C20713c;
import com.p280ss.android.ugc.asve.recorder.camera.VECameraController;
import com.p280ss.android.ugc.asve.sandbox.C21026g.C21027a;
import com.p280ss.android.ugc.asve.sandbox.C21050o;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20844b;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20905aa;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20911c;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20920f;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20941m;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20944n;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20956r;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20962t;
import com.p280ss.android.vesdk.C45382z.C45402m;
import com.p280ss.android.vesdk.VEPreviewRadio;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.sandbox.d.a */
public final class C20997a extends C21027a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56459a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20997a.class), "wideCamera", "getWideCamera()Lcom/ss/android/ugc/asve/sandbox/IWideCameraComponent;"))};

    /* renamed from: b */
    public final C20707b f56460b;

    /* renamed from: c */
    private final C7541d f56461c = C7546e.m23569a(new C20998a(this));

    /* renamed from: d */
    private final Map<IBinder, C19662d> f56462d = new LinkedHashMap();

    /* renamed from: e */
    private final Map<IBinder, C20713c> f56463e = new LinkedHashMap();

    /* renamed from: f */
    private final VECameraController f56464f;

    /* renamed from: com.ss.android.ugc.asve.sandbox.d.a$a */
    static final class C20998a extends Lambda implements C7561a<C21019g> {

        /* renamed from: a */
        final /* synthetic */ C20997a f56465a;

        C20998a(C20997a aVar) {
            this.f56465a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21019g invoke() {
            return new C21019g(this.f56465a.f56460b.mo55962i());
        }
    }

    /* renamed from: w */
    private final C21050o m70298w() {
        return (C21050o) this.f56461c.getValue();
    }

    /* renamed from: a */
    public final void mo56503a(int i) {
    }

    /* renamed from: a */
    public final void mo56511a(C20962t tVar) {
        this.f56460b.mo55934a(tVar != null ? C20844b.m69815a(tVar) : null);
    }

    /* renamed from: a */
    public final boolean mo56514a(int i, int i2, float f, float[] fArr) {
        C7573i.m23587b(fArr, "points");
        return this.f56460b.mo55943a(i, i2, f, fArr);
    }

    /* renamed from: a */
    public final void mo56512a(boolean z) {
        this.f56460b.mo55953c(z);
    }

    /* renamed from: a */
    public final void mo56513a(float[] fArr, double d) {
        C7573i.m23587b(fArr, "quaternion");
        this.f56460b.mo55941a(fArr, d);
    }

    /* renamed from: a */
    public final void mo56510a(C20956r rVar) {
        C7573i.m23587b(rVar, "callback");
        this.f56460b.mo55939a(C20844b.m69825a(rVar));
    }

    /* renamed from: a */
    public final int mo56500a() {
        return this.f56460b.mo55964k();
    }

    /* renamed from: b */
    public final int mo56515b() {
        return this.f56460b.mo55968o();
    }

    /* renamed from: c */
    public final int mo56522c() {
        return this.f56460b.mo55973p();
    }

    /* renamed from: d */
    public final void mo56526d() {
        this.f56460b.mo55974q();
    }

    /* renamed from: e */
    public final C21050o mo56529e() {
        return m70298w();
    }

    /* renamed from: f */
    public final void mo56532f() {
        this.f56460b.mo55965l();
    }

    /* renamed from: g */
    public final void mo56533g() {
        this.f56460b.mo55966m();
    }

    /* renamed from: h */
    public final void mo56534h() {
        this.f56460b.mo55977t();
    }

    /* renamed from: i */
    public final boolean mo56535i() {
        return this.f56460b.mo55975r();
    }

    /* renamed from: j */
    public final boolean mo56536j() {
        return this.f56460b.mo55961h();
    }

    /* renamed from: k */
    public final float mo56537k() {
        return this.f56460b.mo55960g();
    }

    /* renamed from: l */
    public final List<Integer> mo56538l() {
        return this.f56460b.mo55963j();
    }

    /* renamed from: m */
    public final void mo56539m() {
        this.f56460b.mo55980w();
    }

    /* renamed from: n */
    public final boolean mo56540n() {
        return this.f56460b.mo55978u();
    }

    /* renamed from: o */
    public final boolean mo56541o() {
        return this.f56460b.mo55979v();
    }

    /* renamed from: p */
    public final void mo56542p() {
        this.f56460b.mo55928a();
    }

    /* renamed from: q */
    public final boolean mo56543q() {
        return this.f56460b.mo55967n();
    }

    /* renamed from: r */
    public final int mo56544r() {
        return this.f56460b.mo55951c();
    }

    /* renamed from: s */
    public final void mo56545s() {
        this.f56464f.onCreate();
    }

    /* renamed from: t */
    public final void mo56546t() {
        this.f56464f.onResume();
    }

    /* renamed from: u */
    public final void mo56547u() {
        this.f56464f.onStop();
    }

    /* renamed from: v */
    public final void mo56548v() {
        this.f56463e.clear();
        this.f56462d.clear();
        this.f56464f.onDestroy();
    }

    /* renamed from: a */
    public final void mo56501a(float f) {
        this.f56460b.mo55942a(f);
    }

    /* renamed from: b */
    public final void mo56516b(float f) {
        this.f56460b.mo55950b(f);
    }

    /* renamed from: c */
    public final void mo56523c(float f) {
        this.f56460b.mo55954c(f);
    }

    /* renamed from: d */
    public final void mo56527d(int i) {
        this.f56460b.mo55952c(i);
    }

    /* renamed from: e */
    public final void mo56530e(int i) {
        this.f56460b.mo55930a(i);
    }

    /* renamed from: b */
    public final void mo56517b(int i) {
        this.f56460b.mo55937a(VEPreviewRadio.values()[i]);
    }

    /* renamed from: c */
    public final void mo56524c(int i) {
        this.f56460b.mo55944b(i);
    }

    /* renamed from: d */
    public final void mo56528d(boolean z) {
        this.f56460b.mo55948b(z);
    }

    /* renamed from: e */
    public final void mo56531e(boolean z) {
        this.f56460b.mo55958e(z);
    }

    public C20997a(C20707b bVar) {
        C7573i.m23587b(bVar, "cameraController");
        this.f56460b = bVar;
        C20707b bVar2 = this.f56460b;
        if (bVar2 != null) {
            this.f56464f = (VECameraController) bVar2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
    }

    /* renamed from: c */
    public final void mo56525c(boolean z) {
        this.f56460b.mo55956d(z);
    }

    /* renamed from: a */
    public final void mo56505a(C20905aa aaVar) {
        C45402m mVar;
        C20707b bVar = this.f56460b;
        if (aaVar != null) {
            mVar = C20844b.m69824a(aaVar);
        } else {
            mVar = null;
        }
        bVar.mo55938a(mVar);
    }

    /* renamed from: b */
    public final void mo56519b(C20911c cVar) {
        C7573i.m23587b(cVar, "callback");
        C19662d dVar = (C19662d) this.f56462d.get(cVar.asBinder());
        if (dVar != null) {
            this.f56460b.mo55946b(dVar);
            this.f56462d.remove(cVar.asBinder());
        }
    }

    /* renamed from: a */
    public final void mo56506a(C20911c cVar) {
        C7573i.m23587b(cVar, "callback");
        C19662d a = C20844b.m69814a(cVar);
        Map<IBinder, C19662d> map = this.f56462d;
        IBinder asBinder = cVar.asBinder();
        C7573i.m23582a((Object) asBinder, "callback.asBinder()");
        map.put(asBinder, a);
        this.f56460b.mo55933a(a);
    }

    /* renamed from: b */
    public final void mo56520b(C20944n nVar) {
        C7573i.m23587b(nVar, "listener");
        C20713c cVar = (C20713c) this.f56463e.get(nVar.asBinder());
        if (cVar != null) {
            this.f56460b.mo55947b(cVar);
            this.f56463e.remove(nVar.asBinder());
        }
    }

    /* renamed from: a */
    public final void mo56507a(C20920f fVar) {
        C19761a aVar;
        C20707b bVar = this.f56460b;
        if (fVar != null) {
            aVar = C20844b.m69816a(fVar);
        } else {
            aVar = null;
        }
        bVar.mo55935a(aVar);
    }

    /* renamed from: b */
    public final void mo56521b(boolean z) {
        this.f56460b.mo55940a(z);
    }

    /* renamed from: a */
    public final void mo56508a(C20941m mVar) {
        C19629a aVar;
        C20707b bVar = this.f56460b;
        if (mVar != null) {
            aVar = C20844b.m69813a(mVar);
        } else {
            aVar = null;
        }
        bVar.mo55932a(aVar);
    }

    /* renamed from: a */
    public final void mo56509a(C20944n nVar) {
        C7573i.m23587b(nVar, "listener");
        C20713c a = C20844b.m69817a(nVar);
        Map<IBinder, C20713c> map = this.f56463e;
        IBinder asBinder = nVar.asBinder();
        C7573i.m23582a((Object) asBinder, "listener.asBinder()");
        map.put(asBinder, a);
        this.f56460b.mo55936a(a);
    }

    /* renamed from: a */
    public final void mo56504a(int i, C20911c cVar) {
        C19662d dVar;
        C20707b bVar = this.f56460b;
        if (cVar != null) {
            dVar = C20844b.m69814a(cVar);
        } else {
            dVar = null;
        }
        bVar.mo55945b(i, dVar);
    }

    /* renamed from: b */
    public final void mo56518b(int i, C20911c cVar) {
        C19662d dVar;
        C20707b bVar = this.f56460b;
        if (cVar != null) {
            dVar = C20844b.m69814a(cVar);
        } else {
            dVar = null;
        }
        bVar.mo55931a(i, dVar);
    }

    /* renamed from: a */
    public final void mo56502a(float f, float f2, float f3) {
        this.f56460b.mo55929a(f, f2, f3);
    }
}
