package com.p280ss.android.ugc.asve.recorder.reaction.p926a;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0967d;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.p280ss.android.ugc.asve.p756d.p757a.C15444b;
import com.p280ss.android.ugc.asve.p756d.p757a.C15444b.C15446b;
import com.p280ss.android.ugc.asve.recorder.camera.C20707b;
import com.p280ss.android.ugc.asve.recorder.reaction.C20779a;
import com.p280ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p280ss.android.ugc.asve.recorder.view.C20810d;
import com.p280ss.android.ugc.asve.recorder.view.C20815i;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a */
public final class C20780a extends C20815i implements C20810d {

    /* renamed from: a */
    private boolean f56077a = true;

    /* renamed from: b */
    private final ScaleGestureDetector f56078b;

    /* renamed from: c */
    private final C15444b f56079c;

    /* renamed from: d */
    private final C0967d f56080d;

    /* renamed from: e */
    private final ASCameraView f56081e;

    /* renamed from: f */
    private final C20779a f56082f;

    /* renamed from: g */
    private final C20707b f56083g;

    /* renamed from: h */
    private final C20784b f56084h;

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$a */
    public static final class C20781a implements OnDoubleTapListener {

        /* renamed from: a */
        final /* synthetic */ C20780a f56085a;

        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        C20781a(C20780a aVar) {
            this.f56085a = aVar;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return this.f56085a.mo55998a();
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            C7573i.m23587b(motionEvent, "e");
            this.f56085a.mo55999a(motionEvent.getX(), motionEvent.getY());
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$b */
    public static final class C20782b implements C15446b {

        /* renamed from: a */
        final /* synthetic */ C20780a f56086a;

        C20782b(C20780a aVar) {
            this.f56086a = aVar;
        }

        /* renamed from: b */
        public final void mo38998b(C15444b bVar) {
            C7573i.m23587b(bVar, "detector");
            this.f56086a.mo56167c();
        }

        /* renamed from: a */
        public final boolean mo38996a(C15444b bVar) {
            C7573i.m23587b(bVar, "detector");
            return this.f56086a.mo56168c(bVar.f39743i.x, bVar.f39743i.y);
        }

        /* renamed from: a */
        public final boolean mo38997a(C15444b bVar, float f, float f2) {
            C7573i.m23587b(bVar, "detector");
            return this.f56086a.mo56166b(f, f2);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.reaction.a.a$c */
    public static final class C20783c implements OnScaleGestureListener {

        /* renamed from: a */
        final /* synthetic */ C20780a f56087a;

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            C7573i.m23587b(scaleGestureDetector, "detector");
        }

        C20783c(C20780a aVar) {
            this.f56087a = aVar;
        }

        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C7573i.m23587b(scaleGestureDetector, "detector");
            return this.f56087a.mo56165b();
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            C7573i.m23587b(scaleGestureDetector, "detector");
            return this.f56087a.mo56164a(scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan());
        }
    }

    /* renamed from: a */
    public final boolean mo55999a(float f, float f2) {
        return true;
    }

    /* renamed from: b */
    public final boolean mo56165b() {
        return true;
    }

    /* renamed from: c */
    public final void mo56167c() {
        this.f56084h.mo56176b();
    }

    /* renamed from: a */
    public final boolean mo55998a() {
        if (!this.f56077a) {
            return false;
        }
        this.f56081e.mo56286h();
        return true;
    }

    /* renamed from: a */
    public final boolean mo56164a(float f) {
        return this.f56083g.mo55950b(f);
    }

    /* renamed from: a */
    public final void mo55997a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        this.f56079c.mo38993a(motionEvent);
        this.f56078b.onTouchEvent(motionEvent);
        this.f56080d.mo3752a(motionEvent);
    }

    /* renamed from: b */
    public final boolean mo56166b(float f, float f2) {
        if (!m69358d(f, f2)) {
            return false;
        }
        this.f56084h.mo56175a();
        return true;
    }

    /* renamed from: c */
    public final boolean mo56168c(float f, float f2) {
        this.f56082f.mo56156a((int) f, (int) f2);
        return true;
    }

    /* renamed from: d */
    private final boolean m69358d(float f, float f2) {
        int i;
        LayoutParams layoutParams = this.f56081e.getPresentView().getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            if (VERSION.SDK_INT >= 17) {
                i = Math.min(marginLayoutParams.getMarginStart(), marginLayoutParams.leftMargin);
            } else {
                i = marginLayoutParams.leftMargin;
            }
            return this.f56082f.mo56158b((int) (f - ((float) i)), (int) (f2 - ((float) marginLayoutParams.topMargin)));
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C20780a(Context context, ASCameraView aSCameraView, C20779a aVar, C20707b bVar, C20784b bVar2) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(aSCameraView, "rootView");
        C7573i.m23587b(aVar, "reactionCtrl");
        C7573i.m23587b(bVar, "cameraController");
        C7573i.m23587b(bVar2, "viewHelper");
        this.f56081e = aSCameraView;
        this.f56082f = aVar;
        this.f56083g = bVar;
        this.f56084h = bVar2;
        this.f56078b = new ScaleGestureDetector(context, new C20783c(this));
        this.f56079c = new C15444b(context, new C20782b(this));
        C0967d dVar = new C0967d(context, new SimpleOnGestureListener());
        dVar.mo3750a((OnDoubleTapListener) new C20781a(this));
        this.f56080d = dVar;
    }
}
