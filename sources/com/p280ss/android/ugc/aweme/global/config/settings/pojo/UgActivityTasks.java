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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks */
public final class UgActivityTasks extends Message<UgActivityTasks, Builder> {
    public static final DefaultValueProtoAdapter<UgActivityTasks> ADAPTER = new ProtoAdapter_UgActivityTasks();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String task_id;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer task_type;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 3)
    public final Long time;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<UgActivityTasks, Builder> {
        public String task_id;
        public Integer task_type;
        public Long time;

        public final UgActivityTasks build() {
            return new UgActivityTasks(this.task_id, this.task_type, this.time, super.buildUnknownFields());
        }

        public final Builder task_id(String str) {
            this.task_id = str;
            return this;
        }

        public final Builder task_type(Integer num) {
            this.task_type = num;
            return this;
        }

        public final Builder time(Long l) {
            this.time = l;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.UgActivityTasks$ProtoAdapter_UgActivityTasks */
    static final class ProtoAdapter_UgActivityTasks extends DefaultValueProtoAdapter<UgActivityTasks> {
        public final UgActivityTasks redact(UgActivityTasks ugActivityTasks) {
            return ugActivityTasks;
        }

        public ProtoAdapter_UgActivityTasks() {
            super(FieldEncoding.LENGTH_DELIMITED, UgActivityTasks.class);
        }

        public final UgActivityTasks decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (UgActivityTasks) null);
        }

        public final int encodedSize(UgActivityTasks ugActivityTasks) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, ugActivityTasks.task_id) + ProtoAdapter.INT32.encodedSizeWithTag(2, ugActivityTasks.task_type) + ProtoAdapter.INT64.encodedSizeWithTag(3, ugActivityTasks.time) + ugActivityTasks.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, UgActivityTasks ugActivityTasks) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, ugActivityTasks.task_id);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 2, ugActivityTasks.task_type);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 3, ugActivityTasks.time);
            protoWriter.writeBytes(ugActivityTasks.unknownFields());
        }

        public final UgActivityTasks decode(ProtoReader protoReader, UgActivityTasks ugActivityTasks) throws IOException {
            Builder builder;
            UgActivityTasks ugActivityTasks2 = (UgActivityTasks) C10938a.m32097a().mo26425a(UgActivityTasks.class, ugActivityTasks);
            if (ugActivityTasks2 != null) {
                builder = ugActivityTasks2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag != -1) {
                    switch (nextTag) {
                        case 1:
                            builder.task_id((String) ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 2:
                            builder.task_type((Integer) ProtoAdapter.INT32.decode(protoReader));
                            break;
                        case 3:
                            builder.time((Long) ProtoAdapter.INT64.decode(protoReader));
                            break;
                        default:
                            try {
                                FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                                builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                                break;
                            } catch (MissingRequiredFieldsException e) {
                                if (ugActivityTasks2 != null) {
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

    public final String getTaskId() throws NullValueException {
        if (this.task_id != null) {
            return this.task_id;
        }
        throw new NullValueException();
    }

    public final Integer getTaskType() throws NullValueException {
        if (this.task_type != null) {
            return this.task_type;
        }
        throw new NullValueException();
    }

    public final Long getTime() throws NullValueException {
        if (this.time != null) {
            return this.time;
        }
        throw new NullValueException();
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.task_id = this.task_id;
        builder.task_type = this.task_type;
        builder.time = this.time;
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
        if (this.task_id != null) {
            i = this.task_id.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 37;
        if (this.task_type != null) {
            i2 = this.task_type.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 37;
        if (this.time != null) {
            i4 = this.time.hashCode();
        }
        int i7 = i6 + i4;
        this.hashCode = i7;
        return i7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.task_id != null) {
            sb.append(", task_id=");
            sb.append(this.task_id);
        }
        if (this.task_type != null) {
            sb.append(", task_type=");
            sb.append(this.task_type);
        }
        if (this.time != null) {
            sb.append(", time=");
            sb.append(this.time);
        }
        StringBuilder replace = sb.replace(0, 2, "UgActivityTasks{");
        replace.append('}');
        return replace.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UgActivityTasks)) {
            return false;
        }
        UgActivityTasks ugActivityTasks = (UgActivityTasks) obj;
        if (!unknownFields().equals(ugActivityTasks.unknownFields()) || !Internal.equals(this.task_id, ugActivityTasks.task_id) || !Internal.equals(this.task_type, ugActivityTasks.task_type) || !Internal.equals(this.time, ugActivityTasks.time)) {
            return false;
        }
        return true;
    }

    public UgActivityTasks(String str, Integer num, Long l) {
        this(str, num, l, ByteString.EMPTY);
    }

    public UgActivityTasks(String str, Integer num, Long l, ByteString byteString) {
        super(ADAPTER, byteString);
        this.task_id = str;
        this.task_type = num;
        this.time = l;
    }
}
