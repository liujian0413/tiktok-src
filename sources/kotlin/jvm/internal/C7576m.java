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

/* renamed from: kotlin.jvm.internal.m */
public final class C7576m {
    /* renamed from: a */
    public static C7586e m23607a(FunctionReference functionReference) {
        return functionReference;
    }

    /* renamed from: a */
    public static C7589g m23608a(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    /* renamed from: a */
    public static C7591h m23609a(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    /* renamed from: a */
    public static C7593i m23610a(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    /* renamed from: a */
    public static C7597k m23611a(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    /* renamed from: a */
    public static C7599l m23612a(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    /* renamed from: a */
    public static C7601m m23613a(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    /* renamed from: a */
    public final String mo19485a(Lambda lambda) {
        return m23604a((C7572h) lambda);
    }

    /* renamed from: a */
    public static C7584c m23605a(Class cls) {
        return new C7570d(cls);
    }

    /* renamed from: a */
    public static String m23604a(C7572h hVar) {
        String obj = hVar.getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            return obj.substring(21);
        }
        return obj;
    }

    /* renamed from: a */
    public static C7585d m23606a(Class cls, String str) {
        return new C7574k(cls, str);
    }
}
