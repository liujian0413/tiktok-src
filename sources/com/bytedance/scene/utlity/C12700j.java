package com.bytedance.scene.utlity;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.bytedance.scene.utlity.j */
public final class C12700j {
    /* renamed from: a */
    public static Drawable m36906a(Context context) {
        if (!(context instanceof Activity)) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(16842836, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                return context.getResources().getDrawable(typedValue.resourceId);
            }
            return new ColorDrawable(typedValue.data);
        }
        throw new IllegalArgumentException("Use Scene Context instead");
    }

    /* renamed from: a */
    public static void m36911a(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    /* renamed from: a */
    public static boolean m36913a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <T> T m36907a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static String m36908a(Context context, int i) {
        try {
            return context.getResources().getResourceName(i);
        } catch (NotFoundException unused) {
            return String.valueOf(i);
        }
    }

    /* renamed from: a */
    public static String m36909a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(str2);
    }

    /* renamed from: a */
    public static void m36912a(Object obj, StringBuilder sb) {
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName == null || simpleName.length() <= 0) {
            simpleName = obj.getClass().getName();
            int lastIndexOf = simpleName.lastIndexOf(46);
            if (lastIndexOf > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
        }
        sb.append(simpleName);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
        sb.append('}');
    }

    /* renamed from: a */
    public static void m36910a(FragmentManager fragmentManager, FragmentTransaction fragmentTransaction, boolean z) {
        if (VERSION.SDK_INT < 24) {
            fragmentTransaction.commitAllowingStateLoss();
            if (z) {
                fragmentManager.executePendingTransactions();
            }
        } else if (z) {
            fragmentTransaction.commitNowAllowingStateLoss();
        } else {
            fragmentTransaction.commitAllowingStateLoss();
        }
    }
}
