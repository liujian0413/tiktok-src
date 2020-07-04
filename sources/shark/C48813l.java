package shark;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7513am;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import shark.C48714c.C48718d;
import shark.C48714c.C48719e;
import shark.C48714c.C48720f;
import shark.C48714c.C48721g;
import shark.C48714c.C48722h;
import shark.C48714c.C48723i;
import shark.C48714c.C48725k;
import shark.C48714c.C48726l;
import shark.C48714c.C48727m;
import shark.C48747i.C48749b;
import shark.C48747i.C48752c;
import shark.C48747i.C48756d;
import shark.C48747i.C48757e;
import shark.C48823n.C48825b.C48828c;
import shark.C48823n.C48825b.C48828c.C48829a;
import shark.C48823n.C48825b.C48828c.C48829a.C48830a;
import shark.C48823n.C48825b.C48828c.C48829a.C48831b;
import shark.C48823n.C48825b.C48828c.C48833c;
import shark.C48823n.C48825b.C48828c.C48835e;
import shark.C48823n.C48825b.C48828c.C48837g;
import shark.internal.C48769c;
import shark.internal.C48771d;
import shark.internal.C48771d.C48773b;
import shark.internal.C48779e;
import shark.internal.C48779e.C48780a;
import shark.internal.C48779e.C48781b;
import shark.internal.C48779e.C48782c;
import shark.internal.C48779e.C48783d;
import shark.internal.C48788i;

/* renamed from: shark.l */
public final class C48813l implements C48746h {

    /* renamed from: c */
    public static final C48814a f124084c = new C48814a(null);

    /* renamed from: a */
    public final Hprof f124085a;

    /* renamed from: b */
    public final C48771d f124086b;

    /* renamed from: d */
    private final C48731d f124087d = new C48731d();

    /* renamed from: e */
    private final C48788i<Long, C48828c> f124088e = new C48788i<>(3000);

    /* renamed from: shark.l$a */
    public static final class C48814a {
        private C48814a() {
        }

        public /* synthetic */ C48814a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C48746h m150751a(Hprof hprof, C48860v vVar) {
            C7573i.m23587b(hprof, "hprof");
            return new C48813l(hprof, C48773b.m150649a(hprof, vVar, C7513am.m23410a((T[]) new C7584c[]{C7575l.m23595a(C48719e.class), C7575l.m23595a(C48718d.class), C7575l.m23595a(C48720f.class), C7575l.m23595a(C48722h.class), C7575l.m23595a(C48723i.class), C7575l.m23595a(C48725k.class), C7575l.m23595a(C48726l.class), C7575l.m23595a(C48727m.class), C7575l.m23595a(C48721g.class)})));
        }
    }

    /* renamed from: shark.l$b */
    static final class C48815b extends Lambda implements C7562b<Pair<? extends Long, ? extends C48781b>, C48752c> {

        /* renamed from: a */
        final /* synthetic */ C48813l f124089a;

        C48815b(C48813l lVar) {
            this.f124089a = lVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48752c invoke(Pair<Long, C48781b> pair) {
            C7573i.m23587b(pair, "it");
            C48781b bVar = (C48781b) pair.getSecond();
            C48752c cVar = new C48752c(this.f124089a, bVar, ((Number) pair.getFirst()).longValue(), this.f124089a.f124086b.f123972c.contains(Long.valueOf(bVar.f124003a)));
            return cVar;
        }
    }

    /* renamed from: shark.l$c */
    static final class C48816c extends Lambda implements C7562b<Pair<? extends Long, ? extends C48779e>, C48747i> {

        /* renamed from: a */
        final /* synthetic */ C48813l f124090a;

        C48816c(C48813l lVar) {
            this.f124090a = lVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48747i invoke(Pair<Long, ? extends C48779e> pair) {
            C7573i.m23587b(pair, "it");
            return this.f124090a.mo123587a((C48779e) pair.getSecond(), ((Number) pair.getFirst()).longValue());
        }
    }

    /* renamed from: shark.l$d */
    static final class C48817d extends Lambda implements C7561a<C48829a> {

        /* renamed from: a */
        final /* synthetic */ C48813l f124091a;

        C48817d(C48813l lVar) {
            this.f124091a = lVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48829a invoke() {
            return this.f124091a.f124085a.f123814a.mo123596b();
        }
    }

    /* renamed from: shark.l$e */
    static final class C48818e extends Lambda implements C7561a<C48833c> {

        /* renamed from: a */
        final /* synthetic */ C48813l f124092a;

        C48818e(C48813l lVar) {
            this.f124092a = lVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48833c invoke() {
            return this.f124092a.f124085a.f123814a.mo123594a();
        }
    }

    /* renamed from: shark.l$f */
    static final class C48819f extends Lambda implements C7561a<C48835e> {

        /* renamed from: a */
        final /* synthetic */ C48813l f124093a;

        C48819f(C48813l lVar) {
            this.f124093a = lVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48835e invoke() {
            return this.f124093a.f124085a.f123814a.mo123598d();
        }
    }

    /* renamed from: shark.l$g */
    static final class C48820g extends Lambda implements C7561a<C48837g> {

        /* renamed from: a */
        final /* synthetic */ C48813l f124094a;

        C48820g(C48813l lVar) {
            this.f124094a = lVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48837g invoke() {
            return this.f124094a.f124085a.f123814a.mo123597c();
        }
    }

    /* renamed from: b */
    public final C48731d mo123472b() {
        return this.f124087d;
    }

    /* renamed from: a */
    public final C48835e mo123591a(long j, C48782c cVar) {
        C7573i.m23587b(cVar, "indexedObject");
        return (C48835e) m150733a(j, cVar, new C48819f(this));
    }

    /* renamed from: a */
    public final C48837g mo123592a(long j, C48783d dVar) {
        C7573i.m23587b(dVar, "indexedObject");
        return (C48837g) m150733a(j, dVar, new C48820g(this));
    }

    /* renamed from: a */
    public final C48833c mo123590a(long j, C48781b bVar) {
        C7573i.m23587b(bVar, "indexedObject");
        return (C48833c) m150733a(j, bVar, new C48818e(this));
    }

    /* renamed from: a */
    public final int mo123469a() {
        return this.f124085a.f123814a.f124113b;
    }

    /* renamed from: c */
    public final List<C48714c> mo123474c() {
        return this.f124086b.f123971b;
    }

    /* renamed from: d */
    public final C7604g<C48747i> mo123475d() {
        return C7605h.m23659d(this.f124086b.mo123546b(), new C48816c(this));
    }

    /* renamed from: e */
    public final C7604g<C48752c> mo123476e() {
        return C7605h.m23659d(this.f124086b.mo123545a(), new C48815b(this));
    }

    /* renamed from: b */
    public final boolean mo123473b(long j) {
        return this.f124086b.mo123548c(j);
    }

    /* renamed from: c */
    public final String mo123593c(long j) {
        return this.f124086b.mo123543a(j);
    }

    /* renamed from: a */
    public final C48749b mo123470a(String str) {
        C7573i.m23587b(str, "className");
        Long a = this.f124086b.mo123542a(str);
        if (a == null) {
            return null;
        }
        C48747i a2 = mo123471a(a.longValue());
        if (a2 != null) {
            return (C48749b) a2;
        }
        throw new TypeCastException("null cannot be cast to non-null type shark.HeapObject.HeapClass");
    }

    /* renamed from: a */
    public final C48747i mo123471a(long j) {
        return mo123587a(this.f124086b.mo123547b(j), j);
    }

    /* renamed from: a */
    public final C48769c mo123588a(C48833c cVar) {
        C7573i.m23587b(cVar, "record");
        return new C48769c(cVar, mo123469a());
    }

    /* renamed from: a */
    public final String mo123585a(long j, C48830a aVar) {
        C7573i.m23587b(aVar, "fieldRecord");
        return this.f124086b.mo123544a(j, aVar.f124130a);
    }

    /* renamed from: a */
    public final String mo123586a(long j, C48831b bVar) {
        C7573i.m23587b(bVar, "fieldRecord");
        return this.f124086b.mo123544a(j, bVar.f124132a);
    }

    public C48813l(Hprof hprof, C48771d dVar) {
        C7573i.m23587b(hprof, "hprof");
        C7573i.m23587b(dVar, "index");
        this.f124085a = hprof;
        this.f124086b = dVar;
    }

    /* renamed from: a */
    public final C48747i mo123587a(C48779e eVar, long j) {
        if (eVar instanceof C48780a) {
            return new C48749b(this, (C48780a) eVar, j);
        }
        if (eVar instanceof C48781b) {
            C48781b bVar = (C48781b) eVar;
            C48752c cVar = new C48752c(this, bVar, j, this.f124086b.f123972c.contains(Long.valueOf(bVar.f124003a)));
            return cVar;
        } else if (eVar instanceof C48782c) {
            C48782c cVar2 = (C48782c) eVar;
            C48756d dVar = new C48756d(this, cVar2, j, this.f124086b.f123972c.contains(Long.valueOf(cVar2.f124005a)));
            return dVar;
        } else if (eVar instanceof C48783d) {
            return new C48757e(this, (C48783d) eVar, j);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: a */
    public final C48829a mo123589a(long j, C48780a aVar) {
        C7573i.m23587b(aVar, "indexedObject");
        return (C48829a) m150733a(j, aVar, new C48817d(this));
    }

    /* renamed from: a */
    private final <T extends C48828c> T m150733a(long j, C48779e eVar, C7561a<? extends T> aVar) {
        T t = (C48828c) this.f124088e.mo123553a(Long.valueOf(j));
        if (t != null) {
            return t;
        }
        this.f124085a.mo123383a(eVar.mo123551a());
        T t2 = (C48828c) aVar.invoke();
        this.f124088e.mo123554a(Long.valueOf(j), t2);
        return t2;
    }
}
