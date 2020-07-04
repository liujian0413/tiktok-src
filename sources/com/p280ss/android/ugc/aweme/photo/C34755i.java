package com.p280ss.android.ugc.aweme.photo;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.mediachoose.C33175g;
import com.p280ss.android.ugc.aweme.music.mediachoose.helper.MediaModel;
import com.p280ss.android.ugc.aweme.photo.edit.PhotoEditActivity;
import com.p280ss.android.ugc.aweme.shortvideo.C39360dw;
import com.p280ss.android.ugc.aweme.shortvideo.C40005j;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.C40129c;
import com.p280ss.android.ugc.aweme.shortvideo.p1551c.C38566l.C38567a;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import com.p280ss.android.ugc.aweme.tools.extension.C42311e;
import com.p280ss.android.ugc.aweme.tools.extension.Scene;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.photo.i */
public final class C34755i implements C40129c {

    /* renamed from: a */
    public final Activity f90599a;

    /* renamed from: b */
    private ShortVideoContext f90600b;

    /* renamed from: com.ss.android.ugc.aweme.photo.i$a */
    static final class C34756a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34755i f90601a;

        /* renamed from: b */
        final /* synthetic */ String f90602b;

        /* renamed from: c */
        final /* synthetic */ C41654d f90603c;

        C34756a(C34755i iVar, String str, C41654d dVar) {
            this.f90601a = iVar;
            this.f90602b = str;
            this.f90603c = dVar;
        }

        public final void run() {
            final PhotoContext a = C34758j.m112132a(this.f90602b, new C34729c());
            if (a != null) {
                a.md5 = C38567a.m123257a(new File(this.f90602b));
            }
            C6726a.m20844b(new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C34756a f90604a;

                {
                    this.f90604a = r1;
                }

                public final void run() {
                    this.f90604a.f90603c.dismiss();
                    if (a == null) {
                        C10761a.m31399c((Context) this.f90604a.f90601a.f90599a, (int) R.string.bsv).mo25750a();
                    } else {
                        this.f90604a.f90601a.mo88199a(a);
                    }
                }
            });
        }
    }

    public C34755i(Activity activity) {
        C7573i.m23587b(activity, "activity");
        this.f90599a = activity;
    }

    /* renamed from: a */
    private final void m112128a(String str) {
        C41654d b = C41654d.m132586b(this.f90599a, "");
        C7573i.m23582a((Object) b, "dialog");
        b.setIndeterminate(true);
        C23487o.m77138a((Dialog) b);
        C6726a.m20842a(new C34756a(this, str, b));
    }

    /* renamed from: a */
    public final void mo88199a(PhotoContext photoContext) {
        ShortVideoContext shortVideoContext = this.f90600b;
        if (shortVideoContext == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoContext.mShootWay = shortVideoContext.f99788x;
        C39360dw a = C39360dw.m125725a();
        C7573i.m23582a((Object) a, "PublishManager.inst()");
        photoContext.challenges = a.f102247b;
        ShortVideoContext shortVideoContext2 = this.f90600b;
        if (shortVideoContext2 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoContext.mPoiId = shortVideoContext2.f99704I;
        ShortVideoContext shortVideoContext3 = this.f90600b;
        if (shortVideoContext3 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoContext.microAppModel = shortVideoContext3.f99762aw;
        ShortVideoContext shortVideoContext4 = this.f90600b;
        if (shortVideoContext4 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        photoContext.mFromOtherPlatform = shortVideoContext4.f99763ax;
        C6907h.onEvent(MobClick.obtain().setEventName("upload_next").setLabelName("photo").setExtValueLong(1));
        C33175g.m107022a(false, 0, 1);
        ShortVideoContext shortVideoContext5 = this.f90600b;
        if (shortVideoContext5 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        C42311e.m134571a(C40005j.m127914b(shortVideoContext5), C40005j.m127908a(photoContext), Scene.RECORD, Scene.EDIT);
        ShortVideoContext shortVideoContext6 = this.f90600b;
        if (shortVideoContext6 == null) {
            C7573i.m23583a("shortVideoContext");
        }
        if (shortVideoContext6.f99763ax) {
            PhotoEditActivity.m112079a(this.f90599a, photoContext, 1002);
        } else {
            PhotoEditActivity.m112080a((Context) this.f90599a, photoContext);
        }
    }

    /* renamed from: a */
    public final void mo88198a(int i, int i2, Intent intent) {
        C7573i.m23587b(intent, "data");
        if (i == 1) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_choose_media_data");
            C7573i.m23582a((Object) parcelableArrayListExtra, "data.getParcelableArrayL…ia.KEY_CHOOSE_MEDIA_DATA)");
            List<MediaModel> list = parcelableArrayListExtra;
            List arrayList = new ArrayList();
            for (MediaModel b : list) {
                String b2 = b.mo86200b();
                C7573i.m23582a((Object) b2, "it.lngLatStr");
                arrayList.add(b2);
            }
            Parcelable parcelableExtra = intent.getParcelableExtra("key_short_video_context");
            C7573i.m23582a((Object) parcelableExtra, "data.getParcelableExtra(….KEY_SHORT_VIDEO_CONTEXT)");
            this.f90600b = (ShortVideoContext) parcelableExtra;
            String a = C7525m.m23492a(arrayList, ";", null, null, 0, null, null, 62, null);
            if (!TextUtils.isEmpty(a)) {
                ShortVideoContext shortVideoContext = this.f90600b;
                if (shortVideoContext == null) {
                    C7573i.m23583a("shortVideoContext");
                }
                shortVideoContext.f99756aq = a;
            }
            String str = ((MediaModel) list.get(0)).f88156b;
            C7573i.m23582a((Object) str, "selectedMediaData[0].filePath");
            m112128a(str);
        }
    }
}
