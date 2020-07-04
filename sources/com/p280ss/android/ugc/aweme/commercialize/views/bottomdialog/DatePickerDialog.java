package com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnShowListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25267bf;
import com.p280ss.android.ugc.aweme.common.widget.datepicker.DatePicker;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog */
public final class DatePickerDialog extends AdBottomDialog {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f67218a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DatePickerDialog.class), "mDatePickerView", "getMDatePickerView()Lcom/ss/android/ugc/aweme/common/widget/datepicker/DatePicker;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(DatePickerDialog.class), "mConfirmView", "getMConfirmView()Lcom/ss/android/ugc/aweme/commercialize/views/bottomdialog/AdBottomDialogConfirmView;"))};

    /* renamed from: d */
    public static final C25514b f67219d = new C25514b(null);

    /* renamed from: b */
    public C25513a f67220b;

    /* renamed from: c */
    public final C25515c f67221c;

    /* renamed from: e */
    private final C7541d f67222e = C7546e.m23569a(new C25520g(this));

    /* renamed from: f */
    private final C7541d f67223f = C7546e.m23569a(new C25519f(this));

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$a */
    public interface C25513a {
        /* renamed from: a */
        void mo66049a();

        /* renamed from: a */
        void mo66050a(String str);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$b */
    public static final class C25514b {
        private C25514b() {
        }

        public /* synthetic */ C25514b(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$c */
    public static final class C25515c {

        /* renamed from: a */
        public String f67224a;

        /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$c$a */
        public static final class C25516a extends C25267bf<C25515c> {
            public C25516a() {
                super(new C25515c(null, 1, null));
            }
        }

        private C25515c(String str) {
            this.f67224a = str;
        }

        /* synthetic */ C25515c(String str, int i, C7571f fVar) {
            this(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$d */
    static final class C25517d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DatePickerDialog f67225a;

        C25517d(DatePickerDialog datePickerDialog) {
            this.f67225a = datePickerDialog;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            DatePicker c = this.f67225a.mo66264c();
            if (c != null) {
                C25513a aVar = this.f67225a.f67220b;
                if (aVar != null) {
                    Locale locale = Locale.CHINA;
                    C7573i.m23582a((Object) locale, "Locale.CHINA");
                    String a = C1642a.m8035a(locale, "%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(c.getYear()), Integer.valueOf(c.getMonth()), Integer.valueOf(c.getDayOfMonth())}, 3));
                    C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                    aVar.mo66050a(a);
                }
                this.f67225a.dismiss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$e */
    static final class C25518e implements OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ DatePickerDialog f67226a;

        C25518e(DatePickerDialog datePickerDialog) {
            this.f67226a = datePickerDialog;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            C25513a aVar = this.f67226a.f67220b;
            if (aVar != null) {
                aVar.mo66049a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$f */
    static final class C25519f extends Lambda implements C7561a<AdBottomDialogConfirmView> {

        /* renamed from: a */
        final /* synthetic */ DatePickerDialog f67227a;

        C25519f(DatePickerDialog datePickerDialog) {
            this.f67227a = datePickerDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public AdBottomDialogConfirmView invoke() {
            return (AdBottomDialogConfirmView) this.f67227a.findViewById(R.id.a10);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$g */
    static final class C25520g extends Lambda implements C7561a<DatePicker> {

        /* renamed from: a */
        final /* synthetic */ DatePickerDialog f67228a;

        C25520g(DatePickerDialog datePickerDialog) {
            this.f67228a = datePickerDialog;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DatePicker invoke() {
            return (DatePicker) this.f67228a.findViewById(R.id.a6b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.DatePickerDialog$h */
    static final class C25521h implements OnShowListener {

        /* renamed from: a */
        final /* synthetic */ DatePickerDialog f67229a;

        C25521h(DatePickerDialog datePickerDialog) {
            this.f67229a = datePickerDialog;
        }

        public final void onShow(DialogInterface dialogInterface) {
            String str;
            long j;
            DatePicker c = this.f67229a.mo66264c();
            if (c != null) {
                C25515c cVar = this.f67229a.f67221c;
                if (cVar != null) {
                    str = cVar.f67224a;
                } else {
                    str = null;
                }
                Long a = DatePickerDialog.m83900a(str);
                if (a != null) {
                    j = a.longValue();
                } else {
                    j = System.currentTimeMillis();
                }
                GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
                gregorianCalendar.setTimeInMillis(j);
                c.mo66819a(gregorianCalendar.getTime());
            }
        }
    }

    /* renamed from: d */
    private final AdBottomDialogConfirmView m83901d() {
        return (AdBottomDialogConfirmView) this.f67223f.getValue();
    }

    /* renamed from: a */
    public final int mo66262a() {
        return R.layout.k1;
    }

    /* renamed from: c */
    public final DatePicker mo66264c() {
        return (DatePicker) this.f67222e.getValue();
    }

    /* renamed from: e */
    private final void m83902e() {
        DatePicker c = mo66264c();
        if (c != null) {
            c.setStartYear(1900);
            c.setUpperBoundDate(Calendar.getInstance());
        }
        AdBottomDialogConfirmView d = m83901d();
        if (d != null) {
            d.setOnClickListener(new C25517d(this));
            d.setClickable(true);
        }
        setOnCancelListener(new C25518e(this));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m83902e();
        setOnShowListener(new C25521h(this));
    }

    /* renamed from: a */
    public static Long m83900a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        try {
            Date parse = simpleDateFormat.parse(str);
            C7573i.m23582a((Object) parse, "format.parse(dateStr)");
            return Long.valueOf(parse.getTime());
        } catch (Exception unused) {
            return null;
        }
    }

    public DatePickerDialog(Context context, C25515c cVar) {
        super(context);
        this.f67221c = cVar;
    }
}
