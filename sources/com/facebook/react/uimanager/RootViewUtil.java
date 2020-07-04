package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewParent;
import com.facebook.infer.p728a.C13854a;

public class RootViewUtil {
    public static RootView getRootView(View view) {
        while (!(view instanceof RootView)) {
            ViewParent parent = view.getParent();
            if (parent == null) {
                return null;
            }
            C13854a.m40914a(parent instanceof View);
            view = (View) parent;
        }
        return (RootView) view;
    }
}
