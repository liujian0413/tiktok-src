package com.p280ss.android.ugc.aweme.shortvideo.record;

import com.p280ss.android.ugc.asve.constant.AS_ENCODE_PROFILE;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.AVSettings;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.tools.RecordingSpeed;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PROFILE;
import kotlin.C7581n;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.g */
public final class C40312g {
    /* renamed from: a */
    private static boolean m128763a(int i) {
        return i == 1 || i == 2 || i == 8;
    }

    /* renamed from: c */
    public static boolean m128765c() {
        return C35563c.f93231M.mo93305a(Property.EnableSATCamera);
    }

    /* renamed from: a */
    public static ENCODE_PROFILE m128761a() {
        int d = m128766d();
        if (d == 8) {
            return ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
        }
        switch (d) {
            case 1:
                return ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
            case 2:
                return ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
            default:
                return ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        }
    }

    /* renamed from: b */
    public static AS_ENCODE_PROFILE m128764b() {
        int d = m128766d();
        if (d == 8) {
            return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_HIGH;
        }
        switch (d) {
            case 1:
                return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_BASELINE;
            case 2:
                return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_MAIN;
            default:
                return AS_ENCODE_PROFILE.AS_ENCODE_PROFILE_UNKNOWN;
        }
    }

    /* renamed from: d */
    private static int m128766d() {
        int i;
        if (C35563c.f93230L.mo93343b(AVSettings.Property.RecordHardwareProfile) != 1) {
            i = C35563c.f93230L.mo93343b(AVSettings.Property.RecordHardwareProfile);
        } else if (C35563c.f93231M.mo93306b(Property.RecordHardwareProfile) != 1) {
            i = C35563c.f93231M.mo93306b(Property.RecordHardwareProfile);
        } else {
            i = 1;
        }
        if (!m128763a(i)) {
            return 1;
        }
        return i;
    }

    /* renamed from: a */
    public static void m128762a(ASCameraView aSCameraView, boolean z, RecordingSpeed recordingSpeed, C7562b<Integer, C7581n> bVar) {
        ASCameraView aSCameraView2 = aSCameraView;
        aSCameraView2.mo56210a((double) recordingSpeed.value(), !z, C36964i.m118929e(), C35563c.f93230L.mo93343b(AVSettings.Property.RecordBitrateMode), m128766d(), false, bVar);
    }
}
