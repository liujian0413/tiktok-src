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

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LogPbBean */
public final class LogPbBean extends Message<LogPbBean, Builder> {
    public static final DefaultValueProtoAdapter<LogPbBean> ADAPTER = new ProtoAdapter_LogPbBean();
    private static final long serialVersionUID = 0;
    @WireFieldNoEnum(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String impr_id;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LogPbBean$Builder */
    public static final class Builder extends com.squareup.wire.Message.Builder<LogPbBean, Builder> {
        public String impr_id;

        public final LogPbBean build() {
            return new LogPbBean(this.impr_id, super.buildUnknownFields());
        }

        public final Builder impr_id(String str) {
            this.impr_id = str;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.pojo.LogPbBean$ProtoAdapter_LogPbBean */
    static final class ProtoAdapter_LogPbBean extends DefaultValueProtoAdapter<LogPbBean> {
        public final LogPbBean redact(LogPbBean logPbBean) {
            return logPbBean;
        }

        public ProtoAdapter_LogPbBean() {
            super(FieldEncoding.LENGTH_DELIMITED, LogPbBean.class);
        }

        public final LogPbBean decode(ProtoReader protoReader) throws IOException {
            return decode(protoReader, (LogPbBean) null);
        }

        public final int encodedSize(LogPbBean logPbBean) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, logPbBean.impr_id) + logPbBean.unknownFields().size();
        }

        public final void encode(ProtoWriter protoWriter, LogPbBean logPbBean) throws IOException {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, logPbBean.impr_id);
            protoWriter.writeBytes(logPbBean.unknownFields());
        }

        public final LogPbBean decode(ProtoReader protoReader, LogPbBean logPbBean) throws IOException {
            Builder builder;
            LogPbBean logPbBean2 = (LogPbBean) C10938a.m32097a().mo26425a(LogPbBean.class, logPbBean);
            if (logPbBean2 != null) {
                builder = logPbBean2.newBuilder();
            } else {
                builder = new Builder();
            }
            long beginMessage = protoReader.beginMessage();
            while (true) {
                int nextTag = protoReader.nextTag();
                if (nextTag == -1) {
                    protoReader.endMessage(beginMessage);
                    return builder.build();
                } else if (nextTag != 1) {
                    try {
                        FieldEncoding peekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(nextTag, peekFieldEncoding, peekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } catch (MissingRequiredFieldsException e) {
                        if (logPbBean2 == null) {
                            throw e;
                        }
                    }
                } else {
                    builder.impr_id((String) ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }
    }

    public final String getImprId() throws NullValueException {
        if (this.impr_id != null) {
            return this.impr_id;
        }
        throw new NullValueException();
    }

    public final int hashCode() {
        int i;
        int i2 = this.hashCode;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = unknownFields().hashCode() * 37;
        if (this.impr_id != null) {
            i = this.impr_id.hashCode();
        } else {
            i = 0;
        }
        int i3 = hashCode + i;
        this.hashCode = i3;
        return i3;
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        builder.impr_id = this.impr_id;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.impr_id != null) {
            sb.append(", impr_id=");
            sb.append(this.impr_id);
        }
        StringBuilder replace = sb.replace(0, 2, "LogPbBean{");
        replace.append('}');
        return replace.toString();
    }

    public LogPbBean(String str) {
        this(str, ByteString.EMPTY);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LogPbBean)) {
            return false;
        }
        LogPbBean logPbBean = (LogPbBean) obj;
        if (!unknownFields().equals(logPbBean.unknownFields()) || !Internal.equals(this.impr_id, logPbBean.impr_id)) {
            return false;
        }
        return true;
    }

    public LogPbBean(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.impr_id = str;
    }
}
