package com.p280ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6474y;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.BlockStruct;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.api.BlockApi */
public final class BlockApi {

    /* renamed from: a */
    private static final BlockService f93680a = ((BlockService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(BlockService.class));

    /* renamed from: com.ss.android.ugc.aweme.profile.api.BlockApi$BlockService */
    public interface BlockService {
        @C6457h(mo15740a = "/aweme/v1/user/block/")
        C12466b<BlockStruct> block(@C6474y(mo15757a = "user_id") String str, @C6474y(mo15757a = "block_type") int i, @C6474y(mo15757a = "source") int i2);
    }

    /* renamed from: a */
    public static BlockStruct m115432a(String str, int i) throws Exception {
        return m115433a(str, i, 0);
    }

    /* renamed from: a */
    public static BlockStruct m115433a(String str, int i, int i2) throws Exception {
        return (BlockStruct) f93680a.block(str, i, i2).execute().f33302b;
    }

    /* renamed from: a */
    public static void m115434a(Handler handler, final String str, final int i) {
        C23397p.m76735a().mo60807a(handler, new Callable() {
            public final Object call() throws Exception {
                return BlockApi.m115432a(str, i);
            }
        }, 30);
    }

    /* renamed from: a */
    public static void m115435a(Handler handler, final String str, final int i, final int i2) {
        int i3;
        C23397p a = C23397p.m76735a();
        C357222 r1 = new Callable() {
            public final Object call() throws Exception {
                return BlockApi.m115433a(str, i, i2);
            }
        };
        if (i2 == 1) {
            i3 = 32;
        } else {
            i3 = 31;
        }
        a.mo60807a(handler, r1, i3);
    }
}
