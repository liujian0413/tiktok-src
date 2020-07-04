package android.support.p022v4.view;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.view.p028a.C0945c;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: android.support.v4.view.u */
public final class C0991u {

    /* renamed from: a */
    private static final AtomicInteger f3424a = new AtomicInteger(1);

    /* renamed from: b */
    private static Field f3425b;

    /* renamed from: c */
    private static boolean f3426c;

    /* renamed from: d */
    private static Field f3427d;

    /* renamed from: e */
    private static boolean f3428e;

    /* renamed from: f */
    private static WeakHashMap<View, String> f3429f;

    /* renamed from: g */
    private static WeakHashMap<View, C0998y> f3430g = null;

    /* renamed from: h */
    private static Method f3431h;

    /* renamed from: i */
    private static Field f3432i;

    /* renamed from: j */
    private static boolean f3433j = false;

    /* renamed from: k */
    private static ThreadLocal<Rect> f3434k;

    /* renamed from: android.support.v4.view.u$a */
    public interface C0993a {
        /* renamed from: a */
        boolean mo3793a(View view, KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.view.u$b */
    static class C0994b {

        /* renamed from: a */
        private static final ArrayList<WeakReference<View>> f3436a = new ArrayList<>();

        /* renamed from: b */
        private WeakHashMap<View, Boolean> f3437b;

        /* renamed from: c */
        private SparseArray<WeakReference<View>> f3438c;

        /* renamed from: d */
        private WeakReference<KeyEvent> f3439d;

        C0994b() {
        }

        /* renamed from: a */
        private SparseArray<WeakReference<View>> m4250a() {
            if (this.f3438c == null) {
                this.f3438c = new SparseArray<>();
            }
            return this.f3438c;
        }

        /* renamed from: b */
        private void m4252b() {
            if (this.f3437b != null) {
                this.f3437b.clear();
            }
            if (!f3436a.isEmpty()) {
                synchronized (f3436a) {
                    if (this.f3437b == null) {
                        this.f3437b = new WeakHashMap<>();
                    }
                    for (int size = f3436a.size() - 1; size >= 0; size--) {
                        View view = (View) ((WeakReference) f3436a.get(size)).get();
                        if (view == null) {
                            f3436a.remove(size);
                        } else {
                            this.f3437b.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f3437b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        static C0994b m4249a(View view) {
            C0994b bVar = (C0994b) view.getTag(R.id.dgb);
            if (bVar != null) {
                return bVar;
            }
            C0994b bVar2 = new C0994b();
            view.setTag(R.id.dgb, bVar2);
            return bVar2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo3794a(KeyEvent keyEvent) {
            if (this.f3439d != null && this.f3439d.get() == keyEvent) {
                return false;
            }
            this.f3439d = new WeakReference<>(keyEvent);
            WeakReference weakReference = null;
            SparseArray a = m4250a();
            if (keyEvent.getAction() == 1) {
                int indexOfKey = a.indexOfKey(keyEvent.getKeyCode());
                if (indexOfKey >= 0) {
                    weakReference = (WeakReference) a.valueAt(indexOfKey);
                    a.removeAt(indexOfKey);
                }
            }
            if (weakReference == null) {
                weakReference = (WeakReference) a.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && C0991u.m4170G(view)) {
                m4253c(view, keyEvent);
            }
            return true;
        }

        /* renamed from: b */
        private View m4251b(View view, KeyEvent keyEvent) {
            if (this.f3437b == null || !this.f3437b.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View b = m4251b(viewGroup.getChildAt(childCount), keyEvent);
                    if (b != null) {
                        return b;
                    }
                }
            }
            if (m4253c(view, keyEvent)) {
                return view;
            }
            return null;
        }

        /* renamed from: c */
        private static boolean m4253c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.dgc);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((C0993a) arrayList.get(size)).mo3793a(view, keyEvent)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo3795a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                m4252b();
            }
            View b = m4251b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b != null && !KeyEvent.isModifierKey(keyCode)) {
                    m4250a().put(keyCode, new WeakReference(b));
                }
            }
            if (b != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m4195a(View view, int i) {
        return view.canScrollVertically(i);
    }

    /* renamed from: a */
    public static void m4186a(View view, C0945c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.f3298a);
    }

    /* renamed from: a */
    public static void m4187a(View view, C0939a aVar) {
        view.setAccessibilityDelegate(aVar == null ? null : aVar.f3295b);
    }

    /* renamed from: a */
    public static void m4193a(View view, boolean z) {
        if (VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* renamed from: a */
    public static void m4190a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    /* renamed from: a */
    public static void m4191a(View view, Runnable runnable, long j) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j);
        }
    }

    /* renamed from: a */
    public static boolean m4196a(View view, int i, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i, bundle);
        }
        return false;
    }

    /* renamed from: a */
    public static void m4192a(View view, String str) {
        if (VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f3429f == null) {
            f3429f = new WeakHashMap<>();
        }
        f3429f.put(view, str);
    }

    /* renamed from: a */
    public static void m4194a(ViewGroup viewGroup, boolean z) {
        if (f3431h == null) {
            try {
                f3431h = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            f3431h.setAccessible(true);
        }
        try {
            f3431h.invoke(viewGroup, new Object[]{Boolean.valueOf(true)});
        } catch (IllegalAccessException | IllegalArgumentException unused2) {
        } catch (InvocationTargetException unused3) {
        }
    }

    /* renamed from: a */
    public static void m4188a(View view, final C0983o oVar) {
        if (VERSION.SDK_INT >= 21) {
            if (oVar == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new OnApplyWindowInsetsListener() {
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return (WindowInsets) C0954ab.m4063a(oVar.mo1183a(view, C0954ab.m4062a((Object) windowInsets)));
                }
            });
        }
    }

    /* renamed from: a */
    public static void m4185a(View view, Drawable drawable) {
        if (VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    /* renamed from: a */
    public static void m4184a(View view, Rect rect) {
        if (VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    /* renamed from: a */
    public static void m4189a(View view, C0987q qVar) {
        if (VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) (qVar != null ? qVar.f3423a : null));
        }
    }

    /* renamed from: a */
    static boolean m4197a(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0994b.m4249a(view).mo3794a(keyEvent);
    }

    /* renamed from: a */
    private static Rect m4175a() {
        if (f3434k == null) {
            f3434k = new ThreadLocal<>();
        }
        Rect rect = (Rect) f3434k.get();
        if (rect == null) {
            rect = new Rect();
            f3434k.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* renamed from: a */
    public static int m4174a(View view) {
        return view.getOverScrollMode();
    }

    /* renamed from: g */
    public static float m4217g(View view) {
        return view.getAlpha();
    }

    /* renamed from: m */
    public static float m4234m(View view) {
        return view.getTranslationX();
    }

    /* renamed from: n */
    public static float m4235n(View view) {
        return view.getTranslationY();
    }

    /* renamed from: r */
    public static float m4239r(View view) {
        return view.getScaleX();
    }

    /* renamed from: E */
    public static float m4168E(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    /* renamed from: F */
    public static Rect m4169F(View view) {
        if (VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    /* renamed from: H */
    public static boolean m4171H(View view) {
        if (VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    /* renamed from: J */
    private static void m4173J(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* renamed from: b */
    public static int m4198b(View view) {
        if (VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    /* renamed from: e */
    public static void m4212e(View view) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    /* renamed from: f */
    public static int m4214f(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    /* renamed from: h */
    public static int m4220h(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /* renamed from: i */
    public static ViewParent m4223i(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getParentForAccessibility();
        }
        return view.getParent();
    }

    /* renamed from: j */
    public static int m4226j(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    /* renamed from: k */
    public static int m4229k(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingStart();
        }
        return view.getPaddingLeft();
    }

    /* renamed from: l */
    public static int m4232l(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getPaddingEnd();
        }
        return view.getPaddingRight();
    }

    /* renamed from: s */
    public static float m4240s(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    /* renamed from: u */
    public static int m4242u(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    /* renamed from: w */
    public static boolean m4244w(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    /* renamed from: x */
    public static boolean m4245x(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    /* renamed from: y */
    public static boolean m4246y(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    /* renamed from: A */
    public static Mode m4164A(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof C0989s) {
            return ((C0989s) view).getSupportBackgroundTintMode();
        }
        return null;
    }

    /* renamed from: B */
    public static boolean m4165B(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (view instanceof C0979k) {
            return ((C0979k) view).isNestedScrollingEnabled();
        }
        return false;
    }

    /* renamed from: C */
    public static void m4166C(View view) {
        if (VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
            return;
        }
        if (view instanceof C0979k) {
            ((C0979k) view).stopNestedScroll();
        }
    }

    /* renamed from: D */
    public static boolean m4167D(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m4170G(View view) {
        if (VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        if (view.getWindowToken() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m4210d(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    /* renamed from: q */
    public static C0998y m4238q(View view) {
        if (f3430g == null) {
            f3430g = new WeakHashMap<>();
        }
        C0998y yVar = (C0998y) f3430g.get(view);
        if (yVar != null) {
            return yVar;
        }
        C0998y yVar2 = new C0998y(view);
        f3430g.put(view, yVar2);
        return yVar2;
    }

    /* renamed from: t */
    public static String m4241t(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        if (f3429f == null) {
            return null;
        }
        return (String) f3429f.get(view);
    }

    /* renamed from: v */
    public static void m4243v(View view) {
        if (VERSION.SDK_INT >= 20) {
            view.requestApplyInsets();
            return;
        }
        if (VERSION.SDK_INT >= 16) {
            view.requestFitSystemWindows();
        }
    }

    /* renamed from: z */
    public static ColorStateList m4247z(View view) {
        if (VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof C0989s) {
            return ((C0989s) view).getSupportBackgroundTintList();
        }
        return null;
    }

    /* renamed from: I */
    public static Display m4172I(View view) {
        if (VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (m4170G(view)) {
            return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m4207c(View view) {
        if (f3433j) {
            return false;
        }
        if (f3432i == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3432i = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f3433j = true;
                return false;
            }
        }
        try {
            if (f3432i.get(view) != null) {
                return true;
            }
            return false;
        } catch (Throwable unused2) {
            f3433j = true;
            return false;
        }
    }

    /* renamed from: o */
    public static int m4236o(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f3426c) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinWidth");
                f3425b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3426c = true;
        }
        if (f3425b != null) {
            try {
                return ((Integer) f3425b.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: p */
    public static int m4237p(View view) {
        if (VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f3428e) {
            try {
                Field declaredField = View.class.getDeclaredField("mMinHeight");
                f3427d = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f3428e = true;
        }
        if (f3427d != null) {
            try {
                return ((Integer) f3427d.get(view)).intValue();
            } catch (Exception unused2) {
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static void m4177a(View view, float f) {
        view.setTranslationX(f);
    }

    /* renamed from: b */
    public static void m4200b(View view, float f) {
        view.setTranslationY(f);
    }

    /* renamed from: c */
    public static void m4205c(View view, float f) {
        view.setAlpha(f);
    }

    /* renamed from: g */
    public static void m4218g(View view, float f) {
        view.setScaleX(f);
    }

    /* renamed from: h */
    public static void m4221h(View view, float f) {
        view.setScaleY(f);
    }

    /* renamed from: i */
    public static void m4224i(View view, float f) {
        view.setPivotX(f);
    }

    /* renamed from: j */
    public static void m4227j(View view, float f) {
        view.setPivotY(f);
    }

    /* renamed from: b */
    public static void m4203b(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    /* renamed from: d */
    public static void m4208d(View view, float f) {
        view.setRotation(0.0f);
    }

    /* renamed from: e */
    public static void m4213e(View view, float f) {
        view.setRotationX(0.0f);
    }

    /* renamed from: f */
    public static void m4215f(View view, float f) {
        view.setRotationY(0.0f);
    }

    /* renamed from: d */
    public static void m4209d(View view, int i) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayoutDirection(i);
        }
    }

    /* renamed from: g */
    public static void m4219g(View view, int i) {
        if (view instanceof NestedScrollingChild2) {
            ((NestedScrollingChild2) view).mo3524a(1);
        }
    }

    /* renamed from: a */
    public static C0954ab m4176a(View view, C0954ab abVar) {
        if (VERSION.SDK_INT < 21) {
            return abVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0954ab.m4063a(abVar);
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (onApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return C0954ab.m4062a((Object) windowInsets);
    }

    /* renamed from: b */
    public static C0954ab m4199b(View view, C0954ab abVar) {
        if (VERSION.SDK_INT < 21) {
            return abVar;
        }
        WindowInsets windowInsets = (WindowInsets) C0954ab.m4063a(abVar);
        WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(windowInsets);
        if (dispatchApplyWindowInsets != windowInsets) {
            windowInsets = new WindowInsets(dispatchApplyWindowInsets);
        }
        return C0954ab.m4062a((Object) windowInsets);
    }

    /* renamed from: c */
    public static void m4206c(View view, int i) {
        if (VERSION.SDK_INT < 19) {
            if (VERSION.SDK_INT < 16) {
                return;
            }
            if (i == 4) {
                i = 2;
            }
        }
        view.setImportantForAccessibility(i);
    }

    /* renamed from: e */
    public static <T extends View> T m4211e(View view, int i) {
        if (VERSION.SDK_INT >= 28) {
            return view.requireViewById(i);
        }
        T findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    /* renamed from: f */
    public static void m4216f(View view, int i) {
        if (VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i);
        }
    }

    /* renamed from: j */
    private static void m4228j(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            m4173J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4173J((View) parent);
            }
        }
    }

    /* renamed from: k */
    public static void m4230k(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setElevation(f);
        }
    }

    /* renamed from: l */
    public static void m4233l(View view, float f) {
        if (VERSION.SDK_INT >= 21) {
            view.setTranslationZ(0.0f);
        }
    }

    /* renamed from: b */
    public static void m4201b(View view, int i) {
        if (VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(8);
        }
    }

    /* renamed from: k */
    private static void m4231k(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            m4173J(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m4173J((View) parent);
            }
        }
    }

    /* renamed from: h */
    public static void m4222h(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a = m4175a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4228j(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m4228j(view, i);
        }
    }

    /* renamed from: i */
    public static void m4225i(View view, int i) {
        if (VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
        } else if (VERSION.SDK_INT >= 21) {
            Rect a = m4175a();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                a.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !a.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            m4231k(view, i);
            if (z && a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                ((View) parent).invalidate(a);
            }
        } else {
            m4231k(view, i);
        }
    }

    /* renamed from: b */
    static boolean m4204b(View view, KeyEvent keyEvent) {
        if (VERSION.SDK_INT >= 28) {
            return false;
        }
        return C0994b.m4249a(view).mo3795a(view, keyEvent);
    }

    /* renamed from: a */
    public static void m4181a(View view, ColorStateList colorStateList) {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0989s) {
            ((C0989s) view).setSupportBackgroundTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m4182a(View view, Paint paint) {
        if (VERSION.SDK_INT >= 17) {
            view.setLayerPaint(paint);
            return;
        }
        view.setLayerType(view.getLayerType(), paint);
        view.invalidate();
    }

    /* renamed from: a */
    public static void m4183a(View view, Mode mode) {
        boolean z;
        if (VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable background = view.getBackground();
                if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                    z = false;
                } else {
                    z = true;
                }
                if (background != null && z) {
                    if (background.isStateful()) {
                        background.setState(view.getDrawableState());
                    }
                    view.setBackground(background);
                }
            }
        } else if (view instanceof C0989s) {
            ((C0989s) view).setSupportBackgroundTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m4178a(View view, int i, int i2) {
        if (VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* renamed from: a */
    public static void m4180a(View view, int i, Paint paint) {
        view.setLayerType(i, paint);
    }

    /* renamed from: a */
    public static void m4179a(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation(i, i2, i3, i4);
        } else {
            view.postInvalidate(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public static void m4202b(View view, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i, i2, i3, i4);
        } else {
            view.setPadding(i, i2, i3, i4);
        }
    }
}
