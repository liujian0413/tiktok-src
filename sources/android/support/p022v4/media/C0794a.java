package android.support.p022v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.browse.MediaBrowser.ConnectionCallback;
import android.media.browse.MediaBrowser.MediaItem;
import android.media.browse.MediaBrowser.SubscriptionCallback;
import android.os.Bundle;
import java.util.List;

/* renamed from: android.support.v4.media.a */
final class C0794a {

    /* renamed from: android.support.v4.media.a$a */
    interface C0795a {
        /* renamed from: a */
        void mo2996a();

        /* renamed from: b */
        void mo2997b();

        /* renamed from: c */
        void mo2998c();
    }

    /* renamed from: android.support.v4.media.a$b */
    static class C0796b<T extends C0795a> extends ConnectionCallback {

        /* renamed from: a */
        protected final T f2938a;

        public final void onConnected() {
            this.f2938a.mo2996a();
        }

        public final void onConnectionFailed() {
            this.f2938a.mo2998c();
        }

        public final void onConnectionSuspended() {
            this.f2938a.mo2997b();
        }

        public C0796b(T t) {
            this.f2938a = t;
        }
    }

    /* renamed from: android.support.v4.media.a$c */
    static class C0797c {
        /* renamed from: a */
        public static int m3317a(Object obj) {
            return ((MediaItem) obj).getFlags();
        }

        /* renamed from: b */
        public static Object m3318b(Object obj) {
            return ((MediaItem) obj).getDescription();
        }
    }

    /* renamed from: android.support.v4.media.a$d */
    interface C0798d {
        /* renamed from: a */
        void mo3019a(String str, List<?> list);
    }

    /* renamed from: android.support.v4.media.a$e */
    static class C0799e<T extends C0798d> extends SubscriptionCallback {

        /* renamed from: a */
        protected final T f2939a;

        public void onError(String str) {
        }

        public C0799e(T t) {
            this.f2939a = t;
        }

        public void onChildrenLoaded(String str, List<MediaItem> list) {
            this.f2939a.mo3019a(str, list);
        }
    }

    /* renamed from: b */
    public static void m3311b(Object obj) {
        ((MediaBrowser) obj).disconnect();
    }

    /* renamed from: c */
    public static Bundle m3312c(Object obj) {
        return ((MediaBrowser) obj).getExtras();
    }

    /* renamed from: d */
    public static Object m3313d(Object obj) {
        return ((MediaBrowser) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m3308a(C0795a aVar) {
        return new C0796b(aVar);
    }

    /* renamed from: a */
    public static Object m3309a(C0798d dVar) {
        return new C0799e(dVar);
    }

    /* renamed from: a */
    public static void m3310a(Object obj) {
        ((MediaBrowser) obj).connect();
    }

    /* renamed from: a */
    public static Object m3307a(Context context, ComponentName componentName, Object obj, Bundle bundle) {
        return new MediaBrowser(context, componentName, (ConnectionCallback) obj, bundle);
    }
}
