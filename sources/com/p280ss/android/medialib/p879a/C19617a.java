package com.p280ss.android.medialib.p879a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p280ss.android.vesdk.C45372t;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.libsdl.app.AudioRecorderInterface;

/* renamed from: com.ss.android.medialib.a.a */
public final class C19617a implements Runnable {

    /* renamed from: a */
    public C19618a f53109a;

    /* renamed from: b */
    public AtomicInteger f53110b = new AtomicInteger(0);

    /* renamed from: c */
    public boolean f53111c = true;

    /* renamed from: d */
    private volatile C19619b f53112d;

    /* renamed from: e */
    private final Object f53113e = new Object();

    /* renamed from: f */
    private boolean f53114f;

    /* renamed from: g */
    private boolean f53115g;

    /* renamed from: h */
    private AudioRecorderInterface f53116h;

    /* renamed from: i */
    private boolean f53117i = false;

    /* renamed from: j */
    private final Object f53118j;

    /* renamed from: com.ss.android.medialib.a.a$a */
    public interface C19618a {
        int onProcessData(byte[] bArr, int i);
    }

    /* renamed from: com.ss.android.medialib.a.a$b */
    static class C19619b extends Handler {

        /* renamed from: a */
        private WeakReference<C19617a> f53119a;

        public C19619b(C19617a aVar) {
            this.f53119a = new WeakReference<>(aVar);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            C19617a aVar = (C19617a) this.f53119a.get();
            if (aVar == null) {
                C45372t.m143409d("AudioDataProcessThread", "EncoderHandler.handleMessage: encoder is null");
                return;
            }
            switch (i) {
                case 0:
                    aVar.mo52195b(message.arg1, message.arg2, ((Double) message.obj).doubleValue());
                    return;
                case 1:
                    aVar.mo52200g();
                    return;
                case 2:
                    C45372t.m143403a("AudioDataProcessThread", "Exit loop");
                    aVar.mo52200g();
                    removeMessages(3);
                    Looper.myLooper().quit();
                    return;
                case 3:
                    if (!aVar.f53111c) {
                        byte[] bArr = (byte[]) message.obj;
                        int i2 = message.arg1;
                        int decrementAndGet = aVar.f53110b.decrementAndGet();
                        if (aVar.f53109a != null) {
                            aVar.f53109a.onProcessData(bArr, i2);
                            StringBuilder sb = new StringBuilder("Buffer processed, size=");
                            sb.append(i2);
                            sb.append(", ");
                            sb.append(decrementAndGet);
                            sb.append(" buffers remaining");
                            C45372t.m143405b("AudioDataProcessThread", sb.toString());
                            break;
                        }
                    } else {
                        C45372t.m143407c("AudioDataProcessThread", "Cannot feed() after stopFeeding.");
                        return;
                    }
                    break;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0010, code lost:
        if (r3.f53115g == false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0014, code lost:
        if (r3.f53111c != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0016, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0017, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0018, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000b, code lost:
        r1 = r3.f53118j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        monitor-enter(r1);
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo52196c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f53113e
            monitor-enter(r0)
            boolean r1 = r3.f53114f     // Catch:{ all -> 0x001c }
            r2 = 0
            if (r1 != 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r2
        L_0x000a:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            java.lang.Object r1 = r3.f53118j
            monitor-enter(r1)
            boolean r0 = r3.f53115g     // Catch:{ all -> 0x0019 }
            if (r0 == 0) goto L_0x0017
            boolean r0 = r3.f53111c     // Catch:{ all -> 0x0019 }
            if (r0 != 0) goto L_0x0017
            r2 = 1
        L_0x0017:
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            return r2
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            throw r0
        L_0x001c:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.p879a.C19617a.mo52196c():boolean");
    }

    /* renamed from: e */
    public final void mo52198e() {
        synchronized (this.f53113e) {
            if (this.f53114f) {
                this.f53117i = true;
            }
        }
    }

    /* renamed from: b */
    public final void mo52194b() {
        C45372t.m143407c("AudioDataProcessThread", "stopFeeding");
        synchronized (this.f53113e) {
            if (!this.f53114f) {
                C45372t.m143407c("AudioDataProcessThread", "startFeeding not ready");
            } else {
                this.f53112d.sendMessage(this.f53112d.obtainMessage(1));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        if (r4.f53111c == false) goto L_0x0014;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52197d() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f53118j
            monitor-enter(r0)
            java.lang.Object r1 = r4.f53113e     // Catch:{ all -> 0x002e }
            monitor-enter(r1)     // Catch:{ all -> 0x002e }
            com.ss.android.medialib.a.a$b r2 = r4.f53112d     // Catch:{ all -> 0x002b }
            r3 = 1
            boolean r2 = r2.hasMessages(r3)     // Catch:{ all -> 0x002b }
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            if (r2 != 0) goto L_0x0014
            boolean r1 = r4.f53111c     // Catch:{ all -> 0x002e }
            if (r1 != 0) goto L_0x0029
        L_0x0014:
            java.lang.String r1 = "AudioDataProcessThread"
            java.lang.String r2 = "waiting audio process start"
            com.p280ss.android.medialib.common.C19706c.m64969a(r1, r2)     // Catch:{ all -> 0x002e }
            java.lang.Object r1 = r4.f53118j     // Catch:{ InterruptedException -> 0x0022 }
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0022 }
        L_0x0022:
            java.lang.String r1 = "AudioDataProcessThread"
            java.lang.String r2 = "waiting audio process done"
            com.p280ss.android.medialib.common.C19706c.m64969a(r1, r2)     // Catch:{ all -> 0x002e }
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            return
        L_0x002b:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x002b }
            throw r2     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.p879a.C19617a.mo52197d():void");
    }

    /* renamed from: f */
    public final void mo52199f() {
        synchronized (this.f53113e) {
            if (this.f53114f) {
                this.f53112d.sendMessage(this.f53112d.obtainMessage(2));
                C45372t.m143405b("AudioDataProcessThread", "stop()");
            }
        }
    }

    /* renamed from: g */
    public final void mo52200g() {
        synchronized (this.f53118j) {
            C45372t.m143403a("AudioDataProcessThread", "handleStopFeeding() called");
            if (!this.f53111c) {
                if (this.f53116h != null) {
                    this.f53116h.closeWavFile(this.f53117i);
                } else {
                    C45372t.m143409d("AudioDataProcessThread", "handleStop: Discard wav file");
                }
                this.f53111c = true;
                this.f53117i = false;
                this.f53118j.notify();
            }
        }
    }

    public final void run() {
        Looper.prepare();
        synchronized (this.f53113e) {
            this.f53112d = new C19619b(this);
            this.f53114f = true;
            this.f53113e.notify();
        }
        Looper.loop();
        C45372t.m143405b("AudioDataProcessThread", "Encoder thread exiting");
        synchronized (this.f53113e) {
            this.f53115g = false;
            this.f53114f = false;
            this.f53112d = null;
        }
    }

    /* renamed from: a */
    public final void mo52191a() {
        StringBuilder sb = new StringBuilder();
        sb.append(C45372t.m143404b());
        sb.append(": ");
        sb.append(C45372t.m143408d());
        C45372t.m143403a("AudioDataProcessThread", sb.toString());
        synchronized (this.f53113e) {
            if (this.f53115g) {
                C45372t.m143407c("AudioDataProcessThread", "thread already running");
                return;
            }
            this.f53115g = true;
            new Thread(this, "AudioDataProcessThread").start();
            while (!this.f53114f) {
                try {
                    this.f53113e.wait();
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    public C19617a(AudioRecorderInterface audioRecorderInterface, C19618a aVar) {
        Object obj;
        if (audioRecorderInterface != 0) {
            obj = audioRecorderInterface;
        } else {
            obj = new Object();
        }
        this.f53118j = obj;
        this.f53116h = audioRecorderInterface;
        this.f53109a = aVar;
    }

    /* renamed from: a */
    public final void mo52193a(byte[] bArr, int i) {
        synchronized (this.f53113e) {
            if (this.f53114f) {
                this.f53110b.incrementAndGet();
                this.f53112d.sendMessage(this.f53112d.obtainMessage(3, i, 0, Arrays.copyOf(bArr, i)));
                C45372t.m143405b("AudioDataProcessThread", "feed audioData");
            }
        }
    }

    /* renamed from: a */
    public final void mo52192a(int i, int i2, double d) {
        C45372t.m143407c("AudioDataProcessThread", "startFeeding");
        synchronized (this.f53113e) {
            if (!this.f53114f) {
                C45372t.m143407c("AudioDataProcessThread", "startFeeding not ready");
                return;
            }
            this.f53110b.set(0);
            this.f53112d.sendMessage(this.f53112d.obtainMessage(0, i, i2, Double.valueOf(d)));
        }
    }

    /* renamed from: b */
    public final void mo52195b(int i, int i2, double d) {
        if (this.f53116h != null) {
            StringBuilder sb = new StringBuilder("handleStartFeeding() called with: sampleRateInHz = [");
            sb.append(i);
            sb.append("], channels = [");
            sb.append(i2);
            sb.append("], speed = [");
            sb.append(d);
            sb.append("]");
            C45372t.m143403a("AudioDataProcessThread", sb.toString());
            if (this.f53116h.initWavFile(i, i2, d) != 0) {
                C45372t.m143409d("AudioDataProcessThread", "init wav file failed");
                return;
            }
            this.f53111c = false;
        }
    }
}
