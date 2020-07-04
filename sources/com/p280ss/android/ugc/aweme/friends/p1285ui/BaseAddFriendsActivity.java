package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.os.Bundle;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.friends.invite.C30052a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.BaseAddFriendsActivity */
public abstract class BaseAddFriendsActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    private C30052a f79084b;
    protected NormalTitleBar mTitleBar;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo76473a(boolean z);

    public void onDestroy() {
        super.onDestroy();
    }

    /* renamed from: a */
    private void m98567a() {
        this.mTitleBar.setTitle((int) R.string.b71);
        this.mTitleBar.setTitleColor(getResources().getColor(R.color.a5d));
        this.mTitleBar.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: b */
            public final void mo25896b(View view) {
            }

            /* renamed from: a */
            public final void mo25895a(View view) {
                BaseAddFriendsActivity.this.finish();
            }
        });
        this.f79084b = new C30052a(this);
        this.f79084b.mo76326a(C21115b.m71197a().getCurUser());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.a8);
        m98567a();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 1 && iArr.length > 0 && iArr[0] == 0) {
            mo76473a(true);
        } else {
            super.onRequestPermissionsResult(i, strArr, iArr);
        }
    }
}
