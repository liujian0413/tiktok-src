package com.p280ss.android.ugc.aweme.common.p1147h;

import android.animation.TypeEvaluator;
import kotlin.Pair;

/* renamed from: com.ss.android.ugc.aweme.common.h.b */
public final class C25691b implements TypeEvaluator<Pair<? extends Float, ? extends Float>> {

    /* renamed from: a */
    public static final C25691b f67618a = new C25691b();

    private C25691b() {
    }

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        return m84438a(f, (Pair) obj, (Pair) obj2);
    }

    /* renamed from: a */
    private static Pair<Float, Float> m84438a(float f, Pair<Float, Float> pair, Pair<Float, Float> pair2) {
        if (pair == null || pair2 == null) {
            return new Pair<>(Float.valueOf(0.0f), Float.valueOf(0.0f));
        }
        return new Pair<>(Float.valueOf(((((Number) pair2.getFirst()).floatValue() - ((Number) pair.getFirst()).floatValue()) * f) + ((Number) pair.getFirst()).floatValue()), Float.valueOf(((((Number) pair2.getSecond()).floatValue() - ((Number) pair.getSecond()).floatValue()) * f) + ((Number) pair.getSecond()).floatValue()));
    }
}
