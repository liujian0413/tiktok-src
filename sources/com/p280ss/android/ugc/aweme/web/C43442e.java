package com.p280ss.android.ugc.aweme.web;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.web.e */
public final class C43442e {

    /* renamed from: a */
    public static final List<String> f112516a = m137871a();

    /* renamed from: a */
    private static List<String> m137871a() {
        ArrayList arrayList = new ArrayList();
        IAmeJsMessageHandlerService iAmeJsMessageHandlerService = (IAmeJsMessageHandlerService) ServiceManager.get().getService(IAmeJsMessageHandlerService.class);
        if (iAmeJsMessageHandlerService != null && !C6307b.m19566a((Collection<T>) iAmeJsMessageHandlerService.getSafeHosts())) {
            arrayList.addAll(iAmeJsMessageHandlerService.getSafeHosts());
        }
        arrayList.add("snssdk.com");
        arrayList.add("toutiao.com");
        arrayList.add("neihanshequ.com");
        arrayList.add("youdianyisi.com");
        arrayList.add("admin.bytedance.com");
        arrayList.add("wallet.amemv.com");
        arrayList.add("iesdouyin.com");
        arrayList.add("douyincdn.com");
        arrayList.add("douyinact.com");
        arrayList.add("douyin.com");
        arrayList.add("chengzijianzhan.com");
        arrayList.add("ad.toutiao.com");
        arrayList.add("s3.pstatp.com");
        arrayList.add("s0.ipstatp.com");
        arrayList.add("s.ipstatp.com");
        arrayList.add("m.toutiaocdn.cn");
        arrayList.add("m.toutiaocdn.com");
        arrayList.add("m.toutiaocdn.net");
        arrayList.add("m.zjurl.cn");
        arrayList.add("douyinvideo.net");
        arrayList.add("lb.jinritemai.com");
        arrayList.add("tosv.byted.org");
        arrayList.add("amemv.com");
        arrayList.add("juliangyinqing.com");
        arrayList.add("xgfe.snssdk.com");
        arrayList.add("ixigua.com");
        arrayList.add("activity.ixigua.com");
        arrayList.add("pstatp.com");
        if (C7163a.m22363a()) {
            arrayList.add("10.95.44.104");
            arrayList.add("10.95.53.40");
            arrayList.add("10.224.23.88");
            arrayList.add("10.93.247.247");
            arrayList.add("test-aweme.snssdk.com");
        }
        List list = (List) C23060u.m75742a().mo60058ab().mo59877d();
        if (list == null || list.size() <= 0) {
            return arrayList;
        }
        HashSet hashSet = new HashSet(arrayList);
        hashSet.addAll(list);
        return new ArrayList(hashSet);
    }
}
