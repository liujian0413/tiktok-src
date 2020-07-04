package com.p280ss.android.ugc.aweme.shortvideo.edit;

import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.vesdk.ROTATE_DEGREE;
import com.p280ss.android.vesdk.VESize;
import com.p280ss.android.vesdk.VEUtils;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.k */
public class C39676k extends C39395a {

    /* renamed from: b */
    public int f103162b;

    /* renamed from: c */
    public int f103163c;

    /* renamed from: d */
    public final VideoPublishEditModel f103164d;

    /* renamed from: e */
    private int f103165e;

    /* renamed from: f */
    private int f103166f;

    /* renamed from: c */
    public int mo98355c() {
        mo98956g();
        return this.f103165e;
    }

    /* renamed from: d */
    public int mo98356d() {
        mo98956g();
        return this.f103166f;
    }

    /* renamed from: e */
    public final int mo98357e() {
        mo98956g();
        if (this.f102325a) {
            return this.f103165e;
        }
        return this.f103162b;
    }

    /* renamed from: f */
    public final int mo98358f() {
        mo98956g();
        if (this.f102325a) {
            return this.f103166f;
        }
        return this.f103163c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo98956g() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f103162b == 0 || this.f103163c == 0) {
            if (!this.f103164d.isFastImport) {
                this.f103162b = this.f103164d.videoWidth();
                this.f103163c = this.f103164d.videoHeight();
            } else {
                VESize calcTargetRes = VEUtils.calcTargetRes(new int[]{mo98207a()}, new int[]{mo98209b()}, new ROTATE_DEGREE[]{ROTATE_DEGREE.ROTATE_NONE}, this.f103164d.getPreviewInfo().getPreviewWidth());
                this.f103162b = calcTargetRes.f116385a;
                this.f103163c = calcTargetRes.f116386b;
            }
        }
        if (this.f103165e == 0 || this.f103166f == 0) {
            if (!this.f103164d.mIsFromDraft || !this.f103164d.hasStickers()) {
                boolean a = C39804em.m127437a(this.f103164d.videoWidth(), this.f103164d.videoHeight());
                if (a) {
                    i = this.f103164d.videoWidth();
                } else {
                    int[] k = C36964i.m118935k();
                    if (k != null) {
                        i3 = k[0];
                    } else {
                        i3 = 720;
                    }
                    i = m125903a(C7551d.m23567d(this.f103164d.videoWidth(), i3));
                }
                this.f103165e = i;
                if (a) {
                    i2 = this.f103164d.videoHeight();
                } else {
                    double d = (double) this.f103165e;
                    Double.isNaN(d);
                    i2 = (int) (Math.ceil(d / 9.0d) * 16.0d);
                }
                this.f103166f = i2;
            } else {
                if (this.f103164d.mVideoCanvasWidth > 0) {
                    i4 = this.f103164d.mVideoCanvasWidth;
                } else {
                    i4 = this.f103164d.videoWidth();
                }
                this.f103165e = i4;
                if (this.f103164d.mVideoCanvasHeight > 0) {
                    i5 = this.f103164d.mVideoCanvasHeight;
                } else {
                    i5 = this.f103164d.videoHeight();
                }
                this.f103166f = i5;
            }
        }
    }

    public C39676k(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "editModel");
        super(videoPublishEditModel);
        this.f103164d = videoPublishEditModel;
    }
}
