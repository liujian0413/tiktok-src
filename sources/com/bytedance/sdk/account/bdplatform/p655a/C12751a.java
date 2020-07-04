package com.bytedance.sdk.account.bdplatform.p655a;

import com.bytedance.sdk.account.bdplatform.p656b.C12758a;
import com.bytedance.sdk.account.bdplatform.p656b.C12759b;
import com.bytedance.sdk.account.bdplatform.p656b.C12764e;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12746a;
import com.bytedance.sdk.account.p650b.p653c.C12745c.C12747b;

/* renamed from: com.bytedance.sdk.account.bdplatform.a.a */
public interface C12751a {

    /* renamed from: com.bytedance.sdk.account.bdplatform.a.a$a */
    public interface C12752a {
        /* renamed from: a */
        C12758a mo31252a(C12746a aVar, String str);

        /* renamed from: a */
        C12759b mo31253a(C12746a aVar);

        /* renamed from: b */
        C12764e mo31254b(C12746a aVar);
    }

    /* renamed from: com.bytedance.sdk.account.bdplatform.a.a$b */
    public interface C12753b {
        /* renamed from: a */
        void mo31255a();

        /* renamed from: a */
        boolean mo31256a(int i, String str);

        /* renamed from: a */
        boolean mo31257a(C12746a aVar);

        /* renamed from: b */
        boolean mo31258b(C12746a aVar);
    }

    /* renamed from: com.bytedance.sdk.account.bdplatform.a.a$c */
    public interface C12754c {
        void dismissLoadingDialog();

        String getAuthLoadingText();

        String getInitLoadingText();

        void onAuthLogin(C12759b bVar);

        void onCancel(C12747b bVar);

        void onError(C12747b bVar);

        void onLogEvent(String str, String str2, int i, String str3);

        void onNeedLogin();

        void onSuccess(C12747b bVar);

        void showLoadingDialog(String str);

        void updateLoginStatus();
    }
}
