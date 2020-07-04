package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.widget.ImageView;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;

public class Picasso {

    /* renamed from: a */
    static final Handler f50650a = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 3) {
                int i2 = 0;
                if (i == 8) {
                    List list = (List) message.obj;
                    int size = list.size();
                    while (i2 < size) {
                        C18815c cVar = (C18815c) list.get(i2);
                        cVar.f50707b.mo49983a(cVar);
                        i2++;
                    }
                } else if (i == 13) {
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    while (i2 < size2) {
                        C18800a aVar = (C18800a) list2.get(i2);
                        aVar.f50682a.mo49987b(aVar);
                        i2++;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Unknown handler message received: ");
                    sb.append(message.what);
                    throw new AssertionError(sb.toString());
                }
            } else {
                C18800a aVar2 = (C18800a) message.obj;
                if (aVar2.f50682a.f50662m) {
                    aVar2.f50683b.mo50069a();
                }
                aVar2.f50682a.mo49985a(aVar2.mo49997c());
            }
        }
    };

    /* renamed from: b */
    static volatile Picasso f50651b = null;

    /* renamed from: c */
    public final List<C18850u> f50652c;

    /* renamed from: d */
    final Context f50653d;

    /* renamed from: e */
    final C18829i f50654e;

    /* renamed from: f */
    final C18822d f50655f;

    /* renamed from: g */
    final C18853w f50656g;

    /* renamed from: h */
    final Map<Object, C18800a> f50657h;

    /* renamed from: i */
    final Map<ImageView, C18828h> f50658i;

    /* renamed from: j */
    final ReferenceQueue<Object> f50659j;

    /* renamed from: k */
    final Config f50660k;

    /* renamed from: l */
    public boolean f50661l;

    /* renamed from: m */
    public volatile boolean f50662m;

    /* renamed from: n */
    boolean f50663n;

    /* renamed from: o */
    private final C18797c f50664o;

    /* renamed from: p */
    private final C18798d f50665p;

    /* renamed from: q */
    private final C18795b f50666q;

    public enum LoadedFrom {
        MEMORY(-16711936),
        DISK(-16776961),
        NETWORK(-65536);
        
        final int debugColor;

        private LoadedFrom(int i) {
            this.debugColor = i;
        }
    }

    public enum Priority {
        LOW,
        NORMAL,
        HIGH
    }

    /* renamed from: com.squareup.picasso.Picasso$a */
    public static class C18794a {

        /* renamed from: a */
        private final Context f50667a;

        /* renamed from: b */
        private Downloader f50668b;

        /* renamed from: c */
        private ExecutorService f50669c;

        /* renamed from: d */
        private C18822d f50670d;

        /* renamed from: e */
        private C18797c f50671e;

        /* renamed from: f */
        private C18798d f50672f;

        /* renamed from: g */
        private List<C18850u> f50673g;

        /* renamed from: h */
        private Config f50674h;

        /* renamed from: i */
        private boolean f50675i;

        /* renamed from: j */
        private boolean f50676j;

        /* renamed from: a */
        public final Picasso mo49990a() {
            Context context = this.f50667a;
            if (this.f50668b == null) {
                this.f50668b = C18807ad.m61430a(context);
            }
            if (this.f50670d == null) {
                this.f50670d = new C18836l(context);
            }
            if (this.f50669c == null) {
                this.f50669c = new C18844r();
            }
            if (this.f50672f == null) {
                this.f50672f = C18798d.f50681a;
            }
            C18853w wVar = new C18853w(this.f50670d);
            Context context2 = context;
            C18829i iVar = new C18829i(context2, this.f50669c, Picasso.f50650a, this.f50668b, this.f50670d, wVar);
            Picasso picasso = new Picasso(context2, iVar, this.f50670d, this.f50671e, this.f50672f, this.f50673g, wVar, this.f50674h, this.f50675i, this.f50676j);
            return picasso;
        }

        public C18794a(Context context) {
            if (context != null) {
                this.f50667a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        /* renamed from: a */
        public final C18794a mo49989a(C18822d dVar) {
            if (dVar == null) {
                throw new IllegalArgumentException("Memory cache must not be null.");
            } else if (this.f50670d == null) {
                this.f50670d = dVar;
                return this;
            } else {
                throw new IllegalStateException("Memory cache already set.");
            }
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$b */
    static class C18795b extends Thread {

        /* renamed from: a */
        private final ReferenceQueue<Object> f50677a;

        /* renamed from: b */
        private final Handler f50678b;

        public final void run() {
            Process.setThreadPriority(10);
            while (true) {
                try {
                    C18801a aVar = (C18801a) this.f50677a.remove(1000);
                    Message obtainMessage = this.f50678b.obtainMessage();
                    if (aVar != null) {
                        obtainMessage.what = 3;
                        obtainMessage.obj = aVar.f50694a;
                        this.f50678b.sendMessage(obtainMessage);
                    } else {
                        obtainMessage.recycle();
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    this.f50678b.post(new Runnable() {
                        public final void run() {
                            throw new RuntimeException(e);
                        }
                    });
                    return;
                }
            }
        }

        C18795b(ReferenceQueue<Object> referenceQueue, Handler handler) {
            this.f50677a = referenceQueue;
            this.f50678b = handler;
            setDaemon(true);
            setName("Picasso-refQueue");
        }
    }

    /* renamed from: com.squareup.picasso.Picasso$c */
    public interface C18797c {
    }

    /* renamed from: com.squareup.picasso.Picasso$d */
    public interface C18798d {

        /* renamed from: a */
        public static final C18798d f50681a = new C18798d() {
            /* renamed from: a */
            public final C18846s mo49993a(C18846s sVar) {
                return sVar;
            }
        };

        /* renamed from: a */
        C18846s mo49993a(C18846s sVar);
    }

    /* renamed from: a */
    public final void mo49984a(C18857y yVar) {
        mo49985a((Object) yVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49983a(C18815c cVar) {
        C18800a aVar = cVar.f50716k;
        List<C18800a> list = cVar.f50717l;
        boolean z = true;
        boolean z2 = list != null && !list.isEmpty();
        if (aVar == null && !z2) {
            z = false;
        }
        if (z) {
            Bitmap bitmap = cVar.f50718m;
            LoadedFrom loadedFrom = cVar.f50720o;
            if (aVar != null) {
                m61393a(bitmap, loadedFrom, aVar);
            }
            if (z2) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    m61393a(bitmap, loadedFrom, (C18800a) list.get(i));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo49985a(Object obj) {
        C18807ad.m61437a();
        C18800a aVar = (C18800a) this.f50657h.remove(obj);
        if (aVar != null) {
            aVar.mo49996b();
            this.f50654e.mo50036b(aVar);
        }
        if (obj instanceof ImageView) {
            C18828h hVar = (C18828h) this.f50658i.remove((ImageView) obj);
            if (hVar != null) {
                hVar.mo50026a();
            }
        }
    }

    /* renamed from: a */
    public final void mo49980a(ImageView imageView) {
        mo49985a((Object) imageView);
    }

    /* renamed from: c */
    private void m61394c(C18800a aVar) {
        this.f50654e.mo50030a(aVar);
    }

    /* renamed from: a */
    public final C18849t mo49977a(Uri uri) {
        return new C18849t(this, uri, 0);
    }

    /* renamed from: a */
    public static Picasso m61392a(Context context) {
        if (f50651b == null) {
            synchronized (Picasso.class) {
                if (f50651b == null) {
                    f50651b = new C18794a(context).mo49990a();
                }
            }
        }
        return f50651b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Bitmap mo49986b(String str) {
        Bitmap a = this.f50655f.mo50020a(str);
        if (a != null) {
            this.f50656g.mo50100a();
        } else {
            this.f50656g.mo50104b();
        }
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C18846s mo49975a(C18846s sVar) {
        C18846s a = this.f50665p.mo49993a(sVar);
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Request transformer ");
        sb.append(this.f50665p.getClass().getCanonicalName());
        sb.append(" returned null for ");
        sb.append(sVar);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo49987b(C18800a aVar) {
        Bitmap bitmap;
        if (MemoryPolicy.shouldReadFromMemoryCache(aVar.f50686e)) {
            bitmap = mo49986b(aVar.f50690i);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            m61393a(bitmap, LoadedFrom.MEMORY, aVar);
            if (this.f50662m) {
                aVar.f50683b.mo50069a();
                new StringBuilder("from ").append(LoadedFrom.MEMORY);
            }
        } else {
            mo49982a(aVar);
            if (this.f50662m) {
                aVar.f50683b.mo50069a();
            }
        }
    }

    /* renamed from: a */
    public final C18849t mo49976a(int i) {
        if (i != 0) {
            return new C18849t(this, null, i);
        }
        throw new IllegalArgumentException("Resource ID must not be zero.");
    }

    /* renamed from: a */
    public final C18849t mo49978a(File file) {
        if (file == null) {
            return new C18849t(this, null, 0);
        }
        return mo49977a(Uri.fromFile(file));
    }

    /* renamed from: a */
    public final C18849t mo49979a(String str) {
        if (str == null) {
            return new C18849t(this, null, 0);
        }
        if (str.trim().length() != 0) {
            return mo49977a(Uri.parse(str));
        }
        throw new IllegalArgumentException("Path must not be empty.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49982a(C18800a aVar) {
        Object c = aVar.mo49997c();
        if (!(c == null || this.f50657h.get(c) == aVar)) {
            mo49985a(c);
            this.f50657h.put(c, aVar);
        }
        m61394c(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo49981a(ImageView imageView, C18828h hVar) {
        this.f50658i.put(imageView, hVar);
    }

    /* renamed from: a */
    private void m61393a(Bitmap bitmap, LoadedFrom loadedFrom, C18800a aVar) {
        if (!aVar.f50693l) {
            if (!aVar.f50692k) {
                this.f50657h.remove(aVar.mo49997c());
            }
            if (bitmap == null) {
                aVar.mo49994a();
                if (this.f50662m) {
                    aVar.f50683b.mo50069a();
                }
            } else if (loadedFrom != null) {
                aVar.mo49995a(bitmap, loadedFrom);
                if (this.f50662m) {
                    aVar.f50683b.mo50069a();
                    new StringBuilder("from ").append(loadedFrom);
                }
            } else {
                throw new AssertionError("LoadedFrom cannot be null.");
            }
        }
    }

    Picasso(Context context, C18829i iVar, C18822d dVar, C18797c cVar, C18798d dVar2, List<C18850u> list, C18853w wVar, Config config, boolean z, boolean z2) {
        int i;
        this.f50653d = context;
        this.f50654e = iVar;
        this.f50655f = dVar;
        this.f50664o = cVar;
        this.f50665p = dVar2;
        this.f50660k = config;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList(i + 7);
        arrayList.add(new C18852v(context));
        if (list != null) {
            arrayList.addAll(list);
        }
        arrayList.add(new C18825f(context));
        arrayList.add(new C18838n(context));
        arrayList.add(new C18827g(context));
        arrayList.add(new C18814b(context));
        arrayList.add(new C18834j(context));
        arrayList.add(new C18840o(iVar.f50740d, wVar));
        this.f50652c = Collections.unmodifiableList(arrayList);
        this.f50656g = wVar;
        this.f50657h = new WeakHashMap();
        this.f50658i = new WeakHashMap();
        this.f50661l = z;
        this.f50662m = z2;
        this.f50659j = new ReferenceQueue<>();
        this.f50666q = new C18795b(this.f50659j, f50650a);
        this.f50666q.start();
    }
}
