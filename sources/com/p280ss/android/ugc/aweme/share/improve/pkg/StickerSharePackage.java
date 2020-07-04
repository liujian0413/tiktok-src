package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.common.C25652b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28442a;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.qrcode.p1499v2.QRCodeActivityV2;
import com.p280ss.android.ugc.aweme.share.C37984ap;
import com.p280ss.android.ugc.aweme.share.improve.CommonShareDialog;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38090d;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38137y;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38142a;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38144b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d.C38387a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage */
public final class StickerSharePackage extends SharePackage {
    public static final Creator<StickerSharePackage> CREATOR = new C38226c();

    /* renamed from: c */
    public static final C38224b f99375c = new C38224b(null);

    /* renamed from: a */
    public final NewFaceStickerBean f99376a;

    /* renamed from: b */
    public final String f99377b;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a */
    public static final class C38223a extends C7219a<StickerSharePackage> {

        /* renamed from: a */
        public NewFaceStickerBean f99378a;

        /* renamed from: b */
        public String f99379b;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public StickerSharePackage mo18866a() {
            return new StickerSharePackage(this);
        }

        /* renamed from: a */
        public final C38223a mo95809a(String str) {
            this.f99379b = str;
            return this;
        }

        /* renamed from: a */
        public final C38223a mo95808a(NewFaceStickerBean newFaceStickerBean) {
            C7573i.m23587b(newFaceStickerBean, "sticker");
            this.f99378a = newFaceStickerBean;
            return this;
        }

        /* renamed from: a */
        public final C38223a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            Serializable readSerializable = parcel.readSerializable();
            if (!(readSerializable instanceof NewFaceStickerBean)) {
                readSerializable = null;
            }
            this.f99378a = (NewFaceStickerBean) readSerializable;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$b */
    public static final class C38224b {

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$b$a */
        public static final class C38225a implements C38386d {

            /* renamed from: a */
            final /* synthetic */ NewFaceStickerBean f99380a;

            C38225a(NewFaceStickerBean newFaceStickerBean) {
                this.f99380a = newFaceStickerBean;
            }

            /* renamed from: a */
            public final void mo67217a(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                C38387a.m122614b(this, sharePackage, context);
            }

            /* renamed from: b */
            public final void mo67219b(SharePackage sharePackage, Context context) {
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                C38387a.m122613a(this, sharePackage, context);
            }

            /* renamed from: a */
            public final void mo67218a(C38389f fVar, SharePackage sharePackage, Context context) {
                C7573i.m23587b(fVar, "action");
                C7573i.m23587b(sharePackage, "sharePackage");
                C7573i.m23587b(context, "context");
                if (fVar instanceof C38090d) {
                    m122113a(fVar.mo95715b(), true, sharePackage, context, this.f99380a);
                    return;
                }
                if (fVar instanceof C38137y) {
                    m122113a(fVar.mo95715b(), true, sharePackage, context, this.f99380a);
                }
            }

            /* renamed from: a */
            public final void mo67216a(C38343b bVar, boolean z, SharePackage sharePackage, Context context) {
                C7573i.m23587b(bVar, "channel");
                C7573i.m23587b(context, "context");
                m122113a(bVar.mo95739b(), z, sharePackage, context, this.f99380a);
            }

            /* renamed from: a */
            private static void m122113a(String str, boolean z, SharePackage sharePackage, Context context, NewFaceStickerBean newFaceStickerBean) {
                if (z && C6399b.m19944t() && newFaceStickerBean != null) {
                    C25652b bVar = new C25652b();
                    bVar.mo66536a(new C28442a());
                    bVar.mo56976a(newFaceStickerBean.f108868id, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(5), str);
                }
            }
        }

        private C38224b() {
        }

        public /* synthetic */ C38224b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo95810a(Activity activity, NewFaceStickerBean newFaceStickerBean, String str, List<? extends Aweme> list, String str2) {
            ShareInfo shareInfo;
            C7573i.m23587b(activity, "activity");
            if (newFaceStickerBean != null) {
                shareInfo = newFaceStickerBean.shareInfo;
            } else {
                shareInfo = null;
            }
            if (shareInfo != null) {
                StickerSharePackage a = m122111a(newFaceStickerBean, (Context) activity, str, list, str2);
                C38225a aVar = new C38225a(newFaceStickerBean);
                C38382b bVar = new C38382b();
                SharePackage sharePackage = a;
                C38144b bVar2 = new C38144b(sharePackage, "", 0, 4, null);
                bVar.mo95963a((C38343b) bVar2);
                C37984ap.m121301a().injectUniversalConfig(bVar, activity, true);
                bVar.mo95964a(sharePackage);
                bVar.mo95963a((C38343b) new C38142a());
                bVar.mo95967a((C38389f) new C38137y(null, false, 3, null));
                bVar.mo95966a((C38386d) aVar);
                CommonShareDialog commonShareDialog = new CommonShareDialog(activity, bVar.mo95972a(), 0, 4, null);
                commonShareDialog.show();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
            if (r1 == null) goto L_0x0032;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
            if (r1 == null) goto L_0x0042;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static com.p280ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage m122111a(com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r5, android.content.Context r6, java.lang.String r7, java.util.List<? extends com.p280ss.android.ugc.aweme.feed.model.Aweme> r8, java.lang.String r9) {
            /*
                java.lang.String r0 = "sticker"
                kotlin.jvm.internal.C7573i.m23587b(r5, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.C7573i.m23587b(r6, r0)
                com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a r0 = new com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a
                r0.<init>()
                com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a r0 = r0.mo95808a(r5)
                com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a r0 = r0.mo95809a(r7)
                java.lang.String r1 = "sticker"
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r0 = r0.mo18868d(r1)
                java.lang.String r1 = r5.f108868id
                java.lang.String r2 = "sticker.id"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r0 = r0.mo18869e(r1)
                com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r5.shareInfo
                if (r1 == 0) goto L_0x0032
                java.lang.String r1 = r1.getShareTitle()
                if (r1 != 0) goto L_0x0034
            L_0x0032:
                java.lang.String r1 = " "
            L_0x0034:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r0 = r0.mo18870f(r1)
                com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r5.shareInfo
                if (r1 == 0) goto L_0x0042
                java.lang.String r1 = r1.getShareDesc()
                if (r1 != 0) goto L_0x0044
            L_0x0042:
                java.lang.String r1 = " "
            L_0x0044:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r0 = r0.mo18871g(r1)
                com.ss.android.ugc.aweme.base.share.ShareInfo r1 = r5.shareInfo
                if (r1 == 0) goto L_0x0051
                java.lang.String r1 = r1.getShareUrl()
                goto L_0x0052
            L_0x0051:
                r1 = 0
            L_0x0052:
                java.lang.String r1 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b.m121908b(r1)
                if (r1 != 0) goto L_0x005a
                java.lang.String r1 = ""
            L_0x005a:
                com.ss.android.ugc.aweme.sharer.ui.SharePackage$a r0 = r0.mo18872h(r1)
                com.ss.android.ugc.aweme.sharer.ui.SharePackage r0 = r0.mo18866a()
                com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage r0 = (com.p280ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage) r0
                android.os.Bundle r1 = r0.f20186l
                java.lang.String r2 = "app_name"
                r3 = 2131820918(0x7f110176, float:1.9274565E38)
                java.lang.String r6 = r6.getString(r3)
                r1.putString(r2, r6)
                java.lang.String r6 = "video_cover"
                com.ss.android.ugc.aweme.base.model.UrlModel r2 = r5.iconUrl
                java.io.Serializable r2 = (java.io.Serializable) r2
                r1.putSerializable(r6, r2)
                java.lang.String r6 = "sticker_id"
                java.lang.String r2 = r5.f108868id
                r1.putString(r6, r2)
                java.lang.String r6 = "sticker_name"
                java.lang.String r2 = r5.name
                r1.putString(r6, r2)
                java.lang.String r6 = "user_count"
                long r2 = r5.userCount
                r1.putLong(r6, r2)
                java.lang.String r6 = "group_id"
                if (r7 != 0) goto L_0x0096
                java.lang.String r7 = ""
            L_0x0096:
                r1.putString(r6, r7)
                java.lang.String r6 = "user_id"
                java.lang.String r5 = r5.ownerId
                r1.putString(r6, r5)
                java.lang.String r5 = "log_pb"
                if (r9 != 0) goto L_0x00a6
                java.lang.String r9 = ""
            L_0x00a6:
                r1.putString(r5, r9)
                r5 = r8
                java.util.Collection r5 = (java.util.Collection) r5
                r6 = 0
                r7 = 1
                if (r5 == 0) goto L_0x00b9
                boolean r5 = r5.isEmpty()
                if (r5 == 0) goto L_0x00b7
                goto L_0x00b9
            L_0x00b7:
                r5 = 0
                goto L_0x00ba
            L_0x00b9:
                r5 = 1
            L_0x00ba:
                if (r5 != 0) goto L_0x010d
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
                java.util.List r5 = (java.util.List) r5
                java.util.Iterator r8 = r8.iterator()
            L_0x00c7:
                boolean r9 = r8.hasNext()
                r2 = 3
                if (r9 == 0) goto L_0x00fe
                java.lang.Object r9 = r8.next()
                com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.p280ss.android.ugc.aweme.feed.model.Aweme) r9
                int r3 = r9.getAwemeType()
                r4 = 2
                if (r3 != r4) goto L_0x00e5
                com.ss.android.ugc.aweme.base.model.UrlModel r9 = com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c.m121913a(r9)
                if (r9 == 0) goto L_0x00fa
                r5.add(r9)
                goto L_0x00fa
            L_0x00e5:
                com.ss.android.ugc.aweme.feed.model.Video r9 = r9.getVideo()
                java.lang.String r3 = "aweme.video"
                kotlin.jvm.internal.C7573i.m23582a(r9, r3)
                com.ss.android.ugc.aweme.base.model.UrlModel r9 = r9.getCover()
                java.lang.String r3 = "aweme.video.cover"
                kotlin.jvm.internal.C7573i.m23582a(r9, r3)
                r5.add(r9)
            L_0x00fa:
                int r6 = r6 + r7
                if (r6 >= r2) goto L_0x00fe
                goto L_0x00c7
            L_0x00fe:
                int r6 = r5.size()
                if (r6 < r2) goto L_0x010d
                java.lang.String r6 = "aweme_cover_list"
                java.lang.String r5 = com.alibaba.fastjson.JSON.toJSONString(r5)
                r1.putString(r6, r5)
            L_0x010d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage.C38224b.m122111a(com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean, android.content.Context, java.lang.String, java.util.List, java.lang.String):com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$c */
    public static final class C38226c implements Creator<StickerSharePackage> {
        C38226c() {
        }

        /* renamed from: a */
        private static StickerSharePackage[] m122119a(int i) {
            return new StickerSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122118a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122119a(i);
        }

        /* renamed from: a */
        private static StickerSharePackage m122118a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new StickerSharePackage(parcel);
        }
    }

    /* renamed from: a */
    public static final void m122101a(Activity activity, NewFaceStickerBean newFaceStickerBean, String str, List<? extends Aweme> list, String str2) {
        f99375c.mo95810a(activity, newFaceStickerBean, str, list, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public StickerSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38223a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20184j, this.f20184j);
    }

    public StickerSharePackage(C38223a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        NewFaceStickerBean newFaceStickerBean = aVar.f99378a;
        if (newFaceStickerBean == null) {
            C7573i.m23580a();
        }
        this.f99376a = newFaceStickerBean;
        String str = aVar.f99379b;
        if (str == null) {
            str = "";
        }
        this.f99377b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (parcel != null) {
            parcel.writeSerializable(this.f99376a);
        }
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C37984ap.m121302b().addShareRecord(bVar.mo95739b(), 2);
        return false;
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        if (!(fVar instanceof C38137y)) {
            return false;
        }
        C6907h.m21524a("enter_personal_detail", (Map) C22984d.m75611a().mo59973a("prop_id", this.f99376a.f108868id).mo59973a("to_user_id", this.f99376a.ownerId).mo59973a("group_id", this.f99377b).mo59973a("enter_from", "prop_page").mo59973a("enter_method", "click_name").f60753a);
        if (!C38037a.m121403a()) {
            C10761a.m31410e(context, context.getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
            return true;
        }
        QRCodeActivityV2.m119235a(context, new C36995a().mo93428a(17, this.f99376a.f108868id, "sticker").mo93434b(this.f99376a.name, this.f99376a.userCount).f96920a);
        return true;
    }
}
