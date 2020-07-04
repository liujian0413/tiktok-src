package com.p280ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.base.C17457s;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.app.p1020a.p1021a.C22731a;
import com.p280ss.android.ugc.aweme.app.p1020a.p1021a.C22733b;
import com.p280ss.android.ugc.aweme.app.p1020a.p1021a.C22734c;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.bridgeservice.C23549b;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.effectplatform.C27481e;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.net.C34098r;
import com.p280ss.android.ugc.aweme.qrcode.view.C37121a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.effect.IEffectService;
import com.p280ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p280ss.android.ugc.aweme.services.sticker.OnUnlockShareFinishListener;
import com.p280ss.android.ugc.aweme.services.sticker.UnLockSticker;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40958e;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40959f;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40961h;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40962i;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.unlock.C40969m;
import com.p280ss.android.ugc.aweme.sticker.C41847c;
import com.p280ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerListBean;
import com.p280ss.android.ugc.aweme.sticker.prop.api.StickerPropApi;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.video.C7276d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43759i;
import com.p280ss.android.ugc.effectmanager.effect.p1732b.C43760j;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.share.x */
public final class C38275x {

    /* renamed from: a */
    public C27481e f99471a;

    /* renamed from: b */
    public C17457s<IEffectService> f99472b;

    /* renamed from: c */
    public boolean f99473c;

    /* renamed from: d */
    public ArrayList<String> f99474d;

    /* renamed from: e */
    public int f99475e;

    /* renamed from: f */
    public C37121a f99476f;

    /* renamed from: g */
    public Context f99477g;

    /* renamed from: h */
    public Music f99478h;

    /* renamed from: i */
    public boolean f99479i;

    /* renamed from: j */
    public C38283a f99480j;

    /* renamed from: k */
    public C38284b f99481k;

    /* renamed from: l */
    public String f99482l;

    /* renamed from: m */
    public String f99483m;

    /* renamed from: n */
    public Effect f99484n;

    /* renamed from: o */
    public boolean f99485o;

    /* renamed from: p */
    C41847c f99486p;

    /* renamed from: q */
    OnUnlockShareFinishListener f99487q;

    /* renamed from: r */
    public C43760j f99488r;

    /* renamed from: s */
    private String f99489s;

    /* renamed from: t */
    private String f99490t;

    /* renamed from: u */
    private String f99491u;

    /* renamed from: v */
    private String f99492v;

    /* renamed from: w */
    private C43759i f99493w;

    /* renamed from: com.ss.android.ugc.aweme.share.x$a */
    public interface C38283a {
        /* renamed from: a */
        void mo70352a(String str, Effect effect);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.x$b */
    public interface C38284b {
        /* renamed from: a */
        void mo93486a(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.x$c */
    class C38285c implements C25678f {

        /* renamed from: a */
        Effect f99506a;

        /* renamed from: b */
        String f99507b;

        /* renamed from: b */
        public final void mo56977b() {
            C6726a.m20844b(new Runnable() {
                public final void run() {
                    C38275x.this.mo95924d(C38285c.this.f99506a, C38285c.this.f99507b);
                }
            });
        }

        /* renamed from: a */
        public final void mo57296a(Exception exc) {
            C40961h.m130826a(C38275x.this.f99477g);
        }

        C38285c(Effect effect, String str) {
            this.f99506a = effect;
            this.f99507b = str;
        }
    }

    /* renamed from: a */
    public final void mo95916a(ArrayList<String> arrayList, String str) {
        this.f99482l = str;
        mo95915a(arrayList);
    }

    /* renamed from: a */
    public final void mo95917a(ArrayList<String> arrayList, boolean z, String str, String str2) {
        this.f99482l = str;
        this.f99483m = str2;
        mo95919a(arrayList, false, false);
    }

    /* renamed from: a */
    public final void mo95918a(ArrayList<String> arrayList, boolean z, Map<String, String> map) {
        this.f99483m = (String) map.get("scene");
        this.f99492v = (String) map.get("grade_key");
        mo95919a(arrayList, false, false);
    }

    /* renamed from: a */
    public final void mo95919a(ArrayList<String> arrayList, boolean z, boolean z2) {
        this.f99479i = z;
        this.f99474d = arrayList;
        m122272b();
        if (this.f99474d != null && this.f99474d.size() > 0) {
            this.f99473c = false;
            this.f99471a = ((IEffectService) this.f99472b.mo44946a()).createEffectPlatform(this.f99477g, C32326h.m104885g(), C34098r.m109769a().mo86751b());
            HashMap hashMap = new HashMap();
            hashMap.put("scene", this.f99483m);
            if (!TextUtils.isEmpty(this.f99492v)) {
                hashMap.put("grade_key", this.f99492v);
            }
            if (z2) {
                this.f99471a.mo70639a((List<String>) this.f99474d, (Map<String, String>) hashMap, false, this.f99493w);
                return;
            }
            ((IEffectService) this.f99472b.mo44946a()).fetchEffectWithMusicBind(this.f99471a, (String) this.f99474d.get(0), (Map<String, String>) hashMap, this.f99488r);
        }
    }

    /* renamed from: a */
    public final boolean mo95921a(List<Effect> list) {
        boolean z;
        if (!C6399b.m19944t() && !C21115b.m71197a().getCurUser().isFlowcardMember()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = true;
                    break;
                } else if (!((Effect) it.next()).getTags().contains("douyin_card")) {
                    z = false;
                    break;
                } else {
                    this.f99475e++;
                }
            }
            if (z) {
                if (this.f99476f != null) {
                    this.f99476f.dismiss();
                }
                m122275c();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo95920a(Effect effect) {
        if (C6399b.m19944t() || C21115b.m71197a().getCurUser().isFlowcardMember() || !effect.getTags().contains("douyin_card")) {
            return false;
        }
        m122275c();
        return true;
    }

    /* renamed from: d */
    private boolean m122278d() {
        if (!C7276d.m22826g()) {
            C10761a.m31399c(this.f99477g, (int) R.string.djg).mo25750a();
            return false;
        } else if (C7276d.m22827h() >= 20971520) {
            return true;
        } else {
            C10761a.m31399c(this.f99477g, (int) R.string.djh).mo25750a();
            return false;
        }
    }

    /* renamed from: b */
    private void m122272b() {
        if (m122278d() && C37961ac.m121264a(C6399b.m19921a()) && this.f99485o) {
            if (this.f99476f == null) {
                this.f99476f = C37121a.m119327a(this.f99477g, this.f99477g.getResources().getString(R.string.awk));
                this.f99476f.setIndeterminate(false);
                return;
            }
            if ((this.f99477g instanceof Activity) && !((Activity) this.f99477g).isFinishing()) {
                this.f99476f.show();
                this.f99476f.mo93590a();
            }
        }
    }

    /* renamed from: c */
    private void m122275c() {
        this.f99491u = ((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().freeFLowCardUrl();
        if (TextUtils.equals(this.f99491u, "")) {
            this.f99491u = "https://lm.189.cn/douyincard/douyincard_index.html?&cmpid=jt-dycard-dyzstz&shopid=lmk.cps.jtdycarddyzstz.100000720";
        }
        new C10741a(this.f99477g).mo25660b(this.f99477g.getResources().getString(R.string.apq)).mo25654a(this.f99477g.getResources().getString(R.string.cni), C38287y.f99510a).mo25661b(this.f99477g.getResources().getString(R.string.rc), (OnClickListener) new C38288z(this)).mo25656a().mo25637a();
    }

    /* renamed from: a */
    public final void mo95912a() {
        if (this.f99484n != null) {
            mo95914a(this.f99484n, UUID.randomUUID().toString());
        }
    }

    /* renamed from: a */
    public final C38275x mo95911a(String str) {
        this.f99490t = str;
        return this;
    }

    public C38275x(Context context) {
        this(context, "prop_reuse");
    }

    /* renamed from: a */
    public final void mo95915a(ArrayList<String> arrayList) {
        m122270a(arrayList, true);
    }

    /* renamed from: b */
    public static final ArrayList<String> m122271b(String str) {
        String[] split;
        if (str == null || str.isEmpty()) {
            return new ArrayList<>();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str2 : str.split(",")) {
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m122267a(Context context) {
        C37968ag agVar = (C37968ag) C23336d.m76560a(context, C37968ag.class);
        String a = agVar.mo60401a("");
        Long valueOf = Long.valueOf(agVar.mo60400a(0));
        int a2 = agVar.mo60399a(0);
        if (TextUtils.isEmpty(a) || valueOf.longValue() == 0 || a2 == 0) {
            return "";
        }
        if (System.currentTimeMillis() - valueOf.longValue() >= 86400000 || C6399b.m19933i() <= ((long) a2)) {
            return "";
        }
        agVar.mo60404b("");
        agVar.mo60403b(0);
        agVar.mo60402b(0);
        return a;
    }

    /* renamed from: a */
    private void m122270a(ArrayList<String> arrayList, boolean z) {
        mo95919a(arrayList, true, false);
    }

    /* renamed from: a */
    public static void m122268a(Context context, String str) {
        C37968ag agVar = (C37968ag) C23336d.m76560a(context, C37968ag.class);
        long currentTimeMillis = System.currentTimeMillis();
        agVar.mo60404b(str);
        agVar.mo60403b(currentTimeMillis);
        agVar.mo60402b((int) C6399b.m19933i());
    }

    /* renamed from: b */
    public static void m122273b(Context context, String str) {
        C6907h.m21524a("app_update_toast_show", (Map) C22984d.m75611a().mo59973a("update_type", "prop_reminder").mo59973a("prop_id", str).f60753a);
    }

    /* renamed from: c */
    public static void m122276c(Context context, String str) {
        C6907h.m21524a("app_update_confirm", (Map) C22984d.m75611a().mo59973a("update_type", "prop_reminder").mo59973a("prop_id", str).f60753a);
    }

    /* renamed from: d */
    public static void m122277d(Context context, String str) {
        C6907h.m21524a("app_update_cancel", (Map) C22984d.m75611a().mo59973a("update_type", "prop_reminder").mo59973a("prop_id", str).f60753a);
    }

    /* renamed from: e */
    public static void m122279e(Context context, String str) {
        C6907h.m21524a("app_update_download_finish", (Map) C22984d.m75611a().mo59973a("update_type", "prop_reminder").mo59973a("prop_id", str).f60753a);
    }

    public C38275x(Context context, String str) {
        this.f99472b = new C17457s<IEffectService>() {

            /* renamed from: a */
            IEffectService f99494a;

            /* access modifiers changed from: private */
            /* renamed from: b */
            public IEffectService mo44946a() {
                if (this.f99494a == null) {
                    this.f99494a = ((IAVService) ServiceManager.get().getService(IAVService.class)).effectService();
                }
                return this.f99494a;
            }
        };
        this.f99475e = 0;
        this.f99482l = "";
        this.f99483m = "";
        this.f99492v = "";
        this.f99485o = true;
        this.f99493w = new C43759i() {
            /* renamed from: a */
            public final void mo95925a(C43726c cVar) {
                C38275x.this.f99488r.mo9281a(null, cVar);
                if (C38275x.this.f99476f != null) {
                    C38275x.this.f99476f.dismiss();
                }
            }

            /* renamed from: a */
            public final void mo95926a(List<Effect> list) {
                if (!C38275x.this.mo95921a(list)) {
                    ((IEffectService) C38275x.this.f99472b.mo44946a()).fetchEffectWithMusicBind(C38275x.this.f99471a, (String) C38275x.this.f99474d.get(C38275x.this.f99475e), C38275x.this.f99483m, C38275x.this.f99488r);
                }
            }
        };
        this.f99487q = new OnUnlockShareFinishListener() {
            public final void onVKShareSucceed(Effect effect) {
            }

            public final void onShareAppFailed() {
                C40961h.m130826a(C38275x.this.f99477g);
            }

            public final void onShareAppSucceed(Effect effect) {
                if (C38275x.this.f99486p != null) {
                    C40969m mVar = new C40969m();
                    mVar.f106497a = UnLockSticker.STICKER_UNLOCKED;
                    mVar.f106498b = effect;
                    mVar.f106499c = C38275x.this.f99482l;
                    C42961az.m136381b(mVar);
                    C40961h.m130828a(C38275x.this.f99482l);
                    C38275x.this.f99484n = effect;
                    if (TextUtils.equals(C38275x.this.f99482l, "prop_page")) {
                        C42961az.m136380a(new C40958e());
                    } else if (TextUtils.equals(C38275x.this.f99482l, "prop_reuse")) {
                        C42961az.m136380a(new C40959f());
                    }
                }
            }
        };
        this.f99488r = new C43760j() {
            /* renamed from: b */
            public final void mo9282b(Effect effect) {
            }

            /* renamed from: c */
            static final /* synthetic */ NewFaceStickerListBean m122300c(Effect effect) throws Exception {
                return (NewFaceStickerListBean) ((StickerPropApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(StickerPropApi.class)).getStickerDetail(effect.getEffectId()).get();
            }

            /* renamed from: a */
            private boolean m122299a(C1592h<NewFaceStickerListBean> hVar) {
                if (hVar.mo6887c() || hVar.mo6889d() || hVar.mo6890e() == null) {
                    return false;
                }
                List<NewFaceStickerBean> list = ((NewFaceStickerListBean) hVar.mo6890e()).mStickers;
                if (list == null || list.size() == 0) {
                    return false;
                }
                IStickerUtilsService stickerUtilsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
                NewFaceStickerBean newFaceStickerBean = (NewFaceStickerBean) list.get(0);
                if (stickerUtilsService == null || !stickerUtilsService.isLockCommerceFaceSticker(newFaceStickerBean)) {
                    return false;
                }
                stickerUtilsService.showCommerceStickerDialog(C38275x.this.f99477g, newFaceStickerBean, "homepage_hot");
                return true;
            }

            /* renamed from: a */
            public final void mo9280a(Effect effect) {
                C38275x.this.f99473c = true;
                C42951au.m136343b(C38275x.this.f99476f);
                if (!C38275x.this.mo95920a(effect)) {
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().setCurMusic(null);
                    ((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().removeChallenges();
                    String uuid = UUID.randomUUID().toString();
                    if (C38275x.this.f99480j != null) {
                        C38275x.this.f99480j.mo70352a(uuid, effect);
                    } else {
                        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", uuid).mo59973a("shoot_way", "prop_reuse").mo59970a("_staging_flag", true ^ C6399b.m19946v() ? 1 : 0).mo59973a("prop_id", effect.getEffectId()).f60753a);
                    }
                    if (TextUtils.equals(C38275x.this.f99482l, "prop_page")) {
                        FaceStickerBean.sCurPropSource = "prop_page";
                    }
                    if (!C6399b.m19944t() || !((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService().isLockSticker(effect) || (!TextUtils.equals(C38275x.this.f99482l, "prop_reuse") && !TextUtils.equals(C38275x.this.f99482l, "prop_page"))) {
                        C38275x.this.mo95914a(effect, uuid);
                    } else if (effect.isBusiness()) {
                        C1592h.m7853a((Callable<TResult>) new C37959aa<TResult>(effect)).mo6876a((C1591g<TResult, TContinuationResult>) new C37960ab<TResult,TContinuationResult>(this, effect, uuid), C1592h.f5958b);
                    } else {
                        C38275x.this.mo95922b(effect, uuid);
                    }
                    if (C38275x.this.f99481k != null) {
                        C38275x.this.f99481k.mo93486a(0);
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:46:0x018d A[ADDED_TO_REGION] */
            /* JADX WARNING: Removed duplicated region for block: B:49:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo9281a(com.p280ss.android.ugc.effectmanager.effect.model.Effect r6, com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c r7) {
                /*
                    r5 = this;
                    int r6 = r7.f113220a
                    r7 = 2003(0x7d3, float:2.807E-42)
                    r0 = 2002(0x7d2, float:2.805E-42)
                    r1 = 2004(0x7d4, float:2.808E-42)
                    r2 = 2006(0x7d6, float:2.811E-42)
                    if (r6 == r1) goto L_0x002e
                    if (r6 == r0) goto L_0x002e
                    if (r6 == r7) goto L_0x002e
                    if (r6 == r2) goto L_0x002e
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r7 = r7.f99477g
                    com.ss.android.ugc.aweme.share.x r0 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r0 = r0.f99477g
                    android.content.res.Resources r0 = r0.getResources()
                    r1 = 2131823003(0x7f11099b, float:1.9278793E38)
                    java.lang.String r0 = r0.getString(r1)
                    com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r0)
                    r7.mo25750a()
                    goto L_0x0180
                L_0x002e:
                    com.ss.android.ugc.aweme.share.x r3 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    int r4 = r3.f99475e
                    int r4 = r4 + 1
                    r3.f99475e = r4
                    com.ss.android.ugc.aweme.share.x r3 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    boolean r3 = r3.f99479i
                    if (r3 == 0) goto L_0x006f
                    com.ss.android.ugc.aweme.share.x r3 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    int r3 = r3.f99475e
                    com.ss.android.ugc.aweme.share.x r4 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    java.util.ArrayList<java.lang.String> r4 = r4.f99474d
                    int r4 = r4.size()
                    if (r3 >= r4) goto L_0x006f
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.google.common.base.s<com.ss.android.ugc.aweme.services.effect.IEffectService> r7 = r7.f99472b
                    java.lang.Object r7 = r7.mo44946a()
                    com.ss.android.ugc.aweme.services.effect.IEffectService r7 = (com.p280ss.android.ugc.aweme.services.effect.IEffectService) r7
                    com.ss.android.ugc.aweme.share.x r0 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.effectplatform.e r0 = r0.f99471a
                    com.ss.android.ugc.aweme.share.x r1 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    java.util.ArrayList<java.lang.String> r1 = r1.f99474d
                    com.ss.android.ugc.aweme.share.x r3 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    int r3 = r3.f99475e
                    java.lang.Object r1 = r1.get(r3)
                    java.lang.String r1 = (java.lang.String) r1
                    com.ss.android.ugc.aweme.share.x r3 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    java.lang.String r3 = r3.f99483m
                    r7.fetchEffectWithMusicBind(r0, r1, r3, r5)
                    goto L_0x0187
                L_0x006f:
                    com.ss.android.ugc.aweme.share.x r3 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    boolean r3 = r3.f99473c
                    if (r3 != 0) goto L_0x0187
                    if (r6 == r1) goto L_0x0166
                    if (r6 != r0) goto L_0x007b
                    goto L_0x0166
                L_0x007b:
                    if (r6 != r7) goto L_0x0099
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r7 = r7.f99477g
                    com.ss.android.ugc.aweme.share.x r0 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r0 = r0.f99477g
                    android.content.res.Resources r0 = r0.getResources()
                    r1 = 2131822490(0x7f11079a, float:1.9277753E38)
                    java.lang.String r0 = r0.getString(r1)
                    com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r0)
                    r7.mo25750a()
                    goto L_0x0180
                L_0x0099:
                    if (r6 != r2) goto L_0x0180
                    com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r7 = com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98861a()
                    java.lang.Boolean r7 = r7.getStickerUpdateApp()
                    boolean r7 = r7.booleanValue()
                    r0 = 2131829205(0x7f1121d5, float:1.9291373E38)
                    if (r7 == 0) goto L_0x0141
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    java.util.ArrayList<java.lang.String> r7 = r7.f99474d
                    boolean r7 = com.bytedance.common.utility.collection.C6307b.m19566a(r7)
                    if (r7 != 0) goto L_0x0141
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    java.util.ArrayList<java.lang.String> r7 = r7.f99474d
                    r1 = 0
                    java.lang.Object r7 = r7.get(r1)
                    java.lang.CharSequence r7 = (java.lang.CharSequence) r7
                    boolean r7 = android.text.TextUtils.isEmpty(r7)
                    if (r7 != 0) goto L_0x0141
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r7 = r7.f99477g
                    boolean r7 = r7 instanceof android.app.Activity
                    if (r7 == 0) goto L_0x0133
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    java.util.ArrayList<java.lang.String> r7 = r7.f99474d
                    java.lang.Object r7 = r7.get(r1)
                    java.lang.String r7 = (java.lang.String) r7
                    boolean r1 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
                    if (r1 == 0) goto L_0x011e
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r3 = 21
                    if (r1 >= r3) goto L_0x00fd
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r7 = r7.f99477g
                    com.ss.android.ugc.aweme.share.x r1 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r1 = r1.f99477g
                    android.content.res.Resources r1 = r1.getResources()
                    java.lang.String r0 = r1.getString(r0)
                    com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r0)
                    r7.mo25750a()
                    goto L_0x0133
                L_0x00fd:
                    com.ss.android.ugc.aweme.share.x r0 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r0 = r0.f99477g
                    android.app.Activity r0 = (android.app.Activity) r0
                    android.app.Dialog r0 = com.p280ss.android.ugc.aweme.share.C38275x.m122266a(r0, r7)
                    com.ss.android.ugc.aweme.share.x r1 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r1 = r1.f99477g
                    android.app.Activity r1 = (android.app.Activity) r1
                    boolean r1 = r1.isFinishing()
                    if (r1 != 0) goto L_0x0116
                    r0.show()
                L_0x0116:
                    com.ss.android.ugc.aweme.share.x r0 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r0 = r0.f99477g
                    com.p280ss.android.ugc.aweme.share.C38275x.m122273b(r0, r7)
                    goto L_0x0133
                L_0x011e:
                    com.ss.android.ugc.aweme.share.ad r0 = new com.ss.android.ugc.aweme.share.ad
                    com.ss.android.ugc.aweme.share.x r1 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r1 = r1.f99477g
                    android.app.Activity r1 = (android.app.Activity) r1
                    r0.<init>(r1, r7)
                    r0.mo95569a()
                    com.ss.android.ugc.aweme.share.x r0 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r0 = r0.f99477g
                    com.p280ss.android.ugc.aweme.share.C38275x.m122273b(r0, r7)
                L_0x0133:
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.share.x$b r7 = r7.f99481k
                    if (r7 == 0) goto L_0x0180
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.share.x$b r7 = r7.f99481k
                    r7.mo93486a(r2)
                    goto L_0x0180
                L_0x0141:
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r7 = r7.f99477g
                    com.ss.android.ugc.aweme.share.x r1 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r1 = r1.f99477g
                    android.content.res.Resources r1 = r1.getResources()
                    java.lang.String r0 = r1.getString(r0)
                    com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r0)
                    r7.mo25750a()
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.share.x$b r7 = r7.f99481k
                    if (r7 == 0) goto L_0x0180
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.share.x$b r7 = r7.f99481k
                    r7.mo93486a(r6)
                    goto L_0x0180
                L_0x0166:
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r7 = r7.f99477g
                    com.ss.android.ugc.aweme.share.x r0 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    android.content.Context r0 = r0.f99477g
                    android.content.res.Resources r0 = r0.getResources()
                    r1 = 2131822881(0x7f110921, float:1.9278546E38)
                    java.lang.String r0 = r0.getString(r1)
                    com.bytedance.ies.dmt.ui.c.a r7 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r7, r0)
                    r7.mo25750a()
                L_0x0180:
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.qrcode.view.a r7 = r7.f99476f
                    com.p280ss.android.ugc.aweme.utils.C42951au.m136343b(r7)
                L_0x0187:
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.share.x$b r7 = r7.f99481k
                    if (r7 == 0) goto L_0x0196
                    if (r6 == r2) goto L_0x0196
                    com.ss.android.ugc.aweme.share.x r7 = com.p280ss.android.ugc.aweme.share.C38275x.this
                    com.ss.android.ugc.aweme.share.x$b r7 = r7.f99481k
                    r7.mo93486a(r6)
                L_0x0196:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.C38275x.C382805.mo9281a(com.ss.android.ugc.effectmanager.effect.model.Effect, com.ss.android.ugc.effectmanager.common.d.c):void");
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ Void mo95927a(Effect effect, String str, C1592h hVar) throws Exception {
                if (!m122299a(hVar)) {
                    C38275x.this.mo95922b(effect, str);
                }
                return null;
            }
        };
        this.f99477g = context;
        this.f99489s = str;
    }

    /* renamed from: a */
    public static Dialog m122266a(final Activity activity, final String str) {
        C10741a aVar = new C10741a(activity);
        aVar.mo25649a((int) R.string.e1r).mo25657b((int) R.string.e1p).mo25650a((int) R.string.e1s, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C23549b.m77335a().checkForUpdate(activity, true, str);
                C38275x.m122268a((Context) activity, str);
                C38275x.m122276c((Context) activity, str);
            }
        }).mo25658b((int) R.string.e1q, (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C38275x.m122277d((Context) activity, str);
            }
        });
        Dialog b = aVar.mo25656a().mo25638b();
        b.setCanceledOnTouchOutside(false);
        return b;
    }

    /* renamed from: c */
    public final void mo95923c(Effect effect, String str) {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().updateUnlockedIdsFromNet(new C38285c(effect, str));
    }

    /* renamed from: d */
    public final void mo95924d(Effect effect, String str) {
        IStickerUtilsService stickerUtilsService = ((IAVService) ServiceManager.get().getService(IAVService.class)).getStickerUtilsService();
        if (stickerUtilsService.hasUnlocked(effect)) {
            C40961h.m130828a(this.f99482l);
            mo95914a(effect, str);
        } else if (!TextUtils.equals(this.f99482l, "prop_reuse")) {
            C40962i iVar = new C40962i("prop_page", this.f99477g, effect, this.f99487q, false, false);
            this.f99486p = iVar;
            this.f99486p.mo101264a();
        } else if (stickerUtilsService.isStickerPreviewable(effect)) {
            C40961h.m130828a(this.f99482l);
            mo95914a(effect, str);
        } else {
            C40962i iVar2 = new C40962i("prop_reuse", this.f99477g, effect, this.f99487q, false, false);
            this.f99486p = iVar2;
            this.f99486p.mo101264a();
        }
    }

    /* renamed from: a */
    private void m122269a(Intent intent, Music music) {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().isOpenStickerRecordWithMusic() && music != null) {
            if (((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(music.convertToMusicModel(), this.f99477g, false)) {
                StringBuilder sb = new StringBuilder();
                sb.append(music.getId());
                intent.putExtra("direct_use_sticker_music", sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo95922b(final Effect effect, final String str) {
        if (!C21115b.m71197a().isLogin()) {
            C32656f.m105742a((Activity) this.f99477g, "prop_page", "prop_page");
            C22731a.m75105a((C22734c) new C22733b() {
                /* renamed from: a */
                public final void mo59805a() {
                    if (C6861a.m21337f().isLogin()) {
                        if (!C43122ff.m136767b()) {
                            C38275x.this.mo95923c(effect, str);
                        } else {
                            return;
                        }
                    }
                    C22731a.m75107b((C22734c) this);
                }
            });
        } else if (((IAVService) ServiceManager.get().getService(IAVService.class)).unLockStickerManagerService().getUpdateState()) {
            mo95924d(effect, str);
        } else {
            mo95923c(effect, str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo95913a(DialogInterface dialogInterface, int i) {
        Intent intent = new Intent(this.f99477g, CrossPlatformActivity.class);
        intent.setData(Uri.parse(this.f99491u));
        this.f99477g.startActivity(intent);
    }

    /* renamed from: a */
    public final void mo95914a(Effect effect, String str) {
        C40961h.m130828a(this.f99482l);
        Intent intent = new Intent(this.f99477g, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
        intent.putStringArrayListExtra("reuse_sticker_ids", this.f99474d);
        intent.putExtra("first_sticker", effect);
        intent.putExtra("sticker_music", this.f99478h);
        m122269a(intent, this.f99478h);
        intent.putExtra("translation_type", 3);
        intent.putExtra("shoot_way", this.f99489s);
        intent.putExtra("enter_from", this.f99490t);
        intent.putExtra("extra_sticker_from", this.f99483m);
        intent.putExtra("grade_key", this.f99492v);
        intent.putExtra("creation_id", str);
        ((IAVService) ServiceManager.get().getService(IAVService.class)).getVideoRecordEntranceService().startToolPermissionActivity(this.f99477g, intent);
    }
}
