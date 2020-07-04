package kotlinx.coroutines;

import kotlinx.coroutines.internal.C48178v;

/* renamed from: kotlinx.coroutines.bp */
public final class C48113bp {

    /* renamed from: a */
    public static final C48178v f122977a = new C48178v("SEALED");

    /* renamed from: b */
    public static final C48084aw f122978b = new C48084aw(false);

    /* renamed from: c */
    public static final C48084aw f122979c = new C48084aw(true);

    /* renamed from: a */
    public static final Object m149221a(Object obj) {
        if (obj instanceof C48095bd) {
            return new C48096be((C48095bd) obj);
        }
        return obj;
    }

    /* renamed from: b */
    public static final Object m149222b(Object obj) {
        Object obj2;
        if (!(obj instanceof C48096be)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C48096be beVar = (C48096be) obj2;
        if (beVar == null) {
            return obj;
        }
        C48095bd bdVar = beVar.f122959a;
        if (bdVar == null) {
            return obj;
        }
        return bdVar;
    }
}
