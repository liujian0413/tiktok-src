package com.bytedance.android.livesdk.feed.roomdetector;

import com.bytedance.android.livesdk.feed.roomdetector.C6106a.C6107a;
import com.bytedance.android.livesdk.feed.roomdetector.C6108b.C6109a;

/* renamed from: com.bytedance.android.livesdk.feed.roomdetector.e */
public final class C6112e implements C6106a, C6109a {

    /* renamed from: a */
    private C6108b f18051a;

    /* renamed from: b */
    private C6107a f18052b;

    /* renamed from: a */
    public final void mo14766a() {
        this.f18051a.mo14768a();
    }

    /* renamed from: b */
    public final void mo14767b() {
        this.f18051a.mo14771b();
    }

    /* renamed from: c */
    public final boolean mo14774c() {
        if (this.f18052b == null || !this.f18052b.mo14469a()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo14775d() {
        if (this.f18052b != null) {
            this.f18052b.mo14470b();
        }
    }

    /* renamed from: e */
    public final void mo14776e() {
        if (this.f18052b != null) {
            this.f18052b.mo14471c();
        }
    }

    /* renamed from: a */
    public final void mo14772a(int i) {
        if (this.f18052b != null) {
            this.f18052b.mo14467a(i);
        }
    }

    /* renamed from: a */
    public final void mo14773a(long j, long j2) {
        if (this.f18052b != null) {
            this.f18052b.mo14468a(j, j2);
        }
    }

    public C6112e(long j, long j2, boolean z, C6107a aVar) {
        C6108b bVar = new C6108b(j, j2, "", true, this);
        this.f18051a = bVar;
        this.f18052b = aVar;
    }
}
