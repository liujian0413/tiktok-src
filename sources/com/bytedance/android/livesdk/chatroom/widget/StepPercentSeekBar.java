package com.bytedance.android.livesdk.chatroom.widget;

import android.content.res.Resources;
import android.support.p029v7.widget.AppCompatSeekBar;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class StepPercentSeekBar extends AppCompatSeekBar implements OnSeekBarChangeListener {

    /* renamed from: a */
    private C5775a f17011a;

    /* renamed from: b */
    private int f17012b;

    /* renamed from: c */
    private int f17013c;

    /* renamed from: com.bytedance.android.livesdk.chatroom.widget.StepPercentSeekBar$a */
    public interface C5775a {
    }

    public int getPercent() {
        return this.f17013c;
    }

    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    /* renamed from: a */
    private void m18216a() {
        setProgress((this.f17013c * 100) / this.f17012b);
    }

    /* renamed from: b */
    private void m18217b() {
        int progress = (this.f17012b * getProgress()) / 100;
        int i = progress % 10;
        if (i == 0) {
            this.f17013c = progress;
        } else if (i < 5) {
            progress = (progress / 10) * 10;
        } else {
            progress = ((progress / 10) * 10) + 10;
        }
        this.f17013c = progress;
    }

    public void setOnPercentChangeListener(C5775a aVar) {
        this.f17011a = aVar;
    }

    public void onStopTrackingTouch(SeekBar seekBar) {
        m18217b();
        m18216a();
    }

    public void setPercent(int i) {
        if (i >= 0 && i <= this.f17012b) {
            this.f17013c = i;
            m18216a();
        }
    }

    public void setEnabled(boolean z) {
        int i;
        int i2;
        super.setEnabled(z);
        Resources resources = getResources();
        if (z) {
            i = R.drawable.brs;
        } else {
            i = R.drawable.brt;
        }
        setProgressDrawable(resources.getDrawable(i));
        Resources resources2 = getResources();
        if (z) {
            i2 = R.drawable.ch9;
        } else {
            i2 = R.drawable.ch_;
        }
        setThumb(resources2.getDrawable(i2));
    }

    public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
        if (z && this.f17011a != null) {
            m18217b();
        }
    }
}
