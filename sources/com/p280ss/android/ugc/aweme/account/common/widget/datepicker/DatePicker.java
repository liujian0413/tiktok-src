package com.p280ss.android.ugc.aweme.account.common.widget.datepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.p280ss.android.ugc.aweme.account.common.widget.datepicker.NumberPicker.C21162b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker */
public class DatePicker extends LinearLayout implements C21162b {

    /* renamed from: a */
    private NumberPicker f56831a;

    /* renamed from: b */
    private NumberPicker f56832b;

    /* renamed from: c */
    private NumberPicker f56833c;

    /* renamed from: d */
    private Calendar f56834d;

    /* renamed from: e */
    private Calendar f56835e;

    /* renamed from: f */
    private C21160a f56836f;

    /* renamed from: g */
    private LayoutInflater f56837g;

    /* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.DatePicker$a */
    public interface C21160a {
        /* renamed from: a */
        void mo57070a(DatePicker datePicker, int i, int i2, int i3, Calendar calendar);
    }

    public int getDayOfMonth() {
        return this.f56834d.get(5);
    }

    public int getYear() {
        return this.f56834d.get(1);
    }

    public int getMonth() {
        return this.f56834d.get(2) + 1;
    }

    /* renamed from: b */
    private void m71301b() {
        if (this.f56836f != null) {
            this.f56836f.mo57070a(this, getYear(), getMonth(), getDayOfMonth(), this.f56834d);
        }
    }

    /* renamed from: a */
    private void m71300a() {
        this.f56837g.inflate(R.layout.j5, this, true);
        this.f56831a = (NumberPicker) findViewById(R.id.ei0);
        this.f56832b = (NumberPicker) findViewById(R.id.bzt);
        this.f56833c = (NumberPicker) findViewById(R.id.a6c);
        this.f56831a.mo57072a((C21162b) this);
        this.f56832b.mo57072a((C21162b) this);
        this.f56833c.mo57072a((C21162b) this);
        if (!getResources().getConfiguration().locale.getCountry().equals("CN") && !getResources().getConfiguration().locale.getCountry().equals("TW")) {
            this.f56832b.mo57073a(getResources().getStringArray(R.array.a1));
        }
        this.f56834d = Calendar.getInstance();
        mo57061a(this.f56834d.getTime());
    }

    /* renamed from: a */
    public final DatePicker mo57060a(C21160a aVar) {
        this.f56836f = aVar;
        return this;
    }

    public DatePicker(Context context) {
        this(context, null);
    }

    public void setNonRecurrentForYear(boolean z) {
        this.f56831a.setNonRecurrent(z);
    }

    public void setStartYear(int i) {
        this.f56831a.mo57071a(i);
    }

    public void setSoundEffectsEnabled(boolean z) {
        super.setSoundEffectsEnabled(z);
        this.f56831a.setSoundEffectsEnabled(z);
        this.f56832b.setSoundEffectsEnabled(z);
        this.f56833c.setSoundEffectsEnabled(z);
    }

    /* renamed from: a */
    public final DatePicker mo57061a(Date date) {
        if (this.f56834d == null) {
            this.f56834d = Calendar.getInstance();
        }
        this.f56834d.setTime(date);
        this.f56833c.mo57074b(this.f56834d.getActualMaximum(5));
        this.f56831a.mo57075c(this.f56834d.get(1));
        this.f56832b.mo57075c(this.f56834d.get(2) + 1);
        this.f56833c.mo57075c(this.f56834d.get(5));
        return this;
    }

    public void setUpperBoundDate(Calendar calendar) {
        this.f56835e = calendar;
        if (calendar != null) {
            this.f56831a.mo57074b(this.f56835e.get(1));
            if (this.f56834d.get(1) == this.f56835e.get(1)) {
                this.f56832b.mo57074b(this.f56835e.get(2) + 1);
                if (this.f56834d.get(2) == this.f56835e.get(2)) {
                    this.f56833c.mo57074b(this.f56835e.get(5));
                }
            }
        }
    }

    public DatePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f56837g = (LayoutInflater) context.getSystemService("layout_inflater");
        m71300a();
    }

    /* renamed from: a */
    public final void mo57062a(NumberPicker numberPicker, int i, int i2) {
        int i3;
        if (numberPicker == this.f56831a) {
            int i4 = this.f56834d.get(5);
            int i5 = this.f56834d.get(2);
            if (this.f56835e == null || i2 != this.f56835e.get(1)) {
                this.f56832b.mo57074b(this.f56834d.getActualMaximum(2) + 1);
            } else {
                if (i5 > this.f56835e.get(2)) {
                    i5 = this.f56835e.get(2);
                }
                this.f56832b.mo57074b(this.f56835e.get(2) + 1);
            }
            this.f56834d.set(i2, i5, 1);
            int actualMaximum = this.f56834d.getActualMaximum(5);
            if (this.f56835e != null && i2 == this.f56835e.get(1) && i5 == this.f56835e.get(2)) {
                i3 = this.f56835e.get(5);
            } else {
                i3 = actualMaximum;
            }
            if (i4 > i3) {
                i4 = i3;
            }
            this.f56834d.set(5, i4);
            this.f56833c.mo57074b(i3);
        } else if (numberPicker == this.f56832b) {
            int i6 = this.f56834d.get(5);
            int i7 = i2 - 1;
            this.f56834d.set(this.f56834d.get(1), i7, 1);
            int actualMaximum2 = this.f56834d.getActualMaximum(5);
            if (this.f56835e != null && this.f56834d.get(1) == this.f56835e.get(1) && i7 == this.f56835e.get(2)) {
                actualMaximum2 = this.f56835e.get(5);
            }
            if (i6 > actualMaximum2) {
                i6 = actualMaximum2;
            }
            this.f56834d.set(5, i6);
            this.f56833c.mo57074b(actualMaximum2);
        } else if (numberPicker == this.f56833c) {
            this.f56834d.set(5, i2);
        }
        m71301b();
    }
}
