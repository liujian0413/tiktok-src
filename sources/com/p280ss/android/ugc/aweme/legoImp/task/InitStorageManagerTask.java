package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.storage.C12920c;
import com.bytedance.storage.C12922d;
import com.bytedance.storage.C12923e;
import com.p280ss.android.ugc.aweme.experiment.C6913e;
import com.p280ss.android.ugc.aweme.experiment.StorageStrategyExperiment;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask */
public final class InitStorageManagerTask implements LegoTask {
    static final /* synthetic */ C7595j[] $$delegatedProperties = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(InitStorageManagerTask.class), "storageParams", "getStorageParams()Lcom/bytedance/storage/StorageParams;"))};
    private final C7541d storageParams$delegate = C7546e.m23569a(new C7157b(this));
    public final String tag = "InitStorageManagerTask";

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$a */
    static final class C7156a<T> implements C12923e<C12922d> {

        /* renamed from: a */
        final /* synthetic */ InitStorageManagerTask f20064a;

        C7156a(InitStorageManagerTask initStorageManagerTask) {
            this.f20064a = initStorageManagerTask;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public C12922d mo18609a() {
            return this.f20064a.getStorageParams();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask$b */
    static final class C7157b extends Lambda implements C7561a<C12922d> {

        /* renamed from: a */
        final /* synthetic */ InitStorageManagerTask f20065a;

        C7157b(InitStorageManagerTask initStorageManagerTask) {
            this.f20065a = initStorageManagerTask;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m22349a();
        }

        /* renamed from: a */
        private static C12922d m22349a() {
            try {
                C6913e eVar = (C6913e) C6384b.m19835a().mo15290a(StorageStrategyExperiment.class, true, "storage_strategy_config_v2", (Object) C6384b.m19835a().mo15295d().storage_strategy_config_v2, C6913e.class);
                if (eVar == null) {
                    return null;
                }
                C12922d dVar = new C12922d();
                dVar.f34133a = (long) (eVar.f19583a * 1048576);
                dVar.f34134b = (long) (eVar.f19584b * 1048576);
                dVar.f34135c = (long) (eVar.f19585c * 1048576);
                return dVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public final C12922d getStorageParams() {
        return (C12922d) this.storageParams$delegate.getValue();
    }

    public final ProcessType process() {
        return C32337d.m104906a(this);
    }

    public final WorkType type() {
        return WorkType.MAIN;
    }

    public final void run(Context context) {
        C12920c.m37607a((C12923e<C12922d>) new C7156a<C12922d>(this));
    }
}
