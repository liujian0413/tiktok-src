package com.p280ss.android.ugc.aweme.longvideonew.feature;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.ContentResolver;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32724c.C32725a;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate */
public final class Rotate implements C0042h {

    /* renamed from: a */
    public boolean f85522a = true;

    /* renamed from: b */
    public boolean f85523b;

    /* renamed from: c */
    public boolean f85524c;

    /* renamed from: d */
    public boolean f85525d;

    /* renamed from: e */
    public C32788b f85526e;

    /* renamed from: f */
    public final AmeSSActivity f85527f;

    /* renamed from: g */
    public final Video f85528g;

    /* renamed from: h */
    private ArrayList<C32787a> f85529h = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate$a */
    public interface C32787a {
        /* renamed from: a */
        void mo84277a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate$b */
    public final class C32788b extends ContentObserver {

        /* renamed from: a */
        public ContentResolver f85530a;

        /* renamed from: b */
        public final void mo84314b() {
            ContentResolver contentResolver = this.f85530a;
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(this);
            }
        }

        /* renamed from: a */
        public final void mo84313a() {
            ContentResolver contentResolver = this.f85530a;
            if (contentResolver != null) {
                contentResolver.registerContentObserver(System.getUriFor("accelerometer_rotation"), false, this);
            }
        }

        public final void onChange(boolean z) {
            super.onChange(z);
            Rotate rotate = Rotate.this;
            boolean z2 = true;
            if (Rotate.this.mo84309c() != 1) {
                z2 = false;
            }
            rotate.f85524c = z2;
            Rotate.this.mo84305a();
        }

        public C32788b(Handler handler) {
            super(handler);
            this.f85530a = Rotate.this.f85527f.getContentResolver();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideonew.feature.Rotate$c */
    static final class C32789c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Rotate f85532a;

        C32789c(Rotate rotate) {
            this.f85532a = rotate;
        }

        public final void run() {
            Boolean bool;
            AmeSSActivity ameSSActivity = this.f85532a.f85527f;
            if (ameSSActivity != null) {
                bool = Boolean.valueOf(ameSSActivity.isFinishing());
            } else {
                bool = null;
            }
            if (!bool.booleanValue()) {
                this.f85532a.f85527f.setRequestedOrientation(4);
            }
        }
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public final void onResume() {
    }

    @C0054q(mo125a = Event.ON_STOP)
    public final void onStop() {
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        C32788b bVar = this.f85526e;
        if (bVar != null) {
            bVar.mo84314b();
        }
        this.f85529h.clear();
    }

    /* renamed from: c */
    public final int mo84309c() {
        try {
            ContentResolver contentResolver = this.f85527f.getContentResolver();
            if (contentResolver != null) {
                return System.getInt(contentResolver, "accelerometer_rotation");
            }
        } catch (SettingNotFoundException unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo84305a() {
        if (this.f85524c) {
            this.f85527f.setRequestedOrientation(4);
        } else if (this.f85525d) {
            this.f85527f.setRequestedOrientation(0);
        } else {
            this.f85527f.setRequestedOrientation(1);
        }
    }

    /* renamed from: b */
    public final void mo84308b() {
        if (!this.f85527f.isFinishing()) {
            if (this.f85525d) {
                this.f85527f.setRequestedOrientation(1);
            } else {
                this.f85527f.setRequestedOrientation(0);
            }
            if (this.f85524c) {
                C6726a.m20843a(new C32789c(this), 3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo84307a(C32787a aVar) {
        C7573i.m23587b(aVar, "observer");
        this.f85529h.add(aVar);
    }

    /* renamed from: a */
    private void m106132a(boolean z) {
        for (C32787a a : this.f85529h) {
            a.mo84277a(z);
        }
    }

    /* renamed from: a */
    public final void mo84306a(Configuration configuration) {
        if (configuration == null || configuration.orientation != 1) {
            if (configuration != null && configuration.orientation == 2) {
                this.f85525d = true;
                m106132a(true);
            }
            return;
        }
        this.f85525d = false;
        m106132a(false);
    }

    public Rotate(AmeSSActivity ameSSActivity, Video video) {
        int i;
        int i2;
        C7573i.m23587b(ameSSActivity, "activity");
        this.f85527f = ameSSActivity;
        this.f85528g = video;
        boolean z = true;
        Video video2 = this.f85528g;
        if (video2 != null) {
            i = video2.getWidth();
        } else {
            i = 0;
        }
        Video video3 = this.f85528g;
        if (video3 != null) {
            i2 = video3.getHeight();
        } else {
            i2 = 0;
        }
        this.f85523b = C32725a.m105937a(i, i2);
        this.f85527f.getLifecycle().mo55a(this);
        if (!this.f85523b) {
            this.f85527f.setRequestedOrientation(1);
        } else {
            if (mo84309c() != 1) {
                z = false;
            }
            this.f85524c = z;
            mo84305a();
        }
        this.f85526e = new C32788b(new Handler());
        C32788b bVar = this.f85526e;
        if (bVar != null) {
            bVar.mo84313a();
        }
    }
}
