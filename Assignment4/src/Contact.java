/**
 * Created by William Lin on 2/19/16.
 */
public class Contact {

    private  String id, accountId, reportsTold, ownerId, recordTypeId;

    //These are the setters for the class
    public void setId(String id){ this.id = id; }
    public void setAccountId(String accountId){ this.accountId = accountId; }
    public void setReportsTold(String reportsTold){ this.reportsTold = reportsTold; }
    public void setOwnerId(String ownerId){ this.ownerId = ownerId; }
    public void setRecordTypeId(String recordTypeId){ this.recordTypeId = recordTypeId; }

    //These are the getters for the class
    public String getId(){ return id; }
    public String getAccountId(){ return accountId; }
    public String getReportsTold(){ return reportsTold; }
    public String getOwnerId(){ return ownerId; }
    public String getRecordTypeId(){ return recordTypeId; }

}
