package com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.shortvideo.AVMusic;
import com.p280ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C40173d;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42595e;
import com.p280ss.android.ugc.aweme.toolsport.IAVMusicService.C42596f;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.aa */
public final class C40120aa implements C40129c, C42596f {

    /* renamed from: a */
    public final Activity f104303a;

    /* renamed from: b */
    private ShortVideoContext f104304b;

    /* renamed from: c */
    private String f104305c;

    /* renamed from: d */
    private C42595e f104306d;

    /* renamed from: e */
    private C40119a f104307e;

    /* renamed from: f */
    private final PhotoMovieContext f104308f = new PhotoMovieContext();

    /* renamed from: a */
    private final void m128253a() {
        this.f104306d = C35563c.f93246i.mo103847a((C42596f) this);
        C42595e eVar = this.f104306d;
        if (eVar == null) {
            C7573i.m23583a("mMusicChoicesPresenter");
        }
        eVar.mo103868a(new Object[0]);
        C40119a a = C40119a.m128250a(this.f104303a, this.f104303a.getString(R.string.afl), "compress_photo_movie_loading.json");
        C7573i.m23582a((Object) a, "AwemeLoadingDialog.show(…RESS_PHOTO_MOVIE_LOADING)");
        this.f104307e = a;
    }

    public C40120aa(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f104303a = activity;
    }

    /* renamed from: a */
    public final void mo99876a(Exception exc, String str) {
        C40119a aVar = this.f104307e;
        if (aVar == null) {
            C7573i.m23583a("mLoadingDialog");
        }
        aVar.dismiss();
        m128254a(this.f104308f, (List<? extends AVMusic>) new ArrayList<Object>());
    }

    /* renamed from: a */
    public final void mo99877a(List<AVMusic> list, String str) {
        C40119a aVar = this.f104307e;
        if (aVar == null) {
            C7573i.m23583a("mLoadingDialog");
        }
        aVar.dismiss();
        if (list == null) {
            this.f104308f.mMusicList = null;
            list = new ArrayList<>();
        }
        this.f104308f.mMusicPath = str;
        m128254a(this.f104308f, list);
    }

    /* renamed from: a */
    private final void m128254a(PhotoMovieContext photoMovieContext, List<? extends AVMusic> list) {
        String str;
        String str2 = "upload_content_next";
        C40173d.m128359d();
        C22984d a = C22984d.m75611a().mo59973a("content_type", "slideshow");
        String str3 = "upload_type";
        if (photoMovieContext.getImageCount() > 1) {
            str = "multiple_content";
        } else {
            str = "single_content";
        }
        C6907h.m21524a(str2, (Map) a.mo59973a(str3, str).mo59970a("pic_cnt", photoMovieContext.getImageCount()).mo59970a("video_cnt", 0).f60753a);
        ShortVideoContext shortVideoContext = this.f104304b;
        if (shortVideoContext == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoMovieContext.creationId = shortVideoContext.f99787w;
        ShortVideoContext shortVideoContext2 = this.f104304b;
        if (shortVideoContext2 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoMovieContext.draftId = shortVideoContext2.f99790z;
        ShortVideoContext shortVideoContext3 = this.f104304b;
        if (shortVideoContext3 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoMovieContext.mShootWay = shortVideoContext3.f99788x;
        ShortVideoContext shortVideoContext4 = this.f104304b;
        if (shortVideoContext4 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoMovieContext.nationalTaskId = shortVideoContext4.f99715T;
        ShortVideoContext shortVideoContext5 = this.f104304b;
        if (shortVideoContext5 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        if (!C6307b.m19566a((Collection<T>) shortVideoContext5.f99716U)) {
            StringBuilder sb = new StringBuilder();
            ShortVideoContext shortVideoContext6 = this.f104304b;
            if (shortVideoContext6 == null) {
                C7573i.m23583a("shortVideoContext");
            }
            Iterator it = shortVideoContext6.f99716U.iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                sb.append("#");
                sb.append(str4);
                sb.append(" ");
            }
            photoMovieContext.title = sb.toString();
        }
        ShortVideoContext shortVideoContext7 = this.f104304b;
        if (shortVideoContext7 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoMovieContext.poiId = shortVideoContext7.f99704I;
        ShortVideoContext shortVideoContext8 = this.f104304b;
        if (shortVideoContext8 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoMovieContext.musicOrigin = shortVideoContext8.f99772h;
        String str5 = this.f104305c;
        if (str5 == null) {
            C7573i.m23583a("musicPath");
        }
        if (!TextUtils.isEmpty(str5)) {
            String str6 = this.f104305c;
            if (str6 == null) {
                C7573i.m23583a("musicPath");
            }
            photoMovieContext.mMusicPath = str6;
            photoMovieContext.mMusic = C39360dw.m125725a().mo97931b();
        } else if (C6311g.m19574b(list)) {
            photoMovieContext.mMusic = (AVMusic) list.get(0);
        }
        photoMovieContext.mFrom = 2;
        C39360dw a2 = C39360dw.m125725a();
        C7573i.m23582a((Object) a2, "PublishManager.inst()");
        photoMovieContext.challenges = a2.f102247b;
        ShortVideoContext shortVideoContext9 = this.f104304b;
        if (shortVideoContext9 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        C42311e.m134571a(C40005j.m127914b(shortVideoContext9), C40005j.m127911b((BaseShortVideoContext) photoMovieContext), Scene.RECORD, Scene.EDIT);
        C35563c.f93229K.openPhotoMovieActivity(this.f104303a, photoMovieContext, list, "upload");
    }

    /* renamed from: a */
    public final void mo88198a(int i, int i2, Intent intent) {
        String str;
        C7573i.m23587b(intent, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C7573i.m23582a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List<MediaModel> list = parcelableArrayListExtra;
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            C7573i.m23582a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f104304b = (ShortVideoContext) parcelableExtra;
            ShortVideoContext shortVideoContext = this.f104304b;
            if (shortVideoContext == null) {
                C7573i.m23583a("shortVideoContext");
            }
            Workspace workspace = shortVideoContext.f99775k;
            C7573i.m23582a((Object) workspace, "shortVideoContext.mWorkspace");
            if (workspace.mo96317e() != null) {
                ShortVideoContext shortVideoContext2 = this.f104304b;
                if (shortVideoContext2 == null) {
                    C7573i.m23583a("shortVideoContext");
                }
                Workspace workspace2 = shortVideoContext2.f99775k;
                C7573i.m23582a((Object) workspace2, "shortVideoContext.mWorkspace");
                File e = workspace2.mo96317e();
                C7573i.m23582a((Object) e, "shortVideoContext.mWorkspace.musicFile");
                str = e.getAbsolutePath();
                C7573i.m23582a((Object) str, "shortVideoContext.mWorks…ce.musicFile.absolutePath");
            } else {
                str = "";
            }
            this.f104305c = str;
            List arrayList = new ArrayList();
            this.f104308f.mImageList = new ArrayList();
            for (MediaModel b : list) {
                String b2 = b.mo86200b();
                C7573i.m23582a((Object) b2, "it.lngLatStr");
                arrayList.add(b2);
            }
            String a = C7525m.m23492a(arrayList, ";", null, null, 0, null, null, 62, null);
            if (!TextUtils.isEmpty(a)) {
                ShortVideoContext shortVideoContext3 = this.f104304b;
                if (shortVideoContext3 == null) {
                    C7573i.m23583a("shortVideoContext");
                }
                shortVideoContext3.f99756aq = a;
            }
            for (MediaModel mediaModel : list) {
                this.f104308f.mImageList.add(mediaModel.f88156b);
            }
            this.f104308f.mRealImageCount = this.f104308f.mImageList.size();
            m128253a();
        }
    }
}
