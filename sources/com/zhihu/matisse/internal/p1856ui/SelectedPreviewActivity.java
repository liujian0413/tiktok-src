package com.zhihu.matisse.internal.p1856ui;

import android.os.Bundle;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zhihu.matisse.internal.ui.SelectedPreviewActivity */
public class SelectedPreviewActivity extends BasePreviewActivity {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C47338d.m147803a().f121460p) {
            setResult(0);
            finish();
            return;
        }
        ArrayList parcelableArrayList = getIntent().getBundleExtra("extra_default_bundle").getParcelableArrayList("state_selection");
        this.f121491d.mo119417a((List<Item>) parcelableArrayList);
        this.f121491d.notifyDataSetChanged();
        if (this.f121489b.f121450f) {
            this.f121492e.setCheckedNum(1);
        } else {
            this.f121492e.setChecked(true);
        }
        this.f121496i = 0;
        mo119395a((Item) parcelableArrayList.get(0));
    }
}
