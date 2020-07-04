package kotlin.jvm.internal;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.C7504c;
import kotlin.jvm.internal.p358a.C48014e;
import kotlin.jvm.internal.p358a.C48015f;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.internal.p358a.C7566b;
import kotlin.jvm.internal.p358a.C7567c;
import kotlin.jvm.internal.p358a.C7568d;
import kotlin.jvm.p357a.C47993c;
import kotlin.jvm.p357a.C47994d;
import kotlin.jvm.p357a.C47995e;
import kotlin.jvm.p357a.C47996f;
import kotlin.jvm.p357a.C47997g;
import kotlin.jvm.p357a.C47998h;
import kotlin.jvm.p357a.C47999i;
import kotlin.jvm.p357a.C48000j;
import kotlin.jvm.p357a.C48001k;
import kotlin.jvm.p357a.C48002l;
import kotlin.jvm.p357a.C48003n;
import kotlin.jvm.p357a.C48004o;
import kotlin.jvm.p357a.C48005p;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C48007r;
import kotlin.jvm.p357a.C48008s;
import kotlin.jvm.p357a.C48009t;
import kotlin.jvm.p357a.C48010u;
import kotlin.jvm.p357a.C48011v;
import kotlin.jvm.p357a.C48012w;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: kotlin.jvm.internal.n */
public class C7577n {
    /* renamed from: a */
    private static ClassCastException m23615a(ClassCastException classCastException) {
        throw ((ClassCastException) m23618a((T) classCastException));
    }

    /* renamed from: a */
    private static <T extends Throwable> T m23618a(T t) {
        return C7573i.m23579a(t, C7577n.class.getName());
    }

    /* renamed from: c */
    public static boolean m23623c(Object obj) {
        if (!(obj instanceof List) || ((obj instanceof C7565a) && !(obj instanceof C7568d))) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    private static Iterable m23627g(Object obj) {
        try {
            return (Iterable) obj;
        } catch (ClassCastException e) {
            throw m23615a(e);
        }
    }

    /* renamed from: h */
    private static Collection m23628h(Object obj) {
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            throw m23615a(e);
        }
    }

    /* renamed from: i */
    private static List m23629i(Object obj) {
        try {
            return (List) obj;
        } catch (ClassCastException e) {
            throw m23615a(e);
        }
    }

    /* renamed from: j */
    private static Set m23630j(Object obj) {
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            throw m23615a(e);
        }
    }

    /* renamed from: k */
    private static Map m23631k(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw m23615a(e);
        }
    }

    /* renamed from: a */
    public static Iterable m23616a(Object obj) {
        if ((obj instanceof C7565a) && !(obj instanceof C7567c)) {
            m23619a(obj, "kotlin.collections.MutableIterable");
        }
        return m23627g(obj);
    }

    /* renamed from: b */
    public static Collection m23621b(Object obj) {
        if ((obj instanceof C7565a) && !(obj instanceof C7566b)) {
            m23619a(obj, "kotlin.collections.MutableCollection");
        }
        return m23628h(obj);
    }

    /* renamed from: d */
    public static List m23624d(Object obj) {
        if ((obj instanceof C7565a) && !(obj instanceof C7568d)) {
            m23619a(obj, "kotlin.collections.MutableList");
        }
        return m23629i(obj);
    }

    /* renamed from: e */
    public static Set m23625e(Object obj) {
        if ((obj instanceof C7565a) && !(obj instanceof C48015f)) {
            m23619a(obj, "kotlin.collections.MutableSet");
        }
        return m23630j(obj);
    }

    /* renamed from: f */
    public static Map m23626f(Object obj) {
        if ((obj instanceof C7565a) && !(obj instanceof C48014e)) {
            m23619a(obj, "kotlin.collections.MutableMap");
        }
        return m23631k(obj);
    }

    /* renamed from: a */
    private static void m23620a(String str) {
        throw m23615a(new ClassCastException(str));
    }

    /* renamed from: l */
    private static int m23632l(Object obj) {
        if (obj instanceof C7572h) {
            return ((C7572h) obj).getArity();
        }
        if (obj instanceof C7561a) {
            return 0;
        }
        if (obj instanceof C7562b) {
            return 1;
        }
        if (obj instanceof C7563m) {
            return 2;
        }
        if (obj instanceof C48006q) {
            return 3;
        }
        if (obj instanceof C48007r) {
            return 4;
        }
        if (obj instanceof C48008s) {
            return 5;
        }
        if (obj instanceof C48009t) {
            return 6;
        }
        if (obj instanceof C48010u) {
            return 7;
        }
        if (obj instanceof C48011v) {
            return 8;
        }
        if (obj instanceof C48012w) {
            return 9;
        }
        if (obj instanceof C47993c) {
            return 10;
        }
        if (obj instanceof C47994d) {
            return 11;
        }
        if (obj instanceof C47995e) {
            return 12;
        }
        if (obj instanceof C47996f) {
            return 13;
        }
        if (obj instanceof C47997g) {
            return 14;
        }
        if (obj instanceof C47998h) {
            return 15;
        }
        if (obj instanceof C47999i) {
            return 16;
        }
        if (obj instanceof C48000j) {
            return 17;
        }
        if (obj instanceof C48001k) {
            return 18;
        }
        if (obj instanceof C48002l) {
            return 19;
        }
        if (obj instanceof C48003n) {
            return 20;
        }
        if (obj instanceof C48004o) {
            return 21;
        }
        if (obj instanceof C48005p) {
            return 22;
        }
        return -1;
    }

    /* renamed from: b */
    private static boolean m23622b(Object obj, int i) {
        if (!(obj instanceof C7504c) || m23632l(obj) != i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Object m23617a(Object obj, int i) {
        if (obj != null && !m23622b(obj, i)) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.functions.Function");
            sb.append(i);
            m23619a(obj, sb.toString());
        }
        return obj;
    }

    /* renamed from: a */
    private static void m23619a(Object obj, String str) {
        String str2;
        if (obj == null) {
            str2 = TEVideoRecorder.FACE_BEAUTY_NULL;
        } else {
            str2 = obj.getClass().getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" cannot be cast to ");
        sb.append(str);
        m23620a(sb.toString());
    }
}
