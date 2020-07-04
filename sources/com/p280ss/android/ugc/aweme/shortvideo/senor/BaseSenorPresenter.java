package com.p280ss.android.ugc.aweme.shortvideo.senor;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.hardware.SensorManager;
import android.util.SparseArray;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.senor.BaseSenorPresenter */
public abstract class BaseSenorPresenter implements ISenorPresenter {

    /* renamed from: a */
    private SensorManager f104729a;

    /* renamed from: b */
    protected SparseArray<Integer> f104730b = new SparseArray<>();

    /* renamed from: c */
    private List<C40328a> f104731c;

    /* renamed from: d */
    private Context f104732d;

    /* renamed from: e */
    private boolean f104733e;

    /* renamed from: b */
    public void mo96375b() {
        this.f104733e = true;
    }

    /* renamed from: c */
    public final boolean mo100157c() {
        return this.f104733e;
    }

    /* renamed from: d */
    public final SensorManager mo100158d() {
        return this.f104729a;
    }

    /* renamed from: e */
    public final Context mo100159e() {
        return this.f104732d;
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void unRegister() {
        this.f104733e = false;
        for (C40328a unregisterListener : this.f104731c) {
            this.f104729a.unregisterListener(unregisterListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100154a(C40328a aVar) {
        this.f104731c.add(aVar);
    }

    /* renamed from: a */
    public final void mo100155a(boolean z) {
        for (C40328a aVar : this.f104731c) {
            aVar.f104736a = z;
        }
    }

    /* renamed from: a */
    public final void mo100153a(int i, int i2) {
        if (i != 0) {
            this.f104730b.put(i, Integer.valueOf(0));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo100156b(int i, int i2) {
        Integer num = (Integer) this.f104730b.get(i);
        if (num == null) {
            return i2;
        }
        return num.intValue();
    }

    public BaseSenorPresenter(Context context, final C0043i iVar) {
        this.f104732d = context;
        this.f104731c = new CopyOnWriteArrayList();
        this.f104729a = (SensorManager) context.getSystemService("sensor");
        C6726a.m20844b(new Runnable() {
            public final void run() {
                iVar.getLifecycle().mo55a(BaseSenorPresenter.this);
            }
        });
    }
}
