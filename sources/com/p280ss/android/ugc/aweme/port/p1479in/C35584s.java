package com.p280ss.android.ugc.aweme.port.p1479in;

import android.content.Intent;
import android.support.p022v4.app.Fragment;
import com.p280ss.android.ugc.aweme.base.p1059d.p1060a.C23319b;
import com.p280ss.android.ugc.aweme.common.C25672e;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p280ss.android.ugc.aweme.shortvideo.C38553c;
import com.p280ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;

/* renamed from: com.ss.android.ugc.aweme.port.in.s */
public interface C35584s {

    /* renamed from: com.ss.android.ugc.aweme.port.in.s$a */
    public interface C35585a {
        /* renamed from: a */
        boolean mo83257a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.s$b */
    public interface C35586b {
        /* renamed from: a */
        boolean mo83256a(Object... objArr);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.s$c */
    public interface C35587c {
        /* renamed from: a */
        C38553c mo83167a();

        /* renamed from: a */
        void mo83168a(C35589e eVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.s$d */
    public interface C35588d extends C25672e {
        /* renamed from: a */
        void mo90396a(AVSearchChallengeList aVSearchChallengeList);

        /* renamed from: d */
        void mo90397d(Exception exc);

        /* renamed from: e */
        void mo90398e();
    }

    /* renamed from: com.ss.android.ugc.aweme.port.in.s$e */
    public static class C35589e {

        /* renamed from: a */
        public String f93284a;

        /* renamed from: b */
        public String f93285b;

        /* renamed from: c */
        public String f93286c;

        /* renamed from: d */
        public String f93287d;

        /* renamed from: e */
        public String f93288e;
    }

    /* renamed from: a */
    C35585a mo83160a(C25675c<AVChallenge> cVar);

    /* renamed from: a */
    C35586b mo83161a(C35588d dVar);

    /* renamed from: a */
    C35587c mo83162a(Fragment fragment);

    /* renamed from: a */
    AVChallenge mo83163a(int i, int i2, Intent intent, int i3);

    /* renamed from: a */
    AVChallenge mo83164a(Intent intent);

    /* renamed from: a */
    AVChallenge mo83165a(String str, int i, boolean z) throws Exception;

    /* renamed from: a */
    void mo83166a(String str, String str2, int i, int i2, C23319b<AVChallenge> bVar);
}
