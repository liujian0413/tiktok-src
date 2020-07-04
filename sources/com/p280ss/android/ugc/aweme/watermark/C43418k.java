package com.p280ss.android.ugc.aweme.watermark;

import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import com.p280ss.android.vesdk.VEVideoEncodeSettings;
import com.p280ss.android.vesdk.VEWatermarkParam;
import java.io.File;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.watermark.k */
public final class C43418k extends C43428s {

    /* renamed from: a */
    public C43417j f112445a;

    /* renamed from: b */
    public C43402b f112446b;

    /* renamed from: c */
    public VIDEO_RATIO f112447c;

    /* renamed from: d */
    public int f112448d;

    /* renamed from: e */
    public final VEWatermarkParam f112449e;

    /* renamed from: f */
    public VEVideoEncodeSettings f112450f;

    /* renamed from: a */
    public final void mo105323a(C43417j jVar) {
        if (jVar != null) {
            String str = jVar.f112440a;
            if (!new File(str).exists()) {
                str = null;
            }
            if (str != null) {
                this.f112445a = jVar;
            }
        }
    }

    public C43418k(String str, String str2, VEWatermarkParam vEWatermarkParam, VEVideoEncodeSettings vEVideoEncodeSettings, C43402b bVar) {
        C7573i.m23587b(str, "inputMediaPath");
        C7573i.m23587b(str2, "outputMediaPath");
        C7573i.m23587b(vEVideoEncodeSettings, "encodeSettings");
        super(str, str2, null);
        this.f112449e = vEWatermarkParam;
        this.f112450f = vEVideoEncodeSettings;
        this.f112446b = bVar;
        this.f112447c = VIDEO_RATIO.VIDEO_OUT_RATIO_ORIGINAL;
        this.f112448d = -16777216;
    }

    public /* synthetic */ C43418k(String str, String str2, VEWatermarkParam vEWatermarkParam, VEVideoEncodeSettings vEVideoEncodeSettings, C43402b bVar, int i, C7571f fVar) {
        this(str, str2, vEWatermarkParam, vEVideoEncodeSettings, null);
    }
}
