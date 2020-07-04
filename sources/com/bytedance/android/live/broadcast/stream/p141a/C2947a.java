package com.bytedance.android.live.broadcast.stream.p141a;

import com.bytedance.android.live.broadcast.stream.p141a.C2954c.C2955a;
import com.bytedance.android.live.broadcast.stream.p141a.p142a.C2948a;
import com.p280ss.avframework.livestreamv2.effectcamera.render.EffectRender.OnRefreshFaceDataListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcast.stream.a.a */
public abstract class C2947a {

    /* renamed from: a */
    protected List<OnRefreshFaceDataListener> f9181a;

    /* renamed from: b */
    public C2957e f9182b;

    /* renamed from: c */
    protected C2958f f9183c;

    /* renamed from: a */
    public abstract int mo9675a(int i, int i2, int i3, String str);

    /* renamed from: a */
    public abstract void mo9676a();

    /* renamed from: a */
    public abstract void mo9677a(C2948a aVar);

    /* renamed from: a */
    public abstract void mo9678a(C2955a aVar);

    /* renamed from: b */
    public abstract void mo9681b();

    /* renamed from: c */
    public abstract void mo9683c();

    /* renamed from: d */
    public abstract int mo9684d();

    /* renamed from: e */
    public abstract int mo9685e();

    /* renamed from: a */
    public final synchronized void mo9679a(C2958f fVar) {
        this.f9183c = fVar;
    }

    /* renamed from: b */
    public final synchronized void mo9682b(OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.f9181a != null) {
            for (int size = this.f9181a.size() - 1; size > 0; size--) {
                if (this.f9181a.get(size) == onRefreshFaceDataListener) {
                    this.f9181a.remove(size);
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo9680a(OnRefreshFaceDataListener onRefreshFaceDataListener) {
        if (this.f9181a == null) {
            this.f9181a = new ArrayList();
        }
        this.f9181a.add(onRefreshFaceDataListener);
    }
}
