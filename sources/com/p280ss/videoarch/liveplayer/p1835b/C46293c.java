package com.p280ss.videoarch.liveplayer.p1835b;

import android.text.TextUtils;
import com.p280ss.videoarch.liveplayer.C46300c;
import com.p280ss.videoarch.liveplayer.log.LiveError;
import com.p280ss.videoarch.liveplayer.p1834a.C46283c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.ss.videoarch.liveplayer.b.c */
public final class C46293c {

    /* renamed from: a */
    public final C46300c f118947a;

    /* renamed from: b */
    private final ExecutorService f118948b;

    /* renamed from: c */
    private Future f118949c;

    /* renamed from: com.ss.videoarch.liveplayer.b.c$a */
    public interface C46296a {
        /* renamed from: a */
        void mo115049a(C46283c cVar);

        /* renamed from: a */
        void mo115050a(LiveError liveError);
    }

    /* renamed from: a */
    public final void mo115046a() {
        if (this.f118949c != null && !this.f118949c.isDone()) {
            this.f118949c.cancel(true);
            this.f118949c = null;
        }
    }

    public C46293c(ExecutorService executorService, C46300c cVar) {
        this.f118948b = executorService;
        this.f118947a = cVar;
    }

    /* renamed from: a */
    public final void mo115047a(final String str, final String str2, final C46296a aVar) {
        if (!TextUtils.isEmpty(str2)) {
            if (this.f118948b != null) {
                mo115046a();
                this.f118949c = this.f118948b.submit(new Runnable() {
                    public final void run() {
                        C46298e.m145339a(C46293c.this.f118947a, str, str2, new C46299a() {
                            /* renamed from: a */
                            public final void mo115038a(LiveError liveError) {
                                aVar.mo115050a(liveError);
                            }

                            /* renamed from: a */
                            public final void mo115039a(JSONObject jSONObject) {
                                aVar.mo115049a(new C46283c(jSONObject.optJSONObject("Result")));
                            }
                        });
                    }
                });
                return;
            }
            throw new IllegalStateException("mExecutor should not be null");
        }
    }
}
