package com.p280ss.android.ugc.aweme.p1685ug.guide;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.p280ss.android.ugc.aweme.common.widget.C25755a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout */
public final class SwipeUpGuideStrengthenLayout extends RelativeLayout {

    /* renamed from: a */
    private float f110958a;

    /* renamed from: b */
    private float f110959b;

    /* renamed from: c */
    private C25755a f110960c;

    /* renamed from: d */
    private final float f110961d;

    /* renamed from: e */
    private float f110962e;

    public SwipeUpGuideStrengthenLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final float getDensity() {
        return this.f110961d;
    }

    public final float getDisAmount() {
        return this.f110962e;
    }

    public final float getPreviousY() {
        return this.f110959b;
    }

    public final C25755a getViewPager() {
        return this.f110960c;
    }

    public final float getYDown() {
        return this.f110958a;
    }

    public final void setDisAmount(float f) {
        this.f110962e = f;
    }

    public final void setPreviousY(float f) {
        this.f110959b = f;
    }

    public final void setViewPager(C25755a aVar) {
        this.f110960c = aVar;
    }

    public final void setYDown(float f) {
        this.f110958a = f;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f110958a = motionEvent.getY();
                    this.f110959b = this.f110958a;
                    C25755a aVar = this.f110960c;
                    if (aVar != null) {
                        aVar.mo66758c();
                        break;
                    }
                    break;
                case 1:
                    C25755a aVar2 = this.f110960c;
                    if (aVar2 != null && aVar2.mo66757b()) {
                        C25755a aVar3 = this.f110960c;
                        if (aVar3 != null) {
                            aVar3.mo66762d();
                        }
                    }
                    this.f110958a = 0.0f;
                    this.f110962e = 0.0f;
                    break;
                case 2:
                    float y = motionEvent.getY() - this.f110959b;
                    this.f110959b = motionEvent.getY();
                    if (y < 0.0f || this.f110962e < 0.0f) {
                        C25755a aVar4 = this.f110960c;
                        if (aVar4 != null && !aVar4.mo66757b()) {
                            C25755a aVar5 = this.f110960c;
                            if (aVar5 != null) {
                                aVar5.mo66758c();
                            }
                        }
                        C25755a aVar6 = this.f110960c;
                        if (aVar6 != null) {
                            aVar6.mo66752a(y);
                        }
                        this.f110962e += y;
                        break;
                    }
                case 3:
                    C25755a aVar7 = this.f110960c;
                    if (aVar7 != null && aVar7.mo66757b()) {
                        C25755a aVar8 = this.f110960c;
                        if (aVar8 != null) {
                            aVar8.mo66762d();
                            break;
                        }
                    }
                    break;
            }
        }
        return true;
    }

    public SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        Resources resources = context.getResources();
        C7573i.m23582a((Object) resources, "context.resources");
        this.f110961d = resources.getDisplayMetrics().density;
    }

    public /* synthetic */ SwipeUpGuideStrengthenLayout(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
