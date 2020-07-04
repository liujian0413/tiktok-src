package android.support.p022v4.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import android.support.p022v4.app.C0603f;
import android.support.p022v4.media.session.IMediaSession;
import android.support.p022v4.media.session.IMediaSession.Stub;
import android.support.p022v4.media.session.MediaSessionCompat;
import android.support.p022v4.media.session.MediaSessionCompat.Token;
import android.support.p022v4.p027os.ResultReceiver;
import android.support.p022v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map.Entry;

/* renamed from: android.support.v4.media.MediaBrowserCompat */
public final class MediaBrowserCompat {

    /* renamed from: a */
    static final boolean f2785a = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: b */
    private final C0753d f2786b;

    /* renamed from: android.support.v4.media.MediaBrowserCompat$CustomActionResultReceiver */
    static class CustomActionResultReceiver extends ResultReceiver {

        /* renamed from: d */
        private final C0752c f2787d;

        /* renamed from: a */
        public final void mo2983a(int i, Bundle bundle) {
            if (this.f2787d != null) {
                MediaSessionCompat.m3530a(bundle);
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$ItemReceiver */
    static class ItemReceiver extends ResultReceiver {
        /* renamed from: a */
        public final void mo2983a(int i, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("media_item")) {
                bundle.getParcelable("media_item");
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$MediaItem */
    public static class MediaItem implements Parcelable {
        public static final Creator<MediaItem> CREATOR = new Creator<MediaItem>() {
            /* renamed from: a */
            private static MediaItem[] m3188a(int i) {
                return new MediaItem[i];
            }

            /* renamed from: a */
            private static MediaItem m3187a(Parcel parcel) {
                return new MediaItem(parcel);
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return m3187a(parcel);
            }

            public final /* synthetic */ Object[] newArray(int i) {
                return m3188a(i);
            }
        };

        /* renamed from: a */
        public final int f2788a;

        /* renamed from: b */
        public final MediaDescriptionCompat f2789b;

        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("MediaItem{");
            sb.append("mFlags=");
            sb.append(this.f2788a);
            sb.append(", mDescription=");
            sb.append(this.f2789b);
            sb.append('}');
            return sb.toString();
        }

        MediaItem(Parcel parcel) {
            this.f2788a = parcel.readInt();
            this.f2789b = (MediaDescriptionCompat) MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        /* renamed from: a */
        private static MediaItem m3185a(Object obj) {
            if (obj == null || VERSION.SDK_INT < 21) {
                return null;
            }
            return new MediaItem(MediaDescriptionCompat.m3281a(C0797c.m3318b(obj)), C0797c.m3317a(obj));
        }

        /* renamed from: a */
        public static List<MediaItem> m3186a(List<?> list) {
            if (list == null || VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Object a : list) {
                arrayList.add(m3185a(a));
            }
            return arrayList;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2788a);
            this.f2789b.writeToParcel(parcel, i);
        }

        private MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            } else if (!TextUtils.isEmpty(mediaDescriptionCompat.f2912a)) {
                this.f2788a = i;
                this.f2789b = mediaDescriptionCompat;
            } else {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$SearchResultReceiver */
    static class SearchResultReceiver extends ResultReceiver {
        /* renamed from: a */
        public final void mo2983a(int i, Bundle bundle) {
            MediaSessionCompat.m3530a(bundle);
            if (i == 0 && bundle != null && bundle.containsKey("search_results")) {
                Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
                if (parcelableArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Parcelable parcelable : parcelableArray) {
                        arrayList.add((MediaItem) parcelable);
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$a */
    static class C0748a extends Handler {

        /* renamed from: a */
        private final WeakReference<C0763i> f2790a;

        /* renamed from: b */
        private WeakReference<Messenger> f2791b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo2989a(Messenger messenger) {
            this.f2791b = new WeakReference<>(messenger);
        }

        C0748a(C0763i iVar) {
            this.f2790a = new WeakReference<>(iVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0076, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0080, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                java.lang.ref.WeakReference<android.os.Messenger> r0 = r9.f2791b
                if (r0 == 0) goto L_0x0081
                java.lang.ref.WeakReference<android.os.Messenger> r0 = r9.f2791b
                java.lang.Object r0 = r0.get()
                if (r0 == 0) goto L_0x0081
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$i> r0 = r9.f2790a
                java.lang.Object r0 = r0.get()
                if (r0 != 0) goto L_0x0015
                goto L_0x0081
            L_0x0015:
                android.os.Bundle r0 = r10.getData()
                android.support.p022v4.media.session.MediaSessionCompat.m3530a(r0)
                java.lang.ref.WeakReference<android.support.v4.media.MediaBrowserCompat$i> r1 = r9.f2790a
                java.lang.Object r1 = r1.get()
                android.support.v4.media.MediaBrowserCompat$i r1 = (android.support.p022v4.media.MediaBrowserCompat.C0763i) r1
                java.lang.ref.WeakReference<android.os.Messenger> r2 = r9.f2791b
                java.lang.Object r2 = r2.get()
                r8 = r2
                android.os.Messenger r8 = (android.os.Messenger) r8
                int r2 = r10.what     // Catch:{ BadParcelableException -> 0x0077 }
                switch(r2) {
                    case 1: goto L_0x005b;
                    case 2: goto L_0x0057;
                    case 3: goto L_0x0033;
                    default: goto L_0x0032;
                }     // Catch:{ BadParcelableException -> 0x0077 }
            L_0x0032:
                goto L_0x0076
            L_0x0033:
                java.lang.String r2 = "data_options"
                android.os.Bundle r6 = r0.getBundle(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.p022v4.media.session.MediaSessionCompat.m3530a(r6)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r2 = "data_notify_children_changed_options"
                android.os.Bundle r7 = r0.getBundle(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.p022v4.media.session.MediaSessionCompat.m3530a(r7)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r2 = "data_media_item_id"
                java.lang.String r4 = r0.getString(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r2 = "data_media_item_list"
                java.util.ArrayList r5 = r0.getParcelableArrayList(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                r2 = r1
                r3 = r8
                r2.mo3004a(r3, r4, r5, r6, r7)     // Catch:{ BadParcelableException -> 0x0077 }
                goto L_0x0076
            L_0x0057:
                r1.mo3002a(r8)     // Catch:{ BadParcelableException -> 0x0077 }
                goto L_0x0080
            L_0x005b:
                java.lang.String r2 = "data_root_hints"
                android.os.Bundle r2 = r0.getBundle(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.p022v4.media.session.MediaSessionCompat.m3530a(r2)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r3 = "data_media_item_id"
                java.lang.String r3 = r0.getString(r3)     // Catch:{ BadParcelableException -> 0x0077 }
                java.lang.String r4 = "data_media_session_token"
                android.os.Parcelable r0 = r0.getParcelable(r4)     // Catch:{ BadParcelableException -> 0x0077 }
                android.support.v4.media.session.MediaSessionCompat$Token r0 = (android.support.p022v4.media.session.MediaSessionCompat.Token) r0     // Catch:{ BadParcelableException -> 0x0077 }
                r1.mo3003a(r8, r3, r0, r2)     // Catch:{ BadParcelableException -> 0x0077 }
                goto L_0x0080
            L_0x0076:
                return
            L_0x0077:
                int r10 = r10.what
                r0 = 1
                if (r10 != r0) goto L_0x0080
                r1.mo3002a(r8)
            L_0x0080:
                return
            L_0x0081:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.media.MediaBrowserCompat.C0748a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$b */
    public static class C0749b {

        /* renamed from: a */
        final Object f2792a;

        /* renamed from: b */
        public C0750a f2793b;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$a */
        interface C0750a {
            /* renamed from: a */
            void mo2994a();

            /* renamed from: b */
            void mo2995b();
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$b$b */
        class C0751b implements C0795a {
            /* renamed from: c */
            public final void mo2998c() {
                C0749b.this.mo2993c();
            }

            /* renamed from: a */
            public final void mo2996a() {
                if (C0749b.this.f2793b != null) {
                    C0749b.this.f2793b.mo2994a();
                }
                C0749b.this.mo2991a();
            }

            /* renamed from: b */
            public final void mo2997b() {
                if (C0749b.this.f2793b != null) {
                    C0749b.this.f2793b.mo2995b();
                }
                C0749b.this.mo2992b();
            }

            C0751b() {
            }
        }

        /* renamed from: a */
        public void mo2991a() {
        }

        /* renamed from: b */
        public void mo2992b() {
        }

        /* renamed from: c */
        public void mo2993c() {
        }

        public C0749b() {
            if (VERSION.SDK_INT >= 21) {
                this.f2792a = C0794a.m3308a((C0795a) new C0751b());
            } else {
                this.f2792a = null;
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$c */
    public static abstract class C0752c {
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$d */
    interface C0753d {
        /* renamed from: c */
        void mo2999c();

        /* renamed from: d */
        void mo3000d();

        /* renamed from: e */
        Token mo3001e();
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$e */
    static class C0754e implements C0750a, C0753d, C0763i {

        /* renamed from: a */
        final Context f2795a;

        /* renamed from: b */
        protected final Object f2796b;

        /* renamed from: c */
        protected final Bundle f2797c;

        /* renamed from: d */
        protected final C0748a f2798d = new C0748a(this);

        /* renamed from: e */
        protected int f2799e;

        /* renamed from: f */
        protected C0764j f2800f;

        /* renamed from: g */
        protected Messenger f2801g;

        /* renamed from: h */
        private final ArrayMap<String, C0765k> f2802h = new ArrayMap<>();

        /* renamed from: i */
        private Token f2803i;

        /* renamed from: j */
        private Bundle f2804j;

        /* renamed from: a */
        public final void mo3002a(Messenger messenger) {
        }

        /* renamed from: a */
        public final void mo3003a(Messenger messenger, String str, Token token, Bundle bundle) {
        }

        /* renamed from: c */
        public final void mo2999c() {
            C0794a.m3310a(this.f2796b);
        }

        /* renamed from: b */
        public final void mo2995b() {
            this.f2800f = null;
            this.f2801g = null;
            this.f2803i = null;
            this.f2798d.mo2989a(null);
        }

        /* renamed from: d */
        public final void mo3000d() {
            if (!(this.f2800f == null || this.f2801g == null)) {
                try {
                    this.f2800f.mo3017b(this.f2801g);
                } catch (RemoteException unused) {
                }
            }
            C0794a.m3311b(this.f2796b);
        }

        /* renamed from: e */
        public final Token mo3001e() {
            if (this.f2803i == null) {
                this.f2803i = Token.m3540a(C0794a.m3313d(this.f2796b));
            }
            return this.f2803i;
        }

        /* renamed from: a */
        public final void mo2994a() {
            Bundle c = C0794a.m3312c(this.f2796b);
            if (c != null) {
                this.f2799e = c.getInt("extra_service_version", 0);
                IBinder a = C0603f.m2529a(c, "extra_messenger");
                if (a != null) {
                    this.f2800f = new C0764j(a, this.f2797c);
                    this.f2801g = new Messenger(this.f2798d);
                    this.f2798d.mo2989a(this.f2801g);
                    try {
                        this.f2800f.mo3016b(this.f2795a, this.f2801g);
                    } catch (RemoteException unused) {
                    }
                }
                IMediaSession a2 = Stub.m3437a(C0603f.m2529a(c, "extra_session_binder"));
                if (a2 != null) {
                    this.f2803i = Token.m3541a(C0794a.m3313d(this.f2796b), a2);
                }
            }
        }

        C0754e(Context context, ComponentName componentName, C0749b bVar, Bundle bundle) {
            Bundle bundle2;
            this.f2795a = context;
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            this.f2797c = bundle2;
            this.f2797c.putInt("extra_client_version", 1);
            bVar.f2793b = this;
            this.f2796b = C0794a.m3307a(context, componentName, bVar.f2792a, this.f2797c);
        }

        /* renamed from: a */
        public final void mo3004a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (this.f2801g == messenger) {
                C0765k kVar = (C0765k) this.f2802h.get(str);
                if (!(kVar == null || kVar.mo3018a(bundle) == null)) {
                    if (bundle == null) {
                        if (list != null) {
                            this.f2804j = bundle2;
                            this.f2804j = null;
                        }
                    } else if (list != null) {
                        this.f2804j = bundle2;
                        this.f2804j = null;
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$f */
    static class C0755f extends C0754e {
        C0755f(Context context, ComponentName componentName, C0749b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$g */
    static class C0756g extends C0755f {
        C0756g(Context context, ComponentName componentName, C0749b bVar, Bundle bundle) {
            super(context, componentName, bVar, bundle);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$h */
    static class C0757h implements C0753d, C0763i {

        /* renamed from: a */
        final Context f2805a;

        /* renamed from: b */
        final ComponentName f2806b;

        /* renamed from: c */
        final C0749b f2807c;

        /* renamed from: d */
        final Bundle f2808d;

        /* renamed from: e */
        final C0748a f2809e = new C0748a(this);

        /* renamed from: f */
        int f2810f = 1;

        /* renamed from: g */
        C0760a f2811g;

        /* renamed from: h */
        C0764j f2812h;

        /* renamed from: i */
        Messenger f2813i;

        /* renamed from: j */
        private final ArrayMap<String, C0765k> f2814j = new ArrayMap<>();

        /* renamed from: k */
        private String f2815k;

        /* renamed from: l */
        private Token f2816l;

        /* renamed from: m */
        private Bundle f2817m;

        /* renamed from: n */
        private Bundle f2818n;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$h$a */
        class C0760a implements ServiceConnection {
            C0760a() {
            }

            public final void onServiceDisconnected(final ComponentName componentName) {
                m3220a((Runnable) new Runnable() {
                    public final void run() {
                        if (C0760a.this.mo3008a("onServiceDisconnected")) {
                            C0757h.this.f2812h = null;
                            C0757h.this.f2813i = null;
                            C0757h.this.f2809e.mo2989a(null);
                            C0757h.this.f2810f = 4;
                            C0757h.this.f2807c.mo2992b();
                        }
                    }
                });
            }

            /* renamed from: a */
            private void m3220a(Runnable runnable) {
                if (Thread.currentThread() == C0757h.this.f2809e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    C0757h.this.f2809e.post(runnable);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final boolean mo3008a(String str) {
                if (C0757h.this.f2811g != this || C0757h.this.f2810f == 0 || C0757h.this.f2810f == 1) {
                    return false;
                }
                return true;
            }

            public final void onServiceConnected(final ComponentName componentName, final IBinder iBinder) {
                m3220a((Runnable) new Runnable() {
                    public final void run() {
                        if (C0760a.this.mo3008a("onServiceConnected")) {
                            C0757h.this.f2812h = new C0764j(iBinder, C0757h.this.f2808d);
                            C0757h.this.f2813i = new Messenger(C0757h.this.f2809e);
                            C0757h.this.f2809e.mo2989a(C0757h.this.f2813i);
                            C0757h.this.f2810f = 2;
                            try {
                                C0757h.this.f2812h.mo3013a(C0757h.this.f2805a, C0757h.this.f2813i);
                            } catch (RemoteException unused) {
                            }
                        }
                    }
                });
            }
        }

        /* renamed from: b */
        private boolean m3212b() {
            if (this.f2810f == 3) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public final void mo3000d() {
            this.f2810f = 0;
            this.f2809e.post(new Runnable() {
                public final void run() {
                    if (C0757h.this.f2813i != null) {
                        try {
                            C0757h.this.f2812h.mo3014a(C0757h.this.f2813i);
                        } catch (RemoteException unused) {
                        }
                    }
                    int i = C0757h.this.f2810f;
                    C0757h.this.mo3005a();
                    if (i != 0) {
                        C0757h.this.f2810f = i;
                    }
                }
            });
        }

        /* renamed from: c */
        public final void mo2999c() {
            if (this.f2810f == 0 || this.f2810f == 1) {
                this.f2810f = 2;
                this.f2809e.post(new Runnable() {
                    public final void run() {
                        boolean z;
                        if (C0757h.this.f2810f != 0) {
                            C0757h.this.f2810f = 2;
                            if (MediaBrowserCompat.f2785a && C0757h.this.f2811g != null) {
                                StringBuilder sb = new StringBuilder("mServiceConnection should be null. Instead it is ");
                                sb.append(C0757h.this.f2811g);
                                throw new RuntimeException(sb.toString());
                            } else if (C0757h.this.f2812h != null) {
                                StringBuilder sb2 = new StringBuilder("mServiceBinderWrapper should be null. Instead it is ");
                                sb2.append(C0757h.this.f2812h);
                                throw new RuntimeException(sb2.toString());
                            } else if (C0757h.this.f2813i == null) {
                                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                                intent.setComponent(C0757h.this.f2806b);
                                C0757h.this.f2811g = new C0760a();
                                try {
                                    z = C0757h.this.f2805a.bindService(intent, C0757h.this.f2811g, 1);
                                } catch (Exception unused) {
                                    z = false;
                                }
                                if (!z) {
                                    C0757h.this.mo3005a();
                                    C0757h.this.f2807c.mo2993c();
                                }
                            } else {
                                StringBuilder sb3 = new StringBuilder("mCallbacksMessenger should be null. Instead it is ");
                                sb3.append(C0757h.this.f2813i);
                                throw new RuntimeException(sb3.toString());
                            }
                        }
                    }
                });
                return;
            }
            StringBuilder sb = new StringBuilder("connect() called while neigther disconnecting nor disconnected (state=");
            sb.append(m3210a(this.f2810f));
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* renamed from: e */
        public final Token mo3001e() {
            if (m3212b()) {
                return this.f2816l;
            }
            StringBuilder sb = new StringBuilder("getSessionToken() called while not connected(state=");
            sb.append(this.f2810f);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3005a() {
            if (this.f2811g != null) {
                this.f2805a.unbindService(this.f2811g);
            }
            this.f2810f = 1;
            this.f2811g = null;
            this.f2812h = null;
            this.f2813i = null;
            this.f2809e.mo2989a(null);
            this.f2815k = null;
            this.f2816l = null;
        }

        /* renamed from: a */
        private static String m3210a(int i) {
            switch (i) {
                case 0:
                    return "CONNECT_STATE_DISCONNECTING";
                case 1:
                    return "CONNECT_STATE_DISCONNECTED";
                case 2:
                    return "CONNECT_STATE_CONNECTING";
                case 3:
                    return "CONNECT_STATE_CONNECTED";
                case 4:
                    return "CONNECT_STATE_SUSPENDED";
                default:
                    StringBuilder sb = new StringBuilder("UNKNOWN/");
                    sb.append(i);
                    return sb.toString();
            }
        }

        /* renamed from: a */
        public final void mo3002a(Messenger messenger) {
            if (m3211a(messenger, "onConnectFailed") && this.f2810f == 2) {
                mo3005a();
                this.f2807c.mo2993c();
            }
        }

        /* renamed from: a */
        private boolean m3211a(Messenger messenger, String str) {
            if (this.f2813i != messenger || this.f2810f == 0 || this.f2810f == 1) {
                return false;
            }
            return true;
        }

        public C0757h(Context context, ComponentName componentName, C0749b bVar, Bundle bundle) {
            Bundle bundle2;
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            } else if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            } else if (bVar != null) {
                this.f2805a = context;
                this.f2806b = componentName;
                this.f2807c = bVar;
                if (bundle == null) {
                    bundle2 = null;
                } else {
                    bundle2 = new Bundle(bundle);
                }
                this.f2808d = bundle2;
            } else {
                throw new IllegalArgumentException("connection callback must not be null");
            }
        }

        /* renamed from: a */
        public final void mo3003a(Messenger messenger, String str, Token token, Bundle bundle) {
            if (m3211a(messenger, "onConnect") && this.f2810f == 2) {
                this.f2815k = str;
                this.f2816l = token;
                this.f2817m = bundle;
                this.f2810f = 3;
                this.f2807c.mo2991a();
                try {
                    for (Entry entry : this.f2814j.entrySet()) {
                        String str2 = (String) entry.getKey();
                        C0765k kVar = (C0765k) entry.getValue();
                        List<C0766l> list = kVar.f2829a;
                        List<Bundle> list2 = kVar.f2830b;
                        for (int i = 0; i < list.size(); i++) {
                            this.f2812h.mo3015a(str2, ((C0766l) list.get(i)).f2832b, (Bundle) list2.get(i), this.f2813i);
                        }
                    }
                } catch (RemoteException unused) {
                }
            }
        }

        /* renamed from: a */
        public final void mo3004a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2) {
            if (m3211a(messenger, "onLoadChildren")) {
                C0765k kVar = (C0765k) this.f2814j.get(str);
                if (!(kVar == null || kVar.mo3018a(bundle) == null)) {
                    if (bundle == null) {
                        if (list != null) {
                            this.f2818n = bundle2;
                            this.f2818n = null;
                        }
                    } else if (list != null) {
                        this.f2818n = bundle2;
                        this.f2818n = null;
                    }
                }
            }
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$i */
    interface C0763i {
        /* renamed from: a */
        void mo3002a(Messenger messenger);

        /* renamed from: a */
        void mo3003a(Messenger messenger, String str, Token token, Bundle bundle);

        /* renamed from: a */
        void mo3004a(Messenger messenger, String str, List list, Bundle bundle, Bundle bundle2);
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$j */
    static class C0764j {

        /* renamed from: a */
        private Messenger f2827a;

        /* renamed from: b */
        private Bundle f2828b;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3014a(Messenger messenger) throws RemoteException {
            m3225a(2, null, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3017b(Messenger messenger) throws RemoteException {
            m3225a(7, null, messenger);
        }

        public C0764j(IBinder iBinder, Bundle bundle) {
            this.f2827a = new Messenger(iBinder);
            this.f2828b = bundle;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo3016b(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f2828b);
            m3225a(6, bundle, messenger);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3013a(Context context, Messenger messenger) throws RemoteException {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putBundle("data_root_hints", this.f2828b);
            m3225a(1, bundle, messenger);
        }

        /* renamed from: a */
        private void m3225a(int i, Bundle bundle, Messenger messenger) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f2827a.send(obtain);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo3015a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) throws RemoteException {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            C0603f.m2530a(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            m3225a(3, bundle2, messenger);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$k */
    static class C0765k {

        /* renamed from: a */
        public final List<C0766l> f2829a = new ArrayList();

        /* renamed from: b */
        public final List<Bundle> f2830b = new ArrayList();

        /* renamed from: a */
        public final C0766l mo3018a(Bundle bundle) {
            for (int i = 0; i < this.f2830b.size(); i++) {
                if (C0803c.m3339a((Bundle) this.f2830b.get(i), bundle)) {
                    return (C0766l) this.f2829a.get(i);
                }
            }
            return null;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserCompat$l */
    public static abstract class C0766l {

        /* renamed from: a */
        final Object f2831a;

        /* renamed from: b */
        final IBinder f2832b = new Binder();

        /* renamed from: c */
        WeakReference<C0765k> f2833c;

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$a */
        class C0767a implements C0798d {
            C0767a() {
            }

            /* renamed from: a */
            private static List<MediaItem> m3232a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i2 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i == -1 && i2 == -1) {
                    return list;
                }
                int i3 = i2 * i;
                int i4 = i3 + i2;
                if (i < 0 || i2 <= 0 || i3 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i4 > list.size()) {
                    i4 = list.size();
                }
                return list.subList(i3, i4);
            }

            /* renamed from: a */
            public final void mo3019a(String str, List<?> list) {
                C0765k kVar;
                if (C0766l.this.f2833c == null) {
                    kVar = null;
                } else {
                    kVar = (C0765k) C0766l.this.f2833c.get();
                }
                if (kVar == null) {
                    MediaItem.m3186a(list);
                    return;
                }
                List a = MediaItem.m3186a(list);
                List<C0766l> list2 = kVar.f2829a;
                List<Bundle> list3 = kVar.f2830b;
                for (int i = 0; i < list2.size(); i++) {
                    Bundle bundle = (Bundle) list3.get(i);
                    if (bundle != null) {
                        m3232a(a, bundle);
                    }
                }
            }
        }

        /* renamed from: android.support.v4.media.MediaBrowserCompat$l$b */
        class C0768b extends C0767a implements C0801a {
            C0768b() {
                super();
            }

            /* renamed from: a */
            public final void mo3020a(String str, List<?> list, Bundle bundle) {
                MediaItem.m3186a(list);
            }
        }

        public C0766l() {
            if (VERSION.SDK_INT >= 26) {
                this.f2831a = C0800b.m3337a(new C0768b());
            } else if (VERSION.SDK_INT >= 21) {
                this.f2831a = C0794a.m3309a((C0798d) new C0767a());
            } else {
                this.f2831a = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo2980a() {
        this.f2786b.mo2999c();
    }

    /* renamed from: b */
    public final void mo2981b() {
        this.f2786b.mo3000d();
    }

    /* renamed from: c */
    public final Token mo2982c() {
        return this.f2786b.mo3001e();
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, C0749b bVar, Bundle bundle) {
        if (VERSION.SDK_INT >= 26) {
            this.f2786b = new C0756g(context, componentName, bVar, null);
        } else if (VERSION.SDK_INT >= 23) {
            this.f2786b = new C0755f(context, componentName, bVar, null);
        } else if (VERSION.SDK_INT >= 21) {
            this.f2786b = new C0754e(context, componentName, bVar, null);
        } else {
            this.f2786b = new C0757h(context, componentName, bVar, null);
        }
    }
}
