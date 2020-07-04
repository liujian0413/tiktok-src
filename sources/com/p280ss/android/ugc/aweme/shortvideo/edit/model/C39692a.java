package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import com.bytedance.common.utility.C6306c;
import com.p280ss.android.ugc.aweme.draft.model.C27319f;
import com.p280ss.android.ugc.aweme.draft.model.DraftVideoSegment;
import com.p280ss.android.ugc.aweme.shortvideo.C39811er;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.vesdk.VEUtils;
import java.io.File;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.a */
public final class C39692a {
    /* renamed from: a */
    public static final EditVideoSegment m127020a(DraftVideoSegment draftVideoSegment) {
        C7573i.m23587b(draftVideoSegment, "$this$toEditVideoSegment");
        EditVideoSegment editVideoSegment = new EditVideoSegment(draftVideoSegment.f71929h, draftVideoSegment.f71930i, m127021a(draftVideoSegment.f71929h));
        VideoCutInfo videoCutInfo = new VideoCutInfo((long) draftVideoSegment.f71924c, (long) draftVideoSegment.f71925d, draftVideoSegment.f71927f, draftVideoSegment.f71928g);
        editVideoSegment.setVideoCutInfo(videoCutInfo);
        return editVideoSegment;
    }

    /* renamed from: a */
    public static final EditPreviewInfo m127019a(C27319f fVar) {
        C7573i.m23587b(fVar, "$this$toEditPreviewInfo");
        C39695d dVar = new C39695d(fVar.f72069a, fVar.f72070b, 0, 0, 12, null);
        EditPreviewInfo a = dVar.mo99058a(m127020a((DraftVideoSegment) fVar.f72071c.get(0)));
        String str = ((DraftVideoSegment) fVar.f72071c.get(0)).f71931j;
        if (str != null) {
            a.setReverseVideoArray(new String[]{str});
        }
        String str2 = ((DraftVideoSegment) fVar.f72071c.get(0)).f71930i;
        if (str2 != null) {
            if (!C7634n.m23723c(str2, "reverse.wav", false)) {
                str2 = null;
            }
            if (str2 != null) {
                a.setReverseAudioArray(new String[]{str2});
            }
        }
        String str3 = ((DraftVideoSegment) fVar.f72071c.get(0)).f71932k;
        if (str3 != null) {
            a.setTempVideoArray(new String[]{str3});
        }
        return a;
    }

    /* renamed from: a */
    public static final VideoFileInfo m127021a(String str) {
        C7573i.m23587b(str, "$this$videoFileInfo");
        int[] iArr = new int[10];
        if (VEUtils.getVideoFileInfo(str, iArr) == 0) {
            VideoFileInfo videoFileInfo = new VideoFileInfo(iArr[0], iArr[1], (long) iArr[3], iArr[7]);
            return videoFileInfo;
        }
        VideoFileInfo videoFileInfo2 = new VideoFileInfo(0, 0, 0, 0);
        return videoFileInfo2;
    }

    /* renamed from: a */
    public static final String m127022a(EditPreviewInfo editPreviewInfo) {
        C7573i.m23587b(editPreviewInfo, "$this$videoPathString");
        StringBuilder sb = new StringBuilder();
        for (EditVideoSegment videoPath : editPreviewInfo.getVideoList()) {
            sb.append(videoPath.getVideoPath());
            sb.append(",");
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "stringBuilder.toString()");
        return sb2;
    }

    /* renamed from: a */
    public static final void m127024a(EditPreviewInfo editPreviewInfo, boolean z) {
        C7573i.m23587b(editPreviewInfo, "$this$removeRelatedFiles");
        if (z) {
            C7276d.m22810b(new File(editPreviewInfo.getDraftDir()));
        } else {
            for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
                C7276d.m22816c(editVideoSegment.getVideoPath());
                C7276d.m22816c(editVideoSegment.getAudioPath());
                StringBuilder sb = new StringBuilder();
                sb.append(C39811er.f103470f);
                sb.append(C6306c.m19561a(editVideoSegment.getVideoPath()));
                sb.append(File.separator);
                C7276d.m22822e(sb.toString());
            }
        }
        String[] reverseVideoArray = editPreviewInfo.getReverseVideoArray();
        if (reverseVideoArray != null) {
            for (String c : reverseVideoArray) {
                C7276d.m22816c(c);
            }
        }
        String[] reverseAudioArray = editPreviewInfo.getReverseAudioArray();
        if (reverseAudioArray != null) {
            for (String c2 : reverseAudioArray) {
                C7276d.m22816c(c2);
            }
        }
        String[] tempVideoArray = editPreviewInfo.getTempVideoArray();
        if (tempVideoArray != null) {
            for (String c3 : tempVideoArray) {
                C7276d.m22816c(c3);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.Triple<com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment, java.lang.Long, long[]> m127023a(com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r19, boolean r20, long r21) {
        /*
            java.lang.String r2 = "$this$videoCoverConfigure"
            r3 = r19
            kotlin.jvm.internal.C7573i.m23587b(r3, r2)
            r2 = 2
            long[] r2 = new long[r2]
            r2 = {0, -1} // fill-array
            r4 = 1
            r5 = 0
            r6 = 0
            if (r20 == 0) goto L_0x0054
            java.lang.String[] r8 = r19.getReverseVideoArray()
            r9 = 0
            if (r8 == 0) goto L_0x001d
            r8 = r8[r5]
            goto L_0x001e
        L_0x001d:
            r8 = r9
        L_0x001e:
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            if (r8 == 0) goto L_0x002b
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r8 = 0
            goto L_0x002c
        L_0x002b:
            r8 = 1
        L_0x002c:
            if (r8 != 0) goto L_0x0054
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r8 = new com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment
            java.lang.String[] r3 = r19.getReverseVideoArray()
            if (r3 == 0) goto L_0x0038
            r9 = r3[r5]
        L_0x0038:
            r11 = r9
            if (r11 != 0) goto L_0x003e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x003e:
            r12 = 0
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r3 = new com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r13 = r3
            r13.<init>(r14, r15, r16, r18)
            r14 = 2
            r15 = 0
            r10 = r8
            r10.<init>(r11, r12, r13, r14, r15)
            r0 = r21
            goto L_0x00bb
        L_0x0054:
            java.util.List r8 = r19.getVideoList()
            java.util.Collection r8 = (java.util.Collection) r8
            int r8 = r8.size()
            r9 = r6
            r6 = 0
        L_0x0060:
            if (r6 >= r8) goto L_0x00ac
            java.util.List r7 = r19.getVideoList()
            java.lang.Object r7 = r7.get(r6)
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r7 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r7
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r11 = r7.getVideoCutInfo()
            if (r11 == 0) goto L_0x0083
            long r12 = r11.getEnd()
            long r14 = r11.getStart()
            long r12 = r12 - r14
            float r12 = (float) r12
            float r11 = r11.getSpeed()
            float r12 = r12 / r11
            long r11 = (long) r12
            goto L_0x008b
        L_0x0083:
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r11 = r7.getVideoFileInfo()
            long r11 = r11.getDuration()
        L_0x008b:
            r13 = 0
            long r11 = r11 + r9
            int r13 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
            if (r13 <= 0) goto L_0x00a8
            long r0 = r21 - r9
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r7 = r7.getVideoCutInfo()
            if (r7 == 0) goto L_0x00af
            float r0 = (float) r0
            float r1 = r7.getSpeed()
            float r0 = r0 * r1
            long r7 = r7.getStart()
            float r1 = (float) r7
            float r0 = r0 + r1
            long r0 = (long) r0
            goto L_0x00af
        L_0x00a8:
            int r6 = r6 + 1
            r9 = r11
            goto L_0x0060
        L_0x00ac:
            r0 = r21
            r6 = 0
        L_0x00af:
            java.util.List r3 = r19.getVideoList()
            java.lang.Object r3 = r3.get(r6)
            r8 = r3
            com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment r8 = (com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment) r8
            r6 = r9
        L_0x00bb:
            r2[r5] = r6
            r5 = r2[r5]
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo r3 = r8.getVideoCutInfo()
            if (r3 == 0) goto L_0x00d6
            long r9 = r3.getEnd()
            long r11 = r3.getStart()
            long r9 = r9 - r11
            float r7 = (float) r9
            float r3 = r3.getSpeed()
            float r7 = r7 / r3
            long r9 = (long) r7
            goto L_0x00de
        L_0x00d6:
            com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo r3 = r8.getVideoFileInfo()
            long r9 = r3.getDuration()
        L_0x00de:
            r3 = 0
            long r5 = r5 + r9
            r2[r4] = r5
            kotlin.Triple r3 = new kotlin.Triple
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.<init>(r8, r0, r2)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.edit.model.C39692a.m127023a(com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, boolean, long):kotlin.Triple");
    }
}
