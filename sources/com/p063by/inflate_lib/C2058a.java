package com.p063by.inflate_lib;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p063by.inflate_lib.p065a.C2059a;

/* renamed from: com.by.inflate_lib.a */
public final class C2058a {

    /* renamed from: a */
    private static C2059a f7118a;

    /* renamed from: a */
    public static View m9122a(Context context, int i, ViewGroup viewGroup, boolean z) {
        return m9123a(context, i, viewGroup, false, -1);
    }

    /* renamed from: a */
    public static View m9123a(Context context, int i, ViewGroup viewGroup, boolean z, int i2) {
        C2060b a = C2061c.m9125a(i);
        if (a == null) {
            StringBuilder sb = new StringBuilder("layout id :");
            sb.append(Integer.toHexString(i));
            sb.append(" does not match any inflator, inflate with android.view.LayoutInflater");
            if (f7118a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
        try {
            View a2 = a.mo7712a(context, viewGroup, z);
            StringBuilder sb2 = new StringBuilder("layout id :");
            sb2.append(Integer.toHexString(i));
            sb2.append(" inflate suceess in ");
            sb2.append(Integer.toHexString(i2));
            if (f7118a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            return a2;
        } catch (Exception e) {
            if (f7118a != null) {
                Integer.toHexString(i);
                Integer.toHexString(i2);
            }
            StringBuilder sb3 = new StringBuilder("the inflator with id: ");
            sb3.append(Integer.toHexString(i));
            sb3.append(" inflated failed ");
            sb3.append(e.getMessage());
            sb3.append(" , inflate with android.view.LayoutInflater");
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
    }
}
