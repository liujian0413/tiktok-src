package com.p280ss.android.ugc.aweme.player.p1456a;

import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.C28580o;
import com.p280ss.android.ugc.aweme.feed.adapter.C28130ac;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28481d;
import com.p280ss.android.ugc.aweme.metrics.p1393a.C33221a;
import com.p280ss.android.ugc.aweme.p932aa.C21097b;
import com.p280ss.android.ugc.aweme.video.preload.C43305j;
import com.p280ss.android.ugc.networkspeed.C44903d;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.player.a.f */
public final class C34955f {

    /* renamed from: a */
    public C28130ac f91206a;

    /* renamed from: b */
    public String f91207b;

    /* renamed from: c */
    public Video f91208c;

    /* renamed from: d */
    public String f91209d;

    /* renamed from: e */
    public Fragment f91210e;

    /* renamed from: f */
    public int f91211f;

    /* renamed from: com.ss.android.ugc.aweme.player.a.f$a */
    public static class C34956a {

        /* renamed from: a */
        public C34955f f91212a = new C34955f();

        /* renamed from: a */
        public final C34956a mo88540a(int i) {
            this.f91212a.f91211f = i;
            return this;
        }

        /* renamed from: b */
        public final C34956a mo88545b(String str) {
            this.f91212a.f91209d = str;
            return this;
        }

        /* renamed from: a */
        public final C34956a mo88541a(Fragment fragment) {
            this.f91212a.f91210e = fragment;
            return this;
        }

        /* renamed from: a */
        public final C34956a mo88542a(C28130ac acVar) {
            this.f91212a.f91206a = acVar;
            return this;
        }

        /* renamed from: a */
        public final C34956a mo88543a(Video video) {
            this.f91212a.f91208c = video;
            return this;
        }

        /* renamed from: a */
        public final C34956a mo88544a(String str) {
            this.f91212a.f91207b = str;
            return this;
        }
    }

    /* renamed from: a */
    public final void mo88539a() {
        int i;
        if (this.f91206a != null && this.f91206a.mo65711h() != null && this.f91208c != null && this.f91210e != null) {
            VideoUrlModel playAddr = this.f91208c.getPlayAddr();
            if (playAddr != null) {
                try {
                    i = C44903d.m141656f();
                } catch (Exception unused) {
                    i = 0;
                }
                boolean d = C28275c.m92999d(this.f91206a.mo65711h().getAid());
                boolean z = this.f91210e.mUserVisibleHint;
                int i2 = this.f91211f;
                int a = C28481d.m93601a(this.f91206a.mo65711h());
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long i3 = C28580o.m93839i();
                C34957g gVar = r0;
                C34957g gVar2 = new C34957g(this, z, i, a, playAddr, d, this.f91206a.mo65711h().getAid(), i2, C28580o.m93835e(), C28580o.m93834d(), i3, elapsedRealtime);
                C1592h.m7855a((Callable<TResult>) gVar, (Executor) C6907h.m21516a());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo88538a(boolean z, int i, int i2, VideoUrlModel videoUrlModel, boolean z2, String str, int i3, String str2, String str3, long j, long j2) throws Exception {
        int i4;
        String str4 = str;
        C6909j a = new C6909j().mo16966a("request_id", this.f91209d).mo16966a("duration", this.f91207b);
        String str5 = "is_success";
        int i5 = 1;
        if (!z) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        VideoUrlModel videoUrlModel2 = videoUrlModel;
        C6909j a2 = a.mo16966a(str5, String.valueOf(i4)).mo16966a("internet_speed", String.valueOf(i)).mo16966a("video_quality", String.valueOf(i2)).mo16966a("is_cache", String.valueOf(C43305j.m137386g().mo105024a(videoUrlModel) ? 1 : 0));
        String str6 = "is_first";
        if (z2) {
            i5 = -1;
        } else if (!C33221a.m107193a()) {
            i5 = 0;
        }
        JSONObject a3 = a2.mo16966a(str6, String.valueOf(i5)).mo16966a("group_id", str).mo16966a("status", String.valueOf(i3)).mo16966a("is_from_feed_cache", String.valueOf(z2 ? 1 : 0)).mo16966a("top_activity", str2).mo16966a("feed_tab", str3).mo16967a();
        if (!z2) {
            C33221a.m107194b();
        }
        C6907h.onEvent(MobClick.obtain().setEventName("video_request_response").setLabelName("perf_monitor").setValue(str).setJsonObject(a3));
        C6907h.m21525a("video_request_response", a3);
        C21097b.m71144a("video_request_response", a3);
        String str7 = "video_request_response";
        String str8 = "duration";
        long j3 = 0;
        if (j > 0) {
            j3 = j2 - j;
        }
        C33221a.m107192a(str7, a3, str8, Long.toString(j3));
        return null;
    }
}
