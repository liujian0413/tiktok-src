package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.os.Bundle;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage;
import com.p280ss.android.ugc.aweme.p313im.sdk.share.model.PureDataSharePackage.C31821b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7577n;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareStickerContent */
public final class ShareStickerContent extends BaseContent {
    public static final Companion Companion = new Companion(null);
    @C6593c(mo15949a = "video_cover_urls")
    private List<UrlModel> awemeCoverList;
    @C6593c(mo15949a = "cover_url")
    private UrlModel cover;
    @C6593c(mo15949a = "sticker_id")
    private String stickerId = "";
    @C6593c(mo15949a = "text")
    private String title = "";
    @C6593c(mo15949a = "user_count")
    private Long userCount = Long.valueOf(0);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.ShareStickerContent$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C7571f fVar) {
            this();
        }

        public final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
            boolean z;
            C7573i.m23587b(sharePackage, "sharePackage");
            ShareStickerContent shareStickerContent = new ShareStickerContent();
            Bundle bundle = sharePackage.f20186l;
            shareStickerContent.setStickerId(bundle.getString("sticker_id"));
            shareStickerContent.setTitle(bundle.getString("sticker_name"));
            shareStickerContent.setUserCount(Long.valueOf(bundle.getLong("user_count")));
            Serializable serializable = bundle.getSerializable("video_cover");
            if (!(serializable instanceof UrlModel)) {
                serializable = null;
            }
            shareStickerContent.setCover((UrlModel) serializable);
            String string = bundle.getString("aweme_cover_list");
            if (string != null) {
                CharSequence charSequence = string;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Object parseObject = JSON.parseObject(string, List.class);
                    if (!C7577n.m23623c(parseObject)) {
                        parseObject = null;
                    }
                    shareStickerContent.setAwemeCoverList((List) parseObject);
                }
            }
            return shareStickerContent;
        }
    }

    public static final ShareStickerContent fromSharePackage(SharePackage sharePackage) {
        return Companion.fromSharePackage(sharePackage);
    }

    public final List<UrlModel> getAwemeCoverList() {
        return this.awemeCoverList;
    }

    public final UrlModel getCover() {
        return this.cover;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final SharePackage generateSharePackage() {
        PureDataSharePackage a = C31821b.m103274a("sticker");
        a.f20186l.putSerializable("video_cover", this.cover);
        return a;
    }

    public final String getMsgHint() {
        String string = C6399b.m19921a().getResources().getString(R.string.a2y, new Object[]{this.title});
        C7573i.m23582a((Object) string, "AppContextManager.getApp…_transmit_sticker, title)");
        return string;
    }

    public final void setAwemeCoverList(List<UrlModel> list) {
        this.awemeCoverList = list;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }
}
