package com.p280ss.android.ugc.aweme.utils.permission;

import bolts.C1592h;
import com.p280ss.android.ugc.aweme.C7162m;
import com.p280ss.android.ugc.aweme.app.C22977g;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.concurrent.Callable;
import retrofit2.p363b.C7727c;
import retrofit2.p363b.C7729e;
import retrofit2.p363b.C7739o;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter */
public class PermissionStateReporter implements C7162m {

    /* renamed from: a */
    private static volatile PermissionStateReporter f111776a;

    /* renamed from: b */
    private boolean f111777b = true;

    /* renamed from: c */
    private ReportPermissionApi f111778c;

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.PermissionStateReporter$ReportPermissionApi */
    public interface ReportPermissionApi {
        @C7729e
        @C7739o(mo20429a = "/aweme/v1/app/data/access/")
        C1592h<BaseResponse> report(@C7727c(mo20417a = "address_book_access") Integer num, @C7727c(mo20417a = "gps_access") Integer num2);

        @C7729e
        @C7739o(mo20429a = "/aweme/v1/app/data/access/")
        C1592h<BaseResponse> report(@C7727c(mo20417a = "address_book_access") Integer num, @C7727c(mo20417a = "gps_access") Integer num2, @C7727c(mo20417a = "upload_type") int i, @C7727c(mo20417a = "impression_ids") String str);
    }

    /* renamed from: b */
    public final void mo18612b() {
    }

    /* renamed from: c */
    public final void mo18613c() {
    }

    /* renamed from: e */
    public final void mo104772e() {
        m136860g();
    }

    private PermissionStateReporter() {
    }

    /* renamed from: a */
    public final void mo18611a() {
        if (!C22977g.f60742b.mo59967b()) {
            m136860g();
        }
    }

    /* renamed from: d */
    public static PermissionStateReporter m136859d() {
        if (f111776a == null) {
            synchronized (PermissionStateReporter.class) {
                if (f111776a == null) {
                    f111776a = new PermissionStateReporter();
                }
            }
        }
        return f111776a;
    }

    /* renamed from: g */
    private void m136860g() {
        if (this.f111777b) {
            this.f111777b = false;
            return;
        }
        if (this.f111778c == null) {
            this.f111778c = C43160d.m136881a();
        }
        C1592h.m7853a((Callable<TResult>) new C43159c<TResult>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ Object mo104773f() throws Exception {
        this.f111778c.report(Integer.valueOf(C43161e.m136882a()), Integer.valueOf(C43161e.m136884b()));
        return null;
    }
}
