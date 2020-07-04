package com.snapchat.kit.sdk.core.metrics;

import com.snapchat.kit.sdk.core.metrics.MetricPublisher.PublishCallback;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.snapchat.kit.sdk.core.metrics.a */
public final class C18653a<T> implements MetricQueue<T> {

    /* renamed from: a */
    final Runnable f50413a = new Runnable() {
        public final void run() {
            C18653a.this.mo48907b();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final MetricPublisher<T> f50414b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ScheduledExecutorService f50415c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final LinkedHashSet<C18664b<T>> f50416d = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final LinkedHashSet<C18664b<T>> f50417e = new LinkedHashSet<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final AtomicReference<Future<?>> f50418f = new AtomicReference<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final int f50419g;

    /* renamed from: a */
    public final void mo48906a() {
        this.f50415c.execute(new Runnable() {
            public final void run() {
                List persistedEvents = C18653a.this.f50414b.getPersistedEvents();
                if (persistedEvents != null && !persistedEvents.isEmpty()) {
                    C18653a.this.f50416d.addAll(persistedEvents);
                    C18653a.this.f50418f.set(C18653a.this.f50415c.schedule(C18653a.this.f50413a, 1000, TimeUnit.MILLISECONDS));
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m61171c() {
        ArrayList arrayList = new ArrayList(this.f50416d);
        arrayList.addAll(this.f50417e);
        this.f50414b.persistMetrics(arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo48907b() {
        Future future = (Future) this.f50418f.getAndSet(null);
        if (future != null) {
            future.cancel(false);
        }
        if (!this.f50416d.isEmpty()) {
            final ArrayList arrayList = new ArrayList(this.f50416d);
            this.f50416d.clear();
            this.f50417e.addAll(arrayList);
            this.f50414b.publishMetrics(m61168a((Collection<C18664b<T>>) arrayList), new PublishCallback() {
                public final void onNetworkError() {
                    C18653a.this.f50415c.execute(new Runnable() {
                        public final void run() {
                            C18653a.this.f50417e.removeAll(arrayList);
                            C18653a.this.f50416d.addAll(arrayList);
                        }
                    });
                }

                public final void onSuccess() {
                    C18653a.this.f50415c.execute(new Runnable() {
                        public final void run() {
                            C18653a.this.f50417e.removeAll(arrayList);
                            C18653a.this.m61171c();
                        }
                    });
                }

                public final void onServerError(final Error error) {
                    C18653a.this.f50415c.execute(new Runnable() {
                        public final void run() {
                            C18653a.this.f50417e.removeAll(arrayList);
                            for (C18664b bVar : arrayList) {
                                if (bVar.f50438a <= 0) {
                                    bVar.mo48916a();
                                    C18653a.this.f50416d.add(bVar);
                                }
                            }
                            C18653a.this.m61171c();
                        }
                    });
                }
            });
        }
    }

    public final void push(final T t) {
        this.f50415c.execute(new Runnable() {
            public final void run() {
                C18653a.this.f50416d.add(new C18664b(t));
                C18653a.this.m61171c();
                if (C18653a.this.f50416d.size() >= C18653a.this.f50419g) {
                    C18653a.this.mo48907b();
                    return;
                }
                if (C18653a.this.f50418f.get() == null) {
                    C18653a.this.f50418f.set(C18653a.this.f50415c.schedule(C18653a.this.f50413a, 30000, TimeUnit.MILLISECONDS));
                }
            }
        });
    }

    /* renamed from: a */
    private static <T> List<T> m61168a(Collection<C18664b<T>> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (C18664b bVar : collection) {
            arrayList.add(bVar.f50439b);
        }
        return arrayList;
    }

    C18653a(MetricPublisher<T> metricPublisher, ScheduledExecutorService scheduledExecutorService, int i) {
        this.f50414b = metricPublisher;
        this.f50415c = scheduledExecutorService;
        this.f50419g = 1;
    }
}
