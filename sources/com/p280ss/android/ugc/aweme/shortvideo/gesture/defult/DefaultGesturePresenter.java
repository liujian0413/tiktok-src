package com.p280ss.android.ugc.aweme.shortvideo.gesture.defult;

import android.arch.lifecycle.C0043i;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a.C39945a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.IGesturePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout.C41180a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.defult.DefaultGesturePresenter */
public class DefaultGesturePresenter implements IGesturePresenter, C41180a {

    /* renamed from: a */
    public C39944a f103757a = new C39945a();

    /* renamed from: b */
    public float f103758b = 0.0f;

    /* renamed from: c */
    public boolean f103759c;

    /* renamed from: d */
    private VideoRecordGestureLayout f103760d;

    /* renamed from: e */
    private C39954b f103761e;

    /* renamed from: f */
    private int f103762f;

    /* renamed from: g */
    private boolean f103763g = true;

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo99375c() {
        this.f103763g = true;
    }

    /* renamed from: a */
    public final boolean mo96385a(C39949c cVar) {
        return this.f103757a != null && this.f103757a.mo96385a(cVar);
    }

    public void disAttachView() {
        this.f103760d.setOnGestureListener(null);
    }

    /* renamed from: a */
    public final boolean mo96380a() {
        if (this.f103757a == null || !this.f103757a.mo96380a()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo96386b() {
        if (this.f103757a == null || !this.f103757a.mo96386b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m127792a(View view) {
        if (view instanceof VideoRecordGestureLayout) {
            this.f103760d = (VideoRecordGestureLayout) view;
            this.f103760d.setOnGestureListener(this);
        }
    }

    /* renamed from: b */
    public final void mo98460b(C39947b bVar) {
        if (this.f103757a != null) {
            this.f103757a.mo98460b(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo96391c(float f) {
        if (this.f103757a == null || !this.f103757a.mo96391c(f)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo96393d(MotionEvent motionEvent) {
        if (this.f103757a == null || !this.f103757a.mo96393d(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void m127793f(MotionEvent motionEvent) {
        if (this.f103757a == null || !this.f103757a.mo96388b(motionEvent)) {
            this.f103761e.mo96465a();
            this.f103761e.mo96470b();
        }
    }

    /* renamed from: c */
    public final boolean mo96392c(MotionEvent motionEvent) {
        if (this.f103757a == null || !this.f103757a.mo96392c(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean mo98462e(MotionEvent motionEvent) {
        if (this.f103757a != null && this.f103757a.mo98462e(motionEvent)) {
            return true;
        }
        this.f103761e.mo96468a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final boolean mo96381a(float f) {
        this.f103761e.mo96473c(f);
        if (this.f103757a == null || !this.f103757a.mo96381a(f)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo96387b(float f) {
        if (this.f103757a == null || !this.f103757a.mo96387b(f)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo96382a(MotionEvent motionEvent) {
        if (this.f103757a == null || !this.f103757a.mo96382a(motionEvent)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo96388b(MotionEvent motionEvent) {
        if (this.f103763g) {
            this.f103763g = false;
            new Handler().postDelayed(new C39953a(this), 300);
            m127793f(motionEvent);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
        if (this.f103757a == null || !this.f103757a.mo96384a(scaleGestureDetector)) {
            return this.f103761e.mo96469a(scaleGestureDetector);
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
        if ((this.f103757a == null || !this.f103757a.mo96390b(scaleGestureDetector)) && !this.f103761e.mo96471b(scaleGestureDetector.getScaleFactor())) {
            return this.f103761e.mo96472b(scaleGestureDetector);
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo98458a(C39947b bVar) {
        if (this.f103757a == null || !this.f103757a.mo98458a(bVar)) {
            return false;
        }
        return true;
    }

    public DefaultGesturePresenter(C0043i iVar, C39954b bVar, View view) {
        this.f103761e = bVar;
        m127792a(view);
        iVar.getLifecycle().mo55a(this);
        this.f103762f = ViewConfiguration.get(C35563c.f93238a).getScaledPagingTouchSlop();
    }

    /* renamed from: a */
    public final boolean mo98459a(C39947b bVar, float f, float f2) {
        if (this.f103757a == null || !this.f103757a.mo98459a(bVar, f, f2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f103757a != null && this.f103757a.mo96383a(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.f103762f || abs <= abs2 || this.f103759c) {
            return false;
        }
        this.f103758b += f / ((float) this.f103760d.getWidth());
        this.f103758b = Math.min(this.f103758b, 1.0f);
        this.f103758b = Math.max(this.f103758b, -1.0f);
        this.f103761e.mo96466a(this.f103758b);
        return true;
    }

    /* renamed from: b */
    public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f103757a != null && this.f103757a.mo96389b(motionEvent, motionEvent2, f, f2)) {
            return true;
        }
        if (this.f103759c || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            return false;
        }
        this.f103761e.mo96467a(f, this.f103758b);
        this.f103758b = 0.0f;
        return true;
    }
}
