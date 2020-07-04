package com.p280ss.android.ugc.asve.recorder;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import com.p280ss.android.medialib.p880b.C19622b;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p755c.C15397b;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.asve.recorder.p921a.C20673b;
import com.p280ss.android.ugc.asve.recorder.p922b.C20676a;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import com.p280ss.android.vesdk.C45382z.C45393e;
import com.p280ss.android.vesdk.runtime.C45362d;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.asve.recorder.ASRecorder */
public final class ASRecorder implements C0042h, C20689c {

    /* renamed from: e */
    public static final C20656a f55789e = new C20656a(null);

    /* renamed from: a */
    public final Mode f55790a;

    /* renamed from: b */
    public final C0043i f55791b;

    /* renamed from: c */
    public final C20689c f55792c;

    /* renamed from: d */
    public final C15432h f55793d;

    /* renamed from: f */
    private final double f55794f = 1.3333333333333333d;

    /* renamed from: g */
    private final Pair<Integer, Integer> f55795g = this.f55793d.mo38922e();

    /* renamed from: h */
    private final String f55796h = this.f55793d.mo38927j().mo38972c();

    /* renamed from: i */
    private final String f55797i = this.f55793d.mo38927j().mo38971b();

    /* renamed from: j */
    private final String f55798j = this.f55793d.mo38928k().mo38976b();

    /* renamed from: k */
    private final String f55799k = this.f55793d.mo38928k().mo38975a();

    /* renamed from: com.ss.android.ugc.asve.recorder.ASRecorder$Mode */
    public enum Mode {
        CUSTOM,
        REACTION,
        DUET
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.ASRecorder$a */
    public static final class C20656a {
        private C20656a() {
        }

        public /* synthetic */ C20656a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static ASRecorder m68462a(C0043i iVar, C15432h hVar) {
            C7573i.m23587b(hVar, "recorderContext");
            return new ASRecorder(iVar, C20774g.m69338a(C6855a.m21308b(), iVar, hVar), hVar);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.ASRecorder$b */
    public static final class C20657b implements Callback {

        /* renamed from: a */
        final /* synthetic */ ASRecorder f55800a;

        /* renamed from: com.ss.android.ugc.asve.recorder.ASRecorder$b$a */
        static final class C20658a extends Lambda implements C7562b<Integer, C7581n> {

            /* renamed from: a */
            public static final C20658a f55801a = new C20658a();

            C20658a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                ((Number) obj).intValue();
                return C7581n.f20898a;
            }
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        C20657b(ASRecorder aSRecorder) {
            this.f55800a = aSRecorder;
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f55800a.f55792c.mo55851e().mo55918f();
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C7573i.m23587b(surfaceHolder, "holder");
            this.f55800a.mo55840a();
            C20676a e = this.f55800a.f55792c.mo55851e();
            Surface surface = surfaceHolder.getSurface();
            C7573i.m23582a((Object) surface, "holder.surface");
            e.mo55896a(surface, "", (C7562b<? super Integer, C7581n>) C20658a.f55801a);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.ASRecorder$c */
    static final class C20659c extends Lambda implements C7562b<Integer, C7581n> {

        /* renamed from: a */
        public static final C20659c f55802a = new C20659c();

        C20659c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).intValue();
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    public static final ASRecorder m68441a(C0043i iVar, C15432h hVar) {
        return C20656a.m68462a(iVar, hVar);
    }

    /* renamed from: a */
    public final void mo55841a(Context context) {
        C7573i.m23587b(context, "context");
        this.f55792c.mo55841a(context);
    }

    /* renamed from: a */
    public final void mo55842a(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f55792c.mo55842a(bVar);
    }

    /* renamed from: a */
    public final void mo55843a(C45362d dVar, String str) {
        C7573i.m23587b(dVar, "resManager");
        C7573i.m23587b(str, "workSpacePath");
        this.f55792c.mo55843a(dVar, str);
    }

    /* renamed from: a */
    public final void mo55844a(C45393e eVar) {
        this.f55792c.mo55844a(eVar);
    }

    /* renamed from: a */
    public final void mo55845a(C7562b<? super Long, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f55792c.mo55845a(bVar);
    }

    /* renamed from: b */
    public final C20707b mo55846b() {
        return this.f55792c.mo55846b();
    }

    /* renamed from: b */
    public final void mo55847b(C19622b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f55792c.mo55847b(bVar);
    }

    /* renamed from: b */
    public final void mo55848b(C7562b<? super Integer, C7581n> bVar) {
        C7573i.m23587b(bVar, "callback");
        this.f55792c.mo55848b(bVar);
    }

    /* renamed from: c */
    public final C20673b mo55849c() {
        return this.f55792c.mo55849c();
    }

    /* renamed from: d */
    public final C20749b mo55850d() {
        return this.f55792c.mo55850d();
    }

    /* renamed from: e */
    public final C20676a mo55851e() {
        return this.f55792c.mo55851e();
    }

    /* renamed from: f */
    public final C20779a mo55852f() {
        return this.f55792c.mo55852f();
    }

    /* renamed from: g */
    public final C15397b mo55853g() {
        return this.f55792c.mo55853g();
    }

    /* renamed from: h */
    public final void mo55854h() {
        this.f55792c.mo55854h();
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onCreate() {
    }

    public final void release() {
        this.f55792c.release();
    }

    /* renamed from: i */
    private final void m68442i() {
        mo55841a((Context) C6855a.m21308b());
        m68443j();
    }

    /* renamed from: a */
    public final void mo55840a() {
        m68442i();
        m68444k();
        m68445l();
    }

    /* renamed from: l */
    private final void m68445l() {
        if (this.f55790a == Mode.REACTION) {
            C15382b.f39669a.mo38743d("initReaction() called");
            mo55851e().mo55900a(this.f55799k, 0, 0);
            mo55852f().mo56161e();
        }
    }

    /* renamed from: k */
    private final void m68444k() {
        String str;
        boolean z;
        if (this.f55790a == Mode.DUET) {
            C15382b.f39669a.mo38743d("initDuet() called");
            int d = this.f55793d.mo38927j().mo38973d();
            int e = this.f55793d.mo38927j().mo38974e();
            if (this.f55793d.mo38927j().mo38970a()) {
                str = null;
            } else {
                str = this.f55797i;
            }
            double d2 = this.f55794f;
            double d3 = (double) d;
            Double.isNaN(d3);
            if (d2 * d3 <= ((double) e)) {
                z = false;
            } else {
                z = true;
            }
            mo55851e().mo55900a(str, 0, 0);
            mo55849c().mo55875a(this.f55796h, str, 0.0f, 0.16f, 0.6f, z);
        }
    }

    /* renamed from: m */
    private void m68446m() {
        if (this.f55793d.mo38919b()) {
            SurfaceHolder c = this.f55793d.mo38920c();
            if (c != null) {
                c.addCallback(new C20657b(this));
            }
            SurfaceHolder c2 = this.f55793d.mo38920c();
            if (c2 != null) {
                Surface surface = c2.getSurface();
                if (surface != null) {
                    if (!surface.isValid()) {
                        surface = null;
                    }
                    if (surface != null) {
                        mo55840a();
                        this.f55792c.mo55851e().mo55896a(surface, "", (C7562b<? super Integer, C7581n>) C20659c.f55802a);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private final void m68443j() {
        int i;
        C20676a e = mo55851e();
        int e2 = mo55846b().mo55957e();
        int f = mo55846b().mo55959f();
        String absolutePath = this.f55793d.mo38921d().mo38984b().getAbsolutePath();
        C7573i.m23582a((Object) absolutePath, "recorderContext.workspac….segmentPath.absolutePath");
        if (this.f55790a == Mode.DUET) {
            i = ((Number) this.f55795g.getSecond()).intValue() / 2;
        } else {
            i = ((Number) this.f55795g.getSecond()).intValue();
        }
        boolean i2 = this.f55793d.mo38926i();
        e.mo55884a(e2, f, absolutePath, i, ((Number) this.f55795g.getFirst()).intValue(), "", i2 ? 1 : 0, this.f55793d.mo38923f());
        mo55851e().mo55904a(true);
        mo55851e().mo55917e(this.f55793d.mo38933p());
        mo55850d().mo56046a(3);
        mo55850d().mo56083b(1);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ASRecorder(android.arch.lifecycle.C0043i r2, com.p280ss.android.ugc.asve.recorder.C20689c r3, com.p280ss.android.ugc.asve.context.C15432h r4) {
        /*
            r1 = this;
            java.lang.String r0 = "recorderImp"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = "recorderContext"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            r1.<init>()
            r1.f55791b = r2
            r1.f55792c = r3
            r1.f55793d = r4
            r2 = 4608683618675807573(0x3ff5555555555555, double:1.3333333333333333)
            r1.f55794f = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55793d
            kotlin.Pair r2 = r2.mo38922e()
            r1.f55795g = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55793d
            com.ss.android.ugc.asve.context.f r2 = r2.mo38927j()
            java.lang.String r2 = r2.mo38972c()
            r1.f55796h = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55793d
            com.ss.android.ugc.asve.context.f r2 = r2.mo38927j()
            java.lang.String r2 = r2.mo38971b()
            r1.f55797i = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55793d
            com.ss.android.ugc.asve.context.g r2 = r2.mo38928k()
            java.lang.String r2 = r2.mo38976b()
            r1.f55798j = r2
            com.ss.android.ugc.asve.context.h r2 = r1.f55793d
            com.ss.android.ugc.asve.context.g r2 = r2.mo38928k()
            java.lang.String r2 = r2.mo38975a()
            r1.f55799k = r2
            java.lang.String r2 = r1.f55798j
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r3 = 0
            r4 = 1
            if (r2 <= 0) goto L_0x0060
            r2 = 1
            goto L_0x0061
        L_0x0060:
            r2 = 0
        L_0x0061:
            if (r2 == 0) goto L_0x0075
            java.lang.String r2 = r1.f55799k
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x006f
            r2 = 1
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            if (r2 == 0) goto L_0x0075
            com.ss.android.ugc.asve.recorder.ASRecorder$Mode r2 = com.p280ss.android.ugc.asve.recorder.ASRecorder.Mode.REACTION
            goto L_0x0096
        L_0x0075:
            java.lang.String r2 = r1.f55796h
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0081
            r2 = 1
            goto L_0x0082
        L_0x0081:
            r2 = 0
        L_0x0082:
            if (r2 == 0) goto L_0x0094
            java.lang.String r2 = r1.f55797i
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x008f
            r3 = 1
        L_0x008f:
            if (r3 == 0) goto L_0x0094
            com.ss.android.ugc.asve.recorder.ASRecorder$Mode r2 = com.p280ss.android.ugc.asve.recorder.ASRecorder.Mode.DUET
            goto L_0x0096
        L_0x0094:
            com.ss.android.ugc.asve.recorder.ASRecorder$Mode r2 = com.p280ss.android.ugc.asve.recorder.ASRecorder.Mode.CUSTOM
        L_0x0096:
            r1.f55790a = r2
            android.arch.lifecycle.i r2 = r1.f55791b
            if (r2 == 0) goto L_0x00a8
            android.arch.lifecycle.Lifecycle r2 = r2.getLifecycle()
            if (r2 == 0) goto L_0x00a8
            r3 = r1
            android.arch.lifecycle.h r3 = (android.arch.lifecycle.C0042h) r3
            r2.mo55a(r3)
        L_0x00a8:
            r1.m68446m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.recorder.ASRecorder.<init>(android.arch.lifecycle.i, com.ss.android.ugc.asve.recorder.c, com.ss.android.ugc.asve.context.h):void");
    }
}
