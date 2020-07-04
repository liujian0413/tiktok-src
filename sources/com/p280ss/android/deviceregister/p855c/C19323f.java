package com.p280ss.android.deviceregister.p855c;

/* renamed from: com.ss.android.deviceregister.c.f */
public final class C19323f {

    /* renamed from: a */
    private Object f52230a;

    public C19323f() {
        try {
            this.f52230a = Class.forName("android.os.SystemProperties").newInstance();
        } catch (ClassNotFoundException | InstantiationException unused) {
        } catch (IllegalAccessException unused2) {
        }
    }

    /* renamed from: a */
    public final String mo51220a(String str) throws IllegalArgumentException {
        try {
            return (String) this.f52230a.getClass().getMethod("get", new Class[]{String.class}).invoke(this.f52230a, new Object[]{str});
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Exception unused) {
            return "";
        }
    }
}
