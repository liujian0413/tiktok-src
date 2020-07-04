package com.p280ss.android.ugc.aweme.legoImp.service;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.FileObserver;
import com.C1642a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.newmedia.p891a.C19923c;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.lego.LegoService;
import com.p280ss.android.ugc.aweme.lego.WorkType;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import java.io.IOException;

/* renamed from: com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService */
public class AOTOptimizeService implements LegoService {
    public static boolean hasTriggerAOT;
    public C32349a profileListener;

    /* renamed from: com.ss.android.ugc.aweme.legoImp.service.AOTOptimizeService$a */
    class C32349a extends FileObserver {

        /* renamed from: a */
        Context f84458a;

        public final void onEvent(int i, String str) {
            if (i == 2) {
                if (AOTOptimizeService.this.profileListener == null || !AOTOptimizeService.hasTriggerAOT) {
                    AOTOptimizeService.this.execOptCommand(this.f84458a);
                } else {
                    AOTOptimizeService.this.profileListener.stopWatching();
                    AOTOptimizeService.this.profileListener = null;
                    AOTOptimizeService.this.updateReleaseVersion();
                }
            }
        }

        C32349a(Context context, String str) {
            super(str);
            this.f84458a = context;
        }
    }

    public WorkType type() {
        return WorkType.BOOT_FINISH;
    }

    private boolean isDoOptimizeEnabled() {
        if (VERSION.SDK_INT >= 24 && releaseVersionChange() && !hasTriggerAOT) {
            return true;
        }
        return false;
    }

    public void updateReleaseVersion() {
        Context a = C6399b.m19921a();
        C6887b.m21436b().mo16901a(a, "aot_release_build_version", C19923c.m65736a(a).mo53429a("release_build", "default_version"));
    }

    private boolean releaseVersionChange() {
        Context a = C6399b.m19921a();
        if (!C6887b.m21436b().mo16896a(a, "aot_release_build_version").equals(C19923c.m65736a(a).mo53429a("release_build", "default_version"))) {
            return true;
        }
        return false;
    }

    public void init(Context context) {
        startWatchingForOptimize(context);
    }

    private void execCommand(String str) throws IOException {
        Process exec = Runtime.getRuntime().exec(str);
        try {
            exec.waitFor();
            exec.exitValue();
        } catch (InterruptedException unused) {
            System.err.println("execCommand InterruptedException");
        }
    }

    private void startWatchingForOptimize(Context context) {
        if (isDoOptimizeEnabled()) {
            C6921a.m21555a("startWatchingForOptimize");
            if (this.profileListener == null) {
                this.profileListener = new C32349a(context, C1642a.m8034a("%s/%s/%s", new Object[]{"/data/misc/profiles/cur/0", context.getPackageName(), "primary.prof"}));
            }
            this.profileListener.startWatching();
        }
    }

    public void execOptCommand(Context context) {
        if (isDoOptimizeEnabled()) {
            try {
                StringBuilder sb = new StringBuilder("cmd package compile -m everything-profile -f ");
                sb.append(context.getPackageName());
                execCommand(sb.toString());
                hasTriggerAOT = true;
            } catch (IOException unused) {
                System.err.println("execOptCommand IOException");
            }
        }
    }
}
