package com.p280ss.android.ugc.aweme.comment.api;

import bolts.C1592h;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.bytedance.retrofit2.p264b.C6453d;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.app.p1029d.C22915b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.p280ss.android.ugc.aweme.comment.model.CommentItemList;
import com.p280ss.android.ugc.aweme.comment.model.CommentResponse;
import com.p280ss.android.ugc.aweme.comment.model.CommentShareableResponse;
import com.p280ss.android.ugc.aweme.comment.p1101h.C24148e;
import com.p280ss.android.ugc.aweme.comment.param.C24205d;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.emoji.model.Emoji;
import com.p280ss.android.ugc.aweme.feed.C28290d;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.cache.C34047c;
import com.p280ss.android.ugc.aweme.net.cache.C34049e;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import java.util.concurrent.ExecutionException;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7730f;
import retrofit2.p363b.C7739o;
import retrofit2.p363b.C7744t;

/* renamed from: com.ss.android.ugc.aweme.comment.api.CommentApi */
public final class CommentApi {

    /* renamed from: a */
    static final IRetrofit f63688a = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(C19223b.f51890e);

    /* renamed from: b */
    private static IRetrofitService f63689b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    /* renamed from: com.ss.android.ugc.aweme.comment.api.CommentApi$RealApi */
    interface RealApi {
        @C7730f(mo20420a = "/aweme/v1/ug/comment/shareable/")
        C18253l<CommentShareableResponse> commentShareable(@C7744t(mo20436a = "comment_id") String str, @C7744t(mo20436a = "item_id") String str2);

        @C7730f(mo20420a = "/aweme/v1/comment/delete/")
        C18253l<BaseCommentResponse> deleteComment(@C7744t(mo20436a = "cid") String str);

        @C7730f(mo20420a = "/aweme/v1/comment/digg/")
        C18253l<BaseCommentResponse> diggComment(@C7744t(mo20436a = "cid") String str, @C7744t(mo20436a = "aweme_id") String str2, @C7744t(mo20436a = "digg_type") String str3, @C7744t(mo20436a = "channel_id") int i);

        @C7730f(mo20420a = "/aweme/v1/comment/list/")
        C18253l<CommentItemList> fetchCommentList(@C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "comment_style") int i2, @C7744t(mo20436a = "digged_cid") String str2, @C7744t(mo20436a = "insert_cids") String str3, @C7744t(mo20436a = "address_book_access") Integer num, @C7744t(mo20436a = "gps_access") Integer num2);

        @C7730f(mo20420a = "/aweme/v2/comment/list/")
        C1592h<CommentItemList> fetchCommentListV2(@C7744t(mo20436a = "aweme_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "insert_ids") String str2, @C7744t(mo20436a = "address_book_access") Integer num, @C7744t(mo20436a = "gps_access") Integer num2, @C7744t(mo20436a = "forward_page_type") int i2, @C7744t(mo20436a = "ad_creative_id") Long l, @C7744t(mo20436a = "channel_id") int i3, @C7744t(mo20436a = "city") String str3, @C6453d Object obj);

        @C7730f(mo20420a = "/aweme/v1/comment/story/replylist/")
        C18253l<CommentItemList> fetchStoryReplyCommentList(@C7744t(mo20436a = "comment_id") String str);

        @C7730f(mo20420a = "/aweme/v1/comment/list/reply/")
        C1592h<CommentItemList> loadMoreCommentList(@C7744t(mo20436a = "comment_id") String str, @C7744t(mo20436a = "cursor") long j, @C7744t(mo20436a = "count") int i, @C7744t(mo20436a = "top_ids") String str2, @C7744t(mo20436a = "item_id") String str3, @C7744t(mo20436a = "insert_ids") String str4, @C7744t(mo20436a = "channel_id") int i2, @C7744t(mo20436a = "city") String str5);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/comment/publish/")
        C18253l<CommentResponse> publishComment(@C7727c(mo20417a = "aweme_id") String str, @C7727c(mo20417a = "text") String str2, @C7727c(mo20417a = "reply_id") String str3, @C7727c(mo20417a = "text_extra") String str4, @C7727c(mo20417a = "is_self_see") int i, @C7727c(mo20417a = "reply_to_reply_id") String str5, @C7727c(mo20417a = "sticker_id") String str6, @C7727c(mo20417a = "sticker_uri") String str7, @C7727c(mo20417a = "sticker_source") int i2, @C7727c(mo20417a = "sticker_width") int i3, @C7727c(mo20417a = "sticker_height") int i4, @C7727c(mo20417a = "channel_id") int i5, @C7727c(mo20417a = "city") String str8, @C7727c(mo20417a = "action_type") int i6);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/saiyan/comment/top/save/")
        C18253l<BaseResponse> topComment(@C7727c(mo20417a = "aweme_id") String str, @C7727c(mo20417a = "cid") String str2, @C7727c(mo20417a = "op") int i);
    }

    /* renamed from: a */
    private static Long m79016a(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || C25329c.m83224g(aweme)) {
            return null;
        }
        return aweme.getAwemeRawAd().getCreativeId();
    }

    /* renamed from: a */
    public static CommentShareableResponse m79015a(String str, String str2) throws Exception {
        try {
            return (CommentShareableResponse) ((RealApi) f63688a.create(RealApi.class)).commentShareable(str, str2).get();
        } catch (ExecutionException e) {
            throw f63689b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static CommentResponse m79014a(C24205d dVar, int i) throws Exception {
        String valueOf;
        UrlModel urlModel;
        int i2;
        int i3;
        int i4;
        C24205d dVar2 = dVar;
        try {
            String b = dVar2.f63867d != null ? C10944e.m32113a().mo15979b((Object) dVar2.f63867d) : "[]";
            Emoji emoji = dVar2.f63869f;
            if (emoji == null) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(emoji.getId());
            }
            String str = valueOf;
            String str2 = null;
            if (emoji == null) {
                urlModel = null;
            } else {
                urlModel = emoji.getAnimateUrl();
            }
            if (urlModel != null) {
                str2 = urlModel.getUri();
            }
            String str3 = str2;
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
            CommentResponse commentResponse = (CommentResponse) ((RealApi) f63688a.create(RealApi.class)).publishComment(dVar2.f63864a, dVar2.f63865b, dVar2.f63866c, b, i, dVar2.f63868e, str, str3, i2, i3, i4, dVar2.f63870g, dVar2.f63871h, dVar2.f63917j ? 1 : 0).get();
            commentResponse.comment.setLabelInfo(commentResponse.starFakeLabel);
            commentResponse.comment.setEmoji(dVar2.f63869f);
            commentResponse.comment.setFakeId(dVar2.f63872i);
            return commentResponse;
        } catch (ExecutionException e) {
            throw f63689b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseCommentResponse m79010a(String str) throws Exception {
        try {
            return (BaseCommentResponse) ((RealApi) f63688a.create(RealApi.class)).deleteComment(str).get();
        } catch (ExecutionException e) {
            throw f63689b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseResponse m79009a(String str, String str2, boolean z) throws Exception {
        int i;
        try {
            RealApi realApi = (RealApi) f63688a.create(RealApi.class);
            if (z) {
                i = 1;
            } else {
                i = -1;
            }
            return (BaseResponse) realApi.topComment(str, str2, i).get();
        } catch (ExecutionException e) {
            throw f63689b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static BaseCommentResponse m79011a(String str, String str2, String str3, int i) throws Exception {
        try {
            return (BaseCommentResponse) ((RealApi) f63688a.create(RealApi.class)).diggComment(str, str2, str3, i).get();
        } catch (ExecutionException e) {
            throw f63689b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C1592h<CommentItemList> m79008a(String str, long j, int i, String str2, String str3, String str4, int i2, String str5) {
        return ((RealApi) f63688a.create(RealApi.class)).loadMoreCommentList(str, j, i, str2, str3, str4, i2, str5);
    }

    /* renamed from: a */
    public static CommentItemList m79012a(String str, long j, int i, int i2, String str2, String str3, int i3, int i4) throws Exception {
        try {
            return (CommentItemList) ((RealApi) f63688a.create(RealApi.class)).fetchCommentList(str, j, i, i2, str2, str3, Integer.valueOf(i3), Integer.valueOf(i4)).get();
        } catch (ExecutionException e) {
            throw f63689b.propagateCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static C1592h<CommentItemList> m79007a(String str, long j, int i, String str2, int i2, int i3, Long l, int i4, String str3) {
        C34049e eVar;
        boolean isFollowFeedEnterFullScreenDetail = C24220a.m79551a().isFollowFeedEnterFullScreenDetail();
        String str4 = str;
        Aweme awemeById = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById(str);
        if (l == null) {
            m79016a(awemeById);
        }
        if (awemeById == null || awemeById.getPreload() == null || awemeById.getPreload().commentPreload < 0) {
            eVar = null;
        } else {
            C34049e eVar2 = new C34049e();
            C34047c cVar = new C34047c();
            cVar.f88802a = "cache_comment";
            cVar.f88804c = 100000;
            cVar.f88803b = 1;
            eVar2.f88808s = cVar;
            eVar = eVar2;
        }
        return ((RealApi) f63688a.create(RealApi.class)).fetchCommentListV2(str, j, i, str2, Integer.valueOf(i2), Integer.valueOf(i3), isFollowFeedEnterFullScreenDetail ? 1 : 0, l, i4, str3, eVar);
    }

    /* renamed from: a */
    public static CommentItemList m79013a(String str, long j, int i, int i2, String str2, String str3, int i3, int i4, String str4) throws Exception {
        if (!C24148e.m79342a()) {
            return m79012a(str, j, i, i2, str2, str3, i3, i4);
        }
        m79007a(str, j, i, str3, C43161e.m136882a(), C43161e.m136884b(), (Long) null, C22915b.m75418a(str4), C28290d.m93044e());
        return null;
    }
}
