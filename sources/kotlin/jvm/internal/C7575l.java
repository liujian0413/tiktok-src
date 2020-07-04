package kotlin.jvm.internal;

import kotlin.reflect.C7584c;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7586e;
import kotlin.reflect.C7589g;
import kotlin.reflect.C7591h;
import kotlin.reflect.C7593i;
import kotlin.reflect.C7597k;
import kotlin.reflect.C7599l;
import kotlin.reflect.C7601m;

/* renamed from: kotlin.jvm.internal.l */
public final class C7575l {

    /* renamed from: a */
    private static final C7576m f20892a;

    /* renamed from: b */
    private static final C7584c[] f20893b = new C7584c[0];

    /* renamed from: a */
    public static C7599l m23602a(PropertyReference1 propertyReference1) {
        return C7576m.m23612a(propertyReference1);
    }

    /* renamed from: a */
    public static C7601m m23603a(PropertyReference2 propertyReference2) {
        return C7576m.m23613a(propertyReference2);
    }

    static {
        C7576m mVar = null;
        try {
            mVar = (C7576m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new C7576m();
        }
        f20892a = mVar;
    }

    /* renamed from: a */
    public static String m23593a(Lambda lambda) {
        return f20892a.mo19485a(lambda);
    }

    /* renamed from: a */
    public static String m23594a(C7572h hVar) {
        return C7576m.m23604a(hVar);
    }

    /* renamed from: a */
    public static C7584c m23595a(Class cls) {
        return C7576m.m23605a(cls);
    }

    /* renamed from: a */
    public static C7586e m23597a(FunctionReference functionReference) {
        return C7576m.m23607a(functionReference);
    }

    /* renamed from: a */
    public static C7589g m23598a(MutablePropertyReference0 mutablePropertyReference0) {
        return C7576m.m23608a(mutablePropertyReference0);
    }

    /* renamed from: a */
    public static C7591h m23599a(MutablePropertyReference1 mutablePropertyReference1) {
        return C7576m.m23609a(mutablePropertyReference1);
    }

    /* renamed from: a */
    public static C7593i m23600a(MutablePropertyReference2 mutablePropertyReference2) {
        return C7576m.m23610a(mutablePropertyReference2);
    }

    /* renamed from: a */
    public static C7597k m23601a(PropertyReference0 propertyReference0) {
        return C7576m.m23611a(propertyReference0);
    }

    /* renamed from: a */
    public static C7585d m23596a(Class cls, String str) {
        return C7576m.m23606a(cls, str);
    }
}
