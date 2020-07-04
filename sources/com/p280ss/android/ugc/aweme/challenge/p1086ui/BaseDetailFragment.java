package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;
import com.p280ss.android.ugc.aweme.detail.AbstractDetailFragment;
import com.p280ss.android.ugc.aweme.shortvideo.view.C41654d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.BaseDetailFragment */
public abstract class BaseDetailFragment extends AbstractDetailFragment implements C6310a {

    /* renamed from: e */
    protected List<Integer> f62485e;

    /* renamed from: f */
    protected C6309f f62486f = new C6309f(this);

    /* renamed from: g */
    protected C41654d f62487g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo61676a(Intent intent) {
    }

    /* access modifiers changed from: protected */
    public String bp_() {
        return "";
    }

    public void handleMsg(Message message) {
    }

    public void onDestroy() {
        super.onDestroy();
        mo29060a();
    }

    /* renamed from: g */
    public final void mo61678g() {
        if (this.f68825G != null) {
            this.f68825G.mo67572a(false);
        }
    }

    public void onStop() {
        super.onStop();
        this.f62486f.removeCallbacksAndMessages(null);
    }

    /* renamed from: a */
    private void mo29060a() {
        if (this.f62487g != null && this.f62487g.isShowing()) {
            this.f62487g.dismiss();
        }
        this.f62487g = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
