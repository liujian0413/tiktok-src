package com.p280ss.android.http.legacy.p877d;

import com.p280ss.android.http.legacy.p876c.C19570a;
import com.p280ss.android.ttve.nativePort.TEVideoRecorder;

/* renamed from: com.ss.android.http.legacy.d.b */
public final class C19574b {

    /* renamed from: a */
    public char[] f52946a;

    /* renamed from: b */
    public int f52947b;

    /* renamed from: a */
    public final void mo51736a() {
        this.f52947b = 0;
    }

    public final String toString() {
        return new String(this.f52946a, 0, this.f52947b);
    }

    /* renamed from: a */
    public final char mo51734a(int i) {
        return this.f52946a[i];
    }

    /* renamed from: a */
    public final void mo51738a(Object obj) {
        mo51739a(String.valueOf(obj));
    }

    /* renamed from: b */
    public final void mo51741b(int i) {
        if (i > this.f52946a.length - this.f52947b) {
            m64483c(this.f52947b + i);
        }
    }

    public C19574b(int i) {
        if (i >= 0) {
            this.f52946a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }

    /* renamed from: c */
    private void m64483c(int i) {
        char[] cArr = new char[Math.max(this.f52946a.length << 1, i)];
        System.arraycopy(this.f52946a, 0, cArr, 0, this.f52947b);
        this.f52946a = cArr;
    }

    /* renamed from: a */
    public final void mo51737a(char c) {
        int i = this.f52947b + 1;
        if (i > this.f52946a.length) {
            m64483c(i);
        }
        this.f52946a[this.f52947b] = c;
        this.f52947b = i;
    }

    /* renamed from: a */
    public final void mo51739a(String str) {
        if (str == null) {
            str = TEVideoRecorder.FACE_BEAUTY_NULL;
        }
        int length = str.length();
        int i = this.f52947b + length;
        if (i > this.f52946a.length) {
            m64483c(i);
        }
        str.getChars(0, length, this.f52946a, this.f52947b);
        this.f52947b = i;
    }

    /* renamed from: a */
    public final String mo51735a(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f52947b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            return new String(this.f52946a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: b */
    public final String mo51740b(int i, int i2) {
        if (i < 0) {
            throw new IndexOutOfBoundsException();
        } else if (i2 > this.f52947b) {
            throw new IndexOutOfBoundsException();
        } else if (i <= i2) {
            while (i < i2 && C19570a.m64475a(this.f52946a[i])) {
                i++;
            }
            while (i2 > i && C19570a.m64475a(this.f52946a[i2 - 1])) {
                i2--;
            }
            return new String(this.f52946a, i, i2 - i);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
