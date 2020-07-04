package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.view.PagerAdapter;
import android.support.p022v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10819b;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10820c;
import com.bytedance.ies.dmt.p262ui.widget.tablayout.DmtTabLayout.C10825f;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p280ss.android.ugc.aweme.challenge.service.C23701a;
import com.p280ss.android.ugc.aweme.commerce.challenge.CommerceChallengeFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.ScrollableLayout;
import com.p280ss.android.ugc.aweme.detail.C26060f;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.discover.model.ShowItemsStruct;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileFragmentAdapter;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.p280ss.android.ugc.aweme.views.ChallengeViewPager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Ref.IntRef;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.o */
public final class C23800o implements C23701a {

    /* renamed from: a */
    public Challenge f62832a;

    /* renamed from: b */
    public final ChallengeDetailFragment f62833b;

    /* renamed from: c */
    private final ViewPager f62834c;

    /* renamed from: d */
    private final DmtTabLayout f62835d;

    /* renamed from: e */
    private final View f62836e;

    /* renamed from: f */
    private final ImageView f62837f;

    /* renamed from: g */
    private final ScrollableLayout f62838g;

    /* renamed from: h */
    private final Context f62839h;

    /* renamed from: i */
    private ChallengeDetail f62840i;

    /* renamed from: j */
    private NewFaceStickerBean f62841j;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.o$a */
    public static final class C23801a extends C6597a<NewFaceStickerBean> {
        C23801a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.o$b */
    static final class C23802b implements C10819b {

        /* renamed from: a */
        final /* synthetic */ C23800o f62842a;

        C23802b(C23800o oVar) {
            this.f62842a = oVar;
        }

        /* renamed from: a */
        public final void mo26115a(C10825f fVar) {
            ChallengeDetailFragment challengeDetailFragment = this.f62842a.f62833b;
            C7573i.m23582a((Object) fVar, "it");
            challengeDetailFragment.mo67558c(fVar.f29291e);
            fVar.mo26137a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.o$c */
    public static final class C23803c implements C10820c {

        /* renamed from: a */
        final /* synthetic */ C23800o f62843a;

        C23803c(C23800o oVar) {
            this.f62843a = oVar;
        }

        /* renamed from: b */
        public final void mo26116b(C10825f fVar) {
            String str;
            if (fVar != null) {
                int i = fVar.f29291e;
                C23800o oVar = this.f62843a;
                if (i == 0) {
                    str = "output";
                } else {
                    str = ((ShowItemsStruct) C23800o.m78002a(this.f62843a).showItems.get(i - 1)).getType();
                }
                oVar.mo61846a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo61663a() {
        this.f62835d.mo26054a();
    }

    /* renamed from: b */
    public final ProfileFragmentAdapter<AmeBaseFragment> mo61847b() {
        PagerAdapter adapter = this.f62834c.getAdapter();
        if (adapter != null) {
            return (ProfileFragmentAdapter) adapter;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.profile.ui.ProfileFragmentAdapter<com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment>");
    }

    /* renamed from: d */
    private final boolean m78005d() {
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        IStickerUtilsService stickerUtilsService = ((IAVService) service).getStickerUtilsService();
        if (!(this.f62841j == null || stickerUtilsService == null)) {
            NewFaceStickerBean newFaceStickerBean = this.f62841j;
            if (newFaceStickerBean == null) {
                C7573i.m23580a();
            }
            if (stickerUtilsService.isLockCommerceFaceSticker(newFaceStickerBean)) {
                Context context = this.f62839h;
                NewFaceStickerBean newFaceStickerBean2 = this.f62841j;
                if (newFaceStickerBean2 == null) {
                    C7573i.m23580a();
                }
                stickerUtilsService.showCommerceStickerDialog(context, newFaceStickerBean2, "challenge");
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m78004c() {
        if (C6399b.m19944t()) {
            try {
                C6600e eVar = new C6600e();
                Challenge challenge = this.f62832a;
                if (challenge == null) {
                    C7573i.m23583a("mChallenge");
                }
                this.f62841j = (NewFaceStickerBean) eVar.mo15975a(challenge.getChallengeStickerDetail(), new C23801a().type);
            } catch (Exception unused) {
            }
            if (this.f62841j != null) {
                Object service = ServiceManager.get().getService(IAVService.class);
                C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
                IStickerUtilsService stickerUtilsService = ((IAVService) service).getStickerUtilsService();
                NewFaceStickerBean newFaceStickerBean = this.f62841j;
                if (newFaceStickerBean == null) {
                    C7573i.m23580a();
                }
                if (stickerUtilsService.isLockCommerceFaceSticker(newFaceStickerBean)) {
                    this.f62837f.setImageResource(R.drawable.bke);
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Challenge m78002a(C23800o oVar) {
        Challenge challenge = oVar.f62832a;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        return challenge;
    }

    /* renamed from: a */
    public final void mo61846a(String str) {
        String str2 = "change_inter_tag";
        C22984d a = C22984d.m75611a();
        String str3 = "tag_id";
        Challenge challenge = this.f62832a;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, challenge.getCid()).mo59973a("tag_name", str).f60753a);
    }

    /* renamed from: b */
    private final void m78003b(int i) {
        Challenge challenge = this.f62832a;
        if (challenge == null) {
            C7573i.m23583a("mChallenge");
        }
        if (C6307b.m19566a((Collection<T>) challenge.showItems)) {
            this.f62835d.setVisibility(8);
            return;
        }
        ViewPager viewPager = this.f62834c;
        if (viewPager != null) {
            ((ChallengeViewPager) viewPager).setPagingEnable(true);
            ((ChallengeViewPager) this.f62834c).setOffscreenPageLimit(2);
            this.f62835d.setVisibility(0);
            if (C6399b.m19946v()) {
                this.f62836e.setVisibility(0);
            }
            IntRef intRef = new IntRef();
            intRef.element = ((ChallengeViewPager) this.f62834c).getCurrentItem();
            C26060f fVar = (C26060f) this.f62833b.mo61705l().get(0);
            Integer num = (Integer) mo61847b().f95154c.get(0);
            AmeBaseFragment ameBaseFragment = (AmeBaseFragment) mo61847b().f95153b.get(0);
            C7573i.m23582a((Object) ameBaseFragment, "fragment");
            ameBaseFragment.f19556I = true;
            List l = this.f62833b.mo61705l();
            l.clear();
            l.add(fVar);
            List<T> list = mo61847b().f95153b;
            list.clear();
            list.add(ameBaseFragment);
            List<Integer> list2 = mo61847b().f95154c;
            list2.clear();
            list2.add(num);
            Challenge challenge2 = this.f62832a;
            if (challenge2 == null) {
                C7573i.m23583a("mChallenge");
            }
            List<ShowItemsStruct> list3 = challenge2.showItems;
            C7573i.m23582a((Object) list3, "mChallenge.showItems");
            for (ShowItemsStruct showItemsStruct : list3) {
                CommerceChallengeFragment commerceChallengeFragment = new CommerceChallengeFragment();
                commerceChallengeFragment.mo63412b(showItemsStruct.getDesc());
                commerceChallengeFragment.f64491e = showItemsStruct.getSchema();
                Challenge challenge3 = this.f62832a;
                if (challenge3 == null) {
                    C7573i.m23583a("mChallenge");
                }
                commerceChallengeFragment.mo61741a(challenge3.getCid());
                this.f62833b.mo61705l().add(commerceChallengeFragment);
                mo61847b().f95153b.add(commerceChallengeFragment);
                mo61847b().f95154c.add(Integer.valueOf(commerceChallengeFragment.hashCode()));
            }
            for (C26060f b : this.f62833b.mo61705l()) {
                b.mo61746b(true);
            }
            mo61847b().notifyDataSetChanged();
            int size = mo61847b().f95153b.size();
            if (i >= 0 && size > i) {
                intRef.element = i;
            }
            this.f62835d.setupWithViewPager(this.f62834c);
            this.f62835d.setOnTabClickListener(new C23802b(this));
            this.f62835d.mo26058a((C10820c) new C23803c(this));
            ((ChallengeViewPager) this.f62834c).setCurrentItem(intRef.element);
            this.f62834c.addOnPageChangeListener(new CommerceDelegate$updateFragment$8(this, intRef));
            this.f62833b.onPageSelected(intRef.element);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.views.ChallengeViewPager");
    }

    /* renamed from: a */
    public final boolean mo61667a(int i) {
        if (i == R.id.da5) {
            return m78005d();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo61664a(float f, float f2) {
        Fragment a = mo61847b().mo2423a(this.f62834c.getCurrentItem());
        if ((a instanceof CommerceChallengeFragment) && f2 != 0.0f) {
            ((CommerceChallengeFragment) a).mo63415i();
        }
    }

    /* renamed from: a */
    public final void mo61665a(int i, int i2) {
        Fragment a = mo61847b().mo2423a(this.f62834c.getCurrentItem());
        if ((a instanceof CommerceChallengeFragment) && i != 0) {
            ((CommerceChallengeFragment) a).mo63415i();
        }
    }

    public C23800o(View view, ChallengeDetailFragment challengeDetailFragment) {
        C7573i.m23587b(view, "viewRoot");
        C7573i.m23587b(challengeDetailFragment, "parent");
        this.f62833b = challengeDetailFragment;
        View findViewById = view.findViewById(R.id.edp);
        C7573i.m23582a((Object) findViewById, "viewRoot.findViewById(R.id.viewpager)");
        this.f62834c = (ViewPager) findViewById;
        View findViewById2 = view.findViewById(R.id.dfo);
        C7573i.m23582a((Object) findViewById2, "viewRoot.findViewById(R.id.tab_layout)");
        this.f62835d = (DmtTabLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.c3i);
        C7573i.m23582a((Object) findViewById3, "viewRoot.findViewById(R.id.navigator_div)");
        this.f62836e = findViewById3;
        View findViewById4 = view.findViewById(R.id.da7);
        C7573i.m23582a((Object) findViewById4, "viewRoot.findViewById(R.id.start_record_img)");
        this.f62837f = (ImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.czg);
        C7573i.m23582a((Object) findViewById5, "viewRoot.findViewById(R.id.scroll_layout)");
        this.f62838g = (ScrollableLayout) findViewById5;
        Context context = view.getContext();
        C7573i.m23582a((Object) context, "viewRoot.context");
        this.f62839h = context;
    }

    /* renamed from: a */
    public final void mo61666a(ChallengeDetail challengeDetail, int i) {
        C7573i.m23587b(challengeDetail, "data");
        this.f62840i = challengeDetail;
        Challenge challenge = challengeDetail.challenge;
        C7573i.m23582a((Object) challenge, "data.challenge");
        this.f62832a = challenge;
        m78004c();
        m78003b(i);
    }
}
