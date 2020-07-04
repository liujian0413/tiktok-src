package com.bytedance.scene.p644ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.scene.ui.view.CompatSceneLayout */
public class CompatSceneLayout extends LinearLayout {
    public CompatSceneLayout(Context context) {
        super(context);
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        StatusBarView statusBarView = (StatusBarView) findViewById(R.id.cyz);
        if (statusBarView != null) {
            if (statusBarView.getParent() == this) {
                windowInsets = statusBarView.dispatchApplyWindowInsets(windowInsets);
            } else {
                StringBuilder sb = new StringBuilder("StatusBarView parent must be ");
                sb.append(getClass().getSimpleName());
                throw new IllegalStateException(sb.toString());
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        NavigationBarView navigationBarView = (NavigationBarView) findViewById(R.id.cyx);
        if (navigationBarView != null) {
            if (navigationBarView.getParent() == this) {
                windowInsets = navigationBarView.dispatchApplyWindowInsets(windowInsets);
            } else {
                StringBuilder sb2 = new StringBuilder("NavigationBarView parent must be ");
                sb2.append(getClass().getSimpleName());
                throw new IllegalStateException(sb2.toString());
            }
        }
        if (windowInsets.isConsumed()) {
            return windowInsets;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (!(childAt == statusBarView || childAt == navigationBarView)) {
                windowInsets = childAt.dispatchApplyWindowInsets(windowInsets);
                if (windowInsets.isConsumed()) {
                    break;
                }
            }
        }
        return windowInsets;
    }

    public CompatSceneLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CompatSceneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CompatSceneLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
