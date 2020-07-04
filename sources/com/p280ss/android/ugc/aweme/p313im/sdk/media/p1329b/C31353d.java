package com.p280ss.android.ugc.aweme.p313im.sdk.media.p1329b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileParam;
import com.p280ss.android.ugc.aweme.services.video.IImVideoCompileService.CompileResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.d */
public final class C31353d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f82138a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31353d.class), "taskQueue", "getTaskQueue()Ljava/util/List;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C31353d.class), "handler", "getHandler()Lcom/ss/android/ugc/aweme/im/sdk/media/utils/VideoCompileHelper$handler$2$1;"))};

    /* renamed from: b */
    public static final C31353d f82139b = new C31353d();

    /* renamed from: c */
    private static C31344a f82140c;

    /* renamed from: d */
    private static final C7541d f82141d = C7546e.m23569a(C31358d.f82146a);

    /* renamed from: e */
    private static final C7541d f82142e = C7546e.m23569a(C31356c.f82145a);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.d$a */
    static final class C31354a<T> implements C7326g<CompileResult> {

        /* renamed from: a */
        final /* synthetic */ C31344a f82143a;

        C31354a(C31344a aVar) {
            this.f82143a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(CompileResult compileResult) {
            StringBuilder sb = new StringBuilder("VideoCompileHelper compileVideoInternal success: ");
            sb.append(compileResult);
            C6921a.m21555a(sb.toString());
            C31353d.f82139b.mo81924a();
            this.f82143a.f82129b.invoke(compileResult);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.d$b */
    static final class C31355b<T> implements C7326g<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C31344a f82144a;

        C31355b(C31344a aVar) {
            this.f82144a = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Throwable th) {
            C6921a.m21559a(th);
            C31353d.f82139b.mo81924a();
            this.f82144a.f82129b.invoke(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.d$c */
    static final class C31356c extends Lambda implements C7561a<C313571> {

        /* renamed from: a */
        public static final C31356c f82145a = new C31356c();

        C31356c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m102078a();
        }

        /* renamed from: a */
        private static C313571 m102078a() {
            return new Handler(Looper.getMainLooper()) {
                public final void handleMessage(Message message) {
                    Object obj;
                    if (message != null) {
                        obj = message.obj;
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof C31344a)) {
                        obj = null;
                    }
                    C31344a aVar = (C31344a) obj;
                    if (aVar != null) {
                        C31353d.m102071a(aVar);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.b.d$d */
    static final class C31358d extends Lambda implements C7561a<List<C31344a>> {

        /* renamed from: a */
        public static final C31358d f82146a = new C31358d();

        C31358d() {
            super(0);
        }

        /* renamed from: a */
        private static List<C31344a> m102079a() {
            return new ArrayList<>();
        }

        public final /* synthetic */ Object invoke() {
            return m102079a();
        }
    }

    private C31353d() {
    }

    /* renamed from: b */
    private final List<C31344a> m102073b() {
        return (List) f82141d.getValue();
    }

    /* renamed from: c */
    private final C313571 m102074c() {
        return (C313571) f82142e.getValue();
    }

    /* renamed from: a */
    public final void mo81924a() {
        synchronized (this) {
            f82140c = null;
            if (!f82139b.m102073b().isEmpty()) {
                f82140c = (C31344a) f82139b.m102073b().remove(0);
                C313571 c = f82139b.m102074c();
                Message obtain = Message.obtain();
                obtain.obj = f82140c;
                c.sendMessage(obtain);
            }
        }
    }

    /* renamed from: a */
    public static void m102071a(C31344a aVar) {
        IImVideoCompileService iImVideoCompileService;
        IAVService iAVService = (IAVService) ServiceManager.get().getService(IAVService.class);
        if (iAVService != null) {
            iImVideoCompileService = iAVService.getImVideoCompileService();
        } else {
            iImVideoCompileService = null;
        }
        if (iImVideoCompileService == null) {
            C6921a.m21555a("VideoCompileHelper compileVideoInternal service null");
            aVar.f82129b.invoke(null);
        }
        StringBuilder sb = new StringBuilder("VideoCompileHelper compileVideoInternal start: ");
        sb.append(aVar.f82128a);
        C6921a.m21555a(sb.toString());
        if (iImVideoCompileService == null) {
            C7573i.m23580a();
        }
        iImVideoCompileService.compileImVideo(aVar.f82128a).mo19304b(C7333a.m23044b()).mo19280a((C7326g<? super T>) new C31354a<Object>(aVar), (C7326g<? super Throwable>) new C31355b<Object>(aVar));
    }

    /* renamed from: a */
    public static final void m102072a(CompileParam compileParam, C7562b<? super CompileResult, C7581n> bVar) {
        C7573i.m23587b(compileParam, "compileParam");
        C7573i.m23587b(bVar, "callback");
        synchronized (f82139b) {
            f82139b.m102073b().add(new C31344a(compileParam, bVar));
            if (f82140c == null) {
                f82139b.mo81924a();
            }
        }
    }
}
