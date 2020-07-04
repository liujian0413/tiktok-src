package android.support.p022v4.media.session;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: android.support.v4.media.session.MediaSessionCompatApi23 */
final class MediaSessionCompatApi23 {

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi23$Callback */
    public interface Callback extends C0868a {
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi23$a */
    static class C0857a<T extends Callback> extends C0869b<T> {
        public C0857a(T t) {
            super(t);
        }

        public void onPlayFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
        }
    }

    /* renamed from: a */
    public static Object m3678a(Callback callback) {
        return new C0857a(callback);
    }
}
