package com.p280ss.android.ugc.aweme.comment.share;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C1642a;
import com.bytedance.common.utility.p480a.C9700a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.common.p288d.C6759a;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.comment.services.C24219a;
import com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.ShareException;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38293b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38295c;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38297d;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38301f;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38305h;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38307i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38313l;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38327s;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38331u;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38337x;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38341z;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage */
public final class I18nCommentAwemeSharePackage extends SharePackage {
    public static final Creator<I18nCommentAwemeSharePackage> CREATOR = new C24226c();

    /* renamed from: c */
    public static final C24225b f63938c = new C24225b(null);

    /* renamed from: a */
    public final Aweme f63939a;

    /* renamed from: b */
    public Comment f63940b;

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$a */
    public static final class C24224a extends C7219a<I18nCommentAwemeSharePackage> {

        /* renamed from: a */
        public Aweme f63941a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public I18nCommentAwemeSharePackage mo18866a() {
            return new I18nCommentAwemeSharePackage(this);
        }

        /* renamed from: a */
        public final C24224a mo63014a(int i) {
            this.f20193k.putInt("page_type", i);
            return this;
        }

        /* renamed from: a */
        public final C24224a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }

        /* renamed from: a */
        public final C24224a mo63016a(Aweme aweme) {
            C7573i.m23587b(aweme, "aweme");
            this.f63941a = aweme;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$b */
    public static final class C24225b {
        private C24225b() {
        }

        public /* synthetic */ C24225b(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:101:0x032b  */
        /* JADX WARNING: Removed duplicated region for block: B:106:0x03c6  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0174  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0179  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x017c  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x0189  */
        /* JADX WARNING: Removed duplicated region for block: B:44:0x018e  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0191  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x019e  */
        /* JADX WARNING: Removed duplicated region for block: B:50:0x01a3  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x01ff  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0224  */
        /* JADX WARNING: Removed duplicated region for block: B:65:0x022c  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x025f  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0264  */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x0267  */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x0274  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x0279  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x0290  */
        /* JADX WARNING: Removed duplicated region for block: B:83:0x0296  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x02a5  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x02ee  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p280ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage m79592a(com.p280ss.android.ugc.aweme.feed.model.Aweme r17, android.app.Activity r18, int r19, java.lang.String r20) {
            /*
                r0 = r17
                r1 = r18
                r2 = r20
                java.lang.String r3 = "aweme"
                kotlin.jvm.internal.C7573i.m23587b(r0, r3)
                java.lang.String r3 = "activity"
                kotlin.jvm.internal.C7573i.m23587b(r1, r3)
                java.lang.String r3 = "enterFrom"
                kotlin.jvm.internal.C7573i.m23587b(r2, r3)
                com.ss.android.ugc.aweme.base.share.ShareInfo r3 = r17.getShareInfo()
                com.ss.android.ugc.aweme.base.share.ShareInfo r3 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121904a(r3)
                r0.setShareInfo(r3)
                com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$a r3 = new com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$a
                r3.<init>()
                com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$a r3 = r3.mo63016a(r0)
                r4 = 3
                com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$a r3 = r3.mo63014a(r4)
                java.lang.String r5 = "aweme"
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r3 = r3.mo18868d(r5)
                com.ss.android.ugc.aweme.profile.model.User r5 = r17.getAuthor()
                r6 = 0
                if (r5 == 0) goto L_0x0040
                java.lang.String r5 = r5.getUid()
                goto L_0x0041
            L_0x0040:
                r5 = r6
            L_0x0041:
                if (r5 != 0) goto L_0x0045
                java.lang.String r5 = ""
            L_0x0045:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r3 = r3.mo18869e(r5)
                java.lang.String r5 = "app_name"
                r7 = 2131820918(0x7f110176, float:1.9274565E38)
                java.lang.String r7 = r1.getString(r7)
                java.lang.String r8 = "activity.getString(R.string.app_name)"
                kotlin.jvm.internal.C7573i.m23582a(r7, r8)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r3 = r3.mo18865a(r5, r7)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                java.lang.String r5 = r5.getShareTitle()
                if (r5 != 0) goto L_0x006c
                java.lang.String r5 = ""
            L_0x006c:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r3 = r3.mo18870f(r5)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                java.lang.String r5 = r5.getShareDesc()
                if (r5 != 0) goto L_0x0081
                java.lang.String r5 = ""
            L_0x0081:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r3 = r3.mo18871g(r5)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                java.lang.String r5 = r5.getShareUrl()
                if (r5 != 0) goto L_0x0098
                java.lang.String r5 = r17.getShareUrl()
            L_0x0098:
                java.lang.String r5 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121908b(r5)
                if (r5 != 0) goto L_0x00a0
                java.lang.String r5 = ""
            L_0x00a0:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r3 = r3.mo18872h(r5)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r3 = r3.mo18866a()
                com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage r3 = (com.p280ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage) r3
                android.os.Bundle r5 = r3.f20186l
                java.lang.String r7 = "aid"
                java.lang.String r8 = r17.getAid()
                r5.putString(r7, r8)
                java.lang.String r7 = "bool_persist"
                com.ss.android.ugc.aweme.base.share.ShareInfo r8 = r17.getShareInfo()
                java.lang.String r9 = "aweme.shareInfo"
                kotlin.jvm.internal.C7573i.m23582a(r8, r9)
                int r8 = r8.getBoolPersist()
                r9 = 0
                r10 = 1
                if (r8 != r10) goto L_0x00ca
                r8 = 1
                goto L_0x00cb
            L_0x00ca:
                r8 = 0
            L_0x00cb:
                r5.putBoolean(r7, r8)
                java.lang.String r7 = "page_type"
                r5.putInt(r7, r4)
                java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107206a(r0, r4)
                java.lang.String r7 = "log_pb"
                com.ss.android.ugc.aweme.feed.ae r8 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
                java.lang.String r4 = r8.mo71791a(r4)
                r5.putString(r7, r4)
                java.lang.String r4 = "enter_from"
                r5.putString(r4, r2)
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r4 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getOriginCover()
                java.lang.String r2 = com.p280ss.android.ugc.aweme.base.C23323e.m76499a(r2)
                java.lang.String r4 = "imageUrl"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                r4 = r2
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                int r4 = r4.length()
                if (r4 <= 0) goto L_0x010a
                r4 = 1
                goto L_0x010b
            L_0x010a:
                r4 = 0
            L_0x010b:
                if (r4 == 0) goto L_0x011e
                java.lang.String r4 = "thumb_url"
                com.ss.android.ugc.aweme.comment.services.a r7 = com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a.m79551a()
                r8 = r1
                android.content.Context r8 = (android.content.Context) r8
                java.lang.String r2 = r7.getShareThumbUrl(r8, r2)
                r5.putString(r4, r2)
                goto L_0x0144
            L_0x011e:
                java.lang.String r2 = "thumb_url"
                com.ss.android.ugc.aweme.comment.services.a r4 = com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a.m79551a()
                r7 = r1
                android.content.Context r7 = (android.content.Context) r7
                com.ss.android.ugc.aweme.feed.model.Video r8 = r17.getVideo()
                java.lang.String r11 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r8, r11)
                com.ss.android.ugc.aweme.base.model.UrlModel r8 = r8.getCover()
                java.lang.String r8 = com.p280ss.android.ugc.aweme.base.C23323e.m76499a(r8)
                java.lang.String r11 = "FrescoHelper.getImageUrl(aweme.video.cover)"
                kotlin.jvm.internal.C7573i.m23582a(r8, r11)
                java.lang.String r4 = r4.getShareThumbUrl(r7, r8)
                r5.putString(r2, r4)
            L_0x0144:
                java.lang.String r2 = "video_play_list"
                java.util.ArrayList r4 = new java.util.ArrayList
                com.ss.android.ugc.aweme.feed.model.Video r7 = r17.getVideo()
                java.lang.String r8 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r7, r8)
                com.ss.android.ugc.aweme.base.model.UrlModel r7 = r7.getDownloadAddr()
                if (r7 == 0) goto L_0x0160
                java.util.List r7 = r7.getUrlList()
                if (r7 == 0) goto L_0x0160
                java.util.Collection r7 = (java.util.Collection) r7
                goto L_0x0166
            L_0x0160:
                java.util.List r7 = kotlin.collections.C7525m.m23461a()
                java.util.Collection r7 = (java.util.Collection) r7
            L_0x0166:
                r4.<init>(r7)
                r5.putStringArrayList(r2, r4)
                java.lang.String r2 = "uid_for_share"
                com.ss.android.ugc.aweme.profile.model.User r4 = r17.getAuthor()
                if (r4 == 0) goto L_0x0179
                java.lang.String r4 = r4.getUid()
                goto L_0x017a
            L_0x0179:
                r4 = r6
            L_0x017a:
                if (r4 != 0) goto L_0x017e
                java.lang.String r4 = ""
            L_0x017e:
                r5.putString(r2, r4)
                java.lang.String r2 = "sec_user_id"
                com.ss.android.ugc.aweme.profile.model.User r4 = r17.getAuthor()
                if (r4 == 0) goto L_0x018e
                java.lang.String r4 = r4.getSecUid()
                goto L_0x018f
            L_0x018e:
                r4 = r6
            L_0x018f:
                if (r4 != 0) goto L_0x0193
                java.lang.String r4 = ""
            L_0x0193:
                r5.putString(r2, r4)
                java.lang.String r2 = "author_id"
                com.ss.android.ugc.aweme.profile.model.User r4 = r17.getAuthor()
                if (r4 == 0) goto L_0x01a3
                java.lang.String r4 = r4.getUid()
                goto L_0x01a4
            L_0x01a3:
                r4 = r6
            L_0x01a4:
                if (r4 != 0) goto L_0x01a8
                java.lang.String r4 = ""
            L_0x01a8:
                r5.putString(r2, r4)
                com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r17.getPoiStruct()
                if (r2 == 0) goto L_0x01cb
                java.lang.String r2 = "poi_id"
                com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r17.getPoiStruct()
                java.lang.String r4 = r4.poiId
                r5.putString(r2, r4)
                java.lang.String r2 = "poi_type"
                com.ss.android.ugc.aweme.poi.model.PoiStruct r4 = r17.getPoiStruct()
                int r4 = r4.iconType
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r5.putString(r2, r4)
            L_0x01cb:
                java.lang.String r2 = "city_info"
                java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107204a()
                r5.putString(r2, r4)
                java.lang.String r2 = "distance_info"
                java.lang.String r4 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107231i(r17)
                r5.putString(r2, r4)
                java.lang.String r2 = "log_pb"
                com.ss.android.ugc.aweme.feed.ae r4 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
                java.lang.String r7 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107219c(r17)
                java.lang.String r4 = r4.mo71791a(r7)
                r5.putString(r2, r4)
                java.lang.String r2 = "item_id"
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r4 = r17.getStatus()
                java.lang.String r7 = "aweme.status"
                kotlin.jvm.internal.C7573i.m23582a(r4, r7)
                int r4 = r4.getPrivateStatus()
                if (r4 == r10) goto L_0x0211
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r4 = r17.getStatus()
                java.lang.String r7 = "aweme.status"
                kotlin.jvm.internal.C7573i.m23582a(r4, r7)
                boolean r4 = r4.isDelete()
                if (r4 == 0) goto L_0x020f
                goto L_0x0211
            L_0x020f:
                r4 = 0
                goto L_0x0212
            L_0x0211:
                r4 = -1
            L_0x0212:
                r5.putInt(r2, r4)
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r17.getStatus()
                java.lang.String r4 = "status"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                boolean r4 = r2.isDelete()
                if (r4 == 0) goto L_0x022c
                java.lang.String r2 = "item_id_string"
                java.lang.String r4 = "delete"
                r5.putString(r2, r4)
                goto L_0x0243
            L_0x022c:
                int r2 = r2.getPrivateStatus()
                if (r2 != r10) goto L_0x023a
                java.lang.String r2 = "item_id_string"
                java.lang.String r4 = "private"
                r5.putString(r2, r4)
                goto L_0x0243
            L_0x023a:
                java.lang.String r2 = "item_id_string"
                java.lang.String r4 = r17.getAid()
                r5.putString(r2, r4)
            L_0x0243:
                java.lang.String r2 = "video_cover"
                com.ss.android.ugc.aweme.feed.model.Video r4 = r17.getVideo()
                java.lang.String r7 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r4, r7)
                com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getCover()
                java.io.Serializable r4 = (java.io.Serializable) r4
                r5.putSerializable(r2, r4)
                java.lang.String r2 = "add_utm_params"
                com.ss.android.ugc.aweme.profile.model.User r4 = r17.getAuthor()
                if (r4 == 0) goto L_0x0264
                java.lang.String r4 = r4.getNickname()
                goto L_0x0265
            L_0x0264:
                r4 = r6
            L_0x0265:
                if (r4 != 0) goto L_0x0269
                java.lang.String r4 = ""
            L_0x0269:
                r5.putString(r2, r4)
                java.lang.String r2 = "thumb_for_share"
                com.ss.android.ugc.aweme.profile.model.User r4 = r17.getAuthor()
                if (r4 == 0) goto L_0x0279
                com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getAvatarThumb()
                goto L_0x027a
            L_0x0279:
                r4 = r6
            L_0x027a:
                java.io.Serializable r4 = (java.io.Serializable) r4
                r5.putSerializable(r2, r4)
                java.lang.String r2 = "aweme_type"
                int r4 = r17.getAwemeType()
                r5.putInt(r2, r4)
                java.lang.String r2 = "author_name"
                com.ss.android.ugc.aweme.profile.model.User r4 = r17.getAuthor()
                if (r4 == 0) goto L_0x0294
                java.lang.String r6 = r4.getNickname()
            L_0x0294:
                if (r6 != 0) goto L_0x0298
                java.lang.String r6 = ""
            L_0x0298:
                r5.putString(r2, r6)
                boolean r2 = r17.isImage()
                r4 = 165(0xa5, float:2.31E-43)
                r6 = 124(0x7c, float:1.74E-43)
                if (r2 == 0) goto L_0x02ee
                java.util.List r2 = r17.getImageInfos()
                r7 = r2
                java.util.Collection r7 = (java.util.Collection) r7
                if (r7 == 0) goto L_0x02b7
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x02b5
                goto L_0x02b7
            L_0x02b5:
                r7 = 0
                goto L_0x02b8
            L_0x02b7:
                r7 = 1
            L_0x02b8:
                if (r7 == 0) goto L_0x02c5
                java.lang.String r2 = "aweme_width"
                r5.putInt(r2, r6)
                java.lang.String r2 = "aweme_height"
                r5.putInt(r2, r4)
                goto L_0x031c
            L_0x02c5:
                java.lang.Object r2 = kotlin.collections.C7525m.m23511f(r2)
                com.ss.android.ugc.aweme.feed.model.ImageInfo r2 = (com.p280ss.android.ugc.aweme.feed.model.ImageInfo) r2
                java.lang.String r4 = "aweme_width"
                java.lang.String r6 = "info"
                kotlin.jvm.internal.C7573i.m23582a(r2, r6)
                int r6 = r2.getWidth()
                r5.putInt(r4, r6)
                java.lang.String r4 = "aweme_height"
                int r6 = r2.getHeight()
                r5.putInt(r4, r6)
                java.lang.String r4 = "video_cover"
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getLabelLarge()
                java.io.Serializable r2 = (java.io.Serializable) r2
                r5.putSerializable(r4, r2)
                goto L_0x031c
            L_0x02ee:
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                if (r2 != 0) goto L_0x02ff
                java.lang.String r2 = "aweme_width"
                r5.putInt(r2, r6)
                java.lang.String r2 = "aweme_height"
                r5.putInt(r2, r4)
                goto L_0x031c
            L_0x02ff:
                java.lang.String r4 = "aweme_width"
                int r6 = r2.getWidth()
                r5.putInt(r4, r6)
                java.lang.String r4 = "aweme_height"
                int r6 = r2.getHeight()
                r5.putInt(r4, r6)
                java.lang.String r4 = "video_cover"
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getOriginCover()
                java.io.Serializable r2 = (java.io.Serializable) r2
                r5.putSerializable(r4, r2)
            L_0x031c:
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r4 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
                if (r2 == 0) goto L_0x036d
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r4 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
                java.lang.String r4 = "aweme.video.playAddr"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                java.lang.String r2 = r2.getUri()
                java.lang.String r4 = "videoRawStr"
                kotlin.jvm.internal.C7573i.m23582a(r2, r4)
                r11 = r2
                java.lang.CharSequence r11 = (java.lang.CharSequence) r11
                java.lang.String[] r12 = new java.lang.String[r10]
                java.lang.String r2 = "_"
                r12[r9] = r2
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                java.util.List r2 = kotlin.text.C7634n.m23768b(r11, r12, false, 0)
                r4 = r2
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                r4 = r4 ^ r10
                if (r4 == 0) goto L_0x036d
                java.lang.String r4 = "aweme_vid"
                java.lang.Object r2 = kotlin.collections.C7525m.m23511f(r2)
                java.lang.String r2 = (java.lang.String) r2
                r5.putString(r4, r2)
            L_0x036d:
                java.lang.String r2 = "aweme_width"
                com.ss.android.ugc.aweme.feed.model.Video r4 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r4, r6)
                int r4 = r4.getWidth()
                r5.putInt(r2, r4)
                java.lang.String r2 = "aweme_height"
                com.ss.android.ugc.aweme.feed.model.Video r4 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r4, r6)
                int r4 = r4.getHeight()
                r5.putInt(r2, r4)
                java.lang.String r2 = "aweme_duration"
                com.ss.android.ugc.aweme.feed.model.Video r4 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r4, r6)
                int r4 = r4.getDuration()
                r5.putInt(r2, r4)
                java.lang.String r2 = "aweme_length"
                com.ss.android.ugc.aweme.feed.model.Video r4 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r4, r6)
                int r4 = r4.getVideoLength()
                r5.putInt(r2, r4)
                java.lang.String r2 = "desc"
                java.lang.String r4 = r17.getDesc()
                r5.putString(r2, r4)
                java.lang.String r2 = "is_star"
                com.ss.android.ugc.aweme.profile.model.User r0 = r17.getAuthor()
                if (r0 == 0) goto L_0x03cf
                boolean r0 = r0.isStar()
                if (r0 != r10) goto L_0x03cf
                java.lang.String r0 = "1"
                goto L_0x03d1
            L_0x03cf:
                java.lang.String r0 = "0"
            L_0x03d1:
                r5.putString(r2, r0)
                java.lang.String r0 = "is_long_item"
                com.ss.android.ugc.aweme.comment.services.a r2 = com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a.m79551a()
                android.content.Context r1 = (android.content.Context) r1
                int r1 = r2.getIsLongItem(r1)
                r5.putInt(r0, r1)
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage.C24225b.m79592a(com.ss.android.ugc.aweme.feed.model.Aweme, android.app.Activity, int, java.lang.String):com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$c */
    public static final class C24226c implements Creator<I18nCommentAwemeSharePackage> {
        C24226c() {
        }

        /* renamed from: a */
        private static I18nCommentAwemeSharePackage[] m79594a(int i) {
            return new I18nCommentAwemeSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m79593a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m79594a(i);
        }

        /* renamed from: a */
        private static I18nCommentAwemeSharePackage m79593a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new I18nCommentAwemeSharePackage(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$d */
    static final class C24227d extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ I18nCommentAwemeSharePackage f63942a;

        /* renamed from: b */
        final /* synthetic */ C38301f f63943b;

        /* renamed from: c */
        final /* synthetic */ Context f63944c;

        C24227d(I18nCommentAwemeSharePackage i18nCommentAwemeSharePackage, C38301f fVar, Context context) {
            this.f63942a = i18nCommentAwemeSharePackage;
            this.f63943b = fVar;
            this.f63944c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m79595a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m79595a(String str) {
            C7573i.m23587b(str, "it");
            C38301f fVar = this.f63943b;
            C38359j jVar = new C38359j(I18nCommentAwemeSharePackage.m79576a(str, this.f63944c), null, null, null, null, null, 62, null);
            String str2 = "content_url";
            String str3 = jVar.f99580g;
            if (str3 == null) {
                str3 = "";
            }
            jVar.mo95938a(str2, str3);
            String b = C23481i.m77091b(R.string.b2x);
            C7573i.m23582a((Object) b, "ResUtils.getString(R.string.facebook_app_id)");
            jVar.mo95938a("fb_app_id", b);
            jVar.mo95938a("media_type", "video/mp4");
            fVar.mo71406a((C38354f) jVar, this.f63944c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$e */
    static final class C24228e extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ I18nCommentAwemeSharePackage f63945a;

        /* renamed from: b */
        final /* synthetic */ C38343b f63946b;

        /* renamed from: c */
        final /* synthetic */ Context f63947c;

        C24228e(I18nCommentAwemeSharePackage i18nCommentAwemeSharePackage, C38343b bVar, Context context) {
            this.f63945a = i18nCommentAwemeSharePackage;
            this.f63946b = bVar;
            this.f63947c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m79596a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m79596a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f63946b;
            Uri a = I18nCommentAwemeSharePackage.m79576a(str, I18nCommentAwemeSharePackage.m79581b());
            String string = this.f63947c.getString(R.string.e7g);
            C7573i.m23582a((Object) string, "context.getString(R.string.tiktok_email_title)");
            String a2 = C1642a.m8034a(string, Arrays.copyOf(new Object[]{this.f63945a.f20186l.getString("author_name")}, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
            C38359j jVar = new C38359j(a, null, " ", null, a2, null, 42, null);
            bVar.mo95746a(jVar, this.f63947c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$f */
    static final class C24229f extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ I18nCommentAwemeSharePackage f63948a;

        /* renamed from: b */
        final /* synthetic */ C38343b f63949b;

        /* renamed from: c */
        final /* synthetic */ Context f63950c;

        C24229f(I18nCommentAwemeSharePackage i18nCommentAwemeSharePackage, C38343b bVar, Context context) {
            this.f63948a = i18nCommentAwemeSharePackage;
            this.f63949b = bVar;
            this.f63950c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m79597a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m79597a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f63949b;
            C38359j jVar = new C38359j(I18nCommentAwemeSharePackage.m79576a(str, I18nCommentAwemeSharePackage.m79581b()), null, null, null, null, null, 62, null);
            String str2 = "content_url";
            String str3 = jVar.f99580g;
            if (str3 == null) {
                str3 = "";
            }
            jVar.mo95938a(str2, str3);
            jVar.mo95938a("media_type", "video/mp4");
            bVar.mo95746a(jVar, this.f63950c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$g */
    static final class C24230g extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ I18nCommentAwemeSharePackage f63951a;

        /* renamed from: b */
        final /* synthetic */ C38343b f63952b;

        /* renamed from: c */
        final /* synthetic */ Context f63953c;

        C24230g(I18nCommentAwemeSharePackage i18nCommentAwemeSharePackage, C38343b bVar, Context context) {
            this.f63951a = i18nCommentAwemeSharePackage;
            this.f63952b = bVar;
            this.f63953c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m79598a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m79598a(String str) {
            C7573i.m23587b(str, "it");
            if (C38157b.m121907a(new File(str))) {
                String a = I18nCommentAwemeSharePackage.m79577a(this.f63951a.f20185k, this.f63952b);
                try {
                    C38343b bVar = this.f63952b;
                    C38359j jVar = new C38359j(I18nCommentAwemeSharePackage.m79576a(str, I18nCommentAwemeSharePackage.m79581b()), str, null, null, null, a, 28, null);
                    bVar.mo71406a((C38354f) jVar, this.f63953c);
                } catch (ShareException e) {
                    String message = e.getMessage();
                    int hashCode = message.hashCode();
                    if (hashCode != 1212011917) {
                        if (hashCode == 1703438795 && message.equals("video_too_long")) {
                            C10761a.m31399c(C6399b.m19921a(), (int) R.string.a98).mo25750a();
                        }
                    } else if (message.equals("file_too_large")) {
                        C10761a.m31399c(C6399b.m19921a(), (int) R.string.a99).mo25750a();
                    }
                }
            } else {
                C10761a.m31399c(C6399b.m19921a(), (int) R.string.a99).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$h */
    static final class C24231h extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38343b f63954a;

        /* renamed from: b */
        final /* synthetic */ Context f63955b;

        C24231h(C38343b bVar, Context context) {
            this.f63954a = bVar;
            this.f63955b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m79599a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m79599a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f63954a;
            C38359j jVar = new C38359j(C24220a.m79551a().getFileProviderUri(this.f63955b, new File(str)), null, null, null, null, null, 62, null);
            bVar.mo95746a(jVar, this.f63955b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$i */
    public static final class C24232i implements C28689b {

        /* renamed from: a */
        final /* synthetic */ Context f63956a;

        /* renamed from: b */
        final /* synthetic */ C7562b f63957b;

        /* renamed from: b */
        public final void mo63021b() {
            if (this.f63956a instanceof I18nCommentShareActivity) {
                ((I18nCommentShareActivity) this.f63956a).finish();
            }
        }

        /* renamed from: a */
        public final void mo63019a() {
            if (C24220a.m79551a().isCurPlayActive(C38157b.m121903a(this.f63956a))) {
                C43316v.m137450K().mo104948x();
            }
        }

        /* renamed from: a */
        public final void mo63020a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f63956a instanceof I18nCommentShareActivity) {
                    ((I18nCommentShareActivity) this.f63956a).finish();
                }
                return;
            }
            this.f63957b.invoke(str);
            if (this.f63956a instanceof I18nCommentShareActivity) {
                ((I18nCommentShareActivity) this.f63956a).finish();
            }
        }

        C24232i(Context context, C7562b bVar) {
            this.f63956a = context;
            this.f63957b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$j */
    public static final class C24233j implements C28689b {

        /* renamed from: a */
        final /* synthetic */ Context f63958a;

        /* renamed from: b */
        final /* synthetic */ boolean f63959b;

        /* renamed from: c */
        final /* synthetic */ C38307i f63960c;

        /* renamed from: com.ss.android.ugc.aweme.comment.share.I18nCommentAwemeSharePackage$j$a */
        static final class C24234a implements OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C24233j f63961a;

            /* renamed from: b */
            final /* synthetic */ String f63962b;

            C24234a(C24233j jVar, String str) {
                this.f63961a = jVar;
                this.f63962b = str;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                try {
                    dialogInterface.dismiss();
                } catch (Exception e) {
                    C2077a.m9160a((Throwable) e);
                }
                C6759a.m20909a("ins_caption_got_it", (Bundle) null);
                C38307i iVar = this.f63961a.f63960c;
                C38359j jVar = new C38359j(C24220a.m79551a().getFileProviderUri(this.f63961a.f63958a, new File(this.f63962b)), null, null, null, null, null, 62, null);
                iVar.mo95746a(jVar, this.f63961a.f63958a);
            }
        }

        /* renamed from: b */
        public final void mo63021b() {
            if (this.f63958a instanceof I18nCommentShareActivity) {
                ((I18nCommentShareActivity) this.f63958a).finish();
            }
        }

        /* renamed from: a */
        public final void mo63019a() {
            if (C24220a.m79551a().isCurPlayActive(C38157b.m121903a(this.f63958a))) {
                C43316v.m137450K().mo104948x();
            }
        }

        /* renamed from: a */
        public final void mo63020a(String str) {
            boolean z;
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (this.f63958a instanceof I18nCommentShareActivity) {
                    ((I18nCommentShareActivity) this.f63958a).finish();
                }
                return;
            }
            if (this.f63959b) {
                C6759a.m20909a("ins_caption_pop_up", (Bundle) null);
                Context context = this.f63958a;
                String string = this.f63958a.getString(R.string.buf);
                C7573i.m23582a((Object) string, "context.getString(R.stri…am_share_paste_tip_title)");
                String string2 = this.f63958a.getString(R.string.bud);
                C7573i.m23582a((Object) string2, "context.getString(R.stri…_share_paste_dialog_tips)");
                String string3 = this.f63958a.getString(R.string.bc5);
                C7573i.m23582a((Object) string3, "context.getString(R.string.got_it)");
                C38157b.m121906a(context, string, string2, string3, new C24234a(this, str), null, null);
            } else {
                C38307i iVar = this.f63960c;
                C38359j jVar = new C38359j(C24220a.m79551a().getFileProviderUri(this.f63958a, new File(str)), null, null, null, null, null, 62, null);
                iVar.mo95746a(jVar, this.f63958a);
            }
            if (this.f63958a instanceof I18nCommentShareActivity) {
                ((I18nCommentShareActivity) this.f63958a).finish();
            }
        }

        C24233j(Context context, boolean z, C38307i iVar) {
            this.f63958a = context;
            this.f63959b = z;
            this.f63960c = iVar;
        }
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        return C24220a.m79551a().interceptShareSheetAction(fVar, context);
    }

    /* renamed from: b */
    private static Context m79581b() {
        return C6399b.m19921a();
    }

    /* renamed from: a */
    private final boolean m79580a() {
        if (!C6399b.m19947w() || !C32326h.m104887i() || !C28482e.m93619l(this.f63939a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo63013a(Comment comment) {
        C7573i.m23587b(comment, "<set-?>");
        this.f63940b = comment;
    }

    public I18nCommentAwemeSharePackage(C24224a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        this.f63939a = aVar.f63941a;
    }

    public I18nCommentAwemeSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C24224a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        if (bVar instanceof C38295c) {
            return new C38358i(m79577a(this.f20185k, bVar), m79581b().getString(R.string.dap));
        } else if (bVar instanceof C38331u) {
            C38356g gVar = new C38356g(m79577a(this.f20185k, bVar), null, C24220a.m79551a().fixArabicShare(this.f20184j), 2, null);
            return gVar;
        } else {
            C38356g gVar2 = new C38356g(m79577a(this.f20185k, bVar), null, null, 6, null);
            return gVar2;
        }
    }

    /* renamed from: a */
    public static Uri m79576a(String str, Context context) {
        C7573i.m23587b(str, "$this$pathToUri");
        C7573i.m23587b(context, "context");
        return C24220a.m79551a().getFileProviderUri(context, str);
    }

    /* renamed from: a */
    public static String m79577a(String str, C38343b bVar) {
        C7573i.m23587b(str, "$this$enhanceAppParams");
        C7573i.m23587b(bVar, "channel");
        return C24220a.m79551a().fetchShortenUrl(str, bVar.mo95739b());
    }

    /* renamed from: a */
    private final void m79578a(C38307i iVar, Context context) {
        boolean z;
        String str;
        if (this.f63939a != null) {
            boolean isInstagramShareShowDialogTip = C24220a.m79551a().isInstagramShareShowDialogTip();
            boolean isInstagramShareShowToastTip = C24220a.m79551a().isInstagramShareShowToastTip();
            if (isInstagramShareShowDialogTip || isInstagramShareShowToastTip) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                String desc = this.f63939a.getDesc();
                User author = this.f63939a.getAuthor();
                if (author != null) {
                    str = author.getNickname();
                } else {
                    str = null;
                }
                Music music = this.f63939a.getMusic();
                C7573i.m23582a((Object) music, "aweme.music");
                String musicName = music.getMusicName();
                Locale locale = Locale.getDefault();
                C7573i.m23582a((Object) locale, "Locale.getDefault()");
                String string = context.getString(R.string.bue);
                C7573i.m23582a((Object) string, "context.getString(R.stri…agram_share_paste_format)");
                String a = C1642a.m8035a(locale, string, Arrays.copyOf(new Object[]{desc, str, musicName, "www.tiktok.com"}, 4));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                C9700a.m28636a(context, "", a);
            }
            C24219a a2 = C24220a.m79551a();
            Activity a3 = C38157b.m121903a(context);
            int i = this.f20186l.getInt("page_type");
            SharePackage sharePackage = this;
            String b = iVar.mo95739b();
            Comment comment = this.f63940b;
            if (comment == null) {
                C7573i.m23583a("comment");
            }
            a2.shareAfterDownload(a3, i, sharePackage, b, comment, this.f63939a, true, true, isInstagramShareShowToastTip, new C24233j(context, isInstagramShareShowDialogTip, iVar));
        }
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        if (this.f63939a == null) {
            return false;
        }
        if (!C24220a.m79551a().checkShareAllowStatus(this.f63939a, context)) {
            return true;
        }
        C24220a.m79551a().addShareRecord(bVar.mo95739b());
        if (bVar instanceof C38297d) {
            C38301f fVar = new C38301f();
            if (!C24220a.m79551a().isFacebookShareLinkEnable()) {
                Aweme aweme = this.f63939a;
                if ((aweme == null || aweme.getAwemeType() != 13) && fVar.mo95743a(context)) {
                    m79579a(bVar, context, new C24227d(this, fVar, context));
                    return true;
                }
            }
            return false;
        } else if (bVar instanceof C38295c) {
            if (m79580a()) {
                return false;
            }
            m79579a(bVar, context, new C24228e(this, bVar, context));
            return true;
        } else if (bVar instanceof C38307i) {
            m79578a((C38307i) bVar, context);
            return true;
        } else if (bVar instanceof C38309j) {
            m79579a(bVar, context, new C24229f(this, bVar, context));
            return true;
        } else if (bVar instanceof C38327s) {
            m79579a(bVar, context, new C24230g(this, bVar, context));
            return true;
        } else if (!(bVar instanceof C38305h) && !(bVar instanceof C38293b) && !(bVar instanceof C38341z) && !(bVar instanceof C38337x) && !(bVar instanceof C38313l)) {
            return false;
        } else {
            m79579a(bVar, context, new C24231h(bVar, context));
            return true;
        }
    }

    /* renamed from: a */
    private final void m79579a(C38343b bVar, Context context, C7562b<? super String, C7581n> bVar2) {
        C24219a a = C24220a.m79551a();
        Activity a2 = C38157b.m121903a(context);
        int i = this.f20186l.getInt("page_type");
        SharePackage sharePackage = this;
        String b = bVar.mo95739b();
        Comment comment = this.f63940b;
        if (comment == null) {
            C7573i.m23583a("comment");
        }
        a.shareAfterDownload(a2, i, sharePackage, b, comment, this.f63939a, false, true, false, new C24232i(context, bVar2));
    }
}
