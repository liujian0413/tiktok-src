package android.support.p022v4.media.session;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.RemoteControlClient.OnMetadataUpdateListener;
import android.media.RemoteControlClient.OnPlaybackPositionUpdateListener;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.p022v4.app.C0603f;
import android.support.p022v4.media.C0811h.C0812a;
import android.support.p022v4.media.C0819l;
import android.support.p022v4.media.C0819l.C0820a;
import android.support.p022v4.media.MediaDescriptionCompat;
import android.support.p022v4.media.MediaMetadataCompat;
import android.support.p022v4.media.RatingCompat;
import android.support.p022v4.media.session.IMediaSession.Stub;
import android.support.p022v4.media.session.MediaSessionCompatApi23.Callback;
import android.support.p022v4.media.session.PlaybackStateCompat.C0862a;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaSessionCompat */
public class MediaSessionCompat {

    /* renamed from: b */
    static int f2983b;

    /* renamed from: a */
    public final MediaControllerCompat f2984a;

    /* renamed from: c */
    private final C0844b f2985c;

    /* renamed from: d */
    private final ArrayList<Object> f2986d;

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem */
    public static final class QueueItem implements Parcelable {
        public static final Creator<QueueItem> CREATOR = new Creator<QueueItem>() {
            /* renamed from: a */
            private static QueueItem[] m3537a(int i) {
                return new QueueItem[i];
            }

            /* renamed from: a */
            private static QueueItem m3536a(Parcel parcel) {
                return new QueueItem(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3536a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m3537a(i);
            }
        };

        /* renamed from: a */
        public final MediaDescriptionCompat f2989a;

        /* renamed from: b */
        public final long f2990b;

        /* renamed from: c */
        private Object f2991c;

        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MediaSession.QueueItem {Description=");
            sb.append(this.f2989a);
            sb.append(", Id=");
            sb.append(this.f2990b);
            sb.append(" }");
            return sb.toString();
        }

        QueueItem(Parcel parcel) {
            this.f2989a = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f2990b = parcel.readLong();
        }

        /* renamed from: a */
        private static QueueItem m3534a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new QueueItem(obj, MediaDescriptionCompat.m3281a(C0870c.m3716a(obj)), C0870c.m3717b(obj));
        }

        /* renamed from: a */
        public static List<QueueItem> m3535a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Object a : list) {
                arrayList.add(m3534a(a));
            }
            return arrayList;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f2989a.writeToParcel(parcel, i);
            parcel.writeLong(this.f2990b);
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            } else if (j != -1) {
                this.f2989a = mediaDescriptionCompat;
                this.f2990b = j;
                this.f2991c = obj;
            } else {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Creator<ResultReceiverWrapper> CREATOR = new Creator<ResultReceiverWrapper>() {
            /* renamed from: a */
            private static ResultReceiverWrapper[] m3539a(int i) {
                return new ResultReceiverWrapper[i];
            }

            /* renamed from: a */
            private static ResultReceiverWrapper m3538a(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3538a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m3539a(i);
            }
        };

        /* renamed from: a */
        ResultReceiver f2992a;

        public final int describeContents() {
            return 0;
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f2992a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            this.f2992a.writeToParcel(parcel, i);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$Token */
    public static final class Token implements Parcelable {
        public static final Creator<Token> CREATOR = new Creator<Token>() {
            /* renamed from: a */
            private static Token[] m3543a(int i) {
                return new Token[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3542a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m3543a(i);
            }

            /* renamed from: a */
            private static Token m3542a(Parcel parcel) {
                Object obj;
                if (VERSION.SDK_INT >= 21) {
                    obj = parcel.readParcelable(null);
                } else {
                    obj = parcel.readStrongBinder();
                }
                return new Token(obj);
            }
        };

        /* renamed from: a */
        public final Object f2993a;

        /* renamed from: b */
        public IMediaSession f2994b;

        /* renamed from: c */
        public Bundle f2995c;

        public final int describeContents() {
            return 0;
        }

        public final int hashCode() {
            if (this.f2993a == null) {
                return 0;
            }
            return this.f2993a.hashCode();
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        /* renamed from: a */
        public static Token m3540a(Object obj) {
            return m3541a(obj, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            if (this.f2993a == null) {
                if (token.f2993a == null) {
                    return true;
                }
                return false;
            } else if (token.f2993a == null) {
                return false;
            } else {
                return this.f2993a.equals(token.f2993a);
            }
        }

        private Token(Object obj, IMediaSession iMediaSession) {
            this(obj, iMediaSession, null);
        }

        /* renamed from: a */
        public static Token m3541a(Object obj, IMediaSession iMediaSession) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new Token(C0867b.m3708a(obj), iMediaSession);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            if (VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f2993a, i);
            } else {
                parcel.writeStrongBinder((IBinder) this.f2993a);
            }
        }

        Token(Object obj, IMediaSession iMediaSession, Bundle bundle) {
            this.f2993a = obj;
            this.f2994b = iMediaSession;
            this.f2995c = bundle;
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$a */
    public static abstract class C0839a {

        /* renamed from: a */
        private C0840a f2996a;

        /* renamed from: b */
        final Object f2997b;

        /* renamed from: c */
        WeakReference<C0844b> f2998c;

        /* renamed from: d */
        private boolean f2999d;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$a */
        class C0840a extends Handler {
            public final void handleMessage(Message message) {
                if (message.what == 1) {
                    C0839a.this.mo3203a((C0812a) message.obj);
                }
            }

            C0840a(Looper looper) {
                super(looper);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$b */
        class C0841b implements C0868a {
            /* renamed from: a */
            public final void mo3207a(Object obj) {
                RatingCompat.m3302a(obj);
            }

            C0841b() {
            }

            /* renamed from: a */
            public final boolean mo3210a(Intent intent) {
                return C0839a.this.mo3205a(intent);
            }

            /* renamed from: a */
            public final void mo3208a(String str, Bundle bundle) {
                MediaSessionCompat.m3530a(bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS"));
                if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                    bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    return;
                }
                if (!str.equals("android.support.v4.media.session.action.PREPARE")) {
                    if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED");
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE");
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                    }
                }
            }

            /* renamed from: a */
            public final void mo3209a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                IBinder iBinder;
                try {
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        C0849e eVar = (C0849e) C0839a.this.f2998c.get();
                        if (eVar != null) {
                            Bundle bundle2 = new Bundle();
                            Token a = eVar.mo3211a();
                            IMediaSession iMediaSession = a.f2994b;
                            String str2 = "android.support.v4.media.session.EXTRA_BINDER";
                            if (iMediaSession == null) {
                                iBinder = null;
                            } else {
                                iBinder = iMediaSession.asBinder();
                            }
                            C0603f.m2530a(bundle2, str2, iBinder);
                            bundle2.putBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE", a.f2995c);
                            resultReceiver.send(0, bundle2);
                        }
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX");
                    } else if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                        bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                    } else {
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            C0849e eVar2 = (C0849e) C0839a.this.f2998c.get();
                            if (!(eVar2 == null || eVar2.f3012f == null)) {
                                int i = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                                if (i >= 0 && i < eVar2.f3012f.size()) {
                                    eVar2.f3012f.get(i);
                                }
                            }
                        }
                    }
                } catch (BadParcelableException unused) {
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$c */
        class C0842c extends C0841b implements Callback {
            C0842c() {
                super();
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$a$d */
        class C0843d extends C0842c implements MediaSessionCompatApi24.Callback {
            C0843d() {
                super();
            }
        }

        public C0839a() {
            if (VERSION.SDK_INT >= 24) {
                this.f2997b = MediaSessionCompatApi24.m3679a((MediaSessionCompatApi24.Callback) new C0843d());
            } else if (VERSION.SDK_INT >= 23) {
                this.f2997b = MediaSessionCompatApi23.m3678a(new C0842c());
            } else if (VERSION.SDK_INT >= 21) {
                this.f2997b = C0867b.m3707a((C0868a) new C0841b());
            } else {
                this.f2997b = null;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3203a(C0812a aVar) {
            if (this.f2999d) {
                this.f2999d = false;
                this.f2996a.removeMessages(1);
                C0844b bVar = (C0844b) this.f2998c.get();
                if (bVar != null) {
                    bVar.mo3213a(aVar);
                    bVar.mo3213a((C0812a) null);
                }
            }
        }

        /* renamed from: a */
        public final boolean mo3205a(Intent intent) {
            if (VERSION.SDK_INT >= 27) {
                return false;
            }
            C0844b bVar = (C0844b) this.f2998c.get();
            if (bVar == null || this.f2996a == null) {
                return false;
            }
            KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
            if (keyEvent == null || keyEvent.getAction() != 0) {
                return false;
            }
            C0812a b = bVar.mo3215b();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 79 || keyCode == 85) {
                if (keyEvent.getRepeatCount() > 0) {
                    mo3203a(b);
                } else if (this.f2999d) {
                    this.f2996a.removeMessages(1);
                    this.f2999d = false;
                } else {
                    this.f2999d = true;
                    this.f2996a.sendMessageDelayed(this.f2996a.obtainMessage(1, b), (long) ViewConfiguration.getDoubleTapTimeout());
                }
                return true;
            }
            mo3203a(b);
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3204a(C0844b bVar, Handler handler) {
            this.f2998c = new WeakReference<>(bVar);
            if (this.f2996a != null) {
                this.f2996a.removeCallbacksAndMessages(null);
            }
            this.f2996a = new C0840a(handler.getLooper());
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$b */
    interface C0844b {
        /* renamed from: a */
        Token mo3211a();

        /* renamed from: a */
        void mo3212a(PendingIntent pendingIntent);

        /* renamed from: a */
        void mo3213a(C0812a aVar);

        /* renamed from: a */
        void mo3214a(C0839a aVar, Handler handler);

        /* renamed from: b */
        C0812a mo3215b();
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$c */
    static class C0845c extends C0852g {

        /* renamed from: x */
        private static boolean f3004x = true;

        /* renamed from: a */
        public void mo3214a(C0839a aVar, Handler handler) {
            super.mo3214a(aVar, handler);
            if (aVar == null) {
                this.f3029d.setPlaybackPositionUpdateListener(null);
                return;
            }
            this.f3029d.setPlaybackPositionUpdateListener(new OnPlaybackPositionUpdateListener() {
                public final void onPlaybackPositionUpdate(long j) {
                    C0845c.this.mo3220a(18, -1, -1, Long.valueOf(j), null);
                }
            });
        }

        C0845c(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$d */
    static class C0847d extends C0845c {
        /* renamed from: a */
        public final void mo3214a(C0839a aVar, Handler handler) {
            super.mo3214a(aVar, handler);
            if (aVar == null) {
                this.f3029d.setMetadataUpdateListener(null);
                return;
            }
            this.f3029d.setMetadataUpdateListener(new OnMetadataUpdateListener() {
                public final void onMetadataUpdate(int i, Object obj) {
                    if (i == 268435457 && (obj instanceof Rating)) {
                        C0847d.this.mo3220a(19, -1, -1, RatingCompat.m3302a(obj), null);
                    }
                }
            });
        }

        C0847d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            super(context, str, componentName, pendingIntent);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$e */
    static class C0849e implements C0844b {

        /* renamed from: a */
        final Object f3007a;

        /* renamed from: b */
        final Token f3008b;

        /* renamed from: c */
        boolean f3009c;

        /* renamed from: d */
        final RemoteCallbackList<IMediaControllerCallback> f3010d = new RemoteCallbackList<>();

        /* renamed from: e */
        PlaybackStateCompat f3011e;

        /* renamed from: f */
        List<QueueItem> f3012f;

        /* renamed from: g */
        MediaMetadataCompat f3013g;

        /* renamed from: h */
        int f3014h;

        /* renamed from: i */
        boolean f3015i;

        /* renamed from: j */
        int f3016j;

        /* renamed from: k */
        int f3017k;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$e$a */
        class C0850a extends Stub {
            /* renamed from: b */
            public final void mo3142b(boolean z) throws RemoteException {
            }

            /* renamed from: i */
            public final List<QueueItem> mo3153i() {
                return null;
            }

            /* renamed from: o */
            public final boolean mo3159o() {
                return false;
            }

            /* renamed from: a */
            public final void mo3130a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final boolean mo3133a(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3129a(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3131a(boolean z) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final boolean mo3132a() {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final String mo3134b() {
                throw new AssertionError();
            }

            /* renamed from: c */
            public final String mo3143c() {
                throw new AssertionError();
            }

            /* renamed from: d */
            public final PendingIntent mo3146d() {
                throw new AssertionError();
            }

            /* renamed from: e */
            public final long mo3148e() {
                throw new AssertionError();
            }

            /* renamed from: f */
            public final ParcelableVolumeInfo mo3150f() {
                throw new AssertionError();
            }

            /* renamed from: g */
            public final MediaMetadataCompat mo3151g() {
                throw new AssertionError();
            }

            /* renamed from: j */
            public final CharSequence mo3154j() {
                throw new AssertionError();
            }

            /* renamed from: k */
            public final Bundle mo3155k() {
                throw new AssertionError();
            }

            /* renamed from: l */
            public final int mo3156l() {
                return C0849e.this.f3014h;
            }

            /* renamed from: m */
            public final boolean mo3157m() {
                return C0849e.this.f3015i;
            }

            /* renamed from: n */
            public final int mo3158n() {
                return C0849e.this.f3016j;
            }

            /* renamed from: p */
            public final int mo3160p() {
                return C0849e.this.f3017k;
            }

            /* renamed from: q */
            public final void mo3161q() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: r */
            public final void mo3162r() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: s */
            public final void mo3163s() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: t */
            public final void mo3164t() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: u */
            public final void mo3165u() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: v */
            public final void mo3166v() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: w */
            public final void mo3167w() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: x */
            public final void mo3168x() throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: h */
            public final PlaybackStateCompat mo3152h() {
                return MediaSessionCompat.m3529a(C0849e.this.f3011e, C0849e.this.f3013g);
            }

            C0850a() {
            }

            /* renamed from: a */
            public final void mo3120a(int i) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo3135b(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: c */
            public final void mo3144c(int i) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3122a(long j) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo3137b(long j) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3124a(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo3139b(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3126a(RatingCompat ratingCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo3140b(IMediaControllerCallback iMediaControllerCallback) {
                C0849e.this.f3010d.unregister(iMediaControllerCallback);
            }

            /* renamed from: a */
            public final void mo3128a(IMediaControllerCallback iMediaControllerCallback) {
                if (!C0849e.this.f3009c) {
                    String c = C0849e.this.mo3218c();
                    if (c == null) {
                        c = "android.media.session.MediaController";
                    }
                    C0849e.this.f3010d.register(iMediaControllerCallback, new C0812a(c, getCallingPid(), getCallingUid()));
                }
            }

            /* renamed from: d */
            public final void mo3147d(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: e */
            public final void mo3149e(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: c */
            public final void mo3145c(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3123a(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo3138b(Uri uri, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3125a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3127a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo3141b(String str, Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3121a(int i, int i2, String str) {
                throw new AssertionError();
            }

            /* renamed from: b */
            public final void mo3136b(int i, int i2, String str) {
                throw new AssertionError();
            }
        }

        /* renamed from: a */
        public final Token mo3211a() {
            return this.f3008b;
        }

        /* renamed from: a */
        public void mo3213a(C0812a aVar) {
        }

        /* renamed from: b */
        public C0812a mo3215b() {
            return null;
        }

        /* renamed from: c */
        public final String mo3218c() {
            if (VERSION.SDK_INT < 24) {
                return null;
            }
            return MediaSessionCompatApi24.m3680a(this.f3007a);
        }

        /* renamed from: a */
        public final void mo3212a(PendingIntent pendingIntent) {
            C0867b.m3709a(this.f3007a, pendingIntent);
        }

        /* renamed from: a */
        public final void mo3214a(C0839a aVar, Handler handler) {
            Object obj;
            Object obj2 = this.f3007a;
            if (aVar == null) {
                obj = null;
            } else {
                obj = aVar.f2997b;
            }
            C0867b.m3710a(obj2, obj, handler);
            if (aVar != null) {
                aVar.mo3204a(this, handler);
            }
        }

        C0849e(Context context, String str, Bundle bundle) {
            this.f3007a = C0867b.m3706a(context, str);
            this.f3008b = new Token(C0867b.m3711b(this.f3007a), new C0850a(), bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$f */
    static class C0851f extends C0849e {
        /* renamed from: a */
        public final void mo3213a(C0812a aVar) {
        }

        /* renamed from: b */
        public final C0812a mo3215b() {
            return new C0812a(((MediaSession) this.f3007a).getCurrentControllerInfo());
        }

        C0851f(Context context, String str, Bundle bundle) {
            super(context, str, bundle);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaSessionCompat$g */
    static class C0852g implements C0844b {

        /* renamed from: A */
        private final C0855b f3019A;

        /* renamed from: B */
        private final Token f3020B;

        /* renamed from: C */
        private C0856c f3021C;

        /* renamed from: D */
        private boolean f3022D = false;

        /* renamed from: E */
        private boolean f3023E = false;

        /* renamed from: F */
        private C0812a f3024F;

        /* renamed from: G */
        private C0820a f3025G = new C0820a() {
        };

        /* renamed from: a */
        final String f3026a;

        /* renamed from: b */
        final String f3027b;

        /* renamed from: c */
        final AudioManager f3028c;

        /* renamed from: d */
        final RemoteControlClient f3029d;

        /* renamed from: e */
        final Object f3030e = new Object();

        /* renamed from: f */
        final RemoteCallbackList<IMediaControllerCallback> f3031f = new RemoteCallbackList<>();

        /* renamed from: g */
        boolean f3032g = false;

        /* renamed from: h */
        boolean f3033h = false;

        /* renamed from: i */
        volatile C0839a f3034i;

        /* renamed from: j */
        int f3035j;

        /* renamed from: k */
        MediaMetadataCompat f3036k;

        /* renamed from: l */
        PlaybackStateCompat f3037l;

        /* renamed from: m */
        PendingIntent f3038m;

        /* renamed from: n */
        List<QueueItem> f3039n;

        /* renamed from: o */
        CharSequence f3040o;

        /* renamed from: p */
        int f3041p;

        /* renamed from: q */
        boolean f3042q;

        /* renamed from: r */
        int f3043r;

        /* renamed from: s */
        int f3044s;

        /* renamed from: t */
        Bundle f3045t;

        /* renamed from: u */
        int f3046u;

        /* renamed from: v */
        int f3047v;

        /* renamed from: w */
        C0819l f3048w;

        /* renamed from: x */
        private final Context f3049x;

        /* renamed from: y */
        private final ComponentName f3050y;

        /* renamed from: z */
        private final PendingIntent f3051z;

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$a */
        static final class C0854a {

            /* renamed from: a */
            public final String f3053a;

            /* renamed from: b */
            public final Bundle f3054b;

            /* renamed from: c */
            public final ResultReceiver f3055c;

            public C0854a(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f3053a = str;
                this.f3054b = bundle;
                this.f3055c = resultReceiver;
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$b */
        class C0855b extends Stub {
            /* renamed from: b */
            public final void mo3142b(boolean z) throws RemoteException {
            }

            /* renamed from: o */
            public final boolean mo3159o() {
                return false;
            }

            /* renamed from: a */
            public final void mo3130a(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                m3624a(1, (Object) new C0854a(str, bundle, resultReceiverWrapper.f2992a));
            }

            /* renamed from: a */
            public final boolean mo3133a(KeyEvent keyEvent) {
                boolean z = true;
                if ((C0852g.this.f3035j & 1) == 0) {
                    z = false;
                }
                if (z) {
                    m3624a(21, (Object) keyEvent);
                }
                return z;
            }

            /* renamed from: a */
            public final void mo3128a(IMediaControllerCallback iMediaControllerCallback) {
                if (C0852g.this.f3032g) {
                    try {
                        iMediaControllerCallback.mo3104a();
                    } catch (Exception unused) {
                    }
                } else {
                    C0852g.this.f3031f.register(iMediaControllerCallback, new C0812a("android.media.session.MediaController", getCallingPid(), getCallingUid()));
                }
            }

            /* renamed from: a */
            public final void mo3129a(String str, Bundle bundle) throws RemoteException {
                m3626a(4, (Object) str, bundle);
            }

            /* renamed from: a */
            public final void mo3126a(RatingCompat ratingCompat) throws RemoteException {
                m3624a(19, (Object) ratingCompat);
            }

            /* renamed from: a */
            public final void mo3127a(RatingCompat ratingCompat, Bundle bundle) throws RemoteException {
                m3626a(31, (Object) ratingCompat, bundle);
            }

            /* renamed from: a */
            public final void mo3131a(boolean z) throws RemoteException {
                m3624a(29, (Object) Boolean.valueOf(z));
            }

            /* renamed from: a */
            public final void mo3125a(MediaDescriptionCompat mediaDescriptionCompat, int i) {
                m3625a(26, (Object) mediaDescriptionCompat, i);
            }

            /* renamed from: a */
            public final boolean mo3132a() {
                return (C0852g.this.f3035j & 2) != 0;
            }

            /* renamed from: b */
            public final String mo3134b() {
                return C0852g.this.f3026a;
            }

            /* renamed from: c */
            public final String mo3143c() {
                return C0852g.this.f3027b;
            }

            /* renamed from: g */
            public final MediaMetadataCompat mo3151g() {
                return C0852g.this.f3036k;
            }

            /* renamed from: j */
            public final CharSequence mo3154j() {
                return C0852g.this.f3040o;
            }

            /* renamed from: l */
            public final int mo3156l() {
                return C0852g.this.f3041p;
            }

            /* renamed from: m */
            public final boolean mo3157m() {
                return C0852g.this.f3042q;
            }

            /* renamed from: n */
            public final int mo3158n() {
                return C0852g.this.f3043r;
            }

            /* renamed from: p */
            public final int mo3160p() {
                return C0852g.this.f3044s;
            }

            /* renamed from: q */
            public final void mo3161q() throws RemoteException {
                m3627d(3);
            }

            /* renamed from: r */
            public final void mo3162r() throws RemoteException {
                m3627d(7);
            }

            /* renamed from: s */
            public final void mo3163s() throws RemoteException {
                m3627d(12);
            }

            /* renamed from: t */
            public final void mo3164t() throws RemoteException {
                m3627d(13);
            }

            /* renamed from: u */
            public final void mo3165u() throws RemoteException {
                m3627d(14);
            }

            /* renamed from: v */
            public final void mo3166v() throws RemoteException {
                m3627d(15);
            }

            /* renamed from: w */
            public final void mo3167w() throws RemoteException {
                m3627d(16);
            }

            /* renamed from: x */
            public final void mo3168x() throws RemoteException {
                m3627d(17);
            }

            /* renamed from: e */
            public final long mo3148e() {
                long j;
                synchronized (C0852g.this.f3030e) {
                    j = (long) C0852g.this.f3035j;
                }
                return j;
            }

            /* renamed from: i */
            public final List<QueueItem> mo3153i() {
                List<QueueItem> list;
                synchronized (C0852g.this.f3030e) {
                    list = C0852g.this.f3039n;
                }
                return list;
            }

            /* renamed from: k */
            public final Bundle mo3155k() {
                Bundle bundle;
                synchronized (C0852g.this.f3030e) {
                    bundle = C0852g.this.f3045t;
                }
                return bundle;
            }

            /* renamed from: d */
            public final PendingIntent mo3146d() {
                PendingIntent pendingIntent;
                synchronized (C0852g.this.f3030e) {
                    pendingIntent = C0852g.this.f3038m;
                }
                return pendingIntent;
            }

            /* renamed from: h */
            public final PlaybackStateCompat mo3152h() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (C0852g.this.f3030e) {
                    playbackStateCompat = C0852g.this.f3037l;
                    mediaMetadataCompat = C0852g.this.f3036k;
                }
                return MediaSessionCompat.m3529a(playbackStateCompat, mediaMetadataCompat);
            }

            /* renamed from: f */
            public final ParcelableVolumeInfo mo3150f() {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                synchronized (C0852g.this.f3030e) {
                    i = C0852g.this.f3046u;
                    i2 = C0852g.this.f3047v;
                    C0819l lVar = C0852g.this.f3048w;
                    if (i == 2) {
                        int i6 = lVar.f2953a;
                        int i7 = lVar.f2954b;
                        i3 = lVar.f2955c;
                        i4 = i7;
                        i5 = i6;
                    } else {
                        i4 = C0852g.this.f3028c.getStreamMaxVolume(i2);
                        i3 = C0852g.this.f3028c.getStreamVolume(i2);
                        i5 = 2;
                    }
                }
                ParcelableVolumeInfo parcelableVolumeInfo = new ParcelableVolumeInfo(i, i2, i5, i4, i3);
                return parcelableVolumeInfo;
            }

            C0855b() {
            }

            /* renamed from: a */
            public final void mo3120a(int i) {
                m3623a(28, i);
            }

            /* renamed from: d */
            private void m3627d(int i) {
                C0852g.this.mo3220a(i, 0, 0, null, null);
            }

            /* renamed from: b */
            public final void mo3135b(int i) throws RemoteException {
                m3623a(23, i);
            }

            /* renamed from: c */
            public final void mo3144c(int i) throws RemoteException {
                m3623a(30, i);
            }

            /* renamed from: b */
            public final void mo3137b(long j) throws RemoteException {
                m3624a(18, (Object) Long.valueOf(j));
            }

            /* renamed from: b */
            public final void mo3139b(MediaDescriptionCompat mediaDescriptionCompat) {
                m3624a(27, (Object) mediaDescriptionCompat);
            }

            /* renamed from: a */
            public final void mo3122a(long j) {
                m3624a(11, (Object) Long.valueOf(j));
            }

            /* renamed from: b */
            public final void mo3140b(IMediaControllerCallback iMediaControllerCallback) {
                C0852g.this.f3031f.unregister(iMediaControllerCallback);
            }

            /* renamed from: a */
            public final void mo3124a(MediaDescriptionCompat mediaDescriptionCompat) {
                m3624a(25, (Object) mediaDescriptionCompat);
            }

            /* renamed from: d */
            public final void mo3147d(String str, Bundle bundle) throws RemoteException {
                m3626a(9, (Object) str, bundle);
            }

            /* renamed from: e */
            public final void mo3149e(String str, Bundle bundle) throws RemoteException {
                m3626a(20, (Object) str, bundle);
            }

            /* renamed from: a */
            private void m3623a(int i, int i2) {
                C0852g.this.mo3220a(i, i2, 0, null, null);
            }

            /* renamed from: a */
            private void m3624a(int i, Object obj) {
                C0852g.this.mo3220a(i, 0, 0, obj, null);
            }

            /* renamed from: c */
            public final void mo3145c(String str, Bundle bundle) throws RemoteException {
                m3626a(8, (Object) str, bundle);
            }

            /* renamed from: b */
            public final void mo3138b(Uri uri, Bundle bundle) throws RemoteException {
                m3626a(10, (Object) uri, bundle);
            }

            /* renamed from: a */
            public final void mo3123a(Uri uri, Bundle bundle) throws RemoteException {
                m3626a(6, (Object) uri, bundle);
            }

            /* renamed from: b */
            public final void mo3141b(String str, Bundle bundle) throws RemoteException {
                m3626a(5, (Object) str, bundle);
            }

            /* renamed from: b */
            public final void mo3136b(int i, int i2, String str) {
                C0852g.this.mo3221b(i, i2);
            }

            /* renamed from: a */
            private void m3625a(int i, Object obj, int i2) {
                C0852g.this.mo3220a(26, i2, 0, obj, null);
            }

            /* renamed from: a */
            private void m3626a(int i, Object obj, Bundle bundle) {
                C0852g.this.mo3220a(i, 0, 0, obj, bundle);
            }

            /* renamed from: a */
            public final void mo3121a(int i, int i2, String str) {
                C0852g.this.mo3219a(i, i2);
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$g$c */
        class C0856c extends Handler {
            public final void handleMessage(Message message) {
                C0839a aVar = C0852g.this.f3034i;
                if (aVar != null) {
                    Bundle data = message.getData();
                    MediaSessionCompat.m3530a(data);
                    C0852g.this.mo3213a(new C0812a(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                    MediaSessionCompat.m3530a(data.getBundle("data_extras"));
                    try {
                        switch (message.what) {
                            case 1:
                                Object obj = message.obj;
                                break;
                            case 2:
                                C0852g.this.mo3219a(message.arg1, 0);
                                break;
                            case 3:
                            case 7:
                            case 12:
                            case 13:
                            case 14:
                            case 15:
                            case 16:
                            case 17:
                                break;
                            case 4:
                                Object obj2 = message.obj;
                                break;
                            case 5:
                                Object obj3 = message.obj;
                                break;
                            case 6:
                                Object obj4 = message.obj;
                                break;
                            case 8:
                                Object obj5 = message.obj;
                                break;
                            case 9:
                                Object obj6 = message.obj;
                                break;
                            case 10:
                                Object obj7 = message.obj;
                                break;
                            case 11:
                                ((Long) message.obj).longValue();
                                break;
                            case 18:
                                ((Long) message.obj).longValue();
                                break;
                            case 19:
                                Object obj8 = message.obj;
                                break;
                            case 20:
                                Object obj9 = message.obj;
                                break;
                            case 21:
                                KeyEvent keyEvent = (KeyEvent) message.obj;
                                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                                intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                                if (!aVar.mo3205a(intent)) {
                                    m3677a(keyEvent, aVar);
                                    break;
                                }
                                break;
                            case 22:
                                C0852g.this.mo3221b(message.arg1, 0);
                                break;
                            case 23:
                                int i = message.arg1;
                                break;
                            case 25:
                                Object obj10 = message.obj;
                                break;
                            case BaseNotice.STORY_NOTICE_COMMENT /*26*/:
                                Object obj11 = message.obj;
                                int i2 = message.arg1;
                                break;
                            case BaseNotice.STORY_NOTICE_UPDATE /*27*/:
                                Object obj12 = message.obj;
                                break;
                            case 28:
                                if (C0852g.this.f3039n != null && message.arg1 >= 0 && message.arg1 < C0852g.this.f3039n.size()) {
                                    C0852g.this.f3039n.get(message.arg1);
                                    break;
                                }
                            case 29:
                                ((Boolean) message.obj).booleanValue();
                                break;
                            case 30:
                                int i3 = message.arg1;
                                break;
                            case 31:
                                Object obj13 = message.obj;
                                break;
                        }
                    } finally {
                        C0852g.this.mo3213a((C0812a) null);
                    }
                }
            }

            public C0856c(Looper looper) {
                super(looper);
            }

            /* renamed from: a */
            private void m3677a(KeyEvent keyEvent, C0839a aVar) {
                if (keyEvent != null && keyEvent.getAction() == 0) {
                    keyEvent.getKeyCode();
                }
            }
        }

        /* renamed from: a */
        public final Token mo3211a() {
            return this.f3020B;
        }

        /* renamed from: a */
        public final void mo3212a(PendingIntent pendingIntent) {
        }

        /* renamed from: b */
        public final C0812a mo3215b() {
            C0812a aVar;
            synchronized (this.f3030e) {
                aVar = this.f3024F;
            }
            return aVar;
        }

        /* renamed from: a */
        public final void mo3213a(C0812a aVar) {
            synchronized (this.f3030e) {
                this.f3024F = aVar;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3219a(int i, int i2) {
            if (this.f3046u != 2) {
                this.f3028c.adjustStreamVolume(this.f3047v, i, i2);
            } else if (this.f3048w != null) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3221b(int i, int i2) {
            if (this.f3046u != 2) {
                this.f3028c.setStreamVolume(this.f3047v, i, i2);
            } else if (this.f3048w != null) {
            }
        }

        /* renamed from: a */
        public void mo3214a(C0839a aVar, Handler handler) {
            this.f3034i = aVar;
            if (aVar != null) {
                if (handler == null) {
                    handler = new Handler();
                }
                synchronized (this.f3030e) {
                    if (this.f3021C != null) {
                        this.f3021C.removeCallbacksAndMessages(null);
                    }
                    this.f3021C = new C0856c(handler.getLooper());
                    this.f3034i.mo3204a(this, handler);
                }
            }
        }

        public C0852g(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
            if (componentName != null) {
                this.f3049x = context;
                this.f3026a = context.getPackageName();
                this.f3028c = (AudioManager) context.getSystemService("audio");
                this.f3027b = str;
                this.f3050y = componentName;
                this.f3051z = pendingIntent;
                this.f3019A = new C0855b();
                this.f3020B = new Token(this.f3019A);
                this.f3041p = 0;
                this.f3046u = 1;
                this.f3047v = 3;
                this.f3029d = new RemoteControlClient(pendingIntent);
                return;
            }
            throw new IllegalArgumentException("MediaButtonReceiver component may not be null.");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3220a(int i, int i2, int i3, Object obj, Bundle bundle) {
            synchronized (this.f3030e) {
                if (this.f3021C != null) {
                    Message obtainMessage = this.f3021C.obtainMessage(i, i2, i3, obj);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("data_calling_pkg", "android.media.session.MediaController");
                    bundle2.putInt("data_calling_pid", Binder.getCallingPid());
                    bundle2.putInt("data_calling_uid", Binder.getCallingUid());
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }
    }

    /* renamed from: a */
    public final Token mo3187a() {
        return this.f2985c.mo3211a();
    }

    /* renamed from: a */
    private void m3531a(C0839a aVar) {
        m3532a(aVar, (Handler) null);
    }

    /* renamed from: a */
    public static void m3530a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    /* renamed from: a */
    private void m3532a(C0839a aVar, Handler handler) {
        if (aVar == null) {
            this.f2985c.mo3214a(null, null);
        } else {
            this.f2985c.mo3214a(aVar, new Handler());
        }
    }

    /* renamed from: a */
    static PlaybackStateCompat m3529a(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        long j;
        if (playbackStateCompat != null) {
            long j2 = -1;
            if (playbackStateCompat.f3064b != -1) {
                if (playbackStateCompat.f3063a == 3 || playbackStateCompat.f3063a == 4 || playbackStateCompat.f3063a == 5) {
                    long j3 = playbackStateCompat.f3070h;
                    if (j3 > 0) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j4 = ((long) (playbackStateCompat.f3066d * ((float) (elapsedRealtime - j3)))) + playbackStateCompat.f3064b;
                        if (mediaMetadataCompat != null && mediaMetadataCompat.mo3074a("android.media.metadata.DURATION")) {
                            j2 = mediaMetadataCompat.mo3075b("android.media.metadata.DURATION");
                        }
                        if (j2 >= 0 && j4 > j2) {
                            j = j2;
                        } else if (j4 < 0) {
                            j = 0;
                        } else {
                            j = j4;
                        }
                        return new C0862a(playbackStateCompat).mo3242a(playbackStateCompat.f3063a, j, playbackStateCompat.f3066d, elapsedRealtime).mo3243a();
                    }
                }
                return playbackStateCompat;
            }
        }
        return playbackStateCompat;
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, null, null, null);
    }

    private MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.f2986d = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        } else if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                componentName = MediaButtonReceiver.m3487a(context);
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
            }
            if (VERSION.SDK_INT >= 28) {
                this.f2985c = new C0851f(context, str, null);
                m3531a((C0839a) new C0839a() {
                });
                this.f2985c.mo3212a(pendingIntent);
            } else if (VERSION.SDK_INT >= 21) {
                this.f2985c = new C0849e(context, str, null);
                m3531a((C0839a) new C0839a() {
                });
                this.f2985c.mo3212a(pendingIntent);
            } else if (VERSION.SDK_INT >= 19) {
                this.f2985c = new C0847d(context, str, componentName, pendingIntent);
            } else if (VERSION.SDK_INT >= 18) {
                this.f2985c = new C0845c(context, str, componentName, pendingIntent);
            } else {
                this.f2985c = new C0852g(context, str, componentName, pendingIntent);
            }
            this.f2984a = new MediaControllerCompat(context, this);
            if (f2983b == 0) {
                f2983b = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
            }
        } else {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
    }
}
