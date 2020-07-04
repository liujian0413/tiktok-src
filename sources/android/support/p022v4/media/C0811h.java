package android.support.p022v4.media;

import android.media.session.MediaSessionManager.RemoteUserInfo;
import android.os.Build.VERSION;
import android.util.Log;

/* renamed from: android.support.v4.media.h */
public final class C0811h {

    /* renamed from: a */
    static final boolean f2945a = Log.isLoggable("MediaSessionManager", 3);

    /* renamed from: b */
    private static final Object f2946b = new Object();

    /* renamed from: android.support.v4.media.h$a */
    public static final class C0812a {

        /* renamed from: a */
        C0813b f2947a;

        public final int hashCode() {
            return this.f2947a.hashCode();
        }

        public C0812a(RemoteUserInfo remoteUserInfo) {
            this.f2947a = new C0816a(remoteUserInfo);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0812a)) {
                return false;
            }
            return this.f2947a.equals(((C0812a) obj).f2947a);
        }

        public C0812a(String str, int i, int i2) {
            if (VERSION.SDK_INT >= 28) {
                this.f2947a = new C0816a(str, i, i2);
            } else {
                this.f2947a = new C0818a(str, i, i2);
            }
        }
    }

    /* renamed from: android.support.v4.media.h$b */
    interface C0813b {
    }
}
