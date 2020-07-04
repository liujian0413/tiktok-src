package com.p280ss.android.ugc.aweme.interest;

import com.bytedance.dataplatform.p507a.C10034a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.interest.g */
public final class C32190g {

    /* renamed from: a */
    public static final C7541d f84051a = C7546e.m23569a(C32192b.f84061a);

    /* renamed from: b */
    public static final C7541d f84052b = C7546e.m23569a(C32194d.f84063a);

    /* renamed from: c */
    public static final C7541d f84053c = C7546e.m23569a(C32193c.f84062a);

    /* renamed from: d */
    public static String f84054d;

    /* renamed from: e */
    public static boolean f84055e;

    /* renamed from: f */
    public static boolean f84056f;

    /* renamed from: g */
    public static int f84057g;

    /* renamed from: h */
    public static String f84058h = "";

    /* renamed from: i */
    public static final C32191a f84059i = new C32191a(null);

    /* renamed from: com.ss.android.ugc.aweme.interest.g$a */
    public static final class C32191a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f84060a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32191a.class), "abParams", "getAbParams()Ljava/lang/Integer;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32191a.class), "needShowInternal", "getNeedShowInternal()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C32191a.class), "needShow", "getNeedShow()Z"))};

        private C32191a() {
        }

        /* renamed from: a */
        public static Integer m104461a() {
            return (Integer) C32190g.f84051a.getValue();
        }

        /* renamed from: b */
        public static int m104465b() {
            return ((Number) C32190g.f84052b.getValue()).intValue();
        }

        /* renamed from: c */
        public static boolean m104467c() {
            return ((Boolean) C32190g.f84053c.getValue()).booleanValue();
        }

        /* renamed from: d */
        public static int m104468d() {
            return C32190g.f84057g;
        }

        /* renamed from: e */
        public static String m104469e() {
            return C32190g.f84058h;
        }

        /* renamed from: a */
        public static void m104462a(int i) {
            C32190g.f84057g = 1;
        }

        public /* synthetic */ C32191a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m104463a(String str) {
            C32190g.f84054d = str;
        }

        /* renamed from: b */
        public static void m104466b(String str) {
            C7573i.m23587b(str, "<set-?>");
            C32190g.f84058h = str;
        }

        /* renamed from: a */
        public static void m104464a(boolean z) {
            C32190g.f84055e = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.g$b */
    static final class C32192b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C32192b f84061a = new C32192b();

        C32192b() {
            super(0);
        }

        /* renamed from: a */
        private static Integer m104470a() {
            return C10034a.m29819b(true);
        }

        public final /* synthetic */ Object invoke() {
            return m104470a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.g$c */
    static final class C32193c extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        public static final C32193c f84062a = new C32193c();

        C32193c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m104471a());
        }

        /* renamed from: a */
        private static boolean m104471a() {
            if (C32191a.m104465b() == 3 || C32191a.m104465b() == 4) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.interest.g$d */
    static final class C32194d extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C32194d f84063a = new C32194d();

        C32194d() {
            super(0);
        }

        /* renamed from: a */
        private static int m104472a() {
            return -1;
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m104472a());
        }
    }

    /* renamed from: a */
    public static final boolean m104459a() {
        return C32191a.m104467c();
    }

    /* renamed from: b */
    public static final boolean m104460b() {
        return f84055e;
    }
}
