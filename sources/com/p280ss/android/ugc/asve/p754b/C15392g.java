package com.p280ss.android.ugc.asve.p754b;

import com.p280ss.android.vesdk.VEEditor;
import com.p280ss.android.vesdk.VEEditor.VIDEO_RATIO;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.b.g */
public final class C15392g extends C15390e {

    /* renamed from: a */
    private final String[] f39693a;

    /* renamed from: b */
    private final VIDEO_RATIO f39694b;

    /* renamed from: a */
    public final int mo38886a(VEEditor vEEditor, boolean z) {
        C7573i.m23587b(vEEditor, "editor");
        return vEEditor.mo107903a(this.f39693a, this.f39694b);
    }

    public C15392g(String[] strArr, VIDEO_RATIO video_ratio) {
        C7573i.m23587b(strArr, "videoFilePaths");
        C7573i.m23587b(video_ratio, "videoOutRes");
        this.f39693a = strArr;
        this.f39694b = video_ratio;
    }
}
