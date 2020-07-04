package kotlin.p355d.p1881a;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.C7573i;
import kotlin.p355d.C47958a;

/* renamed from: kotlin.d.a.a */
public final class C47959a extends C47958a {
    /* renamed from: a */
    public final Random mo120162a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C7573i.m23582a((Object) current, "ThreadLocalRandom.current()");
        return current;
    }

    /* renamed from: a */
    public final int mo19426a(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }
}
