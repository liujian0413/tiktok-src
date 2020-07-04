package com.p280ss.android.ugc.aweme.commercialize.utils;

import android.graphics.drawable.Animatable;
import com.facebook.drawee.controller.C13401d;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.as */
public final class C25246as<INFO> implements C13401d<INFO> {

    /* renamed from: a */
    private final C13401d<INFO>[] f66585a;

    public C25246as(C13401d<INFO>... dVarArr) {
        C7573i.m23587b(dVarArr, "listener");
        this.f66585a = dVarArr;
    }

    public final void onRelease(String str) {
        C13401d<INFO>[] dVarArr = this.f66585a;
        if (dVarArr != null) {
            for (C13401d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }
        }
    }

    public final void onFailure(String str, Throwable th) {
        C13401d<INFO>[] dVarArr = this.f66585a;
        if (dVarArr != null) {
            for (C13401d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }
        }
    }

    public final void onIntermediateImageFailed(String str, Throwable th) {
        C13401d<INFO>[] dVarArr = this.f66585a;
        if (dVarArr != null) {
            for (C13401d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }
        }
    }

    public final void onIntermediateImageSet(String str, INFO info) {
        C13401d<INFO>[] dVarArr = this.f66585a;
        if (dVarArr != null) {
            for (C13401d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            }
        }
    }

    public final void onSubmit(String str, Object obj) {
        C13401d<INFO>[] dVarArr = this.f66585a;
        if (dVarArr != null) {
            for (C13401d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }
        }
    }

    public final void onFinalImageSet(String str, INFO info, Animatable animatable) {
        C13401d<INFO>[] dVarArr = this.f66585a;
        if (dVarArr != null) {
            for (C13401d<INFO> dVar : dVarArr) {
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            }
        }
    }
}
