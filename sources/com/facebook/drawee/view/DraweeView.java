package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13303f.C13305a;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.p698c.C13387b;
import com.facebook.drawee.view.C13443a.C13444a;
import com.facebook.imagepipeline.p725l.C13783b;

public class DraweeView<DH extends C13387b> extends ImageView {
    private static boolean sGlobalLegacyVisibilityHandlingEnabled;
    private float mAspectRatio = 0.0f;
    private C13445b<DH> mDraweeHolder;
    private boolean mInitialised = false;
    private boolean mLegacyVisibilityHandlingEnabled = false;
    private final C13444a mMeasureSpec = new C13444a();

    public float getAspectRatio() {
        return this.mAspectRatio;
    }

    /* access modifiers changed from: protected */
    public void onAttach() {
        doAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetach() {
        doDetach();
    }

    /* access modifiers changed from: protected */
    public void doAttach() {
        this.mDraweeHolder.mo32934b();
    }

    /* access modifiers changed from: protected */
    public void doDetach() {
        this.mDraweeHolder.mo32935c();
    }

    public C13386a getController() {
        return this.mDraweeHolder.f35652b;
    }

    public DH getHierarchy() {
        return this.mDraweeHolder.mo32936d();
    }

    public Drawable getTopLevelDrawable() {
        return this.mDraweeHolder.mo32938f();
    }

    public boolean hasHierarchy() {
        return this.mDraweeHolder.mo32937e();
    }

    public boolean hasController() {
        if (this.mDraweeHolder.f35652b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onAttach();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        maybeOverrideVisibilityHandling();
        onDetach();
    }

    private void maybeOverrideVisibilityHandling() {
        boolean z;
        if (this.mLegacyVisibilityHandlingEnabled) {
            Drawable drawable = getDrawable();
            if (drawable != null) {
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable.setVisible(z, false);
            }
        }
    }

    public String toString() {
        String str;
        C13305a a = C13303f.m38930a((Object) this);
        String str2 = "holder";
        if (this.mDraweeHolder != null) {
            str = this.mDraweeHolder.toString();
        } else {
            str = "<no holder set>";
        }
        return a.mo32569a(str2, (Object) str).toString();
    }

    public static void setGlobalLegacyVisibilityHandlingEnabled(boolean z) {
        sGlobalLegacyVisibilityHandlingEnabled = z;
    }

    public void setLegacyVisibilityHandlingEnabled(boolean z) {
        this.mLegacyVisibilityHandlingEnabled = z;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.mDraweeHolder.mo32933a(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAspectRatio(float f) {
        if (f != this.mAspectRatio) {
            this.mAspectRatio = f;
            requestLayout();
        }
    }

    public void setController(C13386a aVar) {
        this.mDraweeHolder.mo32931a(aVar);
        super.setImageDrawable(this.mDraweeHolder.mo32938f());
    }

    public void setHierarchy(DH dh) {
        this.mDraweeHolder.mo32932a(dh);
        super.setImageDrawable(this.mDraweeHolder.mo32938f());
    }

    public DraweeView(Context context) {
        super(context);
        init(context);
    }

    public void setImageBitmap(Bitmap bitmap) {
        init(getContext());
        this.mDraweeHolder.mo32931a((C13386a) null);
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        init(getContext());
        this.mDraweeHolder.mo32931a((C13386a) null);
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        init(getContext());
        this.mDraweeHolder.mo32931a((C13386a) null);
        super.setImageResource(i);
    }

    public void setImageURI(Uri uri) {
        init(getContext());
        this.mDraweeHolder.mo32931a((C13386a) null);
        super.setImageURI(uri);
    }

    private void init(Context context) {
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("DraweeView#init");
            }
            if (!this.mInitialised) {
                boolean z = true;
                this.mInitialised = true;
                this.mDraweeHolder = C13445b.m39493a(null, context);
                if (VERSION.SDK_INT >= 21) {
                    ColorStateList imageTintList = getImageTintList();
                    if (imageTintList == null) {
                        if (C13783b.m40665b()) {
                            C13783b.m40663a();
                        }
                        return;
                    }
                    setColorFilter(imageTintList.getDefaultColor());
                }
                if (!sGlobalLegacyVisibilityHandlingEnabled || context.getApplicationInfo().targetSdkVersion < 24) {
                    z = false;
                }
                this.mLegacyVisibilityHandlingEnabled = z;
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            }
        } finally {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        maybeOverrideVisibilityHandling();
    }

    public DraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        this.mMeasureSpec.f35649a = i;
        this.mMeasureSpec.f35650b = i2;
        C13443a.m39491a(this.mMeasureSpec, this.mAspectRatio, getLayoutParams(), getPaddingLeft() + getPaddingRight(), getPaddingTop() + getPaddingBottom());
        super.onMeasure(this.mMeasureSpec.f35649a, this.mMeasureSpec.f35650b);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context);
    }

    public DraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context);
    }
}
