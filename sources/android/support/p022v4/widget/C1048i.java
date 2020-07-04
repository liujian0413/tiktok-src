package android.support.p022v4.widget;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: android.support.v4.widget.i */
final class C1048i {

    /* renamed from: android.support.v4.widget.i$a */
    public interface C1049a<T> {
        /* renamed from: a */
        void mo3919a(T t, Rect rect);
    }

    /* renamed from: android.support.v4.widget.i$b */
    public interface C1050b<T, V> {
        /* renamed from: a */
        int mo3920a(T t);

        /* renamed from: a */
        V mo3921a(T t, int i);
    }

    /* renamed from: android.support.v4.widget.i$c */
    static class C1051c<T> implements Comparator<T> {

        /* renamed from: a */
        private final Rect f3653a = new Rect();

        /* renamed from: b */
        private final Rect f3654b = new Rect();

        /* renamed from: c */
        private final boolean f3655c;

        /* renamed from: d */
        private final C1049a<T> f3656d;

        C1051c(boolean z, C1049a<T> aVar) {
            this.f3655c = z;
            this.f3656d = aVar;
        }

        public final int compare(T t, T t2) {
            Rect rect = this.f3653a;
            Rect rect2 = this.f3654b;
            this.f3656d.mo3919a(t, rect);
            this.f3656d.mo3919a(t2, rect2);
            if (rect.top < rect2.top) {
                return -1;
            }
            if (rect.top > rect2.top) {
                return 1;
            }
            if (rect.left < rect2.left) {
                if (this.f3655c) {
                    return 1;
                }
                return -1;
            } else if (rect.left > rect2.left) {
                if (this.f3655c) {
                    return -1;
                }
                return 1;
            } else if (rect.bottom < rect2.bottom) {
                return -1;
            } else {
                if (rect.bottom > rect2.bottom) {
                    return 1;
                }
                if (rect.right < rect2.right) {
                    if (this.f3655c) {
                        return 1;
                    }
                    return -1;
                } else if (rect.right <= rect2.right) {
                    return 0;
                } else {
                    if (this.f3655c) {
                        return -1;
                    }
                    return 1;
                }
            }
        }
    }

    /* renamed from: a */
    private static int m4527a(int i, int i2) {
        return (i * 13 * i) + (i2 * i2);
    }

    /* renamed from: c */
    private static int m4537c(int i, Rect rect, Rect rect2) {
        return Math.max(0, m4538d(i, rect, rect2));
    }

    /* renamed from: e */
    private static int m4539e(int i, Rect rect, Rect rect2) {
        return Math.max(1, m4540f(i, rect, rect2));
    }

    /* renamed from: b */
    private static <T> T m4534b(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = size;
        } else {
            i = arrayList.indexOf(t);
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    /* renamed from: d */
    private static int m4538d(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left - rect2.right;
        }
        if (i == 33) {
            return rect.top - rect2.bottom;
        }
        if (i == 66) {
            return rect2.left - rect.right;
        }
        if (i == 130) {
            return rect2.top - rect.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: f */
    private static int m4540f(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left - rect2.left;
        }
        if (i == 33) {
            return rect.top - rect2.top;
        }
        if (i == 66) {
            return rect2.right - rect.right;
        }
        if (i == 130) {
            return rect2.bottom - rect.bottom;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    /* renamed from: b */
    private static boolean m4535b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if (rect.bottom <= rect2.top) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (rect.right <= rect2.left) {
                    return true;
                } else {
                    return false;
                }
            } else if (rect.top >= rect2.bottom) {
                return true;
            } else {
                return false;
            }
        } else if (rect.left >= rect2.right) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    private static int m4541g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }

    /* renamed from: a */
    private static <T> T m4530a(T t, ArrayList<T> arrayList, boolean z) {
        int i;
        int size = arrayList.size();
        if (t == null) {
            i = -1;
        } else {
            i = arrayList.lastIndexOf(t);
        }
        int i2 = i + 1;
        if (i2 < size) {
            return arrayList.get(i2);
        }
        if (!z || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    /* renamed from: a */
    private static boolean m4531a(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            if (rect2.right < rect.left || rect2.left > rect.right) {
                return false;
            }
            return true;
        }
        if (rect2.bottom < rect.top || rect2.top > rect.bottom) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m4533a(Rect rect, Rect rect2, int i) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    } else if ((rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom) {
                        return true;
                    } else {
                        return false;
                    }
                } else if ((rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right) {
                    return true;
                } else {
                    return false;
                }
            } else if ((rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top) {
                return true;
            } else {
                return false;
            }
        } else if ((rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m4536b(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean a = m4531a(i, rect, rect2);
        if (m4531a(i, rect, rect3) || !a) {
            return false;
        }
        if (m4535b(i, rect, rect3) && i != 17 && i != 66 && m4537c(i, rect, rect2) >= m4539e(i, rect, rect3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m4532a(int i, Rect rect, Rect rect2, Rect rect3) {
        if (!m4533a(rect, rect2, i)) {
            return false;
        }
        if (!m4533a(rect, rect3, i) || m4536b(i, rect, rect2, rect3)) {
            return true;
        }
        if (!m4536b(i, rect, rect3, rect2) && m4527a(m4537c(i, rect, rect2), m4541g(i, rect, rect2)) < m4527a(m4537c(i, rect, rect3), m4541g(i, rect, rect3))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static <L, T> T m4529a(L l, C1050b<L, T> bVar, C1049a<T> aVar, T t, Rect rect, int i) {
        Rect rect2 = new Rect(rect);
        if (i == 17) {
            rect2.offset(rect.width() + 1, 0);
        } else if (i == 33) {
            rect2.offset(0, rect.height() + 1);
        } else if (i == 66) {
            rect2.offset(-(rect.width() + 1), 0);
        } else if (i == 130) {
            rect2.offset(0, -(rect.height() + 1));
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        T t2 = null;
        int a = bVar.mo3920a(l);
        Rect rect3 = new Rect();
        for (int i2 = 0; i2 < a; i2++) {
            T a2 = bVar.mo3921a(l, i2);
            if (a2 != t) {
                aVar.mo3919a(a2, rect3);
                if (m4532a(i, rect, rect3, rect2)) {
                    rect2.set(rect3);
                    t2 = a2;
                }
            }
        }
        return t2;
    }

    /* renamed from: a */
    public static <L, T> T m4528a(L l, C1050b<L, T> bVar, C1049a<T> aVar, T t, int i, boolean z, boolean z2) {
        int a = bVar.mo3920a(l);
        ArrayList arrayList = new ArrayList(a);
        for (int i2 = 0; i2 < a; i2++) {
            arrayList.add(bVar.mo3921a(l, i2));
        }
        Collections.sort(arrayList, new C1051c(z, aVar));
        switch (i) {
            case 1:
                return m4534b(t, arrayList, false);
            case 2:
                return m4530a(t, arrayList, false);
            default:
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
        }
    }
}
