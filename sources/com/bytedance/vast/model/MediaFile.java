package com.bytedance.vast.model;

import java.io.Serializable;

public class MediaFile implements Serializable, Cloneable {
    public int bitRate = -1;
    public String delivery;
    public int height = -1;
    public Boolean maintainAspectRatio;
    public Boolean scalable;
    public String type;
    public String url;
    public int width = -1;
}
