package com.p280ss.android.ugc.aweme.commercialize.star;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p563c.C10769e.C10770a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.header.C23764b;
import com.p280ss.android.ugc.aweme.commercialize.anchor.AnchorBusinessType;
import com.p280ss.android.ugc.aweme.commercialize.anchor.C24522a;
import com.p280ss.android.ugc.aweme.commercialize.model.C24994e;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.commercialize.star.C25086a.C25087a;
import com.p280ss.android.ugc.aweme.p1216fe.method.C27994k;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.PoiContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai.C35542a;
import com.p280ss.android.ugc.aweme.services.publish.AnchorTransData;
import com.p280ss.android.ugc.aweme.services.publish.ExtensionDataRepo;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.PublishSettingItem;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.star.f */
public final class C25101f extends PublishSettingItem implements C25087a {

    /* renamed from: a */
    public ExtensionDataRepo f66254a;

    /* renamed from: b */
    public boolean f66255b;

    /* renamed from: k */
    private String f66256k;

    /* renamed from: l */
    private String f66257l;

    /* renamed from: m */
    private String f66258m;

    /* renamed from: n */
    private C35542a f66259n;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.f$a */
    static final class C25102a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C25101f f66260a;

        C25102a(C25101f fVar) {
            this.f66260a = fVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f66260a.getExtensionDataRepo().getUpdateAnchor().setValue(null);
            this.f66260a.getExtensionDataRepo().getI18nStarAtlasClosed().setValue(Boolean.valueOf(false));
            this.f66260a.getExtensionDataRepo().getAddStarAtlasTag().invoke();
            this.f66260a.setChoose(true);
            C35542a publishExtensionDataContainer = this.f66260a.getPublishExtensionDataContainer();
            if (publishExtensionDataContainer != null) {
                C25006o b = C25006o.m82327b(publishExtensionDataContainer.mo88234d());
                C7573i.m23582a((Object) b, "model");
                b.mo65436a(true);
                b.f65942e = this.f66260a.getStarAtlasContent();
                publishExtensionDataContainer.mo88231a(C25006o.m82326a(b));
            }
            if (C23764b.m77913a(this.f66260a.getStarAtlasHashTag())) {
                this.f66260a.getExtensionDataRepo().getAddStarAtlasTag().invoke();
            } else {
                this.f66260a.getExtensionDataRepo().getRemoveStarAtlasTag().invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.star.f$b */
    static final class C25103b implements OnClickListener {

        /* renamed from: a */
        public static final C25103b f66261a = new C25103b();

        C25103b() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final String getBrandName() {
        return this.f66258m;
    }

    public final C35542a getPublishExtensionDataContainer() {
        return this.f66259n;
    }

    public final String getStarAtlasContent() {
        return this.f66257l;
    }

    public final String getStarAtlasHashTag() {
        return this.f66256k;
    }

    /* renamed from: a */
    public final void mo65603a() {
        setTitle((int) R.string.dwn);
        setSubtitle((int) R.string.e14);
    }

    public final void aq_() {
        setTitle((int) R.string.a3v);
        setSubtitle((int) R.string.e0k);
    }

    public final ExtensionDataRepo getExtensionDataRepo() {
        ExtensionDataRepo extensionDataRepo = this.f66254a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        return extensionDataRepo;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C42961az.m136382c(this);
        C25086a.m82624a((C25087a) this);
    }

    /* renamed from: e */
    private final void m82651e() {
        C10770a.m31440a().mo25760a(getContext(), getContext().getString(R.string.e0f), 1).mo25761a();
    }

    /* renamed from: c */
    public final void mo65606c() {
        setHasStarAtlasOrder(false);
        setStarAtlasOrderId(0);
        ExtensionDataRepo extensionDataRepo = this.f66254a;
        if (extensionDataRepo == null) {
            C7573i.m23583a("extensionDataRepo");
        }
        extensionDataRepo.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
    }

    public final boolean getHasStarAtlasOrder() {
        String str;
        C35542a aVar = this.f66259n;
        if (aVar != null) {
            str = aVar.mo88234d();
        } else {
            str = null;
        }
        C25006o b = C25006o.m82327b(str);
        C7573i.m23582a((Object) b, "PublishExtensionModel.fr…taContainer?.publishData)");
        return b.f65941d;
    }

    public final long getStarAtlasOrderId() {
        String str;
        C35542a aVar = this.f66259n;
        if (aVar != null) {
            str = aVar.mo88234d();
        } else {
            str = null;
        }
        C25006o b = C25006o.m82327b(str);
        C7573i.m23582a((Object) b, "PublishExtensionModel.fr…taContainer?.publishData)");
        return b.mo65435a();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C42961az.m136383d(this);
        if (C7573i.m23585a((Object) C25086a.m82623a(), (Object) this)) {
            C25086a.m82624a((C25087a) null);
        }
    }

    /* renamed from: d */
    private final void m82649d() {
        C10741a aVar = new C10741a(getContext());
        aVar.mo25657b((int) R.string.a3k).mo25650a((int) R.string.u9, (OnClickListener) new C25102a(this)).mo25658b((int) R.string.u7, (OnClickListener) C25103b.f66261a);
        Dialog b = aVar.mo25656a().mo25638b();
        b.setCancelable(false);
        b.setCanceledOnTouchOutside(false);
    }

    public final void setBrandName(String str) {
        this.f66258m = str;
    }

    public final void setPublishExtensionDataContainer(C35542a aVar) {
        this.f66259n = aVar;
    }

    public final void setStarAtlasHashTag(String str) {
        this.f66256k = str;
    }

    public final void setExtensionDataRepo(ExtensionDataRepo extensionDataRepo) {
        C7573i.m23587b(extensionDataRepo, "<set-?>");
        this.f66254a = extensionDataRepo;
    }

    public C25101f(Context context) {
        super(context);
        setDrawableLeft((int) R.drawable.b0w);
        setSubtitleMaxWidth(C23486n.m77122a(120.0d));
    }

    public final void setStarAtlasContent(String str) {
        boolean z;
        this.f66257l = str;
        this.f66258m = C25086a.m82627c(str);
        if (this.f66258m != null) {
            z = true;
        } else {
            z = false;
        }
        setHasStarAtlasOrder(z);
    }

    public final void setChoose(boolean z) {
        int i;
        this.f66255b = z;
        if (C6399b.m19944t()) {
            if (this.f66255b) {
                setSubtitle(this.f66258m);
                return;
            }
            i = R.string.e14;
        } else if (this.f66255b) {
            i = R.string.e0e;
        } else {
            i = R.string.e0k;
        }
        setSubtitle(i);
    }

    public final void setStarAtlasOrderId(long j) {
        boolean z;
        C35542a aVar = this.f66259n;
        if (aVar != null) {
            C25006o b = C25006o.m82327b(aVar.mo88234d());
            C7573i.m23582a((Object) b, "model");
            b.f65940c = j;
            aVar.mo88231a(C25006o.m82326a(b));
        }
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        setChoose(z);
    }

    /* renamed from: a */
    public final void mo65604a(JSONObject jSONObject) {
        C25101f fVar;
        boolean z;
        C7573i.m23587b(jSONObject, "starAtlasOrderJson");
        try {
            C25101f fVar2 = null;
            if (jSONObject.has("star_atlas_id")) {
                fVar = this;
            } else {
                fVar = null;
            }
            C25101f fVar3 = fVar;
            if (fVar3 != null) {
                if (getStarAtlasOrderId() != Long.parseLong(jSONObject.getString("star_atlas_id"))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    fVar3 = null;
                }
                if (fVar3 != null) {
                    if (!jSONObject.has("component_type")) {
                        jSONObject.put("component_type", 0);
                    }
                    switch (jSONObject.getInt("component_type")) {
                        case 0:
                            m82648c(jSONObject);
                            break;
                        case 1:
                            m82653f(jSONObject);
                            break;
                        case 2:
                            m82650d(jSONObject);
                            break;
                        case 3:
                            m82652e(jSONObject);
                            break;
                        case 4:
                            m82647b(jSONObject);
                            break;
                    }
                    if (jSONObject.has("star_atlas_id")) {
                        fVar2 = this;
                    }
                    if (fVar2 != null) {
                        setStarAtlasOrderId(Long.parseLong(jSONObject.getString("star_atlas_id")));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void setHasStarAtlasOrder(boolean z) {
        boolean z2 = true;
        if (z) {
            ExtensionDataRepo extensionDataRepo = this.f66254a;
            if (extensionDataRepo == null) {
                C7573i.m23583a("extensionDataRepo");
            }
            AnchorTransData anchorTransData = (AnchorTransData) extensionDataRepo.getUpdateAnchor().getValue();
            if (anchorTransData != null) {
                if (anchorTransData.getBusinessType() != AnchorBusinessType.ANCHOR_SHOP_LINK.getTYPE()) {
                    z2 = false;
                }
                if (!z2) {
                    anchorTransData = null;
                }
                if (anchorTransData != null) {
                    m82649d();
                }
            }
            ExtensionDataRepo extensionDataRepo2 = this.f66254a;
            if (extensionDataRepo2 == null) {
                C7573i.m23583a("extensionDataRepo");
            }
            extensionDataRepo2.getI18nStarAtlasClosed().setValue(Boolean.valueOf(false));
            setChoose(z);
            C35542a aVar = this.f66259n;
            if (aVar != null) {
                C25006o b = C25006o.m82327b(aVar.mo88234d());
                C7573i.m23582a((Object) b, "model");
                b.mo65436a(z);
                b.f65942e = getStarAtlasContent();
                aVar.mo88231a(C25006o.m82326a(b));
            }
            if (!z || !C23764b.m77913a(getStarAtlasHashTag())) {
                ExtensionDataRepo extensionDataRepo3 = this.f66254a;
                if (extensionDataRepo3 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo3.getRemoveStarAtlasTag().invoke();
                return;
            }
            ExtensionDataRepo extensionDataRepo4 = this.f66254a;
            if (extensionDataRepo4 == null) {
                C7573i.m23583a("extensionDataRepo");
            }
            extensionDataRepo4.getAddStarAtlasTag().invoke();
        } else {
            ExtensionDataRepo extensionDataRepo5 = this.f66254a;
            if (extensionDataRepo5 == null) {
                C7573i.m23583a("extensionDataRepo");
            }
            extensionDataRepo5.getI18nStarAtlasClosed().setValue(Boolean.valueOf(true));
            setChoose(z);
            C35542a aVar2 = this.f66259n;
            if (aVar2 != null) {
                C25006o b2 = C25006o.m82327b(aVar2.mo88234d());
                C7573i.m23582a((Object) b2, "model");
                b2.mo65436a(z);
                b2.f65942e = getStarAtlasContent();
                aVar2.mo88231a(C25006o.m82326a(b2));
            }
            if (!z || !C23764b.m77913a(getStarAtlasHashTag())) {
                ExtensionDataRepo extensionDataRepo6 = this.f66254a;
                if (extensionDataRepo6 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo6.getRemoveStarAtlasTag().invoke();
            } else {
                ExtensionDataRepo extensionDataRepo7 = this.f66254a;
                if (extensionDataRepo7 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo7.getAddStarAtlasTag().invoke();
            }
        }
    }

    /* renamed from: b */
    private final void m82647b(JSONObject jSONObject) {
        int type;
        if (jSONObject.has("anchor")) {
            C24994e eVar = (C24994e) new C6600e().mo15974a(jSONObject.getString("anchor"), C24994e.class);
            if (eVar != null) {
                ExtensionDataRepo extensionDataRepo = this.f66254a;
                if (extensionDataRepo == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo.getRecordLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo2 = this.f66254a;
                if (extensionDataRepo2 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo2.getResetLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo3 = this.f66254a;
                if (extensionDataRepo3 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo3.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo4 = this.f66254a;
                if (extensionDataRepo4 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo4.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo5 = this.f66254a;
                if (extensionDataRepo5 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo5.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo6 = this.f66254a;
                if (extensionDataRepo6 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo6.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo7 = this.f66254a;
                if (extensionDataRepo7 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo7.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo8 = this.f66254a;
                if (extensionDataRepo8 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo8.getWithStarAtlasAnchor().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo9 = this.f66254a;
                if (extensionDataRepo9 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo9.getLinkState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo10 = this.f66254a;
                if (extensionDataRepo10 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo10.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo11 = this.f66254a;
                if (extensionDataRepo11 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo11.getLocationState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo12 = this.f66254a;
                if (extensionDataRepo12 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo12.getAnchorState().setValue(Boolean.valueOf(false));
                Integer num = eVar.f65902b;
                if (num != null) {
                    type = num.intValue();
                } else {
                    type = AnchorBusinessType.NO_TYPE.getTYPE();
                }
                int i = type;
                String str = eVar.f65903c;
                if (str == null) {
                    str = "";
                }
                AnchorTransData anchorTransData = new AnchorTransData(i, str, null, null, Integer.valueOf(4), eVar.f65901a, null, 76, null);
                C42961az.m136380a(new C24522a(anchorTransData));
            }
        }
    }

    /* renamed from: c */
    private final void m82648c(JSONObject jSONObject) {
        boolean z;
        C25101f fVar;
        boolean z2 = true;
        if (jSONObject.has("order_id") || jSONObject.has("star_atlas_id")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            fVar = this;
        } else {
            fVar = null;
        }
        C25101f fVar2 = fVar;
        if (fVar2 != null) {
            ExtensionDataRepo extensionDataRepo = this.f66254a;
            if (extensionDataRepo == null) {
                C7573i.m23583a("extensionDataRepo");
            }
            if (!C7573i.m23585a((Object) (Boolean) extensionDataRepo.getWithStarAtlasOrderPoi().getValue(), (Object) Boolean.valueOf(true))) {
                ExtensionDataRepo extensionDataRepo2 = this.f66254a;
                if (extensionDataRepo2 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                if (!C7573i.m23585a((Object) (Boolean) extensionDataRepo2.getWithStarAtlasOrderGoods().getValue(), (Object) Boolean.valueOf(true))) {
                    ExtensionDataRepo extensionDataRepo3 = this.f66254a;
                    if (extensionDataRepo3 == null) {
                        C7573i.m23583a("extensionDataRepo");
                    }
                    if (!C7573i.m23585a((Object) (Boolean) extensionDataRepo3.getWithStarAtlasOrderLink().getValue(), (Object) Boolean.valueOf(true))) {
                        ExtensionDataRepo extensionDataRepo4 = this.f66254a;
                        if (extensionDataRepo4 == null) {
                            C7573i.m23583a("extensionDataRepo");
                        }
                        if (!C7573i.m23585a((Object) (Boolean) extensionDataRepo4.getWithStarAtlasAnchor().getValue(), (Object) Boolean.valueOf(true))) {
                            z2 = false;
                        }
                    }
                }
            }
            if (!z2) {
                fVar2 = null;
            }
            if (fVar2 != null) {
                ExtensionDataRepo extensionDataRepo5 = this.f66254a;
                if (extensionDataRepo5 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo5.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo6 = this.f66254a;
                if (extensionDataRepo6 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo6.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo7 = this.f66254a;
                if (extensionDataRepo7 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo7.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo8 = this.f66254a;
                if (extensionDataRepo8 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo8.getWithStarAtlasAnchor().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo9 = this.f66254a;
                if (extensionDataRepo9 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo9.getRevertLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo10 = this.f66254a;
                if (extensionDataRepo10 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo10.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo11 = this.f66254a;
                if (extensionDataRepo11 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo11.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo12 = this.f66254a;
                if (extensionDataRepo12 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo12.getResetAnchor().invoke();
            }
        }
    }

    /* renamed from: d */
    private final void m82650d(JSONObject jSONObject) {
        boolean z;
        if (!jSONObject.has("poiInfo")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("poiInfo");
            if (jSONObject2 != null) {
                if (!jSONObject2.has("offline_store_info")) {
                    jSONObject2 = null;
                }
                if (jSONObject2 != null) {
                    JSONObject jSONObject3 = jSONObject2.getJSONObject("offline_store_info");
                    if (jSONObject3 != null) {
                        if (!jSONObject3.has("poi_id") || !jSONObject3.has("poi_name")) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            jSONObject3 = null;
                        }
                        if (jSONObject3 != null) {
                            m82651e();
                            PoiContext poiContext = new PoiContext();
                            poiContext.mSelectPoiId = jSONObject3.getString("poi_id");
                            poiContext.mSelectPoiName = jSONObject3.getString("poi_name");
                            if (jSONObject3.has("poi_longitude") && jSONObject3.has("poi_latitude")) {
                                String string = jSONObject3.getString("poi_longitude");
                                C7573i.m23582a((Object) string, "it.getString(\"poi_longitude\")");
                                poiContext.mShootPoiLng = Double.parseDouble(string);
                                String string2 = jSONObject3.getString("poi_latitude");
                                C7573i.m23582a((Object) string2, "it.getString(\"poi_latitude\")");
                                poiContext.mShootPoiLat = Double.parseDouble(string2);
                            }
                            ExtensionDataRepo extensionDataRepo = this.f66254a;
                            if (extensionDataRepo == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo.getRecordLinkAction().invoke();
                            ExtensionDataRepo extensionDataRepo2 = this.f66254a;
                            if (extensionDataRepo2 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo2.getResetLinkAction().invoke();
                            ExtensionDataRepo extensionDataRepo3 = this.f66254a;
                            if (extensionDataRepo3 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo3.getResetPoiAction().invoke();
                            ExtensionDataRepo extensionDataRepo4 = this.f66254a;
                            if (extensionDataRepo4 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo4.getResetGoodsAction().invoke();
                            ExtensionDataRepo extensionDataRepo5 = this.f66254a;
                            if (extensionDataRepo5 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo5.getResetAnchor().invoke();
                            ExtensionDataRepo extensionDataRepo6 = this.f66254a;
                            if (extensionDataRepo6 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo6.getUpdatePoiContext().invoke(PoiContext.serializeToStr(poiContext));
                            ExtensionDataRepo extensionDataRepo7 = this.f66254a;
                            if (extensionDataRepo7 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo7.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(true));
                            ExtensionDataRepo extensionDataRepo8 = this.f66254a;
                            if (extensionDataRepo8 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo8.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo9 = this.f66254a;
                            if (extensionDataRepo9 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo9.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo10 = this.f66254a;
                            if (extensionDataRepo10 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo10.getWithStarAtlasAnchor().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo11 = this.f66254a;
                            if (extensionDataRepo11 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo11.getLinkState().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo12 = this.f66254a;
                            if (extensionDataRepo12 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo12.getGoodsState().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo13 = this.f66254a;
                            if (extensionDataRepo13 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo13.getLocationState().setValue(Boolean.valueOf(false));
                            ExtensionDataRepo extensionDataRepo14 = this.f66254a;
                            if (extensionDataRepo14 == null) {
                                C7573i.m23583a("extensionDataRepo");
                            }
                            extensionDataRepo14.getAnchorState().setValue(Boolean.valueOf(false));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private final void m82652e(JSONObject jSONObject) {
        boolean z;
        if (!jSONObject.has("goods_info")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("goods_info");
            if (!jSONObject2.has("draft_id") || !jSONObject2.has("title")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                m82651e();
                JSONObject jSONObject3 = jSONObject.getJSONObject("goods_info");
                ExtensionDataRepo extensionDataRepo = this.f66254a;
                if (extensionDataRepo == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo2 = this.f66254a;
                if (extensionDataRepo2 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo2.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo3 = this.f66254a;
                if (extensionDataRepo3 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo3.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo4 = this.f66254a;
                if (extensionDataRepo4 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo4.getRecordLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo5 = this.f66254a;
                if (extensionDataRepo5 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo5.getResetLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo6 = this.f66254a;
                if (extensionDataRepo6 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo6.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo7 = this.f66254a;
                if (extensionDataRepo7 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo7.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo8 = this.f66254a;
                if (extensionDataRepo8 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo8.getResetAnchor().invoke();
                BusinessGoodsPublishModel businessGoodsPublishModel = new BusinessGoodsPublishModel(jSONObject3.getString("draft_id"), jSONObject3.getString("title"));
                ExtensionDataRepo extensionDataRepo9 = this.f66254a;
                if (extensionDataRepo9 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo9.getRestoreGoodsPublishModel().invoke(businessGoodsPublishModel.toJsonString());
                ExtensionDataRepo extensionDataRepo10 = this.f66254a;
                if (extensionDataRepo10 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo10.getLinkState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo11 = this.f66254a;
                if (extensionDataRepo11 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo11.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo12 = this.f66254a;
                if (extensionDataRepo12 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo12.getLocationState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo13 = this.f66254a;
                if (extensionDataRepo13 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo13.getAnchorState().setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: f */
    private final void m82653f(JSONObject jSONObject) {
        boolean z;
        if (!jSONObject.has("link_info")) {
            jSONObject = null;
        }
        if (jSONObject != null) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("link_info");
            if (!jSONObject2.has("link_title") || !jSONObject2.has("link_data")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                m82651e();
                JSONObject jSONObject3 = jSONObject.getJSONObject("link_info");
                ExtensionDataRepo extensionDataRepo = this.f66254a;
                if (extensionDataRepo == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo.getWithStarAtlasOrderPoi().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo2 = this.f66254a;
                if (extensionDataRepo2 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo2.getWithStarAtlasOrderGoods().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo3 = this.f66254a;
                if (extensionDataRepo3 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo3.getWithStarAtlasOrderLink().setValue(Boolean.valueOf(true));
                ExtensionDataRepo extensionDataRepo4 = this.f66254a;
                if (extensionDataRepo4 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo4.getRecordLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo5 = this.f66254a;
                if (extensionDataRepo5 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo5.getResetLinkAction().invoke();
                ExtensionDataRepo extensionDataRepo6 = this.f66254a;
                if (extensionDataRepo6 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo6.getResetPoiAction().invoke();
                ExtensionDataRepo extensionDataRepo7 = this.f66254a;
                if (extensionDataRepo7 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo7.getResetGoodsAction().invoke();
                ExtensionDataRepo extensionDataRepo8 = this.f66254a;
                if (extensionDataRepo8 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo8.getResetAnchor().invoke();
                ExtensionDataRepo extensionDataRepo9 = this.f66254a;
                if (extensionDataRepo9 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo9.getUpdateLink().invoke(jSONObject3.getString("link_data"));
                ExtensionDataRepo extensionDataRepo10 = this.f66254a;
                if (extensionDataRepo10 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo10.getLinkState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo11 = this.f66254a;
                if (extensionDataRepo11 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo11.getGoodsState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo12 = this.f66254a;
                if (extensionDataRepo12 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo12.getLocationState().setValue(Boolean.valueOf(false));
                ExtensionDataRepo extensionDataRepo13 = this.f66254a;
                if (extensionDataRepo13 == null) {
                    C7573i.m23583a("extensionDataRepo");
                }
                extensionDataRepo13.getAnchorState().setValue(Boolean.valueOf(false));
            }
        }
    }

    @C7709l
    public final void onJsBroacastReceiver(C27994k kVar) {
        C25101f fVar;
        boolean z;
        C25101f fVar2;
        JSONObject jSONObject;
        C7573i.m23587b(kVar, "broadCastEvent");
        try {
            String string = kVar.f73730b.getString("eventName");
            if (string != null) {
                String str = null;
                if (!C7573i.m23585a((Object) string, (Object) "star_atlas_event")) {
                    string = null;
                }
                if (string != null) {
                    if (!kVar.f73730b.has("data")) {
                        string = null;
                    }
                    if (string != null) {
                        JSONObject jSONObject2 = kVar.f73730b.getJSONObject("data");
                        if (jSONObject2.has("order_id")) {
                            fVar = this;
                        } else {
                            fVar = null;
                        }
                        C25101f fVar3 = fVar;
                        if (fVar3 != null) {
                            if (getStarAtlasOrderId() != Long.parseLong(jSONObject2.getString("order_id"))) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                fVar3 = null;
                            }
                            if (fVar3 != null) {
                                if (!jSONObject2.has("component_type")) {
                                    jSONObject2.put("component_type", 0);
                                }
                                switch (jSONObject2.getInt("component_type")) {
                                    case 0:
                                        C7573i.m23582a((Object) jSONObject2, "data");
                                        m82648c(jSONObject2);
                                        break;
                                    case 1:
                                        C7573i.m23582a((Object) jSONObject2, "data");
                                        m82653f(jSONObject2);
                                        break;
                                    case 2:
                                        C7573i.m23582a((Object) jSONObject2, "data");
                                        m82650d(jSONObject2);
                                        break;
                                    case 3:
                                        C7573i.m23582a((Object) jSONObject2, "data");
                                        m82652e(jSONObject2);
                                        break;
                                    case 4:
                                        C7573i.m23582a((Object) jSONObject2, "data");
                                        m82647b(jSONObject2);
                                        break;
                                }
                                if (jSONObject2.has("order_id")) {
                                    fVar2 = this;
                                } else {
                                    fVar2 = null;
                                }
                                if (fVar2 != null) {
                                    setStarAtlasOrderId(Long.parseLong(jSONObject2.getString("order_id")));
                                }
                                String optString = jSONObject2.optString("channel");
                                C35542a aVar = this.f66259n;
                                if (aVar != null) {
                                    str = aVar.mo88234d();
                                }
                                C25006o b = C25006o.m82327b(str);
                                C7573i.m23582a((Object) b, "PublishExtensionModel.fr…taContainer?.publishData)");
                                if (TextUtils.isEmpty(b.f65954q)) {
                                    jSONObject = new JSONObject();
                                } else {
                                    jSONObject = new JSONObject(b.f65954q);
                                }
                                b.f65954q = jSONObject.put("channel", optString).toString();
                                C35542a aVar2 = this.f66259n;
                                if (aVar2 != null) {
                                    aVar2.mo88231a(C25006o.m82326a(b));
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }
}
