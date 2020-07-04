package org.greenrobot.eventbus;

import java.util.ArrayList;
import java.util.List;

/* renamed from: org.greenrobot.eventbus.i */
final class C48338i {

    /* renamed from: d */
    private static final List<C48338i> f123413d = new ArrayList();

    /* renamed from: a */
    Object f123414a;

    /* renamed from: b */
    C48345p f123415b;

    /* renamed from: c */
    C48338i f123416c;

    /* renamed from: a */
    static void m149921a(C48338i iVar) {
        iVar.f123414a = null;
        iVar.f123415b = null;
        iVar.f123416c = null;
        synchronized (f123413d) {
            if (f123413d.size() < 10000) {
                f123413d.add(iVar);
            }
        }
    }

    private C48338i(Object obj, C48345p pVar) {
        this.f123414a = obj;
        this.f123415b = pVar;
    }

    /* renamed from: a */
    static C48338i m149920a(C48345p pVar, Object obj) {
        synchronized (f123413d) {
            int size = f123413d.size();
            if (size <= 0) {
                return new C48338i(obj, pVar);
            }
            C48338i iVar = (C48338i) f123413d.remove(size - 1);
            iVar.f123414a = obj;
            iVar.f123415b = pVar;
            iVar.f123416c = null;
            return iVar;
        }
    }
}
