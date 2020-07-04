package com.p280ss.android.ugc.aweme.share.improve;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.setting.C37577aw;
import com.p280ss.android.ugc.aweme.share.experiment.VideoReportEnhanceExperiment;
import com.p280ss.android.ugc.aweme.share.p1533d.C38025a;
import com.p280ss.android.ugc.aweme.sharer.p338ui.C38389f;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b */
public final class C38140b implements Comparator<C38389f> {

    /* renamed from: a */
    public static final C38141a f99246a = new C38141a(null);

    /* renamed from: b */
    private final int f99247b = 1000;

    /* renamed from: c */
    private final List<C37577aw> f99248c = m121834a();

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b$a */
    public static final class C38141a {
        private C38141a() {
        }

        public /* synthetic */ C38141a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    private static String m121833a(String str) {
        return str;
    }

    /* renamed from: a */
    private static List<C37577aw> m121834a() {
        C38025a a = C38025a.m121371a();
        C7573i.m23582a((Object) a, "I18nShareOrderUtil.getInstance()");
        return a.f98976b;
    }

    /* renamed from: b */
    private static boolean m121835b(String str) {
        if (!C6384b.m19835a().mo15292a(VideoReportEnhanceExperiment.class, true, "enable_enhance_report", C6384b.m19835a().mo15295d().enable_enhance_report, false) || !TextUtils.equals(str, "report")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compare(C38389f fVar, C38389f fVar2) {
        if (fVar == null) {
            return -1;
        }
        boolean z = true;
        if (fVar2 == null) {
            return 1;
        }
        Collection collection = this.f99248c;
        if (collection != null && !collection.isEmpty()) {
            z = false;
        }
        if (z) {
            return 0;
        }
        return m121832a(m121833a(fVar.mo95715b()), this.f99248c) - m121832a(m121833a(fVar2.mo95715b()), this.f99248c);
    }

    /* renamed from: a */
    private final int m121832a(String str, List<? extends C37577aw> list) {
        if (m121835b(str)) {
            return -1;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(((C37577aw) list.get(i)).f97999a, str)) {
                return i;
            }
        }
        return this.f99247b;
    }
}
