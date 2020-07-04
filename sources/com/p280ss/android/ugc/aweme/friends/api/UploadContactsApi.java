package com.p280ss.android.ugc.aweme.friends.api;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.bytedance.common.utility.C6306c;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6455f;
import com.bytedance.retrofit2.p264b.C6456g;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p264b.C6474y;
import com.google.gson.C6600e;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.model.ContactModel;
import com.p280ss.android.ugc.aweme.friends.model.DouyinContactModel;
import com.p280ss.android.ugc.aweme.friends.model.UploadContactsResult;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.friends.api.UploadContactsApi */
public final class UploadContactsApi {

    /* renamed from: a */
    private static final UploadContactsService f78999a = ((UploadContactsService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(UploadContactsService.class));

    /* renamed from: com.ss.android.ugc.aweme.friends.api.UploadContactsApi$UploadContactsService */
    public interface UploadContactsService {
        @C6456g
        @C6468s(mo15750a = "/aweme/v1/upload/contacts/")
        C12466b<String> uploadContacts(@C6474y(mo15757a = "need_unregistered_user") String str, @C6455f Map<String, String> map);

        @C6456g
        @C6468s(mo15750a = "/aweme/v1/upload/hashcontacts/")
        C12466b<UploadContactsResult> uploadHashContacts(@C6474y(mo15757a = "need_unregistered_user") String str, @C6455f Map<String, String> map);
    }

    /* renamed from: a */
    public static void m98490a(List<DouyinContactModel> list) throws Exception {
        HashMap hashMap = new HashMap();
        if (!C6307b.m19566a((Collection<T>) list)) {
            hashMap.put("contact", new C6600e().mo15979b((Object) list));
        }
        f78999a.uploadContacts("0", hashMap).execute();
    }

    /* renamed from: a */
    public static UploadContactsResult m98489a(List<DouyinContactModel> list, int i) throws Exception {
        String str;
        String str2;
        HashMap hashMap = new HashMap();
        if (!C6307b.m19566a((Collection<T>) list)) {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            ArrayList arrayList = new ArrayList(list.size());
            for (DouyinContactModel douyinContactModel : list) {
                for (String str3 : douyinContactModel.phoneNumber) {
                    if (str3 != null) {
                        str = C6306c.m19562a(instance.digest(douyinContactModel.nationalNumber(str3).getBytes("UTF-8")));
                    } else {
                        str = "";
                    }
                    if (!TextUtils.isEmpty(douyinContactModel.name)) {
                        str2 = C6306c.m19562a(instance.digest(douyinContactModel.name.getBytes("UTF-8")));
                    } else {
                        str2 = "";
                    }
                    arrayList.add(new ContactModel(str, str2));
                }
            }
            hashMap.put("contact", JSON.createAdapterGsonBuilder().mo15983a().mo15992f().mo15979b((Object) arrayList));
        }
        NetUtil.putCommonParams(hashMap, true);
        return (UploadContactsResult) f78999a.uploadHashContacts("1", hashMap).execute().f33302b;
    }
}
