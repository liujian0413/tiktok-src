package androidx.work;

import java.util.List;

/* renamed from: androidx.work.f */
public abstract class C1460f {
    /* renamed from: a */
    public abstract C1458e mo6664a(List<C1458e> list);

    /* renamed from: a */
    public static C1460f m7328a(String str) {
        try {
            return (C1460f) Class.forName(str).newInstance();
        } catch (Exception e) {
            new StringBuilder("Trouble instantiating + ").append(str);
            new Throwable[1][0] = e;
            return null;
        }
    }
}
