package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.C10939b;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings */
public final class NewAnchorShowBubbleSettings extends Message<NewAnchorShowBubbleSettings, Builder> {
    public static final DefaultValueProtoAdapter<NewAnchorShowBubbleSettings> ADAPTER = new ProtoAdapter_NewAnchorShowBubbleSettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 7)
    public final String activity_bubble_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = 0, tag = 4)
    public final String bubble_url;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 1)
    public final Integer daily_trigger_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 5)
    public final Boolean force_trigger;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 2)
    public final Integer lifecycle_trigger_times;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = 0, tag = 6)
    public final Boolean new_anchor_show_bubble;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = 0, tag = 3)
    public final Integer trigger_interval_minute;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<NewAnchorShowBubbleSettings, Builder> {
        public String activity_bubble_url = "";
        public String bubble_url = "";
        public Integer daily_trigger_times = Integer.valueOf(1);
        public Boolean force_trigger = Boolean.valueOf(false);
        public Integer lifecycle_trigger_times = Integer.valueOf(1);
        public Boolean new_anchor_show_bubble = Boolean.valueOf(false);
        public Integer trigger_interval_minute = Integer.valueOf(1440);

        public final NewAnchorShowBubbleSettings build() {
            if (this.daily_trigger_times == null || this.lifecycle_trigger_times == null || this.trigger_interval_minute == null || this.bubble_url == null || this.force_trigger == null || this.new_anchor_show_bubble == null || this.activity_bubble_url == null) {
                throw C10939b.m32101a(this.daily_trigger_times, "daily_trigger_times", this.lifecycle_trigger_times, "lifecycle_trigger_times", this.trigger_interval_minute, "trigger_interval_minute", this.bubble_url, "bubble_url", this.force_trigger, "force_trigger", this.new_anchor_show_bubble, "new_anchor_show_bubble", this.activity_bubble_url, "activity_bubble_url");
            }
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = new NewAnchorShowBubbleSettings(this.daily_trigger_times, this.lifecycle_trigger_times, this.trigger_interval_minute, this.bubble_url, this.force_trigger, this.new_anchor_show_bubble, this.activity_bubble_url, super.buildUnknownFields());
            return newAnchorShowBubbleSettings;
        }

        public final Builder activity_bubble_url(String str) {
            this.activity_bubble_url = str;
            return this;
        }

        public final Builder bubble_url(String str) {
            this.bubble_url = str;
            return this;
        }

        public final Builder daily_trigger_times(Integer num) {
            this.daily_trigger_times = num;
            return this;
        }

        public final Builder force_trigger(Boolean bool) {
            this.force_trigger = bool;
            return this;
        }

        public final Builder lifecycle_trigger_times(Integer num) {
            this.lifecycle_trigger_times = num;
            return this;
        }

        public final Builder new_anchor_show_bubble(Boolean bool) {
            this.new_anchor_show_bubble = bool;
            return this;
        }

        public final Builder trigger_interval_minute(Integer num) {
            this.trigger_interval_minute = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.NewAnchorShowBubbleSettings$ProtoAdapter_NewAnchorShowBubbleSettings */
    static final class ProtoAdapter_NewAnchorShowBubbleSettings extends DefaultValueProtoAdapter<NewAnchorShowBubbleSettings> {
        public final NewAnchorShowBubbleSettings redact(NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) {
            return newAnchorShowBubbleSettings;
        }

        public ProtoAdapter_NewAnchorShowBubbleSettings() {
            super(FieldEncoding.LENGTH_DELIMITED, NewAnchorShowBubbleSettings.class);
        }

        public final NewAnchorShowBubbleSettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (NewAnchorShowBubbleSettings) null);
        }

        public final int encodedSize(NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, newAnchorShowBubbleSettings.daily_trigger_times) + ProtoAdapter.INT32.encodedSizeWithTag(2, newAnchorShowBubbleSettings.lifecycle_trigger_times) + ProtoAdapter.INT32.encodedSizeWithTag(3, newAnchorShowBubbleSettings.trigger_interval_minute) + ProtoAdapter.STRING.encodedSizeWithTag(4, newAnchorShowBubbleSettings.bubble_url) + ProtoAdapter.BOOL.encodedSizeWithTag(5, newAnchorShowBubbleSettings.force_trigger) + ProtoAdapter.BOOL.encodedSizeWithTag(6, newAnchorShowBubbleSettings.new_anchor_show_bubble) + ProtoAdapter.STRING.encodedSizeWithTag(7, newAnchorShowBubbleSettings.activity_bubble_url) + newAnchorShowBubbleSettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, newAnchorShowBubbleSettings.daily_trigger_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, newAnchorShowBubbleSettings.lifecycle_trigger_times);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, newAnchorShowBubbleSettings.trigger_interval_minute);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 4, newAnchorShowBubbleSettings.bubble_url);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 5, newAnchorShowBubbleSettings.force_trigger);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, newAnchorShowBubbleSettings.new_anchor_show_bubble);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 7, newAnchorShowBubbleSettings.activity_bubble_url);
            protoWriter.writeBytes(newAnchorShowBubbleSettings.unknownFields());
        }

        public final NewAnchorShowBubbleSettings decode(ProtoReader protoReader, NewAnchorShowBubbleSettings newAnchorShowBubbleSettings) throws IOException {
            Builder builder;
            NewAnchorShowBubbleSettings newAnchorShowBubbleSettings2 = (NewAnchorShowBubbleSettings) C10938a.m32097a().mo26425a(NewAnchorShowBubbleSettings.class, newAnchorShowBubbleSettings);
            if (newAnchorShowBubbleSettings2 != null) {
                builder = newAnchorShowBubbleSettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.daily_trigger_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.lifecycle_trigger_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.trigger_interval_minute((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 4:
                            builder.bubble_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 5:
                            builder.force_trigger((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 6:
                            builder.new_anchor_show_bubble((Boolean) ProtoAdapter.BOOL.decode(protoReader));
                            break;
                        case 7:
                            builder.activity_bubble_url((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (newAnchorShowBubbleSettings2 != null) {
                                    break;
                                } else {
                                    throw e;
                                }
                            }
                    }
                } else {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                }
            }
        }
    }

    public final String getActivityBubbleUrl() {
        return this.activity_bubble_url;
    }

    public final String getBubbleUrl() {
        return this.bubble_url;
    }

    public final Integer getDailyTriggerTimes() {
        return this.daily_trigger_times;
    }

    public final Boolean getForceTrigger() {
        return this.force_trigger;
    }

    public final Integer getLifecycleTriggerTimes() {
        return this.lifecycle_trigger_times;
    }

    public final Boolean getNewAnchorShowBubble() {
        return this.new_anchor_show_bubble;
    }

    public final Integer getTriggerIntervalMinute() {
        return this.trigger_interval_minute;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.daily_trigger_times = this.daily_trigger_times;
        builder.lifecycle_trigger_times = this.lifecycle_trigger_times;
        builder.trigger_interval_minute = this.trigger_interval_minute;
        builder.bubble_url = this.bubble_url;
        builder.force_trigger = this.force_trigger;
        builder.new_anchor_show_bubble = this.new_anchor_show_bubble;
        builder.activity_bubble_url = this.activity_bubble_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (((((((((((((unknownFields().hashCode() * 37) + this.daily_trigger_times.hashCode()) * 37) + this.lifecycle_trigger_times.hashCode()) * 37) + this.trigger_interval_minute.hashCode()) * 37) + this.bubble_url.hashCode()) * 37) + this.force_trigger.hashCode()) * 37) + this.new_anchor_show_bubble.hashCode()) * 37) + this.activity_bubble_url.hashCode();
        this.hashCode = hashCode;
        return hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(", daily_trigger_times=");
        sb.append(this.daily_trigger_times);
        sb.append(", lifecycle_trigger_times=");
        sb.append(this.lifecycle_trigger_times);
        sb.append(", trigger_interval_minute=");
        sb.append(this.trigger_interval_minute);
        sb.append(", bubble_url=");
        sb.append(this.bubble_url);
        sb.append(", force_trigger=");
        sb.append(this.force_trigger);
        sb.append(", new_anchor_show_bubble=");
        sb.append(this.new_anchor_show_bubble);
        sb.append(", activity_bubble_url=");
        sb.append(this.activity_bubble_url);
        StringBuilder replace = sb.replace(0, 2, "NewAnchorShowBubbleSettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NewAnchorShowBubbleSettings)) {
            return false;
        }
        NewAnchorShowBubbleSettings newAnchorShowBubbleSettings = (NewAnchorShowBubbleSettings) obj;
        if (!unknownFields().equals(newAnchorShowBubbleSettings.unknownFields()) || !this.daily_trigger_times.equals(newAnchorShowBubbleSettings.daily_trigger_times) || !this.lifecycle_trigger_times.equals(newAnchorShowBubbleSettings.lifecycle_trigger_times) || !this.trigger_interval_minute.equals(newAnchorShowBubbleSettings.trigger_interval_minute) || !this.bubble_url.equals(newAnchorShowBubbleSettings.bubble_url) || !this.force_trigger.equals(newAnchorShowBubbleSettings.force_trigger) || !this.new_anchor_show_bubble.equals(newAnchorShowBubbleSettings.new_anchor_show_bubble) || !this.activity_bubble_url.equals(newAnchorShowBubbleSettings.activity_bubble_url)) {
            return false;
        }
        return true;
    }

    public NewAnchorShowBubbleSettings(Integer num, Integer num2, Integer num3, String str, Boolean bool, Boolean bool2, String str2) {
        this(num, num2, num3, str, bool, bool2, str2, ByteString.EMPTY);
    }

    public NewAnchorShowBubbleSettings(Integer num, Integer num2, Integer num3, String str, Boolean bool, Boolean bool2, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.daily_trigger_times = num;
        this.lifecycle_trigger_times = num2;
        this.trigger_interval_minute = num3;
        this.bubble_url = str;
        this.force_trigger = bool;
        this.new_anchor_show_bubble = bool2;
        this.activity_bubble_url = str2;
    }
}
