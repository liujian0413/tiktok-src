package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.p1549a;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.a.b */
public final class C38466b extends C39944a {

    /* renamed from: a */
    private final C40189d f100012a;

    /* renamed from: b */
    private FaceStickerBean f100013b;

    /* renamed from: c */
    private int f100014c;

    /* renamed from: d */
    private int f100015d;

    /* renamed from: e */
    private int f100016e;

    /* renamed from: f */
    private float f100017f = 1.0f;

    /* renamed from: g */
    private float f100018g = 1.0f;

    /* renamed from: h */
    private float f100019h;

    /* renamed from: i */
    private boolean f100020i;

    /* renamed from: j */
    private PointF f100021j = new PointF(-2.0f, -2.0f);

    /* renamed from: k */
    private int f100022k;

    /* renamed from: l */
    private int f100023l;

    /* renamed from: m */
    private int f100024m;

    /* renamed from: n */
    private int f100025n;

    /* renamed from: o */
    private PointF f100026o = new PointF();

    /* renamed from: a */
    public final boolean mo96380a() {
        return false;
    }

    /* renamed from: a */
    public final boolean mo96384a(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    /* renamed from: a */
    public final boolean mo96385a(C39949c cVar) {
        return true;
    }

    /* renamed from: b */
    public final boolean mo96386b() {
        return false;
    }

    /* renamed from: b */
    public final boolean mo96387b(float f) {
        this.f100012a.mo99981g(-f, 6.0f);
        return true;
    }

    /* renamed from: b */
    public final boolean mo96388b(MotionEvent motionEvent) {
        m122971a(motionEvent.getX(), motionEvent.getY());
        PointF b = m122972b(this.f100026o.x, this.f100026o.y);
        if (this.f100012a != null) {
            this.f100012a.mo99982h(b.x, b.y);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo96391c(float f) {
        this.f100012a.mo99981g(-f, 6.0f);
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_spin").setLabelName("shoot_page").setExtValueLong(this.f100013b.getStickerId()));
        return true;
    }

    /* renamed from: d */
    public final boolean mo96393d(MotionEvent motionEvent) {
        m122971a(motionEvent.getX(), motionEvent.getY());
        this.f100012a.mo99959a(2, this.f100026o.x / ((float) this.f100014c), this.f100026o.y / ((float) this.f100015d), 0);
        this.f100020i = false;
        return false;
    }

    /* renamed from: a */
    public final boolean mo96381a(float f) {
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_scale").setLabelName("shoot_page").setExtValueLong(this.f100013b.getStickerId()));
        this.f100017f = 1.0f;
        this.f100018g = 1.0f;
        return true;
    }

    /* renamed from: c */
    public final boolean mo96392c(MotionEvent motionEvent) {
        m122971a(motionEvent.getX(), motionEvent.getY());
        this.f100012a.mo99959a(0, this.f100026o.x / ((float) this.f100014c), this.f100026o.y / ((float) this.f100015d), 0);
        this.f100020i = true;
        return false;
    }

    /* renamed from: a */
    public final boolean mo96382a(MotionEvent motionEvent) {
        m122971a(motionEvent.getX(), motionEvent.getY());
        PointF b = m122972b(this.f100026o.x, this.f100026o.y);
        this.f100012a.mo99977d(b.x, b.y);
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_click").setLabelName("shoot_page").setExtValueLong(this.f100013b.getStickerId()));
        return true;
    }

    /* renamed from: b */
    public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
        this.f100018g *= scaleGestureDetector.getScaleFactor();
        this.f100012a.mo99980f(this.f100018g / this.f100017f, 3.0f);
        this.f100017f = this.f100018g;
        return true;
    }

    /* renamed from: a */
    public final C38466b mo96394a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return this;
        }
        this.f100024m = i;
        this.f100025n = i2;
        return this;
    }

    /* renamed from: b */
    private PointF m122972b(float f, float f2) {
        int i = (this.f100024m - this.f100014c) / 2;
        PointF pointF = new PointF();
        pointF.x = (f + ((float) i)) / ((float) this.f100024m);
        pointF.y = f2 / ((float) this.f100025n);
        return pointF;
    }

    /* renamed from: a */
    private void m122971a(float f, float f2) {
        int i;
        int i2;
        if (!C39805en.m127445a() || C39804em.f103458b == 0) {
            i = this.f100016e;
        } else {
            i = C39804em.f103458b;
        }
        this.f100015d = i;
        if (!C39805en.m127445a() || !C39804em.m127436a()) {
            i2 = 0;
        } else {
            i2 = C39804em.f103459c;
        }
        this.f100026o.set(f, f2);
        this.f100026o.offset(0.0f, (float) (-i2));
    }

    public C38466b(FaceStickerBean faceStickerBean, C40189d dVar) {
        this.f100013b = faceStickerBean;
        this.f100012a = dVar;
        this.f100014c = C23482j.m77099c();
        this.f100016e = C23482j.m77097b();
        this.f100022k = C35563c.f93254q.getVideoWidth();
        this.f100023l = C35563c.f93254q.getVideoHeight();
        this.f100024m = this.f100022k;
        this.f100025n = this.f100023l;
    }

    /* renamed from: b */
    public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_control_alert").setLabelName("shoot_page"));
        return true;
    }

    /* renamed from: a */
    public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f100020i) {
            this.f100021j.x = motionEvent.getX();
            this.f100021j.y = motionEvent.getY();
            this.f100020i = false;
        }
        float x = motionEvent2.getX() - this.f100021j.x;
        float y = motionEvent2.getY() - this.f100021j.y;
        m122971a(motionEvent2.getX(), motionEvent2.getY());
        this.f100012a.mo99957a(this.f100026o.x / ((float) this.f100014c), this.f100026o.y / ((float) this.f100015d), x / ((float) this.f100014c), y / ((float) this.f100015d), 1.0f);
        this.f100021j.x = motionEvent2.getX();
        this.f100021j.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.f100019h)) {
            this.f100019h = motionEvent.getX();
            C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_drag").setLabelName("shoot_page").setExtValueLong(this.f100013b.getStickerId()));
        }
        return true;
    }
}
