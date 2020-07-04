package com.p280ss.android.ugc.aweme.share.improve.pkg;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.alibaba.fastjson.JSON;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.C23323e;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.share.ShareInfo;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.music.model.Music;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams;
import com.p280ss.android.ugc.aweme.qrcode.QRCodeParams.C36995a;
import com.p280ss.android.ugc.aweme.share.C37990ar;
import com.p280ss.android.ugc.aweme.share.ShareDependService;
import com.p280ss.android.ugc.aweme.share.ShareDependService.C37950a;
import com.p280ss.android.ugc.aweme.share.improve.p1538a.C38137y;
import com.p280ss.android.ugc.aweme.share.improve.p1539b.C38142a;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38157b;
import com.p280ss.android.ugc.aweme.share.improve.p1540c.C38159c;
import com.p280ss.android.ugc.aweme.share.improve.p1541d.C38170b;
import com.p280ss.android.ugc.aweme.share.p1533d.C38025a;
import com.p280ss.android.ugc.aweme.share.p1536f.C38037a;
import com.p280ss.android.ugc.aweme.sharer.C38343b;
import com.p280ss.android.ugc.aweme.sharer.C38354f;
import com.p280ss.android.ugc.aweme.sharer.C38356g;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38380c.C38382b;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38386d;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38388e;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage;
import com.p280ss.android.ugc.aweme.sharer.p338ui.SharePackage.C7219a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage */
public final class MusicSharePackage extends SharePackage {
    public static final Creator<MusicSharePackage> CREATOR = new C38213c();

    /* renamed from: b */
    public static final C38212b f99361b = new C38212b(null);

    /* renamed from: a */
    public final Music f99362a;

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage$a */
    public static final class C38211a extends C7219a<MusicSharePackage> {

        /* renamed from: a */
        public Music f99363a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public MusicSharePackage mo18866a() {
            return new MusicSharePackage(this);
        }

        /* renamed from: a */
        public final C38211a mo95794a(Music music) {
            C7573i.m23587b(music, "music");
            this.f99363a = music;
            return this;
        }

        /* renamed from: a */
        public final C38211a mo18867b(Parcel parcel) {
            C7573i.m23587b(parcel, "source");
            super.mo18867b(parcel);
            Serializable readSerializable = parcel.readSerializable();
            if (!(readSerializable instanceof Music)) {
                readSerializable = null;
            }
            this.f99363a = (Music) readSerializable;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage$b */
    public static final class C38212b {
        private C38212b() {
        }

        public /* synthetic */ C38212b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        private static MusicSharePackage m122071a(Music music, Context context, List<? extends Aweme> list) {
            C7573i.m23587b(music, "music");
            C7573i.m23587b(context, "context");
            C7573i.m23587b(list, "awemeList");
            C7219a d = new C38211a().mo95794a(music).mo18868d("music");
            String mid = music.getMid();
            C7573i.m23582a((Object) mid, "music.mid");
            C7219a e = d.mo18869e(mid);
            ShareInfo shareInfo = music.getShareInfo();
            C7573i.m23582a((Object) shareInfo, "music.shareInfo");
            String shareTitle = shareInfo.getShareTitle();
            C7573i.m23582a((Object) shareTitle, "music.shareInfo.shareTitle");
            C7219a f = e.mo18870f(shareTitle);
            ShareInfo shareInfo2 = music.getShareInfo();
            C7573i.m23582a((Object) shareInfo2, "music.shareInfo");
            String shareDesc = shareInfo2.getShareDesc();
            C7573i.m23582a((Object) shareDesc, "music.shareInfo.shareDesc");
            C7219a g = f.mo18871g(shareDesc);
            ShareInfo shareInfo3 = music.getShareInfo();
            C7573i.m23582a((Object) shareInfo3, "music.shareInfo");
            String b = C38157b.m121908b(shareInfo3.getShareUrl());
            if (b == null) {
                b = "";
            }
            MusicSharePackage musicSharePackage = (MusicSharePackage) g.mo18872h(b).mo18866a();
            Bundle bundle = musicSharePackage.f20186l;
            bundle.putString("app_name", context.getString(R.string.jf));
            bundle.putString("thumb_url", new C37990ar(context, C23323e.m76499a(music.getCoverThumb())).f98919b);
            bundle.putSerializable("video_cover", music.getCoverMedium());
            bundle.putString("music_id", music.getMid());
            bundle.putString("music_name", music.getMusicName());
            bundle.putInt("user_count", music.getUserCount());
            bundle.putSerializable("cover_thumb", music.getCoverThumb());
            List arrayList = new ArrayList();
            int i = 0;
            for (Aweme aweme : list) {
                if (aweme.getAwemeType() == 2) {
                    UrlModel a = C38159c.m121913a(aweme);
                    if (a != null) {
                        arrayList.add(a);
                    }
                } else {
                    Video video = aweme.getVideo();
                    C7573i.m23582a((Object) video, "aweme.video");
                    UrlModel cover = video.getCover();
                    C7573i.m23582a((Object) cover, "aweme.video.cover");
                    arrayList.add(cover);
                }
                i++;
                if (i >= 3) {
                    break;
                }
            }
            if (arrayList.size() >= 3) {
                bundle.putString("aweme_cover_list", JSON.toJSONString(arrayList));
            }
            return musicSharePackage;
        }

        /* renamed from: a */
        public final void mo95795a(Activity activity, Music music, C38388e eVar, List<? extends Aweme> list) {
            C7573i.m23587b(activity, "activity");
            C7573i.m23587b(eVar, "listener");
            if (music != null && music.getShareInfo() != null) {
                Context context = activity;
                if (list == null) {
                    list = C7525m.m23461a();
                }
                MusicSharePackage a = m122071a(music, context, list);
                C38382b bVar = new C38382b();
                SharePackage sharePackage = a;
                bVar.mo95964a(sharePackage);
                bVar.mo95963a(C37950a.m121238a().getImChannel(sharePackage, "", -1));
                C38170b.m121927a(bVar, true, activity);
                bVar.mo95963a((C38343b) new C38142a());
                C38389f reportMusicAction = C37950a.m121238a().getReportMusicAction(music, context);
                if (reportMusicAction != null) {
                    bVar.mo95967a(reportMusicAction);
                }
                bVar.mo95967a((C38389f) new C38137y("", true));
                bVar.mo95966a((C38386d) eVar);
                C37950a.m121238a().scoopShareDialogWithImModule(activity, bVar.mo95972a(), R.style.t2).show();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.MusicSharePackage$c */
    public static final class C38213c implements Creator<MusicSharePackage> {
        C38213c() {
        }

        /* renamed from: a */
        private static MusicSharePackage[] m122074a(int i) {
            return new MusicSharePackage[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return m122073a(parcel);
        }

        public final /* synthetic */ Object[] newArray(int i) {
            return m122074a(i);
        }

        /* renamed from: a */
        private static MusicSharePackage m122073a(Parcel parcel) {
            C7573i.m23587b(parcel, "parcel");
            return new MusicSharePackage(parcel);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public MusicSharePackage(Parcel parcel) {
        C7573i.m23587b(parcel, "parcel");
        this(new C38211a().mo18867b(parcel));
    }

    /* renamed from: a */
    public final C38354f mo18860a(C38343b bVar) {
        C7573i.m23587b(bVar, "channel");
        return new C38356g(C38159c.m121914a(this.f20185k, bVar), this.f20183i, this.f20184j);
    }

    public MusicSharePackage(C38211a aVar) {
        C7573i.m23587b(aVar, "builder");
        super(aVar);
        Music music = aVar.f99363a;
        if (music == null) {
            C7573i.m23580a();
        }
        this.f99362a = music;
    }

    /* renamed from: a */
    private final void m122062a(Context context) {
        if (!C38037a.m121403a()) {
            C10761a.m31410e(context, context.getString(R.string.ae8, new Object[]{C38037a.m121404b()})).mo25750a();
            return;
        }
        QRCodeParams qRCodeParams = new C36995a().mo93428a(3, this.f99362a.getMid(), "single_song").mo93430a(C33230ac.m107207a(this.f99362a), C33230ac.m107213b(this.f99362a)).f96920a;
        ShareDependService a = C37950a.m121238a();
        C7573i.m23582a((Object) qRCodeParams, "params");
        a.startQrCodeActivity(context, qRCodeParams);
        C6907h.m21524a("click_qr_code", (Map) C22984d.m75611a().mo59971a("music_id", this.f99362a.getId()).mo59973a("platform", "scan").mo59973a("qr_code_type", "shaped").mo59973a("enter_from", "single_song").f60753a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        if (parcel != null) {
            parcel.writeSerializable(this.f99362a);
        }
    }

    /* renamed from: a */
    public final boolean mo18861a(C38343b bVar, Context context) {
        C7573i.m23587b(bVar, "channel");
        C7573i.m23587b(context, "context");
        C38025a.m121371a().mo95663a(bVar.mo95739b(), 2);
        return false;
    }

    /* renamed from: a */
    public final boolean mo18862a(C38389f fVar, Context context) {
        C7573i.m23587b(fVar, "action");
        C7573i.m23587b(context, "context");
        if (!(fVar instanceof C38137y)) {
            return false;
        }
        m122062a(context);
        return true;
    }
}
