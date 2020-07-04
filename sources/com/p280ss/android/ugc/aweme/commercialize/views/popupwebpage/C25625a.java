package com.p280ss.android.ugc.aweme.commercialize.views.popupwebpage;

import android.content.Context;
import android.view.MotionEvent;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.a */
public final class C25625a {

    /* renamed from: j */
    public static final C25626a f67486j = new C25626a(null);

    /* renamed from: a */
    public int f67487a;

    /* renamed from: b */
    public int f67488b;

    /* renamed from: c */
    public int f67489c;

    /* renamed from: d */
    public int f67490d;

    /* renamed from: e */
    public boolean f67491e;

    /* renamed from: f */
    public int f67492f;

    /* renamed from: g */
    public final Context f67493g;

    /* renamed from: h */
    public final AdPopUpWebBottomSheetContainer f67494h;

    /* renamed from: i */
    public int f67495i;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.popupwebpage.a$a */
    public static final class C25626a {
        private C25626a() {
        }

        public /* synthetic */ C25626a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private void m84201a() {
        this.f67487a = 0;
        this.f67488b = 0;
        this.f67491e = false;
    }

    /* renamed from: a */
    public final boolean mo66446a(AwemeRawAd awemeRawAd) {
        int i;
        if (awemeRawAd != null) {
            i = awemeRawAd.getWebviewType();
        } else {
            i = 0;
        }
        if (i == 1 && this.f67495i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo66447b(AwemeRawAd awemeRawAd) {
        int i;
        if (awemeRawAd != null) {
            i = awemeRawAd.getProfileWithWebview();
        } else {
            i = 0;
        }
        if (i == 1 && (this.f67492f == 7 || this.f67492f == 8 || this.f67495i == 3)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo66445a(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        switch (this.f67495i) {
            case 1:
                return;
            case 2:
                this.f67487a = C23482j.m77095a(this.f67493g) - C23482j.m77101d();
                return;
            case 3:
                m84202b(motionEvent);
                break;
        }
    }

    /* renamed from: b */
    private void m84202b(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        if (!this.f67491e) {
            switch (motionEvent.getAction()) {
                case 0:
                    this.f67489c = (int) motionEvent.getX();
                    this.f67490d = (int) motionEvent.getY();
                    return;
                case 1:
                    if (Math.abs(motionEvent.getX() - ((float) this.f67489c)) < 100.0f && Math.abs(motionEvent.getY() - ((float) this.f67490d)) < 100.0f) {
                        this.f67494h.mo1011a();
                        this.f67491e = true;
                        break;
                    }
            }
        }
    }

    /* renamed from: a */
    public final void mo66444a(int i) {
        m84201a();
        this.f67495i = i;
        switch (i) {
            case 1:
                return;
            case 2:
                this.f67487a = C23482j.m77095a(this.f67493g) - C23482j.m77101d();
                return;
            case 3:
                double a = (double) C23482j.m77095a(this.f67493g);
                Double.isNaN(a);
                this.f67487a = (int) (a * 0.7316341829085458d);
                this.f67488b = C23482j.m77095a(this.f67493g) - C23482j.m77101d();
                break;
        }
    }

    private C25625a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(adPopUpWebBottomSheetContainer, "bottomSheetContainer");
        this.f67493g = context;
        this.f67494h = adPopUpWebBottomSheetContainer;
        this.f67495i = i;
        mo66444a(this.f67495i);
    }

    public /* synthetic */ C25625a(Context context, AdPopUpWebBottomSheetContainer adPopUpWebBottomSheetContainer, int i, int i2, C7571f fVar) {
        this(context, adPopUpWebBottomSheetContainer, 2);
    }
}
