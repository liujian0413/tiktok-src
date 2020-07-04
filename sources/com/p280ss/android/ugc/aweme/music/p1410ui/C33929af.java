package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.google.common.collect.C17839bx;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.music.C33788d;
import com.p280ss.android.ugc.aweme.music.p1409c.C33785e;
import com.p280ss.android.ugc.aweme.utils.C42973bg;
import com.p280ss.android.ugc.iesdownload.C44850c;
import com.p280ss.android.ugc.iesdownload.C44851d;
import com.p280ss.android.ugc.iesdownload.C44854e.C44856a;
import com.p280ss.android.ugc.iesdownload.IesDownLoadConfigProvider;
import com.p280ss.android.ugc.iesdownload.p1745b.C44848c;
import com.p280ss.android.ugc.iesdownload.p1745b.C44849d;
import com.p280ss.android.ugc.p1716b.p1717a.C43651a;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.music.ui.af */
public final class C33929af implements C6310a, C43651a {

    /* renamed from: a */
    String f88532a;

    /* renamed from: b */
    String f88533b;

    /* renamed from: c */
    C33788d f88534c;

    /* renamed from: d */
    String f88535d;

    /* renamed from: e */
    C33961f f88536e;

    /* renamed from: f */
    C33930a f88537f;

    /* renamed from: g */
    public C6309f f88538g = new C6309f(this);

    /* renamed from: h */
    public int f88539h = 0;

    /* renamed from: i */
    public boolean f88540i = false;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.af$a */
    class C33930a implements C44849d {

        /* renamed from: b */
        private String f88542b;

        /* renamed from: c */
        private int f88543c;

        /* renamed from: d */
        private String f88544d;

        /* renamed from: a */
        public final void mo59407a(int i) {
        }

        /* renamed from: f */
        public final void mo59418f() {
            C33929af.this.f88538g.removeMessages(1);
        }

        /* renamed from: g */
        public final void mo59419g() {
            C33929af.this.f88540i = false;
            C33929af.this.f88538g.removeMessages(1);
        }

        /* renamed from: a */
        public final void mo59411a(C44850c cVar) {
            C33929af.this.f88540i = false;
            C33929af.this.f88538g.removeMessages(1);
            if (C33929af.this.f88534c != null) {
                C33929af.this.f88534c.mo67060a(this.f88542b, this.f88543c, (String) null, (float[]) null);
            }
        }

        /* renamed from: a */
        public final void mo59412a(String str) {
            C33929af.this.f88540i = false;
            C33929af.this.f88538g.removeMessages(1);
            if (C33929af.this.f88534c != null) {
                C33929af.this.f88534c.mo67060a(this.f88542b, this.f88543c, this.f88544d, (float[]) null);
            }
        }

        /* renamed from: a */
        public final void mo59408a(int i, long j, long j2) {
            C33929af.this.f88539h = i;
            if (C33929af.this.f88534c != null) {
                C33929af.this.f88534c.mo67058a(C33929af.this.f88533b, this.f88543c, this.f88544d, (i / 10) + 90);
            }
        }

        C33930a(String str, int i, String str2) {
            this.f88542b = str;
            this.f88543c = i;
            this.f88544d = str2;
        }
    }

    /* renamed from: b */
    private void m109366b() {
        HashMap c = C17839bx.m59349c();
        c.put("Accept-Encoding", " ");
        C44851d.m141532a().mo107292a(new C44856a().mo107294a(this.f88532a).mo107295a(c).mo107296a(IesDownLoadConfigProvider.getInstance().getOkHttpClient()).mo107298b(this.f88535d).mo107297a(), (C44849d) this.f88537f);
        this.f88539h = 0;
        this.f88540i = true;
    }

    /* renamed from: a */
    private void m109365a() {
        C44851d.m141532a().mo107293a(this.f88532a, (C44848c) this.f88537f);
        if (C30199h.m98861a().getEnableMusicDownloadHttps().intValue() != 0 && !TextUtils.isEmpty(this.f88532a) && this.f88532a.startsWith("http://")) {
            this.f88532a = this.f88532a.replace("http://", "https://");
            StringBuilder sb = new StringBuilder("Music retry download: ");
            sb.append(this.f88532a);
            C6921a.m21555a(sb.toString());
            m109366b();
        }
    }

    /* renamed from: a */
    public final C33929af mo86590a(C33788d dVar) {
        this.f88534c = dVar;
        return this;
    }

    public final void handleMsg(Message message) {
        if (message.what == 1 && this.f88539h == 0 && this.f88540i) {
            m109365a();
        }
    }

    public C33929af(String str, C33961f fVar) {
        this.f88532a = str;
        this.f88536e = fVar;
    }

    /* renamed from: a */
    public final void mo86591a(String str, int i) {
        if (!TextUtils.isEmpty(this.f88532a) || this.f88534c == null) {
            this.f88535d = C33785e.m108939a(str);
            C42973bg.m136422a(C33785e.f88148a, false);
            this.f88537f = new C33930a(str, 4, this.f88535d);
            m109366b();
            if (C30199h.m98861a().getEnableMusicOvertimeDetect().intValue() > 0) {
                this.f88538g.sendEmptyMessageDelayed(1, 3500);
                return;
            }
            return;
        }
        this.f88534c.mo67060a(str, 4, (String) null, (float[]) null);
    }

    /* renamed from: a */
    public final void mo86593a(String str, int i, Exception exc) {
        if (this.f88534c != null) {
            this.f88534c.mo67059a(str, 4, this.f88532a, exc);
        }
    }

    /* renamed from: a */
    public final void mo86592a(String str, int i, int i2) {
        if (this.f88534c != null) {
            this.f88534c.mo67058a(str, 4, this.f88532a, (int) (((float) i) * 0.9f));
        }
    }
}
