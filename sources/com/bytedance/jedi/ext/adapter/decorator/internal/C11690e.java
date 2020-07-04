package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.decorator.C11682a;
import kotlin.C7541d;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.e */
public final class C11690e extends C11689d {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31413a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11690e.class), "defaultEmpty", "getDefaultEmpty()Lkotlin/jvm/functions/Function1;"))};

    /* renamed from: b */
    public C7562b<? super ViewGroup, ? extends C11682a> f31414b;

    /* renamed from: c */
    public C11682a f31415c;

    /* renamed from: d */
    public int f31416d;

    /* renamed from: e */
    public int f31417e;

    /* renamed from: f */
    public final C11689d f31418f;

    /* renamed from: g */
    public final C11689d f31419g;

    /* renamed from: h */
    private int f31420h;

    /* renamed from: i */
    private final C7541d f31421i;

    /* renamed from: h */
    private final C7562b<ViewGroup, C11682a> m34267h() {
        return (C7562b) this.f31421i.getValue();
    }

    /* renamed from: f */
    public final int mo29253f() {
        return this.f31420h;
    }

    /* renamed from: g */
    public final boolean mo29254g() {
        if (this.f31416d != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29249d() {
        /*
            r5 = this;
            int r0 = r5.f31417e
            r1 = 0
            r2 = 1
            r3 = 241(0xf1, float:3.38E-43)
            if (r0 != r3) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 != 0) goto L_0x0019
            int r0 = r5.f31416d
            r0 = r0 & r2
            if (r0 != r2) goto L_0x0014
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            if (r0 == 0) goto L_0x0019
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            com.bytedance.jedi.ext.adapter.decorator.internal.d r3 = r5.f31418f
            boolean r3 = r3.mo29254g()
            if (r3 == 0) goto L_0x0034
            int r3 = r5.f31416d
            r4 = 2
            r3 = r3 & r4
            if (r3 != r4) goto L_0x002f
            r3 = 1
            goto L_0x0030
        L_0x002f:
            r3 = 0
        L_0x0030:
            if (r3 == 0) goto L_0x0034
            r3 = 1
            goto L_0x0035
        L_0x0034:
            r3 = 0
        L_0x0035:
            if (r3 == 0) goto L_0x003e
            com.bytedance.jedi.ext.adapter.decorator.internal.d r3 = r5.f31418f
            int r3 = r3.mo29249d()
            int r0 = r0 + r3
        L_0x003e:
            com.bytedance.jedi.ext.adapter.decorator.internal.d r3 = r5.f31419g
            boolean r3 = r3.mo29254g()
            if (r3 == 0) goto L_0x0052
            int r3 = r5.f31416d
            r4 = 4
            r3 = r3 & r4
            if (r3 != r4) goto L_0x004e
            r3 = 1
            goto L_0x004f
        L_0x004e:
            r3 = 0
        L_0x004f:
            if (r3 == 0) goto L_0x0052
            r1 = 1
        L_0x0052:
            if (r1 == 0) goto L_0x005b
            com.bytedance.jedi.ext.adapter.decorator.internal.d r1 = r5.f31419g
            int r1 = r1.mo29249d()
            int r0 = r0 + r1
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.internal.C11690e.mo29249d():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p029v7.widget.RecyclerView.C1293v mo29252a(android.view.ViewGroup r2) {
        /*
            r1 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.C7573i.m23587b(r2, r0)
            com.bytedance.jedi.ext.adapter.decorator.a r0 = r1.f31415c
            if (r0 == 0) goto L_0x000f
            android.view.View r0 = r0.mo29234a()
            if (r0 != 0) goto L_0x0023
        L_0x000f:
            kotlin.jvm.a.b<? super android.view.ViewGroup, ? extends com.bytedance.jedi.ext.adapter.decorator.a> r0 = r1.f31414b
            if (r0 != 0) goto L_0x0017
            kotlin.jvm.a.b r0 = r1.m34267h()
        L_0x0017:
            java.lang.Object r2 = r0.invoke(r2)
            com.bytedance.jedi.ext.adapter.decorator.a r2 = (com.bytedance.jedi.ext.adapter.decorator.C11682a) r2
            r1.f31415c = r2
            android.view.View r0 = r2.mo29234a()
        L_0x0023:
            com.bytedance.jedi.ext.adapter.decorator.internal.EmptyHolder r2 = new com.bytedance.jedi.ext.adapter.decorator.internal.EmptyHolder
            r2.<init>(r0)
            android.support.v7.widget.RecyclerView$v r2 = (android.support.p029v7.widget.RecyclerView.C1293v) r2
            r1.mo29244a(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.internal.C11690e.mo29252a(android.view.ViewGroup):android.support.v7.widget.RecyclerView$v");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo29251a(int r5) {
        /*
            r4 = this;
            r0 = 241(0xf1, float:3.38E-43)
            r1 = 2
            r2 = 0
            r3 = 1
            switch(r5) {
                case 0: goto L_0x0079;
                case 1: goto L_0x0011;
                case 2: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            goto L_0x00d1
        L_0x000a:
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31419g
            int r5 = r5.mo29253f()
            return r5
        L_0x0011:
            int r5 = r4.f31417e
            if (r5 != r0) goto L_0x0017
            r5 = 1
            goto L_0x0018
        L_0x0017:
            r5 = 0
        L_0x0018:
            if (r5 != 0) goto L_0x0026
            int r5 = r4.f31416d
            r5 = r5 & r3
            if (r5 != r3) goto L_0x0021
            r5 = 1
            goto L_0x0022
        L_0x0021:
            r5 = 0
        L_0x0022:
            if (r5 == 0) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r5 == 0) goto L_0x0045
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31418f
            boolean r5 = r5.mo29254g()
            if (r5 == 0) goto L_0x003d
            int r5 = r4.f31416d
            r5 = r5 & r1
            if (r5 != r1) goto L_0x0038
            r5 = 1
            goto L_0x0039
        L_0x0038:
            r5 = 0
        L_0x0039:
            if (r5 == 0) goto L_0x003d
            r5 = 1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            if (r5 == 0) goto L_0x0045
            int r5 = r4.mo29253f()
            return r5
        L_0x0045:
            int r5 = r4.f31417e
            if (r5 != r0) goto L_0x004b
            r5 = 1
            goto L_0x004c
        L_0x004b:
            r5 = 0
        L_0x004c:
            if (r5 != 0) goto L_0x005a
            int r5 = r4.f31416d
            r5 = r5 & r3
            if (r5 != r3) goto L_0x0055
            r5 = 1
            goto L_0x0056
        L_0x0055:
            r5 = 0
        L_0x0056:
            if (r5 == 0) goto L_0x005a
            r5 = 1
            goto L_0x005b
        L_0x005a:
            r5 = 0
        L_0x005b:
            if (r5 == 0) goto L_0x00d1
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31418f
            boolean r5 = r5.mo29254g()
            if (r5 == 0) goto L_0x0070
            int r5 = r4.f31416d
            r5 = r5 & r1
            if (r5 != r1) goto L_0x006c
            r5 = 1
            goto L_0x006d
        L_0x006c:
            r5 = 0
        L_0x006d:
            if (r5 == 0) goto L_0x0070
            r2 = 1
        L_0x0070:
            if (r2 != 0) goto L_0x00d1
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31419g
            int r5 = r5.mo29253f()
            return r5
        L_0x0079:
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31418f
            boolean r5 = r5.mo29254g()
            if (r5 == 0) goto L_0x008d
            int r5 = r4.f31416d
            r5 = r5 & r1
            if (r5 != r1) goto L_0x0088
            r5 = 1
            goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            if (r5 == 0) goto L_0x008d
            r5 = 1
            goto L_0x008e
        L_0x008d:
            r5 = 0
        L_0x008e:
            if (r5 == 0) goto L_0x0097
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31418f
            int r5 = r5.mo29253f()
            return r5
        L_0x0097:
            int r5 = r4.f31417e
            if (r5 != r0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            if (r5 != 0) goto L_0x00ac
            int r5 = r4.f31416d
            r5 = r5 & r3
            if (r5 != r3) goto L_0x00a7
            r5 = 1
            goto L_0x00a8
        L_0x00a7:
            r5 = 0
        L_0x00a8:
            if (r5 == 0) goto L_0x00ac
            r5 = 1
            goto L_0x00ad
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            if (r5 == 0) goto L_0x00b4
            int r5 = r4.mo29253f()
            return r5
        L_0x00b4:
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31419g
            boolean r5 = r5.mo29254g()
            if (r5 == 0) goto L_0x00c8
            int r5 = r4.f31416d
            r0 = 4
            r5 = r5 & r0
            if (r5 != r0) goto L_0x00c4
            r5 = 1
            goto L_0x00c5
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            if (r5 == 0) goto L_0x00c8
            r2 = 1
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            com.bytedance.jedi.ext.adapter.decorator.internal.d r5 = r4.f31419g
            int r5 = r5.mo29253f()
            return r5
        L_0x00d1:
            int r5 = r4.mo29253f()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.decorator.internal.C11690e.mo29251a(int):int");
    }
}
