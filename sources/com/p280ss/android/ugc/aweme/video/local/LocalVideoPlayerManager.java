package com.p280ss.android.ugc.aweme.video.local;

import android.arch.lifecycle.C0042h;
import android.content.SharedPreferences;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.android.live.C2317a;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.p784io.C18110f;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.video.experiment.EnableLocalVideoPlayExperiment;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager */
public class LocalVideoPlayerManager implements C0042h {

    /* renamed from: a */
    private static final String f111955a = "LocalVideoPlayerManager";

    /* renamed from: b */
    private static LocalVideoPlayerManager f111956b;

    /* renamed from: c */
    private C43252c f111957c = new C43252c();

    /* renamed from: d */
    private AtomicBoolean f111958d = new AtomicBoolean(false);

    /* renamed from: com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager$a */
    public interface C43246a {
        /* renamed from: a */
        void mo100065a();

        /* renamed from: a */
        void mo100066a(String str);
    }

    /* renamed from: b */
    public final void mo104996b() {
        m137202c();
    }

    /* renamed from: a */
    public final boolean mo104995a(String str, String str2, C43246a aVar) {
        String d = m137204d(str);
        boolean z = !TextUtils.isEmpty(d);
        if (z) {
            C1592h.m7853a((Callable<TResult>) new C43262e<TResult>(d, str2)).mo6876a((C1591g<TResult, TContinuationResult>) new C43263f<TResult,TContinuationResult>(aVar, str2), C1592h.f5958b);
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo104994a(long j) {
        m137206e();
        return this.f111957c.mo105007a(j);
    }

    private LocalVideoPlayerManager() {
    }

    /* renamed from: a */
    public static LocalVideoPlayerManager m137195a() {
        if (f111956b == null) {
            synchronized (LocalVideoPlayerManager.class) {
                if (f111956b == null) {
                    f111956b = new LocalVideoPlayerManager();
                }
            }
        }
        return f111956b;
    }

    /* renamed from: f */
    private static boolean m137207f() {
        return C6384b.m19835a().mo15292a(EnableLocalVideoPlayExperiment.class, true, "is_local_video_play_enable", C6384b.m19835a().mo15295d().is_local_video_play_enable, true);
    }

    /* renamed from: c */
    private void m137202c() {
        try {
            m137206e();
            SharedPreferences a = C7285c.m22838a(C6399b.m19921a(), "aweme_local_video", 0);
            a.edit().putString("extra_data", C2317a.m9932a().mo15979b((Object) this.f111957c.f111975a)).apply();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    private Map<String, LocalVideoUrlModel> m137205d() {
        Map<String, LocalVideoUrlModel> map = null;
        try {
            String string = C7285c.m22838a(C6399b.m19921a(), "aweme_local_video", 0).getString("extra_data", null);
            if (!TextUtils.isEmpty(string)) {
                map = (Map) C2317a.m9932a().mo15975a(string, new C6597a<HashMap<String, LocalVideoUrlModel>>() {
                }.type);
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    private void m137206e() {
        if (m137207f() && !this.f111958d.get()) {
            Map d = m137205d();
            synchronized (this) {
                if (this.f111958d.compareAndSet(false, true) && d != null && !d.isEmpty()) {
                    this.f111957c.mo105006a(d.values());
                }
            }
        }
    }

    /* renamed from: b */
    private boolean m137201b(String str) {
        LocalVideoUrlModel a = this.f111957c.mo105003a(str);
        if (a == null) {
            return false;
        }
        return TextUtils.equals(a.authorId, C6861a.m21337f().getCurUserId());
    }

    /* renamed from: c */
    private boolean m137203c(String str) {
        boolean b = this.f111957c.mo105009b(this.f111957c.mo105003a(str));
        if (b) {
            this.f111957c.mo105008b(str);
        }
        return b;
    }

    /* renamed from: d */
    private String m137204d(String str) {
        m137206e();
        if (!m137200a(str)) {
            return null;
        }
        LocalVideoUrlModel a = this.f111957c.mo105003a(str);
        if (a == null) {
            return "";
        }
        return a.localPath;
    }

    /* renamed from: a */
    private LocalVideoUrlModel m137196a(Aweme aweme) {
        return m137197a(aweme.getAid(), aweme.getAuthorUid(), aweme.isVr(), aweme.getVideo());
    }

    /* renamed from: a */
    private boolean m137200a(String str) {
        if (!TextUtils.isEmpty(str) && m137207f() && m137201b(str) && !m137203c(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final String mo104992a(VideoUrlModel videoUrlModel) {
        String d = m137204d(videoUrlModel.getSourceId());
        if (TextUtils.isEmpty(d)) {
            return d;
        }
        LocalVideoUrlModel a = this.f111957c.mo105003a(videoUrlModel.getSourceId());
        if (a == null) {
            return d;
        }
        String uri = a.getUri();
        String uri2 = videoUrlModel.getUri();
        if (!(uri == null || uri2 == null || TextUtils.equals(uri.split("_")[0], uri2.split("_")[0]))) {
            this.f111957c.mo105008b(a.getSourceId());
            d = null;
        }
        return d;
    }

    /* renamed from: a */
    static final /* synthetic */ Object m137199a(String str, String str2) throws Exception {
        try {
            C18110f.m59869a(new File(str), new File(str2));
        } catch (IOException e) {
            C1592h.m7850a((Exception) e);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo104993a(String str, Aweme aweme) {
        if (m137207f() && aweme != null) {
            m137206e();
            LocalVideoUrlModel a = m137196a(aweme);
            a.localPath = str;
            this.f111957c.mo105005a(a);
            mo104996b();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m137198a(C43246a aVar, String str, C1592h hVar) throws Exception {
        if (hVar.mo6889d()) {
            aVar.mo100065a();
        } else {
            aVar.mo100066a(str);
        }
        return null;
    }

    /* renamed from: a */
    private static LocalVideoUrlModel m137197a(String str, String str2, boolean z, Video video) {
        boolean z2;
        LocalVideoUrlModel localVideoUrlModel = new LocalVideoUrlModel(str);
        localVideoUrlModel.authorId = str2;
        localVideoUrlModel.setVr(z);
        if (video != null) {
            localVideoUrlModel.setDuration((double) video.getDuration());
            localVideoUrlModel.setWidth(video.getWidth());
            localVideoUrlModel.setHeight(video.getHeight());
            if (video.getProperPlayAddr() != null) {
                localVideoUrlModel.setUri(video.getProperPlayAddr().getUri());
                if (video.getPlayAddrH265() != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                localVideoUrlModel.setH265(z2);
            }
        }
        return localVideoUrlModel;
    }
}
