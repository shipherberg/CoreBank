package ir.biif.corebank.entity;

import lombok.Data;
import org.springframework.data.couchbase.core.mapping.Field;

import java.sql.Date;
@Data
public class GenericEntity {
    @Field
    private String createdBy;
    @Field
    private String lastModifiedBy;
    @Field
    private Date createdDate;
    @Field
    private Date lastModifiedDate;
}
