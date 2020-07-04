package com.p280ss.android.ugc.aweme.shortvideo.edit.model;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.model.b */
public final class C39693b {

    /* renamed from: a */
    private final int f103186a;

    /* renamed from: b */
    private final int f103187b;

    /* renamed from: c */
    private final long f103188c;

    /* renamed from: d */
    private final long f103189d;

    public C39693b() {
        this(0, 0, 0, 0, 15, null);
    }

    public C39693b(int i, int i2) {
        this(i, i2, 0, 0, 12, null);
    }

    /* renamed from: a */
    public final EditPreviewInfo mo99056a(List<? extends EditVideoSegment> list) {
        C7573i.m23587b(list, "data");
        EditPreviewInfo editPreviewInfo = new EditPreviewInfo(new ArrayList(), this.f103186a, this.f103187b, this.f103188c, this.f103189d);
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list != null) {
            editPreviewInfo.getVideoList().addAll(list);
            return editPreviewInfo;
        }
        throw new IllegalArgumentException("segments must not be NullOrEmpty");
    }

    private C39693b(int i, int i2, long j, long j2) {
        this.f103186a = i;
        this.f103187b = i2;
        this.f103188c = j;
        this.f103189d = j2;
    }

    public /* synthetic */ C39693b(int i, int i2, long j, long j2, int i3, C7571f fVar) {
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
