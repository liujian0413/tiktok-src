package kotlin.p355d;

import java.util.Random;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.d.b */
public final class C47960b extends C47958a {

    /* renamed from: d */
    private final C47961a f122793d = new C47961a();

    /* renamed from: kotlin.d.b$a */
    public static final class C47961a extends ThreadLocal<Random> {
        C47961a() {
        }

        /* renamed from: a */
        private static Random m148901a() {
            return new Random();
        }

        public final /* synthetic */ Object initialValue() {
            return m148901a();
        }
    }

    /* renamed from: a */
    public final Random mo120162a() {
        Object obj = this.f122793d.get();
        C7573i.m23582a(obj, "implStorage.get()");
        return (Random) obj;
    }
}
