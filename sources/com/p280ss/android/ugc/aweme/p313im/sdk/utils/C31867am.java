package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.am */
public final class C31867am {
    /* renamed from: a */
    public static void m103552a(Context context, String str) {
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("copy_im_label", str));
    }

    /* renamed from: a */
    public static int[] m103553a(View view, View view2) {
        boolean z;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int height = view.getHeight();
        int b = C9738o.m28709b(view.getContext());
        int a = C9738o.m28691a(view.getContext());
        view2.measure(0, 0);
        int measuredHeight = view2.getMeasuredHeight();
        int measuredWidth = view2.getMeasuredWidth();
        if (b / 2 < iArr2[1]) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            iArr[1] = iArr2[1] - measuredHeight;
        } else {
            iArr[1] = iArr2[1] + height;
        }
        iArr[0] = (a - measuredWidth) / 2;
        return iArr;
    }

    /* renamed from: a */
    public static PopupWindow m103551a(Context context, int i, View view) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.sb, null);
        int b = (int) C9738o.m28708b(context, 100.0f);
        PopupWindow popupWindow = new PopupWindow(inflate, -2, -2, true);
        popupWindow.setWidth(b);
        popupWindow.setAnimationStyle(R.style.gm);
        popupWindow.setBackgroundDrawable(new ColorDrawable(context.getResources().getColor(R.color.fh)));
        popupWindow.setContentView(inflate);
        popupWindow.setTouchable(true);
        return popupWindow;
    }
}
