package com.p280ss.android.ugc.aweme.livewallpaper.p1369b;

import android.app.Activity;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper;
import com.p280ss.android.ugc.aweme.livewallpaper.model.LiveWallPaperBean;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.c */
public final class C32571c {

    /* renamed from: f */
    private static C32571c f84923f = new C32571c();

    /* renamed from: a */
    public LiveWallPaperBean f84924a;

    /* renamed from: b */
    private List<LiveWallPaperBean> f84925b = new LinkedList();

    /* renamed from: c */
    private C6600e f84926c = new C6600e();

    /* renamed from: d */
    private C32576d f84927d;

    /* renamed from: e */
    private Map<String, C32575a> f84928e;

    /* renamed from: g */
    private ContentResolver f84929g;

    /* renamed from: com.ss.android.ugc.aweme.livewallpaper.b.c$a */
    public interface C32575a {
        /* renamed from: a */
        void mo83852a(boolean z, String str);
    }

    /* renamed from: a */
    public static C32571c m105458a() {
        return f84923f;
    }

    /* renamed from: d */
    private void m105463d() {
        Iterator it = this.f84925b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            LiveWallPaperBean liveWallPaperBean = (LiveWallPaperBean) it.next();
            if (!liveWallPaperBean.isValid()) {
                z = true;
                m105461b(liveWallPaperBean);
                it.remove();
            }
        }
        if (z && this.f84927d != null) {
            this.f84927d.mo60446b(this.f84926c.mo15979b((Object) this.f84925b));
        }
    }

    /* renamed from: b */
    public final void mo83858b() {
        if (this.f84924a.isValid() && !m105462c(this.f84924a.getId())) {
            this.f84925b.add(0, LiveWallPaperBean.newBuilder().mo83950a(this.f84924a.getId()).mo83953b(this.f84924a.getThumbnailPath()).mo83954c(this.f84924a.getVideoPath()).mo83949a(this.f84924a.getWidth()).mo83952b(this.f84924a.getHeight()).mo83955d(this.f84924a.getSource()).mo83951a());
            if (this.f84927d != null) {
                this.f84927d.mo60446b(this.f84926c.mo15979b((Object) this.f84925b));
            }
        }
    }

    /* renamed from: c */
    public final List<LiveWallPaperBean> mo83860c() {
        Collection collection;
        if (!C6307b.m19566a((Collection<T>) this.f84925b)) {
            m105463d();
            return this.f84925b;
        }
        String str = "";
        if (this.f84927d != null) {
            str = this.f84927d.mo60444a("");
        }
        if (TextUtils.isEmpty(str)) {
            return new LinkedList();
        }
        try {
            collection = (List) this.f84926c.mo15975a(str, new C6597a<List<LiveWallPaperBean>>() {
            }.type);
        } catch (Exception unused) {
            collection = null;
        }
        if (C6307b.m19566a(collection)) {
            return new LinkedList();
        }
        this.f84925b.addAll(collection);
        m105463d();
        return this.f84925b;
    }

    private C32571c() {
        try {
            this.f84927d = (C32576d) C23336d.m76560a(AwemeApplication.m21341a(), C32576d.class);
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("LiveWallPaperManager getSP failed ");
            sb.append(th.getMessage());
            C42880h.m136156a(sb.toString());
        }
        if (this.f84927d != null) {
            this.f84924a = LiveWallPaperBean.newBuilder().mo83954c(this.f84927d.mo60448c("")).mo83949a(this.f84927d.mo60443a(0)).mo83952b(this.f84927d.mo60447c(0)).mo83955d(this.f84927d.mo60451e("")).mo83951a();
        } else {
            this.f84924a = LiveWallPaperBean.newBuilder().mo83951a();
        }
        this.f84925b = mo83860c();
        this.f84928e = new HashMap();
    }

    /* renamed from: b */
    private void m105461b(final LiveWallPaperBean liveWallPaperBean) {
        C1592h.m7853a((Callable<TResult>) new Callable<Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() throws Exception {
                C7276d.m22816c(liveWallPaperBean.getThumbnailPath());
                C7276d.m22816c(liveWallPaperBean.getVideoPath());
                return null;
            }
        });
    }

    /* renamed from: a */
    public final void mo83855a(String str) {
        if (this.f84928e.size() != 0) {
            this.f84928e.remove(str);
        }
    }

    /* renamed from: b */
    private static ComponentName m105460b(Activity activity) {
        if (C32577e.m105508e()) {
            return new ComponentName("com.zhiliao.musically.livewallpaper", "com.ss.android.ugc.aweme.livewallpaper.AmeLiveWallpaper");
        }
        return new ComponentName(activity.getPackageName(), AmeLiveWallpaper.class.getName());
    }

    /* renamed from: c */
    private boolean m105462c(String str) {
        if (C6307b.m19566a((Collection<T>) this.f84925b) || TextUtils.isEmpty(str)) {
            return false;
        }
        for (LiveWallPaperBean id : this.f84925b) {
            if (str.equals(id.getId())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo83854a(LiveWallPaperBean liveWallPaperBean) {
        this.f84924a.setId(liveWallPaperBean.getId());
        this.f84924a.setThumbnailPath(liveWallPaperBean.getThumbnailPath());
        this.f84924a.setVideoPath(liveWallPaperBean.getVideoPath());
        this.f84924a.setWidth(liveWallPaperBean.getWidth());
        this.f84924a.setHeight(liveWallPaperBean.getHeight());
        this.f84924a.setSource(liveWallPaperBean.getSource());
    }

    /* renamed from: a */
    private void m105459a(Context context) {
        if (C32577e.m105508e()) {
            if (this.f84929g == null) {
                this.f84929g = context.getContentResolver();
            }
            Bundle bundle = new Bundle();
            bundle.putInt("video_width", this.f84924a.getWidth());
            bundle.putInt("video_height", this.f84924a.getHeight());
            bundle.putString("source", this.f84924a.getSource());
            try {
                this.f84929g.call(C32570b.f84922a, "call_plugin", "", bundle);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("notifyWallpaperService ");
                sb.append(e.getMessage());
                C42880h.m136156a(sb.toString());
                C32577e.m105486a(1, "notifyWallpaperService Unknow content uri");
            }
        } else {
            Intent intent = new Intent();
            intent.setClass(context, AmeLiveWallpaper.class);
            intent.putExtra("video_path", this.f84924a.getVideoPath());
            intent.putExtra("video_width", this.f84924a.getWidth());
            intent.putExtra("video_height", this.f84924a.getHeight());
            intent.putExtra("source", this.f84924a.getSource());
            if (context.startService(intent) == null) {
                C32577e.m105486a(1, "start livewallpaper service fail");
            }
        }
    }

    /* renamed from: b */
    public final void mo83859b(String str) {
        if (!C6307b.m19566a((Collection<T>) this.f84925b) && !TextUtils.isEmpty(str)) {
            Iterator it = this.f84925b.iterator();
            while (it.hasNext()) {
                LiveWallPaperBean liveWallPaperBean = (LiveWallPaperBean) it.next();
                if (str.equals(liveWallPaperBean.getId())) {
                    m105461b(liveWallPaperBean);
                    it.remove();
                    if (this.f84927d != null) {
                        this.f84927d.mo60446b(this.f84926c.mo15979b((Object) this.f84925b));
                    }
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo83853a(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            C32577e.m105486a(1, "context is finish");
        } else if (!C7276d.m22812b(this.f84924a.getVideoPath())) {
            C32577e.m105486a(1, "video path is not exist");
        } else {
            if (this.f84927d != null) {
                this.f84927d.mo60450d(this.f84924a.getVideoPath());
                this.f84927d.mo60445b(this.f84924a.getWidth());
                this.f84927d.mo60449d(this.f84924a.getHeight());
                this.f84927d.mo60452f(this.f84924a.getSource());
            }
            C1592h.m7853a((Callable<TResult>) new Callable<Void>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public Void call() throws Exception {
                    C7276d.m22816c(C32577e.m105503c());
                    C7276d.m22820d(C32571c.this.f84924a.getVideoPath(), C32577e.m105503c());
                    return null;
                }
            });
            if (C32577e.m105495a((Context) activity, activity.getPackageName())) {
                m105459a((Context) activity);
                return;
            }
            Intent intent = new Intent("android.service.wallpaper.CHANGE_LIVE_WALLPAPER");
            intent.putExtra("android.service.wallpaper.extra.LIVE_WALLPAPER_COMPONENT", m105460b(activity));
            try {
                activity.startActivityForResult(intent, 100);
            } catch (Exception unused) {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.dmf).mo25750a();
                C32577e.m105486a(1, "start livewallpaper activity fail");
            }
        }
    }

    /* renamed from: a */
    public final void mo83856a(String str, C32575a aVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f84928e.put(str, aVar);
        }
    }

    /* renamed from: a */
    public final void mo83857a(boolean z, String str, String str2) {
        if (this.f84928e.size() != 0) {
            C32575a aVar = (C32575a) this.f84928e.get(str);
            if (aVar != null) {
                aVar.mo83852a(z, str2);
            }
        }
    }
}
