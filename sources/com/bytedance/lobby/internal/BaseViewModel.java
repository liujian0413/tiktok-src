package com.bytedance.lobby.internal;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.LiveData;

public abstract class BaseViewModel<T> extends AndroidViewModel {

    /* renamed from: b */
    private C0052o<T> f32496b = new C0052o<>();

    /* renamed from: h */
    public LiveData<T> mo29959h() {
        return this.f32496b;
    }

    /* renamed from: b */
    public void mo29956b(T t) {
        this.f32496b.setValue(t);
    }

    BaseViewModel(Application application) {
        super(application);
    }
}
