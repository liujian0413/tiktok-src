package com.p280ss.android.ugc.asve.recorder.camera.p924b;

import android.content.Context;
import android.content.res.Resources;
import android.support.p022v4.view.C0967d;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import com.p280ss.android.ugc.asve.recorder.C20689c;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.asve.recorder.view.C20810d;
import com.p280ss.android.ugc.asve.recorder.view.C20815i;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a */
public final class C20708a extends C20815i implements C20810d {

    /* renamed from: a */
    public final C20689c f55934a;

    /* renamed from: b */
    private boolean f55935b = true;

    /* renamed from: c */
    private final ScaleGestureDetector f55936c = new ScaleGestureDetector(this.f55938e, new C20710b(this));

    /* renamed from: d */
    private final C0967d f55937d;

    /* renamed from: e */
    private final Context f55938e;

    /* renamed from: f */
    private final ASCameraView f55939f;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a$a */
    public static final class C20709a implements OnDoubleTapListener {

        /* renamed from: a */
        final /* synthetic */ C20708a f55940a;

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        C20709a(C20708a aVar) {
            this.f55940a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f55940a.mo55998a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C7573i.m23587b(motionEvent, "e");
            return this.f55940a.mo55999a(motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.b.a$b */
    public static final class C20710b implements OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C20708a f55941a;

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C7573i.m23587b(scaleGestureDetector, "detector");
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C7573i.m23587b(scaleGestureDetector, "detector");
        }

        C20710b(C20708a aVar) {
            this.f55941a = aVar;
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C7573i.m23587b(scaleGestureDetector, "detector");
            return this.f55941a.f55934a.mo55846b().mo55950b(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan());
        }
    }

    /* renamed from: a */
    public final boolean mo55998a() {
        if (!this.f55935b) {
            return false;
        }
        this.f55939f.mo56286h();
        return true;
    }

    /* renamed from: a */
    public final void mo55997a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        this.f55936c.onTouchEvent(motionEvent);
        this.f55937d.mo3752a(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo55999a(float f, float f2) {
        C20707b b = this.f55934a.mo55846b();
        int width = this.f55939f.getPresentView().getWidth();
        int height = this.f55939f.getPresentView().getHeight();
        Resources resources = this.f55938e.getResources();
        C7573i.m23582a((Object) resources, "context.resources");
        if (b.mo55943a(width, height, resources.getDisplayMetrics().density, new float[]{f, f2})) {
            this.f55939f.getCameraViewHelper$tools_asve_release().mo56006a((int) f, (int) f2);
        }
        return true;
    }

    public C20708a(Context context, ASCameraView aSCameraView, C20689c cVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aSCameraView, "rootView");
        C7573i.m23587b(cVar, "recorder");
        this.f55938e = context;
        this.f55939f = aSCameraView;
        this.f55934a = cVar;
        C0967d dVar = new C0967d(this.f55938e, new SimpleOnGestureListener());
        dVar.mo3750a((OnDoubleTapListener) new C20709a(this));
        this.f55937d = dVar;
    }
}
