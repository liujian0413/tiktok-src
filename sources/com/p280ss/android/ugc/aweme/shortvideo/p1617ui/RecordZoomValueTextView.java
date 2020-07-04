package com.p280ss.android.ugc.aweme.shortvideo.p1617ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.vesdk.VECameraSettings.CAMERA_FACING_ID;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.DecimalFormat;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.RecordZoomValueTextView */
public final class RecordZoomValueTextView extends FrameLayout {

    /* renamed from: a */
    private final TextView f107121a;

    /* renamed from: b */
    private final TextView f107122b;

    /* renamed from: c */
    private final Runnable f107123c;

    /* renamed from: d */
    private float f107124d;

    /* renamed from: e */
    private int f107125e;

    /* renamed from: f */
    private int f107126f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.RecordZoomValueTextView$a */
    static final class C41150a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecordZoomValueTextView f107127a;

        C41150a(RecordZoomValueTextView recordZoomValueTextView) {
            this.f107127a = recordZoomValueTextView;
        }

        public final void run() {
            this.f107127a.animate().alpha(0.0f).setDuration(10).start();
        }
    }

    public RecordZoomValueTextView(Context context) {
        this(context, null, 2, null);
    }

    public final void setDelayTime(int i) {
        this.f107125e = i;
    }

    public final void setOpType(int i) {
        this.f107126f = i;
    }

    /* renamed from: b */
    private final void m131378b(int i, float f) {
        if (this.f107126f == 6) {
            m131379c(i, f);
        }
    }

    public RecordZoomValueTextView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet);
        this.f107123c = new C41150a(this);
        this.f107124d = -1.0f;
        this.f107125e = 2;
        this.f107126f = 6;
        LayoutInflater.from(context).inflate(R.layout.a_a, this);
        View findViewById = findViewById(R.id.bzo);
        C7573i.m23582a((Object) findViewById, "findViewById(R.id.mode_text)");
        this.f107122b = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.ei5);
        C7573i.m23582a((Object) findViewById2, "findViewById(R.id.zoom_value_text)");
        this.f107121a = (TextView) findViewById2;
        if (C6399b.m19944t()) {
            this.f107121a.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
        }
    }

    /* renamed from: c */
    private final void m131379c(int i, float f) {
        if (f > 1.0f) {
            DecimalFormat decimalFormat = new DecimalFormat("0.0");
            TextView textView = this.f107121a;
            StringBuilder sb = new StringBuilder();
            sb.append(decimalFormat.format((double) f));
            sb.append("x");
            textView.setText(sb.toString());
        } else if (i == CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal()) {
            this.f107121a.setText("");
            this.f107122b.setText("");
        } else {
            this.f107121a.setText("1x");
            this.f107122b.setText("主摄");
        }
    }

    /* renamed from: a */
    public final void mo101679a(int i, float f) {
        removeCallbacks(this.f107123c);
        postDelayed(this.f107123c, (long) (this.f107125e * 1000));
        if (i == CAMERA_FACING_ID.FACING_FRONT.ordinal() || i == CAMERA_FACING_ID.FACING_BACK.ordinal()) {
            this.f107122b.setText("主摄");
        } else if (i != CAMERA_FACING_ID.FACING_WIDE_ANGLE.ordinal() && i == CAMERA_FACING_ID.FACING_TELEPHOTO.ordinal()) {
            this.f107122b.setText("长焦");
        }
        if (f != this.f107124d) {
            this.f107124d = f;
            if (getAlpha() == 0.0f) {
                animate().alpha(1.0f).setDuration(300).start();
            }
            m131378b(i, f);
        }
    }

    public /* synthetic */ RecordZoomValueTextView(Context context, AttributeSet attributeSet, int i, C7571f fVar) {
        if ((i & 2) != 0) {
            attributeSet = null;
        }
        this(context, attributeSet);
    }
}
