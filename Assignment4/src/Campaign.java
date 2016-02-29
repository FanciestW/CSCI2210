/**
 * Created by William Lin on 2/19/16.
 */
public class Campaign {

    private String id, ownerId, recordTypeId;

    //These are the setters for the class
    public void setId(String id){ this.id = id; }
    public void setOwnerId(String ownerId){ this.ownerId = ownerId; }
    public void setRecordTypeId(String recordTypeId){ this.recordTypeId = recordTypeId; }

    //These are the getters for the class
    public String getId(){ return id; }
    public String getOwnerId(){ return ownerId; }
    public String getRecordTypeId(){ return recordTypeId; }

}
