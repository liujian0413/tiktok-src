package com.p280ss.android.ugc.aweme.app;

import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.app.LogListActivity_ViewBinding */
public class LogListActivity_ViewBinding implements Unbinder {

    /* renamed from: a */
    private LogListActivity f60368a;

    public void unbind() {
        LogListActivity logListActivity = this.f60368a;
        if (logListActivity != null) {
            this.f60368a = null;
            logListActivity.listView = null;
            logListActivity.clearBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    public LogListActivity_ViewBinding(LogListActivity logListActivity, View view) {
        this.f60368a = logListActivity;
        logListActivity.listView = (ListView) Utils.findRequiredViewAsType(view, R.id.bng, "field 'listView'", ListView.class);
        logListActivity.clearBtn = (TextView) Utils.findRequiredViewAsType(view, R.id.wh, "field 'clearBtn'", TextView.class);
    }
}
