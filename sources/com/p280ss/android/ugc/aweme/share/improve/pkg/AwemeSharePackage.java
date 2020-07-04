package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C1642a;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.C28687a;
import com.p280ss.android.ugc.aweme.feed.share.p1236a.p1237a.C28689b;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.C37996b;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38104i;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.share.p1533d.C38025a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.C38358i;
import com.p280ss.android.ugc.aweme.sharer.C38359j;
import com.p280ss.android.ugc.aweme.sharer.ShareException;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38293b;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38295c;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38305h;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38307i;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38309j;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38313l;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38327s;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38331u;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38337x;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38339y;
import com.p280ss.android.ugc.aweme.sharer.p1544a.C38341z;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.utils.C42972bf;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.Arrays;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage */
public final class AwemeSharePackage extends SharePackage {
    public static final Creator<AwemeSharePackage> CREATOR = new C38178c();

    /* renamed from: b */
    public static final C38177b f99301b = new C38177b(null);

    /* renamed from: a */
    public final Aweme f99302a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$a */
    public static final class C38176a extends C7219a<AwemeSharePackage> {

        /* renamed from: a */
        public Aweme f99303a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public AwemeSharePackage mo18866a() {
            return new AwemeSharePackage(this);
        }

        /* renamed from: a */
        public final C38176a mo95758a(int i) {
            this.f20193k.putInt("page_type", i);
            return this;
        }

        /* renamed from: a */
        public final C38176a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            return this;
        }

        /* renamed from: a */
        public final C38176a mo95760a(Aweme aweme) {
            C7573i.m23587b(aweme, "aweme");
            this.f99303a = aweme;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$b */
    public static final class C38177b {
        private C38177b() {
        }

        public /* synthetic */ C38177b(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Removed duplicated region for block: B:103:0x02e3  */
        /* JADX WARNING: Removed duplicated region for block: B:109:0x0334  */
        /* JADX WARNING: Removed duplicated region for block: B:114:0x03cf  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0114  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0117  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x014c  */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0169  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x016e  */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x0171  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x017e  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x0183  */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x0186  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0193  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x0198  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x019b  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01f4  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0219  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0221  */
        /* JADX WARNING: Removed duplicated region for block: B:79:0x0254  */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x0259  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x025c  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x0269  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x026e  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x0285  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x028b  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x029a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage m121950a(com.p280ss.android.ugc.aweme.feed.model.Aweme r17, android.content.Context r18, int r19, java.lang.String r20, java.lang.String r21) {
            /*
                r0 = r17
                r1 = r18
                r2 = r19
                r3 = r20
                java.lang.String r4 = "aweme"
                kotlin.jvm.internal.C7573i.m23587b(r0, r4)
                java.lang.String r4 = "activity"
                kotlin.jvm.internal.C7573i.m23587b(r1, r4)
                java.lang.String r4 = "enterFrom"
                kotlin.jvm.internal.C7573i.m23587b(r3, r4)
                java.lang.String r4 = "enterMethod"
                r5 = r21
                kotlin.jvm.internal.C7573i.m23587b(r5, r4)
                com.ss.android.ugc.aweme.base.share.ShareInfo r4 = r17.getShareInfo()
                com.ss.android.ugc.aweme.base.share.ShareInfo r4 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121904a(r4)
                r0.setShareInfo(r4)
                com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$a r4 = new com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$a
                r4.<init>()
                com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$a r4 = r4.mo95760a(r0)
                com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$a r4 = r4.mo95758a(r2)
                java.lang.String r5 = "aweme"
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo18868d(r5)
                com.ss.android.ugc.aweme.profile.model.User r5 = r17.getAuthor()
                r6 = 0
                if (r5 == 0) goto L_0x0048
                java.lang.String r5 = r5.getUid()
                goto L_0x0049
            L_0x0048:
                r5 = r6
            L_0x0049:
                if (r5 != 0) goto L_0x004d
                java.lang.String r5 = ""
            L_0x004d:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo18869e(r5)
                java.lang.String r5 = "app_name"
                r7 = 2131820918(0x7f110176, float:1.9274565E38)
                java.lang.String r7 = r1.getString(r7)
                java.lang.String r8 = "activity.getString(R.string.app_name)"
                kotlin.jvm.internal.C7573i.m23582a(r7, r8)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo18865a(r5, r7)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                java.lang.String r5 = r5.getShareTitle()
                if (r5 != 0) goto L_0x0074
                java.lang.String r5 = ""
            L_0x0074:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo18870f(r5)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                java.lang.String r5 = r5.getShareDesc()
                if (r5 != 0) goto L_0x0089
                java.lang.String r5 = ""
            L_0x0089:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo18871g(r5)
                com.ss.android.ugc.aweme.base.share.ShareInfo r5 = r17.getShareInfo()
                java.lang.String r7 = "aweme.shareInfo"
                kotlin.jvm.internal.C7573i.m23582a(r5, r7)
                java.lang.String r5 = r5.getShareUrl()
                if (r5 != 0) goto L_0x00a0
                java.lang.String r5 = r17.getShareUrl()
            L_0x00a0:
                java.lang.String r5 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121908b(r5)
                if (r5 != 0) goto L_0x00a8
                java.lang.String r5 = ""
            L_0x00a8:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r4 = r4.mo18872h(r5)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r4 = r4.mo18866a()
                com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage r4 = (com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage) r4
                android.os.Bundle r5 = r4.f20186l
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
                if (r8 != r10) goto L_0x00d2
                r8 = 1
                goto L_0x00d3
            L_0x00d2:
                r8 = 0
            L_0x00d3:
                r5.putBoolean(r7, r8)
                java.lang.String r7 = "page_type"
                r5.putInt(r7, r2)
                java.lang.String r2 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107206a(r0, r2)
                java.lang.String r7 = "log_pb"
                com.ss.android.ugc.aweme.feed.ae r8 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
                java.lang.String r2 = r8.mo71791a(r2)
                r5.putString(r7, r2)
                java.lang.String r2 = "enter_from"
                r5.putString(r2, r3)
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r3 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getOriginCover()
                if (r2 == 0) goto L_0x010d
                java.util.List r2 = r2.getUrlList()
                if (r2 == 0) goto L_0x010d
                java.lang.Object r2 = kotlin.collections.C7525m.m23513g(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x010e
            L_0x010d:
                r2 = r6
            L_0x010e:
                boolean r3 = com.p280ss.android.ugc.aweme.utils.C43101el.m136718a(r2)
                if (r3 == 0) goto L_0x0117
                java.lang.String r3 = "thumb_url"
                goto L_0x0136
            L_0x0117:
                java.lang.String r3 = "thumb_url"
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r7 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r7)
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getCover()
                if (r2 == 0) goto L_0x0135
                java.util.List r2 = r2.getUrlList()
                if (r2 == 0) goto L_0x0135
                java.lang.Object r2 = kotlin.collections.C7525m.m23513g(r2)
                java.lang.String r2 = (java.lang.String) r2
                goto L_0x0136
            L_0x0135:
                r2 = r6
            L_0x0136:
                r5.putString(r3, r2)
                java.lang.String r2 = "video_play_list"
                java.util.ArrayList r3 = new java.util.ArrayList
                com.ss.android.ugc.aweme.feed.model.Video r7 = r17.getVideo()
                java.lang.String r8 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r7, r8)
                com.ss.android.ugc.aweme.base.model.UrlModel r7 = r7.getDownloadAddr()
                if (r7 == 0) goto L_0x0155
                java.util.List r7 = r7.getUrlList()
                if (r7 == 0) goto L_0x0155
                java.util.Collection r7 = (java.util.Collection) r7
                goto L_0x015b
            L_0x0155:
                java.util.List r7 = kotlin.collections.C7525m.m23461a()
                java.util.Collection r7 = (java.util.Collection) r7
            L_0x015b:
                r3.<init>(r7)
                r5.putStringArrayList(r2, r3)
                java.lang.String r2 = "uid_for_share"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x016e
                java.lang.String r3 = r3.getUid()
                goto L_0x016f
            L_0x016e:
                r3 = r6
            L_0x016f:
                if (r3 != 0) goto L_0x0173
                java.lang.String r3 = ""
            L_0x0173:
                r5.putString(r2, r3)
                java.lang.String r2 = "sec_user_id"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x0183
                java.lang.String r3 = r3.getSecUid()
                goto L_0x0184
            L_0x0183:
                r3 = r6
            L_0x0184:
                if (r3 != 0) goto L_0x0188
                java.lang.String r3 = ""
            L_0x0188:
                r5.putString(r2, r3)
                java.lang.String r2 = "author_id"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x0198
                java.lang.String r3 = r3.getUid()
                goto L_0x0199
            L_0x0198:
                r3 = r6
            L_0x0199:
                if (r3 != 0) goto L_0x019d
                java.lang.String r3 = ""
            L_0x019d:
                r5.putString(r2, r3)
                com.ss.android.ugc.aweme.poi.model.PoiStruct r2 = r17.getPoiStruct()
                if (r2 == 0) goto L_0x01c0
                java.lang.String r2 = "poi_id"
                com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r17.getPoiStruct()
                java.lang.String r3 = r3.poiId
                r5.putString(r2, r3)
                java.lang.String r2 = "poi_type"
                com.ss.android.ugc.aweme.poi.model.PoiStruct r3 = r17.getPoiStruct()
                int r3 = r3.iconType
                java.lang.String r3 = java.lang.String.valueOf(r3)
                r5.putString(r2, r3)
            L_0x01c0:
                java.lang.String r2 = "city_info"
                java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107204a()
                r5.putString(r2, r3)
                java.lang.String r2 = "distance_info"
                java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107231i(r17)
                r5.putString(r2, r3)
                java.lang.String r2 = "log_pb"
                com.ss.android.ugc.aweme.feed.ae r3 = com.p280ss.android.ugc.aweme.feed.C28199ae.m92689a()
                java.lang.String r7 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107219c(r17)
                java.lang.String r3 = r3.mo71791a(r7)
                r5.putString(r2, r3)
                java.lang.String r2 = "item_id"
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r3 = r17.getStatus()
                java.lang.String r7 = "aweme.status"
                kotlin.jvm.internal.C7573i.m23582a(r3, r7)
                int r3 = r3.getPrivateStatus()
                if (r3 == r10) goto L_0x0206
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r3 = r17.getStatus()
                java.lang.String r7 = "aweme.status"
                kotlin.jvm.internal.C7573i.m23582a(r3, r7)
                boolean r3 = r3.isDelete()
                if (r3 == 0) goto L_0x0204
                goto L_0x0206
            L_0x0204:
                r3 = 0
                goto L_0x0207
            L_0x0206:
                r3 = -1
            L_0x0207:
                r5.putInt(r2, r3)
                com.ss.android.ugc.aweme.feed.model.AwemeStatus r2 = r17.getStatus()
                java.lang.String r3 = "status"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                boolean r3 = r2.isDelete()
                if (r3 == 0) goto L_0x0221
                java.lang.String r2 = "item_id_string"
                java.lang.String r3 = "delete"
                r5.putString(r2, r3)
                goto L_0x0238
            L_0x0221:
                int r2 = r2.getPrivateStatus()
                if (r2 != r10) goto L_0x022f
                java.lang.String r2 = "item_id_string"
                java.lang.String r3 = "private"
                r5.putString(r2, r3)
                goto L_0x0238
            L_0x022f:
                java.lang.String r2 = "item_id_string"
                java.lang.String r3 = r17.getAid()
                r5.putString(r2, r3)
            L_0x0238:
                java.lang.String r2 = "video_cover"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r7 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r3, r7)
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getCover()
                java.io.Serializable r3 = (java.io.Serializable) r3
                r5.putSerializable(r2, r3)
                java.lang.String r2 = "add_utm_params"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x0259
                java.lang.String r3 = r3.getNickname()
                goto L_0x025a
            L_0x0259:
                r3 = r6
            L_0x025a:
                if (r3 != 0) goto L_0x025e
                java.lang.String r3 = ""
            L_0x025e:
                r5.putString(r2, r3)
                java.lang.String r2 = "thumb_for_share"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x026e
                com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.getAvatarThumb()
                goto L_0x026f
            L_0x026e:
                r3 = r6
            L_0x026f:
                java.io.Serializable r3 = (java.io.Serializable) r3
                r5.putSerializable(r2, r3)
                java.lang.String r2 = "aweme_type"
                int r3 = r17.getAwemeType()
                r5.putInt(r2, r3)
                java.lang.String r2 = "author_name"
                com.ss.android.ugc.aweme.profile.model.User r3 = r17.getAuthor()
                if (r3 == 0) goto L_0x0289
                java.lang.String r6 = r3.getNickname()
            L_0x0289:
                if (r6 != 0) goto L_0x028d
                java.lang.String r6 = ""
            L_0x028d:
                r5.putString(r2, r6)
                boolean r2 = r17.isImage()
                r3 = 165(0xa5, float:2.31E-43)
                r6 = 124(0x7c, float:1.74E-43)
                if (r2 == 0) goto L_0x02e3
                java.util.List r2 = r17.getImageInfos()
                r7 = r2
                java.util.Collection r7 = (java.util.Collection) r7
                if (r7 == 0) goto L_0x02ac
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L_0x02aa
                goto L_0x02ac
            L_0x02aa:
                r7 = 0
                goto L_0x02ad
            L_0x02ac:
                r7 = 1
            L_0x02ad:
                if (r7 == 0) goto L_0x02ba
                java.lang.String r2 = "aweme_width"
                r5.putInt(r2, r6)
                java.lang.String r2 = "aweme_height"
                r5.putInt(r2, r3)
                goto L_0x0311
            L_0x02ba:
                java.lang.Object r2 = kotlin.collections.C7525m.m23511f(r2)
                com.ss.android.ugc.aweme.feed.model.ImageInfo r2 = (com.p280ss.android.ugc.aweme.feed.model.ImageInfo) r2
                java.lang.String r3 = "aweme_width"
                java.lang.String r6 = "info"
                kotlin.jvm.internal.C7573i.m23582a(r2, r6)
                int r6 = r2.getWidth()
                r5.putInt(r3, r6)
                java.lang.String r3 = "aweme_height"
                int r6 = r2.getHeight()
                r5.putInt(r3, r6)
                java.lang.String r3 = "video_cover"
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getLabelLarge()
                java.io.Serializable r2 = (java.io.Serializable) r2
                r5.putSerializable(r3, r2)
                goto L_0x0311
            L_0x02e3:
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                if (r2 != 0) goto L_0x02f4
                java.lang.String r2 = "aweme_width"
                r5.putInt(r2, r6)
                java.lang.String r2 = "aweme_height"
                r5.putInt(r2, r3)
                goto L_0x0311
            L_0x02f4:
                java.lang.String r3 = "aweme_width"
                int r6 = r2.getWidth()
                r5.putInt(r3, r6)
                java.lang.String r3 = "aweme_height"
                int r6 = r2.getHeight()
                r5.putInt(r3, r6)
                java.lang.String r3 = "video_cover"
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getOriginCover()
                java.io.Serializable r2 = (java.io.Serializable) r2
                r5.putSerializable(r3, r2)
            L_0x0311:
                java.lang.String r2 = "is_fullscreen"
                boolean r3 = com.p280ss.android.ugc.aweme.detail.C26062g.m85608a()
                r5.putBoolean(r2, r3)
                java.lang.String r2 = "request_id"
                com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.f99302a
                java.lang.String r3 = com.p280ss.android.ugc.aweme.metrics.C33230ac.m107219c(r3)
                r5.putString(r2, r3)
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r3 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
                if (r2 == 0) goto L_0x0376
                com.ss.android.ugc.aweme.feed.model.Video r2 = r17.getVideo()
                java.lang.String r3 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                com.ss.android.ugc.aweme.feed.model.VideoUrlModel r2 = r2.getPlayAddr()
                java.lang.String r3 = "aweme.video.playAddr"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
                java.lang.String r2 = r2.getUri()
                java.lang.String r3 = "videoRawStr"
                kotlin.jvm.internal.C7573i.m23582a(r2, r3)
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
                r3 = r2
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                r3 = r3 ^ r10
                if (r3 == 0) goto L_0x0376
                java.lang.String r3 = "aweme_vid"
                java.lang.Object r2 = kotlin.collections.C7525m.m23511f(r2)
                java.lang.String r2 = (java.lang.String) r2
                r5.putString(r3, r2)
            L_0x0376:
                java.lang.String r2 = "aweme_width"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r3, r6)
                int r3 = r3.getWidth()
                r5.putInt(r2, r3)
                java.lang.String r2 = "aweme_height"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r3, r6)
                int r3 = r3.getHeight()
                r5.putInt(r2, r3)
                java.lang.String r2 = "aweme_duration"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r3, r6)
                int r3 = r3.getDuration()
                r5.putInt(r2, r3)
                java.lang.String r2 = "aweme_length"
                com.ss.android.ugc.aweme.feed.model.Video r3 = r17.getVideo()
                java.lang.String r6 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r3, r6)
                int r3 = r3.getVideoLength()
                r5.putInt(r2, r3)
                java.lang.String r2 = "desc"
                java.lang.String r3 = r17.getDesc()
                r5.putString(r2, r3)
                java.lang.String r2 = "is_star"
                com.ss.android.ugc.aweme.profile.model.User r0 = r17.getAuthor()
                if (r0 == 0) goto L_0x03d8
                boolean r0 = r0.isStar()
                if (r0 != r10) goto L_0x03d8
                java.lang.String r0 = "1"
                goto L_0x03da
            L_0x03d8:
                java.lang.String r0 = "0"
            L_0x03da:
                r5.putString(r2, r0)
                java.lang.String r0 = "is_long_item"
                com.ss.android.ugc.aweme.comment.services.a r2 = com.p280ss.android.ugc.aweme.comment.services.C24219a.C24220a.m79551a()
                int r1 = r2.getIsLongItem(r1)
                r5.putInt(r0, r1)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage.C38177b.m121950a(com.ss.android.ugc.aweme.feed.model.Aweme, android.content.Context, int, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$c */
    public static final class C38178c implements Creator<AwemeSharePackage> {
        C38178c() {
        }

        /* renamed from: a */
        private static AwemeSharePackage[] m121953a(int i) {
            return new AwemeSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m121952a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m121953a(i);
        }

        /* renamed from: a */
        private static AwemeSharePackage m121952a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new AwemeSharePackage(parcel);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$d */
    static final class C38179d extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ AwemeSharePackage f99304a;

        /* renamed from: b */
        final /* synthetic */ C38343b f99305b;

        /* renamed from: c */
        final /* synthetic */ Context f99306c;

        C38179d(AwemeSharePackage awemeSharePackage, C38343b bVar, Context context) {
            this.f99304a = awemeSharePackage;
            this.f99305b = bVar;
            this.f99306c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m121954a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m121954a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f99305b;
            Uri a = C38159c.m121911a(str, C38159c.m121910a());
            String string = this.f99306c.getString(R.string.e7g);
            C7573i.m23582a((Object) string, "context.getString(R.string.tiktok_email_title)");
            String a2 = C1642a.m8034a(string, Arrays.copyOf(new Object[]{this.f99304a.f20186l.getString("author_name")}, 1));
            C7573i.m23582a((Object) a2, "java.lang.String.format(format, *args)");
            C38359j jVar = new C38359j(a, null, " ", null, a2, null, 42, null);
            bVar.mo95746a(jVar, this.f99306c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$e */
    static final class C38180e extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38343b f99307a;

        /* renamed from: b */
        final /* synthetic */ Context f99308b;

        C38180e(C38343b bVar, Context context) {
            this.f99307a = bVar;
            this.f99308b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m121955a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m121955a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f99307a;
            C38359j jVar = new C38359j(C38159c.m121911a(str, C38159c.m121910a()), null, null, null, null, null, 62, null);
            String str2 = "content_url";
            String str3 = jVar.f99580g;
            if (str3 == null) {
                str3 = "";
            }
            jVar.mo95938a(str2, str3);
            jVar.mo95938a("media_type", "video/mp4");
            bVar.mo95746a(jVar, this.f99308b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$f */
    static final class C38181f extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ AwemeSharePackage f99309a;

        /* renamed from: b */
        final /* synthetic */ C38343b f99310b;

        /* renamed from: c */
        final /* synthetic */ Context f99311c;

        C38181f(AwemeSharePackage awemeSharePackage, C38343b bVar, Context context) {
            this.f99309a = awemeSharePackage;
            this.f99310b = bVar;
            this.f99311c = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m121956a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m121956a(String str) {
            C7573i.m23587b(str, "it");
            if (C38157b.m121907a(new File(str))) {
                String a = C38159c.m121914a(this.f99309a.f20185k, this.f99310b);
                try {
                    C38343b bVar = this.f99310b;
                    C38359j jVar = new C38359j(C38159c.m121911a(str, C38159c.m121910a()), str, null, null, null, a, 28, null);
                    bVar.mo71406a((C38354f) jVar, this.f99311c);
                } catch (ShareException e) {
                    String message = e.getMessage();
                    int hashCode = message.hashCode();
                    if (hashCode != 1212011917) {
                        if (hashCode == 1703438795 && message.equals("video_too_long")) {
                            C10761a.m31399c(this.f99311c, (int) R.string.fp0).mo25750a();
                            C38104i iVar = new C38104i(this.f99309a.f99302a, null, true, 0, 10, null);
                            iVar.mo95712a(this.f99311c, this.f99309a);
                        }
                    } else if (message.equals("file_too_large")) {
                        C10761a.m31399c(this.f99311c, (int) R.string.foz).mo25750a();
                        C38104i iVar2 = new C38104i(this.f99309a.f99302a, null, true, 0, 10, null);
                        iVar2.mo95712a(this.f99311c, this.f99309a);
                    }
                }
            } else {
                C6907h.onEventV3("share_snapchat_oversized");
                C10761a.m31399c(this.f99311c, (int) R.string.foz).mo25750a();
                C38104i iVar3 = new C38104i(this.f99309a.f99302a, null, true, 0, 10, null);
                iVar3.mo95712a(this.f99311c, this.f99309a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$g */
    static final class C38182g extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38343b f99312a;

        /* renamed from: b */
        final /* synthetic */ Context f99313b;

        C38182g(C38343b bVar, Context context) {
            this.f99312a = bVar;
            this.f99313b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m121957a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m121957a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f99312a;
            Uri a = C42972bf.m136419a(this.f99313b, new File(str));
            C7573i.m23582a((Object) a, "FileProviderUtils.getFil…derUri(context, File(it))");
            C38359j jVar = new C38359j(a, null, null, null, null, null, 62, null);
            bVar.mo95746a(jVar, this.f99313b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$h */
    static final class C38183h extends Lambda implements C7562b<String, C7581n> {

        /* renamed from: a */
        final /* synthetic */ C38343b f99314a;

        /* renamed from: b */
        final /* synthetic */ Context f99315b;

        C38183h(C38343b bVar, Context context) {
            this.f99314a = bVar;
            this.f99315b = context;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m121958a((String) obj);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m121958a(String str) {
            C7573i.m23587b(str, "it");
            C38343b bVar = this.f99314a;
            Uri a = C42972bf.m136419a(this.f99315b, new File(str));
            C7573i.m23582a((Object) a, "FileProviderUtils.getFil…derUri(context, File(it))");
            C38359j jVar = new C38359j(a, null, null, null, null, null, 62, null);
            bVar.mo95746a(jVar, this.f99315b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$i */
    public static final class C38184i implements C28689b {

        /* renamed from: a */
        final /* synthetic */ C7562b f99316a;

        /* renamed from: a */
        public final void mo63019a() {
        }

        /* renamed from: b */
        public final void mo63021b() {
        }

        C38184i(C7562b bVar) {
            this.f99316a = bVar;
        }

        /* renamed from: a */
        public final void mo63020a(String str) {
            C7573i.m23587b(str, "outPath");
            this.f99316a.invoke(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.AwemeSharePackage$j */
    public static final class C38185j implements C28689b {

        /* renamed from: a */
        final /* synthetic */ C38307i f99317a;

        /* renamed from: b */
        final /* synthetic */ Context f99318b;

        /* renamed from: a */
        public final void mo63019a() {
        }

        /* renamed from: b */
        public final void mo63021b() {
        }

        /* renamed from: a */
        public final void mo63020a(String str) {
            C38307i iVar = this.f99317a;
            Uri a = C42972bf.m136419a(this.f99318b, new File(str));
            C7573i.m23582a((Object) a, "FileProviderUtils.getFil…i(context, File(outPath))");
            C38359j jVar = new C38359j(a, null, null, null, null, null, 62, null);
            iVar.mo95746a(jVar, this.f99318b);
        }

        C38185j(C38307i iVar, Context context) {
            this.f99317a = iVar;
            this.f99318b = context;
        }
    }

    /* renamed from: a */
    private final boolean m121940a() {
        if (!C6399b.m19947w() || !C32326h.m104887i() || !C28482e.m93619l(this.f99302a)) {
            return false;
        }
        return true;
    }

    public AwemeSharePackage(C38176a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        this.f99302a = aVar.f99303a;
    }

    public AwemeSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38176a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        if (bVar instanceof C38295c) {
            return new C38358i(C38159c.m121914a(this.f20185k, bVar), C38159c.m121910a().getString(R.string.dap));
        } else if (bVar instanceof C38331u) {
            C38356g gVar = new C38356g(C38159c.m121914a(this.f20185k, bVar), null, C37996b.m121311a(this.f20184j), 2, null);
            return gVar;
        } else {
            C38356g gVar2 = new C38356g(C38159c.m121914a(this.f20185k, bVar), null, null, 6, null);
            return gVar2;
        }
    }

    /* renamed from: a */
    private final void m121938a(C38307i iVar, Context context) {
        if (this.f99302a != null) {
            C37950a.m121238a().downloadAwemeThenShare(C38157b.m121903a(context), this.f99302a, !C28687a.m94370e(this.f99302a), this.f20186l.getInt("page_type"), iVar.mo95739b(), new C38185j(iVar, context), null, false, this.f20186l.getString("enter_from"), "click_download_icon");
        }
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C37950a.m121238a().saveShareChannel(bVar);
        if (this.f99302a == null) {
            return false;
        }
        if (!C37984ap.m121302b().checkShareAllowStatus(this.f99302a, context)) {
            return true;
        }
        C38025a.m121371a().mo95663a(bVar.mo95739b(), 0);
        if (bVar instanceof C38295c) {
            if (m121940a()) {
                return false;
            }
            m121939a(bVar, context, new C38179d(this, bVar, context));
            return true;
        } else if (bVar instanceof C38307i) {
            m121938a((C38307i) bVar, context);
            return true;
        } else if (bVar instanceof C38309j) {
            m121939a(bVar, context, new C38180e(bVar, context));
            return true;
        } else if (bVar instanceof C38327s) {
            m121939a(bVar, context, new C38181f(this, bVar, context));
            return true;
        } else if ((bVar instanceof C38305h) || (bVar instanceof C38293b) || (bVar instanceof C38341z) || (bVar instanceof C38339y) || (bVar instanceof C38313l)) {
            m121939a(bVar, context, new C38182g(bVar, context));
            return true;
        } else if (!(bVar instanceof C38337x) || C37950a.m121238a().whatsappShareLink(this.f99302a)) {
            return false;
        } else {
            m121939a(bVar, context, new C38183h(bVar, context));
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        if (!C7573i.m23585a((Object) fVar.mo95715b(), (Object) "download") || C6399b.m19921a().getExternalFilesDir(null) != null || C38157b.m121909b(context)) {
            return false;
        }
        C38159c.m121915a(context);
        return false;
    }

    /* renamed from: a */
    private final void m121939a(C38343b bVar, Context context, C7562b<? super String, C7581n> bVar2) {
        boolean z;
        ShareDependService a = C37950a.m121238a();
        Activity a2 = C38157b.m121903a(context);
        Aweme aweme = this.f99302a;
        if (aweme == null) {
            C7573i.m23580a();
        }
        if (!C7573i.m23585a((Object) bVar.mo95739b(), (Object) "instagram") || C28687a.m94370e(this.f99302a)) {
            z = false;
        } else {
            z = true;
        }
        a.downloadAwemeThenShare(a2, aweme, z, this.f20186l.getInt("page_type"), bVar.mo95739b(), new C38184i(bVar2), null, false, this.f20186l.getString("enter_from"), "click_download_icon");
    }
}
