package com.p280ss.android.p817ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.android.ad.splash.core.video.SSRenderSurfaceView */
public class SSRenderSurfaceView extends SSSurfaceView implements Callback {

    /* renamed from: c */
    private static ArrayList<C19095g> f51520c = new ArrayList<>();

    /* renamed from: a */
    private C19064a f51521a;

    /* renamed from: b */
    private C19095g f51522b;

    public View getView() {
        return this;
    }

    /* renamed from: a */
    private void m62425a() {
        this.f51522b = new C19095g(this);
        f51520c.add(this.f51522b);
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        m62425a();
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (this.f51521a != null) {
            this.f51521a.mo50657a(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (this.f51521a != null) {
            this.f51521a.mo50659b(surfaceHolder);
        }
    }

    /* renamed from: a */
    public final void mo50651a(C19064a aVar) {
        this.f51521a = aVar;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator it = f51520c.iterator();
        while (it.hasNext()) {
            C19095g gVar = (C19095g) it.next();
            if (gVar.mo50759a() == null) {
                holder.removeCallback(gVar);
                it.remove();
            }
        }
        holder.addCallback(this.f51522b);
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m62425a();
    }

    public SSRenderSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m62425a();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (this.f51521a != null) {
            this.f51521a.mo50658a(surfaceHolder, i, i2, i3);
        }
    }
}
