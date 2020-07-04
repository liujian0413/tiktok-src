package com.p280ss.android.ugc.aweme.base.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.bef.effectsdk.message.MessageCenter;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.base.p1061e.C23330b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.base.utils.o */
public final class C23487o {

    /* renamed from: a */
    private static OnTouchListener f61964a = C23491q.f61969a;

    /* renamed from: a */
    public static OnTouchListener m77135a() {
        return C23490p.f61968a;
    }

    /* renamed from: a */
    public static void m77140a(View view, int i) {
        if (view != null && view.getVisibility() != i) {
            if (i == 0 && view.getAlpha() < Float.MIN_VALUE) {
                view.setAlpha(1.0f);
            }
            view.setVisibility(i);
        }
    }

    /* renamed from: a */
    public static void m77146a(boolean z, View... viewArr) {
        for (View view : viewArr) {
            if (view != null) {
                view.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* renamed from: a */
    public static boolean m77147a(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: a */
    public static void m77145a(TextView textView, CharSequence charSequence) {
        if (textView != null) {
            if (TextUtils.isEmpty(textView.getText())) {
                if (!TextUtils.isEmpty(charSequence)) {
                    textView.setText(charSequence);
                }
            } else if (!textView.getText().equals(charSequence)) {
                textView.setText(charSequence);
            }
        }
    }

    /* renamed from: a */
    public static void m77139a(RecyclerView recyclerView, C1262a aVar) {
        if (recyclerView.getAdapter() == null || recyclerView.getAdapter() != aVar) {
            recyclerView.setAdapter(aVar);
        } else {
            recyclerView.getAdapter().notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public static void m77141a(View view, OnClickListener onClickListener) {
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: a */
    private static void m77143a(Window window) {
        if (window != null) {
            try {
                window.setFlags(PreloadTask.BYTE_UNIT_NUMBER, PreloadTask.BYTE_UNIT_NUMBER);
                if (VERSION.SDK_INT < 19) {
                    window.getDecorView().setSystemUiVisibility(8);
                    return;
                }
                if (VERSION.SDK_INT >= 19) {
                    window.getDecorView().setSystemUiVisibility(MessageCenter.MSG_CLIENT_TO_SDK_RESTART_GAME);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m77144a(TextView textView, int i) {
        if (textView != null && !TextUtils.isEmpty(textView.getText())) {
            StringBuilder sb = new StringBuilder();
            sb.append(textView.getText().toString());
            sb.append("#");
            String sb2 = sb.toString();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2);
            C23330b bVar = new C23330b(textView.getContext(), R.drawable.akc, 1);
            bVar.f61405a = (int) C9738o.m28708b(textView.getContext(), (float) (m77152b(textView.getContext()) ? -4 : 4));
            spannableStringBuilder.setSpan(bVar, sb2.length() - 1, sb2.length(), 18);
            textView.setText(spannableStringBuilder, BufferType.SPANNABLE);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m77148a(View view, MotionEvent motionEvent) {
        Context context = view.getContext();
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.n);
                    loadAnimation.setFillAfter(true);
                    view.startAnimation(loadAnimation);
                    break;
                case 1:
                    break;
            }
        }
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.o);
        loadAnimation2.setFillAfter(true);
        view.startAnimation(loadAnimation2);
        return false;
    }

    /* renamed from: a */
    public static void m77142a(final View view, final OnGlobalLayoutListener onGlobalLayoutListener) {
        if (view != null) {
            final ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            viewTreeObserver.addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
                public final void onGlobalLayout() {
                    if (!viewTreeObserver.isAlive()) {
                        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                    }
                    onGlobalLayoutListener.onGlobalLayout();
                }
            });
        }
    }

    /* renamed from: a */
    public static Activity m77130a(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: c */
    public static void m77155c(Activity activity) {
        if (VERSION.SDK_INT >= 23) {
            activity.getWindow().getDecorView().setSystemUiVisibility(activity.getWindow().getDecorView().getSystemUiVisibility() | VideoCacheReadBuffersizeExperiment.DEFAULT);
        }
    }

    /* renamed from: e */
    public static Activity m77158e(View view) {
        Context context;
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    /* renamed from: b */
    public static void m77149b(Activity activity) {
        Window window = activity.getWindow();
        if (VERSION.SDK_INT < 21) {
            if (VERSION.SDK_INT >= 19) {
                window.addFlags(67108864);
            }
        } else if (window.getStatusBarColor() != 0) {
            window.clearFlags(67108864);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
        }
    }

    /* renamed from: c */
    public static boolean m77156c(View view) {
        Rect rect = new Rect();
        if (!m77153b(view) || !view.getGlobalVisibleRect(rect) || rect.isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static Rect m77157d(View view) {
        Rect rect = new Rect();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rect.set(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight());
        return rect;
    }

    /* renamed from: b */
    private static boolean m77152b(Context context) {
        if (context == null || VERSION.SDK_INT < 17 || context.getResources().getConfiguration().getLayoutDirection() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m77153b(View view) {
        if (view == null || !C0991u.m4170G(view)) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 1.0E-6f) {
            if (view.getId() != 16908290) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m77136a(Activity activity) {
        if (activity != null) {
            m77143a(activity.getWindow());
        }
    }

    /* renamed from: a */
    public static void m77138a(Dialog dialog) {
        if (dialog != null) {
            m77143a(dialog.getWindow());
        }
    }

    /* renamed from: a */
    private static Drawable m77132a(int i, float[] fArr) {
        return m77133a(i, fArr, -1, 0);
    }

    /* renamed from: a */
    public static int m77129a(Context context, int i) {
        return context.getResources().getDimensionPixelSize(i);
    }

    /* renamed from: b */
    public static void m77150b(View view, int i) {
        if (view.getVisibility() != i) {
            view.setVisibility(i);
        }
    }

    /* renamed from: b */
    public static void m77151b(boolean z, View... viewArr) {
        int i;
        for (int i2 = 0; i2 < 2; i2++) {
            View view = viewArr[i2];
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            m77140a(view, i);
        }
    }

    /* renamed from: a */
    public static Drawable m77131a(int i, float f) {
        return m77132a(i, new float[]{f, f, f, f});
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m77154b(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.setScaleX(0.8f);
                    view.setScaleY(0.8f);
                    break;
                case 1:
                    break;
            }
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(40).start();
        return false;
    }

    /* renamed from: a */
    public static void m77137a(Activity activity, int i) {
        if (VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(i);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            C10994a.m32206a(activity, i);
        }
    }

    /* renamed from: a */
    public static GradientDrawable m77134a(Orientation orientation, int i, int i2) {
        return new GradientDrawable(orientation, new int[]{i, i2});
    }

    /* renamed from: a */
    private static Drawable m77133a(int i, float[] fArr, int i2, int i3) {
        float[] fArr2 = fArr != null ? new float[]{fArr[0], fArr[0], fArr[1], fArr[1], fArr[2], fArr[2], fArr[3], fArr[3]} : new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        C234881 r4 = new GradientDrawable() {
            public final int getOpacity() {
                return -3;
            }
        };
        r4.setColor(i);
        r4.setCornerRadii(fArr2);
        return r4;
    }
}
