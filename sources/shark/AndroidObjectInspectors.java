package shark;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7519g;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;
import shark.C48747i.C48752c;
import shark.ObjectInspectors.C48699d;

public enum AndroidObjectInspectors implements C48855s {
    ;
    
    public static final C48536f Companion = null;

    /* renamed from: shark.AndroidObjectInspectors$a */
    static final class C48526a extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$a$a */
        static final class C48527a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48527a f123727a = null;

            static {
                f123727a = new C48527a();
            }

            C48527a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150322a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150322a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("android.app.Activity", "mDestroyed");
                if (a != null) {
                    Boolean a2 = a.f123887c.mo123576a();
                    if (a2 == null) {
                        C7573i.m23580a();
                    }
                    if (a2.booleanValue()) {
                        tVar.f124212b.add(C48713b.m150456a(a, "true"));
                        return;
                    }
                    tVar.f124214d.add(C48713b.m150456a(a, "false"));
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.app.Activity", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48527a.f123727a);
        }

        C48526a(String str, int i) {
            super(str, 2, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$b */
    static final class C48528b extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$b$a */
        static final class C48529a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48529a f123728a = null;

            static {
                f123728a = new C48529a();
            }

            C48529a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150324a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
            /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static void m150324a(shark.C48857t r3, shark.C48747i.C48752c r4) {
                /*
                    java.lang.String r0 = "$receiver"
                    kotlin.jvm.internal.C7573i.m23587b(r3, r0)
                    java.lang.String r0 = "instance"
                    kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                    java.lang.String r0 = "androidx.fragment.app.Fragment"
                    java.lang.String r1 = "mFragmentManager"
                    shark.g r0 = r4.mo123491a(r0, r1)
                    if (r0 != 0) goto L_0x0017
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0017:
                    shark.k r1 = r0.f123887c
                    boolean r1 = r1.mo123581f()
                    if (r1 == 0) goto L_0x002d
                    java.util.Set<java.lang.String> r1 = r3.f124212b
                    java.util.Collection r1 = (java.util.Collection) r1
                    java.lang.String r2 = "null"
                    java.lang.String r0 = shark.C48713b.m150456a(r0, r2)
                    r1.add(r0)
                    goto L_0x003a
                L_0x002d:
                    java.util.Set<java.lang.String> r1 = r3.f124214d
                    java.util.Collection r1 = (java.util.Collection) r1
                    java.lang.String r2 = "not null"
                    java.lang.String r0 = shark.C48713b.m150456a(r0, r2)
                    r1.add(r0)
                L_0x003a:
                    java.lang.String r0 = "androidx.fragment.app.Fragment"
                    java.lang.String r1 = "mTag"
                    shark.g r4 = r4.mo123491a(r0, r1)
                    if (r4 == 0) goto L_0x004d
                    shark.k r4 = r4.f123887c
                    if (r4 == 0) goto L_0x004d
                    java.lang.String r4 = r4.mo123584i()
                    goto L_0x004e
                L_0x004d:
                    r4 = 0
                L_0x004e:
                    r0 = r4
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    if (r0 == 0) goto L_0x005c
                    int r0 = r0.length()
                    if (r0 != 0) goto L_0x005a
                    goto L_0x005c
                L_0x005a:
                    r0 = 0
                    goto L_0x005d
                L_0x005c:
                    r0 = 1
                L_0x005d:
                    if (r0 != 0) goto L_0x0074
                    java.util.LinkedHashSet<java.lang.String> r3 = r3.f124211a
                    java.util.Collection r3 = (java.util.Collection) r3
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Fragment.mTag="
                    r0.<init>(r1)
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r3.add(r4)
                L_0x0074:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: shark.AndroidObjectInspectors.C48528b.C48529a.m150324a(shark.t, shark.i$c):void");
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("androidx.fragment.app.Fragment", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48529a.f123728a);
        }

        C48528b(String str, int i) {
            super(str, 9, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$c */
    static final class C48530c extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$c$a */
        static final class C48531a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48531a f123729a = null;

            static {
                f123729a = new C48531a();
            }

            C48531a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150326a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150326a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "it");
                tVar.f124214d.add("Application is a singleton");
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.app.Application", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48531a.f123729a);
        }

        C48530c(String str, int i) {
            super(str, 5, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$d */
    static final class C48532d extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$d$a */
        static final class C48533a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48533a f123730a = null;

            static {
                f123730a = new C48533a();
            }

            C48533a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150328a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150328a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                if (!cVar.mo123493a("android.app.Activity")) {
                    C48752c a = C48713b.m150457a(cVar);
                    if (a != null) {
                        C48745g a2 = a.mo123491a("android.app.Activity", "mDestroyed");
                        if (a2 != null) {
                            Boolean a3 = a2.f123887c.mo123576a();
                            if (a3 == null) {
                                C7573i.m23580a();
                            }
                            if (a3.booleanValue()) {
                                Collection collection = tVar.f124212b;
                                StringBuilder sb = new StringBuilder();
                                sb.append(cVar.mo123496g());
                                sb.append(" wraps an Activity with Activity.mDestroyed true");
                                collection.add(sb.toString());
                                return;
                            }
                            Collection collection2 = tVar.f124211a;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(cVar.mo123496g());
                            sb2.append(" wraps an Activity with Activity.mDestroyed false");
                            collection2.add(sb2.toString());
                        }
                    } else {
                        Collection collection3 = tVar.f124211a;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(cVar.mo123496g());
                        sb3.append(" does not wrap an activity context");
                        collection3.add(sb3.toString());
                    }
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.content.ContextWrapper", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48533a.f123730a);
        }

        C48532d(String str, int i) {
            super(str, 3, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$e */
    static final class C48534e extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$e$a */
        static final class C48535a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48535a f123731a = null;

            static {
                f123731a = new C48535a();
            }

            C48535a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150330a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150330a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("com.squareup.coordinators.Coordinator", "attached");
                if (a == null) {
                    C7573i.m23580a();
                }
                Boolean a2 = a.f123887c.mo123576a();
                if (a2 == null) {
                    C7573i.m23580a();
                }
                if (a2.booleanValue()) {
                    tVar.f124214d.add(C48713b.m150456a(a, "true"));
                } else {
                    tVar.f124212b.add(C48713b.m150456a(a, "false"));
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("com.squareup.coordinators.Coordinator", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48535a.f123731a);
        }

        C48534e(String str, int i) {
            super(str, 13, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$f */
    public static final class C48536f {
        private C48536f() {
        }

        /* renamed from: a */
        public static List<C48855s> m150331a() {
            boolean z;
            Iterable d = C7519g.m23447d((T[]) AndroidObjectInspectors.values());
            Collection arrayList = new ArrayList();
            for (Object next : d) {
                if (((AndroidObjectInspectors) next) != AndroidObjectInspectors.VIEW) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            return C7525m.m23506c((Collection<? extends T>) (List) arrayList, (Iterable<? extends T>) C48699d.m150442a());
        }

        public /* synthetic */ C48536f(C7571f fVar) {
            this();
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$g */
    static final class C48537g extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$g$a */
        static final class C48538a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48538a f123732a = null;

            static {
                f123732a = new C48538a();
            }

            C48538a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150333a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150333a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("android.app.Dialog", "mDecor");
                if (a == null) {
                    C7573i.m23580a();
                }
                if (a.f123887c.mo123581f()) {
                    tVar.f124212b.add(C48713b.m150456a(a, TEVideoRecorder.FACE_BEAUTY_NULL));
                } else {
                    tVar.f124214d.add(C48713b.m150456a(a, "not null"));
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.app.Dialog", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48538a.f123732a);
        }

        C48537g(String str, int i) {
            super(str, 4, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$h */
    static final class C48539h extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$h$a */
        static final class C48540a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48540a f123733a = null;

            static {
                f123733a = new C48540a();
            }

            C48540a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150335a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150335a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48713b.m150458a(tVar, AndroidObjectInspectors.VIEW, cVar.mo123491a("android.widget.Editor", "mTextView"));
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.widget.Editor", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48540a.f123733a);
        }

        C48539h(String str, int i) {
            super(str, 1, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$i */
    static final class C48541i extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$i$a */
        static final class C48542a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48542a f123734a = null;

            static {
                f123734a = new C48542a();
            }

            C48542a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150337a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
            /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static void m150337a(shark.C48857t r3, shark.C48747i.C48752c r4) {
                /*
                    java.lang.String r0 = "$receiver"
                    kotlin.jvm.internal.C7573i.m23587b(r3, r0)
                    java.lang.String r0 = "instance"
                    kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                    java.lang.String r0 = "android.app.Fragment"
                    java.lang.String r1 = "mFragmentManager"
                    shark.g r0 = r4.mo123491a(r0, r1)
                    if (r0 != 0) goto L_0x0017
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0017:
                    shark.k r1 = r0.f123887c
                    boolean r1 = r1.mo123581f()
                    if (r1 == 0) goto L_0x002d
                    java.util.Set<java.lang.String> r1 = r3.f124212b
                    java.util.Collection r1 = (java.util.Collection) r1
                    java.lang.String r2 = "null"
                    java.lang.String r0 = shark.C48713b.m150456a(r0, r2)
                    r1.add(r0)
                    goto L_0x003a
                L_0x002d:
                    java.util.Set<java.lang.String> r1 = r3.f124214d
                    java.util.Collection r1 = (java.util.Collection) r1
                    java.lang.String r2 = "not null"
                    java.lang.String r0 = shark.C48713b.m150456a(r0, r2)
                    r1.add(r0)
                L_0x003a:
                    java.lang.String r0 = "android.app.Fragment"
                    java.lang.String r1 = "mTag"
                    shark.g r4 = r4.mo123491a(r0, r1)
                    if (r4 == 0) goto L_0x004d
                    shark.k r4 = r4.f123887c
                    if (r4 == 0) goto L_0x004d
                    java.lang.String r4 = r4.mo123584i()
                    goto L_0x004e
                L_0x004d:
                    r4 = 0
                L_0x004e:
                    r0 = r4
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    if (r0 == 0) goto L_0x005c
                    int r0 = r0.length()
                    if (r0 != 0) goto L_0x005a
                    goto L_0x005c
                L_0x005a:
                    r0 = 0
                    goto L_0x005d
                L_0x005c:
                    r0 = 1
                L_0x005d:
                    if (r0 != 0) goto L_0x0074
                    java.util.LinkedHashSet<java.lang.String> r3 = r3.f124211a
                    java.util.Collection r3 = (java.util.Collection) r3
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Fragment.mTag="
                    r0.<init>(r1)
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r3.add(r4)
                L_0x0074:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: shark.AndroidObjectInspectors.C48541i.C48542a.m150337a(shark.t, shark.i$c):void");
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.app.Fragment", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48542a.f123734a);
        }

        C48541i(String str, int i) {
            super(str, 7, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$j */
    static final class C48543j extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$j$a */
        static final class C48544a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48544a f123735a = null;

            static {
                f123735a = new C48544a();
            }

            C48544a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150339a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150339a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "it");
                tVar.f124214d.add("InputMethodManager is a singleton");
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.view.inputmethod.InputMethodManager", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48544a.f123735a);
        }

        C48543j(String str, int i) {
            super(str, 6, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$k */
    static final class C48545k extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$k$a */
        static final class C48546a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48546a f123736a = null;

            static {
                f123736a = new C48546a();
            }

            C48546a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150341a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150341a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123492a(C7575l.m23595a(Thread.class), "name");
                if (a == null) {
                    C7573i.m23580a();
                }
                if (C7573i.m23585a((Object) a.f123887c.mo123584i(), (Object) "main")) {
                    tVar.f124214d.add("the main thread always runs");
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123610a(C7575l.m23595a(Thread.class), (C7563m<? super C48857t, ? super C48752c, C7581n>) C48546a.f123736a);
        }

        C48545k(String str, int i) {
            super(str, 14, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$l */
    static final class C48547l extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$l$a */
        static final class C48548a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48548a f123737a = null;

            static {
                f123737a = new C48548a();
            }

            C48548a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150343a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150343a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("android.os.MessageQueue", "mQuitting");
                if (a == null) {
                    a = cVar.mo123491a("android.os.MessageQueue", "mQuiting");
                    if (a == null) {
                        C7573i.m23580a();
                    }
                }
                Boolean a2 = a.f123887c.mo123576a();
                if (a2 == null) {
                    C7573i.m23580a();
                }
                if (a2.booleanValue()) {
                    tVar.f124212b.add(C48713b.m150456a(a, "true"));
                } else {
                    tVar.f124214d.add(C48713b.m150456a(a, "false"));
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.os.MessageQueue", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48548a.f123737a);
        }

        C48547l(String str, int i) {
            super(str, 10, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$m */
    static final class C48549m extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$m$a */
        static final class C48550a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48550a f123738a = null;

            static {
                f123738a = new C48550a();
            }

            C48550a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150345a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150345a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("mortar.Presenter", "view");
                if (a == null) {
                    C7573i.m23580a();
                }
                if (a.f123887c.mo123581f()) {
                    tVar.f124212b.add(C48713b.m150456a(a, TEVideoRecorder.FACE_BEAUTY_NULL));
                } else {
                    tVar.f124211a.add(C48713b.m150456a(a, "set"));
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("mortar.Presenter", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48550a.f123738a);
        }

        C48549m(String str, int i) {
            super(str, 11, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$n */
    static final class C48551n extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$n$a */
        static final class C48552a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48552a f123739a = null;

            static {
                f123739a = new C48552a();
            }

            C48552a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150347a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150347a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("mortar.MortarScope", "dead");
                if (a == null) {
                    C7573i.m23580a();
                }
                Boolean a2 = a.f123887c.mo123576a();
                if (a2 == null) {
                    C7573i.m23580a();
                }
                boolean booleanValue = a2.booleanValue();
                C48745g a3 = cVar.mo123491a("mortar.MortarScope", "name");
                if (a3 == null) {
                    C7573i.m23580a();
                }
                String i = a3.f123887c.mo123584i();
                if (booleanValue) {
                    Collection collection = tVar.f124212b;
                    StringBuilder sb = new StringBuilder("mortar.MortarScope.dead is true for scope ");
                    sb.append(i);
                    collection.add(sb.toString());
                    return;
                }
                Collection collection2 = tVar.f124214d;
                StringBuilder sb2 = new StringBuilder("mortar.MortarScope.dead is false for scope ");
                sb2.append(i);
                collection2.add(sb2.toString());
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("mortar.MortarScope", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48552a.f123739a);
        }

        C48551n(String str, int i) {
            super(str, 12, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$o */
    static final class C48553o extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$o$a */
        static final class C48554a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48554a f123740a = null;

            static {
                f123740a = new C48554a();
            }

            C48554a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150349a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
            /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static void m150349a(shark.C48857t r3, shark.C48747i.C48752c r4) {
                /*
                    java.lang.String r0 = "$receiver"
                    kotlin.jvm.internal.C7573i.m23587b(r3, r0)
                    java.lang.String r0 = "instance"
                    kotlin.jvm.internal.C7573i.m23587b(r4, r0)
                    java.lang.String r0 = "android.support.v4.app.Fragment"
                    java.lang.String r1 = "mFragmentManager"
                    shark.g r0 = r4.mo123491a(r0, r1)
                    if (r0 != 0) goto L_0x0017
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0017:
                    shark.k r1 = r0.f123887c
                    boolean r1 = r1.mo123581f()
                    if (r1 == 0) goto L_0x002d
                    java.util.Set<java.lang.String> r1 = r3.f124212b
                    java.util.Collection r1 = (java.util.Collection) r1
                    java.lang.String r2 = "null"
                    java.lang.String r0 = shark.C48713b.m150456a(r0, r2)
                    r1.add(r0)
                    goto L_0x003a
                L_0x002d:
                    java.util.Set<java.lang.String> r1 = r3.f124214d
                    java.util.Collection r1 = (java.util.Collection) r1
                    java.lang.String r2 = "not null"
                    java.lang.String r0 = shark.C48713b.m150456a(r0, r2)
                    r1.add(r0)
                L_0x003a:
                    java.lang.String r0 = "android.support.v4.app.Fragment"
                    java.lang.String r1 = "mTag"
                    shark.g r4 = r4.mo123491a(r0, r1)
                    if (r4 == 0) goto L_0x004d
                    shark.k r4 = r4.f123887c
                    if (r4 == 0) goto L_0x004d
                    java.lang.String r4 = r4.mo123584i()
                    goto L_0x004e
                L_0x004d:
                    r4 = 0
                L_0x004e:
                    r0 = r4
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    if (r0 == 0) goto L_0x005c
                    int r0 = r0.length()
                    if (r0 != 0) goto L_0x005a
                    goto L_0x005c
                L_0x005a:
                    r0 = 0
                    goto L_0x005d
                L_0x005c:
                    r0 = 1
                L_0x005d:
                    if (r0 != 0) goto L_0x0074
                    java.util.LinkedHashSet<java.lang.String> r3 = r3.f124211a
                    java.util.Collection r3 = (java.util.Collection) r3
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "Fragment.mTag="
                    r0.<init>(r1)
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r3.add(r4)
                L_0x0074:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: shark.AndroidObjectInspectors.C48553o.C48554a.m150349a(shark.t, shark.i$c):void");
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.support.v4.app.Fragment", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48554a.f123740a);
        }

        C48553o(String str, int i) {
            super(str, 8, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$p */
    static final class C48555p extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$p$a */
        static final class C48556a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48556a f123741a = null;

            static {
                f123741a = new C48556a();
            }

            C48556a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150351a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150351a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("android.widget.Toast", "mTN");
                if (a == null) {
                    C7573i.m23580a();
                }
                C48747i h = a.f123887c.mo123583h();
                if (h == null) {
                    C7573i.m23580a();
                }
                C48752c d = h.mo123480d();
                if (d == null) {
                    C7573i.m23580a();
                }
                C48745g a2 = d.mo123491a("android.widget.Toast$TN", "mWM");
                if (a2 == null) {
                    C7573i.m23580a();
                }
                if (a2.f123887c.mo123582g()) {
                    C48745g a3 = d.mo123491a("android.widget.Toast$TN", "mView");
                    if (a3 == null) {
                        C7573i.m23580a();
                    }
                    if (a3.f123887c.mo123581f()) {
                        tVar.f124212b.add("This toast is done showing (Toast.mTN.mWM != null && Toast.mTN.mView == null)");
                        return;
                    }
                    tVar.f124214d.add("This toast is showing (Toast.mTN.mWM != null && Toast.mTN.mView != null)");
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.widget.Toast", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48556a.f123741a);
        }

        C48555p(String str, int i) {
            super(str, 17, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$q */
    static final class C48557q extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$q$a */
        static final class C48558a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48558a f123742a = null;

            static {
                f123742a = new C48558a();
            }

            C48558a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150353a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b7, code lost:
                if (r8 == null) goto L_0x00b9;
             */
            /* JADX WARNING: Removed duplicated region for block: B:71:0x01e4  */
            /* JADX WARNING: Removed duplicated region for block: B:72:0x01ee  */
            /* JADX WARNING: Removed duplicated region for block: B:74:0x01f9  */
            /* JADX WARNING: Removed duplicated region for block: B:75:0x0203  */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static void m150353a(shark.C48857t r11, shark.C48747i.C48752c r12) {
                /*
                    java.lang.String r0 = "$receiver"
                    kotlin.jvm.internal.C7573i.m23587b(r11, r0)
                    java.lang.String r0 = "instance"
                    kotlin.jvm.internal.C7573i.m23587b(r12, r0)
                    java.lang.String r0 = "android.view.View"
                    java.lang.String r1 = "mParent"
                    shark.g r0 = r12.mo123491a(r0, r1)
                    if (r0 != 0) goto L_0x0017
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0017:
                    shark.k r0 = r0.f123887c
                    boolean r1 = r0.mo123582g()
                    java.lang.String r2 = "android.view.View"
                    java.lang.String r3 = "mWindowAttachCount"
                    shark.g r2 = r12.mo123491a(r2, r3)
                    r3 = 0
                    if (r2 == 0) goto L_0x002b
                    shark.k r2 = r2.f123887c
                    goto L_0x002c
                L_0x002b:
                    r2 = r3
                L_0x002c:
                    if (r2 != 0) goto L_0x0031
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0031:
                    java.lang.Integer r2 = r2.mo123577b()
                    if (r2 != 0) goto L_0x003a
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x003a:
                    int r2 = r2.intValue()
                    java.lang.String r4 = "android.view.View"
                    java.lang.String r5 = "mAttachInfo"
                    shark.g r4 = r12.mo123491a(r4, r5)
                    if (r4 != 0) goto L_0x004b
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x004b:
                    shark.k r4 = r4.f123887c
                    boolean r4 = r4.mo123581f()
                    java.lang.String r5 = "android.view.View"
                    java.lang.String r6 = "mContext"
                    shark.g r12 = r12.mo123491a(r5, r6)
                    if (r12 != 0) goto L_0x005e
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x005e:
                    shark.k r12 = r12.f123887c
                    shark.i r12 = r12.mo123583h()
                    if (r12 != 0) goto L_0x0069
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0069:
                    shark.i$c r12 = r12.mo123480d()
                    if (r12 != 0) goto L_0x0072
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0072:
                    shark.i$c r5 = shark.C48713b.m150457a(r12)
                    java.util.LinkedHashSet<java.lang.String> r6 = r11.f124211a
                    java.util.Collection r6 = (java.util.Collection) r6
                    if (r5 != 0) goto L_0x0094
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r8 = "mContext instance of "
                    r7.<init>(r8)
                    java.lang.String r12 = r12.mo123495f()
                    r7.append(r12)
                    java.lang.String r12 = ", not wrapping activity"
                    r7.append(r12)
                    java.lang.String r12 = r7.toString()
                    goto L_0x0107
                L_0x0094:
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    java.lang.String r8 = "with mDestroyed = "
                    r7.<init>(r8)
                    java.lang.String r8 = "android.app.Activity"
                    java.lang.String r9 = "mDestroyed"
                    shark.g r8 = r5.mo123491a(r8, r9)
                    if (r8 == 0) goto L_0x00b9
                    shark.k r8 = r8.f123887c
                    if (r8 == 0) goto L_0x00b9
                    java.lang.Boolean r8 = r8.mo123576a()
                    if (r8 == 0) goto L_0x00b9
                    boolean r8 = r8.booleanValue()
                    java.lang.String r8 = java.lang.String.valueOf(r8)
                    if (r8 != 0) goto L_0x00bb
                L_0x00b9:
                    java.lang.String r8 = "UNKNOWN"
                L_0x00bb:
                    r7.append(r8)
                    java.lang.String r7 = r7.toString()
                    boolean r8 = kotlin.jvm.internal.C7573i.m23585a(r5, r12)
                    r9 = 32
                    if (r8 == 0) goto L_0x00e3
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    java.lang.String r8 = "mContext instance of "
                    r12.<init>(r8)
                    java.lang.String r8 = r5.mo123495f()
                    r12.append(r8)
                    r12.append(r9)
                    r12.append(r7)
                    java.lang.String r12 = r12.toString()
                    goto L_0x0107
                L_0x00e3:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    java.lang.String r10 = "mContext instance of "
                    r8.<init>(r10)
                    java.lang.String r12 = r12.mo123495f()
                    r8.append(r12)
                    java.lang.String r12 = ", wrapping activity "
                    r8.append(r12)
                    java.lang.String r12 = r5.mo123495f()
                    r8.append(r12)
                    r8.append(r9)
                    r8.append(r7)
                    java.lang.String r12 = r8.toString()
                L_0x0107:
                    r6.add(r12)
                    if (r5 == 0) goto L_0x0134
                    java.lang.String r12 = "android.app.Activity"
                    java.lang.String r6 = "mDestroyed"
                    shark.g r12 = r5.mo123491a(r12, r6)
                    if (r12 == 0) goto L_0x011e
                    shark.k r12 = r12.f123887c
                    if (r12 == 0) goto L_0x011e
                    java.lang.Boolean r3 = r12.mo123576a()
                L_0x011e:
                    r12 = 1
                    java.lang.Boolean r12 = java.lang.Boolean.valueOf(r12)
                    boolean r12 = kotlin.jvm.internal.C7573i.m23585a(r3, r12)
                    if (r12 == 0) goto L_0x0134
                    java.util.Set<java.lang.String> r12 = r11.f124212b
                    java.util.Collection r12 = (java.util.Collection) r12
                    java.lang.String r0 = "View.mContext references a destroyed activity"
                    r12.add(r0)
                    goto L_0x01e2
                L_0x0134:
                    if (r1 == 0) goto L_0x01e2
                    if (r2 <= 0) goto L_0x01e2
                    if (r4 == 0) goto L_0x0145
                    java.util.Set<java.lang.String> r12 = r11.f124213c
                    java.util.Collection r12 = (java.util.Collection) r12
                    java.lang.String r0 = "View detached and has parent"
                    r12.add(r0)
                    goto L_0x01e2
                L_0x0145:
                    shark.i r12 = r0.mo123583h()
                    if (r12 != 0) goto L_0x014e
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x014e:
                    shark.i$c r12 = r12.mo123480d()
                    if (r12 != 0) goto L_0x0157
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x0157:
                    java.lang.String r0 = "android.view.View"
                    boolean r0 = r12.mo123493a(r0)
                    if (r0 == 0) goto L_0x01bb
                    java.lang.String r0 = "android.view.View"
                    java.lang.String r3 = "mAttachInfo"
                    shark.g r0 = r12.mo123491a(r0, r3)
                    if (r0 != 0) goto L_0x016c
                    kotlin.jvm.internal.C7573i.m23580a()
                L_0x016c:
                    shark.k r0 = r0.f123887c
                    boolean r0 = r0.mo123581f()
                    if (r0 == 0) goto L_0x0193
                    java.util.Set<java.lang.String> r0 = r11.f124213c
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r5 = "View attached but parent "
                    r3.<init>(r5)
                    java.lang.String r12 = r12.mo123495f()
                    r3.append(r12)
                    java.lang.String r12 = " detached (attach disorder)"
                    r3.append(r12)
                    java.lang.String r12 = r3.toString()
                    r0.add(r12)
                    goto L_0x01e2
                L_0x0193:
                    java.util.Set<java.lang.String> r0 = r11.f124214d
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.lang.String r3 = "View attached"
                    r0.add(r3)
                    java.util.LinkedHashSet<java.lang.String> r0 = r11.f124211a
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r5 = "View.parent "
                    r3.<init>(r5)
                    java.lang.String r12 = r12.mo123495f()
                    r3.append(r12)
                    java.lang.String r12 = " attached as well"
                    r3.append(r12)
                    java.lang.String r12 = r3.toString()
                    r0.add(r12)
                    goto L_0x01e2
                L_0x01bb:
                    java.util.Set<java.lang.String> r0 = r11.f124214d
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.lang.String r3 = "View attached"
                    r0.add(r3)
                    java.util.LinkedHashSet<java.lang.String> r0 = r11.f124211a
                    java.util.Collection r0 = (java.util.Collection) r0
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    java.lang.String r5 = "Parent "
                    r3.<init>(r5)
                    java.lang.String r12 = r12.mo123495f()
                    r3.append(r12)
                    java.lang.String r12 = " not a android.view.View"
                    r3.append(r12)
                    java.lang.String r12 = r3.toString()
                    r0.add(r12)
                L_0x01e2:
                    if (r1 == 0) goto L_0x01ee
                    java.util.LinkedHashSet<java.lang.String> r12 = r11.f124211a
                    java.util.Collection r12 = (java.util.Collection) r12
                    java.lang.String r0 = "View#mParent is set"
                    r12.add(r0)
                    goto L_0x01f7
                L_0x01ee:
                    java.util.LinkedHashSet<java.lang.String> r12 = r11.f124211a
                    java.util.Collection r12 = (java.util.Collection) r12
                    java.lang.String r0 = "View#mParent is null"
                    r12.add(r0)
                L_0x01f7:
                    if (r4 == 0) goto L_0x0203
                    java.util.LinkedHashSet<java.lang.String> r12 = r11.f124211a
                    java.util.Collection r12 = (java.util.Collection) r12
                    java.lang.String r0 = "View#mAttachInfo is null (view detached)"
                    r12.add(r0)
                    goto L_0x020c
                L_0x0203:
                    java.util.LinkedHashSet<java.lang.String> r12 = r11.f124211a
                    java.util.Collection r12 = (java.util.Collection) r12
                    java.lang.String r0 = "View#mAttachInfo is not null (view attached)"
                    r12.add(r0)
                L_0x020c:
                    java.util.LinkedHashSet<java.lang.String> r11 = r11.f124211a
                    java.util.Collection r11 = (java.util.Collection) r11
                    java.lang.StringBuilder r12 = new java.lang.StringBuilder
                    java.lang.String r0 = "View.mWindowAttachCount = "
                    r12.<init>(r0)
                    r12.append(r2)
                    java.lang.String r12 = r12.toString()
                    r11.add(r12)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: shark.AndroidObjectInspectors.C48557q.C48558a.m150353a(shark.t, shark.i$c):void");
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.view.View", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48558a.f123742a);
        }

        C48557q(String str, int i) {
            super(str, 0, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$r */
    static final class C48559r extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$r$a */
        static final class C48560a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48560a f123743a = null;

            static {
                f123743a = new C48560a();
            }

            C48560a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150355a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150355a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("android.view.ViewRootImpl", "mView");
                if (a == null) {
                    C7573i.m23580a();
                }
                if (a.f123887c.mo123581f()) {
                    tVar.f124212b.add(C48713b.m150456a(a, TEVideoRecorder.FACE_BEAUTY_NULL));
                } else {
                    tVar.f124214d.add(C48713b.m150456a(a, "not null"));
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.view.ViewRootImpl", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48560a.f123743a);
        }

        C48559r(String str, int i) {
            super(str, 15, null);
        }
    }

    /* renamed from: shark.AndroidObjectInspectors$s */
    static final class C48561s extends AndroidObjectInspectors {

        /* renamed from: shark.AndroidObjectInspectors$s$a */
        static final class C48562a extends Lambda implements C7563m<C48857t, C48752c, C7581n> {

            /* renamed from: a */
            public static final C48562a f123744a = null;

            static {
                f123744a = new C48562a();
            }

            C48562a() {
                super(2);
            }

            public final /* synthetic */ Object invoke(Object obj, Object obj2) {
                m150357a((C48857t) obj, (C48752c) obj2);
                return C7581n.f20898a;
            }

            /* renamed from: a */
            private static void m150357a(C48857t tVar, C48752c cVar) {
                C7573i.m23587b(tVar, "$receiver");
                C7573i.m23587b(cVar, "instance");
                C48745g a = cVar.mo123491a("android.view.Window", "mDestroyed");
                if (a == null) {
                    C7573i.m23580a();
                }
                Boolean a2 = a.f123887c.mo123576a();
                if (a2 == null) {
                    C7573i.m23580a();
                }
                if (a2.booleanValue()) {
                    tVar.f124212b.add(C48713b.m150456a(a, "true"));
                } else {
                    tVar.f124214d.add(C48713b.m150456a(a, "false"));
                }
            }
        }

        /* renamed from: a */
        public final void mo123342a(C48857t tVar) {
            C7573i.m23587b(tVar, "reporter");
            tVar.mo123609a("android.view.Window", (C7563m<? super C48857t, ? super C48752c, C7581n>) C48562a.f123744a);
        }

        C48561s(String str, int i) {
            super(str, 16, null);
        }
    }

    static {
        Companion = new C48536f(null);
    }
}
