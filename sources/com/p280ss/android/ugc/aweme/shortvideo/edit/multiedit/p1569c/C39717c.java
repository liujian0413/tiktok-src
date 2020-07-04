package com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1569c;

import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.c.c */
public final class C39717c {

    /* renamed from: a */
    public long f103234a;

    /* renamed from: b */
    public long f103235b;

    /* renamed from: c */
    public float f103236c;

    /* renamed from: d */
    public float f103237d;

    /* renamed from: e */
    public boolean f103238e;

    /* renamed from: f */
    public boolean f103239f;

    /* renamed from: g */
    public boolean f103240g;

    /* renamed from: h */
    public boolean f103241h;

    /* renamed from: i */
    public int f103242i = -1;

    /* renamed from: j */
    public int f103243j;

    /* renamed from: k */
    public int f103244k;

    /* renamed from: a */
    public final void mo99099a() {
        this.f103234a = 0;
        this.f103235b = 0;
        this.f103236c = 0.0f;
        this.f103237d = 0.0f;
    }

    /* renamed from: a */
    public final void mo99100a(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            this.f103234a = multiEditVideoRecordData.startTime;
            this.f103235b = multiEditVideoRecordData.endTime;
            this.f103236c = multiEditVideoRecordData.leftSlideX;
            this.f103237d = multiEditVideoRecordData.rightSlideX;
        }
    }

    /* renamed from: b */
    public final void mo99101b(MultiEditVideoRecordData multiEditVideoRecordData) {
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.leftSlideX = this.f103236c;
        }
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.rightSlideX = this.f103237d;
        }
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.startTime = this.f103234a;
        }
        if (multiEditVideoRecordData != null) {
            multiEditVideoRecordData.endTime = this.f103235b;
        }
    }
}
