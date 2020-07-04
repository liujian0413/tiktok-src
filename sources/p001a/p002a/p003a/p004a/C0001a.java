package p001a.p002a.p003a.p004a;

import java.lang.reflect.Method;

/* renamed from: a.a.a.a.a */
public final class C0001a {

    /* renamed from: a */
    private static boolean f2a;

    /* renamed from: b */
    private static boolean f3b;

    /* renamed from: a */
    public static boolean m1a() {
        if (!f2a) {
            float c = m3c();
            if (m2b() || c >= 3.6f) {
                f3b = true;
            }
            f2a = true;
        }
        return f3b;
    }

    /* renamed from: c */
    private static float m3c() {
        try {
            return ((Float) m0a("android.os.FtBuild", "getRomVersion", new Object[0])).floatValue();
        } catch (ClassNotFoundException | Exception unused) {
            return 2.5f;
        }
    }

    /* renamed from: b */
    private static boolean m2b() {
        String str = "no";
        try {
            str = (String) m0a("android.os.SystemProperties", "get", "ro.vivo.product.overseas", "no");
        } catch (ClassNotFoundException | Exception unused) {
        }
        return "yes".equals(str);
    }

    /* renamed from: a */
    private static Object m0a(String str, String str2, Object... objArr) throws Exception {
        Class cls = Class.forName(str);
        Class[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        Method method = cls.getMethod(str2, clsArr);
        method.setAccessible(true);
        return method.invoke(null, objArr);
    }
}
