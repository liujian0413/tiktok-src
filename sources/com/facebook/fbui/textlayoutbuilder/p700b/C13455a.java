package com.facebook.fbui.textlayoutbuilder.p700b;

import android.support.p022v4.p026d.C0712d;
import android.support.p022v4.p026d.C0713e;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;

/* renamed from: com.facebook.fbui.textlayoutbuilder.b.a */
public final class C13455a {
    /* renamed from: a */
    private static TextDirectionHeuristic m39535a(C0712d dVar) {
        if (dVar == C0713e.f2703a) {
            return TextDirectionHeuristics.LTR;
        }
        if (dVar == C0713e.f2704b) {
            return TextDirectionHeuristics.RTL;
        }
        if (dVar == C0713e.f2705c) {
            return TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
        if (dVar == C0713e.f2706d) {
            return TextDirectionHeuristics.FIRSTSTRONG_RTL;
        }
        if (dVar == C0713e.f2707e) {
            return TextDirectionHeuristics.ANYRTL_LTR;
        }
        if (dVar == C0713e.f2708f) {
            return TextDirectionHeuristics.LOCALE;
        }
        return TextDirectionHeuristics.FIRSTSTRONG_LTR;
    }

    /* renamed from: a */
    public static StaticLayout m39534a(CharSequence charSequence, int i, int i2, TextPaint textPaint, int i3, Alignment alignment, float f, float f2, boolean z, TruncateAt truncateAt, int i4, int i5, C0712d dVar) {
        StaticLayout staticLayout = new StaticLayout(charSequence, i, i2, textPaint, i3, alignment, m39535a(dVar), f, f2, z, truncateAt, i4, i5);
        return staticLayout;
    }
}
