package shark;

import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.sequences.C7605h;
import kotlin.text.Regex;
import shark.C48747i.C48749b;
import shark.C48747i.C48752c;
import shark.internal.C48784f;
import shark.internal.C48784f.C48785a;

public enum ObjectInspectors implements C48855s {
    ;
    
    public static final Regex ANONYMOUS_CLASS_NAME_PATTERN_REGEX = null;
    public static final C48699d Companion = null;

    /* renamed from: shark.ObjectInspectors$a */
    static final class C48695a extends ObjectInspectors {
        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            boolean z;
            String str;
            C7573i.m23587b(tVar, "reporter");
            C48747i iVar = tVar.f124215e;
            if (iVar instanceof C48752c) {
                C48749b h = ((C48752c) iVar).mo123497h();
                if (ObjectInspectors.ANONYMOUS_CLASS_NAME_PATTERN_REGEX.matches(h.mo123482e())) {
                    C48749b i = h.mo123486i();
                    if (i == null) {
                        C7573i.m23580a();
                    }
                    if (C7573i.m23585a((Object) i.mo123482e(), (Object) "java.lang.Object")) {
                        try {
                            Class cls = Class.forName(h.mo123482e());
                            C7573i.m23582a((Object) cls, "actualClass");
                            Class[] interfaces = cls.getInterfaces();
                            Collection collection = tVar.f124211a;
                            C7573i.m23582a((Object) interfaces, "interfaces");
                            if (interfaces.length == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                Class cls2 = interfaces[0];
                                StringBuilder sb = new StringBuilder("Anonymous class implementing ");
                                C7573i.m23582a((Object) cls2, "implementedInterface");
                                sb.append(cls2.getName());
                                str = sb.toString();
                            } else {
                                str = "Anonymous subclass of java.lang.Object";
                            }
                            collection.add(str);
                        } catch (ClassNotFoundException unused) {
                        }
                    } else {
                        Collection collection2 = tVar.f124211a;
                        StringBuilder sb2 = new StringBuilder("Anonymous subclass of ");
                        sb2.append(i.mo123482e());
                        collection2.add(sb2.toString());
                    }
                }
            }
        }

        C48695a(String str, int i) {
            super(str, 3, null);
        }
    }

    /* renamed from: shark.ObjectInspectors$b */
    static final class C48696b extends ObjectInspectors {
        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            if (tVar.f124215e instanceof C48749b) {
                tVar.f124214d.add("a class is never leaking");
            }
        }

        C48696b(String str, int i) {
            super(str, 2, null);
        }
    }

    /* renamed from: shark.ObjectInspectors$c */
    static final class C48697c extends ObjectInspectors {

        /* renamed from: shark.ObjectInspectors$c$a */
        static final class C48698a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48698a f123820a = null;

            static {
                f123820a = new C48698a();
            }

            C48698a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150441a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150441a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "it");
                tVar.f124214d.add("A ClassLoader is never leaking");
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123610a(C7575l.m23595a(ClassLoader.class), (C7563m<? super C48857t, ? super C48752c, C7581n>) C48698a.f123820a);
        }

        C48697c(String str, int i) {
            super(str, 1, null);
        }
    }

    /* renamed from: shark.ObjectInspectors$d */
    public static final class C48699d {
        private C48699d() {
        }

        /* renamed from: a */
        public static List<C48855s> m150442a() {
            return C7519g.m23447d((T[]) ObjectInspectors.values());
        }

        public /* synthetic */ C48699d(C7571f fVar) {
            this();
        }
    }

    /* renamed from: shark.ObjectInspectors$e */
    static final class C48700e extends ObjectInspectors {

        /* renamed from: shark.ObjectInspectors$e$a */
        static final class C48701a extends Lambda implements C7561a<List<? extends C48784f>> {

            /* renamed from: a */
            final /* synthetic */ C48700e f123821a;

            /* renamed from: b */
            final /* synthetic */ C48746h f123822b;

            /* renamed from: shark.ObjectInspectors$e$a$a */
            static final class C48702a extends Lambda implements C7562b<C48752c, Boolean> {

                /* renamed from: a */
                public static final C48702a f123823a = null;

                static {
                    f123823a = new C48702a();
                }

                C48702a() {
                    super(1);
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(m150445a((C48752c) obj));
                }

                /* renamed from: a */
                private static boolean m150445a(C48752c cVar) {
                    C7573i.m23587b(cVar, "instance");
                    String f = cVar.mo123495f();
                    if (C7573i.m23585a((Object) f, (Object) "leakcanary.KeyedWeakReference") || C7573i.m23585a((Object) f, (Object) "com.squareup.leakcanary.KeyedWeakReference")) {
                        return true;
                    }
                    return false;
                }
            }

            /* renamed from: shark.ObjectInspectors$e$a$b */
            static final class C48703b extends Lambda implements C7562b<C48752c, C48784f> {

                /* renamed from: a */
                final /* synthetic */ Long f123824a;

                C48703b(Long l) {
                    this.f123824a = l;
                    super(1);
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public C48784f invoke(C48752c cVar) {
                    C7573i.m23587b(cVar, "it");
                    return C48785a.m150662a(cVar, this.f123824a);
                }
            }

            /* renamed from: shark.ObjectInspectors$e$a$c */
            static final class C48704c extends Lambda implements C7562b<C48784f, Boolean> {

                /* renamed from: a */
                public static final C48704c f123825a = null;

                static {
                    f123825a = new C48704c();
                }

                C48704c() {
                    super(1);
                }

                /* renamed from: a */
                private static boolean m150447a(C48784f fVar) {
                    C7573i.m23587b(fVar, "it");
                    return fVar.f124010a;
                }

                public final /* synthetic */ Object invoke(Object obj) {
                    return Boolean.valueOf(m150447a((C48784f) obj));
                }
            }

            C48701a(C48700e eVar, C48746h hVar) {
                this.f123821a = eVar;
                this.f123822b = hVar;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<C48784f> invoke() {
                C48749b a = this.f123822b.mo123470a("leakcanary.KeyedWeakReference");
                Long l = null;
                if (a != null) {
                    C48745g a2 = a.mo123481a("heapDumpUptimeMillis");
                    if (a2 != null) {
                        C48812k kVar = a2.f123887c;
                        if (kVar != null) {
                            l = kVar.mo123578c();
                        }
                    }
                }
                List<C48784f> h = C7605h.m23664h(C7605h.m23653a(C7605h.m23659d(C7605h.m23653a(this.f123822b.mo123476e(), (C7562b<? super T, Boolean>) C48702a.f123823a), new C48703b(l)), (C7562b<? super T, Boolean>) C48704c.f123825a));
                this.f123822b.mo123472b().mo123466a(this.f123821a.name(), h);
                return h;
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            boolean z;
            C7573i.m23587b(tVar, "reporter");
            C48746h a = tVar.f124215e.mo123477a();
            List<C48784f> list = (List) a.mo123472b().mo123465a(name(), (C7561a<? extends T>) new C48701a<Object>(this, a));
            long b = tVar.f124215e.mo123478b();
            for (C48784f fVar : list) {
                if (fVar.f124012c.f124227b == b) {
                    tVar.f124212b.add("ObjectWatcher was watching this");
                    Collection collection = tVar.f124211a;
                    StringBuilder sb = new StringBuilder("key = ");
                    sb.append(fVar.f124013d);
                    collection.add(sb.toString());
                    if (fVar.f124014e.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        Collection collection2 = tVar.f124211a;
                        StringBuilder sb2 = new StringBuilder("name = ");
                        sb2.append(fVar.f124014e);
                        collection2.add(sb2.toString());
                    }
                    if (fVar.f124015f != null) {
                        Collection collection3 = tVar.f124211a;
                        StringBuilder sb3 = new StringBuilder("watchDurationMillis = ");
                        sb3.append(fVar.f124015f);
                        collection3.add(sb3.toString());
                    }
                    if (fVar.f124016g != null) {
                        Collection collection4 = tVar.f124211a;
                        StringBuilder sb4 = new StringBuilder("retainedDurationMillis = ");
                        sb4.append(fVar.f124016g);
                        collection4.add(sb4.toString());
                    }
                }
            }
        }

        C48700e(String str, int i) {
            super(str, 0, null);
        }
    }

    /* renamed from: shark.ObjectInspectors$f */
    static final class C48705f extends ObjectInspectors {

        /* renamed from: shark.ObjectInspectors$f$a */
        static final class C48706a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48706a f123826a = null;

            static {
                f123826a = new C48706a();
            }

            C48706a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150449a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150449a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123492a(C7575l.m23595a(Thread.class), "name");
                if (a == null) {
                    C7573i.m23580a();
                }
                String i = a.f123887c.mo123584i();
                Collection collection = tVar.f124211a;
                StringBuilder sb = new StringBuilder("Thread name: '");
                sb.append(i);
                sb.append('\'');
                collection.add(sb.toString());
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123610a(C7575l.m23595a(Thread.class), (C7563m<? super C48857t, ? super C48752c, C7581n>) C48706a.f123826a);
        }

        C48705f(String str, int i) {
            super(str, 4, null);
        }
    }

    static {
        Companion = new C48699d(null);
        ANONYMOUS_CLASS_NAME_PATTERN_REGEX = new Regex("^.+\\$\\d+$");
    }
}
