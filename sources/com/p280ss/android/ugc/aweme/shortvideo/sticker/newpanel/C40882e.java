package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1278j;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.C40913s;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.e */
public abstract class C40882e {

    /* renamed from: a */
    private final AppCompatActivity f106312a;

    /* renamed from: b */
    private final ShortVideoContext f106313b;

    /* renamed from: c */
    private final EffectStickerManager f106314c;

    /* renamed from: h */
    public int f106315h;

    /* renamed from: i */
    public STATUS f106316i = STATUS.INIT;

    /* renamed from: j */
    public boolean f106317j;

    /* renamed from: k */
    public boolean f106318k;

    /* renamed from: l */
    public boolean f106319l;

    /* renamed from: m */
    public AVDmtPanelRecyleView f106320m;

    /* renamed from: n */
    public NewPanelStickerAdapter f106321n;

    /* renamed from: o */
    public LinearLayoutManager f106322o;

    /* renamed from: p */
    public C1278j f106323p;

    /* renamed from: a */
    public abstract void mo101124a(String str, C7562b<? super String, ? extends Object> bVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo101127c() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo101128d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo101129e() {
    }

    /* renamed from: f */
    public void mo101130f() {
        this.f106319l = true;
        mo101152i();
    }

    /* renamed from: h */
    public final void mo101151h() {
        this.f106319l = false;
        mo101154k();
    }

    /* renamed from: b */
    private final void mo101126b() {
        boolean z;
        if (this.f106317j) {
            mo101129e();
            z = false;
        } else {
            z = true;
        }
        this.f106318k = z;
    }

    /* renamed from: l */
    private final void m130633l() {
        boolean z;
        if (this.f106317j) {
            mo101128d();
            z = false;
        } else {
            z = true;
        }
        this.f106318k = z;
    }

    /* renamed from: m */
    private final void m130634m() {
        boolean z;
        if (this.f106317j) {
            mo101127c();
            z = false;
        } else {
            z = true;
        }
        this.f106318k = z;
    }

    /* renamed from: g */
    public void mo101131g() {
        AVDmtPanelRecyleView aVDmtPanelRecyleView = this.f106320m;
        if (aVDmtPanelRecyleView != null) {
            aVDmtPanelRecyleView.mo5560d();
        }
        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = this.f106320m;
        if (aVDmtPanelRecyleView2 != null) {
            aVDmtPanelRecyleView2.mo5551c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo101154k() {
        HashSet hashSet = (HashSet) this.f106314c.f104784b.get(mo101153j());
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    /* renamed from: a */
    private final void mo101120a() {
        switch (C40883f.f106324a[this.f106316i.ordinal()]) {
            case 1:
                mo101126b();
                return;
            case 2:
                m130633l();
                return;
            case 3:
                m130634m();
                break;
        }
    }

    /* renamed from: n */
    private final C22984d m130635n() {
        if (this.f106313b == null) {
            return null;
        }
        return C22984d.m75611a().mo59973a("enter_method", "click_main_panel").mo59973a("creation_id", this.f106313b.f99787w).mo59973a("shoot_way", this.f106313b.f99788x).mo59970a("draft_id", this.f106313b.f99790z);
    }

    /* renamed from: o */
    private final JSONObject m130636o() {
        String str;
        C6909j jVar = new C6909j();
        String str2 = "position";
        if (C7573i.m23585a((Object) this.f106314c.mo100221b(), (Object) "livestreaming")) {
            str = "live_set";
        } else {
            str = "shoot_page";
        }
        C6909j a = jVar.mo16966a(str2, str);
        if (m130637p() == 1) {
            a.mo16966a("is_photo", "1");
        } else {
            a.mo16966a("is_photo", "0");
        }
        JSONObject a2 = a.mo16967a();
        C7573i.m23582a((Object) a2, "mobJsonHelper.build()");
        return a2;
    }

    /* renamed from: p */
    private final int m130637p() {
        C0063u a = C0069x.m159a((FragmentActivity) this.f106312a).mo147a(EffectStickerViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(mA…kerViewModel::class.java)");
        C40913s a2 = ((EffectStickerViewModel) a).mo101285a();
        C7573i.m23582a((Object) a2, "ViewModelProviders.of(mA…    .recordStickerContext");
        return a2.mo101198g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo101153j() {
        int i = this.f106315h;
        List d = this.f106314c.mo100231d();
        C7573i.m23582a((Object) d, "mEffectStickerManager.newPanelEffectCategory");
        int size = d.size();
        if (i < 0 || size <= i) {
            return "";
        }
        Object obj = d.get(i);
        C7573i.m23582a(obj, "categoryList[categoryIndex]");
        String str = ((EffectCategoryModel) obj).name;
        C7573i.m23582a((Object) str, "categoryList[categoryIndex].name");
        return str;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008b, code lost:
        if (r5 == null) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d6, code lost:
        if (r10 == null) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e8, code lost:
        if (r3 == null) goto L_0x00ea;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101152i() {
        /*
            r11 = this;
            android.support.v7.widget.LinearLayoutManager r0 = r11.f106322o
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r0 = r11.f106321n
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            java.lang.String r0 = r11.mo101153j()
            android.support.v7.widget.LinearLayoutManager r1 = r11.f106322o
            r2 = 0
            if (r1 == 0) goto L_0x0018
            int r1 = r1.mo5445j()
            goto L_0x0019
        L_0x0018:
            r1 = 0
        L_0x0019:
            android.support.v7.widget.LinearLayoutManager r3 = r11.f106322o
            if (r3 == 0) goto L_0x0022
            int r3 = r3.mo5447l()
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r4 = r11.f106314c
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r4 = r4.f104784b
            java.lang.Object r4 = r4.get(r0)
            java.util.HashSet r4 = (java.util.HashSet) r4
            if (r4 != 0) goto L_0x0042
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r5 = r11.f106314c
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r5 = r5.f104784b
            java.lang.String r6 = "mEffectStickerManager.mobStickerData"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.util.Map r5 = (java.util.Map) r5
            r5.put(r0, r4)
        L_0x0042:
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r5 = r11.f106321n
            if (r5 == 0) goto L_0x00fd
            java.util.List r5 = r5.mo62312a()
            if (r5 == 0) goto L_0x00fd
            int r5 = r5.size()
            int r1 = r1 + 1
            int r1 = java.lang.Math.max(r1, r2)
            int r3 = r3 + 1
            int r2 = java.lang.Math.min(r3, r5)
        L_0x005c:
            if (r1 >= r2) goto L_0x00fc
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r3 = r11.f106321n
            if (r3 == 0) goto L_0x00f8
            java.util.List r3 = r3.mo62312a()
            if (r3 == 0) goto L_0x00f8
            java.lang.Object r3 = r3.get(r1)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r3 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r3
            if (r3 != 0) goto L_0x0072
            goto L_0x00f8
        L_0x0072:
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r3.f104908a
            java.lang.String r6 = "stickerWrapper.effect"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            java.lang.String r5 = r5.getEffectId()
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L_0x00f8
            com.ss.android.ugc.effectmanager.effect.model.Effect r5 = r3.f104908a
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = r5.getEffectId()
            if (r5 != 0) goto L_0x008f
        L_0x008d:
            java.lang.String r5 = ""
        L_0x008f:
            com.ss.android.ugc.aweme.common.MobClick r6 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r7 = "prop"
            com.ss.android.ugc.aweme.common.MobClick r6 = r6.setEventName(r7)
            java.lang.String r7 = "show"
            com.ss.android.ugc.aweme.common.MobClick r6 = r6.setLabelName(r7)
            com.ss.android.ugc.aweme.common.MobClick r6 = r6.setValue(r5)
            org.json.JSONObject r7 = r11.m130636o()
            com.ss.android.ugc.aweme.common.MobClick r6 = r6.setJsonObject(r7)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r6)
            com.ss.android.ugc.aweme.app.g.d r6 = r11.m130635n()
            if (r6 == 0) goto L_0x00f5
            com.ss.android.ugc.aweme.utils.b r7 = com.p280ss.android.ugc.aweme.utils.C42962b.f111525a
            java.lang.String r8 = "prop_show"
            java.lang.String r9 = "enter_from"
            java.lang.String r10 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r9, r10)
            java.lang.String r9 = "tab_name"
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r9, r0)
            java.lang.String r9 = "prop_id"
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r9, r5)
            java.lang.String r9 = "parent_pop_id"
            com.ss.android.ugc.effectmanager.effect.model.Effect r10 = r3.f104908a
            if (r10 == 0) goto L_0x00d8
            java.lang.String r10 = r10.getParentId()
            if (r10 != 0) goto L_0x00da
        L_0x00d8:
            java.lang.String r10 = ""
        L_0x00da:
            com.ss.android.ugc.aweme.app.g.d r6 = r6.mo59973a(r9, r10)
            java.lang.String r9 = "prop_index"
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r3.f104908a
            if (r3 == 0) goto L_0x00ea
            java.lang.String r3 = r3.getGradeKey()
            if (r3 != 0) goto L_0x00ec
        L_0x00ea:
            java.lang.String r3 = ""
        L_0x00ec:
            com.ss.android.ugc.aweme.app.g.d r3 = r6.mo59973a(r9, r3)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f60753a
            r7.mo104671a(r8, r3)
        L_0x00f5:
            r4.add(r5)
        L_0x00f8:
            int r1 = r1 + 1
            goto L_0x005c
        L_0x00fc:
            return
        L_0x00fd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40882e.mo101152i():void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo101149a(STATUS status) {
        C7573i.m23587b(status, "newStatus");
        this.f106316i = status;
        mo101120a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo101150b(String str) {
        if (str != null && !this.f106314c.f104784b.containsKey(str)) {
            HashMap<String, HashSet<String>> hashMap = this.f106314c.f104784b;
            C7573i.m23582a((Object) hashMap, "mEffectStickerManager.mobStickerData");
            hashMap.put(str, new HashSet());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo101148a(int r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.mo101153j()
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r1 = r8.f106314c
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r1 = r1.f104784b
            java.lang.Object r1 = r1.get(r0)
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 != 0) goto L_0x0023
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            com.ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager r2 = r8.f106314c
            java.util.HashMap<java.lang.String, java.util.HashSet<java.lang.String>> r2 = r2.f104784b
            java.lang.String r3 = "mEffectStickerManager.mobStickerData"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.util.Map r2 = (java.util.Map) r2
            r2.put(r0, r1)
        L_0x0023:
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r2 = r8.f106321n
            if (r2 == 0) goto L_0x0032
            java.util.List r2 = r2.mo62312a()
            if (r2 == 0) goto L_0x0032
            int r2 = r2.size()
            goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            int r9 = r9 + 1
            if (r9 < 0) goto L_0x00d2
            if (r2 > r9) goto L_0x003a
            return
        L_0x003a:
            com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerAdapter r2 = r8.f106321n
            if (r2 == 0) goto L_0x004b
            java.util.List r2 = r2.mo62312a()
            if (r2 == 0) goto L_0x004b
            java.lang.Object r9 = r2.get(r9)
            com.ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper r9 = (com.p280ss.android.ugc.aweme.shortvideo.sticker.StickerWrapper) r9
            goto L_0x004c
        L_0x004b:
            r9 = 0
        L_0x004c:
            if (r9 == 0) goto L_0x00d1
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r9.f104908a
            java.lang.String r3 = "stickerWrapper.effect"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getEffectId()
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x00d1
            com.ss.android.ugc.effectmanager.effect.model.Effect r2 = r9.f104908a
            java.lang.String r3 = "stickerWrapper.effect"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            java.lang.String r2 = r2.getEffectId()
            com.ss.android.ugc.aweme.common.MobClick r3 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r4 = "prop"
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setEventName(r4)
            java.lang.String r4 = "show"
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setLabelName(r4)
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setValue(r2)
            org.json.JSONObject r4 = r8.m130636o()
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setJsonObject(r4)
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r3)
            com.ss.android.ugc.aweme.app.g.d r3 = r8.m130635n()
            if (r3 == 0) goto L_0x00ce
            com.ss.android.ugc.aweme.utils.b r4 = com.p280ss.android.ugc.aweme.utils.C42962b.f111525a
            java.lang.String r5 = "prop_show"
            java.lang.String r6 = "enter_from"
            java.lang.String r7 = "video_shoot_page"
            com.ss.android.ugc.aweme.app.g.d r3 = r3.mo59973a(r6, r7)
            java.lang.String r6 = "tab_name"
            com.ss.android.ugc.aweme.app.g.d r0 = r3.mo59973a(r6, r0)
            java.lang.String r3 = "prop_id"
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r3, r2)
            java.lang.String r3 = "parent_pop_id"
            com.ss.android.ugc.effectmanager.effect.model.Effect r6 = r9.f104908a
            java.lang.String r7 = "stickerWrapper.effect"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            java.lang.String r6 = r6.getParentId()
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r3, r6)
            java.lang.String r3 = "prop_index"
            com.ss.android.ugc.effectmanager.effect.model.Effect r9 = r9.f104908a
            java.lang.String r6 = "stickerWrapper.effect"
            kotlin.jvm.internal.C7573i.m23582a(r9, r6)
            java.lang.String r9 = r9.getGradeKey()
            com.ss.android.ugc.aweme.app.g.d r9 = r0.mo59973a(r3, r9)
            java.util.Map<java.lang.String, java.lang.String> r9 = r9.f60753a
            r4.mo104671a(r5, r9)
        L_0x00ce:
            r1.add(r2)
        L_0x00d1:
            return
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel.C40882e.mo101148a(int):void");
    }

    public C40882e(AppCompatActivity appCompatActivity, ShortVideoContext shortVideoContext, EffectStickerManager effectStickerManager) {
        C7573i.m23587b(appCompatActivity, "mActivity");
        C7573i.m23587b(effectStickerManager, "mEffectStickerManager");
        this.f106312a = appCompatActivity;
        this.f106313b = shortVideoContext;
        this.f106314c = effectStickerManager;
    }
}
