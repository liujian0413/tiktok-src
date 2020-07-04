package com.p280ss.android.ugc.aweme.services.draft;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.p280ss.android.ugc.aweme.draft.C27303b;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService */
public interface IDraftService {

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftListener */
    public interface DraftListener {
        void onDraftCheckedChanged(C27311c cVar, boolean z);

        void onDraftClean();

        void onDraftDelete(C27311c cVar);

        void onDraftUpdate(C27311c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.services.draft.IDraftService$DraftListenerAdapter */
    public static class DraftListenerAdapter implements DraftListener {
        public void onDraftCheckedChanged(C27311c cVar, boolean z) {
        }

        public void onDraftClean() {
        }

        public void onDraftDelete(C27311c cVar) {
        }

        public void onDraftUpdate(C27311c cVar) {
        }
    }

    String calculateDraftDir(C27311c cVar);

    void delete(C27311c cVar);

    void deleteDraftForPoiRate(C27311c cVar);

    Class<? extends Activity> draftBoxActivity();

    void editDraft(Context context, C27311c cVar);

    void enterDraftBox(Activity activity);

    void enterDraftBoxWithArgs(Activity activity, Bundle bundle);

    ExecutorService getDraftExecutor();

    C27311c getPoiRateDraft(String str);

    boolean isPoiOrderRate();

    void notifyDraftCheckedChanged(C27311c cVar, boolean z);

    void notifyDraftClean();

    void notifyDraftDelete(C27311c cVar);

    void notifyDraftUpdate(C27311c cVar);

    List<C27311c> queryAllDraftList();

    C27311c queryDraft(String str);

    List<C27311c> queryList();

    List<C27311c> queryListWithFilter(C27303b bVar);

    int queryMyDraftCount();

    int queryMyDraftCount(C27303b bVar);

    void registerDraftListener(DraftListener draftListener);

    long save(C27311c cVar);

    void unregisterDraftListener(DraftListener draftListener);
}
