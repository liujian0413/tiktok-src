package com.bytedance.jedi.arch.internal;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.Lifecycle.Event;
import android.arch.lifecycle.Lifecycle.State;
import com.bytedance.jedi.arch.C11668r;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7498y;
import p346io.reactivex.exceptions.ProtocolViolationException;
import p346io.reactivex.internal.observers.LambdaObserver;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p350f.C7332a;

public final class LifecycleAwareObserver<T> extends AtomicReference<C7321c> implements C0042h, C7321c, C7498y<T> {
    private final boolean alwaysDeliverLastValueWhenActivate;
    private final boolean force;
    private final AtomicBoolean isActive;
    private T lastValue;
    private C0043i owner;
    private C7498y<T> sourceObserver;
    private T undeliveredValue;

    /* renamed from: com.bytedance.jedi.arch.internal.LifecycleAwareObserver$a */
    static final class C11595a<T> implements C7326g<T> {

        /* renamed from: a */
        final /* synthetic */ C7562b f31266a;

        C11595a(C7562b bVar) {
            this.f31266a = bVar;
        }

        public final void accept(T t) {
            this.f31266a.invoke(t);
        }
    }

    private final void deactivate() {
        this.isActive.set(false);
    }

    public final void onComplete() {
        requireSourceObserver().onComplete();
    }

    public final boolean isDisposed() {
        if (((C7321c) get()) == C11623a.f31268a) {
            return true;
        }
        return false;
    }

    private final C0043i requireOwner() {
        C0043i iVar = this.owner;
        if (iVar != null) {
            return iVar;
        }
        throw new IllegalArgumentException("cannot access owner after destroy".toString());
    }

    private final C7498y<T> requireSourceObserver() {
        C7498y<T> yVar = this.sourceObserver;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalArgumentException("cannot access observer after destroy".toString());
    }

    public final void dispose() {
        C7321c cVar = (C7321c) get();
        C7321c cVar2 = C11623a.f31268a;
        if (cVar != cVar2) {
            C7321c cVar3 = (C7321c) getAndSet(cVar2);
            if (!(cVar3 == cVar2 || cVar3 == null)) {
                cVar3.dispose();
            }
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        requireOwner().getLifecycle().mo56b(this);
        if (!isDisposed()) {
            dispose();
        }
        this.owner = null;
        this.sourceObserver = null;
    }

    public final void onError(Throwable th) {
        C7573i.m23587b(th, "e");
        if (!isDisposed()) {
            lazySet(C11623a.f31268a);
            requireSourceObserver().onError(th);
        }
    }

    private final void activate(boolean z) {
        T t;
        if (!this.isActive.getAndSet(true) && !isDisposed()) {
            if (z || !this.alwaysDeliverLastValueWhenActivate || this.lastValue == null) {
                t = this.undeliveredValue;
            } else {
                t = this.lastValue;
            }
            this.undeliveredValue = null;
            if (t != null) {
                onNext(t);
            }
        }
    }

    @C0054q(mo125a = Event.ON_ANY)
    public final void onLifecycleEvent(C0043i iVar) {
        boolean z;
        C7573i.m23587b(iVar, "realOwner");
        Lifecycle lifecycle = iVar.getLifecycle();
        C7573i.m23582a((Object) lifecycle, "realOwner.lifecycle");
        if (lifecycle.mo54a().isAtLeast(State.STARTED)) {
            if (iVar instanceof C11668r) {
                z = ((C11668r) iVar).mo29190a();
            } else {
                z = true;
            }
            activate(z);
            return;
        }
        deactivate();
    }

    public final void onNext(T t) {
        if (this.force) {
            requireSourceObserver().onNext(t);
        } else if (this.isActive.get()) {
            requireSourceObserver().onNext(t);
        } else {
            this.undeliveredValue = t;
        }
        this.lastValue = t;
    }

    public final void onSubscribe(C7321c cVar) {
        C7573i.m23587b(cVar, "d");
        if (setOnce(this, cVar)) {
            requireOwner().getLifecycle().mo55a(this);
            requireSourceObserver().onSubscribe(this);
        }
    }

    private final boolean setOnce(AtomicReference<C7321c> atomicReference, C7321c cVar) {
        if (compareAndSet(null, cVar)) {
            return true;
        }
        cVar.dispose();
        if (((C7321c) atomicReference.get()) != C11623a.f31268a) {
            C7332a.m23029a((Throwable) new ProtocolViolationException("Disposable already set!"));
        }
        return false;
    }

    public LifecycleAwareObserver(C0043i iVar, boolean z, boolean z2, C7562b<? super T, C7581n> bVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(bVar, "onNext");
        this.alwaysDeliverLastValueWhenActivate = z;
        this.force = z2;
        this.owner = iVar;
        this.sourceObserver = new LambdaObserver(new C11595a(bVar), C7342a.f20432f, C7342a.f20429c, C7342a.m23058b());
        this.isActive = new AtomicBoolean(false);
    }

    public /* synthetic */ LifecycleAwareObserver(C0043i iVar, boolean z, boolean z2, C7562b bVar, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        this(iVar, z, z2, bVar);
    }
}
