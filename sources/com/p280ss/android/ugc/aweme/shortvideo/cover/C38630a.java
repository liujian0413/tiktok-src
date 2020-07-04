package com.p280ss.android.ugc.aweme.shortvideo.cover;

import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.a */
final /* synthetic */ class C38630a implements Runnable {

    /* renamed from: a */
    private final EffectVideoCoverGeneratorImpl f100360a;

    /* renamed from: b */
    private final EditVideoSegment f100361b;

    /* renamed from: c */
    private final int f100362c;

    /* renamed from: d */
    private final C38633a f100363d;

    C38630a(EffectVideoCoverGeneratorImpl effectVideoCoverGeneratorImpl, EditVideoSegment editVideoSegment, int i, C38633a aVar) {
        this.f100360a = effectVideoCoverGeneratorImpl;
        this.f100361b = editVideoSegment;
        this.f100362c = i;
        this.f100363d = aVar;
    }

    public final void run() {
        this.f100360a.mo96629a(this.f100361b, this.f100362c, this.f100363d);
    }
}
