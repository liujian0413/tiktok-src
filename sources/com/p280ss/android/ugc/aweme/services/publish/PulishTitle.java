package com.p280ss.android.ugc.aweme.services.publish;

import com.p280ss.android.ugc.aweme.i18n.C30538p;
import kotlin.jvm.internal.C7571f;

/* renamed from: com.ss.android.ugc.aweme.services.publish.PulishTitle */
public final class PulishTitle {
    public static final Companion Companion = new Companion(null);
    public static final int MAX_LINES;
    public static final int MAX_WORDS;

    /* renamed from: com.ss.android.ugc.aweme.services.publish.PulishTitle$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }
    }

    static {
        int i;
        int i2;
        if (C30538p.m99745a()) {
            i = 100;
        } else {
            i = 55;
        }
        MAX_WORDS = i;
        if (C30538p.m99745a()) {
            i2 = 3;
        } else {
            i2 = 4;
        }
        MAX_LINES = i2;
    }
}
