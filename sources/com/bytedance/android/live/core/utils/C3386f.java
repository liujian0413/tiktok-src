package com.bytedance.android.live.core.utils;

import android.app.Dialog;
import android.widget.TextView;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.live.core.utils.f */
public final class C3386f {
    /* renamed from: a */
    public static void m12598a(Dialog dialog) {
        if (dialog != null) {
            try {
                Field declaredField = dialog.getClass().getDeclaredField("mAlert");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(dialog);
                Field declaredField2 = obj.getClass().getDeclaredField("mTitleView");
                declaredField2.setAccessible(true);
                ((TextView) declaredField2.get(obj)).setSingleLine(false);
            } catch (Exception unused) {
            }
        }
    }
}
