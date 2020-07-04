package com.p280ss.android.ugc.aweme.requestcombine.p1503a;

import android.content.Context;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.lego.C7121a.C7126d;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.p280ss.android.ugc.aweme.p994af.C22471a;
import com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode;
import com.p280ss.android.ugc.aweme.requesttask.p1504a.C37226b;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.requestcombine.a.h */
public final class C37214h extends C37205a {

    /* renamed from: a */
    private BaseCombineMode f97341a;

    /* renamed from: b */
    public final BaseCombineMode mo93741b() {
        return this.f97341a;
    }

    /* renamed from: a */
    public final String mo93737a() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        if (a.isLogin()) {
            return "/aweme/v1/notice/count/";
        }
        return null;
    }

    /* renamed from: a */
    private void m119625a(BaseCombineMode baseCombineMode) {
        this.f97341a = baseCombineMode;
    }

    /* renamed from: a */
    public final void mo93739a(C7126d dVar) {
        C7573i.m23587b(dVar, "transaction");
        dVar.mo18551a(new C37226b());
    }

    /* renamed from: a */
    public final Map<String, String> mo93738a(Context context) {
        C7573i.m23587b(context, "context");
        HashMap hashMap = new HashMap();
        hashMap.put("source", "1");
        C22471a a = C22471a.m74350a();
        C7573i.m23582a((Object) a, "StoryAbManager.getInstance()");
        int i = 1;
        boolean z = !a.mo59053b();
        if (!C32904bi.m106500e()) {
            if (C32904bi.m106497b()) {
                i = 2;
            } else {
                i = 0;
            }
        }
        hashMap.put("second_tab_type", String.valueOf(z ? 1 : 0));
        hashMap.put("follow_tab_position", String.valueOf(i));
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo93740a(com.p280ss.android.ugc.aweme.requestcombine.model.SettingCombineModel r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.SettingCombineDataModel r7 = r7.getData()
            if (r7 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.requestcombine.model.NoticeCountCombineModel r7 = r7.getNoticeCountModel()
            goto L_0x000e
        L_0x000d:
            r7 = 0
        L_0x000e:
            r0 = 0
            if (r7 == 0) goto L_0x0069
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r1 = r7.getNoticeList()
            if (r1 == 0) goto L_0x0069
            int r1 = r1.status_code
            if (r1 == 0) goto L_0x001c
            goto L_0x0069
        L_0x001c:
            r1 = r7
            com.ss.android.ugc.aweme.requestcombine.model.BaseCombineMode r1 = (com.p280ss.android.ugc.aweme.requestcombine.model.BaseCombineMode) r1
            r6.m119625a(r1)
            int r1 = r7.getHttpCode()
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 1
            if (r1 != r2) goto L_0x005c
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r1 = r7.getNoticeList()
            java.util.List r1 = r1.getItems()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)
            android.os.Message r4 = android.os.Message.obtain()
            com.ss.android.ugc.aweme.notice.api.bean.NoticeList r5 = r7.getNoticeList()
            r4.obj = r5
            boolean r5 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r5 == 0) goto L_0x004c
            r4.what = r0
            goto L_0x004e
        L_0x004c:
            r4.what = r3
        L_0x004e:
            java.lang.String r5 = "msg"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            com.p280ss.android.ugc.aweme.notice.api.C34315c.m110977a(r4)
            r4.recycle()
            r4 = r1
            r1 = 1
            goto L_0x005e
        L_0x005c:
            r1 = 0
            r4 = 1
        L_0x005e:
            m119626a(r1, r4)
            int r7 = r7.getHttpCode()
            if (r7 != r2) goto L_0x0068
            return r3
        L_0x0068:
            return r0
        L_0x0069:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.requestcombine.p1503a.C37214h.mo93740a(com.ss.android.ugc.aweme.requestcombine.model.SettingCombineModel):boolean");
    }

    /* renamed from: a */
    private static void m119626a(boolean z, boolean z2) {
        C6907h.m21524a("homepage_follow_monitor", (Map) C22984d.m75611a().mo59973a("error_type", "combine_yellow_dot").mo59972a("is_success", (Object) Boolean.valueOf(z)).mo59972a("is_empty", (Object) Boolean.valueOf(z2)).f60753a);
    }
}
