package shark.internal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7579l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;
import shark.C48714c;
import shark.C48745g;
import shark.C48746h;
import shark.C48747i;
import shark.C48747i.C48749b;
import shark.C48747i.C48752c;
import shark.C48747i.C48756d;
import shark.C48747i.C48757e;
import shark.C48851o;
import shark.C48854r;
import shark.C48861w;
import shark.LeakReference;
import shark.LeakTraceElement.Type;
import shark.OnAnalysisProgressListener;
import shark.OnAnalysisProgressListener.Step;
import shark.PrimitiveType;
import shark.ReferencePattern;
import shark.ReferencePattern.InstanceFieldPattern;
import shark.ReferencePattern.JavaLocalPattern;
import shark.ReferencePattern.NativeGlobalVariablePattern;
import shark.ReferencePattern.StaticFieldPattern;
import shark.internal.C48797k.C48798a;
import shark.internal.C48797k.C48798a.C48799a;
import shark.internal.C48797k.C48798a.C48800b;
import shark.internal.p1903b.C48764b;
import shark.internal.p1903b.C48768d;

/* renamed from: shark.internal.j */
public final class C48789j {

    /* renamed from: a */
    private final Map<String, Map<String, C48861w>> f124024a;

    /* renamed from: b */
    private final Map<String, Map<String, C48861w>> f124025b;

    /* renamed from: c */
    private final Map<String, C48861w> f124026c;

    /* renamed from: d */
    private final Map<String, C48861w> f124027d;

    /* renamed from: e */
    private final C48746h f124028e;

    /* renamed from: f */
    private final OnAnalysisProgressListener f124029f;

    /* renamed from: shark.internal.j$a */
    public static final class C48790a {

        /* renamed from: a */
        public final List<C48797k> f124030a;

        /* renamed from: b */
        public final C48764b f124031b;

        public C48790a(List<? extends C48797k> list, C48764b bVar) {
            C7573i.m23587b(list, "pathsToLeakingObjects");
            C7573i.m23587b(bVar, "dominatedObjectIds");
            this.f124030a = list;
            this.f124031b = bVar;
        }
    }

    /* renamed from: shark.internal.j$b */
    static final class C48791b {

        /* renamed from: a */
        public final Deque<C48797k> f124032a = new ArrayDeque();

        /* renamed from: b */
        public final Deque<C48797k> f124033b = new ArrayDeque();

        /* renamed from: c */
        public final HashSet<Long> f124034c = new HashSet<>();

        /* renamed from: d */
        public final HashSet<Long> f124035d = new HashSet<>();

        /* renamed from: e */
        public final C48768d f124036e = new C48768d();

        /* renamed from: f */
        public final C48764b f124037f = new C48764b();

        /* renamed from: g */
        public final Set<Long> f124038g;

        /* renamed from: h */
        public final int f124039h;

        /* renamed from: i */
        public final boolean f124040i;

        /* renamed from: a */
        public final boolean mo123557a() {
            if ((!this.f124032a.isEmpty()) || (!this.f124033b.isEmpty())) {
                return true;
            }
            return false;
        }

        public C48791b(Set<Long> set, int i, boolean z) {
            C7573i.m23587b(set, "leakingObjectIds");
            this.f124038g = set;
            this.f124039h = i;
            this.f124040i = z;
        }
    }

    /* renamed from: shark.internal.j$c */
    static final class C48792c extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ C48752c f124041a;

        /* renamed from: b */
        final /* synthetic */ C48789j f124042b;

        /* renamed from: c */
        final /* synthetic */ C48791b f124043c;

        /* renamed from: d */
        final /* synthetic */ Map f124044d;

        /* renamed from: e */
        final /* synthetic */ Map f124045e;

        C48792c(C48752c cVar, C48789j jVar, C48791b bVar, Map map, Map map2) {
            this.f124041a = cVar;
            this.f124042b = jVar;
            this.f124043c = bVar;
            this.f124044d = map;
            this.f124045e = map2;
            super(0);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
            if (r0 == null) goto L_0x001a;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String invoke() {
            /*
                r3 = this;
                shark.i$c r0 = r3.f124041a
                java.lang.Class<java.lang.Thread> r1 = java.lang.Thread.class
                kotlin.reflect.c r1 = kotlin.jvm.internal.C7575l.m23595a(r1)
                java.lang.String r2 = "name"
                shark.g r0 = r0.mo123492a(r1, r2)
                if (r0 == 0) goto L_0x001a
                shark.k r0 = r0.f123887c
                if (r0 == 0) goto L_0x001a
                java.lang.String r0 = r0.mo123584i()
                if (r0 != 0) goto L_0x001c
            L_0x001a:
                java.lang.String r0 = ""
            L_0x001c:
                java.util.Map r1 = r3.f124045e
                shark.i$c r2 = r3.f124041a
                r1.put(r2, r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48789j.C48792c.invoke():java.lang.String");
        }
    }

    /* renamed from: shark.internal.j$d */
    static final class C48793d<T> implements Comparator<Pair<? extends C48747i, ? extends C48714c>> {

        /* renamed from: a */
        final /* synthetic */ C7562b f124046a;

        C48793d(C7562b bVar) {
            this.f124046a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compare(Pair<? extends C48747i, ? extends C48714c> pair, Pair<? extends C48747i, ? extends C48714c> pair2) {
            C48747i iVar = (C48747i) pair.component1();
            C48714c cVar = (C48714c) pair.component2();
            C48747i iVar2 = (C48747i) pair2.component1();
            String name = ((C48714c) pair2.component2()).getClass().getName();
            String name2 = cVar.getClass().getName();
            C7573i.m23582a((Object) name2, "root1::class.java.name");
            int compareTo = name.compareTo(name2);
            if (compareTo != 0) {
                return compareTo;
            }
            return ((String) this.f124046a.invoke(iVar)).compareTo((String) this.f124046a.invoke(iVar2));
        }
    }

    /* renamed from: shark.internal.j$e */
    static final class C48794e extends Lambda implements C7562b<C48747i, String> {

        /* renamed from: a */
        public static final C48794e f124047a = new C48794e();

        C48794e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m150685a((C48747i) obj);
        }

        /* renamed from: a */
        private static String m150685a(C48747i iVar) {
            C7573i.m23587b(iVar, "graphObject");
            if (iVar instanceof C48749b) {
                return ((C48749b) iVar).mo123482e();
            }
            if (iVar instanceof C48752c) {
                return ((C48752c) iVar).mo123495f();
            }
            if (iVar instanceof C48756d) {
                return ((C48756d) iVar).mo123502e();
            }
            if (iVar instanceof C48757e) {
                return ((C48757e) iVar).mo123507f();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: shark.internal.j$f */
    public static final class C48795f<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            return C47886a.m148819a(((C48745g) t).f123886b, ((C48745g) t2).f123886b);
        }
    }

    /* renamed from: shark.internal.j$g */
    static final class C48796g extends Lambda implements C7562b<C48745g, Boolean> {

        /* renamed from: a */
        public static final C48796g f124048a = new C48796g();

        C48796g() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m150686a(C48745g gVar) {
            C7573i.m23587b(gVar, "it");
            return gVar.f123887c.mo123582g();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m150686a((C48745g) obj));
        }
    }

    /* renamed from: a */
    public final C48790a mo123556a(Set<Long> set, boolean z) {
        C7573i.m23587b(set, "leakingObjectIds");
        this.f124029f.mo83581a(Step.FINDING_PATHS_TO_LEAKING_OBJECTS);
        return m150669a(new C48791b(set, m150667a(this.f124028e), z));
    }

    /* renamed from: a */
    private final void m150674a(C48791b bVar, C48749b bVar2, C48797k kVar) {
        C48798a aVar;
        Map map = (Map) this.f124025b.get(bVar2.mo123482e());
        if (map == null) {
            map = C7507ae.m23387a();
        }
        Iterator a = bVar2.mo123489l().mo19416a();
        while (a.hasNext()) {
            C48745g gVar = (C48745g) a.next();
            if (gVar.f123887c.mo123582g()) {
                String str = gVar.f123886b;
                if (!C7573i.m23585a((Object) str, (Object) "$staticOverhead")) {
                    Long d = gVar.f123887c.mo123579d();
                    if (d == null) {
                        C7573i.m23580a();
                    }
                    long longValue = d.longValue();
                    if (bVar.f124040i) {
                        m150670a(bVar, longValue);
                    }
                    C48861w wVar = (C48861w) map.get(str);
                    if (wVar == null) {
                        aVar = new C48800b(longValue, kVar, new LeakReference(Type.STATIC_FIELD, str));
                    } else if (wVar instanceof C48854r) {
                        C48799a aVar2 = new C48799a(longValue, kVar, new LeakReference(Type.STATIC_FIELD, str), (C48854r) wVar);
                        aVar = aVar2;
                    } else if (wVar instanceof C48851o) {
                        aVar = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (aVar != null) {
                        m150679b(bVar, aVar);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v21, types: [shark.w] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m150675a(shark.internal.C48789j.C48791b r20, shark.C48747i.C48752c r21, shark.internal.C48797k r22) {
        /*
            r19 = this;
            r6 = r19
            r7 = r20
            r0 = r21
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            shark.i$b r1 = r21.mo123497h()
            kotlin.sequences.g r1 = r1.mo123487j()
            java.util.Iterator r1 = r1.mo19416a()
        L_0x0017:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005e
            java.lang.Object r2 = r1.next()
            shark.i$b r2 = (shark.C48747i.C48749b) r2
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, shark.w>> r3 = r6.f124024a
            java.lang.String r2 = r2.mo123482e()
            java.lang.Object r2 = r3.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 == 0) goto L_0x0017
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0039:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0017
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r3.getValue()
            shark.w r3 = (shark.C48861w) r3
            boolean r5 = r8.containsKey(r4)
            if (r5 != 0) goto L_0x0039
            r5 = r8
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r4, r3)
            goto L_0x0039
        L_0x005e:
            java.lang.String r1 = "java.lang.Thread"
            boolean r1 = r0.mo123493a(r1)
            r9 = 0
            if (r1 == 0) goto L_0x0085
            java.lang.String r1 = "java.lang.Thread"
            java.lang.String r2 = "name"
            shark.g r1 = r0.mo123491a(r1, r2)
            if (r1 == 0) goto L_0x007a
            shark.k r1 = r1.f123887c
            if (r1 == 0) goto L_0x007a
            java.lang.String r1 = r1.mo123584i()
            goto L_0x007b
        L_0x007a:
            r1 = r9
        L_0x007b:
            java.util.Map<java.lang.String, shark.w> r2 = r6.f124026c
            java.lang.Object r1 = r2.get(r1)
            shark.w r1 = (shark.C48861w) r1
            r10 = r1
            goto L_0x0086
        L_0x0085:
            r10 = r9
        L_0x0086:
            kotlin.sequences.g r0 = r21.mo123499j()
            shark.internal.j$g r1 = shark.internal.C48789j.C48796g.f124048a
            kotlin.jvm.a.b r1 = (kotlin.jvm.p357a.C7562b) r1
            kotlin.sequences.g r0 = kotlin.sequences.C7605h.m23653a(r0, r1)
            java.util.List r0 = kotlin.sequences.C7605h.m23665i(r0)
            int r1 = r0.size()
            r2 = 1
            if (r1 <= r2) goto L_0x00a7
            shark.internal.j$f r1 = new shark.internal.j$f
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            kotlin.collections.C7525m.m23474a(r0, r1)
        L_0x00a7:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r11 = r0.iterator()
        L_0x00ad:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0167
            java.lang.Object r0 = r11.next()
            r12 = r0
            shark.g r12 = (shark.C48745g) r12
            shark.k r0 = r12.f123887c
            java.lang.Long r0 = r0.mo123579d()
            if (r0 != 0) goto L_0x00c5
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00c5:
            long r14 = r0.longValue()
            boolean r0 = r7.f124040i
            if (r0 == 0) goto L_0x00d9
            long r2 = r22.mo123560a()
            r0 = r19
            r1 = r20
            r4 = r14
            r0.m150671a(r1, r2, r4)
        L_0x00d9:
            if (r10 == 0) goto L_0x0115
            shark.i$b r0 = r12.f123885a
            java.lang.String r0 = r0.mo123482e()
            java.lang.String r1 = "java.lang.Thread"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = r12.f123886b
            java.lang.String r1 = "localValues"
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0115
            boolean r0 = r10 instanceof shark.C48854r
            if (r0 == 0) goto L_0x010f
            shark.internal.k$a$a r0 = new shark.internal.k$a$a
            shark.LeakReference r1 = new shark.LeakReference
            shark.LeakTraceElement$Type r2 = shark.LeakTraceElement.Type.INSTANCE_FIELD
            java.lang.String r3 = r12.f123886b
            r1.<init>(r2, r3)
            r18 = r10
            shark.r r18 = (shark.C48854r) r18
            r13 = r0
            r16 = r22
            r17 = r1
            r13.<init>(r14, r16, r17, r18)
            goto L_0x0110
        L_0x010f:
            r0 = r9
        L_0x0110:
            shark.internal.k$a r0 = (shark.internal.C48797k.C48798a) r0
            r2 = r22
            goto L_0x0158
        L_0x0115:
            java.lang.String r0 = r12.f123886b
            java.lang.Object r0 = r8.get(r0)
            shark.w r0 = (shark.C48861w) r0
            if (r0 != 0) goto L_0x0132
            shark.internal.k$a$b r0 = new shark.internal.k$a$b
            shark.LeakReference r1 = new shark.LeakReference
            shark.LeakTraceElement$Type r2 = shark.LeakTraceElement.Type.INSTANCE_FIELD
            java.lang.String r3 = r12.f123886b
            r1.<init>(r2, r3)
            r2 = r22
            r0.<init>(r14, r2, r1)
            shark.internal.k$a r0 = (shark.internal.C48797k.C48798a) r0
            goto L_0x0158
        L_0x0132:
            r2 = r22
            boolean r1 = r0 instanceof shark.C48854r
            if (r1 == 0) goto L_0x0153
            shark.internal.k$a$a r1 = new shark.internal.k$a$a
            shark.LeakReference r3 = new shark.LeakReference
            shark.LeakTraceElement$Type r4 = shark.LeakTraceElement.Type.INSTANCE_FIELD
            java.lang.String r5 = r12.f123886b
            r3.<init>(r4, r5)
            r18 = r0
            shark.r r18 = (shark.C48854r) r18
            r13 = r1
            r16 = r22
            r17 = r3
            r13.<init>(r14, r16, r17, r18)
            r0 = r1
            shark.internal.k$a r0 = (shark.internal.C48797k.C48798a) r0
            goto L_0x0158
        L_0x0153:
            boolean r0 = r0 instanceof shark.C48851o
            if (r0 == 0) goto L_0x0161
            r0 = r9
        L_0x0158:
            if (r0 == 0) goto L_0x00ad
            shark.internal.k r0 = (shark.internal.C48797k) r0
            r6.m150679b(r7, r0)
            goto L_0x00ad
        L_0x0161:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48789j.m150675a(shark.internal.j$b, shark.i$c, shark.internal.k):void");
    }

    /* renamed from: a */
    private final void m150676a(C48791b bVar, C48756d dVar, C48797k kVar) {
        long[] jArr = dVar.mo123479c().f124154d;
        Collection arrayList = new ArrayList();
        int length = jArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            long j = jArr[i2];
            if (j != 0 && this.f124028e.mo123473b(j)) {
                arrayList.add(Long.valueOf(j));
            }
        }
        for (Object next : (List) arrayList) {
            int i3 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            long longValue = ((Number) next).longValue();
            if (bVar.f124040i) {
                m150671a(bVar, kVar.mo123560a(), longValue);
            }
            m150679b(bVar, new C48800b(longValue, kVar, new LeakReference(Type.ARRAY_ENTRY, String.valueOf(i))));
            i = i3;
        }
    }

    /* renamed from: a */
    private final List<Pair<C48747i, C48714c>> m150668a() {
        C7562b bVar = C48794e.f124047a;
        Iterable c = this.f124028e.mo123474c();
        Collection arrayList = new ArrayList();
        for (Object next : c) {
            if (this.f124028e.mo123473b(((C48714c) next).mo123464a())) {
                arrayList.add(next);
            }
        }
        Iterable<C48714c> iterable = (List) arrayList;
        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (C48714c cVar : iterable) {
            arrayList2.add(C7579l.m23633a(this.f124028e.mo123471a(cVar.mo123464a()), cVar));
        }
        return C7525m.m23494a((Iterable<? extends T>) (List) arrayList2, (Comparator<? super T>) new C48793d<Object>(bVar));
    }

    /* renamed from: a */
    private static int m150667a(C48746h hVar) {
        C48749b a = hVar.mo123470a("java.lang.Object");
        if (a == null) {
            return 0;
        }
        int a2 = hVar.mo123469a() + PrimitiveType.INT.getByteSize();
        if (a.mo123485h() == a2) {
            return a2;
        }
        return 0;
    }

    /* renamed from: b */
    private static C48797k m150678b(C48791b bVar) {
        if (!bVar.f124032a.isEmpty()) {
            C48797k kVar = (C48797k) bVar.f124032a.poll();
            bVar.f124034c.remove(Long.valueOf(kVar.mo123560a()));
            C7573i.m23582a((Object) kVar, "removedNode");
            return kVar;
        }
        C48797k kVar2 = (C48797k) bVar.f124033b.poll();
        bVar.f124035d.remove(Long.valueOf(kVar2.mo123560a()));
        C7573i.m23582a((Object) kVar2, "removedNode");
        return kVar2;
    }

    /* renamed from: a */
    private final C48790a m150669a(C48791b bVar) {
        m150680c(bVar);
        List arrayList = new ArrayList();
        while (bVar.mo123557a()) {
            C48797k b = m150678b(bVar);
            if (!m150677a(bVar, b)) {
                if (bVar.f124038g.contains(Long.valueOf(b.mo123560a()))) {
                    arrayList.add(b);
                    if (arrayList.size() == bVar.f124038g.size()) {
                        if (!bVar.f124040i) {
                            break;
                        }
                        this.f124029f.mo83581a(Step.FINDING_DOMINATORS);
                    }
                }
                C48747i a = this.f124028e.mo123471a(b.mo123560a());
                if (a instanceof C48749b) {
                    m150674a(bVar, (C48749b) a, b);
                } else if (a instanceof C48752c) {
                    m150675a(bVar, (C48752c) a, b);
                } else if (a instanceof C48756d) {
                    m150676a(bVar, (C48756d) a, b);
                }
            } else {
                StringBuilder sb = new StringBuilder("Node ");
                sb.append(b);
                sb.append(" objectId=");
                sb.append(b.mo123560a());
                sb.append(" should not be enqueued when already visited or enqueued");
                throw new IllegalStateException(sb.toString());
            }
        }
        return new C48790a(arrayList, bVar.f124037f);
    }

    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r0v45, types: [shark.internal.k$a$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m150680c(shark.internal.C48789j.C48791b r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            java.util.List r0 = r18.m150668a()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r8 = r1
            java.util.Map r8 = (java.util.Map) r8
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r9 = r1
            java.util.Map r9 = (java.util.Map) r9
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r10 = r0.iterator()
        L_0x001e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0186
            java.lang.Object r0 = r10.next()
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            shark.i r1 = (shark.C48747i) r1
            java.lang.Object r0 = r0.component2()
            r11 = r0
            shark.c r11 = (shark.C48714c) r11
            boolean r0 = r7.f124040i
            if (r0 == 0) goto L_0x0042
            long r2 = r11.mo123464a()
            r6.m150670a(r7, r2)
        L_0x0042:
            boolean r0 = r11 instanceof shark.C48714c.C48727m
            if (r0 == 0) goto L_0x006e
            r0 = r11
            shark.c$m r0 = (shark.C48714c.C48727m) r0
            int r0 = r0.f123855a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            shark.i$c r1 = r1.mo123480d()
            if (r1 != 0) goto L_0x0058
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0058:
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r1, r11)
            r9.put(r0, r1)
            shark.internal.k$c$b r0 = new shark.internal.k$c$b
            long r1 = r11.mo123464a()
            r0.<init>(r1, r11)
            shark.internal.k r0 = (shark.internal.C48797k) r0
            r6.m150679b(r7, r0)
            goto L_0x001e
        L_0x006e:
            boolean r0 = r11 instanceof shark.C48714c.C48718d
            if (r0 == 0) goto L_0x00f7
            r0 = r11
            shark.c$d r0 = (shark.C48714c.C48718d) r0
            int r0 = r0.f123837a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = kotlin.collections.C7507ae.m23398b(r9, r0)
            kotlin.Pair r0 = (kotlin.Pair) r0
            java.lang.Object r1 = r0.component1()
            shark.i$c r1 = (shark.C48747i.C48752c) r1
            java.lang.Object r0 = r0.component2()
            r12 = r0
            shark.c$m r12 = (shark.C48714c.C48727m) r12
            java.lang.Object r0 = r8.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00aa
            shark.internal.j$c r13 = new shark.internal.j$c
            r0 = r13
            r2 = r18
            r3 = r19
            r4 = r9
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.a.a r13 = (kotlin.jvm.p357a.C7561a) r13
            java.lang.Object r0 = r13.invoke()
            java.lang.String r0 = (java.lang.String) r0
        L_0x00aa:
            java.util.Map<java.lang.String, shark.w> r1 = r6.f124026c
            java.lang.Object r0 = r1.get(r0)
            shark.w r0 = (shark.C48861w) r0
            boolean r1 = r0 instanceof shark.C48851o
            if (r1 != 0) goto L_0x001e
            shark.internal.k$c$b r1 = new shark.internal.k$c$b
            long r2 = r12.mo123464a()
            r1.<init>(r2, r11)
            shark.LeakReference r2 = new shark.LeakReference
            shark.LeakTraceElement$Type r3 = shark.LeakTraceElement.Type.LOCAL
            java.lang.String r4 = ""
            r2.<init>(r3, r4)
            boolean r3 = r0 instanceof shark.C48854r
            if (r3 == 0) goto L_0x00e2
            shark.internal.k$a$a r3 = new shark.internal.k$a$a
            long r13 = r11.mo123464a()
            r15 = r1
            shark.internal.k r15 = (shark.internal.C48797k) r15
            r17 = r0
            shark.r r17 = (shark.C48854r) r17
            r12 = r3
            r16 = r2
            r12.<init>(r13, r15, r16, r17)
            shark.internal.k$a r3 = (shark.internal.C48797k.C48798a) r3
            goto L_0x00f0
        L_0x00e2:
            shark.internal.k$a$b r0 = new shark.internal.k$a$b
            long r3 = r11.mo123464a()
            shark.internal.k r1 = (shark.internal.C48797k) r1
            r0.<init>(r3, r1, r2)
            r3 = r0
            shark.internal.k$a r3 = (shark.internal.C48797k.C48798a) r3
        L_0x00f0:
            shark.internal.k r3 = (shark.internal.C48797k) r3
            r6.m150679b(r7, r3)
            goto L_0x001e
        L_0x00f7:
            boolean r0 = r11 instanceof shark.C48714c.C48719e
            if (r0 == 0) goto L_0x0176
            boolean r0 = r1 instanceof shark.C48747i.C48749b
            if (r0 == 0) goto L_0x010e
            java.util.Map<java.lang.String, shark.w> r0 = r6.f124027d
            shark.i$b r1 = (shark.C48747i.C48749b) r1
            java.lang.String r1 = r1.mo123482e()
            java.lang.Object r0 = r0.get(r1)
            shark.w r0 = (shark.C48861w) r0
            goto L_0x0146
        L_0x010e:
            boolean r0 = r1 instanceof shark.C48747i.C48752c
            if (r0 == 0) goto L_0x0121
            java.util.Map<java.lang.String, shark.w> r0 = r6.f124027d
            shark.i$c r1 = (shark.C48747i.C48752c) r1
            java.lang.String r1 = r1.mo123495f()
            java.lang.Object r0 = r0.get(r1)
            shark.w r0 = (shark.C48861w) r0
            goto L_0x0146
        L_0x0121:
            boolean r0 = r1 instanceof shark.C48747i.C48756d
            if (r0 == 0) goto L_0x0134
            java.util.Map<java.lang.String, shark.w> r0 = r6.f124027d
            shark.i$d r1 = (shark.C48747i.C48756d) r1
            java.lang.String r1 = r1.mo123502e()
            java.lang.Object r0 = r0.get(r1)
            shark.w r0 = (shark.C48861w) r0
            goto L_0x0146
        L_0x0134:
            boolean r0 = r1 instanceof shark.C48747i.C48757e
            if (r0 == 0) goto L_0x0170
            java.util.Map<java.lang.String, shark.w> r0 = r6.f124027d
            shark.i$e r1 = (shark.C48747i.C48757e) r1
            java.lang.String r1 = r1.mo123507f()
            java.lang.Object r0 = r0.get(r1)
            shark.w r0 = (shark.C48861w) r0
        L_0x0146:
            boolean r1 = r0 instanceof shark.C48851o
            if (r1 != 0) goto L_0x0160
            boolean r1 = r0 instanceof shark.C48854r
            if (r1 == 0) goto L_0x001e
            shark.internal.k$c$a r1 = new shark.internal.k$c$a
            long r2 = r11.mo123464a()
            shark.r r0 = (shark.C48854r) r0
            r1.<init>(r2, r11, r0)
            shark.internal.k r1 = (shark.internal.C48797k) r1
            r6.m150679b(r7, r1)
            goto L_0x001e
        L_0x0160:
            shark.internal.k$c$b r0 = new shark.internal.k$c$b
            long r1 = r11.mo123464a()
            r0.<init>(r1, r11)
            shark.internal.k r0 = (shark.internal.C48797k) r0
            r6.m150679b(r7, r0)
            goto L_0x001e
        L_0x0170:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0176:
            shark.internal.k$c$b r0 = new shark.internal.k$c$b
            long r1 = r11.mo123464a()
            r0.<init>(r1, r11)
            shark.internal.k r0 = (shark.internal.C48797k) r0
            r6.m150679b(r7, r0)
            goto L_0x001e
        L_0x0186:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48789j.m150680c(shark.internal.j$b):void");
    }

    /* renamed from: a */
    private static boolean m150677a(C48791b bVar, C48797k kVar) {
        if (!bVar.f124036e.mo123539a(kVar.mo123560a())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m150670a(shark.internal.C48789j.C48791b r6, long r7) {
        /*
            r5 = this;
            shark.h r0 = r5.f124028e
            shark.i r0 = r0.mo123471a(r7)
            boolean r1 = r0 instanceof shark.C48747i.C48749b
            r2 = 0
            if (r1 != 0) goto L_0x0065
            boolean r1 = r0 instanceof shark.C48747i.C48752c
            r3 = 1
            if (r1 == 0) goto L_0x0043
            shark.i$c r0 = (shark.C48747i.C48752c) r0
            java.lang.String r1 = r0.mo123495f()
            java.lang.String r4 = "java.lang.String"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r4)
            if (r1 == 0) goto L_0x003f
            m150673a(r6, r7, r3)
            java.lang.String r7 = "java.lang.String"
            java.lang.String r8 = "value"
            shark.g r7 = r0.mo123491a(r7, r8)
            if (r7 == 0) goto L_0x0034
            shark.k r7 = r7.f123887c
            if (r7 == 0) goto L_0x0034
            java.lang.Long r7 = r7.mo123579d()
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            if (r7 == 0) goto L_0x0068
            long r7 = r7.longValue()
            m150673a(r6, r7, r3)
            return
        L_0x003f:
            m150673a(r6, r7, r2)
            return
        L_0x0043:
            boolean r1 = r0 instanceof shark.C48747i.C48756d
            if (r1 == 0) goto L_0x0065
            shark.i$d r0 = (shark.C48747i.C48756d) r0
            boolean r1 = r0.f123906c
            if (r1 == 0) goto L_0x0061
            m150673a(r6, r7, r3)
            shark.n$b$c$e r7 = r0.mo123479c()
            long[] r7 = r7.f124154d
            int r8 = r7.length
        L_0x0057:
            if (r2 >= r8) goto L_0x0068
            r0 = r7[r2]
            m150673a(r6, r0, r3)
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0061:
            m150673a(r6, r7, r2)
            return
        L_0x0065:
            m150673a(r6, r7, r2)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48789j.m150670a(shark.internal.j$b, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        if ((((shark.internal.C48797k.C48802c) r0.mo123561b()).mo123564b() instanceof shark.C48714c.C48718d) != false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0108, code lost:
        if (r3.mo123497h().mo123484g() <= r10.f124039h) goto L_0x011a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0113, code lost:
        if (((shark.C48747i.C48756d) r3).f123906c != false) goto L_0x011a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011c A[RETURN] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m150679b(shark.internal.C48789j.C48791b r10, shark.internal.C48797k r11) {
        /*
            r9 = this;
            long r0 = r11.mo123560a()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000b
            return
        L_0x000b:
            shark.internal.b.d r0 = r10.f124036e
            long r1 = r11.mo123560a()
            boolean r0 = r0.mo123540b(r1)
            if (r0 == 0) goto L_0x0018
            return
        L_0x0018:
            java.util.HashSet<java.lang.Long> r0 = r10.f124034c
            long r1 = r11.mo123560a()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0029
            return
        L_0x0029:
            boolean r0 = r11 instanceof shark.internal.C48797k.C48801b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x005e
            boolean r0 = r11 instanceof shark.internal.C48797k.C48802c
            if (r0 == 0) goto L_0x003e
            r0 = r11
            shark.internal.k$c r0 = (shark.internal.C48797k.C48802c) r0
            shark.c r0 = r0.mo123564b()
            boolean r0 = r0 instanceof shark.C48714c.C48727m
            if (r0 != 0) goto L_0x005e
        L_0x003e:
            boolean r0 = r11 instanceof shark.internal.C48797k.C48798a.C48800b
            if (r0 == 0) goto L_0x005c
            r0 = r11
            shark.internal.k$a$b r0 = (shark.internal.C48797k.C48798a.C48800b) r0
            shark.internal.k r3 = r0.mo123561b()
            boolean r3 = r3 instanceof shark.internal.C48797k.C48802c
            if (r3 == 0) goto L_0x005c
            shark.internal.k r0 = r0.mo123561b()
            shark.internal.k$c r0 = (shark.internal.C48797k.C48802c) r0
            shark.c r0 = r0.mo123564b()
            boolean r0 = r0 instanceof shark.C48714c.C48718d
            if (r0 == 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = 0
            goto L_0x005f
        L_0x005e:
            r0 = 1
        L_0x005f:
            java.util.HashSet<java.lang.Long> r3 = r10.f124035d
            long r4 = r11.mo123560a()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00c6
            if (r0 == 0) goto L_0x0072
            return
        L_0x0072:
            java.util.Deque<shark.internal.k> r0 = r10.f124032a
            r0.add(r11)
            java.util.HashSet<java.lang.Long> r0 = r10.f124034c
            long r3 = r11.mo123560a()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r0.add(r3)
            java.util.Deque<shark.internal.k> r0 = r10.f124033b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x008c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00bc
            java.lang.Object r3 = r0.next()
            shark.internal.k r3 = (shark.internal.C48797k) r3
            long r4 = r3.mo123560a()
            long r6 = r11.mo123560a()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00a6
            r4 = 1
            goto L_0x00a7
        L_0x00a6:
            r4 = 0
        L_0x00a7:
            if (r4 == 0) goto L_0x008c
            java.util.Deque<shark.internal.k> r0 = r10.f124033b
            r0.remove(r3)
            java.util.HashSet<java.lang.Long> r10 = r10.f124035d
            long r0 = r11.mo123560a()
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r10.remove(r11)
            return
        L_0x00bc:
            java.util.NoSuchElementException r10 = new java.util.NoSuchElementException
            java.lang.String r11 = "Collection contains no element matching the predicate."
            r10.<init>(r11)
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            throw r10
        L_0x00c6:
            java.util.Set<java.lang.Long> r3 = r10.f124038g
            long r4 = r11.mo123560a()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 != 0) goto L_0x0123
            shark.h r3 = r9.f124028e
            long r4 = r11.mo123560a()
            shark.i r3 = r3.mo123471a(r4)
            boolean r4 = r3 instanceof shark.C48747i.C48749b
            if (r4 == 0) goto L_0x00e6
        L_0x00e4:
            r2 = 0
            goto L_0x011a
        L_0x00e6:
            boolean r4 = r3 instanceof shark.C48747i.C48752c
            if (r4 == 0) goto L_0x010b
            shark.i$c r3 = (shark.C48747i.C48752c) r3
            boolean r4 = r3.f123897e
            if (r4 == 0) goto L_0x00f1
            goto L_0x011a
        L_0x00f1:
            java.lang.String r4 = r3.mo123495f()
            java.lang.String r5 = "java.lang.String"
            boolean r4 = kotlin.jvm.internal.C7573i.m23585a(r4, r5)
            if (r4 == 0) goto L_0x00fe
            goto L_0x011a
        L_0x00fe:
            shark.i$b r3 = r3.mo123497h()
            int r3 = r3.mo123484g()
            int r4 = r10.f124039h
            if (r3 > r4) goto L_0x00e4
            goto L_0x011a
        L_0x010b:
            boolean r4 = r3 instanceof shark.C48747i.C48756d
            if (r4 == 0) goto L_0x0116
            shark.i$d r3 = (shark.C48747i.C48756d) r3
            boolean r3 = r3.f123906c
            if (r3 == 0) goto L_0x00e4
            goto L_0x011a
        L_0x0116:
            boolean r1 = r3 instanceof shark.C48747i.C48757e
            if (r1 == 0) goto L_0x011d
        L_0x011a:
            if (r2 == 0) goto L_0x0123
            return
        L_0x011d:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x0123:
            if (r0 == 0) goto L_0x0138
            java.util.Deque<shark.internal.k> r0 = r10.f124033b
            r0.add(r11)
            java.util.HashSet<java.lang.Long> r10 = r10.f124035d
            long r0 = r11.mo123560a()
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r10.add(r11)
            return
        L_0x0138:
            java.util.Deque<shark.internal.k> r0 = r10.f124032a
            r0.add(r11)
            java.util.HashSet<java.lang.Long> r10 = r10.f124034c
            long r0 = r11.mo123560a()
            java.lang.Long r11 = java.lang.Long.valueOf(r0)
            r10.add(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48789j.m150679b(shark.internal.j$b, shark.internal.k):void");
    }

    /* renamed from: a */
    private static void m150673a(C48791b bVar, long j, boolean z) {
        bVar.f124037f.mo123529a(j);
        if (z) {
            bVar.f124036e.mo123539a(j);
        }
    }

    public C48789j(C48746h hVar, OnAnalysisProgressListener onAnalysisProgressListener, List<? extends C48861w> list) {
        boolean z;
        C7573i.m23587b(hVar, "graph");
        C7573i.m23587b(onAnalysisProgressListener, "listener");
        C7573i.m23587b(list, "referenceMatchers");
        this.f124028e = hVar;
        this.f124029f = onAnalysisProgressListener;
        Map<String, Map<String, C48861w>> linkedHashMap = new LinkedHashMap<>();
        Map<String, Map<String, C48861w>> linkedHashMap2 = new LinkedHashMap<>();
        Map<String, C48861w> linkedHashMap3 = new LinkedHashMap<>();
        Map<String, C48861w> linkedHashMap4 = new LinkedHashMap<>();
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            C48861w wVar = (C48861w) next;
            if ((wVar instanceof C48851o) || ((wVar instanceof C48854r) && ((Boolean) ((C48854r) wVar).f124207b.invoke(this.f124028e)).booleanValue())) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        for (C48861w wVar2 : (List) arrayList) {
            ReferencePattern a = wVar2.mo123605a();
            if (a instanceof JavaLocalPattern) {
                linkedHashMap3.put(((JavaLocalPattern) a).getThreadName(), wVar2);
            } else if (a instanceof StaticFieldPattern) {
                StaticFieldPattern staticFieldPattern = (StaticFieldPattern) a;
                Map map = (Map) linkedHashMap2.get(staticFieldPattern.getClassName());
                if (map == null) {
                    map = new LinkedHashMap();
                    linkedHashMap2.put(staticFieldPattern.getClassName(), map);
                }
                map.put(staticFieldPattern.getFieldName(), wVar2);
            } else if (a instanceof InstanceFieldPattern) {
                InstanceFieldPattern instanceFieldPattern = (InstanceFieldPattern) a;
                Map map2 = (Map) linkedHashMap.get(instanceFieldPattern.getClassName());
                if (map2 == null) {
                    map2 = new LinkedHashMap();
                    linkedHashMap.put(instanceFieldPattern.getClassName(), map2);
                }
                map2.put(instanceFieldPattern.getFieldName(), wVar2);
            } else if (a instanceof NativeGlobalVariablePattern) {
                linkedHashMap4.put(((NativeGlobalVariablePattern) a).getClassName(), wVar2);
            }
        }
        this.f124024a = linkedHashMap;
        this.f124025b = linkedHashMap2;
        this.f124026c = linkedHashMap3;
        this.f124027d = linkedHashMap4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m150671a(shark.internal.C48789j.C48791b r16, long r17, long r19) {
        /*
            r15 = this;
            r0 = r15
            r4 = r19
            shark.h r1 = r0.f124028e
            shark.i r1 = r1.mo123471a(r4)
            boolean r2 = r1 instanceof shark.C48747i.C48749b
            r7 = 0
            if (r2 == 0) goto L_0x0014
            r14 = r16
            m150673a(r14, r4, r7)
            return
        L_0x0014:
            r14 = r16
            boolean r2 = r1 instanceof shark.C48747i.C48752c
            if (r2 == 0) goto L_0x0061
            r7 = r1
            shark.i$c r7 = (shark.C48747i.C48752c) r7
            java.lang.String r1 = r7.mo123495f()
            java.lang.String r2 = "java.lang.String"
            boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)
            if (r1 == 0) goto L_0x0056
            r6 = 1
            r1 = r16
            r2 = r17
            r4 = r19
            m150672a(r1, r2, r4, r6)
            java.lang.String r1 = "java.lang.String"
            java.lang.String r2 = "value"
            shark.g r1 = r7.mo123491a(r1, r2)
            if (r1 == 0) goto L_0x0046
            shark.k r1 = r1.f123887c
            if (r1 == 0) goto L_0x0046
            java.lang.Long r1 = r1.mo123579d()
            goto L_0x0047
        L_0x0046:
            r1 = 0
        L_0x0047:
            if (r1 == 0) goto L_0x00a1
            long r11 = r1.longValue()
            r13 = 1
            r8 = r16
            r9 = r17
            m150672a(r8, r9, r11, r13)
            return
        L_0x0056:
            r6 = 0
            r1 = r16
            r2 = r17
            r4 = r19
            m150672a(r1, r2, r4, r6)
            return
        L_0x0061:
            boolean r2 = r1 instanceof shark.C48747i.C48756d
            if (r2 == 0) goto L_0x0097
            r8 = r1
            shark.i$d r8 = (shark.C48747i.C48756d) r8
            boolean r1 = r8.f123906c
            if (r1 == 0) goto L_0x008c
            r6 = 1
            r1 = r16
            r2 = r17
            r4 = r19
            m150672a(r1, r2, r4, r6)
            shark.n$b$c$e r1 = r8.mo123479c()
            long[] r1 = r1.f124154d
            int r2 = r1.length
        L_0x007d:
            if (r7 >= r2) goto L_0x00a1
            r11 = r1[r7]
            r13 = 1
            r8 = r16
            r9 = r17
            m150672a(r8, r9, r11, r13)
            int r7 = r7 + 1
            goto L_0x007d
        L_0x008c:
            r6 = 0
            r1 = r16
            r2 = r17
            r4 = r19
            m150672a(r1, r2, r4, r6)
            return
        L_0x0097:
            r6 = 0
            r1 = r16
            r2 = r17
            r4 = r19
            m150672a(r1, r2, r4, r6)
        L_0x00a1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48789j.m150671a(shark.internal.j$b, long, long):void");
    }

    /* renamed from: a */
    private static void m150672a(C48791b bVar, long j, long j2, boolean z) {
        int b = bVar.f124037f.mo123533b(j2);
        if (b != -1 || (!bVar.f124036e.mo123540b(j2) && !bVar.f124034c.contains(Long.valueOf(j2)) && !bVar.f124035d.contains(Long.valueOf(j2)))) {
            int b2 = bVar.f124037f.mo123533b(j);
            boolean contains = bVar.f124038g.contains(Long.valueOf(j));
            if (contains || b2 != -1) {
                if (!contains) {
                    j = bVar.f124037f.mo123528a(b2);
                }
                if (b == -1) {
                    bVar.f124037f.mo123530a(j2, j);
                    return;
                }
                List arrayList = new ArrayList();
                List arrayList2 = new ArrayList();
                boolean z2 = false;
                long j3 = j;
                boolean z3 = false;
                while (!z3) {
                    arrayList.add(Long.valueOf(j3));
                    int b3 = bVar.f124037f.mo123533b(j3);
                    if (b3 == -1) {
                        z3 = true;
                    } else {
                        j3 = bVar.f124037f.mo123528a(b3);
                    }
                }
                long a = bVar.f124037f.mo123528a(b);
                while (!z2) {
                    arrayList2.add(Long.valueOf(a));
                    int b4 = bVar.f124037f.mo123533b(a);
                    if (b4 == -1) {
                        z2 = true;
                    } else {
                        a = bVar.f124037f.mo123528a(b4);
                    }
                }
                Long l = null;
                Iterator it = arrayList.iterator();
                loop2:
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    long longValue = ((Number) it.next()).longValue();
                    Iterator it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            long longValue2 = ((Number) it2.next()).longValue();
                            if (longValue2 == longValue) {
                                l = Long.valueOf(longValue2);
                                break loop2;
                            }
                        }
                    }
                }
                if (l == null) {
                    bVar.f124037f.mo123529a(j2);
                    if (z) {
                        bVar.f124036e.mo123539a(j2);
                        return;
                    }
                } else {
                    bVar.f124037f.mo123530a(j2, l.longValue());
                }
                return;
            }
            if (z) {
                bVar.f124036e.mo123539a(j2);
            }
            if (b != -1) {
                bVar.f124037f.mo123529a(j2);
            }
        }
    }
}
