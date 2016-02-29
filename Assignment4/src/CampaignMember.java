/**
 * Created by William Lin on 2/19/16.
 */
public class CampaignMember {

    private String campaignId, leadId, contactId;

    //These are the setters for the class
    public void setCampaignId(String campaignId){ this.campaignId = campaignId; }
    public void setLeadId(String leadId){ this.leadId = leadId; }
    public void setContactId(String contactId){ this.contactId = contactId; }

    //These are the getters for the class
    public String getCampaignId(){ return campaignId; }
    public String getLeadId(){ return leadId; }
    public String getContactId(){ return contactId; }

}
