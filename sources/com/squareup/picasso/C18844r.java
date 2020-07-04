package com.squareup.picasso;

import android.net.NetworkInfo;
import com.squareup.picasso.Picasso.Priority;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.squareup.picasso.r */
final class C18844r extends ThreadPoolExecutor {

    /* renamed from: com.squareup.picasso.r$a */
    static final class C18845a extends FutureTask<C18815c> implements Comparable<C18845a> {

        /* renamed from: a */
        private final C18815c f50789a;

        public C18845a(C18815c cVar) {
            super(cVar, null);
            this.f50789a = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public int compareTo(C18845a aVar) {
            Priority priority = this.f50789a.f50724s;
            Priority priority2 = aVar.f50789a.f50724s;
            if (priority == priority2) {
                return this.f50789a.f50706a - aVar.f50789a.f50706a;
            }
            return priority2.ordinal() - priority.ordinal();
        }
    }

    C18844r() {
        super(3, 3, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new C18813e());
    }

    /* renamed from: a */
    private void m61542a(int i) {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    public final Future<?> submit(Runnable runnable) {
        C18845a aVar = new C18845a((C18815c) runnable);
        execute(aVar);
        return aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo50066a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnectedOrConnecting()) {
            m61542a(3);
            return;
        }
        int type = networkInfo.getType();
        if (!(type == 6 || type == 9)) {
            switch (type) {
                case 0:
                    int subtype = networkInfo.getSubtype();
                    switch (subtype) {
                        case 1:
                        case 2:
                            m61542a(1);
                            return;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            break;
                        default:
                            switch (subtype) {
                                case 12:
                                    break;
                                case 13:
                                case 14:
                                case 15:
                                    m61542a(3);
                                    return;
                                default:
                                    m61542a(3);
                                    return;
                            }
                    }
                    m61542a(2);
                    return;
                case 1:
                    break;
                default:
                    m61542a(3);
                    return;
            }
        }
        m61542a(4);
    }
}
