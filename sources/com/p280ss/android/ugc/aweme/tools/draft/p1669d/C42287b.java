package com.p280ss.android.ugc.aweme.tools.draft.p1669d;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.draft.C27303b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35563c;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p280ss.android.ugc.aweme.shortvideo.edit.multiedit.p1567a.C39702d;
import com.p280ss.android.ugc.aweme.shortvideo.p1550b.C38505a;
import com.p280ss.android.ugc.aweme.storage.p1640b.C41911c;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.tools.draft.C42297n;
import com.p280ss.android.ugc.aweme.tools.draft.C42299p;
import com.p280ss.android.ugc.aweme.tools.draft.DraftBoxActivity;
import com.p280ss.android.ugc.gamora.recorder.status.C44751c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.d.b */
public final class C42287b implements IDraftService {

    /* renamed from: a */
    private List<DraftListener> f110042a = new ArrayList();

    public final Class<? extends Activity> draftBoxActivity() {
        return DraftBoxActivity.class;
    }

    public final ExecutorService getDraftExecutor() {
        return C42130a.m134090a();
    }

    public final List<C27311c> queryAllDraftList() {
        return C42297n.m134523a().mo103784e();
    }

    public final List<C27311c> queryList() {
        return C42297n.m134523a().mo103779b();
    }

    public final int queryMyDraftCount() {
        return C42297n.m134523a().mo103780c();
    }

    public final void notifyDraftClean() {
        for (DraftListener onDraftClean : this.f110042a) {
            onDraftClean.onDraftClean();
        }
    }

    public final boolean isPoiOrderRate() {
        String str = C38505a.m123085b().poiContextStr;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (!TextUtils.isEmpty(new JSONObject(str).getString("mPoiRateId"))) {
                return true;
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public final void unregisterDraftListener(DraftListener draftListener) {
        this.f110042a.remove(draftListener);
    }

    public final String calculateDraftDir(C27311c cVar) {
        if (cVar == null) {
            return null;
        }
        return C41911c.m133282a(cVar);
    }

    public final C27311c queryDraft(String str) {
        return C42297n.m134523a().mo103778b(str);
    }

    public final List<C27311c> queryListWithFilter(C27303b bVar) {
        return C42297n.m134523a().mo103774a(bVar);
    }

    public final void registerDraftListener(DraftListener draftListener) {
        if (!this.f110042a.contains(draftListener)) {
            this.f110042a.add(draftListener);
        }
    }

    public final long save(C27311c cVar) {
        return C42297n.m134523a().mo103781c(cVar);
    }

    /* renamed from: a */
    private static String m134519a(C27311c cVar) {
        String I = cVar.mo70167I();
        if (TextUtils.isEmpty(I)) {
            return "";
        }
        try {
            return new JSONObject(I).getString("mPoiRateId");
        } catch (JSONException unused) {
            return "";
        }
    }

    public final void delete(C27311c cVar) {
        C42297n.m134523a().mo103783d(cVar);
        C35563c.f93224F.mo70089d().mo90346a().mo90348a(cVar);
        C44751c.m141250a(cVar);
        C39702d.m127062a(cVar);
    }

    public final void deleteDraftForPoiRate(C27311c cVar) {
        C35563c.f93222D.mo83115a(cVar.mo70221aj());
        C42297n.m134523a().mo103783d(cVar);
        cVar.mo70278m();
        notifyDraftDelete(cVar);
    }

    public final void enterDraftBox(Activity activity) {
        C35563c.f93224F.mo70097l().mo74949b().mo74963a();
        DraftBoxActivity.m134448a(activity);
    }

    public final void notifyDraftDelete(C27311c cVar) {
        if (this.f110042a != null) {
            for (int size = this.f110042a.size() - 1; size >= 0; size--) {
                ((DraftListener) this.f110042a.get(size)).onDraftDelete(cVar);
            }
        }
    }

    public final void notifyDraftUpdate(C27311c cVar) {
        for (DraftListener onDraftUpdate : this.f110042a) {
            onDraftUpdate.onDraftUpdate(cVar);
        }
    }

    public final int queryMyDraftCount(C27303b bVar) {
        return C42297n.m134523a().mo103776b(bVar);
    }

    public final C27311c getPoiRateDraft(String str) {
        List<C27311c> e = C42297n.m134523a().mo103784e();
        if (C6307b.m19566a((Collection<T>) e)) {
            return null;
        }
        for (C27311c cVar : e) {
            if (TextUtils.equals(str, m134519a(cVar))) {
                return cVar;
            }
        }
        return null;
    }

    public final void editDraft(Context context, C27311c cVar) {
        if (context != null && cVar != null) {
            C42299p.m134549a(context, cVar, 1);
        }
    }

    public final void enterDraftBoxWithArgs(Activity activity, Bundle bundle) {
        C35563c.f93224F.mo70097l().mo74949b().mo74963a();
        DraftBoxActivity.m134449a((Context) activity, bundle);
    }

    public final void notifyDraftCheckedChanged(C27311c cVar, boolean z) {
        for (DraftListener onDraftCheckedChanged : this.f110042a) {
            onDraftCheckedChanged.onDraftCheckedChanged(cVar, z);
        }
    }
}
