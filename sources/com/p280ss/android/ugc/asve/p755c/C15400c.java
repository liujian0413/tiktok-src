package com.p280ss.android.ugc.asve.p755c;

import android.os.Handler;
import android.os.Looper;
import com.bef.effectsdk.message.MessageCenter;
import com.bef.effectsdk.message.MessageCenter.C1944a;
import com.p280ss.android.medialib.model.EnigmaResult;
import com.p280ss.android.medialib.p884qr.PicScanner;
import com.p280ss.android.medialib.p884qr.ScanSettings;
import com.p280ss.android.ugc.asve.p755c.C15397b.C15398a;
import com.p280ss.android.ugc.asve.p755c.C15397b.C15399b;
import com.p280ss.android.vesdk.C45382z;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.c.c */
public final class C15400c implements C1944a, C15397b {

    /* renamed from: a */
    public C15399b f39708a;

    /* renamed from: b */
    public PicScanner f39709b;

    /* renamed from: c */
    private final Handler f39710c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private Runnable f39711d;

    /* renamed from: e */
    private final String f39712e = "VEScanController";

    /* renamed from: f */
    private final C45382z f39713f;

    /* renamed from: com.ss.android.ugc.asve.c.c$a */
    public static final class C15401a implements Runnable {

        /* renamed from: a */
        public final PicScanner f39714a;

        /* renamed from: b */
        final /* synthetic */ C15400c f39715b;

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0034, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r3 = this;
                com.ss.android.ugc.asve.c.c r0 = r3.f39715b
                monitor-enter(r0)
                com.ss.android.medialib.qr.PicScanner r1 = r3.f39714a     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x0035
                com.ss.android.medialib.qr.PicScanner r1 = r3.f39714a     // Catch:{ all -> 0x0037 }
                com.ss.android.ugc.asve.c.c r2 = r3.f39715b     // Catch:{ all -> 0x0037 }
                com.ss.android.medialib.qr.PicScanner r2 = r2.f39709b     // Catch:{ all -> 0x0037 }
                boolean r1 = kotlin.jvm.internal.C7573i.m23585a(r1, r2)     // Catch:{ all -> 0x0037 }
                r1 = r1 ^ 1
                if (r1 != 0) goto L_0x0035
                com.ss.android.medialib.qr.PicScanner r1 = r3.f39714a     // Catch:{ all -> 0x0037 }
                boolean r1 = r1.isValid()     // Catch:{ all -> 0x0037 }
                if (r1 != 0) goto L_0x001e
                goto L_0x0035
            L_0x001e:
                com.ss.android.medialib.qr.PicScanner r1 = r3.f39714a     // Catch:{ all -> 0x0037 }
                boolean r1 = r1.isSuccess()     // Catch:{ all -> 0x0037 }
                if (r1 != 0) goto L_0x0033
                com.ss.android.ugc.asve.c.c r1 = r3.f39715b     // Catch:{ all -> 0x0037 }
                com.ss.android.ugc.asve.c.b$b r1 = r1.f39708a     // Catch:{ all -> 0x0037 }
                if (r1 == 0) goto L_0x0033
                int r2 = com.p280ss.android.ugc.asve.p755c.C15397b.C15398a.m45039b()     // Catch:{ all -> 0x0037 }
                r1.mo38897a(r2)     // Catch:{ all -> 0x0037 }
            L_0x0033:
                monitor-exit(r0)
                return
            L_0x0035:
                monitor-exit(r0)
                return
            L_0x0037:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.p755c.C15400c.C15401a.run():void");
        }

        C15401a(C15400c cVar) {
            this.f39715b = cVar;
            this.f39714a = cVar.f39709b;
        }
    }

    /* renamed from: d */
    private final void m45042d() {
        C1944a aVar = this;
        MessageCenter.removeListener(aVar);
        MessageCenter.addListener(aVar);
    }

    /* renamed from: b */
    public final void mo38895b() {
        mo38890a();
        mo38894a(false, 65536);
    }

    /* renamed from: c */
    public final void mo38896c() {
        PicScanner picScanner = this.f39709b;
        if (picScanner != null) {
            picScanner.release();
        }
        MessageCenter.removeListener(this);
    }

    /* renamed from: a */
    public final void mo38890a() {
        PicScanner picScanner = this.f39709b;
        if (picScanner != null) {
            picScanner.stop();
        }
        Runnable runnable = this.f39711d;
        if (runnable != null) {
            this.f39710c.removeCallbacks(runnable);
        }
        this.f39709b = null;
    }

    /* renamed from: a */
    public final void mo38892a(C15399b bVar) {
        this.f39708a = bVar;
    }

    public C15400c(C45382z zVar) {
        C7573i.m23587b(zVar, "veRecorder");
        this.f39713f = zVar;
    }

    /* renamed from: a */
    public final void mo38894a(boolean z, long j) {
        m45042d();
        this.f39713f.mo108679a(z, j);
    }

    /* renamed from: a */
    public final void mo38893a(String str, ScanSettings scanSettings, long j) {
        int i;
        C7573i.m23587b(str, "picPath");
        C7573i.m23587b(scanSettings, "scanSettings");
        mo38890a();
        if (this.f39709b == null) {
            this.f39709b = new PicScanner();
        }
        m45042d();
        PicScanner picScanner = this.f39709b;
        if (picScanner != null) {
            i = picScanner.start(str, scanSettings);
        } else {
            i = -1;
        }
        if (i < 0) {
            C15399b bVar = this.f39708a;
            if (bVar != null) {
                bVar.mo38897a(C15398a.m45038a());
            }
        }
        this.f39711d = new C15401a(this);
        this.f39710c.postDelayed(this.f39711d, j);
    }

    /* renamed from: a */
    public final void mo38891a(float f, float f2, float f3, float f4) {
        this.f39713f.mo108644a(f, f2, f3, f4);
    }

    public final void onMessageReceived(int i, int i2, int i3, String str) {
        if (i == 24) {
            if (this.f39709b != null) {
                C15399b bVar = this.f39708a;
                if (bVar != null) {
                    PicScanner picScanner = this.f39709b;
                    if (picScanner == null) {
                        C7573i.m23580a();
                    }
                    bVar.mo38898a(picScanner.getEnigmaResult());
                }
            } else {
                EnigmaResult q = this.f39713f.mo108744q();
                C15399b bVar2 = this.f39708a;
                if (bVar2 != null) {
                    bVar2.mo38898a(q);
                }
            }
        }
    }
}
