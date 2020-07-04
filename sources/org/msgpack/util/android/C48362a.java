package org.msgpack.util.android;

/* renamed from: org.msgpack.util.android.a */
public final class C48362a {

    /* renamed from: a */
    private static final boolean f123489a;

    /* renamed from: a */
    public static boolean m150018a() {
        return f123489a;
    }

    static {
        try {
            f123489a = System.getProperty("java.vm.name").equals("Dalvik");
        } catch (Throwable th) {
            f123489a = false;
            throw th;
        }
    }
}
