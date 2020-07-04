package com.p280ss.android.ugc.aweme.shortvideo.upload.speedprobe;

import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.a */
public final class C41487a {

    /* renamed from: c */
    public static final C41488a f107898c = new C41488a(null);

    /* renamed from: a */
    public long f107899a;

    /* renamed from: b */
    public final boolean f107900b = false;

    /* renamed from: d */
    private final int f107901d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.a$a */
    public static final class C41488a {
        private C41488a() {
        }

        public /* synthetic */ C41488a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.a$b */
    static final class C41489b extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41487a f107902a;

        /* renamed from: b */
        final /* synthetic */ int f107903b;

        /* renamed from: c */
        final /* synthetic */ long f107904c;

        C41489b(C41487a aVar, int i, long j) {
            this.f107902a = aVar;
            this.f107903b = i;
            this.f107904c = j;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo102147a());
        }

        /* renamed from: a */
        public final boolean mo102147a() {
            if (this.f107904c - this.f107902a.f107899a > ((long) this.f107903b)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.a$c */
    static final class C41490c extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41487a f107905a;

        /* renamed from: b */
        final /* synthetic */ long f107906b;

        C41490c(C41487a aVar, long j) {
            this.f107905a = aVar;
            this.f107906b = j;
            super(0);
        }

        /* renamed from: a */
        public final boolean mo102148a() {
            if (this.f107905a.f107900b) {
                this.f107905a.f107899a = this.f107906b;
            }
            return true;
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(mo102148a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.speedprobe.a$d */
    static final class C41491d extends Lambda implements C7562b<Boolean, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C41487a f107907a;

        /* renamed from: b */
        final /* synthetic */ long f107908b;

        /* renamed from: c */
        final /* synthetic */ int f107909c;

        C41491d(C41487a aVar, long j, int i) {
            this.f107907a = aVar;
            this.f107908b = j;
            this.f107909c = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Boolean) obj).booleanValue();
            return C7581n.f20898a;
        }
    }

    /* renamed from: a */
    public final void mo102145a() {
        this.f107899a = System.currentTimeMillis();
    }

    /* renamed from: a */
    public final boolean mo102146a(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        C41489b bVar = new C41489b(this, i, currentTimeMillis);
        C41490c cVar = new C41490c(this, currentTimeMillis);
        new C41491d(this, currentTimeMillis, i);
        if (bVar.mo102147a()) {
            return cVar.mo102148a();
        }
        return false;
    }

    public C41487a(int i, boolean z) {
        this.f107901d = i;
    }
}
