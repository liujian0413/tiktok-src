package android.support.p022v4.media;

import android.media.browse.MediaBrowser.MediaItem;
import android.os.Bundle;
import android.support.p022v4.media.session.MediaSessionCompat;
import java.util.List;

/* renamed from: android.support.v4.media.b */
final class C0800b {

    /* renamed from: android.support.v4.media.b$a */
    interface C0801a extends C0798d {
        /* renamed from: a */
        void mo3020a(String str, List<?> list, Bundle bundle);
    }

    /* renamed from: android.support.v4.media.b$b */
    static class C0802b<T extends C0801a> extends C0799e<T> {
        C0802b(T t) {
            super(t);
        }

        public final void onError(String str, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
        }

        public final void onChildrenLoaded(String str, List<MediaItem> list, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
            ((C0801a) this.f2939a).mo3020a(str, list, bundle);
        }
    }

    /* renamed from: a */
    static Object m3337a(C0801a aVar) {
        return new C0802b(aVar);
    }
}
