package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.generic.C13440c;
import com.facebook.imagepipeline.p725l.C13783b;

public class GenericDraweeView extends DraweeView<C13438a> {
    public GenericDraweeView(Context context) {
        super(context);
        inflateHierarchy(context, null);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        inflateHierarchy(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void inflateHierarchy(Context context, AttributeSet attributeSet) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("GenericDraweeView#inflateHierarchy");
        }
        C13439b a = C13440c.m39476a(context, attributeSet);
        setAspectRatio(a.f35629e);
        setHierarchy(a.mo32908a());
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    public GenericDraweeView(Context context, C13438a aVar) {
        super(context);
        setHierarchy(aVar);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        inflateHierarchy(context, attributeSet);
    }

    public GenericDraweeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        inflateHierarchy(context, attributeSet);
    }
}
