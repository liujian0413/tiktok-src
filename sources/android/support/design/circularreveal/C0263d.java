package android.support.design.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.support.design.circularreveal.C0261c.C0262a;
import android.support.design.widget.C0402j;
import android.util.Property;

/* renamed from: android.support.design.circularreveal.d */
public interface C0263d extends C0262a {

    /* renamed from: android.support.design.circularreveal.d$a */
    public static class C0265a implements TypeEvaluator<C0268d> {

        /* renamed from: a */
        public static final TypeEvaluator<C0268d> f1049a = new C0265a();

        /* renamed from: b */
        private final C0268d f1050b = new C0268d();

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C0268d evaluate(float f, C0268d dVar, C0268d dVar2) {
            this.f1050b.mo1043a(C0402j.m1808a(dVar.f1053a, dVar2.f1053a, f), C0402j.m1808a(dVar.f1054b, dVar2.f1054b, f), C0402j.m1808a(dVar.f1055c, dVar2.f1055c, f));
            return this.f1050b;
        }
    }

    /* renamed from: android.support.design.circularreveal.d$b */
    public static class C0266b extends Property<C0263d, C0268d> {

        /* renamed from: a */
        public static final Property<C0263d, C0268d> f1051a = new C0266b("circularReveal");

        private C0266b(String str) {
            super(C0268d.class, str);
        }

        /* renamed from: a */
        private static C0268d m1063a(C0263d dVar) {
            return dVar.getRevealInfo();
        }

        public final /* synthetic */ Object get(Object obj) {
            return m1063a((C0263d) obj);
        }

        /* renamed from: a */
        private static void m1064a(C0263d dVar, C0268d dVar2) {
            dVar.setRevealInfo(dVar2);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m1064a((C0263d) obj, (C0268d) obj2);
        }
    }

    /* renamed from: android.support.design.circularreveal.d$c */
    public static class C0267c extends Property<C0263d, Integer> {

        /* renamed from: a */
        public static final Property<C0263d, Integer> f1052a = new C0267c("circularRevealScrimColor");

        private C0267c(String str) {
            super(Integer.class, str);
        }

        public final /* synthetic */ Object get(Object obj) {
            return m1065a((C0263d) obj);
        }

        /* renamed from: a */
        private static Integer m1065a(C0263d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        private static void m1066a(C0263d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            m1066a((C0263d) obj, (Integer) obj2);
        }
    }

    /* renamed from: android.support.design.circularreveal.d$d */
    public static class C0268d {

        /* renamed from: a */
        public float f1053a;

        /* renamed from: b */
        public float f1054b;

        /* renamed from: c */
        public float f1055c;

        private C0268d() {
        }

        /* renamed from: a */
        public final boolean mo1045a() {
            if (this.f1055c == Float.MAX_VALUE) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final void mo1044a(C0268d dVar) {
            mo1043a(dVar.f1053a, dVar.f1054b, dVar.f1055c);
        }

        public C0268d(C0268d dVar) {
            this(dVar.f1053a, dVar.f1054b, dVar.f1055c);
        }

        /* renamed from: a */
        public final void mo1043a(float f, float f2, float f3) {
            this.f1053a = f;
            this.f1054b = f2;
            this.f1055c = f3;
        }

        public C0268d(float f, float f2, float f3) {
            this.f1053a = f;
            this.f1054b = f2;
            this.f1055c = f3;
        }
    }

    /* renamed from: a */
    void mo1011a();

    /* renamed from: b */
    void mo1013b();

    int getCircularRevealScrimColor();

    C0268d getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C0268d dVar);
}
