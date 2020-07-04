package com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.InteractStickerBaseView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.PoiStickerHollowTextView;
import com.p280ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.view.StickerHelpBoxView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.PoiStickerView */
public class PoiStickerView extends InteractStickerBaseView {

    /* renamed from: k */
    private PoiStickerHollowTextView f102928k;

    /* renamed from: l */
    private int f102929l;

    /* renamed from: m */
    private int f102930m;

    /* renamed from: n */
    private float f102931n;

    /* renamed from: o */
    private int f102932o;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo98754b() {
        mo98822c();
    }

    /* renamed from: j */
    private void m126790j() {
        this.f102928k.setTextSize(this.f102931n);
        LayoutParams layoutParams = this.f102928k.getLayoutParams();
        layoutParams.width = -2;
        this.f102928k.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    private void m126791k() {
        LayoutParams layoutParams = this.f102928k.getLayoutParams();
        layoutParams.width = this.f102932o;
        this.f102928k.setLayoutParams(layoutParams);
        this.f102928k.setTextSize(this.f102931n * 0.75f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo98753a() {
        if (this.f102928k.getTextViewWidth() > this.f102929l) {
            m126791k();
            this.f102928k.post(new C39625d(this));
        }
        mo98822c();
    }

    /* renamed from: i */
    private void m126789i() {
        LayoutInflater.from(this.f102967a).inflate(R.layout.aay, this);
        this.f102972f = (StickerHelpBoxView) findViewById(R.id.db1);
        this.f102973g = findViewById(R.id.a24);
        this.f102928k = (PoiStickerHollowTextView) findViewById(R.id.a2f);
        this.f102928k.setMaxWidth(this.f102932o);
        setVisibility(8);
    }

    private PoiStickerView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public static PoiStickerView m126788a(Context context) {
        PoiStickerView poiStickerView = new PoiStickerView(context);
        poiStickerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return poiStickerView;
    }

    public void setPoiContentTxt(String str) {
        this.f102928k.setText(str);
        m126790j();
        setVisibility(4);
        this.f102928k.post(new C39624c(this));
    }

    public PoiStickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f102931n = 28.0f;
        this.f102967a = context;
        this.f102930m = (int) C9738o.m28708b(context, 32.0f);
        this.f102929l = C9738o.m28691a(context) - this.f102930m;
        this.f102932o = this.f102929l;
        this.f102931n = C9738o.m28708b(context, 28.0f);
        m126789i();
    }
}
