package com.soundcloud.android.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: com.soundcloud.android.crop.d */
final class C18744d {

    /* renamed from: a */
    public Bitmap f50641a;

    /* renamed from: b */
    public int f50642b;

    /* renamed from: e */
    private boolean m61384e() {
        if ((this.f50642b / 90) % 2 != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo49282d() {
        if (this.f50641a != null) {
            this.f50641a.recycle();
            this.f50641a = null;
        }
    }

    /* renamed from: b */
    public final int mo49280b() {
        if (this.f50641a == null) {
            return 0;
        }
        if (m61384e()) {
            return this.f50641a.getWidth();
        }
        return this.f50641a.getHeight();
    }

    /* renamed from: c */
    public final int mo49281c() {
        if (this.f50641a == null) {
            return 0;
        }
        if (m61384e()) {
            return this.f50641a.getHeight();
        }
        return this.f50641a.getWidth();
    }

    /* renamed from: a */
    public final Matrix mo49279a() {
        Matrix matrix = new Matrix();
        if (!(this.f50641a == null || this.f50642b == 0)) {
            matrix.preTranslate((float) (-(this.f50641a.getWidth() / 2)), (float) (-(this.f50641a.getHeight() / 2)));
            matrix.postRotate((float) this.f50642b);
            matrix.postTranslate((float) (mo49281c() / 2), (float) (mo49280b() / 2));
        }
        return matrix;
    }

    public C18744d(Bitmap bitmap, int i) {
        this.f50641a = bitmap;
        this.f50642b = i % 360;
    }
}
