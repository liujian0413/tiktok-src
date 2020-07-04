package com.bytedance.android.livesdk.chatroom.viewmodule.toolbar;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.C3358ac;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C5738d.C5739a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.e */
public final class C5740e extends PopupWindow {

    /* renamed from: a */
    protected Context f16848a;

    /* renamed from: b */
    private C5746i f16849b = ((C5746i) C5747j.m18104b());

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14171a() {
        this.f16849b.mo14177a(false);
    }

    /* renamed from: a */
    public final void mo14172a(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, 85, C3358ac.m12510a(8.0f), (C3358ac.m12511a((Activity) this.f16848a) - iArr[1]) + C3358ac.m12510a(8.0f));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo14173b(View view) {
        ToolbarButton toolbarButton = (ToolbarButton) view.getTag();
        C5739a b = this.f16849b.mo14178b(toolbarButton);
        if (b != null) {
            b.onClick(view);
            if (!(toolbarButton == ToolbarButton.REVERSE_CAMERA || toolbarButton == ToolbarButton.REVERSE_MIRROR)) {
                dismiss();
            }
        }
        C5748k.m18109a().mo14182b(toolbarButton.name());
        m18085a(view.findViewById(R.id.cqx), toolbarButton.name());
    }

    /* renamed from: a */
    private static void m18085a(View view, String str) {
        int i;
        if (view != null && !TextUtils.isEmpty(str)) {
            if (C5748k.m18109a().mo14181a(str)) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    public C5740e(Context context, List<ToolbarButton> list) {
        super(context);
        this.f16848a = context;
        Map<ToolbarButton, View> map = this.f16849b.f16853b;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.an3, null);
        setWidth(-2);
        setHeight(-2);
        setContentView(linearLayout);
        setOutsideTouchable(true);
        setBackgroundDrawable(new BitmapDrawable());
        setFocusable(true);
        setWindowLayoutMode(-2, -2);
        setAnimationStyle(R.style.y4);
        LayoutInflater from = LayoutInflater.from(context);
        for (ToolbarButton toolbarButton : list) {
            View inflate = from.inflate(R.layout.arl, linearLayout, false);
            inflate.setLayoutParams(new LayoutParams(-1, -2));
            inflate.findViewById(R.id.ax9).setBackgroundResource(toolbarButton.getDrawableFolded());
            ((TextView) inflate.findViewById(R.id.c33)).setText(toolbarButton.getTitleId());
            m18085a(inflate.findViewById(R.id.cqx), toolbarButton.name());
            inflate.setTag(toolbarButton);
            linearLayout.addView(inflate);
            map.put(toolbarButton, inflate);
            this.f16849b.mo14176a(toolbarButton, inflate);
            inflate.setOnClickListener(new C5741f(this));
        }
        setOnDismissListener(new C5742g(this));
    }
}
