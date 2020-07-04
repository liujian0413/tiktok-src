package com.bytedance.scene.utlity;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.WindowInsets;

/* renamed from: com.bytedance.scene.utlity.d */
public final class C12694d implements OnApplyWindowInsetsListener {
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        WindowInsets windowInsets2 = new WindowInsets(windowInsets);
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            viewGroup.getChildAt(i).dispatchApplyWindowInsets(windowInsets2);
        }
        return windowInsets.consumeSystemWindowInsets();
    }
}
