package com.p280ss.android.ugc.aweme.p313im.sdk.chat.input;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.j */
public class C30872j implements OnClickListener, OnLongClickListener {
    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
    }

    public boolean onLongClick(View view) {
        return false;
    }

    /* renamed from: a */
    public static void m100537a(OnLongClickListener onLongClickListener, View... viewArr) {
        for (int i = 0; i < 2; i++) {
            viewArr[i].setOnLongClickListener(onLongClickListener);
        }
    }

    /* renamed from: a */
    public static void m100536a(OnClickListener onClickListener, View... viewArr) {
        if (viewArr.length > 0) {
            for (View onClickListener2 : viewArr) {
                onClickListener2.setOnClickListener(onClickListener);
            }
        }
    }
}
