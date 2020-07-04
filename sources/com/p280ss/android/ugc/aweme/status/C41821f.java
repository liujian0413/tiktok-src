package com.p280ss.android.ugc.aweme.status;

import android.app.Activity;
import android.arch.lifecycle.C0063u;
import android.arch.lifecycle.C0069x;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVSettings.Property;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.gamora.bottomtab.C43866b;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.bottomtab.C43869e;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f;
import com.p280ss.android.ugc.gamora.bottomtab.C43870f.C43871a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import com.p280ss.android.ugc.gamora.recorder.choosemusic.RecordChooseMusicViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.status.f */
public final class C41821f implements C43867c {

    /* renamed from: a */
    public Activity f108781a;

    /* renamed from: b */
    public ShortVideoContext f108782b;

    /* renamed from: c */
    public RecordStatusViewModel f108783c;

    /* renamed from: d */
    public C41817e f108784d = new C41817e();

    /* renamed from: e */
    private String f108785e;

    /* renamed from: f */
    private final String f108786f;

    /* renamed from: g */
    private final String f108787g;

    /* renamed from: h */
    private final boolean f108788h = false;

    /* renamed from: com.ss.android.ugc.aweme.status.f$a */
    public static final class C41822a implements C43870f {

        /* renamed from: a */
        final /* synthetic */ C41821f f108789a;

        /* renamed from: b */
        final /* synthetic */ C43868d f108790b;

        /* renamed from: b */
        public final boolean mo94783b(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            return false;
        }

        C41822a(C41821f fVar, C43868d dVar) {
            this.f108789a = fVar;
            this.f108790b = dVar;
        }

        /* renamed from: a */
        public final boolean mo94782a(C43866b bVar, C43871a aVar) {
            C7573i.m23587b(bVar, "model");
            C7573i.m23587b(aVar, "extraInfo");
            ((RecordViewModel) C36113b.m116288a(this.f108790b.mo106145d()).mo91871a(RecordViewModel.class)).mo106846k(false);
            ((RecordChooseMusicViewModel) C36113b.m116288a(this.f108790b.mo106145d()).mo91871a(RecordChooseMusicViewModel.class)).f114732d.setValue(null);
            C41821f.m133066a(this.f108789a).mo102543n().setValue(Integer.valueOf(1));
            C41821f.m133066a(this.f108789a).mo102542m().setValue(Boolean.valueOf(true));
            return false;
        }
    }

    public final C43869e bH_() {
        return this.f108784d;
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordStatusViewModel m133066a(C41821f fVar) {
        RecordStatusViewModel recordStatusViewModel = fVar.f108783c;
        if (recordStatusViewModel == null) {
            C7573i.m23583a("recordStatusViewModel");
        }
        return recordStatusViewModel;
    }

    /* renamed from: a */
    public final void mo94779a(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        this.f108781a = dVar.mo106145d();
        this.f108782b = dVar.mo106146e();
        C0063u a = C0069x.m159a(dVar.mo106145d()).mo147a(RecordStatusViewModel.class);
        C7573i.m23582a((Object) a, "ViewModelProviders.of(ta…tusViewModel::class.java)");
        this.f108783c = (RecordStatusViewModel) a;
    }

    /* renamed from: b */
    public final C43866b mo94780b(C43868d dVar) {
        C7573i.m23587b(dVar, "tabEnv");
        if (C7573i.m23585a((Object) C35563c.f93230L.mo93346e(Property.StatusTabKey), (Object) "creation_shoot_tab_text")) {
            Activity activity = this.f108781a;
            if (activity == null) {
                C7573i.m23583a("mActivity");
            }
            String string = activity.getString(R.string.alc);
            C7573i.m23582a((Object) string, "mActivity.getString(R.st….creation_shoot_tab_text)");
            this.f108785e = string;
        } else {
            Activity activity2 = this.f108781a;
            if (activity2 == null) {
                C7573i.m23583a("mActivity");
            }
            String string2 = activity2.getString(R.string.alb);
            C7573i.m23582a((Object) string2, "mActivity.getString(R.st…reation_shoot_tab_status)");
            this.f108785e = string2;
        }
        C43866b bVar = new C43866b(this.f108785e, this.f108786f, this.f108787g, this.f108788h, new C41822a(this, dVar));
        return bVar;
    }

    public C41821f(String str, String str2, String str3, boolean z) {
        C7573i.m23587b(str, "text");
        C7573i.m23587b(str2, "tag");
        C7573i.m23587b(str3, "shootMode");
        this.f108785e = str;
        this.f108786f = str2;
        this.f108787g = str3;
    }
}
