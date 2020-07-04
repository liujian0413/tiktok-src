package com.p280ss.android.ugc.aweme.shortvideo.util;

import com.p280ss.android.medialib.camera.C19667g;
import com.p280ss.android.ugc.asve.constant.ASCameraType;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.k */
public final class C41558k {
    /* renamed from: b */
    public static String m132345b(int i) {
        switch (i) {
            case 1:
                return "camera1";
            case 2:
                return "camera2";
            case 3:
                return "hwcamera";
            case 4:
                return "xiaomicamera";
            case 5:
                return "oppocamera";
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static int m132341a() {
        return C35563c.f93230L.mo93343b(Property.RecordUseSuccessCameraType);
    }

    /* renamed from: e */
    private static int m132348e() {
        return C35563c.f93231M.mo93306b(AVAB.Property.RecordCameraTypeAB);
    }

    /* renamed from: c */
    private static int m132346c() {
        if (C35563c.f93231M.mo93306b(AVAB.Property.RecordCameraCompatLevelAB) == -1) {
            return C35563c.f93230L.mo93343b(Property.RecordCameraCompatLevel);
        }
        return C35563c.f93231M.mo93306b(AVAB.Property.RecordCameraCompatLevelAB);
    }

    /* renamed from: b */
    public static String m132344b() {
        switch (C19667g.m64797b().mo52309a()) {
            case 1:
                return "camera1";
            case 2:
                return "camera2";
            case 3:
                return "hwcamera";
            case 4:
                return "xiaomicamera";
            case 5:
                return "oppocamera";
            default:
                return "";
        }
    }

    /* renamed from: d */
    private static int m132347d() {
        boolean z;
        if (C35563c.f93230L.mo93343b(Property.InCamera2BlackList) == 1) {
            return 1;
        }
        if (C35563c.f93230L.mo93343b(Property.RecordCameraType) == 2) {
            return ASCameraType.toIntValue(ASCameraType.AS_CAMERA_CHRY_CAMKIT);
        }
        switch (m132348e()) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                if (C35563c.f93230L.mo93343b(Property.RecordCameraType) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return 2;
                }
                return 1;
        }
    }

    /* renamed from: a */
    public static void m132343a(int i) {
        if (i == 2) {
            C35563c.f93230L.mo93338a(Property.RecordUseSuccessCameraType, 1);
        } else {
            C35563c.f93230L.mo93338a(Property.RecordUseSuccessCameraType, 0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.asve.context.C15420a m132342a(android.content.Context r5) {
        /*
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.WideCameraInfo
            int r0 = r0.mo93343b(r1)
            boolean r1 = dmt.p1861av.video.p1863b.C47450e.m148163a()
            int r5 = com.p280ss.android.ugc.asve.recorder.camera.C20703a.m68740a(r5, r0, r1)
            com.ss.android.ugc.aweme.property.AVSettings r0 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93230L
            com.ss.android.ugc.aweme.property.AVSettings$Property r1 = com.p280ss.android.ugc.aweme.property.AVSettings.Property.ShakeFreeWhiteList
            int r0 = r0.mo93343b(r1)
            int r0 = com.p280ss.android.ugc.asve.recorder.camera.p923a.C20705b.m68747a(r0)
            r1 = 1
            r2 = 0
            if (r5 == r1) goto L_0x0055
            boolean r3 = com.p280ss.android.ugc.aweme.shortvideo.C40019k.m127927a()
            if (r3 != 0) goto L_0x0055
            r3 = 3
            if (r0 != r3) goto L_0x002a
            goto L_0x0055
        L_0x002a:
            if (r5 == r3) goto L_0x0052
            if (r0 != r1) goto L_0x002f
            goto L_0x0052
        L_0x002f:
            r3 = 2
            if (r0 != r3) goto L_0x0035
            com.ss.android.ugc.asve.constant.ASCameraType r5 = com.p280ss.android.ugc.asve.constant.ASCameraType.AS_CAMERA_OPPO
            goto L_0x0057
        L_0x0035:
            r4 = 5
            if (r5 == r4) goto L_0x004f
            if (r0 != r4) goto L_0x003b
            goto L_0x004f
        L_0x003b:
            if (r5 != r3) goto L_0x0042
            com.ss.android.ugc.asve.constant.ASCameraType r5 = com.p280ss.android.ugc.asve.constant.ASCameraType.AS_CAMERA_2
            r0 = 0
            r1 = 0
            goto L_0x0058
        L_0x0042:
            int r5 = m132347d()
            com.ss.android.ugc.asve.constant.ASCameraType r5 = com.p280ss.android.ugc.asve.constant.ASCameraType.fromOrdinal(r5)
            int r0 = m132346c()
            goto L_0x0058
        L_0x004f:
            com.ss.android.ugc.asve.constant.ASCameraType r5 = com.p280ss.android.ugc.asve.constant.ASCameraType.AS_CAMERA_VIVO
            goto L_0x0057
        L_0x0052:
            com.ss.android.ugc.asve.constant.ASCameraType r5 = com.p280ss.android.ugc.asve.constant.ASCameraType.AS_CAMERA_MI
            goto L_0x0057
        L_0x0055:
            com.ss.android.ugc.asve.constant.ASCameraType r5 = com.p280ss.android.ugc.asve.constant.ASCameraType.AS_CAMERA_CHRY
        L_0x0057:
            r0 = 0
        L_0x0058:
            com.ss.android.ugc.aweme.property.AVAB r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r4 = com.p280ss.android.ugc.aweme.property.AVAB.Property.EnableExposureOptimize
            boolean r3 = r3.mo93305a(r4)
            if (r3 == 0) goto L_0x006b
            com.ss.android.ugc.asve.constant.AS_CAMERA_OPTION_FLAG r3 = com.p280ss.android.ugc.asve.constant.AS_CAMERA_OPTION_FLAG.AS_OPTION_FLAG_PICTURE_SIZE
            byte r3 = r3.getOption()
            r2 = r2 | r3
            byte r2 = (byte) r2
            goto L_0x0075
        L_0x006b:
            com.ss.android.ugc.asve.constant.AS_CAMERA_OPTION_FLAG r3 = com.p280ss.android.ugc.asve.constant.AS_CAMERA_OPTION_FLAG.AS_OPTION_FLAG_PICTURE_SIZE
            byte r3 = r3.getOption()
            r3 = r3 ^ -1
            r2 = r2 & r3
            byte r2 = (byte) r2
        L_0x0075:
            com.ss.android.ugc.aweme.property.AVAB r3 = com.p280ss.android.ugc.aweme.port.p1479in.C35563c.f93231M
            com.ss.android.ugc.aweme.property.AVAB$Property r4 = com.p280ss.android.ugc.aweme.property.AVAB.Property.CameraOptionFlagsOpt
            boolean r3 = r3.mo93305a(r4)
            if (r3 == 0) goto L_0x0082
            r2 = r2 | 8
            byte r2 = (byte) r2
        L_0x0082:
            com.ss.android.ugc.aweme.shortvideo.util.k$1 r3 = new com.ss.android.ugc.aweme.shortvideo.util.k$1
            r3.<init>(r5, r0, r1, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.util.C41558k.m132342a(android.content.Context):com.ss.android.ugc.asve.context.a");
    }
}
