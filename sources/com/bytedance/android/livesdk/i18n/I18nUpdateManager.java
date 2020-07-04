package com.bytedance.android.livesdk.i18n;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.live.core.p147c.C3166a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import java.util.Map;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7323a;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

final class I18nUpdateManager {

    /* renamed from: g */
    private static long[] f22821g = {3000, 6000, 9000, 60000, 60000, 60000, 600000};

    /* renamed from: i */
    private static I18nApi f22822i;

    /* renamed from: a */
    public String f22823a;

    /* renamed from: b */
    public C8315a f22824b;

    /* renamed from: c */
    public boolean f22825c;

    /* renamed from: d */
    public int f22826d;

    /* renamed from: e */
    public long f22827e;

    /* renamed from: f */
    public long f22828f;

    /* renamed from: h */
    private Handler f22829h;

    /* renamed from: j */
    private Callback f22830j = new Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            I18nUpdateManager.this.mo21477a(I18nUpdateManager.this.f22828f);
            return true;
        }
    };

    /* renamed from: k */
    private C7321c f22831k = null;

    public interface I18nApi {
        @C6457h(mo15740a = "/webcast/setting/i18n/package/")
        C7492s<C3479d<C8316a>> update(@C6474y(mo15757a = "locale") String str, @C6474y(mo15757a = "cur_version") long j);
    }

    /* renamed from: com.bytedance.android.livesdk.i18n.I18nUpdateManager$a */
    interface C8315a {
        /* renamed from: a */
        void mo21481a(String str, long j, Map<String, String> map);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21476a() {
        this.f22829h.removeCallbacksAndMessages(null);
        if (this.f22831k != null && !this.f22831k.isDisposed()) {
            this.f22831k.dispose();
        }
        this.f22824b = null;
    }

    /* renamed from: a */
    private static long m25379a(int i) {
        int length = f22821g.length;
        if (i >= length || i < 0) {
            return f22821g[length - 1];
        }
        return f22821g[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo21477a(long j) {
        if (!this.f22825c && !this.f22829h.hasMessages(0)) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime <= this.f22827e || elapsedRealtime - this.f22827e >= 60000) {
                this.f22828f = j;
                this.f22825c = true;
                try {
                    this.f22831k = f22822i.update(this.f22823a, j).mo19294a(C47549a.m148327a()).mo19304b(C7333a.m23044b()).mo19281a((C7326g<? super T>) new C7326g<C3479d<C8316a>>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void accept(C3479d<C8316a> dVar) throws Exception {
                            I18nUpdateManager.this.f22825c = false;
                            if (dVar == null || dVar.statusCode != 0 || dVar.data == null) {
                                I18nUpdateManager.this.mo21478a(new Throwable("response == null || response.statusCode != 0 || response.data == null"));
                                return;
                            }
                            I18nUpdateManager.this.f22826d = 0;
                            I18nUpdateManager.this.f22827e = SystemClock.elapsedRealtime();
                            C8316a aVar = (C8316a) dVar.data;
                            if (I18nUpdateManager.this.f22824b != null) {
                                I18nUpdateManager.this.f22824b.mo21481a(I18nUpdateManager.this.f22823a, aVar.f22836a, aVar.f22837b);
                            }
                        }
                    }, (C7326g<? super Throwable>) new C7326g<Throwable>() {
                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public void accept(Throwable th) throws Exception {
                            I18nUpdateManager.this.f22825c = false;
                            I18nUpdateManager.this.mo21478a(th);
                        }
                    }, (C7323a) new C7323a() {
                        /* renamed from: a */
                        public final void mo8975a() throws Exception {
                            I18nUpdateManager.this.f22825c = false;
                        }
                    });
                } catch (Throwable th) {
                    C3166a.m11963b("I18nUpdateManager", th);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo21478a(Throwable th) {
        this.f22826d++;
        this.f22829h.sendEmptyMessageDelayed(0, m25379a(this.f22826d));
    }

    I18nUpdateManager(String str, C8315a aVar) {
        this.f22823a = str;
        this.f22824b = aVar;
        this.f22829h = new Handler(Looper.getMainLooper(), this.f22830j);
        if (f22822i == null) {
            f22822i = (I18nApi) C3458e.m12798a().mo10440a(I18nApi.class);
        }
    }
}
