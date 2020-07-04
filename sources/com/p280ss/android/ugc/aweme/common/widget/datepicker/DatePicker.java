package com.p280ss.android.ugc.aweme.common.widget.datepicker;

import android.content.Context;
import android.graphics.Color;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.common.widget.datepicker.NumberPicker.C25761b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker */
public class DatePicker extends LinearLayout implements C25761b {

    /* renamed from: a */
    private NumberPicker f67927a;

    /* renamed from: b */
    private NumberPicker f67928b;

    /* renamed from: c */
    private NumberPicker f67929c;

    /* renamed from: d */
    private Calendar f67930d;

    /* renamed from: e */
    private Calendar f67931e;

    /* renamed from: f */
    private C25759a f67932f;

    /* renamed from: g */
    private LayoutInflater f67933g;

    /* renamed from: com.ss.android.ugc.aweme.common.widget.datepicker.DatePicker$a */
    public interface C25759a {
    }

    public int getDayOfMonth() {
        return this.f67930d.get(5);
    }

    public int getYear() {
        return this.f67930d.get(1);
    }

    public int getMonth() {
        return this.f67930d.get(2) + 1;
    }

    /* renamed from: b */
    private void m84615b() {
        if (this.f67932f != null) {
            getYear();
            getMonth();
            getDayOfMonth();
        }
    }

    /* renamed from: a */
    private void m84613a() {
        this.f67933g.inflate(R.layout.j4, this, true);
        this.f67927a = (NumberPicker) findViewById(R.id.ei0);
        this.f67928b = (NumberPicker) findViewById(R.id.bzt);
        this.f67929c = (NumberPicker) findViewById(R.id.a6c);
        this.f67927a.mo66829a((C25761b) this);
        this.f67928b.mo66829a((C25761b) this);
        this.f67929c.mo66829a((C25761b) this);
        if (!getResources().getConfiguration().locale.getCountry().equals("CN") && !getResources().getConfiguration().locale.getCountry().equals("TW")) {
            this.f67928b.mo66830a(getResources().getStringArray(R.array.a1));
        }
        this.f67930d = Calendar.getInstance();
        mo66819a(this.f67930d.getTime());
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    public void setStartYear(int i) {
        this.f67927a.mo66828a(i);
    }

    /* renamed from: a */
    private DatePicker m84612a(int i) {
        this.f67927a.mo66834d(i);
        this.f67928b.mo66834d(i);
        this.f67929c.mo66834d(i);
        return this;
    }

    /* renamed from: b */
    private DatePicker m84614b(int i) {
        this.f67927a.mo66835e(i);
        this.f67928b.mo66835e(i);
        this.f67929c.mo66835e(i);
        return this;
    }

    /* renamed from: c */
    private DatePicker m84616c(int i) {
        this.f67927a.mo66836f(i);
        this.f67928b.mo66836f(i);
        this.f67929c.mo66836f(i);
        return this;
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f67927a.setSoundEffectsEnabled(z);
        this.f67928b.setSoundEffectsEnabled(z);
        this.f67929c.setSoundEffectsEnabled(z);
    }

    /* renamed from: a */
    public final DatePicker mo66819a(Date date) {
        if (this.f67930d == null) {
            this.f67930d = Calendar.getInstance();
        }
        this.f67930d.setTime(date);
        this.f67927a.mo66832c(this.f67930d.get(1));
        if (this.f67930d.get(1) == Calendar.getInstance().get(1)) {
            this.f67928b.mo66831b(Calendar.getInstance().get(2) + 1);
        } else {
            this.f67928b.mo66831b(this.f67930d.getActualMaximum(2) + 1);
        }
        this.f67928b.mo66832c(this.f67930d.get(2) + 1);
        this.f67929c.mo66831b(this.f67930d.getActualMaximum(5));
        this.f67929c.mo66832c(this.f67930d.get(5));
        return this;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f67927a.setEnabled(z);
        this.f67928b.setEnabled(z);
        this.f67929c.setEnabled(z);
        int c = C0683b.m2912c(getContext(), R.color.lw);
        int c2 = C0683b.m2912c(getContext(), R.color.lh);
        if (!z) {
            c = Color.argb((int) (((float) Color.alpha(c)) * 0.34f), Color.red(c), Color.green(c), Color.blue(c));
            c2 = Color.argb((int) (((float) Color.alpha(c2)) * 0.34f), Color.red(c2), Color.green(c2), Color.blue(c2));
        }
        m84612a(c);
        m84614b(c);
        m84616c(c2);
    }

    public void setUpperBoundDate(Calendar calendar) {
        this.f67931e = calendar;
        if (calendar != null) {
            this.f67927a.mo66831b(this.f67931e.get(1));
            if (this.f67930d.get(1) == this.f67931e.get(1)) {
                this.f67928b.mo66831b(this.f67931e.get(2) + 1);
                if (this.f67930d.get(2) == this.f67931e.get(2)) {
                    this.f67929c.mo66831b(this.f67931e.get(5));
                }
            }
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f67933g = (LayoutInflater) context.getSystemService("layout_inflater");
        m84613a();
    }

    /* renamed from: a */
    public final void mo66820a(NumberPicker numberPicker, int i, int i2) {
        int i3;
        if (numberPicker == this.f67927a) {
            int i4 = this.f67930d.get(5);
            int i5 = this.f67930d.get(2);
            if (this.f67931e == null || i2 != this.f67931e.get(1)) {
                this.f67928b.mo66831b(this.f67930d.getActualMaximum(2) + 1);
            } else {
                if (i5 > this.f67931e.get(2)) {
                    i5 = this.f67931e.get(2);
                }
                this.f67928b.mo66831b(this.f67931e.get(2) + 1);
            }
            this.f67930d.set(i2, i5, 1);
            int actualMaximum = this.f67930d.getActualMaximum(5);
            if (this.f67931e != null && i2 == this.f67931e.get(1) && i5 == this.f67931e.get(2)) {
                i3 = this.f67931e.get(5);
            } else {
                i3 = actualMaximum;
            }
            if (i4 > i3) {
                i4 = i3;
            }
            this.f67930d.set(5, i4);
            this.f67929c.mo66831b(i3);
        } else if (numberPicker == this.f67928b) {
            int i6 = this.f67930d.get(5);
            int i7 = i2 - 1;
            this.f67930d.set(this.f67930d.get(1), i7, 1);
            int actualMaximum2 = this.f67930d.getActualMaximum(5);
            if (this.f67931e != null && this.f67930d.get(1) == this.f67931e.get(1) && i7 == this.f67931e.get(2)) {
                actualMaximum2 = this.f67931e.get(5);
            }
            if (i6 > actualMaximum2) {
                i6 = actualMaximum2;
            }
            this.f67930d.set(5, i6);
            this.f67929c.mo66831b(actualMaximum2);
        } else if (numberPicker == this.f67929c) {
            this.f67930d.set(5, i2);
        }
        m84615b();
    }
}
