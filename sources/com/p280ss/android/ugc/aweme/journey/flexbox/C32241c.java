package com.p280ss.android.ugc.aweme.journey.flexbox;

import android.support.p022v4.view.C0976h;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.flexbox.c */
class C32241c {

    /* renamed from: c */
    static final /* synthetic */ boolean f84263c = (!C32241c.class.desiredAssertionStatus());

    /* renamed from: a */
    int[] f84264a;

    /* renamed from: b */
    long[] f84265b;

    /* renamed from: d */
    private final C32239a f84266d;

    /* renamed from: e */
    private boolean[] f84267e;

    /* renamed from: f */
    private long[] f84268f;

    /* renamed from: com.ss.android.ugc.aweme.journey.flexbox.c$a */
    static class C32242a {

        /* renamed from: a */
        List<C32240b> f84269a;

        /* renamed from: b */
        int f84270b;

        C32242a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo83461a() {
            this.f84269a = null;
            this.f84270b = 0;
        }
    }

    /* renamed from: a */
    static int m104701a(long j) {
        return (int) j;
    }

    /* renamed from: b */
    static int m104713b(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: b */
    private static long m104717b(int i, int i2) {
        return (((long) i) & 4294967295L) | (((long) i2) << 32);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83453a(C32242a aVar, int i, int i2, int i3, int i4, List<C32240b> list) {
        mo83452a(aVar, i, i2, i3, i4, -1, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo83456b(C32242a aVar, int i, int i2, int i3, int i4, List<C32240b> list) {
        mo83452a(aVar, i, i2, i3, 0, i4, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83452a(C32242a aVar, int i, int i2, int i3, int i4, int i5, List<C32240b> list) {
        int i6;
        int i7;
        int i8;
        List<C32240b> list2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C32240b bVar;
        C32242a aVar2 = aVar;
        int i21 = i;
        int i22 = i2;
        int i23 = i5;
        boolean i24 = this.f84266d.mo83417i();
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        List<C32240b> arrayList = list == null ? new ArrayList<>() : list;
        aVar2.f84269a = arrayList;
        boolean z = i23 == -1;
        int a = m104704a(i24);
        int b = m104716b(i24);
        int c = m104721c(i24);
        int d = m104723d(i24);
        C32240b bVar2 = new C32240b();
        int i25 = i4;
        bVar2.f84259o = i25;
        int i26 = b + a;
        bVar2.f84249e = i26;
        int b2 = this.f84266d.mo83411b();
        boolean z2 = z;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = Integer.MIN_VALUE;
        while (i6 < b2) {
            View a2 = this.f84266d.mo5368a(i6);
            if (a2 == null) {
                if (m104710a(i6, b2, bVar2)) {
                    m104709a(arrayList, bVar2, i6, i27);
                }
            } else if (a2.getVisibility() == 8) {
                bVar2.f84253i++;
                bVar2.f84252h++;
                if (m104710a(i6, b2, bVar2)) {
                    m104709a(arrayList, bVar2, i6, i27);
                }
            } else {
                FlexItem flexItem = (FlexItem) a2.getLayoutParams();
                int i31 = b2;
                if (flexItem.mo83395e() == 4) {
                    bVar2.f84258n.add(Integer.valueOf(i6));
                }
                int a3 = m104703a(flexItem, i24);
                if (flexItem.mo83401k() != -1.0f && mode == 1073741824) {
                    a3 = Math.round(((float) size) * flexItem.mo83401k());
                }
                if (i24) {
                    int a_ = this.f84266d.mo83410a_(i21, i26 + m104720c(flexItem, true) + m104722d(flexItem, true), a3);
                    i14 = size;
                    i13 = mode;
                    int b3 = this.f84266d.mo83412b(i22, c + d + m104724e(flexItem, true) + m104726f(flexItem, true) + i27, m104715b(flexItem, true));
                    a2.measure(a_, b3);
                    m104705a(i6, a_, b3, a2);
                    i15 = a_;
                } else {
                    i14 = size;
                    i13 = mode;
                    int a_2 = this.f84266d.mo83410a_(i22, c + d + m104724e(flexItem, false) + m104726f(flexItem, false) + i27, m104715b(flexItem, false));
                    int b4 = this.f84266d.mo83412b(i21, m104720c(flexItem, false) + i26 + m104722d(flexItem, false), a3);
                    a2.measure(a_2, b4);
                    m104705a(i6, a_2, b4, a2);
                    i15 = b4;
                }
                this.f84266d.mo83408a(i6, a2);
                m104707a(a2, i6);
                i28 = View.combineMeasuredStates(i28, a2.getMeasuredState());
                int i32 = i27;
                int i33 = i31;
                C32240b bVar3 = bVar2;
                int i34 = i26;
                int i35 = i6;
                View view2 = a2;
                list2 = arrayList;
                int i36 = i35;
                i8 = i14;
                int i37 = i15;
                i7 = i13;
                if (m104711a(a2, i13, i14, bVar2.f84249e, m104722d(flexItem, i24) + m104702a(a2, i24) + m104720c(flexItem, i24), flexItem, i35, i29, arrayList.size())) {
                    if (bVar3.mo83445a() > 0) {
                        if (i36 > 0) {
                            i20 = i36 - 1;
                            bVar = bVar3;
                        } else {
                            bVar = bVar3;
                            i20 = 0;
                        }
                        m104709a(list2, bVar, i20, i32);
                        i19 = bVar.f84251g + i32;
                    } else {
                        i19 = i32;
                    }
                    if (!i24) {
                        i6 = i36;
                        view = view2;
                        int i38 = i37;
                        i11 = i2;
                        if (flexItem.mo83391a() == -1) {
                            C32239a aVar3 = this.f84266d;
                            view.measure(aVar3.mo83410a_(i11, aVar3.mo83439t() + this.f84266d.mo83441v() + flexItem.mo83402l() + flexItem.mo83404n() + i19, flexItem.mo83391a()), i38);
                            m104707a(view, i6);
                        }
                    } else if (flexItem.mo83392b() == -1) {
                        C32239a aVar4 = this.f84266d;
                        i6 = i36;
                        i11 = i2;
                        view = view2;
                        view.measure(i37, aVar4.mo83412b(i11, aVar4.mo83440u() + this.f84266d.mo83442w() + flexItem.mo83403m() + flexItem.mo83405o() + i19, flexItem.mo83392b()));
                        m104707a(view, i6);
                    } else {
                        i6 = i36;
                        view = view2;
                        i11 = i2;
                    }
                    bVar2 = new C32240b();
                    bVar2.f84252h = 1;
                    i10 = i34;
                    bVar2.f84249e = i10;
                    bVar2.f84259o = i6;
                    i32 = i19;
                    i17 = 0;
                    i16 = Integer.MIN_VALUE;
                } else {
                    i6 = i36;
                    bVar2 = bVar3;
                    i10 = i34;
                    view = view2;
                    i11 = i2;
                    bVar2.f84252h++;
                    i17 = i29 + 1;
                    i16 = i30;
                }
                bVar2.f84261q |= flexItem.mo83393c() != 0.0f;
                bVar2.f84262r |= flexItem.mo83394d() != 0.0f;
                if (this.f84264a != null) {
                    this.f84264a[i6] = list2.size();
                }
                bVar2.f84249e += m104702a(view, i24) + m104720c(flexItem, i24) + m104722d(flexItem, i24);
                bVar2.f84254j += flexItem.mo83393c();
                bVar2.f84255k += flexItem.mo83394d();
                this.f84266d.mo83409a(view, i6, i17, bVar2);
                int max = Math.max(i16, m104714b(view, i24) + m104724e(flexItem, i24) + m104726f(flexItem, i24) + this.f84266d.mo83414d_(view));
                bVar2.f84251g = Math.max(bVar2.f84251g, max);
                if (i24) {
                    if (this.f84266d.mo83415g() != 2) {
                        bVar2.f84256l = Math.max(bVar2.f84256l, view.getBaseline() + flexItem.mo83403m());
                    } else {
                        bVar2.f84256l = Math.max(bVar2.f84256l, (view.getMeasuredHeight() - view.getBaseline()) + flexItem.mo83405o());
                    }
                }
                i12 = i33;
                if (m104710a(i6, i12, bVar2)) {
                    m104709a(list2, bVar2, i6, i32);
                    i32 += bVar2.f84251g;
                }
                i9 = i5;
                if (i9 != -1 && list2.size() > 0) {
                    if (((C32240b) list2.get(list2.size() - 1)).f84260p >= i9 && i6 >= i9 && !z2) {
                        i18 = -bVar2.f84251g;
                        z2 = true;
                        if (i18 <= i3 && z2) {
                            break;
                        }
                        i29 = i17;
                        i30 = max;
                        i27 = i18;
                        i25 = i6 + 1;
                        b2 = i12;
                        i22 = i11;
                        i26 = i10;
                        arrayList = list2;
                        mode = i7;
                        C32242a aVar5 = aVar;
                        i21 = i;
                        i23 = i9;
                        size = i8;
                    }
                }
                i18 = i32;
                if (i18 <= i3) {
                }
                i29 = i17;
                i30 = max;
                i27 = i18;
                i25 = i6 + 1;
                b2 = i12;
                i22 = i11;
                i26 = i10;
                arrayList = list2;
                mode = i7;
                C32242a aVar52 = aVar;
                i21 = i;
                i23 = i9;
                size = i8;
            }
            int i39 = i3;
            i8 = size;
            i7 = mode;
            i11 = i22;
            i9 = i23;
            list2 = arrayList;
            i10 = i26;
            i12 = b2;
            i25 = i6 + 1;
            b2 = i12;
            i22 = i11;
            i26 = i10;
            arrayList = list2;
            mode = i7;
            C32242a aVar522 = aVar;
            i21 = i;
            i23 = i9;
            size = i8;
        }
        aVar.f84270b = i28;
    }

    /* renamed from: a */
    private boolean m104711a(View view, int i, int i2, int i3, int i4, FlexItem flexItem, int i5, int i6, int i7) {
        if (this.f84266d.mo83415g() == 0) {
            return false;
        }
        if (flexItem.mo83400j()) {
            return true;
        }
        if (i == 0) {
            return false;
        }
        int k = this.f84266d.mo83419k();
        if (k != -1 && k <= i7 + 1) {
            return false;
        }
        int a = this.f84266d.mo83407a(view, i5, i6);
        if (a > 0) {
            i4 += a;
        }
        if (i2 < i3 + i4) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m104710a(int i, int i2, C32240b bVar) {
        return i == i2 - 1 && bVar.mo83445a() != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83448a(int i, int i2) {
        mo83449a(i, i2, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83449a(int i, int i2, int i3) {
        int i4;
        int i5;
        m104725e(this.f84266d.mo83411b());
        if (i3 < this.f84266d.mo83411b()) {
            int c = this.f84266d.mo83413c();
            switch (this.f84266d.mo83413c()) {
                case 0:
                case 1:
                    int mode = MeasureSpec.getMode(i);
                    int size = MeasureSpec.getSize(i);
                    if (mode != 1073741824) {
                        size = this.f84266d.mo83418j();
                    }
                    i5 = this.f84266d.mo83439t() + this.f84266d.mo83441v();
                    break;
                case 2:
                case 3:
                    int mode2 = MeasureSpec.getMode(i2);
                    i4 = MeasureSpec.getSize(i2);
                    if (mode2 != 1073741824) {
                        i4 = this.f84266d.mo83418j();
                    }
                    i5 = this.f84266d.mo83440u() + this.f84266d.mo83442w();
                    break;
                default:
                    StringBuilder sb = new StringBuilder("Invalid flex direction: ");
                    sb.append(c);
                    throw new IllegalArgumentException(sb.toString());
            }
            int i6 = 0;
            if (this.f84264a != null) {
                i6 = this.f84264a[i3];
            }
            List l = this.f84266d.mo83420l();
            int size2 = l.size();
            for (int i7 = i6; i7 < size2; i7++) {
                C32240b bVar = (C32240b) l.get(i7);
                if (bVar.f84249e < i4 && bVar.f84261q) {
                    m104706a(i, i2, bVar, i4, i5, false);
                } else if (bVar.f84249e > i4 && bVar.f84262r) {
                    m104718b(i, i2, bVar, i4, i5, false);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83446a() {
        mo83447a(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83447a(int i) {
        if (i < this.f84266d.mo83411b()) {
            int c = this.f84266d.mo83413c();
            if (this.f84266d.mo83416h() == 4) {
                List l = this.f84266d.mo83420l();
                int size = l.size();
                for (int i2 = this.f84264a != null ? this.f84264a[i] : 0; i2 < size; i2++) {
                    C32240b bVar = (C32240b) l.get(i2);
                    int i3 = bVar.f84252h;
                    for (int i4 = 0; i4 < i3; i4++) {
                        int i5 = bVar.f84259o + i4;
                        if (i4 < this.f84266d.mo83411b()) {
                            View a = this.f84266d.mo5368a(i5);
                            if (!(a == null || a.getVisibility() == 8)) {
                                FlexItem flexItem = (FlexItem) a.getLayoutParams();
                                if (flexItem.mo83395e() == -1 || flexItem.mo83395e() == 4) {
                                    switch (c) {
                                        case 0:
                                        case 1:
                                            m104708a(a, bVar.f84251g, i5);
                                            break;
                                        case 2:
                                        case 3:
                                            m104719b(a, bVar.f84251g, i5);
                                            break;
                                        default:
                                            StringBuilder sb = new StringBuilder("Invalid flex direction: ");
                                            sb.append(c);
                                            throw new IllegalArgumentException(sb.toString());
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (C32240b bVar2 : this.f84266d.mo83420l()) {
                Iterator it = bVar2.f84258n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer num = (Integer) it.next();
                        View a2 = this.f84266d.mo5368a(num.intValue());
                        switch (c) {
                            case 0:
                            case 1:
                                m104708a(a2, bVar2.f84251g, num.intValue());
                                break;
                            case 2:
                            case 3:
                                m104719b(a2, bVar2.f84251g, num.intValue());
                                break;
                            default:
                                StringBuilder sb2 = new StringBuilder("Invalid flex direction: ");
                                sb2.append(c);
                                throw new IllegalArgumentException(sb2.toString());
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83450a(View view, C32240b bVar, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h = this.f84266d.mo83416h();
        if (flexItem.mo83395e() != -1) {
            h = flexItem.mo83395e();
        }
        int i5 = bVar.f84251g;
        switch (h) {
            case 0:
            case 4:
                if (this.f84266d.mo83415g() != 2) {
                    view.layout(i, i2 + flexItem.mo83403m(), i3, i4 + flexItem.mo83403m());
                    return;
                } else {
                    view.layout(i, i2 - flexItem.mo83405o(), i3, i4 - flexItem.mo83405o());
                    return;
                }
            case 1:
                if (this.f84266d.mo83415g() != 2) {
                    int i6 = i2 + i5;
                    view.layout(i, (i6 - view.getMeasuredHeight()) - flexItem.mo83405o(), i3, i6 - flexItem.mo83405o());
                    return;
                }
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo83403m(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo83403m());
                return;
            case 2:
                int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo83403m()) - flexItem.mo83405o()) / 2;
                if (this.f84266d.mo83415g() == 2) {
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    break;
                } else {
                    int i8 = i2 + measuredHeight;
                    view.layout(i, i8, i3, view.getMeasuredHeight() + i8);
                    return;
                }
            case 3:
                if (this.f84266d.mo83415g() != 2) {
                    int max = Math.max(bVar.f84256l - view.getBaseline(), flexItem.mo83403m());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                }
                int max2 = Math.max((bVar.f84256l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo83405o());
                view.layout(i, i2 - max2, i3, i4 - max2);
                return;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83451a(View view, C32240b bVar, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int h = this.f84266d.mo83416h();
        if (flexItem.mo83395e() != -1) {
            h = flexItem.mo83395e();
        }
        int i5 = bVar.f84251g;
        switch (h) {
            case 0:
            case 3:
            case 4:
                if (!z) {
                    view.layout(i + flexItem.mo83402l(), i2, i3 + flexItem.mo83402l(), i4);
                    return;
                } else {
                    view.layout(i - flexItem.mo83404n(), i2, i3 - flexItem.mo83404n(), i4);
                    return;
                }
            case 1:
                if (!z) {
                    view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo83404n(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo83404n(), i4);
                    return;
                } else {
                    view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo83402l(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo83402l(), i4);
                    return;
                }
            case 2:
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i5 - view.getMeasuredWidth()) + C0976h.m4119a(marginLayoutParams)) - C0976h.m4121b(marginLayoutParams)) / 2;
                if (z) {
                    view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                    break;
                } else {
                    view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                    return;
                }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo83454a(List<C32240b> list, int i) {
        if (!f84263c && this.f84264a == null) {
            throw new AssertionError();
        } else if (f84263c || this.f84265b != null) {
            int i2 = this.f84264a[i];
            if (i2 == -1) {
                i2 = 0;
            }
            for (int size = list.size() - 1; size >= i2; size--) {
                list.remove(size);
            }
            int length = this.f84264a.length - 1;
            if (i > length) {
                Arrays.fill(this.f84264a, -1);
            } else {
                Arrays.fill(this.f84264a, i, length, -1);
            }
            int length2 = this.f84265b.length - 1;
            if (i > length2) {
                Arrays.fill(this.f84265b, 0);
            } else {
                Arrays.fill(this.f84265b, i, length2, 0);
            }
        } else {
            throw new AssertionError();
        }
    }

    C32241c(C32239a aVar) {
        this.f84266d = aVar;
    }

    /* renamed from: c */
    private int m104721c(boolean z) {
        if (z) {
            return this.f84266d.mo83440u();
        }
        return this.f84266d.mo83443x();
    }

    /* renamed from: d */
    private int m104723d(boolean z) {
        if (z) {
            return this.f84266d.mo83442w();
        }
        return this.f84266d.mo83444y();
    }

    /* renamed from: a */
    private int m104704a(boolean z) {
        if (z) {
            return this.f84266d.mo83443x();
        }
        return this.f84266d.mo83440u();
    }

    /* renamed from: b */
    private int m104716b(boolean z) {
        if (z) {
            return this.f84266d.mo83444y();
        }
        return this.f84266d.mo83442w();
    }

    /* renamed from: e */
    private void m104725e(int i) {
        if (this.f84267e == null) {
            if (i < 10) {
                i = 10;
            }
            this.f84267e = new boolean[i];
        } else if (this.f84267e.length < i) {
            int length = this.f84267e.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f84267e = new boolean[i];
        } else {
            Arrays.fill(this.f84267e, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo83457c(int i) {
        if (this.f84265b == null) {
            if (i < 10) {
                i = 10;
            }
            this.f84265b = new long[i];
            return;
        }
        if (this.f84265b.length < i) {
            int length = this.f84265b.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f84265b = Arrays.copyOf(this.f84265b, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo83459d(int i) {
        if (this.f84264a == null) {
            if (i < 10) {
                i = 10;
            }
            this.f84264a = new int[i];
            return;
        }
        if (this.f84264a.length < i) {
            int length = this.f84264a.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f84264a = Arrays.copyOf(this.f84264a, i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo83455b(int i) {
        if (this.f84268f == null) {
            if (i < 10) {
                i = 10;
            }
            this.f84268f = new long[i];
            return;
        }
        if (this.f84268f.length < i) {
            int length = this.f84268f.length * 2;
            if (length >= i) {
                i = length;
            }
            this.f84268f = Arrays.copyOf(this.f84268f, i);
        }
    }

    /* renamed from: a */
    private static int m104702a(View view, boolean z) {
        if (z) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    /* renamed from: b */
    private static int m104714b(View view, boolean z) {
        if (z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: c */
    private static int m104720c(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo83402l();
        }
        return flexItem.mo83403m();
    }

    /* renamed from: d */
    private static int m104722d(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo83404n();
        }
        return flexItem.mo83405o();
    }

    /* renamed from: e */
    private static int m104724e(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo83403m();
        }
        return flexItem.mo83402l();
    }

    /* renamed from: f */
    private static int m104726f(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo83405o();
        }
        return flexItem.mo83404n();
    }

    /* renamed from: a */
    private static int m104703a(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo83391a();
        }
        return flexItem.mo83392b();
    }

    /* renamed from: b */
    private static int m104715b(FlexItem flexItem, boolean z) {
        if (z) {
            return flexItem.mo83392b();
        }
        return flexItem.mo83391a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m104707a(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.ss.android.ugc.aweme.journey.flexbox.FlexItem r0 = (com.p280ss.android.ugc.aweme.journey.flexbox.FlexItem) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.mo83396f()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.mo83396f()
        L_0x0019:
            r3 = 1
            goto L_0x0027
        L_0x001b:
            int r3 = r0.mo83398h()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.mo83398h()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.mo83397g()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.mo83397g()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.mo83399i()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.mo83399i()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.m104705a(r8, r1, r0, r7)
            com.ss.android.ugc.aweme.journey.flexbox.a r0 = r6.f84266d
            r0.mo83408a(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.journey.flexbox.C32241c.m104707a(android.view.View, int):void");
    }

    /* renamed from: a */
    private int m104700a(int i, FlexItem flexItem, int i2) {
        C32239a aVar = this.f84266d;
        int a_ = aVar.mo83410a_(i, aVar.mo83439t() + this.f84266d.mo83441v() + flexItem.mo83402l() + flexItem.mo83404n() + i2, flexItem.mo83391a());
        int size = MeasureSpec.getSize(a_);
        if (size > flexItem.mo83398h()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo83398h(), MeasureSpec.getMode(a_));
        }
        if (size < flexItem.mo83396f()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo83396f(), MeasureSpec.getMode(a_));
        }
        return a_;
    }

    /* renamed from: b */
    private int m104712b(int i, FlexItem flexItem, int i2) {
        C32239a aVar = this.f84266d;
        int b = aVar.mo83412b(i, aVar.mo83440u() + this.f84266d.mo83442w() + flexItem.mo83403m() + flexItem.mo83405o() + i2, flexItem.mo83392b());
        int size = MeasureSpec.getSize(b);
        if (size > flexItem.mo83399i()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo83399i(), MeasureSpec.getMode(b));
        }
        if (size < flexItem.mo83397g()) {
            return MeasureSpec.makeMeasureSpec(flexItem.mo83397g(), MeasureSpec.getMode(b));
        }
        return b;
    }

    /* renamed from: b */
    private void m104719b(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo83402l()) - flexItem.mo83404n()) - this.f84266d.mo83414d_(view), flexItem.mo83396f()), flexItem.mo83398h());
        if (this.f84268f != null) {
            i3 = m104713b(this.f84268f[i2]);
        } else {
            i3 = view.getMeasuredHeight();
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        m104705a(i2, makeMeasureSpec2, makeMeasureSpec, view);
        this.f84266d.mo83408a(i2, view);
    }

    /* renamed from: a */
    private void m104708a(View view, int i, int i2) {
        int i3;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int min = Math.min(Math.max(((i - flexItem.mo83403m()) - flexItem.mo83405o()) - this.f84266d.mo83414d_(view), flexItem.mo83397g()), flexItem.mo83399i());
        if (this.f84268f != null) {
            i3 = m104701a(this.f84268f[i2]);
        } else {
            i3 = view.getMeasuredWidth();
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(min, 1073741824);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        m104705a(i2, makeMeasureSpec, makeMeasureSpec2, view);
        this.f84266d.mo83408a(i2, view);
    }

    /* renamed from: a */
    private void m104709a(List<C32240b> list, C32240b bVar, int i, int i2) {
        bVar.f84257m = i2;
        bVar.f84260p = i;
        list.add(bVar);
    }

    /* renamed from: a */
    private void m104705a(int i, int i2, int i3, View view) {
        if (this.f84265b != null) {
            this.f84265b[i] = m104717b(i2, i3);
        }
        if (this.f84268f != null) {
            this.f84268f[i] = m104717b(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo83458c(C32242a aVar, int i, int i2, int i3, int i4, List<C32240b> list) {
        mo83452a(aVar, i2, i, i3, i4, -1, list);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo83460d(C32242a aVar, int i, int i2, int i3, int i4, List<C32240b> list) {
        mo83452a(aVar, i2, i, i3, 0, i4, list);
    }

    /* renamed from: a */
    private void m104706a(int i, int i2, C32240b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        float f;
        int i8;
        int i9;
        float f2;
        C32240b bVar2 = bVar;
        int i10 = i3;
        int i11 = 1;
        boolean z2 = z;
        while (bVar2.f84254j > 0.0f && i10 >= bVar2.f84249e) {
            int i12 = bVar2.f84249e;
            float f3 = ((float) (i10 - bVar2.f84249e)) / bVar2.f84254j;
            bVar2.f84249e = i4 + bVar2.f84250f;
            if (!z2) {
                bVar2.f84251g = Integer.MIN_VALUE;
            }
            int i13 = 0;
            boolean z3 = false;
            float f4 = 0.0f;
            int i14 = 0;
            while (i13 < bVar2.f84252h) {
                int i15 = bVar2.f84259o + i13;
                View a = this.f84266d.mo5368a(i15);
                if (a == null || a.getVisibility() == 8) {
                    int i16 = i2;
                } else {
                    FlexItem flexItem = (FlexItem) a.getLayoutParams();
                    int c = this.f84266d.mo83413c();
                    if (c == 0 || c == i11) {
                        int i17 = i;
                        int measuredWidth = a.getMeasuredWidth();
                        if (this.f84268f != null) {
                            measuredWidth = m104701a(this.f84268f[i15]);
                        }
                        int measuredHeight = a.getMeasuredHeight();
                        if (this.f84268f != null) {
                            measuredHeight = m104713b(this.f84268f[i15]);
                        }
                        if (this.f84267e[i15]) {
                            int i18 = i2;
                        } else if (flexItem.mo83393c() > 0.0f) {
                            float c2 = ((float) measuredWidth) + (flexItem.mo83393c() * f3);
                            if (i13 == bVar2.f84252h - 1) {
                                c2 += f4;
                                f4 = 0.0f;
                            }
                            int round = Math.round(c2);
                            if (round > flexItem.mo83398h()) {
                                round = flexItem.mo83398h();
                                this.f84267e[i15] = true;
                                bVar2.f84254j -= flexItem.mo83393c();
                                z3 = true;
                            } else {
                                f4 += c2 - ((float) round);
                                double d = (double) f4;
                                if (d > 1.0d) {
                                    round++;
                                    Double.isNaN(d);
                                    f = (float) (d - 1.0d);
                                } else if (d < -1.0d) {
                                    round--;
                                    Double.isNaN(d);
                                    f = (float) (d + 1.0d);
                                }
                                f4 = f;
                            }
                            int b = m104712b(i2, flexItem, bVar2.f84257m);
                            int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                            a.measure(makeMeasureSpec, b);
                            i7 = a.getMeasuredWidth();
                            i6 = a.getMeasuredHeight();
                            m104705a(i15, makeMeasureSpec, b, a);
                            this.f84266d.mo83408a(i15, a);
                            i5 = Math.max(i14, this.f84266d.mo83414d_(a) + i6 + flexItem.mo83403m() + flexItem.mo83405o());
                            bVar2.f84249e += i7 + flexItem.mo83402l() + flexItem.mo83404n();
                        } else {
                            int i19 = i2;
                        }
                        i7 = measuredWidth;
                        i6 = measuredHeight;
                        i5 = Math.max(i14, this.f84266d.mo83414d_(a) + i6 + flexItem.mo83403m() + flexItem.mo83405o());
                        bVar2.f84249e += i7 + flexItem.mo83402l() + flexItem.mo83404n();
                    } else {
                        int measuredHeight2 = a.getMeasuredHeight();
                        if (this.f84268f != null) {
                            measuredHeight2 = m104713b(this.f84268f[i15]);
                        }
                        int measuredWidth2 = a.getMeasuredWidth();
                        if (this.f84268f != null) {
                            measuredWidth2 = m104701a(this.f84268f[i15]);
                        }
                        if (this.f84267e[i15] || flexItem.mo83393c() <= 0.0f) {
                            int i20 = i;
                            i8 = measuredHeight2;
                            i9 = measuredWidth2;
                        } else {
                            float c3 = ((float) measuredHeight2) + (flexItem.mo83393c() * f3);
                            if (i13 == bVar2.f84252h - 1) {
                                c3 += f4;
                                f4 = 0.0f;
                            }
                            int round2 = Math.round(c3);
                            if (round2 > flexItem.mo83399i()) {
                                round2 = flexItem.mo83399i();
                                this.f84267e[i15] = true;
                                bVar2.f84254j -= flexItem.mo83393c();
                                z3 = true;
                            } else {
                                f4 += c3 - ((float) round2);
                                double d2 = (double) f4;
                                if (d2 > 1.0d) {
                                    round2++;
                                    Double.isNaN(d2);
                                    f2 = (float) (d2 - 1.0d);
                                } else if (d2 < -1.0d) {
                                    round2--;
                                    Double.isNaN(d2);
                                    f2 = (float) (d2 + 1.0d);
                                }
                                f4 = f2;
                            }
                            int a2 = m104700a(i, flexItem, bVar2.f84257m);
                            int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                            a.measure(a2, makeMeasureSpec2);
                            i9 = a.getMeasuredWidth();
                            i8 = a.getMeasuredHeight();
                            m104705a(i15, a2, makeMeasureSpec2, a);
                            this.f84266d.mo83408a(i15, a);
                        }
                        i5 = Math.max(i14, i9 + flexItem.mo83402l() + flexItem.mo83404n() + this.f84266d.mo83414d_(a));
                        bVar2.f84249e += i8 + flexItem.mo83403m() + flexItem.mo83405o();
                        int i21 = i2;
                    }
                    bVar2.f84251g = Math.max(bVar2.f84251g, i5);
                    i14 = i5;
                }
                i13++;
                int i22 = i3;
                i11 = 1;
            }
            int i23 = i2;
            if (z3 && i12 != bVar2.f84249e) {
                i10 = i3;
                i11 = 1;
                z2 = true;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m104718b(int i, int i2, C32240b bVar, int i3, int i4, boolean z) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        C32240b bVar2 = bVar;
        int i10 = i3;
        int i11 = 1;
        boolean z2 = z;
        while (true) {
            int i12 = bVar2.f84249e;
            if (bVar2.f84255k > 0.0f && i10 <= bVar2.f84249e) {
                float f = ((float) (bVar2.f84249e - i10)) / bVar2.f84255k;
                bVar2.f84249e = i4 + bVar2.f84250f;
                if (!z2) {
                    bVar2.f84251g = Integer.MIN_VALUE;
                }
                int i13 = 0;
                boolean z3 = false;
                float f2 = 0.0f;
                int i14 = 0;
                while (i13 < bVar2.f84252h) {
                    int i15 = bVar2.f84259o + i13;
                    View a = this.f84266d.mo5368a(i15);
                    if (a == null || a.getVisibility() == 8) {
                        int i16 = i2;
                    } else {
                        FlexItem flexItem = (FlexItem) a.getLayoutParams();
                        int c = this.f84266d.mo83413c();
                        if (c == 0 || c == i11) {
                            int i17 = i;
                            int measuredWidth = a.getMeasuredWidth();
                            if (this.f84268f != null) {
                                measuredWidth = m104701a(this.f84268f[i15]);
                            }
                            int measuredHeight = a.getMeasuredHeight();
                            if (this.f84268f != null) {
                                measuredHeight = m104713b(this.f84268f[i15]);
                            }
                            if (this.f84267e[i15]) {
                                int i18 = i2;
                            } else if (flexItem.mo83394d() > 0.0f) {
                                float d = ((float) measuredWidth) - (flexItem.mo83394d() * f);
                                if (i13 == bVar2.f84252h - 1) {
                                    d += f2;
                                    f2 = 0.0f;
                                }
                                int round = Math.round(d);
                                if (round < flexItem.mo83396f()) {
                                    round = flexItem.mo83396f();
                                    this.f84267e[i15] = true;
                                    bVar2.f84255k -= flexItem.mo83394d();
                                    z3 = true;
                                } else {
                                    f2 += d - ((float) round);
                                    double d2 = (double) f2;
                                    if (d2 > 1.0d) {
                                        round++;
                                        f2 -= 1.0f;
                                    } else if (d2 < -1.0d) {
                                        round--;
                                        f2 += 1.0f;
                                    }
                                }
                                int b = m104712b(i2, flexItem, bVar2.f84257m);
                                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(round, 1073741824);
                                a.measure(makeMeasureSpec, b);
                                i7 = a.getMeasuredWidth();
                                i6 = a.getMeasuredHeight();
                                m104705a(i15, makeMeasureSpec, b, a);
                                this.f84266d.mo83408a(i15, a);
                                i5 = Math.max(i14, this.f84266d.mo83414d_(a) + i6 + flexItem.mo83403m() + flexItem.mo83405o());
                                bVar2.f84249e += i7 + flexItem.mo83402l() + flexItem.mo83404n();
                            } else {
                                int i19 = i2;
                            }
                            i7 = measuredWidth;
                            i6 = measuredHeight;
                            i5 = Math.max(i14, this.f84266d.mo83414d_(a) + i6 + flexItem.mo83403m() + flexItem.mo83405o());
                            bVar2.f84249e += i7 + flexItem.mo83402l() + flexItem.mo83404n();
                        } else {
                            int measuredHeight2 = a.getMeasuredHeight();
                            if (this.f84268f != null) {
                                measuredHeight2 = m104713b(this.f84268f[i15]);
                            }
                            int measuredWidth2 = a.getMeasuredWidth();
                            if (this.f84268f != null) {
                                measuredWidth2 = m104701a(this.f84268f[i15]);
                            }
                            if (this.f84267e[i15] || flexItem.mo83394d() <= 0.0f) {
                                int i20 = i;
                                i8 = measuredHeight2;
                                i9 = measuredWidth2;
                            } else {
                                float d3 = ((float) measuredHeight2) - (flexItem.mo83394d() * f);
                                if (i13 == bVar2.f84252h - 1) {
                                    d3 += f2;
                                    f2 = 0.0f;
                                }
                                int round2 = Math.round(d3);
                                if (round2 < flexItem.mo83397g()) {
                                    round2 = flexItem.mo83397g();
                                    this.f84267e[i15] = true;
                                    bVar2.f84255k -= flexItem.mo83394d();
                                    z3 = true;
                                } else {
                                    f2 += d3 - ((float) round2);
                                    double d4 = (double) f2;
                                    if (d4 > 1.0d) {
                                        round2++;
                                        f2 -= 1.0f;
                                    } else if (d4 < -1.0d) {
                                        round2--;
                                        f2 += 1.0f;
                                    }
                                }
                                int a2 = m104700a(i, flexItem, bVar2.f84257m);
                                int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(round2, 1073741824);
                                a.measure(a2, makeMeasureSpec2);
                                i9 = a.getMeasuredWidth();
                                i8 = a.getMeasuredHeight();
                                m104705a(i15, a2, makeMeasureSpec2, a);
                                this.f84266d.mo83408a(i15, a);
                            }
                            i5 = Math.max(i14, i9 + flexItem.mo83402l() + flexItem.mo83404n() + this.f84266d.mo83414d_(a));
                            bVar2.f84249e += i8 + flexItem.mo83403m() + flexItem.mo83405o();
                            int i21 = i2;
                        }
                        bVar2.f84251g = Math.max(bVar2.f84251g, i5);
                        i14 = i5;
                    }
                    i13++;
                    int i22 = i3;
                    i11 = 1;
                }
                int i23 = i2;
                if (z3 && i12 != bVar2.f84249e) {
                    i10 = i3;
                    i11 = 1;
                    z2 = true;
                }
            } else {
                return;
            }
        }
    }
}
