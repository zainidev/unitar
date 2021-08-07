package edu.unitar.assign.company.structure;

import edu.unitar.assign.company.structure.model.Accountant;
import edu.unitar.assign.company.structure.model.BusinessLead;
import edu.unitar.assign.company.structure.model.SoftwareEngineer;
import edu.unitar.assign.company.structure.model.TechnicalLead;

public class CompanyStructure {
	
	public static void main(String[] args) {
		
        TechnicalLead CTO = new TechnicalLead("Satya Nadella");
        SoftwareEngineer seA = new SoftwareEngineer("Kasey");
        SoftwareEngineer seB = new SoftwareEngineer("Breana");
        SoftwareEngineer seC = new SoftwareEngineer("Eric");
        CTO.addReport(seA);
        seA.checkInCode();
        seA.checkInCode();
        CTO.addReport(seB);
        CTO.addReport(seC);
        seC.checkInCode();
        seC.checkInCode();
        System.out.println(CTO.getTeamStatus());

        TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
        SoftwareEngineer seD = new SoftwareEngineer("Winter");
        SoftwareEngineer seE = new SoftwareEngineer("Libby");
        SoftwareEngineer seF = new SoftwareEngineer("Gizan");
        SoftwareEngineer seG = new SoftwareEngineer("Zaynah");
        VPofENG.addReport(seD);
        VPofENG.addReport(seE);
        VPofENG.addReport(seF);
        VPofENG.addReport(seG);
        seD.checkInCode();
        seF.checkInCode();
        seF.checkInCode();
        seF.checkInCode();
        seF.checkInCode();
        System.out.println(VPofENG.getTeamStatus());


        BusinessLead CFO = new BusinessLead("Amy Hood");
        Accountant actA = new Accountant("Niky");
        Accountant actB = new Accountant("Andrew");
        CFO.addReport(actA, CTO);
        CFO.addReport(actB, VPofENG);
        System.out.println(CFO.getTeamStatus());

        System.out.println(seB.toString() + "'s manager is " + seB.getManager().toString());
        System.out.println(seF.toString() + "'s manager is " + seF.getManager().toString());
        System.out.println(actB.toString() + "'s manager is " + actB.getManager().toString());
 
		
		
	}

}
