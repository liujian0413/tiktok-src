package android.support.p022v4.media.session;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.p022v4.app.C0603f;
import android.support.p022v4.media.MediaMetadataCompat;
import android.support.p022v4.media.session.C0863a.C0864a;
import android.support.p022v4.media.session.IMediaSession.Stub;
import android.support.p022v4.media.session.MediaSessionCompat.QueueItem;
import android.support.p022v4.media.session.MediaSessionCompat.Token;
import android.view.KeyEvent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.media.session.MediaControllerCompat */
public final class MediaControllerCompat {

    /* renamed from: a */
    public final Token f2962a;

    /* renamed from: b */
    private final C0829b f2963b;

    /* renamed from: c */
    private final HashSet<C0825a> f2964c = new HashSet<>();

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21 */
    static class MediaControllerImplApi21 implements C0829b {

        /* renamed from: a */
        protected final Object f2965a;

        /* renamed from: b */
        final Object f2966b = new Object();

        /* renamed from: c */
        final Token f2967c;

        /* renamed from: d */
        private final List<C0825a> f2968d = new ArrayList();

        /* renamed from: e */
        private HashMap<C0825a, C0824a> f2969e = new HashMap<>();

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: a */
            private WeakReference<MediaControllerImplApi21> f2970a;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f2970a = new WeakReference<>(mediaControllerImplApi21);
            }

            /* access modifiers changed from: protected */
            public void onReceiveResult(int i, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21) this.f2970a.get();
                if (mediaControllerImplApi21 != null && bundle != null) {
                    synchronized (mediaControllerImplApi21.f2966b) {
                        mediaControllerImplApi21.f2967c.f2994b = Stub.m3437a(C0603f.m2529a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
                        mediaControllerImplApi21.f2967c.f2995c = bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE");
                        mediaControllerImplApi21.mo3174a();
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$MediaControllerImplApi21$a */
        static class C0824a extends C0828c {
            /* renamed from: a */
            public final void mo3104a() throws RemoteException {
                throw new AssertionError();
            }

            C0824a(C0825a aVar) {
                super(aVar);
            }

            /* renamed from: a */
            public final void mo3106a(Bundle bundle) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3107a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3108a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3110a(CharSequence charSequence) throws RemoteException {
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo3112a(List<QueueItem> list) throws RemoteException {
                throw new AssertionError();
            }
        }

        /* renamed from: b */
        private void m3496b() {
            m3495a("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3174a() {
            if (this.f2967c.f2994b != null) {
                for (C0825a aVar : this.f2968d) {
                    C0824a aVar2 = new C0824a(aVar);
                    this.f2969e.put(aVar, aVar2);
                    aVar.f2973c = aVar2;
                    try {
                        this.f2967c.f2994b.mo3128a((IMediaControllerCallback) aVar2);
                        aVar.mo3177a(13, null, null);
                    } catch (RemoteException unused) {
                    }
                }
                this.f2968d.clear();
            }
        }

        /* renamed from: a */
        public final boolean mo3175a(KeyEvent keyEvent) {
            return C0863a.m3694a(this.f2965a, keyEvent);
        }

        public MediaControllerImplApi21(Context context, Token token) throws RemoteException {
            this.f2967c = token;
            this.f2965a = C0863a.m3691a(context, this.f2967c.f2993a);
            if (this.f2965a == null) {
                throw new RemoteException();
            } else if (this.f2967c.f2994b == null) {
                m3496b();
            }
        }

        /* renamed from: a */
        private void m3495a(String str, Bundle bundle, ResultReceiver resultReceiver) {
            C0863a.m3693a(this.f2965a, str, null, resultReceiver);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$a */
    public static abstract class C0825a implements DeathRecipient {

        /* renamed from: a */
        final Object f2971a;

        /* renamed from: b */
        C0826a f2972b;

        /* renamed from: c */
        public IMediaControllerCallback f2973c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a */
        class C0826a extends Handler {

            /* renamed from: a */
            boolean f2974a;

            public final void handleMessage(Message message) {
                if (this.f2974a) {
                    switch (message.what) {
                        case 1:
                            MediaSessionCompat.m3530a(message.getData());
                            Object obj = message.obj;
                            return;
                        case 2:
                            Object obj2 = message.obj;
                            return;
                        case 3:
                            Object obj3 = message.obj;
                            return;
                        case 4:
                            Object obj4 = message.obj;
                            break;
                        case 5:
                            Object obj5 = message.obj;
                            return;
                        case 6:
                            Object obj6 = message.obj;
                            return;
                        case 7:
                            MediaSessionCompat.m3530a((Bundle) message.obj);
                            return;
                        case 9:
                            ((Integer) message.obj).intValue();
                            return;
                        case 11:
                            ((Boolean) message.obj).booleanValue();
                            return;
                        case 12:
                            ((Integer) message.obj).intValue();
                            return;
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$b */
        static class C0827b implements C0864a {

            /* renamed from: a */
            private final WeakReference<C0825a> f2975a;

            /* renamed from: a */
            public final void mo3179a() {
                this.f2975a.get();
            }

            C0827b(C0825a aVar) {
                this.f2975a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public final void mo3181a(Bundle bundle) {
                this.f2975a.get();
            }

            /* renamed from: b */
            public final void mo3186b(Object obj) {
                if (((C0825a) this.f2975a.get()) != null) {
                    MediaMetadataCompat.m3294a(obj);
                }
            }

            /* renamed from: a */
            public final void mo3182a(CharSequence charSequence) {
                this.f2975a.get();
            }

            /* renamed from: a */
            public final void mo3183a(Object obj) {
                C0825a aVar = (C0825a) this.f2975a.get();
                if (aVar != null && aVar.f2973c == null) {
                    PlaybackStateCompat.m3683a(obj);
                }
            }

            /* renamed from: a */
            public final void mo3185a(List<?> list) {
                if (((C0825a) this.f2975a.get()) != null) {
                    QueueItem.m3535a(list);
                }
            }

            /* renamed from: a */
            public final void mo3184a(String str, Bundle bundle) {
                this.f2975a.get();
            }

            /* renamed from: a */
            public final void mo3180a(int i, int i2, int i3, int i4, int i5) {
                if (((C0825a) this.f2975a.get()) != null) {
                    new C0833f(i, i2, i3, i4, i5);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$c */
        static class C0828c extends IMediaControllerCallback.Stub {

            /* renamed from: a */
            private final WeakReference<C0825a> f2976a;

            /* renamed from: a */
            public final void mo3113a(boolean z) throws RemoteException {
            }

            /* renamed from: a */
            public void mo3112a(List<QueueItem> list) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(5, list, null);
                }
            }

            /* renamed from: a */
            public void mo3104a() throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(8, null, null);
                }
            }

            /* renamed from: b */
            public final void mo3114b() throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(13, null, null);
                }
            }

            C0828c(C0825a aVar) {
                this.f2976a = new WeakReference<>(aVar);
            }

            /* renamed from: a */
            public void mo3106a(Bundle bundle) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(7, bundle, null);
                }
            }

            /* renamed from: a */
            public final void mo3105a(int i) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(9, Integer.valueOf(i), null);
                }
            }

            /* renamed from: b */
            public final void mo3115b(int i) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(12, Integer.valueOf(i), null);
                }
            }

            /* renamed from: a */
            public void mo3107a(MediaMetadataCompat mediaMetadataCompat) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(3, mediaMetadataCompat, null);
                }
            }

            /* renamed from: b */
            public final void mo3116b(boolean z) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(11, Boolean.valueOf(z), null);
                }
            }

            /* renamed from: a */
            public void mo3108a(ParcelableVolumeInfo parcelableVolumeInfo) throws RemoteException {
                C0833f fVar;
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    if (parcelableVolumeInfo != null) {
                        fVar = new C0833f(parcelableVolumeInfo.f3058a, parcelableVolumeInfo.f3059b, parcelableVolumeInfo.f3060c, parcelableVolumeInfo.f3061d, parcelableVolumeInfo.f3062e);
                    } else {
                        fVar = null;
                    }
                    aVar.mo3177a(4, fVar, null);
                }
            }

            /* renamed from: a */
            public final void mo3109a(PlaybackStateCompat playbackStateCompat) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(2, playbackStateCompat, null);
                }
            }

            /* renamed from: a */
            public void mo3110a(CharSequence charSequence) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(6, charSequence, null);
                }
            }

            /* renamed from: a */
            public final void mo3111a(String str, Bundle bundle) throws RemoteException {
                C0825a aVar = (C0825a) this.f2976a.get();
                if (aVar != null) {
                    aVar.mo3177a(1, str, bundle);
                }
            }
        }

        public C0825a() {
            if (VERSION.SDK_INT >= 21) {
                this.f2971a = C0863a.m3692a(new C0827b(this));
                return;
            }
            C0828c cVar = new C0828c(this);
            this.f2973c = cVar;
            this.f2971a = cVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3177a(int i, Object obj, Bundle bundle) {
            if (this.f2972b != null) {
                Message obtainMessage = this.f2972b.obtainMessage(i, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$b */
    interface C0829b {
        /* renamed from: a */
        boolean mo3175a(KeyEvent keyEvent);
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$c */
    static class C0830c extends MediaControllerImplApi21 {
        public C0830c(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$d */
    static class C0831d extends C0830c {
        public C0831d(Context context, Token token) throws RemoteException {
            super(context, token);
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$e */
    static class C0832e implements C0829b {

        /* renamed from: a */
        private IMediaSession f2977a;

        public C0832e(Token token) {
            this.f2977a = Stub.m3437a((IBinder) token.f2993a);
        }

        /* renamed from: a */
        public final boolean mo3175a(KeyEvent keyEvent) {
            if (keyEvent != null) {
                try {
                    this.f2977a.mo3133a(keyEvent);
                } catch (RemoteException unused) {
                }
                return false;
            }
            throw new IllegalArgumentException("event may not be null.");
        }
    }

    /* renamed from: android.support.v4.media.session.MediaControllerCompat$f */
    public static final class C0833f {

        /* renamed from: a */
        public final int f2978a;

        /* renamed from: b */
        public final int f2979b;

        /* renamed from: c */
        public final int f2980c;

        /* renamed from: d */
        public final int f2981d;

        /* renamed from: e */
        public final int f2982e;

        C0833f(int i, int i2, int i3, int i4, int i5) {
            this.f2978a = i;
            this.f2979b = i2;
            this.f2980c = i3;
            this.f2981d = i4;
            this.f2982e = i5;
        }
    }

    /* renamed from: a */
    public final boolean mo3173a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f2963b.mo3175a(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public MediaControllerCompat(Context context, Token token) throws RemoteException {
        if (token != null) {
            this.f2962a = token;
            if (VERSION.SDK_INT >= 24) {
                this.f2963b = new C0831d(context, token);
            } else if (VERSION.SDK_INT >= 23) {
                this.f2963b = new C0830c(context, token);
            } else if (VERSION.SDK_INT >= 21) {
                this.f2963b = new MediaControllerImplApi21(context, token);
            } else {
                this.f2963b = new C0832e(token);
            }
        } else {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        C0829b bVar;
        this.f2962a = mediaSessionCompat.mo3187a();
        try {
            if (VERSION.SDK_INT >= 24) {
                bVar = new C0831d(context, this.f2962a);
            } else if (VERSION.SDK_INT >= 23) {
                bVar = new C0830c(context, this.f2962a);
            } else if (VERSION.SDK_INT >= 21) {
                bVar = new MediaControllerImplApi21(context, this.f2962a);
            } else {
                bVar = new C0832e(this.f2962a);
            }
        } catch (RemoteException unused) {
            bVar = null;
        }
        this.f2963b = bVar;
    }
}
