package com.bytedance.scene.group;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.scene.C12640l;
import com.bytedance.scene.R$styleable;
import com.bytedance.scene.utlity.C12700j;

public final class ScenePlaceHolderView extends View {

    /* renamed from: a */
    private String f33443a;

    /* renamed from: b */
    private String f33444b;

    /* renamed from: c */
    private Bundle f33445c;

    /* renamed from: d */
    private C12640l f33446d;

    public final Bundle getArguments() {
        return this.f33445c;
    }

    public final C12640l getSceneComponentFactory() {
        return this.f33446d;
    }

    public final String getSceneName() {
        if (!TextUtils.isEmpty(this.f33443a)) {
            return this.f33443a;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView name is empty, invoke setSceneName first");
    }

    public final String getSceneTag() {
        if (!TextUtils.isEmpty(this.f33444b)) {
            return this.f33444b;
        }
        throw new IllegalArgumentException("ScenePlaceHolderView tag is empty, invoke setSceneTag first");
    }

    public final void setArguments(Bundle bundle) {
        this.f33445c = bundle;
    }

    public final void setSceneComponentFactory(C12640l lVar) {
        this.f33446d = lVar;
    }

    public final void setSceneName(String str) {
        this.f33443a = C12700j.m36909a(str, "ScenePlaceHolderView name can't be empty");
    }

    public final void setSceneTag(String str) {
        this.f33444b = C12700j.m36909a(str, "ScenePlaceHolderView tag can't be empty");
    }

    public ScenePlaceHolderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static int m36524a(int i, int i2) {
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i, size);
        }
        if (mode == 0 || mode != 1073741824) {
            return i;
        }
        return size;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(m36524a(getSuggestedMinimumWidth(), i), m36524a(getSuggestedMinimumHeight(), i2));
    }

    /* renamed from: a */
    private void m36525a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.ScenePlaceHolderView, 0, 0);
        try {
            this.f33443a = obtainStyledAttributes.getString(0);
            this.f33444b = obtainStyledAttributes.getString(1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ScenePlaceHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36525a(context, attributeSet);
    }

    public ScenePlaceHolderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m36525a(context, attributeSet);
    }
}
