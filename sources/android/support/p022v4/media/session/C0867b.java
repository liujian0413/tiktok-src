package android.support.p022v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.Rating;
import android.media.session.MediaSession;
import android.media.session.MediaSession.Callback;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.os.ResultReceiver;

/* renamed from: android.support.v4.media.session.b */
final class C0867b {

    /* renamed from: android.support.v4.media.session.b$a */
    interface C0868a {
        /* renamed from: a */
        void mo3207a(Object obj);

        /* renamed from: a */
        void mo3208a(String str, Bundle bundle);

        /* renamed from: a */
        void mo3209a(String str, Bundle bundle, ResultReceiver resultReceiver);

        /* renamed from: a */
        boolean mo3210a(Intent intent);
    }

    /* renamed from: android.support.v4.media.session.b$b */
    static class C0869b<T extends C0868a> extends Callback {

        /* renamed from: a */
        protected final T f3092a;

        public void onFastForward() {
        }

        public void onPause() {
        }

        public void onPlay() {
        }

        public void onRewind() {
        }

        public void onSeekTo(long j) {
        }

        public void onSkipToNext() {
        }

        public void onSkipToPrevious() {
        }

        public void onSkipToQueueItem(long j) {
        }

        public void onStop() {
        }

        public C0869b(T t) {
            this.f3092a = t;
        }

        public void onSetRating(Rating rating) {
            this.f3092a.mo3207a((Object) rating);
        }

        public boolean onMediaButtonEvent(Intent intent) {
            if (this.f3092a.mo3210a(intent) || super.onMediaButtonEvent(intent)) {
                return true;
            }
            return false;
        }

        public void onPlayFromMediaId(String str, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
        }

        public void onPlayFromSearch(String str, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
        }

        public void onCustomAction(String str, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
            this.f3092a.mo3208a(str, bundle);
        }

        public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
            MediaSessionCompat.m3530a(bundle);
            this.f3092a.mo3209a(str, bundle, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.b$c */
    static class C0870c {
        /* renamed from: a */
        public static Object m3716a(Object obj) {
            return ((QueueItem) obj).getDescription();
        }

        /* renamed from: b */
        public static long m3717b(Object obj) {
            return ((QueueItem) obj).getQueueId();
        }
    }

    /* renamed from: b */
    public static Parcelable m3711b(Object obj) {
        return ((MediaSession) obj).getSessionToken();
    }

    /* renamed from: a */
    public static Object m3707a(C0868a aVar) {
        return new C0869b(aVar);
    }

    /* renamed from: a */
    public static Object m3708a(Object obj) {
        if (obj instanceof Token) {
            return obj;
        }
        throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
    }

    /* renamed from: a */
    public static Object m3706a(Context context, String str) {
        return new MediaSession(context, str);
    }

    /* renamed from: a */
    public static void m3709a(Object obj, PendingIntent pendingIntent) {
        ((MediaSession) obj).setMediaButtonReceiver(pendingIntent);
    }

    /* renamed from: a */
    public static void m3710a(Object obj, Object obj2, Handler handler) {
        ((MediaSession) obj).setCallback((Callback) obj2, handler);
    }
}
