package com.p280ss.android.ugc.aweme.effectplatform;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import com.p280ss.android.ttve.utils.C20504b;
import com.p280ss.android.ugc.aweme.app.application.C22863b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.infosticker.StickerItemModel;
import com.p280ss.android.ugc.aweme.language.I18nManagerService;
import com.p280ss.android.ugc.aweme.location.model.AVLocationBundle;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.property.C36975l;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.tools.C42136ac;
import com.p280ss.android.ugc.effectmanager.C43681b;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.C43834g.C43836a;
import com.p280ss.android.ugc.effectmanager.C43837h;
import com.p280ss.android.ugc.effectmanager.common.p1726a.C43703a;
import com.p280ss.android.ugc.effectmanager.common.p1726a.C43704b;
import com.p280ss.android.ugc.effectmanager.common.p1726a.C43705c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43720b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43749a;
import com.p280ss.android.ugc.effectmanager.effect.p1731a.C43750b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43751a;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43752b;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43756f;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43757g;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43758h;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43761k;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43762l;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43763m;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43764n;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43765o;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43766p;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43769s;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43770t;
import com.p280ss.android.ugc.effectmanager.effect.p1734d.C43782a;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43788e;
import com.p280ss.android.ugc.effectmanager.link.model.host.Host;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import okhttp3.OkHttpClient;

/* renamed from: com.ss.android.ugc.aweme.effectplatform.EffectPlatform */
public class EffectPlatform implements C0042h, C27481e {

    /* renamed from: a */
    public static final File f72449a = new File(C35574k.m114861b().getFilesDir(), "effect");

    /* renamed from: b */
    public static final File f72450b = new File(C35574k.m114861b().getFilesDir(), "pin");

    /* renamed from: c */
    public static final List<Host> f72451c = new ArrayList();

    /* renamed from: d */
    public static final String f72452d;

    /* renamed from: l */
    private static ArrayList<String> f72453l;

    /* renamed from: e */
    C27473c f72454e;

    /* renamed from: f */
    private C43834g f72455f;

    /* renamed from: g */
    private Context f72456g;

    /* renamed from: h */
    private String f72457h;

    /* renamed from: i */
    private Random f72458i;

    /* renamed from: j */
    private OkHttpClient f72459j;

    /* renamed from: k */
    private final String f72460k;

    /* renamed from: b */
    public static List<Host> m90013b() {
        return f72451c;
    }

    /* renamed from: c */
    public static String m90014c() {
        return f72452d;
    }

    /* renamed from: a */
    public final void mo70636a(String str, boolean z, C43757g gVar) {
        m90020k();
        this.f72454e.mo70675a(str, false, gVar);
    }

    /* renamed from: a */
    public final void mo70637a(String str, boolean z, String str2, int i, int i2, C43762l lVar) {
        this.f72454e.mo70685c(str, true, str2, i, i2, lVar);
    }

    /* renamed from: a */
    public final void mo70626a(String str, String str2, int i, int i2, int i3, String str3, C43756f fVar) {
        this.f72454e.mo70664a(str, str2, i, i2, i3, str3, fVar);
    }

    /* renamed from: a */
    public final void mo70629a(String str, String str2, C43751a aVar) {
        this.f72454e.mo70668a(str, str2, aVar);
    }

    /* renamed from: a */
    public final void mo70632a(String str, String str2, boolean z, int i, int i2, int i3, String str3, C43756f fVar) {
        this.f72454e.mo70671a(str, str2, z, i, i2, i3, str3, fVar);
    }

    /* renamed from: a */
    public final void mo70635a(String str, boolean z, int i, int i2, C43763m mVar) {
        m90020k();
        this.f72454e.mo70674a(str, false, i, i2, mVar);
    }

    /* renamed from: a */
    public final void mo70627a(String str, String str2, int i, int i2, C43763m mVar) {
        m90020k();
        this.f72454e.mo70666a(str, str2, i, i2, mVar);
    }

    /* renamed from: a */
    public final void mo70630a(String str, String str2, C43760j jVar) {
        m90020k();
        this.f72454e.mo70669a(str, str2, jVar);
    }

    /* renamed from: a */
    public final void mo70639a(List<String> list, Map<String, String> map, boolean z, C43759i iVar) {
        m90020k();
        this.f72454e.mo70678a(list, map, z, iVar);
    }

    /* renamed from: a */
    public final void mo70638a(List<String> list, Map<String, String> map, C43758h hVar) {
        m90020k();
        this.f72454e.mo70677a(list, map, hVar);
    }

    /* renamed from: a */
    public final void mo70628a(String str, String str2, int i, int i2, Map<String, String> map, C43769s sVar) {
        this.f72454e.mo70667a(str, str2, i, i2, map, sVar);
    }

    /* renamed from: a */
    public final void mo70631a(String str, String str2, C43770t tVar) {
        this.f72454e.mo70670a(str, str2, tVar);
    }

    /* renamed from: a */
    public final void mo70634a(String str, List<String> list, String str2, C43765o oVar) {
        this.f72454e.mo70673a(str, list, str2, oVar);
    }

    /* renamed from: a */
    public final void mo70633a(String str, List<String> list, Boolean bool, C43766p pVar) {
        this.f72454e.mo70672a(str, list, bool, pVar);
    }

    /* renamed from: a */
    public final boolean mo70640a(Effect effect) {
        return this.f72454e.mo70679a(effect);
    }

    /* renamed from: a */
    public static String m90012a() {
        return f72449a.getAbsolutePath();
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void destroy() {
        this.f72454e.mo70681b();
    }

    /* renamed from: e */
    public final void mo70643e() {
        this.f72454e.mo70684c();
    }

    /* renamed from: f */
    public final C43837h mo70644f() {
        return this.f72454e.f72467a;
    }

    /* renamed from: j */
    private static boolean m90019j() {
        return C35574k.m114859a().mo70096k().mo93305a(Property.EnableEffectDiskCache);
    }

    /* renamed from: d */
    public static String m90015d() {
        String j = C35574k.m114859a().mo70102q().mo83143j();
        if (!C7163a.m22363a() || !TextUtils.equals("local_test", j) || !C42136ac.m134102a()) {
            return j;
        }
        return "default";
    }

    /* renamed from: h */
    private void m90017h() {
        C43836a a = m90011a(this.f72456g, this.f72457h, this.f72459j, this.f72460k);
        C35574k.m114859a().mo70101p();
        a.mo105979a((C43749a) new C43749a() {

            /* renamed from: b */
            private final C43749a f72462b = C43681b.m138407b().mo105680d();

            /* renamed from: a */
            public final C43782a<C43788e> mo70645a(C43750b bVar) {
                TENativeLibsLoader.m67986c();
                return this.f72462b.mo70645a(bVar);
            }
        });
        this.f72455f = a.mo105986a();
        m90018i();
    }

    /* renamed from: k */
    private void m90020k() {
        String str;
        if (this.f72455f == null) {
            return;
        }
        if (TextUtils.isEmpty(this.f72455f.f113514e) || TextUtils.equals("0", this.f72455f.f113514e)) {
            C43834g gVar = this.f72455f;
            if (AppLog.getServerDeviceId() == null) {
                str = "0";
            } else {
                str = AppLog.getServerDeviceId();
            }
            gVar.f113514e = str;
        }
    }

    static {
        if (C6399b.m19944t() && !C6399b.m19946v()) {
            f72451c.add(new Host("https://api.tiktokv.com/effect/api"));
            f72452d = "1180";
        } else if (C6399b.m19946v()) {
            f72451c.add(new Host("https://api2.musical.ly/effect/api"));
            f72452d = C22863b.f60589a;
        } else {
            f72451c.add(new Host("https://effect.snssdk.com"));
            f72452d = "1128";
        }
    }

    /* renamed from: i */
    private void m90018i() {
        if (m90019j()) {
            if (this.f72455f.f113530u == null) {
                this.f72455f.f113530u = m90016g();
            }
            String absolutePath = this.f72455f.f113519j.getAbsolutePath();
            if (C43703a.m138485a().mo105727a(absolutePath) == null) {
                try {
                    C43703a.m138485a().mo105728a(absolutePath, C43704b.m138488a(this.f72455f));
                } catch (Exception unused) {
                    C43703a.m138485a().mo105728a(absolutePath, new C43705c(this.f72455f));
                }
            }
            this.f72455f.f113528s = C43703a.m138485a().mo105727a(absolutePath);
        }
    }

    /* renamed from: g */
    public static ArrayList<String> m90016g() {
        String str;
        String str2;
        if (f72453l != null) {
            return f72453l;
        }
        ArrayList arrayList = new ArrayList();
        List<C27311c> list = null;
        try {
            list = C35574k.m114859a().mo70090e().mo90405c();
        } catch (Exception unused) {
        }
        if (list == null) {
            return new ArrayList<>();
        }
        for (C27311c cVar : list) {
            if (!(cVar.mo70169K() == null || cVar.mo70169K().stickers == null)) {
                for (StickerItemModel stickerItemModel : cVar.mo70169K().stickers) {
                    if (TextUtils.isEmpty(stickerItemModel.path)) {
                        StringBuilder sb = new StringBuilder("InfoStickers_resdir_null:");
                        if (stickerItemModel.stickerId != null) {
                            str2 = stickerItemModel.stickerId;
                        } else {
                            str2 = "";
                        }
                        sb.append(str2);
                        C2077a.m9159a(sb.toString());
                    } else {
                        arrayList.add(stickerItemModel.path.substring(stickerItemModel.path.lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (!(cVar.f72014B == null || cVar.f72014B.getEffectPointModels() == null)) {
                Iterator it = cVar.f72014B.getEffectPointModels().iterator();
                while (it.hasNext()) {
                    EffectPointModel effectPointModel = (EffectPointModel) it.next();
                    if (TextUtils.isEmpty(effectPointModel.getResDir())) {
                        StringBuilder sb2 = new StringBuilder("EffectListModel_resdir_null:");
                        if (effectPointModel.getKey() != null) {
                            str = effectPointModel.getKey();
                        } else {
                            str = "";
                        }
                        sb2.append(str);
                        C2077a.m9159a(sb2.toString());
                    } else {
                        arrayList.add(effectPointModel.getResDir().substring(effectPointModel.getResDir().lastIndexOf(File.separator) + 1));
                    }
                }
            }
            if (cVar.mo70218ag() != null) {
                String str3 = cVar.mo70218ag().f72080d;
                if (TextUtils.isEmpty(str3)) {
                    StringBuilder sb3 = new StringBuilder("EffectListModel_resdir_null:");
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb3.append(str3);
                    C2077a.m9159a(sb3.toString());
                } else {
                    arrayList.add(str3.substring(str3.lastIndexOf(File.separator) + 1));
                }
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>(new HashSet(arrayList));
        f72453l = arrayList2;
        return arrayList2;
    }

    /* renamed from: a */
    public final void mo70619a(C0043i iVar) {
        iVar.getLifecycle().mo55a(this);
    }

    /* renamed from: a */
    public final void mo70622a(String str) {
        if (this.f72454e != null) {
            this.f72454e.mo70660a(str);
        }
    }

    /* renamed from: a */
    public final void mo70620a(Effect effect, C43760j jVar) {
        m90020k();
        this.f72454e.mo70658a(effect, jVar);
    }

    /* renamed from: a */
    public final void mo70621a(ProviderEffect providerEffect, C43752b bVar) {
        m90020k();
        this.f72454e.mo70659a(providerEffect, bVar);
    }

    /* renamed from: a */
    public final void mo70623a(String str, C43757g gVar) {
        m90020k();
        this.f72454e.mo70661a(str, gVar);
    }

    /* renamed from: a */
    public final void mo70624a(String str, C43761k kVar) {
        this.f72454e.mo70662a(str, kVar);
    }

    /* renamed from: a */
    public final void mo70625a(String str, C43764n nVar) {
        this.f72454e.mo70663a(str, nVar);
    }

    public EffectPlatform(Context context, String str, OkHttpClient okHttpClient) {
        this(context, str, okHttpClient, C35574k.m114859a().mo70092g().mo70113a());
    }

    /* renamed from: b */
    public final void mo70641b(String str, boolean z, C43757g gVar) {
        m90020k();
        this.f72454e.mo70682b(str, z, gVar);
    }

    private EffectPlatform(Context context, String str, OkHttpClient okHttpClient, String str2) {
        this.f72458i = new Random();
        this.f72456g = context.getApplicationContext();
        this.f72457h = str;
        this.f72459j = okHttpClient;
        this.f72454e = new C27473c();
        this.f72460k = str2;
        m90017h();
        this.f72454e.mo70680a(this.f72455f);
    }

    /* renamed from: a */
    public static C43836a m90011a(Context context, String str, OkHttpClient okHttpClient, String str2) {
        AVLocationBundle aVLocationBundle;
        String str3;
        String str4;
        String str5;
        C43720b bVar;
        String d = m90015d();
        String str6 = null;
        if (!C6399b.m19944t()) {
            aVLocationBundle = C35574k.m114859a().mo70107v().mo83201a(context.getApplicationContext());
        } else {
            aVLocationBundle = null;
        }
        if (aVLocationBundle == null) {
            str3 = null;
        } else {
            str3 = String.valueOf(aVLocationBundle.getLongitude());
        }
        if (aVLocationBundle == null) {
            str4 = null;
        } else {
            str4 = String.valueOf(aVLocationBundle.getLatitude());
        }
        if (aVLocationBundle != null) {
            str6 = C35574k.m114859a().mo70107v().mo83202a();
        }
        C43836a a = new C43836a().mo105981a(str2).mo105990e(d).mo105987b(C35574k.m114859a().mo70092g().mo70114b()).mo105988c(C35574k.m114859a().mo70102q().mo83142i()).mo105991f("android").mo105992g(Build.MODEL).mo105977a((C43721c) new C27483g()).mo105978a((C43722d) new C20504b());
        if (AppLog.getServerDeviceId() == null) {
            str5 = "0";
        } else {
            str5 = AppLog.getServerDeviceId();
        }
        C43836a a2 = a.mo105989d(str5).mo105994i(f72452d).mo105995j(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage()).mo105996k(((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getSysLanguage()).mo105982a(str3, str4, str6).mo105974a(2).mo105980a(f72449a);
        if (C35574k.m114859a().mo70096k().mo93305a(Property.EffectPlatformUseTTNet)) {
            bVar = new C27499q();
        } else {
            bVar = new C27471b(okHttpClient);
        }
        C43836a a3 = a2.mo105976a(bVar).mo105993h(str).mo105983a(f72451c).mo105975a(context).mo105984a(C7258h.m22730c()).mo105985a(true);
        if (C7163a.m22363a()) {
            a3.mo105997l(C36975l.f96877a.mo93402b());
        }
        return a3;
    }
}
