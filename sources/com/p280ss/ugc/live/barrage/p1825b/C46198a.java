package com.p280ss.ugc.live.barrage.p1825b;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.p280ss.ugc.live.barrage.BarrageCopyOnWriteArrayList;
import com.p280ss.ugc.live.barrage.BarrageCopyOnWriteArrayList.C46186a;
import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a.C46190b;
import com.p280ss.ugc.live.barrage.p1824a.C46187a.C46188a.C46191c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.ugc.live.barrage.b.a */
public abstract class C46198a {

    /* renamed from: b */
    static final /* synthetic */ C7595j[] f118775b = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C46198a.class), "valueAnimator", "getValueAnimator()Landroid/animation/ValueAnimator;"))};

    /* renamed from: i */
    public static final C46201b f118776i = new C46201b(null);

    /* renamed from: a */
    private C46187a f118777a;

    /* renamed from: c */
    public final LinkedList<C46187a> f118778c = new LinkedList<>();

    /* renamed from: d */
    public final ArrayList<C46187a> f118779d = new ArrayList<>();

    /* renamed from: e */
    public final BarrageCopyOnWriteArrayList f118780e = new BarrageCopyOnWriteArrayList();

    /* renamed from: f */
    public float f118781f;

    /* renamed from: g */
    public C46200a f118782g;

    /* renamed from: h */
    public final View f118783h;

    /* renamed from: j */
    private final C7541d f118784j = C7546e.m23569a(new C46203d(this));

    /* renamed from: com.ss.ugc.live.barrage.b.a$a */
    public interface C46200a {
        /* renamed from: a */
        void mo13677a(C46187a aVar);
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$b */
    public static final class C46201b {
        private C46201b() {
        }

        public /* synthetic */ C46201b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$c */
    static final class C46202c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C46198a f118786a;

        C46202c(C46198a aVar) {
            this.f118786a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f = this.f118786a.f118781f;
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                this.f118786a.f118781f = floatValue;
                float f2 = (floatValue - f) * 1000.0f;
                if (floatValue < f) {
                    f2 = ((1.0f - f) + floatValue) * 1000.0f;
                }
                this.f118786a.mo11799a(this.f118786a.f118780e, f2);
                if (this.f118786a.f118778c.isEmpty() && this.f118786a.f118779d.isEmpty() && this.f118786a.f118780e.isEmpty()) {
                    this.f118786a.mo114150d();
                }
                this.f118786a.mo114153g();
                if (C7573i.m23585a((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
                    this.f118786a.f118783h.invalidate();
                } else {
                    this.f118786a.f118783h.postInvalidate();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
            }
        }
    }

    /* renamed from: com.ss.ugc.live.barrage.b.a$d */
    static final class C46203d extends Lambda implements C7561a<ValueAnimator> {

        /* renamed from: a */
        final /* synthetic */ C46198a f118787a;

        C46203d(C46198a aVar) {
            this.f118787a = aVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ValueAnimator invoke() {
            return this.f118787a.mo114152f();
        }
    }

    /* renamed from: h */
    private final ValueAnimator m145083h() {
        return (ValueAnimator) this.f118784j.getValue();
    }

    /* renamed from: a */
    public abstract void mo11799a(BarrageCopyOnWriteArrayList barrageCopyOnWriteArrayList, float f);

    /* renamed from: a */
    public abstract void mo11800a(C46187a aVar);

    /* renamed from: a */
    public void mo11797a() {
        this.f118778c.clear();
        this.f118779d.clear();
        this.f118780e.clear();
    }

    /* renamed from: b */
    public int mo11801b() {
        return this.f118780e.size() + this.f118779d.size() + this.f118778c.size();
    }

    /* renamed from: c */
    public final void mo114149c() {
        if (!m145083h().isRunning()) {
            m145083h().start();
        }
        mo114153g();
    }

    /* renamed from: d */
    public final void mo114150d() {
        if (m145083h().isRunning()) {
            m145083h().cancel();
        }
    }

    /* renamed from: e */
    public final C46187a mo114151e() {
        C46187a aVar;
        C46187a aVar2 = null;
        try {
            if (this.f118779d.isEmpty()) {
                return null;
            }
            Iterator it = this.f118779d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar = null;
                    break;
                }
                aVar = (C46187a) it.next();
                if (aVar.f118759i) {
                    break;
                }
            }
            Collection collection = this.f118779d;
            if (collection != null) {
                C7577n.m23621b(collection).remove(aVar);
                aVar2 = aVar;
                return aVar2;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    public final ValueAnimator mo114152f() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        C7573i.m23582a((Object) ofFloat, "animator");
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(1000);
        ofFloat.setRepeatMode(1);
        ofFloat.setRepeatCount(-1);
        ofFloat.addUpdateListener(new C46202c(this));
        return ofFloat;
    }

    /* renamed from: g */
    public final void mo114153g() {
        while (this.f118779d.size() <= 30 && this.f118778c.size() != 0) {
            C46187a aVar = (C46187a) this.f118778c.removeFirst();
            aVar.mo114137a((C46188a) C46191c.f118765a);
            if (aVar.f118760j) {
                this.f118779d.add(0, aVar);
            } else {
                this.f118779d.add(aVar);
            }
        }
    }

    /* renamed from: a */
    public final void mo114145a(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        Iterator it = this.f118780e.iterator();
        while (it.hasNext()) {
            ((C46187a) it.next()).mo11795a(canvas);
        }
    }

    public C46198a(View view) {
        C7573i.m23587b(view, "barrageView");
        this.f118783h = view;
        this.f118780e.setOnChangeListener(new C46186a(this) {

            /* renamed from: a */
            final /* synthetic */ C46198a f118785a;

            {
                this.f118785a = r1;
            }

            /* renamed from: a */
            public final void mo114134a(boolean z, C46187a aVar) {
                C7573i.m23587b(aVar, "barrage");
                if (!z) {
                    C46200a aVar2 = this.f118785a.f118782g;
                    if (aVar2 != null) {
                        aVar2.mo13677a(aVar);
                    }
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo114147a(C46200a aVar) {
        C7573i.m23587b(aVar, "barrageCallback");
        this.f118782g = aVar;
    }

    /* renamed from: a */
    public final boolean mo114148a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                Iterator it = this.f118780e.iterator();
                while (it.hasNext()) {
                    C46187a aVar = (C46187a) it.next();
                    if (aVar.f118761k.contains(motionEvent.getX(), motionEvent.getY()) && aVar.mo114138a(motionEvent)) {
                        this.f118777a = aVar;
                        return true;
                    }
                }
                break;
            case 1:
                C46187a aVar2 = this.f118777a;
                if (aVar2 != null) {
                    RectF rectF = aVar2.f118761k;
                    if (rectF != null && rectF.contains(motionEvent.getX(), motionEvent.getY())) {
                        C46187a aVar3 = this.f118777a;
                        if (aVar3 != null) {
                            return aVar3.mo114138a(motionEvent);
                        }
                        return false;
                    }
                }
                break;
            case 2:
            case 3:
                if (this.f118777a != null) {
                    C46187a aVar4 = this.f118777a;
                    if (aVar4 != null) {
                        RectF rectF2 = aVar4.f118761k;
                        if (rectF2 != null && rectF2.contains(motionEvent.getX(), motionEvent.getY())) {
                            C46187a aVar5 = this.f118777a;
                            if (aVar5 != null) {
                                return aVar5.mo114138a(motionEvent);
                            }
                            return false;
                        }
                    }
                }
                break;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo114146a(C46187a aVar, boolean z) {
        C7573i.m23587b(aVar, "barrage");
        if (z) {
            this.f118778c.add(0, aVar);
        } else {
            this.f118778c.add(aVar);
        }
        aVar.mo114137a((C46188a) C46190b.f118764a);
        mo11800a(aVar);
    }
}
