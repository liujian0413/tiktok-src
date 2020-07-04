package android.support.p029v7.widget;

import android.support.p022v4.view.C0991u;
import android.support.p022v4.view.C0995v;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.p1593ar.backgroundvideo.C40413c;

/* renamed from: android.support.v7.widget.ax */
final class C1367ax implements OnAttachStateChangeListener, OnHoverListener, OnLongClickListener {

    /* renamed from: j */
    private static C1367ax f5350j;

    /* renamed from: k */
    private static C1367ax f5351k;

    /* renamed from: a */
    private final View f5352a;

    /* renamed from: b */
    private final CharSequence f5353b;

    /* renamed from: c */
    private final int f5354c;

    /* renamed from: d */
    private final Runnable f5355d = new Runnable() {
        public final void run() {
            C1367ax.this.mo6408a(false);
        }
    };

    /* renamed from: e */
    private final Runnable f5356e = new Runnable() {
        public final void run() {
            C1367ax.this.mo6407a();
        }
    };

    /* renamed from: f */
    private int f5357f;

    /* renamed from: g */
    private int f5358g;

    /* renamed from: h */
    private C1370ay f5359h;

    /* renamed from: i */
    private boolean f5360i;

    public final void onViewAttachedToWindow(View view) {
    }

    /* renamed from: c */
    private void m6768c() {
        this.f5352a.removeCallbacks(this.f5355d);
    }

    /* renamed from: d */
    private void m6769d() {
        this.f5357f = Integer.MAX_VALUE;
        this.f5358g = Integer.MAX_VALUE;
    }

    /* renamed from: b */
    private void m6767b() {
        this.f5352a.postDelayed(this.f5355d, (long) ViewConfiguration.getLongPressTimeout());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6407a() {
        if (f5351k == this) {
            f5351k = null;
            if (this.f5359h != null) {
                this.f5359h.mo6415a();
                this.f5359h = null;
                m6769d();
                this.f5352a.removeOnAttachStateChangeListener(this);
            }
        }
        if (f5350j == this) {
            m6764a((C1367ax) null);
        }
        this.f5352a.removeCallbacks(this.f5356e);
    }

    public final void onViewDetachedFromWindow(View view) {
        mo6407a();
    }

    /* renamed from: a */
    private static void m6764a(C1367ax axVar) {
        if (f5350j != null) {
            f5350j.m6768c();
        }
        f5350j = axVar;
        if (axVar != null) {
            f5350j.m6767b();
        }
    }

    public final boolean onLongClick(View view) {
        this.f5357f = view.getWidth() / 2;
        this.f5358g = view.getHeight() / 2;
        mo6408a(true);
        return true;
    }

    /* renamed from: a */
    private boolean m6766a(MotionEvent motionEvent) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (Math.abs(x - this.f5357f) <= this.f5354c && Math.abs(y - this.f5358g) <= this.f5354c) {
            return false;
        }
        this.f5357f = x;
        this.f5358g = y;
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6408a(boolean z) {
        long j;
        if (C0991u.m4170G(this.f5352a)) {
            m6764a((C1367ax) null);
            if (f5351k != null) {
                f5351k.mo6407a();
            }
            f5351k = this;
            this.f5360i = z;
            this.f5359h = new C1370ay(this.f5352a.getContext());
            this.f5359h.mo6416a(this.f5352a, this.f5357f, this.f5358g, this.f5360i, this.f5353b);
            this.f5352a.addOnAttachStateChangeListener(this);
            if (this.f5360i) {
                j = 2500;
            } else if ((C0991u.m4242u(this.f5352a) & 1) == 1) {
                j = 3000 - ((long) ViewConfiguration.getLongPressTimeout());
            } else {
                j = C40413c.f105051b - ((long) ViewConfiguration.getLongPressTimeout());
            }
            this.f5352a.removeCallbacks(this.f5356e);
            this.f5352a.postDelayed(this.f5356e, j);
        }
    }

    private C1367ax(View view, CharSequence charSequence) {
        this.f5352a = view;
        this.f5353b = charSequence;
        this.f5354c = C0995v.m4259b(ViewConfiguration.get(this.f5352a.getContext()));
        m6769d();
        this.f5352a.setOnLongClickListener(this);
        this.f5352a.setOnHoverListener(this);
    }

    /* renamed from: a */
    public static void m6765a(View view, CharSequence charSequence) {
        if (f5350j != null && f5350j.f5352a == view) {
            m6764a((C1367ax) null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            if (f5351k != null && f5351k.f5352a == view) {
                f5351k.mo6407a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new C1367ax(view, charSequence);
    }

    public final boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f5359h != null && this.f5360i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f5352a.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                m6769d();
                mo6407a();
            }
        } else if (this.f5352a.isEnabled() && this.f5359h == null && m6766a(motionEvent)) {
            m6764a(this);
        }
        return false;
    }
}
