package com.p280ss.android.ugc.asve.sandbox;

import android.arch.lifecycle.C0043i;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.RemoteException;
import com.bef.effectsdk.C1942b;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.IASPathAdaptor;
import com.p280ss.android.ugc.asve.context.C15432h;
import com.p280ss.android.ugc.asve.p756d.C15448c;
import com.p280ss.android.ugc.asve.p756d.C15448c.C15449a;
import com.p280ss.android.ugc.asve.p756d.C15451e;
import com.p280ss.android.ugc.asve.recorder.C20675b;
import com.p280ss.android.ugc.asve.recorder.C20689c;
import com.p280ss.android.ugc.asve.sandbox.C21047n.C21048a;
import com.p280ss.android.ugc.asve.sandbox.p927a.C20828a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20965u;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20965u.C20966a;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21063b;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21066c;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21072e;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;
import com.p280ss.android.vesdk.VEListener.C45206b;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.asve.sandbox.b */
public final class C20896b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f56325a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C20896b.class), "isOnSandBoxProcess", "isOnSandBoxProcess()Z"))};

    /* renamed from: b */
    public static final C20896b f56326b = new C20896b();

    /* renamed from: c */
    private static final String f56327c = f56327c;

    /* renamed from: d */
    private static final long f56328d = f56328d;

    /* renamed from: e */
    private static C21053p f56329e;

    /* renamed from: f */
    private static boolean f56330f;

    /* renamed from: g */
    private static int f56331g;

    /* renamed from: h */
    private static final C7541d f56332h = C7546e.m23569a(C20897a.f56336a);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static C21047n f56333i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static long f56334j;

    /* renamed from: k */
    private static final C20898b f56335k = new C20898b();

    /* renamed from: com.ss.android.ugc.asve.sandbox.b$a */
    static final class C20897a extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C20897a f56336a = new C20897a();

        C20897a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m69949a());
        }

        /* renamed from: a */
        private static boolean m69949a() {
            String packageName = C6855a.m21308b().getPackageName();
            String a = C15451e.m45251a(C6855a.m21308b());
            StringBuilder sb = new StringBuilder();
            sb.append(packageName);
            sb.append(":assandbox");
            return C7573i.m23585a((Object) sb.toString(), (Object) a);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.b$b */
    public static final class C20898b implements ServiceConnection {

        /* renamed from: com.ss.android.ugc.asve.sandbox.b$b$a */
        static final class C20899a implements DeathRecipient {

            /* renamed from: a */
            final /* synthetic */ C20898b f56337a;

            C20899a(C20898b bVar) {
                this.f56337a = bVar;
            }

            public final void binderDied() {
                C20898b.m69950a();
            }
        }

        /* renamed from: com.ss.android.ugc.asve.sandbox.b$b$b */
        public static final class C20900b extends C20966a {
            C20900b() {
            }

            /* renamed from: a */
            public final void mo56413a() {
            }
        }

        C20898b() {
        }

        /* renamed from: a */
        public static void m69950a() {
            try {
                C20896b.f56333i = null;
                C15382b.f39669a.mo38742c("asve process died, do some clear and restore work");
                C21053p c = C20896b.m69940c();
                if (c != null) {
                    c.mo56768a();
                }
            } catch (Exception unused) {
            }
            C20896b.m69943h();
            C20896b.m69942g();
            if (C20896b.m69941d() && C15449a.m45247a(C6855a.m21308b()).mo39006d()) {
                C20896b.f56326b.mo56408e();
            }
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            C7573i.m23587b(componentName, "name");
            C20896b.f56333i = null;
            C20896b.m69936a(0);
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C21044m mVar;
            C21072e eVar;
            C21063b bVar;
            C21023f fVar;
            C7573i.m23587b(componentName, "name");
            C7573i.m23587b(iBinder, "service");
            C20896b.f56334j = System.currentTimeMillis();
            C20896b.m69936a(1);
            try {
                C20896b.f56333i = C21048a.m71014a(iBinder);
                iBinder.linkToDeath(new C20899a(this), 0);
                if (C20896b.f56333i != null) {
                    C21047n a = C20896b.f56333i;
                    if (a != null) {
                        SandBoxASContextWrapper sandBoxASContextWrapper = new SandBoxASContextWrapper(C6855a.m21306a());
                        C1942b f = C6855a.m21306a().mo38949f();
                        if (f != null) {
                            mVar = C20828a.m69779a(f);
                        } else {
                            mVar = null;
                        }
                        C21044m mVar2 = mVar;
                        C21066c a2 = C20828a.m69781a(C6855a.m21306a().mo38945b());
                        C20675b d = C6855a.m21306a().mo38947d();
                        if (d != null) {
                            eVar = C20828a.m69782a(d);
                        } else {
                            eVar = null;
                        }
                        C21072e eVar2 = eVar;
                        C45206b e = C6855a.m21306a().mo38948e();
                        if (e != null) {
                            bVar = C20828a.m69780a(e);
                        } else {
                            bVar = null;
                        }
                        C21063b bVar2 = bVar;
                        IASPathAdaptor c = C6855a.m21306a().mo38946c();
                        if (c != null) {
                            fVar = C20828a.m69778a(c);
                        } else {
                            fVar = null;
                        }
                        a.mo56342a(sandBoxASContextWrapper, mVar2, a2, eVar2, bVar2, fVar);
                    }
                    C21047n a3 = C20896b.f56333i;
                    if (a3 != null) {
                        a3.mo56341a((C20965u) new C20900b());
                    }
                }
            } catch (Exception unused) {
                C20896b.m69936a(0);
                C20896b.m69942g();
                C20896b.f56333i = null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.b$c */
    static final class C20901c implements Runnable {

        /* renamed from: a */
        public static final C20901c f56338a = new C20901c();

        C20901c() {
        }

        public final void run() {
            long currentTimeMillis = System.currentTimeMillis();
            C15448c a = C15449a.m45247a(C6855a.m21308b());
            long c = a.mo39005c();
            if (c > 0 && currentTimeMillis - c < C20896b.m69939b()) {
                a.mo39002a(true);
            }
            a.mo39001a(currentTimeMillis);
        }
    }

    private C20896b() {
    }

    /* renamed from: b */
    public static long m69939b() {
        return f56328d;
    }

    /* renamed from: c */
    public static final C21053p m69940c() {
        return f56329e;
    }

    /* renamed from: d */
    public static final boolean m69941d() {
        return f56330f;
    }

    /* renamed from: f */
    public final boolean mo56409f() {
        return ((Boolean) f56332h.getValue()).booleanValue();
    }

    /* renamed from: a */
    public static final String m69935a() {
        return f56327c;
    }

    /* renamed from: g */
    public static void m69942g() {
        C15382b.f39669a.mo38742c("asve process died, mark time ");
        C6855a.m21306a().mo38944a().submit(C20901c.f56338a);
    }

    /* renamed from: j */
    private static void m69945j() {
        Intent intent = new Intent();
        intent.setClass(C6855a.m21308b(), SandBoxRemoteCoreService.class);
        C6855a.m21308b().bindService(intent, f56335k, 1);
    }

    /* renamed from: e */
    public final void mo56408e() {
        if (!mo56409f()) {
            m69945j();
            return;
        }
        throw new IllegalStateException("current process is already sanbox!!");
    }

    /* renamed from: h */
    public static void m69943h() {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("sandbox_service_duration", String.valueOf(System.currentTimeMillis() - f56334j));
        linkedHashMap.put("sandbox_state", String.valueOf(f56331g));
        C20675b d = C6855a.m21306a().mo38947d();
        if (d != null) {
            d.mo55881a("sandbox_quit_unusual", linkedHashMap);
        }
        f56331g = 0;
    }

    /* renamed from: i */
    private static void m69944i() {
        C15448c a = C15449a.m45247a(C6855a.m21308b());
        if (!a.mo39006d() && System.currentTimeMillis() - a.mo39005c() > f56328d) {
            a.mo39002a(false);
        }
    }

    /* renamed from: a */
    public static void m69936a(int i) {
        f56331g = i;
    }

    /* renamed from: a */
    public final boolean mo56407a(Context context) {
        C7573i.m23587b(context, "context");
        m69944i();
        Context applicationContext = context.getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "context.applicationContext");
        return C15449a.m45247a(applicationContext).mo39006d();
    }

    /* renamed from: a */
    public static C20689c m69933a(C15432h hVar, C0043i iVar) {
        C21041l lVar;
        C7573i.m23587b(hVar, "recorderContext");
        f56329e = hVar.mo38932o();
        C15382b.f39669a.mo38742c("createSandboxRecorder begin ");
        ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper = new ASSandBoxRecorderContextWrapper(hVar);
        C15382b.f39669a.mo38742c("createSandboxRecorder covert context success  ");
        SandBoxRecorderImpl sandBoxRecorderImpl = null;
        try {
            C21047n nVar = f56333i;
            if (nVar != null) {
                lVar = nVar.mo56339a(aSSandBoxRecorderContextWrapper);
            } else {
                lVar = null;
            }
            try {
                f56331g = 3;
                C15382b.f39669a.mo38742c("createSandboxRecorder remote end ");
            } catch (RemoteException unused) {
            }
        } catch (RemoteException unused2) {
            lVar = null;
        }
        if (lVar != null) {
            sandBoxRecorderImpl = new SandBoxRecorderImpl(lVar, hVar, iVar);
        }
        return sandBoxRecorderImpl;
    }
}
