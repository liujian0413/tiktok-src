package com.bytedance.jedi.model.p608h;

import android.os.Environment;
import android.os.HandlerThread;
import com.bytedance.jedi.model.p605g.C11847a;
import com.bytedance.jedi.model.p605g.C11848b;
import com.bytedance.jedi.model.p608h.C11939e.C11941a;
import com.p049a.p050a.C1643a;
import com.p049a.p050a.C1644b;
import com.p049a.p050a.C1647e;
import java.io.File;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.jedi.model.h.k */
public final class C11961k implements C11936c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31869a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11961k.class), "defaultFormatStrategy", "getDefaultFormatStrategy()Lcom/bytedance/jedi/model/util/JediFormatStrategy;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11961k.class), "utFormatStrategy", "getUtFormatStrategy()Lcom/orhanobut/logger/FormatStrategy;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11961k.class), "executor", "getExecutor()Ljava/util/concurrent/Executor;"))};

    /* renamed from: b */
    public static final C11961k f31870b = new C11961k();

    /* renamed from: c */
    private static boolean f31871c = false;

    /* renamed from: d */
    private static boolean f31872d = false;

    /* renamed from: e */
    private static String f31873e = "REPO_SYNC";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int f31874f = f31874f;

    /* renamed from: g */
    private static final C7541d f31875g = C7546e.m23569a(C11963b.f31879a);

    /* renamed from: h */
    private static final C7541d f31876h = C7546e.m23569a(C11966e.f31886a);

    /* renamed from: i */
    private static C1644b f31877i = new C11962a();

    /* renamed from: j */
    private static final C7541d f31878j = C7546e.m23569a(C11964c.f31880a);

    /* renamed from: com.bytedance.jedi.model.h.k$a */
    public static final class C11962a implements C1644b {
        C11962a() {
        }

        /* renamed from: a */
        public final boolean mo7034a(int i, String str) {
            return C11942f.m34996a();
        }

        /* renamed from: a */
        public final void mo7033a(int i, String str, String str2) {
            C1643a aVar;
            C7573i.m23587b(str2, "message");
            if (C11961k.m35042a()) {
                aVar = C11961k.f31870b.mo29571e();
            } else {
                C11939e d = C11961k.f31870b.mo29570d();
                C7573i.m23582a((Object) d, "defaultFormatStrategy");
                aVar = d;
            }
            aVar.mo7032a(i, str, str2);
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.k$b */
    static final class C11963b extends Lambda implements C7561a<C11939e> {

        /* renamed from: a */
        public static final C11963b f31879a = new C11963b();

        C11963b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m35051a();
        }

        /* renamed from: a */
        private static C11939e m35051a() {
            C11941a a = C11939e.m34983a().mo29550a(C11961k.m35044c());
            if (C11961k.m35043b()) {
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                C7573i.m23582a((Object) externalStorageDirectory, "Environment.getExternalStorageDirectory()");
                String absolutePath = externalStorageDirectory.getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append(absolutePath);
                sb.append(File.separatorChar);
                sb.append("logger");
                String sb2 = sb.toString();
                StringBuilder sb3 = new StringBuilder("AndroidFileLogger.");
                sb3.append(sb2);
                HandlerThread handlerThread = new HandlerThread(sb3.toString());
                handlerThread.start();
                a.f31820a = new C11937d(new C11938a(handlerThread.getLooper(), sb2, C11961k.f31874f));
            }
            return a.mo29551a();
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.k$c */
    static final class C11964c extends Lambda implements C7561a<C11957j> {

        /* renamed from: a */
        public static final C11964c f31880a = new C11964c();

        C11964c() {
            super(0);
        }

        /* renamed from: a */
        private static C11957j m35052a() {
            return new C11957j();
        }

        public final /* synthetic */ Object invoke() {
            return m35052a();
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.k$d */
    static final class C11965d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11848b f31881a;

        /* renamed from: b */
        final /* synthetic */ long f31882b;

        /* renamed from: c */
        final /* synthetic */ long f31883c;

        /* renamed from: d */
        final /* synthetic */ Pair f31884d;

        /* renamed from: e */
        final /* synthetic */ C11847a f31885e;

        C11965d(C11848b bVar, long j, long j2, Pair pair, C11847a aVar) {
            this.f31881a = bVar;
            this.f31882b = j;
            this.f31883c = j2;
            this.f31884d = pair;
            this.f31885e = aVar;
        }

        public final void run() {
            Object a = this.f31881a.mo29376a();
            Object obj = null;
            if (!(a instanceof Pair)) {
                a = null;
            }
            Pair pair = (Pair) a;
            if (pair != null) {
                obj = pair.getSecond();
            }
            StringBuilder sb = new StringBuilder("[time：");
            sb.append(this.f31882b);
            sb.append(']');
            sb.append("[dur：");
            sb.append(this.f31883c);
            sb.append(']');
            sb.append("[from：");
            sb.append(this.f31884d);
            sb.append(']');
            sb.append("[to：");
            sb.append(this.f31885e);
            sb.append(']');
            sb.append("[size: ");
            sb.append(C11944g.m35000a(obj)[1]);
            sb.append('/');
            sb.append(C11944g.m35000a(obj)[0]);
            sb.append(']');
            sb.append("[content：");
            sb.append(C11968l.m35055a(obj));
            sb.append(']');
            C1647e.m8042a(sb.toString(), new Object[0]);
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.k$e */
    static final class C11966e extends Lambda implements C7561a<C1643a> {

        /* renamed from: a */
        public static final C11966e f31886a = new C11966e();

        C11966e() {
            super(0);
        }

        /* renamed from: a */
        private static C1643a m35053a() {
            return C119671.f31887a;
        }

        public final /* synthetic */ Object invoke() {
            return m35053a();
        }
    }

    private C11961k() {
    }

    /* renamed from: b */
    public static boolean m35043b() {
        return f31872d;
    }

    /* renamed from: c */
    public static String m35044c() {
        return f31873e;
    }

    /* renamed from: f */
    private final Executor m35045f() {
        return (Executor) f31878j.getValue();
    }

    /* renamed from: d */
    public final C11939e mo29570d() {
        return (C11939e) f31875g.getValue();
    }

    /* renamed from: e */
    public final C1643a mo29571e() {
        return (C1643a) f31876h.getValue();
    }

    /* renamed from: a */
    public static boolean m35042a() {
        return f31871c;
    }

    static {
        C1647e.m8041a(f31877i);
    }

    /* renamed from: a */
    public final void mo29548a(C11847a<?> aVar, C11848b<?> bVar) {
        long j;
        C7573i.m23587b(aVar, "tracePoint");
        C7573i.m23587b(bVar, "traceable");
        long currentTimeMillis = System.currentTimeMillis();
        Pair b = bVar.mo29378b();
        if (b != null) {
            Long l = (Long) b.getSecond();
            if (l != null) {
                j = l.longValue();
                long j2 = currentTimeMillis - j;
                Executor f = m35045f();
                C11965d dVar = new C11965d(bVar, currentTimeMillis, j2, b, aVar);
                f.execute(dVar);
            }
        }
        j = currentTimeMillis;
        long j22 = currentTimeMillis - j;
        Executor f2 = m35045f();
        C11965d dVar2 = new C11965d(bVar, currentTimeMillis, j22, b, aVar);
        f2.execute(dVar2);
    }
}
