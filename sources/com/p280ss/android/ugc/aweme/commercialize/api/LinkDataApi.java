package com.p280ss.android.ugc.aweme.commercialize.api;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.commercialize.log.C24952c;
import com.p280ss.android.ugc.aweme.commercialize.model.LinkData;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25293bu;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import java.util.Map;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.LinkDataApi */
public final class LinkDataApi {

    /* renamed from: a */
    public static final String f64786a = Api.f60502b;

    /* renamed from: b */
    private static final RealApi f64787b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f64786a).create(RealApi.class));

    /* renamed from: c */
    private static String f64788c = null;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.api.LinkDataApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/api/ad/v1/adlink/")
        C1592h<C24546e> requestLinkData(@C7744t(mo20436a = "ad_from") String str, @C7744t(mo20436a = "item_ids") String str2, @C7744t(mo20436a = "pull_type") Integer num, @C7744t(mo20436a = "last_item_ids") String str3, @C7744t(mo20436a = "pre_item_ids") String str4, @C7744t(mo20436a = "mac_address") String str5);
    }

    /* renamed from: a */
    static final /* synthetic */ Object m80564a(C1592h hVar) throws Exception {
        if (hVar.mo6887c()) {
            return null;
        }
        if (!hVar.mo6889d()) {
            Map<String, LinkData> map = ((C24546e) hVar.mo6890e()).f64790a;
            for (String str : map.keySet()) {
                LinkData linkData = (LinkData) map.get(str);
                if (linkData != null) {
                    linkData.setLinkType(1);
                    if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(str) != null) {
                        Aweme rawAdAwemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getRawAdAwemeById(str);
                        if (C25268bg.m83039a(rawAdAwemeById) == null || C25268bg.m83039a(rawAdAwemeById).getLinkType() == 1) {
                            C25268bg.m83041a(rawAdAwemeById, linkData);
                            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateRawAdAweme(rawAdAwemeById);
                        }
                    } else if (((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str) != null) {
                        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
                        if (C25268bg.m83039a(awemeById) == null || C25268bg.m83039a(awemeById).getLinkType() == 1) {
                            C25268bg.m83041a(awemeById, linkData);
                            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(awemeById);
                        }
                    } else {
                        C25268bg.m83040a().put(str, linkData);
                    }
                    C24952c.m81882a(str, linkData);
                }
            }
            return null;
        }
        throw hVar.mo6891f();
    }

    /* renamed from: a */
    public static void m80566a(String str, List<Aweme> list) {
        m80567a(str, list, null);
    }

    /* renamed from: a */
    private static void m80567a(String str, List<Aweme> list, Integer num) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                Aweme aweme = (Aweme) list.get(i);
                if (aweme != null) {
                    sb2.append(aweme.getAid());
                    if (i != list.size() - 1) {
                        sb2.append(",");
                    }
                    if (aweme.needPreloadAdLink()) {
                        sb.append(aweme.getAid());
                        if (i != list.size() - 1) {
                            sb.append(",");
                        }
                        C24952c.f65801b.mo65239a(aweme.getAid());
                    }
                }
            }
            if (sb.length() > 0) {
                m80565a(str, sb.toString(), null, null, null);
            }
            f64788c = sb2.toString();
        }
    }

    /* renamed from: a */
    private static void m80565a(String str, String str2, String str3, String str4, Integer num) {
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0) {
            f64787b.requestLinkData(str, str2, num, str3, str4, C25293bu.m83101a()).mo6875a(C24544c.f64789a);
        }
    }
}
