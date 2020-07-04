package com.p280ss.android.ugc.aweme.p1685ug.festival;

import android.os.Bundle;
import android.support.p029v7.app.AppCompatDialog;
import android.view.Window;
import com.bytedance.ies.dmt.p262ui.widget.DoubleColorBallAnimationView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.ug.festival.FestivalLoadingDialog */
public final class FestivalLoadingDialog extends AppCompatDialog {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.a83);
        DoubleColorBallAnimationView doubleColorBallAnimationView = (DoubleColorBallAnimationView) findViewById(R.id.aa4);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(17170445);
        }
        if (doubleColorBallAnimationView != null) {
            doubleColorBallAnimationView.setVisibility(0);
        }
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
