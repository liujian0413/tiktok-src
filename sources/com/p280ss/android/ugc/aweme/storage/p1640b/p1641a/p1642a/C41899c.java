package com.p280ss.android.ugc.aweme.storage.p1640b.p1641a.p1642a;

import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.draft.model.C27320g;
import com.p280ss.android.ugc.aweme.effect.EffectListModel;
import com.p280ss.android.ugc.aweme.effect.EffectPointModel;
import com.p280ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p280ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41902b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.C41903a;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41906b;
import com.p280ss.android.ugc.aweme.storage.p1640b.p1643b.p1644a.C41908c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.storage.b.a.a.c */
public final class C41899c extends C41898b {
    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final long mo102939c() {
        String str;
        long a = m133251a(this.f108977a.mo70275l()) + 0;
        MvCreateVideoData Q = this.f108977a.mo70175Q();
        if (Q != null) {
            ArrayList<String> arrayList = Q.selectMediaList;
            if (arrayList != null) {
                List<String> e = C7525m.m23510e(arrayList);
                if (e != null) {
                    for (String a2 : e) {
                        a += m133251a(a2);
                    }
                }
            }
        }
        MvCreateVideoData Q2 = this.f108977a.mo70175Q();
        if (Q2 != null) {
            str = Q2.videoCoverImgPath;
        } else {
            str = null;
        }
        return a + m133251a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo102937a() {
        String str;
        long a = m133251a(this.f108977a.f72031S.f71951O) + 0;
        EditPreviewInfo ac = this.f108977a.mo70214ac();
        if (ac != null) {
            String[] reverseAudioArray = ac.getReverseAudioArray();
            if (reverseAudioArray != null) {
                long j = a;
                for (String a2 : reverseAudioArray) {
                    j += m133251a(a2);
                }
                a = j;
            }
            String[] reverseVideoArray = ac.getReverseVideoArray();
            if (reverseVideoArray != null) {
                long j2 = a;
                for (String a3 : reverseVideoArray) {
                    j2 += m133251a(a3);
                }
                a = j2;
            }
            String[] tempVideoArray = ac.getTempVideoArray();
            if (tempVideoArray != null) {
                for (String a4 : tempVideoArray) {
                    a += m133251a(a4);
                }
            }
            List<EditVideoSegment> videoList = ac.getVideoList();
            if (videoList != null) {
                for (EditVideoSegment editVideoSegment : videoList) {
                    a = a + m133251a(editVideoSegment.getAudioPath()) + m133251a(editVideoSegment.getVideoPath());
                }
            }
        }
        MvCreateVideoData Q = this.f108977a.mo70175Q();
        if (Q != null) {
            str = Q.contactVideoPath;
        } else {
            str = null;
        }
        return a + m133251a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final long mo102938b() {
        Object obj;
        String str = null;
        C41906b bVar = new C41906b(null, null, 3, null);
        long j = 0;
        if (this.f108977a.f72042k != 0) {
            String b = C35574k.m114859a().mo70097l().mo74949b().mo74962a(this.f108977a.f72042k).mo74978b();
            C41903a aVar = new C41903a();
            aVar.mo102941a((C41908c) bVar);
            aVar.mo102943a(b);
            j = 0 + bVar.f108983a;
        }
        C27320g ag = this.f108977a.mo70218ag();
        if (ag != null) {
            obj = ag.f72080d;
        } else {
            obj = null;
        }
        if (C41902b.m133264a(obj)) {
            bVar.mo102945a();
            String str2 = this.f108977a.mo70218ag().f72080d;
            C41903a aVar2 = new C41903a();
            aVar2.mo102941a((C41908c) bVar);
            aVar2.mo102943a(str2);
            j += bVar.f108983a;
        }
        long a = j + m133251a(this.f108977a.f72038g);
        EffectListModel effectListModel = this.f108977a.f72014B;
        if (effectListModel != null) {
            ArrayList effectPointModels = effectListModel.getEffectPointModels();
            if (effectPointModels != null && (!effectPointModels.isEmpty())) {
                EffectListModel effectListModel2 = this.f108977a.f72014B;
                C7573i.m23582a((Object) effectListModel2, "draft.effectListModel");
                ArrayList effectPointModels2 = effectListModel2.getEffectPointModels();
                C7573i.m23582a((Object) effectPointModels2, "draft.effectListModel.effectPointModels");
                Iterable e = C7525m.m23510e(effectPointModels2);
                Collection arrayList = new ArrayList();
                for (Object next : e) {
                    if (C41902b.m133264a((Object) ((EffectPointModel) next).getResDir())) {
                        arrayList.add(next);
                    }
                }
                for (EffectPointModel effectPointModel : (List) arrayList) {
                    bVar.mo102945a();
                    C41903a aVar3 = new C41903a();
                    aVar3.mo102941a((C41908c) bVar);
                    aVar3.mo102943a(effectPointModel.getResDir());
                    a += bVar.f108983a;
                }
            }
        }
        MvCreateVideoData Q = this.f108977a.mo70175Q();
        if (Q != null) {
            str = Q.mvResUnzipPath;
        }
        if (!C41902b.m133264a((Object) str)) {
            return a;
        }
        String str3 = this.f108977a.mo70175Q().mvResUnzipPath;
        bVar.mo102945a();
        C41903a aVar4 = new C41903a();
        aVar4.mo102941a((C41908c) bVar);
        aVar4.mo102943a(str3);
        return a + bVar.f108983a;
    }

    public C41899c(C27311c cVar) {
        C7573i.m23587b(cVar, "draft");
        super(cVar);
    }
}
