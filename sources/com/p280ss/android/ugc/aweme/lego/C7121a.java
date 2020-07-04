package com.p280ss.android.ugc.aweme.lego;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue.IdleHandler;
import com.p280ss.android.ugc.aweme.lego.p329a.C7144a;
import com.p280ss.android.ugc.aweme.lego.p329a.C7146b;
import com.p280ss.android.ugc.aweme.lego.p329a.C7147c;
import com.p280ss.android.ugc.aweme.lego.p329a.C7148d;
import com.p280ss.android.ugc.aweme.lego.p330b.C7150a;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.lego.a */
public final class C7121a {

    /* renamed from: a */
    public static final C7121a f20005a = new C7121a();

    /* renamed from: b */
    private static long f20006b = 60000;

    /* renamed from: c */
    private static ProcessType f20007c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C7148d f20008d = new C7148d();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C7146b f20009e = new C7146b();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C7147c f20010f = new C7147c();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C7144a f20011g = new C7144a();

    /* renamed from: h */
    private static Context f20012h;

    /* renamed from: i */
    private static C7125c f20013i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static C7122a f20014j = C7122a.COLD_BOOT_BEGIN;

    /* renamed from: k */
    private static C7153e f20015k;

    /* renamed from: com.ss.android.ugc.aweme.lego.a$a */
    enum C7122a {
        COLD_BOOT_BEGIN,
        COLD_BOOT_END,
        HOT_BOOT_BEGIN,
        HOT_BOOT_END
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$b */
    public static final class C7123b {

        /* renamed from: a */
        private final List<Class<? extends LegoInflate>> f20021a = new ArrayList();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$b$a */
        static final class C7124a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Class f20022a;

            C7124a(Class cls) {
                this.f20022a = cls;
            }

            public final void run() {
                C7121a.f20011g.mo18577c(this.f20022a);
            }
        }

        /* renamed from: a */
        public final void mo18546a() {
            if (!this.f20021a.isEmpty()) {
                for (Class aVar : this.f20021a) {
                    C7149b.m22312b().post(new C7124a(aVar));
                }
                this.f20021a.clear();
            }
        }

        /* renamed from: a */
        public final C7123b mo18545a(Class<? extends LegoInflate> cls) {
            C7573i.m23587b(cls, "name");
            if (C7121a.f20011g.mo18576b(cls)) {
                return this;
            }
            this.f20021a.add(cls);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$c */
    static final class C7125c extends Handler {
        /* renamed from: a */
        public final void mo18548a(int i) {
            mo18549a(i, 0);
        }

        public final void handleMessage(Message message) {
            Integer num;
            if (message != null) {
                num = Integer.valueOf(message.what);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1205) {
                C7121a.m22259g();
            } else if (num != null && num.intValue() == 1201) {
                C7121a.m22263k();
            } else if (num != null && num.intValue() == 1202) {
                C7121a.m22264l();
            } else if (num != null && num.intValue() == 1203) {
                C7121a.m22265m();
            } else {
                if (num != null && num.intValue() == 1204) {
                    C7121a.m22266n();
                }
            }
        }

        /* renamed from: a */
        public final void mo18549a(int i, long j) {
            m22273a(i, j, null);
        }

        /* renamed from: a */
        private void m22273a(int i, long j, Object obj) {
            Message obtainMessage = obtainMessage();
            obtainMessage.what = i;
            obtainMessage.obj = null;
            removeMessages(i);
            sendMessageDelayed(obtainMessage, j);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$d */
    public static final class C7126d {

        /* renamed from: a */
        public final List<C7152c> f20023a = new ArrayList();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$d$a */
        static final class C7127a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C7126d f20024a;

            C7127a(C7126d dVar) {
                this.f20024a = dVar;
            }

            public final void run() {
                for (final C7152c cVar : this.f20024a.f20023a) {
                    RequestType a = cVar.mo18606a();
                    C7121a.f20009e.mo18586a(a, cVar);
                    if (a == RequestType.P0) {
                        C7149b.m22311a(RequestType.P0).execute(new Runnable() {
                            public final void run() {
                                C7121a.f20009e.mo18587a(cVar, C7121a.m22260h());
                            }
                        });
                    } else if (a == RequestType.NORMAL) {
                        C7149b.m22311a(RequestType.NORMAL).execute(new Runnable() {
                            public final void run() {
                                C7121a.f20009e.mo18587a(cVar, C7121a.m22260h());
                            }
                        });
                    }
                }
                if (C7121a.m22261i()) {
                    if (!C7121a.m22247b(C7121a.f20005a).hasMessages(1203) && C7121a.f20009e.mo18588a(RequestType.SPARSE)) {
                        C7121a.m22247b(C7121a.f20005a).mo18549a(1203, 2000);
                    }
                    if (!C7121a.m22247b(C7121a.f20005a).hasMessages(1204) && C7121a.f20009e.mo18588a(RequestType.IDLE)) {
                        C7121a.m22247b(C7121a.f20005a).mo18549a(1204, 2000);
                    }
                }
                this.f20024a.f20023a.clear();
            }
        }

        /* renamed from: a */
        public final void mo18552a() {
            if (!this.f20023a.isEmpty()) {
                C7149b.m22311a(RequestType.P0).execute(new C7127a(this));
            }
        }

        /* renamed from: a */
        public final C7126d mo18551a(C7152c cVar) {
            C7573i.m23587b(cVar, "request");
            this.f20023a.add(cVar);
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$e */
    public static final class C7130e {

        /* renamed from: a */
        private final Map<WorkType, List<Class<? extends LegoService>>> f20027a = new HashMap();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$e$a */
        static final class C7131a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Class f20028a;

            C7131a(Class cls) {
                this.f20028a = cls;
            }

            public final void run() {
                C7121a.f20010f.mo18595b(this.f20028a);
            }
        }

        public C7130e() {
            for (WorkType put : WorkType.values()) {
                this.f20027a.put(put, new ArrayList());
            }
        }

        /* renamed from: a */
        public final void mo18557a() {
            WorkType[] values;
            if (!this.f20027a.isEmpty()) {
                for (WorkType workType : WorkType.values()) {
                    C7147c a = C7121a.f20010f;
                    Object obj = this.f20027a.get(workType);
                    if (obj == null) {
                        C7573i.m23580a();
                    }
                    a.mo18592a(workType, (List) obj);
                }
                for (Class b : C7121a.f20010f.mo18598c(WorkType.MAIN)) {
                    C7121a.f20010f.mo18595b(b);
                }
                for (Class aVar : C7121a.f20010f.mo18598c(WorkType.BACKGROUND)) {
                    C7149b.m22310a().execute(new C7131a(aVar));
                }
                if (C7121a.f20010f.mo18594a(WorkType.SPARSE) && !C7121a.m22247b(C7121a.f20005a).hasMessages(1202)) {
                    C7121a.m22247b(C7121a.f20005a).mo18548a(1202);
                }
                if (C7121a.f20010f.mo18594a(WorkType.IDLE)) {
                    C7121a.m22247b(C7121a.f20005a).mo18548a(1200);
                }
                this.f20027a.clear();
            }
        }

        /* renamed from: a */
        public final C7130e mo18556a(Class<? extends LegoService> cls) {
            C7573i.m23587b(cls, "name");
            LegoService c = C7121a.f20010f.mo18597c(cls);
            if (c != null) {
                Object obj = this.f20027a.get(c.type());
                if (obj == null) {
                    C7573i.m23580a();
                }
                ((List) obj).add(cls);
            }
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$f */
    public static final class C7132f {

        /* renamed from: a */
        private final Map<WorkType, List<LegoTask>> f20029a = new HashMap();

        /* renamed from: com.ss.android.ugc.aweme.lego.a$f$a */
        static final class C7133a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ LegoTask f20030a;

            C7133a(LegoTask legoTask) {
                this.f20030a = legoTask;
            }

            public final void run() {
                C7121a.f20008d.mo18604b(this.f20030a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.lego.a$f$b */
        static final class C7134b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ LegoTask f20031a;

            C7134b(LegoTask legoTask) {
                this.f20031a = legoTask;
            }

            public final void run() {
                C7121a.f20008d.mo18604b(this.f20031a);
            }
        }

        public C7132f() {
            for (WorkType put : WorkType.values()) {
                this.f20029a.put(put, new ArrayList());
            }
        }

        /* renamed from: a */
        public final void mo18560a() {
            WorkType[] values;
            if (!this.f20029a.isEmpty()) {
                for (WorkType workType : WorkType.values()) {
                    C7148d e = C7121a.f20008d;
                    Object obj = this.f20029a.get(workType);
                    if (obj == null) {
                        C7573i.m23580a();
                    }
                    e.mo18605b(workType, (List) obj);
                }
                C7148d e2 = C7121a.f20008d;
                WorkType workType2 = WorkType.MAIN;
                Object obj2 = this.f20029a.get(WorkType.MAIN);
                if (obj2 == null) {
                    C7573i.m23580a();
                }
                for (LegoTask b : e2.mo18599a(workType2, (List) obj2)) {
                    C7121a.f20008d.mo18604b(b);
                }
                C7148d e3 = C7121a.f20008d;
                WorkType workType3 = WorkType.BACKGROUND;
                Object obj3 = this.f20029a.get(WorkType.BACKGROUND);
                if (obj3 == null) {
                    C7573i.m23580a();
                }
                for (LegoTask aVar : e3.mo18599a(workType3, (List) obj3)) {
                    C7149b.m22310a().execute(new C7133a(aVar));
                }
                if (C7121a.f20014j != C7122a.COLD_BOOT_BEGIN) {
                    C7148d e4 = C7121a.f20008d;
                    WorkType workType4 = WorkType.BOOT_FINISH;
                    Object obj4 = this.f20029a.get(WorkType.BOOT_FINISH);
                    if (obj4 == null) {
                        C7573i.m23580a();
                    }
                    for (LegoTask bVar : e4.mo18599a(workType4, (List) obj4)) {
                        C7149b.m22310a().execute(new C7134b(bVar));
                    }
                }
                if (C7121a.f20008d.mo18602a(WorkType.SPARSE) && !C7121a.m22247b(C7121a.f20005a).hasMessages(1202)) {
                    C7121a.m22247b(C7121a.f20005a).mo18548a(1202);
                }
                if (C7121a.f20008d.mo18602a(WorkType.IDLE)) {
                    C7121a.m22247b(C7121a.f20005a).mo18548a(1200);
                }
                this.f20029a.clear();
            }
        }

        /* renamed from: a */
        public final C7132f mo18559a(LegoTask legoTask) {
            C7573i.m23587b(legoTask, "task");
            if (legoTask.process() == ProcessType.ALL || legoTask.process() == C7121a.m22252d(C7121a.f20005a)) {
                Object obj = this.f20029a.get(legoTask.type());
                if (obj == null) {
                    C7573i.m23580a();
                }
                ((List) obj).add(legoTask);
            }
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$g */
    static final class C7135g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7152c f20032a;

        C7135g(C7152c cVar) {
            this.f20032a = cVar;
        }

        public final void run() {
            C7121a.f20009e.mo18587a(this.f20032a, C7121a.m22260h());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$h */
    static final class C7136h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C7152c f20033a;

        C7136h(C7152c cVar) {
            this.f20033a = cVar;
        }

        public final void run() {
            C7121a.f20009e.mo18587a(this.f20033a, C7121a.m22260h());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$i */
    static final class C7137i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Class f20034a;

        C7137i(Class cls) {
            this.f20034a = cls;
        }

        public final void run() {
            C7121a.f20010f.mo18595b(this.f20034a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$j */
    static final class C7138j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LegoTask f20035a;

        C7138j(LegoTask legoTask) {
            this.f20035a = legoTask;
        }

        public final void run() {
            C7121a.f20008d.mo18604b(this.f20035a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$k */
    static final class C7139k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Class f20036a;

        C7139k(Class cls) {
            this.f20036a = cls;
        }

        public final void run() {
            C7121a.f20010f.mo18595b(this.f20036a);
            C7121a.m22247b(C7121a.f20005a).mo18548a(1200);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$l */
    static final class C7140l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LegoTask f20037a;

        C7140l(LegoTask legoTask) {
            this.f20037a = legoTask;
        }

        public final void run() {
            C7121a.f20008d.mo18604b(this.f20037a);
            C7121a.m22247b(C7121a.f20005a).mo18548a(1200);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$m */
    static final class C7141m implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Class f20038a;

        C7141m(Class cls) {
            this.f20038a = cls;
        }

        public final void run() {
            C7121a.f20010f.mo18595b(this.f20038a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$n */
    static final class C7142n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LegoTask f20039a;

        C7142n(LegoTask legoTask) {
            this.f20039a = legoTask;
        }

        public final void run() {
            C7121a.f20008d.mo18604b(this.f20039a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.a$o */
    static final class C7143o implements IdleHandler {

        /* renamed from: a */
        public static final C7143o f20040a = new C7143o();

        C7143o() {
        }

        public final boolean queueIdle() {
            if (C7121a.m22261i()) {
                C7121a.m22262j();
            }
            return true;
        }
    }

    private C7121a() {
    }

    /* renamed from: a */
    public static C7153e m22242a() {
        return f20015k;
    }

    /* renamed from: b */
    public static C7132f m22248b() {
        return new C7132f();
    }

    /* renamed from: c */
    public static C7130e m22250c() {
        return new C7130e();
    }

    /* renamed from: d */
    public static C7123b m22253d() {
        return new C7123b();
    }

    /* renamed from: e */
    public static C7126d m22254e() {
        return new C7126d();
    }

    /* renamed from: f */
    public static void m22257f() {
        if (f20014j != C7122a.COLD_BOOT_BEGIN) {
            f20014j = C7122a.HOT_BOOT_BEGIN;
        }
    }

    /* renamed from: o */
    private static void m22267o() {
        Looper.myQueue().addIdleHandler(C7143o.f20040a);
    }

    /* renamed from: h */
    public static boolean m22260h() {
        if (f20014j == C7122a.COLD_BOOT_BEGIN || f20014j == C7122a.COLD_BOOT_END) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m22261i() {
        if (f20014j == C7122a.COLD_BOOT_END || f20014j == C7122a.HOT_BOOT_END) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static void m22262j() {
        Class b = f20010f.mo18596b(WorkType.IDLE);
        if (b != null) {
            C7149b.m22310a().execute(new C7139k(b));
        }
        LegoTask b2 = f20008d.mo18603b(WorkType.IDLE);
        if (b2 != null) {
            C7149b.m22310a().execute(new C7140l(b2));
        }
    }

    /* renamed from: m */
    public static void m22265m() {
        if (f20009e.mo18588a(RequestType.SPARSE)) {
            C7152c b = f20009e.mo18589b(RequestType.SPARSE);
            if (b != null) {
                C7149b.m22311a(RequestType.SPARSE).execute(new C7136h(b));
            }
        }
        if (f20009e.mo18588a(RequestType.SPARSE)) {
            C7125c cVar = f20013i;
            if (cVar == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar.mo18549a(1203, 2000);
        }
    }

    /* renamed from: g */
    public static void m22259g() {
        if (f20014j == C7122a.COLD_BOOT_BEGIN) {
            f20014j = C7122a.COLD_BOOT_END;
            C7125c cVar = f20013i;
            if (cVar == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar.mo18549a(1201, 1000);
            C7125c cVar2 = f20013i;
            if (cVar2 == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar2.mo18549a(1203, 1000);
            C7125c cVar3 = f20013i;
            if (cVar3 == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar3.mo18549a(1204, f20006b);
        }
        if (f20014j == C7122a.HOT_BOOT_BEGIN) {
            f20014j = C7122a.HOT_BOOT_END;
            C7125c cVar4 = f20013i;
            if (cVar4 == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar4.mo18549a(1203, 1000);
            C7125c cVar5 = f20013i;
            if (cVar5 == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar5.mo18549a(1204, f20006b);
        }
    }

    /* renamed from: k */
    public static void m22263k() {
        Class b = f20010f.mo18596b(WorkType.BOOT_FINISH);
        if (b != null) {
            C7149b.m22310a().execute(new C7137i(b));
        }
        LegoTask b2 = f20008d.mo18603b(WorkType.BOOT_FINISH);
        if (b2 != null) {
            C7149b.m22310a().execute(new C7138j(b2));
        }
        if (f20010f.mo18594a(WorkType.BOOT_FINISH) || f20008d.mo18602a(WorkType.BOOT_FINISH)) {
            C7125c cVar = f20013i;
            if (cVar == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar.mo18549a(1201, 50);
        }
    }

    /* renamed from: l */
    public static void m22264l() {
        Class b = f20010f.mo18596b(WorkType.SPARSE);
        if (b != null) {
            C7149b.m22310a().execute(new C7141m(b));
        }
        LegoTask b2 = f20008d.mo18603b(WorkType.SPARSE);
        if (b2 != null) {
            C7149b.m22310a().execute(new C7142n(b2));
        }
        if (f20010f.mo18594a(WorkType.SPARSE) || f20008d.mo18602a(WorkType.SPARSE)) {
            C7125c cVar = f20013i;
            if (cVar == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar.mo18549a(1202, 50);
        }
    }

    /* renamed from: n */
    public static void m22266n() {
        if (f20009e.mo18588a(RequestType.SPARSE)) {
            C7125c cVar = f20013i;
            if (cVar == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar.mo18549a(1204, 2000);
            return;
        }
        if (f20009e.mo18588a(RequestType.IDLE)) {
            C7152c b = f20009e.mo18589b(RequestType.IDLE);
            if (b != null) {
                C7149b.m22311a(RequestType.IDLE).execute(new C7135g(b));
            }
        }
        if (f20009e.mo18588a(RequestType.IDLE)) {
            C7125c cVar2 = f20013i;
            if (cVar2 == null) {
                C7573i.m23583a("mainHandler");
            }
            cVar2.mo18549a(1204, 2000);
        }
    }

    /* renamed from: a */
    public static <T> T m22243a(Class<? extends LegoService> cls) {
        C7573i.m23587b(cls, "name");
        return f20010f.mo18590a(cls);
    }

    /* renamed from: b */
    public static final /* synthetic */ C7125c m22247b(C7121a aVar) {
        C7125c cVar = f20013i;
        if (cVar == null) {
            C7573i.m23583a("mainHandler");
        }
        return cVar;
    }

    /* renamed from: d */
    public static final /* synthetic */ ProcessType m22252d(C7121a aVar) {
        ProcessType processType = f20007c;
        if (processType == null) {
            C7573i.m23583a("currentProcess");
        }
        return processType;
    }

    /* renamed from: a */
    public static void m22244a(long j) {
        f20006b = j;
    }

    /* renamed from: b */
    public static <T> T m22249b(Class<? extends LegoInflate> cls) {
        C7573i.m23587b(cls, "name");
        return f20011g.mo18572a(cls);
    }

    /* renamed from: a */
    public static void m22245a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        f20011g.mo18573a(activity);
    }

    /* renamed from: a */
    public static void m22246a(LegoTask legoTask) {
        C7573i.m23587b(legoTask, "task");
        f20008d.mo18601a(legoTask);
    }

    /* renamed from: a */
    public final C7121a mo18542a(Class<? extends LegoInflate> cls, LegoInflate legoInflate) {
        C7573i.m23587b(cls, "name");
        C7573i.m23587b(legoInflate, "inflate");
        f20011g.mo18575a(cls, legoInflate);
        return this;
    }

    /* renamed from: a */
    public final C7121a mo18543a(Class<? extends LegoService> cls, LegoService legoService) {
        C7573i.m23587b(cls, "name");
        C7573i.m23587b(legoService, "service");
        f20010f.mo18593a(cls, legoService);
        return this;
    }

    /* renamed from: a */
    public final void mo18544a(Application application, C7153e eVar) {
        ProcessType processType;
        C7573i.m23587b(application, "context");
        Context context = application;
        f20012h = context;
        f20015k = eVar;
        if (C7150a.m22314a(context)) {
            processType = ProcessType.MAIN;
        } else {
            processType = ProcessType.SUB;
        }
        f20007c = processType;
        C7125c cVar = new C7125c();
        f20013i = cVar;
        cVar.mo18549a(1205, C40413c.f105051b);
        f20008d.mo18600a(context);
        f20009e.mo18585a(context);
        f20010f.mo18591a(context);
        f20011g.mo18574a(context);
        m22267o();
    }
}
