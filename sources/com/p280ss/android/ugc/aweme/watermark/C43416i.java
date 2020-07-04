package com.p280ss.android.ugc.aweme.watermark;

import com.p280ss.android.ugc.aweme.account.model.C22200c;
import com.p280ss.android.ugc.aweme.photo.C34773p;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.p1591s.C40318a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41640a;
import com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.WaterMarkPositionConfig;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.C45244a;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_BITRATE_MODE;
import com.p280ss.android.vesdk.VEVideoEncodeSettings.ENCODE_PRESET;
import com.p280ss.android.vesdk.VEWatermarkParam;
import com.p280ss.android.vesdk.VEWatermarkParam.VEWatermarkMask;
import dmt.p1861av.video.C47397a;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.watermark.i */
public final class C43416i {

    /* renamed from: a */
    public static final C43416i f112439a = new C43416i();

    private C43416i() {
    }

    /* renamed from: b */
    public static final boolean m137764b(int i, int i2) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d2);
        double d3 = d2 * 1.0d;
        Double.isNaN(d);
        if (Math.abs((d / d3) - 1.7777777777777777d) < 0.001d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final VEVideoEncodeSettings m137757a(int i, int i2) {
        C45244a aVar = new C45244a(3);
        aVar.mo108173g(C47397a.m148009a(C36964i.m118939o())).mo108149a(i, i2);
        if (C36964i.m118926b()) {
            aVar.mo108166b(true).mo108153a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_ABR, C47397a.m148008a(C36964i.m118930f()));
        } else {
            aVar.mo108166b(false).mo108153a(ENCODE_BITRATE_MODE.ENCODE_BITRATE_CRF, C47397a.m148011b(C36964i.m118936l()));
        }
        ENCODE_PRESET c = C47397a.m148012c(C36964i.m118938n());
        if (c != null) {
            aVar.mo108154a(c);
        }
        aVar.mo108150a(C47397a.m148010a(C36964i.m118937m()));
        aVar.mo108160a(false);
        aVar.mo108172f(1);
        VEVideoEncodeSettings a = aVar.mo108162a();
        C7573i.m23582a((Object) a, "settingsBuilder.build()");
        return a;
    }

    /* renamed from: a */
    public static final C41640a m137756a(int i, String str, int[] iArr) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(iArr, "videoSize");
        if (4 == i) {
            return new C43415h(str, iArr[0], iArr[1]);
        }
        return new C43401a(str, iArr[0], iArr[1], i);
    }

    /* renamed from: a */
    private static VEWatermarkParam m137760a(C41640a aVar, C22200c cVar, boolean z, String str) {
        boolean z2;
        String[] b = aVar.mo102264b(true, cVar);
        WaterMarkPositionConfig a = aVar.mo102261a();
        if (b != null) {
            boolean z3 = false;
            if (b.length == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
                vEWatermarkParam.images = b;
                vEWatermarkParam.interval = 2;
                vEWatermarkParam.xOffset = a.xOffset;
                vEWatermarkParam.yOffset = a.yOffset;
                int[] a2 = C34773p.m112163a(b[0]);
                vEWatermarkParam.width = a2[0];
                vEWatermarkParam.height = a2[1];
                vEWatermarkParam.position = a.position;
                if (z) {
                    if (str.length() > 0) {
                        z3 = true;
                    }
                    if (z3) {
                        vEWatermarkParam.needExtFile = true;
                        vEWatermarkParam.extFile = str;
                    }
                }
                return vEWatermarkParam;
            }
        }
        return null;
    }

    /* renamed from: b */
    private final VEWatermarkParam m137763b(C41640a aVar, C22200c cVar, int[] iArr, boolean z, String str, boolean z2) {
        return m137762a(aVar.mo102264b(true, cVar), aVar.mo102264b(false, cVar), iArr, aVar.mo102261a(), z, str, z2);
    }

    /* renamed from: a */
    public static final VEWatermarkParam m137761a(C41640a aVar, C22200c cVar, int[] iArr, boolean z, String str, boolean z2) {
        C7573i.m23587b(aVar, "provider");
        C7573i.m23587b(iArr, "videoSize");
        C7573i.m23587b(str, "extFile");
        if (aVar instanceof C43415h) {
            return m137760a(aVar, cVar, z, str);
        }
        if (aVar instanceof C43401a) {
            return f112439a.m137763b(aVar, cVar, iArr, z, str, z2);
        }
        return null;
    }

    /* renamed from: a */
    public static final VEWatermarkParam m137758a(int i, String str, C22200c cVar, int[] iArr, boolean z, String str2, boolean z2) {
        C7573i.m23587b(str, "videoPath");
        C7573i.m23587b(iArr, "videoSize");
        C7573i.m23587b(str2, "extFile");
        return m137761a(m137756a(i, str, iArr), cVar, iArr, z, str2, z2);
    }

    /* renamed from: a */
    private static VEWatermarkParam m137762a(String[] strArr, String[] strArr2, int[] iArr, WaterMarkPositionConfig waterMarkPositionConfig, boolean z, String str, boolean z2) {
        boolean z3;
        float f;
        boolean z4;
        if (strArr != null) {
            if (strArr.length == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3 && waterMarkPositionConfig != null) {
                VEWatermarkParam vEWatermarkParam = new VEWatermarkParam();
                vEWatermarkParam.images = strArr;
                vEWatermarkParam.secondHalfImages = strArr2;
                vEWatermarkParam.interval = 2;
                int[] a = C34773p.m112163a(strArr[0]);
                int i = a[0];
                int i2 = a[1];
                if (iArr[0] < iArr[1]) {
                    f = 0.08695652f;
                } else {
                    f = 0.13122173f;
                }
                float max = Math.max(((float) iArr[1]) * f, 58.0f);
                float f2 = (float) i;
                float f3 = (f2 * max) / ((float) i2);
                vEWatermarkParam.width = (int) f3;
                vEWatermarkParam.height = (int) max;
                vEWatermarkParam.xOffset = waterMarkPositionConfig.xOffset;
                vEWatermarkParam.yOffset = waterMarkPositionConfig.yOffset;
                float f4 = f3 / f2;
                vEWatermarkParam.xOffset = (int) (((float) vEWatermarkParam.xOffset) * f4);
                vEWatermarkParam.yOffset = (int) (f4 * ((float) vEWatermarkParam.yOffset));
                vEWatermarkParam.position = waterMarkPositionConfig.position;
                if (z) {
                    if (str.length() > 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        vEWatermarkParam.needExtFile = true;
                        vEWatermarkParam.extFile = str;
                    }
                }
                if (C35563c.f93230L.mo93342a(Property.EnableWaterBgMask) && !z2) {
                    VEWatermarkMask vEWatermarkMask = new VEWatermarkMask();
                    vEWatermarkMask.maskImage = C40318a.m128777a(!m137764b(iArr[1], iArr[0]));
                    vEWatermarkMask.xOffset = 0;
                    vEWatermarkMask.yOffset = 0;
                    vEWatermarkMask.width = iArr[0];
                    vEWatermarkMask.height = iArr[1];
                    if (m137764b(iArr[1], iArr[0])) {
                        double d = (double) iArr[0];
                        Double.isNaN(d);
                        vEWatermarkMask.yOffset += (((int) (d * 1.7777777777777777d)) - iArr[1]) / 2;
                    }
                    vEWatermarkParam.mask = vEWatermarkMask;
                }
                return vEWatermarkParam;
            }
        }
        return null;
    }
}
