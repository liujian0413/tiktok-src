package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.drawee.controller.f */
public class C13403f<INFO> implements C13401d<INFO> {

    /* renamed from: a */
    private final List<C13401d<? super INFO>> f35485a = new ArrayList(2);

    /* renamed from: a */
    public final synchronized void mo32765a() {
        this.f35485a.clear();
    }

    /* renamed from: a */
    public final synchronized void mo32766a(C13401d<? super INFO> dVar) {
        this.f35485a.add(dVar);
    }

    /* renamed from: b */
    public final synchronized void mo32767b(C13401d<? super INFO> dVar) {
        int indexOf = this.f35485a.indexOf(dVar);
        if (indexOf != -1) {
            this.f35485a.set(indexOf, null);
        }
    }

    public synchronized void onRelease(String str) {
        int size = this.f35485a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13401d dVar = (C13401d) this.f35485a.get(i);
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onFailure(String str, Throwable th) {
        int size = this.f35485a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13401d dVar = (C13401d) this.f35485a.get(i);
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f35485a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13401d dVar = (C13401d) this.f35485a.get(i);
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f35485a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13401d dVar = (C13401d) this.f35485a.get(i);
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onSubmit(String str, Object obj) {
        int size = this.f35485a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13401d dVar = (C13401d) this.f35485a.get(i);
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            } catch (Exception unused) {
            }
        }
    }

    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        int size = this.f35485a.size();
        for (int i = 0; i < size; i++) {
            try {
                C13401d dVar = (C13401d) this.f35485a.get(i);
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception unused) {
            }
        }
    }
}
