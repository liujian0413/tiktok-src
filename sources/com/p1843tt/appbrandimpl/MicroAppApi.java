package com.p1843tt.appbrandimpl;

import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33368b;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33450a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33458c;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33459d;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33462f;
import com.p280ss.android.ugc.aweme.utils.C43077dz;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;
import retrofit2.p363b.C7748x;

/* renamed from: com.tt.appbrandimpl.MicroAppApi */
public final class MicroAppApi {

    /* renamed from: a */
    private static final IRetrofit f120021a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: b */
    private static IRetrofitService f120022b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.tt.appbrandimpl.MicroAppApi$RealApi */
    public interface RealApi {
        @C7730f
        C18253l<String> executeGet(int i, @C7748x String str);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/collect/list/")
        C18253l<C33368b> getCollectMicroAppList(@C7744t(mo20436a = "cursor") int i, @C7744t(mo20436a = "count") int i2);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/follow/relation/")
        C18253l<C33458c> getFollowRelation(@C7744t(mo20436a = "from_user_token") String str, @C7744t(mo20436a = "to_user_id") long j);

        @C7730f(mo20420a = "https://gate.snssdk.com/developer/api/get_gid/")
        C18253l<C33450a> getGid(@C7744t(mo20436a = "alias_id") String str);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/record/list/")
        C18253l<C33459d> getMicroAppList(@C7744t(mo20436a = "page") int i, @C7744t(mo20436a = "page_size") int i2, @C7744t(mo20436a = "list_type") int i3);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/mutual/follow/")
        C18253l<C33462f> mutualFollowUser(@C7744t(mo20436a = "from_user_id") long j, @C7744t(mo20436a = "to_user_id") long j2, @C7744t(mo20436a = "sec_from_user_id") String str);

        @C7739o(mo20429a = "https://aweme.snssdk.com/aweme/v1/microapp/collect/update/")
        C18253l<Object> updateCollectedMicroAppStatus(@C7744t(mo20436a = "micro_app_id") String str, @C7744t(mo20436a = "action") int i);

        @C7730f(mo20420a = "https://aweme.snssdk.com/aweme/v1/microapp/record/update/")
        C18253l<Object> updateMicroRecord(@C7744t(mo20436a = "schema") String str);
    }

    /* renamed from: a */
    public static C33450a m146350a(String str) throws Exception {
        try {
            return (C33450a) ((RealApi) f120021a.create(RealApi.class)).getGid(str).get();
        } catch (ExecutionException e) {
            throw f120022b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C33368b m146349a(int i, int i2) throws Exception {
        try {
            return (C33368b) ((RealApi) f120021a.create(RealApi.class)).getCollectMicroAppList(i, 20).get();
        } catch (ExecutionException e) {
            throw f120022b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C33458c m146351a(String str, long j) throws Exception {
        try {
            return (C33458c) ((RealApi) f120021a.create(RealApi.class)).getFollowRelation(str, j).get();
        } catch (ExecutionException e) {
            throw f120022b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C33462f m146353a(long j, long j2) throws Exception {
        try {
            return (C33462f) ((RealApi) f120021a.create(RealApi.class)).mutualFollowUser(j, j2, C43077dz.m136657a().mo104733b(String.valueOf(j))).get();
        } catch (ExecutionException e) {
            throw f120022b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C33459d m146352a(int i, int i2, int i3) throws Exception {
        try {
            return (C33459d) ((RealApi) f120021a.create(RealApi.class)).getMicroAppList(i, i2, i3).get();
        } catch (ExecutionException e) {
            throw f120022b.propagateCompatibleException(e);
        }
    }
}
