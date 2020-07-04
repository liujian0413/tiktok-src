package com.p280ss.android.message.push.connection.p887a;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6317k;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.bytedance.common.utility.p254b.C9713b;
import com.p280ss.android.message.C19841i;
import com.p280ss.android.message.p885a.C19814c;
import com.p280ss.android.message.p885a.C19821g;
import com.p280ss.android.message.p885a.C19826j;
import com.p280ss.android.message.push.connection.C19861a;
import com.p280ss.android.message.push.connection.C19891b;
import com.p280ss.android.message.push.connection.C19892c;
import com.p280ss.android.message.push.connection.ConnectionState;
import com.p280ss.android.message.push.connection.p887a.p888a.C19863a;
import com.p280ss.android.message.push.connection.p887a.p888a.C19864b;
import com.p280ss.android.message.push.connection.p887a.p888a.C19865c;
import com.p280ss.android.message.push.connection.p887a.p888a.C19867e;
import com.p280ss.android.message.push.p886a.C19854b;
import com.p280ss.android.message.push.p886a.C19856d;
import com.p280ss.android.pushmanager.C20074g;
import com.p280ss.android.pushmanager.app.C20039a.C20041a;
import com.p280ss.android.pushmanager.app.C20047d;
import com.p280ss.android.pushmanager.setting.C20090b;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.SocketFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.message.push.connection.a.e */
public final class C19872e implements C6310a, C19892c {

    /* renamed from: K */
    private static final Set<Integer> f53893K;

    /* renamed from: v */
    static final Object f53894v = new Object();

    /* renamed from: A */
    protected final AtomicBoolean f53895A;

    /* renamed from: B */
    protected final AtomicBoolean f53896B;

    /* renamed from: C */
    protected IOException f53897C;

    /* renamed from: D */
    protected int f53898D;

    /* renamed from: E */
    protected int f53899E;

    /* renamed from: F */
    protected int f53900F;

    /* renamed from: G */
    protected final int f53901G;

    /* renamed from: H */
    protected int f53902H;

    /* renamed from: I */
    protected int f53903I;

    /* renamed from: J */
    protected final C6309f f53904J;

    /* renamed from: L */
    private final Map<ConnectionState, Set<C19861a>> f53905L;

    /* renamed from: a */
    protected final SocketFactory f53906a;

    /* renamed from: b */
    protected final boolean f53907b = true;

    /* renamed from: c */
    protected Context f53908c;

    /* renamed from: d */
    protected C20047d f53909d;

    /* renamed from: e */
    protected C19856d f53910e;

    /* renamed from: f */
    protected C19882h f53911f;

    /* renamed from: g */
    protected List<C19882h> f53912g;

    /* renamed from: h */
    protected int f53913h;

    /* renamed from: i */
    protected int f53914i = -1;

    /* renamed from: j */
    protected Socket f53915j;

    /* renamed from: k */
    protected DataInputStream f53916k;

    /* renamed from: l */
    protected DataOutputStream f53917l;

    /* renamed from: m */
    protected AtomicInteger f53918m;

    /* renamed from: n */
    protected ExecutorService f53919n;

    /* renamed from: o */
    protected Future<?> f53920o;

    /* renamed from: p */
    protected Future<?> f53921p;

    /* renamed from: q */
    protected Future<?> f53922q;

    /* renamed from: r */
    protected Runnable f53923r;

    /* renamed from: s */
    protected Runnable f53924s;

    /* renamed from: t */
    protected final C19875b f53925t;

    /* renamed from: u */
    protected Selector f53926u;

    /* renamed from: w */
    public volatile ConnectionState f53927w;

    /* renamed from: x */
    protected final Map<Integer, C19871d> f53928x;

    /* renamed from: y */
    protected final BlockingQueue<C19871d> f53929y;

    /* renamed from: z */
    protected final AtomicLong f53930z;

    /* renamed from: com.ss.android.message.push.connection.a.e$a */
    class C19874a implements Runnable {
        public final void run() {
            if (C19872e.this.f53927w == ConnectionState.HANDSSHAKEING || C19872e.this.f53927w == ConnectionState.REGISTERING) {
                C19872e.this.mo53258a("Server Connection Exception", true);
                C19872e.this.f53924s = null;
            }
        }

        private C19874a() {
        }
    }

    /* renamed from: com.ss.android.message.push.connection.a.e$b */
    class C19875b {

        /* renamed from: b */
        private long f53933b;

        /* renamed from: c */
        private PendingIntent f53934c;

        /* renamed from: b */
        public final void mo53272b() {
            if (!(C19872e.this.f53908c == null || this.f53934c == null)) {
                try {
                    ((AlarmManager) C19872e.this.f53908c.getSystemService("alarm")).cancel(this.f53934c);
                } catch (Throwable unused) {
                }
                this.f53934c = null;
            }
        }

        /* renamed from: a */
        public final void mo53270a() {
            if (C19872e.this.f53908c != null && !C19872e.this.mo53264f()) {
                mo53272b();
                C19872e.this.f53904J.removeMessages(4);
                this.f53934c = PendingIntent.getService(C19872e.this.f53908c, 0, C19841i.m65521c(C19872e.this.f53908c), 0);
                AlarmManager alarmManager = (AlarmManager) C19872e.this.f53908c.getSystemService("alarm");
                try {
                    new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
                } catch (Exception unused) {
                }
                boolean p = C20090b.m66187a().mo53790p();
                long currentTimeMillis = System.currentTimeMillis() + this.f53933b;
                try {
                    C19814c.m65419a(alarmManager, p ? 1 : 0, currentTimeMillis, this.f53934c);
                } catch (Throwable unused2) {
                }
                C19872e.this.f53904J.sendEmptyMessageDelayed(4, this.f53933b);
            }
        }

        /* renamed from: a */
        public final synchronized void mo53271a(long j) {
            this.f53933b = j;
        }

        public C19875b(long j) {
            this.f53933b = j;
        }
    }

    /* renamed from: com.ss.android.message.push.connection.a.e$c */
    class C19876c implements Runnable {
        public final void run() {
            if (C19872e.this.f53927w == ConnectionState.SOCKET_DISCONNECTED && C19880f.m65651a(C19872e.this.f53908c)) {
                C19872e.this.mo53252a();
            }
            C19872e.this.f53923r = null;
        }

        private C19876c() {
        }
    }

    /* renamed from: com.ss.android.message.push.connection.a.e$d */
    class C19877d implements Runnable {
        public final void run() {
            Thread.currentThread().setName("SocketConnectionThread");
            try {
                if (!C19872e.this.mo53264f()) {
                    if (C19872e.this.f53927w == ConnectionState.SOCKET_CONNECTING) {
                        C19821g.m65441a();
                        return;
                    }
                    C19821g.m65442a(C19872e.this.f53908c);
                    C19872e.this.mo53253a(ConnectionState.SOCKET_CONNECTING);
                    C19872e.this.f53895A.compareAndSet(true, false);
                    C19872e.this.f53918m.getAndSet(0);
                    if (C19872e.this.f53912g == null || C19872e.this.f53912g.isEmpty()) {
                        if (C19872e.this.f53912g == null) {
                            C19872e.this.f53912g = new ArrayList();
                        }
                        List<InetSocketAddress> i = C19872e.this.mo53267i();
                        if (i == null || i.isEmpty()) {
                            throw new IOException("push server list is null");
                        }
                        for (InetSocketAddress hVar : i) {
                            C19872e.this.f53912g.add(new C19882h(hVar, 60000));
                        }
                        C19872e.this.mo53266h();
                    }
                    C19854b.m65564a(C19872e.this.f53908c, "setupConnect");
                    C19872e.this.mo53268j();
                    C19821g.m65441a();
                }
            } catch (IOException e) {
                C19872e.this.mo53258a(e.getMessage(), true);
            } catch (InterruptedException e2) {
                C19872e.this.mo53258a(e2.getMessage(), true);
            } catch (Exception e3) {
                C19872e.this.mo53258a(e3.getMessage(), true);
            } finally {
                C19821g.m65441a();
            }
        }

        private C19877d() {
        }
    }

    /* renamed from: com.ss.android.message.push.connection.a.e$e */
    class C19878e implements Runnable {
        /* JADX WARNING: Removed duplicated region for block: B:74:0x011e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x012a A[SYNTHETIC, Splitter:B:79:0x012a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                java.lang.String r1 = "SocketReadThread"
                r0.setName(r1)
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                java.net.Socket r0 = r0.f53915j
                if (r0 != 0) goto L_0x0010
                return
            L_0x0010:
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                java.net.Socket r0 = r0.f53915j
                java.nio.channels.SocketChannel r0 = r0.getChannel()
                r1 = 1
                if (r0 != 0) goto L_0x0052
            L_0x001b:
                boolean r0 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x0039 }
                if (r0 != 0) goto L_0x0038
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x0039 }
                boolean r0 = r0.mo53263e()     // Catch:{ Exception -> 0x0039 }
                if (r0 == 0) goto L_0x0038
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x0039 }
                boolean r0 = r0.mo53264f()     // Catch:{ Exception -> 0x0039 }
                if (r0 == 0) goto L_0x0032
                return
            L_0x0032:
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x0039 }
                r0.mo53265g()     // Catch:{ Exception -> 0x0039 }
                goto L_0x001b
            L_0x0038:
                return
            L_0x0039:
                r0 = move-exception
                com.ss.android.message.push.connection.a.e r2 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "Unexpected exception receiving call responses e = "
                r3.<init>(r4)
                java.lang.String r0 = r0.getMessage()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.mo53258a(r0, r1)
                return
            L_0x0052:
                com.ss.android.message.push.connection.a.e r2 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                r3 = 0
                r2.f53926u = r3
                java.nio.channels.spi.SelectorProvider r2 = r0.provider()     // Catch:{ Exception -> 0x00eb }
                com.ss.android.message.push.connection.a.e r4 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x00eb }
                java.nio.channels.spi.AbstractSelector r2 = r2.openSelector()     // Catch:{ Exception -> 0x00eb }
                r4.f53926u = r2     // Catch:{ Exception -> 0x00eb }
                com.ss.android.message.push.connection.a.e r2 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x00eb }
                java.nio.channels.Selector r2 = r2.f53926u     // Catch:{ Exception -> 0x00eb }
                java.nio.channels.SelectionKey r2 = r0.register(r2, r1)     // Catch:{ Exception -> 0x00eb }
            L_0x006b:
                if (r0 == 0) goto L_0x00cd
                boolean r3 = r0.isOpen()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r3 == 0) goto L_0x00cd
                boolean r3 = java.lang.Thread.interrupted()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r3 == 0) goto L_0x007e
                boolean r0 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                goto L_0x00cd
            L_0x007e:
                com.ss.android.message.push.connection.a.e r3 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.nio.channels.Selector r3 = r3.f53926u     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                r3.select()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                com.ss.android.message.push.connection.a.e r3 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.nio.channels.Selector r3 = r3.f53926u     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.util.Set r3 = r3.selectedKeys()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.util.Iterator r3 = r3.iterator()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
            L_0x0091:
                boolean r4 = r3.hasNext()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r4 == 0) goto L_0x006b
                java.lang.Object r4 = r3.next()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                java.nio.channels.SelectionKey r4 = (java.nio.channels.SelectionKey) r4     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                r3.remove()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                boolean r4 = r4.isReadable()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r4 == 0) goto L_0x0091
                com.ss.android.message.push.connection.a.e r4 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                boolean r4 = r4.mo53264f()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                if (r4 == 0) goto L_0x00c2
                if (r2 == 0) goto L_0x00b3
                r2.cancel()
            L_0x00b3:
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                java.nio.channels.Selector r0 = r0.f53926u
                if (r0 == 0) goto L_0x00c1
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ IOException -> 0x00c1 }
                java.nio.channels.Selector r0 = r0.f53926u     // Catch:{ IOException -> 0x00c1 }
                r0.close()     // Catch:{ IOException -> 0x00c1 }
                return
            L_0x00c1:
                return
            L_0x00c2:
                com.ss.android.message.push.connection.a.e r4 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                r4.mo53265g()     // Catch:{ Exception -> 0x00ca, all -> 0x00c8 }
                goto L_0x0091
            L_0x00c8:
                r0 = move-exception
                goto L_0x011f
            L_0x00ca:
                r0 = move-exception
                r3 = r2
                goto L_0x00ec
            L_0x00cd:
                if (r2 == 0) goto L_0x00d2
                r2.cancel()
            L_0x00d2:
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                java.nio.channels.Selector r0 = r0.f53926u
                if (r0 == 0) goto L_0x00e1
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ IOException -> 0x00e0 }
                java.nio.channels.Selector r0 = r0.f53926u     // Catch:{ IOException -> 0x00e0 }
                r0.close()     // Catch:{ IOException -> 0x00e0 }
                goto L_0x00e1
            L_0x00e0:
            L_0x00e1:
                boolean r0 = com.bytedance.common.utility.C6312h.m19578b()
                if (r0 == 0) goto L_0x011e
                return
            L_0x00e8:
                r0 = move-exception
                r2 = r3
                goto L_0x011f
            L_0x00eb:
                r0 = move-exception
            L_0x00ec:
                com.ss.android.message.push.connection.a.e r2 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ all -> 0x00e8 }
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e8 }
                java.lang.String r5 = "Unexpected exception receiving call responses e = "
                r4.<init>(r5)     // Catch:{ all -> 0x00e8 }
                java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00e8 }
                r4.append(r0)     // Catch:{ all -> 0x00e8 }
                java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x00e8 }
                r2.mo53258a(r0, r1)     // Catch:{ all -> 0x00e8 }
                if (r3 == 0) goto L_0x0108
                r3.cancel()
            L_0x0108:
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                java.nio.channels.Selector r0 = r0.f53926u
                if (r0 == 0) goto L_0x0117
                com.ss.android.message.push.connection.a.e r0 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ IOException -> 0x0116 }
                java.nio.channels.Selector r0 = r0.f53926u     // Catch:{ IOException -> 0x0116 }
                r0.close()     // Catch:{ IOException -> 0x0116 }
                goto L_0x0117
            L_0x0116:
            L_0x0117:
                boolean r0 = com.bytedance.common.utility.C6312h.m19578b()
                if (r0 == 0) goto L_0x011e
                return
            L_0x011e:
                return
            L_0x011f:
                if (r2 == 0) goto L_0x0124
                r2.cancel()
            L_0x0124:
                com.ss.android.message.push.connection.a.e r1 = com.p280ss.android.message.push.connection.p887a.C19872e.this
                java.nio.channels.Selector r1 = r1.f53926u
                if (r1 == 0) goto L_0x0131
                com.ss.android.message.push.connection.a.e r1 = com.p280ss.android.message.push.connection.p887a.C19872e.this     // Catch:{ IOException -> 0x0131 }
                java.nio.channels.Selector r1 = r1.f53926u     // Catch:{ IOException -> 0x0131 }
                r1.close()     // Catch:{ IOException -> 0x0131 }
            L_0x0131:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19872e.C19878e.run():void");
        }

        private C19878e() {
        }
    }

    /* renamed from: com.ss.android.message.push.connection.a.e$f */
    class C19879f implements Runnable {
        public final void run() {
            Thread.currentThread().setName("SocketWriteThread");
            while (!Thread.interrupted() && C19872e.this.mo53263e() && !C19872e.this.mo53264f()) {
                try {
                    C19872e.this.mo53257a((C19871d) C19872e.this.f53929y.take());
                } catch (InterruptedException e) {
                    C19872e eVar = C19872e.this;
                    StringBuilder sb = new StringBuilder("Unexpected Thread Interrupted exception receiving call responses e = ");
                    sb.append(e.getMessage());
                    eVar.mo53258a(sb.toString(), true);
                    return;
                } catch (Exception e2) {
                    C19872e eVar2 = C19872e.this;
                    StringBuilder sb2 = new StringBuilder("Unexpected exception receiving call responses e = ");
                    sb2.append(e2.getMessage());
                    eVar2.mo53258a(sb2.toString(), true);
                    return;
                }
            }
        }

        private C19879f() {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo53255a(com.p280ss.android.message.push.connection.p887a.p888a.C19864b r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mo53264f()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            com.ss.android.message.push.connection.ConnectionState r0 = r2.f53927w     // Catch:{ all -> 0x003b }
            com.ss.android.message.push.connection.ConnectionState r1 = com.p280ss.android.message.push.connection.ConnectionState.SOCKET_CONNECTED     // Catch:{ all -> 0x003b }
            if (r0 != r1) goto L_0x0039
            android.content.Context r0 = r2.f53908c     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "sendHandShake"
            com.p280ss.android.message.push.p886a.C19854b.m65564a(r0, r1)     // Catch:{ all -> 0x003b }
            com.ss.android.message.push.connection.ConnectionState r0 = com.p280ss.android.message.push.connection.ConnectionState.HANDSSHAKEING     // Catch:{ all -> 0x003b }
            r2.mo53253a(r0)     // Catch:{ all -> 0x003b }
            com.ss.android.message.push.connection.a.d r0 = new com.ss.android.message.push.connection.a.d     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            java.util.concurrent.atomic.AtomicInteger r1 = r2.f53918m     // Catch:{ all -> 0x003b }
            int r1 = r1.incrementAndGet()     // Catch:{ all -> 0x003b }
            r0.f53883a = r1     // Catch:{ all -> 0x003b }
            r1 = 1
            r0.f53884b = r1     // Catch:{ all -> 0x003b }
            byte[] r1 = r3.mo53235a()     // Catch:{ all -> 0x003b }
            r0.f53887e = r1     // Catch:{ all -> 0x003b }
            r0.f53892j = r3     // Catch:{ all -> 0x003b }
            r2.m65614b(r0)     // Catch:{ all -> 0x003b }
            r2.m65626p()     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r2)
            return
        L_0x003b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19872e.mo53255a(com.ss.android.message.push.connection.a.a.b):void");
    }

    /* renamed from: a */
    public final void mo53257a(C19871d dVar) throws Exception {
        if (!mo53264f() && !this.f53895A.get()) {
            C19884j jVar = new C19884j();
            try {
                if (dVar.f53884b == 0) {
                    jVar.write(C19821g.m65445a(dVar.f53884b, 1));
                } else {
                    jVar.write(C19821g.m65445a(dVar.f53884b, 1));
                    jVar.write(C19821g.m65445a(dVar.f53883a, 3));
                    int length = dVar.f53887e == null ? 0 : dVar.f53887e.length;
                    jVar.write(C19821g.m65445a(length, 4));
                    if (length > 0) {
                        jVar.write(dVar.f53887e);
                    }
                }
                byte[] a = jVar.mo53282a();
                int b = jVar.mo53283b();
                synchronized (this.f53917l) {
                    this.f53917l.write(a, 0, b);
                    this.f53917l.flush();
                }
                m65606a((Closeable) jVar);
            } catch (IOException e) {
                mo53258a(e.getMessage(), true);
                throw e;
            } catch (Exception e2) {
                try {
                    StringBuilder sb = new StringBuilder("Unexpected exception receiving call responses e = ");
                    sb.append(e2.getMessage());
                    mo53258a(sb.toString(), true);
                    throw e2;
                } catch (Throwable th) {
                    m65606a((Closeable) jVar);
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53258a(String str, boolean z) {
        Message obtainMessage = this.f53904J.obtainMessage();
        Bundle bundle = new Bundle();
        bundle.putString("close_io_exception", str);
        bundle.putBoolean("close_retry", z);
        obtainMessage.setData(bundle);
        obtainMessage.what = 3;
        this.f53904J.sendMessage(obtainMessage);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f53911f.f53939a != null) {
                jSONObject.put("address", this.f53911f.f53939a.toString());
            }
            jSONObject.put("exception", str);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private boolean m65611a(long j, long j2) {
        if (mo53264f()) {
            return false;
        }
        C20041a a = C19883i.m65654a().mo53279a(j, j2);
        boolean a2 = C19883i.m65654a().mo53280a(a);
        C19883i.m65654a().mo53281b(a);
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0032, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo53252a() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.content.Context r0 = r3.f53908c     // Catch:{ all -> 0x0033 }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            boolean r0 = r3.mo53264f()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x000f
            monitor-exit(r3)
            return
        L_0x000f:
            com.ss.android.message.push.connection.ConnectionState r0 = r3.f53927w     // Catch:{ all -> 0x0033 }
            com.ss.android.message.push.connection.ConnectionState r1 = com.p280ss.android.message.push.connection.ConnectionState.SOCKET_DISCONNECTED     // Catch:{ all -> 0x0033 }
            if (r0 != r1) goto L_0x0031
            java.util.concurrent.Future<?> r0 = r3.f53920o     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0021
            java.util.concurrent.Future<?> r0 = r3.f53920o     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.isDone()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0031
        L_0x0021:
            java.util.concurrent.ExecutorService r0 = r3.m65621k()     // Catch:{ all -> 0x0033 }
            com.ss.android.message.push.connection.a.e$d r1 = new com.ss.android.message.push.connection.a.e$d     // Catch:{ all -> 0x0033 }
            r2 = 0
            r1.<init>()     // Catch:{ all -> 0x0033 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ all -> 0x0033 }
            r3.f53920o = r0     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r3)
            return
        L_0x0033:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19872e.mo53252a():void");
    }

    /* renamed from: a */
    public final void mo53254a(ConnectionState connectionState, C19861a aVar) {
        ((Set) this.f53905L.get(connectionState)).add(aVar);
    }

    /* renamed from: a */
    public final synchronized void mo53253a(ConnectionState connectionState) {
        try {
            C19891b bVar = new C19891b(this.f53927w, connectionState);
            this.f53927w = connectionState;
            HashSet<C19861a> hashSet = new HashSet<>();
            hashSet.addAll((Collection) this.f53905L.get(ConnectionState.ALL));
            hashSet.addAll((Collection) this.f53905L.get(connectionState));
            for (C19861a a : hashSet) {
                a.mo53230a(bVar);
            }
        } catch (IllegalArgumentException unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public final void mo53256a(C19867e eVar) {
        if (!mo53264f()) {
            if (this.f53927w == ConnectionState.HANDSSHAKEED || this.f53927w == ConnectionState.REGISTERED) {
                C19854b.m65564a(this.f53908c, "registerApps");
                mo53253a(ConnectionState.REGISTERING);
                C19871d dVar = new C19871d();
                dVar.f53883a = this.f53918m.incrementAndGet();
                dVar.f53884b = 3;
                dVar.f53887e = eVar.mo53237a();
                dVar.f53892j = eVar;
                m65614b(dVar);
                m65626p();
            }
        }
    }

    /* renamed from: l */
    private void m65622l() {
        m65605a(0);
    }

    /* renamed from: q */
    private void m65627q() {
        if (this.f53924s != null) {
            this.f53904J.removeCallbacks(this.f53924s);
            this.f53924s = null;
        }
    }

    /* renamed from: r */
    private void m65628r() {
        if (this.f53923r != null) {
            this.f53904J.removeCallbacks(this.f53923r);
            this.f53923r = null;
        }
    }

    /* renamed from: b */
    public final synchronized void mo53259b() {
        mo53258a("client close", false);
    }

    /* renamed from: d */
    public final ConnectionState mo53262d() {
        if (m65630t()) {
            return this.f53927w;
        }
        return ConnectionState.SOCKET_DISCONNECTED;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo53263e() {
        if (!this.f53895A.get()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo53264f() {
        if (C19841i.m65518a()) {
            return false;
        }
        mo53258a("Push Service Is Not Allow", false);
        return true;
    }

    /* renamed from: k */
    private synchronized ExecutorService m65621k() {
        if (this.f53919n == null) {
            this.f53919n = C19881g.m65652a((ThreadFactory) new C9713b("PushConnection"));
        }
        return this.f53919n;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m65624n() {
        /*
            r1 = this;
            java.net.Socket r0 = r1.f53915j
            if (r0 == 0) goto L_0x001a
            java.net.Socket r0 = r1.f53915j     // Catch:{ Exception -> 0x0015 }
            java.nio.channels.SocketChannel r0 = r0.getChannel()     // Catch:{ Exception -> 0x0015 }
            if (r0 == 0) goto L_0x0015
            java.net.Socket r0 = r1.f53915j     // Catch:{ Exception -> 0x0015 }
            java.nio.channels.SocketChannel r0 = r0.getChannel()     // Catch:{ Exception -> 0x0015 }
            r0.close()     // Catch:{ Exception -> 0x0015 }
        L_0x0015:
            java.net.Socket r0 = r1.f53915j     // Catch:{ Throwable -> 0x001a }
            r0.close()     // Catch:{ Throwable -> 0x001a }
        L_0x001a:
            r0 = 0
            r1.f53915j = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19872e.m65624n():void");
    }

    /* renamed from: p */
    private void m65626p() {
        m65627q();
        this.f53924s = new C19874a();
        this.f53904J.postDelayed(this.f53924s, 300000);
    }

    /* renamed from: s */
    private void m65629s() {
        m65613b((long) (this.f53903I * 60 * 1000));
        this.f53903I <<= 1;
        if (this.f53903I > this.f53902H) {
            this.f53903I = this.f53902H;
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f53893K = hashSet;
        hashSet.add(Integer.valueOf(0));
        f53893K.add(Integer.valueOf(1));
        f53893K.add(Integer.valueOf(3));
    }

    /* renamed from: t */
    private boolean m65630t() {
        if ((this.f53921p != null && !this.f53921p.isDone() && this.f53922q != null && !this.f53922q.isDone()) || this.f53927w.getStateValue() < ConnectionState.SOCKET_CONNECTED.getStateValue() || this.f53927w.getStateValue() > ConnectionState.REGISTERED.getStateValue()) {
            return true;
        }
        mo53259b();
        return false;
    }

    /* renamed from: o */
    private C19882h m65625o() {
        if (mo53264f() || this.f53912g == null || this.f53912g.isEmpty()) {
            return null;
        }
        int size = this.f53912g.size();
        this.f53914i++;
        int i = (this.f53913h + this.f53914i) % size;
        if (this.f53914i != size) {
            return (C19882h) this.f53912g.get(i);
        }
        if (this.f53912g != null && !this.f53912g.isEmpty()) {
            this.f53912g.clear();
        }
        m65629s();
        return null;
    }

    /* renamed from: c */
    public final void mo53261c() throws IOException {
        if (!mo53264f()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f53930z.get() >= ((long) this.f53898D) && this.f53927w.getStateValue() >= ConnectionState.SOCKET_CONNECTED.getStateValue() && this.f53927w.getStateValue() < ConnectionState.SOCKET_DISCONNECTING.getStateValue()) {
                this.f53930z.set(currentTimeMillis);
                this.f53904J.removeMessages(4);
                C19854b.m65564a(this.f53908c, "sendHeartBeat");
                C19871d dVar = new C19871d();
                dVar.f53884b = 0;
                dVar.f53883a = 0;
                m65614b(dVar);
                this.f53925t.mo53270a();
            }
        }
    }

    /* renamed from: h */
    public final void mo53266h() {
        if (!mo53264f() && this.f53912g != null && !this.f53912g.isEmpty()) {
            int size = this.f53912g.size();
            double random = Math.random();
            double d = (double) size;
            Double.isNaN(d);
            this.f53913h = (int) (random * d);
            this.f53914i = -1;
            this.f53911f = m65625o();
        }
    }

    /* renamed from: m */
    private void m65623m() throws IOException {
        int i = 0;
        int i2 = 0;
        while (true) {
            try {
                break;
            } catch (SocketTimeoutException e) {
                short s = (short) (i + 1);
                m65604a(i, 0, (IOException) e);
                i = s;
            } catch (IOException e2) {
                short s2 = (short) (i2 + 1);
                m65604a(i2, 0, e2);
                i2 = s2;
            } catch (Exception unused) {
                short s3 = (short) (i2 + 1);
                m65604a(i2, 0, new IOException("unknown exception"));
                i2 = s3;
            }
        }
        if (!mo53264f()) {
            if (this.f53896B.get()) {
                this.f53915j = this.f53906a.createSocket();
            } else {
                SocketChannel open = SocketChannel.open();
                open.configureBlocking(false);
                this.f53915j = open.socket();
            }
            this.f53915j.setTcpNoDelay(false);
            this.f53915j.setKeepAlive(true);
            m65609a(this.f53915j, (SocketAddress) this.f53911f.f53939a, this.f53900F);
            mo53253a(ConnectionState.SOCKET_CONNECTED);
            this.f53915j.setSoTimeout(this.f53899E);
            this.f53903I = 1;
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f53911f.f53939a != null) {
                    jSONObject.put("address", this.f53911f.f53939a.toString());
                }
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: i */
    public final List<InetSocketAddress> mo53267i() {
        List<InetSocketAddress> list = null;
        if (mo53264f() || !C19881g.m65653a(this.f53908c)) {
            return null;
        }
        try {
            C19854b.m65564a(this.f53908c, "get serverAddrsString");
            String a = C6317k.m19580a().mo15150a(C19826j.m65467a(C20074g.m66108c(), C20047d.m66018a().mo53674c()));
            if (a == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(a);
            Context context = this.f53908c;
            StringBuilder sb = new StringBuilder("get getServerList");
            sb.append(jSONObject);
            C19854b.m65564a(context, sb.toString());
            int optInt = jSONObject.optInt("max_interval");
            if (optInt > 0) {
                this.f53902H = optInt;
            }
            String optString = jSONObject.optString("addrs");
            if (optString != null) {
                JSONArray jSONArray = new JSONArray(optString);
                List<InetSocketAddress> list2 = null;
                int i = 0;
                while (i < jSONArray.length()) {
                    try {
                        String optString2 = jSONArray.optString(i);
                        if (optString2 != null) {
                            String[] split = optString2.split(":");
                            if (split != null && split.length == 2) {
                                if (list2 == null) {
                                    list2 = new ArrayList<>();
                                }
                                list2.add(new InetSocketAddress(split[0], Integer.parseInt(split[1])));
                            }
                        }
                        i++;
                    } catch (IOException | Exception | JSONException unused) {
                    }
                }
                list = list2;
            } else {
                String optString3 = jSONObject.optString("err_no");
                String optString4 = jSONObject.optString("err_msg");
                if (!C6319n.m19593a(optString3)) {
                    if (!C6319n.m19593a(optString4)) {
                        StringBuilder sb2 = new StringBuilder("get server list err : err_no = ");
                        sb2.append(optString3);
                        sb2.append(" err_msg = ");
                        sb2.append(optString4);
                        throw new IOException(sb2.toString());
                    }
                }
            }
            return list;
        } catch (IOException | Exception | JSONException unused2) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo53268j() throws IOException, InterruptedException {
        if (this.f53915j == null && !this.f53895A.get() && !mo53264f()) {
            m65623m();
            if (!mo53264f()) {
                this.f53916k = new DataInputStream(new C19869b(m65603a(this.f53915j, (long) this.f53915j.getSoTimeout())));
                this.f53917l = new DataOutputStream(new C19870c(m65612b(this.f53915j, 0)));
                if (this.f53921p == null || this.f53921p.isDone()) {
                    this.f53921p = m65621k().submit(new C19878e());
                }
                if (this.f53922q == null || this.f53922q.isDone()) {
                    this.f53922q = m65621k().submit(new C19879f());
                }
                if (!mo53264f()) {
                    this.f53910e.mo53231b(this.f53908c, null);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c2, code lost:
        if (r3 == -1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c6, code lost:
        if (r10.f53911f == null) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (r10.f53911f.f53940b <= 0) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ce, code lost:
        m65605a((long) r10.f53911f.f53940b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00de, code lost:
        throw new java.io.IOException("Push Server Has Close Connection");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0117, code lost:
        if (r10.f53911f.f53940b > 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013e, code lost:
        if (r10.f53911f.f53940b > 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x014a, code lost:
        if (r10.f53911f.f53940b > 0) goto L_0x00ce;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53265g() throws java.lang.Exception {
        /*
            r10 = this;
            boolean r0 = r10.mo53264f()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.util.concurrent.atomic.AtomicBoolean r0 = r10.f53895A
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x0010
            return
        L_0x0010:
            r0 = 8
            r1 = 1
            byte[] r2 = new byte[r0]     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0015:
            java.io.DataInputStream r3 = r10.f53916k     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4 = 0
            int r3 = r3.read(r2, r4, r0)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 <= 0) goto L_0x00c1
            byte[] r3 = com.p280ss.android.message.p885a.C19821g.m65446a(r2, r4, r1)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r3 = com.p280ss.android.message.p885a.C19821g.m65438a(r3)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4 = 3
            byte[] r4 = com.p280ss.android.message.p885a.C19821g.m65446a(r2, r1, r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r4 = com.p280ss.android.message.p885a.C19821g.m65438a(r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r5 = 4
            byte[] r5 = com.p280ss.android.message.p885a.C19821g.m65446a(r2, r5, r5)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r5 = com.p280ss.android.message.p885a.C19821g.m65438a(r5)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r6 = 16
            if (r3 != r6) goto L_0x0053
            com.ss.android.message.push.connection.a.d r7 = new com.ss.android.message.push.connection.a.d     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.<init>()     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53883a = r4     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53884b = r6     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            com.ss.android.message.push.connection.a.a.c r4 = new com.ss.android.message.push.connection.a.a.c     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4.<init>()     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53892j = r4     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53890h = r8     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            goto L_0x0065
        L_0x0053:
            java.util.Map<java.lang.Integer, com.ss.android.message.push.connection.a.d> r6 = r10.f53928x     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.Object r4 = r6.remove(r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7 = r4
            com.ss.android.message.push.connection.a.d r7 = (com.p280ss.android.message.push.connection.p887a.C19871d) r7     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r7 == 0) goto L_0x00ae
            com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0065:
            r7.f53885c = r3     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53886d = r5     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r7 == 0) goto L_0x0076
            byte[] r3 = new byte[r5]     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r7.f53888f = r3     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.io.DataInputStream r3 = r10.f53916k     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            byte[] r4 = r7.f53888f     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r3.read(r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0076:
            byte[] r3 = r7.f53888f     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x0085
            com.ss.android.message.push.connection.a.a.d r3 = r7.f53892j     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x0085
            com.ss.android.message.push.connection.a.a.d r3 = r7.f53892j     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            byte[] r4 = r7.f53888f     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r3.mo53234a(r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x0085:
            java.util.Set<java.lang.Integer> r3 = f53893K     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            int r4 = r7.f53884b     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            boolean r3 = r3.contains(r4)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            if (r3 == 0) goto L_0x00a0
            com.bytedance.common.utility.collection.f r3 = r10.f53904J     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            android.os.Message r3 = r3.obtainMessage(r1, r7)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            com.bytedance.common.utility.collection.f r4 = r10.f53904J     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4.sendMessage(r3)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            goto L_0x0015
        L_0x00a0:
            com.bytedance.common.utility.collection.f r3 = r10.f53904J     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4 = 2
            android.os.Message r3 = r3.obtainMessage(r4, r7)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            com.bytedance.common.utility.collection.f r4 = r10.f53904J     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            r4.sendMessage(r3)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            goto L_0x0015
        L_0x00ae:
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            if (r0 == 0) goto L_0x00c0
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            int r0 = r0.f53940b
            if (r0 <= 0) goto L_0x00c0
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            int r0 = r0.f53940b
            long r0 = (long) r0
            r10.m65605a(r0)
        L_0x00c0:
            return
        L_0x00c1:
            r0 = -1
            if (r3 == r0) goto L_0x00d7
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            int r0 = r0.f53940b
            if (r0 <= 0) goto L_0x014d
        L_0x00ce:
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            int r0 = r0.f53940b
            long r0 = (long) r0
            r10.m65605a(r0)
            return
        L_0x00d7:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            java.lang.String r2 = "Push Server Has Close Connection"
            r0.<init>(r2)     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
            throw r0     // Catch:{ MessageTypeException -> 0x0141, UnsupportedOperationException -> 0x0135, IOException -> 0x00f8, Exception -> 0x00e1 }
        L_0x00df:
            r0 = move-exception
            goto L_0x0122
        L_0x00e1:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00df }
            java.lang.String r3 = "Unexpected exception receiving call responses e = "
            r2.<init>(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r3 = r0.getMessage()     // Catch:{ all -> 0x00df }
            r2.append(r3)     // Catch:{ all -> 0x00df }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x00df }
            r10.mo53258a(r2, r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x00f8:
            r0 = move-exception
            boolean r2 = r0 instanceof java.net.SocketTimeoutException     // Catch:{ all -> 0x00df }
            if (r2 == 0) goto L_0x011a
            com.ss.android.message.push.connection.a.h r2 = r10.f53911f     // Catch:{ all -> 0x00df }
            int r2 = r2.f53940b     // Catch:{ all -> 0x00df }
            if (r2 <= 0) goto L_0x011a
            r10.f53897C = r0     // Catch:{ all -> 0x00df }
            boolean r1 = com.bytedance.common.utility.C6312h.m19578b()     // Catch:{ all -> 0x00df }
            if (r1 == 0) goto L_0x010f
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x00df }
        L_0x010f:
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            int r0 = r0.f53940b
            if (r0 <= 0) goto L_0x014d
            goto L_0x00ce
        L_0x011a:
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x00df }
            r10.mo53258a(r2, r1)     // Catch:{ all -> 0x00df }
            throw r0     // Catch:{ all -> 0x00df }
        L_0x0122:
            com.ss.android.message.push.connection.a.h r1 = r10.f53911f
            if (r1 == 0) goto L_0x0134
            com.ss.android.message.push.connection.a.h r1 = r10.f53911f
            int r1 = r1.f53940b
            if (r1 <= 0) goto L_0x0134
            com.ss.android.message.push.connection.a.h r1 = r10.f53911f
            int r1 = r1.f53940b
            long r1 = (long) r1
            r10.m65605a(r1)
        L_0x0134:
            throw r0
        L_0x0135:
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            int r0 = r0.f53940b
            if (r0 <= 0) goto L_0x014d
            goto L_0x00ce
        L_0x0141:
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            if (r0 == 0) goto L_0x014d
            com.ss.android.message.push.connection.a.h r0 = r10.f53911f
            int r0 = r0.f53940b
            if (r0 <= 0) goto L_0x014d
            goto L_0x00ce
        L_0x014d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19872e.mo53265g():void");
    }

    /* renamed from: a */
    private static void m65606a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static C19871d m65602a(Message message) {
        if (message == null || message.obj == null) {
            return null;
        }
        return (C19871d) message.obj;
    }

    /* renamed from: e */
    private void m65617e(C19871d dVar) {
        if (!mo53264f() && dVar != null) {
            int i = dVar.f53885c;
            if (i != 0) {
                if (i == 255) {
                    m65620h(dVar);
                }
            } else if (C6312h.m19578b()) {
            }
        }
    }

    /* renamed from: b */
    private void m65613b(long j) {
        m65628r();
        this.f53923r = new C19876c();
        this.f53904J.postDelayed(this.f53923r, j);
    }

    /* renamed from: c */
    private void m65615c(C19871d dVar) {
        if (!mo53264f() && dVar != null) {
            int i = dVar.f53884b;
            if (i != 3) {
                switch (i) {
                    case 0:
                        C19854b.m65564a(this.f53908c, "handle TYPE_HEART_BEAT");
                        m65617e(dVar);
                        return;
                    case 1:
                        C19854b.m65564a(this.f53908c, "handle TYPE_HAND_SHAKE");
                        m65616d(dVar);
                        return;
                }
            } else {
                C19854b.m65564a(this.f53908c, "handle TYPE_REGISTER");
                m65618f(dVar);
            }
        }
    }

    /* renamed from: f */
    private void m65618f(C19871d dVar) {
        if (!mo53264f() && dVar != null) {
            switch (dVar.f53885c) {
                case 254:
                    C19854b.m65564a(this.f53908c, "handle TYPE_OK");
                    mo53253a(ConnectionState.REGISTERED);
                    m65627q();
                    if (this.f53924s != null) {
                        this.f53904J.removeCallbacks(this.f53924s);
                        this.f53924s = null;
                        return;
                    }
                    break;
                case NormalGiftView.ALPHA_255 /*255*/:
                    m65620h(dVar);
                    break;
            }
        }
    }

    /* renamed from: g */
    private void m65619g(C19871d dVar) {
        if (!mo53264f() && dVar != null) {
            C19854b.m65564a(this.f53908c, "handleMessageEvent");
            C19865c cVar = (C19865c) dVar.f53892j;
            if (m65611a(cVar.f53866c, dVar.f53890h)) {
                C19854b.m65564a(this.f53908c, "handleMessageEvent");
            } else {
                this.f53910e.mo53226a((long) cVar.f53865b, cVar.f53867d);
            }
            dVar.f53884b = 17;
            dVar.f53887e = cVar.mo53236a();
            m65614b(dVar);
        }
    }

    /* renamed from: h */
    private void m65620h(C19871d dVar) {
        if (!mo53264f() && dVar != null) {
            C19854b.m65564a(this.f53908c, "handle TYPE_ERROR");
            C19863a aVar = (C19863a) dVar.f53892j;
            if (aVar != null) {
                StringBuilder sb = new StringBuilder("err_no : ");
                sb.append(aVar.f53854a);
                sb.append(" err_msg : ");
                sb.append(aVar.f53855b);
                dVar.f53891i = new IOException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    private void m65607a(IOException iOException) {
        if (this.f53927w != ConnectionState.SOCKET_DISCONNECTED && this.f53927w.getStateValue() < ConnectionState.SOCKET_DISCONNECTING.getStateValue() && this.f53895A.compareAndSet(false, true)) {
            mo53253a(ConnectionState.SOCKET_DISCONNECTING);
            this.f53897C = iOException;
        }
    }

    /* renamed from: b */
    private boolean m65614b(C19871d dVar) {
        if (mo53264f() || this.f53895A.get() || dVar == null) {
            return false;
        }
        this.f53929y.add(dVar);
        if (f53893K.contains(Integer.valueOf(dVar.f53884b))) {
            this.f53928x.put(Integer.valueOf(dVar.f53883a), dVar);
        }
        return true;
    }

    /* renamed from: d */
    private void m65616d(C19871d dVar) {
        if (!mo53264f() && dVar != null) {
            int i = dVar.f53885c;
            if (i != 2) {
                if (i == 255) {
                    C19854b.m65564a(this.f53908c, "handle TYPE_ERROR");
                    m65620h(dVar);
                }
                return;
            }
            C19854b.m65564a(this.f53908c, "handle TYPE_HAND_SHAKE_REPLY");
            mo53253a(ConnectionState.HANDSSHAKEED);
            m65627q();
            this.f53910e.mo53232c(this.f53908c, null);
            if (dVar.f53892j != null) {
                C19864b bVar = (C19864b) dVar.f53892j;
                if (bVar.f53863h != -1) {
                    this.f53925t.mo53271a((long) (bVar.f53863h * 1000));
                }
            }
            this.f53925t.mo53270a();
        }
    }

    /* renamed from: a */
    private void m65605a(long j) {
        Iterator it = this.f53929y.iterator();
        while (it.hasNext()) {
            C19871d dVar = (C19871d) it.next();
            long currentTimeMillis = System.currentTimeMillis() - dVar.f53889g;
            if (currentTimeMillis >= j) {
                if (this.f53897C == null) {
                    StringBuilder sb = new StringBuilder("Packet id=");
                    sb.append(dVar.f53883a);
                    sb.append(", waitTime=");
                    sb.append(currentTimeMillis);
                    sb.append(", rpcTimetout=");
                    sb.append(j);
                    this.f53897C = new IOException(sb.toString());
                }
                dVar.f53891i = this.f53897C;
                synchronized (dVar) {
                    dVar.notifyAll();
                }
                it.remove();
                this.f53928x.remove(Integer.valueOf(dVar.f53883a));
            }
        }
        try {
            if (!this.f53929y.isEmpty()) {
                C19871d dVar2 = (C19871d) this.f53929y.peek();
                if (dVar2 != null) {
                    long currentTimeMillis2 = System.currentTimeMillis() - dVar2.f53889g;
                    if (currentTimeMillis2 < j) {
                        j -= currentTimeMillis2;
                    }
                }
            }
            if (!this.f53895A.get()) {
                this.f53897C = null;
                if (this.f53915j != null) {
                    this.f53915j.setSoTimeout((int) j);
                }
            }
        } catch (SocketException unused) {
        }
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            if (message.what == 3 || !mo53264f()) {
                switch (message.what) {
                    case 1:
                        m65615c(m65602a(message));
                        return;
                    case 2:
                        m65619g(m65602a(message));
                        return;
                    case 3:
                        if (message.getData() != null && !message.getData().isEmpty()) {
                            String string = message.getData().getString("close_io_exception");
                            boolean z = message.getData().getBoolean("close_retry", true);
                            Context context = this.f53908c;
                            StringBuilder sb = new StringBuilder("receive close event ioException : ");
                            sb.append(string);
                            sb.append(" isRetry : ");
                            sb.append(z);
                            C19854b.m65564a(context, sb.toString());
                            m65608a(new IOException(string), z);
                            return;
                        }
                        return;
                    case 4:
                        if (this.f53908c != null) {
                            try {
                                this.f53908c.startService(C19841i.m65521c(this.f53908c));
                                return;
                            } catch (Exception unused) {
                                break;
                            }
                        } else {
                            return;
                        }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(38:9|10|(27:12|(1:14)|16|(1:20)|21|(4:25|26|27|(1:31))|32|33|(1:35)|36|(1:40)|41|(1:43)|44|(1:46)|47|(1:51)|52|(1:54)|55|(1:57)|58|(1:60)|61|(1:63)|(1:67)|68)|15|16|18|20|21|23|25|26|27|29|31|32|33|(0)|36|38|40|41|(0)|44|(0)|47|49|51|52|(0)|55|(0)|58|(0)|61|(0)|65|67|68) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0069 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0081 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008a A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a8 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b3 A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00be A[Catch:{ Exception -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c7 A[Catch:{ Exception -> 0x00d8 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m65610a(boolean r3) {
        /*
            r2 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.f53895A
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.message.push.connection.ConnectionState r0 = r2.f53927w
            com.ss.android.message.push.connection.ConnectionState r1 = com.p280ss.android.message.push.connection.ConnectionState.SOCKET_DISCONNECTED
            if (r0 != r1) goto L_0x0018
            if (r3 != 0) goto L_0x0014
            r2.m65628r()
        L_0x0014:
            r2.m65627q()
            return
        L_0x0018:
            java.io.IOException r0 = r2.f53897C     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x002d
            java.util.Map<java.lang.Integer, com.ss.android.message.push.connection.a.d> r0 = r2.f53928x     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0030
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x00d8 }
            java.lang.String r1 = "Unexpected closed connection"
            r0.<init>(r1)     // Catch:{ Exception -> 0x00d8 }
            r2.f53897C = r0     // Catch:{ Exception -> 0x00d8 }
        L_0x002d:
            r2.m65622l()     // Catch:{ Exception -> 0x00d8 }
        L_0x0030:
            java.util.concurrent.Future<?> r0 = r2.f53920o     // Catch:{ Exception -> 0x00d8 }
            r1 = 1
            if (r0 == 0) goto L_0x0042
            java.util.concurrent.Future<?> r0 = r2.f53920o     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0042
            java.util.concurrent.Future<?> r0 = r2.f53920o     // Catch:{ Exception -> 0x00d8 }
            r0.cancel(r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x0042:
            java.util.concurrent.Future<?> r0 = r2.f53921p     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x0064
            java.util.concurrent.Future<?> r0 = r2.f53921p     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x0064
            java.util.concurrent.Future<?> r0 = r2.f53921p     // Catch:{ Exception -> 0x00d8 }
            r0.cancel(r1)     // Catch:{ Exception -> 0x00d8 }
            java.nio.channels.Selector r0 = r2.f53926u     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            java.nio.channels.Selector r0 = r2.f53926u     // Catch:{ Exception -> 0x0064 }
            boolean r0 = r0.isOpen()     // Catch:{ Exception -> 0x0064 }
            if (r0 == 0) goto L_0x0064
            java.nio.channels.Selector r0 = r2.f53926u     // Catch:{ Exception -> 0x0064 }
            r0.wakeup()     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            r2.m65627q()     // Catch:{ Exception -> 0x00d8 }
            if (r3 != 0) goto L_0x006c
            r2.m65628r()     // Catch:{ Exception -> 0x00d8 }
        L_0x006c:
            java.util.concurrent.Future<?> r0 = r2.f53922q     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x007d
            java.util.concurrent.Future<?> r0 = r2.f53922q     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isDone()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x007d
            java.util.concurrent.Future<?> r0 = r2.f53922q     // Catch:{ Exception -> 0x00d8 }
            r0.cancel(r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x007d:
            com.ss.android.message.push.connection.a.e$b r0 = r2.f53925t     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x0086
            com.ss.android.message.push.connection.a.e$b r0 = r2.f53925t     // Catch:{ Exception -> 0x00d8 }
            r0.mo53272b()     // Catch:{ Exception -> 0x00d8 }
        L_0x0086:
            com.bytedance.common.utility.collection.f r0 = r2.f53904J     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x0090
            com.bytedance.common.utility.collection.f r0 = r2.f53904J     // Catch:{ Exception -> 0x00d8 }
            r1 = 4
            r0.removeMessages(r1)     // Catch:{ Exception -> 0x00d8 }
        L_0x0090:
            java.util.concurrent.ExecutorService r0 = r2.f53919n     // Catch:{ Exception -> 0x00d8 }
            r1 = 0
            if (r0 == 0) goto L_0x00a4
            java.util.concurrent.ExecutorService r0 = r2.f53919n     // Catch:{ Exception -> 0x00d8 }
            boolean r0 = r0.isShutdown()     // Catch:{ Exception -> 0x00d8 }
            if (r0 != 0) goto L_0x00a4
            java.util.concurrent.ExecutorService r0 = r2.f53919n     // Catch:{ Exception -> 0x00d8 }
            r0.shutdown()     // Catch:{ Exception -> 0x00d8 }
            r2.f53919n = r1     // Catch:{ Exception -> 0x00d8 }
        L_0x00a4:
            java.io.DataInputStream r0 = r2.f53916k     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x00af
            java.io.DataInputStream r0 = r2.f53916k     // Catch:{ Exception -> 0x00d8 }
            m65606a(r0)     // Catch:{ Exception -> 0x00d8 }
            r2.f53916k = r1     // Catch:{ Exception -> 0x00d8 }
        L_0x00af:
            java.io.DataOutputStream r0 = r2.f53917l     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x00ba
            java.io.DataOutputStream r0 = r2.f53917l     // Catch:{ Exception -> 0x00d8 }
            m65606a(r0)     // Catch:{ Exception -> 0x00d8 }
            r2.f53917l = r1     // Catch:{ Exception -> 0x00d8 }
        L_0x00ba:
            java.net.Socket r0 = r2.f53915j     // Catch:{ Exception -> 0x00d8 }
            if (r0 == 0) goto L_0x00c1
            r2.m65624n()     // Catch:{ Exception -> 0x00d8 }
        L_0x00c1:
            com.ss.android.message.push.connection.ConnectionState r0 = r2.f53927w     // Catch:{ Exception -> 0x00d8 }
            com.ss.android.message.push.connection.ConnectionState r1 = com.p280ss.android.message.push.connection.ConnectionState.SOCKET_DISCONNECTED     // Catch:{ Exception -> 0x00d8 }
            if (r0 == r1) goto L_0x00cc
            com.ss.android.message.push.connection.ConnectionState r0 = com.p280ss.android.message.push.connection.ConnectionState.SOCKET_DISCONNECTED     // Catch:{ Exception -> 0x00d8 }
            r2.mo53253a(r0)     // Catch:{ Exception -> 0x00d8 }
        L_0x00cc:
            if (r3 == 0) goto L_0x00d7
            boolean r3 = r2.mo53264f()     // Catch:{ Exception -> 0x00d8 }
            if (r3 != 0) goto L_0x00d7
            r2.m65629s()     // Catch:{ Exception -> 0x00d8 }
        L_0x00d7:
            return
        L_0x00d8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.message.push.connection.p887a.C19872e.m65610a(boolean):void");
    }

    /* renamed from: a */
    private static InputStream m65603a(Socket socket, long j) throws IOException {
        if (socket.getChannel() == null) {
            return socket.getInputStream();
        }
        return new C19887l(socket);
    }

    /* renamed from: b */
    private static OutputStream m65612b(Socket socket, long j) throws IOException {
        if (socket.getChannel() == null) {
            return socket.getOutputStream();
        }
        return new C19889m(socket);
    }

    public C19872e(Context context, C19856d dVar) throws IOException {
        this.f53918m = new AtomicInteger(0);
        this.f53905L = new HashMap();
        this.f53927w = ConnectionState.SOCKET_DISCONNECTED;
        this.f53928x = new ConcurrentHashMap();
        this.f53929y = new LinkedBlockingQueue();
        this.f53930z = new AtomicLong();
        this.f53895A = new AtomicBoolean();
        this.f53896B = new AtomicBoolean(false);
        this.f53898D = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        this.f53899E = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        this.f53900F = VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
        this.f53901G = 0;
        this.f53902H = 60;
        this.f53903I = 1;
        this.f53904J = new C6309f(Looper.getMainLooper(), this);
        this.f53908c = context;
        this.f53909d = C20047d.m66018a();
        this.f53910e = dVar;
        this.f53906a = SocketFactory.getDefault();
        this.f53925t = new C19875b((long) this.f53898D);
        for (ConnectionState put : ConnectionState.values()) {
            this.f53905L.put(put, new HashSet());
        }
    }

    /* renamed from: b */
    public final boolean mo53260b(ConnectionState connectionState, C19861a aVar) {
        return ((Set) this.f53905L.get(connectionState)).remove(aVar);
    }

    /* renamed from: a */
    private void m65608a(IOException iOException, boolean z) {
        m65607a(iOException);
        m65610a(z);
    }

    /* renamed from: a */
    private void m65604a(int i, int i2, IOException iOException) throws IOException {
        if (!mo53264f()) {
            try {
                JSONObject jSONObject = new JSONObject();
                if (this.f53911f.f53939a != null) {
                    jSONObject.put("address", this.f53911f.f53939a.toString());
                }
                jSONObject.put("exception", iOException.getMessage());
            } catch (Throwable unused) {
            }
            m65624n();
            if (i >= 0) {
                this.f53911f = m65625o();
                if (this.f53911f != null) {
                    mo53253a(ConnectionState.SOCKET_CONNECTING);
                } else {
                    throw iOException;
                }
            }
        }
    }

    /* renamed from: a */
    private void m65609a(Socket socket, SocketAddress socketAddress, int i) throws IOException {
        if (!mo53264f()) {
            if (socket == null || socketAddress == null || i < 0) {
                throw new IllegalArgumentException("Illegal argument for connect()");
            }
            SocketChannel channel = socket.getChannel();
            if (channel == null) {
                socket.connect(socketAddress, i);
            } else {
                C19886k.m65665a(channel, socketAddress, (long) i);
            }
            if (socket.getLocalPort() == socket.getPort() && socket.getLocalAddress().equals(socket.getInetAddress())) {
                m65624n();
                throw new ConnectException("Localhost targeted connection resulted in a loopback. No daemon is listening on the target port.");
            }
        }
    }
}
