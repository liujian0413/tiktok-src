package com.p280ss.android.ugc.aweme.shortvideo.cover;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import bolts.C1592h;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.shortvideo.cover.C38632c.C38633a;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.vesdk.VEEditor.GET_FRAMES_FLAGS;
import com.p280ss.android.vesdk.VEListener.C45220p;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl */
public class VEVideoCoverGeneratorImpl implements C0042h, C38632c {

    /* renamed from: a */
    private int f100355a;

    /* renamed from: b */
    protected int f100356b;

    /* renamed from: c */
    private C15389d f100357c;

    /* renamed from: d */
    private int[] f100358d;

    /* renamed from: e */
    private final String f100359e = "VEVideoCoverGeneratorImpl";

    /* renamed from: a */
    public final int mo88418a() {
        return this.f100355a;
    }

    /* access modifiers changed from: 0000 */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f100357c.mo38883z();
    }

    /* renamed from: b */
    private static GET_FRAMES_FLAGS m123423b() {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isEnableGetThumbsWithEffect()) {
            return GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL;
        }
        return GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
    }

    /* renamed from: c */
    private void m123424c() {
        if (this.f100356b <= 0) {
            this.f100356b = this.f100357c.mo38860l();
        }
        if (this.f100358d == null) {
            this.f100358d = mo96645a(this.f100356b, this.f100355a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int[] mo96645a(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    /* renamed from: a */
    static final /* synthetic */ Void m123421a(C38633a aVar, AtomicInteger atomicInteger, Bitmap bitmap) throws Exception {
        aVar.mo96651a(atomicInteger.get(), bitmap);
        atomicInteger.incrementAndGet();
        return null;
    }

    public VEVideoCoverGeneratorImpl(C15389d dVar, C0043i iVar, int i) {
        iVar.getLifecycle().mo55a(this);
        this.f100357c = dVar;
        this.f100355a = i;
    }

    /* renamed from: a */
    public final void mo88419a(int i, int i2, C38633a aVar) {
        m123424c();
        m123422a(this.f100358d, i, i2, aVar);
    }

    /* renamed from: a */
    private void m123422a(int[] iArr, int i, int i2, C38633a aVar) {
        int i3;
        int i4;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        if (i2 > i && i != -1) {
            i4 = i;
            i3 = -1;
        } else if (i2 != -1) {
            i3 = i2;
            i4 = -1;
        } else {
            i4 = i;
            i3 = i2;
        }
        C38639i iVar = new C38639i(this, iArr, i4, i3, aVar, atomicInteger);
        C1592h.m7853a((Callable<TResult>) iVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo96647a(int[] iArr, int i, int i2, C38633a aVar, AtomicInteger atomicInteger) throws Exception {
        this.f100357c.mo38792a(iArr, i, i2, m123423b(), (C45220p) new C38640j(this, aVar, atomicInteger));
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ int mo96646a(C38633a aVar, AtomicInteger atomicInteger, byte[] bArr, int i, int i2, int i3, float f) {
        if (bArr != null) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i3, Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
            C1592h.m7855a((Callable<TResult>) new C38641k<TResult>(aVar, atomicInteger, createBitmap), C1592h.f5958b);
        } else {
            this.f100357c.mo38883z();
            if (atomicInteger.get() != this.f100355a) {
                StringBuilder sb = new StringBuilder("VEVideoCoverGeneratorImpl:取到的封面张数不符合预期，预期");
                sb.append(this.f100355a);
                sb.append("张，实际");
                sb.append(atomicInteger.get());
                sb.append("张");
                C41530am.m132283b(sb.toString());
            }
        }
        return 0;
    }
}
