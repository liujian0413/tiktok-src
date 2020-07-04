package com.p280ss.android.ugc.aweme.legoImp.task;

import android.app.Application;
import com.p280ss.android.jank.SatanInitTask;
import com.p280ss.android.legoimpl.BusinessToolsTask;
import com.p280ss.android.sdk.app.AbTestSdkInitTask;
import com.p280ss.android.ugc.aweme.lego.LegoTask;

/* renamed from: com.ss.android.ugc.aweme.legoImp.task.v */
public final class C7158v {

    /* renamed from: a */
    private static LegoTask f20066a;

    /* renamed from: b */
    private static LegoTask f20067b;

    /* renamed from: c */
    private static LegoTask f20068c;

    /* renamed from: d */
    private static LegoTask f20069d;

    /* renamed from: e */
    private static LegoTask f20070e;

    /* renamed from: f */
    private static LegoTask f20071f;

    /* renamed from: a */
    public static LegoTask m22350a() {
        if (f20069d == null) {
            f20069d = new InitModules();
        }
        return f20069d;
    }

    /* renamed from: b */
    public static LegoTask m22352b() {
        if (f20071f == null) {
            f20071f = new SatanInitTask();
        }
        return f20071f;
    }

    /* renamed from: c */
    public static LegoTask m22353c() {
        if (f20067b == null) {
            f20067b = new FrescoTask();
        }
        return f20067b;
    }

    /* renamed from: d */
    public static LegoTask m22354d() {
        if (f20066a == null) {
            f20066a = new AbTestSdkInitTask();
        }
        return f20066a;
    }

    /* renamed from: e */
    public static LegoTask m22355e() {
        if (f20068c == null) {
            f20068c = new InitFireBase();
        }
        return f20068c;
    }

    /* renamed from: a */
    public static LegoTask m22351a(Application application) {
        if (f20070e == null) {
            f20070e = new BusinessToolsTask(application);
        }
        return f20070e;
    }
}
