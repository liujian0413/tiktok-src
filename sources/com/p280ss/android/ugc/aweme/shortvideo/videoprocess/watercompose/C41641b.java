package com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose;

import com.p280ss.android.ugc.aweme.shortvideo.p1547a.C38420b;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.aweme.watermark.C43417j;
import com.p280ss.android.ugc.aweme.watermark.C43418k;
import com.p280ss.android.ugc.aweme.watermark.C43428s;
import com.p280ss.android.vesdk.VEListener.C45215k;
import com.p280ss.android.vesdk.VEWatermarkParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.b */
public final class C41641b implements C41644d {

    /* renamed from: a */
    private volatile boolean f108212a;

    /* renamed from: b */
    private C43418k f108213b;

    /* renamed from: c */
    private C38420b f108214c;

    /* renamed from: d */
    private final String f108215d;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.b$a */
    public static final class C41642a implements C45215k {

        /* renamed from: a */
        final /* synthetic */ C41641b f108216a;

        /* renamed from: b */
        final /* synthetic */ C43428s f108217b;

        /* renamed from: c */
        final /* synthetic */ C41643c f108218c;

        public final void onCompileDone() {
            C41643c cVar = this.f108218c;
            if (cVar != null) {
                cVar.mo102268a();
            }
            this.f108216a.mo102266a((C43418k) this.f108217b);
        }

        public final void onCompileProgress(float f) {
            C41643c cVar = this.f108218c;
            if (cVar != null) {
                cVar.mo102269a(f);
            }
        }

        C41642a(C41641b bVar, C43428s sVar, C41643c cVar) {
            this.f108216a = bVar;
            this.f108217b = sVar;
            this.f108218c = cVar;
        }

        public final void onCompileError(int i, int i2, float f, String str) {
            C41643c cVar = this.f108218c;
            if (cVar != null) {
                if (str == null) {
                    str = "";
                }
                cVar.mo102270a(i, str, i2);
            }
            this.f108216a.mo102266a((C43418k) this.f108217b);
        }
    }

    /* renamed from: a */
    public final void mo102265a() {
        if (this.f108212a) {
            C43418k kVar = this.f108213b;
            if (kVar != null) {
                m132549b(kVar);
            }
            C38420b bVar = this.f108214c;
            if (bVar != null) {
                bVar.mo38876t();
            }
            this.f108214c = null;
            this.f108212a = false;
        }
    }

    public C41641b(String str) {
        C7573i.m23587b(str, "workSpace");
        this.f108215d = str;
    }

    /* renamed from: a */
    public final void mo102266a(C43418k kVar) {
        this.f108212a = false;
        C38420b bVar = this.f108214c;
        if (bVar != null) {
            bVar.mo38876t();
        }
        this.f108214c = null;
        m132549b(kVar);
    }

    /* renamed from: b */
    private static void m132549b(C43418k kVar) {
        boolean z;
        boolean z2;
        VEWatermarkParam vEWatermarkParam = kVar.f112449e;
        if (vEWatermarkParam != null) {
            String[] strArr = vEWatermarkParam.images;
            if (strArr != null) {
                if (strArr.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!(!z2)) {
                    strArr = null;
                }
                if (strArr != null) {
                    for (String c : strArr) {
                        C7276d.m22816c(c);
                    }
                }
            }
        }
        VEWatermarkParam vEWatermarkParam2 = kVar.f112449e;
        if (vEWatermarkParam2 != null) {
            String[] strArr2 = vEWatermarkParam2.secondHalfImages;
            if (strArr2 != null) {
                if (strArr2.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(true ^ z)) {
                    strArr2 = null;
                }
                if (strArr2 != null) {
                    for (String c2 : strArr2) {
                        C7276d.m22816c(c2);
                    }
                }
            }
        }
        C43417j jVar = kVar.f112445a;
        if (jVar != null) {
            String str = jVar.f112440a;
            if (str != null) {
                C7276d.m22816c(str);
            }
        }
        C43417j jVar2 = kVar.f112445a;
        if (jVar2 != null) {
            String str2 = jVar2.f112441b;
            if (str2 != null) {
                C7276d.m22816c(str2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0032  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo102267a(com.p280ss.android.ugc.aweme.watermark.C43428s r21, com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41643c r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            java.lang.String r3 = "watermarkParam"
            kotlin.jvm.internal.C7573i.m23587b(r1, r3)
            boolean r3 = r1 instanceof com.p280ss.android.ugc.aweme.watermark.C43418k
            if (r3 == 0) goto L_0x0258
            r3 = r1
            com.ss.android.ugc.aweme.watermark.k r3 = (com.p280ss.android.ugc.aweme.watermark.C43418k) r3
            com.ss.android.vesdk.VEWatermarkParam r4 = r3.f112449e
            r5 = -1
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L_0x0038
            com.ss.android.vesdk.VEWatermarkParam r4 = r3.f112449e
            if (r4 != 0) goto L_0x0020
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0020:
            java.lang.String[] r4 = r4.images
            if (r4 == 0) goto L_0x002f
            int r4 = r4.length
            if (r4 != 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r4 = 0
            goto L_0x0030
        L_0x002f:
            r4 = 1
        L_0x0030:
            if (r4 == 0) goto L_0x0038
            java.lang.String r1 = "images in veWatermarkParam is null or empty"
            r2.mo102270a(r5, r1, r7)
            return
        L_0x0038:
            com.p280ss.android.ugc.aweme.port.p1479in.C35563c.m114839f()
            com.ss.android.ugc.aweme.shortvideo.a.b r4 = r0.f108214c
            r8 = 2
            if (r4 != 0) goto L_0x004f
            com.ss.android.ugc.aweme.shortvideo.a.b r4 = new com.ss.android.ugc.aweme.shortvideo.a.b
            java.lang.String r9 = r0.f108215d
            r4.<init>(r9)
            r4.mo38832c(r7)
            r4.mo38829c(r8)
            r0.f108214c = r4
        L_0x004f:
            com.ss.android.ugc.aweme.shortvideo.a.b r4 = r0.f108214c
            if (r4 == 0) goto L_0x0257
            r0.f108213b = r3
            com.ss.android.vesdk.VEWatermarkParam r9 = r3.f112449e
            if (r9 == 0) goto L_0x0060
            com.ss.android.vesdk.VEVideoEncodeSettings r9 = r3.f112450f
            com.ss.android.vesdk.VEWatermarkParam r10 = r3.f112449e
            r9.setWatermark(r10)
        L_0x0060:
            com.ss.android.ugc.aweme.watermark.j r9 = r3.f112445a
            r10 = 3
            if (r9 == 0) goto L_0x00c2
            com.ss.android.ugc.aweme.watermark.j r9 = r3.f112445a
            if (r9 == 0) goto L_0x00dd
            r5 = 10
            int[] r5 = new int[r5]
            int r11 = r9.f112443d
            if (r11 > 0) goto L_0x007a
            java.lang.String r11 = r1.f112491g
            com.p280ss.android.vesdk.VEUtils.getVideoFileInfo(r11, r5)
            r5 = r5[r10]
            r9.f112443d = r5
        L_0x007a:
            com.ss.android.ugc.asve.b.f r5 = new com.ss.android.ugc.asve.b.f
            java.lang.String[] r11 = new java.lang.String[r8]
            java.lang.String r12 = r1.f112491g
            r11[r7] = r12
            java.lang.String r12 = r9.f112440a
            r11[r6] = r12
            r5.<init>(r11)
            com.ss.android.vesdk.VEEditor$VIDEO_RATIO r11 = r3.f112447c
            r5.mo38887a(r11)
            int[] r11 = new int[r8]
            r11[r7] = r7
            int r12 = r9.f112443d
            r11[r6] = r12
            r5.f39683a = r11
            int[] r11 = new int[r8]
            int r12 = r9.f112443d
            r11[r7] = r12
            int r12 = r9.f112443d
            int r13 = r9.f112442c
            int r12 = r12 + r13
            r11[r6] = r12
            r5.f39684b = r11
            com.ss.android.ugc.aweme.watermark.j r11 = r3.f112445a
            if (r11 != 0) goto L_0x00ae
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x00ae:
            java.lang.String[] r11 = r11.f112444e
            r5.f39685c = r11
            com.ss.android.ugc.asve.b.e r5 = (com.p280ss.android.ugc.asve.p754b.C15390e) r5
            int r5 = r4.mo38772a(r5)
            com.ss.android.vesdk.VEWatermarkParam r11 = r3.f112449e
            if (r11 == 0) goto L_0x00dd
            int r9 = r9.f112443d
            long r12 = (long) r9
            r11.duration = r12
            goto L_0x00dd
        L_0x00c2:
            com.ss.android.vesdk.VEWatermarkParam r9 = r3.f112449e
            if (r9 != 0) goto L_0x00c7
            goto L_0x00dd
        L_0x00c7:
            com.ss.android.ugc.asve.b.f r5 = new com.ss.android.ugc.asve.b.f
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.String r11 = r1.f112491g
            r9[r7] = r11
            r5.<init>(r9)
            com.ss.android.vesdk.VEEditor$VIDEO_RATIO r9 = r3.f112447c
            r5.mo38887a(r9)
            com.ss.android.ugc.asve.b.e r5 = (com.p280ss.android.ugc.asve.p754b.C15390e) r5
            int r5 = r4.mo38772a(r5)
        L_0x00dd:
            if (r5 == 0) goto L_0x00f4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "init editor failed with errorCode:"
            r1.<init>(r4)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r2.mo102270a(r5, r1, r7)
            r0.mo102266a(r3)
            return
        L_0x00f4:
            com.ss.android.ugc.aweme.watermark.b r5 = r3.f112446b
            if (r5 == 0) goto L_0x023b
            r4.mo38829c(r10)
            com.ss.android.vesdk.filterparam.VEImageAddFilterParam r5 = new com.ss.android.vesdk.filterparam.VEImageAddFilterParam
            r5.<init>()
            com.ss.android.ugc.aweme.watermark.b r10 = r3.f112446b
            if (r10 == 0) goto L_0x0107
            java.lang.String r10 = r10.f112412d
            goto L_0x0108
        L_0x0107:
            r10 = 0
        L_0x0108:
            r5.imagePath = r10
            com.ss.android.ugc.aweme.watermark.b r10 = r3.f112446b
            if (r10 == 0) goto L_0x0115
            int r10 = r10.f112410b
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x0116
        L_0x0115:
            r10 = 0
        L_0x0116:
            if (r10 != 0) goto L_0x011b
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x011b:
            int r10 = r10.intValue()
            com.ss.android.ugc.aweme.watermark.b r11 = r3.f112446b
            if (r11 == 0) goto L_0x012a
            int r11 = r11.f112411c
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x012b
        L_0x012a:
            r11 = 0
        L_0x012b:
            if (r11 != 0) goto L_0x0130
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0130:
            int r11 = r11.intValue()
            com.ss.android.ugc.aweme.watermark.b r12 = r3.f112446b
            if (r12 == 0) goto L_0x013f
            int r12 = r12.f112413e
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            goto L_0x0140
        L_0x013f:
            r12 = 0
        L_0x0140:
            if (r12 != 0) goto L_0x0145
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0145:
            int r12 = r12.intValue()
            com.ss.android.ugc.aweme.watermark.b r13 = r3.f112446b
            if (r13 == 0) goto L_0x0154
            int r13 = r13.f112414f
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            goto L_0x0155
        L_0x0154:
            r13 = 0
        L_0x0155:
            if (r13 != 0) goto L_0x015a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x015a:
            int r13 = r13.intValue()
            com.ss.android.vesdk.VEEditor$SCALE_MODE r14 = com.p280ss.android.vesdk.VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE_WITH_2DENGINE
            r4.mo38773a(r14)
            com.ss.android.ugc.aweme.watermark.b r14 = r3.f112446b
            if (r14 == 0) goto L_0x016e
            boolean r14 = r14.f112415g
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            goto L_0x016f
        L_0x016e:
            r14 = 0
        L_0x016f:
            if (r14 != 0) goto L_0x0174
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0174:
            boolean r14 = r14.booleanValue()
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r14 == 0) goto L_0x01af
            int r7 = r11 + r12
            r4.mo38830c(r10, r7)
            r8 = 0
            r5.f116675x = r8
            double r13 = (double) r11
            r17 = r10
            double r9 = (double) r7
            java.lang.Double.isNaN(r9)
            double r9 = r9 * r15
            java.lang.Double.isNaN(r13)
            double r13 = r13 / r9
            float r8 = (float) r13
            r5.f116676y = r8
            r8 = 1065353216(0x3f800000, float:1.0)
            r5.width = r8
            double r11 = (double) r12
            java.lang.Double.isNaN(r11)
            double r11 = r11 / r9
            float r8 = (float) r11
            r5.height = r8
            com.ss.android.vesdk.VEVideoEncodeSettings r8 = r3.f112450f
            r9 = 5
            r8.setResizeMode(r9)
            com.ss.android.vesdk.VEVideoEncodeSettings r8 = r3.f112450f
            r9 = r17
            r8.setVideoRes(r9, r7)
            goto L_0x0219
        L_0x01af:
            r9 = r10
            com.ss.android.ugc.aweme.watermark.j r10 = r3.f112445a
            if (r10 == 0) goto L_0x01d3
            com.ss.android.vesdk.VEEditor$SCALE_MODE r7 = com.p280ss.android.vesdk.VEEditor.SCALE_MODE.SCALE_MODE_CENTER_INSIDE
            r4.mo38773a(r7)
            if (r9 <= r11) goto L_0x01c0
            int r10 = r9 - r11
            r7 = r10
            r10 = r9
            goto L_0x01c3
        L_0x01c0:
            int r7 = r11 - r9
            r10 = r11
        L_0x01c3:
            com.ss.android.vesdk.VEWatermarkParam r9 = r3.f112449e
            if (r9 != 0) goto L_0x01ca
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x01ca:
            int r11 = r9.xOffset
            int r14 = r7 / 2
            int r11 = r11 + r14
            r9.xOffset = r11
            r9 = r10
            goto L_0x01d4
        L_0x01d3:
            r10 = r11
        L_0x01d4:
            int r11 = r9 - r13
            float r11 = (float) r11
            r14 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r14
            r18 = r7
            double r6 = (double) r11
            double r1 = (double) r9
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r15
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r1
            float r6 = (float) r6
            r5.f116675x = r6
            int r6 = r10 - r12
            float r6 = (float) r6
            int r7 = r18 / 2
            float r7 = (float) r7
            float r11 = r11 - r7
            float r6 = r6 - r11
            double r6 = (double) r6
            r19 = r9
            double r8 = (double) r10
            java.lang.Double.isNaN(r8)
            double r8 = r8 * r15
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r8
            float r6 = (float) r6
            r5.f116676y = r6
            double r6 = (double) r13
            java.lang.Double.isNaN(r6)
            double r6 = r6 / r1
            float r1 = (float) r6
            r5.width = r1
            double r1 = (double) r12
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r8
            float r1 = (float) r1
            r5.height = r1
            com.ss.android.vesdk.VEVideoEncodeSettings r1 = r3.f112450f
            r9 = r19
            r1.setVideoRes(r9, r10)
        L_0x0219:
            com.ss.android.vesdk.VEWatermarkParam r1 = r3.f112449e
            if (r1 != 0) goto L_0x0220
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0220:
            r2 = 0
            r1.secondHalfImages = r2
            r11 = 0
            r12 = 0
            r1 = r5
            com.ss.android.vesdk.filterparam.VEBaseFilterParam r1 = (com.p280ss.android.vesdk.filterparam.VEBaseFilterParam) r1
            r14 = 0
            com.ss.android.ugc.aweme.watermark.b r2 = r3.f112446b
            if (r2 != 0) goto L_0x0230
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0230:
            int r15 = r2.f112409a
            r10 = r4
            r13 = r1
            int r2 = r10.mo38757a(r11, r12, r13, r14, r15)
            r4.mo38765a(r2, r1)
        L_0x023b:
            r1 = 1
            r0.f108212a = r1
            int r1 = r3.f112448d
            r4.mo38823b(r1)
            r1 = r21
            java.lang.String r2 = r1.f112492h
            com.ss.android.vesdk.VEVideoEncodeSettings r3 = r3.f112450f
            com.ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.b$a r5 = new com.ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.b$a
            r6 = r22
            r5.<init>(r0, r1, r6)
            com.ss.android.vesdk.VEListener$k r5 = (com.p280ss.android.vesdk.VEListener.C45215k) r5
            r1 = 0
            r4.mo38805a(r2, r1, r3, r5)
            return
        L_0x0257:
            return
        L_0x0258:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "VideoWatermarkParam is needed when use VEVideoWatermarkCreator"
            r1.<init>(r2)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.C41641b.mo102267a(com.ss.android.ugc.aweme.watermark.s, com.ss.android.ugc.aweme.shortvideo.videoprocess.watercompose.c):void");
    }
}
