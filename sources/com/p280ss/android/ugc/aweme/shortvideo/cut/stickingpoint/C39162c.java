package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.C39235c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c */
public final class C39162c {

    /* renamed from: a */
    private C39235c f101531a;

    /* renamed from: b */
    private Activity f101532b;

    /* renamed from: b */
    public final void mo97445b() {
        if (this.f101531a != null) {
            C39235c cVar = this.f101531a;
            if (cVar == null) {
                C7573i.m23580a();
            }
            if (cVar.isShowing()) {
                C39235c cVar2 = this.f101531a;
                if (cVar2 == null) {
                    C7573i.m23580a();
                }
                cVar2.dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo97443a() {
        if (this.f101532b != null) {
            Activity activity = this.f101532b;
            if (activity == null) {
                C7573i.m23580a();
            }
            if (!activity.isFinishing()) {
                if (this.f101531a == null) {
                    Activity activity2 = this.f101532b;
                    if (activity2 == null) {
                        C7573i.m23580a();
                    }
                    this.f101531a = new C39235c(activity2);
                }
                C39235c cVar = this.f101531a;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                if (!cVar.isShowing() && this.f101532b != null) {
                    Activity activity3 = this.f101532b;
                    if (activity3 == null) {
                        C7573i.m23580a();
                    }
                    if (!activity3.isFinishing()) {
                        try {
                            C39235c cVar2 = this.f101531a;
                            if (cVar2 == null) {
                                C7573i.m23580a();
                            }
                            cVar2.show();
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo97444a(Context context) {
        if (context != null) {
            this.f101532b = (Activity) context;
            if (this.f101532b != null) {
                Activity activity = this.f101532b;
                if (activity == null) {
                    C7573i.m23580a();
                }
                this.f101531a = new C39235c(activity);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }
}
