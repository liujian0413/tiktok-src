package com.twitter.sdk.android.tweetui.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class VideoControlView extends FrameLayout {

    /* renamed from: a */
    C47050a f120730a;

    /* renamed from: b */
    ImageButton f120731b;

    /* renamed from: c */
    TextView f120732c;

    /* renamed from: d */
    TextView f120733d;

    /* renamed from: e */
    SeekBar f120734e;

    /* renamed from: f */
    public final Handler f120735f = new Handler() {
        public final void handleMessage(Message message) {
            if (message.what == 1001 && VideoControlView.this.f120730a != null) {
                VideoControlView.this.mo118283a();
                VideoControlView.this.mo118285b();
                if (VideoControlView.this.mo118288e() && VideoControlView.this.f120730a.mo118301c()) {
                    sendMessageDelayed(obtainMessage(1001), 500);
                }
            }
        }
    };

    /* renamed from: com.twitter.sdk.android.tweetui.internal.VideoControlView$a */
    public interface C47050a {
        /* renamed from: a */
        void mo118298a();

        /* renamed from: a */
        void mo118299a(int i);

        /* renamed from: b */
        void mo118300b();

        /* renamed from: c */
        boolean mo118301c();

        int getBufferPercentage();

        int getCurrentPosition();

        int getDuration();
    }

    /* renamed from: h */
    private OnClickListener m147122h() {
        return new C47082m(this);
    }

    /* renamed from: i */
    private OnSeekBarChangeListener m147123i() {
        return new OnSeekBarChangeListener() {
            public final void onStartTrackingTouch(SeekBar seekBar) {
                VideoControlView.this.f120735f.removeMessages(1001);
            }

            public final void onStopTrackingTouch(SeekBar seekBar) {
                VideoControlView.this.f120735f.sendEmptyMessage(1001);
            }

            public final void onProgressChanged(SeekBar seekBar, int i, boolean z) {
                if (z) {
                    int duration = (int) (((long) (VideoControlView.this.f120730a.getDuration() * i)) / 1000);
                    VideoControlView.this.f120730a.mo118299a(duration);
                    VideoControlView.this.setCurrentTime(duration);
                }
            }
        };
    }

    /* renamed from: f */
    public final void mo118289f() {
        this.f120735f.sendEmptyMessage(1001);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        m147121g();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo118286c() {
        this.f120735f.removeMessages(1001);
        C47059a.m147150a(this, NormalGiftView.MASK_TRANSLATE_VALUE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo118287d() {
        this.f120735f.sendEmptyMessage(1001);
        C47059a.m147151b(this, NormalGiftView.MASK_TRANSLATE_VALUE);
    }

    /* renamed from: e */
    public final boolean mo118288e() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m147124j() {
        this.f120731b.setImageResource(R.drawable.clk);
        this.f120731b.setContentDescription(getContext().getString(R.string.fgt));
    }

    /* renamed from: k */
    private void m147125k() {
        this.f120731b.setImageResource(R.drawable.clj);
        this.f120731b.setContentDescription(getContext().getString(R.string.fgs));
    }

    /* renamed from: l */
    private void m147126l() {
        this.f120731b.setImageResource(R.drawable.cll);
        this.f120731b.setContentDescription(getContext().getString(R.string.fgx));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118283a() {
        int duration = this.f120730a.getDuration();
        int currentPosition = this.f120730a.getCurrentPosition();
        int bufferPercentage = this.f120730a.getBufferPercentage();
        setDuration(duration);
        setCurrentTime(currentPosition);
        m147120a(currentPosition, duration, bufferPercentage);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo118285b() {
        if (this.f120730a.mo118301c()) {
            m147125k();
        } else if (this.f120730a.getCurrentPosition() > Math.max(this.f120730a.getDuration() - 500, 0)) {
            m147126l();
        } else {
            m147124j();
        }
    }

    /* renamed from: g */
    private void m147121g() {
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.b0r, this);
        this.f120731b = (ImageButton) findViewById(R.id.e5t);
        this.f120732c = (TextView) findViewById(R.id.e5k);
        this.f120733d = (TextView) findViewById(R.id.e5l);
        this.f120734e = (SeekBar) findViewById(R.id.e5r);
        this.f120734e.setMax(1000);
        this.f120734e.setOnSeekBarChangeListener(m147123i());
        this.f120731b.setOnClickListener(m147122h());
        setDuration(0);
        setCurrentTime(0);
        m147120a(0, 0, 0);
    }

    public void setMediaPlayer(C47050a aVar) {
        this.f120730a = aVar;
    }

    public VideoControlView(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    public void setCurrentTime(int i) {
        this.f120732c.setText(C47071e.m147169a((long) i));
    }

    /* access modifiers changed from: 0000 */
    public void setDuration(int i) {
        this.f120733d.setText(C47071e.m147169a((long) i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118284a(View view) {
        if (this.f120730a.mo118301c()) {
            this.f120730a.mo118300b();
        } else {
            this.f120730a.mo118298a();
        }
        mo118287d();
    }

    public VideoControlView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private void m147120a(int i, int i2, int i3) {
        long j;
        if (i2 > 0) {
            j = (((long) i) * 1000) / ((long) i2);
        } else {
            j = 0;
        }
        this.f120734e.setProgress((int) j);
        this.f120734e.setSecondaryProgress(i3 * 10);
    }

    public VideoControlView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
