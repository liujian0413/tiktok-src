package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.c */
public final class C39694c {

    /* renamed from: a */
    private final int f103190a = 720;

    /* renamed from: b */
    private final int f103191b = 1280;

    /* renamed from: a */
    public final EditPreviewInfo mo99057a(MvCreateVideoData mvCreateVideoData) {
        MvCreateVideoData mvCreateVideoData2 = mvCreateVideoData;
        C7573i.m23587b(mvCreateVideoData2, "data");
        C39695d dVar = new C39695d(0, 0, 0, 0, 15, null);
        String str = mvCreateVideoData2.contactVideoPath;
        C7573i.m23582a((Object) str, "data.contactVideoPath");
        VideoFileInfo videoFileInfo = new VideoFileInfo(this.f103190a, this.f103191b, 0, 30);
        EditVideoSegment editVideoSegment = new EditVideoSegment(str, null, videoFileInfo, 2, null);
        return dVar.mo99058a(editVideoSegment);
    }

    public C39694c(int i, int i2) {
    }
}
