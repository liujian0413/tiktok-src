package shark;

import java.io.Closeable;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.collections.C7513am;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.p1884io.C47973b;
import kotlin.sequences.C7605h;
import shark.C48714c.C48718d;
import shark.C48714c.C48719e;
import shark.C48714c.C48720f;
import shark.C48714c.C48721g;
import shark.C48714c.C48722h;
import shark.C48714c.C48723i;
import shark.C48714c.C48724j;
import shark.C48714c.C48725k;
import shark.C48714c.C48726l;
import shark.C48714c.C48727m;
import shark.C48747i.C48749b;
import shark.C48747i.C48752c;
import shark.C48747i.C48756d;
import shark.C48747i.C48757e;
import shark.C48813l.C48814a;
import shark.Hprof.C48694a;
import shark.LeakTraceElement.Holder;
import shark.OnAnalysisProgressListener.Step;
import shark.internal.C48789j;
import shark.internal.C48797k;
import shark.internal.C48797k.C48798a;
import shark.internal.C48797k.C48802c;
import shark.internal.C48807m;

/* renamed from: shark.e */
public final class C48732e {

    /* renamed from: a */
    private final OnAnalysisProgressListener f123862a;

    /* renamed from: shark.e$a */
    static final class C48733a {

        /* renamed from: a */
        public final C48746h f123863a;

        /* renamed from: b */
        public final List<C48855s> f123864b;

        /* renamed from: c */
        public final List<C48861w> f123865c;

        /* renamed from: d */
        public final boolean f123866d;

        /* renamed from: e */
        public final List<C48855s> f123867e;

        public C48733a(C48746h hVar, List<? extends C48855s> list, List<? extends C48861w> list2, boolean z, List<? extends C48855s> list3) {
            C7573i.m23587b(hVar, "graph");
            C7573i.m23587b(list, "leakFinders");
            C7573i.m23587b(list2, "referenceMatchers");
            C7573i.m23587b(list3, "objectInspectors");
            this.f123863a = hVar;
            this.f123864b = list;
            this.f123865c = list2;
            this.f123866d = z;
            this.f123867e = list3;
        }
    }

    /* renamed from: shark.e$b */
    public static abstract class C48734b {

        /* renamed from: shark.e$b$a */
        public static final class C48735a extends C48734b {

            /* renamed from: a */
            public final C48797k f123868a;

            /* renamed from: b */
            private final long f123869b;

            public C48735a(long j, C48797k kVar) {
                C7573i.m23587b(kVar, "pathNode");
                super(null);
                this.f123869b = j;
                this.f123868a = kVar;
            }
        }

        /* renamed from: shark.e$b$b */
        public static final class C48736b extends C48734b {

            /* renamed from: a */
            public final Map<Long, C48734b> f123870a = new LinkedHashMap();

            /* renamed from: b */
            private final long f123871b;

            /* renamed from: a */
            private long m150493a() {
                return this.f123871b;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ParentNode(objectId=");
                sb.append(m150493a());
                sb.append(", children=");
                sb.append(this.f123870a);
                sb.append(')');
                return sb.toString();
            }

            public C48736b(long j) {
                super(null);
                this.f123871b = j;
            }
        }

        private C48734b() {
        }

        public /* synthetic */ C48734b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: shark.e$c */
    static final class C48737c extends Lambda implements C7562b<C48752c, Boolean> {

        /* renamed from: a */
        public static final C48737c f123872a = new C48737c();

        C48737c() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m150494a(C48752c cVar) {
            C7573i.m23587b(cVar, "it");
            return C7573i.m23585a((Object) cVar.mo123495f(), (Object) "sun.misc.Cleaner");
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m150494a((C48752c) obj));
        }
    }

    /* renamed from: shark.e$d */
    static final class C48738d extends Lambda implements C7563m<Long, Long, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C48733a f123873a;

        /* renamed from: b */
        final /* synthetic */ Set f123874b;

        /* renamed from: c */
        final /* synthetic */ Map f123875c;

        /* renamed from: d */
        final /* synthetic */ Map f123876d;

        C48738d(C48733a aVar, Set set, Map map, Map map2) {
            this.f123873a = aVar;
            this.f123874b = set;
            this.f123875c = map;
            this.f123876d = map2;
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            m150495a(((Number) obj).longValue(), ((Number) obj2).longValue());
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m150495a(long j, long j2) {
            int i;
            if (!this.f123874b.contains(Long.valueOf(j))) {
                int intValue = ((Number) C7507ae.m23398b(this.f123875c, Long.valueOf(j2))).intValue();
                int intValue2 = ((Number) C7507ae.m23398b(this.f123876d, Long.valueOf(j))).intValue();
                C48747i a = this.f123873a.f123863a.mo123471a(j);
                if (a instanceof C48752c) {
                    i = ((C48752c) a).mo123494e();
                } else if (a instanceof C48756d) {
                    i = ((C48756d) a).mo123503f();
                } else if (a instanceof C48757e) {
                    i = ((C48757e) a).mo123506e();
                } else if (a instanceof C48749b) {
                    StringBuilder sb = new StringBuilder("Unexpected class record ");
                    sb.append(a);
                    throw new IllegalStateException(sb.toString());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                this.f123875c.put(Long.valueOf(j2), Integer.valueOf(intValue + intValue2 + i));
            }
        }
    }

    /* renamed from: shark.e$e */
    static final class C48739e extends Lambda implements C7562b<Long, Integer> {

        /* renamed from: a */
        public static final C48739e f123877a = new C48739e();

        C48739e() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return Integer.valueOf(0);
        }
    }

    /* renamed from: shark.e$f */
    static final class C48740f extends Lambda implements C7562b<Long, Integer> {

        /* renamed from: a */
        public static final C48740f f123878a = new C48740f();

        C48740f() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((Number) obj).longValue();
            return Integer.valueOf(0);
        }
    }

    /* renamed from: shark.e$g */
    static final class C48741g extends Lambda implements C7562b<C48747i, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C48733a f123879a;

        C48741g(C48733a aVar) {
            this.f123879a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m150496a((C48747i) obj));
        }

        /* renamed from: a */
        private boolean m150496a(C48747i iVar) {
            C7573i.m23587b(iVar, "objectRecord");
            C48857t tVar = new C48857t(iVar);
            Iterable<C48855s> iterable = this.f123879a.f123864b;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                for (C48855s a : iterable) {
                    a.mo123342a(tVar);
                    if (!tVar.f124212b.isEmpty()) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /* renamed from: shark.e$h */
    static final class C48742h extends Lambda implements C7562b<C48747i, Long> {

        /* renamed from: a */
        public static final C48742h f123880a = new C48742h();

        C48742h() {
            super(1);
        }

        /* renamed from: a */
        private static long m150497a(C48747i iVar) {
            C7573i.m23587b(iVar, "it");
            return iVar.mo123478b();
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Long.valueOf(m150497a((C48747i) obj));
        }
    }

    /* renamed from: shark.e$i */
    static final class C48743i extends Lambda implements C7561a<C48736b> {

        /* renamed from: a */
        final /* synthetic */ long f123881a;

        /* renamed from: b */
        final /* synthetic */ C48736b f123882b;

        C48743i(long j, C48736b bVar) {
            this.f123881a = j;
            this.f123882b = bVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C48736b invoke() {
            C48736b bVar = new C48736b(this.f123881a);
            this.f123882b.f123870a.put(Long.valueOf(this.f123881a), bVar);
            return bVar;
        }
    }

    /* renamed from: a */
    private final void m150490a(C48797k kVar, List<Long> list, int i, C48736b bVar) {
        while (true) {
            long longValue = ((Number) list.get(i)).longValue();
            if (i == C7525m.m23459a(list)) {
                bVar.f123870a.put(Long.valueOf(longValue), new C48735a(longValue, kVar));
                return;
            }
            C48734b bVar2 = (C48734b) bVar.f123870a.get(Long.valueOf(longValue));
            if (bVar2 == null) {
                bVar2 = (C48734b) new C48743i(longValue, bVar).invoke();
            }
            if (bVar2 instanceof C48736b) {
                i++;
                bVar = (C48736b) bVar2;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final void m150489a(C48736b bVar, List<C48797k> list) {
        for (C48734b bVar2 : bVar.f123870a.values()) {
            if (bVar2 instanceof C48736b) {
                m150489a((C48736b) bVar2, list);
            } else if (bVar2 instanceof C48735a) {
                list.add(((C48735a) bVar2).f123868a);
            }
        }
    }

    /* renamed from: a */
    private final LeakTrace m150487a(C48746h hVar, List<? extends C48855s> list, C48802c cVar, List<? extends C48798a> list2) {
        LeakReference leakReference;
        C48802c cVar2 = cVar;
        List d = C7525m.m23509d((Collection<? extends T>) list2);
        int i = 0;
        d.add(0, cVar2);
        Iterable<C48797k> iterable = d;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        for (C48797k a : iterable) {
            arrayList.add(new C48857t(hVar.mo123471a(a.mo123560a())));
        }
        C48746h hVar2 = hVar;
        List<C48857t> list3 = (List) arrayList;
        for (C48855s sVar : list) {
            for (C48857t a2 : list3) {
                sVar.mo123342a(a2);
            }
        }
        List a3 = m150482a(cVar2, list3);
        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            C48797k kVar = (C48797k) next;
            C48857t tVar = (C48857t) list3.get(i);
            Pair pair = (Pair) a3.get(i);
            LeakNodeStatus leakNodeStatus = (LeakNodeStatus) pair.component1();
            String str = (String) pair.component2();
            if (i < C7525m.m23459a(d)) {
                Object obj = d.get(i2);
                if (obj != null) {
                    leakReference = ((C48798a) obj).mo123562c();
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type shark.internal.ReferencePathNode.ChildNode");
                }
            } else {
                leakReference = null;
            }
            arrayList2.add(m150488a(hVar, kVar, leakReference, (Set<String>) tVar.f124211a, leakNodeStatus, str));
            i = i2;
        }
        return new LeakTrace((List) arrayList2);
    }

    /* renamed from: a */
    private final LeakTraceElement m150488a(C48746h hVar, C48797k kVar, LeakReference leakReference, Set<String> set, LeakNodeStatus leakNodeStatus, String str) {
        Holder holder;
        boolean z;
        C48747i a = hVar.mo123471a(kVar.mo123560a());
        String a2 = m150479a(a);
        if (a instanceof C48749b) {
            holder = Holder.CLASS;
        } else if ((a instanceof C48756d) || (a instanceof C48757e)) {
            holder = Holder.ARRAY;
        } else {
            C48752c d = a.mo123480d();
            if (d == null) {
                C7573i.m23580a();
            }
            Iterator a3 = d.mo123497h().mo123487j().mo19416a();
            while (true) {
                if (a3.hasNext()) {
                    if (C7573i.m23585a((Object) ((C48749b) a3.next()).mo123482e(), (Object) Thread.class.getName())) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                holder = Holder.THREAD;
            } else {
                holder = Holder.OBJECT;
            }
        }
        LeakTraceElement leakTraceElement = new LeakTraceElement(leakReference, holder, a2, set, leakNodeStatus, str);
        return leakTraceElement;
    }

    public C48732e(OnAnalysisProgressListener onAnalysisProgressListener) {
        C7573i.m23587b(onAnalysisProgressListener, "listener");
        this.f123862a = onAnalysisProgressListener;
    }

    /* renamed from: a */
    private static long m150478a(long j) {
        return TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
    }

    /* renamed from: a */
    private final Pair<List<ApplicationLeak>, List<LibraryLeak>> m150483a(C48733a aVar) {
        return m150492b(aVar, new C48789j(aVar.f123863a, this.f123862a, aVar.f123865c).mo123556a(m150491b(aVar), aVar.f123866d));
    }

    /* renamed from: a */
    private static String m150479a(C48747i iVar) {
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

    /* renamed from: b */
    private final Set<Long> m150491b(C48733a aVar) {
        this.f123862a.mo83581a(Step.FINDING_LEAKING_INSTANCES);
        return C7605h.m23666j(C7605h.m23659d(C7605h.m23653a(aVar.f123863a.mo123475d(), (C7562b<? super T, Boolean>) new C48741g<Object,Boolean>(aVar)), C48742h.f123880a));
    }

    /* renamed from: a */
    private final List<C48797k> m150480a(List<? extends C48797k> list) {
        C48736b bVar = new C48736b(0);
        for (C48797k kVar : list) {
            List arrayList = new ArrayList();
            C48797k kVar2 = kVar;
            while (kVar2 instanceof C48798a) {
                arrayList.add(0, Long.valueOf(kVar2.mo123560a()));
                kVar2 = ((C48798a) kVar2).mo123561b();
            }
            arrayList.add(0, Long.valueOf(kVar2.mo123560a()));
            m150490a(kVar, arrayList, 0, bVar);
        }
        List<C48797k> arrayList2 = new ArrayList<>();
        m150489a(bVar, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    private static Pair<LeakNodeStatus, String> m150484a(C48857t tVar) {
        LeakNodeStatus leakNodeStatus = LeakNodeStatus.UNKNOWN;
        String str = "";
        if (!tVar.f124214d.isEmpty()) {
            leakNodeStatus = LeakNodeStatus.NOT_LEAKING;
            str = C7525m.m23492a(tVar.f124214d, " and ", null, null, 0, null, null, 62, null);
        }
        Set a = C7513am.m23412a(tVar.f124212b, (Iterable<? extends T>) tVar.f124213c);
        if (!a.isEmpty()) {
            if (leakNodeStatus == LeakNodeStatus.NOT_LEAKING) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(". Conflicts with ");
                sb.append(C7525m.m23492a(a, " and ", null, null, 0, null, null, 62, null));
                str = sb.toString();
            } else {
                leakNodeStatus = LeakNodeStatus.LEAKING;
                str = C7525m.m23492a(a, " and ", null, null, 0, null, null, 62, null);
            }
        }
        return C7579l.m23633a(leakNodeStatus, str);
    }

    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final kotlin.Pair<java.util.List<shark.ApplicationLeak>, java.util.List<shark.LibraryLeak>> m150492b(shark.C48732e.C48733a r21, shark.internal.C48789j.C48790a r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.util.List r2 = r20.m150481a(r21, r22)
            shark.OnAnalysisProgressListener r3 = r0.f123862a
            shark.OnAnalysisProgressListener$Step r4 = shark.OnAnalysisProgressListener.Step.BUILDING_LEAK_TRACES
            r3.mo83581a(r4)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.List r3 = (java.util.List) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r5 = r22
            java.util.List<shark.internal.k> r5 = r5.f124030a
            java.util.List r5 = r0.m150480a(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
            r7 = 0
        L_0x002d:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x00da
            java.lang.Object r8 = r5.next()
            int r9 = r7 + 1
            if (r7 >= 0) goto L_0x003e
            kotlin.collections.C7525m.m23465b()
        L_0x003e:
            shark.internal.k r8 = (shark.internal.C48797k) r8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.List r10 = (java.util.List) r10
            r11 = r8
        L_0x0048:
            boolean r12 = r11 instanceof shark.internal.C48797k.C48798a
            if (r12 == 0) goto L_0x0056
            r10.add(r6, r11)
            shark.internal.k$a r11 = (shark.internal.C48797k.C48798a) r11
            shark.internal.k r11 = r11.mo123561b()
            goto L_0x0048
        L_0x0056:
            if (r11 == 0) goto L_0x00d2
            shark.internal.k$c r11 = (shark.internal.C48797k.C48802c) r11
            shark.h r12 = r1.f123863a
            java.util.List<shark.s> r13 = r1.f123867e
            shark.LeakTrace r12 = r0.m150487a(r12, r13, r11, r10)
            shark.h r13 = r1.f123863a
            long r14 = r8.mo123560a()
            shark.i r8 = r13.mo123471a(r14)
            java.lang.String r15 = m150479a(r8)
            boolean r8 = r11 instanceof shark.internal.C48797k.C48801b
            r13 = 0
            if (r8 == 0) goto L_0x0076
            goto L_0x008f
        L_0x0076:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r8 = r10.iterator()
        L_0x007c:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x008e
            java.lang.Object r11 = r8.next()
            r10 = r11
            shark.internal.k$a r10 = (shark.internal.C48797k.C48798a) r10
            boolean r10 = r10 instanceof shark.internal.C48797k.C48801b
            if (r10 == 0) goto L_0x007c
            goto L_0x008f
        L_0x008e:
            r11 = r13
        L_0x008f:
            shark.internal.k$b r11 = (shark.internal.C48797k.C48801b) r11
            if (r11 == 0) goto L_0x00bb
            shark.r r8 = r11.mo123563d()
            r10 = r4
            java.util.Collection r10 = (java.util.Collection) r10
            shark.LibraryLeak r11 = new shark.LibraryLeak
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r7 = r2.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            r17 = r7
            goto L_0x00a9
        L_0x00a7:
            r17 = r13
        L_0x00a9:
            shark.ReferencePattern r18 = r8.mo123605a()
            java.lang.String r7 = r8.f124206a
            r14 = r11
            r16 = r12
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            r10.add(r11)
            goto L_0x00cf
        L_0x00bb:
            r8 = r3
            java.util.Collection r8 = (java.util.Collection) r8
            shark.ApplicationLeak r10 = new shark.ApplicationLeak
            if (r2 == 0) goto L_0x00c9
            java.lang.Object r7 = r2.get(r7)
            r13 = r7
            java.lang.Integer r13 = (java.lang.Integer) r13
        L_0x00c9:
            r10.<init>(r15, r12, r13)
            r8.add(r10)
        L_0x00cf:
            r7 = r9
            goto L_0x002d
        L_0x00d2:
            kotlin.TypeCastException r1 = new kotlin.TypeCastException
            java.lang.String r2 = "null cannot be cast to non-null type shark.internal.ReferencePathNode.RootNode"
            r1.<init>(r2)
            throw r1
        L_0x00da:
            kotlin.Pair r1 = kotlin.C7579l.m23633a(r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.C48732e.m150492b(shark.e$a, shark.internal.j$a):kotlin.Pair");
    }

    /* renamed from: a */
    private final List<Pair<LeakNodeStatus, String>> m150482a(C48802c cVar, List<C48857t> list) {
        String str;
        Pair pair;
        Pair pair2;
        int size = list.size() - 1;
        int i = 0;
        Collection collection = ((C48857t) list.get(0)).f124211a;
        StringBuilder sb = new StringBuilder("GC Root: ");
        C48714c b = cVar.mo123564b();
        if (b instanceof C48727m) {
            str = "Thread object";
        } else if (b instanceof C48719e) {
            str = "Global variable in native code";
        } else if (b instanceof C48720f) {
            str = "Local variable in native code";
        } else if (b instanceof C48718d) {
            str = "Java local variable";
        } else if (b instanceof C48723i) {
            str = "Input or output parameters in native code";
        } else if (b instanceof C48725k) {
            str = "System class";
        } else if (b instanceof C48726l) {
            str = "Thread block";
        } else if (b instanceof C48722h) {
            str = "Monitor (anything that called the wait() or notify() methods, or that is synchronized.)";
        } else if (b instanceof C48724j) {
            str = "Reference cleanup";
        } else if (b instanceof C48721g) {
            str = "Root JNI monitor";
        } else {
            StringBuilder sb2 = new StringBuilder("Unexpected gc root ");
            sb2.append(cVar.mo123564b());
            throw new IllegalStateException(sb2.toString());
        }
        sb.append(str);
        collection.add(sb.toString());
        ArrayList arrayList = new ArrayList();
        Iterable<C48857t> iterable = list;
        int i2 = size;
        int i3 = 0;
        int i4 = 0;
        for (C48857t a : iterable) {
            Pair a2 = m150484a(a);
            arrayList.add(a2);
            LeakNodeStatus leakNodeStatus = (LeakNodeStatus) a2.component1();
            if (leakNodeStatus == LeakNodeStatus.NOT_LEAKING) {
                i2 = size;
                i4 = i3;
            } else if (i2 == size && leakNodeStatus == LeakNodeStatus.LEAKING) {
                i2 = i3;
            }
            i3++;
        }
        Collection arrayList2 = new ArrayList(C7525m.m23469a(iterable, 10));
        for (C48857t tVar : iterable) {
            arrayList2.add(C48807m.m150710a(m150479a(tVar.f124215e), '.'));
        }
        List list2 = (List) arrayList2;
        if (size >= 0) {
            while (true) {
                Pair pair3 = (Pair) arrayList.get(i);
                LeakNodeStatus leakNodeStatus2 = (LeakNodeStatus) pair3.component1();
                String str2 = (String) pair3.component2();
                if (i < i4) {
                    String str3 = (String) list2.get(i + 1);
                    switch (C48744f.f123883a[leakNodeStatus2.ordinal()]) {
                        case 1:
                            LeakNodeStatus leakNodeStatus3 = LeakNodeStatus.NOT_LEAKING;
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str3);
                            sb3.append("↓ is not leaking");
                            pair2 = C7579l.m23633a(leakNodeStatus3, sb3.toString());
                            break;
                        case 2:
                            LeakNodeStatus leakNodeStatus4 = LeakNodeStatus.NOT_LEAKING;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            sb4.append("↓ is not leaking and ");
                            sb4.append(str2);
                            pair2 = C7579l.m23633a(leakNodeStatus4, sb4.toString());
                            break;
                        case 3:
                            LeakNodeStatus leakNodeStatus5 = LeakNodeStatus.NOT_LEAKING;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append(str3);
                            sb5.append("↓ is not leaking. Conflicts with ");
                            sb5.append(str2);
                            pair2 = C7579l.m23633a(leakNodeStatus5, sb5.toString());
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.set(i, pair2);
                } else if (i > i2) {
                    String str4 = (String) list2.get(i - 1);
                    switch (C48744f.f123884b[leakNodeStatus2.ordinal()]) {
                        case 1:
                            LeakNodeStatus leakNodeStatus6 = LeakNodeStatus.LEAKING;
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append(str4);
                            sb6.append("↑ is leaking");
                            pair = C7579l.m23633a(leakNodeStatus6, sb6.toString());
                            break;
                        case 2:
                            LeakNodeStatus leakNodeStatus7 = LeakNodeStatus.LEAKING;
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append(str4);
                            sb7.append("↑ is leaking and ");
                            sb7.append(str2);
                            pair = C7579l.m23633a(leakNodeStatus7, sb7.toString());
                            break;
                        case 3:
                            throw new IllegalStateException("Should never happen");
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    arrayList.set(i, pair);
                }
                if (i != size) {
                    i++;
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0032 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<java.lang.Integer> m150481a(shark.C48732e.C48733a r11, shark.internal.C48789j.C48790a r12) {
        /*
            r10 = this;
            boolean r0 = r11.f123866d
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.List<shark.internal.k> r0 = r12.f124030a
            shark.internal.b.b r12 = r12.f124031b
            shark.OnAnalysisProgressListener r2 = r10.f123862a
            shark.OnAnalysisProgressListener$Step r3 = shark.OnAnalysisProgressListener.Step.COMPUTING_NATIVE_RETAINED_SIZE
            r2.mo83581a(r3)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.util.Map r2 = (java.util.Map) r2
            shark.e$e r3 = shark.C48732e.C48739e.f123877a
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            java.util.Map r2 = kotlin.collections.C7507ae.m23383a(r2, r3)
            shark.h r3 = r11.f123863a
            kotlin.sequences.g r3 = r3.mo123476e()
            shark.e$c r4 = shark.C48732e.C48737c.f123872a
            kotlin.jvm.a.b r4 = (kotlin.jvm.p357a.C7562b) r4
            kotlin.sequences.g r3 = kotlin.sequences.C7605h.m23653a(r3, r4)
            java.util.Iterator r3 = r3.mo19416a()
        L_0x0032:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x00d2
            java.lang.Object r4 = r3.next()
            shark.i$c r4 = (shark.C48747i.C48752c) r4
            java.lang.String r6 = "sun.misc.Cleaner"
            java.lang.String r7 = "thunk"
            shark.g r6 = r4.mo123491a(r6, r7)
            if (r6 == 0) goto L_0x0052
            shark.k r7 = r6.f123887c
            if (r7 == 0) goto L_0x0052
            java.lang.Long r7 = r7.mo123580e()
            goto L_0x0053
        L_0x0052:
            r7 = r1
        L_0x0053:
            java.lang.String r8 = "java.lang.ref.Reference"
            java.lang.String r9 = "referent"
            shark.g r4 = r4.mo123491a(r8, r9)
            if (r4 == 0) goto L_0x0066
            shark.k r4 = r4.f123887c
            if (r4 == 0) goto L_0x0066
            java.lang.Long r4 = r4.mo123580e()
            goto L_0x0067
        L_0x0066:
            r4 = r1
        L_0x0067:
            if (r7 == 0) goto L_0x0032
            if (r4 == 0) goto L_0x0032
            shark.k r6 = r6.f123887c
            shark.i r6 = r6.mo123583h()
            boolean r7 = r6 instanceof shark.C48747i.C48752c
            if (r7 == 0) goto L_0x0032
            shark.i$c r6 = (shark.C48747i.C48752c) r6
            java.lang.String r7 = "libcore.util.NativeAllocationRegistry$CleanerThunk"
            boolean r7 = r6.mo123493a(r7)
            if (r7 == 0) goto L_0x0032
            java.lang.String r7 = "libcore.util.NativeAllocationRegistry$CleanerThunk"
            java.lang.String r8 = "this$0"
            shark.g r6 = r6.mo123491a(r7, r8)
            if (r6 == 0) goto L_0x0032
            shark.k r7 = r6.f123887c
            boolean r7 = r7.mo123582g()
            if (r7 == 0) goto L_0x0032
            shark.k r6 = r6.f123887c
            shark.i r6 = r6.mo123583h()
            boolean r7 = r6 instanceof shark.C48747i.C48752c
            if (r7 == 0) goto L_0x0032
            shark.i$c r6 = (shark.C48747i.C48752c) r6
            java.lang.String r7 = "libcore.util.NativeAllocationRegistry"
            boolean r7 = r6.mo123493a(r7)
            if (r7 == 0) goto L_0x0032
            java.lang.Object r7 = kotlin.collections.C7507ae.m23398b(r2, r4)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.String r8 = "libcore.util.NativeAllocationRegistry"
            java.lang.String r9 = "size"
            shark.g r6 = r6.mo123491a(r8, r9)
            if (r6 == 0) goto L_0x00c8
            shark.k r6 = r6.f123887c
            if (r6 == 0) goto L_0x00c8
            java.lang.Long r6 = r6.mo123578c()
            if (r6 == 0) goto L_0x00c8
            long r5 = r6.longValue()
            int r5 = (int) r5
        L_0x00c8:
            int r7 = r7 + r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r2.put(r4, r5)
            goto L_0x0032
        L_0x00d2:
            shark.OnAnalysisProgressListener r1 = r10.f123862a
            shark.OnAnalysisProgressListener$Step r3 = shark.OnAnalysisProgressListener.Step.COMPUTING_RETAINED_SIZE
            r1.mo83581a(r3)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.util.Map r1 = (java.util.Map) r1
            shark.e$f r3 = shark.C48732e.C48740f.f123878a
            kotlin.jvm.a.b r3 = (kotlin.jvm.p357a.C7562b) r3
            java.util.Map r1 = kotlin.collections.C7507ae.m23383a(r1, r3)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x00f5:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x013e
            java.lang.Object r6 = r4.next()
            shark.internal.k r6 = (shark.internal.C48797k) r6
            long r6 = r6.mo123560a()
            java.lang.Long r8 = java.lang.Long.valueOf(r6)
            r3.add(r8)
            shark.h r8 = r11.f123863a
            shark.i r8 = r8.mo123471a(r6)
            shark.i$c r8 = r8.mo123480d()
            if (r8 != 0) goto L_0x011b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x011b:
            shark.i$b r8 = r8.mo123497h()
            java.lang.Long r9 = java.lang.Long.valueOf(r6)
            java.lang.Object r9 = kotlin.collections.C7507ae.m23398b(r1, r9)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r8 = r8.mo123484g()
            int r9 = r9 + r8
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r1.put(r6, r7)
            goto L_0x00f5
        L_0x013e:
            shark.e$d r4 = new shark.e$d
            r4.<init>(r11, r3, r1, r2)
            kotlin.jvm.a.m r4 = (kotlin.jvm.p357a.C7563m) r4
            r12.mo123532a(r4)
            kotlin.jvm.internal.Ref$BooleanRef r11 = new kotlin.jvm.internal.Ref$BooleanRef
            r11.<init>()
        L_0x014d:
            r11.element = r5
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.C7525m.m23469a(r0, r3)
            r2.<init>(r4)
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r4 = r0.iterator()
        L_0x0160:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0178
            java.lang.Object r6 = r4.next()
            shark.internal.k r6 = (shark.internal.C48797k) r6
            long r6 = r6.mo123560a()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r2.add(r6)
            goto L_0x0160
        L_0x0178:
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L_0x0180:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01d4
            java.lang.Object r4 = r2.next()
            java.lang.Number r4 = (java.lang.Number) r4
            long r6 = r4.longValue()
            int r4 = r12.mo123533b(r6)
            r8 = -1
            if (r4 == r8) goto L_0x0180
            long r8 = r12.mo123528a(r4)
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.Object r4 = kotlin.collections.C7507ae.m23398b(r1, r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0180
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            r1.put(r6, r7)
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            java.lang.Object r6 = kotlin.collections.C7507ae.m23398b(r1, r6)
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            int r4 = r4 + r6
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.put(r7, r4)
            r4 = 1
            r11.element = r4
            goto L_0x0180
        L_0x01d4:
            boolean r2 = r11.element
            if (r2 != 0) goto L_0x014d
            r12.mo123534b()
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.C7525m.m23469a(r0, r3)
            r11.<init>(r12)
            java.util.Collection r11 = (java.util.Collection) r11
            java.util.Iterator r12 = r0.iterator()
        L_0x01ea:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0215
            java.lang.Object r0 = r12.next()
            shark.internal.k r0 = (shark.internal.C48797k) r0
            long r2 = r0.mo123560a()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x0207
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0207:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.add(r0)
            goto L_0x01ea
        L_0x0215:
            java.util.List r11 = (java.util.List) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.C48732e.m150481a(shark.e$a, shark.internal.j$a):java.util.List");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public HeapAnalysis m150485a(File file, List<? extends C48861w> list, boolean z, List<? extends C48855s> list2, List<? extends C48855s> list3, C48860v vVar) {
        Closeable a;
        Throwable th;
        File file2 = file;
        C7573i.m23587b(file2, "heapDumpFile");
        C7573i.m23587b(list, "referenceMatchers");
        C7573i.m23587b(list2, "objectInspectors");
        C7573i.m23587b(list3, "leakFinders");
        long nanoTime = System.nanoTime();
        if (!file.exists()) {
            StringBuilder sb = new StringBuilder("File does not exist: ");
            sb.append(file2);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
            this.f123862a.mo83581a(Step.REPORTING_HEAP_ANALYSIS);
            HeapAnalysisFailure heapAnalysisFailure = new HeapAnalysisFailure(file, System.currentTimeMillis(), m150478a(nanoTime), new HeapAnalysisException(illegalArgumentException));
            return heapAnalysisFailure;
        }
        try {
            this.f123862a.mo83581a(Step.PARSING_HEAP_DUMP);
            a = C48694a.m150437a(file);
            C48733a aVar = new C48733a(C48814a.m150751a((Hprof) a, vVar), list3, list, z, list2);
            Pair a2 = m150483a(aVar);
            List list4 = (List) a2.component1();
            List list5 = (List) a2.component2();
            this.f123862a.mo83581a(Step.REPORTING_HEAP_ANALYSIS);
            HeapAnalysisSuccess heapAnalysisSuccess = new HeapAnalysisSuccess(file, System.currentTimeMillis(), m150478a(nanoTime), list4, list5);
            HeapAnalysis heapAnalysis = heapAnalysisSuccess;
            C47973b.m148917a(a, null);
            return heapAnalysis;
        } catch (Throwable th2) {
            this.f123862a.mo83581a(Step.REPORTING_HEAP_ANALYSIS);
            HeapAnalysisFailure heapAnalysisFailure2 = new HeapAnalysisFailure(file, System.currentTimeMillis(), m150478a(nanoTime), new HeapAnalysisException(th2));
            return heapAnalysisFailure2;
        }
    }
}
