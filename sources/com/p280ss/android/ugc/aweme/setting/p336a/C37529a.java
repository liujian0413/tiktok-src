package com.p280ss.android.ugc.aweme.setting.p336a;

import android.content.Context;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItem;
import com.bytedance.ies.dmt.p262ui.widget.setting.SettingItemBase.C10813a;
import com.p280ss.android.ugc.aweme.app.debug.AbTestSettingCategoryActivity;
import com.p280ss.android.ugc.aweme.app.debug.AbTestSettingPageParam;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.setting.a.a */
public final class C37529a extends SettingItem {
    public C37529a(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final C37529a mo94819a(final String str, ArrayList<C37538g> arrayList) {
        String str2;
        StringBuilder sb = new StringBuilder("AB：");
        sb.append(str);
        setStartText(sb.toString());
        int size = arrayList.size();
        StringBuilder sb2 = new StringBuilder();
        if (size > 20) {
            str2 = "😂😂😂";
        } else {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(size);
        sb2.append("项");
        setRightTxt(sb2.toString());
        setOnSettingItemClickListener(new C10813a() {
            public final void OnSettingItemClick(View view) {
                AbTestSettingPageParam abTestSettingPageParam = new AbTestSettingPageParam();
                abTestSettingPageParam.category = str;
                AbTestSettingCategoryActivity.m75421a(C37529a.this.getContext(), abTestSettingPageParam);
            }
        });
        return this;
    }
}
