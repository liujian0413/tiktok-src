package com.p280ss.android.ugc.aweme.poi.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.ThirdMapNaviHelper */
public final class ThirdMapNaviHelper {

    /* renamed from: com.ss.android.ugc.aweme.poi.utils.ThirdMapNaviHelper$MapType */
    public enum MapType {
        TYPE_GAODE,
        TYPE_BAIDU,
        TYPE_TENCENT,
        TYPE_GOOGLE
    }

    /* renamed from: a */
    public static List<MapType> m114444a(Context context) {
        ArrayList arrayList = new ArrayList();
        List installedPackages = context.getPackageManager().getInstalledPackages(0);
        if (installedPackages != null) {
            for (int i = 0; i < installedPackages.size(); i++) {
                String str = ((PackageInfo) installedPackages.get(i)).packageName;
                if (C6399b.m19944t()) {
                    if ("com.google.android.apps.maps".equalsIgnoreCase(str)) {
                        arrayList.add(MapType.TYPE_GOOGLE);
                    }
                } else if ("com.baidu.BaiduMap".equalsIgnoreCase(str)) {
                    arrayList.add(MapType.TYPE_BAIDU);
                } else if ("com.autonavi.minimap".equalsIgnoreCase(str)) {
                    arrayList.add(MapType.TYPE_GAODE);
                } else if ("com.tencent.map".equalsIgnoreCase(str)) {
                    arrayList.add(MapType.TYPE_TENCENT);
                } else if ("com.google.android.apps.maps".equalsIgnoreCase(str)) {
                    arrayList.add(MapType.TYPE_GOOGLE);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m114443a(MapType mapType, Context context) {
        switch (mapType) {
            case TYPE_GAODE:
                return context.getString(R.string.c7t);
            case TYPE_BAIDU:
                return context.getString(R.string.c7s);
            case TYPE_TENCENT:
                return context.getString(R.string.c7v);
            case TYPE_GOOGLE:
                return context.getString(R.string.c7u);
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String[] m114447a(List<MapType> list, Context context) {
        String[] strArr = new String[list.size()];
        int i = 0;
        for (MapType a : list) {
            strArr[i] = m114443a(a, context);
            i++;
        }
        return strArr;
    }

    /* renamed from: b */
    private static void m114448b(Context context, double d, double d2) {
        StringBuilder sb = new StringBuilder("androidamap://route?sourceApplication=appName&slat=&slon=&sname=我的位置&dlat=");
        sb.append(d);
        sb.append("&dlon=");
        sb.append(d2);
        sb.append("&dname=目的地&dev=0&t=2");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }

    /* renamed from: c */
    private static void m114449c(Context context, double d, double d2) {
        StringBuilder sb = new StringBuilder("baidumap://map/geocoder?location=");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }

    /* renamed from: d */
    private static void m114450d(Context context, double d, double d2) {
        StringBuilder sb = new StringBuilder("google.navigation:q=");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(sb.toString()));
        intent.setPackage("com.google.android.apps.maps");
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static void m114445a(Context context, double d, double d2) {
        StringBuilder sb = new StringBuilder("qqmap://map/routeplan?type=drive&from=&fromcoord=&to=目的地&tocoord=");
        sb.append(d);
        sb.append(",");
        sb.append(d2);
        sb.append("&policy=0&referer=appName");
        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(sb.toString())));
    }

    /* renamed from: a */
    public static void m114446a(Context context, MapType mapType, double d, double d2) {
        switch (mapType) {
            case TYPE_GAODE:
                m114448b(context, d, d2);
                return;
            case TYPE_BAIDU:
                double[] a = C35440a.m114451a(d2, d);
                m114449c(context, a[1], a[0]);
                return;
            case TYPE_TENCENT:
                m114445a(context, d, d2);
                return;
            case TYPE_GOOGLE:
                double[] c = C35440a.m114455c(d2, d);
                m114450d(context, c[1], c[0]);
                break;
        }
    }
}
