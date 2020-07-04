package com.p280ss.android.ugc.aweme.legoImp.task;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22766ac;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p340x.C7285c;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.SetupTestSpHost */
public class SetupTestSpHost implements LegoTask {
    public ProcessType process() {
        return C32337d.m104906a(this);
    }

    public WorkType type() {
        return WorkType.MAIN;
    }

    public void run(Context context) {
        String string = C7285c.m22838a(context, "test_data", 0).getString("host", "");
        if (!TextUtils.isEmpty(string)) {
            C22766ac.m75145a().mo59818a(string);
        }
    }
}
