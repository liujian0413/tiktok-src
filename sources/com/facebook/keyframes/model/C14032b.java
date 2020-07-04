package com.facebook.keyframes.model;

import com.facebook.keyframes.p733b.C14011c;

/* renamed from: com.facebook.keyframes.model.b */
public final class C14032b implements C14031a {

    /* renamed from: a */
    public final float[] f37056a;

    /* renamed from: b */
    private final int f37057b;

    /* renamed from: com.facebook.keyframes.model.b$a */
    public static class C14034a {

        /* renamed from: a */
        public int f37058a;

        /* renamed from: b */
        public float[] f37059b;

        /* renamed from: a */
        public final C14032b mo33690a() {
            return new C14032b(this.f37058a, this.f37059b);
        }
    }

    /* renamed from: a */
    public final int mo33689a() {
        return this.f37057b;
    }

    private C14032b(int i, float[] fArr) {
        boolean z;
        this.f37057b = i;
        if (fArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f37056a = (float[]) C14011c.m41368a(fArr, z, "data");
    }
}
