package com.p280ss.android.ugc.aweme.shortvideo.edit.audioeffect;

import android.content.Context;
import bolts.C1592h;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.medialib.p883d.C19719e;
import com.p280ss.android.ugc.aweme.common.p1145f.C25682d;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35578o;
import com.p280ss.android.ugc.aweme.shortvideo.C39810eq;
import com.p280ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p280ss.android.ugc.effectmanager.common.model.UrlModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p280ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b */
public final class C39438b {

    /* renamed from: a */
    public static final C39438b f102396a = new C39438b();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.b$a */
    static final class C39439a<V> implements Callable<TResult> {

        /* renamed from: a */
        public static final C39439a f102397a = new C39439a();

        C39439a() {
        }

        public final /* synthetic */ Object call() {
            return m125966a();
        }

        /* renamed from: a */
        private static String m125966a() {
            Context a = C6399b.m19921a();
            new C19719e().mo52424a(a, (int) R.raw.baritone, C39810eq.f103483s);
            return new C19719e().mo52424a(a, (int) R.raw.chipmunk, C39810eq.f103483s);
        }
    }

    private C39438b() {
    }

    /* renamed from: c */
    private static void m125964c() {
        C35563c.f93224F.mo70097l().mo74952e();
        C1592h.m7853a((Callable<TResult>) C39439a.f102397a);
    }

    /* renamed from: a */
    public final void mo98271a() {
        C39448d dVar = (C39448d) C25682d.m84426a(C6399b.m19921a(), C39448d.class);
        C35578o oVar = C35563c.f93240c;
        C7573i.m23582a((Object) oVar, "AVEnv.APPLICATION_SERVICE");
        int h = oVar.mo83141h();
        if (h != dVar.mo60405a(0)) {
            m125964c();
            dVar.mo60406b(h);
        }
    }

    /* renamed from: b */
    public static CategoryPageModel m125963b() {
        int i = 0;
        List b = C7525m.m23464b((T[]) new String[]{"chipmunk", "baritone"});
        List b2 = C7525m.m23464b((T[]) new Integer[]{Integer.valueOf(R.drawable.fi), Integer.valueOf(R.drawable.fh)});
        Context a = C6399b.m19921a();
        List b3 = C7525m.m23464b((T[]) new String[]{a.getString(R.string.p0), a.getString(R.string.oz)});
        List b4 = C7525m.m23464b((T[]) new String[]{"default_1", "default_2"});
        Iterable iterable = b2;
        Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
        int i2 = -1;
        for (Object next : iterable) {
            int i3 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            int intValue = ((Number) next).intValue();
            Effect effect = new Effect();
            int i4 = i2 - 1;
            effect.setEffectId(String.valueOf(i2));
            effect.setName((String) b3.get(i));
            effect.setIconUrl(m125961a(intValue));
            StringBuilder sb = new StringBuilder();
            sb.append(C39810eq.f103483s);
            sb.append((String) b.get(i));
            effect.setUnzipPath(sb.toString());
            effect.setTags(C7525m.m23457a(b4.get(i)));
            arrayList.add(effect);
            i = i3;
            i2 = i4;
        }
        List<Effect> list = (List) arrayList;
        CategoryPageModel categoryPageModel = new CategoryPageModel();
        CategoryEffectModel categoryEffectModel = new CategoryEffectModel();
        categoryEffectModel.effects = list;
        categoryPageModel.category_effects = categoryEffectModel;
        return categoryPageModel;
    }

    /* renamed from: a */
    private static UrlModel m125961a(int i) {
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(C7525m.m23457a(String.valueOf(i)));
        return urlModel;
    }

    /* renamed from: a */
    public static final String m125962a(VideoPublishEditModel videoPublishEditModel) {
        C7573i.m23587b(videoPublishEditModel, "args");
        AudioEffectParam audioEffectParam = videoPublishEditModel.veAudioEffectParam;
        if (audioEffectParam != null) {
            String uploadId = audioEffectParam.getUploadId();
            if (uploadId != null) {
                return uploadId;
            }
        }
        return "";
    }
}
