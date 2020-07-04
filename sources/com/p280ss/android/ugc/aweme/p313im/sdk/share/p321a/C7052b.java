package com.p280ss.android.ugc.aweme.p313im.sdk.share.p321a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.C6892b;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.abtest.C6928b;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.BaseContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.OnlyPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SelfStoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareAwemeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareChallengeContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCompilationContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareCouponContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareGoodWindowContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareLiveContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMiniAppContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareMusicContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.SharePoiContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareRankingListContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareStickerContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareUserContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.ShareWebContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryPictureContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryReplyContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.StoryVideoContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.model.TextContent;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30963v;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30981y;
import com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.upload.EncryptUrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.p314d.C6959c;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C31858ad;
import com.p280ss.android.ugc.aweme.p313im.sdk.utils.C7058be;
import com.p280ss.android.ugc.aweme.p313im.sdk.widget.ImShareDialog.C31977a;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMContact;
import com.p280ss.android.ugc.aweme.p313im.service.model.IMUser;
import com.p280ss.android.ugc.aweme.p313im.service.model.ShareCompleteEvent;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.b */
public final class C7052b {

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.a.b$a */
    public interface C7053a {
        void onShare(String str);
    }

    /* renamed from: a */
    public static boolean m21960a(SharePackage sharePackage) {
        return TextUtils.equals("aweme", sharePackage.f20181g);
    }

    /* renamed from: a */
    public static void m21956a(SharePackage sharePackage, final IMUser iMUser, final String str) {
        BaseContent b = m21961b(sharePackage);
        if (TextUtils.equals(sharePackage.f20181g, "poi")) {
            final SharePoiContent sharePoiContent = (SharePoiContent) b;
            if (sharePoiContent != null) {
                String uri = sharePoiContent.getMapUrl().getUri();
                if (uri.startsWith("file://")) {
                    C30963v.m100755a().mo81335a(uri.substring(7), (C30981y) new C30981y() {
                        /* renamed from: a */
                        public final void mo18257a() {
                        }

                        /* renamed from: a */
                        public final void mo18258a(double d) {
                        }

                        /* renamed from: a */
                        public final void mo18261a(Throwable th) {
                        }

                        /* renamed from: a */
                        public final void mo18259a(String str) {
                            C7052b.m21954a(iMUser, str, (BaseContent) sharePoiContent);
                        }

                        /* renamed from: a */
                        public final void mo18260a(String str, UrlModel urlModel) {
                            sharePoiContent.setMapUrl(urlModel);
                            C7052b.m21954a(iMUser, str, (BaseContent) sharePoiContent);
                        }
                    });
                } else {
                    m21954a(iMUser, str, b);
                }
            }
        } else {
            m21954a(iMUser, str, b);
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m21959a(List list, String str, SharePackage sharePackage, BaseContent baseContent, C6892b bVar) {
        m21958a(list, str, sharePackage, baseContent);
        if (bVar != null) {
            bVar.run(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public static void m21958a(List<IMContact> list, String str, SharePackage sharePackage, BaseContent baseContent) {
        if (baseContent instanceof TextContent) {
            baseContent = TextContent.obtain((TextContent) baseContent);
        } else if (baseContent == null) {
            baseContent = m21961b(sharePackage);
        }
        if (baseContent instanceof StoryPictureContent) {
            ((StoryPictureContent) baseContent).setMassMsg(1);
        } else if (baseContent instanceof StoryVideoContent) {
            ((StoryVideoContent) baseContent).setMassMsg(1);
        }
        if (list != null && !list.isEmpty()) {
            final List a = C6959c.m21651a((IMContact[]) list.toArray(new IMContact[0]));
            final boolean z = a.size() > 1;
            C30963v.m100755a();
            String a2 = C30963v.m100756a(baseContent);
            if (!TextUtils.isEmpty(a2)) {
                C30963v a3 = C30963v.m100755a();
                final BaseContent baseContent2 = baseContent;
                final String str2 = str;
                final SharePackage sharePackage2 = sharePackage;
                final List<IMContact> list2 = list;
                C70552 r0 = new C30981y() {
                    /* renamed from: a */
                    public final void mo18257a() {
                    }

                    /* renamed from: a */
                    public final void mo18258a(double d) {
                    }

                    /* renamed from: a */
                    public final void mo18261a(Throwable th) {
                    }

                    /* renamed from: a */
                    public final void mo18259a(String str) {
                        C7052b.m21957a(a, str2, baseContent2);
                        C7052b.m21955a(sharePackage2, (IMContact) list2.get(0), z);
                    }

                    /* renamed from: a */
                    public final void mo18260a(String str, UrlModel urlModel) {
                        if (baseContent2 instanceof SharePoiContent) {
                            ((SharePoiContent) baseContent2).setMapUrl(urlModel);
                        } else if (baseContent2 instanceof OnlyPictureContent) {
                            ((OnlyPictureContent) baseContent2).setUrl(urlModel);
                        } else if (baseContent2 instanceof StoryPictureContent) {
                            ((StoryPictureContent) baseContent2).setUrl((EncryptUrlModel) urlModel);
                        }
                        C7052b.m21957a(a, str2, baseContent2);
                        C7052b.m21955a(sharePackage2, (IMContact) list2.get(0), z);
                    }
                };
                a3.mo81334a(a2, baseContent, (C30981y) r0);
                return;
            }
            m21957a(a, str, baseContent);
            m21955a(sharePackage, (IMContact) list.get(0), z);
        }
    }

    /* renamed from: a */
    public static void m21957a(List<String> list, String str, BaseContent baseContent) {
        C31858ad.m103406a();
        C31858ad.m103407a(list.size());
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        C7058be.m21980a().mo18271b(list, (List<BaseContent>) arrayList);
    }

    /* renamed from: a */
    public static void m21955a(SharePackage sharePackage, IMContact iMContact, boolean z) {
        if (TextUtils.equals(sharePackage.f20181g, "game")) {
            C9738o.m28693a(C6399b.m19921a(), (int) R.string.bpe);
            return;
        }
        String string = sharePackage.f20186l.getString("aid");
        C7705c a = C7705c.m23799a();
        ShareCompleteEvent shareCompleteEvent = new ShareCompleteEvent(iMContact, z, sharePackage.f20181g, sharePackage.f20186l.getString("enter_from"), string);
        a.mo20394d(shareCompleteEvent);
    }

    /* renamed from: c */
    private static ShareAwemeContent m21962c(SharePackage sharePackage) {
        if (sharePackage.f20186l.getInt("aweme_type") == 2) {
            return SharePictureContent.fromSharePackage(sharePackage);
        }
        return ShareAwemeContent.fromSharePackage(sharePackage);
    }

    /* renamed from: b */
    public static BaseContent m21961b(SharePackage sharePackage) {
        String str = sharePackage.f20181g;
        if (TextUtils.equals("aweme", str)) {
            return m21962c(sharePackage);
        }
        if (TextUtils.equals("poi", str)) {
            return SharePoiContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("music", str)) {
            return ShareMusicContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("challenge", str)) {
            return ShareChallengeContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("ranking", str)) {
            return ShareRankingListContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("game", str)) {
            return ShareMiniAppContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("user", str)) {
            return ShareUserContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("web", str)) {
            return ShareWebContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("live", str)) {
            return ShareLiveContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("story_reply", str)) {
            return StoryReplyContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("story_self_reply", str)) {
            return SelfStoryReplyContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("coupon", str)) {
            return ShareCouponContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("good", str)) {
            return ShareGoodContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("good_window", str)) {
            return ShareGoodWindowContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("mix", str)) {
            return ShareCompilationContent.fromSharePackage(sharePackage);
        }
        if (TextUtils.equals("sticker", str)) {
            return ShareStickerContent.fromSharePackage(sharePackage);
        }
        return null;
    }

    /* renamed from: a */
    static final /* synthetic */ void m21952a(C6892b bVar, String str) {
        if (bVar != null) {
            bVar.run(Boolean.valueOf(false));
        }
    }

    /* renamed from: a */
    static final /* synthetic */ void m21953a(IMContact iMContact, SharePackage sharePackage, C6892b bVar) {
        m21958a(Collections.singletonList(iMContact), (String) null, sharePackage, (BaseContent) null);
        if (bVar != null) {
            bVar.run(Boolean.valueOf(true));
        }
    }

    /* renamed from: a */
    public static void m21954a(IMUser iMUser, String str, BaseContent baseContent) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(baseContent);
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(TextContent.obtain(str));
        }
        C7058be.m21980a().mo18270b(iMUser.getUid(), (List<BaseContent>) arrayList);
    }

    /* renamed from: a */
    public static void m21946a(Context context, IMContact iMContact, SharePackage sharePackage, C6892b<Boolean> bVar) {
        if (sharePackage != null) {
            new C6928b(context, new C31808c(iMContact, sharePackage, bVar)).sendMsg();
        }
    }

    /* renamed from: a */
    public static void m21947a(Context context, IMContact iMContact, SharePackage sharePackage, BaseContent baseContent, C6892b<Boolean> bVar) {
        m21950a(context, Collections.singletonList(iMContact), sharePackage, baseContent, bVar);
    }

    /* renamed from: a */
    public static void m21950a(Context context, List<IMContact> list, SharePackage sharePackage, BaseContent baseContent, C6892b<Boolean> bVar) {
        if (sharePackage != null) {
            String string = sharePackage.f20186l.getString("msg");
            IMContact[] iMContactArr = (IMContact[]) list.toArray(new IMContact[0]);
            C31809d dVar = new C31809d(context, list, sharePackage, baseContent, bVar);
            m21948a(context, sharePackage, iMContactArr, string, (C7053a) dVar, (C7053a) new C31810e(bVar));
        }
    }

    /* renamed from: a */
    public static void m21948a(Context context, SharePackage sharePackage, IMContact[] iMContactArr, String str, C7053a aVar, C7053a aVar2) {
        new C31977a(context).mo82859a(iMContactArr).mo82857a(sharePackage).mo82856a(aVar2).mo82863b(aVar).mo82855a(416).mo82862b(335).mo82858a(str).mo82861a().show();
    }

    /* renamed from: a */
    public static void m21949a(Context context, SharePackage sharePackage, IMUser[] iMUserArr, String str, C7053a aVar, C7053a aVar2) {
        new C31977a(context).mo82860a(iMUserArr).mo82857a(sharePackage).mo82856a(aVar2).mo82863b(aVar).mo82855a(416).mo82862b(335).mo82858a(str).mo82861a().show();
    }

    /* renamed from: a */
    static final /* synthetic */ void m21951a(Context context, List list, SharePackage sharePackage, BaseContent baseContent, C6892b bVar, String str) {
        C31811f fVar = new C31811f(list, str, sharePackage, baseContent, bVar);
        new C6928b(context, fVar).sendMsg();
    }
}
