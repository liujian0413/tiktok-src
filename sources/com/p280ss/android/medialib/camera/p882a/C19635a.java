package com.p280ss.android.medialib.camera.p882a;

import com.p280ss.android.medialib.camera.IESCameraInterface;
import com.p280ss.android.medialib.camera.p882a.C19636b.C19637a;
import com.p280ss.android.medialib.presenter.C19763c;

/* renamed from: com.ss.android.medialib.camera.a.a */
public abstract class C19635a implements C19636b {

    /* renamed from: a */
    protected C19763c f53150a;

    /* renamed from: b */
    protected IESCameraInterface f53151b;

    /* renamed from: c */
    protected C19637a f53152c;

    /* renamed from: d */
    protected boolean f53153d;

    /* renamed from: e */
    protected Object f53154e = new Object();

    /* renamed from: f */
    protected int f53155f = 0;

    /* renamed from: g */
    protected int f53156g = -1;

    /* renamed from: a */
    public final void mo52261a(C19637a aVar) {
        this.f53152c = aVar;
    }

    /* renamed from: a */
    public final void mo52262a(C19763c cVar) {
        this.f53150a = cVar;
    }

    public C19635a(IESCameraInterface iESCameraInterface) {
        this.f53151b = iESCameraInterface;
    }
}
