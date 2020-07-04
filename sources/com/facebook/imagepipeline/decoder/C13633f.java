package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.C13307g;
import com.facebook.imagepipeline.p720g.C13649g;
import com.facebook.imagepipeline.p720g.C13650h;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.decoder.f */
public final class C13633f implements C13631d {

    /* renamed from: a */
    private final C13636b f36247a;

    /* renamed from: com.facebook.imagepipeline.decoder.f$a */
    static class C13635a implements C13636b {
        private C13635a() {
        }

        /* renamed from: a */
        public final List<Integer> mo33250a() {
            return Collections.EMPTY_LIST;
        }
    }

    /* renamed from: com.facebook.imagepipeline.decoder.f$b */
    public interface C13636b {
        /* renamed from: a */
        List<Integer> mo33250a();
    }

    public C13633f() {
        this(new C13635a());
    }

    /* renamed from: b */
    public final C13650h mo33248b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        return C13649g.m40258a(i, z, false);
    }

    private C13633f(C13636b bVar) {
        this.f36247a = (C13636b) C13307g.m38940a(bVar);
    }

    /* renamed from: a */
    public final int mo33247a(int i) {
        List a = this.f36247a.mo33250a();
        if (a == null || a.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < a.size(); i2++) {
            if (((Integer) a.get(i2)).intValue() > i) {
                return ((Integer) a.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }
}
