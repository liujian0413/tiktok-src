package com.p280ss.android.ugc.aweme.i18n.musically.profile.edit.p1307b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.i18n.musically.cut.C30514b;
import com.p280ss.android.ugc.aweme.i18n.musically.cut.C30514b.C30516a;
import com.p280ss.android.ugc.aweme.profile.util.C36749q;
import com.p280ss.android.ugc.aweme.profile.util.C36749q.C36758a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.musically.profile.edit.b.a */
public final class C30530a extends C36749q {

    /* renamed from: a */
    protected String f80225a;

    /* renamed from: com.ss.android.ugc.aweme.i18n.musically.profile.edit.b.a$a */
    public interface C30534a extends C36758a {
        /* renamed from: a */
        void mo80247a(Activity activity, View view);

        /* renamed from: b */
        void mo80251b(String str);

        /* renamed from: c */
        void mo80252c();
    }

    /* renamed from: a */
    public final boolean mo80258a(int i, int i2, Intent intent) {
        return i == 10004;
    }

    /* renamed from: b */
    public final String mo80259b() {
        return this.f80225a;
    }

    /* renamed from: a */
    public final void mo80254a() {
        new C30514b().mo80210a(this.f96463b, new C30516a() {
            /* renamed from: a */
            public final void mo80213a(String str) {
                if (C30530a.this.f96469h != null) {
                    ((C30534a) C30530a.this.f96469h).mo80251b(str);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo80255a(int i) {
        m99710a(i, mo80259b());
    }

    /* renamed from: a */
    public final void mo80256a(final View view) {
        new C11030a(this.f96463b).mo26643a((CharSequence[]) this.f96464c.getStringArray(R.array.a2), (OnClickListener) new OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (TextUtils.isEmpty(C30530a.this.f96466e)) {
                    C10761a.m31409e((Context) C30530a.this.f96463b, (int) R.string.djg).mo25750a();
                    return;
                }
                switch (i) {
                    case 0:
                        C30530a.this.mo80254a();
                        return;
                    case 1:
                        if (C30530a.this.f96469h != null) {
                            ((C30534a) C30530a.this.f96469h).mo80252c();
                            return;
                        }
                        break;
                    case 2:
                        if (C30530a.this.f96469h != null) {
                            ((C30534a) C30530a.this.f96469h).mo80247a(C30530a.this.f96463b, view);
                            break;
                        }
                        break;
                }
            }
        }).mo26644a().show();
    }

    /* renamed from: a */
    public final void mo80257a(String str) {
        this.f80225a = str;
        m99710a(0, str);
    }

    /* renamed from: a */
    private void m99710a(int i, final String str) {
        C6726a.m20843a(new Runnable() {
            public final void run() {
                StringBuilder sb = new StringBuilder();
                sb.append(Api.f60504d);
                sb.append("?uid=");
                sb.append(C21115b.m71197a().getCurUserId());
                C21115b.m71197a().uploadVideoAvatar(C30530a.this.f96468g, sb.toString(), 4194304, str);
            }
        }, i);
    }

    public C30530a(Activity activity, Fragment fragment, C6309f fVar, C30534a aVar) {
        super(activity, fragment, fVar, aVar);
    }
}
