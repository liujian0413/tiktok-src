package com.p280ss.android.ugc.aweme.common.widget;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.util.DisplayMetrics;
import android.view.Window;

/* renamed from: com.ss.android.ugc.aweme.common.widget.StatusBarUnchangedBottomSheetDialog */
public class StatusBarUnchangedBottomSheetDialog extends BottomSheetDialog {
    /* renamed from: a */
    private static int m84547a(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int a = m84547a(getOwnerActivity()) - m84548a(getContext());
        Window window = getWindow();
        if (a == 0) {
            a = -1;
        }
        window.setLayout(-1, a);
    }

    /* renamed from: a */
    private static int m84548a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }
}
