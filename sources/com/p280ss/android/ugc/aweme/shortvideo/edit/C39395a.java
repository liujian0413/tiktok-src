package com.p280ss.android.ugc.aweme.shortvideo.edit;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.a */
public abstract class C39395a implements C39504az {

    /* renamed from: a */
    public boolean f102325a;

    /* renamed from: b */
    private final VideoPublishEditModel f102326b;

    /* renamed from: a */
    public static int m125903a(int i) {
        return ((i + 16) - 1) & -16;
    }

    /* renamed from: b */
    public final int mo98209b() {
        return this.f102326b.videoHeight();
    }

    /* renamed from: a */
    public final int mo98207a() {
        return this.f102326b.videoWidth();
    }

    public C39395a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "editModel");
        this.f102326b = videoPublishEditModel;
    }

    /* renamed from: a */
    public final void mo98208a(boolean z) {
        this.f102325a = z;
        this.f102326b.mVideoCanvasWidth = mo98355c();
        this.f102326b.mVideoCanvasHeight = mo98356d();
        this.f102326b.mOutVideoWidth = mo98357e();
        this.f102326b.mOutVideoHeight = mo98358f();
    }
}
