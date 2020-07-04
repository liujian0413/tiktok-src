package kotlin.text;

import java.nio.charset.Charset;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.text.d */
public final class C48038d {

    /* renamed from: a */
    public static final Charset f122880a;

    /* renamed from: b */
    public static final Charset f122881b;

    /* renamed from: c */
    public static final Charset f122882c;

    /* renamed from: d */
    public static final Charset f122883d;

    /* renamed from: e */
    public static final Charset f122884e;

    /* renamed from: f */
    public static final Charset f122885f;

    /* renamed from: g */
    public static final C48038d f122886g = new C48038d();

    private C48038d() {
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        C7573i.m23582a((Object) forName, "Charset.forName(\"UTF-8\")");
        f122880a = forName;
        Charset forName2 = Charset.forName("UTF-16");
        C7573i.m23582a((Object) forName2, "Charset.forName(\"UTF-16\")");
        f122881b = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        C7573i.m23582a((Object) forName3, "Charset.forName(\"UTF-16BE\")");
        f122882c = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        C7573i.m23582a((Object) forName4, "Charset.forName(\"UTF-16LE\")");
        f122883d = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        C7573i.m23582a((Object) forName5, "Charset.forName(\"US-ASCII\")");
        f122884e = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        C7573i.m23582a((Object) forName6, "Charset.forName(\"ISO-8859-1\")");
        f122885f = forName6;
    }
}
