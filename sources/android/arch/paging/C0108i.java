package android.arch.paging;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.arch.paging.i */
final class C0108i<T> extends AbstractList<T> {

    /* renamed from: g */
    private static final List f227g = new ArrayList();

    /* renamed from: a */
    public int f228a;

    /* renamed from: b */
    public int f229b;

    /* renamed from: c */
    public int f230c;

    /* renamed from: d */
    public int f231d;

    /* renamed from: e */
    public int f232e;

    /* renamed from: f */
    public int f233f;

    /* renamed from: h */
    private final ArrayList<List<T>> f234h;

    /* renamed from: i */
    private int f235i;

    /* renamed from: android.arch.paging.i$a */
    interface C0109a {
        /* renamed from: a */
        void mo170a(int i, int i2);

        /* renamed from: a */
        void mo171a(int i, int i2, int i3);

        /* renamed from: b */
        void mo175b(int i);

        /* renamed from: b */
        void mo176b(int i, int i2, int i3);

        /* renamed from: c */
        void mo178c(int i);
    }

    /* renamed from: g */
    private boolean m261g() {
        if (this.f235i > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0108i<T> mo232a() {
        return new C0108i<>(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo239b() {
        return this.f234h.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final T mo243e() {
        return ((List) this.f234h.get(0)).get(0);
    }

    public final int size() {
        return this.f228a + this.f231d + this.f229b;
    }

    C0108i() {
        this.f234h = new ArrayList<>();
        this.f229b = 0;
        this.f230c = 0;
        this.f231d = 0;
        this.f235i = 1;
        this.f232e = 0;
        this.f233f = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo241c() {
        int i = this.f228a;
        int size = this.f234h.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.f234h.get(i2);
            if (list != null && list != f227g) {
                break;
            }
            i += this.f235i;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final T mo244f() {
        List list = (List) this.f234h.get(this.f234h.size() - 1);
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo242d() {
        int i = this.f229b;
        for (int size = this.f234h.size() - 1; size >= 0; size--) {
            List list = (List) this.f234h.get(size);
            if (list != null && list != f227g) {
                break;
            }
            i += this.f235i;
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("leading ");
        sb.append(this.f228a);
        sb.append(", storage ");
        sb.append(this.f231d);
        sb.append(", trailing ");
        sb.append(this.f229b);
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i = 0; i < this.f234h.size(); i++) {
            sb2.append(" ");
            sb2.append(this.f234h.get(i));
        }
        return sb2.toString();
    }

    private C0108i(C0108i<T> iVar) {
        this.f228a = iVar.f228a;
        this.f234h = new ArrayList<>(iVar.f234h);
        this.f229b = iVar.f229b;
        this.f230c = iVar.f230c;
        this.f231d = iVar.f231d;
        this.f235i = iVar.f235i;
        this.f232e = iVar.f232e;
        this.f233f = iVar.f233f;
    }

    public final T get(int i) {
        int i2;
        if (i < 0 || i >= size()) {
            StringBuilder sb = new StringBuilder("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i3 = i - this.f228a;
        if (i3 < 0 || i3 >= this.f231d) {
            return null;
        }
        if (m261g()) {
            i2 = i3 / this.f235i;
            i3 %= this.f235i;
        } else {
            int size = this.f234h.size();
            int i4 = 0;
            while (i4 < size) {
                int size2 = ((List) this.f234h.get(i4)).size();
                if (size2 > i3) {
                    break;
                }
                i3 -= size2;
                i4++;
            }
            i2 = i4;
        }
        List list = (List) this.f234h.get(i2);
        if (list == null || list.size() == 0) {
            return null;
        }
        return list.get(i3);
    }

    /* renamed from: b */
    private void m260b(int i, int i2) {
        int i3;
        int i4 = this.f228a / this.f235i;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                this.f234h.add(0, null);
                i5++;
            }
            int i6 = i3 * this.f235i;
            this.f231d += i6;
            this.f228a -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.f234h.size() + i) {
            int min = Math.min(this.f229b, ((i2 + 1) - (this.f234h.size() + i)) * this.f235i);
            for (int size = this.f234h.size(); size <= i2 - i; size++) {
                this.f234h.add(this.f234h.size(), null);
            }
            this.f231d += min;
            this.f229b -= min;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo240b(List<T> list, C0109a aVar) {
        int size = list.size();
        if (size != 0) {
            if (this.f235i > 0 && (((List) this.f234h.get(this.f234h.size() - 1)).size() != this.f235i || size > this.f235i)) {
                this.f235i = -1;
            }
            this.f234h.add(list);
            this.f231d += size;
            int min = Math.min(this.f229b, size);
            int i = size - min;
            if (min != 0) {
                this.f229b -= min;
            }
            this.f233f += size;
            aVar.mo176b((this.f228a + this.f231d) - size, min, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo237a(List<T> list, C0109a aVar) {
        int size = list.size();
        if (size != 0) {
            if (this.f235i > 0 && size != this.f235i) {
                if (this.f234h.size() != 1 || size <= this.f235i) {
                    this.f235i = -1;
                } else {
                    this.f235i = size;
                }
            }
            this.f234h.add(0, list);
            this.f231d += size;
            int min = Math.min(this.f228a, size);
            int i = size - min;
            if (min != 0) {
                this.f228a -= min;
            }
            this.f230c -= i;
            this.f232e += size;
            aVar.mo171a(this.f228a, min, i);
        }
    }

    /* renamed from: a */
    public final boolean mo238a(int i, int i2) {
        int i3 = this.f228a / i;
        boolean z = false;
        if (i2 < i3 || i2 >= this.f234h.size() + i3) {
            return false;
        }
        List list = (List) this.f234h.get(i2 - i3);
        if (!(list == null || list == f227g)) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo236a(int i, List<T> list, C0109a aVar) {
        boolean z;
        int size = list.size();
        if (size != this.f235i) {
            int size2 = size();
            boolean z2 = false;
            if (i != size2 - (size2 % this.f235i) || size >= this.f235i) {
                z = false;
            } else {
                z = true;
            }
            if (this.f229b == 0 && this.f234h.size() == 1 && size > this.f235i) {
                z2 = true;
            }
            if (!z2 && !z) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (z2) {
                this.f235i = size;
            }
        }
        int i2 = i / this.f235i;
        m260b(i2, i2);
        int i3 = i2 - (this.f228a / this.f235i);
        List list2 = (List) this.f234h.get(i3);
        if (list2 == null || list2 == f227g) {
            this.f234h.set(i3, list);
            if (aVar != null) {
                aVar.mo170a(i, list.size());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder("Invalid position ");
        sb.append(i);
        sb.append(": data already loaded");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    private void m259a(int i, List<T> list, int i2, int i3) {
        this.f228a = i;
        this.f234h.clear();
        this.f234h.add(list);
        this.f229b = i2;
        this.f230c = i3;
        this.f231d = list.size();
        this.f235i = list.size();
        this.f232e = 0;
        this.f233f = 0;
    }

    /* renamed from: a */
    public final void mo233a(int i, int i2, int i3, C0109a aVar) {
        if (i3 != this.f235i) {
            if (i3 < this.f235i) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (this.f234h.size() == 1 && this.f229b == 0) {
                this.f235i = i3;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        int size = ((size() + this.f235i) - 1) / this.f235i;
        int max = Math.max((i - i2) / this.f235i, 0);
        int min = Math.min((i + i2) / this.f235i, size - 1);
        m260b(max, min);
        int i4 = this.f228a / this.f235i;
        while (max <= min) {
            int i5 = max - i4;
            if (this.f234h.get(i5) == null) {
                this.f234h.set(i5, f227g);
                aVar.mo178c(max);
            }
            max++;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo235a(int i, List<T> list, int i2, int i3, C0109a aVar) {
        m259a(i, list, i2, i3);
        aVar.mo175b(size());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo234a(int i, List<T> list, int i2, int i3, int i4, C0109a aVar) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                m259a(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                mo236a(i6 + i, subList, null);
            }
            i5 = i7;
        }
        aVar.mo175b(size());
    }
}
