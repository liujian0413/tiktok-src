package com.p280ss.android.ugc.aweme.shortvideo.upload;

import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.z */
public final class C41501z {

    /* renamed from: a */
    public static final C41502a f107932a = new C41502a(null);

    /* renamed from: b */
    private final ConcurrentLinkedQueue<String> f107933b = new ConcurrentLinkedQueue<>();

    /* renamed from: c */
    private final int f107934c = C35574k.m114859a().mo70096k().mo93306b(Property.UploadStatusReportGapS);

    /* renamed from: d */
    private C7321c f107935d;

    /* renamed from: e */
    private long f107936e = -1;

    /* renamed from: f */
    private volatile boolean f107937f;

    /* renamed from: g */
    private final String f107938g;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.z$a */
    public static final class C41502a {
        private C41502a() {
        }

        public /* synthetic */ C41502a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.z$b */
    static final class C41503b<T> implements C7326g<Long> {

        /* renamed from: a */
        final /* synthetic */ C41501z f107939a;

        C41503b(C41501z zVar) {
            this.f107939a = zVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(Long l) {
            this.f107939a.m132212b(null);
        }
    }

    /* renamed from: b */
    private final ArrayList<String> m132211b() {
        ArrayList<String> arrayList = new ArrayList<>(this.f107933b);
        this.f107933b.clear();
        return arrayList;
    }

    /* renamed from: a */
    public final void mo102161a() {
        if (this.f107934c > 0) {
            this.f107936e = SystemClock.uptimeMillis();
            this.f107935d = C7492s.m23269a((long) this.f107934c, TimeUnit.SECONDS).mo19325f((C7326g<? super T>) new C41503b<Object>(this));
        }
    }

    public C41501z(String str) {
        C7573i.m23587b(str, "publishId");
        this.f107938g = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m132212b(PublishResultState publishResultState) {
        String str = "parallel_publish_result";
        C22984d a = C22984d.m75611a().mo59970a("mob_lost_assist", 1).mo59971a("mob_lost_gap", SystemClock.uptimeMillis() - this.f107936e).mo59970a("status", 20001).mo59972a("upload_is_success", (Object) publishResultState);
        String str2 = "upload_error_msg";
        String str3 = "";
        for (String str4 : m132211b()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(" | ");
            sb.append(str4);
            str3 = sb.toString();
        }
        C6907h.m21524a(str, (Map) a.mo59973a(str2, str3).mo59973a("publish_id", this.f107938g).f60753a);
    }

    /* renamed from: a */
    public final void mo102163a(PublishResultState publishResultState) {
        C7573i.m23587b(publishResultState, "resultState");
        if (this.f107934c > 0) {
            this.f107937f = true;
            if (this.f107935d != null) {
                C7321c cVar = this.f107935d;
                if (cVar == null) {
                    C7573i.m23580a();
                }
                if (!cVar.isDisposed()) {
                    C7321c cVar2 = this.f107935d;
                    if (cVar2 == null) {
                        C7573i.m23580a();
                    }
                    cVar2.dispose();
                }
            }
            m132212b(publishResultState);
        }
    }

    /* renamed from: a */
    public final void mo102162a(int i, String str) {
        boolean z;
        if (this.f107934c > 0 && !this.f107937f) {
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f107933b.size() >= 20) {
                    this.f107933b.poll();
                }
                ConcurrentLinkedQueue<String> concurrentLinkedQueue = this.f107933b;
                StringBuilder sb = new StringBuilder("[");
                sb.append(i);
                sb.append("][");
                sb.append(System.currentTimeMillis());
                sb.append(']');
                sb.append(str);
                concurrentLinkedQueue.offer(sb.toString());
            }
        }
    }
}
