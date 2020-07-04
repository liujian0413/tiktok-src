package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;
import com.p280ss.android.ugc.aweme.shortvideo.p1584n.C40189d;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.z */
public final class C41021z extends C39944a {

    /* renamed from: a */
    private final C40189d f106730a;

    /* renamed from: b */
    private int f106731b;

    /* renamed from: c */
    private int f106732c;

    /* renamed from: d */
    private int f106733d;

    /* renamed from: e */
    private boolean f106734e;

    /* renamed from: f */
    private PointF f106735f = new PointF(-2.0f, -2.0f);

    /* renamed from: g */
    private PointF f106736g = new PointF();

    /* renamed from: c */
    public final boolean mo96392c(MotionEvent motionEvent) {
        m131097a(motionEvent.getX(), motionEvent.getY());
        this.f106730a.mo99959a(0, this.f106736g.x / ((float) this.f106731b), this.f106736g.y / ((float) this.f106732c), 1);
        this.f106734e = true;
        return false;
    }

    /* renamed from: d */
    public final boolean mo96393d(MotionEvent motionEvent) {
        m131097a(motionEvent.getX(), motionEvent.getY());
        this.f106730a.mo99959a(2, this.f106736g.x / ((float) this.f106731b), this.f106736g.y / ((float) this.f106732c), 1);
        this.f106734e = false;
        return false;
    }

    /* renamed from: a */
    public final boolean mo96382a(MotionEvent motionEvent) {
        m131097a(motionEvent.getX(), motionEvent.getY());
        this.f106730a.mo99979e(this.f106736g.x / ((float) this.f106731b), this.f106736g.y / ((float) this.f106732c));
        return true;
    }

    public C41021z(Context context, C40189d dVar) {
        this.f106731b = C23482j.m77098b(context);
        this.f106733d = C23482j.m77095a(context);
        this.f106730a = dVar;
    }

    /* renamed from: a */
    private void m131097a(float f, float f2) {
        int i;
        int i2;
        if (!C39805en.m127445a() || C39804em.f103458b == 0) {
            i = this.f106733d;
        } else {
            i = C39804em.f103458b;
        }
        this.f106732c = i;
        if (!C39805en.m127445a() || !C39804em.m127436a()) {
            i2 = 0;
        } else {
            i2 = C39804em.f103459c;
        }
        this.f106736g.set(f, f2);
        this.f106736g.offset(0.0f, (float) (-i2));
    }

    /* renamed from: a */
    public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f106734e) {
            this.f106735f.x = motionEvent.getX();
            this.f106735f.y = motionEvent.getY();
            this.f106734e = false;
        }
        float x = motionEvent2.getX() - this.f106735f.x;
        float y = motionEvent2.getY() - this.f106735f.y;
        m131097a(motionEvent2.getX(), motionEvent2.getY());
        this.f106730a.mo99957a(this.f106736g.x / ((float) this.f106731b), this.f106736g.y / ((float) this.f106732c), x / ((float) this.f106731b), y / ((float) this.f106732c), 1.0f);
        this.f106735f.x = motionEvent2.getX();
        this.f106735f.y = motionEvent2.getY();
        return true;
    }
}
