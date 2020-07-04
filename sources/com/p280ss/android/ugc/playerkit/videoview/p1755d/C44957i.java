package com.p280ss.android.ugc.playerkit.videoview.p1755d;

import com.p280ss.android.p294e.C6806b;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.video.experiment.VideoCDNUrlTimeoutExperiment;
import com.p280ss.android.ugc.playerkit.C44911b;
import com.p280ss.android.ugc.playerkit.model.C44924h;
import com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type;
import com.p280ss.android.ugc.playerkit.videoview.p1752a.C44936a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.playerkit.videoview.d.i */
public final class C44957i implements C44949c {

    /* renamed from: a */
    private long f115629a = VideoCDNUrlTimeoutExperiment.DEFAULT_TIMEOUT;

    /* renamed from: b */
    private List<C44953g> f115630b;

    /* renamed from: a */
    private static String[] m141847a(String[] strArr) {
        if (strArr.length == 0) {
            return strArr;
        }
        String str = null;
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = 0;
                break;
            } else if (strArr[i].contains("aweme/v1/play")) {
                str = strArr[i];
                break;
            } else {
                i++;
            }
        }
        if (str == null) {
            return strArr;
        }
        String a = C6806b.m21144a().mo16627a(str);
        if (C44911b.m141673a(a, str)) {
            return strArr;
        }
        for (int i2 = i; i2 < strArr.length; i2++) {
            if (C44911b.m141673a(a, strArr[i2])) {
                strArr[i2] = str;
                strArr[i] = a;
                return strArr;
            }
        }
        String[] strArr2 = new String[(strArr.length + 1)];
        if (i == 0) {
            System.arraycopy(strArr, 0, strArr2, 1, strArr.length);
            strArr2[0] = a;
        } else {
            System.arraycopy(strArr, 0, strArr2, 0, i);
            System.arraycopy(strArr, i, strArr2, i + 1, strArr.length - i);
            strArr2[i] = a;
        }
        return strArr2;
    }

    public C44957i(List<C44953g> list, long j) {
        if (list == null || list.isEmpty()) {
            list = Collections.singletonList(C44953g.f115625b);
        }
        this.f115630b = list;
        this.f115629a = j;
    }

    /* renamed from: a */
    public final C44924h mo107468a(VideoUrlModel videoUrlModel, Type type, boolean z) {
        C44936a b = mo107469b(videoUrlModel, type, z);
        C44924h hVar = new C44924h();
        C44950d dVar = new C44950d(videoUrlModel, b.f115602c, b.f115600a);
        C44951e a = new C44956h(this.f115630b, dVar, 0).mo107471a(dVar);
        hVar.f115559a = a.f115623a;
        hVar.f115565g = a.f115624b;
        hVar.f115561c = b.f115601b;
        hVar.f115562d = b.f115603d;
        hVar.f115560b = videoUrlModel.getRatio();
        hVar.f115563e = b.f115602c;
        if (b.f115603d != null) {
            hVar.f115564f = b.f115604e;
        } else {
            hVar.f115564f = videoUrlModel.getFileCheckSum();
        }
        return hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cd  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p280ss.android.ugc.playerkit.videoview.p1752a.C44936a mo107469b(com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel r10, com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type r11, boolean r12) {
        /*
            r9 = this;
            com.ss.android.ugc.playerkit.videoview.a.a r0 = new com.ss.android.ugc.playerkit.videoview.a.a
            r0.<init>()
            java.lang.String r1 = r10.getBitRatedRatioUri()
            r0.f115602c = r1
            java.lang.String r1 = r10.getFileCheckSum()
            r0.f115604e = r1
            java.util.List r1 = r10.getUrlList()
            int r1 = r1.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.util.List r2 = r10.getUrlList()
            r2.toArray(r1)
            com.ss.android.ugc.playerkit.model.a r2 = com.p280ss.android.ugc.playerkit.model.C44917a.m141692r()
            boolean r2 = r2.mo105106i()
            if (r2 == 0) goto L_0x0030
            java.lang.String[] r1 = m141847a(r1)
        L_0x0030:
            com.ss.android.ugc.playerkit.model.a r2 = com.p280ss.android.ugc.playerkit.model.C44917a.m141692r()
            boolean r2 = r2.mo105108k()
            r3 = 0
            if (r2 == 0) goto L_0x00a4
            com.ss.android.ugc.playerkit.videoview.CommonWidget r2 = com.p280ss.android.ugc.playerkit.videoview.CommonWidget.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.a r2 = r2.getBitrateManager()
            com.ss.android.ugc.lib.video.bitrate.regulator.a.c r2 = r2.mo105115a(r10)
            if (r2 == 0) goto L_0x00a4
            java.util.List r4 = r2.urlList()
            if (r4 == 0) goto L_0x00a4
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x00a4
            int r5 = r2.isH265()
            if (r5 != 0) goto L_0x0071
            java.lang.String[] r11 = new java.lang.String[r3]
            java.lang.Object[] r11 = r4.toArray(r11)
            r1 = r11
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r11 = r2.getUrlKey()
            r0.f115602c = r11
            r0.f115603d = r2
            java.lang.String r11 = r2.getChecksum()
            r0.f115604e = r11
            goto L_0x00a4
        L_0x0071:
            com.ss.android.ugc.playerkit.model.PlayerConfig$Type r5 = com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type.TT
            boolean r5 = r5.equals(r11)
            if (r5 != 0) goto L_0x0081
            com.ss.android.ugc.playerkit.model.PlayerConfig$Type r5 = com.p280ss.android.ugc.playerkit.model.PlayerConfig.Type.TT_HARDWARE
            boolean r11 = r5.equals(r11)
            if (r11 == 0) goto L_0x00a4
        L_0x0081:
            if (r12 != 0) goto L_0x00a4
            java.lang.String[] r11 = new java.lang.String[r3]
            java.lang.Object[] r11 = r4.toArray(r11)
            r1 = r11
            java.lang.String[] r1 = (java.lang.String[]) r1
            int r11 = r2.isH265()
            r12 = 1
            if (r11 != r12) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r12 = 0
        L_0x0095:
            java.lang.String r11 = r2.getUrlKey()
            r0.f115602c = r11
            r0.f115603d = r2
            java.lang.String r11 = r2.getChecksum()
            r0.f115604e = r11
            goto L_0x00a5
        L_0x00a4:
            r12 = 0
        L_0x00a5:
            com.ss.android.ugc.playerkit.model.a r11 = com.p280ss.android.ugc.playerkit.model.C44917a.m141692r()
            boolean r11 = r11.mo105107j()
            if (r11 == 0) goto L_0x00c4
            r11 = 0
        L_0x00b0:
            int r2 = r1.length
            if (r11 >= r2) goto L_0x00c4
            com.ss.android.ugc.playerkit.videoview.CommonWidget r2 = com.p280ss.android.ugc.playerkit.videoview.CommonWidget.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.b r2 = r2.getHttpsHelper()
            r4 = r1[r11]
            java.lang.String r2 = r2.mo105116a(r4)
            r1[r11] = r2
            int r11 = r11 + 1
            goto L_0x00b0
        L_0x00c4:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r2 = 0
        L_0x00ca:
            int r4 = r1.length
            if (r2 >= r4) goto L_0x0106
            r4 = r1[r2]
            if (r4 == 0) goto L_0x0103
            r4 = r1[r2]
            java.lang.String r5 = "aweme/v1/play"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L_0x00ef
            com.ss.android.ugc.playerkit.videoview.CommonWidget r4 = com.p280ss.android.ugc.playerkit.videoview.CommonWidget.INSTANCE
            com.ss.android.ugc.playerkit.videoview.d.f r4 = r4.getPlayUrlBuilder()
            r5 = r1[r2]
            com.ss.android.common.util.j r4 = r4.mo105117a(r5)
            java.lang.String r4 = r4.mo51184a()
            r11.add(r4)
            goto L_0x0103
        L_0x00ef:
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r6 = r10.getCreateTime()
            long r4 = r4 - r6
            long r6 = r9.f115629a
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0103
            r4 = r1[r2]
            r11.add(r4)
        L_0x0103:
            int r2 = r2 + 1
            goto L_0x00ca
        L_0x0106:
            java.lang.String[] r10 = new java.lang.String[r3]
            java.lang.Object[] r10 = r11.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            r0.f115600a = r10
            r0.f115601b = r12
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.playerkit.videoview.p1755d.C44957i.mo107469b(com.ss.android.ugc.aweme.feed.model.VideoUrlModel, com.ss.android.ugc.playerkit.model.PlayerConfig$Type, boolean):com.ss.android.ugc.playerkit.videoview.a.a");
    }
}
