package android.support.p022v4.media;

import android.media.MediaDescription;
import android.media.MediaDescription.Builder;
import android.net.Uri;

/* renamed from: android.support.v4.media.f */
final class C0808f {

    /* renamed from: android.support.v4.media.f$a */
    static class C0809a {
        /* renamed from: a */
        public static void m3359a(Object obj, Uri uri) {
            ((Builder) obj).setMediaUri(uri);
        }
    }

    /* renamed from: a */
    public static Uri m3358a(Object obj) {
        return ((MediaDescription) obj).getMediaUri();
    }
}
