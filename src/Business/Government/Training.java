/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Government;

/**
 *
 * @author mayan
 */
public class Training {
    
    
    
    
    public Training(){
        
    }

    
    
//    private TrainingOraganization() {
//         //To change body of generated methods, choose Tools | Templates.
//    }

    public Boolean getPatientIdentity() {
        return patientIdentity;
    }

    public void setPatientIdentity(Boolean patientIdentity) {
        this.patientIdentity = patientIdentity;
    }

    public Boolean getCrossMatching() {
        return crossMatching;
    }

    public void setCrossMatching(Boolean crossMatching) {
        this.crossMatching = crossMatching;
    }

    public Boolean getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(Boolean compatibility) {
        this.compatibility = compatibility;
    }

    public Boolean getProblems() {
        return problems;
    }

    public void setProblems(Boolean problems) {
        this.problems = problems;
    }

    public Boolean getTroubleShooting() {
        return troubleShooting;
    }

    public void setTroubleShooting(Boolean troubleShooting) {
        this.troubleShooting = troubleShooting;
    }

    public Boolean getIssueOfBlood() {
        return issueOfBlood;
    }

    public void setIssueOfBlood(Boolean issueOfBlood) {
        this.issueOfBlood = issueOfBlood;
    }

    public Boolean getTransfusionReactions() {
        return transfusionReactions;
    }

    public void setTransfusionReactions(Boolean transfusionReactions) {
        this.transfusionReactions = transfusionReactions;
    }

    public Boolean getBagDisposal() {
        return bagDisposal;
    }

    public void setBagDisposal(Boolean bagDisposal) {
        this.bagDisposal = bagDisposal;
    }

     
    private Boolean patientIdentity;
    private Boolean crossMatching;
    private Boolean compatibility;
    private Boolean problems;
    private Boolean troubleShooting;
    private Boolean issueOfBlood;
    private Boolean transfusionReactions;
    private Boolean bagDisposal;    

    public Training(Boolean patientIdentity, Boolean crossMatching, Boolean compatibility, Boolean problems, Boolean troubleShooting, Boolean issueOfBlood, Boolean transfusionReactions, Boolean bagDisposal) {
        this.patientIdentity = patientIdentity;
        this.crossMatching = crossMatching;
        this.compatibility = compatibility;
        this.problems = problems;
        this.troubleShooting = troubleShooting;
        this.issueOfBlood = issueOfBlood;
        this.transfusionReactions = transfusionReactions;
        this.bagDisposal = bagDisposal;
    }

    @Override
    public String toString() {
        return "TrainingOraganization{" + "patientIdentity=" + patientIdentity + ", crossMatching=" + crossMatching + ", compatibility=" + compatibility + ", problems=" + problems + ", troubleShooting=" + troubleShooting + ", issueOfBlood=" + issueOfBlood + ", transfusionReactions=" + transfusionReactions + ", bagDisposal=" + bagDisposal + '}';
    }


    
    
}
