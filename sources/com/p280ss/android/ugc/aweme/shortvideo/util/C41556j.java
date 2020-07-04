package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.text.TextUtils;
import com.google.gson.C6600e;
import com.google.gson.p277b.C6597a;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishModel;
import com.p280ss.android.ugc.aweme.shortvideo.model.BusinessGoodsPublishSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.j */
public final class C41556j {

    /* renamed from: a */
    private static BusinessGoodsPublishSetting f108025a;

    /* renamed from: a */
    public static void m132334a() {
        f108025a = null;
    }

    /* renamed from: c */
    private static synchronized BusinessGoodsPublishSetting m132340c() {
        BusinessGoodsPublishSetting businessGoodsPublishSetting;
        synchronized (C41556j.class) {
            if (f108025a == null) {
                Iterator it = m132339b().iterator();
                while (true) {
                    if (it.hasNext()) {
                        BusinessGoodsPublishSetting businessGoodsPublishSetting2 = (BusinessGoodsPublishSetting) it.next();
                        try {
                            if (((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID().equals(businessGoodsPublishSetting2.getUserId())) {
                                f108025a = businessGoodsPublishSetting2;
                                break;
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            businessGoodsPublishSetting = f108025a;
        }
        return businessGoodsPublishSetting;
    }

    /* renamed from: b */
    private static List<BusinessGoodsPublishSetting> m132339b() {
        String str = (String) C23060u.m75742a().mo60077g().mo59877d();
        if (!TextUtils.isEmpty(str)) {
            return (List) new C6600e().mo15975a(str, new C6597a<List<BusinessGoodsPublishSetting>>() {
            }.type);
        }
        return new ArrayList();
    }

    /* renamed from: a */
    public static void m132335a(BusinessGoodsPublishModel businessGoodsPublishModel) {
        BusinessGoodsPublishSetting c = m132340c();
        if (c == null) {
            c = new BusinessGoodsPublishSetting();
            c.setUserId(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUserID());
        }
        List goodsPublishModels = c.getGoodsPublishModels();
        if (goodsPublishModels == null) {
            goodsPublishModels = new ArrayList();
        } else {
            goodsPublishModels.remove(businessGoodsPublishModel);
        }
        if (businessGoodsPublishModel != null) {
            goodsPublishModels.add(businessGoodsPublishModel);
        }
        c.setGoodsPublishModels(goodsPublishModels);
        m132336a(c);
    }

    /* renamed from: b */
    public static BusinessGoodsPublishModel m132338b(String str) {
        if (m132340c() == null) {
            return null;
        }
        for (BusinessGoodsPublishModel businessGoodsPublishModel : f108025a.getGoodsPublishModels()) {
            if (businessGoodsPublishModel != null && TextUtils.equals(str, businessGoodsPublishModel.videoPath)) {
                return businessGoodsPublishModel;
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m132336a(BusinessGoodsPublishSetting businessGoodsPublishSetting) {
        List b = m132339b();
        b.remove(businessGoodsPublishSetting);
        b.add(businessGoodsPublishSetting);
        C23060u.m75742a().mo60077g().mo59871a(new C6600e().mo15979b((Object) b));
        f108025a = businessGoodsPublishSetting;
    }

    /* renamed from: a */
    public static void m132337a(String str) {
        if (!TextUtils.isEmpty(str)) {
            BusinessGoodsPublishSetting c = m132340c();
            if (c != null) {
                List goodsPublishModels = c.getGoodsPublishModels();
                if (goodsPublishModels != null && goodsPublishModels.size() != 0) {
                    Iterator it = goodsPublishModels.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        BusinessGoodsPublishModel businessGoodsPublishModel = (BusinessGoodsPublishModel) it.next();
                        if (businessGoodsPublishModel != null && TextUtils.equals(str, businessGoodsPublishModel.videoPath)) {
                            goodsPublishModels.remove(businessGoodsPublishModel);
                            break;
                        }
                    }
                    c.setGoodsPublishModels(goodsPublishModels);
                    List b = m132339b();
                    b.remove(c);
                    b.add(c);
                    C23060u.m75742a().mo60077g().mo59871a(new C6600e().mo15979b((Object) b));
                }
            }
        }
    }
}
