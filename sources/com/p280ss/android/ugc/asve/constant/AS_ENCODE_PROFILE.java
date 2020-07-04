package com.p280ss.android.ugc.asve.constant;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.AS_ENCODE_PROFILE */
public enum AS_ENCODE_PROFILE {
    AS_ENCODE_PROFILE_UNKNOWN,
    AS_ENCODE_PROFILE_BASELINE,
    AS_ENCODE_PROFILE_MAIN,
    AS_ENCODE_PROFILE_HIGH;
    
    public static final C15406a Companion = null;

    /* renamed from: com.ss.android.ugc.asve.constant.AS_ENCODE_PROFILE$a */
    public static final class C15406a {
        private C15406a() {
        }

        public /* synthetic */ C15406a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static AS_ENCODE_PROFILE m45059a(int i) {
            switch (i) {
                case 0:
                    return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_UNKNOWN;
                case 1:
                    return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_BASELINE;
                case 2:
                    return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_MAIN;
                case 3:
                    return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_HIGH;
                default:
                    return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_UNKNOWN;
            }
        }

        /* renamed from: a */
        public static int m45058a(AS_ENCODE_PROFILE as_encode_profile) {
            C7573i.m23587b(as_encode_profile, "asEncodeProfile");
            switch (C15417k.f39723a[as_encode_profile.ordinal()]) {
                case 1:
                    return 0;
                case 2:
                    return 1;
                case 3:
                    return 2;
                case 4:
                    return 3;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    static {
        Companion = new C15406a(null);
    }

    public static final AS_ENCODE_PROFILE fromOrdinal(int i) {
        return C15406a.m45059a(i);
    }

    public static final int toIntValue(AS_ENCODE_PROFILE as_encode_profile) {
        return C15406a.m45058a(as_encode_profile);
    }
}
