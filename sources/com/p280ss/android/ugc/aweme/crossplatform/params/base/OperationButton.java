package com.p280ss.android.ugc.aweme.crossplatform.params.base;

import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.params.base.OperationButton */
public enum OperationButton {
    refresh(R.id.cr4, "refresh"),
    copylink(R.id.a32, "copylink"),
    openwithbrowser(R.id.c8x, "openwithbrowser");
    

    /* renamed from: id */
    public int f68472id;
    public String key;

    private OperationButton(int i, String str) {
        this.f68472id = i;
        this.key = str;
    }
}
