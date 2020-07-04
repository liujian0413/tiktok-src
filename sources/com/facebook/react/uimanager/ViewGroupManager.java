package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.views.view.ReactViewGroup;
import java.util.List;
import java.util.WeakHashMap;

public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, LayoutShadowNode> {
    private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<>();

    public Class<? extends LayoutShadowNode> getShadowNodeClass() {
        return LayoutShadowNode.class;
    }

    public View getUnmarkedChildAt(T t, int i) {
        return null;
    }

    public int getUnmarkedChildCount(T t) {
        return 0;
    }

    public void markView(T t, int i) {
    }

    public boolean needsCustomLayoutForChildren() {
        return false;
    }

    public boolean shouldPromoteGrandchildren() {
        return false;
    }

    public void updateExtraData(T t, Object obj) {
    }

    public LayoutShadowNode createShadowNodeInstance() {
        return new LayoutShadowNode();
    }

    public int getChildCount(T t) {
        return t.getChildCount();
    }

    public static Integer getViewZIndex(View view) {
        return (Integer) mZIndexHash.get(view);
    }

    public void removeAllViews(T t) {
        if (t instanceof ReactViewGroup) {
            for (int unmarkedChildCount = getUnmarkedChildCount(t) - 1; unmarkedChildCount >= 0; unmarkedChildCount--) {
                removeViewAt(t, unmarkedChildCount);
            }
            return;
        }
        for (int childCount = getChildCount(t) - 1; childCount >= 0; childCount--) {
            removeViewAt(t, childCount);
        }
    }

    public void removeViewAt(T t, int i) {
        t.removeViewAt(i);
    }

    public View getChildAt(T t, int i) {
        return t.getChildAt(i);
    }

    public static void setViewZIndex(View view, int i) {
        mZIndexHash.put(view, Integer.valueOf(i));
    }

    public void addViews(T t, List<View> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            addView(t, (View) list.get(i), i);
        }
    }

    public void removeView(T t, View view) {
        int i = 0;
        if (t instanceof ReactViewGroup) {
            while (i < getUnmarkedChildCount(t)) {
                if (getUnmarkedChildAt(t, i) == view) {
                    removeViewAt(t, i);
                } else {
                    i++;
                }
            }
            return;
        }
        while (i < getChildCount(t)) {
            if (getChildAt(t, i) == view) {
                removeViewAt(t, i);
                return;
            }
            i++;
        }
    }

    public void addView(T t, View view, int i) {
        if (t.getChildCount() < i) {
            t.addView(view);
        } else {
            t.addView(view, i);
        }
    }
}
