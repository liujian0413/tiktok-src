package com.p280ss.android.ugc.aweme.live.p1366f;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewStub;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.utils.C5343e;
import com.bytedance.android.livesdk.log.C8443c;
import com.bytedance.android.livesdk.log.p405b.C8438j;
import com.bytedance.android.livesdk.utils.C9092w;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DoubleColorBallAnimationView;
import com.facebook.imagepipeline.request.C13842b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.live.f.a */
public final class C32515a {

    /* renamed from: a */
    private Activity f84777a;

    /* renamed from: b */
    private HSImageView f84778b;

    /* renamed from: c */
    private boolean f84779c = true;

    /* renamed from: d */
    private boolean f84780d = true;

    /* renamed from: e */
    private View f84781e;

    /* renamed from: f */
    private DoubleColorBallAnimationView f84782f;

    /* renamed from: g */
    private long f84783g;

    /* renamed from: h */
    private ViewStub f84784h;

    /* renamed from: e */
    public final boolean mo83742e() {
        if (this.f84779c || this.f84780d) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo83738a() {
        int i = 0;
        if (this.f84782f != null) {
            this.f84782f.setVisibility(0);
        }
        View view = this.f84781e;
        if (!this.f84779c) {
            i = 8;
        }
        C9738o.m28712b(view, i);
        m105307g();
    }

    /* renamed from: b */
    public final void mo83739b() {
        this.f84779c = false;
        C9738o.m28712b((View) this.f84782f, 8);
        if (!this.f84780d && !this.f84779c) {
            C9738o.m28712b(this.f84781e, 8);
        }
        m105308h();
    }

    /* renamed from: d */
    public final void mo83741d() {
        this.f84780d = false;
        C9738o.m28712b((View) this.f84778b, 8);
        if (!this.f84780d && !this.f84779c) {
            C9738o.m28712b(this.f84781e, 8);
        }
    }

    /* renamed from: f */
    private void m105306f() {
        if (this.f84777a != null) {
            this.f84784h = (ViewStub) this.f84777a.findViewById(R.id.btk);
            if (this.f84784h != null) {
                this.f84781e = this.f84784h.inflate();
                if (this.f84781e != null) {
                    this.f84778b = (HSImageView) this.f84781e.findViewById(R.id.bnk);
                    this.f84782f = (DoubleColorBallAnimationView) this.f84781e.findViewById(R.id.bp8);
                }
            }
        }
    }

    /* renamed from: g */
    private void m105307g() {
        if (!(this.f84777a == null || this.f84777a.getIntent() == null)) {
            Bundle bundleExtra = this.f84777a.getIntent().getBundleExtra("live_play_params");
            if (bundleExtra != null) {
                long j = bundleExtra.getLong("live.intent.extra.LOADING_SHOW", 0);
                if (j > 0) {
                    bundleExtra.remove("live.intent.extra.LOADING_SHOW");
                    this.f84783g = SystemClock.elapsedRealtime() - j;
                }
            }
        }
    }

    /* renamed from: h */
    private void m105308h() {
        if (this.f84783g > 0) {
            HashMap hashMap = new HashMap();
            hashMap.put("duration", String.valueOf(this.f84783g));
            C8443c.m25663a().mo21606a("livesdk_pre_loading_duration", hashMap, new C8438j(), Room.class);
            this.f84783g = 0;
        }
    }

    /* renamed from: c */
    public final boolean mo83740c() {
        if (this.f84780d && this.f84777a != null) {
            C9738o.m28712b((View) this.f84778b, 0);
            float a = ((float) C9738o.m28691a(C3358ac.m12528e())) / ((float) C9738o.m28709b(C3358ac.m12528e()));
            StringBuilder sb = new StringBuilder("res://");
            sb.append(this.f84777a.getPackageName());
            sb.append("/2131234707");
            C5343e.m17041a(this.f84778b, sb.toString(), (C13842b) new C9092w(5, a, null));
        }
        return this.f84780d;
    }

    public C32515a(Activity activity) {
        this.f84777a = activity;
        m105306f();
    }
}
