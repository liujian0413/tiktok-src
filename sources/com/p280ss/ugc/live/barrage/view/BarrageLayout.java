package com.p280ss.ugc.live.barrage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.p280ss.ugc.live.barrage.p1825b.C46198a;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.ugc.live.barrage.view.BarrageLayout */
public final class BarrageLayout extends View {

    /* renamed from: a */
    private final ArrayList<C46198a> f118801a;

    /* renamed from: b */
    private C46198a f118802b;

    public BarrageLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public BarrageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final void mo114157a(C46198a aVar) {
        m145112a(aVar, this.f118801a.size());
    }

    /* renamed from: a */
    public final void mo114156a() {
        Iterator it = this.f118801a.iterator();
        while (it.hasNext()) {
            ((C46198a) it.next()).mo11797a();
        }
    }

    public final void draw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        super.draw(canvas);
        Iterator it = this.f118801a.iterator();
        while (it.hasNext()) {
            ((C46198a) it.next()).mo114145a(canvas);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                Iterator it = this.f118801a.iterator();
                while (it.hasNext()) {
                    C46198a aVar = (C46198a) it.next();
                    if (aVar.mo114148a(motionEvent)) {
                        this.f118802b = aVar;
                        return true;
                    }
                }
                break;
            case 1:
                if (this.f118802b == null) {
                    this.f118802b = null;
                    break;
                } else {
                    C46198a aVar2 = this.f118802b;
                    if (aVar2 == null) {
                        C7573i.m23580a();
                    }
                    return aVar2.mo114148a(motionEvent);
                }
            case 2:
            case 3:
                if (this.f118802b != null) {
                    C46198a aVar3 = this.f118802b;
                    if (aVar3 == null) {
                        C7573i.m23580a();
                    }
                    return aVar3.mo114148a(motionEvent);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m145112a(C46198a aVar, int i) {
        if (aVar != null) {
            if (i > this.f118801a.size() || i < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f118801a.add(i, aVar);
        }
    }

    public BarrageLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f118801a = new ArrayList<>();
    }

    public /* synthetic */ BarrageLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
