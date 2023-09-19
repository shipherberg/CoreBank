package ir.biif.corebank.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;

import java.sql.Date;
import java.util.Map;

@Document
@Getter
@Setter
public class LegalCustomer extends Customer {
    @Field
    private String nationalID;
    @Field
    private String registrationCode;
    @Field
    private Date registrationDate;
    @Field
    private Map<String, String> relations;
    @Field
    private int branchId;

}
