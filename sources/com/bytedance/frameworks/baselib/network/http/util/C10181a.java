package com.bytedance.frameworks.baselib.network.http.util;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.a */
public final class C10181a {

    /* renamed from: a */
    public char[] f27713a = new char[32];

    /* renamed from: b */
    public int f27714b;

    public final String toString() {
        return new String(this.f27713a, 0, this.f27714b);
    }

    public C10181a(int i) {
    }

    /* renamed from: a */
    private void m30246a(int i) {
        char[] cArr = new char[Math.max(this.f27713a.length << 1, i)];
        System.arraycopy(this.f27713a, 0, cArr, 0, this.f27714b);
        this.f27713a = cArr;
    }

    /* renamed from: a */
    public final void mo24878a(char c) {
        int i = this.f27714b + 1;
        if (i > this.f27713a.length) {
            m30246a(i);
        }
        this.f27713a[this.f27714b] = ':';
        this.f27714b = i;
    }

    /* renamed from: a */
    public final void mo24879a(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.f27714b + length;
        if (i > this.f27713a.length) {
            m30246a(i);
        }
        str.getChars(0, length, this.f27713a, this.f27714b);
        this.f27714b = i;
    }
}
