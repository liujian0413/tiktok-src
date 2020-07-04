package com.bytedance.scene.p639a;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.view.View;
import com.bytedance.scene.utlity.C12689a;
import com.bytedance.scene.utlity.C12689a.C12690a;
import com.bytedance.scene.utlity.C12691b;
import com.bytedance.scene.utlity.C12691b.C12692a;
import com.bytedance.scene.utlity.C12695e;

/* renamed from: com.bytedance.scene.a.d */
public abstract class C12575d extends C12565c {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Animator mo30835a(C12557a aVar, C12557a aVar2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo30836a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Animator mo30837b(C12557a aVar, C12557a aVar2);

    /* renamed from: a */
    public final void mo30840a(C12557a aVar, C12557a aVar2, Runnable runnable, C12691b bVar) {
        final C12690a aVar3;
        final C12690a aVar4;
        C12557a aVar5 = aVar;
        C12557a aVar6 = aVar2;
        View view = aVar5.f33331b;
        View view2 = aVar6.f33331b;
        if (aVar5.f33333d) {
            aVar3 = C12689a.m36891b(view);
        } else {
            C12689a.m36889a(view);
            aVar3 = null;
        }
        if (aVar6.f33333d) {
            aVar4 = C12689a.m36891b(view2);
        } else {
            C12689a.m36889a(view2);
            aVar4 = null;
        }
        view.setVisibility(0);
        final float s = C0991u.m4240s(view);
        if (s > 0.0f) {
            C0991u.m4230k(view, 0.0f);
        }
        final Animator a = mo30835a(aVar, aVar2);
        if (!mo30836a()) {
            a.setDuration(300);
        }
        final C12557a aVar7 = aVar2;
        final View view3 = view;
        final C12557a aVar8 = aVar;
        final View view4 = view2;
        final Runnable runnable2 = runnable;
        C125761 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (!aVar7.f33333d) {
                    view3.setVisibility(8);
                }
                if (s > 0.0f) {
                    C0991u.m4230k(view3, s);
                }
                if (aVar8.f33333d) {
                    C12689a.m36890a(view3, aVar3);
                } else {
                    C12689a.m36889a(view3);
                }
                if (aVar7.f33333d) {
                    C12689a.m36890a(view4, aVar4);
                } else {
                    C12689a.m36889a(view4);
                }
                runnable2.run();
            }
        };
        a.addListener(r0);
        a.addListener(new C12695e(view));
        a.addListener(new C12695e(view2));
        a.start();
        bVar.mo31147a(new C12692a() {
            /* renamed from: a */
            public final void mo30845a() {
                a.end();
            }
        });
    }

    /* renamed from: b */
    public final void mo30842b(C12557a aVar, C12557a aVar2, Runnable runnable, C12691b bVar) {
        final C12690a aVar3;
        final C12690a aVar4;
        C12557a aVar5 = aVar;
        C12557a aVar6 = aVar2;
        View view = aVar5.f33331b;
        View view2 = aVar6.f33331b;
        if (aVar5.f33333d) {
            aVar3 = C12689a.m36891b(view);
        } else {
            C12689a.m36889a(view);
            aVar3 = null;
        }
        if (aVar6.f33333d) {
            aVar4 = C12689a.m36891b(view2);
        } else {
            C12689a.m36889a(view2);
            aVar4 = null;
        }
        view.setVisibility(0);
        if (VERSION.SDK_INT >= 18) {
            this.f33340a.getOverlay().add(view);
        } else {
            this.f33340a.addView(view);
        }
        final Animator b = mo30837b(aVar, aVar2);
        if (!mo30836a()) {
            b.setDuration(300);
        }
        final C12557a aVar7 = aVar;
        final View view3 = view;
        final C12557a aVar8 = aVar2;
        final View view4 = view2;
        final Runnable runnable2 = runnable;
        C125783 r0 = new AnimatorListenerAdapter() {
            public final void onAnimationStart(Animator animator) {
                super.onAnimationStart(animator);
            }

            public final void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (aVar7.f33333d) {
                    C12689a.m36890a(view3, aVar3);
                } else {
                    C12689a.m36889a(view3);
                }
                if (aVar8.f33333d) {
                    C12689a.m36890a(view4, aVar4);
                } else {
                    C12689a.m36889a(view4);
                }
                if (VERSION.SDK_INT >= 18) {
                    C12575d.this.f33340a.getOverlay().remove(view3);
                } else {
                    C12575d.this.f33340a.removeView(view3);
                }
                runnable2.run();
            }
        };
        b.addListener(r0);
        b.addListener(new C12695e(view));
        b.addListener(new C12695e(view2));
        b.start();
        bVar.mo31147a(new C12692a() {
            /* renamed from: a */
            public final void mo30845a() {
                b.end();
            }
        });
    }
}
