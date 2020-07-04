package com.p280ss.android.ugc.aweme.forward.api;

import bolts.C1592h;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6600e;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.param.C24203c;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.p280ss.android.ugc.aweme.forward.model.UserDynamicList;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.forward.api.ForwardApi */
public final class ForwardApi {

    /* renamed from: a */
    private static final RetrofitApi f78471a = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e).create(RetrofitApi.class));

    /* renamed from: com.ss.android.ugc.aweme.forward.api.ForwardApi$RetrofitApi */
    public interface RetrofitApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/create/forward/")
        C1592h<ForwardDetail> createForward(@C7727c(mo20417a = "forward_content") String str, @C7727c(mo20417a = "item_id") String str2, @C7727c(mo20417a = "forward_type") int i, @C7727c(mo20417a = "forward_id") String str3, @C7727c(mo20417a = "reply_id") String str4, @C7727c(mo20417a = "text_extra") String str5, @C7727c(mo20417a = "is_self_see") int i2, @C7727c(mo20417a = "reply_to_reply_id") String str6, @C7727c(mo20417a = "sticker_id") String str7, @C7727c(mo20417a = "sticker_uri") String str8, @C7727c(mo20417a = "sticker_source") int i3, @C7727c(mo20417a = "sticker_width") int i4, @C7727c(mo20417a = "sticker_height") int i5, @C7727c(mo20417a = "channel_id") int i6, @C7727c(mo20417a = "city") String str9);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/forward/delete/")
        C1592h<BaseResponse> deleteForward(@C7727c(mo20417a = "forward_id") String str);

        @C7730f(mo20420a = "/aweme/v1/forward/detail/")
        C1592h<ForwardDetail> getForwardDetail(@C7744t(mo20436a = "forward_id") String str);

        @C7730f(mo20420a = "/aweme/v1/forward/list/")
        C1592h<UserDynamicList> getUserForwardList(@C7744t(mo20436a = "user_id") String str, @C7744t(mo20436a = "sec_user_id") String str2, @C7744t(mo20436a = "max_cursor") long j, @C7744t(mo20436a = "min_cursor") long j2, @C7744t(mo20436a = "count") int i);
    }

    /* renamed from: a */
    public static C1592h<BaseResponse> m97742a(String str) {
        return f78471a.deleteForward(str);
    }

    /* renamed from: b */
    public static C1592h<ForwardDetail> m97744b(String str) {
        return f78471a.getForwardDetail(str);
    }

    /* renamed from: a */
    public static C1592h<ForwardDetail> m97741a(C24203c cVar, int i) {
        String str;
        String valueOf;
        UrlModel urlModel;
        int i2;
        int i3;
        int i4;
        C24203c cVar2 = cVar;
        C6600e a = C10944e.m32113a();
        if (cVar2.f63867d != null) {
            str = a.mo15979b((Object) cVar2.f63867d);
        } else {
            str = "[]";
        }
        String str2 = str;
        Emoji emoji = cVar2.f63869f;
        if (emoji == null) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(emoji.getId());
        }
        String str3 = valueOf;
        String str4 = null;
        if (emoji == null) {
            urlModel = null;
        } else {
            urlModel = emoji.getAnimateUrl();
        }
        if (urlModel != null) {
            str4 = urlModel.getUri();
        }
        String str5 = str4;
        if (emoji == null) {
            i2 = 0;
        } else {
            i2 = emoji.getStickerType();
        }
        if (emoji == null) {
            i3 = 0;
        } else {
            i3 = emoji.getWidth();
        }
        if (emoji == null) {
            i4 = 0;
        } else {
            i4 = emoji.getHeight();
        }
        return f78471a.createForward(cVar2.f63865b, cVar2.f63864a, cVar2.f63913j, cVar2.f63914k, cVar2.f63866c, str2, i, cVar2.f63868e, str3, str5, i2, i3, i4, cVar2.f63870g, cVar2.f63871h);
    }

    /* renamed from: a */
    public static C1592h<UserDynamicList> m97743a(String str, String str2, long j, long j2, int i) {
        return f78471a.getUserForwardList(str, str2, j, j2, i);
    }
}
