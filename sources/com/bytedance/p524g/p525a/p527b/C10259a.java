package com.bytedance.p524g.p525a.p527b;

import com.bytedance.p524g.p525a.C10249a;
import com.bytedance.p524g.p525a.C10258b;
import com.google.android.play.core.splitinstall.C17133c;
import com.google.android.play.core.splitinstall.C17134d;
import com.google.android.play.core.splitinstall.C17135e;
import com.google.android.play.core.splitinstall.C17137g;
import com.google.android.play.core.splitinstall.C6563f;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.tasks.C17145a;
import com.google.android.play.core.tasks.C17146b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.g.a.b.a */
public final class C10259a implements C10267c {

    /* renamed from: a */
    private C17133c f27879a;

    /* renamed from: b */
    private List<C10249a> f27880b = new ArrayList();

    /* renamed from: d */
    public static void m30395d(C10249a aVar) {
        if (aVar != null && aVar.f27861d != null) {
            aVar.mo24975a();
        }
    }

    /* renamed from: a */
    private C10249a m30390a(String str) {
        for (C10249a aVar : this.f27880b) {
            if (m30391a(aVar, str) != null) {
                return aVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m30394c(C10249a aVar) {
        if (aVar != null && aVar.f27860c != null && aVar.mo24975a() != 1 && aVar.f27860c.mo13636c()) {
            aVar.f27860c.mo13635b();
        }
    }

    /* renamed from: e */
    private static void m30396e(C10249a aVar) {
        if (aVar != null && aVar.f27860c != null && aVar.mo24975a() == 1 && !aVar.f27860c.mo13636c()) {
            aVar.f27860c.mo13634a();
        }
    }

    /* renamed from: b */
    public final Set<String> mo24984b(C10249a aVar) {
        if (this.f27879a == null) {
            this.f27879a = C17134d.m56791a(aVar.f27859b.getApplicationContext());
        }
        return this.f27879a.mo44407b();
    }

    /* renamed from: a */
    private void m30393a(final C10258b bVar) {
        C17137g gVar;
        if (this.f27879a != null) {
            m30396e(bVar.f27876c);
            C102601 r0 = new C17137g() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void mo15871a(C6563f fVar) {
                    if (fVar.f18875b == 6) {
                        bVar.f27874a = 4;
                        C10259a.m30392a(bVar.f27876c, fVar.f18876c, "Google play error!");
                        C10259a.m30394c(bVar.f27876c);
                    } else if (fVar.f18875b == 8) {
                        bVar.f27874a = 4;
                        C10259a.m30394c(bVar.f27876c);
                        C10259a.m30392a(bVar.f27876c, fVar.f18876c, "Google play error for need user confirmation!");
                    } else {
                        if (fVar.f18875b == 5) {
                            bVar.f27874a = 2;
                            C10259a.m30394c(bVar.f27876c);
                            C10259a.m30395d(bVar.f27876c);
                        }
                    }
                }
            };
            Object obj = bVar.f27878e;
            if (obj instanceof C17137g) {
                gVar = (C17137g) obj;
            } else {
                gVar = null;
            }
            this.f27879a.mo44408b(gVar);
            bVar.f27878e = r0;
            this.f27879a.mo44404a((C17137g) r0);
            this.f27879a.mo44401a(C17135e.m56792a().mo44410a(bVar.f27875b).mo44412a()).mo44417a((C17146b<? super TResult>) new C17146b<Integer>() {
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ void mo24986a(Object obj) {
                }
            }).mo44416a((C17145a) new C17145a() {
                /* renamed from: a */
                public final void mo24985a(Exception exc) {
                    bVar.f27874a = 4;
                    C10259a.m30394c(bVar.f27876c);
                    if (exc instanceof SplitInstallException) {
                        SplitInstallException splitInstallException = (SplitInstallException) exc;
                        C10259a.m30392a(bVar.f27876c, splitInstallException.getErrorCode(), splitInstallException.getMessage());
                        return;
                    }
                    C10259a.m30392a(bVar.f27876c, -1, "网络出错!");
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo24983a(C10249a aVar) {
        if (aVar.f27859b == null) {
            m30392a(aVar, -1, "GooglePlayEngine初始化需要Context!");
            return;
        }
        if (this.f27879a == null) {
            this.f27879a = C17134d.m56791a(aVar.f27859b.getApplicationContext());
        }
        Set b = mo24984b(aVar);
        List<String> list = aVar.f27858a;
        if (list == null || list.isEmpty()) {
            m30395d(aVar);
            return;
        }
        list.removeAll(b);
        if (list.isEmpty()) {
            m30395d(aVar);
            return;
        }
        boolean z = false;
        ArrayList<C10258b> arrayList = new ArrayList<>();
        for (String str : list) {
            C10249a a = m30390a(str);
            if (a == null) {
                C10258b bVar = new C10258b(str);
                aVar.mo24976a(bVar);
                arrayList.add(bVar);
                z = true;
            } else {
                a.f27859b = aVar.f27859b;
                C10258b a2 = m30391a(a, str);
                if (a2.f27874a == 1) {
                    m30396e(a2.f27876c);
                } else {
                    a2.f27874a = 1;
                    arrayList.add(a2);
                }
            }
        }
        if (z) {
            this.f27880b.add(aVar);
        }
        for (C10258b a3 : arrayList) {
            m30393a(a3);
        }
    }

    /* renamed from: a */
    private static C10258b m30391a(C10249a aVar, String str) {
        if (aVar == null || aVar.f27864g == null || aVar.f27864g.isEmpty()) {
            return null;
        }
        for (C10258b bVar : aVar.f27864g) {
            if (bVar.f27875b != null && bVar.f27875b.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m30392a(C10249a aVar, int i, String str) {
        if (aVar != null && aVar.f27862e != null) {
            aVar.mo24975a();
        }
    }
}
