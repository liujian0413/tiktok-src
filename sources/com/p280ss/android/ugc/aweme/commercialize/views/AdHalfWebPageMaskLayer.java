package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer */
public final class AdHalfWebPageMaskLayer extends FrameLayout implements OnTouchListener {

    /* renamed from: b */
    public static final C25415b f66876b = new C25415b(null);

    /* renamed from: a */
    public boolean f66877a;

    /* renamed from: c */
    private C25414a f66878c;

    /* renamed from: d */
    private long f66879d;

    /* renamed from: e */
    private float f66880e;

    /* renamed from: f */
    private float f66881f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$a */
    public interface C25414a {
        /* renamed from: a */
        void mo66017a();

        /* renamed from: a */
        void mo66018a(boolean z);

        /* renamed from: b */
        void mo66019b();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$b */
    public static final class C25415b {
        private C25415b() {
        }

        public /* synthetic */ C25415b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$c */
    static final class C25416c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageMaskLayer f66882a;

        C25416c(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f66882a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f66882a.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer$d */
    static final class C25417d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AdHalfWebPageMaskLayer f66883a;

        C25417d(AdHalfWebPageMaskLayer adHalfWebPageMaskLayer) {
            this.f66883a = adHalfWebPageMaskLayer;
        }

        public final void run() {
            this.f66883a.setVisibility(0);
        }
    }

    public AdHalfWebPageMaskLayer(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final C25414a getCallback() {
        return this.f66878c;
    }

    /* renamed from: b */
    public final void mo66009b() {
        setVisibility(8);
        setAlpha(0.0f);
        this.f66877a = false;
        this.f66878c = null;
    }

    /* renamed from: c */
    public final void mo66010c() {
        if (this.f66877a) {
            C25414a aVar = this.f66878c;
            if (aVar != null) {
                aVar.mo66017a();
            }
        }
    }

    /* renamed from: a */
    public final void mo66008a() {
        animate().alpha(0.8f).withStartAction(new C25417d(this)).setDuration(100).start();
        C25414a aVar = this.f66878c;
        if (aVar != null) {
            aVar.mo66017a();
        }
        this.f66877a = true;
    }

    public final void setCallback(C25414a aVar) {
        this.f66878c = aVar;
    }

    public final void setShowing(boolean z) {
        this.f66877a = z;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        requestDisallowInterceptTouchEvent(true);
        return true;
    }

    public final void dismiss(boolean z) {
        animate().alpha(0.0f).withEndAction(new C25416c(this)).setDuration(100).start();
        C25414a aVar = this.f66878c;
        if (aVar != null) {
            aVar.mo66018a(z);
        }
        this.f66877a = false;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C7573i.m23587b(view, "v");
        C7573i.m23587b(motionEvent, "event");
        switch (motionEvent.getAction()) {
            case 0:
                this.f66879d = System.currentTimeMillis();
                this.f66880e = motionEvent.getX();
                this.f66881f = motionEvent.getY();
                break;
            case 1:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (System.currentTimeMillis() - this.f66879d <= 100 && m83588a(this.f66880e, x, this.f66881f, y)) {
                    C25414a aVar = this.f66878c;
                    if (aVar != null) {
                        aVar.mo66019b();
                        break;
                    }
                }
                break;
        }
        return false;
    }

    public AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        setBackgroundColor(-16777216);
        setOnTouchListener(this);
        mo66009b();
    }

    /* renamed from: a */
    private static boolean m83588a(float f, float f2, float f3, float f4) {
        float abs = Math.abs(f - f2);
        float abs2 = Math.abs(f3 - f4);
        if (abs > 50.0f || abs2 > 50.0f) {
            return false;
        }
        return true;
    }

    public /* synthetic */ AdHalfWebPageMaskLayer(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
