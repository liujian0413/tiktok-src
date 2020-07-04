package com.bytedance.ies.abmock;

import android.app.Application;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.abmock.p260a.C6383c;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ies.abmock.b */
public final class C6384b {

    /* renamed from: d */
    private static C6384b f18675d;

    /* renamed from: a */
    public Application f18676a;

    /* renamed from: b */
    public C6390h f18677b;

    /* renamed from: c */
    public C6386d f18678c;

    /* renamed from: e */
    private Map<String, Object> f18679e = new ConcurrentHashMap();

    /* renamed from: a */
    public final void mo15291a(Application application, C6390h hVar, C6386d dVar) {
        this.f18676a = application;
        this.f18677b = hVar;
        this.f18678c = dVar;
        C6380a.m19832a("正在初始化 ABMock");
        StringBuilder sb = new StringBuilder("isSupportMock : ");
        sb.append(this.f18677b.mo15323c());
        C6380a.m19832a(sb.toString());
        if (this.f18677b.mo15323c()) {
            C6389g.m19890a().mo15974a("{}", this.f18677b.mo15322b().getClass());
            C6385c.f18680a.mo15318a(application);
            C6392k.f18684a.mo15318a(application);
        }
    }

    /* renamed from: a */
    private boolean m19845a(Class cls) {
        try {
            return ((Boolean) m19836a(cls, Boolean.TYPE)).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo15292a(Class cls, boolean z, String str, boolean z2, boolean z3) {
        Boolean bool;
        try {
            Object a = m19839a(cls, z, str);
            if (a != null) {
                return ((Boolean) a).booleanValue();
            }
            if (this.f18678c.mo15309a()) {
                bool = Boolean.valueOf(this.f18678c.mo15310a(str, z3));
                this.f18678c.mo15308a(bool.booleanValue(), z2, str);
            } else {
                bool = Boolean.valueOf(z2);
            }
            m19842a(cls, z, (Object) bool);
            return bool.booleanValue();
        } catch (Throwable unused) {
            return m19845a(cls);
        }
    }

    /* renamed from: a */
    public final int mo15287a(Class cls, boolean z, String str, int i, int i2) {
        Integer num;
        try {
            Object a = m19839a(cls, z, str);
            if (a != null) {
                return ((Integer) a).intValue();
            }
            if (this.f18678c.mo15309a()) {
                num = Integer.valueOf(this.f18678c.mo15298a(str, i2));
                this.f18678c.mo15304a(num.intValue(), i, str);
            } else {
                num = Integer.valueOf(i);
            }
            m19842a(cls, z, (Object) num);
            return num.intValue();
        } catch (Throwable unused) {
            return m19846b(cls);
        }
    }

    /* renamed from: a */
    public final long mo15288a(Class cls, boolean z, String str, long j, long j2) {
        Long l;
        try {
            Object a = m19839a(cls, true, str);
            if (a != null) {
                return ((Long) a).longValue();
            }
            if (this.f18678c.mo15309a()) {
                l = Long.valueOf(this.f18678c.mo15299a(str, j2));
                this.f18678c.mo15305a(l.longValue(), j, str);
            } else {
                l = Long.valueOf(j);
            }
            m19842a(cls, true, (Object) l);
            return l.longValue();
        } catch (Throwable unused) {
            return m19847c(cls);
        }
    }

    /* renamed from: a */
    public final double mo15286a(Class cls, boolean z, String str, double d, double d2) {
        Double d3;
        try {
            Object a = m19839a(cls, true, str);
            if (a != null) {
                return ((Double) a).doubleValue();
            }
            if (this.f18678c.mo15309a()) {
                d3 = Double.valueOf(this.f18678c.mo15297a(str, d2));
                this.f18678c.mo15303a(d3.doubleValue(), d, str);
            } else {
                d3 = Double.valueOf(d);
            }
            m19842a(cls, true, (Object) d3);
            return d3.doubleValue();
        } catch (Throwable unused) {
            return m19848d(cls);
        }
    }

    /* renamed from: a */
    public final <T> T mo15290a(Class cls, boolean z, String str, Object obj, Class cls2) throws Throwable {
        T a = m19839a(cls, z, str);
        if (a != null) {
            return a;
        }
        if (this.f18678c.mo15309a()) {
            Object a2 = this.f18678c.mo15301a(str, cls2);
            this.f18678c.mo15306a(a2, obj, str);
            obj = a2;
        }
        m19842a(cls, z, obj);
        return obj;
    }

    /* renamed from: a */
    public final <T> T mo15289a(Class cls, boolean z, String str, Object obj) throws Throwable {
        T a = m19839a(cls, true, str);
        if (a != null) {
            return a;
        }
        if (this.f18678c.mo15309a()) {
            Object b = this.f18678c.mo15316b(str);
            this.f18678c.mo15306a(b, obj, str);
            obj = b;
        }
        m19842a(cls, true, obj);
        return obj;
    }

    /* renamed from: a */
    public static boolean m19844a(C6711m mVar) {
        return C6391i.m19900a(mVar);
    }

    /* renamed from: b */
    public final boolean mo15293b() {
        return this.f18677b.mo15323c();
    }

    /* renamed from: c */
    public final IESSettingsProxy mo15294c() {
        return this.f18677b.mo15321a();
    }

    /* renamed from: d */
    public final ABModel mo15295d() {
        return this.f18677b.mo15322b();
    }

    /* renamed from: a */
    public static synchronized C6384b m19835a() {
        C6384b bVar;
        synchronized (C6384b.class) {
            if (f18675d == null) {
                f18675d = new C6384b();
            }
            bVar = f18675d;
        }
        return bVar;
    }

    /* renamed from: b */
    private int m19846b(Class cls) {
        try {
            return ((Integer) m19836a(cls, Integer.TYPE)).intValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private long m19847c(Class cls) {
        try {
            return ((Long) m19836a(cls, Long.TYPE)).longValue();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private double m19848d(Class cls) {
        try {
            return ((Double) m19836a(cls, Double.TYPE)).doubleValue();
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* renamed from: f */
    private static boolean m19850f(Class cls) {
        if (cls.getAnnotation(C6383c.class) == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static String m19849e(Class cls) {
        C6381a aVar = (C6381a) cls.getAnnotation(C6381a.class);
        if (aVar != null) {
            return aVar.mo15284a();
        }
        return null;
    }

    /* renamed from: a */
    private Object m19840a(String str) throws IllegalAccessException, NoSuchFieldException {
        return ABModel.class.getDeclaredField(str).get(this.f18677b.mo15322b());
    }

    /* renamed from: a */
    private <T> T m19836a(Class cls, Class<T> cls2) throws Throwable {
        String e = m19849e(cls);
        if (e != null) {
            T a = m19838a(cls, e, m19850f(cls), (Class) cls2);
            if (a != null) {
                return a;
            }
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null) {
                for (Field field : declaredFields) {
                    C6382b bVar = (C6382b) field.getAnnotation(C6382b.class);
                    if (bVar != null && bVar.mo15285a()) {
                        try {
                            field.setAccessible(true);
                            return field.get(null);
                        } catch (IllegalAccessException unused) {
                        }
                    }
                }
            }
        }
        throw new Throwable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        if (r0.equals("int") != false) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.Object m19837a(java.lang.Class r8, java.lang.String r9) throws java.lang.IllegalAccessException {
        /*
            r7 = this;
            java.lang.reflect.Field[] r8 = r8.getDeclaredFields()
            int r0 = r8.length
            r1 = 0
            r2 = 0
            r4 = r2
            r3 = 0
        L_0x0009:
            if (r3 >= r0) goto L_0x0024
            r5 = r8[r3]
            java.lang.Class<com.bytedance.ies.abmock.a.b> r6 = com.bytedance.ies.abmock.p260a.C6382b.class
            java.lang.annotation.Annotation r6 = r5.getAnnotation(r6)
            com.bytedance.ies.abmock.a.b r6 = (com.bytedance.ies.abmock.p260a.C6382b) r6
            if (r6 == 0) goto L_0x0021
            boolean r4 = r6.mo15285a()
            if (r4 != 0) goto L_0x001f
            r4 = r5
            goto L_0x0021
        L_0x001f:
            r4 = r5
            goto L_0x0024
        L_0x0021:
            int r3 = r3 + 1
            goto L_0x0009
        L_0x0024:
            if (r4 == 0) goto L_0x00ee
            r8 = 1
            r4.setAccessible(r8)
            java.lang.Class r0 = r4.getType()
            java.lang.String r0 = r0.getName()
            r3 = -1
            int r5 = r0.hashCode()
            switch(r5) {
                case -1325958191: goto L_0x006c;
                case 104431: goto L_0x0063;
                case 3327612: goto L_0x0059;
                case 64711720: goto L_0x004f;
                case 392722245: goto L_0x0045;
                case 1195259493: goto L_0x003b;
                default: goto L_0x003a;
            }
        L_0x003a:
            goto L_0x0076
        L_0x003b:
            java.lang.String r8 = "java.lang.String"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 4
            goto L_0x0077
        L_0x0045:
            java.lang.String r8 = "[Ljava.lang.String;"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 5
            goto L_0x0077
        L_0x004f:
            java.lang.String r1 = "boolean"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r1 = 1
            goto L_0x0077
        L_0x0059:
            java.lang.String r8 = "long"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 2
            goto L_0x0077
        L_0x0063:
            java.lang.String r8 = "int"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            goto L_0x0077
        L_0x006c:
            java.lang.String r8 = "double"
            boolean r8 = r0.equals(r8)
            if (r8 == 0) goto L_0x0076
            r1 = 3
            goto L_0x0077
        L_0x0076:
            r1 = -1
        L_0x0077:
            switch(r1) {
                case 0: goto L_0x00d9;
                case 1: goto L_0x00c4;
                case 2: goto L_0x00af;
                case 3: goto L_0x0099;
                case 4: goto L_0x008c;
                case 5: goto L_0x0085;
                default: goto L_0x007a;
            }
        L_0x007a:
            com.bytedance.ies.abmock.d r8 = r7.f18678c
            java.lang.Class r0 = r4.getType()
            java.lang.Object r8 = r8.mo15301a(r9, r0)
            return r8
        L_0x0085:
            com.bytedance.ies.abmock.d r8 = r7.f18678c
            java.lang.String[] r8 = r8.mo15316b(r9)
            return r8
        L_0x008c:
            com.bytedance.ies.abmock.d r8 = r7.f18678c
            java.lang.Object r0 = r4.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r8 = r8.mo15302a(r9, r0)
            return r8
        L_0x0099:
            com.bytedance.ies.abmock.d r8 = r7.f18678c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            double r0 = (double) r0
            double r8 = r8.mo15297a(r9, r0)
            java.lang.Double r8 = java.lang.Double.valueOf(r8)
            return r8
        L_0x00af:
            com.bytedance.ies.abmock.d r8 = r7.f18678c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            long r8 = r8.mo15299a(r9, r0)
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            return r8
        L_0x00c4:
            com.bytedance.ies.abmock.d r8 = r7.f18678c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            boolean r8 = r8.mo15310a(r9, r0)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L_0x00d9:
            com.bytedance.ies.abmock.d r8 = r7.f18678c
            java.lang.Object r0 = r4.get(r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r8 = r8.mo15298a(r9, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            return r8
        L_0x00ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.abmock.C6384b.m19837a(java.lang.Class, java.lang.String):java.lang.Object");
    }

    /* renamed from: a */
    private void m19842a(Class cls, boolean z, Object obj) {
        m19843a(cls.getName(), z, obj);
    }

    /* renamed from: a */
    private void m19843a(String str, boolean z, Object obj) {
        if (z && obj != null) {
            this.f18679e.put(str, obj);
        }
    }

    /* renamed from: a */
    private Object m19839a(Class cls, boolean z, String str) {
        if (mo15293b() && C6385c.f18680a.mo15320b()) {
            Object a = C6385c.f18680a.mo15317a(str);
            if (a != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls.getName());
                sb.append(" 正在使用 mock 的数据!!");
                C6380a.m19832a(sb.toString());
                return a;
            }
        }
        if (z) {
            Object obj = this.f18679e.get(cls.getName());
            if (obj != null) {
                return obj;
            }
        }
        return null;
    }

    /* renamed from: a */
    private Object m19838a(Class cls, String str, boolean z, Class cls2) {
        Object obj;
        String name = cls.getName();
        Object a = m19839a(cls, z, str);
        if (a != null) {
            return a;
        }
        try {
            if (this.f18678c.mo15309a()) {
                obj = m19837a(cls, str);
            } else {
                obj = m19840a(str);
            }
            m19843a(name, z, obj);
            return obj;
        } catch (Exception unused) {
            return m19841a(name, str, z, cls2);
        }
    }

    /* renamed from: a */
    private <T> T m19841a(String str, String str2, boolean z, Class<T> cls) {
        try {
            T a = C6389g.m19890a().mo15970a(this.f18678c.mo15300a(str2), cls);
            m19843a(str, z, (Object) a);
            return a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
