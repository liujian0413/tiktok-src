package com.p280ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.p280ss.android.ugc.asve.R$styleable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.recorder.view.a */
public final class C20807a {

    /* renamed from: a */
    public int f56187a;

    /* renamed from: b */
    public int f56188b;

    /* renamed from: c */
    public int f56189c;

    /* renamed from: d */
    private final Context f56190d;

    public C20807a(Context context) {
        C7573i.m23587b(context, "context");
        this.f56190d = context;
    }

    /* renamed from: a */
    public final void mo56322a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = this.f56190d.obtainStyledAttributes(attributeSet, R$styleable.ASCameraView);
            this.f56187a = obtainStyledAttributes.getResourceId(0, 0);
            this.f56188b = obtainStyledAttributes.getResourceId(2, 0);
            this.f56189c = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
    }
}
