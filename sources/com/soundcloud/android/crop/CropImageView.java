package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.soundcloud.android.crop.ImageViewTouchBase.C18734a;
import java.util.ArrayList;
import java.util.Iterator;

public class CropImageView extends ImageViewTouchBase {

    /* renamed from: a */
    ArrayList<C18738b> f50580a = new ArrayList<>();

    /* renamed from: b */
    C18738b f50581b;

    /* renamed from: c */
    Context f50582c;

    /* renamed from: k */
    private float f50583k;

    /* renamed from: l */
    private float f50584l;

    /* renamed from: m */
    private int f50585m;

    /* renamed from: n */
    private int f50586n;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49244a() {
        super.mo49244a();
    }

    public /* bridge */ /* synthetic */ Matrix getUnrotatedMatrix() {
        return super.getUnrotatedMatrix();
    }

    public /* bridge */ /* synthetic */ void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
    }

    public /* bridge */ /* synthetic */ void setRecycler(C18734a aVar) {
        super.setRecycler(aVar);
    }

    public CropImageView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo49248a(C18738b bVar) {
        this.f50580a.add(bVar);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.f50580a.iterator();
        while (it.hasNext()) {
            ((C18738b) it.next()).mo49274a(canvas);
        }
    }

    /* renamed from: b */
    private void m61323b(C18738b bVar) {
        Rect rect = bVar.f50615b;
        int max = Math.max(0, getLeft() - rect.left);
        int min = Math.min(0, getRight() - rect.right);
        int max2 = Math.max(0, getTop() - rect.top);
        int min2 = Math.min(0, getBottom() - rect.bottom);
        if (max == 0) {
            max = min;
        }
        if (max2 != 0) {
            min2 = max2;
        }
        if (max != 0 || min2 != 0) {
            mo49260b((float) max, (float) min2);
        }
    }

    /* renamed from: c */
    private void m61324c(C18738b bVar) {
        Rect rect = bVar.f50615b;
        float width = (float) getWidth();
        float max = Math.max(1.0f, Math.min((width / ((float) rect.width())) * 0.6f, (((float) getHeight()) / ((float) rect.height())) * 0.6f) * getScale());
        if (((double) (Math.abs(max - getScale()) / max)) > 0.1d) {
            float[] fArr = {bVar.f50614a.centerX(), bVar.f50614a.centerY()};
            getUnrotatedMatrix().mapPoints(fArr);
            mo49258a(max, fArr[0], fArr[1], 300.0f);
        }
        m61323b(bVar);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C18740b bVar;
        if (((CropImageActivity) this.f50582c).f50558d) {
            return false;
        }
        switch (motionEvent.getAction()) {
            case 0:
                Iterator it = this.f50580a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C18738b bVar2 = (C18738b) it.next();
                        int a = bVar2.mo49270a(motionEvent.getX(), motionEvent.getY());
                        if (a != 1) {
                            this.f50585m = a;
                            this.f50581b = bVar2;
                            this.f50583k = motionEvent.getX();
                            this.f50584l = motionEvent.getY();
                            this.f50586n = motionEvent.getPointerId(motionEvent.getActionIndex());
                            C18738b bVar3 = this.f50581b;
                            if (a == 32) {
                                bVar = C18740b.Move;
                            } else {
                                bVar = C18740b.Grow;
                            }
                            bVar3.mo49276a(bVar);
                            break;
                        }
                    }
                }
            case 1:
                if (this.f50581b != null) {
                    m61324c(this.f50581b);
                    this.f50581b.mo49276a(C18740b.None);
                }
                this.f50581b = null;
                mo49259b();
                break;
            case 2:
                if (this.f50581b != null && motionEvent.getPointerId(motionEvent.getActionIndex()) == this.f50586n) {
                    this.f50581b.mo49273a(this.f50585m, motionEvent.getX() - this.f50583k, motionEvent.getY() - this.f50584l);
                    this.f50583k = motionEvent.getX();
                    this.f50584l = motionEvent.getY();
                }
                if (getScale() == 1.0f) {
                    mo49259b();
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49247a(Bitmap bitmap, boolean z) {
        super.mo49247a(bitmap, z);
    }

    public /* bridge */ /* synthetic */ boolean onKeyDown(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    public /* bridge */ /* synthetic */ boolean onKeyUp(int i, KeyEvent keyEvent) {
        return super.onKeyUp(i, keyEvent);
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49245a(float f, float f2) {
        super.mo49245a(f, f2);
        Iterator it = this.f50580a.iterator();
        while (it.hasNext()) {
            C18738b bVar = (C18738b) it.next();
            bVar.f50616c.postTranslate(f, f2);
            bVar.mo49272a();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo49249a(C18744d dVar, boolean z) {
        super.mo49249a(dVar, z);
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49246a(float f, float f2, float f3) {
        super.mo49246a(f, f2, f3);
        Iterator it = this.f50580a.iterator();
        while (it.hasNext()) {
            C18738b bVar = (C18738b) it.next();
            bVar.f50616c.set(getUnrotatedMatrix());
            bVar.mo49272a();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f50592f.f50641a != null) {
            Iterator it = this.f50580a.iterator();
            while (it.hasNext()) {
                C18738b bVar = (C18738b) it.next();
                bVar.f50616c.set(getUnrotatedMatrix());
                bVar.mo49272a();
                if (bVar.f50617d) {
                    m61324c(bVar);
                }
            }
        }
    }
}
