package android.support.p022v4.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.support.p022v4.util.C0905l;
import android.support.p022v4.view.C0939a;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0997x;
import android.support.p022v4.view.p028a.C0945c;
import android.support.p022v4.view.p028a.C0949d;
import android.support.p022v4.view.p028a.C0952e;
import android.support.p022v4.widget.C1048i.C1049a;
import android.support.p022v4.widget.C1048i.C1050b;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.ExploreByTouchHelper */
public abstract class ExploreByTouchHelper extends C0939a {

    /* renamed from: a */
    private static final Rect f3481a = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: m */
    private static final C1049a<C0945c> f3482m = new C1049a<C0945c>() {
        /* renamed from: a */
        private static void m4357a(C0945c cVar, Rect rect) {
            cVar.mo3645a(rect);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo3919a(Object obj, Rect rect) {
            m4357a((C0945c) obj, rect);
        }
    };

    /* renamed from: n */
    private static final C1050b<C0905l<C0945c>, C0945c> f3483n = new C1050b<C0905l<C0945c>, C0945c>() {
        /* renamed from: a */
        private static int m4359a(C0905l<C0945c> lVar) {
            return lVar.mo3435b();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo3920a(Object obj) {
            return m4359a((C0905l) obj);
        }

        /* renamed from: a */
        private static C0945c m4360a(C0905l<C0945c> lVar, int i) {
            return (C0945c) lVar.mo3443e(i);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo3921a(Object obj, int i) {
            return m4360a((C0905l) obj, i);
        }
    };

    /* renamed from: c */
    public int f3484c;

    /* renamed from: d */
    public int f3485d;

    /* renamed from: e */
    public int f3486e;

    /* renamed from: f */
    private final Rect f3487f;

    /* renamed from: g */
    private final Rect f3488g;

    /* renamed from: h */
    private final Rect f3489h;

    /* renamed from: i */
    private final int[] f3490i;

    /* renamed from: j */
    private final AccessibilityManager f3491j;

    /* renamed from: k */
    private final View f3492k;

    /* renamed from: l */
    private C1014a f3493l;

    /* renamed from: android.support.v4.widget.ExploreByTouchHelper$a */
    class C1014a extends C0949d {
        C1014a() {
        }

        /* renamed from: a */
        public final C0945c mo3703a(int i) {
            return C0945c.m3984a(ExploreByTouchHelper.this.mo3917b(i));
        }

        /* renamed from: b */
        public final C0945c mo3705b(int i) {
            int i2;
            if (i == 2) {
                i2 = ExploreByTouchHelper.this.f3484c;
            } else {
                i2 = ExploreByTouchHelper.this.f3485d;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo3703a(i2);
        }

        /* renamed from: a */
        public final boolean mo3704a(int i, int i2, Bundle bundle) {
            return ExploreByTouchHelper.this.mo3918b(i, i2, bundle);
        }
    }

    /* renamed from: c */
    private static int m4332c(int i) {
        switch (i) {
            case 19:
                return 33;
            case 21:
                return 17;
            case 22:
                return 66;
            default:
                return 130;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo921a(float f, float f2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo922a(int i, C0945c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo923a(C0945c cVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo924a(List<Integer> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo925a(int i, int i2, Bundle bundle);

    /* renamed from: a */
    public final boolean mo3916a(MotionEvent motionEvent) {
        if (!this.f3491j.isEnabled() || !this.f3491j.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            switch (action) {
                case 9:
                    break;
                case 10:
                    if (this.f3486e == Integer.MIN_VALUE) {
                        return false;
                    }
                    mo3912a(Integer.MIN_VALUE);
                    return true;
                default:
                    return false;
            }
        }
        int a = mo921a(motionEvent.getX(), motionEvent.getY());
        mo3912a(a);
        if (a != Integer.MIN_VALUE) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3915a(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode != 61) {
            if (keyCode != 66) {
                switch (keyCode) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                        if (!keyEvent.hasNoModifiers()) {
                            return false;
                        }
                        int c = m4332c(keyCode);
                        int repeatCount = keyEvent.getRepeatCount() + 1;
                        boolean z = false;
                        while (i < repeatCount && m4331b(c, (Rect) null)) {
                            i++;
                            z = true;
                        }
                        return z;
                    case 23:
                        break;
                    default:
                        return false;
                }
            }
            if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
                return false;
            }
            m4330b();
            return true;
        } else if (keyEvent.hasNoModifiers()) {
            return m4331b(2, (Rect) null);
        } else {
            if (keyEvent.hasModifiers(1)) {
                return m4331b(1, (Rect) null);
            }
            return false;
        }
    }

    /* renamed from: a */
    public final void mo3913a(boolean z, int i, Rect rect) {
        if (this.f3485d != Integer.MIN_VALUE) {
            m4341i(this.f3485d);
        }
        if (z) {
            m4331b(i, rect);
        }
    }

    /* renamed from: a */
    public final boolean mo3914a(int i, int i2) {
        if (i == Integer.MIN_VALUE || !this.f3491j.isEnabled()) {
            return false;
        }
        ViewParent parent = this.f3492k.getParent();
        if (parent == null) {
            return false;
        }
        return C0997x.m4271a(parent, this.f3492k, m4329b(i, i2));
    }

    /* renamed from: a */
    public final void mo1390a(View view, AccessibilityEvent accessibilityEvent) {
        super.mo1390a(view, accessibilityEvent);
    }

    /* renamed from: a */
    public final void mo1148a(View view, C0945c cVar) {
        super.mo1148a(view, cVar);
        mo923a(cVar);
    }

    /* renamed from: a */
    private C0905l<C0945c> m4325a() {
        ArrayList arrayList = new ArrayList();
        mo924a((List<Integer>) arrayList);
        C0905l<C0945c> lVar = new C0905l<>();
        for (int i = 0; i < arrayList.size(); i++) {
            lVar.mo3437b(i, m4337e(i));
        }
        return lVar;
    }

    /* renamed from: b */
    private boolean m4330b() {
        if (this.f3485d == Integer.MIN_VALUE || !mo925a(this.f3485d, 16, (Bundle) null)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private C0945c m4333c() {
        C0945c a = C0945c.m3985a(this.f3492k);
        C0991u.m4186a(this.f3492k, a);
        ArrayList arrayList = new ArrayList();
        mo924a((List<Integer>) arrayList);
        if (a.mo3651b() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a.mo3655b(this.f3492k, ((Integer) arrayList.get(i)).intValue());
            }
            return a;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: d */
    private AccessibilityEvent m4336d(int i) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i);
        this.f3492k.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    /* renamed from: g */
    private boolean m4339g(int i) {
        if (this.f3484c != i) {
            return false;
        }
        this.f3484c = Integer.MIN_VALUE;
        this.f3492k.invalidate();
        mo3914a(i, 65536);
        return true;
    }

    /* renamed from: i */
    private boolean m4341i(int i) {
        if (this.f3485d != i) {
            return false;
        }
        this.f3485d = Integer.MIN_VALUE;
        mo3914a(i, 8);
        return true;
    }

    /* renamed from: f */
    private boolean m4338f(int i) {
        if (!this.f3491j.isEnabled() || !this.f3491j.isTouchExplorationEnabled() || this.f3484c == i) {
            return false;
        }
        if (this.f3484c != Integer.MIN_VALUE) {
            m4339g(this.f3484c);
        }
        this.f3484c = i;
        this.f3492k.invalidate();
        mo3914a(i, 32768);
        return true;
    }

    /* renamed from: h */
    private boolean m4340h(int i) {
        if ((!this.f3492k.isFocused() && !this.f3492k.requestFocus()) || this.f3485d == i) {
            return false;
        }
        if (this.f3485d != Integer.MIN_VALUE) {
            m4341i(this.f3485d);
        }
        this.f3485d = i;
        mo3914a(i, 8);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0945c mo3917b(int i) {
        if (i == -1) {
            return m4333c();
        }
        return m4337e(i);
    }

    /* renamed from: a */
    private boolean m4328a(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f3492k.getWindowVisibility() != 0) {
            return false;
        }
        ViewParent parent = this.f3492k.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        if (parent != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C0949d mo3629a(View view) {
        if (this.f3493l == null) {
            this.f3493l = new C1014a();
        }
        return this.f3493l;
    }

    /* renamed from: e */
    private C0945c m4337e(int i) {
        boolean z;
        C0945c a = C0945c.m3983a();
        a.mo3685j(true);
        a.mo3665c(true);
        a.mo3656b((CharSequence) "android.view.View");
        a.mo3653b(f3481a);
        a.mo3667d(f3481a);
        a.mo3668d(this.f3492k);
        mo922a(i, a);
        if (a.mo3699r() == null && a.mo3700s() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        a.mo3645a(this.f3488g);
        if (!this.f3488g.equals(f3481a)) {
            int c = a.mo3660c();
            if ((c & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((c & PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH) == 0) {
                a.mo3648a((CharSequence) this.f3492k.getContext().getPackageName());
                a.mo3647a(this.f3492k, i);
                if (this.f3484c == i) {
                    a.mo3676f(true);
                    a.mo3644a((int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
                } else {
                    a.mo3676f(false);
                    a.mo3644a(64);
                }
                if (this.f3485d == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    a.mo3644a(2);
                } else if (a.mo3677f()) {
                    a.mo3644a(1);
                }
                a.mo3670d(z);
                this.f3492k.getLocationOnScreen(this.f3490i);
                a.mo3661c(this.f3487f);
                if (this.f3487f.equals(f3481a)) {
                    a.mo3645a(this.f3487f);
                    if (a.f3299b != -1) {
                        C0945c a2 = C0945c.m3983a();
                        for (int i2 = a.f3299b; i2 != -1; i2 = a2.f3299b) {
                            a2.mo3663c(this.f3492k, -1);
                            a2.mo3653b(f3481a);
                            mo922a(i2, a2);
                            a2.mo3645a(this.f3488g);
                            this.f3487f.offset(this.f3488g.left, this.f3488g.top);
                        }
                        a2.mo3701t();
                    }
                    this.f3487f.offset(this.f3490i[0] - this.f3492k.getScrollX(), this.f3490i[1] - this.f3492k.getScrollY());
                }
                if (this.f3492k.getLocalVisibleRect(this.f3489h)) {
                    this.f3489h.offset(this.f3490i[0] - this.f3492k.getScrollX(), this.f3490i[1] - this.f3492k.getScrollY());
                    if (this.f3487f.intersect(this.f3489h)) {
                        a.mo3667d(this.f3487f);
                        if (m4328a(this.f3487f)) {
                            a.mo3672e(true);
                        }
                    }
                }
                return a;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: a */
    public void mo3912a(int i) {
        if (this.f3486e != i) {
            int i2 = this.f3486e;
            this.f3486e = i;
            mo3914a(i, (int) PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH);
            mo3914a(i2, 256);
        }
    }

    /* renamed from: a */
    private void m4326a(int i, Rect rect) {
        mo3917b(i).mo3645a(rect);
    }

    /* renamed from: a */
    private boolean m4327a(int i, Bundle bundle) {
        return C0991u.m4196a(this.f3492k, i, bundle);
    }

    /* renamed from: b */
    private AccessibilityEvent m4329b(int i, int i2) {
        if (i != -1) {
            return m4334c(i, i2);
        }
        return m4336d(i2);
    }

    /* renamed from: b */
    private boolean m4331b(int i, Rect rect) {
        C0945c cVar;
        C0945c cVar2;
        boolean z;
        C0905l a = m4325a();
        int i2 = this.f3485d;
        int i3 = Integer.MIN_VALUE;
        if (i2 == Integer.MIN_VALUE) {
            cVar = null;
        } else {
            cVar = (C0945c) a.mo3433a(i2);
        }
        C0945c cVar3 = cVar;
        if (i == 17 || i == 33 || i == 66 || i == 130) {
            Rect rect2 = new Rect();
            if (this.f3485d != Integer.MIN_VALUE) {
                m4326a(this.f3485d, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                m4324a(this.f3492k, i, rect2);
            }
            cVar2 = (C0945c) C1048i.m4529a(a, f3483n, f3482m, cVar3, rect2, i);
        } else {
            switch (i) {
                case 1:
                case 2:
                    if (C0991u.m4220h(this.f3492k) == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    cVar2 = (C0945c) C1048i.m4528a(a, f3483n, f3482m, cVar3, i, z, false);
                    break;
                default:
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
        }
        if (cVar2 != null) {
            i3 = a.mo3442d(a.mo3431a(cVar2));
        }
        return m4340h(i3);
    }

    /* renamed from: c */
    private AccessibilityEvent m4334c(int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        C0945c b = mo3917b(i);
        obtain.getText().add(b.mo3699r());
        obtain.setContentDescription(b.mo3700s());
        obtain.setScrollable(b.mo3696o());
        obtain.setPassword(b.mo3694n());
        obtain.setEnabled(b.mo3692m());
        obtain.setChecked(b.mo3673e());
        if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
            obtain.setClassName(b.mo3698q());
            C0952e.m4055a(obtain, this.f3492k, i);
            obtain.setPackageName(this.f3492k.getContext().getPackageName());
            return obtain;
        }
        throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
    }

    /* renamed from: a */
    private static Rect m4324a(View view, int i, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i == 17) {
            rect.set(width, 0, width, height);
        } else if (i == 33) {
            rect.set(0, height, width, height);
        } else if (i == 66) {
            rect.set(-1, 0, -1, height);
        } else if (i == 130) {
            rect.set(0, -1, width, -1);
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return rect;
    }

    /* renamed from: c */
    private boolean m4335c(int i, int i2, Bundle bundle) {
        if (i2 == 64) {
            return m4338f(i);
        }
        if (i2 == 128) {
            return m4339g(i);
        }
        switch (i2) {
            case 1:
                return m4340h(i);
            case 2:
                return m4341i(i);
            default:
                return mo925a(i, i2, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo3918b(int i, int i2, Bundle bundle) {
        if (i != -1) {
            return m4335c(i, i2, bundle);
        }
        return m4327a(i2, bundle);
    }
}
