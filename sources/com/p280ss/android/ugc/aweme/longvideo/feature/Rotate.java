package com.p280ss.android.ugc.aweme.longvideo.feature;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.ContentResolver;
import android.content.res.Configuration;
import android.database.ContentObserver;
import android.os.Handler;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.support.p022v4.app.FragmentActivity;
import android.view.View;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.longvideo.p1375b.C32724c.C32725a;
import java.util.ArrayList;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate */
public final class Rotate implements C0042h {

    /* renamed from: a */
    public boolean f85349a = true;

    /* renamed from: b */
    public boolean f85350b;

    /* renamed from: c */
    public boolean f85351c;

    /* renamed from: d */
    public boolean f85352d;

    /* renamed from: e */
    public C32739b f85353e;

    /* renamed from: f */
    public final FragmentActivity f85354f;

    /* renamed from: g */
    public final View f85355g;

    /* renamed from: h */
    public final View f85356h;

    /* renamed from: i */
    public final Video f85357i;

    /* renamed from: j */
    private ArrayList<C32738a> f85358j = new ArrayList<>();

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate$a */
    public interface C32738a {
        /* renamed from: a */
        void mo84179a(boolean z);
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate$b */
    public final class C32739b extends ContentObserver {

        /* renamed from: a */
        public ContentResolver f85359a;

        /* renamed from: b */
        public final void mo84232b() {
            ContentResolver contentResolver = this.f85359a;
            if (contentResolver != null) {
                contentResolver.unregisterContentObserver(this);
            }
        }

        /* renamed from: a */
        public final void mo84231a() {
            ContentResolver contentResolver = this.f85359a;
            if (contentResolver != null) {
                contentResolver.registerContentObserver(System.getUriFor("accelerometer_rotation"), false, this);
            }
        }

        public final void onChange(boolean z) {
            super.onChange(z);
            Rotate rotate = Rotate.this;
            boolean z2 = true;
            if (Rotate.this.mo84227c() != 1) {
                z2 = false;
            }
            rotate.f85351c = z2;
            Rotate.this.mo84223a();
        }

        public C32739b(Handler handler) {
            super(handler);
            this.f85359a = Rotate.this.f85354f.getContentResolver();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.longvideo.feature.Rotate$c */
    static final class C32740c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Rotate f85361a;

        C32740c(Rotate rotate) {
            this.f85361a = rotate;
        }

        public final void run() {
            Boolean bool;
            FragmentActivity fragmentActivity = this.f85361a.f85354f;
            if (fragmentActivity != null) {
                bool = Boolean.valueOf(fragmentActivity.isFinishing());
            } else {
                bool = null;
            }
            if (!bool.booleanValue()) {
                this.f85361a.f85354f.setRequestedOrientation(4);
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
        C32739b bVar = this.f85353e;
        if (bVar != null) {
            bVar.mo84232b();
        }
        this.f85358j.clear();
    }

    /* renamed from: c */
    public final int mo84227c() {
        try {
            ContentResolver contentResolver = this.f85354f.getContentResolver();
            if (contentResolver != null) {
                return System.getInt(contentResolver, "accelerometer_rotation");
            }
        } catch (SettingNotFoundException unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo84223a() {
        if (this.f85351c) {
            this.f85354f.setRequestedOrientation(4);
        } else if (this.f85352d) {
            this.f85354f.setRequestedOrientation(0);
        } else {
            this.f85354f.setRequestedOrientation(1);
        }
    }

    /* renamed from: b */
    public final void mo84226b() {
        if (!this.f85354f.isFinishing()) {
            if (this.f85352d) {
                this.f85354f.setRequestedOrientation(1);
            } else {
                this.f85354f.setRequestedOrientation(0);
            }
            if (this.f85351c) {
                C6726a.m20843a(new C32740c(this), 3000);
            }
        }
    }

    /* renamed from: a */
    public final void mo84225a(C32738a aVar) {
        C7573i.m23587b(aVar, "observer");
        this.f85358j.add(aVar);
    }

    /* renamed from: a */
    private void m105990a(boolean z) {
        for (C32738a a : this.f85358j) {
            a.mo84179a(z);
        }
    }

    /* renamed from: a */
    public final void mo84224a(Configuration configuration) {
        if (configuration == null || configuration.orientation != 1) {
            if (configuration != null && configuration.orientation == 2) {
                this.f85352d = true;
                m105990a(true);
            }
            return;
        }
        this.f85352d = false;
        m105990a(false);
    }

    public Rotate(FragmentActivity fragmentActivity, View view, View view2, Video video) {
        int i;
        int i2;
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(view, "rotateView");
        C7573i.m23587b(view2, "videoView");
        this.f85354f = fragmentActivity;
        this.f85355g = view;
        this.f85356h = view2;
        this.f85357i = video;
        boolean z = true;
        Video video2 = this.f85357i;
        if (video2 != null) {
            i = video2.getWidth();
        } else {
            i = 0;
        }
        Video video3 = this.f85357i;
        if (video3 != null) {
            i2 = video3.getHeight();
        } else {
            i2 = 0;
        }
        this.f85350b = C32725a.m105937a(i, i2);
        this.f85354f.getLifecycle().mo55a(this);
        if (!this.f85350b) {
            this.f85354f.setRequestedOrientation(1);
        } else {
            if (mo84227c() != 1) {
                z = false;
            }
            this.f85351c = z;
            mo84223a();
        }
        this.f85353e = new C32739b(new Handler());
        C32739b bVar = this.f85353e;
        if (bVar != null) {
            bVar.mo84231a();
        }
    }
}
