package com.p280ss.android.ugc.aweme.poi.p335ui.detail.component;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.component.C23305g;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32639p.C32640a;
import com.p280ss.android.ugc.aweme.location.LocationResult;
import com.p280ss.android.ugc.aweme.login.C32656f;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.poi.PoiSimpleBundle;
import com.p280ss.android.ugc.aweme.poi.adapter.C35014c;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.C35045e;
import com.p280ss.android.ugc.aweme.poi.adapter.viewholder.PoiDetailHeaderInfoPresenter.C35025a;
import com.p280ss.android.ugc.aweme.poi.model.PoiBackendType;
import com.p280ss.android.ugc.aweme.poi.model.PoiClassRankStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiCommodity;
import com.p280ss.android.ugc.aweme.poi.model.PoiDetail;
import com.p280ss.android.ugc.aweme.poi.model.PoiProductInfo;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiClassRankBannerStruct;
import com.p280ss.android.ugc.aweme.poi.model.feed.PoiOptionStruct;
import com.p280ss.android.ugc.aweme.poi.p1461a.C35007b;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35392m;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35409r;
import com.p280ss.android.ugc.aweme.poi.p335ui.C35411t;
import com.p280ss.android.ugc.aweme.poi.p335ui.PoiNoticeActivity.C35259a;
import com.p280ss.android.ugc.aweme.poi.p335ui.coupon.C35308e;
import com.p280ss.android.ugc.aweme.poi.utils.C35440a;
import com.p280ss.android.ugc.aweme.poi.utils.C35441aa;
import com.p280ss.android.ugc.aweme.poi.utils.C35442b;
import com.p280ss.android.ugc.aweme.poi.utils.C35444d;
import com.p280ss.android.ugc.aweme.poi.utils.C35451j;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35460p;
import com.p280ss.android.ugc.aweme.poi.utils.C35462r;
import com.p280ss.android.ugc.aweme.poi.widget.C35488e;
import com.p280ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout;
import com.p280ss.android.ugc.aweme.poi.widget.HorizontalBusinessComponentLayout;
import com.p280ss.android.ugc.aweme.poi.widget.PoiActsFlipperView;
import com.p280ss.android.ugc.aweme.poi.widget.PoiHeaderLayout;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget */
public final class PoiStructureInfoWidget extends LinearLayout {

    /* renamed from: a */
    public PoiDetail f92614a;

    /* renamed from: b */
    public C35392m f92615b;

    /* renamed from: c */
    public C35025a f92616c;

    /* renamed from: d */
    public C35014c f92617d;

    /* renamed from: e */
    public PoiSimpleBundle f92618e;

    /* renamed from: f */
    private PoiStruct f92619f;

    /* renamed from: g */
    private double f92620g;

    /* renamed from: h */
    private double f92621h;

    /* renamed from: i */
    private LocationResult f92622i;

    /* renamed from: j */
    private double f92623j;

    /* renamed from: k */
    private double f92624k;

    /* renamed from: l */
    private C35308e f92625l;

    /* renamed from: m */
    private HashMap f92626m;

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$a */
    static final class C35331a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92627a;

        C35331a(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92627a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92627a.mo89901b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$b */
    static final class C35332b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92628a;

        C35332b(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92628a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92628a.mo89902c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$c */
    static final class C35333c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiDetail f92629a;

        /* renamed from: b */
        final /* synthetic */ PoiStructureInfoWidget f92630b;

        C35333c(PoiDetail poiDetail, PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92629a = poiDetail;
            this.f92630b = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C35462r.m114556a(this.f92630b.getContext(), this.f92629a, "poi_page", this.f92630b.f92618e, true, "click_button");
            C35007b.m113003a("click", "contacts", "poi_page", "poi_page", this.f92630b.f92618e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$d */
    static final class C35334d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92631a;

        C35334d(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92631a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92631a.mo89898a();
            C35007b.m113003a("click", "merchants", "poi_page", "poi_page", this.f92631a.f92618e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$e */
    static final class C35335e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92632a;

        C35335e(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92632a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92632a.mo89901b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$f */
    static final class C35336f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92633a;

        C35336f(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92633a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f92633a.mo89902c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$g */
    static final class C35337g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92634a;

        C35337g(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92634a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
            PoiSimpleBundle poiSimpleBundle = this.f92634a.f92618e;
            String str2 = null;
            if (poiSimpleBundle != null) {
                str = poiSimpleBundle.getAwemeId();
            } else {
                str = null;
            }
            Aweme rawAdAwemeById = iAwemeService.getRawAdAwemeById(str);
            C35454m.m114529a("click_address", "click", this.f92634a.f92618e);
            C35025a aVar = this.f92634a.f92616c;
            if (aVar != null) {
                aVar.mo88804a(true);
            }
            Context context = this.f92634a.getContext();
            String str3 = "address";
            PoiSimpleBundle poiSimpleBundle2 = this.f92634a.f92618e;
            if (poiSimpleBundle2 != null) {
                str2 = poiSimpleBundle2.getPoiId();
            }
            C35444d.m114487a(context, rawAdAwemeById, str3, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$h */
    static final class C35338h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92635a;

        C35338h(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92635a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
            PoiSimpleBundle poiSimpleBundle = this.f92635a.f92618e;
            String str3 = null;
            if (poiSimpleBundle != null) {
                str = poiSimpleBundle.getAwemeId();
            } else {
                str = null;
            }
            Aweme rawAdAwemeById = iAwemeService.getRawAdAwemeById(str);
            Context context = this.f92635a.getContext();
            PoiSimpleBundle poiSimpleBundle2 = this.f92635a.f92618e;
            if (poiSimpleBundle2 != null) {
                str2 = poiSimpleBundle2.getPoiId();
            } else {
                str2 = null;
            }
            C35444d.m114495d(context, rawAdAwemeById, str2);
            Context context2 = this.f92635a.getContext();
            PoiDetail poiDetail = this.f92635a.f92614a;
            if (poiDetail != null) {
                str3 = poiDetail.getPhone();
            }
            C35462r.m114558a(context2, str3, "poi_page", "click_button", this.f92635a.f92618e);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$i */
    static final class C35339i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92636a;

        C35339i(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92636a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
            PoiSimpleBundle poiSimpleBundle = this.f92636a.f92618e;
            String str2 = null;
            if (poiSimpleBundle != null) {
                str = poiSimpleBundle.getAwemeId();
            } else {
                str = null;
            }
            Aweme rawAdAwemeById = iAwemeService.getRawAdAwemeById(str);
            C35454m.m114529a("click_button", "click", this.f92636a.f92618e);
            C35025a aVar = this.f92636a.f92616c;
            if (aVar != null) {
                aVar.mo88804a(true);
            }
            Context context = this.f92636a.getContext();
            String str3 = "address";
            PoiSimpleBundle poiSimpleBundle2 = this.f92636a.f92618e;
            if (poiSimpleBundle2 != null) {
                str2 = poiSimpleBundle2.getPoiId();
            }
            C35444d.m114487a(context, rawAdAwemeById, str3, str2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$j */
    static final class C35340j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92637a;

        C35340j(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92637a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (!C27326a.m89578a(view)) {
                C35392m mVar = this.f92637a.f92615b;
                if (mVar != null) {
                    mVar.mo90121a(view, false);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$k */
    static final class C35341k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92638a;

        C35341k(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92638a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f92638a.f92614a;
            if (poiDetail != null) {
                PoiSimpleBundle poiSimpleBundle = this.f92638a.f92618e;
                String str2 = "click_poi_introduction";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page");
                String str3 = "previous_page";
                PoiSimpleBundle poiSimpleBundle2 = this.f92638a.f92618e;
                if (poiSimpleBundle2 != null) {
                    str = poiSimpleBundle2.getPreviousPage();
                } else {
                    str = null;
                }
                C35454m.m114523a(poiSimpleBundle, str2, a.mo59973a(str3, str).mo59973a("poi_id", poiDetail.getPoiId()));
                StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/douyin_falcon/poi/detail/?poi_id=");
                sb.append(poiDetail.getPoiId());
                String sb2 = sb.toString();
                Bundle bundle = new Bundle();
                bundle.putString("title", poiDetail.getDesc());
                bundle.putBoolean("hide_nav_bar", false);
                bundle.putBoolean("hide_status_bar", false);
                bundle.putBoolean("show_closeall", false);
                C35460p.m114545a(this.f92638a.getContext(), sb2, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$l */
    static final class C35342l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92639a;

        C35342l(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92639a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            long j;
            PoiClassRankStruct poiClassRankStruct;
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f92639a.f92614a;
            if (poiDetail != null) {
                j = poiDetail.getPoiRankClassCode();
            } else {
                j = -1;
            }
            PoiDetail poiDetail2 = this.f92639a.f92614a;
            String str3 = null;
            if (poiDetail2 != null) {
                poiClassRankStruct = poiDetail2.getPoiRankBundle();
            } else {
                poiClassRankStruct = null;
            }
            if (j != -1 && poiClassRankStruct != null) {
                if (poiClassRankStruct.classOption != null) {
                    PoiOptionStruct poiOptionStruct = poiClassRankStruct.classOption;
                    C7573i.m23582a((Object) poiOptionStruct, "poiClassRankStruct.classOption");
                    str = poiOptionStruct.getName();
                } else {
                    str = "";
                }
                PoiSimpleBundle poiSimpleBundle = this.f92639a.f92618e;
                String str4 = "enter_poi_leaderboard";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page").mo59973a("city_info", C33230ac.m107204a()).mo59973a("enter_method", "click_leaderboard_bar");
                String str5 = "poi_channel";
                PoiBackendType poiBackendType = poiClassRankStruct.backendType;
                if (poiBackendType != null) {
                    str2 = poiBackendType.getCode();
                } else {
                    str2 = null;
                }
                C22984d a2 = a.mo59973a(str5, str2).mo59973a("sub_class", str).mo59973a("district_code", poiClassRankStruct.districtCode);
                String str6 = "poi_id";
                PoiSimpleBundle poiSimpleBundle2 = this.f92639a.f92618e;
                if (poiSimpleBundle2 != null) {
                    str3 = poiSimpleBundle2.getPoiId();
                }
                C35454m.m114523a(poiSimpleBundle, str4, a2.mo59973a(str6, str3));
                Bundle bundle = new Bundle();
                bundle.putSerializable("poi_rank", poiClassRankStruct);
                bundle.putString("enter_from", "poi_page");
                bundle.putString("enter_method", "click_leaderboard_bar");
                bundle.putString("district_code", poiClassRankStruct.districtCode);
                Context context = this.f92639a.getContext();
                C7573i.m23582a((Object) context, "context");
                C35411t.m114384a(context, bundle);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$m */
    static final class C35343m implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92640a;

        C35343m(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92640a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            if (this.f92640a.f92617d == null) {
                PoiStructureInfoWidget poiStructureInfoWidget = this.f92640a;
                PoiSimpleBundle poiSimpleBundle = this.f92640a.f92618e;
                String str2 = "poi_page";
                PoiDetail poiDetail = this.f92640a.f92614a;
                if (poiDetail != null) {
                    str = poiDetail.getBackendType();
                } else {
                    str = null;
                }
                poiStructureInfoWidget.f92617d = new C35014c(poiSimpleBundle, str2, 0, str);
            }
            ((PoiActsFlipperView) this.f92640a.mo89897a((int) R.id.cdm)).mo90208b();
            C35014c cVar = this.f92640a.f92617d;
            if (cVar != null) {
                Context context = this.f92640a.getContext();
                C7573i.m23582a((Object) context, "context");
                PoiActsFlipperView poiActsFlipperView = (PoiActsFlipperView) this.f92640a.mo89897a((int) R.id.cdm);
                C7573i.m23582a((Object) poiActsFlipperView, "poi_detail_act_content");
                PoiClassRankBannerStruct currentItem = poiActsFlipperView.getCurrentItem();
                if (currentItem == null) {
                    C7573i.m23580a();
                }
                PoiActsFlipperView poiActsFlipperView2 = (PoiActsFlipperView) this.f92640a.mo89897a((int) R.id.cdm);
                C7573i.m23582a((Object) poiActsFlipperView2, "poi_detail_act_content");
                cVar.mo88781a(context, currentItem, poiActsFlipperView2.getCurrentPosition());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$n */
    static final class C35344n implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92641a;

        C35344n(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92641a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f92641a.f92614a;
            if (poiDetail != null) {
                Context context = this.f92641a.getContext();
                C7573i.m23582a((Object) context, "context");
                String poiName = poiDetail.getPoiName();
                C7573i.m23582a((Object) poiName, "getPoiName()");
                PoiClassRankBannerStruct merchantAct = poiDetail.getMerchantAct();
                C7573i.m23582a((Object) merchantAct, "merchantAct");
                C35259a.m113797a(context, poiName, merchantAct);
                PoiSimpleBundle poiSimpleBundle = this.f92641a.f92618e;
                String str2 = "merchant_event_click";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page");
                String str3 = "previous_page";
                PoiSimpleBundle poiSimpleBundle2 = this.f92641a.f92618e;
                String str4 = null;
                if (poiSimpleBundle2 != null) {
                    str = poiSimpleBundle2.getPreviousPage();
                } else {
                    str = null;
                }
                C22984d a2 = a.mo59973a(str3, str);
                String str5 = "poi_id";
                PoiSimpleBundle poiSimpleBundle3 = this.f92641a.f92618e;
                if (poiSimpleBundle3 != null) {
                    str4 = poiSimpleBundle3.getPoiId();
                }
                C35454m.m114523a(poiSimpleBundle, str2, a2.mo59973a(str5, str4).mo59973a("merchant_event_id", poiDetail.getMerchantActId()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$o */
    static final class C35345o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92642a;

        C35345o(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92642a = poiStructureInfoWidget;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            PoiDetail poiDetail = this.f92642a.f92614a;
            if (poiDetail != null) {
                PoiProductInfo poiProductInfo = poiDetail.productInfo;
                if (poiProductInfo != null) {
                    String str = poiProductInfo.supplierId;
                    if (str != null) {
                        Context context = this.f92642a.getContext();
                        C7573i.m23582a((Object) context, "context");
                        C35411t.m114385a(context, str);
                    }
                }
            }
            this.f92642a.mo89903d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$p */
    static final class C35346p<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92643a;

        C35346p(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92643a = poiStructureInfoWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            C35454m.m114523a(this.f92643a.f92618e, "service_facility_bar_click", this.f92643a.getServiceMobParams());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$q */
    static final class C35347q<V> implements Callable<Void> {

        /* renamed from: a */
        final /* synthetic */ PoiStructureInfoWidget f92644a;

        C35347q(PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92644a = poiStructureInfoWidget;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void call() {
            C35454m.m114523a(this.f92644a.f92618e, "service_facility_bar_show", this.f92644a.getServiceMobParams());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.component.PoiStructureInfoWidget$r */
    static final class C35348r implements C23305g {

        /* renamed from: a */
        final /* synthetic */ PoiDetail f92645a;

        /* renamed from: b */
        final /* synthetic */ PoiStructureInfoWidget f92646b;

        C35348r(PoiDetail poiDetail, PoiStructureInfoWidget poiStructureInfoWidget) {
            this.f92645a = poiDetail;
            this.f92646b = poiStructureInfoWidget;
        }

        /* renamed from: a */
        public final void mo58664a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo58663a() {
            Context context = this.f92646b.getContext();
            String bookUrl = this.f92645a.getBookUrl();
            C7573i.m23582a((Object) bookUrl, "bookUrl");
            Context context2 = this.f92646b.getContext();
            C7573i.m23582a((Object) context2, "context");
            String string = context2.getResources().getString(R.string.d0d);
            C7573i.m23582a((Object) string, "context.resources.getString(R.string.poi_reserve)");
            C35045e.m113153a(context, bookUrl, string);
        }
    }

    public PoiStructureInfoWidget(Context context) {
        this(context, null, 0, 6, null);
    }

    public PoiStructureInfoWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: a */
    public final View mo89897a(int i) {
        if (this.f92626m == null) {
            this.f92626m = new HashMap();
        }
        View view = (View) this.f92626m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f92626m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: m */
    private final boolean m114044m() {
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            return poiDetail.isEnterprise();
        }
        return false;
    }

    /* renamed from: t */
    private final void m114051t() {
        C1592h.m7855a((Callable<TResult>) new C35347q<TResult>(this), (Executor) C6907h.m21516a());
    }

    /* renamed from: d */
    public final void mo89903d() {
        C1592h.m7855a((Callable<TResult>) new C35346p<TResult>(this), (Executor) C6907h.m21516a());
    }

    /* renamed from: k */
    private final void m114042k() {
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            String poiRank = poiDetail.getPoiRank();
            if (poiRank != null && C35451j.m114508a(poiRank)) {
                m114043l();
                LinearLayout linearLayout = (LinearLayout) mo89897a((int) R.id.cer);
                C7573i.m23582a((Object) linearLayout, "poi_detail_rank_layout");
                linearLayout.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceq)).setText(poiRank);
            }
        }
    }

    /* renamed from: q */
    private final void m114048q() {
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            String desc = poiDetail.getDesc();
            if (desc != null && C35451j.m114508a(desc)) {
                LinearLayout linearLayout = (LinearLayout) mo89897a((int) R.id.cds);
                C7573i.m23582a((Object) linearLayout, "poi_detail_desc_layout");
                linearLayout.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.cdr)).setText(desc);
            }
        }
    }

    /* renamed from: r */
    private final boolean m114049r() {
        PoiProductInfo poiProductInfo;
        if (this.f92614a != null) {
            PoiDetail poiDetail = this.f92614a;
            String str = null;
            if (poiDetail != null) {
                poiProductInfo = poiDetail.productInfo;
            } else {
                poiProductInfo = null;
            }
            if (poiProductInfo != null) {
                PoiDetail poiDetail2 = this.f92614a;
                if (poiDetail2 != null) {
                    PoiProductInfo poiProductInfo2 = poiDetail2.productInfo;
                    if (poiProductInfo2 != null) {
                        str = poiProductInfo2.supplierId;
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0015 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m114050s() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r4.f92614a
            if (r0 == 0) goto L_0x000b
            com.ss.android.ugc.aweme.poi.model.PoiProductInfo r0 = r0.productInfo
            if (r0 == 0) goto L_0x000b
            java.util.List<java.lang.Object> r0 = r0.hotelFeatures
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)
            if (r1 == 0) goto L_0x0016
            return
        L_0x0016:
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "context"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r2 = 2131300652(0x7f09112c, float:1.821934E38)
            android.view.View r2 = r4.mo89897a(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "poi_service_item_container"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.p280ss.android.ugc.aweme.poi.p335ui.C35411t.m114386a(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.component.PoiStructureInfoWidget.m114050s():void");
    }

    /* renamed from: c */
    public final void mo89902c() {
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            C35409r.f92878a = "poi_page";
            C35007b.m113003a("click", "queue", "poi_page", "poi_page", this.f92618e);
            Context context = getContext();
            PoiCommodity poiCommodity = poiDetail.poiCommodity;
            C7573i.m23582a((Object) poiCommodity, "poiCommodity");
            String lat = poiDetail.getLat();
            String lng = poiDetail.getLng();
            String queueUrl = poiDetail.getQueueUrl();
            C7573i.m23582a((Object) queueUrl, "queueUrl");
            C35045e.m113152a(context, poiCommodity, "poi_page", lat, lng, queueUrl);
        }
    }

    public final C22984d getServiceMobParams() {
        String str;
        C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page");
        String str2 = "previous_page";
        PoiSimpleBundle poiSimpleBundle = this.f92618e;
        if (poiSimpleBundle != null) {
            str = poiSimpleBundle.getPreviousPage();
        } else {
            str = null;
        }
        C22984d a2 = a.mo59973a(str2, str);
        C7573i.m23582a((Object) a2, "EventMapBuilder.newBuild…mpleBundle?.previousPage)");
        return a2;
    }

    /* renamed from: f */
    private void m114037f() {
        PoiStruct poiStruct;
        if (C35462r.m114566a(this.f92620g, this.f92621h) && C35462r.m114566a(this.f92623j, this.f92624k)) {
            PoiDetail poiDetail = this.f92614a;
            if (poiDetail != null) {
                poiStruct = poiDetail.poiStruct;
            } else {
                poiStruct = null;
            }
            if (C35441aa.m114462a(poiStruct, this.f92622i)) {
                DmtTextView dmtTextView = (DmtTextView) mo89897a((int) R.id.ce3);
                C7573i.m23582a((Object) dmtTextView, "poi_detail_loc_distance");
                dmtTextView.setVisibility(0);
                DmtTextView dmtTextView2 = (DmtTextView) mo89897a((int) R.id.ce3);
                C7573i.m23582a((Object) dmtTextView2, "poi_detail_loc_distance");
                dmtTextView2.setText(C35442b.m114472b(getContext(), this.f92620g, this.f92621h, this.f92623j, this.f92624k));
                return;
            }
        }
        DmtTextView dmtTextView3 = (DmtTextView) mo89897a((int) R.id.ce3);
        C7573i.m23582a((Object) dmtTextView3, "poi_detail_loc_distance");
        dmtTextView3.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0046, code lost:
        if (r0 == null) goto L_0x004b;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m114038g() {
        /*
            r9 = this;
            r9.m114037f()
            r0 = 2131300531(0x7f0910b3, float:1.8219094E38)
            android.view.View r1 = r9.mo89897a(r0)
            com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout r1 = (com.p280ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout) r1
            com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r9.f92619f
            r3 = 2131233001(0x7f0808e9, float:1.8082127E38)
            r1.mo90198a(r2, r3)
            r1 = 2131300534(0x7f0910b6, float:1.82191E38)
            android.view.View r1 = r9.mo89897a(r1)
            r2 = r1
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            android.view.View r0 = r9.mo89897a(r0)
            com.ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout r0 = (com.p280ss.android.ugc.aweme.poi.widget.CompoundDrawableAndTextLayout) r0
            java.lang.String r1 = "poi_detail_loc_addr"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            android.widget.TextView r0 = r0.getTextView()
            java.lang.String r1 = "poi_detail_loc_addr.textView"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.CharSequence r3 = r0.getText()
            android.content.Context r4 = r9.getContext()
            java.lang.String r6 = "poi_address"
            com.ss.android.ugc.aweme.poi.model.PoiDetail r7 = r9.f92614a
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r0 = r9.f92618e
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r0.getPreviousPage()
            if (r0 != 0) goto L_0x0049
            goto L_0x004b
        L_0x0049:
            r8 = r0
            goto L_0x004e
        L_0x004b:
            java.lang.String r0 = ""
            goto L_0x0049
        L_0x004e:
            r5 = 2131825572(0x7f1113a4, float:1.9284004E38)
            com.p280ss.android.ugc.aweme.poi.utils.C35462r.m114563a(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.component.PoiStructureInfoWidget.m114038g():void");
    }

    private final void getLocation() {
        this.f92622i = C32640a.m105721a().mo84026b(null);
        LocationResult locationResult = this.f92622i;
        if (locationResult != null) {
            C32640a.m105721a().mo84027b();
            try {
                this.f92623j = locationResult.getLatitude();
                this.f92624k = locationResult.getLongitude();
                if (!locationResult.isGaode()) {
                    double[] b = C35440a.m114454b(this.f92624k, this.f92623j);
                    this.f92624k = b[0];
                    this.f92623j = b[1];
                }
            } catch (Exception e) {
                C6921a.m21554a(e);
            }
        }
    }

    /* renamed from: i */
    private final boolean m114040i() {
        String str;
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            str = poiDetail.getPhone();
        } else {
            str = null;
        }
        if (!C35451j.m114508a(str)) {
            return false;
        }
        ImageView imageView = (ImageView) mo89897a((int) R.id.ce8);
        C7573i.m23582a((Object) imageView, "poi_detail_loc_phone");
        imageView.setVisibility(0);
        View a = mo89897a((int) R.id.ce9);
        C7573i.m23582a((Object) a, "poi_detail_loc_phone_divider");
        a.setVisibility(0);
        ImageView imageView2 = (ImageView) mo89897a((int) R.id.ce6);
        C7573i.m23582a((Object) imageView2, "poi_detail_loc_navi");
        if (imageView2.getVisibility() == 8) {
            View a2 = mo89897a((int) R.id.ce9);
            C7573i.m23582a((Object) a2, "poi_detail_loc_phone_divider");
            LayoutParams layoutParams = a2.getLayoutParams();
            if (layoutParams != null) {
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
        }
        return true;
    }

    /* renamed from: j */
    private final boolean m114041j() {
        String str;
        String str2;
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            String merchantActTitle = poiDetail.getMerchantActTitle();
            if (merchantActTitle != null && C35451j.m114508a(merchantActTitle)) {
                LinearLayout linearLayout = (LinearLayout) mo89897a((int) R.id.cfi);
                C7573i.m23582a((Object) linearLayout, "poi_merchant_act_layout");
                linearLayout.setVisibility(0);
                ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.cfh)).setText(merchantActTitle);
                PoiSimpleBundle poiSimpleBundle = this.f92618e;
                String str3 = "merchant_event_show";
                C22984d a = C22984d.m75611a().mo59973a("enter_from", "poi_page");
                String str4 = "previous_page";
                PoiSimpleBundle poiSimpleBundle2 = this.f92618e;
                String str5 = null;
                if (poiSimpleBundle2 != null) {
                    str = poiSimpleBundle2.getPreviousPage();
                } else {
                    str = null;
                }
                C22984d a2 = a.mo59973a(str4, str);
                String str6 = "poi_id";
                PoiSimpleBundle poiSimpleBundle3 = this.f92618e;
                if (poiSimpleBundle3 != null) {
                    str2 = poiSimpleBundle3.getPoiId();
                } else {
                    str2 = null;
                }
                C22984d a3 = a2.mo59973a(str6, str2);
                String str7 = "merchant_event_id";
                PoiDetail poiDetail2 = this.f92614a;
                if (poiDetail2 != null) {
                    str5 = poiDetail2.getMerchantActId();
                }
                C35454m.m114523a(poiSimpleBundle, str3, a3.mo59973a(str7, str5));
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if (com.p280ss.android.ugc.aweme.poi.utils.C35451j.m114508a(r2.getEnterpriseId()) != false) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89898a() {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r4.f92614a
            r1 = 0
            if (r0 == 0) goto L_0x0017
            com.ss.android.ugc.aweme.poi.model.PoiDetail r2 = r4.f92614a
            if (r2 != 0) goto L_0x000c
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x000c:
            java.lang.String r2 = r2.getEnterpriseId()
            boolean r2 = com.p280ss.android.ugc.aweme.poi.utils.C35451j.m114508a(r2)
            if (r2 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r0 = r1
        L_0x0018:
            android.content.Context r2 = r4.getContext()
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r3 = r4.f92618e
            if (r3 == 0) goto L_0x0024
            java.lang.String r1 = r3.getAwemeId()
        L_0x0024:
            com.p280ss.android.ugc.aweme.poi.utils.C35462r.m114555a(r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.component.PoiStructureInfoWidget.mo89898a():void");
    }

    /* renamed from: e */
    private final void m114036e() {
        ((LinearLayout) mo89897a((int) R.id.cdy)).setOnClickListener(new C35337g(this));
        ((ImageView) mo89897a((int) R.id.ce8)).setOnClickListener(new C35338h(this));
        ((ImageView) mo89897a((int) R.id.ce6)).setOnClickListener(new C35339i(this));
        ((RelativeLayout) mo89897a((int) R.id.ce0)).setOnClickListener(new C35340j(this));
        ((LinearLayout) mo89897a((int) R.id.cds)).setOnClickListener(new C35341k(this));
        ((LinearLayout) mo89897a((int) R.id.cer)).setOnClickListener(new C35342l(this));
        ((LinearLayout) mo89897a((int) R.id.cdn)).setOnClickListener(new C35343m(this));
        ((LinearLayout) mo89897a((int) R.id.cfi)).setOnClickListener(new C35344n(this));
        ((RelativeLayout) mo89897a((int) R.id.ch3)).setOnClickListener(new C35345o(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r1 == null) goto L_0x0014;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m114043l() {
        /*
            r10 = this;
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r10.f92614a
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.poi.model.PoiClassRankStruct r0 = r0.getPoiRankBundle()
            if (r0 == 0) goto L_0x0089
            com.ss.android.ugc.aweme.poi.model.feed.PoiOptionStruct r1 = r0.classOption
            if (r1 == 0) goto L_0x0014
            java.lang.String r1 = r1.getName()
            if (r1 != 0) goto L_0x0016
        L_0x0014:
            java.lang.String r1 = ""
        L_0x0016:
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r2 = r10.f92618e
            java.lang.String r3 = "leaderboard_bar_show"
            com.ss.android.ugc.aweme.app.g.d r4 = com.p280ss.android.ugc.aweme.app.p305g.C22984d.m75611a()
            java.lang.String r5 = "enter_from"
            java.lang.String r6 = "poi_page"
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "previous_page"
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r6 = r10.f92618e
            r7 = 0
            if (r6 == 0) goto L_0x0032
            java.lang.String r6 = r6.getPreviousPage()
            goto L_0x0033
        L_0x0032:
            r6 = r7
        L_0x0033:
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "rank_index"
            long r8 = r0.rankValue
            java.lang.String r6 = java.lang.String.valueOf(r8)
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "poi_channel"
            com.ss.android.ugc.aweme.poi.model.PoiDetail r6 = r10.f92614a
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.poi.model.PoiClassRankStruct r6 = r6.getPoiRankBundle()
            if (r6 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.poi.model.PoiBackendType r6 = r6.backendType
            if (r6 == 0) goto L_0x0058
            java.lang.String r6 = r6.getCode()
            goto L_0x0059
        L_0x0058:
            r6 = r7
        L_0x0059:
            com.ss.android.ugc.aweme.app.g.d r4 = r4.mo59973a(r5, r6)
            java.lang.String r5 = "sub_class"
            com.ss.android.ugc.aweme.app.g.d r1 = r4.mo59973a(r5, r1)
            java.lang.String r4 = "city_info"
            java.lang.String r5 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107204a()
            com.ss.android.ugc.aweme.app.g.d r1 = r1.mo59973a(r4, r5)
            java.lang.String r4 = "district_code"
            java.lang.String r0 = r0.districtCode
            com.ss.android.ugc.aweme.app.g.d r0 = r1.mo59973a(r4, r0)
            java.lang.String r1 = "poi_id"
            com.ss.android.ugc.aweme.poi.model.PoiDetail r4 = r10.f92614a
            if (r4 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r4.poiStruct
            if (r4 == 0) goto L_0x0081
            java.lang.String r7 = r4.poiId
        L_0x0081:
            com.ss.android.ugc.aweme.app.g.d r0 = r0.mo59973a(r1, r7)
            com.p280ss.android.ugc.aweme.poi.utils.C35454m.m114523a(r2, r3, r0)
            return
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.component.PoiStructureInfoWidget.m114043l():void");
    }

    /* renamed from: n */
    private final void m114045n() {
        boolean z;
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            boolean z2 = true;
            if (!(!m114044m())) {
                poiDetail = null;
            }
            if (poiDetail != null) {
                if (!TextUtils.isEmpty(poiDetail.getBookUrl())) {
                    CompoundDrawableAndTextLayout compoundDrawableAndTextLayout = (CompoundDrawableAndTextLayout) mo89897a((int) R.id.cet);
                    C7573i.m23582a((Object) compoundDrawableAndTextLayout, "poi_detail_reserve");
                    compoundDrawableAndTextLayout.setVisibility(0);
                    ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.cet)).setTextRes(R.string.d0d);
                    ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.cet)).setOnClickListener(new C35335e(this));
                    C35007b.m113003a("show", "reserve", "poi_page", "poi_page", this.f92618e);
                    z = true;
                } else {
                    z = false;
                }
                if (!TextUtils.isEmpty(poiDetail.getQueueUrl())) {
                    CompoundDrawableAndTextLayout compoundDrawableAndTextLayout2 = (CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceo);
                    C7573i.m23582a((Object) compoundDrawableAndTextLayout2, "poi_detail_queue");
                    compoundDrawableAndTextLayout2.setVisibility(0);
                    ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceo)).setTextRes(R.string.czo);
                    ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceo)).setOnClickListener(new C35336f(this));
                    if (z) {
                        View a = mo89897a((int) R.id.cep);
                        C7573i.m23582a((Object) a, "poi_detail_queue_divider");
                        a.setVisibility(0);
                    }
                    C35007b.m113003a("show", "queue", "poi_page", "poi_page", this.f92618e);
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    LinearLayout linearLayout = (LinearLayout) mo89897a((int) R.id.ceu);
                    C7573i.m23582a((Object) linearLayout, "poi_detail_reserve_and_queue");
                    linearLayout.setVisibility(0);
                    View a2 = mo89897a((int) R.id.cev);
                    C7573i.m23582a((Object) a2, "poi_detail_reserve_and_queue_divider");
                    a2.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.String, java.util.List]
      uses: [java.util.List, ?[OBJECT, ARRAY]]
      mth insns count: 65
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m114047p() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.poi.model.PoiDetail r0 = r7.f92614a
            r1 = 0
            if (r0 == 0) goto L_0x000a
            com.ss.android.ugc.aweme.poi.model.PoiActivityInfo r0 = r0.getPoiActivityInfo()
            goto L_0x000b
        L_0x000a:
            r0 = r1
        L_0x000b:
            r2 = 2131822237(0x7f11069d, float:1.927724E38)
            if (r0 != 0) goto L_0x002c
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r0 = r7.f92618e
            if (r0 == 0) goto L_0x0018
            java.lang.String r1 = r0.getActivityId()
        L_0x0018:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x002b
            android.content.Context r0 = r7.getContext()
            com.bytedance.ies.dmt.ui.c.a r0 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r0, r2)
            r0.mo25750a()
        L_0x002b:
            return
        L_0x002c:
            com.ss.android.ugc.aweme.poi.model.PoiDetail r3 = r7.f92614a
            if (r3 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.poi.model.PoiExtension r3 = r3.poiExtension
            if (r3 == 0) goto L_0x003b
            int r3 = r3.source
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x003d
        L_0x003b:
            java.lang.String r3 = ""
        L_0x003d:
            java.lang.String r3 = r3.toString()
            r4 = 2131300492(0x7f09108c, float:1.8219015E38)
            android.view.View r4 = r7.mo89897a(r4)
            com.ss.android.ugc.aweme.poi.ui.coupon.PoiAdLayout r4 = (com.p280ss.android.ugc.aweme.poi.p335ui.coupon.PoiAdLayout) r4
            com.ss.android.ugc.aweme.poi.model.AdCard r5 = r0.getAdCard()
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r6 = r7.f92618e
            r4.mo89841a(r5, r3, r6)
            com.ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo r3 = r0.getCouponInfo()
            if (r3 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r3 = r7.f92618e
            if (r3 == 0) goto L_0x0062
            java.lang.String r3 = r3.getActivityId()
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            boolean r3 = com.p280ss.android.ugc.aweme.poi.utils.C35451j.m114508a(r3)
            if (r3 == 0) goto L_0x009a
            com.ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo r3 = r0.getCouponInfo()
            java.lang.String r4 = "poiActivityInfo.couponInfo"
            kotlin.jvm.internal.C7573i.m23582a(r3, r4)
            int r3 = r3.getActivityId()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r4 = r7.f92618e
            if (r4 != 0) goto L_0x0083
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0083:
            java.lang.String r4 = r4.getActivityId()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x009a
            android.content.Context r3 = r7.getContext()
            com.bytedance.ies.dmt.ui.c.a r2 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r3, r2)
            r2.mo25750a()
        L_0x009a:
            r2 = 2131300519(0x7f0910a7, float:1.821907E38)
            android.view.View r2 = r7.mo89897a(r2)
            com.ss.android.ugc.aweme.poi.ui.coupon.PoiCouponLayout r2 = (com.p280ss.android.ugc.aweme.poi.p335ui.coupon.PoiCouponLayout) r2
            com.ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo r0 = r0.getCouponInfo()
            com.ss.android.ugc.aweme.poi.ui.coupon.e r3 = r7.f92625l
            com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r7.f92619f
            if (r4 == 0) goto L_0x00b1
            java.util.List r1 = r4.getVoucherReleaseAreas()
        L_0x00b1:
            com.ss.android.ugc.aweme.poi.PoiSimpleBundle r4 = r7.f92618e
            r2.mo89844a(r0, r3, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.p335ui.detail.component.PoiStructureInfoWidget.m114047p():void");
    }

    /* renamed from: b */
    public final void mo89901b() {
        String str;
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            Context context = getContext();
            IAwemeService iAwemeService = (IAwemeService) ServiceManager.get().getService(IAwemeService.class);
            PoiSimpleBundle poiSimpleBundle = this.f92618e;
            String str2 = null;
            if (poiSimpleBundle != null) {
                str = poiSimpleBundle.getAwemeId();
            } else {
                str = null;
            }
            Aweme rawAdAwemeById = iAwemeService.getRawAdAwemeById(str);
            String str3 = "reserve";
            PoiSimpleBundle poiSimpleBundle2 = this.f92618e;
            if (poiSimpleBundle2 != null) {
                str2 = poiSimpleBundle2.getPoiId();
            }
            C35444d.m114487a(context, rawAdAwemeById, str3, str2);
            C35409r.f92878a = "poi_page";
            C35007b.m113003a("click", "reserve", "poi_page", "poi_page", this.f92618e);
            IAccountUserService f = C6861a.m21337f();
            C7573i.m23582a((Object) f, "AccountProxyService.userService()");
            if (!f.isLogin()) {
                Context context2 = getContext();
                if (context2 != null) {
                    C32656f.m105745a((Activity) context2, "poi_page", "click_poi_puscene_reserve", (C23305g) new C35348r(poiDetail, this));
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
            }
            Context context3 = getContext();
            String bookUrl = poiDetail.getBookUrl();
            C7573i.m23582a((Object) bookUrl, "bookUrl");
            Context context4 = getContext();
            C7573i.m23582a((Object) context4, "context");
            String string = context4.getResources().getString(R.string.d0d);
            C7573i.m23582a((Object) string, "context.resources.getString(R.string.poi_reserve)");
            C35045e.m113153a(context3, bookUrl, string);
        }
    }

    /* renamed from: h */
    private final void m114039h() {
        boolean z;
        List list;
        ((PoiHeaderLayout) mo89897a((int) R.id.cf6)).mo90215a(this.f92614a);
        ImageView imageView = (ImageView) mo89897a((int) R.id.ce6);
        C7573i.m23582a((Object) imageView, "poi_detail_loc_navi");
        imageView.setVisibility(8);
        View a = mo89897a((int) R.id.ce7);
        C7573i.m23582a((Object) a, "poi_detail_loc_navi_divider");
        a.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo89897a((int) R.id.cdy);
        C7573i.m23582a((Object) linearLayout, "poi_detail_loc_addr_layout");
        if (linearLayout.getVisibility() == 8) {
            z = true;
        } else {
            z = false;
        }
        m114038g();
        m114042k();
        m114048q();
        m114045n();
        m114046o();
        boolean i = m114040i();
        m114047p();
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            list = poiDetail.getActs();
        } else {
            list = null;
        }
        if (!C6307b.m19566a((Collection<T>) list)) {
            LinearLayout linearLayout2 = (LinearLayout) mo89897a((int) R.id.cdn);
            C7573i.m23582a((Object) linearLayout2, "poi_detail_act_layout");
            linearLayout2.setVisibility(0);
            ((PoiActsFlipperView) mo89897a((int) R.id.cdm)).mo90207a(list, this.f92618e);
            if (z) {
                ((LinearLayout) mo89897a((int) R.id.cdn)).setPadding(0, (int) C9738o.m28708b(getContext(), 7.0f), 0, 0);
            }
            z = false;
        }
        boolean j = m114041j();
        if (z) {
            z = !j;
        }
        if (z) {
            View a2 = mo89897a((int) R.id.cdx);
            C7573i.m23582a((Object) a2, "poi_detail_loc_addr_divider");
            a2.setVisibility(8);
        }
        if (i) {
            LinearLayout linearLayout3 = (LinearLayout) mo89897a((int) R.id.ce_);
            C7573i.m23582a((Object) linearLayout3, "poi_detail_loc_phone_layout");
            linearLayout3.setVisibility(0);
        }
        DmtTextView dmtTextView = (DmtTextView) mo89897a((int) R.id.ces);
        C7573i.m23582a((Object) dmtTextView, "poi_detail_rank_more");
        dmtTextView.setVisibility(0);
        DmtTextView dmtTextView2 = (DmtTextView) mo89897a((int) R.id.cdo);
        C7573i.m23582a((Object) dmtTextView2, "poi_detail_act_more");
        dmtTextView2.setVisibility(0);
        DmtTextView dmtTextView3 = (DmtTextView) mo89897a((int) R.id.cfj);
        C7573i.m23582a((Object) dmtTextView3, "poi_merchant_act_more");
        dmtTextView3.setVisibility(0);
    }

    /* renamed from: o */
    private final void m114046o() {
        PoiDetail poiDetail = this.f92614a;
        if (poiDetail != null) {
            if (!m114044m()) {
                poiDetail = null;
            }
            if (poiDetail != null) {
                ArrayList arrayList = new ArrayList();
                if (C35451j.m114508a(poiDetail.getBookUrl())) {
                    C35007b.m113003a("show", "reserve", "poi_page", "poi_page", this.f92618e);
                    Context context = getContext();
                    C7573i.m23582a((Object) context, "context");
                    String string = context.getResources().getString(R.string.d0d);
                    C7573i.m23582a((Object) string, "context.resources.getString(R.string.poi_reserve)");
                    arrayList.add(new C35488e(string, R.drawable.ay6, true, new C35331a(this)));
                }
                if (C35451j.m114508a(poiDetail.getQueueUrl())) {
                    C35007b.m113003a("show", "queue", "poi_page", "poi_page", this.f92618e);
                    Context context2 = getContext();
                    C7573i.m23582a((Object) context2, "context");
                    String string2 = context2.getResources().getString(R.string.czo);
                    C7573i.m23582a((Object) string2, "context.resources.getString(R.string.poi_queue)");
                    arrayList.add(new C35488e(string2, R.drawable.ay4, true, new C35332b(this)));
                }
                if (C35451j.m114508a(poiDetail.getPhone())) {
                    Context context3 = getContext();
                    C7573i.m23582a((Object) context3, "context");
                    String string3 = context3.getResources().getString(R.string.cxw);
                    C7573i.m23582a((Object) string3, "context.resources.getStr…ing.poi_contact_merchant)");
                    arrayList.add(new C35488e(string3, R.drawable.axs, false, new C35333c(poiDetail, this)));
                    C35007b.m113003a("show", "contacts", "poi_page", "poi_page", this.f92618e);
                }
                Context context4 = getContext();
                C7573i.m23582a((Object) context4, "context");
                String string4 = context4.getResources().getString(R.string.cz8);
                C7573i.m23582a((Object) string4, "context.resources.getStr…ng.poi_merchant_homepage)");
                arrayList.add(new C35488e(string4, R.drawable.axx, true, new C35334d(this)));
                C35007b.m113003a("show", "merchants", "poi_page", "poi_page", this.f92618e);
                if (arrayList.size() > 2) {
                    ((HorizontalBusinessComponentLayout) mo89897a((int) R.id.cdp)).mo90204a(arrayList);
                    View a = mo89897a((int) R.id.cev);
                    C7573i.m23582a((Object) a, "poi_detail_reserve_and_queue_divider");
                    a.setVisibility(0);
                } else {
                    Iterator it = arrayList.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        C35488e eVar = (C35488e) it.next();
                        if (i == 0) {
                            CompoundDrawableAndTextLayout compoundDrawableAndTextLayout = (CompoundDrawableAndTextLayout) mo89897a((int) R.id.cet);
                            C7573i.m23582a((Object) compoundDrawableAndTextLayout, "poi_detail_reserve");
                            compoundDrawableAndTextLayout.setVisibility(0);
                            ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.cet)).setText(eVar.f93124a);
                            ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.cet)).setImageResource(eVar.f93125b);
                            ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.cet)).setOnClickListener(eVar.f93127d);
                        } else {
                            CompoundDrawableAndTextLayout compoundDrawableAndTextLayout2 = (CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceo);
                            C7573i.m23582a((Object) compoundDrawableAndTextLayout2, "poi_detail_queue");
                            compoundDrawableAndTextLayout2.setVisibility(0);
                            ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceo)).setText(eVar.f93124a);
                            ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceo)).setImageResource(eVar.f93125b);
                            ((CompoundDrawableAndTextLayout) mo89897a((int) R.id.ceo)).setOnClickListener(eVar.f93127d);
                            View a2 = mo89897a((int) R.id.cep);
                            C7573i.m23582a((Object) a2, "poi_detail_queue_divider");
                            a2.setVisibility(0);
                        }
                        i++;
                    }
                    if (i != 1 || ((C35488e) arrayList.get(0)).f93126c) {
                        if (i > 0) {
                            LinearLayout linearLayout = (LinearLayout) mo89897a((int) R.id.ceu);
                            C7573i.m23582a((Object) linearLayout, "poi_detail_reserve_and_queue");
                            linearLayout.setVisibility(0);
                            View a3 = mo89897a((int) R.id.cev);
                            C7573i.m23582a((Object) a3, "poi_detail_reserve_and_queue_divider");
                            a3.setVisibility(0);
                        }
                        if (arrayList.size() == 1) {
                            View a4 = mo89897a((int) R.id.cdx);
                            C7573i.m23582a((Object) a4, "poi_detail_loc_addr_divider");
                            a4.setVisibility(8);
                            LinearLayout linearLayout2 = (LinearLayout) mo89897a((int) R.id.ceu);
                            C7573i.m23582a((Object) linearLayout2, "poi_detail_reserve_and_queue");
                            LayoutParams layoutParams = linearLayout2.getLayoutParams();
                            if (layoutParams != null) {
                                ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) C9738o.m28708b(getContext(), 15.0f);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private final void m114035a(PoiDetail poiDetail) {
        PoiStruct poiStruct;
        String str;
        this.f92614a = poiDetail;
        String str2 = null;
        if (poiDetail != null) {
            poiStruct = poiDetail.poiStruct;
        } else {
            poiStruct = null;
        }
        this.f92619f = poiStruct;
        LinearLayout linearLayout = (LinearLayout) mo89897a((int) R.id.cdy);
        C7573i.m23582a((Object) linearLayout, "poi_detail_loc_addr_layout");
        linearLayout.setVisibility(8);
        PoiStruct poiStruct2 = this.f92619f;
        if (poiStruct2 != null) {
            PoiSimpleBundle poiSimpleBundle = this.f92618e;
            if (poiSimpleBundle != null) {
                poiSimpleBundle.setPoiId(poiStruct2.poiId);
                poiSimpleBundle.setPoiType(poiStruct2.getTypeCode());
                poiSimpleBundle.setBackendType(poiStruct2.getBackendTypeCode());
                poiSimpleBundle.setPoiCity(poiStruct2.getCityCode());
            }
            if (poiDetail != null) {
                str = poiDetail.getAddress();
            } else {
                str = null;
            }
            if (C35451j.m114508a(str)) {
                LinearLayout linearLayout2 = (LinearLayout) mo89897a((int) R.id.cdy);
                C7573i.m23582a((Object) linearLayout2, "poi_detail_loc_addr_layout");
                linearLayout2.setVisibility(0);
                CompoundDrawableAndTextLayout compoundDrawableAndTextLayout = (CompoundDrawableAndTextLayout) mo89897a((int) R.id.cdv);
                C7573i.m23582a((Object) compoundDrawableAndTextLayout, "poi_detail_loc_addr");
                compoundDrawableAndTextLayout.setVisibility(0);
                CompoundDrawableAndTextLayout compoundDrawableAndTextLayout2 = (CompoundDrawableAndTextLayout) mo89897a((int) R.id.cdv);
                if (poiDetail != null) {
                    str2 = poiDetail.getAddress();
                }
                compoundDrawableAndTextLayout2.setText(str2);
                if (C35451j.m114508a(poiStruct2.getPoiLatitude()) && C35451j.m114508a(poiStruct2.getPoiLongitude())) {
                    try {
                        getLocation();
                        this.f92620g = Double.parseDouble(poiStruct2.getPoiLatitude());
                        this.f92621h = Double.parseDouble(poiStruct2.getPoiLongitude());
                        double[] a = C35442b.m114469a(this.f92620g, this.f92621h);
                        this.f92620g = a[0];
                        this.f92621h = a[1];
                    } catch (Exception e) {
                        C6921a.m21554a(e);
                    }
                }
            }
            m114039h();
        }
        if (m114049r()) {
            RelativeLayout relativeLayout = (RelativeLayout) mo89897a((int) R.id.ch3);
            C7573i.m23582a((Object) relativeLayout, "poi_service_container");
            relativeLayout.setVisibility(8);
            View a2 = mo89897a((int) R.id.ch4);
            C7573i.m23582a((Object) a2, "poi_service_divider");
            a2.setVisibility(8);
            return;
        }
        RelativeLayout relativeLayout2 = (RelativeLayout) mo89897a((int) R.id.ch3);
        C7573i.m23582a((Object) relativeLayout2, "poi_service_container");
        relativeLayout2.setVisibility(0);
        View a3 = mo89897a((int) R.id.ch4);
        C7573i.m23582a((Object) a3, "poi_service_divider");
        a3.setVisibility(0);
        m114050s();
        m114051t();
    }

    /* renamed from: a */
    public final void mo89900a(PoiDetail poiDetail, PoiSimpleBundle poiSimpleBundle) {
        C7573i.m23587b(poiDetail, "data");
        this.f92618e = poiSimpleBundle;
        m114035a(poiDetail);
    }

    /* renamed from: a */
    public final void mo89899a(C35025a aVar, C35308e eVar) {
        C7573i.m23587b(aVar, "iCollectionInfoGetter");
        C7573i.m23587b(eVar, "joinCouponCallback");
        this.f92616c = aVar;
        this.f92615b = new C35392m();
        this.f92625l = eVar;
        PoiHeaderLayout poiHeaderLayout = (PoiHeaderLayout) mo89897a((int) R.id.cf6);
        Fragment H = eVar.mo89718H();
        if (H != null) {
            poiHeaderLayout.mo90214a((AbsFragment) H, aVar, this.f92615b, null);
            m114036e();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.bytedance.ies.uikit.base.AbsFragment");
    }

    public PoiStructureInfoWidget(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.vp, this);
    }

    public /* synthetic */ PoiStructureInfoWidget(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
