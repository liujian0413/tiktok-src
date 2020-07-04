package android.support.p022v4.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.support.p022v4.util.C0901h;

/* renamed from: android.support.v4.media.j */
final class C0815j extends C0814i {

    /* renamed from: android.support.v4.media.j$a */
    static final class C0816a implements C0813b {

        /* renamed from: a */
        final RemoteUserInfo f2948a;

        public final int hashCode() {
            return C0901h.m3835a(this.f2948a);
        }

        C0816a(RemoteUserInfo remoteUserInfo) {
            this.f2948a = remoteUserInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0816a)) {
                return false;
            }
            return this.f2948a.equals(((C0816a) obj).f2948a);
        }

        C0816a(String str, int i, int i2) {
            this.f2948a = new RemoteUserInfo(str, i, i2);
        }
    }
}
