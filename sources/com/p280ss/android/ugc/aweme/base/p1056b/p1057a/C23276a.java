package com.p280ss.android.ugc.aweme.base.p1056b.p1057a;

import com.p280ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.ss.android.ugc.aweme.base.b.a.a */
public class C23276a<T> {

    /* renamed from: a */
    public final String f61308a;

    /* renamed from: b */
    public final T[] f61309b;

    /* renamed from: a */
    public final T mo60564a() {
        if (mo60565b()) {
            return this.f61309b[0];
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo60565b() {
        if (this.f61309b == null || this.f61309b.length == 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("action = [");
        sb.append(this.f61308a);
        sb.append("], args = ");
        if (this.f61309b != null) {
            sb.append("[");
            for (int i = 0; i < this.f61309b.length; i++) {
                sb.append(this.f61309b[i]);
                if (i != this.f61309b.length - 1) {
                    sb.append(",");
                }
            }
            sb.append("]");
        } else {
            sb.append(TEVideoRecorder.FACE_BEAUTY_NULL);
        }
        return sb.toString();
    }

    protected C23276a(String str) {
        this.f61308a = str;
    }

    protected C23276a(String str, T... tArr) {
        this.f61308a = str;
        this.f61309b = tArr;
    }
}
