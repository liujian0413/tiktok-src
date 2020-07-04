package com.p280ss.android.ugc.aweme.global.config.settings.pojo;

import com.bytedance.ies.NullValueException;
import com.bytedance.ies.settings.C10938a;
import com.bytedance.ies.settings.MissingRequiredFieldsException;
import com.squareup.wire.DefaultValueProtoAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireFieldNoEnum;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import okio.ByteString;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveLabelDisplaySettings */
public final class LiveLabelDisplaySettings extends Message<LiveLabelDisplaySettings, Builder> {
    public static final DefaultValueProtoAdapter<LiveLabelDisplaySettings> ADAPTER = new ProtoAdapter_LiveLabelDisplaySettings();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 2)
    public final Long display_duration;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long display_intervals;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer most_display_times;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveLabelDisplaySettings$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LiveLabelDisplaySettings, Builder> {
        public Long display_duration;
        public Long display_intervals;
        public Integer most_display_times;

        public final LiveLabelDisplaySettings build() {
            return new LiveLabelDisplaySettings(this.most_display_times, this.display_duration, this.display_intervals, super.buildUnknownFields());
        }

        public final Builder display_duration(Long l) {
            this.display_duration = l;
            return this;
        }

        public final Builder display_intervals(Long l) {
            this.display_intervals = l;
            return this;
        }

        public final Builder most_display_times(Integer num) {
            this.most_display_times = num;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LiveLabelDisplaySettings$ProtoAdapter_LiveLabelDisplaySettings */
    static final class ProtoAdapter_LiveLabelDisplaySettings extends DefaultValueProtoAdapter<LiveLabelDisplaySettings> {
        public final LiveLabelDisplaySettings redact(LiveLabelDisplaySettings liveLabelDisplaySettings) {
            return liveLabelDisplaySettings;
        }

        public ProtoAdapter_LiveLabelDisplaySettings() {
            super(FieldEncoding.LENGTH_DELIMITED, LiveLabelDisplaySettings.class);
        }

        public final LiveLabelDisplaySettings decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LiveLabelDisplaySettings) null);
        }

        public final int encodedSize(LiveLabelDisplaySettings liveLabelDisplaySettings) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, liveLabelDisplaySettings.most_display_times) + ProtoAdapter.INT64.encodedSizeWithTag(2, liveLabelDisplaySettings.display_duration) + ProtoAdapter.INT64.encodedSizeWithTag(3, liveLabelDisplaySettings.display_intervals) + liveLabelDisplaySettings.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LiveLabelDisplaySettings liveLabelDisplaySettings) throws IOException {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, liveLabelDisplaySettings.most_display_times);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, liveLabelDisplaySettings.display_duration);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, liveLabelDisplaySettings.display_intervals);
            protoWriter.writeBytes(liveLabelDisplaySettings.unknownFields());
        }

        public final LiveLabelDisplaySettings decode(ProtoReader protoReader, LiveLabelDisplaySettings liveLabelDisplaySettings) throws IOException {
            Builder builder;
            LiveLabelDisplaySettings liveLabelDisplaySettings2 = (LiveLabelDisplaySettings) C10938a.m32097a().mo26425a(LiveLabelDisplaySettings.class, liveLabelDisplaySettings);
            if (liveLabelDisplaySettings2 != null) {
                builder = liveLabelDisplaySettings2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.most_display_times((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 2:
                            builder.display_duration((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        case 3:
                            builder.display_intervals((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (liveLabelDisplaySettings2 != null) {
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

    public final Long getDisplayDuration() throws NullValueException {
        if (this.display_duration != null) {
            return this.display_duration;
        }
        throw new NullValueException();
    }

    public final Long getDisplayIntervals() throws NullValueException {
        if (this.display_intervals != null) {
            return this.display_intervals;
        }
        throw new NullValueException();
    }

    public final Integer getMostDisplayTimes() throws NullValueException {
        if (this.most_display_times != null) {
            return this.most_display_times;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.most_display_times = this.most_display_times;
        builder.display_duration = this.display_duration;
        builder.display_intervals = this.display_intervals;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = this.hashCode;
        if (i3 != 0) {
            return i3;
        }
        int hashCode = unknownFields().hashCode() * 37;
        int i4 = 0;
        if (this.most_display_times != null) {
            i = this.most_display_times.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.display_duration != null) {
            i2 = this.display_duration.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.display_intervals != null) {
            i4 = this.display_intervals.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.most_display_times != null) {
            sb.append(", most_display_times=");
            sb.append(this.most_display_times);
        }
        if (this.display_duration != null) {
            sb.append(", display_duration=");
            sb.append(this.display_duration);
        }
        if (this.display_intervals != null) {
            sb.append(", display_intervals=");
            sb.append(this.display_intervals);
        }
        StringBuilder replace = sb.replace(0, 2, "LiveLabelDisplaySettings{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveLabelDisplaySettings)) {
            return false;
        }
        LiveLabelDisplaySettings liveLabelDisplaySettings = (LiveLabelDisplaySettings) obj;
        if (!unknownFields().equals(liveLabelDisplaySettings.unknownFields()) || !Internal.equals(this.most_display_times, liveLabelDisplaySettings.most_display_times) || !Internal.equals(this.display_duration, liveLabelDisplaySettings.display_duration) || !Internal.equals(this.display_intervals, liveLabelDisplaySettings.display_intervals)) {
            return false;
        }
        return true;
    }

    public LiveLabelDisplaySettings(Integer num, Long l, Long l2) {
        this(num, l, l2, ByteString.EMPTY);
    }

    public LiveLabelDisplaySettings(Integer num, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.most_display_times = num;
        this.display_duration = l;
        this.display_intervals = l2;
    }
}
