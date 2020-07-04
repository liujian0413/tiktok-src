package com.bytedance.jedi.arch;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0064v;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.Fragment;
import java.io.Serializable;
import kotlin.C7541d;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

public class lifecycleAwareLazy<T extends C0063u> implements C0042h, Serializable, C7541d<T> {
    private volatile Object _value;
    private C7561a<? extends T> initializer;
    private final C7561a<String> keyFactory;
    private final lifecycleAwareLazy<T> lock;
    private final C0043i owner;

    public static /* synthetic */ void value$annotations() {
    }

    public boolean isInitialized() {
        if (this._value != C11495ad.f31093a) {
            return true;
        }
        return false;
    }

    public String toString() {
        if (isInitialized()) {
            return getValue().toString();
        }
        return "Lazy value not initialized yet.";
    }

    public T getValue() {
        T t;
        T t2 = this._value;
        if (t2 == C11495ad.f31093a) {
            synchronized (this.lock) {
                T t3 = this._value;
                if (t3 == C11495ad.f31093a) {
                    C7561a<? extends T> aVar = this.initializer;
                    if (aVar == null) {
                        C7573i.m23580a();
                    }
                    t = (C0063u) aVar.invoke();
                    this._value = t;
                    this.initializer = null;
                } else if (t3 != null) {
                    t = (C0063u) t3;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type T");
                }
            }
            return t;
        } else if (t2 != null) {
            return (C0063u) t2;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type T");
        }
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public final void onStart() {
        if (!isInitialized()) {
            getValue();
        }
        if (this.keyFactory == null) {
            this.owner.getLifecycle().mo56b(this);
        } else {
            ensureViewModel(this.owner, getValue(), this.keyFactory);
        }
    }

    public lifecycleAwareLazy(C0043i iVar, C7561a<? extends T> aVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(aVar, "initializer");
        this(iVar, null, aVar);
    }

    /* access modifiers changed from: protected */
    public void ensureViewModel(C0043i iVar, T t, C7561a<String> aVar) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(t, "value");
        C7573i.m23587b(aVar, "keyFactory");
        C0064v.m149a((Fragment) iVar, t, aVar);
    }

    public lifecycleAwareLazy(C0043i iVar, C7561a<String> aVar, C7561a<? extends T> aVar2) {
        C7573i.m23587b(iVar, "owner");
        C7573i.m23587b(aVar2, "initializer");
        this.owner = iVar;
        this.keyFactory = aVar;
        this.initializer = aVar2;
        this._value = C11495ad.f31093a;
        this.lock = this;
        this.owner.getLifecycle().mo55a(this);
    }
}
