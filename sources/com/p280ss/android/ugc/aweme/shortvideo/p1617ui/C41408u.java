package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32616a.C32617a;
import com.p280ss.android.ugc.aweme.metrics.C33256b;
import com.p280ss.android.ugc.aweme.poi.IPOIService;
import com.p280ss.android.ugc.aweme.poi.IPOIService.C35002b;
import com.p280ss.android.ugc.aweme.poi.IPOIService.ResultType;
import com.p280ss.android.ugc.aweme.poi.model.C35127p;
import com.p280ss.android.ugc.aweme.poi.model.PoiCouponActivityStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.C35405c;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.C35406d;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.PoiContext;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.SpeedRecommendPoiAdapter.C35397a;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.SpeedRecommendPoiView;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.poi.utils.C35454m;
import com.p280ss.android.ugc.aweme.poi.utils.C35469y;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionMisc;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.Callback;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension.DefaultImpls;
import com.p280ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PublishOutput;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.LocationSettingItem.C41144a;
import com.p280ss.android.ugc.aweme.utils.C43014ci;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.p280ss.android.ugc.aweme.views.mention.MentionEditText;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u */
public final class C41408u implements C35397a, C35405c, IAVPublishExtension<PoiPublishModel> {

    /* renamed from: i */
    public static final C41409a f107731i = new C41409a(null);

    /* renamed from: a */
    public ExtensionDataRepo f107732a;

    /* renamed from: b */
    public ExtensionMisc f107733b;

    /* renamed from: c */
    public LocationSettingItem f107734c;

    /* renamed from: d */
    public LinearLayout f107735d;

    /* renamed from: e */
    public String f107736e;

    /* renamed from: f */
    public String f107737f;

    /* renamed from: g */
    public PoiContext f107738g;

    /* renamed from: h */
    public String f107739h;

    /* renamed from: j */
    private boolean f107740j;

    /* renamed from: k */
    private boolean f107741k;

    /* renamed from: l */
    private boolean f107742l;

    /* renamed from: m */
    private C35406d f107743m;

    /* renamed from: n */
    private MentionEditText f107744n;

    /* renamed from: o */
    private String f107745o;

    /* renamed from: p */
    private C41410b f107746p;

    /* renamed from: q */
    private SpeedRecommendPoiView f107747q;

    /* renamed from: r */
    private DefaultSelectStickerPoi f107748r;

    /* renamed from: s */
    private Context f107749s;

    /* renamed from: t */
    private Fragment f107750t;

    /* renamed from: u */
    private String f107751u;

    /* renamed from: v */
    private List<C35127p> f107752v;

    /* renamed from: w */
    private AVPublishContentType f107753w;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$a */
    public static final class C41409a {
        private C41409a() {
        }

        public /* synthetic */ C41409a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$b */
    public interface C41410b {
        /* renamed from: a */
        void mo102043a();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$c */
    static final class C41411c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41408u f107754a;

        /* renamed from: b */
        final /* synthetic */ PoiStruct f107755b;

        C41411c(C41408u uVar, PoiStruct poiStruct) {
            this.f107754a = uVar;
            this.f107755b = poiStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f107754a.mo102030a((PoiStruct) null);
            C41408u.m132022b(this.f107755b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$d */
    static final class C41412d implements C35002b {

        /* renamed from: a */
        final /* synthetic */ C41408u f107756a;

        C41412d(C41408u uVar) {
            this.f107756a = uVar;
        }

        /* renamed from: a */
        public final void mo88688a(ResultType resultType, PoiStruct poiStruct, String str) {
            String str2;
            String str3;
            String a = C35469y.m114572a(poiStruct, POIService.KEY_KEYWORD);
            if (TextUtils.isEmpty(a)) {
                str2 = "default_search_poi";
            } else {
                str2 = "search_poi";
            }
            String str4 = str2;
            String str5 = POIService.INVALID_ID;
            PoiStruct poiStruct2 = null;
            if (poiStruct != null) {
                str3 = poiStruct.getPoiId();
            } else {
                str3 = null;
            }
            if (!C7634n.m23717a(str5, str3, true)) {
                poiStruct2 = poiStruct;
            }
            this.f107756a.mo102030a(poiStruct2);
            if (poiStruct2 != null) {
                String a2 = C35469y.m114572a(poiStruct, POIService.KEY_ORDER);
                C41408u uVar = this.f107756a;
                C7573i.m23582a((Object) a, POIService.KEY_KEYWORD);
                if (TextUtils.isEmpty(a2)) {
                    a2 = "-1";
                }
                String str6 = a2;
                C7573i.m23582a((Object) str6, "if (TextUtils.isEmpty(order)) \"-1\" else order");
                String a3 = C35469y.m114572a(poiStruct, POIService.KEY_LOGPB);
                C7573i.m23582a((Object) a3, "PoiUtils.getValueFromPoi…ct, POIService.KEY_LOGPB)");
                C7573i.m23582a((Object) str, "searchRegionType");
                if (poiStruct == null) {
                    C7573i.m23580a();
                }
                C7573i.m23582a((Object) poiStruct, "poiStruct!!");
                uVar.mo102032a(str4, a, str6, a3, str, poiStruct);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$e */
    public static final class C41413e implements C41410b {

        /* renamed from: a */
        final /* synthetic */ Callback f107757a;

        /* renamed from: a */
        public final void mo102043a() {
            this.f107757a.onContentModified();
        }

        C41413e(Callback callback) {
            this.f107757a = callback;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$f */
    static final class C41414f implements C41144a {

        /* renamed from: a */
        final /* synthetic */ C41408u f107758a;

        C41414f(C41408u uVar) {
            this.f107758a = uVar;
        }

        /* renamed from: a */
        public final void mo101633a(boolean z) {
            C41408u.m132017a(this.f107758a).getGoodsState().setValue(Boolean.valueOf(!z));
            C41408u.m132017a(this.f107758a).getAnchorState().setValue(Boolean.valueOf(!z));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$g */
    static final class C41415g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41408u f107759a;

        /* renamed from: b */
        final /* synthetic */ ExtensionMisc f107760b;

        /* renamed from: c */
        final /* synthetic */ Fragment f107761c;

        C41415g(C41408u uVar, ExtensionMisc extensionMisc, Fragment fragment) {
            this.f107759a = uVar;
            this.f107760b = extensionMisc;
            this.f107761c = fragment;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ClickInstrumentation.onClick(view);
            if (!this.f107759a.mo102035c().f107118j) {
                String str3 = null;
                if (C7573i.m23585a((Object) (Boolean) this.f107760b.getExtensionDataRepo().isGoodsAdd().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context = this.f107761c.getContext();
                    Context context2 = this.f107761c.getContext();
                    if (context2 != null) {
                        str2 = context2.getString(R.string.a_d);
                    } else {
                        str2 = null;
                    }
                    C9738o.m28697a(context, str2);
                }
                if (C7573i.m23585a((Object) (Boolean) this.f107760b.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107760b.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107760b.getExtensionDataRepo().getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true)) || C7573i.m23585a((Object) (Boolean) this.f107760b.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                    Context context3 = this.f107761c.getContext();
                    Context context4 = this.f107761c.getContext();
                    if (context4 != null) {
                        str3 = context4.getString(R.string.e0d);
                    }
                    C10761a.m31403c(context3, str3).mo25750a();
                    return;
                }
                if (this.f107760b.getExtensionDataRepo().getUpdateAnchor().getValue() != null) {
                    C10761a.m31403c(this.f107759a.mo102035c().getContext(), this.f107759a.mo102035c().getContext().getString(R.string.aio, new Object[]{this.f107759a.mo102035c().getContext().getString(R.string.akq)})).mo25750a();
                }
                return;
            }
            if (!this.f107759a.mo102038g() && !this.f107759a.mo102039h()) {
                if (C6399b.m19944t()) {
                    this.f107759a.mo102041j();
                } else {
                    this.f107759a.mo102037f();
                }
                if (C41408u.m132024d()) {
                    str = "1";
                } else {
                    str = "0";
                }
                new C33256b().mo85242a("video_post_page").mo85243b(str).mo85244c(this.f107759a.f107739h).mo85252e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$h */
    static final class C41416h<T> implements C0053p<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41408u f107762a;

        C41416h(C41408u uVar) {
            this.f107762a = uVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(Boolean bool) {
            if (bool != null) {
                C41408u uVar = this.f107762a;
                C7573i.m23582a((Object) bool, "it");
                uVar.mo102033a(bool.booleanValue());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$i */
    static final class C41417i extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ C41408u f107763a;

        C41417i(C41408u uVar) {
            this.f107763a = uVar;
            super(0);
        }

        /* renamed from: a */
        private void m132051a() {
            this.f107763a.mo102036e();
        }

        public final /* synthetic */ Object invoke() {
            m132051a();
            return C7581n.f20898a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$j */
    static final class C41418j extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C41408u f107764a;

        C41418j(C41408u uVar) {
            this.f107764a = uVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m132052a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m132052a(String str) {
            this.f107764a.mo102031a(PoiContext.unserializeFromJson(str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$k */
    public static final class C41419k implements PoiPublishModel {

        /* renamed from: a */
        final /* synthetic */ C41408u f107765a;

        public final String getLatitude() {
            return this.f107765a.f107736e;
        }

        public final String getLongitude() {
            return this.f107765a.f107737f;
        }

        public final Map<String, String> getMobParams() {
            return this.f107765a.mo102029a();
        }

        public final String getPoiContext() {
            return this.f107765a.mo102040i();
        }

        public final HashMap<String, String> getServerMobParams() {
            return this.f107765a.mo102034b();
        }

        C41419k(C41408u uVar) {
            this.f107765a = uVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$l */
    static final class C41420l implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C41408u f107766a;

        C41420l(C41408u uVar) {
            this.f107766a = uVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f107766a.mo102042k();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$m */
    static final class C41421m implements DialogInterface.OnClickListener {

        /* renamed from: a */
        public static final C41421m f107767a = new C41421m();

        C41421m() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.u$n */
    public static final class C41422n implements C43154a {

        /* renamed from: a */
        final /* synthetic */ C41408u f107768a;

        /* renamed from: b */
        public final void mo71376b() {
        }

        /* renamed from: a */
        public final void mo71375a() {
            this.f107768a.mo102037f();
        }

        C41422n(C41408u uVar) {
            this.f107768a = uVar;
        }
    }

    public final String getName() {
        return "PoiPublishExtension";
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    public final void onBackPressed(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onDestroy() {
    }

    public final void onPublish(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    public final void onResume() {
        DefaultImpls.onResume(this);
    }

    public final void onSaveDraft(PublishOutput publishOutput) {
        C7573i.m23587b(publishOutput, "publishOutput");
    }

    /* renamed from: a */
    public final void mo102033a(boolean z) {
        if (z) {
            LocationSettingItem locationSettingItem = this.f107734c;
            if (locationSettingItem == null) {
                C7573i.m23583a("locationSettingItem");
            }
            locationSettingItem.setAlpha(1.0f);
            List<C35127p> list = this.f107752v;
            if (list != null && (!list.isEmpty()) && m132026m()) {
                LinearLayout linearLayout = this.f107735d;
                if (linearLayout == null) {
                    C7573i.m23583a("mPoiContainer");
                }
                linearLayout.setVisibility(0);
            }
            LocationSettingItem locationSettingItem2 = this.f107734c;
            if (locationSettingItem2 == null) {
                C7573i.m23583a("locationSettingItem");
            }
            locationSettingItem2.setEnable(true);
            return;
        }
        LocationSettingItem locationSettingItem3 = this.f107734c;
        if (locationSettingItem3 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem3.setAlpha(0.5f);
        LocationSettingItem locationSettingItem4 = this.f107734c;
        if (locationSettingItem4 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem4.setDrawableRight((int) R.drawable.b20);
        LocationSettingItem locationSettingItem5 = this.f107734c;
        if (locationSettingItem5 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem5.mo101627b();
        LinearLayout linearLayout2 = this.f107735d;
        if (linearLayout2 == null) {
            C7573i.m23583a("mPoiContainer");
        }
        linearLayout2.setVisibility(8);
        LocationSettingItem locationSettingItem6 = this.f107734c;
        if (locationSettingItem6 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem6.setEnable(false);
    }

    /* renamed from: a */
    public final void mo102032a(String str, String str2, String str3, String str4, String str5, PoiStruct poiStruct) {
        this.f107745o = str;
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", "edit_page").mo59973a("poi_type", String.valueOf(poiStruct.iconType)).mo59973a("poi_id", poiStruct.poiId).mo59973a("enter_method", str).mo59973a("content_type", this.f107739h).mo59973a("log_pb", str4).mo59973a(POIService.KEY_ORDER, str3).mo59973a("key_word", str2).mo59973a("is_media_location", poiStruct.isCandidate()).mo59973a("distance_info", poiStruct.getDistance()).mo59973a("search_region_type", str5);
        C35452k.m114513a(poiStruct, "choose_poi", a);
    }

    /* renamed from: a */
    public final void mo102031a(PoiContext poiContext) {
        if (m132026m()) {
            this.f107738g = poiContext;
            if (poiContext != null && !TextUtils.isEmpty(poiContext.mShootPoiId)) {
                if (!TextUtils.isEmpty(poiContext.mPoiRatePrompt)) {
                    MentionEditText mentionEditText = this.f107744n;
                    if (mentionEditText == null) {
                        C7573i.m23583a("mMentionEditText");
                    }
                    mentionEditText.setHint(poiContext.mPoiRatePrompt);
                } else {
                    MentionEditText mentionEditText2 = this.f107744n;
                    if (mentionEditText2 == null) {
                        C7573i.m23583a("mMentionEditText");
                    }
                    mentionEditText2.setHint(R.string.cvb);
                }
            }
            if (mo102038g()) {
                ExtensionDataRepo extensionDataRepo = this.f107732a;
                if (extensionDataRepo == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo.getLocationActivityVisible().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo2 = this.f107732a;
                if (extensionDataRepo2 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo2.getSetPoiActivity().invoke(mo102040i());
                ExtensionDataRepo extensionDataRepo3 = this.f107732a;
                if (extensionDataRepo3 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo3.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo4 = this.f107732a;
                if (extensionDataRepo4 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo4.getStarAtlasState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo5 = this.f107732a;
                if (extensionDataRepo5 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo5.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo6 = this.f107732a;
                if (extensionDataRepo6 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo6.getAnchorState().setValue(Boolean.valueOf(false));
            } else if (mo102039h()) {
                LocationSettingItem locationSettingItem = this.f107734c;
                if (locationSettingItem == null) {
                    C7573i.m23583a("locationSettingItem");
                }
                locationSettingItem.setVisibility(0);
                PoiStruct poiStruct = new PoiStruct();
                poiStruct.poiId = poiContext != null ? poiContext.mShootPoiId : null;
                poiStruct.poiName = poiContext != null ? poiContext.mShootPoiName : null;
                mo102030a(poiStruct);
                ExtensionDataRepo extensionDataRepo7 = this.f107732a;
                if (extensionDataRepo7 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo7.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo8 = this.f107732a;
                if (extensionDataRepo8 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo8.getStarAtlasState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo9 = this.f107732a;
                if (extensionDataRepo9 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo9.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo10 = this.f107732a;
                if (extensionDataRepo10 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo10.getAnchorState().setValue(Boolean.valueOf(false));
                LocationSettingItem locationSettingItem2 = this.f107734c;
                if (locationSettingItem2 == null) {
                    C7573i.m23583a("locationSettingItem");
                }
                locationSettingItem2.setDrawableRight((Drawable) null);
                LocationSettingItem locationSettingItem3 = this.f107734c;
                if (locationSettingItem3 == null) {
                    C7573i.m23583a("locationSettingItem");
                }
                locationSettingItem3.mo101627b();
            } else {
                if (poiContext != null && (!TextUtils.isEmpty(poiContext.mSelectPoiId) || !TextUtils.isEmpty(poiContext.mShootPoiId))) {
                    LocationSettingItem locationSettingItem4 = this.f107734c;
                    if (locationSettingItem4 == null) {
                        C7573i.m23583a("locationSettingItem");
                    }
                    locationSettingItem4.setVisibility(0);
                    PoiStruct poiStruct2 = new PoiStruct();
                    if (!TextUtils.isEmpty(poiContext.mSelectPoiId)) {
                        poiStruct2.poiId = poiContext.mSelectPoiId;
                        poiStruct2.poiName = poiContext.mSelectPoiName;
                    } else if (!TextUtils.isEmpty(poiContext.mShootPoiId)) {
                        poiStruct2.poiId = poiContext.mShootPoiId;
                        poiStruct2.poiName = poiContext.mShootPoiName;
                    }
                    mo102030a(poiStruct2);
                    ExtensionDataRepo extensionDataRepo11 = this.f107732a;
                    if (extensionDataRepo11 == null) {
                        C7573i.m23583a("extensionDataRepo");
                    }
                    extensionDataRepo11.getResetGoodsAction().invoke();
                    ExtensionDataRepo extensionDataRepo12 = this.f107732a;
                    if (extensionDataRepo12 == null) {
                        C7573i.m23583a("extensionDataRepo");
                    }
                    extensionDataRepo12.getGoodsState().setValue(Boolean.valueOf(false));
                }
                ExtensionDataRepo extensionDataRepo13 = this.f107732a;
                if (extensionDataRepo13 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                if (!C7573i.m23585a((Object) (Boolean) extensionDataRepo13.getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                    ExtensionDataRepo extensionDataRepo14 = this.f107732a;
                    if (extensionDataRepo14 == null) {
                        C7573i.m23583a("extensionDataRepo");
                    }
                    if (!C7573i.m23585a((Object) (Boolean) extensionDataRepo14.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true))) {
                        ExtensionDataRepo extensionDataRepo15 = this.f107732a;
                        if (extensionDataRepo15 == null) {
                            C7573i.m23583a("extensionDataRepo");
                        }
                        if (!C7573i.m23585a((Object) (Boolean) extensionDataRepo15.getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                            m132028o();
                        }
                    }
                }
            }
        } else if (m132027n() && poiContext != null) {
            ExtensionDataRepo extensionDataRepo16 = this.f107732a;
            if (extensionDataRepo16 == null) {
                C7573i.m23583a("extensionDataRepo");
            }
            C0052o updateAnchor = extensionDataRepo16.getUpdateAnchor();
            int type = AnchorBusinessType.POI.getTYPE();
            String b = new C6600e().mo15979b((Object) C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("poi_id", m132021b(poiContext)), C7579l.m23633a("poi_name", m132023c(poiContext))}));
            C7573i.m23582a((Object) b, "Gson().toJson(mapOf(\n   …                       ))");
            AnchorTransData anchorTransData = new AnchorTransData(type, b, m132023c(poiContext), "", null, null, null, 112, null);
            updateAnchor.setValue(anchorTransData);
        }
    }

    /* renamed from: d */
    public static boolean m132024d() {
        return C32617a.m105668a();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public PoiPublishModel provideExtensionData() {
        return new C41419k(this);
    }

    /* renamed from: c */
    public final LocationSettingItem mo102035c() {
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        return locationSettingItem;
    }

    /* renamed from: g */
    public final boolean mo102038g() {
        PoiCouponActivityStruct poiCouponActivityStruct;
        if (this.f107738g != null) {
            PoiContext poiContext = this.f107738g;
            if (poiContext != null) {
                poiCouponActivityStruct = poiContext.mPoiActivity;
            } else {
                poiCouponActivityStruct = null;
            }
            if (poiCouponActivityStruct != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo102039h() {
        String str;
        if (this.f107738g != null) {
            PoiContext poiContext = this.f107738g;
            if (poiContext != null) {
                str = poiContext.mPoiRateId;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void mo102041j() {
        if (C43014ci.m136523c()) {
            mo102037f();
            return;
        }
        C43014ci.m136522b();
        C43014ci.m136519a(this.f107749s, new C41420l(this), C41421m.f107767a);
    }

    /* renamed from: k */
    public final void mo102042k() {
        Fragment fragment = this.f107750t;
        if (fragment != null) {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                C32617a.m105667a(activity, new C41422n(this));
            }
        }
    }

    public final void onCreateFinish() {
        ExtensionMisc extensionMisc = this.f107733b;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        mo102031a(PoiContext.unserializeFromJson(extensionMisc.getPoiContext()));
    }

    public final void onEnterChildrenMode() {
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem.setVisibility(8);
        SpeedRecommendPoiView speedRecommendPoiView = this.f107747q;
        if (speedRecommendPoiView != null) {
            speedRecommendPoiView.setVisibility(8);
        }
    }

    /* renamed from: l */
    private final void m132025l() {
        ExtensionMisc extensionMisc = this.f107733b;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        if (!C7573i.m23585a((Object) (Boolean) extensionMisc.getExtensionDataRepo().getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
            ExtensionMisc extensionMisc2 = this.f107733b;
            if (extensionMisc2 == null) {
                C7573i.m23583a("extensionMisc");
            }
            if (!C7573i.m23585a((Object) (Boolean) extensionMisc2.getExtensionDataRepo().getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true))) {
                ExtensionMisc extensionMisc3 = this.f107733b;
                if (extensionMisc3 == null) {
                    C7573i.m23583a("extensionMisc");
                }
                if (!C7573i.m23585a((Object) (Boolean) extensionMisc3.getExtensionDataRepo().getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                    return;
                }
            }
        }
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem.setDrawableRight((int) R.drawable.b20);
        LocationSettingItem locationSettingItem2 = this.f107734c;
        if (locationSettingItem2 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem2.mo101627b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043 A[RETURN] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m132027n() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorListManager r0 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorListManager.f64708a
            java.util.List r0 = r0.mo64313b()
            r1 = 0
            if (r0 == 0) goto L_0x0045
            int r2 = r0.size()
            r3 = 1
            if (r2 <= r3) goto L_0x0044
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x001f
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0040
        L_0x001f:
            java.util.Iterator r0 = r0.iterator()
        L_0x0023:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r0.next()
            com.ss.android.ugc.aweme.commercialize.anchor.e r2 = (com.p280ss.android.ugc.aweme.commercialize.anchor.C24536e) r2
            int r2 = r2.f64760a
            com.ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType r4 = com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType.POI
            int r4 = r4.getTYPE()
            if (r2 != r4) goto L_0x003b
            r2 = 1
            goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            if (r2 == 0) goto L_0x0023
            r0 = 1
            goto L_0x0041
        L_0x0040:
            r0 = 0
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            return r1
        L_0x0045:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41408u.m132027n():boolean");
    }

    /* renamed from: e */
    public final void mo102036e() {
        ExtensionDataRepo extensionDataRepo = this.f107732a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        extensionDataRepo.getLocationActivityVisible().setValue(Boolean.valueOf(false));
        if (m132026m() && mo102038g()) {
            LocationSettingItem locationSettingItem = this.f107734c;
            if (locationSettingItem == null) {
                C7573i.m23583a("locationSettingItem");
            }
            locationSettingItem.setVisibility(0);
        }
        LocationSettingItem locationSettingItem2 = this.f107734c;
        if (locationSettingItem2 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem2.setLocation(null);
        ExtensionDataRepo extensionDataRepo2 = this.f107732a;
        if (extensionDataRepo2 == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        C0052o isPoiAdd = extensionDataRepo2.isPoiAdd();
        LocationSettingItem locationSettingItem3 = this.f107734c;
        if (locationSettingItem3 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        isPoiAdd.setValue(Boolean.valueOf(locationSettingItem3.mo101626a()));
        mo102031a((PoiContext) null);
    }

    /* renamed from: f */
    public final void mo102037f() {
        FragmentActivity fragmentActivity;
        IPOIService iPOIService = (IPOIService) ServiceManager.get().getService(IPOIService.class);
        if (iPOIService != null) {
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(this.f107751u)) {
                bundle.putString("candidateloc", this.f107751u);
            }
            bundle.putBoolean("enable_global_search", this.f107740j);
            bundle.putBoolean("is_over_sea", this.f107741k);
            Fragment fragment = this.f107750t;
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            } else {
                fragmentActivity = null;
            }
            iPOIService.getPOISearchDialog(fragmentActivity, bundle, new C41412d(this)).show();
            C6907h.onEvent(MobClick.obtain().setEventName("add_poi").setLabelName("edit_page"));
        }
    }

    /* renamed from: i */
    public final String mo102040i() {
        if (mo102038g()) {
            return PoiContext.serializeToStr(this.f107738g);
        }
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        if (!TextUtils.isEmpty(locationSettingItem.getPoiId())) {
            if (this.f107738g == null) {
                this.f107738g = new PoiContext();
            }
            PoiContext poiContext = this.f107738g;
            if (poiContext == null) {
                C7573i.m23580a();
            }
            LocationSettingItem locationSettingItem2 = this.f107734c;
            if (locationSettingItem2 == null) {
                C7573i.m23583a("locationSettingItem");
            }
            poiContext.mSelectPoiId = locationSettingItem2.getPoiId();
            PoiContext poiContext2 = this.f107738g;
            if (poiContext2 == null) {
                C7573i.m23580a();
            }
            LocationSettingItem locationSettingItem3 = this.f107734c;
            if (locationSettingItem3 == null) {
                C7573i.m23583a("locationSettingItem");
            }
            poiContext2.mSelectPoiName = locationSettingItem3.getPoiName();
        } else if (this.f107738g != null) {
            PoiContext poiContext3 = this.f107738g;
            if (poiContext3 == null) {
                C7573i.m23580a();
            }
            poiContext3.mSelectPoiId = "";
            PoiContext poiContext4 = this.f107738g;
            if (poiContext4 == null) {
                C7573i.m23580a();
            }
            poiContext4.mSelectPoiName = "";
        }
        return PoiContext.serializeToStr(this.f107738g);
    }

    /* renamed from: m */
    private final boolean m132026m() {
        String str;
        boolean z;
        boolean z2;
        ExtensionMisc extensionMisc = this.f107733b;
        if (extensionMisc == null) {
            C7573i.m23583a("extensionMisc");
        }
        C35542a publishExtensionDataContainer = extensionMisc.getPublishExtensionDataContainer();
        if (publishExtensionDataContainer != null) {
            str = publishExtensionDataContainer.mo88234d();
        } else {
            str = null;
        }
        C25006o a = C25006o.m82325a(str);
        C7573i.m23582a((Object) a, "PublishExtensionModel\n  …                        )");
        if (a.f65943f != null) {
            return false;
        }
        ExtensionMisc extensionMisc2 = this.f107733b;
        if (extensionMisc2 == null) {
            C7573i.m23583a("extensionMisc");
        }
        AnchorTransData anchorTransData = (AnchorTransData) extensionMisc2.getExtensionDataRepo().getUpdateAnchor().getValue();
        if (anchorTransData != null) {
            Integer source = anchorTransData.getSource();
            if (source == null || source.intValue() != 0) {
                return false;
            }
        }
        if (!C6399b.m19944t()) {
            return true;
        }
        AVPublishContentType aVPublishContentType = this.f107753w;
        if (aVPublishContentType == null) {
            C7573i.m23583a("contentType");
        }
        if (C7573i.m23585a((Object) aVPublishContentType.getContentType(), (Object) AVPublishContentType.Photo.getContentType())) {
            List b = AnchorListManager.f64708a.mo64313b();
            if (b == null) {
                return false;
            }
            Iterable<C24536e> iterable = b;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (C24536e eVar : iterable) {
                if (eVar.f64760a == AnchorBusinessType.POI.getTYPE()) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }
        List b2 = AnchorListManager.f64708a.mo64313b();
        if (b2 != null && b2.size() <= 1) {
            Iterable<C24536e> iterable2 = b2;
            if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                for (C24536e eVar2 : iterable2) {
                    if (eVar2.f64760a == AnchorBusinessType.POI.getTYPE()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r2 == null) goto L_0x0086;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m132028o() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r0 = r5.f107734c
            if (r0 != 0) goto L_0x0009
            java.lang.String r1 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x0009:
            r1 = 0
            r0.setVisibility(r1)
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x0014
            return
        L_0x0014:
            com.ss.android.ugc.aweme.app.AwemeApplication r0 = com.p280ss.android.ugc.aweme.app.AwemeApplication.m21341a()
            android.content.Context r0 = (android.content.Context) r0
            com.ss.android.ugc.aweme.location.h r0 = com.p280ss.android.ugc.aweme.location.C32630h.m105696b(r0)
            com.ss.android.ugc.aweme.poi.LocationBundle r0 = r0.mo83993a()
            android.content.Context r2 = com.bytedance.ies.ugc.appcontext.C6399b.m19921a()
            com.ss.android.ugc.aweme.location.h r2 = com.p280ss.android.ugc.aweme.location.C32630h.m105696b(r2)
            r2.mo83998b()
            com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiView r2 = new com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiView
            android.content.Context r3 = r5.f107749s
            r2.<init>(r3)
            r5.f107747q = r2
            com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiView r2 = r5.f107747q
            if (r2 == 0) goto L_0x0040
            r3 = r5
            com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiAdapter$a r3 = (com.p280ss.android.ugc.aweme.poi.p335ui.publish.SpeedRecommendPoiAdapter.C35397a) r3
            r2.setOnItemClick(r3)
        L_0x0040:
            com.ss.android.ugc.aweme.poi.ui.publish.d r2 = new com.ss.android.ugc.aweme.poi.ui.publish.d
            r2.<init>()
            r5.f107743m = r2
            com.ss.android.ugc.aweme.poi.ui.publish.d r2 = r5.f107743m
            if (r2 != 0) goto L_0x004e
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x004e:
            r3 = r5
            com.ss.android.ugc.aweme.common.e r3 = (com.p280ss.android.ugc.aweme.common.C25672e) r3
            r2.mo66537a(r3)
            r2 = 1
            if (r0 == 0) goto L_0x0063
            java.lang.String[] r0 = com.p280ss.android.ugc.aweme.poi.utils.C35469y.m114577a(r0)
            r3 = r0[r1]
            r5.f107736e = r3
            r0 = r0[r2]
            r5.f107737f = r0
        L_0x0063:
            com.ss.android.ugc.aweme.poi.ui.publish.d r0 = r5.f107743m
            if (r0 != 0) goto L_0x006a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x006a:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r5.f107737f
            r3[r1] = r4
            java.lang.String r1 = r5.f107736e
            r3[r2] = r1
            r1 = 2
            com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi r2 = r5.f107748r
            if (r2 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.shortvideo.ui.StickerPoi r2 = r2.getStickerPoi()
            if (r2 == 0) goto L_0x0086
            java.lang.String r2 = r2.getDoorplateLevelId()
            if (r2 != 0) goto L_0x0088
        L_0x0086:
            java.lang.String r2 = ""
        L_0x0088:
            r3[r1] = r2
            r0.mo56976a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41408u.m132028o():void");
    }

    /* renamed from: a */
    public final Map<String, String> mo102029a() {
        HashMap hashMap = new HashMap();
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        PoiStruct poiStruct = locationSettingItem.getPoiStruct();
        if (poiStruct != null) {
            Map map = hashMap;
            map.put("poi_id", poiStruct.getPoiId());
            map.put("poi_backend_type", poiStruct.getBackendTypeCode());
            if (mo102039h()) {
                this.f107745o = "poi_rate";
            }
            if (!TextUtils.isEmpty(this.f107745o)) {
                map.put("poi_enter_method", this.f107745o);
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public final HashMap<String, String> mo102034b() {
        HashMap<String, String> hashMap = new HashMap<>();
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        PoiStruct poiStruct = locationSettingItem.getPoiStruct();
        if (poiStruct != null) {
            if (poiStruct.getDistance() != null) {
                String distance = poiStruct.getDistance();
                C7573i.m23582a((Object) distance, "poiStruct.getDistance()");
                hashMap.put("distance_info", distance);
            }
            Map map = hashMap;
            map.put("poi_label_type", String.valueOf(poiStruct.getPoiSubTitleType()));
            map.put("poi_type", String.valueOf(poiStruct.poiType));
        }
        return hashMap;
    }

    /* renamed from: a */
    public static final /* synthetic */ ExtensionDataRepo m132017a(C41408u uVar) {
        ExtensionDataRepo extensionDataRepo = uVar.f107732a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    /* renamed from: b */
    private static String m132021b(PoiContext poiContext) {
        if (!TextUtils.isEmpty(poiContext.mSelectPoiId)) {
            String str = poiContext.mSelectPoiId;
            C7573i.m23582a((Object) str, "poiContext.mSelectPoiId");
            return str;
        }
        String str2 = poiContext.mShootPoiId;
        C7573i.m23582a((Object) str2, "poiContext.mShootPoiId");
        return str2;
    }

    /* renamed from: c */
    private static String m132023c(PoiContext poiContext) {
        if (!TextUtils.isEmpty(poiContext.mSelectPoiName)) {
            String str = poiContext.mSelectPoiName;
            C7573i.m23582a((Object) str, "poiContext.mSelectPoiName");
            return str;
        }
        String str2 = poiContext.mShootPoiName;
        C7573i.m23582a((Object) str2, "poiContext.mShootPoiName");
        return str2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        C7573i.m23587b(bundle, "outState");
        String str = "poiStruct";
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        bundle.putSerializable(str, locationSettingItem.getPoiStruct());
    }

    /* renamed from: a */
    private static LocationSettingItem m132018a(LinearLayout linearLayout) {
        LocationSettingItem locationSettingItem = new LocationSettingItem(linearLayout.getContext(), null);
        linearLayout.addView(locationSettingItem, new LayoutParams(-1, (int) C9738o.m28708b(linearLayout.getContext(), 52.0f)));
        locationSettingItem.setGravity(16);
        locationSettingItem.setOrientation(0);
        locationSettingItem.setVisibility(8);
        return locationSettingItem;
    }

    /* renamed from: b */
    private static LinearLayout m132020b(LinearLayout linearLayout) {
        LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
        int b = (int) C9738o.m28708b(linearLayout.getContext(), 10.0f);
        linearLayout.addView(linearLayout2, new LayoutParams(-1, -2));
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(0, 0, 0, b);
        linearLayout2.setVisibility(8);
        return linearLayout2;
    }

    /* renamed from: a */
    private final void m132019a(Bundle bundle) {
        if (bundle.getSerializable("poiStruct") != null) {
            LocationSettingItem locationSettingItem = this.f107734c;
            if (locationSettingItem == null) {
                C7573i.m23583a("locationSettingItem");
            }
            Serializable serializable = bundle.getSerializable("poiStruct");
            if (serializable != null) {
                locationSettingItem.setLocation((PoiStruct) serializable);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.poi.model.PoiStruct");
            }
        }
        ExtensionDataRepo extensionDataRepo = this.f107732a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        C0052o isPoiAdd = extensionDataRepo.isPoiAdd();
        LocationSettingItem locationSettingItem2 = this.f107734c;
        if (locationSettingItem2 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        isPoiAdd.setValue(Boolean.valueOf(locationSettingItem2.mo101626a()));
    }

    /* renamed from: b */
    public static void m132022b(PoiStruct poiStruct) {
        C35454m.m114527a(poiStruct, "hide_poi", C22984d.m75611a().mo59973a("enter_from", "video_post_page").mo59973a("poi_id", poiStruct.poiId));
    }

    /* renamed from: a */
    public final void mo102030a(PoiStruct poiStruct) {
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem.setLocation(poiStruct);
        ExtensionDataRepo extensionDataRepo = this.f107732a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        C0052o isPoiAdd = extensionDataRepo.isPoiAdd();
        LocationSettingItem locationSettingItem2 = this.f107734c;
        if (locationSettingItem2 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        isPoiAdd.setValue(Boolean.valueOf(locationSettingItem2.mo101626a()));
        C41410b bVar = this.f107746p;
        if (bVar != null) {
            bVar.mo102043a();
        }
        LinearLayout linearLayout = this.f107735d;
        if (linearLayout == null) {
            C7573i.m23583a("mPoiContainer");
        }
        if (linearLayout.getVisibility() == 0 && this.f107747q != null) {
            SpeedRecommendPoiView speedRecommendPoiView = this.f107747q;
            if (speedRecommendPoiView != null) {
                speedRecommendPoiView.mo90141a(poiStruct, this.f107752v);
            }
        }
        if (poiStruct == null) {
            LocationSettingItem locationSettingItem3 = this.f107734c;
            if (locationSettingItem3 == null) {
                C7573i.m23583a("locationSettingItem");
            }
            locationSettingItem3.setDrawableRight((int) R.drawable.b20);
            LocationSettingItem locationSettingItem4 = this.f107734c;
            if (locationSettingItem4 == null) {
                C7573i.m23583a("locationSettingItem");
            }
            locationSettingItem4.mo101627b();
            return;
        }
        LocationSettingItem locationSettingItem5 = this.f107734c;
        if (locationSettingItem5 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem5.setDrawableRight((int) R.drawable.a56);
        LocationSettingItem locationSettingItem6 = this.f107734c;
        if (locationSettingItem6 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem6.setRightIconListener(new C41411c(this, poiStruct));
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0181  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo90144a(com.p280ss.android.ugc.aweme.poi.model.C35126o r14) {
        /*
            r13 = this;
            if (r14 != 0) goto L_0x0003
            return
        L_0x0003:
            boolean r0 = r14.f91889g
            r13.f107740j = r0
            boolean r0 = r14.f91890h
            r13.f107741k = r0
            com.ss.android.ugc.aweme.poi.model.PoiActivityStruct r0 = r14.f91888f
            r1 = 1
            if (r0 == 0) goto L_0x0029
            r13.f107742l = r1
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r0 = r13.f107734c
            if (r0 != 0) goto L_0x001b
            java.lang.String r2 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x001b:
            com.ss.android.ugc.aweme.poi.model.PoiActivityStruct r2 = r14.f91888f
            java.lang.String r3 = "result.poiActivityStruct"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getActivityUrl()
            r0.mo101625a(r2)
        L_0x0029:
            java.util.List<com.ss.android.ugc.aweme.poi.model.PoiStruct> r0 = r14.f91883a
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = com.bytedance.common.utility.collection.C6307b.m19566a(r0)
            if (r0 == 0) goto L_0x0034
            return
        L_0x0034:
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r0 = r13.f107734c
            if (r0 != 0) goto L_0x003d
            java.lang.String r2 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r2)
        L_0x003d:
            boolean r0 = r0.f107118j
            r2 = 0
            if (r0 == 0) goto L_0x006b
            com.ss.android.ugc.aweme.services.publish.ExtensionDataRepo r0 = r13.f107732a
            if (r0 != 0) goto L_0x004b
            java.lang.String r3 = "extensionDataRepo"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x004b:
            android.arch.lifecycle.o r0 = r0.getLocationState()
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r1)
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r0 == 0) goto L_0x006b
            android.widget.LinearLayout r0 = r13.f107735d
            if (r0 != 0) goto L_0x0068
            java.lang.String r3 = "mPoiContainer"
            kotlin.jvm.internal.C7573i.m23583a(r3)
        L_0x0068:
            r0.setVisibility(r2)
        L_0x006b:
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r0 = r13.f107738g
            r3 = 0
            if (r0 == 0) goto L_0x0085
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r0 = r13.f107738g
            if (r0 == 0) goto L_0x0085
            java.lang.String r4 = r13.f107736e
            java.lang.String r5 = r13.f107737f
            boolean r0 = r0.hasRecommendPoi(r4, r5)
            if (r0 != r1) goto L_0x0085
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r0 = r13.f107738g
            if (r0 == 0) goto L_0x0085
            java.lang.String r0 = r0.mShootPoiId
            goto L_0x0086
        L_0x0085:
            r0 = r3
        L_0x0086:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = (java.util.List) r4
            r13.f107752v = r4
            com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi r4 = r13.f107748r
            if (r4 == 0) goto L_0x00a2
            com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi r4 = r13.f107748r
            if (r4 != 0) goto L_0x009a
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x009a:
            boolean r4 = r4.isCancelSelect()
            if (r4 != 0) goto L_0x00a2
            r4 = 1
            goto L_0x00a3
        L_0x00a2:
            r4 = 0
        L_0x00a3:
            r5 = r0
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00ae
            r6 = 6
            goto L_0x00af
        L_0x00ae:
            r6 = 5
        L_0x00af:
            java.util.List<com.ss.android.ugc.aweme.poi.model.PoiStruct> r7 = r14.f91883a
            java.util.Iterator r7 = r7.iterator()
            r9 = r3
            r8 = 0
        L_0x00b7:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00f3
            java.lang.Object r10 = r7.next()
            com.ss.android.ugc.aweme.poi.model.PoiStruct r10 = (com.p280ss.android.ugc.aweme.poi.model.PoiStruct) r10
            if (r8 >= r6) goto L_0x00f3
            java.lang.String r11 = r10.getPoiId()
            boolean r11 = kotlin.text.C7634n.m23717a(r11, r0, r1)
            if (r11 != 0) goto L_0x00f0
            com.ss.android.ugc.aweme.poi.model.p r11 = new com.ss.android.ugc.aweme.poi.model.p
            r11.<init>()
            r11.f91891a = r10
            r11.f91892b = r2
            com.ss.android.ugc.aweme.feed.model.LogPbBean r12 = r14.f91887e
            r11.f91893c = r12
            r11.f91894d = r8
            r11.f91895e = r2
            if (r4 == 0) goto L_0x00e9
            if (r9 != 0) goto L_0x00e9
            boolean r12 = r10.isTopRecommend
            if (r12 == 0) goto L_0x00e9
            r9 = r10
        L_0x00e9:
            java.util.List<com.ss.android.ugc.aweme.poi.model.p> r10 = r13.f107752v
            if (r10 == 0) goto L_0x00f0
            r10.add(r11)
        L_0x00f0:
            int r8 = r8 + 1
            goto L_0x00b7
        L_0x00f3:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x014d
            com.ss.android.ugc.aweme.poi.model.PoiStruct r0 = new com.ss.android.ugc.aweme.poi.model.PoiStruct
            r0.<init>()
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r4 = r13.f107738g
            if (r4 == 0) goto L_0x0105
            java.lang.String r4 = r4.mShootPoiId
            goto L_0x0106
        L_0x0105:
            r4 = r3
        L_0x0106:
            r0.poiId = r4
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r4 = r13.f107738g
            if (r4 == 0) goto L_0x010f
            java.lang.String r4 = r4.mShootPoiName
            goto L_0x0110
        L_0x010f:
            r4 = r3
        L_0x0110:
            r0.poiName = r4
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r4 = r13.f107738g
            if (r4 == 0) goto L_0x011d
            double r4 = r4.mShootPoiLat
            java.lang.Double r4 = java.lang.Double.valueOf(r4)
            goto L_0x011e
        L_0x011d:
            r4 = r3
        L_0x011e:
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.poiLatitude = r4
            com.ss.android.ugc.aweme.poi.ui.publish.PoiContext r4 = r13.f107738g
            if (r4 == 0) goto L_0x012e
            double r3 = r4.mShootPoiLng
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
        L_0x012e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.poiLongitude = r3
            com.ss.android.ugc.aweme.poi.model.p r3 = new com.ss.android.ugc.aweme.poi.model.p
            r3.<init>()
            r3.f91891a = r0
            r3.f91892b = r2
            com.ss.android.ugc.aweme.feed.model.LogPbBean r14 = r14.f91887e
            r3.f91893c = r14
            r14 = -1
            r3.f91894d = r14
            r3.f91895e = r1
            java.util.List<com.ss.android.ugc.aweme.poi.model.p> r14 = r13.f107752v
            if (r14 == 0) goto L_0x014d
            r14.add(r2, r3)
        L_0x014d:
            com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiView r14 = r13.f107747q
            if (r14 == 0) goto L_0x0156
            java.util.List<com.ss.android.ugc.aweme.poi.model.p> r0 = r13.f107752v
            r14.setData(r0)
        L_0x0156:
            android.widget.LinearLayout r14 = r13.f107735d
            if (r14 != 0) goto L_0x015f
            java.lang.String r0 = "mPoiContainer"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x015f:
            r14.removeAllViews()
            android.widget.LinearLayout r14 = r13.f107735d
            if (r14 != 0) goto L_0x016b
            java.lang.String r0 = "mPoiContainer"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x016b:
            com.ss.android.ugc.aweme.poi.ui.publish.SpeedRecommendPoiView r0 = r13.f107747q
            android.view.View r0 = (android.view.View) r0
            r14.addView(r0)
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r14 = r13.f107734c
            if (r14 != 0) goto L_0x017b
            java.lang.String r0 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x017b:
            int r14 = r14.getVisibility()
            if (r14 != 0) goto L_0x01e4
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r14 = r13.f107734c
            if (r14 != 0) goto L_0x018a
            java.lang.String r0 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x018a:
            java.lang.String r14 = r14.getPoiId()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x01d5
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r14 = r13.f107734c
            if (r14 != 0) goto L_0x019f
            java.lang.String r0 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x019f:
            java.lang.String r14 = r14.getPoiName()
            java.lang.CharSequence r14 = (java.lang.CharSequence) r14
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 != 0) goto L_0x01d5
            com.ss.android.ugc.aweme.poi.model.PoiStruct r14 = new com.ss.android.ugc.aweme.poi.model.PoiStruct
            r14.<init>()
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r0 = r13.f107734c
            if (r0 != 0) goto L_0x01b9
            java.lang.String r1 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x01b9:
            java.lang.String r0 = r0.getPoiId()
            r14.poiId = r0
            com.ss.android.ugc.aweme.shortvideo.ui.LocationSettingItem r0 = r13.f107734c
            if (r0 != 0) goto L_0x01c8
            java.lang.String r1 = "locationSettingItem"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x01c8:
            java.lang.String r0 = r0.getPoiName()
            r14.poiName = r0
            r13.mo102030a(r14)
            r13.m132025l()
            return
        L_0x01d5:
            if (r9 == 0) goto L_0x01e4
            r13.mo102030a(r9)
            com.ss.android.ugc.aweme.draft.model.DefaultSelectStickerPoi r14 = r13.f107748r
            if (r14 != 0) goto L_0x01e1
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x01e1:
            r14.setCancelSelect(r1)
        L_0x01e4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41408u.mo90144a(com.ss.android.ugc.aweme.poi.model.o):void");
    }

    /* renamed from: a */
    public final void mo90134a(C35127p pVar, boolean z) {
        String str;
        String str2;
        ExtensionDataRepo extensionDataRepo = this.f107732a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        String str3 = null;
        if (C7573i.m23585a((Object) (Boolean) extensionDataRepo.isGoodsAdd().getValue(), (Object) Boolean.valueOf(true))) {
            Context context = this.f107749s;
            Context context2 = this.f107749s;
            if (context2 != null) {
                str3 = context2.getString(R.string.a_d);
            }
            C9738o.m28697a(context, str3);
        } else if (z) {
            if (C6399b.m19944t()) {
                mo102041j();
            } else {
                mo102037f();
            }
            if (m132024d()) {
                str2 = "1";
            } else {
                str2 = "0";
            }
            new C33256b().mo85242a("video_post_page").mo85243b(str2).mo85244c(this.f107739h).mo85252e();
        } else if (pVar == null) {
            mo102030a((PoiStruct) null);
        } else {
            mo102030a(pVar.f91891a);
            if (pVar.f91895e) {
                str = "poi_shoot";
            } else {
                str = "recommend_poi";
            }
            String str4 = str;
            String valueOf = String.valueOf(pVar.f91894d);
            String a = C28199ae.m92689a().mo71790a(pVar.f91893c);
            C7573i.m23582a((Object) a, "LogPbManager.getInstance…ormatLogPb(poiItem.logPb)");
            PoiStruct poiStruct = pVar.f91891a;
            C7573i.m23582a((Object) poiStruct, "poiItem.poiStruct");
            mo102032a(str4, "", valueOf, a, "", poiStruct);
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C7573i.m23587b(strArr, "permissions");
        C7573i.m23587b(iArr, "grantResults");
        DefaultImpls.onRequestPermissionsResult(this, i, strArr, iArr);
    }

    public final void onCreate(Fragment fragment, LinearLayout linearLayout, Bundle bundle, AVPublishContentType aVPublishContentType, PublishOutput publishOutput, ExtensionMisc extensionMisc, Callback callback) {
        int i;
        C7573i.m23587b(fragment, "fragment");
        C7573i.m23587b(linearLayout, "extensionWidgetContainer");
        C7573i.m23587b(aVPublishContentType, "contentType");
        C7573i.m23587b(publishOutput, "publishOutput");
        C7573i.m23587b(extensionMisc, "extensionMisc");
        C7573i.m23587b(callback, "callback");
        this.f107753w = aVPublishContentType;
        this.f107732a = extensionMisc.getExtensionDataRepo();
        this.f107751u = extensionMisc.getCandidateLog();
        this.f107750t = fragment;
        this.f107749s = fragment.getContext();
        View view = fragment.getView();
        if (view == null) {
            C7573i.m23580a();
        }
        View findViewById = view.findViewById(R.id.acs);
        C7573i.m23582a((Object) findViewById, "fragment.view!!.findViewById(R.id.editor_text)");
        this.f107744n = (MentionEditText) findViewById;
        this.f107739h = aVPublishContentType.getContentType();
        this.f107733b = extensionMisc;
        this.f107738g = PoiContext.unserializeFromJson(extensionMisc.getPoiContext());
        this.f107746p = new C41413e(callback);
        this.f107748r = extensionMisc.getDefaultSelectStickerPoi();
        this.f107734c = m132018a(linearLayout);
        this.f107735d = m132020b(linearLayout);
        if (bundle != null) {
            m132019a(bundle);
        }
        LocationSettingItem locationSettingItem = this.f107734c;
        if (locationSettingItem == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem.setStateChangeCB(new C41414f(this));
        LocationSettingItem locationSettingItem2 = this.f107734c;
        if (locationSettingItem2 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        locationSettingItem2.setOnClickListener(new C41415g(this, extensionMisc, fragment));
        extensionMisc.getExtensionDataRepo().getLocationState().observe(fragment, new C41416h(this));
        ExtensionDataRepo extensionDataRepo = this.f107732a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        extensionDataRepo.setResetPoiAction(new C41417i(this));
        ExtensionDataRepo extensionDataRepo2 = this.f107732a;
        if (extensionDataRepo2 == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        extensionDataRepo2.setUpdatePoiContext(new C41418j(this));
        LocationSettingItem locationSettingItem3 = this.f107734c;
        if (locationSettingItem3 == null) {
            C7573i.m23583a("locationSettingItem");
        }
        if (!m132026m() || mo102038g()) {
            i = 8;
        } else {
            i = 0;
        }
        locationSettingItem3.setVisibility(i);
    }
}
