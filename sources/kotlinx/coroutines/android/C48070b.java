package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.C7581n;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7551d;
import kotlinx.coroutines.C48066am;
import kotlinx.coroutines.C48081at;
import kotlinx.coroutines.C48187j;

/* renamed from: kotlinx.coroutines.android.b */
public final class C48070b extends C48074c implements C48066am {
    private volatile C48070b _immediate;

    /* renamed from: b */
    public final C48070b f122917b;

    /* renamed from: c */
    public final Handler f122918c;

    /* renamed from: d */
    private final String f122919d;

    /* renamed from: e */
    private final boolean f122920e;

    /* renamed from: kotlinx.coroutines.android.b$a */
    public static final class C48071a implements C48081at {

        /* renamed from: a */
        final /* synthetic */ C48070b f122921a;

        /* renamed from: b */
        final /* synthetic */ Runnable f122922b;

        /* renamed from: a */
        public final void mo120281a() {
            this.f122921a.f122918c.removeCallbacks(this.f122922b);
        }

        C48071a(C48070b bVar, Runnable runnable) {
            this.f122921a = bVar;
            this.f122922b = runnable;
        }
    }

    /* renamed from: kotlinx.coroutines.android.b$b */
    public static final class C48072b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C48070b f122923a;

        /* renamed from: b */
        final /* synthetic */ C48187j f122924b;

        public C48072b(C48070b bVar, C48187j jVar) {
            this.f122923a = bVar;
            this.f122924b = jVar;
        }

        public final void run() {
            this.f122924b.mo120405a(this.f122923a, C7581n.f20898a);
        }
    }

    /* renamed from: kotlinx.coroutines.android.b$c */
    static final class C48073c extends Lambda implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C48070b f122925a;

        /* renamed from: b */
        final /* synthetic */ Runnable f122926b;

        C48073c(C48070b bVar, Runnable runnable) {
            this.f122925a = bVar;
            this.f122926b = runnable;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m149049a((Throwable) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m149049a(Throwable th) {
            this.f122925a.f122918c.removeCallbacks(this.f122926b);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.f122918c);
    }

    public final String toString() {
        if (this.f122919d == null) {
            String handler = this.f122918c.toString();
            C7573i.m23582a((Object) handler, "handler.toString()");
            return handler;
        } else if (!this.f122920e) {
            return this.f122919d;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f122919d);
            sb.append(" [immediate]");
            return sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C48070b) || ((C48070b) obj).f122918c != this.f122918c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo83490a(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        if (!this.f122920e || (!C7573i.m23585a((Object) Looper.myLooper(), (Object) this.f122918c.getLooper()))) {
            return true;
        }
        return false;
    }

    public C48070b(Handler handler, String str) {
        C7573i.m23587b(handler, "handler");
        this(handler, str, false);
    }

    /* renamed from: a */
    public final void mo83489a(C47924e eVar, Runnable runnable) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(runnable, "block");
        this.f122918c.post(runnable);
    }

    /* renamed from: a */
    public final C48081at mo120266a(long j, Runnable runnable) {
        C7573i.m23587b(runnable, "block");
        this.f122918c.postDelayed(runnable, C7551d.m23564b(j, 4611686018427387903L));
        return new C48071a(this, runnable);
    }

    /* renamed from: a */
    public final void mo120274a(long j, C48187j<? super C7581n> jVar) {
        C7573i.m23587b(jVar, "continuation");
        Runnable bVar = new C48072b(this, jVar);
        this.f122918c.postDelayed(bVar, C7551d.m23564b(j, 4611686018427387903L));
        jVar.mo120404a(new C48073c(this, bVar));
    }

    private C48070b(Handler handler, String str, boolean z) {
        C48070b bVar = null;
        super(null);
        this.f122918c = handler;
        this.f122919d = str;
        this.f122920e = z;
        if (this.f122920e) {
            bVar = this;
        }
        this._immediate = bVar;
        C48070b bVar2 = this._immediate;
        if (bVar2 == null) {
            bVar2 = new C48070b(this.f122918c, this.f122919d, true);
            this._immediate = bVar2;
        }
        this.f122917b = bVar2;
    }
}
