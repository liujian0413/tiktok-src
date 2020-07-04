package com.p280ss.android.ugc.aweme.notification.util;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.common.adapter.BaseAdapter;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notice.api.helper.LogHelper;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34362j;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p280ss.android.ugc.aweme.notification.bridgeservice.C34408a;
import com.p280ss.android.ugc.aweme.notification.model.RecommendAvatarsModel;
import com.p280ss.android.ugc.aweme.notification.newstyle.viewmodel.MusNewNotificationViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.util.b */
public final class C34611b implements C34408a {

    /* renamed from: a */
    public BaseAdapter<BaseNotice> f90351a;

    /* renamed from: b */
    private MusNewNotificationViewModel f90352b;

    /* renamed from: c */
    private RecommendAvatarsModel f90353c;

    /* renamed from: com.ss.android.ugc.aweme.notification.util.b$a */
    static final class C34612a<T> implements C0053p<List<? extends MusNotice>> {

        /* renamed from: a */
        final /* synthetic */ C34611b f90354a;

        C34612a(C34611b bVar) {
            this.f90354a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(List<? extends MusNotice> list) {
            BaseAdapter<BaseNotice> baseAdapter = this.f90354a.f90351a;
            if (baseAdapter != null) {
                baseAdapter.mo58045a(this.f90354a.mo87908a(list));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.util.b$b */
    static final class C34613b<T> implements C0053p<C34362j> {

        /* renamed from: a */
        final /* synthetic */ C34611b f90355a;

        C34613b(C34611b bVar) {
            this.f90355a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(C34362j jVar) {
            this.f90355a.mo87909a(jVar);
        }
    }

    /* renamed from: a */
    public final void mo87723a() {
        MusNewNotificationViewModel musNewNotificationViewModel = this.f90352b;
        if (musNewNotificationViewModel != null) {
            musNewNotificationViewModel.mo87890a();
        }
        RecommendAvatarsModel recommendAvatarsModel = this.f90353c;
        if (recommendAvatarsModel != null) {
            recommendAvatarsModel.startFetch();
        }
    }

    /* renamed from: a */
    public final void mo87725a(BaseAdapter<BaseNotice> baseAdapter) {
        C7573i.m23587b(baseAdapter, "adapter");
        this.f90351a = baseAdapter;
    }

    /* renamed from: a */
    private final List<BaseNotice> m111850a(MusNotice musNotice) {
        List<BaseNotice> list;
        BaseAdapter<BaseNotice> baseAdapter = this.f90351a;
        if (baseAdapter != null) {
            list = baseAdapter.mo62312a();
        } else {
            list = null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                list.add(0, musNotice);
                return list;
            } else if (((BaseNotice) list.get(size)).getType() == 50) {
                list.remove(size);
            }
        }
    }

    /* renamed from: a */
    public final List<BaseNotice> mo87908a(List<? extends MusNotice> list) {
        List<BaseNotice> list2;
        BaseAdapter<BaseNotice> baseAdapter = this.f90351a;
        if (baseAdapter != null) {
            list2 = baseAdapter.mo62312a();
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = new ArrayList<>();
        }
        int size = list2.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((BaseNotice) list2.get(size)).getType() == 1001) {
                list2.remove(size);
            }
        }
        if (list != null) {
            Collection collection = list;
            if (!collection.isEmpty()) {
                list2.addAll(collection);
            }
        }
        return list2;
    }

    /* renamed from: a */
    public final void mo87724a(Fragment fragment) {
        C7573i.m23587b(fragment, "fragment");
        this.f90352b = (MusNewNotificationViewModel) C0069x.m157a(fragment).mo147a(MusNewNotificationViewModel.class);
        MusNewNotificationViewModel musNewNotificationViewModel = this.f90352b;
        if (musNewNotificationViewModel != null) {
            C0052o<List<MusNotice>> oVar = musNewNotificationViewModel.f90324a;
            if (oVar != null) {
                oVar.observe(fragment, new C34612a(this));
            }
        }
        this.f90353c = (RecommendAvatarsModel) C0069x.m157a(fragment).mo147a(RecommendAvatarsModel.class);
        RecommendAvatarsModel recommendAvatarsModel = this.f90353c;
        if (recommendAvatarsModel != null) {
            C0052o<C34362j> oVar2 = recommendAvatarsModel.liveData;
            if (oVar2 != null) {
                oVar2.observe(fragment, new C34613b(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo87909a(C34362j jVar) {
        List<UrlModel> list;
        if (jVar != null) {
            list = jVar.f89551a;
        } else {
            list = null;
        }
        if (list != null) {
            List<UrlModel> list2 = jVar.f89551a;
            if (list2 == null) {
                C7573i.m23580a();
            }
            if (!list2.isEmpty()) {
                MusNotice musNotice = new MusNotice(null, null, null, null, null, null, null, 127, null);
                musNotice.setRecommendAvatars(jVar);
                musNotice.setType(50);
                musNotice.setCreateTime(9223372036854775806L);
                BaseAdapter<BaseNotice> baseAdapter = this.f90351a;
                if (baseAdapter != null) {
                    baseAdapter.mo58045a(m111850a(musNotice));
                }
                ((LogHelper) ServiceManager.get().getService(LogHelper.class)).logLiveMergeShow("message", false);
            }
        }
    }
}
