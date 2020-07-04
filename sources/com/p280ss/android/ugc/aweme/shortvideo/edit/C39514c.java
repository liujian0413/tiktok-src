package com.p280ss.android.ugc.aweme.shortvideo.edit;

import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7551d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.c */
public final class C39514c extends C39395a {

    /* renamed from: b */
    public final VideoPublishEditModel f102568b;

    /* renamed from: c */
    private int f102569c;

    /* renamed from: d */
    private int f102570d;

    /* renamed from: c */
    public final int mo98355c() {
        if (this.f102569c == 0) {
            m126208g();
        }
        return this.f102569c;
    }

    /* renamed from: d */
    public final int mo98356d() {
        if (this.f102570d == 0) {
            m126208g();
        }
        return this.f102570d;
    }

    /* renamed from: e */
    public final int mo98357e() {
        if (this.f102325a) {
            return mo98355c();
        }
        return this.f102568b.videoWidth();
    }

    /* renamed from: f */
    public final int mo98358f() {
        if (this.f102325a) {
            return mo98356d();
        }
        return this.f102568b.videoHeight();
    }

    /* renamed from: g */
    private final void m126208g() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.f102568b.mIsFromDraft || !this.f102568b.hasStickers()) {
            boolean a = C39804em.m127437a(this.f102568b.videoWidth(), this.f102568b.videoHeight());
            if (a) {
                i = this.f102568b.videoWidth();
            } else {
                int[] k = C36964i.m118935k();
                if (k != null) {
                    i3 = k[0];
                } else {
                    i3 = 720;
                }
                i = m125903a(C7551d.m23567d(this.f102568b.videoWidth(), i3));
            }
            this.f102569c = i;
            if (a) {
                i2 = this.f102568b.videoHeight();
            } else {
                double d = (double) this.f102569c;
                Double.isNaN(d);
                i2 = (int) (Math.ceil(d / 9.0d) * 16.0d);
            }
            this.f102570d = i2;
            return;
        }
        if (this.f102568b.mVideoCanvasWidth > 0) {
            i4 = this.f102568b.mVideoCanvasWidth;
        } else {
            i4 = this.f102568b.videoWidth();
        }
        this.f102569c = i4;
        if (this.f102568b.mVideoCanvasHeight > 0) {
            i5 = this.f102568b.mVideoCanvasHeight;
        } else {
            i5 = this.f102568b.videoHeight();
        }
        this.f102570d = i5;
    }

    public C39514c(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "editModel");
        super(videoPublishEditModel);
        this.f102568b = videoPublishEditModel;
    }
}
