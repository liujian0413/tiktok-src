package com.bytedance.common.utility;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.AdError;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.common.utility.o */
public final class C9738o {

    /* renamed from: a */
    public static final boolean f26481a;

    /* renamed from: b */
    public static C9740a f26482b = new C9740a();

    /* renamed from: c */
    private static C9741b f26483c;

    /* renamed from: d */
    private static String f26484d = "";

    /* renamed from: e */
    private static int f26485e = -1;

    /* renamed from: com.bytedance.common.utility.o$a */
    public static class C9740a {
    }

    /* renamed from: com.bytedance.common.utility.o$b */
    public interface C9741b {
        /* renamed from: a */
        boolean mo24113a(Context context, int i, CharSequence charSequence, long j, int i2);
    }

    /* renamed from: a */
    public static void m28693a(Context context, int i) {
        C9742p.m28719a(context, i);
    }

    /* renamed from: a */
    private static boolean m28707a(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* renamed from: a */
    public static void m28700a(View view, int i) {
        if (view != null) {
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            int paddingTop = view.getPaddingTop();
            int paddingBottom = view.getPaddingBottom();
            view.setBackgroundResource(i);
            view.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
        }
    }

    /* renamed from: a */
    public static boolean m28706a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    /* renamed from: a */
    public static void m28701a(View view, int i, int i2) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams.width != i || layoutParams.height != i2)) {
                if (i != -3) {
                    layoutParams.width = i;
                }
                if (i2 != -3) {
                    layoutParams.height = i2;
                }
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    public static void m28702a(View view, int i, int i2, int i3, int i4) {
        if (view != null) {
            LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof MarginLayoutParams)) {
                m28703a(view, (MarginLayoutParams) layoutParams, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: a */
    private static void m28703a(View view, MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view != null && marginLayoutParams != null && (marginLayoutParams.leftMargin != i || marginLayoutParams.topMargin != i2 || marginLayoutParams.rightMargin != i3 || marginLayoutParams.bottomMargin != i4)) {
            if (i != -3) {
                marginLayoutParams.leftMargin = i;
            }
            if (i2 != -3) {
                marginLayoutParams.topMargin = i2;
            }
            if (i3 != -3) {
                marginLayoutParams.rightMargin = i3;
            }
            if (i4 != -3) {
                marginLayoutParams.bottomMargin = i4;
            }
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: a */
    public static void m28704a(TextView textView, CharSequence charSequence) {
        if (textView != null && !TextUtils.isEmpty(charSequence)) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m28705a(boolean z, View view, OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
            view.setClickable(true);
        }
    }

    static {
        boolean z;
        if (VERSION.SDK_INT > 19) {
            z = true;
        } else {
            z = false;
        }
        f26481a = z;
    }

    /* renamed from: d */
    public static int m28716d(Context context) {
        if (f26485e == -1 && context != null) {
            f26485e = context.getApplicationContext().getResources().getDisplayMetrics().densityDpi;
        }
        return f26485e;
    }

    /* renamed from: e */
    public static final int m28717e(Context context) {
        int i = 0;
        if (context == null) {
            return 0;
        }
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            i = context.getResources().getDimensionPixelSize(identifier);
        }
        return i;
    }

    /* renamed from: a */
    public static final int m28691a(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.widthPixels;
    }

    /* renamed from: b */
    public static final int m28709b(Context context) {
        if (context == null) {
            return 0;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            return 0;
        }
        return displayMetrics.heightPixels;
    }

    /* renamed from: c */
    public static String m28715c(Context context) {
        if (C6319n.m19593a(f26484d) && context != null) {
            int a = m28691a(context);
            int b = m28709b(context);
            if (a > 0 && b > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(a);
                sb.append("*");
                sb.append(b);
                f26484d = sb.toString();
            }
        }
        return f26484d;
    }

    /* renamed from: b */
    public static boolean m28713b(View view) {
        if (view == null || view.getAnimation() == null) {
            return false;
        }
        view.clearAnimation();
        return true;
    }

    /* renamed from: a */
    public static void m28699a(View view) {
        if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                try {
                    ((ViewGroup) parent).removeView(view);
                } catch (Exception e) {
                    C6312h.m19577a((Throwable) e);
                }
            }
        }
    }

    /* renamed from: a */
    public static float m28690a(Context context, float f) {
        if (context != null) {
            return TypedValue.applyDimension(2, f, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    /* renamed from: b */
    public static float m28708b(Context context, float f) {
        if (context != null) {
            return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
        }
        return 0.0f;
    }

    /* renamed from: c */
    public static int m28714c(Context context, float f) {
        if (context != null) {
            return (int) ((f / context.getResources().getDisplayMetrics().density) + 0.5f);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m28692a(Activity activity, boolean z) {
        if (activity != null && !activity.isFinishing()) {
            activity.setRequestedOrientation(z ^ true ? 1 : 0);
            if (z) {
                activity.getWindow().setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
            } else {
                activity.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
        }
    }

    /* renamed from: b */
    public static final void m28712b(View view, int i) {
        if (view != null && view.getVisibility() != i && m28707a(i)) {
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m28697a(Context context, String str) {
        m28711b(context, 0, str);
    }

    /* renamed from: a */
    public static void m28694a(Context context, int i, int i2) {
        m28711b(context, i, context.getString(i2));
    }

    /* renamed from: b */
    public static void m28710b(Context context, int i, int i2) {
        m28698a(context, context.getString(i), i2);
    }

    /* renamed from: a */
    public static void m28695a(Context context, int i, String str) {
        m28711b(context, (int) R.drawable.bdb, str);
    }

    /* renamed from: b */
    public static void m28711b(Context context, int i, String str) {
        m28696a(context, i, str, 0, 17);
    }

    /* renamed from: a */
    private static void m28698a(Context context, String str, int i) {
        m28696a(context, 0, str, 0, i);
    }

    /* renamed from: a */
    public static void m28696a(Context context, int i, String str, int i2, int i3) {
        if (context != null && !C6319n.m19593a(str)) {
            if (!m28706a()) {
                Handler handler = new Handler(Looper.getMainLooper());
                final Context context2 = context;
                final int i4 = i;
                final String str2 = str;
                final int i5 = i2;
                final int i6 = i3;
                C97391 r2 = new Runnable() {
                    public final void run() {
                        C9738o.m28696a(context2, i4, str2, i5, i6);
                    }
                };
                handler.post(r2);
                return;
            }
            if (f26483c != null) {
                if (f26483c.mo24113a(context, i, str, (long) i2, i3)) {
                    return;
                }
            }
            if (!(context instanceof C9729e)) {
                try {
                    Toast makeText = Toast.makeText(context, str, i2);
                    if (makeText != null) {
                        makeText.setGravity(i3, 0, 0);
                        C9742p.m28720a(makeText);
                    }
                } catch (Exception e) {
                    C6312h.m19577a((Throwable) e);
                }
            } else if (i2 == 1) {
                ((C9729e) context).showCustomLongToast(i, str);
            } else {
                C9729e eVar = (C9729e) context;
                if (i2 == 0) {
                    i2 = AdError.SERVER_ERROR_CODE;
                }
                eVar.showCustomToast(i, str, i2, i3);
            }
        }
    }
}
