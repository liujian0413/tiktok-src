package com.bytedance.vast.model;

import java.io.Serializable;

public class TrackingEvent implements Serializable, Cloneable {
    public String name;
    public String offset;
    public String url;
}
