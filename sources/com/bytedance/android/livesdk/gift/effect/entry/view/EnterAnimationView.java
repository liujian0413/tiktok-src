package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.gift.C3436f;
import com.bytedance.android.livesdk.gift.effect.entry.p379a.C8002a;
import com.bytedance.android.livesdk.gift.effect.entry.p379a.C8004c;
import com.bytedance.android.livesdk.gift.effect.entry.p379a.C8005d;
import com.bytedance.android.livesdk.gift.effect.entry.p381c.C8010a;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8026a;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8027b;
import com.bytedance.android.livesdk.gift.effect.entry.p383e.C8028c;
import com.bytedance.android.livesdk.message.model.C8510bf;
import com.bytedance.android.livesdk.message.model.C8514bj;

public class EnterAnimationView extends FrameLayout {

    /* renamed from: a */
    private C8010a f21821a;

    /* renamed from: b */
    private C8004c f21822b;

    /* renamed from: c */
    private boolean f21823c;

    /* renamed from: b */
    private void m24619b() {
        this.f21821a.mo20923b();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m24619b();
    }

    /* renamed from: a */
    public final void mo20953a() {
        if (this.f21821a != null) {
            this.f21821a.mo20921a();
        }
    }

    public EnterAnimationView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m24618a(Context context) {
        this.f21821a = new C8010a(context, this);
        this.f21822b = new C8004c();
    }

    public void setChildMarginBottom(int i) {
        if (this.f21821a != null) {
            this.f21821a.f21736c = i;
        }
    }

    public void setUserEventListener(C3436f fVar) {
        if (this.f21821a != null) {
            this.f21821a.f21735b = fVar;
        }
    }

    /* renamed from: a */
    public final void mo20954a(C8026a aVar) {
        if (!this.f21823c) {
            return;
        }
        if (aVar.f21789m != null || aVar.f21787k != -1) {
            this.f21821a.mo20922a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo20955a(C8510bf bfVar) {
        C8027b a = C8002a.m24538a(bfVar);
        if (this.f21823c) {
            this.f21821a.mo20922a((C8026a) a);
        }
    }

    public EnterAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f21823c = z;
    }

    /* renamed from: a */
    public final void mo20956a(C8514bj bjVar, boolean z) {
        C8028c a = C8005d.m24541a(bjVar);
        if (a != null && bjVar.f23390b.getNobleLevelInfo() != null) {
            a.f21799u = z;
            this.f21821a.mo20922a((C8026a) a);
        }
    }

    public EnterAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21823c = true;
        m24618a(context);
    }
}
