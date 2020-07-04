package com.p280ss.android.ugc.aweme.shortvideo.sticker.newpanel;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.C0069x;
import android.arch.lifecycle.Lifecycle.Event;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.app.AppCompatActivity;
import com.p280ss.android.ugc.aweme.base.C6893q;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.shortvideo.C38510bb;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.EffectStickerManager;
import com.p280ss.android.ugc.aweme.shortvideo.sticker.viewmodel.EffectStickerViewModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p280ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerFetchController */
public final class NewPanelStickerFetchController implements C0042h {

    /* renamed from: d */
    public static final C40838a f106208d = new C40838a(null);

    /* renamed from: a */
    public C7561a<C7581n> f106209a;

    /* renamed from: b */
    public C7561a<C7581n> f106210b;

    /* renamed from: c */
    public C7561a<C7581n> f106211c;

    /* renamed from: e */
    private int f106212e = 2;

    /* renamed from: f */
    private final ConcurrentHashMap<String, Integer> f106213f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private final ConcurrentHashMap<String, CategoryEffectModel> f106214g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private final ConcurrentLinkedQueue<String> f106215h = new ConcurrentLinkedQueue<>();

    /* renamed from: i */
    private AtomicInteger f106216i;

    /* renamed from: j */
    private boolean f106217j;

    /* renamed from: k */
    private PanelInfoModel f106218k;

    /* renamed from: l */
    private boolean f106219l;

    /* renamed from: m */
    private final C0043i f106220m;

    /* renamed from: n */
    private final AppCompatActivity f106221n;

    /* renamed from: o */
    private final EffectStickerManager f106222o;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerFetchController$a */
    public static final class C40838a {
        private C40838a() {
        }

        public /* synthetic */ C40838a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerFetchController$b */
    public static final class C40839b implements C0053p<LiveDataWrapper<CategoryEffectModel>> {

        /* renamed from: a */
        final /* synthetic */ NewPanelStickerFetchController f106223a;

        /* renamed from: b */
        final /* synthetic */ String f106224b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<CategoryEffectModel> liveDataWrapper) {
            if (liveDataWrapper != null) {
                STATUS status = liveDataWrapper.f88768b;
                if (STATUS.SUCCESS == status) {
                    this.f106223a.mo101110a(this.f106224b, true, (CategoryEffectModel) liveDataWrapper.f88767a);
                    return;
                }
                if (STATUS.ERROR == status) {
                    this.f106223a.mo101110a(this.f106224b, false, null);
                }
            }
        }

        C40839b(NewPanelStickerFetchController newPanelStickerFetchController, String str) {
            this.f106223a = newPanelStickerFetchController;
            this.f106224b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.newpanel.NewPanelStickerFetchController$c */
    public static final class C40840c implements C0053p<LiveDataWrapper<PanelInfoModel>> {

        /* renamed from: a */
        final /* synthetic */ NewPanelStickerFetchController f106225a;

        C40840c(NewPanelStickerFetchController newPanelStickerFetchController) {
            this.f106225a = newPanelStickerFetchController;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<PanelInfoModel> liveDataWrapper) {
            if (liveDataWrapper != null) {
                if (liveDataWrapper.f88768b != STATUS.ERROR) {
                    if (liveDataWrapper.f88768b == STATUS.SUCCESS) {
                        if (liveDataWrapper.f88767a != null) {
                            this.f106225a.mo101109a((PanelInfoModel) liveDataWrapper.f88767a);
                            return;
                        }
                    }
                }
                this.f106225a.mo101111b();
            }
        }
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public final void onDestroy() {
        this.f106222o.f104787e.destroy();
    }

    /* renamed from: e */
    private final void m130514e() {
        this.f106216i = new AtomicInteger(0);
    }

    /* renamed from: g */
    private final void m130516g() {
        C7561a<C7581n> aVar = this.f106209a;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: b */
    public final void mo101111b() {
        this.f106219l = false;
        C7561a<C7581n> aVar = this.f106211c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: d */
    private final void m130513d() {
        while (!this.f106215h.isEmpty()) {
            String str = (String) this.f106215h.poll();
            C7573i.m23582a((Object) str, "categoryKey");
            m130511b(str);
        }
    }

    /* renamed from: f */
    private final void m130515f() {
        this.f106213f.clear();
        this.f106214g.clear();
        this.f106215h.clear();
        this.f106216i = null;
        this.f106217j = false;
        this.f106218k = null;
    }

    /* renamed from: c */
    private final void m130512c() {
        String b = this.f106222o.mo100221b();
        C7573i.m23582a((Object) b, "mEffectStickerManager.panel");
        ((EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f106221n).mo147a(EffectStickerViewModel.class)).mo101283a(this.f106222o.f104787e, b).observe(this.f106220m, new C40840c(this));
    }

    /* renamed from: h */
    private final void m130517h() {
        PanelInfoModel panelInfoModel = this.f106218k;
        if (panelInfoModel != null) {
            List<EffectCategoryModel> list = panelInfoModel.category_list;
            if (list != null) {
                this.f106219l = false;
                List arrayList = new ArrayList();
                Iterable iterable = list;
                Collection arrayList2 = new ArrayList();
                for (Object next : iterable) {
                    EffectCategoryModel effectCategoryModel = (EffectCategoryModel) next;
                    ConcurrentHashMap<String, CategoryEffectModel> concurrentHashMap = this.f106214g;
                    C7573i.m23582a((Object) effectCategoryModel, "it");
                    if (concurrentHashMap.containsKey(effectCategoryModel.key)) {
                        arrayList2.add(next);
                    }
                }
                for (EffectCategoryModel effectCategoryModel2 : (List) arrayList2) {
                    C7573i.m23582a((Object) effectCategoryModel2, "it");
                    arrayList.add(effectCategoryModel2);
                    CategoryEffectModel categoryEffectModel = (CategoryEffectModel) this.f106214g.get(effectCategoryModel2.key);
                    if (categoryEffectModel != null) {
                        this.f106222o.mo100226b(effectCategoryModel2.key, categoryEffectModel);
                    }
                }
                this.f106222o.mo100219a(arrayList);
                C7561a<C7581n> aVar = this.f106210b;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo101108a() {
        if (!this.f106219l) {
            this.f106219l = true;
            m130515f();
            m130516g();
            m130512c();
        }
    }

    /* renamed from: a */
    private final void m130509a(List<? extends EffectCategoryModel> list) {
        for (EffectCategoryModel effectCategoryModel : list) {
            this.f106215h.offer(effectCategoryModel.key);
        }
    }

    /* renamed from: a */
    private final boolean m130510a(String str) {
        if (this.f106213f.containsKey(str)) {
            Integer num = (Integer) this.f106213f.get(str);
            if (num == null) {
                num = Integer.valueOf(Integer.MAX_VALUE);
            }
            C7573i.m23582a((Object) num, "mRetryCounter[categoryKey] ?: Int.MAX_VALUE");
            if (num.intValue() >= this.f106212e) {
                return true;
            }
            return false;
        }
        this.f106213f.put(str, Integer.valueOf(0));
        return false;
    }

    /* renamed from: b */
    private final void m130511b(String str) {
        String b = this.f106222o.mo100221b();
        C7573i.m23582a((Object) b, "mEffectStickerManager.panel");
        ((EffectStickerViewModel) C0069x.m159a((FragmentActivity) this.f106221n).mo147a(EffectStickerViewModel.class)).mo101284a(this.f106222o.f104787e, b, str, 0, 0, 0, "").observe(this.f106220m, new C40839b(this, str));
    }

    /* renamed from: a */
    public final void mo101109a(PanelInfoModel panelInfoModel) {
        List<EffectCategoryModel> list;
        if (panelInfoModel != null) {
            list = panelInfoModel.category_list;
        } else {
            list = null;
        }
        if (list == null || panelInfoModel.category_list.isEmpty()) {
            mo101111b();
            return;
        }
        this.f106218k = panelInfoModel;
        m130514e();
        List<EffectCategoryModel> list2 = panelInfoModel.category_list;
        C7573i.m23582a((Object) list2, "categories.categoryList");
        m130509a(C7525m.m23510e(list2));
        m130513d();
    }

    public NewPanelStickerFetchController(C0043i iVar, AppCompatActivity appCompatActivity, EffectStickerManager effectStickerManager) {
        C7573i.m23587b(iVar, "lifecycleOwner");
        C7573i.m23587b(appCompatActivity, "mActivity");
        C7573i.m23587b(effectStickerManager, "mEffectStickerManager");
        this.f106220m = iVar;
        this.f106221n = appCompatActivity;
        this.f106222o = effectStickerManager;
        this.f106220m.getLifecycle().mo55a(this);
    }

    /* renamed from: a */
    public final void mo101110a(String str, boolean z, CategoryEffectModel categoryEffectModel) {
        Object obj;
        Object obj2;
        Integer num = null;
        if (!z || categoryEffectModel == null) {
            C6893q.m21444a("AWEStudio_new_effect_tab_category_load_failed", 0, new C38510bb().mo96481a("panel", "default").mo96481a("category", str).mo96482b());
            if (m130510a(str)) {
                AtomicInteger atomicInteger = this.f106216i;
                if (atomicInteger != null) {
                    obj = Integer.valueOf(atomicInteger.incrementAndGet());
                } else {
                    obj = null;
                }
                PanelInfoModel panelInfoModel = this.f106218k;
                if (panelInfoModel != null) {
                    List<EffectCategoryModel> list = panelInfoModel.category_list;
                    if (list != null) {
                        num = Integer.valueOf(list.size());
                    }
                }
                if (C7573i.m23585a(obj, (Object) num)) {
                    if (this.f106217j) {
                        m130517h();
                    } else {
                        mo101111b();
                    }
                }
            } else {
                Integer num2 = (Integer) this.f106213f.get(str);
                if (num2 == null) {
                    num2 = Integer.valueOf(0);
                }
                C7573i.m23582a((Object) num2, "mRetryCounter[categoryKey] ?: 0");
                this.f106213f.put(str, Integer.valueOf(num2.intValue() + 1));
                this.f106215h.offer(str);
                m130513d();
            }
        } else {
            this.f106217j = true;
            this.f106214g.put(str, categoryEffectModel);
            AtomicInteger atomicInteger2 = this.f106216i;
            if (atomicInteger2 != null) {
                obj2 = Integer.valueOf(atomicInteger2.incrementAndGet());
            } else {
                obj2 = null;
            }
            PanelInfoModel panelInfoModel2 = this.f106218k;
            if (panelInfoModel2 != null) {
                List<EffectCategoryModel> list2 = panelInfoModel2.category_list;
                if (list2 != null) {
                    num = Integer.valueOf(list2.size());
                }
            }
            if (C7573i.m23585a(obj2, (Object) num)) {
                m130517h();
            }
        }
    }
}
