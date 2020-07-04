package com.bytedance.android.livesdkapi.p458j.p459a;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.bytedance.android.livesdkapi.j.a.b */
public final class C9491b {

    /* renamed from: a */
    public char[] f25982a;

    /* renamed from: b */
    public int f25983b;

    public final String toString() {
        return new String(this.f25982a, 0, this.f25983b);
    }

    public C9491b(int i) {
        if (i >= 0) {
            this.f25982a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: a */
    private void m28021a(int i) {
        char[] cArr = new char[Math.max(this.f25982a.length << 1, i)];
        System.arraycopy(this.f25982a, 0, cArr, 0, this.f25983b);
        this.f25982a = cArr;
    }

    /* renamed from: a */
    public final void mo23520a(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.f25983b + length;
        if (i > this.f25982a.length) {
            m28021a(i);
        }
        str.getChars(0, length, this.f25982a, this.f25983b);
        this.f25983b = i;
    }
}
