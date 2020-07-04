package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.p264b.C6450ac;
import com.bytedance.retrofit2.p264b.C6451b;
import com.bytedance.retrofit2.p264b.C6457h;
import com.bytedance.retrofit2.p264b.C6461l;
import com.bytedance.retrofit2.p264b.C6468s;
import com.bytedance.retrofit2.p637a.C12461b;
import com.google.common.util.concurrent.C18253l;
import com.p280ss.android.p284b.C19223b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p1050az.p1051a.C23143a;
import com.p280ss.android.ugc.aweme.p1050az.p1051a.C23144b;
import com.p280ss.android.ugc.aweme.p1050az.p1051a.C23145c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask */
public class DelayedBaceSpeedMethodTestTask implements LegoTask {
    private static final String TAG = "DelayedBaceSpeedMethodTestTask";
    private volatile TestIdc mTestIdc;
    private int testCount;
    private Timer timer;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask$TestIdc */
    public interface TestIdc {
        @C6457h
        C18253l<String> doGet(@C6450ac String str);

        @C6468s
        C18253l<String> doPost(@C6450ac String str, @C6451b TypedOutput typedOutput, @C6461l List<C12461b> list);

        @C6457h(mo15740a = "/aweme/v1/testidc/")
        C18253l<C23143a> testIdc();
    }

    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    private TestIdc getTestIdc() {
        if (this.mTestIdc == null) {
            this.mTestIdc = (TestIdc) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C19223b.f51890e).mo26430a().mo26435a(TestIdc.class);
        }
        return this.mTestIdc;
    }

    public void run() {
        try {
            final C23144b bVar = ((C23143a) getTestIdc().testIdc().get()).f61082a;
            if (!(bVar == null || bVar.f61085c == null)) {
                if (!bVar.f61085c.isEmpty()) {
                    if (this.timer != null) {
                        this.timer.cancel();
                        this.timer = null;
                    }
                    this.timer = new Timer("test_speed_1");
                    if (bVar.f61083a > 100) {
                        bVar.f61083a = 100;
                    }
                    this.timer.schedule(new TimerTask() {
                        public final void run() {
                            DelayedBaceSpeedMethodTestTask.this.dealWithTest(bVar);
                        }
                    }, 0, (long) (bVar.f61084b * 1000));
                }
            }
        } catch (Exception unused) {
        }
    }

    public void run(Context context) {
        C6921a.m21555a(TAG);
        run();
    }

    public void dealWithTest(C23144b bVar) {
        String str;
        if (this.testCount > bVar.f61083a) {
            if (this.timer != null) {
                this.timer.cancel();
                this.timer = null;
            }
            return;
        }
        this.testCount++;
        for (C23145c cVar : bVar.f61085c) {
            if (!(cVar.f61086a == null || cVar.f61089d == null)) {
                if ("get".equals(cVar.f61089d.toLowerCase())) {
                    try {
                        getTestIdc().doGet(cVar.f61086a).get();
                    } catch (Exception unused) {
                    }
                } else if ("post".equals(cVar.f61089d.toLowerCase())) {
                    if (cVar.f61090e != null) {
                        str = cVar.f61090e.toString();
                    } else {
                        str = "";
                    }
                    String str2 = "application/json";
                    if (!(cVar.f61087b == null || cVar.f61087b.get("Content-Type") == null)) {
                        str2 = (String) cVar.f61087b.get("Content-Type");
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C12461b("Content-Type", str2));
                    if (cVar.f61087b != null && !cVar.f61087b.isEmpty()) {
                        for (Entry entry : cVar.f61087b.entrySet()) {
                            arrayList.add(new C12461b((String) entry.getKey(), (String) entry.getValue()));
                        }
                    }
                    getTestIdc().doPost(cVar.f61086a, new TypedByteArray(str2, str.getBytes("utf8"), new String[0]), arrayList).get();
                }
            }
        }
    }
}
