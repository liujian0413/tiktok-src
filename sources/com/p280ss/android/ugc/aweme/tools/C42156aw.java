package com.p280ss.android.ugc.aweme.tools;

import com.taobao.android.dexposed.ClassUtils;
import java.io.PrintWriter;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.aweme.tools.aw */
public final class C42156aw {

    /* renamed from: a */
    private final List<C42161ba> f109686a;

    /* renamed from: b */
    private final Map<Type, C42159az<?>> f109687b = new ConcurrentHashMap();

    /* renamed from: c */
    private boolean f109688c;

    /* renamed from: d */
    private final boolean f109689d;

    /* renamed from: e */
    private final PrintWriter f109690e;

    /* renamed from: a */
    public final void mo103593a(boolean z) {
        this.f109688c = false;
        if (this.f109689d) {
            PrintWriter printWriter = this.f109690e;
            StringBuilder sb = new StringBuilder("set enabled to ");
            sb.append(false);
            printWriter.println(sb.toString());
        }
    }

    /* renamed from: a */
    private <T extends C42155av> C42159az<T> m134113a(Type type) {
        C42159az azVar;
        C42159az<T> azVar2 = (C42159az) this.f109687b.get(type);
        if (azVar2 != null) {
            return azVar2;
        }
        for (C42161ba a : this.f109686a) {
            C42159az a2 = a.mo96095a(this, type);
            if (a2 != null) {
                if (this.f109689d) {
                    azVar = new C42134aa(a2, this.f109690e);
                } else {
                    azVar = a2;
                }
                this.f109687b.put(type, azVar);
                return azVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final <T extends C42155av> C42159az<T> mo103592a(C42161ba baVar, Type type) {
        C42159az azVar;
        boolean z = false;
        for (C42161ba baVar2 : this.f109686a) {
            if (z) {
                C42159az a = baVar2.mo96095a(this, type);
                if (a != null) {
                    if (this.f109689d) {
                        azVar = new C42134aa(a, this.f109690e);
                    } else {
                        azVar = a;
                    }
                    return azVar;
                }
            } else if (baVar2 == baVar) {
                z = true;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final boolean mo103594a(Object obj, C42155av avVar) {
        if (!this.f109688c) {
            if (this.f109689d) {
                PrintWriter printWriter = this.f109690e;
                StringBuilder sb = new StringBuilder("Ignoring event ");
                sb.append(avVar);
                sb.append(" from ");
                sb.append(obj);
                sb.append(ClassUtils.PACKAGE_SEPARATOR);
                printWriter.println(sb.toString());
            }
            return false;
        }
        C42159az a = m134113a((Type) avVar.getClass());
        if (a != null) {
            a.mo96096a(obj, avVar);
            return true;
        }
        if (this.f109689d) {
            PrintWriter printWriter2 = this.f109690e;
            StringBuilder sb2 = new StringBuilder("Did not find a UiEventHandler corresponding to ");
            sb2.append(avVar);
            sb2.append(ClassUtils.PACKAGE_SEPARATOR);
            printWriter2.println(sb2.toString());
        }
        return false;
    }

    C42156aw(List<C42161ba> list, boolean z, PrintWriter printWriter) {
        this.f109686a = list;
        this.f109688c = true;
        this.f109689d = z;
        this.f109690e = printWriter;
    }
}
