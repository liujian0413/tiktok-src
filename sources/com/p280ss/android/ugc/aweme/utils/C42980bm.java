package com.p280ss.android.ugc.aweme.utils;

import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.bm */
public final class C42980bm {

    /* renamed from: a */
    public static HashMap<String, C42979bl> f111537a = new HashMap<>();

    /* renamed from: b */
    public static final C42981a f111538b = new C42981a(null);

    /* renamed from: com.ss.android.ugc.aweme.utils.bm$a */
    public static final class C42981a {
        private C42981a() {
        }

        public /* synthetic */ C42981a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C42979bl m136451a(String str) {
            C7573i.m23587b(str, "type");
            C42979bl blVar = (C42979bl) C42980bm.f111537a.get(str);
            if (blVar != null) {
                return blVar;
            }
            C42979bl dlVar = new C43061dl(str, C7163a.m22363a());
            C42980bm.f111537a.put(str, dlVar);
            return dlVar;
        }
    }

    /* renamed from: a */
    public static final C42979bl m136450a(String str) {
        return C42981a.m136451a(str);
    }
}
