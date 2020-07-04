package com.p280ss.android.ugc.asve.context;

import com.bef.effectsdk.C1942b;
import com.p280ss.android.ugc.asve.C15395c;
import com.p280ss.android.ugc.asve.IASPathAdaptor;
import com.p280ss.android.ugc.asve.constant.ASMonitorServerLocation;
import com.p280ss.android.ugc.asve.recorder.C20675b;
import com.p280ss.android.vesdk.C45321i;
import com.p280ss.android.vesdk.VEListener.C45206b;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.context.e */
public interface C15426e {

    /* renamed from: com.ss.android.ugc.asve.context.e$a */
    public static final class C15427a {
        /* renamed from: b */
        public static String m45140b(C15426e eVar) {
            return "";
        }

        /* renamed from: a */
        public static ExecutorService m45139a(C15426e eVar) {
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
            C7573i.m23582a((Object) newCachedThreadPool, "Executors.newCachedThreadPool()");
            return newCachedThreadPool;
        }
    }

    /* renamed from: A */
    boolean mo38943A();

    /* renamed from: a */
    ExecutorService mo38944a();

    /* renamed from: b */
    C15395c mo38945b();

    /* renamed from: c */
    IASPathAdaptor mo38946c();

    /* renamed from: d */
    C20675b mo38947d();

    /* renamed from: e */
    C45206b mo38948e();

    /* renamed from: f */
    C1942b mo38949f();

    /* renamed from: g */
    String mo38950g();

    /* renamed from: h */
    boolean mo38951h();

    /* renamed from: i */
    ASMonitorServerLocation mo38952i();

    /* renamed from: j */
    boolean mo38953j();

    /* renamed from: k */
    boolean mo38954k();

    /* renamed from: l */
    File mo38955l();

    /* renamed from: m */
    int mo38956m();

    /* renamed from: n */
    boolean mo38957n();

    /* renamed from: o */
    int mo38958o();

    /* renamed from: p */
    boolean mo38959p();

    /* renamed from: q */
    File mo38960q();

    /* renamed from: r */
    boolean mo38961r();

    /* renamed from: s */
    boolean mo38962s();

    /* renamed from: t */
    int mo38963t();

    /* renamed from: u */
    boolean mo38964u();

    /* renamed from: v */
    int mo38965v();

    /* renamed from: w */
    boolean mo38966w();

    /* renamed from: x */
    C45321i mo38967x();

    /* renamed from: y */
    PreviewSize mo38968y();

    /* renamed from: z */
    String mo38969z();
}
