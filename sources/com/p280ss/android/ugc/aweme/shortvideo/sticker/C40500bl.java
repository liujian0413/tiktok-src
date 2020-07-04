package com.p280ss.android.ugc.aweme.shortvideo.sticker;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import com.p280ss.android.ugc.asve.recorder.effect.C20749b;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.shortvideo.C39804em;
import com.p280ss.android.ugc.aweme.shortvideo.C39805en;
import com.p280ss.android.ugc.aweme.shortvideo.gesture.C39944a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.bl */
public final class C40500bl extends C39944a {

    /* renamed from: a */
    private final C20749b f105248a;

    /* renamed from: b */
    private int f105249b;

    /* renamed from: c */
    private int f105250c;

    /* renamed from: d */
    private int f105251d;

    /* renamed from: e */
    private boolean f105252e;

    /* renamed from: f */
    private PointF f105253f = new PointF(-2.0f, -2.0f);

    /* renamed from: g */
    private PointF f105254g = new PointF();

    /* renamed from: c */
    public final boolean mo96392c(MotionEvent motionEvent) {
        m129485a(motionEvent.getX(), motionEvent.getY());
        this.f105248a.mo56047a(0, this.f105254g.x / ((float) this.f105249b), this.f105254g.y / ((float) this.f105250c), 1);
        this.f105252e = true;
        return false;
    }

    /* renamed from: d */
    public final boolean mo96393d(MotionEvent motionEvent) {
        m129485a(motionEvent.getX(), motionEvent.getY());
        this.f105248a.mo56047a(2, this.f105254g.x / ((float) this.f105249b), this.f105254g.y / ((float) this.f105250c), 1);
        this.f105252e = false;
        return false;
    }

    /* renamed from: a */
    public final boolean mo96382a(MotionEvent motionEvent) {
        m129485a(motionEvent.getX(), motionEvent.getY());
        this.f105248a.mo56082b(this.f105254g.x / ((float) this.f105249b), this.f105254g.y / ((float) this.f105250c));
        return true;
    }

    public C40500bl(Context context, C20749b bVar) {
        this.f105249b = C23482j.m77098b(context);
        this.f105251d = C23482j.m77095a(context);
        this.f105248a = bVar;
    }

    /* renamed from: a */
    private void m129485a(float f, float f2) {
        int i;
        int i2;
        if (!C39805en.m127445a() || C39804em.f103458b == 0) {
            i = this.f105251d;
        } else {
            i = C39804em.f103458b;
        }
        this.f105250c = i;
        if (!C39805en.m127445a() || !C39804em.m127436a()) {
            i2 = 0;
        } else {
            i2 = C39804em.f103459c;
        }
        this.f105254g.set(f, f2);
        this.f105254g.offset(0.0f, (float) (-i2));
    }

    /* renamed from: a */
    public final boolean mo96383a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f105252e) {
            this.f105253f.x = motionEvent.getX();
            this.f105253f.y = motionEvent.getY();
            this.f105252e = false;
        }
        float x = motionEvent2.getX() - this.f105253f.x;
        float y = motionEvent2.getY() - this.f105253f.y;
        m129485a(motionEvent2.getX(), motionEvent2.getY());
        this.f105248a.mo56045a(this.f105254g.x / ((float) this.f105249b), this.f105254g.y / ((float) this.f105250c), x / ((float) this.f105249b), y / ((float) this.f105250c), 1.0f);
        this.f105253f.x = motionEvent2.getX();
        this.f105253f.y = motionEvent2.getY();
        return true;
    }
}
