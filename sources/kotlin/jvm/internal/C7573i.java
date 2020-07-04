package kotlin.jvm.internal;

import com.taobao.android.dexposed.ClassUtils;
import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.i */
public class C7573i {
    private C7573i() {
    }

    /* renamed from: a */
    public static int m23576a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: b */
    public static void m23586b() {
        m23589c();
    }

    /* renamed from: a */
    public static boolean m23585a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: c */
    private static void m23589c() {
        m23591d("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    /* renamed from: a */
    public static void m23580a() {
        throw ((KotlinNullPointerException) m23578a((T) new KotlinNullPointerException()));
    }

    /* renamed from: d */
    private static void m23591d(String str) {
        throw new UnsupportedOperationException(str);
    }

    /* renamed from: b */
    private static void m23588b(String str) {
        throw ((UninitializedPropertyAccessException) m23578a((T) new UninitializedPropertyAccessException(str)));
    }

    /* renamed from: a */
    private static <T extends Throwable> T m23578a(T t) {
        return m23579a(t, C7573i.class.getName());
    }

    /* renamed from: c */
    private static void m23590c(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(ClassUtils.PACKAGE_SEPARATOR);
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        throw ((IllegalArgumentException) m23578a((T) new IllegalArgumentException(sb.toString())));
    }

    /* renamed from: a */
    public static void m23583a(String str) {
        StringBuilder sb = new StringBuilder("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m23588b(sb.toString());
    }

    /* renamed from: a */
    public static void m23581a(int i, String str) {
        m23589c();
    }

    /* renamed from: b */
    public static void m23587b(Object obj, String str) {
        if (obj == null) {
            m23590c(str);
        }
    }

    /* renamed from: a */
    public static String m23577a(String str, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(obj);
        return sb.toString();
    }

    /* renamed from: a */
    static <T extends Throwable> T m23579a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    /* renamed from: a */
    public static void m23582a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            throw ((IllegalStateException) m23578a((T) new IllegalStateException(sb.toString())));
        }
    }

    /* renamed from: a */
    public static boolean m23584a(Float f, float f2) {
        if (f == null || f.floatValue() != 0.0f) {
            return false;
        }
        return true;
    }
}
