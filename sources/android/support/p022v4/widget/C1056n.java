package android.support.p022v4.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.support.p022v4.p026d.C0709c;
import android.support.p022v4.p026d.C0709c.C0710a;
import android.support.p022v4.p026d.C0709c.C0710a.C0711a;
import android.support.p022v4.util.C0903j;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v4.widget.n */
public final class C1056n {

    /* renamed from: a */
    private static Field f3662a;

    /* renamed from: b */
    private static boolean f3663b;

    /* renamed from: c */
    private static Field f3664c;

    /* renamed from: d */
    private static boolean f3665d;

    /* renamed from: android.support.v4.widget.n$a */
    static class C1057a implements Callback {

        /* renamed from: a */
        private final Callback f3666a;

        /* renamed from: b */
        private final TextView f3667b;

        /* renamed from: c */
        private Class f3668c;

        /* renamed from: d */
        private Method f3669d;

        /* renamed from: e */
        private boolean f3670e;

        /* renamed from: f */
        private boolean f3671f;

        /* renamed from: a */
        private static Intent m4580a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        public final void onDestroyActionMode(ActionMode actionMode) {
            this.f3666a.onDestroyActionMode(actionMode);
        }

        /* renamed from: a */
        private void m4583a(Menu menu) {
            Method method;
            Context context = this.f3667b.getContext();
            PackageManager packageManager = context.getPackageManager();
            if (!this.f3671f) {
                this.f3671f = true;
                try {
                    this.f3668c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f3669d = this.f3668c.getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                    this.f3670e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f3668c = null;
                    this.f3669d = null;
                    this.f3670e = false;
                }
            }
            try {
                if (!this.f3670e || !this.f3668c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod("removeItemAt", new Class[]{Integer.TYPE});
                } else {
                    method = this.f3669d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List a = m4582a(context, packageManager);
                for (int i = 0; i < a.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m4581a(resolveInfo, this.f3667b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        /* renamed from: a */
        private static boolean m4585a(TextView textView) {
            if (!(textView instanceof Editable) || !textView.onCheckIsTextEditor() || !textView.isEnabled()) {
                return false;
            }
            return true;
        }

        C1057a(Callback callback, TextView textView) {
            this.f3666a = callback;
            this.f3667b = textView;
        }

        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f3666a.onActionItemClicked(actionMode, menuItem);
        }

        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f3666a.onCreateActionMode(actionMode, menu);
        }

        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m4583a(menu);
            return this.f3666a.onPrepareActionMode(actionMode, menu);
        }

        /* renamed from: a */
        private Intent m4581a(ResolveInfo resolveInfo, TextView textView) {
            return m4580a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m4585a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private List<ResolveInfo> m4582a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m4580a(), 0)) {
                if (m4584a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private static boolean m4584a(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            if (resolveInfo.activityInfo.permission == null || context.checkSelfPermission(resolveInfo.activityInfo.permission) == 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m4571a(TextView textView, C0709c cVar) {
        if (VERSION.SDK_INT >= 28) {
            textView.setText(cVar.mo2856a());
        } else if (m4578e(textView).equals(cVar.f2691a)) {
            textView.setText(cVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: a */
    private static Field m4566a(String str) {
        try {
            Field declaredField = TextView.class.getDeclaredField(str);
            try {
                declaredField.setAccessible(true);
                return declaredField;
            } catch (NoSuchFieldException unused) {
                return declaredField;
            }
        } catch (NoSuchFieldException unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public static int m4574c(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: d */
    public static int m4576d(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: a */
    private static int m4562a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: a */
    public static int m4563a(TextView textView) {
        if (VERSION.SDK_INT >= 16) {
            return textView.getMaxLines();
        }
        if (!f3665d) {
            f3664c = m4566a("mMaxMode");
            f3665d = true;
        }
        if (f3664c != null && m4564a(f3664c, textView) == 1) {
            if (!f3663b) {
                f3662a = m4566a("mMaximum");
                f3663b = true;
            }
            if (f3662a != null) {
                return m4564a(f3662a, textView);
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static Drawable[] m4573b(TextView textView) {
        if (VERSION.SDK_INT >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (VERSION.SDK_INT < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: e */
    public static C0710a m4578e(TextView textView) {
        if (VERSION.SDK_INT >= 28) {
            return new C0710a(textView.getTextMetricsParams());
        }
        C0711a aVar = new C0711a(new TextPaint(textView.getPaint()));
        if (VERSION.SDK_INT >= 23) {
            aVar.mo2871a(textView.getBreakStrategy());
            aVar.mo2874b(textView.getHyphenationFrequency());
        }
        if (VERSION.SDK_INT >= 18) {
            aVar.mo2872a(m4579f(textView));
        }
        return aVar.mo2873a();
    }

    /* renamed from: f */
    private static TextDirectionHeuristic m4579f(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: a */
    private static int m4564a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static Callback m4565a(TextView textView, Callback callback) {
        if (VERSION.SDK_INT < 26 || VERSION.SDK_INT > 27 || (callback instanceof C1057a)) {
            return callback;
        }
        return new C1057a(callback, textView);
    }

    /* renamed from: d */
    public static void m4577d(TextView textView, int i) {
        C0903j.m3838a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: b */
    public static void m4572b(TextView textView, int i) {
        int i2;
        C0903j.m3838a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: c */
    public static void m4575c(TextView textView, int i) {
        int i2;
        C0903j.m3838a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: a */
    public static void m4567a(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: a */
    public static void m4570a(TextView textView, C0710a aVar) {
        if (VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m4562a(aVar.f2695b));
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.f2694a.getTextScaleX();
            textView.getPaint().set(aVar.f2694a);
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.f2694a);
        textView.setBreakStrategy(aVar.f2696c);
        textView.setHyphenationFrequency(aVar.f2697d);
    }

    /* renamed from: a */
    public static void m4568a(TextView textView, int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (VERSION.SDK_INT >= 27) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(2, 13, 1, 2);
            return;
        }
        if (textView instanceof C1036b) {
            ((C1036b) textView).setAutoSizeTextTypeUniformWithConfiguration(2, 13, 1, 2);
        }
    }

    /* renamed from: a */
    public static void m4569a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        Drawable drawable5;
        if (VERSION.SDK_INT >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            if (z) {
                drawable5 = drawable3;
            } else {
                drawable5 = drawable;
            }
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }
}
