package com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay;

import android.content.Context;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.p313im.sdk.videofileplay.C31942b.C31943a;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c */
public final class C31944c implements C31943a {

    /* renamed from: d */
    public static int f83449d;

    /* renamed from: e */
    public static final C31945a f83450e = new C31945a(null);

    /* renamed from: a */
    public C31942b f83451a;

    /* renamed from: b */
    public C31946b f83452b;

    /* renamed from: c */
    public final Context f83453c;

    /* renamed from: f */
    private HandlerThread f83454f;

    /* renamed from: g */
    private boolean f83455g;

    /* renamed from: h */
    private final boolean f83456h;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$a */
    public static final class C31945a {
        private C31945a() {
        }

        public /* synthetic */ C31945a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$b */
    public interface C31946b {
        /* renamed from: a */
        void mo82079a(boolean z);

        /* renamed from: b */
        void mo82080b(String str);

        /* renamed from: l */
        void mo82084l();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$c */
    static final class C31947c extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83457a;

        C31947c(C31944c cVar) {
            this.f83457a = cVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$d */
    static final class C31948d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83458a;

        /* renamed from: b */
        final /* synthetic */ String f83459b;

        C31948d(C31944c cVar, String str) {
            this.f83458a = cVar;
            this.f83459b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103790a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103790a() {
            C31946b bVar = this.f83458a.f83452b;
            if (bVar != null) {
                bVar.mo82080b(this.f83459b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$e */
    static final class C31949e extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83460a;

        /* renamed from: b */
        final /* synthetic */ int f83461b;

        C31949e(C31944c cVar, int i) {
            this.f83460a = cVar;
            this.f83461b = i;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$f */
    static final class C31950f extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83462a;

        C31950f(C31944c cVar) {
            this.f83462a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103791a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103791a() {
            C31946b bVar = this.f83462a.f83452b;
            if (bVar != null) {
                bVar.mo82079a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$g */
    static final class C31951g extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83463a;

        C31951g(C31944c cVar) {
            this.f83463a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103792a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103792a() {
            C31946b bVar = this.f83463a.f83452b;
            if (bVar != null) {
                bVar.mo82079a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$h */
    static final class C31952h extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83464a;

        C31952h(C31944c cVar) {
            this.f83464a = cVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$i */
    static final class C31953i extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83465a;

        C31953i(C31944c cVar) {
            this.f83465a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103793a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103793a() {
            C31946b bVar = this.f83465a.f83452b;
            if (bVar != null) {
                bVar.mo82084l();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$j */
    static final class C31954j extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83466a;

        C31954j(C31944c cVar) {
            this.f83466a = cVar;
            super(0);
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$k */
    static final class C31955k extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83467a;

        C31955k(C31944c cVar) {
            this.f83467a = cVar;
            super(0);
        }

        /* renamed from: a */
        private void m103794a() {
            this.f83467a.f83451a.mo82768b();
        }

        public final /* synthetic */ Object invoke() {
            m103794a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$l */
    static final class C31956l extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83468a;

        C31956l(C31944c cVar) {
            this.f83468a = cVar;
            super(0);
        }

        /* renamed from: a */
        private void m103795a() {
            this.f83468a.f83451a.mo82764a();
        }

        public final /* synthetic */ Object invoke() {
            m103795a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$m */
    static final class C31957m extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83469a;

        C31957m(C31944c cVar) {
            this.f83469a = cVar;
            super(0);
        }

        /* renamed from: a */
        private void m103796a() {
            this.f83469a.f83451a.mo82772d();
        }

        public final /* synthetic */ Object invoke() {
            m103796a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$n */
    static final class C31958n extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83470a;

        /* renamed from: b */
        final /* synthetic */ String f83471b;

        C31958n(C31944c cVar, String str) {
            this.f83470a = cVar;
            this.f83471b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103797a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103797a() {
            this.f83470a.f83451a.mo82767a(this.f83471b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$o */
    static final class C31959o extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83472a;

        /* renamed from: b */
        final /* synthetic */ String f83473b;

        C31959o(C31944c cVar, String str) {
            this.f83472a = cVar;
            this.f83473b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103798a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103798a() {
            this.f83472a.f83451a.mo82769b(this.f83473b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$p */
    static final class C31960p extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83474a;

        /* renamed from: b */
        final /* synthetic */ String f83475b;

        C31960p(C31944c cVar, String str) {
            this.f83474a = cVar;
            this.f83475b = str;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103799a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103799a() {
            this.f83474a.f83451a.mo82771c(this.f83475b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$q */
    static final class C31961q extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83476a;

        /* renamed from: b */
        final /* synthetic */ Surface f83477b;

        C31961q(C31944c cVar, Surface surface) {
            this.f83476a = cVar;
            this.f83477b = surface;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m103800a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m103800a() {
            this.f83476a.f83451a.mo82765a(this.f83477b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$r */
    static final class C31962r extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C31944c f83478a;

        C31962r(C31944c cVar) {
            this.f83478a = cVar;
            super(0);
        }

        /* renamed from: a */
        private void m103801a() {
            this.f83478a.f83451a.mo82770c();
        }

        public final /* synthetic */ Object invoke() {
            m103801a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.c$s */
    static final class C31963s<V> implements Callable<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C7561a f83479a;

        C31963s(C7561a aVar) {
            this.f83479a = aVar;
        }

        /* renamed from: a */
        private boolean m103802a() {
            this.f83479a.invoke();
            return true;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m103802a());
        }
    }

    /* renamed from: e */
    public final boolean mo82791e() {
        return this.f83451a.mo82773e();
    }

    /* renamed from: c */
    public final void mo82787c() {
        if (this.f83456h) {
            this.f83451a.mo82770c();
        } else {
            m103768a((C7561a<C7581n>) new C31962r<C7581n>(this));
        }
    }

    /* renamed from: d */
    public final void mo82789d() {
        if (this.f83456h) {
            this.f83451a.mo82772d();
        } else {
            m103768a((C7561a<C7581n>) new C31957m<C7581n>(this));
        }
    }

    /* renamed from: a */
    public final void mo82782a() {
        this.f83455g = false;
        if (this.f83456h) {
            this.f83451a.mo82764a();
        } else {
            m103768a((C7561a<C7581n>) new C31956l<C7581n>(this));
        }
    }

    /* renamed from: b */
    public final void mo82785b() {
        if (mo82791e()) {
            this.f83455g = false;
            if (this.f83456h) {
                this.f83451a.mo82768b();
            } else {
                m103768a((C7561a<C7581n>) new C31955k<C7581n>(this));
            }
        } else {
            this.f83455g = true;
        }
    }

    /* renamed from: a */
    public final void mo82784a(C31946b bVar) {
        C7573i.m23587b(bVar, "listener");
        this.f83452b = bVar;
    }

    /* renamed from: b */
    private static void m103769b(C7561a<C7581n> aVar) {
        C1592h.m7855a((Callable<TResult>) new C31963s<TResult>(aVar), C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo82775a(C31942b bVar) {
        m103769b((C7561a<C7581n>) new C31952h<C7581n>(this));
    }

    /* renamed from: c */
    public final void mo82780c(C31942b bVar) {
        m103769b((C7561a<C7581n>) new C31954j<C7581n>(this));
    }

    /* renamed from: d */
    public final void mo82781d(C31942b bVar) {
        m103769b((C7561a<C7581n>) new C31947c<C7581n>(this));
    }

    /* renamed from: a */
    private final void m103768a(C7561a<C7581n> aVar) {
        Looper looper;
        HandlerThread handlerThread = this.f83454f;
        if (handlerThread != null) {
            looper = handlerThread.getLooper();
        } else {
            looper = null;
        }
        if (looper != null) {
            C1592h.m7859b((Callable<TResult>) new C31964d<TResult>(aVar));
        } else {
            m103769b(aVar);
        }
    }

    /* renamed from: b */
    public final void mo82778b(C31942b bVar) {
        m103769b((C7561a<C7581n>) new C31953i<C7581n>(this));
    }

    /* renamed from: c */
    public final void mo82788c(String str) {
        if (this.f83456h) {
            this.f83451a.mo82769b(str);
        } else {
            m103768a((C7561a<C7581n>) new C31959o<C7581n>(this, str));
        }
    }

    /* renamed from: d */
    public final void mo82790d(String str) {
        if (this.f83456h) {
            this.f83451a.mo82771c(str);
        } else {
            m103768a((C7561a<C7581n>) new C31960p<C7581n>(this, str));
        }
    }

    /* renamed from: a */
    public final void mo82783a(Surface surface) {
        if (this.f83456h) {
            this.f83451a.mo82765a(surface);
        } else {
            m103768a((C7561a<C7581n>) new C31961q<C7581n>(this, surface));
        }
    }

    /* renamed from: b */
    public final void mo82786b(String str) {
        if (this.f83456h) {
            this.f83451a.mo82767a(str);
        } else {
            m103768a((C7561a<C7581n>) new C31958n<C7581n>(this, str));
        }
    }

    /* renamed from: a */
    public final void mo82777a(String str) {
        m103769b((C7561a<C7581n>) new C31948d<C7581n>(this, str));
    }

    private C31944c(Context context, boolean z) {
        C7573i.m23587b(context, "context");
        this.f83453c = context;
        this.f83456h = z;
        StringBuilder sb = new StringBuilder("video_player_thread");
        int i = f83449d;
        f83449d = i + 1;
        sb.append(i);
        this.f83454f = new HandlerThread(sb.toString(), 0);
        HandlerThread handlerThread = this.f83454f;
        if (handlerThread != null) {
            handlerThread.start();
        }
        this.f83451a = new C31942b(this.f83453c);
        this.f83451a.mo82766a((C31943a) this);
    }

    /* renamed from: b */
    public final void mo82779b(C31942b bVar, int i) {
        m103769b((C7561a<C7581n>) new C31949e<C7581n>(this, i));
    }

    /* renamed from: a */
    public final void mo82776a(C31942b bVar, int i) {
        if (i != 1) {
            m103769b((C7561a<C7581n>) new C31951g<C7581n>(this));
        } else if (this.f83455g) {
            mo82785b();
        } else {
            m103769b((C7561a<C7581n>) new C31950f<C7581n>(this));
        }
    }

    public /* synthetic */ C31944c(Context context, boolean z, int i, C7571f fVar) {
        this(context, false);
    }
}
