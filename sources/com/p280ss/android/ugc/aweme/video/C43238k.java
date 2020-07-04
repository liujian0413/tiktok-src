package com.p280ss.android.ugc.aweme.video;

import android.text.TextUtils;
import android.view.Surface;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.p280ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.p280ss.android.ugc.aweme.player.sdk.api.C34976f;
import com.p280ss.android.ugc.aweme.video.p1697a.C43180a.C43181a;
import com.p280ss.android.ugc.playerkit.p1750a.C44910d;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.video.k */
public class C43238k {

    /* renamed from: b */
    private static C43238k f111930b;

    /* renamed from: f */
    private static long f111931f;

    /* renamed from: a */
    public HashMap<String, RoomStruct> f111932a = new HashMap<>();

    /* renamed from: c */
    private C43234j f111933c = new C43234j();

    /* renamed from: d */
    private StreamUrlModel f111934d;

    /* renamed from: e */
    private String f111935e;

    /* renamed from: b */
    public final void mo104978b() {
        m137174e();
    }

    /* renamed from: e */
    private void m137174e() {
        this.f111933c.mo104967b();
    }

    /* renamed from: c */
    public final void mo104980c() {
        this.f111933c.mo104968c();
    }

    /* renamed from: d */
    public final void mo104982d() {
        this.f111933c.mo104961a();
    }

    private C43238k() {
    }

    /* renamed from: a */
    public static C43238k m137170a() {
        if (f111930b == null) {
            synchronized (C43238k.class) {
                if (f111930b == null) {
                    f111930b = new C43238k();
                }
            }
        }
        return f111930b;
    }

    /* renamed from: a */
    public static void m137171a(long j) {
        f111931f = j;
    }

    /* renamed from: a */
    public final void mo104974a(Surface surface) {
        this.f111933c.mo104963a(surface);
    }

    /* renamed from: a */
    public final void mo104975a(C34976f fVar) {
        this.f111933c.mo104964a(fVar);
    }

    /* renamed from: b */
    public final void mo104979b(C34976f fVar) {
        if (fVar != null && this.f111933c.f111908b == fVar) {
            this.f111933c.mo104961a();
        }
    }

    /* renamed from: c */
    public final boolean mo104981c(C34976f fVar) {
        if (fVar == this.f111933c.f111908b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m137173a(StreamUrlModel streamUrlModel) {
        if (streamUrlModel != null && !TextUtils.isEmpty(streamUrlModel.getRtmpPullUrl())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m137172a(Aweme aweme, int i) {
        if (aweme == null || !aweme.isLive() || (i != -499896 && i != -1048575)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo104976a(String str, StreamUrlModel streamUrlModel, C34976f fVar) {
        if (this.f111933c.f111908b == fVar && streamUrlModel != null) {
            if (streamUrlModel == null || this.f111934d == null || !C6319n.m19594a(streamUrlModel.getRtmpPullUrl(), this.f111934d.getRtmpPullUrl()) || !C6319n.m19594a(str, this.f111935e)) {
                mo104977a(str, streamUrlModel, true);
            } else {
                this.f111933c.mo104966a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo104977a(String str, final StreamUrlModel streamUrlModel, boolean z) {
        if (m137173a(streamUrlModel)) {
            this.f111933c.mo104965a(new C43181a(new C44910d<String>() {
                /* access modifiers changed from: private */
                /* renamed from: b */
                public String mo104814a() {
                    return streamUrlModel.getRtmpPullUrl();
                }
            }, str));
            this.f111934d = streamUrlModel;
            this.f111935e = str;
        }
    }
}
