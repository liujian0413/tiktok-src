package com.p280ss.android.ugc.aweme.initializer;

import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.util.C0902i;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.common.util.concurrent.C18253l;
import com.google.gson.C6600e;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p280ss.android.ugc.aweme.commercialize.C24503a;
import com.p280ss.android.ugc.aweme.commercialize.C24610d;
import com.p280ss.android.ugc.aweme.commercialize.C24751g;
import com.p280ss.android.ugc.aweme.commercialize.C24983m;
import com.p280ss.android.ugc.aweme.commercialize.C25008n;
import com.p280ss.android.ugc.aweme.commercialize.link.C24779h;
import com.p280ss.android.ugc.aweme.commercialize.model.C25006o;
import com.p280ss.android.ugc.aweme.commercialize.star.C25093e;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.freeflowcard.p1279b.C29972a;
import com.p280ss.android.ugc.aweme.opensdk.share.C34684d;
import com.p280ss.android.ugc.aweme.p962f.C21689a;
import com.p280ss.android.ugc.aweme.photo.PhotoContext;
import com.p280ss.android.ugc.aweme.poi.p335ui.publish.C35404b;
import com.p280ss.android.ugc.aweme.port.internal.C35614f;
import com.p280ss.android.ugc.aweme.port.internal.ServiceConnectionImpl;
import com.p280ss.android.ugc.aweme.port.p1479in.C35541ai;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.publish.AVPublishContentType;
import com.p280ss.android.ugc.aweme.services.publish.AnchorPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.CouponPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.GamePublishModel;
import com.p280ss.android.ugc.aweme.services.publish.GoodsPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.I18nShopPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.IAVPublishExtension;
import com.p280ss.android.ugc.aweme.services.publish.LinkPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.LocationActivityPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.MediumPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.MicroAppPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PoiPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.PostPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.Publish;
import com.p280ss.android.ugc.aweme.services.publish.SeedPublishModel;
import com.p280ss.android.ugc.aweme.services.publish.WikiPublishModel;
import com.p280ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C38455ap;
import com.p280ss.android.ugc.aweme.shortvideo.CreateAwemeResponse;
import com.p280ss.android.ugc.aweme.shortvideo.model.StarAtlasPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.p1557d.C39327e;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41224a;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41244ae;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41348dt;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41357g;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41364i;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41372k;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41380l;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41389o;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41396q;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41401r;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41408u;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41423v;
import com.p280ss.android.ugc.aweme.shortvideo.p1617ui.C41430y;
import com.p280ss.android.ugc.aweme.shortvideo.publish.C40231c;
import com.p280ss.android.ugc.aweme.shortvideo.publish.CreateAwemeApi;
import com.p280ss.android.ugc.aweme.shortvideo.publish.CreatePhotoApi;
import com.p280ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C43168s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.initializer.l */
public final class C32138l implements C35541ai {
    /* renamed from: a */
    public final boolean mo83281a(FragmentActivity fragmentActivity, Intent intent, Class<? extends Service> cls, String str, String str2) {
        StringBuilder sb = new StringBuilder("PublishServiceImpl process publish intent:");
        sb.append(intent.getExtras());
        C6921a.m21552a(4, "Tools-Client", sb.toString());
        Aweme aweme = (Aweme) intent.getSerializableExtra("aweme");
        CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) intent.getSerializableExtra("aweme_response");
        if (aweme != null) {
            C42880h.m136156a("processPublish.processPublish()");
            EventActivityComponent.m76450a((Activity) fragmentActivity, (C38455ap) createAwemeResponse, (Runnable) new C32140m(aweme, fragmentActivity, intent));
            return true;
        } else if (intent.hasExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT")) {
            C42880h.m136156a("processPublish. EXTRA_AWEME_DRAFT ");
            return true;
        } else {
            if (!((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().uploadOptimizeForPie() && !intent.hasExtra(str) && !intent.hasExtra("extra_photo_publish_args") && !intent.hasExtra(str2) && m104370c() && VERSION.SDK_INT >= 28 && Publish.PublishBundle != null) {
                intent.putExtras(Publish.PublishBundle);
                Publish.PublishBundle = null;
            }
            if (!m104369a(intent, str, str2)) {
                return false;
            }
            Intent intent2 = new Intent(fragmentActivity, cls);
            intent2.putExtras(intent);
            try {
                fragmentActivity.startService(intent2);
                if (!intent.getBooleanExtra("synthetise_only", false)) {
                    fragmentActivity.bindService(intent2, new ServiceConnectionImpl(fragmentActivity), 1);
                }
                return true;
            } catch (SecurityException e) {
                StringBuilder sb2 = new StringBuilder("PublishServiceImpl.processPublish() startService error ");
                sb2.append(e.toString());
                C42880h.m136156a(sb2.toString());
                return false;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo83280a() {
        if (C6399b.m19944t()) {
            return true;
        }
        return C29972a.m98273a().mo76168a(false);
    }

    /* renamed from: c */
    private static boolean m104370c() {
        if ((Build.MODEL == null || !Build.MODEL.equalsIgnoreCase("SM-J610F")) && !((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().enableUploadFallback()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final List<C40231c> mo83283b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C25008n());
        arrayList.add(new C24983m());
        arrayList.add(new C35404b());
        arrayList.add(new C24610d());
        arrayList.add(new C24751g());
        arrayList.add(new C34684d());
        arrayList.add(new C24503a());
        return arrayList;
    }

    /* renamed from: a */
    public final HashMap<String, String> mo83274a(Object obj) {
        String str;
        HashMap<String, String> hashMap = new HashMap<>();
        if (obj instanceof BaseShortVideoContext) {
            return hashMap;
        }
        PhotoContext photoContext = (PhotoContext) obj;
        C25006o a = C25006o.m82323a(photoContext);
        if (a.f65943f != null) {
            hashMap.put("shop_order_share", new C6600e().mo15979b((Object) a.f65943f.getShopOrderShareStruct()));
        }
        String str2 = "commerce_ad_link";
        if (C25006o.m82323a(photoContext).f65938a) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        return hashMap;
    }

    /* renamed from: a */
    public final List<C0902i<Class<?>, IAVPublishExtension<?>>> mo83275a(AVPublishContentType aVPublishContentType) {
        ArrayList arrayList = new ArrayList();
        switch (aVPublishContentType) {
            case Video:
            case PhotoMovie:
                arrayList.add(C0902i.m3837a(StarAtlasPublishModel.class, new C25093e()));
                arrayList.add(C0902i.m3837a(LocationActivityPublishModel.class, new C41389o()));
                arrayList.add(C0902i.m3837a(PoiPublishModel.class, new C41408u()));
                arrayList.add(C0902i.m3837a(AnchorPublishModel.class, new C41224a()));
                arrayList.add(C0902i.m3837a(GoodsPublishModel.class, new C41372k()));
                arrayList.add(C0902i.m3837a(MicroAppPublishModel.class, new C41401r()));
                arrayList.add(C0902i.m3837a(GamePublishModel.class, new C41364i()));
                arrayList.add(C0902i.m3837a(PostPublishModel.class, new C41423v()));
                arrayList.add(C0902i.m3837a(I18nShopPublishModel.class, new C41380l()));
                arrayList.add(C0902i.m3837a(WikiPublishModel.class, new C41348dt()));
                arrayList.add(C0902i.m3837a(SeedPublishModel.class, new C41244ae()));
                arrayList.add(C0902i.m3837a(MediumPublishModel.class, new C41396q()));
                arrayList.add(C0902i.m3837a(CouponPublishModel.class, new C41357g()));
                arrayList.add(C0902i.m3837a(LinkPublishModel.class, new C24779h()));
                break;
            case Photo:
                arrayList.add(C0902i.m3837a(LocationActivityPublishModel.class, new C41389o()));
                arrayList.add(C0902i.m3837a(PoiPublishModel.class, new C41408u()));
                arrayList.add(C0902i.m3837a(GoodsPublishModel.class, new C41372k()));
                break;
            default:
                StringBuilder sb = new StringBuilder("unknown type: ");
                sb.append(aVPublishContentType.getContentType());
                throw new IllegalArgumentException(sb.toString());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo83279a(boolean z) {
        C42961az.m136380a(new C39327e(false));
    }

    /* renamed from: a */
    public final C18253l<? extends C38455ap> mo83273a(String str, LinkedHashMap<String, String> linkedHashMap) {
        return CreateAwemeApi.m128538a().createAweme(str, linkedHashMap);
    }

    /* renamed from: b */
    public final C18253l<? extends C38455ap> mo83282b(String str, LinkedHashMap<String, String> linkedHashMap) {
        return CreatePhotoApi.m128539a().createAweme(str, linkedHashMap);
    }

    /* renamed from: a */
    public final void mo83277a(BaseResponse baseResponse, int i) {
        if (baseResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse;
            if (createAwemeResponse.aweme != null) {
                createAwemeResponse.aweme.getVideo().setVideoLength(i);
            }
        }
    }

    /* renamed from: a */
    public final void mo83278a(BaseResponse baseResponse, List<InteractStickerStruct> list) {
        if (baseResponse instanceof CreateAwemeResponse) {
            CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) baseResponse;
            if (createAwemeResponse.aweme != null) {
                if (createAwemeResponse.aweme.getInteractStickerStructs() == null) {
                    createAwemeResponse.aweme.setInteractStickerStructs(new ArrayList());
                }
                ArrayList arrayList = new ArrayList(createAwemeResponse.aweme.getInteractStickerStructs());
                if (!C6307b.m19566a((Collection<T>) list)) {
                    arrayList.addAll(list);
                }
                createAwemeResponse.aweme.setInteractStickerStructs(arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo83276a(CommonItemView commonItemView, boolean z, HashMap<String, String> hashMap) {
        new C41430y(commonItemView, z, hashMap);
    }

    /* renamed from: a */
    static final /* synthetic */ void m104368a(Aweme aweme, FragmentActivity fragmentActivity, Intent intent) {
        if (aweme.getStatus().getPrivateStatus() == 1 || C43168s.m136911c(aweme)) {
            C35614f.m115057a(fragmentActivity, aweme);
            if (intent.getIntExtra("video_type", -1) == 5 && !C21689a.m72594a(aweme)) {
                ((IWaterMarkService) ServiceManager.get().getService(IWaterMarkService.class)).photoProcessService().savePhotoWithWaterMarker((PhotoContext) intent.getSerializableExtra("photoContext"), null);
            }
        } else {
            C35614f.m115058a(fragmentActivity, aweme, (PhotoContext) intent.getSerializableExtra("photoContext"));
        }
    }

    /* renamed from: a */
    private static boolean m104369a(Intent intent, String str, String str2) {
        if (((IAVService) ServiceManager.get().getService(IAVService.class)).avSettingsService().uploadOptimizeForPie()) {
            Bundle bundleExtra = intent.getBundleExtra("publish_bundle");
            if (bundleExtra == null) {
                return false;
            }
            if (bundleExtra.getSerializable(str) == null && bundleExtra.getSerializable("extra_photo_publish_args") == null && bundleExtra.getParcelable(str2) == null) {
                return false;
            }
            intent.putExtras(bundleExtra);
            return true;
        } else if (intent.hasExtra(str) || intent.hasExtra("extra_photo_publish_args") || intent.hasExtra(str2)) {
            return true;
        } else {
            return false;
        }
    }
}
