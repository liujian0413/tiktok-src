package com.bytedance.vast.model;

import com.bytedance.vast.p673a.C13015c;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Creative implements Serializable, Cloneable {
    private static final Pattern DURATION_REGEX = Pattern.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\.(\\d{3}))?");
    public boolean byWrapper;
    public List<VideoClick> clickList;
    public String duration;
    public List<Icon> iconList;

    /* renamed from: id */
    public String f34450id;
    public List<MediaFile> mediaFileList;
    public List<TrackingEvent> trackingEventList;

    public long getDurationInMs() {
        if (C13015c.m37973a(this.duration)) {
            return 0;
        }
        Matcher matcher = DURATION_REGEX.matcher(this.duration);
        if (!matcher.matches()) {
            return 0;
        }
        long millis = TimeUnit.HOURS.toMillis(Long.parseLong(matcher.group(1))) + 0 + TimeUnit.MINUTES.toMillis(Long.parseLong(matcher.group(2))) + TimeUnit.SECONDS.toMillis(Long.parseLong(matcher.group(3)));
        String group = matcher.group(5);
        if (!C13015c.m37973a(group)) {
            millis += Long.parseLong(group);
        }
        return millis;
    }
}
