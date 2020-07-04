package com.p280ss.android.ugc.asve.sandbox;

import android.app.Service;
import android.content.Intent;
import android.content.res.AssetManager;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Process;
import android.os.RemoteException;
import com.bef.effectsdk.C1942b;
import com.p280ss.android.ttve.nativePort.TEEffectUtils;
import com.p280ss.android.ugc.asve.C15382b;
import com.p280ss.android.ugc.asve.C6855a;
import com.p280ss.android.ugc.asve.context.C15426e;
import com.p280ss.android.ugc.asve.recorder.C20675b;
import com.p280ss.android.ugc.asve.sandbox.C21047n.C21048a;
import com.p280ss.android.ugc.asve.sandbox.SandBoxResourceFinder.C20826a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20965u;
import com.p280ss.android.ugc.asve.sandbox.p930d.C21007f;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21063b;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21066c;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21072e;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;
import com.p280ss.android.vesdk.C45252ac;
import com.p280ss.android.vesdk.C45321i;
import java.lang.Thread.UncaughtExceptionHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService */
public final class SandBoxRemoteCoreService extends Service {

    /* renamed from: a */
    public final String f56218a = "SandBoxCoreService";

    /* renamed from: b */
    public boolean f56219b;

    /* renamed from: c */
    public final C20824b f56220c = new C20824b(this);

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService$a */
    static final class C20823a implements UncaughtExceptionHandler {

        /* renamed from: a */
        final /* synthetic */ SandBoxRemoteCoreService f56221a;

        /* renamed from: b */
        final /* synthetic */ UncaughtExceptionHandler f56222b;

        C20823a(SandBoxRemoteCoreService sandBoxRemoteCoreService, UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f56221a = sandBoxRemoteCoreService;
            this.f56222b = uncaughtExceptionHandler;
        }

        public final void uncaughtException(Thread thread, Throwable th) {
            this.f56222b.uncaughtException(thread, th);
            if ((th instanceof RemoteException) || (th.getCause() instanceof RemoteException)) {
                this.f56221a.f56220c.mo56340a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService$b */
    public static final class C20824b extends C21048a {

        /* renamed from: a */
        final /* synthetic */ SandBoxRemoteCoreService f56223a;

        /* renamed from: b */
        private C21041l f56224b;

        /* renamed from: com.ss.android.ugc.asve.sandbox.SandBoxRemoteCoreService$b$a */
        static final class C20825a implements DeathRecipient {

            /* renamed from: a */
            final /* synthetic */ C20824b f56225a;

            C20825a(C20824b bVar) {
                this.f56225a = bVar;
            }

            public final void binderDied() {
                this.f56225a.mo56343b();
            }
        }

        /* renamed from: b */
        public final void mo56343b() {
            mo56340a();
        }

        /* renamed from: a */
        public final void mo56340a() {
            Process.killProcess(Process.myPid());
        }

        C20824b(SandBoxRemoteCoreService sandBoxRemoteCoreService) {
            this.f56223a = sandBoxRemoteCoreService;
        }

        /* renamed from: a */
        public final void mo56341a(C20965u uVar) {
            if (uVar != null) {
                IBinder asBinder = uVar.asBinder();
                if (asBinder != null) {
                    asBinder.linkToDeath(new C20825a(this), 0);
                }
            }
        }

        /* renamed from: a */
        public final C21041l mo56339a(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) {
            C7573i.m23587b(aSSandBoxRecorderContextWrapper, "context");
            if (!this.f56223a.f56219b) {
                SandBoxRemoteCoreService.m69742a(-1);
                return null;
            }
            C15382b.f39669a.mo38742c("createSandboxRecorder remote  begin ");
            SandBoxRemoteCoreService.m69741a();
            this.f56224b = new C21007f(aSSandBoxRecorderContextWrapper);
            C15382b.f39669a.mo38742c("createSandboxRecorder remote  end ");
            SandBoxRemoteCoreService.m69742a(1);
            C21041l lVar = this.f56224b;
            if (lVar == null) {
                C7573i.m23580a();
            }
            return lVar;
        }

        /* renamed from: a */
        public final synchronized void mo56342a(SandBoxASContextWrapper sandBoxASContextWrapper, C21044m mVar, C21066c cVar, C21072e eVar, C21063b bVar, C21023f fVar) {
            C7573i.m23587b(sandBoxASContextWrapper, "sandBoxContextWrapper");
            C7573i.m23587b(cVar, "logger");
            C45321i iVar = new C45321i();
            iVar.f116729c = sandBoxASContextWrapper.f56541n;
            iVar.f116727a = sandBoxASContextWrapper.f56542o;
            iVar.f116728b = sandBoxASContextWrapper.f56543p;
            C6855a aVar = C6855a.f19498b;
            C20827a aVar2 = new C20827a(sandBoxASContextWrapper, cVar, eVar, bVar, iVar, fVar);
            aVar.mo16718a((C15426e) aVar2);
            if (mVar != null) {
                AssetManager assets = C6855a.m21308b().getAssets();
                C7573i.m23582a((Object) assets, "AS.applicationContext.assets");
                String str = sandBoxASContextWrapper.f56540m;
                C7573i.m23582a((Object) str, "sandBoxContextWrapper.effectModelDownloadPath");
                C45252ac.m142761a((C1942b) new SandBoxResourceFinder(mVar, assets, str));
            }
            Map linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("init_state", "1");
            C20675b d = C6855a.m21306a().mo38947d();
            if (d != null) {
                d.mo55881a("sandbox_init_asve", linkedHashMap);
            }
            C15382b.f39669a.mo38742c("initASVE remote all end ");
            this.f56223a.f56219b = true;
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f56219b = false;
    }

    /* renamed from: a */
    public static void m69741a() {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("create_state", "0");
        C20675b d = C6855a.m21306a().mo38947d();
        if (d != null) {
            d.mo55881a("sandbox_create_recoder", linkedHashMap);
        }
    }

    public final void onCreate() {
        super.onCreate();
        TEEffectUtils.getEffectVersion();
        C20826a aVar = SandBoxResourceFinder.Companion;
        Thread.setDefaultUncaughtExceptionHandler(new C20823a(this, Thread.getDefaultUncaughtExceptionHandler()));
    }

    public final IBinder onBind(Intent intent) {
        C7573i.m23587b(intent, "intent");
        return this.f56220c;
    }

    public final boolean onUnbind(Intent intent) {
        Process.killProcess(Process.myPid());
        return super.onUnbind(intent);
    }

    /* renamed from: a */
    public static void m69742a(int i) {
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("create_state", String.valueOf(i));
        C20675b d = C6855a.m21306a().mo38947d();
        if (d != null) {
            d.mo55881a("sandbox_create_recoder", linkedHashMap);
        }
    }
}
