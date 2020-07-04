package p1904uk.p1905co.senab.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import p1904uk.p1905co.senab.photoview.C48881b.C48885c;
import p1904uk.p1905co.senab.photoview.C48881b.C48886d;
import p1904uk.p1905co.senab.photoview.C48881b.C48887e;

/* renamed from: uk.co.senab.photoview.PhotoView */
public class PhotoView extends ImageView {

    /* renamed from: a */
    private final C48881b f124229a;

    /* renamed from: b */
    private ScaleType f124230b;

    public Matrix getDisplayMatrix() {
        return this.f124229a.mo123702j();
    }

    public RectF getDisplayRect() {
        return this.f124229a.mo123689b();
    }

    public float getMaxScale() {
        return getMaximumScale();
    }

    public float getMaximumScale() {
        return this.f124229a.mo123698f();
    }

    public float getMediumScale() {
        return this.f124229a.mo123696e();
    }

    public float getMidScale() {
        return getMediumScale();
    }

    public float getMinScale() {
        return getMinimumScale();
    }

    public float getMinimumScale() {
        return this.f124229a.mo123694d();
    }

    public float getScale() {
        return this.f124229a.mo123699g();
    }

    public ScaleType getScaleType() {
        return this.f124229a.mo123700h();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f124229a.mo123680a();
        super.onDetachedFromWindow();
    }

    public void setMaxScale(float f) {
        setMaximumScale(f);
    }

    public void setMidScale(float f) {
        setMediumScale(f);
    }

    public void setMinScale(float f) {
        setMinimumScale(f);
    }

    public PhotoView(Context context) {
        this(context, null);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f124229a.mo123688a(z);
    }

    public void setMaximumScale(float f) {
        this.f124229a.mo123695d(f);
    }

    public void setMediumScale(float f) {
        this.f124229a.mo123693c(f);
    }

    public void setMinimumScale(float f) {
        this.f124229a.mo123690b(f);
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f124229a.mo123683a(onLongClickListener);
    }

    public void setOnMatrixChangeListener(C48885c cVar) {
        this.f124229a.mo123685a(cVar);
    }

    public void setOnPhotoTapListener(C48886d dVar) {
        this.f124229a.mo123686a(dVar);
    }

    public void setOnViewTapListener(C48887e eVar) {
        this.f124229a.mo123687a(eVar);
    }

    public void setPhotoViewRotation(float f) {
        this.f124229a.mo123681a(f);
    }

    public void setScale(float f) {
        this.f124229a.mo123697e(f);
    }

    public void setZoomable(boolean z) {
        this.f124229a.mo123691b(z);
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f124229a != null) {
            this.f124229a.mo123701i();
        }
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        if (this.f124229a != null) {
            this.f124229a.mo123701i();
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f124229a != null) {
            this.f124229a.mo123701i();
        }
    }

    public void setScaleType(ScaleType scaleType) {
        if (this.f124229a != null) {
            this.f124229a.mo123684a(scaleType);
        } else {
            this.f124230b = scaleType;
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setScaleType(ScaleType.MATRIX);
        this.f124229a = new C48881b(this);
        if (this.f124230b != null) {
            setScaleType(this.f124230b);
            this.f124230b = null;
        }
    }
}
