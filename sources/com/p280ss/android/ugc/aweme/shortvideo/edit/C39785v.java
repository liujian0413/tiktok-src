package com.p280ss.android.ugc.aweme.shortvideo.edit;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.v */
public final class C39785v extends C39395a {

    /* renamed from: b */
    public final VideoPublishEditModel f103418b;

    /* renamed from: c */
    public final int mo98355c() {
        return this.f103418b.videoWidth();
    }

    /* renamed from: d */
    public final int mo98356d() {
        return this.f103418b.videoHeight();
    }

    /* renamed from: e */
    public final int mo98357e() {
        if (this.f102325a) {
            return mo98355c();
        }
        return this.f103418b.videoWidth();
    }

    /* renamed from: f */
    public final int mo98358f() {
        if (this.f102325a) {
            return mo98356d();
        }
        return this.f103418b.videoHeight();
    }

    public C39785v(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "editModel");
        super(videoPublishEditModel);
        this.f103418b = videoPublishEditModel;
    }
}
