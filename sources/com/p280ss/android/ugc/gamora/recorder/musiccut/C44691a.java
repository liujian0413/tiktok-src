package com.p280ss.android.ugc.gamora.recorder.musiccut;

/* renamed from: com.ss.android.ugc.gamora.recorder.musiccut.a */
public final class C44691a {

    /* renamed from: a */
    public final int f115060a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C44691a) {
                if (this.f115060a == ((C44691a) obj).f115060a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f115060a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MusicCutResult(musicStart=");
        sb.append(this.f115060a);
        sb.append(")");
        return sb.toString();
    }

    public C44691a(int i) {
        this.f115060a = i;
    }
}
