package com.p280ss.android.ugc.aweme.util;

import android.content.Context;
import android.os.Environment;
import android.support.p022v4.util.C0902i;
import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import com.p280ss.android.common.util.C6773c;
import com.p280ss.android.image.C19589e;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.share.gif.C38044a;
import com.p280ss.android.ugc.aweme.video.C7276d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.ss.android.ugc.aweme.util.p */
public final class C42889p {

    /* renamed from: a */
    public final String f111392a = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM).getAbsolutePath();

    /* renamed from: b */
    public WeakReference<Context> f111393b;

    /* renamed from: c */
    public CountDownLatch f111394c = new CountDownLatch(1);

    /* renamed from: d */
    public boolean f111395d;

    /* renamed from: e */
    public Throwable f111396e;

    /* renamed from: com.ss.android.ugc.aweme.util.p$a */
    public interface C42892a {
        /* renamed from: a */
        void mo104592a();

        /* renamed from: a */
        void mo95733a(String str);

        /* renamed from: a */
        void mo104593a(Throwable th);
    }

    public C42889p(WeakReference<Context> weakReference) {
        this.f111393b = weakReference;
    }

    /* renamed from: a */
    private void m136183a(String str) {
        if (!TextUtils.isEmpty(str) && this.f111393b.get() != null) {
            C38044a.m121418b(new File(str), (Context) this.f111393b.get());
        }
    }

    /* renamed from: a */
    public final C0902i<Boolean, String> mo104590a(final String str, final C42892a aVar) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            aVar.mo104593a((Throwable) new RuntimeException("Image url is empty."));
            return new C0902i<>(Boolean.valueOf(false), null);
        }
        aVar.mo104592a();
        StringBuilder sb = new StringBuilder();
        sb.append(C6306c.m19561a(str));
        sb.append(".png");
        final String sb2 = sb.toString();
        String path = new File(this.f111392a, sb2).getPath();
        if (C7276d.m22812b(path)) {
            this.f111395d = true;
        }
        if (!this.f111395d) {
            C6726a.m20842a(new Runnable() {
                public final void run() {
                    try {
                        if (C42889p.this.f111393b.get() != null) {
                            C42889p.this.f111395d = C19589e.m64525a((Context) C42889p.this.f111393b.get(), -1, str, null, C42889p.this.f111392a, null, sb2, new C6773c<String>() {
                                /* renamed from: a */
                                public final /* bridge */ /* synthetic */ void mo16566a(int i, Object obj) {
                                }
                            }, null);
                        } else {
                            C42889p.this.f111396e = new RuntimeException("Context is null");
                            C42889p.this.f111395d = false;
                        }
                    } catch (Throwable th) {
                        C42889p.this.f111394c.countDown();
                        throw th;
                    }
                    C42889p.this.f111394c.countDown();
                }
            });
            try {
                this.f111394c.await();
            } catch (InterruptedException unused) {
            }
        }
        if (this.f111395d) {
            m136183a(path);
        }
        if (this.f111395d) {
            aVar.mo95733a(path);
        } else {
            aVar.mo104593a(this.f111396e);
        }
        Boolean valueOf = Boolean.valueOf(this.f111395d);
        if (this.f111395d) {
            str2 = path;
        }
        C0902i<Boolean, String> iVar = new C0902i<>(valueOf, str2);
        this.f111395d = false;
        return iVar;
    }
}
