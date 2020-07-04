package com.p280ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.p1607a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.location.C32616a;
import com.p280ss.android.ugc.aweme.poi.IPOIService;
import com.p280ss.android.ugc.aweme.poi.IPOIService.C35001a;
import com.p280ss.android.ugc.aweme.poi.IPOIService.ResultType;
import com.p280ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p280ss.android.ugc.aweme.poi.search.POISearchDialog;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.poi.utils.C35452k;
import com.p280ss.android.ugc.aweme.poi.utils.C35469y;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.a.a */
public class C40703a {

    /* renamed from: b */
    private static C40703a f105831b;

    /* renamed from: a */
    public C35001a f105832a;

    /* renamed from: c */
    private long f105833c;

    /* renamed from: a */
    public static C40703a m130147a() {
        if (f105831b == null) {
            synchronized (C40703a.class) {
                f105831b = new C40703a();
            }
        }
        return f105831b;
    }

    /* renamed from: a */
    public final C40703a mo100881a(C35001a aVar) {
        this.f105832a = aVar;
        return this;
    }

    /* renamed from: b */
    private static String m130150b(Activity activity) {
        Map trickyMapByActivity = ((IAVService) ServiceManager.get().getService(IAVService.class)).getTrickyMapByActivity(activity);
        String str = "";
        if (trickyMapByActivity == null || !trickyMapByActivity.containsKey("creation_id")) {
            return str;
        }
        return (String) trickyMapByActivity.get("creation_id");
    }

    /* renamed from: a */
    public final void mo100884a(final FragmentActivity fragmentActivity) {
        if (!C32616a.m105657e()) {
            C32616a.m105655b(fragmentActivity, new C43154a() {
                /* renamed from: a */
                public final void mo71375a() {
                    C40703a.this.mo100882a((Activity) fragmentActivity);
                }

                /* renamed from: b */
                public final void mo71376b() {
                    C10761a.m31399c((Context) fragmentActivity, (int) R.string.os).mo25750a();
                }
            });
        } else {
            mo100882a((Activity) fragmentActivity);
        }
    }

    /* renamed from: a */
    public final void mo100882a(Activity activity) {
        if (System.currentTimeMillis() - this.f105833c >= 1000) {
            this.f105833c = System.currentTimeMillis();
            if (this.f105832a != null) {
                this.f105832a.mo83218a();
            }
            if (activity != null && !activity.isFinishing()) {
                IPOIService iPOIService = (IPOIService) ServiceManager.get().getService(IPOIService.class);
                if (iPOIService != null) {
                    Dialog pOISearchDialog = iPOIService.getPOISearchDialog(activity, new Bundle(), new C40706b(this, activity));
                    pOISearchDialog.setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss(DialogInterface dialogInterface) {
                            if (C40703a.this.f105832a != null) {
                                C40703a.this.f105832a.mo83220b();
                            }
                        }
                    });
                    if (pOISearchDialog instanceof POISearchDialog) {
                        ((POISearchDialog) pOISearchDialog).mo89667a(true);
                    }
                    pOISearchDialog.show();
                }
            }
        }
    }

    /* renamed from: a */
    private void m130148a(Activity activity, PoiStruct poiStruct, String str) {
        String str2;
        PoiStruct poiStruct2;
        String str3;
        if (activity != null && !activity.isFinishing()) {
            String detectIsFromEditOrStory = ((IAVService) ServiceManager.get().getService(IAVService.class)).detectIsFromEditOrStory(activity);
            String a = C35469y.m114572a(poiStruct, POIService.KEY_KEYWORD);
            if (TextUtils.isEmpty(a)) {
                str2 = "default_search_poi";
            } else {
                str2 = "search_poi";
            }
            String str4 = str2;
            if (POIService.INVALID_ID.equalsIgnoreCase(poiStruct.getPoiId())) {
                poiStruct2 = null;
            } else {
                poiStruct2 = poiStruct;
            }
            if (poiStruct2 != null) {
                String a2 = C35469y.m114572a(poiStruct, POIService.KEY_ORDER);
                String b = m130150b(activity);
                if (TextUtils.isEmpty(a2)) {
                    str3 = "-1";
                } else {
                    str3 = a2;
                }
                m130149a(b, detectIsFromEditOrStory, str4, a, str3, str, poiStruct);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo100883a(Activity activity, ResultType resultType, PoiStruct poiStruct, String str) {
        if (this.f105832a != null) {
            this.f105832a.mo83219a(resultType, poiStruct, str);
            m130148a(activity, poiStruct, str);
        }
    }

    /* renamed from: a */
    private static void m130149a(String str, String str2, String str3, String str4, String str5, String str6, PoiStruct poiStruct) {
        C22984d a = C22984d.m75611a();
        a.mo59973a("enter_from", str2).mo59973a("creation_id", str).mo59973a("poi_type", String.valueOf(poiStruct.iconType)).mo59973a("poi_id", poiStruct.poiId).mo59973a("enter_method", str3).mo59973a("content_type", "video").mo59973a("log_pb", C35469y.m114572a(poiStruct, POIService.KEY_LOGPB)).mo59973a(POIService.KEY_ORDER, str5).mo59973a("key_word", str4).mo59973a("is_media_location", poiStruct.isCandidate()).mo59973a("distance_info", poiStruct.getDistance()).mo59973a("search_region_type", str6);
        C35452k.m114513a(poiStruct, "choose_poi", a);
    }
}
