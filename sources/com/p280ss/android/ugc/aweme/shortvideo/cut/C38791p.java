package com.p280ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0043i;
import android.content.Context;
import android.view.SurfaceView;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.VEState;
import dmt.p1861av.video.VEEditorAutoStartStopArbiter;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.p */
public final class C38791p implements C38772i {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f100808a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C38791p.class), "autoStartStopArbiter", "getAutoStartStopArbiter()Ldmt/av/video/VEEditorAutoStartStopArbiter;"))};

    /* renamed from: b */
    public final C15389d f100809b;

    /* renamed from: c */
    private final C7541d f100810c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.p$a */
    static final class C38792a extends Lambda implements C7561a<VEEditorAutoStartStopArbiter> {

        /* renamed from: a */
        final /* synthetic */ C38791p f100811a;

        /* renamed from: b */
        final /* synthetic */ Context f100812b;

        /* renamed from: c */
        final /* synthetic */ C0043i f100813c;

        /* renamed from: d */
        final /* synthetic */ SurfaceView f100814d;

        C38792a(C38791p pVar, Context context, C0043i iVar, SurfaceView surfaceView) {
            this.f100811a = pVar;
            this.f100812b = context;
            this.f100813c = iVar;
            this.f100814d = surfaceView;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public VEEditorAutoStartStopArbiter invoke() {
            return new VEEditorAutoStartStopArbiter(this.f100812b, this.f100813c, this.f100811a.f100809b, this.f100814d);
        }
    }

    /* renamed from: e */
    private final VEEditorAutoStartStopArbiter m123898e() {
        return (VEEditorAutoStartStopArbiter) this.f100810c.getValue();
    }

    /* renamed from: a */
    public final long mo96859a() {
        return (long) this.f100809b.mo38862m();
    }

    /* renamed from: c */
    public final long mo96864c() {
        return (long) this.f100809b.mo38860l();
    }

    /* renamed from: b */
    public final boolean mo96862b() {
        if (this.f100809b.mo38850h() == VEState.STARTED) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo96867d() {
        return m123898e().f121596a;
    }

    /* renamed from: d */
    public final void mo96866d(boolean z) {
        m123898e().f121597b = z;
    }

    /* renamed from: c */
    public final void mo96865c(boolean z) {
        m123898e().f121596a = z;
    }

    /* renamed from: b */
    public final boolean mo96863b(boolean z) {
        if (z) {
            m123898e().mo119465a(true);
        } else {
            m123898e().mo119464a();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo96861a(boolean z) {
        if (z) {
            m123898e().mo119465a(false);
        } else {
            m123898e().mo119467b();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo96860a(long j, SEEK_MODE seek_mode) {
        C7573i.m23587b(seek_mode, "seekMode");
        if (this.f100809b.mo38763a((int) j, seek_mode) == 0) {
            return true;
        }
        return false;
    }

    public C38791p(Context context, C15389d dVar, SurfaceView surfaceView, C0043i iVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(dVar, "veEditor");
        C7573i.m23587b(surfaceView, "surfaceView");
        C7573i.m23587b(iVar, "lifecycleOwner");
        this.f100809b = dVar;
        this.f100810c = C7546e.m23569a(new C38792a(this, context, iVar, surfaceView));
    }
}
