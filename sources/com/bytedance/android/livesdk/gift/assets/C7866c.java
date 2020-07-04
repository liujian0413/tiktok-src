package com.bytedance.android.livesdk.gift.assets;

import android.support.p022v4.util.C0893e;
import com.bytedance.android.live.C2317a;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.live.network.response.C3479d;
import com.bytedance.android.livesdk.chatroom.utils.C5339b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.gift.C8282s;
import com.bytedance.android.livesdk.gift.assets.C7874h.C7875a;
import com.bytedance.android.livesdk.sharedpref.C8946b;
import com.bytedance.android.livesdk.utils.C9077o;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.p254b.C6304f;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.ugc.live.gift.resource.C46220c;
import com.p280ss.ugc.live.gift.resource.C46228d;
import com.p280ss.ugc.live.gift.resource.C46237f;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.gift.assets.c */
public class C7866c implements C7874h {

    /* renamed from: a */
    private final String f21255a;

    /* renamed from: b */
    private final List<C7875a> f21256b = new ArrayList();

    /* renamed from: c */
    private final List<Object> f21257c = new ArrayList();

    /* renamed from: d */
    private final C0893e<Long> f21258d = new C0893e<>();

    /* renamed from: e */
    private List<AssetsModel> f21259e = new ArrayList();

    /* renamed from: f */
    private C7321c f21260f;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20658a(Throwable th) throws Exception {
        C7866c.class.getSimpleName();
        th.getMessage();
        if (this.f21260f != null && !this.f21260f.isDisposed()) {
            this.f21260f.dispose();
            this.f21260f = null;
        }
    }

    /* renamed from: a */
    public final void mo20657a(C7875a aVar) {
        if (aVar != null && !this.f21256b.contains(aVar)) {
            this.f21256b.add(aVar);
        }
    }

    /* renamed from: a */
    public final void mo20656a(long j, C7873g gVar, int i) {
        m24107a(mo20662c(j), gVar, i);
    }

    /* renamed from: a */
    public final boolean mo20659a(long j) {
        return m24110a(mo20662c(j));
    }

    /* renamed from: a */
    public final void mo20652a() {
        C46237f.m145177a().mo114191c();
    }

    /* renamed from: b */
    public final void mo20661b(C7875a aVar) {
        if (aVar != null && this.f21256b.contains(aVar)) {
            this.f21256b.remove(aVar);
        }
    }

    /* renamed from: a */
    private static boolean m24110a(AssetsModel assetsModel) {
        C46220c a = C5339b.m17015a(assetsModel);
        if (a == null || !C46237f.m145177a().mo114192c(a)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final String mo20660b(long j) {
        C46220c a = C5339b.m17015a(mo20662c(j));
        if (a == null) {
            return null;
        }
        return C46237f.m145177a().mo114189b(a);
    }

    /* renamed from: c */
    public final AssetsModel mo20662c(long j) {
        for (AssetsModel assetsModel : this.f21259e) {
            if (assetsModel.getId() == j) {
                return assetsModel;
            }
        }
        return null;
    }

    C7866c(String str) {
        this.f21255a = str;
    }

    /* renamed from: a */
    public final void mo20653a(int i) {
        mo20654a(i, false);
    }

    /* renamed from: a */
    private void m24108a(final List<AssetsModel> list) {
        if (!C6311g.m19573a(list)) {
            long longValue = ((Long) C8946b.f24475e.mo22117a()).longValue();
            String str = (String) C8946b.f24474d.mo22117a();
            if (!((Boolean) LiveSettingKeys.ENABLE_ASSETS_DELETE_TIME_LIMIT.mo10240a()).booleanValue() || System.currentTimeMillis() - longValue >= 86400000) {
                final C6600e a = C2317a.m9932a();
                if (longValue == 0 || C6319n.m19593a(str)) {
                    C8946b.f24475e.mo22118a(Long.valueOf(System.currentTimeMillis()));
                    C8946b.f24474d.mo22118a(a.mo15979b((Object) list));
                    return;
                }
                List<AssetsModel> list2 = (List) a.mo15975a(str, new C6597a<List<AssetsModel>>() {
                }.type);
                final ArrayList arrayList = new ArrayList();
                for (AssetsModel assetsModel : list2) {
                    if (!list.contains(assetsModel)) {
                        arrayList.add(assetsModel);
                    }
                }
                C8946b.f24475e.mo22118a(Long.valueOf(System.currentTimeMillis()));
                C8946b.f24474d.mo22118a(a.mo15979b((Object) list));
                if (!C6311g.m19573a(arrayList)) {
                    new C6304f() {
                        public final void run() {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C46220c a = C5339b.m17015a((AssetsModel) it.next());
                                if (a != null) {
                                    File file = new File(C46237f.m145177a().mo114193d().mo20651a(a));
                                    if (!file.exists()) {
                                        it.remove();
                                    } else if (C9077o.m27099a(file)) {
                                        it.remove();
                                    }
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                list.addAll(arrayList);
                                C8946b.f24474d.mo22118a(a.mo15979b((Object) list));
                            }
                        }
                    }.start();
                }
            }
        }
    }

    /* renamed from: a */
    private void m24106a(AssetsModel assetsModel, int i) {
        m24107a(assetsModel, (C7873g) null, i);
    }

    /* renamed from: d */
    private static void m24113d(List<AssetsModel> list, int i) {
        if (i != 1) {
            ArrayList arrayList = new ArrayList();
            for (AssetsModel assetsModel : list) {
                if (assetsModel.getDownloadType() == 2) {
                    arrayList.add(Long.valueOf(assetsModel.getId()));
                }
            }
            if (C6311g.m19573a(arrayList)) {
                C8282s.m25306a(i);
            } else {
                C8282s.m25319a(arrayList.toString(), i);
            }
        }
    }

    /* renamed from: b */
    private void m24111b(List<AssetsModel> list, int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : list) {
            if (((double) (currentTimeMillis - ((Long) this.f21258d.mo3328a(assetsModel.getId(), Long.valueOf(0))).longValue())) > 150000.0d) {
                z = true;
            } else {
                z = false;
            }
            if (!(!z || assetsModel.getDownloadType() == 2 || assetsModel.getResourceType() == 5)) {
                m24106a(assetsModel, i);
                this.f21258d.mo3333b(assetsModel.getId(), Long.valueOf(currentTimeMillis));
            }
        }
    }

    /* renamed from: c */
    private void m24112c(List<AssetsModel> list, int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : list) {
            if (((double) (currentTimeMillis - ((Long) this.f21258d.mo3328a(assetsModel.getId(), Long.valueOf(0))).longValue())) > 150000.0d) {
                z = true;
            } else {
                z = false;
            }
            if (z && assetsModel.getResourceType() == 5) {
                m24106a(assetsModel, i);
                this.f21258d.mo3333b(assetsModel.getId(), Long.valueOf(currentTimeMillis));
            }
        }
    }

    /* renamed from: a */
    private void m24109a(List<AssetsModel> list, int i) {
        boolean z;
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : list) {
            if (((double) (currentTimeMillis - ((Long) this.f21258d.mo3328a(assetsModel.getId(), Long.valueOf(0))).longValue())) > 150000.0d) {
                z = true;
            } else {
                z = false;
            }
            if (z && (assetsModel.getResourceType() == 1 || assetsModel.getResourceType() == 2)) {
                m24106a(assetsModel, i);
                this.f21258d.mo3333b(assetsModel.getId(), Long.valueOf(currentTimeMillis));
            }
        }
    }

    /* renamed from: a */
    public final void mo20654a(int i, boolean z) {
        this.f21260f = ((AssetsApi) C3458e.m12798a().mo10440a(AssetsApi.class)).getAssets(this.f21255a, i).mo19304b(C7333a.m23044b()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C7870d<Object>(this, i, z), (C7326g<? super Throwable>) new C7871e<Object>(this));
    }

    /* renamed from: a */
    private void m24107a(AssetsModel assetsModel, final C7873g gVar, int i) {
        boolean z;
        C46220c a = C5339b.m17016a(assetsModel, i);
        if (a == null) {
            if (gVar != null) {
                gVar.mo9346a((Throwable) new Exception("AssetsManager.downloadAssets: GetResourceRequest is null"));
            }
            return;
        }
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        a.f118817f = z;
        if (gVar == null) {
            C46237f.m145177a().mo114187a(a);
        } else {
            C46237f.m145177a().mo114188a(a, (C46228d) new C46228d() {
                /* renamed from: a */
                public final void mo20663a(long j) {
                    gVar.mo9344a(j);
                }

                /* renamed from: a */
                public final void mo20665a(Throwable th) {
                    gVar.mo9346a(th);
                }

                /* renamed from: a */
                public final void mo20664a(long j, String str) {
                    gVar.mo9345a(j, str);
                }
            });
        }
        if (!C46237f.m145177a().mo114192c(a)) {
            C8282s.m25308a(assetsModel.getId(), i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo20655a(int i, boolean z, C3479d dVar) throws Exception {
        this.f21259e = ((C7865b) dVar.data).f21254a;
        m24109a(this.f21259e, i);
        m24111b(this.f21259e, i);
        if (z) {
            m24112c(this.f21259e, i);
        }
        m24108a(this.f21259e);
        m24113d(this.f21259e, i);
        for (int size = this.f21256b.size() - 1; size >= 0; size--) {
            ((C7875a) this.f21256b.get(size)).mo20666a(this.f21259e);
        }
        if (this.f21260f != null && !this.f21260f.isDisposed()) {
            this.f21260f.dispose();
            this.f21260f = null;
        }
    }
}
