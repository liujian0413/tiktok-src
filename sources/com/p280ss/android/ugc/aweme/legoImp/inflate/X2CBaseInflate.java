package com.p280ss.android.ugc.aweme.legoImp.inflate;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.p063by.inflate_lib.C2058a;
import com.p280ss.android.ugc.aweme.ILegacyService;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.lego.C32337d;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.lego.LegoInflate;
import com.p280ss.android.ugc.aweme.lego.LegoTask;
import com.p280ss.android.ugc.aweme.lego.ProcessType;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.legoImp.inflate.X2CBaseInflate */
public abstract class X2CBaseInflate implements LegoInflate {
    private LegoTask inflateReleaseTask = new LegoTask() {
        public ProcessType process() {
            return C32337d.m104906a(this);
        }

        public WorkType type() {
            return WorkType.BOOT_FINISH;
        }

        /* access modifiers changed from: 0000 */
        public final /* synthetic */ void lambda$run$0$X2CBaseInflate$1() {
            X2CBaseInflate.this.viewCaches.clear();
        }

        public void run(Context context) {
            new Handler(Looper.getMainLooper()).post(new C32345d(this));
        }
    };
    private int isX2COpen = -1;
    protected List<SparseArray<View>> viewCaches = new ArrayList();

    /* access modifiers changed from: protected */
    public int cacheCount() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public abstract int[] layoutResId();

    public int theme() {
        return R.style.gu;
    }

    public Class<? extends Activity> activity() {
        return ((ILegacyService) ServiceManager.get().getService(ILegacyService.class)).getMainPageService().mo84664a();
    }

    /* access modifiers changed from: protected */
    public boolean isX2CAsyncInflateOpen() {
        if (this.isX2COpen == -1) {
            this.isX2COpen = C32348g.m104915a();
        }
        if (this.isX2COpen == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isX2CClose() {
        if (this.isX2COpen == -1) {
            this.isX2COpen = C32348g.m104915a();
        }
        if (this.isX2COpen == -2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isX2COpen() {
        if (this.isX2COpen == -1) {
            this.isX2COpen = C32348g.m104915a();
        }
        if (this.isX2COpen == 1) {
            return true;
        }
        return false;
    }

    public View getView(Context context, int i) {
        if (isX2CAsyncInflateOpen()) {
            for (SparseArray sparseArray : this.viewCaches) {
                View view = (View) sparseArray.get(i);
                if (view != null) {
                    sparseArray.remove(i);
                    return view;
                }
            }
            return C2058a.m9122a(context, i, new FrameLayout(context), false);
        } else if (isX2CClose()) {
            return LayoutInflater.from(context).inflate(i, new FrameLayout(context), false);
        } else {
            return C2058a.m9122a(context, i, new FrameLayout(context), false);
        }
    }

    public void inflate(Context context, Activity activity) {
        int[] layoutResId;
        if (activity != null && isX2CAsyncInflateOpen()) {
            for (int i = 0; i < cacheCount(); i++) {
                this.viewCaches.add(new SparseArray());
            }
            for (SparseArray sparseArray : this.viewCaches) {
                for (int i2 : layoutResId()) {
                    sparseArray.put(i2, C2058a.m9122a(activity, i2, new FrameLayout(activity), false));
                }
            }
            C7121a.m22248b().mo18559a(this.inflateReleaseTask).mo18560a();
        }
    }
}
