package android.support.p022v4.media;

import android.app.Service;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IBinder.DeathRecipient;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.p022v4.app.C0603f;
import android.support.p022v4.media.C0811h.C0812a;
import android.support.p022v4.media.MediaBrowserCompat.MediaItem;
import android.support.p022v4.media.session.MediaSessionCompat;
import android.support.p022v4.media.session.MediaSessionCompat.Token;
import android.support.p022v4.p027os.ResultReceiver;
import android.support.p022v4.util.ArrayMap;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: android.support.v4.media.MediaBrowserServiceCompat */
public abstract class MediaBrowserServiceCompat extends Service {

    /* renamed from: a */
    static final boolean f2836a = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: b */
    final ArrayMap<IBinder, C0774b> f2837b = new ArrayMap<>();

    /* renamed from: c */
    C0774b f2838c;

    /* renamed from: d */
    final C0789g f2839d = new C0789g();

    /* renamed from: e */
    public Token f2840e;

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$a */
    public static final class C0773a {

        /* renamed from: a */
        public final String f2852a;

        /* renamed from: b */
        public final Bundle f2853b;
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$b */
    class C0774b implements DeathRecipient {

        /* renamed from: a */
        public final String f2854a;

        /* renamed from: b */
        public final int f2855b;

        /* renamed from: c */
        public final int f2856c;

        /* renamed from: d */
        public final C0812a f2857d;

        /* renamed from: e */
        public final Bundle f2858e;

        /* renamed from: f */
        public final C0787e f2859f;

        /* renamed from: g */
        public final HashMap<String, List<C0902i<IBinder, Bundle>>> f2860g = new HashMap<>();

        /* renamed from: h */
        public C0773a f2861h;

        public final void binderDied() {
            MediaBrowserServiceCompat.this.f2839d.post(new Runnable() {
                public final void run() {
                    MediaBrowserServiceCompat.this.f2837b.remove(C0774b.this.f2859f.mo3053a());
                }
            });
        }

        C0774b(String str, int i, int i2, Bundle bundle, C0787e eVar) {
            this.f2854a = str;
            this.f2855b = i;
            this.f2856c = i2;
            this.f2857d = new C0812a(str, i, i2);
            this.f2858e = bundle;
            this.f2859f = eVar;
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$c */
    public static class C0776c<T> {

        /* renamed from: a */
        private final Object f2864a;

        /* renamed from: b */
        private boolean f2865b;

        /* renamed from: c */
        private boolean f2866c;

        /* renamed from: d */
        private boolean f2867d;

        /* renamed from: f */
        public int f2868f;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3028a(T t) {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo3032a() {
            if (this.f2865b || this.f2866c || this.f2867d) {
                return true;
            }
            return false;
        }

        C0776c(Object obj) {
            this.f2864a = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3029a(Bundle bundle) {
            StringBuilder sb = new StringBuilder("It is not supported to send an error for ");
            sb.append(this.f2864a);
            throw new UnsupportedOperationException(sb.toString());
        }

        /* renamed from: b */
        public final void mo3033b(Bundle bundle) {
            if (this.f2866c || this.f2867d) {
                StringBuilder sb = new StringBuilder("sendError() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f2864a);
                throw new IllegalStateException(sb.toString());
            }
            this.f2867d = true;
            mo3029a((Bundle) null);
        }

        /* renamed from: b */
        public final void mo3034b(T t) {
            if (this.f2866c || this.f2867d) {
                StringBuilder sb = new StringBuilder("sendResult() called when either sendResult() or sendError() had already been called for: ");
                sb.append(this.f2864a);
                throw new IllegalStateException(sb.toString());
            }
            this.f2866c = true;
            mo3028a((T) null);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$d */
    class C0777d {
        C0777d() {
        }

        /* renamed from: a */
        public final void mo3035a(final C0787e eVar) {
            MediaBrowserServiceCompat.this.f2839d.mo3057a(new Runnable() {
                public final void run() {
                    C0774b bVar = (C0774b) MediaBrowserServiceCompat.this.f2837b.remove(eVar.mo3053a());
                    if (bVar != null) {
                        bVar.f2859f.mo3053a().unlinkToDeath(bVar, 0);
                    }
                }
            });
        }

        /* renamed from: b */
        public final void mo3042b(final C0787e eVar) {
            MediaBrowserServiceCompat.this.f2839d.mo3057a(new Runnable() {
                public final void run() {
                    IBinder a = eVar.mo3053a();
                    C0774b bVar = (C0774b) MediaBrowserServiceCompat.this.f2837b.remove(a);
                    if (bVar != null) {
                        a.unlinkToDeath(bVar, 0);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo3040a(final String str, final IBinder iBinder, final C0787e eVar) {
            MediaBrowserServiceCompat.this.f2839d.mo3057a(new Runnable() {
                public final void run() {
                    C0774b bVar = (C0774b) MediaBrowserServiceCompat.this.f2837b.get(eVar.mo3053a());
                    if (bVar != null) {
                        MediaBrowserServiceCompat.this.mo3026a(str, bVar, iBinder);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo3041a(final String str, final ResultReceiver resultReceiver, final C0787e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                MediaBrowserServiceCompat.this.f2839d.mo3057a(new Runnable() {
                    public final void run() {
                        C0774b bVar = (C0774b) MediaBrowserServiceCompat.this.f2837b.get(eVar.mo3053a());
                        if (bVar != null) {
                            MediaBrowserServiceCompat.this.mo3024a(str, bVar, resultReceiver);
                        }
                    }
                });
            }
        }

        /* renamed from: b */
        public final void mo3043b(String str, Bundle bundle, ResultReceiver resultReceiver, C0787e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C0789g gVar = MediaBrowserServiceCompat.this.f2839d;
                final C0787e eVar2 = eVar;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                C07869 r1 = new Runnable() {
                    public final void run() {
                        C0774b bVar = (C0774b) MediaBrowserServiceCompat.this.f2837b.get(eVar2.mo3053a());
                        if (bVar != null) {
                            MediaBrowserServiceCompat.this.mo3027b(str2, bundle2, bVar, resultReceiver2);
                        }
                    }
                };
                gVar.mo3057a(r1);
            }
        }

        /* renamed from: a */
        public final void mo3038a(String str, Bundle bundle, ResultReceiver resultReceiver, C0787e eVar) {
            if (!TextUtils.isEmpty(str) && resultReceiver != null) {
                C0789g gVar = MediaBrowserServiceCompat.this.f2839d;
                final C0787e eVar2 = eVar;
                final String str2 = str;
                final Bundle bundle2 = bundle;
                final ResultReceiver resultReceiver2 = resultReceiver;
                C07858 r1 = new Runnable() {
                    public final void run() {
                        C0774b bVar = (C0774b) MediaBrowserServiceCompat.this.f2837b.get(eVar2.mo3053a());
                        if (bVar != null) {
                            MediaBrowserServiceCompat.this.mo3022a(str2, bundle2, bVar, resultReceiver2);
                        }
                    }
                };
                gVar.mo3057a(r1);
            }
        }

        /* renamed from: a */
        public final void mo3039a(String str, IBinder iBinder, Bundle bundle, C0787e eVar) {
            C0789g gVar = MediaBrowserServiceCompat.this.f2839d;
            final C0787e eVar2 = eVar;
            final String str2 = str;
            final IBinder iBinder2 = iBinder;
            final Bundle bundle2 = bundle;
            C07803 r1 = new Runnable() {
                public final void run() {
                    C0774b bVar = (C0774b) MediaBrowserServiceCompat.this.f2837b.get(eVar2.mo3053a());
                    if (bVar != null) {
                        MediaBrowserServiceCompat.this.mo3023a(str2, bVar, iBinder2, bundle2);
                    }
                }
            };
            gVar.mo3057a(r1);
        }

        /* renamed from: a */
        public final void mo3036a(C0787e eVar, String str, int i, int i2, Bundle bundle) {
            C0789g gVar = MediaBrowserServiceCompat.this.f2839d;
            final C0787e eVar2 = eVar;
            final String str2 = str;
            final int i3 = i;
            final int i4 = i2;
            final Bundle bundle2 = bundle;
            C07836 r1 = new Runnable() {
                public final void run() {
                    IBinder a = eVar2.mo3053a();
                    MediaBrowserServiceCompat.this.f2837b.remove(a);
                    C0774b bVar = new C0774b(str2, i3, i4, bundle2, eVar2);
                    MediaBrowserServiceCompat.this.f2837b.put(a, bVar);
                    try {
                        a.linkToDeath(bVar, 0);
                    } catch (RemoteException unused) {
                    }
                }
            };
            gVar.mo3057a(r1);
        }

        /* renamed from: a */
        public final void mo3037a(String str, int i, int i2, Bundle bundle, C0787e eVar) {
            if (MediaBrowserServiceCompat.this.mo3025a(str, i2)) {
                C0789g gVar = MediaBrowserServiceCompat.this.f2839d;
                final C0787e eVar2 = eVar;
                final String str2 = str;
                final int i3 = i;
                final int i4 = i2;
                final Bundle bundle2 = bundle;
                C07781 r1 = new Runnable() {
                    public final void run() {
                        IBinder a = eVar2.mo3053a();
                        MediaBrowserServiceCompat.this.f2837b.remove(a);
                        C0774b bVar = new C0774b(str2, i3, i4, bundle2, eVar2);
                        MediaBrowserServiceCompat.this.f2838c = bVar;
                        bVar.f2861h = MediaBrowserServiceCompat.this.mo3021a(str2, i4, bundle2);
                        MediaBrowserServiceCompat.this.f2838c = null;
                        if (bVar.f2861h == null) {
                            try {
                                eVar2.mo3056b();
                            } catch (RemoteException unused) {
                            }
                            return;
                        }
                        try {
                            MediaBrowserServiceCompat.this.f2837b.put(a, bVar);
                            a.linkToDeath(bVar, 0);
                            if (MediaBrowserServiceCompat.this.f2840e != null) {
                                eVar2.mo3054a(bVar.f2861h.f2852a, MediaBrowserServiceCompat.this.f2840e, bVar.f2861h.f2853b);
                            }
                        } catch (RemoteException unused2) {
                            MediaBrowserServiceCompat.this.f2837b.remove(a);
                        }
                    }
                };
                gVar.mo3057a(r1);
                return;
            }
            StringBuilder sb = new StringBuilder("Package/uid mismatch: uid=");
            sb.append(i2);
            sb.append(" package=");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$e */
    interface C0787e {
        /* renamed from: a */
        IBinder mo3053a();

        /* renamed from: a */
        void mo3054a(String str, Token token, Bundle bundle) throws RemoteException;

        /* renamed from: a */
        void mo3055a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException;

        /* renamed from: b */
        void mo3056b() throws RemoteException;
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$f */
    static class C0788f implements C0787e {

        /* renamed from: a */
        final Messenger f2909a;

        /* renamed from: a */
        public final IBinder mo3053a() {
            return this.f2909a.getBinder();
        }

        /* renamed from: b */
        public final void mo3056b() throws RemoteException {
            m3275a(2, null);
        }

        C0788f(Messenger messenger) {
            this.f2909a = messenger;
        }

        /* renamed from: a */
        private void m3275a(int i, Bundle bundle) throws RemoteException {
            Message obtain = Message.obtain();
            obtain.what = i;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f2909a.send(obtain);
        }

        /* renamed from: a */
        public final void mo3054a(String str, Token token, Bundle bundle) throws RemoteException {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            m3275a(1, bundle2);
        }

        /* renamed from: a */
        public final void mo3055a(String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) throws RemoteException {
            ArrayList arrayList;
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                String str2 = "data_media_item_list";
                if (list instanceof ArrayList) {
                    arrayList = (ArrayList) list;
                } else {
                    arrayList = new ArrayList(list);
                }
                bundle3.putParcelableArrayList(str2, arrayList);
            }
            m3275a(3, bundle3);
        }
    }

    /* renamed from: android.support.v4.media.MediaBrowserServiceCompat$g */
    final class C0789g extends Handler {

        /* renamed from: b */
        private final C0777d f2911b = new C0777d();

        C0789g() {
        }

        /* renamed from: a */
        public final void mo3057a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        public final void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.m3530a(bundle);
                    this.f2911b.mo3037a(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, (C0787e) new C0788f(message.replyTo));
                    return;
                case 2:
                    this.f2911b.mo3035a(new C0788f(message.replyTo));
                    return;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.m3530a(bundle2);
                    this.f2911b.mo3039a(data.getString("data_media_item_id"), C0603f.m2529a(data, "data_callback_token"), bundle2, (C0787e) new C0788f(message.replyTo));
                    return;
                case 4:
                    this.f2911b.mo3040a(data.getString("data_media_item_id"), C0603f.m2529a(data, "data_callback_token"), (C0787e) new C0788f(message.replyTo));
                    return;
                case 5:
                    this.f2911b.mo3041a(data.getString("data_media_item_id"), (ResultReceiver) data.getParcelable("data_result_receiver"), (C0787e) new C0788f(message.replyTo));
                    return;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.m3530a(bundle3);
                    this.f2911b.mo3036a((C0787e) new C0788f(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    return;
                case 7:
                    this.f2911b.mo3042b(new C0788f(message.replyTo));
                    return;
                case 8:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.m3530a(bundle4);
                    this.f2911b.mo3038a(data.getString("data_search_query"), bundle4, (ResultReceiver) data.getParcelable("data_result_receiver"), (C0787e) new C0788f(message.replyTo));
                    return;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.m3530a(bundle5);
                    this.f2911b.mo3043b(data.getString("data_custom_action"), bundle5, (ResultReceiver) data.getParcelable("data_result_receiver"), new C0788f(message.replyTo));
                    break;
            }
        }

        public final boolean sendMessageAtTime(Message message, long j) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            data.putInt("data_calling_pid", Binder.getCallingPid());
            return super.sendMessageAtTime(message, j);
        }
    }

    /* renamed from: a */
    public abstract C0773a mo3021a(String str, int i, Bundle bundle);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3026a(String str, C0774b bVar, IBinder iBinder) {
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            try {
                if (bVar.f2860g.remove(str) == null) {
                    z = false;
                }
                return z;
            } finally {
                this.f2838c = bVar;
                this.f2838c = null;
            }
        } else {
            List list = (List) bVar.f2860g.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((C0902i) it.next()).f3154a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    bVar.f2860g.remove(str);
                }
            }
            this.f2838c = bVar;
            this.f2838c = null;
            return z2;
        }
    }

    /* renamed from: a */
    private static void m3238a(String str, C0776c<MediaItem> cVar) {
        cVar.f2868f = 2;
        cVar.mo3034b(null);
    }

    /* renamed from: a */
    static List<MediaItem> m3235a(List<MediaItem> list, Bundle bundle) {
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

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo3025a(String str, int i) {
        if (str == null) {
            return false;
        }
        for (String equals : getPackageManager().getPackagesForUid(i)) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m3239a(String str, C0776c<List<MediaItem>> cVar, Bundle bundle) {
        cVar.f2868f = 1;
    }

    /* renamed from: a */
    private static void m3236a(String str, Bundle bundle, C0776c<List<MediaItem>> cVar) {
        cVar.f2868f = 4;
        cVar.mo3034b(null);
    }

    /* renamed from: b */
    private static void m3240b(String str, Bundle bundle, C0776c<Bundle> cVar) {
        cVar.mo3033b((Bundle) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3024a(String str, C0774b bVar, final ResultReceiver resultReceiver) {
        C07702 r0 = new C0776c<MediaItem>(str) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo3028a(MediaItem mediaItem) {
                if ((this.f2868f & 2) != 0) {
                    resultReceiver.mo3271b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelable("media_item", mediaItem);
                resultReceiver.mo3271b(0, bundle);
            }
        };
        this.f2838c = bVar;
        m3238a(str, (C0776c<MediaItem>) r0);
        this.f2838c = null;
        if (!r0.mo3032a()) {
            StringBuilder sb = new StringBuilder("onLoadItem must call detach() or sendResult() before returning for id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo3027b(String str, Bundle bundle, C0774b bVar, final ResultReceiver resultReceiver) {
        C07724 r0 = new C0776c<Bundle>(str) {
            /* access modifiers changed from: private */
            /* renamed from: c */
            public void mo3028a(Bundle bundle) {
                resultReceiver.mo3271b(0, bundle);
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final void mo3029a(Bundle bundle) {
                resultReceiver.mo3271b(-1, bundle);
            }
        };
        this.f2838c = bVar;
        m3240b(str, bundle, r0);
        this.f2838c = null;
        if (!r0.mo3032a()) {
            StringBuilder sb = new StringBuilder("onCustomAction must call detach() or sendResult() or sendError() before returning for action=");
            sb.append(str);
            sb.append(" extras=");
            sb.append(bundle);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    private void m3237a(String str, C0774b bVar, Bundle bundle, Bundle bundle2) {
        final C0774b bVar2 = bVar;
        final String str2 = str;
        final Bundle bundle3 = bundle;
        C07691 r0 = new C0776c<List<MediaItem>>(str, null) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo3028a(List<MediaItem> list) {
                if (MediaBrowserServiceCompat.this.f2837b.get(bVar2.f2859f.mo3053a()) == bVar2) {
                    if ((this.f2868f & 1) != 0) {
                        list = MediaBrowserServiceCompat.m3235a(list, bundle3);
                    }
                    try {
                        bVar2.f2859f.mo3055a(str2, list, bundle3, null);
                    } catch (RemoteException unused) {
                    }
                }
            }
        };
        this.f2838c = bVar;
        if (bundle != null) {
            m3239a(str, (C0776c<List<MediaItem>>) r0, bundle);
        }
        this.f2838c = null;
        if (!r0.mo3032a()) {
            StringBuilder sb = new StringBuilder("onLoadChildren must call detach() or sendResult() before returning for package=");
            sb.append(bVar.f2854a);
            sb.append(" id=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3022a(String str, Bundle bundle, C0774b bVar, final ResultReceiver resultReceiver) {
        C07713 r0 = new C0776c<List<MediaItem>>(str) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public void mo3028a(List<MediaItem> list) {
                if ((this.f2868f & 4) != 0 || list == null) {
                    resultReceiver.mo3271b(-1, null);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaItem[0]));
                resultReceiver.mo3271b(0, bundle);
            }
        };
        this.f2838c = bVar;
        m3236a(str, bundle, (C0776c<List<MediaItem>>) r0);
        this.f2838c = null;
        if (!r0.mo3032a()) {
            StringBuilder sb = new StringBuilder("onSearch must call detach() or sendResult() before returning for query=");
            sb.append(str);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo3023a(String str, C0774b bVar, IBinder iBinder, Bundle bundle) {
        List<C0902i> list = (List) bVar.f2860g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (C0902i iVar : list) {
            if (iBinder == iVar.f3154a && C0803c.m3339a(bundle, (Bundle) iVar.f3155b)) {
                return;
            }
        }
        list.add(new C0902i(iBinder, bundle));
        bVar.f2860g.put(str, list);
        m3237a(str, bVar, bundle, (Bundle) null);
        this.f2838c = bVar;
        this.f2838c = null;
    }
}
