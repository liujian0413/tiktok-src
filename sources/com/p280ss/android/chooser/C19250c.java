package com.p280ss.android.chooser;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore.Images.Media;
import android.provider.MediaStore.Video;

/* renamed from: com.ss.android.chooser.c */
public final class C19250c extends ContentObserver {

    /* renamed from: a */
    private Handler f52128a;

    /* renamed from: b */
    private long f52129b;

    /* renamed from: a */
    private boolean m63099a() {
        if (System.currentTimeMillis() - this.f52129b < 3000) {
            return true;
        }
        return false;
    }

    public C19250c(Handler handler) {
        super(handler);
        this.f52128a = handler;
    }

    public final void onChange(boolean z) {
        onChange(z, null);
    }

    public final void onChange(boolean z, Uri uri) {
        if (!m63099a()) {
            if (uri == null) {
                this.f52129b = System.currentTimeMillis();
                this.f52128a.postDelayed(new Runnable() {
                    public final void run() {
                        C19256e.m63104a().mo51073a(1, true);
                        C19256e.m63104a().mo51073a(2, true);
                        C19256e.m63104a().mo51073a(3, true);
                        C19256e.m63104a().mo51073a(4, true);
                    }
                }, 300);
            } else if (Media.EXTERNAL_CONTENT_URI.equals(uri)) {
                this.f52129b = System.currentTimeMillis();
                this.f52128a.postDelayed(new Runnable() {
                    public final void run() {
                        C19256e.m63104a().mo51073a(1, true);
                        C19256e.m63104a().mo51073a(2, true);
                        C19256e.m63104a().mo51073a(3, true);
                    }
                }, 300);
            } else if (Video.Media.EXTERNAL_CONTENT_URI.equals(uri)) {
                this.f52129b = System.currentTimeMillis();
                this.f52128a.postDelayed(new Runnable() {
                    public final void run() {
                        C19256e.m63104a().mo51073a(4, true);
                    }
                }, 300);
            } else {
                if ("content://media/external".equals(uri.toString())) {
                    this.f52129b = System.currentTimeMillis();
                    this.f52128a.postDelayed(new Runnable() {
                        public final void run() {
                            C19256e.m63104a().mo51073a(1, true);
                            C19256e.m63104a().mo51073a(2, true);
                            C19256e.m63104a().mo51073a(3, true);
                            C19256e.m63104a().mo51073a(4, true);
                        }
                    }, 300);
                }
            }
        }
    }
}
