package com.p280ss.ttm.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.ss.ttm.utils.AVTime */
public class AVTime {
    public static String getFormatNow() {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm ss:SSS").format(new Date());
    }
}
