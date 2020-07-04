package com.p280ss.android.ugc.aweme.story.shootvideo.textsticker.gesture;

import android.arch.lifecycle.C0043i;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.IGesturePresenter;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.defult.C39954b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39947b;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.VideoRecordGestureLayout.C41180a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.shootvideo.textsticker.gesture.StickerGesturePresenter */
public class StickerGesturePresenter implements IGesturePresenter, C41180a {

    /* renamed from: a */
    public VideoRecordGestureLayout f109260a;

    /* renamed from: b */
    public float f109261b = 0.0f;

    /* renamed from: c */
    public boolean f109262c;

    /* renamed from: d */
    private List<C39944a> f109263d = new ArrayList();

    /* renamed from: e */
    private C39954b f109264e;

    /* renamed from: f */
    private int f109265f;

    /* renamed from: a */
    public final boolean mo96382a(MotionEvent motionEvent) {
        return false;
    }

    public void disAttachView() {
        this.f109260a.setOnGestureListener(null);
    }

    /* renamed from: a */
    public final boolean mo96380a() {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96380a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo96386b() {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96386b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo103296a(C39944a aVar) {
        this.f109263d.add(0, aVar);
    }

    /* renamed from: a */
    private void m133729a(View view) {
        if (view instanceof VideoRecordGestureLayout) {
            this.f109260a = (VideoRecordGestureLayout) view;
            this.f109260a.setOnGestureListener(this);
        }
    }

    /* renamed from: b */
    public final void mo98460b(C39947b bVar) {
        for (C39944a b : this.f109263d) {
            b.mo98460b(bVar);
        }
    }

    /* renamed from: c */
    public final boolean mo96391c(float f) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96391c(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo96393d(MotionEvent motionEvent) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96393d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo96381a(float f) {
        this.f109264e.mo96473c(f);
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96381a(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo96392c(MotionEvent motionEvent) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96392c(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo98462e(MotionEvent motionEvent) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo98462e(motionEvent)) {
                return true;
            }
        }
        this.f109264e.mo96468a(motionEvent);
        return true;
    }

    /* renamed from: b */
    public final boolean mo96387b(float f) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96387b(f)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96384a(scaleGestureDetector)) {
                return true;
            }
        }
        return this.f109264e.mo96469a(scaleGestureDetector);
    }

    /* renamed from: b */
    public final boolean mo96388b(MotionEvent motionEvent) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96388b(motionEvent)) {
                return true;
            }
        }
        this.f109264e.mo96465a();
        this.f109264e.mo96470b();
        return true;
    }

    /* renamed from: a */
    public final boolean mo98458a(C39947b bVar) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo98458a(bVar)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96390b(scaleGestureDetector)) {
                return true;
            }
        }
        if (this.f109264e.mo96471b(scaleGestureDetector.getScaleFactor())) {
            return true;
        }
        return this.f109264e.mo96472b(scaleGestureDetector);
    }

    /* renamed from: a */
    public final boolean mo96385a(C39949c cVar) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96385a(cVar)) {
                return true;
            }
        }
        return false;
    }

    public StickerGesturePresenter(C0043i iVar, C39954b bVar, View view) {
        this.f109264e = bVar;
        m133729a(view);
        iVar.getLifecycle().mo55a(this);
        this.f109265f = ViewConfiguration.get(C35563c.f93238a).getScaledPagingTouchSlop();
    }

    /* renamed from: a */
    public final boolean mo98459a(C39947b bVar, float f, float f2) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo98459a(bVar, f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96383a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs <= this.f109265f || abs <= abs2 || this.f109262c) {
            return false;
        }
        this.f109261b += f / ((float) this.f109260a.getWidth());
        this.f109261b = Math.min(this.f109261b, 1.0f);
        this.f109261b = Math.max(this.f109261b, -1.0f);
        this.f109264e.mo96466a(this.f109261b);
        return true;
    }

    /* renamed from: b */
    public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        for (C39944a aVar : this.f109263d) {
            if (aVar != null && aVar.mo96389b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        if (this.f109262c || Math.abs(motionEvent.getX() - motionEvent2.getX()) <= Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            return false;
        }
        this.f109264e.mo96467a(f, this.f109261b);
        this.f109261b = 0.0f;
        return true;
    }
}
