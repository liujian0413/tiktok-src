package com.p280ss.android.ugc.aweme.profile.presenter;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.NetUtil;
import com.p280ss.android.ugc.aweme.account.p938b.C21116a;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.api.WatchApi;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.model.WatchStatus;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.al */
public final class C36015al extends C21116a<C25640a<WatchStatus>, C36047u> {

    /* renamed from: a */
    public WatchApi f94222a = ((WatchApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(Api.f60502b).create(WatchApi.class));

    /* renamed from: d */
    public String f94223d;

    /* renamed from: e */
    private void m116021e() {
        mo66536a(new C25640a<WatchStatus>() {
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length != 2) {
                    return false;
                }
                return true;
            }

            public final boolean sendRequest(final Object... objArr) {
                final int i;
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                C36015al.this.f94223d = objArr[0];
                if (objArr[1].intValue() == 0) {
                    i = 1;
                } else {
                    i = 0;
                }
                C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
                    public final Object call() throws Exception {
                        HashMap hashMap = new HashMap();
                        hashMap.put("user_id", (String) objArr[0]);
                        hashMap.put("type", String.valueOf(i));
                        NetUtil.putCommonParams(hashMap, true);
                        WatchStatus watchStatus = (WatchStatus) C36015al.this.f94222a.turnPostNotification(hashMap).execute().f33302b;
                        watchStatus.userId = (String) objArr[0];
                        return watchStatus;
                    }
                }, 0);
                return true;
            }
        });
    }

    public C36015al() {
        m116021e();
    }

    /* renamed from: b */
    public final void mo56977b() {
        WatchStatus watchStatus;
        if (this.f67571b == null) {
            watchStatus = null;
        } else {
            watchStatus = (WatchStatus) this.f67571b.getData();
        }
        if (watchStatus != null) {
            if (this.f67572c != null) {
                ((C36047u) this.f67572c).mo91736a(watchStatus);
                C42961az.m136380a(watchStatus);
            }
            m116019a(watchStatus);
        }
    }

    /* renamed from: a */
    public final boolean mo56976a(Object... objArr) {
        return super.mo56976a(objArr);
    }

    /* renamed from: a */
    private static void m116020a(String str) {
        WatchStatus watchStatus = new WatchStatus();
        watchStatus.userId = str;
        watchStatus.watchStatus = 0;
        C42961az.m136380a(watchStatus);
    }

    /* renamed from: a */
    public final void mo57296a(Exception exc) {
        if (this.f67572c != null) {
            m116020a(this.f94223d);
        }
    }

    /* renamed from: a */
    private static void m116019a(WatchStatus watchStatus) {
        if (C6399b.m19946v() && watchStatus != null) {
            FollowStatus cpoyToFollowStatus = watchStatus.cpoyToFollowStatus();
            if (!(cpoyToFollowStatus == null || cpoyToFollowStatus.followStatus == 0)) {
                C42961az.m136380a(cpoyToFollowStatus);
                User user = new User();
                user.setUid(cpoyToFollowStatus.userId);
                user.setFollowStatus(cpoyToFollowStatus.followStatus);
                C30553b.m99810g().updateIMUserFollowStatus(C30553b.m99780a(user));
            }
        }
    }
}
