package android.support.p029v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p022v4.view.C0989s;
import android.support.p022v4.widget.C1059p;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.AppCompatImageView */
public class AppCompatImageView extends ImageView implements C0989s, C1059p {

    /* renamed from: a */
    private final C1390d f4602a;

    /* renamed from: b */
    private final C1414i f4603b;

    public ColorStateList getSupportBackgroundTintList() {
        if (this.f4602a != null) {
            return this.f4602a.mo6474a();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        if (this.f4602a != null) {
            return this.f4602a.mo6480b();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        if (this.f4603b != null) {
            return this.f4603b.mo6542b();
        }
        return null;
    }

    public Mode getSupportImageTintMode() {
        if (this.f4603b != null) {
            return this.f4603b.mo6543c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f4602a != null) {
            this.f4602a.mo6481c();
        }
        if (this.f4603b != null) {
            this.f4603b.mo6544d();
        }
    }

    public boolean hasOverlappingRendering() {
        if (!this.f4603b.mo6541a() || !super.hasOverlappingRendering()) {
            return false;
        }
        return true;
    }

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f4602a != null) {
            this.f4602a.mo6478a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        if (this.f4602a != null) {
            this.f4602a.mo6475a(i);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (this.f4603b != null) {
            this.f4603b.mo6544d();
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (this.f4603b != null) {
            this.f4603b.mo6544d();
        }
    }

    public void setImageResource(int i) {
        if (this.f4603b != null) {
            this.f4603b.mo6537a(i);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        if (this.f4603b != null) {
            this.f4603b.mo6544d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (this.f4602a != null) {
            this.f4602a.mo6476a(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        if (this.f4602a != null) {
            this.f4602a.mo6477a(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f4603b != null) {
            this.f4603b.mo6538a(colorStateList);
        }
    }

    public void setSupportImageTintMode(Mode mode) {
        if (this.f4603b != null) {
            this.f4603b.mo6539a(mode);
        }
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i) {
        super(C1362as.m6739a(context), attributeSet, i);
        this.f4602a = new C1390d(this);
        this.f4602a.mo6479a(attributeSet, i);
        this.f4603b = new C1414i(this);
        this.f4603b.mo6540a(attributeSet, i);
    }
}
