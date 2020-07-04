package com.p280ss.android.ugc.aweme.shortvideo.p1548ar.p1549a;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a.C39949c;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ar.a.a */
public final class C38465a extends C39944a {

    /* renamed from: a */
    private final C20749b f99997a;

    /* renamed from: b */
    private FaceStickerBean f99998b;

    /* renamed from: c */
    private int f99999c;

    /* renamed from: d */
    private int f100000d;

    /* renamed from: e */
    private int f100001e;

    /* renamed from: f */
    private float f100002f = 1.0f;

    /* renamed from: g */
    private float f100003g = 1.0f;

    /* renamed from: h */
    private float f100004h;

    /* renamed from: i */
    private boolean f100005i;

    /* renamed from: j */
    private PointF f100006j = new PointF(-2.0f, -2.0f);

    /* renamed from: k */
    private int f100007k;

    /* renamed from: l */
    private int f100008l;

    /* renamed from: m */
    private int f100009m;

    /* renamed from: n */
    private int f100010n;

    /* renamed from: o */
    private PointF f100011o = new PointF();

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
        this.f99997a.mo56103d(-f, 6.0f);
        return true;
    }

    /* renamed from: b */
    public final boolean mo96388b(MotionEvent motionEvent) {
        m122954a(motionEvent.getX(), motionEvent.getY());
        PointF b = m122955b(this.f100011o.x, this.f100011o.y);
        if (this.f99997a != null) {
            this.f99997a.mo56110e(b.x, b.y);
        }
        return true;
    }

    /* renamed from: c */
    public final boolean mo96391c(float f) {
        this.f99997a.mo56103d(-f, 6.0f);
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_spin").setLabelName("shoot_page").setExtValueLong(this.f99998b.getStickerId()));
        return true;
    }

    /* renamed from: d */
    public final boolean mo96393d(MotionEvent motionEvent) {
        m122954a(motionEvent.getX(), motionEvent.getY());
        this.f99997a.mo56047a(2, this.f100011o.x / ((float) this.f99999c), this.f100011o.y / ((float) this.f100000d), 0);
        this.f100005i = false;
        return false;
    }

    /* renamed from: a */
    public final boolean mo96381a(float f) {
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_scale").setLabelName("shoot_page").setExtValueLong(this.f99998b.getStickerId()));
        this.f100002f = 1.0f;
        this.f100003g = 1.0f;
        return true;
    }

    /* renamed from: c */
    public final boolean mo96392c(MotionEvent motionEvent) {
        m122954a(motionEvent.getX(), motionEvent.getY());
        this.f99997a.mo56047a(0, this.f100011o.x / ((float) this.f99999c), this.f100011o.y / ((float) this.f100000d), 0);
        this.f100005i = true;
        return false;
    }

    /* renamed from: a */
    public final boolean mo96382a(MotionEvent motionEvent) {
        m122954a(motionEvent.getX(), motionEvent.getY());
        PointF b = m122955b(this.f100011o.x, this.f100011o.y);
        this.f99997a.mo56044a(b.x, b.y);
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_click").setLabelName("shoot_page").setExtValueLong(this.f99998b.getStickerId()));
        return true;
    }

    /* renamed from: b */
    public final boolean mo96390b(ScaleGestureDetector scaleGestureDetector) {
        this.f100003g *= scaleGestureDetector.getScaleFactor();
        this.f99997a.mo56094c(this.f100003g / this.f100002f, 3.0f);
        this.f100002f = this.f100003g;
        return true;
    }

    /* renamed from: a */
    public final C38465a mo96379a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return this;
        }
        this.f100009m = i;
        this.f100010n = i2;
        return this;
    }

    /* renamed from: b */
    private PointF m122955b(float f, float f2) {
        int i = (this.f100009m - this.f99999c) / 2;
        PointF pointF = new PointF();
        pointF.x = (f + ((float) i)) / ((float) this.f100009m);
        pointF.y = f2 / ((float) this.f100010n);
        return pointF;
    }

    /* renamed from: a */
    private void m122954a(float f, float f2) {
        int i;
        int i2;
        if (!C39805en.m127445a() || C39804em.f103458b == 0) {
            i = this.f100001e;
        } else {
            i = C39804em.f103458b;
        }
        this.f100000d = i;
        if (!C39805en.m127445a() || !C39804em.m127436a()) {
            i2 = 0;
        } else {
            i2 = C39804em.f103459c;
        }
        this.f100011o.set(f, f2);
        this.f100011o.offset(0.0f, (float) (-i2));
    }

    public C38465a(FaceStickerBean faceStickerBean, C20749b bVar) {
        this.f99998b = faceStickerBean;
        this.f99997a = bVar;
        this.f99999c = C23482j.m77099c();
        this.f100001e = C23482j.m77097b();
        this.f100007k = C35563c.f93254q.getVideoWidth();
        this.f100008l = C35563c.f93254q.getVideoHeight();
        this.f100009m = this.f100007k;
        this.f100010n = this.f100008l;
    }

    /* renamed from: b */
    public final boolean mo96389b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_control_alert").setLabelName("shoot_page"));
        return true;
    }

    /* renamed from: a */
    public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f100005i) {
            this.f100006j.x = motionEvent.getX();
            this.f100006j.y = motionEvent.getY();
            this.f100005i = false;
        }
        float x = motionEvent2.getX() - this.f100006j.x;
        float y = motionEvent2.getY() - this.f100006j.y;
        m122954a(motionEvent2.getX(), motionEvent2.getY());
        this.f99997a.mo56045a(this.f100011o.x / ((float) this.f99999c), this.f100011o.y / ((float) this.f100000d), x / ((float) this.f99999c), y / ((float) this.f100000d), 1.0f);
        this.f100006j.x = motionEvent2.getX();
        this.f100006j.y = motionEvent2.getY();
        if (!(motionEvent == null || motionEvent.getX() == this.f100004h)) {
            this.f100004h = motionEvent.getX();
            C6907h.onEvent(MobClick.obtain().setEventName("ar_prop_drag").setLabelName("shoot_page").setExtValueLong(this.f99998b.getStickerId()));
        }
        return true;
    }
}
