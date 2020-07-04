package kotlin.p355d;

import java.util.Random;

/* renamed from: kotlin.d.a */
public abstract class C47958a extends C7542d {
    /* renamed from: a */
    public abstract Random mo120162a();

    /* renamed from: b */
    public final int mo19427b() {
        return mo120162a().nextInt();
    }

    /* renamed from: c */
    public final double mo19428c() {
        return mo120162a().nextDouble();
    }

    /* renamed from: a */
    public final int mo19425a(int i) {
        return C7545e.m23546a(mo120162a().nextInt(), i);
    }
}
