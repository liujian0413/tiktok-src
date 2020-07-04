package com.p280ss.android.ugc.aweme.shortvideo.upload;

import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.h */
public final class C41452h {

    /* renamed from: a */
    public static final C41452h f107837a = new C41452h();

    private C41452h() {
    }

    /* renamed from: a */
    public static final String m132105a(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null) {
            if (!videoPublishEditModel.isFastImport) {
                videoPublishEditModel = null;
            }
            if (videoPublishEditModel != null) {
                List arrayList = new ArrayList();
                for (EditVideoSegment editVideoSegment : videoPublishEditModel.getPreviewInfo().getVideoList()) {
                    arrayList.add(new VideoSegment(editVideoSegment.getVideoPath(), editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight(), (int) editVideoSegment.getVideoFileInfo().getDuration()));
                }
                return m132106a(arrayList);
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r1.equals("lv") != false) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.p280ss.android.ugc.aweme.shortvideo.upload.C41455j m132104a(java.lang.String r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "/"
            r2 = 2
            java.lang.String r6 = kotlin.text.C7634n.m23775c(r6, r1, r6)     // Catch:{ Exception -> 0x00aa }
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = "^(faceu|beautyme|lv)_\\d+_\\d+[\\s\\S]*(.mp4)$"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00aa }
            r2 = r6
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2     // Catch:{ Exception -> 0x00aa }
            boolean r1 = r1.containsMatchIn(r2)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
            kotlin.text.Regex r1 = new kotlin.text.Regex     // Catch:{ Exception -> 0x00aa }
            java.lang.String r2 = "([_.])"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6     // Catch:{ Exception -> 0x00aa }
            r2 = 0
            java.util.List r6 = r1.split(r6, r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.Object r1 = r6.get(r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00aa }
            int r3 = r1.hashCode()     // Catch:{ Exception -> 0x00aa }
            r4 = 3466(0xd8a, float:4.857E-42)
            r5 = 1
            if (r3 == r4) goto L_0x0079
            r4 = 97187256(0x5caf5b8, float:1.9086252E-35)
            if (r3 == r4) goto L_0x0070
            r4 = 1328934676(0x4f35ef14, float:3.05234432E9)
            if (r3 == r4) goto L_0x0043
            goto L_0x00aa
        L_0x0043:
            java.lang.String r3 = "beautyme"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
            java.lang.String r1 = "beauty_me"
            java.lang.Integer[] r3 = new java.lang.Integer[r5]     // Catch:{ Exception -> 0x00aa }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00aa }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00aa }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00aa }
            r3[r2] = r6     // Catch:{ Exception -> 0x00aa }
            java.util.ArrayList r6 = kotlin.collections.C7525m.m23468d(r3)     // Catch:{ Exception -> 0x00aa }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.i r2 = new com.ss.android.ugc.aweme.shortvideo.upload.i     // Catch:{ Exception -> 0x00aa }
            r2.<init>(r1, r6)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.j r6 = new com.ss.android.ugc.aweme.shortvideo.upload.j     // Catch:{ Exception -> 0x00aa }
            r6.<init>(r0, r2, r5, r0)     // Catch:{ Exception -> 0x00aa }
            return r6
        L_0x0070:
            java.lang.String r3 = "faceu"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
            goto L_0x0081
        L_0x0079:
            java.lang.String r3 = "lv"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x00aa }
            if (r1 == 0) goto L_0x00aa
        L_0x0081:
            java.lang.Object r1 = r6.get(r2)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00aa }
            java.lang.Integer[] r3 = new java.lang.Integer[r5]     // Catch:{ Exception -> 0x00aa }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ Exception -> 0x00aa }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00aa }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ Exception -> 0x00aa }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x00aa }
            r3[r2] = r6     // Catch:{ Exception -> 0x00aa }
            java.util.ArrayList r6 = kotlin.collections.C7525m.m23468d(r3)     // Catch:{ Exception -> 0x00aa }
            java.util.List r6 = (java.util.List) r6     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.i r2 = new com.ss.android.ugc.aweme.shortvideo.upload.i     // Catch:{ Exception -> 0x00aa }
            r2.<init>(r1, r6)     // Catch:{ Exception -> 0x00aa }
            com.ss.android.ugc.aweme.shortvideo.upload.j r6 = new com.ss.android.ugc.aweme.shortvideo.upload.j     // Catch:{ Exception -> 0x00aa }
            r6.<init>(r0, r2, r5, r0)     // Catch:{ Exception -> 0x00aa }
            return r6
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.upload.C41452h.m132104a(java.lang.String):com.ss.android.ugc.aweme.shortvideo.upload.j");
    }

    /* renamed from: a */
    private static String m132106a(List<? extends VideoSegment> list) {
        C7573i.m23587b(list, "segments");
        List arrayList = new ArrayList();
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            for (VideoSegment a : list) {
                C41455j a2 = m132104a(a.mo96896a(false));
                if (a2 != null) {
                    arrayList.add(a2);
                }
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null) {
            try {
                return C35563c.f93220B.getRetrofitFactoryGson().mo15979b((Object) arrayList);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
