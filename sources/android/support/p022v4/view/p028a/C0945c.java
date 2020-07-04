package android.support.p022v4.view.p028a;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.view.accessibility.AccessibilityNodeInfo.CollectionInfo;
import android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: android.support.v4.view.a.c */
public final class C0945c {

    /* renamed from: a */
    public final AccessibilityNodeInfo f3298a;

    /* renamed from: b */
    public int f3299b = -1;

    /* renamed from: android.support.v4.view.a.c$a */
    public static class C0946a {

        /* renamed from: A */
        public static final C0946a f3300A;

        /* renamed from: B */
        public static final C0946a f3301B;

        /* renamed from: C */
        public static final C0946a f3302C;

        /* renamed from: D */
        public static final C0946a f3303D;

        /* renamed from: E */
        public static final C0946a f3304E;

        /* renamed from: F */
        public static final C0946a f3305F;

        /* renamed from: G */
        public static final C0946a f3306G;

        /* renamed from: a */
        public static final C0946a f3307a = new C0946a(1, null);

        /* renamed from: b */
        public static final C0946a f3308b = new C0946a(2, null);

        /* renamed from: c */
        public static final C0946a f3309c = new C0946a(4, null);

        /* renamed from: d */
        public static final C0946a f3310d = new C0946a(8, null);

        /* renamed from: e */
        public static final C0946a f3311e = new C0946a(16, null);

        /* renamed from: f */
        public static final C0946a f3312f = new C0946a(32, null);

        /* renamed from: g */
        public static final C0946a f3313g = new C0946a(64, null);

        /* renamed from: h */
        public static final C0946a f3314h = new C0946a(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH, null);

        /* renamed from: i */
        public static final C0946a f3315i = new C0946a(256, null);

        /* renamed from: j */
        public static final C0946a f3316j = new C0946a(512, null);

        /* renamed from: k */
        public static final C0946a f3317k = new C0946a(PreloadTask.BYTE_UNIT_NUMBER, null);

        /* renamed from: l */
        public static final C0946a f3318l = new C0946a(2048, null);

        /* renamed from: m */
        public static final C0946a f3319m = new C0946a(4096, null);

        /* renamed from: n */
        public static final C0946a f3320n = new C0946a(VideoCacheReadBuffersizeExperiment.DEFAULT, null);

        /* renamed from: o */
        public static final C0946a f3321o = new C0946a(16384, null);

        /* renamed from: p */
        public static final C0946a f3322p = new C0946a(32768, null);

        /* renamed from: q */
        public static final C0946a f3323q = new C0946a(65536, null);

        /* renamed from: r */
        public static final C0946a f3324r = new C0946a(131072, null);

        /* renamed from: s */
        public static final C0946a f3325s = new C0946a(262144, null);

        /* renamed from: t */
        public static final C0946a f3326t = new C0946a(524288, null);

        /* renamed from: u */
        public static final C0946a f3327u = new C0946a(1048576, null);

        /* renamed from: v */
        public static final C0946a f3328v = new C0946a(2097152, null);

        /* renamed from: w */
        public static final C0946a f3329w;

        /* renamed from: x */
        public static final C0946a f3330x;

        /* renamed from: y */
        public static final C0946a f3331y;

        /* renamed from: z */
        public static final C0946a f3332z;

        /* renamed from: H */
        final Object f3333H;

        static {
            Object obj;
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            Object obj6;
            Object obj7;
            Object obj8;
            Object obj9;
            Object obj10;
            AccessibilityAction accessibilityAction = null;
            if (VERSION.SDK_INT >= 23) {
                obj = AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            } else {
                obj = null;
            }
            f3329w = new C0946a(obj);
            if (VERSION.SDK_INT >= 23) {
                obj2 = AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            } else {
                obj2 = null;
            }
            f3330x = new C0946a(obj2);
            if (VERSION.SDK_INT >= 23) {
                obj3 = AccessibilityAction.ACTION_SCROLL_UP;
            } else {
                obj3 = null;
            }
            f3331y = new C0946a(obj3);
            if (VERSION.SDK_INT >= 23) {
                obj4 = AccessibilityAction.ACTION_SCROLL_LEFT;
            } else {
                obj4 = null;
            }
            f3332z = new C0946a(obj4);
            if (VERSION.SDK_INT >= 23) {
                obj5 = AccessibilityAction.ACTION_SCROLL_DOWN;
            } else {
                obj5 = null;
            }
            f3300A = new C0946a(obj5);
            if (VERSION.SDK_INT >= 23) {
                obj6 = AccessibilityAction.ACTION_SCROLL_RIGHT;
            } else {
                obj6 = null;
            }
            f3301B = new C0946a(obj6);
            if (VERSION.SDK_INT >= 23) {
                obj7 = AccessibilityAction.ACTION_CONTEXT_CLICK;
            } else {
                obj7 = null;
            }
            f3302C = new C0946a(obj7);
            if (VERSION.SDK_INT >= 24) {
                obj8 = AccessibilityAction.ACTION_SET_PROGRESS;
            } else {
                obj8 = null;
            }
            f3303D = new C0946a(obj8);
            if (VERSION.SDK_INT >= 26) {
                obj9 = AccessibilityAction.ACTION_MOVE_WINDOW;
            } else {
                obj9 = null;
            }
            f3304E = new C0946a(obj9);
            if (VERSION.SDK_INT >= 28) {
                obj10 = AccessibilityAction.ACTION_SHOW_TOOLTIP;
            } else {
                obj10 = null;
            }
            f3305F = new C0946a(obj10);
            if (VERSION.SDK_INT >= 28) {
                accessibilityAction = AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            f3306G = new C0946a(accessibilityAction);
        }

        private C0946a(Object obj) {
            this.f3333H = obj;
        }

        private C0946a(int i, CharSequence charSequence) {
            Object obj;
            if (VERSION.SDK_INT >= 21) {
                obj = new AccessibilityAction(i, null);
            } else {
                obj = null;
            }
            this(obj);
        }
    }

    /* renamed from: android.support.v4.view.a.c$b */
    public static class C0947b {

        /* renamed from: a */
        final Object f3334a;

        private C0947b(Object obj) {
            this.f3334a = obj;
        }

        /* renamed from: a */
        public static C0947b m4048a(int i, int i2, boolean z, int i3) {
            if (VERSION.SDK_INT >= 21) {
                return new C0947b(CollectionInfo.obtain(i, i2, z, i3));
            }
            if (VERSION.SDK_INT >= 19) {
                return new C0947b(CollectionInfo.obtain(i, i2, z));
            }
            return new C0947b(null);
        }
    }

    /* renamed from: android.support.v4.view.a.c$c */
    public static class C0948c {

        /* renamed from: a */
        final Object f3335a;

        private C0948c(Object obj) {
            this.f3335a = obj;
        }

        /* renamed from: a */
        public static C0948c m4049a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            if (VERSION.SDK_INT >= 21) {
                return new C0948c(CollectionItemInfo.obtain(i, i2, i3, i4, z, false));
            }
            if (VERSION.SDK_INT >= 19) {
                return new C0948c(CollectionItemInfo.obtain(i, i2, i3, i4, z));
            }
            return new C0948c(null);
        }
    }

    /* renamed from: c */
    private static String m3988c(int i) {
        switch (i) {
            case 1:
                return "ACTION_FOCUS";
            case 2:
                return "ACTION_CLEAR_FOCUS";
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH /*128*/:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case PreloadTask.BYTE_UNIT_NUMBER /*1024*/:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case VideoCacheReadBuffersizeExperiment.DEFAULT /*8192*/:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            default:
                return "ACTION_UNKNOWN";
        }
    }

    /* renamed from: a */
    public final void mo3650a(boolean z) {
        this.f3298a.setCheckable(z);
    }

    /* renamed from: a */
    public final void mo3648a(CharSequence charSequence) {
        this.f3298a.setPackageName(charSequence);
    }

    /* renamed from: a */
    public final void mo3649a(Object obj) {
        if (VERSION.SDK_INT >= 19) {
            this.f3298a.setCollectionInfo(obj == null ? null : (CollectionInfo) ((C0947b) obj).f3334a);
        }
    }

    /* renamed from: u */
    private boolean m3989u() {
        return this.f3298a.isCheckable();
    }

    /* renamed from: b */
    public final int mo3651b() {
        return this.f3298a.getChildCount();
    }

    /* renamed from: c */
    public final int mo3660c() {
        return this.f3298a.getActions();
    }

    /* renamed from: e */
    public final boolean mo3673e() {
        return this.f3298a.isChecked();
    }

    /* renamed from: f */
    public final boolean mo3677f() {
        return this.f3298a.isFocusable();
    }

    /* renamed from: l */
    public final boolean mo3690l() {
        return this.f3298a.isLongClickable();
    }

    /* renamed from: m */
    public final boolean mo3692m() {
        return this.f3298a.isEnabled();
    }

    /* renamed from: n */
    public final boolean mo3694n() {
        return this.f3298a.isPassword();
    }

    /* renamed from: o */
    public final boolean mo3696o() {
        return this.f3298a.isScrollable();
    }

    /* renamed from: p */
    public final CharSequence mo3697p() {
        return this.f3298a.getPackageName();
    }

    /* renamed from: q */
    public final CharSequence mo3698q() {
        return this.f3298a.getClassName();
    }

    /* renamed from: r */
    public final CharSequence mo3699r() {
        return this.f3298a.getText();
    }

    /* renamed from: s */
    public final CharSequence mo3700s() {
        return this.f3298a.getContentDescription();
    }

    /* renamed from: t */
    public final void mo3701t() {
        this.f3298a.recycle();
    }

    /* renamed from: a */
    public static C0945c m3983a() {
        return m3986a(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: v */
    private String m3990v() {
        if (VERSION.SDK_INT >= 18) {
            return this.f3298a.getViewIdResourceName();
        }
        return null;
    }

    /* renamed from: d */
    public final int mo3666d() {
        if (VERSION.SDK_INT >= 16) {
            return this.f3298a.getMovementGranularities();
        }
        return 0;
    }

    /* renamed from: g */
    public final boolean mo3679g() {
        return this.f3298a.isFocused();
    }

    /* renamed from: h */
    public final boolean mo3681h() {
        if (VERSION.SDK_INT >= 16) {
            return this.f3298a.isVisibleToUser();
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3298a == null) {
            return 0;
        }
        return this.f3298a.hashCode();
    }

    /* renamed from: i */
    public final boolean mo3684i() {
        if (VERSION.SDK_INT >= 16) {
            return this.f3298a.isAccessibilityFocused();
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo3686j() {
        return this.f3298a.isSelected();
    }

    /* renamed from: k */
    public final boolean mo3688k() {
        return this.f3298a.isClickable();
    }

    /* renamed from: w */
    private Bundle m3991w() {
        if (VERSION.SDK_INT >= 19) {
            return this.f3298a.getExtras();
        }
        return new Bundle();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        mo3645a(rect);
        StringBuilder sb2 = new StringBuilder("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        mo3661c(rect);
        StringBuilder sb3 = new StringBuilder("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(mo3697p());
        sb.append("; className: ");
        sb.append(mo3698q());
        sb.append("; text: ");
        sb.append(mo3699r());
        sb.append("; contentDescription: ");
        sb.append(mo3700s());
        sb.append("; viewId: ");
        sb.append(m3990v());
        sb.append("; checkable: ");
        sb.append(m3989u());
        sb.append("; checked: ");
        sb.append(mo3673e());
        sb.append("; focusable: ");
        sb.append(mo3677f());
        sb.append("; focused: ");
        sb.append(mo3679g());
        sb.append("; selected: ");
        sb.append(mo3686j());
        sb.append("; clickable: ");
        sb.append(mo3688k());
        sb.append("; longClickable: ");
        sb.append(mo3690l());
        sb.append("; enabled: ");
        sb.append(mo3692m());
        sb.append("; password: ");
        sb.append(mo3694n());
        StringBuilder sb4 = new StringBuilder("; scrollable: ");
        sb4.append(mo3696o());
        sb.append(sb4.toString());
        sb.append("; [");
        int c = mo3660c();
        while (c != 0) {
            int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(c);
            c &= numberOfTrailingZeros ^ -1;
            sb.append(m3988c(numberOfTrailingZeros));
            if (c != 0) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public static C0945c m3986a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C0945c(accessibilityNodeInfo);
    }

    /* renamed from: d */
    public final void mo3667d(Rect rect) {
        this.f3298a.setBoundsInScreen(rect);
    }

    /* renamed from: g */
    public final void mo3678g(boolean z) {
        this.f3298a.setSelected(z);
    }

    /* renamed from: h */
    public final void mo3680h(boolean z) {
        this.f3298a.setClickable(z);
    }

    /* renamed from: i */
    public final void mo3683i(boolean z) {
        this.f3298a.setLongClickable(z);
    }

    /* renamed from: j */
    public final void mo3685j(boolean z) {
        this.f3298a.setEnabled(z);
    }

    /* renamed from: k */
    public final void mo3687k(boolean z) {
        this.f3298a.setScrollable(z);
    }

    private C0945c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f3298a = accessibilityNodeInfo;
    }

    /* renamed from: b */
    public final void mo3652b(int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f3298a.setMovementGranularities(i);
        }
    }

    /* renamed from: c */
    public final void mo3661c(Rect rect) {
        this.f3298a.getBoundsInScreen(rect);
    }

    /* renamed from: e */
    public final void mo3672e(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f3298a.setVisibleToUser(z);
        }
    }

    /* renamed from: f */
    public final void mo3675f(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 21) {
            this.f3298a.setError(charSequence);
        }
    }

    /* renamed from: l */
    public final void mo3689l(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f3298a.setContentInvalid(true);
        }
    }

    /* renamed from: m */
    public final void mo3691m(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f3298a.setCanOpenPopup(true);
        }
    }

    /* renamed from: n */
    public final void mo3693n(boolean z) {
        if (VERSION.SDK_INT >= 19) {
            this.f3298a.setDismissable(z);
        }
    }

    /* renamed from: a */
    public static C0945c m3984a(C0945c cVar) {
        return m3986a(AccessibilityNodeInfo.obtain(cVar.f3298a));
    }

    /* renamed from: b */
    public final void mo3653b(Rect rect) {
        this.f3298a.setBoundsInParent(rect);
    }

    /* renamed from: c */
    public final void mo3662c(View view) {
        this.f3298a.addChild(view);
    }

    /* renamed from: d */
    public final void mo3668d(View view) {
        this.f3298a.setParent(view);
    }

    /* renamed from: e */
    public final void mo3671e(CharSequence charSequence) {
        if (VERSION.SDK_INT >= 26) {
            this.f3298a.setHintText(charSequence);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            this.f3298a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: f */
    public final void mo3676f(boolean z) {
        if (VERSION.SDK_INT >= 16) {
            this.f3298a.setAccessibilityFocused(z);
        }
    }

    /* renamed from: o */
    public final void mo3695o(boolean z) {
        if (VERSION.SDK_INT >= 26) {
            this.f3298a.setShowingHintText(z);
        } else {
            m3987a(4, z);
        }
    }

    /* renamed from: a */
    public static C0945c m3985a(View view) {
        return m3986a(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: b */
    public final void mo3654b(View view) {
        this.f3298a.setSource(view);
    }

    /* renamed from: d */
    public final void mo3669d(CharSequence charSequence) {
        this.f3298a.setContentDescription(charSequence);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0945c cVar = (C0945c) obj;
        if (this.f3298a == null) {
            if (cVar.f3298a != null) {
                return false;
            }
        } else if (!this.f3298a.equals(cVar.f3298a)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo3664c(CharSequence charSequence) {
        this.f3298a.setText(charSequence);
    }

    /* renamed from: d */
    public final void mo3670d(boolean z) {
        this.f3298a.setFocused(z);
    }

    /* renamed from: a */
    public final void mo3644a(int i) {
        this.f3298a.addAction(i);
    }

    /* renamed from: b */
    public final void mo3656b(CharSequence charSequence) {
        this.f3298a.setClassName(charSequence);
    }

    /* renamed from: a */
    public final void mo3645a(Rect rect) {
        this.f3298a.getBoundsInParent(rect);
    }

    /* renamed from: b */
    public final void mo3657b(Object obj) {
        CollectionItemInfo collectionItemInfo;
        if (VERSION.SDK_INT >= 19) {
            AccessibilityNodeInfo accessibilityNodeInfo = this.f3298a;
            if (obj == null) {
                collectionItemInfo = null;
            } else {
                collectionItemInfo = (CollectionItemInfo) ((C0948c) obj).f3335a;
            }
            accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
        }
    }

    /* renamed from: c */
    public final void mo3665c(boolean z) {
        this.f3298a.setFocusable(z);
    }

    /* renamed from: a */
    public final void mo3646a(C0946a aVar) {
        if (VERSION.SDK_INT >= 21) {
            this.f3298a.addAction((AccessibilityAction) aVar.f3333H);
        }
    }

    /* renamed from: b */
    public final void mo3658b(boolean z) {
        this.f3298a.setChecked(z);
    }

    /* renamed from: b */
    public final boolean mo3659b(C0946a aVar) {
        if (VERSION.SDK_INT >= 21) {
            return this.f3298a.removeAction((AccessibilityAction) aVar.f3333H);
        }
        return false;
    }

    /* renamed from: c */
    public final void mo3663c(View view, int i) {
        this.f3299b = -1;
        if (VERSION.SDK_INT >= 16) {
            this.f3298a.setParent(view, -1);
        }
    }

    /* renamed from: a */
    private void m3987a(int i, boolean z) {
        Bundle w = m3991w();
        if (w != null) {
            int i2 = 0;
            int i3 = w.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & -5;
            if (z) {
                i2 = 4;
            }
            w.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i3 | i2);
        }
    }

    /* renamed from: b */
    public final void mo3655b(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f3298a.addChild(view, i);
        }
    }

    /* renamed from: a */
    public final void mo3647a(View view, int i) {
        if (VERSION.SDK_INT >= 16) {
            this.f3298a.setSource(view, i);
        }
    }
}
