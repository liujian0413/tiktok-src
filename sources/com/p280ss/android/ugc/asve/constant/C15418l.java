package com.p280ss.android.ugc.asve.constant;

import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.constant.l */
public final class C15418l {
    /* renamed from: a */
    public static final ENCODE_PROFILE m45063a(AS_ENCODE_PROFILE as_encode_profile) {
        C7573i.m23587b(as_encode_profile, "$this$toVEEncodeProfile");
        switch (C15419m.f39724a[as_encode_profile.ordinal()]) {
            case 1:
                return ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
            case 2:
                return ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
            case 3:
                return ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
            case 4:
                return ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
