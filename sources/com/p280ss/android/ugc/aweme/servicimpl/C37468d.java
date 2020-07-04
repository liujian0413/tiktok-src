package com.p280ss.android.ugc.aweme.servicimpl;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.photo.PhotoModule;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.property.AVAB.Property;
import com.p280ss.android.ugc.aweme.shortvideo.C38427ad;
import com.p280ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p280ss.android.ugc.aweme.status.C41821f;
import com.p280ss.android.ugc.aweme.tools.live.LiveSettingApi;
import com.p280ss.android.ugc.aweme.tools.live.LiveSettingApi.API;
import com.p280ss.android.ugc.aweme.tools.live.LiveSettingApi.C42348a;
import com.p280ss.android.ugc.aweme.tools.live.p1671a.C42359a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1677c.C42517a;
import com.p280ss.android.ugc.aweme.tools.mvtemplate.p1678d.C42537b;
import com.p280ss.android.ugc.aweme.utils.C43119fc;
import com.p280ss.android.ugc.gamora.bottomtab.C43864Op;
import com.p280ss.android.ugc.gamora.bottomtab.C43865a;
import com.p280ss.android.ugc.gamora.bottomtab.C43867c;
import com.p280ss.android.ugc.gamora.bottomtab.C43868d;
import com.p280ss.android.ugc.gamora.integration.C44389a;
import com.p280ss.android.ugc.gamora.p1486a.C36113b;
import com.p280ss.android.ugc.gamora.recorder.C44442a;
import com.p280ss.android.ugc.gamora.recorder.RecordViewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.servicimpl.d */
public final class C37468d implements C44389a {

    /* renamed from: com.ss.android.ugc.aweme.servicimpl.d$a */
    static final class C37469a<TTaskResult, TContinuationResult> implements C1591g<C42348a, Object> {

        /* renamed from: a */
        final /* synthetic */ C37468d f97787a;

        /* renamed from: b */
        final /* synthetic */ C43868d f97788b;

        C37469a(C37468d dVar, C43868d dVar2) {
            this.f97787a = dVar;
            this.f97788b = dVar2;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C42348a> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (hVar.mo6882b()) {
                C35563c.f93258u.mo83195a(((C42348a) hVar.mo6890e()).f110149a);
                if (C37468d.m120141a(this.f97788b.mo106146e())) {
                    RecordViewModel recordViewModel = (RecordViewModel) C36113b.m116288a(this.f97788b.mo106145d()).mo91871a(RecordViewModel.class);
                    C43865a aVar = new C43865a(C43864Op.ADD, this.f97787a.mo94789a(this.f97788b), new C42359a(), 0, 8, null);
                    recordViewModel.mo106831a(aVar);
                }
            }
            return null;
        }
    }

    /* renamed from: b */
    private static boolean m120143b() {
        return C35563c.f93231M.mo93305a(Property.StudioEnableRecorderTutorial);
    }

    /* renamed from: a */
    private static boolean m120140a() {
        if (C6399b.m19944t() || C35563c.f93231M.mo93306b(Property.LiveMvTabOrder) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m120146c(ShortVideoContext shortVideoContext) {
        return PhotoModule.m112050a(shortVideoContext.f99788x);
    }

    /* renamed from: b */
    private static boolean m120144b(ShortVideoContext shortVideoContext) {
        if (shortVideoContext.mo96142d() || shortVideoContext.mo96144e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final int mo94789a(C43868d dVar) {
        int i;
        boolean b = m120145b(dVar);
        boolean a = m120140a();
        if (!m120143b() || C6399b.m19946v() || !m120146c(dVar.mo106146e())) {
            i = 0;
        } else {
            i = 1;
        }
        if (b && a) {
            i = 1;
        }
        return C44442a.m140572a().size() - i;
    }

    /* renamed from: b */
    private static boolean m120145b(C43868d dVar) {
        if (C42537b.m135184a() && !dVar.mo106146e().mo96142d() && !dVar.mo106146e().mo96144e()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m120141a(ShortVideoContext shortVideoContext) {
        if (C6399b.m19946v()) {
            if (!C35563c.f93259v.mo83156d() || !C35563c.f93258u.mo83199b() || shortVideoContext.mo96142d() || shortVideoContext.mo96144e() || !C7573i.m23585a((Object) "direct_shoot", (Object) shortVideoContext.f99788x)) {
                return false;
            }
            return true;
        } else if (C6399b.m19944t()) {
            if ((C7573i.m23585a((Object) "direct_shoot", (Object) shortVideoContext.f99788x) || C7573i.m23585a((Object) "urge_update", (Object) shortVideoContext.f99788x)) && C35563c.f93258u.mo83196a()) {
                return true;
            }
            return false;
        } else if ((C7573i.m23585a((Object) "direct_shoot", (Object) shortVideoContext.f99788x) || C7573i.m23585a((Object) "urge_update", (Object) shortVideoContext.f99788x) || C7573i.m23585a((Object) "prop_reuse", (Object) shortVideoContext.f99788x) || C7573i.m23585a((Object) "single_song", (Object) shortVideoContext.f99788x) || C7573i.m23585a((Object) "prop_page", (Object) shortVideoContext.f99788x) || C7573i.m23585a((Object) "challenge", (Object) shortVideoContext.f99788x)) && C35563c.f93258u.mo83196a()) {
            return true;
        } else {
            return false;
        }
    }

    public final List<C43867c> getRecordBottomTabComponents(C43868d dVar) {
        C7573i.m23587b(dVar, "recordEnv");
        List<C43867c> arrayList = new ArrayList<>();
        boolean b = m120143b();
        boolean e = C38427ad.f99866a.mo96334e();
        boolean b2 = m120144b(dVar.mo106146e());
        if (!b2 && b) {
            arrayList.add(new C37465c());
        }
        if (C6399b.m19946v()) {
            if (!b2 && C38427ad.m122858d()) {
                arrayList.add(new C41821f(C43119fc.m136748a(MTabConfig.RECORD_STATUS.getNameResId()), C43119fc.m136748a(MTabConfig.RECORD_STATUS.getTagResId()), "status", false));
            }
            if (!e || b2) {
                arrayList.add(new C37463b(C43119fc.m136748a(MTabConfig.RECORD_COMBINE.getNameResId()), C43119fc.m136748a(MTabConfig.RECORD_COMBINE.getTagResId()), "video", false));
            }
            if (e && !b2) {
                arrayList.add(new C37463b(C43119fc.m136748a(MTabConfig.RECORD_COMBINE_60.getNameResId()), C43119fc.m136748a(MTabConfig.RECORD_COMBINE_60.getTagResId()), "video_60", false));
            }
            if (e && !b2) {
                arrayList.add(new C37463b(C43119fc.m136748a(MTabConfig.RECORD_COMBINE_15.getNameResId()), C43119fc.m136748a(MTabConfig.RECORD_COMBINE_15.getTagResId()), "video_15", false));
            }
        } else {
            boolean c = C38427ad.m122857c();
            if (!b && m120146c(dVar.mo106146e())) {
                arrayList.add(new C37450aa(C43119fc.m136748a(DTTabConfig.PHOTO_SHORT.getNameResId()), C43119fc.m136748a(DTTabConfig.PHOTO_SHORT.getTagResId()), "photo", false));
                C19282c.m63182a(C35563c.f93238a, "show_take_photo_entrance", "shoot_page");
            }
            if (!b2 && C38427ad.m122858d()) {
                arrayList.add(new C41821f(C43119fc.m136748a(MTabConfig.RECORD_STATUS.getNameResId()), C43119fc.m136748a(DTTabConfig.RECORD_STATUS.getTagResId()), "status", false));
            }
            if (!c) {
                arrayList.add(new C37448a(C43119fc.m136748a(DTTabConfig.RECORD_CLICK.getNameResId()), C43119fc.m136748a(DTTabConfig.RECORD_CLICK.getTagResId()), "click", false));
            }
            if (!c) {
                arrayList.add(new C37523y(C43119fc.m136748a(DTTabConfig.RECORD_NORMAL.getNameResId()), C43119fc.m136748a(DTTabConfig.RECORD_NORMAL.getTagResId()), "press", false));
            }
            if (c && (!e || b2)) {
                arrayList.add(new C37463b(C43119fc.m136748a(DTTabConfig.RECORD_COMBINE.getNameResId()), C43119fc.m136748a(DTTabConfig.RECORD_COMBINE.getTagResId()), "video", false));
            }
            if (e && !b2) {
                arrayList.add(new C37463b(C43119fc.m136748a(DTTabConfig.RECORD_COMBINE_60.getNameResId()), C43119fc.m136748a(DTTabConfig.RECORD_COMBINE_60.getTagResId()), "video_60", false));
            }
            if (e && !b2) {
                arrayList.add(new C37463b(C43119fc.m136748a(DTTabConfig.RECORD_COMBINE_15.getNameResId()), C43119fc.m136748a(DTTabConfig.RECORD_COMBINE_15.getTagResId()), "video_15", false));
            }
        }
        if (m120140a()) {
            m120142b(dVar, arrayList);
            m120139a(dVar, arrayList);
        } else {
            m120139a(dVar, arrayList);
            m120142b(dVar, arrayList);
        }
        if (b && !C6399b.m19946v() && m120146c(dVar.mo106146e())) {
            arrayList.add(new C37450aa(C43119fc.m136748a(DTTabConfig.PHOTO_SHORT.getNameResId()), C43119fc.m136748a(DTTabConfig.PHOTO_SHORT.getTagResId()), "photo", false));
            C19282c.m63182a(C35563c.f93238a, "show_take_photo_entrance", "shoot_page");
        }
        return arrayList;
    }

    /* renamed from: a */
    private final List<C43867c> m120139a(C43868d dVar, List<C43867c> list) {
        if (m120145b(dVar)) {
            list.add(new C42517a());
        }
        return list;
    }

    /* renamed from: b */
    private final List<C43867c> m120142b(C43868d dVar, List<C43867c> list) {
        if (m120141a(dVar.mo106146e())) {
            list.add(new C42359a());
        } else {
            API a = LiveSettingApi.m134640a();
            C7573i.m23582a((Object) a, "LiveSettingApi.getInstance()");
            a.getLivePodCast().mo6876a((C1591g<TResult, TContinuationResult>) new C37469a<TResult,TContinuationResult>(this, dVar), C1592h.f5958b);
        }
        return list;
    }
}
