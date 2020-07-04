package android.support.p022v4.media.session;

import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* renamed from: android.support.v4.media.session.MediaSessionCompatApi24 */
final class MediaSessionCompatApi24 {

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi24$Callback */
    public interface Callback extends android.support.p022v4.media.session.MediaSessionCompatApi23.Callback {
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompatApi24$a */
    static class C0858a<T extends Callback> extends C0857a<T> {
        public final void onPrepare() {
        }

        public C0858a(T t) {
            super(t);
        }

        public final void onPrepareFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
        }

        public final void onPrepareFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
        }

        public final void onPrepareFromUri(Uri uri, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
        }
    }

    /* renamed from: a */
    public static Object m3679a(Callback callback) {
        return new C0858a(callback);
    }

    /* renamed from: a */
    public static String m3680a(Object obj) {
        MediaSession mediaSession = (MediaSession) obj;
        try {
            return (String) mediaSession.getClass().getMethod("getCallingPackage", new Class[0]).invoke(mediaSession, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
