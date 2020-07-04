package com.p280ss.avframework.livestreamv2.interact.render.opengl;

import com.p280ss.avframework.livestreamv2.interact.render.opengl.EglBase.Context;
import javax.microedition.khronos.egl.EGLContext;

/* renamed from: com.ss.avframework.livestreamv2.interact.render.opengl.EglBase$$CC */
public abstract /* synthetic */ class EglBase$$CC {
    public static void $$triggerInterfaceInit() {
    }

    public static EglBase create$$STATIC$$(Context context, int[] iArr) {
        return (!EglBase14.isEGL14Supported() || (context != null && !(context instanceof EglBase14.Context))) ? new EglBase10((EglBase10.Context) context, iArr) : new EglBase14((EglBase14.Context) context, iArr);
    }

    public static EglBase create$$STATIC$$() {
        return create$$STATIC$$(null, EglBase.CONFIG_PLAIN);
    }

    public static EglBase create$$STATIC$$(Context context) {
        return create$$STATIC$$(context, EglBase.CONFIG_PLAIN);
    }

    public static EglBase createEgl10$$STATIC$$(int[] iArr) {
        return new EglBase10(null, iArr);
    }

    public static EglBase createEgl10$$STATIC$$(EGLContext eGLContext, int[] iArr) {
        return new EglBase10(new EglBase10.Context(eGLContext), iArr);
    }

    public static EglBase createEgl14$$STATIC$$(int[] iArr) {
        return new EglBase14(null, iArr);
    }

    public static EglBase createEgl14$$STATIC$$(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14(new EglBase14.Context(eGLContext), iArr);
    }
}
