package shark.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7513am;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref.IntRef;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import kotlin.text.C7634n;
import shark.C48714c;
import shark.C48821m;
import shark.C48823n;
import shark.C48823n.C48825b.C48826a;
import shark.C48823n.C48825b.C48828c.C48832b;
import shark.C48823n.C48825b.C48828c.C48834d;
import shark.C48823n.C48825b.C48828c.C48836f;
import shark.C48823n.C48825b.C48828c.C48846h;
import shark.C48823n.C48847c;
import shark.C48823n.C48850f;
import shark.C48858u;
import shark.C48860v;
import shark.Hprof;
import shark.PrimitiveType;
import shark.internal.C48779e.C48780a;
import shark.internal.C48779e.C48781b;
import shark.internal.C48779e.C48782c;
import shark.internal.C48779e.C48783d;
import shark.internal.C48808n.C48809a;
import shark.internal.p1903b.C48764b;
import shark.internal.p1903b.C48766c;

/* renamed from: shark.internal.d */
public final class C48771d {

    /* renamed from: d */
    public static final Set<String> f123968d;

    /* renamed from: e */
    public static final C48773b f123969e = new C48773b(null);

    /* renamed from: a */
    public final int f123970a;

    /* renamed from: b */
    public final List<C48714c> f123971b;

    /* renamed from: c */
    public final Set<Long> f123972c;

    /* renamed from: f */
    private final C48766c<String> f123973f;

    /* renamed from: g */
    private final C48764b f123974g;

    /* renamed from: h */
    private final C48805l f123975h;

    /* renamed from: i */
    private final C48805l f123976i;

    /* renamed from: j */
    private final C48805l f123977j;

    /* renamed from: k */
    private final C48805l f123978k;

    /* renamed from: l */
    private final C48860v f123979l;

    /* renamed from: shark.internal.d$a */
    static final class C48772a implements C48858u {

        /* renamed from: b */
        private final int f123980b;

        /* renamed from: c */
        private final int f123981c;

        /* renamed from: d */
        private final C48766c<String> f123982d;

        /* renamed from: e */
        private final C48764b f123983e;

        /* renamed from: f */
        private final C48808n f123984f;

        /* renamed from: g */
        private final C48808n f123985g;

        /* renamed from: h */
        private final C48808n f123986h;

        /* renamed from: i */
        private final C48808n f123987i;

        /* renamed from: j */
        private final Set<Long> f123988j;

        /* renamed from: k */
        private final Set<Long> f123989k;

        /* renamed from: l */
        private final List<C48714c> f123990l;

        /* renamed from: m */
        private final Set<C7584c<? extends C48714c>> f123991m;

        /* renamed from: a */
        public final C48771d mo123549a(C48860v vVar) {
            C48805l a = this.f123985g.mo123569a();
            C48805l a2 = this.f123986h.mo123569a();
            C48805l a3 = this.f123987i.mo123569a();
            C48771d dVar = new C48771d(this.f123981c, this.f123982d, this.f123983e, this.f123984f.mo123569a(), a, a2, a3, this.f123990l, vVar, this.f123988j, null);
            return dVar;
        }

        /* renamed from: a */
        public final void mo123550a(long j, C48823n nVar) {
            C7573i.m23587b(nVar, "record");
            if (nVar instanceof C48850f) {
                C48850f fVar = (C48850f) nVar;
                if (C48771d.f123968d.contains(fVar.f124201b)) {
                    this.f123989k.add(Long.valueOf(fVar.f124200a));
                }
                this.f123982d.mo123537a(fVar.f124200a, C7634n.m23709a(fVar.f124201b, '/', '.', false));
                return;
            }
            if (nVar instanceof C48847c) {
                C48847c cVar = (C48847c) nVar;
                this.f123983e.mo123530a(cVar.f124188b, cVar.f124190d);
                if (this.f123989k.contains(Long.valueOf(cVar.f124190d))) {
                    this.f123988j.add(Long.valueOf(cVar.f124188b));
                }
            } else if (nVar instanceof C48826a) {
                C48714c cVar2 = ((C48826a) nVar).f124118a;
                if (cVar2.mo123464a() != 0 && this.f123991m.contains(C7575l.m23595a(cVar2.getClass()))) {
                    this.f123990l.add(cVar2);
                }
            } else if (nVar instanceof C48832b) {
                C48832b bVar = (C48832b) nVar;
                C48809a a = this.f123984f.mo123570a(bVar.f124135a);
                a.mo123575a(j, this.f123981c);
                a.mo123574a(bVar.f124137c);
                a.mo123573a(bVar.f124141g);
            } else if (nVar instanceof C48834d) {
                C48834d dVar = (C48834d) nVar;
                C48809a a2 = this.f123985g.mo123570a(dVar.f124148a);
                a2.mo123575a(j, this.f123981c);
                a2.mo123574a(dVar.f124150c);
            } else if (nVar instanceof C48836f) {
                C48836f fVar2 = (C48836f) nVar;
                C48809a a3 = this.f123986h.mo123570a(fVar2.f124155a);
                a3.mo123575a(j, this.f123981c);
                a3.mo123574a(fVar2.f124157c);
            } else if (nVar instanceof C48846h) {
                C48846h hVar = (C48846h) nVar;
                C48809a a4 = this.f123987i.mo123570a(hVar.f124183a);
                a4.mo123575a(j, this.f123981c);
                a4.mo123572a((byte) hVar.f124186d.ordinal());
            }
        }

        public C48772a(boolean z, long j, int i, int i2, int i3, int i4, Set<? extends C7584c<? extends C48714c>> set) {
            int i5;
            Set<? extends C7584c<? extends C48714c>> set2 = set;
            C7573i.m23587b(set2, "indexedGcRootsTypes");
            this.f123991m = set2;
            if (z) {
                i5 = 8;
            } else {
                i5 = 4;
            }
            this.f123980b = i5;
            this.f123981c = C48773b.m150648a(j);
            this.f123982d = new C48766c<>();
            this.f123983e = new C48764b();
            boolean z2 = z;
            C48808n nVar = new C48808n(this.f123981c + this.f123980b + 4, z2, i, 0.0d, 8, null);
            this.f123984f = nVar;
            C48808n nVar2 = new C48808n(this.f123980b + this.f123981c, z2, i2, 0.0d, 8, null);
            this.f123985g = nVar2;
            C48808n nVar3 = new C48808n(this.f123980b + this.f123981c, z2, i3, 0.0d, 8, null);
            this.f123986h = nVar3;
            C48808n nVar4 = new C48808n(this.f123981c + 1, z2, i4, 0.0d, 8, null);
            this.f123987i = nVar4;
            this.f123988j = new LinkedHashSet();
            this.f123989k = new LinkedHashSet();
            this.f123990l = new ArrayList();
        }
    }

    /* renamed from: shark.internal.d$b */
    public static final class C48773b {

        /* renamed from: shark.internal.d$b$a */
        public static final class C48774a implements C48858u {

            /* renamed from: b */
            final /* synthetic */ IntRef f123992b;

            /* renamed from: c */
            final /* synthetic */ IntRef f123993c;

            /* renamed from: d */
            final /* synthetic */ IntRef f123994d;

            /* renamed from: e */
            final /* synthetic */ IntRef f123995e;

            /* renamed from: a */
            public final void mo123550a(long j, C48823n nVar) {
                C7573i.m23587b(nVar, "record");
                if (nVar instanceof C48847c) {
                    this.f123992b.element++;
                } else if (nVar instanceof C48834d) {
                    this.f123993c.element++;
                } else if (nVar instanceof C48836f) {
                    this.f123994d.element++;
                } else {
                    if (nVar instanceof C48846h) {
                        this.f123995e.element++;
                    }
                }
            }

            public C48774a(IntRef intRef, IntRef intRef2, IntRef intRef3, IntRef intRef4) {
                this.f123992b = intRef;
                this.f123993c = intRef2;
                this.f123994d = intRef3;
                this.f123995e = intRef4;
            }
        }

        private C48773b() {
        }

        /* renamed from: a */
        public static int m150648a(long j) {
            int i = 0;
            while (j != 0) {
                j >>= 8;
                i++;
            }
            return i;
        }

        public /* synthetic */ C48773b(C7571f fVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public static C48771d m150649a(Hprof hprof, C48860v vVar, Set<? extends C7584c<? extends C48714c>> set) {
            Hprof hprof2 = hprof;
            C7573i.m23587b(hprof, "hprof");
            C7573i.m23587b(set, "indexedGcRootTypes");
            boolean z = false;
            Set a = C7513am.m23410a((T[]) new C7584c[]{C7575l.m23595a(C48850f.class), C7575l.m23595a(C48847c.class), C7575l.m23595a(C48832b.class), C7575l.m23595a(C48834d.class), C7575l.m23595a(C48836f.class), C7575l.m23595a(C48846h.class), C7575l.m23595a(C48826a.class)});
            C48821m mVar = hprof2.f123814a;
            IntRef intRef = new IntRef();
            intRef.element = 0;
            IntRef intRef2 = new IntRef();
            intRef2.element = 0;
            IntRef intRef3 = new IntRef();
            intRef3.element = 0;
            IntRef intRef4 = new IntRef();
            intRef4.element = 0;
            mVar.mo123595a(C7513am.m23410a((T[]) new C7584c[]{C7575l.m23595a(C48847c.class), C7575l.m23595a(C48834d.class), C7575l.m23595a(C48836f.class), C7575l.m23595a(C48846h.class)}), (C48858u) new C48774a(intRef, intRef2, intRef3, intRef4));
            hprof.mo123383a(mVar.f124114c);
            if (mVar.f124113b == 8) {
                z = true;
            }
            C48772a aVar = new C48772a(z, hprof2.f123817d, intRef.element, intRef2.element, intRef3.element, intRef4.element, set);
            mVar.mo123595a(a, (C48858u) aVar);
            C48860v vVar2 = vVar;
            return aVar.mo123549a(vVar);
        }
    }

    /* renamed from: shark.internal.d$c */
    static final class C48775c extends Lambda implements C7562b<Pair<? extends Long, ? extends C48758a>, Pair<? extends Long, ? extends C48780a>> {

        /* renamed from: a */
        final /* synthetic */ C48771d f123996a;

        C48775c(C48771d dVar) {
            this.f123996a = dVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<Long, C48780a> invoke(Pair<Long, C48758a> pair) {
            C7573i.m23587b(pair, "it");
            long longValue = ((Number) pair.getFirst()).longValue();
            C48758a aVar = (C48758a) pair.getSecond();
            Long valueOf = Long.valueOf(longValue);
            C48780a aVar2 = new C48780a(aVar.mo123519a(this.f123996a.f123970a), aVar.mo123520b(), aVar.mo123521c());
            return C7579l.m23633a(valueOf, aVar2);
        }
    }

    /* renamed from: shark.internal.d$d */
    static final class C48776d extends Lambda implements C7562b<Pair<? extends Long, ? extends C48758a>, Pair<? extends Long, ? extends C48781b>> {

        /* renamed from: a */
        final /* synthetic */ C48771d f123997a;

        C48776d(C48771d dVar) {
            this.f123997a = dVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<Long, C48781b> invoke(Pair<Long, C48758a> pair) {
            C7573i.m23587b(pair, "it");
            long longValue = ((Number) pair.getFirst()).longValue();
            C48758a aVar = (C48758a) pair.getSecond();
            return C7579l.m23633a(Long.valueOf(longValue), new C48781b(aVar.mo123519a(this.f123997a.f123970a), aVar.mo123520b()));
        }
    }

    /* renamed from: shark.internal.d$e */
    static final class C48777e extends Lambda implements C7562b<Pair<? extends Long, ? extends C48758a>, Pair<? extends Long, ? extends C48782c>> {

        /* renamed from: a */
        final /* synthetic */ C48771d f123998a;

        C48777e(C48771d dVar) {
            this.f123998a = dVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<Long, C48782c> invoke(Pair<Long, C48758a> pair) {
            C7573i.m23587b(pair, "it");
            long longValue = ((Number) pair.getFirst()).longValue();
            C48758a aVar = (C48758a) pair.getSecond();
            return C7579l.m23633a(Long.valueOf(longValue), new C48782c(aVar.mo123519a(this.f123998a.f123970a), aVar.mo123520b()));
        }
    }

    /* renamed from: shark.internal.d$f */
    static final class C48778f extends Lambda implements C7562b<Pair<? extends Long, ? extends C48758a>, Pair<? extends Long, ? extends C48783d>> {

        /* renamed from: a */
        final /* synthetic */ C48771d f123999a;

        C48778f(C48771d dVar) {
            this.f123999a = dVar;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Pair<Long, C48783d> invoke(Pair<Long, C48758a> pair) {
            C7573i.m23587b(pair, "it");
            long longValue = ((Number) pair.getFirst()).longValue();
            C48758a aVar = (C48758a) pair.getSecond();
            return C7579l.m23633a(Long.valueOf(longValue), new C48783d(aVar.mo123519a(this.f123999a.f123970a), PrimitiveType.values()[aVar.mo123518a()]));
        }
    }

    /* renamed from: c */
    private C7604g<Pair<Long, C48780a>> m150634c() {
        return C7605h.m23659d(this.f123975h.mo123566a(), new C48775c(this));
    }

    /* renamed from: d */
    private C7604g<Pair<Long, C48782c>> m150635d() {
        return C7605h.m23659d(this.f123977j.mo123566a(), new C48777e(this));
    }

    /* renamed from: e */
    private C7604g<Pair<Long, C48783d>> m150638e() {
        return C7605h.m23659d(this.f123978k.mo123566a(), new C48778f(this));
    }

    /* renamed from: b */
    public final C7604g<Pair<Long, C48779e>> mo123546b() {
        return C7605h.m23654a(C7605h.m23654a(C7605h.m23654a(m150634c(), mo123545a()), m150635d()), m150638e());
    }

    static {
        String name = Boolean.TYPE.getName();
        C7573i.m23582a((Object) name, "Boolean::class.java.name");
        String name2 = Character.TYPE.getName();
        C7573i.m23582a((Object) name2, "Char::class.java.name");
        String name3 = Float.TYPE.getName();
        C7573i.m23582a((Object) name3, "Float::class.java.name");
        String name4 = Double.TYPE.getName();
        C7573i.m23582a((Object) name4, "Double::class.java.name");
        String name5 = Byte.TYPE.getName();
        C7573i.m23582a((Object) name5, "Byte::class.java.name");
        String name6 = Short.TYPE.getName();
        C7573i.m23582a((Object) name6, "Short::class.java.name");
        String name7 = Integer.TYPE.getName();
        C7573i.m23582a((Object) name7, "Int::class.java.name");
        String name8 = Long.TYPE.getName();
        C7573i.m23582a((Object) name8, "Long::class.java.name");
        f123968d = C7513am.m23410a((T[]) new String[]{name, name2, name3, name4, name5, name6, name7, name8});
    }

    /* renamed from: a */
    public final C7604g<Pair<Long, C48781b>> mo123545a() {
        return C7605h.m23659d(this.f123976i.mo123566a(), new C48776d(this));
    }

    /* renamed from: a */
    public final String mo123543a(long j) {
        String e = m150637e(this.f123974g.mo123535c(j));
        C48860v vVar = this.f123979l;
        if (vVar == null) {
            return e;
        }
        String a = vVar.mo123611a(e);
        if (a == null) {
            return e;
        }
        return a;
    }

    /* renamed from: e */
    private final String m150637e(long j) {
        String str = (String) this.f123973f.mo123536a(j);
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder("Hprof string ");
        sb.append(j);
        sb.append(" not in cache");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final C48779e mo123547b(long j) {
        C48779e d = m150636d(j);
        if (d != null) {
            return d;
        }
        StringBuilder sb = new StringBuilder("Object id ");
        sb.append(j);
        sb.append(" not found in heap dump.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: c */
    public final boolean mo123548c(long j) {
        if (this.f123975h.mo123567a(j) == null && this.f123976i.mo123567a(j) == null && this.f123977j.mo123567a(j) == null && this.f123978k.mo123567a(j) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private final C48779e m150636d(long j) {
        C48758a a = this.f123975h.mo123567a(j);
        if (a != null) {
            C48780a aVar = new C48780a(a.mo123519a(this.f123970a), a.mo123520b(), a.mo123521c());
            return aVar;
        }
        C48758a a2 = this.f123976i.mo123567a(j);
        if (a2 != null) {
            return new C48781b(a2.mo123519a(this.f123970a), a2.mo123520b());
        }
        C48758a a3 = this.f123977j.mo123567a(j);
        if (a3 != null) {
            return new C48782c(a3.mo123519a(this.f123970a), a3.mo123520b());
        }
        C48758a a4 = this.f123978k.mo123567a(j);
        if (a4 != null) {
            return new C48783d(a4.mo123519a(this.f123970a), PrimitiveType.values()[a4.mo123518a()]);
        }
        return null;
    }

    /* renamed from: a */
    public final Long mo123542a(String str) {
        Object obj;
        Number number;
        Object obj2;
        boolean z;
        C7573i.m23587b(str, "className");
        Iterator a = this.f123973f.mo123538a().mo19416a();
        while (true) {
            if (!a.hasNext()) {
                obj = null;
                break;
            }
            obj = a.next();
            if (C7573i.m23585a((Object) (String) ((Pair) obj).getSecond(), (Object) str)) {
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            number = (Long) pair.getFirst();
        } else {
            number = null;
        }
        if (number == null) {
            return null;
        }
        long longValue = number.longValue();
        Iterator a2 = this.f123974g.mo123531a().mo19416a();
        while (true) {
            if (!a2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = a2.next();
            if (((Number) ((Pair) obj2).getSecond()).longValue() == longValue) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Pair pair2 = (Pair) obj2;
        if (pair2 != null) {
            return (Long) pair2.getFirst();
        }
        return null;
    }

    /* renamed from: a */
    public final String mo123544a(long j, long j2) {
        String e = m150637e(j2);
        if (this.f123979l != null) {
            String a = this.f123979l.mo123612a(m150637e(this.f123974g.mo123535c(j)), e);
            if (a != null) {
                return a;
            }
        }
        return e;
    }

    private C48771d(int i, C48766c<String> cVar, C48764b bVar, C48805l lVar, C48805l lVar2, C48805l lVar3, C48805l lVar4, List<? extends C48714c> list, C48860v vVar, Set<Long> set) {
        this.f123970a = i;
        this.f123973f = cVar;
        this.f123974g = bVar;
        this.f123975h = lVar;
        this.f123976i = lVar2;
        this.f123977j = lVar3;
        this.f123978k = lVar4;
        this.f123971b = list;
        this.f123979l = vVar;
        this.f123972c = set;
    }

    public /* synthetic */ C48771d(int i, C48766c cVar, C48764b bVar, C48805l lVar, C48805l lVar2, C48805l lVar3, C48805l lVar4, List list, C48860v vVar, Set set, C7571f fVar) {
        this(i, cVar, bVar, lVar, lVar2, lVar3, lVar4, list, vVar, set);
    }
}
