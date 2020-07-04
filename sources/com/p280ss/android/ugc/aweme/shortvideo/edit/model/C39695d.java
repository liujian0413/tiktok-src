package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.d */
public final class C39695d {

    /* renamed from: a */
    private final int f103192a;

    /* renamed from: b */
    private final int f103193b;

    /* renamed from: c */
    private final long f103194c;

    /* renamed from: d */
    private final long f103195d;

    public C39695d() {
        this(0, 0, 0, 0, 15, null);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo99058a(EditVideoSegment editVideoSegment) {
        C7573i.m23587b(editVideoSegment, "data");
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(C7525m.m23466c(editVideoSegment), this.f103192a, this.f103193b, this.f103194c, this.f103195d);
        return editPreviewInfo;
    }

    private C39695d(int i, int i2, long j, long j2) {
        this.f103192a = i;
        this.f103193b = i2;
        this.f103194c = j;
        this.f103195d = j2;
    }

    public /* synthetic */ C39695d(int i, int i2, long j, long j2, int i3, C7571f fVar) {
        int i4;
        int i5;
        if ((i3 & 1) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i5 = 0;
        } else {
            i5 = i2;
        }
        this(i4, i5, 0, 0);
    }
}
