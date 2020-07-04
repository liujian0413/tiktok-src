package com.bytedance.scene.p639a;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.bytedance.scene.State;
import com.bytedance.scene.navigation.C12648d;
import com.bytedance.scene.utlity.C12691b;
import com.bytedance.scene.utlity.C12691b.C12692a;
import com.bytedance.scene.utlity.C12693c;
import com.bytedance.scene.utlity.C12700j;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.scene.a.c */
public abstract class C12565c {

    /* renamed from: a */
    public ViewGroup f33340a;

    /* renamed from: a */
    public abstract void mo30840a(C12557a aVar, C12557a aVar2, Runnable runnable, C12691b bVar);

    /* renamed from: b */
    public abstract void mo30842b(C12557a aVar, C12557a aVar2, Runnable runnable, C12691b bVar);

    /* renamed from: a */
    private static void m36474a(final View view, C12691b bVar, final Runnable runnable) {
        if (view == view.getRootView()) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            viewTreeObserver.addOnPreDrawListener(new OnPreDrawListener() {
                public final boolean onPreDraw() {
                    if (atomicBoolean.get()) {
                        return false;
                    }
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnPreDrawListener(this);
                    } else {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                    }
                    return true;
                }
            });
            C125738 r7 = new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeGlobalOnLayoutListener(this);
                    } else {
                        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                    }
                    atomicBoolean.set(false);
                    runnable.run();
                }
            };
            final ViewTreeObserver viewTreeObserver2 = viewTreeObserver;
            final C125738 r3 = r7;
            final View view2 = view;
            final Runnable runnable2 = runnable;
            C125749 r1 = new C12692a() {
                /* renamed from: a */
                public final void mo30845a() {
                    if (viewTreeObserver2.isAlive()) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(r3);
                    } else {
                        view2.getViewTreeObserver().removeGlobalOnLayoutListener(r3);
                    }
                    atomicBoolean.set(false);
                    runnable2.run();
                }
            };
            bVar.mo31147a(r1);
            viewTreeObserver.addOnGlobalLayoutListener(r7);
            return;
        }
        throw new IllegalArgumentException("Need View.getRootView()");
    }

    /* renamed from: b */
    public final void mo30843b(C12648d dVar, View view, C12557a aVar, C12557a aVar2, C12693c cVar, Runnable runnable) {
        boolean z;
        boolean z2;
        final C12648d dVar2 = dVar;
        C12557a aVar3 = aVar;
        C12557a aVar4 = aVar2;
        dVar2.mo31066a(true);
        final Runnable runnable2 = runnable;
        final C125694 r7 = new Runnable() {
            public final void run() {
                dVar2.mo31066a(false);
                runnable2.run();
            }
        };
        cVar.mo31147a(new C12692a() {
            /* renamed from: a */
            public final void mo30845a() {
                r7.run();
            }
        });
        View view2 = aVar3.f33331b;
        View view3 = aVar4.f33331b;
        if (view2.getWidth() == 0 || view2.getHeight() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (view3.getWidth() == 0 || view3.getHeight() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            C12691b c = cVar.mo31150c();
            final boolean z3 = z;
            final View view4 = view2;
            C125716 r12 = r0;
            final C12691b bVar = c;
            final C12557a aVar5 = aVar;
            final C12557a aVar6 = aVar2;
            final C12693c cVar2 = cVar;
            C125716 r0 = new Runnable() {
                public final void run() {
                    if (!z3) {
                        C12700j.m36911a(view4);
                        view4.setVisibility(8);
                    }
                    if (!bVar.mo31148a()) {
                        C12565c.this.mo30842b(aVar5, aVar6, r7, cVar2.mo31150c());
                    }
                }
            };
            m36474a(view, c, r12);
            if (!z) {
                this.f33340a.addView(view2);
                view2.setVisibility(0);
                view2.requestLayout();
            }
            if (!z2) {
                view3.requestLayout();
            }
            return;
        }
        mo30842b(aVar3, aVar4, r7, cVar.mo31150c());
    }

    /* renamed from: a */
    public final void mo30841a(C12648d dVar, View view, C12557a aVar, C12557a aVar2, C12693c cVar, Runnable runnable) {
        boolean z;
        boolean z2;
        C12557a aVar3 = aVar;
        C12557a aVar4 = aVar2;
        dVar.mo31066a(true);
        View view2 = aVar3.f33331b;
        View view3 = aVar4.f33331b;
        if (aVar3.f33332c.value < State.VIEW_CREATED.value) {
            if (VERSION.SDK_INT >= 18) {
                this.f33340a.getOverlay().add(view2);
            } else {
                this.f33340a.addView(view2);
            }
        }
        final C12648d dVar2 = dVar;
        final C12557a aVar5 = aVar;
        final View view4 = view2;
        final Runnable runnable2 = runnable;
        final C125661 r0 = new Runnable() {
            public final void run() {
                dVar2.mo31066a(false);
                if (aVar5.f33332c.value < State.VIEW_CREATED.value) {
                    if (VERSION.SDK_INT >= 18) {
                        C12565c.this.f33340a.getOverlay().remove(view4);
                    } else {
                        C12565c.this.f33340a.removeView(view4);
                    }
                }
                runnable2.run();
            }
        };
        cVar.mo31147a(new C12692a() {
            /* renamed from: a */
            public final void mo30845a() {
                r0.run();
            }
        });
        if (view2.getWidth() == 0 || view2.getHeight() == 0) {
            z = false;
        } else {
            z = true;
        }
        if (view3.getWidth() == 0 || view3.getHeight() == 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            C12691b c = cVar.mo31150c();
            final boolean z3 = z;
            final View view5 = view2;
            final C12691b bVar = c;
            C125683 r14 = r0;
            final C12557a aVar6 = aVar;
            final C12557a aVar7 = aVar2;
            final C125661 r7 = r0;
            C12691b bVar2 = c;
            final C12693c cVar2 = cVar;
            C125683 r02 = new Runnable() {
                public final void run() {
                    if (!z3) {
                        view5.setVisibility(8);
                    }
                    if (!bVar.mo31148a()) {
                        C12565c.this.mo30840a(aVar6, aVar7, r7, cVar2.mo31150c());
                    }
                }
            };
            m36474a(view, bVar2, r14);
            if (!z) {
                view2.setVisibility(0);
                view2.requestLayout();
            }
            if (!z2) {
                view3.requestLayout();
            }
            return;
        }
        mo30840a(aVar3, aVar4, r0, cVar.mo31150c());
    }
}
