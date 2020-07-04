package com.bytedance.android.live.broadcast.widget;

import android.arch.lifecycle.C0053p;
import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p348d.C7326g;

public class StickerTipWidget extends LiveRecyclableWidget implements C0053p<KVData> {

    /* renamed from: a */
    private C7321c f9481a;

    public int getLayoutId() {
        return R.layout.atx;
    }

    public void onInit(Object... objArr) {
    }

    public void onUnload() {
        this.dataCenter.removeObserver(this);
        if (this.f9481a != null && !this.f9481a.isDisposed()) {
            this.f9481a.dispose();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo9868a(Long l) throws Exception {
        this.contentView.setVisibility(8);
    }

    public void onLoad(Object... objArr) {
        this.dataCenter.observe("cmd_sticker_tip", this);
    }

    /* renamed from: a */
    static final /* synthetic */ void m11708a(Throwable th) throws Exception {
        StickerTipWidget.class.getSimpleName();
        th.getMessage();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(KVData kVData) {
        if (kVData != null && !TextUtils.isEmpty(kVData.getKey())) {
            String key = kVData.getKey();
            char c = 65535;
            if (key.hashCode() == 1351936788 && key.equals("cmd_sticker_tip")) {
                c = 0;
            }
            if (c == 0) {
                if (this.f9481a != null && !this.f9481a.isDisposed()) {
                    this.f9481a.dispose();
                }
                if (C6319n.m19593a((String) kVData.getData())) {
                    this.contentView.setVisibility(4);
                    return;
                }
                this.contentView.setVisibility(0);
                ((TextView) this.contentView).setText((CharSequence) kVData.getData());
                this.f9481a = C7492s.m23295b(3, TimeUnit.SECONDS).mo19293a((C7497x<? super T, ? extends R>) getAutoUnbindTransformer()).mo19294a(C47549a.m148327a()).mo19280a((C7326g<? super T>) new C3093al<Object>(this), C3094am.f9566a);
            }
        }
    }
}
