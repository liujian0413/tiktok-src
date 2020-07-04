package com.zhihu.matisse.internal.p1856ui;

import android.database.Cursor;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.zhihu.matisse.internal.entity.Album;
import com.zhihu.matisse.internal.entity.C47338d;
import com.zhihu.matisse.internal.entity.Item;
import com.zhihu.matisse.internal.model.AlbumMediaCollection;
import com.zhihu.matisse.internal.model.AlbumMediaCollection.C47342a;
import com.zhihu.matisse.internal.p1856ui.adapter.PreviewPagerAdapter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zhihu.matisse.internal.ui.AlbumPreviewActivity */
public class AlbumPreviewActivity extends BasePreviewActivity implements C47342a {

    /* renamed from: l */
    private AlbumMediaCollection f121486l = new AlbumMediaCollection();

    /* renamed from: m */
    private boolean f121487m;

    /* renamed from: a */
    public final void mo119378a() {
    }

    public void onDestroy() {
        super.onDestroy();
        this.f121486l.mo119374a();
    }

    /* renamed from: a */
    public final void mo119379a(Cursor cursor) {
        if (cursor != null) {
            ArrayList arrayList = new ArrayList();
            while (cursor.moveToNext()) {
                arrayList.add(Item.m147794a(cursor));
            }
            if (!arrayList.isEmpty()) {
                PreviewPagerAdapter previewPagerAdapter = (PreviewPagerAdapter) this.f121490c.getAdapter();
                previewPagerAdapter.mo119417a((List<Item>) arrayList);
                previewPagerAdapter.notifyDataSetChanged();
                if (!this.f121487m) {
                    this.f121487m = true;
                    int indexOf = arrayList.indexOf((Item) getIntent().getParcelableExtra("extra_item"));
                    this.f121490c.setCurrentItem(indexOf, false);
                    this.f121496i = indexOf;
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C47338d.m147803a().f121460p) {
            setResult(0);
            finish();
            return;
        }
        this.f121486l.mo119375a((FragmentActivity) this, (C47342a) this);
        this.f121486l.mo119376a((Album) getIntent().getParcelableExtra("extra_album"));
        Item item = (Item) getIntent().getParcelableExtra("extra_item");
        if (this.f121489b.f121450f) {
            this.f121492e.setCheckedNum(this.f121488a.mo119391e(item));
        } else {
            this.f121492e.setChecked(this.f121488a.mo119388c(item));
        }
        mo119395a(item);
    }
}
