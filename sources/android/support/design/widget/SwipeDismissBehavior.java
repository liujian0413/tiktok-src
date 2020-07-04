package android.support.design.widget;

import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p022v4.view.C0991u;
import android.support.p022v4.widget.C1060q;
import android.support.p022v4.widget.C1060q.C1063a;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    C1060q f1494a;

    /* renamed from: b */
    public C0366a f1495b;

    /* renamed from: c */
    public int f1496c = 2;

    /* renamed from: d */
    float f1497d = 0.5f;

    /* renamed from: e */
    float f1498e;

    /* renamed from: f */
    float f1499f = 0.5f;

    /* renamed from: g */
    private boolean f1500g;

    /* renamed from: h */
    private float f1501h;

    /* renamed from: i */
    private boolean f1502i;

    /* renamed from: j */
    private final C1063a f1503j = new C1063a() {

        /* renamed from: b */
        private int f1505b;

        /* renamed from: c */
        private int f1506c = -1;

        /* renamed from: b */
        public final int mo1578b(View view) {
            return view.getWidth();
        }

        /* renamed from: a */
        public final void mo1364a(int i) {
            if (SwipeDismissBehavior.this.f1495b != null) {
                SwipeDismissBehavior.this.f1495b.mo1302a(i);
            }
        }

        /* renamed from: a */
        public final boolean mo1367a(View view, int i) {
            if (this.f1506c != -1 || !SwipeDismissBehavior.this.mo1308a(view)) {
                return false;
            }
            return true;
        }

        /* renamed from: b */
        public final void mo1579b(View view, int i) {
            this.f1506c = i;
            this.f1505b = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: a */
        private boolean m1597a(View view, float f) {
            boolean z;
            if (f != 0.0f) {
                if (C0991u.m4220h(view) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (SwipeDismissBehavior.this.f1496c == 2) {
                    return true;
                }
                if (SwipeDismissBehavior.this.f1496c == 0) {
                    if (z) {
                        if (f < 0.0f) {
                            return true;
                        }
                        return false;
                    } else if (f > 0.0f) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (SwipeDismissBehavior.this.f1496c != 1) {
                    return false;
                } else {
                    if (z) {
                        if (f > 0.0f) {
                            return true;
                        }
                        return false;
                    } else if (f < 0.0f) {
                        return true;
                    } else {
                        return false;
                    }
                }
            } else {
                int left = view.getLeft() - this.f1505b;
                if (Math.abs(left) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f1497d)) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        public final int mo1363a(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: b */
        public final int mo1368b(View view, int i, int i2) {
            boolean z;
            int i3;
            int i4;
            if (C0991u.m4220h(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            if (SwipeDismissBehavior.this.f1496c == 0) {
                if (z) {
                    i3 = this.f1505b - view.getWidth();
                    i4 = this.f1505b;
                } else {
                    i3 = this.f1505b;
                    i4 = view.getWidth() + this.f1505b;
                }
            } else if (SwipeDismissBehavior.this.f1496c != 1) {
                i3 = this.f1505b - view.getWidth();
                i4 = view.getWidth() + this.f1505b;
            } else if (z) {
                i3 = this.f1505b;
                i4 = view.getWidth() + this.f1505b;
            } else {
                i3 = this.f1505b - view.getWidth();
                i4 = this.f1505b;
            }
            return SwipeDismissBehavior.m1589a(i3, i, i4);
        }

        /* renamed from: a */
        public final void mo1365a(View view, float f, float f2) {
            boolean z;
            int i;
            this.f1506c = -1;
            int width = view.getWidth();
            if (m1597a(view, f)) {
                if (view.getLeft() < this.f1505b) {
                    i = this.f1505b - width;
                } else {
                    i = this.f1505b + width;
                }
                z = true;
            } else {
                i = this.f1505b;
                z = false;
            }
            if (SwipeDismissBehavior.this.f1494a.mo4155a(i, view.getTop())) {
                C0991u.m4190a(view, (Runnable) new C0367b(view, z));
                return;
            }
            if (z && SwipeDismissBehavior.this.f1495b != null) {
                SwipeDismissBehavior.this.f1495b.mo1303a(view);
            }
        }

        /* renamed from: a */
        public final void mo1366a(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f1505b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f1498e);
            float width2 = ((float) this.f1505b) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f1499f);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m1588a(0.0f, 1.0f - SwipeDismissBehavior.m1591b(width, width2, f), 1.0f));
            }
        }
    };

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$a */
    public interface C0366a {
        /* renamed from: a */
        void mo1302a(int i);

        /* renamed from: a */
        void mo1303a(View view);
    }

    /* renamed from: android.support.design.widget.SwipeDismissBehavior$b */
    class C0367b implements Runnable {

        /* renamed from: b */
        private final View f1508b;

        /* renamed from: c */
        private final boolean f1509c;

        public final void run() {
            if (SwipeDismissBehavior.this.f1494a == null || !SwipeDismissBehavior.this.f1494a.mo4158a(true)) {
                if (this.f1509c && SwipeDismissBehavior.this.f1495b != null) {
                    SwipeDismissBehavior.this.f1495b.mo1303a(this.f1508b);
                }
                return;
            }
            C0991u.m4190a(this.f1508b, (Runnable) this);
        }

        C0367b(View view, boolean z) {
            this.f1508b = view;
            this.f1509c = z;
        }
    }

    /* renamed from: b */
    static float m1591b(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: a */
    public boolean mo1308a(View view) {
        return true;
    }

    /* renamed from: b */
    public final void mo1577b(float f) {
        this.f1499f = m1588a(0.0f, 0.6f, 1.0f);
    }

    /* renamed from: a */
    private void m1590a(ViewGroup viewGroup) {
        C1060q qVar;
        if (this.f1494a == null) {
            if (this.f1502i) {
                qVar = C1060q.m4590a(viewGroup, this.f1501h, this.f1503j);
            } else {
                qVar = C1060q.m4591a(viewGroup, this.f1503j);
            }
            this.f1494a = qVar;
        }
    }

    /* renamed from: a */
    public final void mo1576a(float f) {
        this.f1498e = m1588a(0.0f, 0.1f, 1.0f);
    }

    /* renamed from: a */
    static float m1588a(float f, float f2, float f3) {
        return Math.min(Math.max(0.0f, f2), 1.0f);
    }

    /* renamed from: a */
    static int m1589a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: b */
    public boolean mo1309b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f1500g;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 3) {
            switch (actionMasked) {
                case 0:
                    this.f1500g = coordinatorLayout.mo1398a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
                    z = this.f1500g;
                    break;
                case 1:
                    break;
            }
        }
        this.f1500g = false;
        if (!z) {
            return false;
        }
        m1590a((ViewGroup) coordinatorLayout);
        return this.f1494a.mo4156a(motionEvent);
    }

    /* renamed from: a */
    public final boolean mo1219a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (this.f1494a == null) {
            return false;
        }
        this.f1494a.mo4161b(motionEvent);
        return true;
    }
}
