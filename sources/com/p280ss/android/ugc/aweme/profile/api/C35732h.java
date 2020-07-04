package com.p280ss.android.ugc.aweme.profile.api;

import android.os.Handler;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.profile.experiment.DivideAwemeV1User;

/* renamed from: com.ss.android.ugc.aweme.profile.api.h */
public final class C35732h {

    /* renamed from: a */
    private static C35732h f93702a;

    /* renamed from: a */
    public static C35732h m115451a() {
        if (f93702a == null) {
            f93702a = new C35732h();
        }
        return f93702a;
    }

    /* renamed from: a */
    public final void mo90590a(Handler handler) {
        mo90592a(handler, C6861a.m21337f().getCurUserId(), null, 0);
    }

    /* renamed from: b */
    private static void m115455b(Handler handler, String str) {
        C23397p.m76735a().mo60807a(handler, new C35734j(str), 0);
    }

    /* renamed from: a */
    private static void m115453a(Handler handler, String str) {
        C23397p.m76735a().mo60807a(handler, new C35733i(str), 0);
    }

    /* renamed from: a */
    public final void mo90591a(Handler handler, String str, int i) {
        m115456c(handler, str, null, 0);
    }

    /* renamed from: c */
    private void m115456c(Handler handler, String str, String str2, int i) {
        String str3;
        if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
            str3 = C35731g.m115450b(null, str, null, i);
        } else {
            str3 = C35731g.m115442a(str, (String) null, i);
        }
        m115453a(handler, str3);
    }

    /* renamed from: b */
    public final void mo90594b(Handler handler, String str, String str2, int i) {
        String str3;
        if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
            str3 = C35731g.m115449b(str, (String) null, i);
        } else {
            str3 = C35731g.m115441a(str, i);
        }
        m115455b(handler, str3);
    }

    /* renamed from: a */
    public final void mo90592a(Handler handler, String str, String str2, int i) {
        String str3;
        if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
            str3 = C35731g.m115450b(null, str, str2, i);
        } else {
            str3 = C35731g.m115442a(str, str2, i);
        }
        m115455b(handler, str3);
    }

    /* renamed from: a */
    public final void mo90593a(Handler handler, String str, String str2, String str3, int i) {
        String str4;
        if (C6384b.m19835a().mo15292a(DivideAwemeV1User.class, true, "divide_aweme_v1_user", C6384b.m19835a().mo15295d().divide_aweme_v1_user, true)) {
            str4 = C35731g.m115450b(str2, str, str3, i);
        } else {
            str4 = C35731g.m115443a(str, str2, str3, i);
        }
        m115455b(handler, str4);
    }
}
