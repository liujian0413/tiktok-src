package com.p280ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.view.MotionEvent;
import com.p280ss.android.ugc.asve.recorder.ASRecorder;
import com.p280ss.android.ugc.asve.recorder.camera.p924b.C20708a;
import com.p280ss.android.ugc.asve.recorder.reaction.p926a.C20780a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.view.b */
public final class C20808b implements C20810d {

    /* renamed from: a */
    public final C20813g f56191a;

    /* renamed from: b */
    private C20810d f56192b;

    /* renamed from: a */
    public final void mo55997a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        this.f56192b.mo55997a(motionEvent);
    }

    public C20808b(Context context, ASCameraView aSCameraView, ASRecorder aSRecorder) {
        C20810d dVar;
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aSCameraView, "rootView");
        C7573i.m23587b(aSRecorder, "recorder");
        if (C20809c.f56193a[aSRecorder.f55790a.ordinal()] != 1) {
            dVar = new C20708a(context, aSCameraView, aSRecorder);
        } else {
            C20780a aVar = new C20780a(context, aSCameraView, aSRecorder.mo55852f(), aSRecorder.mo55846b(), aSCameraView.getReactionViewHelper$tools_asve_release());
            dVar = aVar;
        }
        this.f56192b = dVar;
        C20810d dVar2 = this.f56192b;
        if (dVar2 != null) {
            this.f56191a = (C20813g) dVar2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.view.GestureDispatcher");
    }
}
