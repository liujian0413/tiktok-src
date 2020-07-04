package android.support.p029v7.recyclerview.extensions;

import android.os.Handler;
import android.os.Looper;
import android.support.p029v7.util.C1143a;
import android.support.p029v7.util.C1143a.C1145a;
import android.support.p029v7.util.C1143a.C1146b;
import android.support.p029v7.util.C1151b;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: android.support.v7.recyclerview.extensions.c */
public final class C1138c<T> {

    /* renamed from: f */
    private static final Executor f4094f = new C1142a();

    /* renamed from: a */
    final C1135a<T> f4095a;

    /* renamed from: b */
    final Executor f4096b;

    /* renamed from: c */
    public List<T> f4097c = Collections.emptyList();

    /* renamed from: d */
    int f4098d;

    /* renamed from: e */
    private final C1151b f4099e;

    /* renamed from: g */
    private List<T> f4100g;

    /* renamed from: android.support.v7.recyclerview.extensions.c$a */
    static class C1142a implements Executor {

        /* renamed from: a */
        final Handler f4108a = new Handler(Looper.getMainLooper());

        C1142a() {
        }

        public final void execute(Runnable runnable) {
            this.f4108a.post(runnable);
        }
    }

    /* renamed from: a */
    public final void mo4538a(final List<T> list) {
        final int i = this.f4098d + 1;
        this.f4098d = i;
        if (list != this.f4100g) {
            if (list == null) {
                int size = this.f4100g.size();
                this.f4100g = null;
                this.f4097c = Collections.emptyList();
                this.f4099e.mo255b(0, size);
            } else if (this.f4100g == null) {
                this.f4100g = list;
                this.f4097c = Collections.unmodifiableList(list);
                this.f4099e.mo253a(0, list.size());
            } else {
                final List<T> list2 = this.f4100g;
                this.f4095a.f4087b.execute(new Runnable() {
                    public final void run() {
                        final C1146b a = C1143a.m5066a(new C1145a() {
                            /* renamed from: a */
                            public final int mo248a() {
                                return list2.size();
                            }

                            /* renamed from: b */
                            public final int mo250b() {
                                return list.size();
                            }

                            /* renamed from: a */
                            public final Object mo249a(int i, int i2) {
                                Object obj = list2.get(i);
                                Object obj2 = list.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1138c.this.f4095a.f4088c.mo4551c(obj, obj2);
                                }
                                throw new AssertionError();
                            }

                            /* renamed from: b */
                            public final boolean mo251b(int i, int i2) {
                                Object obj = list2.get(i);
                                Object obj2 = list.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1138c.this.f4095a.f4088c.mo4549a(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                return false;
                            }

                            /* renamed from: c */
                            public final boolean mo252c(int i, int i2) {
                                Object obj = list2.get(i);
                                Object obj2 = list.get(i2);
                                if (obj != null && obj2 != null) {
                                    return C1138c.this.f4095a.f4088c.mo4550b(obj, obj2);
                                }
                                if (obj == null && obj2 == null) {
                                    return true;
                                }
                                throw new AssertionError();
                            }
                        });
                        C1138c.this.f4096b.execute(new Runnable() {
                            public final void run() {
                                if (C1138c.this.f4098d == i) {
                                    C1138c.this.mo4539a(list, a);
                                }
                            }
                        });
                    }
                });
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4539a(List<T> list, C1146b bVar) {
        this.f4100g = list;
        this.f4097c = Collections.unmodifiableList(list);
        bVar.mo4547a(this.f4099e);
    }

    public C1138c(C1151b bVar, C1135a<T> aVar) {
        this.f4099e = bVar;
        this.f4095a = aVar;
        if (aVar.f4086a != null) {
            this.f4096b = aVar.f4086a;
        } else {
            this.f4096b = f4094f;
        }
    }
}
