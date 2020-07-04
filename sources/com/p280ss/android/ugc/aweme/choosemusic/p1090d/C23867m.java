package com.p280ss.android.ugc.aweme.choosemusic.p1090d;

import android.app.Activity;
import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.choosemusic.p1092f.C23888c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.music.p1409c.C33784d;
import com.p280ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.d.m */
public final class C23867m {

    /* renamed from: a */
    private DataCenter f62991a;

    public C23867m(DataCenter dataCenter) {
        this.f62991a = dataCenter;
    }

    /* renamed from: a */
    public final void mo61961a(WeakReference<Activity> weakReference) {
        C1592h.m7853a((Callable<TResult>) new C23868n<TResult>(weakReference)).mo6876a((C1591g<TResult, TContinuationResult>) new C23869o<TResult,TContinuationResult>(this, weakReference, System.currentTimeMillis()), C1592h.f5958b);
    }

    /* renamed from: b */
    static final /* synthetic */ List m78153b(WeakReference weakReference) throws Exception {
        C6921a.m21562b("Local Sound", "Start Load Local Sound");
        ArrayList arrayList = new ArrayList();
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                C33784d.m108923a((Context) weakReference.get(), (List<MusicModel>) arrayList);
            } catch (Exception e) {
                C6921a.m21562b("Local Sound", "Scan Music throw a Exception");
                C6921a.m21559a((Throwable) e);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo61960a(WeakReference weakReference, long j, C1592h hVar) throws Exception {
        if (weakReference == null || ((Activity) weakReference.get()) == null) {
            return null;
        }
        C23888c.m78182a(System.currentTimeMillis() - j);
        if (hVar.mo6889d()) {
            this.f62991a.mo60134a("local_music_list_status", (Object) Integer.valueOf(1));
            C6921a.m21562b("Local Sound", "Load Local Sound Task Failed");
        } else if (hVar.mo6882b()) {
            C6921a.m21562b("Local Sound", "Load Local Sound Task Succeed");
            this.f62991a.mo60134a("local_music_list_status", (Object) Integer.valueOf(0));
            C23073b bVar = new C23073b();
            bVar.mo60118a("list_data", hVar.mo6890e()).mo60118a("list_hasmore", Boolean.valueOf(false)).mo60118a("action_type", Integer.valueOf(1));
            this.f62991a.mo60134a("local_music_list_data", (Object) bVar);
        }
        return null;
    }
}
