package com.facebook.drawee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import com.facebook.common.internal.C13307g;
import com.facebook.common.internal.C13310j;
import com.facebook.common.util.C13337d;
import com.facebook.drawee.R$styleable;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.p725l.C13783b;
import com.facebook.imagepipeline.request.ImageRequest;

public class SimpleDraweeView extends GenericDraweeView {
    private static C13310j<? extends AbstractDraweeControllerBuilder> sDraweecontrollerbuildersupplier;
    private AbstractDraweeControllerBuilder mControllerBuilder;

    /* access modifiers changed from: protected */
    public AbstractDraweeControllerBuilder getControllerBuilder() {
        return this.mControllerBuilder;
    }

    public static void initialize(C13310j<? extends AbstractDraweeControllerBuilder> jVar) {
        sDraweecontrollerbuildersupplier = jVar;
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
    }

    public SimpleDraweeView(Context context) {
        super(context);
        init(context, null);
    }

    public void setActualImageResource(int i) {
        setActualImageResource(i, null);
    }

    public void setImageURI(Uri uri) {
        setImageURI(uri, (Object) null);
    }

    public void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setVisible(true, false);
        }
    }

    public void setImageURI(String str) {
        setImageURI(str, (Object) null);
    }

    public void setImageRequest(ImageRequest imageRequest) {
        setController(this.mControllerBuilder.mo32748b(imageRequest).mo32729b(getController()).mo32730f());
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public void setActualImageResource(int i, Object obj) {
        setImageURI(C13337d.m39030a(i), obj);
    }

    public void setImageURI(Uri uri, Object obj) {
        setController(this.mControllerBuilder.mo32744a(obj).mo32713b(uri).mo32729b(getController()).mo32730f());
    }

    public void setImageURI(String str, Object obj) {
        Uri uri;
        if (str != null) {
            uri = Uri.parse(str);
        } else {
            uri = null;
        }
        setImageURI(uri, obj);
    }

    public SimpleDraweeView(Context context, C13438a aVar) {
        super(context, aVar);
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("SimpleDraweeView#init");
            }
            if (isInEditMode()) {
                ((C13438a) getHierarchy()).mo32897a((RoundingParams) null);
                getTopLevelDrawable().setVisible(true, false);
                getTopLevelDrawable().invalidateSelf();
            } else {
                C13307g.m38941a(sDraweecontrollerbuildersupplier, (Object) "SimpleDraweeView was not initialized!");
                this.mControllerBuilder = (AbstractDraweeControllerBuilder) sDraweecontrollerbuildersupplier.mo29879b();
            }
            if (attributeSet != null) {
                obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.SimpleDraweeView);
                if (obtainStyledAttributes.hasValue(2)) {
                    setImageURI(Uri.parse(obtainStyledAttributes.getString(2)), (Object) null);
                } else if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                    if (resourceId != -1) {
                        if (isInEditMode()) {
                            setImageResource(resourceId);
                        } else {
                            setActualImageResource(resourceId);
                        }
                    }
                }
                obtainStyledAttributes.recycle();
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
        } catch (Throwable th) {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            throw th;
        }
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }

    public SimpleDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet);
    }
}
