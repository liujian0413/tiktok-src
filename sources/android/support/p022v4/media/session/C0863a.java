package android.support.p022v4.media.session;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaController.Callback;
import android.media.session.MediaController.PlaybackInfo;
import android.media.session.MediaSession.QueueItem;
import android.media.session.MediaSession.Token;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
final class C0863a {

    /* renamed from: android.support.v4.media.session.a$a */
    public interface C0864a {
        /* renamed from: a */
        void mo3179a();

        /* renamed from: a */
        void mo3180a(int i, int i2, int i3, int i4, int i5);

        /* renamed from: a */
        void mo3181a(Bundle bundle);

        /* renamed from: a */
        void mo3182a(CharSequence charSequence);

        /* renamed from: a */
        void mo3183a(Object obj);

        /* renamed from: a */
        void mo3184a(String str, Bundle bundle);

        /* renamed from: a */
        void mo3185a(List<?> list);

        /* renamed from: b */
        void mo3186b(Object obj);
    }

    /* renamed from: android.support.v4.media.session.a$b */
    static class C0865b<T extends C0864a> extends Callback {

        /* renamed from: a */
        protected final T f3091a;

        public final void onSessionDestroyed() {
            this.f3091a.mo3179a();
        }

        public C0865b(T t) {
            this.f3091a = t;
        }

        public final void onMetadataChanged(MediaMetadata mediaMetadata) {
            this.f3091a.mo3186b(mediaMetadata);
        }

        public final void onPlaybackStateChanged(PlaybackState playbackState) {
            this.f3091a.mo3183a((Object) playbackState);
        }

        public final void onQueueChanged(List<QueueItem> list) {
            this.f3091a.mo3185a(list);
        }

        public final void onQueueTitleChanged(CharSequence charSequence) {
            this.f3091a.mo3182a(charSequence);
        }

        public final void onExtrasChanged(Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
            this.f3091a.mo3181a(bundle);
        }

        public final void onAudioInfoChanged(PlaybackInfo playbackInfo) {
            this.f3091a.mo3180a(playbackInfo.getPlaybackType(), C0866c.m3704a((Object) playbackInfo), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume());
        }

        public final void onSessionEvent(String str, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
            this.f3091a.mo3184a(str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.a$c */
    public static class C0866c {
        /* renamed from: b */
        private static AudioAttributes m3705b(Object obj) {
            return ((PlaybackInfo) obj).getAudioAttributes();
        }

        /* renamed from: a */
        public static int m3704a(Object obj) {
            return m3703a(m3705b(obj));
        }

        /* renamed from: a */
        private static int m3703a(AudioAttributes audioAttributes) {
            if ((audioAttributes.getFlags() & 1) == 1) {
                return 7;
            }
            if ((audioAttributes.getFlags() & 4) == 4) {
                return 6;
            }
            switch (audioAttributes.getUsage()) {
                case 1:
                case 11:
                case 12:
                case 14:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 13:
                    return 1;
                default:
                    return 3;
            }
        }
    }

    /* renamed from: a */
    public static Object m3692a(C0864a aVar) {
        return new C0865b(aVar);
    }

    /* renamed from: a */
    public static Object m3691a(Context context, Object obj) {
        return new MediaController(context, (Token) obj);
    }

    /* renamed from: a */
    public static boolean m3694a(Object obj, KeyEvent keyEvent) {
        return ((MediaController) obj).dispatchMediaButtonEvent(keyEvent);
    }

    /* renamed from: a */
    public static void m3693a(Object obj, String str, Bundle bundle, ResultReceiver resultReceiver) {
        ((MediaController) obj).sendCommand(str, bundle, resultReceiver);
    }
}
