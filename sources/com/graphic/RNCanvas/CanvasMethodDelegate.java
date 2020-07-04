package com.graphic.RNCanvas;

import com.facebook.common.p686c.C13286a;
import java.lang.reflect.Method;
import java.util.HashMap;

public class CanvasMethodDelegate {
    private final String TAG = "CanvasMethodDelegate";
    private final HashMap<String, CanvasMethodWrapper> mMethods;
    private final Class mModuleClass;

    private void findMethods() {
        for (Method canvasMethodWrapper : this.mModuleClass.getDeclaredMethods()) {
            CanvasMethodWrapper canvasMethodWrapper2 = new CanvasMethodWrapper(canvasMethodWrapper);
            this.mMethods.put(canvasMethodWrapper2.getName(), canvasMethodWrapper2);
        }
    }

    public CanvasMethodDelegate(Class cls) {
        this.mModuleClass = cls;
        this.mMethods = new HashMap<>();
        findMethods();
    }

    public void invoke(Object obj, String str, Object[] objArr) {
        CanvasMethodWrapper canvasMethodWrapper = (CanvasMethodWrapper) this.mMethods.get(str);
        if (canvasMethodWrapper != null) {
            canvasMethodWrapper.invoke(obj, objArr);
            return;
        }
        StringBuilder sb = new StringBuilder("Could not find method ");
        sb.append(str);
        C13286a.m38860c("CanvasMethodDelegate", sb.toString());
    }
}
