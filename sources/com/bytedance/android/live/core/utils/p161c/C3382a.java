package com.bytedance.android.live.core.utils.p161c;

import android.app.Activity;
import android.app.Dialog;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.utils.C3361af;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.android.live.core.utils.c.a */
public final class C3382a {
    /* renamed from: a */
    private static boolean m12574a() {
        return C3383b.m12586b();
    }

    /* renamed from: a */
    public static void m12569a(Activity activity) {
        if (activity != null) {
            m12577b(activity.getWindow());
        }
    }

    /* renamed from: a */
    private static void m12571a(View view) {
        int a = C3361af.m12532a(view.getContext());
        LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = a;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    private static void m12577b(Window window) {
        if (window != null && VERSION.SDK_INT >= 19 && !m12578b(window, true) && !m12575a(window, true) && VERSION.SDK_INT >= 23) {
            m12580c(window, true);
        }
    }

    /* renamed from: a */
    public static void m12572a(Window window) {
        int i;
        if (window != null) {
            String a = C3383b.m12583a();
            if ("MIUI".equals(a)) {
                i = 1;
            } else if ("FLYME".equals(a)) {
                i = 2;
            } else {
                i = 3;
            }
            m12573a(window, i);
        }
    }

    /* renamed from: c */
    private static boolean m12581c(Window window) {
        if (window == null) {
            return false;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        if ((window.getDecorView().getSystemUiVisibility() & PreloadTask.BYTE_UNIT_NUMBER) == 0 && (attributes.flags & 67108864) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m12570a(Dialog dialog, View view) {
        if (VERSION.SDK_INT >= 23) {
            m12579c(dialog, view);
        } else {
            m12576b(dialog, view);
        }
    }

    /* renamed from: c */
    private static void m12580c(Window window, boolean z) {
        int i;
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            if (z) {
                i = systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT;
            } else {
                i = systemUiVisibility & -8193;
            }
            decorView.setSystemUiVisibility(i);
        }
    }

    /* renamed from: c */
    private static void m12579c(Dialog dialog, View view) {
        if (dialog != null && dialog.getWindow() != null) {
            int a = C3361af.m12532a(dialog.getContext());
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = a;
            view.setLayoutParams(layoutParams);
            m12582d(dialog.getWindow(), true);
        }
    }

    /* renamed from: b */
    private static void m12576b(Dialog dialog, View view) {
        boolean z;
        if (dialog != null && dialog.getWindow() != null) {
            if (m12574a()) {
                if (VERSION.SDK_INT >= 21) {
                    Window window = dialog.getWindow();
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(C3358ac.m12521b((int) R.color.ag7));
                }
                m12577b(dialog.getWindow());
            }
            boolean z2 = false;
            if (dialog.getOwnerActivity() == null || dialog.getOwnerActivity().getWindow() == null) {
                z = false;
            } else {
                z = m12581c(dialog.getOwnerActivity().getWindow());
            }
            if (z || m12581c(dialog.getWindow())) {
                z2 = true;
            }
            if (z2) {
                m12571a(view);
            }
        }
    }

    /* renamed from: d */
    private static void m12582d(Window window, boolean z) {
        int i;
        if (window != null) {
            if (C3383b.m7679d()) {
                int c = C3383b.m12587c();
                if (c > 0 && c < 9) {
                    z = false;
                }
            }
            if (z) {
                m12572a(window);
            } else {
                m12577b(window);
            }
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(201326592);
                int systemUiVisibility = window.getDecorView().getSystemUiVisibility() | PreloadTask.BYTE_UNIT_NUMBER | 256;
                if (z) {
                    i = systemUiVisibility | VideoCacheReadBuffersizeExperiment.DEFAULT;
                } else {
                    i = systemUiVisibility & -8193;
                }
                window.getDecorView().setSystemUiVisibility(i);
                window.addFlags(Integer.MIN_VALUE);
                window.setStatusBarColor(0);
                return;
            }
            if (VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
            }
        }
    }

    /* renamed from: a */
    private static void m12573a(Window window, int i) {
        if (window != null) {
            if (i == 1) {
                m12578b(window, false);
            } else if (i == 2) {
                m12575a(window, false);
            } else {
                if (i == 3) {
                    m12580c(window, false);
                }
            }
        }
    }

    /* renamed from: b */
    private static boolean m12578b(Window window, boolean z) {
        if (window != null) {
            Class cls = window.getClass();
            try {
                Class cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", new Class[]{Integer.TYPE, Integer.TYPE});
                if (z) {
                    method.invoke(window, new Object[]{Integer.valueOf(i), Integer.valueOf(i)});
                } else {
                    method.invoke(window, new Object[]{Integer.valueOf(0), Integer.valueOf(i)});
                }
                if (VERSION.SDK_INT < 23) {
                    return true;
                }
                if (z) {
                    window.getDecorView().setSystemUiVisibility(VideoCacheReadBuffersizeExperiment.DEFAULT);
                    return true;
                }
                window.getDecorView().setSystemUiVisibility(0);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m12575a(Window window, boolean z) {
        int i;
        if (window != null) {
            try {
                WindowManager.LayoutParams attributes = window.getAttributes();
                Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
                Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                int i2 = declaredField.getInt(null);
                int i3 = declaredField2.getInt(attributes);
                if (z) {
                    i = i3 | i2;
                } else {
                    i = (i2 ^ -1) & i3;
                }
                declaredField2.setInt(attributes, i);
                window.setAttributes(attributes);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
